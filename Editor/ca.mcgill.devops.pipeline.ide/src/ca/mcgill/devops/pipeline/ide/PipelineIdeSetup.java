/*
 * generated by Xtext 2.33.0
 */
package ca.mcgill.devops.pipeline.ide;

import ca.mcgill.devops.pipeline.PipelineRuntimeModule;
import ca.mcgill.devops.pipeline.PipelineStandaloneSetup;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class PipelineIdeSetup extends PipelineStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new PipelineRuntimeModule(), new PipelineIdeModule()));
	}
	
}