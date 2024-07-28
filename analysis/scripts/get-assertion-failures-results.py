# run example:
# python3 analysis/get-assertion-failures-results.py [subject] [skipSubject]
# python3 analysis/get-assertion-failures-results.py maxbag
# python3 analysis/get-assertion-failures-results.py . maxbag
import pandas as pd
import os
import sys
import re

subject = '.'
skip_subject = '*'
if (len(sys.argv) > 1):
    subject = sys.argv[1]
if (len(sys.argv) > 2):
    skip_subject = sys.argv[2]

dir = os.environ['OUTPUT']+"/subjects"
subject_folders = os.listdir(dir)
randoop_file = dir+"/../../analysis/results/detected-mutants/randoop.csv"
evosuite_file = dir+"/../../analysis/results/detected-mutants/evosuite.csv"
daikon_file = dir+"/../../analysis/results/detected-mutants/daikon.csv"
randoop_daikon_file = dir+"/../../analysis/results/detected-mutants/randoop-daikon.csv"
evosuite_daikon_file = dir+"/../../analysis/results/detected-mutants/evosuite-daikon.csv"
subject_folders.sort()
randoop_data = []
evosuite_data = []
daikon_data = []
randoop_daikon_data = []
evosuite_daikon_data = []
daikon_vs_randoop = 0
daikon_vs_evosuite = 0
total_mutants = 0

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

    mutants = 0
    randoop_detected_mutants = 0
    evosuite_detected_mutants = 0
    daikon_detected_mutants = 0
    randoop_daikon_detected_mutants = 0
    evosuite_daikon_detected_mutants = 0

    for index, randoop in randoop_df.iterrows():
        if randoop['non_assertions_failures'] > 0:
            continue
            # print('In the subject', file, 'the mutant N', randoop['mutant_id'], 'has non-assertion failures')
        if randoop['non_assertions_failures'] == 0:
            mutants += 1
            if randoop['assertions_failures'] > 0:
                randoop_detected_mutants += 1
            if evosuite_df['assertions_failures'][hash(index)] > 0:
                evosuite_detected_mutants += 1
            if daikon_df['failing_test'][hash(index)] > 0:
                daikon_detected_mutants += 1
            if randoop['assertions_failures'] > 0 or daikon_df['failing_test'][hash(index)] > 0:
                randoop_daikon_detected_mutants += 1
            if evosuite_df['assertions_failures'][hash(index)] > 0 or daikon_df['failing_test'][hash(index)] > 0:
                evosuite_daikon_detected_mutants += 1
            if randoop['assertions_failures'] == 0 and daikon_df['failing_test'][hash(index)] > 0:
                daikon_vs_randoop += 1
            if evosuite_df['assertions_failures'][hash(index)] == 0 and daikon_df['failing_test'][hash(index)] > 0:
                daikon_vs_evosuite += 1

    randoop_data.append({
        "subject": file,
        "mutants": mutants,
        "detected_mutants": randoop_detected_mutants
    })
    evosuite_data.append({
        "subject": file,
        "mutants": mutants,
        "detected_mutants": evosuite_detected_mutants
    })
    daikon_data.append({
        "subject": file,
        "mutants": mutants,
        "detected_mutants": daikon_detected_mutants
    })
    randoop_daikon_data.append({
        "subject": file,
        "mutants": mutants,
        "detected_mutants": randoop_daikon_detected_mutants
    })
    evosuite_daikon_data.append({
        "subject": file,
        "mutants": mutants,
        "detected_mutants": evosuite_daikon_detected_mutants
    })

    total_mutants += mutants

pd.DataFrame(randoop_data).to_csv(randoop_file, index=False)
pd.DataFrame(evosuite_data).to_csv(evosuite_file, index=False)
pd.DataFrame(daikon_data).to_csv(daikon_file, index=False)
pd.DataFrame(randoop_daikon_data).to_csv(randoop_daikon_file, index=False)
pd.DataFrame(evosuite_daikon_data).to_csv(evosuite_daikon_file, index=False)

print('Mutantes:', total_mutants)
print('Mutantes que daikon detectó y Randoop no:', daikon_vs_randoop)
print('Mutantes que daikon detectó y EvoSuite no:', daikon_vs_evosuite)

print('Done!')