/*
* generated by Xtext
*/
package org.guicecon.modules.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GuiceModulesAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.tokens");
	}
}
