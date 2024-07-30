# run example:
# python3 analysis/effectiveness.py results/detected-mutants/daikon.csv results/detected-mutants/randoop.csv results/detected-mutants/randoop-daikon.csv results/detected-mutants/evosuite.csv results/detected-mutants/evosuite-daikon.csv
import sys
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

daikon_results_file = sys.argv[1]
randoop_results_file = sys.argv[2]
randoop_daikon_results_file = sys.argv[3]
evosuite_results_file = sys.argv[4]
evosuite_daikon_results_file = sys.argv[5]
output_file = sys.argv[6] or "analysis/results/tools-effectiveness.pdf"

print("> Effectiveness analysis")
print(f'daikon results file: {daikon_results_file}')
print(f'randoop results file: {randoop_results_file}')
daikon_df = pd.read_csv(daikon_results_file)
randoop_df = pd.read_csv(randoop_results_file)
evosuite_df = pd.read_csv(evosuite_results_file)
randoop_daikon_df = pd.read_csv(randoop_daikon_results_file)
evosuite_daikon_df = pd.read_csv(evosuite_daikon_results_file)
print()

total_mutants = randoop_df["mutants"].sum()
detected_by_daikon = daikon_df["detected_mutants"].sum()
detected_by_daikon_percentage = detected_by_daikon / total_mutants * 100
detected_by_randoop = randoop_df["detected_mutants"].sum()
detected_by_randoop_percentage = detected_by_randoop / total_mutants * 100
detected_by_evosuite = evosuite_df["detected_mutants"].sum()
detected_by_evosuite_percentage = detected_by_evosuite / total_mutants * 100
detected_by_randoop_daikon = randoop_daikon_df["detected_mutants"].sum()
detected_by_randoop_daikon_percentage = detected_by_randoop_daikon / total_mutants * 100
detected_by_evosuite_daikon = evosuite_daikon_df["detected_mutants"].sum()
detected_by_evosuite_daikon_percentage = detected_by_evosuite_daikon / total_mutants * 100

print(f'total mutants: {total_mutants}')
print(f'detected by daikon: {detected_by_daikon} / {detected_by_daikon_percentage}%')
print(f'detected by randoop: {detected_by_randoop} / {detected_by_randoop_percentage}%')
print(f'detected by evosuite: {detected_by_evosuite} / {detected_by_evosuite_percentage}%')
print(f'detected by randoop-daikon: {detected_by_randoop_daikon} / {detected_by_randoop_daikon_percentage}%')
print(f'detected by evosuite-daikon: {detected_by_evosuite_daikon} / {detected_by_evosuite_daikon_percentage}%')
print()

print('Plotting the results')
print(f'Saving the plot to {output_file}')

mutants_killed_percentage = [
  detected_by_randoop_percentage,
  detected_by_daikon_percentage,
  detected_by_evosuite_percentage,
  detected_by_randoop_daikon_percentage,
  detected_by_evosuite_daikon_percentage
]
bars = ('Randoop', 'Daikon', 'Evosuite', 'R&D', 'E&D')
x_pos = np.arange(len(bars))
# Create bars with different colors
plt.bar(x_pos, mutants_killed_percentage, color=['darkgray', 'dimgray', 'orange', 'black', 'red'])
# Create names on the x-axis
plt.xticks(x_pos, bars)
plt.xlabel("Assertions")
plt.ylabel("Percentage of mutants killed")
plt.title("Effectiveness Detecting Mutants")
# Save the plot
plt.savefig(output_file, format="pdf", bbox_inches="tight")

print('Done!')