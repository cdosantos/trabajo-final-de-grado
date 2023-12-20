#!/bin/bash

# ---------- args ------------
# ./scripts/test-gen-evosuite.sh relative_path class method package
# example: ./scripts/test-gen-evosuite.sh SimpleMethods_getMin/ SimpleMethods "getMin\(int,int\)" examples

# java -jar evosuite.jar -generateSuite -Dsearch_budget=10 -Dclass= -Dstopping_condition=10 Dtarget_method=
# $EVOSUITE -class examples.SimpleMethods -projectCP build/classes/java/main/

# ---------- settings --------
curr_dir=$(pwd)
junit=$curr_dir/lib/junit-4.13.2.jar
evospex=$EVOSPEX_TEST_GEN
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

cd ${source_dir}

echo -e "${GREEN}Running evosuite for ${class}.${method_without_args}...${NC}"
$EVOSUITE -class ${class} -Dsearch_budget=10 -projectCP build/classes/java/main/ -Dtarget_method=${method_without_args}

echo '> Compiling tests'
cd evosuite-tests
mkdir bin
javac -cp ${junit}:${EVOSUITE_STANDALONE}:.:${subject_jar} ${class_path}/*.java -d ${source_dir}evosuite-tests/bin
cd ..

rm -rf ${output_dir}evosuite
mv evosuite-tests ${output_dir}/evosuite