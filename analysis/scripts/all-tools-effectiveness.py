import sys
import pandas as pd
import numpy as np
import os
import plotly.graph_objects as go
import plotly.io as pio

pio.kaleido.scope.mathjax = None

results_dir = "results"

# Process all files with name *-all-results.csv from the results directory
all_files = [f for f in os.listdir(results_dir) if f.endswith('-all-results.csv')]
print(f'Processing {len(all_files)} files')
print()
tools = []
mutation_score = []
for file in all_files:
    print(f'Processing file: {file}')
    tool_name = file.split('-')[0]
    tools.append(tool_name)
    df = pd.read_csv(os.path.join(results_dir, file))
    detected_by_tool = df["detected_mutants"].sum()
    total_mutants = df["mutants"].sum()
    print(f'total mutants: {total_mutants}')
    detected_by_tool_percentage = detected_by_tool / total_mutants * 100
    mutation_score.append(detected_by_tool_percentage)
    print(f'{tool_name} detected {detected_by_tool} / {detected_by_tool_percentage}%')
    print()

# Sort the tools and mutation scores
tools, mutation_score = zip(*sorted(zip(tools, mutation_score), key=lambda x: x[1], reverse=False))

tool_names_mapping = {
    'daikon': 'Daikon',
    'randoop' : 'Randoop',
    'evosuite': 'EvoSuite',
    'gassert': 'GAssert',
    'evospex': 'EvoSpex',
    'specfuzzer': 'SpecFuzzer',
}

# Replace tool names
tools = [tool_names_mapping[tool] for tool in tools]

# Color by tool
colors = {
    'Randoop': '#00CC96',
    'EvoSuite': '#00CC96',
    'Daikon': '#636EFA',
    'GAssert': '#636EFA',
    'EvoSpex': '#636EFA',
    'SpecFuzzer': '#636EFA'
}

# Create a bar chart with plotly for every tool
fig = go.Figure()
fig.add_trace(go.Bar(x=tools, y=mutation_score, name='Mutation Score', showlegend=False))
fig.update_layout(xaxis_title='Tool', yaxis_title='Mutation Score (%)')

# Add colors
fig.update_traces(marker_color=[colors[tool] for tool in tools])

# Set max value to 100
fig.update_yaxes(range=[0, 110])
fig.update_layout(plot_bgcolor='white')
#fig.update_layout(showlegend=False)
fig.update_layout(
    autosize=False,
    margin = {'l':0,'r':0,'t':0,'b':0}
)

# Add custom legend with names Test Assertions and Contracts
fig.add_trace(go.Scatter(x=[None], y=[None], mode='markers', marker=dict(size=10, color=colors['Randoop']), name='Tools inferring Test Assertions'))
fig.add_trace(go.Scatter(x=[None], y=[None], mode='markers', marker=dict(size=10, color=colors['Daikon']), name='Tools inferring Contracts'))

fig.update_layout(legend=dict(
    orientation="h",
    yanchor="bottom",
    y=1.02,
    xanchor="right",
    x=1
))

# Save the plot
fig.write_image(f'analysis/all-tools-mut-score.pdf')
