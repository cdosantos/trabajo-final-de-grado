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
print(f'detected by randoop percentage: {detected_by_randoop / total_mutants * 100}%')
print()
print(f'detected by daikon: {detected_by_daikon}')
print(f'detected by daikon percentage: {detected_by_daikon / total_mutants * 100}%')
print()
print(f'detected by randoop and daikon: {detected_randoop_daikon}')
print(f'detected by randoop and daikon percentage: {detected_randoop_daikon / total_mutants * 100}%')
print()
print("==== Results Randoop + EvoSpex ====")
print("tbd")
print()
print("==== Results Randoop + GAssert ====")
print("tbd")
print()
print("==== Results Randoop + SpecFuzzer ====")
print("tbd")

