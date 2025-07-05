import pandas as pd
import sys

def calculate_percentage(file_path, tool_name):
    """Calcula el porcentaje de mutantes detectados para un archivo dado."""
    data = pd.read_csv(file_path)
    data[f'{tool_name}_percentage'] = (data['detected_mutants'] / data['mutants']) * 100
    return data[['subject', f'{tool_name}_percentage']].rename(columns={f'{tool_name}_percentage': tool_name})

def main():
    # Verificar que se pasaron argumentos
    if len(sys.argv) < 3:
        print("Uso: python3 percentaje_calculation.py <file1[:label1]> <file2[:label2]> ... <output_file>")
        sys.exit(1)

    # Extraer el archivo de salida
    output_file = sys.argv[-1]
    input_files = sys.argv[1:-1]

    # Crear un DataFrame vacío para almacenar los resultados
    result_df = pd.DataFrame()

    # Procesar cada archivo
    for arg in input_files:
        if ':' in arg:
            file_path, label = arg.split(':', 1)
        else:
            file_path, label = arg, file_path.split('/')[-1].split('.')[0]  # Usar el nombre del archivo como etiqueta

        # Calcular el porcentaje y combinar los resultados
        data = calculate_percentage(file_path, label)
        if result_df.empty:
            result_df = data
        else:
            result_df = pd.merge(result_df, data, on='subject', how='outer')

    # Guardar el resultado en un nuevo archivo CSV
    result_df.to_csv(output_file, index=False)
    print(f"Archivo generado: {output_file}")

if __name__ == "__main__":
    main()