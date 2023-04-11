import pandas as pd
import numpy as np
import os

def merge_effectiveness(daikon_df, randoop_df):
  daikon_failing_test = daikon_df["failing_test"]
  randoop_failing_test = randoop_df["failing_test"]
  def merge_values(valor1, valor2):
    if valor1 > 0 or valor2 > 0:
      return 1
    else:
      return 0

  result = daikon_failing_test.combine(randoop_failing_test, merge_values)
  return result.sum()  

dir = os.environ['OUTPUT']+"/subjects"
result_files = os.listdir(dir)
merge_result_dir = dir+"/../../merge-results.csv"
result_files.sort()
data = []
for file in result_files:
  filedir = os.path.join(dir, file)
  daikon_results_file = filedir+'/daikon-result.csv'
  randoop_results_file = filedir+'/randoop-result.csv'
  if not os.path.exists(daikon_results_file):
    print(daikon_results_file, "El archivo no existe.")
    continue
  if not os.path.exists(randoop_results_file):
    print(randoop_results_file, "El archivo no existe.")
    continue
  
  daikon_df = pd.read_csv(daikon_results_file)
  randoop_df = pd.read_csv(randoop_results_file)
  merge_result = merge_effectiveness(daikon_df, randoop_df)
  data.append({
    "subject": file,
    "detected_mutants": merge_result
  })

pd.DataFrame(data).to_csv(merge_result_dir, index=False)

print('Done!')