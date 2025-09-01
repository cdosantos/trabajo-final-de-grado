# run example:
# python3 effectiveness-by-mutation-type.py randoop
# python3 effectiveness-by-mutation-type.py evosuite
# python3 effectiveness-by-mutation-type.py daikon

import os
import sys
import pandas as pd
import matplotlib.pyplot as plt

tool = sys.argv[1]

root = os.path.join(os.environ["OUTPUT"], "../analysis/results/detected-mutants-by-mutation-type")
full_dir = os.environ["OUTPUT"]+"/subjects"
subjects = os.listdir(full_dir)
subjects.sort()

def find_by_mutation(tool):
    file = tool + "-result.csv"
    column = "assertions_failures"
    if (tool == "daikon"):
        column = "failing_test"
    datos_combinados = pd.DataFrame(columns=["mutation", column])
    for s_dir in subjects:
        file_dir = os.path.join(full_dir, s_dir, file)
        if not os.path.exists(file_dir):
            print(file_dir, "El archivo no existe.")   
            continue
        datos = pd.read_csv(file_dir)
        datos_combinados = pd.concat([datos_combinados, datos], ignore_index=True)

    resultado = datos_combinados.groupby("mutation").agg(
        mutants=("mutation", "count"),
        detected_mutants=(column, lambda x: (x > 0).sum())
    )
    return resultado


def build_chart(data, tool):
    data["not_failing"] = data["mutants"] - data["detected_mutants"]
    print(data)
    fig, ax = plt.subplots()

    ax.bar(data.index, data["detected_mutants"], label="Detectado", color=['darkgray'])
    ax.bar(data.index, data["not_failing"], bottom=data["detected_mutants"], label="No Detectado", color=['black'])

    ax.set_xlabel("Operador de Mutación")
    ax.set_ylabel("Cantidad de Mutantes")
    ax.set_title(tool.upper()+": Mutantes Detectados y No Detectados")
    ax.legend()

    plt.savefig(os.path.join(root, tool + "-effectiveness-by-mutant.pdf"), format="pdf")
    

res = find_by_mutation(tool)
results_by_mutation_type_csv = os.path.join(root, "detected-by-mutation-"+tool+".csv")
res.to_csv(results_by_mutation_type_csv)
build_chart(res, tool)

print("Done!")