/*
 * generated by Xtext 2.33.0
 */
package ca.mcgill.devops.pipeline.ui;

import ca.mcgill.devops.pipeline.ui.internal.PipelineActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PipelineExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(PipelineActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		PipelineActivator activator = PipelineActivator.getInstance();
		return activator != null ? activator.getInjector(PipelineActivator.CA_MCGILL_DEVOPS_PIPELINE_PIPELINE) : null;
	}

}