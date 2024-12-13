from ruamel.yaml import YAML
from ruamel.yaml.scalarstring import DoubleQuotedScalarString
from ruamel.yaml.comments import CommentedSeq, CommentedMap
import re

class YAMLProcessor:
    def __init__(self, config):
        """
        Initialize the YAMLProcessor with configuration.
        :param config: A dictionary containing configuration options.
        """
        self.reserved_keywords = config.get('reserved_keywords',[])
        self.desired_order = config.get('desired_order', [])
        self.input_file = config.get('input_file')
        self.processed_file = config.get('output_file')
        self.source_path = config.get('source_path')
        self.destination_path = config.get('destination_path')
        self.yaml = YAML()
        self.yaml.preserve_quotes = True 
    
    #   Display default configurations
    def print(self):
        print(self.input_file)
        print(self.processed_file)
        print(self.desired_order)

    @staticmethod
    def reorder_job_keys(job_details):
        """
        Reorder a single job's keys: All other parameters first, then 'needs', then 'steps'.
        """
        if not isinstance(job_details, dict):
            return job_details  # If the job details are not a dict, return as-is
        
        other_params = {k: v for k, v in job_details.items() if k not in ('needs', 'steps')}
        needs = {'needs': job_details['needs']} if 'needs' in job_details else {}
        dependsOn = {'dependsOn': job_details['dependsOn']} if 'dependsOn' in job_details else {}
        steps = {'steps': job_details['steps']} if 'steps' in job_details else {}
        
        # Combine all parts in the required order
        reordered_job = {**other_params, **needs, **dependsOn, **steps}
        return reordered_job

    def reorder_jobs_section(self, jobs):
        """
        Apply reordering logic to all jobs in the 'jobs' section.
        """
        reordered_jobs = {}
        for job_name, job_details in jobs.items():
            reordered_jobs[job_name] = self.reorder_job_keys(job_details)
        return reordered_jobs

    def reorder_yaml_keys(self, data):
        """
        Reorders the keys in a YAML dictionary according to a specified order.
        Keys not in the specified order are appended at the end.
        """
        ordered_data = {}
        for key in self.desired_order:
            if key in data:
                ordered_data[key] = data[key]
        # Add remaining keys not in the order list
        # for key in data:
        #     if key not in ordered_data:
        #         ordered_data[key] = data[key]

        remaining_keys = [k for k in data if k not in ordered_data and k not in {'on', 'jobs'}]
        for key in remaining_keys:
            ordered_data[key] = data[key]

        # Add the 'on' key if it exists
        if 'on' in data:
            ordered_data['on'] = data['on']

        # Add the 'jobs' key if it exists
        if 'jobs' in data:
            ordered_data['jobs'] = data['jobs']
        return ordered_data
    
    def format_multiline_value(self, value):
        """Enclose any multiline value in double quotes."""
        if isinstance(value, str) and "\n" in value:
            return DoubleQuotedScalarString(value)
        return value

    def quote_if_needed(self, parent_key, key, value):
        """
        Add double quotes to the value if:
        - The value contains `*` or `,`.
        - The key is 'name' or 'display name' and the value does NOT contain spaces.
        - Skip adding quotes if the value is already quoted.
        """
        if isinstance(value, str):
            # Define the allowed character set based on the grammar
            allowed_chars = r"[a-zA-Z0-9_/@\-\.\\&()]|[\|\$]"

            # Compile a regex pattern to match characters NOT in the allowed set
            patternSingleString = re.compile(f"[^{allowed_chars}]")
            complexPattern = r"\$\{\{.*?\}\}"
            # Skip if already quoted or matches pattern
            if value.startswith('"') and value.endswith('"'):
                return value

            if  re.match(complexPattern, value):
                # print("Inside Complex",value)
                complex_expression_regex = re.compile(
                    r"^"                        # Start of the string
                    r"(([a-zA-Z]([a-zA-Z-]*)?)?" # Optional prefix: letters followed by letters/hyphens
                    r"\$\{\{"                   # Mandatory opening `${{`
                    r"[^\}]*?"                  # Non-greedy match for content inside `${{...`
                    r"\}\})"                    # Mandatory closing `}}`
                    r"(-\$\{\{"                 # Allow hyphen followed by `${{...`
                    r"[^\}]*?"                  # Non-greedy match for content inside `${{...`
                    r"\}\})*$"                  # Mandatory closing `}}`, repeated zero or more times
                )
                if complex_expression_regex.match(value):
                    # print("Here",value)
                    return value
                else:
                    return DoubleQuotedScalarString(value)

            # Quote 'name' or 'display name' if specific conditions are met
            if key in {'name', 'display name'}:
                if " " not in value and parent_key is not None:  # Quote only if it doesn't contain spaces
                    return DoubleQuotedScalarString(value)
                elif re.search(complexPattern, value):
                    return DoubleQuotedScalarString(value)
                elif " " in value and parent_key is None:
                    return value
                elif " " in value:
                    return DoubleQuotedScalarString(value)

            # Quote if the value contains `*`, `,`, or spaces
            elif "*" in value or "," in value or " " in value:
                return DoubleQuotedScalarString(value)
            
            elif " " not in value:
                invalid_chars = patternSingleString.findall(value)
                if invalid_chars:
                    return DoubleQuotedScalarString(value)

        elif isinstance(value, list):  # For lists, check each item
            return [
                DoubleQuotedScalarString(item) if isinstance(item, str) and (" " in item or "*" in item or "," in item) else item
                for item in value
            ]
        return value
    
    def preserve_list_format(self, node):
        """
        Ensure lists remain in their source format (inline `[a, b, c]` or block `- item`).
        """
        if isinstance(node, CommentedSeq):
            if node.fa.flow_style() is not None:  # Preserve inline/block style if already set
                node.fa.set_flow_style(node.fa.flow_style())
        elif isinstance(node, CommentedMap):
            for key, value in node.items():
                self.preserve_list_format(value)
        elif isinstance(node, list):
            for item in node:
                self.preserve_list_format(item)

    def process_node(self, node, parent_key=None):
        """
        Recursively process the YAML node to apply quoting rules.
        Keep track of the parent key for context-sensitive rules.
        """
        if True in node and parent_key is None:
            keys = list(node.keys())
            index = keys.index(True)
            value = node.pop(True)
            node.insert(index, "on", value)

        if isinstance(node, dict):
            for key, val in node.items():
                node[key] = (
                    self.process_node(val, key)
                    if isinstance(val, (dict, list))
                    else self.format_multiline_value(self.quote_if_needed(parent_key, key, val))
                )
        elif isinstance(node, list):
            new_node = CommentedSeq(node)
            self.preserve_list_format(new_node)
            return [
                self.process_node(item, parent_key) if isinstance(item, (dict, list)) else self.quote_if_needed(parent_key, None, item)
                for item in new_node
            ]
        return node
    
    #    Remove Comments
    def remove_yaml_comments(self):
        with open(f"{self.destination_path}\\{self.processed_file}", 'r',encoding='utf-8') as file:
            lines = file.readlines()

        with open(f"{self.destination_path}\\{self.processed_file}", 'w',encoding='utf-8') as file:
            for line in lines:
                # Remove comments (lines starting with '#' or inline comments after '#')
                clean_line = re.sub(r'#.*', '', line)
                # Write only non-empty lines after stripping whitespace
                if clean_line.strip():
                    file.write(clean_line)

    #   Regex changes saver
    def save_yaml_with_preserved_list_format(self, data):
        """
        Save the modified YAML data back to a file while preserving source list format.
        """
        self.yaml.default_flow_style = None  # Allow explicit style settings
        self.yaml.sort_keys = False

        # Ensure list formats are preserved
        self.preserve_list_format(data)

        try:
            with open(f"{self.destination_path}\\{self.processed_file}", 'w', encoding='utf-8') as file:
                self.yaml.dump(data, file)
            print(f"YAML saved to {self.processed_file} with preserved list formats.")
        except Exception as e:
            print(f"Error saving YAML file: {e}")

    def reorder(self):
        self.yaml.preserve_quotes = True  # Preserve formatting and comments
        self.yaml.default_flow_style = None  # Ensure list formatting is preserved
        try:
            #   YAML Rearrange
            with open(f"{self.source_path}\\{self.input_file}", 'r', encoding='utf-8') as infile:
                data = self.yaml.load(infile)

            if isinstance(data, dict):  # Ensure the YAML is a dictionary at the top level
                if 'jobs' in data and isinstance(data['jobs'], dict):
                    # Reorder the jobs section
                    data['jobs'] = self.reorder_jobs_section(data['jobs'])

                # Reorder the top-level keys
                reordered_data = self.reorder_yaml_keys(data)
                
                with open(f"{self.destination_path}\\{self.processed_file}", 'w', encoding='utf-8') as outfile:
                    self.yaml.dump(reordered_data, outfile)
                print(f"Reordered YAML written to {self.processed_file}")
            else:
                raise ValueError("YAML content must be a dictionary at the top level.")
        except:
            print("Exception")



    def process_yaml(self, input_file=None, processed_file=None):
        """
        Process and reorder the YAML file content, preserving formatting.
        """
        self.yaml.preserve_quotes = True  # Preserve formatting and comments
        self.yaml.default_flow_style = None  # Ensure list formatting is preserved
        self.input_file = input_file or self.input_file
        self.processed_file = processed_file or self.processed_file

        try:
            #   YAML Rearrange
            with open(f"{self.source_path}\\{self.input_file}", 'r', encoding='utf-8') as infile:
                data = self.yaml.load(infile)

            if isinstance(data, dict):  # Ensure the YAML is a dictionary at the top level
                if 'jobs' in data and isinstance(data['jobs'], dict):
                    # Reorder the jobs section
                    data['jobs'] = self.reorder_jobs_section(data['jobs'])

                # Reorder the top-level keys
                reordered_data = self.reorder_yaml_keys(data)
                
                with open(f"{self.destination_path}\\{self.processed_file}", 'w', encoding='utf-8') as outfile:
                    self.yaml.dump(reordered_data, outfile)
                print(f"Reordered YAML written to {self.processed_file}")
            else:
                raise ValueError("YAML content must be a dictionary at the top level.")
            

            #   YAML Regex Handler
            with open(f"{self.destination_path}\\{self.processed_file}", "r", encoding='utf-8') as file:
                data = self.yaml.load(file)

            processed_data = self.process_node(data)
            self.save_yaml_with_preserved_list_format(processed_data)


            #   YAML Comment Handler
            self.remove_yaml_comments()
        except:
            with open('error_logs.txt','+a') as errorLog:
                errorLog.write(self.input_file + "\n")