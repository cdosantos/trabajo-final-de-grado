import sys
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

daikon_results_file = sys.argv[1]
randoop_results_file = sys.argv[2]

print("> Effectiveness analysis")
print(f'daikon results file: {daikon_results_file}')
print(f'randoop results file: {randoop_results_file}')
daikon_df = pd.read_csv(daikon_results_file)
randoop_df = pd.read_csv(randoop_results_file)
print()

total_mutants = daikon_df["mutants"].sum()
detected_by_daikon = daikon_df["detected_mutants"].sum()
detected_by_daikon_percentage = detected_by_daikon / total_mutants * 100
detected_by_randoop = randoop_df["detected_mutants"].sum()
detected_by_randoop_percentage = detected_by_randoop / total_mutants * 100

print(f'total mutants: {total_mutants}')
print(f'detected by daikon: {detected_by_daikon} / {detected_by_daikon_percentage}%')
print(f'detected by randoop: {detected_by_randoop} / {detected_by_randoop_percentage}%')
print(f'detected by both: TBD')
print()

print('Plotting the results')
output_file = "analysis/tools-effectiveness.pdf"
print(f'Saving the plot to {output_file}')

# Create the data
mutants_killed_percentage = [detected_by_randoop_percentage, detected_by_daikon_percentage, 10]
bars = ('Randoop', 'Daikon', 'Both')
x_pos = np.arange(len(bars))
# Create bars with different colors
plt.bar(x_pos, mutants_killed_percentage, color=['darkgray', 'dimgray', 'black'])
# Create names on the x-axis
plt.xticks(x_pos, bars)
plt.xlabel("Assertions")
plt.ylabel("Percentage of mutants killed")
plt.title("Effectiveness Detecting Mutants")
# Save the plot
plt.savefig("analysis/tools-effectiveness.pdf", format="pdf", bbox_inches="tight")

print('Done!')