/*
 * generated by Xtext 2.33.0
 */
package ca.mcgill.devops.pipeline.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class PipelineAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("ca/mcgill/devops/pipeline/parser/antlr/internal/InternalPipelineParser.tokens");
	}
}