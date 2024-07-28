#!/bin/bash

package=$4
class=${package}.$2 # "examples.SimpleMethods" 
class_path=${package//[\.]/\/} # examples/SimpleMethods
method_without_args=${3%%\(*} # getMin
method_without_args=${method_without_args%%\\*} # getMin fix '\'

output_dir=$OUTPUT/subjects/$1
assertions=0
for filename in ${output_dir}evosuite/$class_path/*.java
do
  if [[ $filename =~ .*ESTest_scaffolding\.java$ ]] ; then
    continue
  fi
  counter=$(grep -E -c '\bassert' "$filename")
  assertions=$((counter + assertions))
done
archivo_csv="total-evosuite-assertions.csv"
echo "$method_without_args,$assertions" >> $archivo_csv

