package ca.mcgill.devops.pipeline.resourceloader;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.validation.ResourceValidatorImpl;
import com.google.inject.Injector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import ca.mcgill.devops.pipeline.PipelineStandaloneSetup;
import ca.mcgill.devops.pipeline.pipeline.Job;
import ca.mcgill.devops.pipeline.pipeline.ParameterValue;
import ca.mcgill.devops.pipeline.pipeline.Pipeline;

public class loader {
	public static Pipeline resourceLoad(String resourcePath, String fileName) {
		try {
			Injector injector = new PipelineStandaloneSetup().createInjectorAndDoEMFRegistration();
		    XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		    resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		    System.out.println("Pipeline Validator");
	
		    // replace absoluteTargetFolderPath with the path to your folder
		    String inputURI = "file:///" + resourcePath +"\\" + fileName +".Pipeline";
		    String outputURI = "file:///" + resourcePath +"\\" + fileName + ".xmi";
		    System.out.println("Resource URI: "+ inputURI +"\n\n");
		    
		    URI uri = URI.createURI(inputURI);
		    Resource xtextResource = resourceSet.getResource(uri, true);
	
		    IResourceValidator resourceValidator = injector.getInstance(IResourceValidator.class);
		    Iterable<Issue> issues = resourceValidator.validate(xtextResource, CheckMode.ALL, CancelIndicator.NullImpl);
		    // Print the issues
	        int issue_counter = printValidationIssues(issues);
		    EcoreUtil.resolveAll(xtextResource);
		    if (issue_counter == 0){
		    	return (Pipeline)xtextResource.getContents().get(0);
		    }
		    else {
		    	return null;
		    }
		}
		catch(Exception e) {
			return null;
		}
	    
//	    Resource xmiResource = resourceSet.createResource(URI.createURI(outputURI));
//	    xmiResource.getContents().add(xtextResource.getContents().get(0));
//	    try {
//	        xmiResource.save(null);
//	        return (Pipeline)xmiResource.getContents().get(0);
//	    } catch (IOException e) {
//	        e.printStackTrace();
//	    }
	}
	
	private static int printValidationIssues(Iterable<Issue> issues) {
		int counter = 0;
        for (Issue issue : issues) {
        	counter++;
        	System.out.println(counter);
            System.out.println("Severity: " + issue.getSeverity());
            System.out.println("Message: " + issue.getMessage());
            System.out.println("Location: " + issue.getUriToProblem());
            System.out.println("--------------");
        }
        if (counter == 0) {
        	System.out.println("No issue found while parsing pipeline");
        }
        return counter;
    }
	
	public static void main(String[] args) {
//        if (args.length != 2) {
//            System.out.println("Usage: java -jar loader.jar <filePath> <fileName>");
//            return;
//        }
//
//        String resourcePath = args[0];
//        String fileName = args[1];

        System.out.println("Starting pipeline validation and processing...");
        String resourcePath = "C:\\Users\\MANAS\\Documents\\Thesis Basics\\Experiment_24_Jan_25\\DatasetPreprocessed\\DatasetPP";
        String fileName = "021fe4e14d5826cc95e4ad5d8c61e6efd81c7aaa";
        Pipeline pipeline = resourceLoad(resourcePath, fileName);

        if (pipeline != null) {
            System.out.println("Pipeline processed successfully.");
        } else {
            System.out.println("Failed to process pipeline.");
        }
    }

}
