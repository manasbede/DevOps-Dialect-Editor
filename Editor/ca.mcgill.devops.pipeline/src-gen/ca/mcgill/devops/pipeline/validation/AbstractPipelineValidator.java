/*
 * generated by Xtext 2.33.0
 */
package ca.mcgill.devops.pipeline.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractPipelineValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(ca.mcgill.devops.pipeline.pipeline.PipelinePackage.eINSTANCE);
		return result;
	}
}
