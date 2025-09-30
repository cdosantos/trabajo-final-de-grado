import pandas as pd
import os
import sys

dir = os.environ['OUTPUT']+"/subjects"
mutants_to_ignore_file = dir+"/../../mutantes-no-relacionados-con-el-sut.csv"
mutants_to_ignore_df = pd.read_csv(mutants_to_ignore_file)

def get_false_positives(subject):
    df = pd.read_csv("daikon_false_positives.csv", sep=';')
    return {row['invariant'] for _, row in df.iterrows() 
            if row['method'] == subject}

def check_fails_file(fails_path, false_positives):
    if not os.path.exists(fails_path) or os.path.getsize(fails_path) == 0:
        return None
        
    with open(fails_path, 'r') as f:
        fails_content = f.read().strip()
        
    if not fails_content:
        return None
        
    found_invariants = set()
    affected_lines = 0
    for line in fails_content.split('\n'):
        if 'Invariant' in line:
            start = line.find("'") + 1
            end = line.find("'", start)
            if start != -1 and end != -1:
                invariant = line[start:end]
                # ignorar (lexically)
                # ejemplo: 'this._var4384._1[..] > orig(this._var4384._1[..]) (lexically)'
                if ' (lexically)' in invariant:
                    invariant = invariant.replace(' (lexically)', '')

                found_invariants.add(invariant)
                if invariant in false_positives:
                    affected_lines += 1

    if affected_lines > 0:
        print(f"Archivo {fails_path} tiene {affected_lines} de {len(fails_content.split('\n'))} líneas afectadas por false positives.")
    return found_invariants.issubset(false_positives)


def parse_mutants_range(mutants_range):
    """Parsea los rangos de mutantes y devuelve un conjunto con todos los valores."""
    mutants_set = set()
    
    if pd.isna(mutants_range):
        return mutants_set
    
    # Dividir por ';' para obtener múltiples rangos
    ranges = mutants_range.split(';')
    
    for range_str in ranges:
        range_str = range_str.strip()
        if '-' in range_str:
            # Es un rango (ej: "11-18")
            start, end = map(int, range_str.split('-'))
            mutants_set.update(range(start, end + 1))
        else:
            # Es un valor individual
            mutants_set.add(int(range_str))
    
    return mutants_set

def get_mutants_to_ignore_for_method(method_name):
    """Obtiene los mutantes a ignorar para un método específico."""
    method_row = mutants_to_ignore_df[mutants_to_ignore_df['method'] == method_name]

    if method_row.empty:
        return set()
    
    mutants_range = method_row.iloc[0]['mutants_range']
    return parse_mutants_range(mutants_range)

def include_mutant(mutant, mutants_list_to_ignore):
    if mutants_list_to_ignore and (mutant) in mutants_list_to_ignore:
        return False
    return True

def main():
    if len(sys.argv) != 2:
        print("Uso: python3 check_fails.py <subject>")
        return
        
    
    subject = sys.argv[1]

    mutants_list_to_ignore = get_mutants_to_ignore_for_method(subject)

    false_positives = get_false_positives(subject)
    only_false_positives_count = 0
    base_path = f"results-ground-truth-subjects/subjects/{subject}/mutants"
    
    for mutant_id in range(1, 1000):
        include = include_mutant(mutant_id, mutants_list_to_ignore)
        if not include:
            continue
        fails_path = f"{base_path}/{mutant_id}/examples/fails.txt"
        result = check_fails_file(fails_path, false_positives)
        
        if result is True:
            only_false_positives_count += 1
            
    print(f"\nTotal de mutantes que solo contienen false positives conocidos: {only_false_positives_count}")

if __name__ == "__main__":
    main()