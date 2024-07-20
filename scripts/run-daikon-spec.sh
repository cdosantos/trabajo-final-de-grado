#!/bin/bash

# ---------- args ------------
# ./run.sh relative_path class method package
# example: ./run.sh SimpleMethods_getMin/ SimpleMethods "getMin\(int,int\)" examples

# ---------- settings --------
run_randoop=true
run_daikon=true
curr_dir=$(pwd)
junit=$curr_dir/lib/junit-4.13.2.jar
hamcrest=$curr_dir/lib/hamcrest-core-1.3.jar
daikon_path=$DAIKONDIR
evospex=$EVOSPEX_TEST_GEN
major=$curr_dir/lib/major
source_dir=$SUBJECTS_SOURCE/subjects/$1
output_dir=$OUTPUT/subjects/$1
# -----------------------------

subject_jar=${source_dir}build/libs/simple-examples-1.0-SNAPSHOT.jar
package=$4
class_name=$2
class=${package}.${class_name} # "examples.SimpleMethods" 
method=${class}.$3 # "examples.SimpleMethods.getMin\(int,int\)"
class_path=${package//[\.]/\/} # examples/SimpleMethods
method_without_args=${3%%\(*} # getMin
method_without_args=${method_without_args%%\\*} # getMin fix '\'

tests=0
mutants=0
detected_mutants=0
echo "mutant_id,mutation,failing_test" > ${output_dir}daikon-result.csv
echo $class_name.$method_without_args > ${output_dir}daikon.log
for mutant_number in `ls -v ${output_dir}mutants/`
do
  mutants=$((mutants + 1))
  mutants_dir=${output_dir}mutants/$mutant_number
  mutation=$(tail -n+$mutants "$output_dir"mutants.log | head -1 | cut -d':' -f 2)
  echo '> Going to run DynComp'
  dyncomp_log=$(timeout --foreground 5m java -cp ${output_dir}randoop/bin/:${daikon_path}/daikon.jar:$mutants_dir:${subject_jar} daikon.DynComp --output-dir=$mutants_dir$class_path ${package}.RegressionTestDriver)
  echo '> Going to run Chicory'
  chicory_log=$(timeout --foreground 5m java -cp ${output_dir}randoop/bin/:${daikon_path}/daikon.jar:$mutants_dir:${subject_jar} daikon.Chicory --comparability-file=$mutants_dir$class_path/RegressionTestDriver.decls-DynComp --output-dir=$mutants_dir$class_path ${package}.RegressionTestDriver)
  echo "> Running InvariantChecker"
  out=$(timeout --foreground 5m java -cp ${daikon_path}/daikon.jar:$mutants_dir:${subject_jar} daikon.tools.InvariantChecker --output $mutants_dir$class_path/fails.txt ${output_dir}daikon/res.inv.gz $mutants_dir$class_path/RegressionTestDriver.dtrace.gz 2>&1)
  fail=$(echo "$out" | grep "false positives, out of")
  echo "> -------------------------------------------- "
  echo "> Mutant:"$mutants", Out: "$out >> ${output_dir}daikon.log
  # echo "> Fail: "$fail
  # echo "> -------------------------------------------- "
  tmp=${fail#*: *}
  false_positives=$(echo ${tmp} | cut -d' ' -f 1)
  if [ ! -z "${false_positives}" ]; then
    if [ "${false_positives}" != "0" ]; then
      detected_mutants=$((detected_mutants + 1))
    fi
  fi
  out_of=$(echo ${tmp} | cut -d' ' -f 6)
  out_of=${out_of%,}
  echo "> "$false_positives
  echo "> "$out_of
  echo $mutants,$mutation,$false_positives >> ${output_dir}daikon-result.csv
done
echo $class_name.$method_without_args,$out_of,$mutants,$detected_mutants >> ${output_dir}../../../daikon-all-results.csv
