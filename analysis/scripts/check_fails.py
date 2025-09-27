import pandas as pd
import os
import sys

def get_false_positives():
    df = pd.read_csv("daikon_false_positives.csv", sep=';')
    return {row['invariant'] for _, row in df.iterrows() 
            if row['method'] == 'composite_addChild'}

def check_fails_file(fails_path, false_positives):
    if not os.path.exists(fails_path) or os.path.getsize(fails_path) == 0:
        return None
        
    with open(fails_path, 'r') as f:
        fails_content = f.read().strip()
        
    if not fails_content:
        return None
        
    found_invariants = set()
    for line in fails_content.split('\n'):
        if 'Invariant' in line:
            start = line.find("'") + 1
            end = line.find("'", start)
            if start != -1 and end != -1:
                invariant = line[start:end]
                found_invariants.add(invariant)
                if invariant not in false_positives:
                    print(f"Archivo: {fails_path}")
                    print(f"Mutante con invariant no conocido: {invariant}")
                    return False

    return found_invariants.issubset(false_positives)

def main():
    if len(sys.argv) != 2:
        print("Uso: python3 check_fails.py <subject>")
        return
        
    subject = sys.argv[1]
    false_positives = get_false_positives()
    only_false_positives_count = 0
    
    base_path = f"results-ground-truth-subjects/subjects/{subject}/mutants"
    
    for mutant_id in range(1, 1000):
        fails_path = f"{base_path}/{mutant_id}/examples/fails.txt"
        result = check_fails_file(fails_path, false_positives)
        
        if result is True:
            print(f"Mutante {mutant_id}: solo contiene false positives conocidos")
            only_false_positives_count += 1
            
    print(f"\nTotal de mutantes que solo contienen false positives conocidos: {only_false_positives_count}")

if __name__ == "__main__":
    main()