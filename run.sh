#!/bin/bash

# ---------- args ------------
# ./run.sh relative_path class method package
# example: ./run.sh SimpleMethods_getMin/ SimpleMethods getMin\(int,int\) examples

# ---------- settings --------
run_randoop=true
run_daikon=true
junit=/home/claudio/Documentos/tesis/codigo/lib/junit-4.13.2.jar
daikon_path=/home/claudio/Software/daikon-5.8.14
evospex=/home/claudio/Software/evospex-test-gen/
dir=/home/claudio/Documentos/tesis/codigo/ground-truth-subjects/subjects/$1
output_dir=/home/claudio/Documentos/tesis/codigo/results-ground-truth-subjects/subjects/$1
# -----------------------------

# ---- colores ----
GREEN='\033[0;32m'
NC='\033[0m'
# -----------------

subject_jar=${dir}build/libs/simple-examples-1.0-SNAPSHOT.jar
package=$4
class=${package}.$2 # "examples.SimpleMethods" 
method=${class}.$3 # "examples.SimpleMethods.getMin\(int,int\)"
class_path=${package//[\.]/\/} # examples/SimpleMethods
method_without_args=${3%%\(*} # getMin

tests_src=/home/claudio/Software/evospex-test-gen/tests/
tests_bin=/home/claudio/Software/evospex-test-gen/tests/bin/

mkdir -p ${output_dir}daikon
mkdir -p ${output_dir}randoop
mkdir -p ${dir}test/daikon/

# RANDOOP
if [ "$run_randoop" = true ] ; then
  cd ${dir}
  ./gradlew -q -Dskip.tests jar
  cd ${evospex}
  ./gen-randoop-pos-neg-objects.sh -cp=${subject_jar} -c=${class} -m=${method} -s=3
  cd tests
  mkdir bin

  javac -cp ${junit}:${tests_src}:${subject_jar} ${class_path}/*.java -d ${tests_bin}

  mkdir -p ${output_dir}/randoop/${class_path}
  cp -r ${tests_src}${class_path}/* ${output_dir}/randoop/${class_path}
  cp -r ${tests_bin} ${output_dir}/randoop/
fi

# DAIKON
tests_bin=${output_dir}randoop/bin/
if [ "$run_daikon" = true ] ; then
  java -cp ${tests_bin}:${daikon_path}/daikon.jar:${subject_jar} daikon.DynComp \
    --output-dir=${dir}test/daikon/ \
    ${package}.RegressionTestDriver

  java -cp ${tests_bin}:${daikon_path}/daikon.jar:${subject_jar} daikon.Chicory \
    --comparability-file=${dir}test/daikon/RegressionTestDriver.decls-DynComp \
    --output-dir=${dir}test/daikon/ \
    ${package}.RegressionTestDriver

  java -cp ${daikon_path}/daikon.jar daikon.Daikon \
    -o ${output_dir}daikon/res.inv.gz \
    ${dir}test/daikon/RegressionTestDriver.dtrace.gz

  java -cp ${daikon_path}/daikon.jar daikon.PrintInvariants \
    ${output_dir}daikon/res.inv.gz --ppt-select ${class}':::OBJECT' --format java > ${output_dir}daikon/res.txt

  java -cp ${daikon_path}/daikon.jar daikon.PrintInvariants \
    ${output_dir}daikon/res.inv.gz --ppt-select ${class}'.'${method_without_args} --format java >> ${output_dir}daikon/res.txt
fi















# java -cp ${dir}test/daikon/:${daikon_path}/daikon.jar daikon.tools.jtb.Annotate \
#   ${dir}test/daikon/res.inv.gz ${dir}src/StackAr.java
