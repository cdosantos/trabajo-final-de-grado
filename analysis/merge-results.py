# run example:
# python3 merge-results.py daikon randoop
# python3 merge-results.py evosuite randoop

import pandas as pd
import os
import sys

def merge_values(valor1, valor2):
    if valor1 > 0 or valor2 > 0:
        return 1
    else:
        return 0
    
def merge_effectiveness(x_df, y_df):
    merge_df = x_df[['mutant_id', 'mutation']].copy()
    x_failing_test = x_df["failing_test"]
    y_failing_test = y_df["failing_test"]
    merge_df['failing_test'] = x_failing_test.combine(y_failing_test, merge_values)
    return merge_df  

tool_1 = sys.argv[1]
tool_2 = sys.argv[2]
dir = os.environ['OUTPUT']+"/subjects"
result_files = os.listdir(dir)
merge_result_file = dir+"/../../results/detected-mutants-"+tool_1+"-"+tool_2+".csv"
merge_result_by_mutation_file = dir+"/../../results/detected-mutants-by-mutation-"+tool_1+"-"+tool_2+".csv"
result_files.sort()
data = []
datos_combinados = pd.DataFrame(columns=['mutant_id', 'mutation', 'failing_test'])

for file in result_files:
    filedir = os.path.join(dir, file)
    x_results_file = filedir+'/'+tool_1+'-result.csv'
    y_results_file = filedir+'/'+tool_2+'-result.csv'
    if not os.path.exists(x_results_file):
        print(x_results_file, "El archivo no existe.")
        continue
    if not os.path.exists(y_results_file):
        print(y_results_file, "El archivo no existe.")
        continue

    x_df = pd.read_csv(x_results_file)
    y_df = pd.read_csv(y_results_file)
    merge_result_df = merge_effectiveness(x_df, y_df)
    datos_combinados = pd.concat([datos_combinados, merge_result_df], ignore_index=True)
    data.append({
        "subject": file,
        "detected_mutants": merge_result_df['failing_test'].sum()
    })

pd.DataFrame(data).to_csv(merge_result_file, index=False)

resultado = datos_combinados.groupby('mutation').agg(
    total=('mutation', 'count'),
    failing=('failing_test', lambda x: (x > 0).sum())
)

pd.DataFrame(resultado).to_csv(merge_result_by_mutation_file, index=True)


print('Done!')