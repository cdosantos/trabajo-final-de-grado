#!/bin/bash

# ---------- args ------------
# ./scripts/run-randoop-test.sh relative_path class package
# example: ./scripts/run-randoop-test.sh SimpleMethods_getMin/ SimpleMethods "getMin\(int,int\)" examples

# ---------- settings --------
curr_dir=$(pwd)
junit=$curr_dir/lib/junit-4.13.2.jar
hamcrest=$curr_dir/lib/hamcrest-core-1.3.jar
source_dir=$SUBJECTS_SOURCE/subjects/$1
output_dir=$OUTPUT/subjects/$1
# -----------------------------

subject_jar=${source_dir}build/libs/simple-examples-1.0-SNAPSHOT.jar
package=$4
class=${package}.$2 # "examples.SimpleMethods" 
class_path=${package//[\.]/\/} # examples/SimpleMethods
method_without_args=${3%%\(*} # getMin
method_without_args=${method_without_args%%\\*} # getMin fix '\'

tests=0
mutants=0
detected_mutants=0
echo "mutant_id,mutation,failing_test,assertions_failures,non_assertions_failures" > ${output_dir}randoop-result.csv
for mutants_dir in ${output_dir}mutants/*/
do
  mutants=$((mutants + 1))
  mutation=$(tail -n+$mutants "$output_dir"mutants.log | head -1 | cut -d':' -f 2)
  echo '> Running tests'
  tests_files=""
  for filename in ${output_dir}randoop/bin/$class_path/*.class
  do
    test=`basename "$filename" .class`
    if [[ "$test" != 'RegressionTestDriver' ]] ; then
      tests_files="$tests_files $package.$test"
    fi
  done
  out=$(java -cp $mutants_dir:${subject_jar}:${output_dir}randoop/bin:$junit:$hamcrest org.junit.runner.JUnitCore $tests_files)
  fail=$(echo "$out" | grep "Tests run: \|OK (")
  echo "> Fail: "$fail
  fail_detail=$(echo "$out" | grep "java.lang.AssertionError")
  fail_detail_timeout=$(echo "$out" | grep "org.junit.runners.model.TestTimedOutException")
  # echo "> Fail Detail: "$fail_detail_timeout
  failing_test=0
  if [ ! -z "${fail_detail}" ]; then
    assertions_failures=$(echo "$fail_detail" | wc -l)
  else 
    assertions_failures=0
  fi
  echo "> Assertion errors: "$assertions_failures
  tmp=$(echo ${fail} | cut -d'(' -f 3)
  if [ ! -z "${tmp}" ]; then
    detected_mutants=$((detected_mutants + 1))
    tmp=${fail#Tests run: }
    tests=${tmp%,*}
    failing_test=${fail##* }
  else
    tmp=${fail#OK (}
    tests=${tmp% tests)}
  fi
  echo "> failing tests: "$failing_test
  echo ''
  non_assertions_failures=$((failing_test - assertions_failures))
  echo $mutants,$mutation,$failing_test,$assertions_failures,$non_assertions_failures >> ${output_dir}randoop-result.csv
done
echo $2.$method_without_args,$tests,$mutants,$detected_mutants >> ${output_dir}../../../randoop-all-results.csv