/*
 * generated by Xtext 2.33.0
 */
package ca.mcgill.devops.pipeline.parser.antlr;

import ca.mcgill.devops.pipeline.parser.antlr.internal.InternalPipelineParser;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractIndentationTokenSource;

public class PipelineTokenSource extends AbstractIndentationTokenSource {

	public PipelineTokenSource(TokenSource delegate) {
		super(delegate);
	}

	@Override
	protected boolean shouldSplitTokenImpl(Token token) {
		// TODO Review assumption
		return token.getType() == InternalPipelineParser.RULE_WS;
	}

	@Override
	protected int getBeginTokenType() {
		// TODO Review assumption
		return InternalPipelineParser.RULE_BEGIN;
	}

	@Override
	protected int getEndTokenType() {
		// TODO Review assumption
		return InternalPipelineParser.RULE_END;
	}

}