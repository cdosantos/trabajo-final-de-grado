#!/bin/bash

# ---------- args ------------
# ./test-gen-randoop.sh relative_path class method package
# example: ./test-gen-randoop.sh SimpleMethods_getMin/ SimpleMethods getMin\(int,int\) examples

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

tests_src=$evospex/tests/
tests_bin=$evospex/tests/bin/

rm -rf ${output_dir}randoop
mkdir -p ${output_dir}randoop
cd ${source_dir}

./gradlew -q -Dskip.tests jar
cd ${evospex}
./gen-randoop-pos-neg-objects.sh -cp=${subject_jar} -c=${class} -m=${method} -s=3
cd tests
mkdir bin

timeout=20000
for test in ${tests_src}${class_path}/*.java
do
	echo '> Adding timeout '$timeout' millis to tests'
#	(sed -i '/^package */a \import java.util.concurrent.TimeUnit;\nimport org.junit.Rule;\nimport org.junit.rules.Timeout;' $test)
#	(sed -i '/^public class */a \\t@Rule\n\tpublic Timeout globalTimeout = Timeout.millis('$timeout');' $test)
done

javac -cp ${junit}:${tests_src}:${subject_jar} ${class_path}/*.java -d ${tests_bin}

mkdir -p ${output_dir}/randoop/${class_path}
cp -r ${tests_src}${class_path}/* ${output_dir}/randoop/${class_path}
mkdir -p ${output_dir}/randoop/bin
cp -r ${tests_bin}* ${output_dir}/randoop/bin
