# run example:
# python3 analysis/get-assertion-failures-results.py [subject] [skipSubject]
# python3 analysis/get-assertion-failures-results.py maxbag
# python3 analysis/get-assertion-failures-results.py . maxbag
import matplotlib.pyplot as plt
import pandas as pd
import os
import sys
import re

dir = os.environ['OUTPUT']+"/subjects"

def build_chart(data, tool):
    data["not_failing"] = data["mutants"] - data["detected_mutants"]
    print(data)
    fig, ax = plt.subplots()

    ax.bar(data.index, data["detected_mutants"], label="Detected", color=['darkgray'])
    ax.bar(data.index, data["not_failing"], bottom=data["detected_mutants"], label="Not Detected", color=['black'])

    ax.set_xlabel("Mutation")
    ax.set_ylabel("Mutants count")
    ax.set_title(tool.upper()+": Detected and Not Detected Mutations")
    ax.legend()

    plt.savefig(dir + "/../../analysis/results/detected-mutants-by-mutation-type/" + tool + "-effectiveness-by-mutant.pdf", format="pdf")


subject = '.'
skip_subject = '*'
if (len(sys.argv) > 1):
    subject = sys.argv[1]
if (len(sys.argv) > 2):
    skip_subject = sys.argv[2]

subject_folders = os.listdir(dir)

randoop_file = dir+"/../../analysis/results/detected-mutants-by-mutation-type/detected-by-mutation-randoop.csv"
evosuite_file = dir+"/../../analysis/results/detected-mutants-by-mutation-type/detected-by-mutation-evosuite.csv"
daikon_file = dir+"/../../analysis/results/detected-mutants-by-mutation-type/detected-by-mutation-daikon.csv"

subject_folders.sort()
randoop_rows = []
evosuite_rows = []
daikon_rows = []

for file in subject_folders:
    if not re.search(subject, file):
        continue
    if skip_subject != '*' and re.search(skip_subject, file):
        continue
    filedir = os.path.join(dir, file)
    randoop_results_file = filedir + '/randoop-result.csv'
    if not os.path.exists(randoop_results_file):
        print(randoop_results_file, "El archivo no existe.")
        continue

    randoop_df = pd.read_csv(randoop_results_file)
    evosuite_df = pd.read_csv(filedir+'/evosuite-result.csv')
    daikon_df = pd.read_csv(filedir+'/daikon-result.csv')

    for index, randoop in randoop_df.iterrows():
        if randoop['non_assertions_failures'] == 0:
            randoop_rows.append([
                randoop.loc["mutation"],
                randoop.loc["assertions_failures"]
            ])
            evosuite_rows.append([
                evosuite_df.loc[index, "mutation"],
                evosuite_df.loc[index, "assertions_failures"]
            ])
            daikon_rows.append([
                daikon_df.loc[index, "mutation"],
                daikon_df.loc[index, "failing_test"]
            ])

randoop_data = pd.DataFrame(randoop_rows, columns=["mutation", "assertions_failures"])
evosuite_data = pd.DataFrame(evosuite_rows, columns=["mutation", "assertions_failures"])
daikon_data = pd.DataFrame(daikon_rows, columns=["mutation", "failing_test"])

randoop_result = randoop_data.groupby("mutation").agg(
    mutants=("mutation", "count"),
    detected_mutants=("assertions_failures", lambda x: (x > 0).sum())
)
randoop_result.to_csv(randoop_file)
build_chart(randoop_result, "randoop")

evosuite_result = evosuite_data.groupby("mutation").agg(
    mutants=("mutation", "count"),
    detected_mutants=("assertions_failures", lambda x: (x > 0).sum())
)
evosuite_result.to_csv(evosuite_file)
build_chart(evosuite_result, "evosuite")

daikon_result = daikon_data.groupby("mutation").agg(
    mutants=("mutation", "count"),
    detected_mutants=("failing_test", lambda x: (x > 0).sum())
)
daikon_result.to_csv(daikon_file)
build_chart(daikon_result, "daikon")


print('Done!')