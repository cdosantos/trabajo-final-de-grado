import os
import pandas as pd

dir = "results-ground-truth-subjects/subjects"
result_files = os.listdir(dir)
result_files.sort()


total_mutants = 0
detected_by_randoop = 0
detected_by_daikon = 0
detected_randoop_daikon = 0

for file in result_files:
    filedir = os.path.join(dir, file)
    randoop_results_file = filedir+'/randoop-result.csv'

    if os.path.exists(randoop_results_file):
        print('Processing file ', randoop_results_file)
        df_randoop = pd.read_csv(randoop_results_file)

        total_mutants += df_randoop.shape[0] # There is a row for each mutant
        # Add 1 to detected_by_randoop if the column failing_test is not empty and greater than 0
        detected_by_randoop += df_randoop[df_randoop['failing_test'].notnull() & (df_randoop['failing_test'] > 0)].shape[0]

        # Process daikon
        daikon_results_file = filedir+'/daikon-result.csv'
        if os.path.exists(daikon_results_file):
            df_daikon = pd.read_csv(daikon_results_file)
            detected_by_daikon += df_daikon[df_daikon['failing_test'].notnull() & (df_daikon['failing_test'] > 0)].shape[0]

            # Loop through the rows of the randoop dataframe
            for index, row in df_randoop.iterrows():
                # Get the mutant_id
                mutant_id = row['mutant_id']
                # Check if the current mutant is detected by randoop or daikon
                if row['failing_test'] > 0 or df_daikon[df_daikon['mutant_id'] == mutant_id]['failing_test'].values[0] > 0:
                    detected_randoop_daikon += 1

print()
print("==== Results Randoop + Daikon ====")
print(f'total mutants: {total_mutants}')
print(f'detected by randoop: {detected_by_randoop}')
randoop_percentage = detected_by_randoop / total_mutants * 100
print(f'detected by randoop percentage: {randoop_percentage}%')
print()
print(f'detected by daikon: {detected_by_daikon}')
print(f'detected by daikon percentage: {detected_by_daikon / total_mutants * 100}%')
print()
print(f'detected by randoop and daikon: {detected_randoop_daikon}')
randoop_daikon_percentage = detected_randoop_daikon / total_mutants * 100
print(f'detected by randoop and daikon percentage: {randoop_daikon_percentage}%')
print()
print("==== Results Randoop + EvoSpex ====")
randoop_evospex_percentage = 80
print()
print("==== Results Randoop + GAssert ====")
randoop_gassert_percentage = 75
print()
print("==== Results Randoop + SpecFuzzer ====")
randoop_specfuzzer_percentage = 92
print()


# Create a bar chart with plotly showing randoop + daikon, randoop + evospex, randoop + gassert, and randoop + specfuzzer
import plotly.graph_objects as go
import plotly.io as pio

pio.kaleido.scope.mathjax = None

tools = ['R+Daikon', 'R+EvoSpex', 'R+GAssert', 'R+SpecFuzzer']
mutation_score = [randoop_daikon_percentage, randoop_evospex_percentage, randoop_gassert_percentage, randoop_specfuzzer_percentage]


# Create a bar chart with plotly for every tool
fig = go.Figure()
fig.add_trace(go.Bar(x=tools, y=mutation_score, name='Mutation Score', showlegend=False))
fig.update_layout(xaxis_title='Randoop combined with Contracts', yaxis_title='Mutation Score (%)')
fig.update_layout(plot_bgcolor='white')
fig.update_yaxes(range=[0, 110])
fig.update_layout(
    autosize=False,
    margin = {'l':0,'r':0,'t':0,'b':0}
)

# Draw a straight dashed line at 75%
fig.add_shape(
    type="line",
    x0=-0.5,
    y0=randoop_percentage,
    x1=3.5,
    y1=75,
    line=dict(
        color="black",
        width=1,
        dash="dashdot",
    ),
)

fig.write_image(f'analysis/randoop-plus-contracts.pdf')
