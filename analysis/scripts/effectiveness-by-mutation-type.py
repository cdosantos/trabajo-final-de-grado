# run example:
# python3 effectiveness-by-mutation-type.py randoop daikon
# python3 effectiveness-by-mutation-type.py randoop evosuite

import os
import sys
import pandas as pd
import matplotlib.pyplot as plt

tool01 = sys.argv[1]
tool02 = sys.argv[2]

root = os.path.join(os.environ["OUTPUT"], "../results")
full_dir = os.environ["OUTPUT"]+"/subjects"
subjects = os.listdir(full_dir)
subjects.sort()

def find_by_mutation(tool):
    file = tool + "-result.csv"
    datos_combinados = pd.DataFrame(columns=["mutation", "failing_test"])
    for s_dir in subjects:
        file_dir = os.path.join(full_dir, s_dir, file)
        if not os.path.exists(file_dir):
            print(file_dir, "El archivo no existe.")   
            continue
        datos = pd.read_csv(file_dir)
        datos_combinados = pd.concat([datos_combinados, datos], ignore_index=True)

    resultado = datos_combinados.groupby("mutation").agg(
        total=("mutation", "count"),
        failing=("failing_test", lambda x: (x > 0).sum())
    )
    return resultado


def build_chart(data, tool):
    data["not_failing"] = data["total"] - data["failing"]
    print(data)
    fig, ax = plt.subplots()

    ax.bar(data.index, data["failing"], label="Detected", color=['darkgray'])
    ax.bar(data.index, data["not_failing"], bottom=data["failing"], label="Not Detected", color=['black'])

    ax.set_xlabel("Mutation")
    ax.set_ylabel("Mutants count")
    ax.set_title(tool.upper()+": Detected and Not Detected Mutations")
    ax.legend()

    plt.savefig("./"+tool+"-effectiveness-by-mutant.pdf", format="pdf")
    
tools = [tool01, tool02]
for tool in tools:
    res = find_by_mutation(tool)
    results_by_mutation_type_csv = os.path.join(root, "detected-by-mutation-"+tool+".csv")
    res.to_csv(results_by_mutation_type_csv)
    build_chart(res, tool)

data = pd.read_csv(os.path.join(root, "detected-by-mutation-"+tool01+"-"+tool02+".csv"), index_col=0)
build_chart(data, tool01+"-"+tool02)

print("Done!")