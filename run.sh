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

# ---- colores ----
GREEN='\033[0;32m'
NC='\033[0m'
# -----------------

subject_jar=${source_dir}build/libs/simple-examples-1.0-SNAPSHOT.jar
class_path=${4//[\.]/\/} # examples/SimpleMethods

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
echo '> Compiling mutants'
for mutants_dir in ${output_dir}mutants/*/
do
  javac -cp ${subject_jar} -g $mutants_dir$class_path/${2}.java -d $mutants_dir
done
echo '> Mutants compiled'

echo ''
echo '> Running randoop tests'
./scripts/run-randoop-test.sh $1 $2 $3 $4

echo ''
echo '> Running daikon spec'
./scripts/run-daikon-spec.sh $1 $2 $3 $4