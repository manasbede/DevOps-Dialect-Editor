import configparser,os
from yaml_utils import YAMLProcessor

def load_config(config_file):
    """
    Load configuration from a properties file.
    :param config_file: Path to the configuration file.
    :return: A dictionary with configuration parameters.
    """
    config = configparser.ConfigParser()
    config.read(config_file)

    return {
        'source_path': config.get('PATHS','source_path'),
        'destination_path': config.get('PATHS','destination_path'),
        'input_file': config.get('DEFAULT', 'input_file'),
        'output_file': config.get('DEFAULT', 'output_file'),
        'desired_order': config.get('PIPELINE_ORDER', 'desired_order',fallback='').split(',')
    }

def list_files(directory):
    """
    List all files in the specified directory.
    """
    try:
        files = os.listdir(directory)  # List all files and folders
        file_list = [f for f in files if os.path.isfile(os.path.join(directory, f))]  # Filter only files
        return file_list
    except FileNotFoundError:
        return f"Error: The directory '{directory}' does not exist."


def main_all():
    # Load configuration from source.properties
    config = load_config('source.properties')

    # Load file list
    file_list = list_files(config['source_path'])

    # Initialize YAMLProcessor with loaded configuration
    yaml_processor = YAMLProcessor(config)

    for file_name in file_list:
        # Process the YAML file
        try:
            yaml_processor.process_yaml(input_file=file_name, processed_file=file_name)
        except ValueError as e:
            with open('error_logs.txt','+a') as errorLog:
                errorLog.write(file_name + "\n")
            print(e)

def main():
    config = load_config('source.properties')
    yaml_processor = YAMLProcessor(config)
    try:
        yaml_processor.process_yaml()
    except ValueError as e:
        with open('error_logs.txt','+a') as errorLog:
            errorLog.write(config['input_file'] + "\n")
        print(e)

if __name__ == "__main__":
    main()
