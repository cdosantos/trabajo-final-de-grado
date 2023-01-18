#!/bin/bash

# ---------- args ------------
# ./run.sh relative_path class method package
# example: ./run.sh SimpleMethods_getMin/ SimpleMethods getMin\(int,int\) examples

# ---------- settings --------
run_randoop=true
run_daikon=false
curr_dir=$(pwd)
junit=$curr_dir/lib/junit-4.13.2.jar
daikon_path=$DAIKONDIR
evospex=$EVOSPEX_TEST_GEN
dir=$SUBJECTS_SOURCE/subjects/$1
output_dir=$OUTPUT/subjects/$1
# -----------------------------

# ---- colores ----
GREEN='\033[0;32m'
NC='\033[0m'
# -----------------

rm -rf $output_dir

subject_jar=${dir}build/libs/simple-examples-1.0-SNAPSHOT.jar
package=$4
class=${package}.$2 # "examples.SimpleMethods" 
method=${class}.$3 # "examples.SimpleMethods.getMin\(int,int\)"
class_path=${package//[\.]/\/} # examples/SimpleMethods
method_without_args=${3%%\(*} # getMin
method_without_args=${method_without_args%%\\*} # getMin fix '\'

tests_src=$evospex/tests/
tests_bin=$evospex/tests/bin/

mkdir -p ${output_dir}daikon
mkdir -p ${output_dir}randoop

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
    --output-dir=${output_dir}daikon/ \
    ${package}.RegressionTestDriver

  java -cp ${tests_bin}:${daikon_path}/daikon.jar:${subject_jar} daikon.Chicory \
    --comparability-file=${output_dir}daikon/RegressionTestDriver.decls-DynComp \
    --output-dir=${output_dir}daikon/ \
    ${package}.RegressionTestDriver

  java -cp ${daikon_path}/daikon.jar daikon.Daikon \
    -o ${output_dir}daikon/res.inv.gz \
    ${output_dir}daikon/RegressionTestDriver.dtrace.gz

  java -cp ${daikon_path}/daikon.jar daikon.PrintInvariants \
    ${output_dir}daikon/res.inv.gz --ppt-select ${class}':::OBJECT' --format java > ${output_dir}daikon/res.txt

  java -cp ${daikon_path}/daikon.jar daikon.PrintInvariants \
    ${output_dir}daikon/res.inv.gz --ppt-select ${class}'.'${method_without_args} --format java >> ${output_dir}daikon/res.txt
fi

# MAJOR
mkdir ${output_dir}bin
echo '> Generating mutants with Major for file: '$2.java
$MAJOR_HOME/bin/javac -cp $subject_jar -nowarn -J-Dmajor.export.mutants=true -XMutator:ALL -d ${output_dir}bin ${dir}src/main/java/$class_path/${2}.java

echo '> Mutants generated!'
mv mutants.log ${output_dir}mutants.log
mv mutants ${output_dir}

echo ''
echo '> Processing mutants'
for dir in ${output_dir}mutants/*/
do
  echo '> Procesing mutant: '$dir
  echo '> Compiling mutant'
  javac -cp ${output_dir}bin -g $dir$class_path/${2}.java -d $dir
  echo '> Mutant compiled'
done

java -cp ${output_dir}mutants/2:${output_dir}randoop/bin:$junit:$HAMCREST_CORE org.junit.runner.JUnitCore examples.RegressionTest0