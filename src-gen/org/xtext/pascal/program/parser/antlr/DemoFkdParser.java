/*
 * generated by Xtext 2.26.0
 */
package org.xtext.pascal.program.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.pascal.program.parser.antlr.internal.InternalDemoFkdParser;
import org.xtext.pascal.program.services.DemoFkdGrammarAccess;

public class DemoFkdParser extends AbstractAntlrParser {

	@Inject
	private DemoFkdGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDemoFkdParser createParser(XtextTokenStream stream) {
		return new InternalDemoFkdParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "pascal";
	}

	public DemoFkdGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DemoFkdGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
