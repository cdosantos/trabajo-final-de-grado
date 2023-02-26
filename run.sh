#!/bin/bash

# ---------- args ------------
# ./run.sh relative_path class method package
# example: ./run.sh SimpleMethods_getMin/ SimpleMethods "getMin\(int,int\)" examples

# ---------- settings --------
run_randoop=true
run_daikon=false
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
method=${class}.$3 # "examples.SimpleMethods.getMin\(int,int\)"
class_path=${package//[\.]/\/} # examples/SimpleMethods
method_without_args=${3%%\(*} # getMin
method_without_args=${method_without_args%%\\*} # getMin fix '\'

tests_src=$evospex/tests/
tests_bin=$evospex/tests/bin/

# RANDOOP
if [ "$run_randoop" = true ] ; then
  ./scripts/test-gen-randoop.sh $1 $2 $3 $4
fi

# DAIKON
if [ "$run_daikon" = true ] ; then
  ./scripts/spec-inference-daikon.sh $1 $2 $3 $4
fi

# MAJOR
rm -rf ${output_dir}bin
mkdir ${output_dir}bin
echo '> Generating mutants with Major for file: '$2.java
$major/bin/javac -cp $subject_jar -nowarn -J-Dmajor.export.mutants=true -XMutator:ALL -d ${output_dir}bin ${source_dir}src/main/java/$class_path/${2}.java

echo '> Mutants generated!'
mv mutants.log ${output_dir}mutants.log
rm -rf ${output_dir}mutants
mv mutants ${output_dir}

echo ''
echo '> Processing mutants'

tests=0
mutants=0
detected_mutants=0
echo "mutant_id,mutation,failing_test,assertions_failures,non_assertions_failures" > ${output_dir}results.csv
for mutants_dir in ${output_dir}mutants/*/
do
  mutants=$((mutants + 1))
  mutation=$(tail -n+$mutants "$output_dir"mutants.log | head -1 | cut -d':' -f 2)
  echo '> Procesing mutant: '$mutants
  echo '> Compiling mutant'
  # está bien el uso del jar?
  javac -cp ${subject_jar} -g $mutants_dir$class_path/${2}.java -d $mutants_dir
  echo '> Mutant compiled'
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
  assertions_failures=$(echo "$fail_detail" | wc -l)
  assertions_failures=$((assertions_failures - 1))
  timeout_failures=$(echo "$fail_detail_timeout" | wc -l)
  timeout_failures=$((timeout_failures - 1))
  echo "> Assertion errors: "$assertions_failures
  echo "> Timeout errors: "$timeout_failures
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
  echo ''
  non_assertions_failures=$((failing_test - assertions_failures))
  echo $mutants,$mutation,$failing_test,$assertions_failures,$non_assertions_failures >> ${output_dir}results.csv
done
echo $2.$method_without_args,$tests,$mutants,$detected_mutants >> ${output_dir}../../../all-results.csv