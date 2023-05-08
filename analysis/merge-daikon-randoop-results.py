import pandas as pd
import os

def merge_values(valor1, valor2):
    if valor1 > 0 or valor2 > 0:
        return 1
    else:
        return 0
    
def merge_effectiveness(daikon_df, randoop_df):
    merge_df = daikon_df[['mutant_id', 'mutation']].copy()
    daikon_failing_test = daikon_df["failing_test"]
    randoop_failing_test = randoop_df["failing_test"]
    merge_df['failing_test'] = daikon_failing_test.combine(randoop_failing_test, merge_values)
    return merge_df  

dir = os.environ['OUTPUT']+"/subjects"
result_files = os.listdir(dir)
merge_result_file = dir+"/../../merge-results.csv"
merge_result_by_mutation_file = dir+"/../../merge-results-by-mutation.csv"
result_files.sort()
data = []
datos_combinados = pd.DataFrame(columns=['mutant_id', 'mutation', 'failing_test'])

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
    merge_result_df = merge_effectiveness(daikon_df, randoop_df)
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