import subprocess,os

def run_java_program(resource_path, file_name, output_file):
    # Java program arguments
    java_program_args = [
        'java', 
        '-jar',  # Add the classpath (use '.' if in the current directory)
        f'{base_path}\\ResourceLoader.jar',  # Java class with package name
        resource_path,
        file_name
    ]
    
    try:
        # Run the Java program
        process = subprocess.Popen(
            java_program_args, 
            stdout=subprocess.PIPE,  # Capture standard output
            stderr=subprocess.PIPE   # Capture standard error
        )
        
        # Communicate with the process
        stdout, stderr = process.communicate()
        
        # Decode the output
        output = stdout.decode().strip()
        errors = stderr.decode().strip()
        
        if process.returncode != 0:
            print(f"Java program exited with errors:\n{errors}")
            return
        
        # Parse the output to extract the counter
        counter = extract_counter(output)
        
        if counter>0:
            with open('load_error_logs_1.txt','+a') as logs:
                logs.write(f"{file_name} {counter} \n")
        # Save the counter value to the output file
        # with open(output_file, 'w') as file:
        #     file.write(f"Counter Value: {counter}\n")
        #     file.write("Complete Output:\n")
        #     file.write(output)
        
        # print(f"Output saved to {output_file}")
    
    except Exception as e:
        print(f"An error occurred: {e}")


def extract_counter(output):
    """
    Extracts the counter value from the Java program's output.
    Assumes the counter is printed as a number in each line prefixed with "counter".
    """
    for line in output.splitlines():
        if line.isdigit():  # Assuming counter lines are purely digits
            return int(line)
    return 0  # Default if no counter found


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

# Define the paths and filenames
resource_path = "C:\\Users\\mbedek\\Documents\\DevOps Dialect Editor\\DatasetTest"
file_name = "Test"
output_file = "pipeline_output.txt"
base_path = "C:\\Users\\mbedek\\Documents\\DevOps Dialect Editor\\DevOps-Dialect-Editor\\Preprocessing"

file_list = list_files(resource_path)
for file_name in file_list:
    # Run the Java program and save the output
    print(file_name)
    run_java_program(resource_path, file_name.split('.Pipeline')[0], output_file)