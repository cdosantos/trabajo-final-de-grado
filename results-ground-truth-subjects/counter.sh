#!/bin/bash

# Establecer el directorio principal de pruebas
directorio_principal="./subjects"

# Archivo CSV de salida
archivo_csv="resultado_aserciones.csv"

# Crear o truncar el archivo CSV
echo "Directorio,Cantidad de aserciones" > $archivo_csv

# Buscar directorios de pruebas en el directorio principal
directorios_pruebas=$(find $directorio_principal -type d -name "pruebas")

# Iterar sobre los directorios y contar las aserciones
for directorio in $directorios_pruebas; do
    # Utilizar grep para contar las líneas que contienen la palabra clave de aserción
    contador_lineas=$(grep -E -c '\bassert\b' $directorio/*.java)
    # Obtener solo el nombre del directorio sin la ruta
    nombre_directorio=$(basename $directorio)
    # Imprimir en el CSV
    echo "$nombre_directorio,$contador_lineas" >> $archivo_csv
done

echo "Proceso completado. Los resultados se han guardado en $archivo_csv."

