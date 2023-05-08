#!/bin/bash

# ---------- args ------------
# ./scripts/spec-inference-daikon.sh relative_path class method package
# example: ./scripts/spec-inference-daikon.sh SimpleMethods_getMin/ SimpleMethods "getMin\(int,int\)" examples

# ---------- settings --------
curr_dir=$(pwd)
junit=$curr_dir/lib/junit-4.13.2.jar
hamcrest=$curr_dir/lib/hamcrest-core-1.3.jar
daikon_path=$DAIKONDIR
evospex=$EVOSPEX_TEST_GEN
major=$curr_dir/lib/major
source_dir=$SUBJECTS_SOURCE/subjects/$1
output_dir=$OUTPUT/subjects/$1
# -----------------------------

# ---- colores ----
GREEN='\033[0;32m'
NC='\033[0m'
# -----------------

subject_jar=${source_dir}build/libs/simple-examples-1.0-SNAPSHOT.jar
package=$4
class=${package}.$2 # "examples.SimpleMethods" 
class_path=${package//[\.]/\/} # examples/SimpleMethods
method_without_args=${3%%\(*} # getMin
method_without_args=${method_without_args%%\\*} # getMin fix '\'

rm -rf ${output_dir}daikon
mkdir -p ${output_dir}daikon
tests_bin=${output_dir}randoop/bin/

# First step: perform dynamic comparability analysis (with DynComp)
java -cp ${tests_bin}:${daikon_path}/daikon.jar:${subject_jar} daikon.DynComp \
 --output-dir=${output_dir}daikon/ \
 ${package}.RegressionTestDriver

# Second step: obtain the dtrace file with Chicory
echo '--> Going to run Chicory'
java -cp ${tests_bin}:${daikon_path}/daikon.jar:${subject_jar} daikon.Chicory \
 --comparability-file=${output_dir}daikon/RegressionTestDriver.decls-DynComp \
 --output-dir=${output_dir}daikon/ \
 ${package}.RegressionTestDriver

# Third step: actual Daikon execution to infer specs
echo '--> Going to run Daikon'
java -cp ${daikon_path}/daikon.jar daikon.Daikon --ppt-select-pattern ${package}'\.'$2':::CLASS|'${package}'\.'$2':::OBJECT|'${package}'\.'$2'\.'$method_without_args \
 -o ${output_dir}daikon/res.inv.gz \
 ${output_dir}daikon/RegressionTestDriver.dtrace.gz

# Process result and print the Daikon specs for better readability. First
# the ones related to class invariants, and then the ones related to the current method
java -cp ${daikon_path}/daikon.jar daikon.PrintInvariants \
 ${output_dir}daikon/res.inv.gz --format java > ${output_dir}daikon/res.txt

# java -cp ${daikon_path}/daikon.jar daikon.PrintInvariants \
#  ${output_dir}daikon/res.inv.gz --ppt-select ${class}':::OBJECT' --format java > ${output_dir}daikon/res-check.txt

# java -cp ${daikon_path}/daikon.jar daikon.PrintInvariants \
#  ${output_dir}daikon/res.inv.gz --ppt-select ${class}'.'${method_without_args} --format java >> ${output_dir}daikon/res-check.txt
