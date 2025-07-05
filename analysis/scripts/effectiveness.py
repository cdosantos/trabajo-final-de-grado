# run example:
# python3 analysis/effectiveness.py results/detected-mutants/daikon.csv:Daikon results/detected-mutants/randoop.csv:Randoop results/detected-mutants/evosuite.csv:Evosuite output.pdf
import sys
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

def parse_input_files(args):
    """Parse input arguments to extract file paths and labels."""
    files_and_labels = []
    for arg in args:
        if ':' in arg:
            file_path, label = arg.split(':', 1)
        else:
            file_path, label = arg, None
        files_and_labels.append((file_path, label))
    return files_and_labels

def calculate_percentage(file_path):
    """Calculate the percentage of detected mutants for a given file."""
    df = pd.read_csv(file_path)
    total_mutants = df["mutants"].sum()
    detected_mutants = df["detected_mutants"].sum()
    return detected_mutants / total_mutants * 100 if total_mutants > 0 else 0

def main():
    # Parse command-line arguments
    args = sys.argv[1:]
    if len(args) < 2:
        print("Usage: python3 effectiveness.py <file1[:label1]> <file2[:label2]> ... <output_file>")
        sys.exit(1)

    # Extract output file
    output_file = args[-1]
    input_files = parse_input_files(args[:-1])

    # Calculate percentages and prepare labels
    percentages = []
    labels = []
    for file_path, label in input_files:
        percentage = calculate_percentage(file_path)
        percentages.append(percentage)
        labels.append(label if label else file_path)

    # Plot the results
    print('Plotting the results')
    print(f'Saving the plot to {output_file}')

    x_pos = np.arange(len(labels))
    plt.bar(x_pos, percentages, color=['darkgray', 'dimgray', 'orange', 'black', 'red'][:len(labels)])
    plt.xticks(x_pos, labels, ha="right")
    plt.xlabel("Aserciones")
    plt.ylabel("Porcentaje de mutantes detectados")
    plt.title("Eficacia en la detección de mutantes")
    plt.tight_layout()
    plt.savefig(output_file, format="pdf", bbox_inches="tight")

    print('Done!')

if __name__ == "__main__":
    main()