package ca.mcgill.devops.pipeline.resourceloader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import ca.mcgill.devops.pipeline.PipelineStandaloneSetup;
import ca.mcgill.devops.pipeline.pipeline.Job;
import ca.mcgill.devops.pipeline.pipeline.ParameterValue;
import ca.mcgill.devops.pipeline.pipeline.Pipeline;
import ca.mcgill.devops.pipeline.pipeline.PipelineKeyword;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Injector;

public class ValidationScript_Manas_pattern1 {

    /**
     * Matches a single job against the required pattern.
     */
    private static boolean matchesPattern(Job job) {
    	try {
            // Extract job name
            String jobName = job.getName();
            if (jobName == null || jobName.isEmpty()) {
                return false; // Job name is mandatory
            }

            // Extract job parameters
            boolean hasRunsOn = false;
            boolean hasIf = false;    
            boolean name = false;
            boolean needs = false;
            String dependKW = job.getDependKW(); // Match "needs"

            EList<ParameterValue> jobParameters = job.getJobParameterValues();
            //jobParameters will never be null, unnecessary condition
            if (jobParameters == null) {
            	System.out.println("Job parameters is null for this file");
            }
            if (jobParameters != null) {
                for (ParameterValue param : jobParameters) {
                	PipelineKeyword keywordObj = param.getName();
                    //String keyword = (keywordObj instanceof Enum) ? ((Enum<?>) keywordObj).name() : keywordObj.toString();
                    //String value = param.getValue();

                    //if ("PPL_KW_RUNS_ON".equals(keyword)) {
                    if (keywordObj.equals(PipelineKeyword.PPL_KW_RUNS_ON)) {
                    	hasRunsOn = true;
                    }
                    if (keywordObj.equals(PipelineKeyword.PPL_KW_IF)) {
                    	hasIf = true;
                    }
                    if (keywordObj.equals(PipelineKeyword.PPL_KW_NAME)) {
                    	name = true;
                    }
                }
            }

            // Validate required fields
            //boolean hasRunsOn = runsOn != null && !runsOn.isEmpty();
            //boolean hasIf = ifkw != null && !ifkw.isEmpty();
            boolean hasDependKW = dependKW != null && !dependKW.isEmpty();

            return hasRunsOn && hasIf && hasDependKW && name;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Load and parse a single pipeline file with validation.
     */
    public static Pipeline resourceLoad(String resourcePath, String fileName) {
        try {
            Injector injector = new PipelineStandaloneSetup().createInjectorAndDoEMFRegistration();
            XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
            resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
            //System.out.println("Pipeline Validator");

            // Construct file URIs (fileName already includes .Pipeline extension)
            String inputURI = "file://" + resourcePath + "/" + fileName;
            //System.out.println("Resource URI: " + inputURI + "\n\n");

            URI uri = URI.createURI(inputURI);
            Resource xtextResource = resourceSet.getResource(uri, true);

            IResourceValidator resourceValidator = injector.getInstance(IResourceValidator.class);
            Iterable<Issue> issues = resourceValidator.validate(xtextResource, CheckMode.ALL, CancelIndicator.NullImpl);
            // Print validation issues
            int issueCounter = printValidationIssues(issues);
            EcoreUtil.resolveAll(xtextResource);

            if (issueCounter == 0) {
                return (Pipeline) xtextResource.getContents().get(0);
            } else {
                //System.out.println("File skipped due to validation issues: " + fileName);
                return null;
            }
        } catch (Exception e) {
            System.err.println("Error reading or parsing file: " + fileName + " - " + e.getMessage());
            return null;
        }
    }

    private static int printValidationIssues(Iterable<Issue> issues) {
        int counter = 0;
        for (Issue issue : issues) {
            counter++;
            /*
            System.out.println("Issue #" + counter);
            System.out.println("Severity: " + issue.getSeverity());
            System.out.println("Message: " + issue.getMessage());
            System.out.println("Location: " + issue.getUriToProblem());
            System.out.println("--------------");
            */
        }
        /*if (counter == 0) {
            System.out.println("No issues found while parsing pipeline.");
        }*/
        return counter;
    }
    
    
     //Load and parse a single pipeline file with validation.
    /*
     
    public static void main(String[] args) {
        

        // Dataset folder
        String datasetPath = "/Users/ankita/Desktop/DatasetTest";
        String fileName = "cssllc_github-workflows_contents_.github_workflows_wpengine-deploy-themes.Pipeline";
        //String fileName = "conmurphy_healthcare-calendar_contents_.github_workflows_build_push_docker_and_run_terraform.Pipeline";
        //String fileName ="DecentM_concourse-ts_contents_.github_workflows_publish.Pipeline";

        System.out.println("Processing file: " + fileName);
        
        boolean indic = false;
        Pipeline pipeline = resourceLoad(datasetPath, fileName);

        if (pipeline == null || pipeline.getJobs() == null) {
            System.out.println("Failed to parse or read file: " + fileName);
            return;
        }
        
        for (Job job : pipeline.getJobs()) {
           

            if (matchesPattern(job)) {
            	
            	indic= true;
                //break;
            }
            
        }
        if (indic==false){
        	System.out.println("Not successful " + fileName);
        	
        }
        else {
        	System.out.println("successful " + fileName);
        }
        

        if (matchesPattern(pipeline)) {
            System.out.println("File " + fileName + " matches the pattern.");
        } else {
            System.out.println("File " + fileName + " does NOT match the pattern.");
        }
    }
*/

    
    
    public static void main(String[] args) {
        // Dataset folder
        String datasetPath = "C:\\Users\\MANAS\\Documents\\Thesis Basics\\DataTest2";        
             
        //String patternFilePath = "/Users/ankita/Desktop/Phase 1/pattern1.txt";
        String nonMatchingFilePath = "C:\\Users\\MANAS\\Documents\\Thesis Basics\\Experiment_24_Jan_25\\DatasetPreprocessed\\7_non_matching_files_all_files.txt";
        String invalidFilenamePath = "C:\\Users\\MANAS\\Documents\\Thesis Basics\\Experiment_24_Jan_25\\DatasetPreprocessed\\7_invalid_files_all_files.txt";
        String matchingFileNamesPath =  "C:\\Users\\MANAS\\Documents\\Thesis Basics\\Experiment_24_Jan_25\\DatasetPreprocessed\\7_Patternmatching_files_all_files.txt"; 
        String validFilenamePath = "C:\\Users\\MANAS\\Documents\\Thesis Basics\\Experiment_24_Jan_25\\DatasetPreprocessed\\7_valid_files_all_files.txt";

        // List all files in the directory
        File datasetFolder = new File(datasetPath);
        File[] allFiles = datasetFolder.listFiles();
        if (allFiles == null || allFiles.length == 0) {
            System.out.println("No files found in the dataset.");
            return;
        }

        // Count .Pipeline files
        List<File> pipelineFiles = new ArrayList<>();
        for (File file : allFiles) {
            if (file.getName().endsWith(".Pipeline")) {
                pipelineFiles.add(file);
            } else {
                System.out.println("File skipped (does not end with .Pipeline): " + file.getName());
            }
        }

        if (pipelineFiles.isEmpty()) {
            System.out.println("No .Pipeline files found in the dataset.");
            return;
        }

        // Set file limit for debugging (default to all files)
        int fileLimit = pipelineFiles.size();
        if (args.length > 0) {
            try {
                fileLimit = Math.min(Integer.parseInt(args[0]), pipelineFiles.size());
            } catch (NumberFormatException e) {
                System.err.println("Invalid file limit provided. Processing all files.");
            }
        }

        // Metrics
        int totalFiles = 0;
        int validatedFiles = 0;
        int matchingFiles = 0;
        List<String> matchingFileNames = new ArrayList<>();
        List<String> nonMatchingFileNames = new ArrayList<>();
        List<String> invalidfilename = new ArrayList<>();
        List<String> validfilename = new ArrayList<>();

        System.out.println("Processing up to " + fileLimit + " pipeline files in the dataset");

        for (int i = 0; i < fileLimit; i++) {
            File file = pipelineFiles.get(i);
            totalFiles++;
            String fileName = file.getName();
            
//            System.out.println(datasetPath+fileName);
            System.out.println(i);
            Pipeline pipeline = resourceLoad(datasetPath, fileName);

            if (pipeline == null || pipeline.getJobs() == null) {
                //System.out.println("Failed to parse or read file: " + fileName);
            	invalidfilename.add(fileName);
                continue;
            }
            else {
            	validfilename.add(fileName);
            }

            validatedFiles++; // Increment for successfully validated files

            boolean patternFound = false;

            for (Job job : pipeline.getJobs()) {
                if (job == null) {
                    continue;
                }

                if (matchesPattern(job)) {
                    patternFound = true;
                    break;
                }
            }

            if (patternFound) {
                matchingFiles++;
                matchingFileNames.add(fileName);
            } else {
                nonMatchingFileNames.add(fileName);
            }
        }

        // Output metrics
        System.out.println("\n=== Validation Results ===");
        System.out.println("Total files in the directory: " + allFiles.length);
        System.out.println("Total .Pipeline files processed: " + totalFiles);
        System.out.println("Successfully validated files: " + validatedFiles);
        System.out.println("Files matching pattern: " + matchingFiles);
        double percentageMatching = validatedFiles > 0 ? ((double) matchingFiles / validatedFiles) * 100 : 0;
        System.out.println("Percentage matching (matchingFiles / validatedFiles): " + percentageMatching + "%");

        try {
            Files.write(Paths.get(matchingFileNamesPath), matchingFileNames);
            System.out.println("Pattern match found for filenames saved to " + matchingFileNamesPath);
        } catch (IOException e) {
            System.err.println("Error saving pattern-matching file names: " + e.getMessage());
        }
        
        try {
            Files.write(Paths.get(nonMatchingFilePath), nonMatchingFileNames);
            System.out.println("Non-matching file names saved to: " + nonMatchingFilePath);
        } catch (IOException e) {
            System.err.println("Error saving non-matching file names: " + e.getMessage());
        }
        
        try {
            Files.write(Paths.get(invalidFilenamePath), invalidfilename);
            System.out.println("Files failed due to validation issue saved to: " + invalidFilenamePath);
        } catch (IOException e) {
            System.err.println("Error saving invalid file names: " + e.getMessage());
        }
        
        try {
            Files.write(Paths.get(validFilenamePath), validfilename);
            System.out.println("Files parsed saved to: " + validFilenamePath);
        } catch (IOException e) {
            System.err.println("Error saving invalid file names: " + e.getMessage());
        }
    
    
    }
}
