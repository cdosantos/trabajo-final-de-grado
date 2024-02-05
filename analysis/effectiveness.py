# run example:
# python3 analysis/effectiveness.py results/daikon-all-results.csv results/randoop-all-results.csv results/merge-results.csv results/evosuite-all-results.csv

import sys
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

daikon_results_file = sys.argv[1]
randoop_results_file = sys.argv[2]
merge_results_file = sys.argv[3]
evosuite_results_file = sys.argv[4]

print("> Effectiveness analysis")
print(f'daikon results file: {daikon_results_file}')
print(f'randoop results file: {randoop_results_file}')
daikon_df = pd.read_csv(daikon_results_file)
randoop_df = pd.read_csv(randoop_results_file)
evosuite_df = pd.read_csv(evosuite_results_file)
merge_df = pd.read_csv(merge_results_file)
print()

total_mutants = randoop_df["mutants"].sum()
detected_by_daikon = daikon_df["detected_mutants"].sum()
detected_by_daikon_percentage = detected_by_daikon / total_mutants * 100
detected_by_randoop = randoop_df["detected_mutants"].sum()
detected_by_randoop_percentage = detected_by_randoop / total_mutants * 100
detected_by_evosuite = evosuite_df["detected_mutants"].sum()
detected_by_evosuite_percentage = detected_by_evosuite / total_mutants * 100
detected_by_both = merge_df["detected_mutants"].sum()
detected_by_both_percentage = detected_by_both / total_mutants * 100

print(f'total mutants: {total_mutants}')
print(f'detected by daikon: {detected_by_daikon} / {detected_by_daikon_percentage}%')
print(f'detected by randoop: {detected_by_randoop} / {detected_by_randoop_percentage}%')
print(f'detected by evosuite: {detected_by_evosuite} / {detected_by_evosuite_percentage}%')
print(f'detected by both: {detected_by_both} / {detected_by_both_percentage}%')
print()

print('Plotting the results')
output_file = "analysis/tools-effectiveness.pdf"
print(f'Saving the plot to {output_file}')

# Create the data
mutants_killed_percentage = [detected_by_randoop_percentage, detected_by_daikon_percentage, detected_by_evosuite_percentage, detected_by_both_percentage]
bars = ('Randoop', 'Daikon', 'Evosuite', 'R&D')
x_pos = np.arange(len(bars))
# Create bars with different colors
plt.bar(x_pos, mutants_killed_percentage, color=['darkgray', 'dimgray', 'orange', 'black'])
# Create names on the x-axis
plt.xticks(x_pos, bars)
plt.xlabel("Assertions")
plt.ylabel("Percentage of mutants killed")
plt.title("Effectiveness Detecting Mutants")
# Save the plot
plt.savefig("analysis/tools-effectiveness.pdf", format="pdf", bbox_inches="tight")

print('Done!')