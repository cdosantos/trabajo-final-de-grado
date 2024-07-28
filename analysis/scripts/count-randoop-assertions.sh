#!/bin/bash

package=$4
class=${package}.$2 # "examples.SimpleMethods" 
class_path=${package//[\.]/\/} # examples/SimpleMethods
method_without_args=${3%%\(*} # getMin
method_without_args=${method_without_args%%\\*} # getMin fix '\'

output_dir=$OUTPUT/subjects/$1
assertions=0
for filename in ${output_dir}randoop/$class_path/*.java
do
  test=`basename "$filename" .java`
  if [[ "$test" != 'RegressionTestDriver' ]] ; then
    # count assertions
    echo $filename
    counter=$(grep -E -c '\borg.junit.Assert\b' $filename)
    echo $counter
    # sum assertions
    assertions=$((counter + assertions))
  fi
done
archivo_csv="total-randoop-assertions.csv"
echo "$method_without_args,$assertions" >> $archivo_csv

