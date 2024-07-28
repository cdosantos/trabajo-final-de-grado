import subprocess
import os
root = os.environ['OUTPUT'] + "/.."

# 01 - Filtrado de los resultados obtenidos.
# Se descartan los mutantes en los cuales Randoop lanzó error no relacionado con una aserción.
# Es decir que nos quedamos con los mutantes que Randoop mató con alguna aserción.
# Además se combinan resultados de Randoop + Daikon, EvoSuite + Daikon. 
subprocess.run(["python3", root+"/analysis/scripts/get-assertion-failures-results.py"])

# 02 - Gráfico de resultados de Randoop, EvoSuite, Daikon, R+D, E+D.
# python3 analysis/effectiveness.py results/detected-mutants/daikon.csv results/detected-mutants/randoop.csv results/detected-mutants/randoop-daikon.csv results/detected-mutants/evosuite.csv results/detected-mutants/evosuite-daikon.csv
subprocess.run(["python3", root+"/analysis/scripts/effectiveness.py",
  root+"/analysis/results/detected-mutants/daikon.csv",
  root+"/analysis/results/detected-mutants/randoop.csv",
  root+"/analysis/results/detected-mutants/randoop-daikon.csv",
  root+"/analysis/results/detected-mutants/evosuite.csv",
  root+"/analysis/results/detected-mutants/evosuite-daikon.csv"
])

# 03 - Filtrado de los resultados obtenidos. Similar al paso 01.
# Se descarta el subject maxbag 
subprocess.run(["python3", root+"/analysis/scripts/get-assertion-failures-results.py", ".", "maxbag"])

# 04 - Filtrado de los resultados obtenidos. Similar al paso 03.
# Se analiza solo el subject maxbag
subprocess.run(["python3", root+"/analysis/scripts/get-assertion-failures-results.py", "maxbag"])
