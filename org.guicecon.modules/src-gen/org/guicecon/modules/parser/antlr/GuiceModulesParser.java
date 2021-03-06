/*
* generated by Xtext
*/
package org.guicecon.modules.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.guicecon.modules.services.GuiceModulesGrammarAccess;

public class GuiceModulesParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private GuiceModulesGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.guicecon.modules.parser.antlr.internal.InternalGuiceModulesParser createParser(XtextTokenStream stream) {
		return new org.guicecon.modules.parser.antlr.internal.InternalGuiceModulesParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Module";
	}
	
	public GuiceModulesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(GuiceModulesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
