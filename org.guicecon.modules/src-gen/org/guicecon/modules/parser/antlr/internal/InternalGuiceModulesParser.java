package org.guicecon.modules.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.guicecon.modules.services.GuiceModulesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGuiceModulesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'module'", "'mixin'", "','", "'{'", "'}'", "'override'", "'bind'", "'to'", "'toInstance'", "'@'", "'import'", "'.*'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'=>'", "'?:'", "'<=>'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "'('", "')'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int RULE_HEX=6;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=7;
    public static final int RULE_DECIMAL=8;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__83=83;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__84=84;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalGuiceModulesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGuiceModulesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGuiceModulesParser.tokenNames; }
    public String getGrammarFileName() { return "../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g"; }



     	private GuiceModulesGrammarAccess grammarAccess;
     	
        public InternalGuiceModulesParser(TokenStream input, GuiceModulesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Module";	
       	}
       	
       	@Override
       	protected GuiceModulesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModule"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:67:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:68:2: (iv_ruleModule= ruleModule EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:69:2: iv_ruleModule= ruleModule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuleRule()); 
            }
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule75);
            iv_ruleModule=ruleModule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:76:1: ruleModule returns [EObject current=null] : (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* otherlv_3= 'module' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'mixin' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_9= '{' ( (lv_bindings_10_0= ruleBinding ) )* otherlv_11= '}' ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_packageName_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_bindings_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:79:28: ( (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* otherlv_3= 'module' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'mixin' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_9= '{' ( (lv_bindings_10_0= ruleBinding ) )* otherlv_11= '}' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:80:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* otherlv_3= 'module' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'mixin' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_9= '{' ( (lv_bindings_10_0= ruleBinding ) )* otherlv_11= '}' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:80:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* otherlv_3= 'module' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'mixin' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_9= '{' ( (lv_bindings_10_0= ruleBinding ) )* otherlv_11= '}' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:80:3: otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* otherlv_3= 'module' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'mixin' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_9= '{' ( (lv_bindings_10_0= ruleBinding ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleModule122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getPackageKeyword_0());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:84:1: ( (lv_packageName_1_0= ruleQualifiedName ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:85:1: (lv_packageName_1_0= ruleQualifiedName )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:85:1: (lv_packageName_1_0= ruleQualifiedName )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:86:3: lv_packageName_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModuleAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleModule143);
            lv_packageName_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModuleRule());
              	        }
                     		set(
                     			current, 
                     			"packageName",
                      		lv_packageName_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:102:2: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:103:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:103:1: (lv_imports_2_0= ruleImport )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:104:3: lv_imports_2_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleModule164);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_2_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleModule177); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getModuleAccess().getModuleKeyword_3());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:124:1: ( (lv_name_4_0= RULE_ID ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:125:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:125:1: (lv_name_4_0= RULE_ID )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:126:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModule194); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getModuleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:142:2: (otherlv_5= 'mixin' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:142:4: otherlv_5= 'mixin' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleModule212); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getModuleAccess().getMixinKeyword_5_0());
                          
                    }
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:146:1: ( ( ruleQualifiedName ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:147:1: ( ruleQualifiedName )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:147:1: ( ruleQualifiedName )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:148:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getModuleRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModuleAccess().getMixinsModuleCrossReference_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleModule235);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:161:2: (otherlv_7= ',' ( ( ruleQualifiedName ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==16) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:161:4: otherlv_7= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleModule248); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getModuleAccess().getCommaKeyword_5_2_0());
                    	          
                    	    }
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:165:1: ( ( ruleQualifiedName ) )
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:166:1: ( ruleQualifiedName )
                    	    {
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:166:1: ( ruleQualifiedName )
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:167:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getModuleRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModuleAccess().getMixinsModuleCrossReference_5_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleModule271);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleModule287); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_6());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:184:1: ( (lv_bindings_10_0= ruleBinding ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=19 && LA4_0<=20)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:185:1: (lv_bindings_10_0= ruleBinding )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:185:1: (lv_bindings_10_0= ruleBinding )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:186:3: lv_bindings_10_0= ruleBinding
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModuleAccess().getBindingsBindingParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBinding_in_ruleModule308);
            	    lv_bindings_10_0=ruleBinding();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"bindings",
            	              		lv_bindings_10_0, 
            	              		"Binding");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleModule321); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleBinding"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:214:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:215:2: (iv_ruleBinding= ruleBinding EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:216:2: iv_ruleBinding= ruleBinding EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingRule()); 
            }
            pushFollow(FOLLOW_ruleBinding_in_entryRuleBinding357);
            iv_ruleBinding=ruleBinding();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinding; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinding367); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:223:1: ruleBinding returns [EObject current=null] : ( ( (lv_override_0_0= 'override' ) )? otherlv_1= 'bind' ( (lv_from_2_0= ruleKey ) ) ( (otherlv_3= 'to' ( (lv_to_4_0= ruleKey ) ) ) | (otherlv_5= 'toInstance' ( (lv_toInstance_6_0= ruleXExpression ) ) ) )? ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token lv_override_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_from_2_0 = null;

        EObject lv_to_4_0 = null;

        EObject lv_toInstance_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:226:28: ( ( ( (lv_override_0_0= 'override' ) )? otherlv_1= 'bind' ( (lv_from_2_0= ruleKey ) ) ( (otherlv_3= 'to' ( (lv_to_4_0= ruleKey ) ) ) | (otherlv_5= 'toInstance' ( (lv_toInstance_6_0= ruleXExpression ) ) ) )? ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:227:1: ( ( (lv_override_0_0= 'override' ) )? otherlv_1= 'bind' ( (lv_from_2_0= ruleKey ) ) ( (otherlv_3= 'to' ( (lv_to_4_0= ruleKey ) ) ) | (otherlv_5= 'toInstance' ( (lv_toInstance_6_0= ruleXExpression ) ) ) )? )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:227:1: ( ( (lv_override_0_0= 'override' ) )? otherlv_1= 'bind' ( (lv_from_2_0= ruleKey ) ) ( (otherlv_3= 'to' ( (lv_to_4_0= ruleKey ) ) ) | (otherlv_5= 'toInstance' ( (lv_toInstance_6_0= ruleXExpression ) ) ) )? )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:227:2: ( (lv_override_0_0= 'override' ) )? otherlv_1= 'bind' ( (lv_from_2_0= ruleKey ) ) ( (otherlv_3= 'to' ( (lv_to_4_0= ruleKey ) ) ) | (otherlv_5= 'toInstance' ( (lv_toInstance_6_0= ruleXExpression ) ) ) )?
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:227:2: ( (lv_override_0_0= 'override' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:228:1: (lv_override_0_0= 'override' )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:228:1: (lv_override_0_0= 'override' )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:229:3: lv_override_0_0= 'override'
                    {
                    lv_override_0_0=(Token)match(input,19,FOLLOW_19_in_ruleBinding410); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_override_0_0, grammarAccess.getBindingAccess().getOverrideOverrideKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingRule());
                      	        }
                             		setWithLastConsumed(current, "override", true, "override");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleBinding436); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getBindKeyword_1());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:246:1: ( (lv_from_2_0= ruleKey ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:247:1: (lv_from_2_0= ruleKey )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:247:1: (lv_from_2_0= ruleKey )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:248:3: lv_from_2_0= ruleKey
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBindingAccess().getFromKeyParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleKey_in_ruleBinding457);
            lv_from_2_0=ruleKey();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBindingRule());
              	        }
                     		set(
                     			current, 
                     			"from",
                      		lv_from_2_0, 
                      		"Key");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:264:2: ( (otherlv_3= 'to' ( (lv_to_4_0= ruleKey ) ) ) | (otherlv_5= 'toInstance' ( (lv_toInstance_6_0= ruleXExpression ) ) ) )?
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==22) ) {
                alt6=2;
            }
            switch (alt6) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:264:3: (otherlv_3= 'to' ( (lv_to_4_0= ruleKey ) ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:264:3: (otherlv_3= 'to' ( (lv_to_4_0= ruleKey ) ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:264:5: otherlv_3= 'to' ( (lv_to_4_0= ruleKey ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleBinding471); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBindingAccess().getToKeyword_3_0_0());
                          
                    }
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:268:1: ( (lv_to_4_0= ruleKey ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:269:1: (lv_to_4_0= ruleKey )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:269:1: (lv_to_4_0= ruleKey )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:270:3: lv_to_4_0= ruleKey
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBindingAccess().getToKeyParserRuleCall_3_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleKey_in_ruleBinding492);
                    lv_to_4_0=ruleKey();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBindingRule());
                      	        }
                             		set(
                             			current, 
                             			"to",
                              		lv_to_4_0, 
                              		"Key");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:287:6: (otherlv_5= 'toInstance' ( (lv_toInstance_6_0= ruleXExpression ) ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:287:6: (otherlv_5= 'toInstance' ( (lv_toInstance_6_0= ruleXExpression ) ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:287:8: otherlv_5= 'toInstance' ( (lv_toInstance_6_0= ruleXExpression ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleBinding512); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getBindingAccess().getToInstanceKeyword_3_1_0());
                          
                    }
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:291:1: ( (lv_toInstance_6_0= ruleXExpression ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:292:1: (lv_toInstance_6_0= ruleXExpression )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:292:1: (lv_toInstance_6_0= ruleXExpression )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:293:3: lv_toInstance_6_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBindingAccess().getToInstanceXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleBinding533);
                    lv_toInstance_6_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBindingRule());
                      	        }
                             		set(
                             			current, 
                             			"toInstance",
                              		lv_toInstance_6_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleKey"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:317:1: entryRuleKey returns [EObject current=null] : iv_ruleKey= ruleKey EOF ;
    public final EObject entryRuleKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKey = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:318:2: (iv_ruleKey= ruleKey EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:319:2: iv_ruleKey= ruleKey EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyRule()); 
            }
            pushFollow(FOLLOW_ruleKey_in_entryRuleKey572);
            iv_ruleKey=ruleKey();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKey; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKey582); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKey"


    // $ANTLR start "ruleKey"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:326:1: ruleKey returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotationRef ) )? ( (lv_type_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleKey() throws RecognitionException {
        EObject current = null;

        EObject lv_annotation_0_0 = null;

        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:329:28: ( ( ( (lv_annotation_0_0= ruleAnnotationRef ) )? ( (lv_type_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:330:1: ( ( (lv_annotation_0_0= ruleAnnotationRef ) )? ( (lv_type_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:330:1: ( ( (lv_annotation_0_0= ruleAnnotationRef ) )? ( (lv_type_1_0= ruleJvmTypeReference ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:330:2: ( (lv_annotation_0_0= ruleAnnotationRef ) )? ( (lv_type_1_0= ruleJvmTypeReference ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:330:2: ( (lv_annotation_0_0= ruleAnnotationRef ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:331:1: (lv_annotation_0_0= ruleAnnotationRef )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:331:1: (lv_annotation_0_0= ruleAnnotationRef )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:332:3: lv_annotation_0_0= ruleAnnotationRef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getKeyAccess().getAnnotationAnnotationRefParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationRef_in_ruleKey628);
                    lv_annotation_0_0=ruleAnnotationRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getKeyRule());
                      	        }
                             		set(
                             			current, 
                             			"annotation",
                              		lv_annotation_0_0, 
                              		"AnnotationRef");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:348:3: ( (lv_type_1_0= ruleJvmTypeReference ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:349:1: (lv_type_1_0= ruleJvmTypeReference )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:349:1: (lv_type_1_0= ruleJvmTypeReference )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:350:3: lv_type_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyAccess().getTypeJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleKey650);
            lv_type_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRuleAnnotationRef"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:374:1: entryRuleAnnotationRef returns [EObject current=null] : iv_ruleAnnotationRef= ruleAnnotationRef EOF ;
    public final EObject entryRuleAnnotationRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationRef = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:375:2: (iv_ruleAnnotationRef= ruleAnnotationRef EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:376:2: iv_ruleAnnotationRef= ruleAnnotationRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRefRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationRef_in_entryRuleAnnotationRef686);
            iv_ruleAnnotationRef=ruleAnnotationRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationRef696); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationRef"


    // $ANTLR start "ruleAnnotationRef"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:383:1: ruleAnnotationRef returns [EObject current=null] : (otherlv_0= '@' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleAnnotationRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:386:28: ( (otherlv_0= '@' ( ( ruleQualifiedName ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:387:1: (otherlv_0= '@' ( ( ruleQualifiedName ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:387:1: (otherlv_0= '@' ( ( ruleQualifiedName ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:387:3: otherlv_0= '@' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleAnnotationRef733); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationRefAccess().getCommercialAtKeyword_0());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:391:1: ( ( ruleQualifiedName ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:392:1: ( ruleQualifiedName )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:392:1: ( ruleQualifiedName )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:393:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAnnotationRefRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationRefAccess().getAnnotationJvmAnnotationTypeCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAnnotationRef756);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationRef"


    // $ANTLR start "entryRuleImport"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:414:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:415:2: (iv_ruleImport= ruleImport EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:416:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport792);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport802); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:423:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:426:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:427:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:427:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:427:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleImport839); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:431:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:432:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:432:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:433:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport860);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildCard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:457:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:458:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:459:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard897);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard908); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:466:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:469:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:470:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:470:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:471:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard955);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:481:1: (kw= '.*' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:482:2: kw= '.*'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleQualifiedNameWithWildCard974); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRuleXExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:495:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:496:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:497:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1016);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1026); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:504:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:507:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:509:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1072);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:525:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:526:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:527:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1106);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1116); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:534:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:537:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:538:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:538:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==EOF||(LA10_1>=RULE_ID && LA10_1<=RULE_DECIMAL)||(LA10_1>=16 && LA10_1<=20)||(LA10_1>=27 && LA10_1<=55)||(LA10_1>=57 && LA10_1<=81)) ) {
                    alt10=2;
                }
                else if ( (LA10_1==26) ) {
                    alt10=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_DECIMAL)||LA10_0==17||LA10_0==36||(LA10_0>=42 && LA10_0<=43)||LA10_0==48||LA10_0==53||LA10_0==55||LA10_0==59||LA10_0==61||(LA10_0>=65 && LA10_0<=67)||LA10_0==70||(LA10_0>=72 && LA10_0<=79)) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:538:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:538:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:538:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:538:3: ()
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:539:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:544:2: ( ( ruleValidID ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:545:1: ( ruleValidID )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:545:1: ( ruleValidID )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:546:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment1174);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1190);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:567:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:568:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:568:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:569:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1210);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:586:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:586:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:587:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1240);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:595:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==27) ) {
                        int LA9_1 = input.LA(2);

                        if ( (synpred1_InternalGuiceModules()) ) {
                            alt9=1;
                        }
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:595:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:595:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:595:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:600:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:600:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:600:7: ()
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:601:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:606:2: ( ( ruleOpMultiAssign ) )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:607:1: ( ruleOpMultiAssign )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:607:1: ( ruleOpMultiAssign )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:608:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1293);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:621:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:622:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:622:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:623:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1316);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:647:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:648:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:649:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1356);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1367); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:656:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:659:28: (kw= '=' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:661:2: kw= '='
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpSingleAssign1404); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:674:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:675:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:676:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1444);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1455); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:683:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:686:28: (kw= '+=' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:688:2: kw= '+='
            {
            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpMultiAssign1492); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:701:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:702:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:703:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1531);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1541); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:710:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:713:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:714:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:714:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:715:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1588);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:723:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    int LA11_2 = input.LA(2);

                    if ( (synpred2_InternalGuiceModules()) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:723:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:723:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:723:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:728:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:728:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:728:7: ()
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:729:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:734:2: ( ( ruleOpOr ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:735:1: ( ruleOpOr )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:735:1: ( ruleOpOr )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:736:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1641);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:749:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:750:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:750:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:751:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1664);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:775:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:776:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:777:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1703);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1714); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:784:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:787:28: (kw= '||' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:789:2: kw= '||'
            {
            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOr1751); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:802:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:803:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:804:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1790);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1800); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:811:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:814:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:815:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:815:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:816:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1847);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:824:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred3_InternalGuiceModules()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:824:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:824:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:824:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:829:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:829:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:829:7: ()
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:830:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:835:2: ( ( ruleOpAnd ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:836:1: ( ruleOpAnd )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:836:1: ( ruleOpAnd )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:837:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1900);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:850:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:851:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:851:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:852:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1923);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:876:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:877:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:878:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1962);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1973); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:885:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:888:28: (kw= '&&' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:890:2: kw= '&&'
            {
            kw=(Token)match(input,29,FOLLOW_29_in_ruleOpAnd2010); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:903:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:904:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:905:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2049);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2059); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:912:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:915:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:916:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:916:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:917:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2106);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:925:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==30) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred4_InternalGuiceModules()) ) {
                        alt13=1;
                    }


                }
                else if ( (LA13_0==31) ) {
                    int LA13_3 = input.LA(2);

                    if ( (synpred4_InternalGuiceModules()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:925:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:925:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:925:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:930:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:930:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:930:7: ()
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:931:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:936:2: ( ( ruleOpEquality ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:937:1: ( ruleOpEquality )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:937:1: ( ruleOpEquality )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:938:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2159);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:951:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:952:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:952:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:953:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2182);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:977:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:978:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:979:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2221);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2232); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:986:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:989:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:990:1: (kw= '==' | kw= '!=' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:990:1: (kw= '==' | kw= '!=' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            else if ( (LA14_0==31) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:991:2: kw= '=='
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpEquality2270); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:998:2: kw= '!='
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpEquality2289); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1011:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1012:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1013:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2329);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2339); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1020:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1023:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1024:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1024:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1025:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2386);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1033:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop15:
            do {
                int alt15=3;
                switch ( input.LA(1) ) {
                case 35:
                    {
                    int LA15_2 = input.LA(2);

                    if ( (synpred6_InternalGuiceModules()) ) {
                        alt15=2;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA15_3 = input.LA(2);

                    if ( (synpred6_InternalGuiceModules()) ) {
                        alt15=2;
                    }


                    }
                    break;
                case 32:
                    {
                    int LA15_4 = input.LA(2);

                    if ( (synpred5_InternalGuiceModules()) ) {
                        alt15=1;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA15_5 = input.LA(2);

                    if ( (synpred6_InternalGuiceModules()) ) {
                        alt15=2;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA15_6 = input.LA(2);

                    if ( (synpred6_InternalGuiceModules()) ) {
                        alt15=2;
                    }


                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1033:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1033:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1033:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1033:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1033:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1035:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1035:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1035:6: ()
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1036:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleXRelationalExpression2422); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1045:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1046:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1046:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1047:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2445);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1064:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1064:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1064:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1064:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1064:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1069:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1069:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1069:7: ()
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1070:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1075:2: ( ( ruleOpCompare ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1076:1: ( ruleOpCompare )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1076:1: ( ruleOpCompare )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1077:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2506);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1090:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1091:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1091:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1092:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2529);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1116:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1117:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1118:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2569);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2580); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1125:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1128:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1129:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1129:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt16=1;
                }
                break;
            case 34:
                {
                alt16=2;
                }
                break;
            case 35:
                {
                alt16=3;
                }
                break;
            case 36:
                {
                alt16=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1130:2: kw= '>='
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpCompare2618); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1137:2: kw= '<='
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpCompare2637); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1144:2: kw= '>'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpCompare2656); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1151:2: kw= '<'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpCompare2675); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1164:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1165:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1166:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2715);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2725); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1173:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1176:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1177:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1177:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1178:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2772);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1186:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1186:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1186:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1186:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1191:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1191:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1191:7: ()
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1192:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1197:2: ( ( ruleOpOther ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1198:1: ( ruleOpOther )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1198:1: ( ruleOpOther )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1199:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2825);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1212:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1213:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1213:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1214:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2848);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1238:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1239:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1240:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2887);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2898); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1247:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' kw= '>' ( ( '>' )=>kw= '>' )? ) | (kw= '<' kw= '<' ( ( '<' )=>kw= '<' )? ) | (kw= '<' kw= '>' ) | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1250:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' kw= '>' ( ( '>' )=>kw= '>' )? ) | (kw= '<' kw= '<' ( ( '<' )=>kw= '<' )? ) | (kw= '<' kw= '>' ) | kw= '?:' | kw= '<=>' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1251:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' kw= '>' ( ( '>' )=>kw= '>' )? ) | (kw= '<' kw= '<' ( ( '<' )=>kw= '<' )? ) | (kw= '<' kw= '>' ) | kw= '?:' | kw= '<=>' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1251:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' kw= '>' ( ( '>' )=>kw= '>' )? ) | (kw= '<' kw= '<' ( ( '<' )=>kw= '<' )? ) | (kw= '<' kw= '>' ) | kw= '?:' | kw= '<=>' )
            int alt20=8;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1252:2: kw= '->'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpOther2936); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1259:2: kw= '..'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpOther2955); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1266:2: kw= '=>'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpOther2974); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1272:6: (kw= '>' kw= '>' ( ( '>' )=>kw= '>' )? )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1272:6: (kw= '>' kw= '>' ( ( '>' )=>kw= '>' )? )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1273:2: kw= '>' kw= '>' ( ( '>' )=>kw= '>' )?
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther2994); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther3007); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1()); 
                          
                    }
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1284:1: ( ( '>' )=>kw= '>' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==35) && (synpred8_InternalGuiceModules())) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1284:2: ( '>' )=>kw= '>'
                            {
                            kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther3029); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_2()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1293:6: (kw= '<' kw= '<' ( ( '<' )=>kw= '<' )? )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1293:6: (kw= '<' kw= '<' ( ( '<' )=>kw= '<' )? )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1294:2: kw= '<' kw= '<' ( ( '<' )=>kw= '<' )?
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpOther3052); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpOther3065); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1()); 
                          
                    }
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1305:1: ( ( '<' )=>kw= '<' )?
                    int alt19=2;
                    alt19 = dfa19.predict(input);
                    switch (alt19) {
                        case 1 :
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1305:2: ( '<' )=>kw= '<'
                            {
                            kw=(Token)match(input,36,FOLLOW_36_in_ruleOpOther3087); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_2()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1314:6: (kw= '<' kw= '>' )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1314:6: (kw= '<' kw= '>' )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1315:2: kw= '<' kw= '>'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpOther3110); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_5_0()); 
                          
                    }
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther3123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_1()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1328:2: kw= '?:'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpOther3143); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1335:2: kw= '<=>'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpOther3162); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_7()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1348:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1349:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1350:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3202);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3212); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1357:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1360:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1361:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1361:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1362:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3259);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1370:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==42) ) {
                    int LA21_2 = input.LA(2);

                    if ( (synpred10_InternalGuiceModules()) ) {
                        alt21=1;
                    }


                }
                else if ( (LA21_0==43) ) {
                    int LA21_3 = input.LA(2);

                    if ( (synpred10_InternalGuiceModules()) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1370:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1370:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1370:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1375:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1375:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1375:7: ()
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1376:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1381:2: ( ( ruleOpAdd ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1382:1: ( ruleOpAdd )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1382:1: ( ruleOpAdd )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1383:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3312);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1396:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1397:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1397:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1398:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3335);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1422:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1423:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1424:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3374);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3385); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1431:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1434:28: ( (kw= '+' | kw= '-' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1435:1: (kw= '+' | kw= '-' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1435:1: (kw= '+' | kw= '-' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==42) ) {
                alt22=1;
            }
            else if ( (LA22_0==43) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1436:2: kw= '+'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpAdd3423); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1443:2: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpAdd3442); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1456:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1457:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1458:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3482);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3492); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1465:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1468:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1469:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1469:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1470:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3539);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1478:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop23:
            do {
                int alt23=2;
                switch ( input.LA(1) ) {
                case 44:
                    {
                    int LA23_2 = input.LA(2);

                    if ( (synpred11_InternalGuiceModules()) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA23_3 = input.LA(2);

                    if ( (synpred11_InternalGuiceModules()) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA23_4 = input.LA(2);

                    if ( (synpred11_InternalGuiceModules()) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 47:
                    {
                    int LA23_5 = input.LA(2);

                    if ( (synpred11_InternalGuiceModules()) ) {
                        alt23=1;
                    }


                    }
                    break;

                }

                switch (alt23) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1478:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1478:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1478:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1483:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1483:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1483:7: ()
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1484:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1489:2: ( ( ruleOpMulti ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1490:1: ( ruleOpMulti )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1490:1: ( ruleOpMulti )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1491:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3592);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1504:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1505:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1505:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1506:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3615);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1530:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1531:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1532:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3654);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3665); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1539:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1542:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1543:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1543:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt24=1;
                }
                break;
            case 45:
                {
                alt24=2;
                }
                break;
            case 46:
                {
                alt24=3;
                }
                break;
            case 47:
                {
                alt24=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1544:2: kw= '*'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpMulti3703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1551:2: kw= '**'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpMulti3722); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1558:2: kw= '/'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOpMulti3741); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1565:2: kw= '%'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleOpMulti3760); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1578:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1579:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1580:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3800);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3810); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1587:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1590:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1591:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1591:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=42 && LA25_0<=43)||LA25_0==48) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_DECIMAL)||LA25_0==17||LA25_0==36||LA25_0==53||LA25_0==55||LA25_0==59||LA25_0==61||(LA25_0>=65 && LA25_0<=67)||LA25_0==70||(LA25_0>=72 && LA25_0<=79)) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1591:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1591:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1591:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1591:3: ()
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1592:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1597:2: ( ( ruleOpUnary ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1598:1: ( ruleOpUnary )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1598:1: ( ruleOpUnary )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1599:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3868);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1612:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1613:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1613:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1614:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3889);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1632:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3918);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1648:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1649:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1650:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3954);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3965); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1657:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1660:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1661:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1661:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt26=1;
                }
                break;
            case 43:
                {
                alt26=2;
                }
                break;
            case 42:
                {
                alt26=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1662:2: kw= '!'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleOpUnary4003); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1669:2: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpUnary4022); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1676:2: kw= '+'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpUnary4041); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1689:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1690:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1691:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4081);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression4091); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1698:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1701:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1702:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1702:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1703:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4138);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1711:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==49) ) {
                    int LA27_2 = input.LA(2);

                    if ( (synpred12_InternalGuiceModules()) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1711:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1711:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1711:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1713:5: ( () otherlv_2= 'as' )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1713:6: () otherlv_2= 'as'
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1713:6: ()
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1714:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXCastedExpression4173); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1723:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1724:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1724:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1725:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4196);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1749:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1750:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1751:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4234);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4244); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1758:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;

        EObject lv_memberCallArguments_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1761:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1762:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1762:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1763:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4291);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1771:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop35:
            do {
                int alt35=3;
                switch ( input.LA(1) ) {
                case 50:
                    {
                    int LA35_2 = input.LA(2);

                    if ( (synpred13_InternalGuiceModules()) ) {
                        alt35=1;
                    }
                    else if ( (synpred14_InternalGuiceModules()) ) {
                        alt35=2;
                    }


                    }
                    break;
                case 51:
                    {
                    int LA35_3 = input.LA(2);

                    if ( (synpred14_InternalGuiceModules()) ) {
                        alt35=2;
                    }


                    }
                    break;
                case 52:
                    {
                    int LA35_4 = input.LA(2);

                    if ( (synpred14_InternalGuiceModules()) ) {
                        alt35=2;
                    }


                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1771:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1771:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1771:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1771:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1771:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1777:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1777:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1777:26: ()
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1778:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleXMemberFeatureCall4340); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1787:1: ( ( ruleValidID ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1788:1: ( ruleValidID )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1788:1: ( ruleValidID )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1789:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4363);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4379);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1810:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1811:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1811:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1812:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4401);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1829:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1829:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1829:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1829:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1829:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1845:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1845:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1845:8: ()
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1846:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1851:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt28=3;
            	    switch ( input.LA(1) ) {
            	    case 50:
            	        {
            	        alt28=1;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt28=2;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt28=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt28) {
            	        case 1 :
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1851:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,50,FOLLOW_50_in_ruleXMemberFeatureCall4487); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1856:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1856:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1857:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1857:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1858:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,51,FOLLOW_51_in_ruleXMemberFeatureCall4511); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1872:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1872:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1873:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1873:1: (lv_spreading_9_0= '*.' )
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1874:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,52,FOLLOW_52_in_ruleXMemberFeatureCall4548); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1887:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==36) ) {
            	        alt30=1;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1887:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,36,FOLLOW_36_in_ruleXMemberFeatureCall4577); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1891:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1892:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1892:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1893:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4598);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1909:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop29:
            	            do {
            	                int alt29=2;
            	                int LA29_0 = input.LA(1);

            	                if ( (LA29_0==16) ) {
            	                    alt29=1;
            	                }


            	                switch (alt29) {
            	            	case 1 :
            	            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1909:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleXMemberFeatureCall4611); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1913:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1914:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1914:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1915:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4632);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop29;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,35,FOLLOW_35_in_ruleXMemberFeatureCall4646); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1935:3: ( ( ruleValidID ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1936:1: ( ruleValidID )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1936:1: ( ruleValidID )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1937:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4671);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1950:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt33=2;
            	    alt33 = dfa33.predict(input);
            	    switch (alt33) {
            	        case 1 :
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1950:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1950:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1950:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1957:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1958:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,53,FOLLOW_53_in_ruleXMemberFeatureCall4705); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1971:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt32=3;
            	            alt32 = dfa32.predict(input);
            	            switch (alt32) {
            	                case 1 :
            	                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1971:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1971:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1971:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1988:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1989:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4790);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2006:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2006:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2006:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2006:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2007:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2007:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2008:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4818);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2024:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop31:
            	                    do {
            	                        int alt31=2;
            	                        int LA31_0 = input.LA(1);

            	                        if ( (LA31_0==16) ) {
            	                            alt31=1;
            	                        }


            	                        switch (alt31) {
            	                    	case 1 :
            	                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2024:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,16,FOLLOW_16_in_ruleXMemberFeatureCall4831); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2028:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2029:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2029:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2030:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4852);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop31;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,54,FOLLOW_54_in_ruleXMemberFeatureCall4869); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2050:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt34=2;
            	    alt34 = dfa34.predict(input);
            	    switch (alt34) {
            	        case 1 :
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2050:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2055:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2056:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4902);
            	            lv_memberCallArguments_22_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_22_0, 
            	                      		"XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2080:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2081:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2082:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4942);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4952); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2089:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2092:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2093:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2093:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt36=13;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt36=1;
                }
                break;
            case 17:
                {
                alt36=2;
                }
                break;
            case 61:
                {
                alt36=3;
                }
                break;
            case RULE_ID:
            case 36:
            case 70:
                {
                alt36=4;
                }
                break;
            case RULE_STRING:
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
            case 55:
            case 73:
            case 74:
            case 75:
            case 76:
                {
                alt36=5;
                }
                break;
            case 59:
                {
                alt36=6;
                }
                break;
            case 65:
                {
                alt36=7;
                }
                break;
            case 66:
                {
                alt36=8;
                }
                break;
            case 67:
                {
                alt36=9;
                }
                break;
            case 77:
                {
                alt36=10;
                }
                break;
            case 78:
                {
                alt36=11;
                }
                break;
            case 79:
                {
                alt36=12;
                }
                break;
            case 53:
                {
                alt36=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2094:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4999);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2104:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5026);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2114:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5053);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2124:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5080);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2134:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5107);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2144:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5134);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2154:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5161);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2164:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5188);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2174:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5215);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2184:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5242);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2194:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5269);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2204:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5296);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2214:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5323);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2230:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2231:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2232:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5358);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5368); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2239:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XNumberLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2242:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2243:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2243:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt37=6;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt37=1;
                }
                break;
            case 73:
            case 74:
                {
                alt37=2;
                }
                break;
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
                {
                alt37=3;
                }
                break;
            case 75:
                {
                alt37=4;
                }
                break;
            case RULE_STRING:
                {
                alt37=5;
                }
                break;
            case 76:
                {
                alt37=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2244:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5415);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2254:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5442);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2264:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5469);
                    this_XNumberLiteral_2=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNumberLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2274:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5496);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2284:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5523);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2294:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5550);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2310:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2311:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2312:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5585);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5595); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2319:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2322:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2323:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2323:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2323:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2323:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2324:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXClosure5641); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2333:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2333:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2348:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2348:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2348:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_ID||LA39_0==39||LA39_0==53) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2348:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2348:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2349:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2349:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2350:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5712);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2366:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop38:
                            do {
                                int alt38=2;
                                int LA38_0 = input.LA(1);

                                if ( (LA38_0==16) ) {
                                    alt38=1;
                                }


                                switch (alt38) {
                            	case 1 :
                            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2366:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleXClosure5725); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2370:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2371:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2371:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2372:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5746);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
                            	              		"JvmFormalParameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop38;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2388:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2389:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2389:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2390:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,56,FOLLOW_56_in_ruleXClosure5768); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_2_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2403:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2404:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2404:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2405:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5805);
            lv_expression_6_0=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,57,FOLLOW_57_in_ruleXClosure5817); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXExpressionInClosure"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2433:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2434:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2435:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5853);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5863); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2442:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2445:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2446:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2446:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2446:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2446:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2447:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2452:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_DECIMAL)||LA42_0==17||LA42_0==36||(LA42_0>=42 && LA42_0<=43)||LA42_0==48||LA42_0==53||LA42_0==55||LA42_0==59||LA42_0==61||(LA42_0>=65 && LA42_0<=70)||(LA42_0>=72 && LA42_0<=79)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2452:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2452:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2453:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2453:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2454:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5919);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2470:2: (otherlv_2= ';' )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==58) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2470:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleXExpressionInClosure5932); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2482:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2483:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2484:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5972);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5982); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2491:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2494:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2495:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2495:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2495:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2495:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2495:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2511:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2511:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2511:7: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2512:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2517:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID||LA44_0==39||LA44_0==53) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2517:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2517:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2518:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2518:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2519:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6090);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2535:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==16) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2535:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleXShortClosure6103); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2539:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2540:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2540:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2541:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6124);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2557:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2558:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2558:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2559:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,56,FOLLOW_56_in_ruleXShortClosure6146); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2572:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2573:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2573:1: (lv_expression_5_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2574:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6182);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2598:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2599:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2600:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6218);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6228); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2607:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2610:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2611:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2611:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2611:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleXParenthesizedExpression6265); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6287);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleXParenthesizedExpression6298); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2636:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2637:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2638:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6334);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6344); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2645:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2648:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2649:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2649:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2649:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2649:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2650:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXIfExpression6390); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleXIfExpression6402); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2663:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2664:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2664:1: (lv_if_3_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2665:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6423);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleXIfExpression6435); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2685:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2686:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2686:1: (lv_then_5_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2687:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6456);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2703:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==60) ) {
                int LA45_1 = input.LA(2);

                if ( (synpred20_InternalGuiceModules()) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2703:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2703:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2703:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,60,FOLLOW_60_in_ruleXIfExpression6477); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2708:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2709:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2709:1: (lv_else_7_0= ruleXExpression )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2710:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6499);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2734:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2735:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2736:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6537);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6547); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2743:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        AntlrDatatypeRuleToken lv_localVarName_6_0 = null;

        EObject lv_switch_8_0 = null;

        EObject lv_cases_11_0 = null;

        EObject lv_default_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2746:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2747:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2747:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2747:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2747:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2748:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXSwitchExpression6593); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2757:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_DECIMAL)||LA47_0==17||LA47_0==36||(LA47_0>=42 && LA47_0<=43)||LA47_0==48||LA47_0==55||LA47_0==59||LA47_0==61||(LA47_0>=65 && LA47_0<=67)||LA47_0==70||(LA47_0>=72 && LA47_0<=79)) ) {
                alt47=1;
            }
            else if ( (LA47_0==53) ) {
                int LA47_2 = input.LA(2);

                if ( (LA47_2==RULE_ID) ) {
                    int LA47_3 = input.LA(3);

                    if ( ((LA47_3>=26 && LA47_3<=47)||(LA47_3>=49 && LA47_3<=55)||LA47_3==71) ) {
                        alt47=1;
                    }
                    else if ( (LA47_3==62) && (synpred22_InternalGuiceModules())) {
                        alt47=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA47_2>=RULE_STRING && LA47_2<=RULE_DECIMAL)||LA47_2==17||LA47_2==36||(LA47_2>=42 && LA47_2<=43)||LA47_2==48||LA47_2==53||LA47_2==55||LA47_2==59||LA47_2==61||(LA47_2>=65 && LA47_2<=67)||LA47_2==70||(LA47_2>=72 && LA47_2<=79)) ) {
                    alt47=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2757:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2757:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2757:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2757:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_ID) ) {
                        int LA46_1 = input.LA(2);

                        if ( (LA46_1==62) && (synpred21_InternalGuiceModules())) {
                            alt46=1;
                        }
                    }
                    switch (alt46) {
                        case 1 :
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2757:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2762:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2762:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2762:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2763:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2763:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2764:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6636);
                            lv_localVarName_2_0=ruleValidID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"localVarName",
                                      		lv_localVarName_2_0, 
                                      		"ValidID");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_3=(Token)match(input,62,FOLLOW_62_in_ruleXSwitchExpression6648); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2784:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2785:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2785:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2786:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6672);
                    lv_switch_4_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_4_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2803:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2803:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2803:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2803:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2803:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2809:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2809:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6716); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2813:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2814:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2814:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2815:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6737);
                    lv_localVarName_6_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_6_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,62,FOLLOW_62_in_ruleXSwitchExpression6749); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2835:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2836:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2836:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2837:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6772);
                    lv_switch_8_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_8_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6784); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleXSwitchExpression6798); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2861:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ID||LA48_0==39||LA48_0==53||LA48_0==62||LA48_0==64) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2862:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2862:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2863:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6819);
            	    lv_cases_11_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_11_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2879:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==63) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2879:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,63,FOLLOW_63_in_ruleXSwitchExpression6833); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,62,FOLLOW_62_in_ruleXSwitchExpression6845); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2887:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2888:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2888:1: (lv_default_14_0= ruleXExpression )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2889:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6866);
                    lv_default_14_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_14_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,18,FOLLOW_18_in_ruleXSwitchExpression6880); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2917:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2918:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2919:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6916);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6926); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2926:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2929:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2930:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2930:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2930:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2930:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID||LA50_0==39||LA50_0==53) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2931:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2931:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2932:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6972);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2948:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==64) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2948:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXCasePart6986); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2952:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2953:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2953:1: (lv_case_2_0= ruleXExpression )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2954:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7007);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,62,FOLLOW_62_in_ruleXCasePart7021); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2974:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2975:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2975:1: (lv_then_4_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2976:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7042);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3000:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3001:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3002:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7078);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression7088); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3009:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3012:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3013:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3013:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3013:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3013:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3014:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXForLoopExpression7134); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleXForLoopExpression7146); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3027:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3028:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3028:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3029:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7167);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,62,FOLLOW_62_in_ruleXForLoopExpression7179); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3049:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3050:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3050:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3051:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7200);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,54,FOLLOW_54_in_ruleXForLoopExpression7212); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3071:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3072:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3072:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3073:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7233);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3097:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3098:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3099:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7269);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7279); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3106:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3109:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3110:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3110:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3110:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3110:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3111:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXWhileExpression7325); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleXWhileExpression7337); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3124:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3125:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3125:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3126:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7358);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleXWhileExpression7370); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3146:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3147:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3147:1: (lv_body_5_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3148:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7391);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3172:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3173:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3174:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7427);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7437); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3181:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3184:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3185:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3185:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3185:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3185:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3186:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXDoWhileExpression7483); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3195:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3196:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3196:1: (lv_body_2_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3197:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7504);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleXDoWhileExpression7516); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,53,FOLLOW_53_in_ruleXDoWhileExpression7528); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3221:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3222:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3222:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3223:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7549);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,54,FOLLOW_54_in_ruleXDoWhileExpression7561); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3251:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3252:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3253:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7597);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7607); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3260:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3263:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3264:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3264:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3264:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3264:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3265:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleXBlockExpression7653); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3274:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_DECIMAL)||LA53_0==17||LA53_0==36||(LA53_0>=42 && LA53_0<=43)||LA53_0==48||LA53_0==53||LA53_0==55||LA53_0==59||LA53_0==61||(LA53_0>=65 && LA53_0<=70)||(LA53_0>=72 && LA53_0<=79)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3274:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3274:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3275:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3275:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3276:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7675);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3292:2: (otherlv_3= ';' )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==58) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3292:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,58,FOLLOW_58_in_ruleXBlockExpression7688); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleXBlockExpression7704); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3308:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3309:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3310:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7740);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7750); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3317:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3320:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3321:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3321:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=68 && LA54_0<=69)) ) {
                alt54=1;
            }
            else if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_DECIMAL)||LA54_0==17||LA54_0==36||(LA54_0>=42 && LA54_0<=43)||LA54_0==48||LA54_0==53||LA54_0==55||LA54_0==59||LA54_0==61||(LA54_0>=65 && LA54_0<=67)||LA54_0==70||(LA54_0>=72 && LA54_0<=79)) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3322:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7797);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3332:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7824);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3348:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3349:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3350:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7859);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7869); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3357:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3360:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3361:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3361:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3361:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3361:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3362:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3367:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==68) ) {
                alt55=1;
            }
            else if ( (LA55_0==69) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3367:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3367:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3368:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3368:1: (lv_writeable_1_0= 'var' )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3369:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,68,FOLLOW_68_in_ruleXVariableDeclaration7922); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3383:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,69,FOLLOW_69_in_ruleXVariableDeclaration7953); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3387:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                int LA56_1 = input.LA(2);

                if ( (synpred23_InternalGuiceModules()) ) {
                    alt56=1;
                }
                else if ( (true) ) {
                    alt56=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA56_0==53) && (synpred23_InternalGuiceModules())) {
                alt56=1;
            }
            else if ( (LA56_0==39) && (synpred23_InternalGuiceModules())) {
                alt56=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3387:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3387:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3387:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3395:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3395:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3395:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3396:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3396:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3397:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8001);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3413:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3414:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3414:1: (lv_name_4_0= ruleValidID )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3415:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8022);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3432:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3432:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3433:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3433:1: (lv_name_5_0= ruleValidID )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3434:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8051);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3450:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==26) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3450:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleXVariableDeclaration8065); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3454:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3455:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3455:1: (lv_right_7_0= ruleXExpression )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3456:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8086);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3480:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3481:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3482:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8124);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8134); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3489:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3492:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3493:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3493:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3493:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3493:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==RULE_ID||LA58_1==36||LA58_1==50||LA58_1==55) ) {
                    alt58=1;
                }
            }
            else if ( (LA58_0==39||LA58_0==53) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3494:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3494:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3495:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8180);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3511:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3512:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3512:1: (lv_name_1_0= ruleValidID )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3513:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8202);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3537:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3538:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3539:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8238);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8248); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3546:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3549:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3550:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3550:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3550:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3550:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3551:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3551:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3552:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8294);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"parameterType",
                      		lv_parameterType_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3568:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3569:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3569:1: (lv_name_1_0= ruleValidID )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3570:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8315);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3594:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3595:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3596:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8351);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8361); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3603:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;

        EObject lv_featureCallArguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3606:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3607:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3607:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3607:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3607:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3608:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3613:2: ( ( ruleStaticQualifier ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==71) ) {
                    alt59=1;
                }
            }
            switch (alt59) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3614:1: ( ruleStaticQualifier )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3614:1: ( ruleStaticQualifier )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3615:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8418);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3628:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==36) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3628:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleXFeatureCall8432); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3632:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3633:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3633:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3634:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8453);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3650:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==16) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3650:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleXFeatureCall8466); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3654:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3655:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3655:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3656:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8487);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleXFeatureCall8501); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3676:3: ( ( ruleIdOrSuper ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3677:1: ( ruleIdOrSuper )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3677:1: ( ruleIdOrSuper )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3678:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8526);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3691:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3691:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3691:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3691:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3698:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3699:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,53,FOLLOW_53_in_ruleXFeatureCall8560); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3712:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt63=3;
                    alt63 = dfa63.predict(input);
                    switch (alt63) {
                        case 1 :
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3712:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3712:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3712:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3729:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3730:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8645);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3747:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3747:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3747:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3747:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3748:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3748:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3749:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8673);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3765:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop62:
                            do {
                                int alt62=2;
                                int LA62_0 = input.LA(1);

                                if ( (LA62_0==16) ) {
                                    alt62=1;
                                }


                                switch (alt62) {
                            	case 1 :
                            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3765:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleXFeatureCall8686); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3769:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3770:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3770:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3771:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8707);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop62;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,54,FOLLOW_54_in_ruleXFeatureCall8724); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3791:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3791:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3796:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3797:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8757);
                    lv_featureCallArguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3821:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3822:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3823:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8795);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8806); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3830:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3833:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3834:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3834:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) ) {
                alt66=1;
            }
            else if ( (LA66_0==70) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3835:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8853);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3847:2: kw= 'super'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleIdOrSuper8877); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3860:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3861:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3862:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8918);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8929); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3869:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3872:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3873:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3873:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt67=0;
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==RULE_ID) ) {
                    int LA67_2 = input.LA(2);

                    if ( (LA67_2==71) ) {
                        alt67=1;
                    }


                }


                switch (alt67) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3874:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8976);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,71,FOLLOW_71_in_ruleStaticQualifier8994); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt67 >= 1 ) break loop67;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(67, input);
                        throw eee;
                }
                cnt67++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3898:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3899:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3900:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9035);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall9045); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3907:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3910:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3911:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3911:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3911:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3911:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3912:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXConstructorCall9091); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3921:1: ( ( ruleQualifiedName ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3922:1: ( ruleQualifiedName )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3922:1: ( ruleQualifiedName )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3923:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9114);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3936:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt69=2;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3936:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3936:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3936:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleXConstructorCall9135); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3941:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3942:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3942:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3943:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9157);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3959:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==16) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3959:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleXConstructorCall9170); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3963:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3964:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3964:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3965:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9191);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,35,FOLLOW_35_in_ruleXConstructorCall9205); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3985:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3985:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3985:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3985:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,53,FOLLOW_53_in_ruleXConstructorCall9228); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3990:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt71=3;
                    alt71 = dfa71.predict(input);
                    switch (alt71) {
                        case 1 :
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3990:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3990:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3990:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4007:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4008:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9301);
                            lv_arguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4025:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4025:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4025:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4025:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4026:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4026:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4027:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9329);
                            lv_arguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4043:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop70:
                            do {
                                int alt70=2;
                                int LA70_0 = input.LA(1);

                                if ( (LA70_0==16) ) {
                                    alt70=1;
                                }


                                switch (alt70) {
                            	case 1 :
                            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4043:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleXConstructorCall9342); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4047:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4048:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4048:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4049:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9363);
                            	    lv_arguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"arguments",
                            	              		lv_arguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop70;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,54,FOLLOW_54_in_ruleXConstructorCall9380); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4069:3: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4069:4: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4074:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4075:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9413);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4099:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4100:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4101:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9450);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9460); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4108:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4111:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4112:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4112:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4112:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4112:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4113:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4118:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==73) ) {
                alt74=1;
            }
            else if ( (LA74_0==74) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4118:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXBooleanLiteral9507); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4123:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4123:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4124:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4124:1: (lv_isTrue_2_0= 'true' )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4125:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,74,FOLLOW_74_in_ruleXBooleanLiteral9531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4146:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4147:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4148:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9581);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9591); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4155:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4158:28: ( ( () otherlv_1= 'null' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4159:1: ( () otherlv_1= 'null' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4159:1: ( () otherlv_1= 'null' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4159:2: () otherlv_1= 'null'
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4159:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4160:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleXNullLiteral9637); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXNumberLiteral"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4177:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4178:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4179:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9673);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9683); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNumberLiteral"


    // $ANTLR start "ruleXNumberLiteral"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4186:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4189:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4190:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4190:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4190:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4190:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4191:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4196:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4197:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4197:1: (lv_value_1_0= ruleNumber )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4198:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9738);
            lv_value_1_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXNumberLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Number");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNumberLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4222:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4223:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4224:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9774);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9784); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4231:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4234:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4235:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4235:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4235:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4235:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4236:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4241:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4242:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4242:1: (lv_value_1_0= RULE_STRING )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4243:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4267:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4268:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4269:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9876);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9886); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4276:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4279:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4280:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4280:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4280:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4280:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4281:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleXTypeLiteral9932); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleXTypeLiteral9944); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4294:1: ( ( ruleQualifiedName ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4295:1: ( ruleQualifiedName )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4295:1: ( ruleQualifiedName )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4296:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9967);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleXTypeLiteral9979); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4321:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4322:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4323:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10015);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression10025); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4330:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4333:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4334:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4334:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4334:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4334:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4335:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleXThrowExpression10071); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4344:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4345:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4345:1: (lv_expression_2_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4346:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression10092);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4370:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4371:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4372:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10128);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10138); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4379:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4382:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4383:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4383:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4383:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4383:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4384:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,78,FOLLOW_78_in_ruleXReturnExpression10184); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4393:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt75=2;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4393:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4398:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4399:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10215);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4423:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4424:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4425:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10252);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10262); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4432:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4435:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4436:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4436:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4436:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4436:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4437:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleXTryCatchFinallyExpression10308); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4446:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4447:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4447:1: (lv_expression_2_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4448:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10329);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4464:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==81) ) {
                alt78=1;
            }
            else if ( (LA78_0==80) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4464:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4464:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4464:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4464:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt76=0;
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==81) ) {
                            int LA76_2 = input.LA(2);

                            if ( (synpred32_InternalGuiceModules()) ) {
                                alt76=1;
                            }


                        }


                        switch (alt76) {
                    	case 1 :
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4464:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4466:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4467:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10359);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt76 >= 1 ) break loop76;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(76, input);
                                throw eee;
                        }
                        cnt76++;
                    } while (true);

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4483:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==80) ) {
                        int LA77_1 = input.LA(2);

                        if ( (synpred33_InternalGuiceModules()) ) {
                            alt77=1;
                        }
                    }
                    switch (alt77) {
                        case 1 :
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4483:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4483:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4483:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,80,FOLLOW_80_in_ruleXTryCatchFinallyExpression10381); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4488:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4489:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4489:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4490:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10403);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4507:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4507:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4507:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,80,FOLLOW_80_in_ruleXTryCatchFinallyExpression10425); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4511:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4512:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4512:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4513:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10446);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4537:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4538:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4539:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10484);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10494); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4546:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4549:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4550:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4550:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4550:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4550:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4550:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleXCatchClause10539); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXCatchClause10552); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4559:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4560:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4560:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4561:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10573);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleXCatchClause10585); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4581:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4582:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4582:1: (lv_expression_4_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4583:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10606);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4607:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4608:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4609:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10643);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10654); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4616:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4619:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4620:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4620:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4621:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10701);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4631:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==50) ) {
                    int LA79_2 = input.LA(2);

                    if ( (LA79_2==RULE_ID) ) {
                        int LA79_3 = input.LA(3);

                        if ( (synpred35_InternalGuiceModules()) ) {
                            alt79=1;
                        }


                    }


                }


                switch (alt79) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4631:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4631:2: ( ( '.' )=>kw= '.' )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4631:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,50,FOLLOW_50_in_ruleQualifiedName10729); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10752);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleNumber"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4658:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4662:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4663:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10806);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10817); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4673:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4677:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4678:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4678:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_HEX) ) {
                alt83=1;
            }
            else if ( ((LA83_0>=RULE_INT && LA83_0<=RULE_DECIMAL)) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4678:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10861); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4686:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4686:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4686:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4686:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==RULE_INT) ) {
                        alt80=1;
                    }
                    else if ( (LA80_0==RULE_DECIMAL) ) {
                        alt80=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 80, 0, input);

                        throw nvae;
                    }
                    switch (alt80) {
                        case 1 :
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4686:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10889); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4694:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10915); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4701:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==50) ) {
                        int LA82_1 = input.LA(2);

                        if ( ((LA82_1>=RULE_INT && LA82_1<=RULE_DECIMAL)) ) {
                            alt82=1;
                        }
                    }
                    switch (alt82) {
                        case 1 :
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4702:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,50,FOLLOW_50_in_ruleNumber10935); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4707:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt81=2;
                            int LA81_0 = input.LA(1);

                            if ( (LA81_0==RULE_INT) ) {
                                alt81=1;
                            }
                            else if ( (LA81_0==RULE_DECIMAL) ) {
                                alt81=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 81, 0, input);

                                throw nvae;
                            }
                            switch (alt81) {
                                case 1 :
                                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4707:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10951); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4715:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10977); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_DECIMAL_5);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4733:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4734:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4735:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11030);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference11040); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4742:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4745:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4746:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4746:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_ID) ) {
                alt85=1;
            }
            else if ( (LA85_0==39||LA85_0==53) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4746:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4746:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4747:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11088);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4755:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==55) ) {
                            int LA84_2 = input.LA(2);

                            if ( (LA84_2==57) ) {
                                int LA84_3 = input.LA(3);

                                if ( (synpred36_InternalGuiceModules()) ) {
                                    alt84=1;
                                }


                            }


                        }


                        switch (alt84) {
                    	case 1 :
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4755:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4758:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4758:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4758:6: ()
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4759:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleJvmTypeReference11126); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleJvmTypeReference11138); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4774:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11170);
                    this_XFunctionTypeRef_4=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4790:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4791:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4792:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11205);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef11215); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4799:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4802:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4803:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4803:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4803:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4803:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==53) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4803:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleXFunctionTypeRef11253); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4807:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==RULE_ID||LA87_0==39||LA87_0==53) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4807:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4807:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4808:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4808:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4809:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11275);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"paramTypes",
                                      		lv_paramTypes_1_0, 
                                      		"JvmTypeReference");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4825:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop86:
                            do {
                                int alt86=2;
                                int LA86_0 = input.LA(1);

                                if ( (LA86_0==16) ) {
                                    alt86=1;
                                }


                                switch (alt86) {
                            	case 1 :
                            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4825:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleXFunctionTypeRef11288); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4829:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4830:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4830:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4831:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11309);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"paramTypes",
                            	              		lv_paramTypes_3_0, 
                            	              		"JvmTypeReference");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop86;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleXFunctionTypeRef11325); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleXFunctionTypeRef11339); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4855:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4856:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4856:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4857:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11360);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4881:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4882:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4883:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11396);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11406); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4890:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4893:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4894:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4894:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4894:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4894:2: ( ( ruleQualifiedName ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4895:1: ( ruleQualifiedName )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4895:1: ( ruleQualifiedName )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4896:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11454);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4909:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt90=2;
            alt90 = dfa90.predict(input);
            switch (alt90) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4909:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4909:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4909:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleJvmParameterizedTypeReference11475); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4914:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4915:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4915:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4916:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11497);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4932:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==16) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4932:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleJvmParameterizedTypeReference11510); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4936:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4937:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4937:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4938:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11531);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleJvmParameterizedTypeReference11545); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4966:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4967:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4968:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11583);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11593); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4975:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4978:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4979:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4979:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==RULE_ID||LA91_0==39||LA91_0==53) ) {
                alt91=1;
            }
            else if ( (LA91_0==82) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4980:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11640);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4990:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11667);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5006:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5007:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5008:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11702);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11712); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5015:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5018:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5019:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5019:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5019:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5019:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5020:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,82,FOLLOW_82_in_ruleJvmWildcardTypeReference11758); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5029:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt92=3;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==83) ) {
                alt92=1;
            }
            else if ( (LA92_0==70) ) {
                alt92=2;
            }
            switch (alt92) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5029:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5029:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5030:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5030:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5031:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11780);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5048:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5048:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5049:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5049:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5050:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11807);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5074:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5075:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5076:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11845);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11855); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5083:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5086:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5087:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5087:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5087:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,83,FOLLOW_83_in_ruleJvmUpperBound11892); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5091:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5092:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5092:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5093:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11913);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5117:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5118:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5119:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11949);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11959); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5126:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5129:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5130:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5130:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5130:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,84,FOLLOW_84_in_ruleJvmUpperBoundAnded11996); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5134:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5135:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5135:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5136:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12017);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5160:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5161:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5162:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12053);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound12063); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5169:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5172:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5173:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5173:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5173:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleJvmLowerBound12100); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5177:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5178:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5178:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5179:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12121);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleValidID"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5205:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5206:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5207:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID12160);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID12171); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5214:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5217:28: (this_ID_0= RULE_ID )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:5218:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID12210); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"

    // $ANTLR start synpred1_InternalGuiceModules
    public final void synpred1_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:595:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:595:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:595:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:595:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:595:5: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:596:1: 
        {
        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:596:2: ( ( ruleOpMultiAssign ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:597:1: ( ruleOpMultiAssign )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:597:1: ( ruleOpMultiAssign )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:598:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalGuiceModules1261);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalGuiceModules

    // $ANTLR start synpred2_InternalGuiceModules
    public final void synpred2_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:723:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:723:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:723:4: ( () ( ( ruleOpOr ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:723:5: () ( ( ruleOpOr ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:723:5: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:724:1: 
        {
        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:724:2: ( ( ruleOpOr ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:725:1: ( ruleOpOr )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:725:1: ( ruleOpOr )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:726:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalGuiceModules1609);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalGuiceModules

    // $ANTLR start synpred3_InternalGuiceModules
    public final void synpred3_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:824:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:824:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:824:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:824:5: () ( ( ruleOpAnd ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:824:5: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:825:1: 
        {
        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:825:2: ( ( ruleOpAnd ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:826:1: ( ruleOpAnd )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:826:1: ( ruleOpAnd )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:827:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalGuiceModules1868);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalGuiceModules

    // $ANTLR start synpred4_InternalGuiceModules
    public final void synpred4_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:925:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:925:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:925:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:925:5: () ( ( ruleOpEquality ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:925:5: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:926:1: 
        {
        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:926:2: ( ( ruleOpEquality ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:927:1: ( ruleOpEquality )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:927:1: ( ruleOpEquality )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:928:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalGuiceModules2127);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalGuiceModules

    // $ANTLR start synpred5_InternalGuiceModules
    public final void synpred5_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1033:4: ( ( () 'instanceof' ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1033:5: ( () 'instanceof' )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1033:5: ( () 'instanceof' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1033:6: () 'instanceof'
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1033:6: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1034:1: 
        {
        }

        match(input,32,FOLLOW_32_in_synpred5_InternalGuiceModules2403); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalGuiceModules

    // $ANTLR start synpred6_InternalGuiceModules
    public final void synpred6_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1064:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1064:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1064:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1064:10: () ( ( ruleOpCompare ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1064:10: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1065:1: 
        {
        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1065:2: ( ( ruleOpCompare ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1066:1: ( ruleOpCompare )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1066:1: ( ruleOpCompare )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1067:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalGuiceModules2474);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalGuiceModules

    // $ANTLR start synpred7_InternalGuiceModules
    public final void synpred7_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1186:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1186:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1186:4: ( () ( ( ruleOpOther ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1186:5: () ( ( ruleOpOther ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1186:5: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1187:1: 
        {
        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1187:2: ( ( ruleOpOther ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1188:1: ( ruleOpOther )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1188:1: ( ruleOpOther )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1189:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalGuiceModules2793);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalGuiceModules

    // $ANTLR start synpred8_InternalGuiceModules
    public final void synpred8_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1284:2: ( '>' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1285:2: '>'
        {
        match(input,35,FOLLOW_35_in_synpred8_InternalGuiceModules3020); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalGuiceModules

    // $ANTLR start synpred9_InternalGuiceModules
    public final void synpred9_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1305:2: ( '<' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1306:2: '<'
        {
        match(input,36,FOLLOW_36_in_synpred9_InternalGuiceModules3078); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalGuiceModules

    // $ANTLR start synpred10_InternalGuiceModules
    public final void synpred10_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1370:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1370:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1370:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1370:5: () ( ( ruleOpAdd ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1370:5: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1371:1: 
        {
        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1371:2: ( ( ruleOpAdd ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1372:1: ( ruleOpAdd )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1372:1: ( ruleOpAdd )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1373:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalGuiceModules3280);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalGuiceModules

    // $ANTLR start synpred11_InternalGuiceModules
    public final void synpred11_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1478:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1478:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1478:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1478:5: () ( ( ruleOpMulti ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1478:5: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1479:1: 
        {
        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1479:2: ( ( ruleOpMulti ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1480:1: ( ruleOpMulti )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1480:1: ( ruleOpMulti )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1481:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalGuiceModules3560);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalGuiceModules

    // $ANTLR start synpred12_InternalGuiceModules
    public final void synpred12_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1711:3: ( ( () 'as' ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1711:4: ( () 'as' )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1711:4: ( () 'as' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1711:5: () 'as'
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1711:5: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1712:1: 
        {
        }

        match(input,49,FOLLOW_49_in_synpred12_InternalGuiceModules4154); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalGuiceModules

    // $ANTLR start synpred13_InternalGuiceModules
    public final void synpred13_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1771:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1771:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1771:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1771:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1771:6: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1772:1: 
        {
        }

        match(input,50,FOLLOW_50_in_synpred13_InternalGuiceModules4308); if (state.failed) return ;
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1773:1: ( ( ruleValidID ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1774:1: ( ruleValidID )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1774:1: ( ruleValidID )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1775:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred13_InternalGuiceModules4317);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalGuiceModules4323);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalGuiceModules

    // $ANTLR start synpred14_InternalGuiceModules
    public final void synpred14_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1829:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1829:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1829:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1829:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1829:10: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1830:1: 
        {
        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1830:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt93=3;
        switch ( input.LA(1) ) {
        case 50:
            {
            alt93=1;
            }
            break;
        case 51:
            {
            alt93=2;
            }
            break;
        case 52:
            {
            alt93=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 93, 0, input);

            throw nvae;
        }

        switch (alt93) {
            case 1 :
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1830:4: '.'
                {
                match(input,50,FOLLOW_50_in_synpred14_InternalGuiceModules4426); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1832:6: ( ( '?.' ) )
                {
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1832:6: ( ( '?.' ) )
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1833:1: ( '?.' )
                {
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1833:1: ( '?.' )
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1834:2: '?.'
                {
                match(input,51,FOLLOW_51_in_synpred14_InternalGuiceModules4440); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1839:6: ( ( '*.' ) )
                {
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1839:6: ( ( '*.' ) )
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1840:1: ( '*.' )
                {
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1840:1: ( '*.' )
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1841:2: '*.'
                {
                match(input,52,FOLLOW_52_in_synpred14_InternalGuiceModules4460); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalGuiceModules

    // $ANTLR start synpred15_InternalGuiceModules
    public final void synpred15_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1950:4: ( ( '(' ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1951:1: ( '(' )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1951:1: ( '(' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1952:2: '('
        {
        match(input,53,FOLLOW_53_in_synpred15_InternalGuiceModules4687); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalGuiceModules

    // $ANTLR start synpred16_InternalGuiceModules
    public final void synpred16_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1971:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1971:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1971:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1971:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1971:6: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1972:1: 
        {
        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1972:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt95=2;
        int LA95_0 = input.LA(1);

        if ( (LA95_0==RULE_ID||LA95_0==39||LA95_0==53) ) {
            alt95=1;
        }
        switch (alt95) {
            case 1 :
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1972:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1972:3: ( ( ruleJvmFormalParameter ) )
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1973:1: ( ruleJvmFormalParameter )
                {
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1973:1: ( ruleJvmFormalParameter )
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1974:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalGuiceModules4739);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1976:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop94:
                do {
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==16) ) {
                        alt94=1;
                    }


                    switch (alt94) {
                	case 1 :
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1976:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,16,FOLLOW_16_in_synpred16_InternalGuiceModules4746); if (state.failed) return ;
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1977:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1978:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1978:1: ( ruleJvmFormalParameter )
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1979:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalGuiceModules4753);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop94;
                    }
                } while (true);


                }
                break;

        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1981:6: ( ( '|' ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1982:1: ( '|' )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1982:1: ( '|' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1983:2: '|'
        {
        match(input,56,FOLLOW_56_in_synpred16_InternalGuiceModules4767); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalGuiceModules

    // $ANTLR start synpred17_InternalGuiceModules
    public final void synpred17_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2050:4: ( ( ruleXClosure ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2051:1: ( ruleXClosure )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2051:1: ( ruleXClosure )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2052:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred17_InternalGuiceModules4885);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalGuiceModules

    // $ANTLR start synpred18_InternalGuiceModules
    public final void synpred18_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2333:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2333:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2333:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2333:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2333:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt97=2;
        int LA97_0 = input.LA(1);

        if ( (LA97_0==RULE_ID||LA97_0==39||LA97_0==53) ) {
            alt97=1;
        }
        switch (alt97) {
            case 1 :
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2333:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2333:5: ( ( ruleJvmFormalParameter ) )
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2334:1: ( ruleJvmFormalParameter )
                {
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2334:1: ( ruleJvmFormalParameter )
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2335:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred18_InternalGuiceModules5658);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2337:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop96:
                do {
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==16) ) {
                        alt96=1;
                    }


                    switch (alt96) {
                	case 1 :
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2337:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,16,FOLLOW_16_in_synpred18_InternalGuiceModules5665); if (state.failed) return ;
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2338:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2339:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2339:1: ( ruleJvmFormalParameter )
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2340:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred18_InternalGuiceModules5672);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop96;
                    }
                } while (true);


                }
                break;

        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2342:6: ( ( '|' ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2343:1: ( '|' )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2343:1: ( '|' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2344:2: '|'
        {
        match(input,56,FOLLOW_56_in_synpred18_InternalGuiceModules5686); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred18_InternalGuiceModules

    // $ANTLR start synpred20_InternalGuiceModules
    public final void synpred20_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2703:4: ( 'else' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2703:6: 'else'
        {
        match(input,60,FOLLOW_60_in_synpred20_InternalGuiceModules6469); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_InternalGuiceModules

    // $ANTLR start synpred21_InternalGuiceModules
    public final void synpred21_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2757:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2757:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2757:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2757:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2757:6: ( ( ruleValidID ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2758:1: ( ruleValidID )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2758:1: ( ruleValidID )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2759:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred21_InternalGuiceModules6611);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,62,FOLLOW_62_in_synpred21_InternalGuiceModules6617); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalGuiceModules

    // $ANTLR start synpred22_InternalGuiceModules
    public final void synpred22_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2803:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2803:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2803:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2803:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,53,FOLLOW_53_in_synpred22_InternalGuiceModules6693); if (state.failed) return ;
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2804:1: ( ( ruleValidID ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2805:1: ( ruleValidID )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2805:1: ( ruleValidID )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2806:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred22_InternalGuiceModules6700);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,62,FOLLOW_62_in_synpred22_InternalGuiceModules6706); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred22_InternalGuiceModules

    // $ANTLR start synpred23_InternalGuiceModules
    public final void synpred23_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3387:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3387:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3387:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3387:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3387:6: ( ( ruleJvmTypeReference ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3388:1: ( ruleJvmTypeReference )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3388:1: ( ruleJvmTypeReference )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3389:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred23_InternalGuiceModules7971);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3391:2: ( ( ruleValidID ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3392:1: ( ruleValidID )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3392:1: ( ruleValidID )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3393:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalGuiceModules7980);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred23_InternalGuiceModules

    // $ANTLR start synpred24_InternalGuiceModules
    public final void synpred24_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3691:4: ( ( '(' ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3692:1: ( '(' )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3692:1: ( '(' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3693:2: '('
        {
        match(input,53,FOLLOW_53_in_synpred24_InternalGuiceModules8542); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalGuiceModules

    // $ANTLR start synpred25_InternalGuiceModules
    public final void synpred25_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3712:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3712:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3712:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3712:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3712:6: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3713:1: 
        {
        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3713:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt101=2;
        int LA101_0 = input.LA(1);

        if ( (LA101_0==RULE_ID||LA101_0==39||LA101_0==53) ) {
            alt101=1;
        }
        switch (alt101) {
            case 1 :
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3713:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3713:3: ( ( ruleJvmFormalParameter ) )
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3714:1: ( ruleJvmFormalParameter )
                {
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3714:1: ( ruleJvmFormalParameter )
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3715:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred25_InternalGuiceModules8594);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3717:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop100:
                do {
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==16) ) {
                        alt100=1;
                    }


                    switch (alt100) {
                	case 1 :
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3717:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,16,FOLLOW_16_in_synpred25_InternalGuiceModules8601); if (state.failed) return ;
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3718:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3719:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3719:1: ( ruleJvmFormalParameter )
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3720:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred25_InternalGuiceModules8608);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop100;
                    }
                } while (true);


                }
                break;

        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3722:6: ( ( '|' ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3723:1: ( '|' )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3723:1: ( '|' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3724:2: '|'
        {
        match(input,56,FOLLOW_56_in_synpred25_InternalGuiceModules8622); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalGuiceModules

    // $ANTLR start synpred26_InternalGuiceModules
    public final void synpred26_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3791:4: ( ( ruleXClosure ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3792:1: ( ruleXClosure )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3792:1: ( ruleXClosure )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3793:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred26_InternalGuiceModules8740);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalGuiceModules

    // $ANTLR start synpred27_InternalGuiceModules
    public final void synpred27_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3936:4: ( '<' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3936:6: '<'
        {
        match(input,36,FOLLOW_36_in_synpred27_InternalGuiceModules9127); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalGuiceModules

    // $ANTLR start synpred28_InternalGuiceModules
    public final void synpred28_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3985:5: ( '(' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3985:7: '('
        {
        match(input,53,FOLLOW_53_in_synpred28_InternalGuiceModules9220); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalGuiceModules

    // $ANTLR start synpred29_InternalGuiceModules
    public final void synpred29_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3990:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3990:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3990:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3990:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3990:6: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3991:1: 
        {
        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3991:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt103=2;
        int LA103_0 = input.LA(1);

        if ( (LA103_0==RULE_ID||LA103_0==39||LA103_0==53) ) {
            alt103=1;
        }
        switch (alt103) {
            case 1 :
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3991:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3991:3: ( ( ruleJvmFormalParameter ) )
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3992:1: ( ruleJvmFormalParameter )
                {
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3992:1: ( ruleJvmFormalParameter )
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3993:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred29_InternalGuiceModules9250);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3995:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop102:
                do {
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==16) ) {
                        alt102=1;
                    }


                    switch (alt102) {
                	case 1 :
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3995:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,16,FOLLOW_16_in_synpred29_InternalGuiceModules9257); if (state.failed) return ;
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3996:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3997:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3997:1: ( ruleJvmFormalParameter )
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3998:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred29_InternalGuiceModules9264);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop102;
                    }
                } while (true);


                }
                break;

        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4000:6: ( ( '|' ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4001:1: ( '|' )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4001:1: ( '|' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4002:2: '|'
        {
        match(input,56,FOLLOW_56_in_synpred29_InternalGuiceModules9278); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred29_InternalGuiceModules

    // $ANTLR start synpred30_InternalGuiceModules
    public final void synpred30_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4069:4: ( ( ruleXClosure ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4070:1: ( ruleXClosure )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4070:1: ( ruleXClosure )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4071:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred30_InternalGuiceModules9396);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred30_InternalGuiceModules

    // $ANTLR start synpred31_InternalGuiceModules
    public final void synpred31_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4393:2: ( ( ruleXExpression ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4394:1: ( ruleXExpression )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4394:1: ( ruleXExpression )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4395:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred31_InternalGuiceModules10198);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred31_InternalGuiceModules

    // $ANTLR start synpred32_InternalGuiceModules
    public final void synpred32_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4464:5: ( 'catch' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4464:7: 'catch'
        {
        match(input,81,FOLLOW_81_in_synpred32_InternalGuiceModules10343); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalGuiceModules

    // $ANTLR start synpred33_InternalGuiceModules
    public final void synpred33_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4483:5: ( 'finally' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4483:7: 'finally'
        {
        match(input,80,FOLLOW_80_in_synpred33_InternalGuiceModules10373); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalGuiceModules

    // $ANTLR start synpred35_InternalGuiceModules
    public final void synpred35_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4631:3: ( '.' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4632:2: '.'
        {
        match(input,50,FOLLOW_50_in_synpred35_InternalGuiceModules10720); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalGuiceModules

    // $ANTLR start synpred36_InternalGuiceModules
    public final void synpred36_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4755:2: ( ( () '[' ']' ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4755:3: ( () '[' ']' )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4755:3: ( () '[' ']' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4755:4: () '[' ']'
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4755:4: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4756:1: 
        {
        }

        match(input,55,FOLLOW_55_in_synpred36_InternalGuiceModules11103); if (state.failed) return ;
        match(input,57,FOLLOW_57_in_synpred36_InternalGuiceModules11107); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred36_InternalGuiceModules

    // $ANTLR start synpred37_InternalGuiceModules
    public final void synpred37_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4909:4: ( '<' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4909:6: '<'
        {
        match(input,36,FOLLOW_36_in_synpred37_InternalGuiceModules11467); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalGuiceModules

    // Delegated rules

    public final boolean synpred32_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalGuiceModules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA90 dfa90 = new DFA90(this);
    static final String DFA17_eotS =
        "\12\uffff";
    static final String DFA17_eofS =
        "\1\1\11\uffff";
    static final String DFA17_minS =
        "\1\4\1\uffff\7\0\1\uffff";
    static final String DFA17_maxS =
        "\1\121\1\uffff\7\0\1\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\2\7\uffff\1\1";
    static final String DFA17_specialS =
        "\2\uffff\1\6\1\0\1\5\1\2\1\4\1\3\1\1\1\uffff}>";
    static final String[] DFA17_transitionS = {
            "\5\1\7\uffff\5\1\6\uffff\10\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\16"+
            "\1\1\uffff\16\1\1\uffff\12\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "()* loopback of 1186:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_3 = input.LA(1);

                         
                        int index17_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalGuiceModules()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_8 = input.LA(1);

                         
                        int index17_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalGuiceModules()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_5 = input.LA(1);

                         
                        int index17_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalGuiceModules()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_7 = input.LA(1);

                         
                        int index17_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalGuiceModules()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_6 = input.LA(1);

                         
                        int index17_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalGuiceModules()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_4 = input.LA(1);

                         
                        int index17_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalGuiceModules()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_2 = input.LA(1);

                         
                        int index17_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalGuiceModules()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA20_eotS =
        "\12\uffff";
    static final String DFA20_eofS =
        "\12\uffff";
    static final String DFA20_minS =
        "\1\43\4\uffff\1\43\4\uffff";
    static final String DFA20_maxS =
        "\1\51\4\uffff\1\44\4\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\1\5\1\6";
    static final String DFA20_specialS =
        "\12\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\4\1\5\1\1\1\2\1\3\1\6\1\7",
            "",
            "",
            "",
            "",
            "\1\11\1\10",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1251:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' kw= '>' ( ( '>' )=>kw= '>' )? ) | (kw= '<' kw= '<' ( ( '<' )=>kw= '<' )? ) | (kw= '<' kw= '>' ) | kw= '?:' | kw= '<=>' )";
        }
    }
    static final String DFA19_eotS =
        "\35\uffff";
    static final String DFA19_eofS =
        "\1\2\34\uffff";
    static final String DFA19_minS =
        "\1\4\1\0\33\uffff";
    static final String DFA19_maxS =
        "\1\117\1\0\33\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\2\31\uffff\1\1";
    static final String DFA19_specialS =
        "\1\uffff\1\0\33\uffff}>";
    static final String[] DFA19_transitionS = {
            "\5\2\10\uffff\1\2\22\uffff\1\1\5\uffff\2\2\4\uffff\1\2\4\uffff"+
            "\1\2\1\uffff\1\2\3\uffff\1\2\1\uffff\1\2\3\uffff\3\2\2\uffff"+
            "\1\2\1\uffff\10\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1305:1: ( ( '<' )=>kw= '<' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_1 = input.LA(1);

                         
                        int index19_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalGuiceModules()) ) {s = 28;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index19_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA33_eotS =
        "\102\uffff";
    static final String DFA33_eofS =
        "\1\2\101\uffff";
    static final String DFA33_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA33_maxS =
        "\1\121\1\0\100\uffff";
    static final String DFA33_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA33_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA33_transitionS = {
            "\5\2\7\uffff\5\2\6\uffff\32\2\1\1\2\2\1\uffff\16\2\1\uffff\12"+
            "\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "1950:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_1 = input.LA(1);

                         
                        int index33_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index33_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA32_eotS =
        "\36\uffff";
    static final String DFA32_eofS =
        "\36\uffff";
    static final String DFA32_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA32_maxS =
        "\1\117\2\0\33\uffff";
    static final String DFA32_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA32_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\1\4\5\10\uffff\1\5\22\uffff\1\5\2\uffff\1\3\2\uffff\2\5\4"+
            "\uffff\1\5\4\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "1971:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_0 = input.LA(1);

                         
                        int index32_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_0==RULE_ID) ) {s = 1;}

                        else if ( (LA32_0==53) ) {s = 2;}

                        else if ( (LA32_0==39) && (synpred16_InternalGuiceModules())) {s = 3;}

                        else if ( (LA32_0==56) && (synpred16_InternalGuiceModules())) {s = 4;}

                        else if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_DECIMAL)||LA32_0==17||LA32_0==36||(LA32_0>=42 && LA32_0<=43)||LA32_0==48||LA32_0==55||LA32_0==59||LA32_0==61||(LA32_0>=65 && LA32_0<=67)||LA32_0==70||(LA32_0>=72 && LA32_0<=79)) ) {s = 5;}

                        else if ( (LA32_0==54) ) {s = 29;}

                         
                        input.seek(index32_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_1 = input.LA(1);

                         
                        int index32_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalGuiceModules()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index32_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_2 = input.LA(1);

                         
                        int index32_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalGuiceModules()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index32_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA34_eotS =
        "\102\uffff";
    static final String DFA34_eofS =
        "\1\2\101\uffff";
    static final String DFA34_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA34_maxS =
        "\1\121\1\0\100\uffff";
    static final String DFA34_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA34_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA34_transitionS = {
            "\5\2\7\uffff\5\2\6\uffff\34\2\1\1\1\uffff\16\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "2050:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA40_eotS =
        "\40\uffff";
    static final String DFA40_eofS =
        "\40\uffff";
    static final String DFA40_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA40_maxS =
        "\1\117\2\0\35\uffff";
    static final String DFA40_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA40_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\1\4\5\10\uffff\1\5\22\uffff\1\5\2\uffff\1\3\2\uffff\2\5\4"+
            "\uffff\1\5\4\uffff\1\2\1\uffff\1\5\1\4\1\5\1\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\6\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "2333:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_0 = input.LA(1);

                         
                        int index40_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA40_0==RULE_ID) ) {s = 1;}

                        else if ( (LA40_0==53) ) {s = 2;}

                        else if ( (LA40_0==39) && (synpred18_InternalGuiceModules())) {s = 3;}

                        else if ( (LA40_0==56) && (synpred18_InternalGuiceModules())) {s = 4;}

                        else if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_DECIMAL)||LA40_0==17||LA40_0==36||(LA40_0>=42 && LA40_0<=43)||LA40_0==48||LA40_0==55||LA40_0==57||LA40_0==59||LA40_0==61||(LA40_0>=65 && LA40_0<=70)||(LA40_0>=72 && LA40_0<=79)) ) {s = 5;}

                         
                        input.seek(index40_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA40_1 = input.LA(1);

                         
                        int index40_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalGuiceModules()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index40_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA40_2 = input.LA(1);

                         
                        int index40_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalGuiceModules()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index40_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA64_eotS =
        "\102\uffff";
    static final String DFA64_eofS =
        "\1\2\101\uffff";
    static final String DFA64_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA64_maxS =
        "\1\121\1\0\100\uffff";
    static final String DFA64_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA64_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA64_transitionS = {
            "\5\2\7\uffff\5\2\6\uffff\32\2\1\1\2\2\1\uffff\16\2\1\uffff\12"+
            "\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "3691:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA63_eotS =
        "\36\uffff";
    static final String DFA63_eofS =
        "\36\uffff";
    static final String DFA63_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA63_maxS =
        "\1\117\2\0\33\uffff";
    static final String DFA63_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA63_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA63_transitionS = {
            "\1\1\4\5\10\uffff\1\5\22\uffff\1\5\2\uffff\1\3\2\uffff\2\5\4"+
            "\uffff\1\5\4\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "3712:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_0 = input.LA(1);

                         
                        int index63_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA63_0==RULE_ID) ) {s = 1;}

                        else if ( (LA63_0==53) ) {s = 2;}

                        else if ( (LA63_0==39) && (synpred25_InternalGuiceModules())) {s = 3;}

                        else if ( (LA63_0==56) && (synpred25_InternalGuiceModules())) {s = 4;}

                        else if ( ((LA63_0>=RULE_STRING && LA63_0<=RULE_DECIMAL)||LA63_0==17||LA63_0==36||(LA63_0>=42 && LA63_0<=43)||LA63_0==48||LA63_0==55||LA63_0==59||LA63_0==61||(LA63_0>=65 && LA63_0<=67)||LA63_0==70||(LA63_0>=72 && LA63_0<=79)) ) {s = 5;}

                        else if ( (LA63_0==54) ) {s = 29;}

                         
                        input.seek(index63_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA63_1 = input.LA(1);

                         
                        int index63_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalGuiceModules()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index63_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA63_2 = input.LA(1);

                         
                        int index63_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalGuiceModules()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index63_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 63, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\102\uffff";
    static final String DFA65_eofS =
        "\1\2\101\uffff";
    static final String DFA65_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA65_maxS =
        "\1\121\1\0\100\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA65_transitionS = {
            "\5\2\7\uffff\5\2\6\uffff\34\2\1\1\1\uffff\16\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "3791:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_1 = input.LA(1);

                         
                        int index65_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index65_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA69_eotS =
        "\102\uffff";
    static final String DFA69_eofS =
        "\1\2\101\uffff";
    static final String DFA69_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA69_maxS =
        "\1\121\1\0\100\uffff";
    static final String DFA69_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA69_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA69_transitionS = {
            "\5\2\7\uffff\5\2\6\uffff\11\2\1\1\23\2\1\uffff\16\2\1\uffff"+
            "\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "3936:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_1 = input.LA(1);

                         
                        int index69_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index69_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA72_eotS =
        "\102\uffff";
    static final String DFA72_eofS =
        "\1\2\101\uffff";
    static final String DFA72_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA72_maxS =
        "\1\121\1\0\100\uffff";
    static final String DFA72_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA72_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA72_transitionS = {
            "\5\2\7\uffff\5\2\6\uffff\32\2\1\1\2\2\1\uffff\16\2\1\uffff\12"+
            "\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "3985:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_1 = input.LA(1);

                         
                        int index72_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index72_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA71_eotS =
        "\36\uffff";
    static final String DFA71_eofS =
        "\36\uffff";
    static final String DFA71_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA71_maxS =
        "\1\117\2\0\33\uffff";
    static final String DFA71_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA71_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA71_transitionS = {
            "\1\1\4\5\10\uffff\1\5\22\uffff\1\5\2\uffff\1\3\2\uffff\2\5\4"+
            "\uffff\1\5\4\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "3990:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA71_0 = input.LA(1);

                         
                        int index71_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA71_0==RULE_ID) ) {s = 1;}

                        else if ( (LA71_0==53) ) {s = 2;}

                        else if ( (LA71_0==39) && (synpred29_InternalGuiceModules())) {s = 3;}

                        else if ( (LA71_0==56) && (synpred29_InternalGuiceModules())) {s = 4;}

                        else if ( ((LA71_0>=RULE_STRING && LA71_0<=RULE_DECIMAL)||LA71_0==17||LA71_0==36||(LA71_0>=42 && LA71_0<=43)||LA71_0==48||LA71_0==55||LA71_0==59||LA71_0==61||(LA71_0>=65 && LA71_0<=67)||LA71_0==70||(LA71_0>=72 && LA71_0<=79)) ) {s = 5;}

                        else if ( (LA71_0==54) ) {s = 29;}

                         
                        input.seek(index71_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA71_1 = input.LA(1);

                         
                        int index71_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalGuiceModules()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index71_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA71_2 = input.LA(1);

                         
                        int index71_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalGuiceModules()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index71_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 71, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA73_eotS =
        "\102\uffff";
    static final String DFA73_eofS =
        "\1\2\101\uffff";
    static final String DFA73_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA73_maxS =
        "\1\121\1\0\100\uffff";
    static final String DFA73_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA73_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA73_transitionS = {
            "\5\2\7\uffff\5\2\6\uffff\34\2\1\1\1\uffff\16\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "4069:3: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA75_eotS =
        "\102\uffff";
    static final String DFA75_eofS =
        "\1\33\101\uffff";
    static final String DFA75_minS =
        "\1\4\32\0\47\uffff";
    static final String DFA75_maxS =
        "\1\121\32\0\47\uffff";
    static final String DFA75_acceptS =
        "\33\uffff\1\2\45\uffff\1\1";
    static final String DFA75_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\47\uffff}>";
    static final String[] DFA75_transitionS = {
            "\1\1\1\21\1\15\1\16\1\17\7\uffff\1\33\1\6\3\33\6\uffff\11\33"+
            "\1\10\5\33\1\4\1\3\4\33\1\2\4\33\1\32\1\33\1\12\1\uffff\2\33"+
            "\1\23\1\33\1\7\3\33\1\24\1\25\1\26\2\33\1\11\1\uffff\1\5\1\13"+
            "\1\14\1\20\1\22\1\27\1\30\1\31\2\33",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA75_eot = DFA.unpackEncodedString(DFA75_eotS);
    static final short[] DFA75_eof = DFA.unpackEncodedString(DFA75_eofS);
    static final char[] DFA75_min = DFA.unpackEncodedStringToUnsignedChars(DFA75_minS);
    static final char[] DFA75_max = DFA.unpackEncodedStringToUnsignedChars(DFA75_maxS);
    static final short[] DFA75_accept = DFA.unpackEncodedString(DFA75_acceptS);
    static final short[] DFA75_special = DFA.unpackEncodedString(DFA75_specialS);
    static final short[][] DFA75_transition;

    static {
        int numStates = DFA75_transitionS.length;
        DFA75_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA75_transition[i] = DFA.unpackEncodedString(DFA75_transitionS[i]);
        }
    }

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = DFA75_eot;
            this.eof = DFA75_eof;
            this.min = DFA75_min;
            this.max = DFA75_max;
            this.accept = DFA75_accept;
            this.special = DFA75_special;
            this.transition = DFA75_transition;
        }
        public String getDescription() {
            return "4393:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA75_1 = input.LA(1);

                         
                        int index75_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA75_2 = input.LA(1);

                         
                        int index75_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA75_3 = input.LA(1);

                         
                        int index75_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA75_4 = input.LA(1);

                         
                        int index75_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA75_5 = input.LA(1);

                         
                        int index75_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA75_6 = input.LA(1);

                         
                        int index75_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA75_7 = input.LA(1);

                         
                        int index75_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA75_8 = input.LA(1);

                         
                        int index75_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA75_9 = input.LA(1);

                         
                        int index75_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA75_10 = input.LA(1);

                         
                        int index75_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA75_11 = input.LA(1);

                         
                        int index75_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA75_12 = input.LA(1);

                         
                        int index75_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA75_13 = input.LA(1);

                         
                        int index75_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA75_14 = input.LA(1);

                         
                        int index75_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA75_15 = input.LA(1);

                         
                        int index75_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA75_16 = input.LA(1);

                         
                        int index75_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA75_17 = input.LA(1);

                         
                        int index75_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA75_18 = input.LA(1);

                         
                        int index75_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA75_19 = input.LA(1);

                         
                        int index75_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA75_20 = input.LA(1);

                         
                        int index75_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA75_21 = input.LA(1);

                         
                        int index75_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA75_22 = input.LA(1);

                         
                        int index75_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA75_23 = input.LA(1);

                         
                        int index75_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA75_24 = input.LA(1);

                         
                        int index75_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA75_25 = input.LA(1);

                         
                        int index75_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA75_26 = input.LA(1);

                         
                        int index75_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuiceModules()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index75_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 75, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA90_eotS =
        "\104\uffff";
    static final String DFA90_eofS =
        "\1\2\103\uffff";
    static final String DFA90_minS =
        "\1\4\1\0\102\uffff";
    static final String DFA90_maxS =
        "\1\121\1\0\102\uffff";
    static final String DFA90_acceptS =
        "\2\uffff\1\2\100\uffff\1\1";
    static final String DFA90_specialS =
        "\1\uffff\1\0\102\uffff}>";
    static final String[] DFA90_transitionS = {
            "\5\2\7\uffff\7\2\4\uffff\11\2\1\1\23\2\1\uffff\16\2\1\uffff"+
            "\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA90_eot = DFA.unpackEncodedString(DFA90_eotS);
    static final short[] DFA90_eof = DFA.unpackEncodedString(DFA90_eofS);
    static final char[] DFA90_min = DFA.unpackEncodedStringToUnsignedChars(DFA90_minS);
    static final char[] DFA90_max = DFA.unpackEncodedStringToUnsignedChars(DFA90_maxS);
    static final short[] DFA90_accept = DFA.unpackEncodedString(DFA90_acceptS);
    static final short[] DFA90_special = DFA.unpackEncodedString(DFA90_specialS);
    static final short[][] DFA90_transition;

    static {
        int numStates = DFA90_transitionS.length;
        DFA90_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA90_transition[i] = DFA.unpackEncodedString(DFA90_transitionS[i]);
        }
    }

    class DFA90 extends DFA {

        public DFA90(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 90;
            this.eot = DFA90_eot;
            this.eof = DFA90_eof;
            this.min = DFA90_min;
            this.max = DFA90_max;
            this.accept = DFA90_accept;
            this.special = DFA90_special;
            this.transition = DFA90_transition;
        }
        public String getDescription() {
            return "4909:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA90_1 = input.LA(1);

                         
                        int index90_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalGuiceModules()) ) {s = 67;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index90_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 90, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleModule122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModule143 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModule164 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_14_in_ruleModule177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModule194 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleModule212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModule235 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleModule248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModule271 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleModule287 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_ruleBinding_in_ruleModule308 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_18_in_ruleModule321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_entryRuleBinding357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinding367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleBinding410 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBinding436 = new BitSet(new long[]{0x0020008000800010L});
    public static final BitSet FOLLOW_ruleKey_in_ruleBinding457 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_21_in_ruleBinding471 = new BitSet(new long[]{0x0020008000800010L});
    public static final BitSet FOLLOW_ruleKey_in_ruleBinding492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBinding512 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleBinding533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKey_in_entryRuleKey572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKey582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationRef_in_ruleKey628 = new BitSet(new long[]{0x0020008000800010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleKey650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationRef_in_entryRuleAnnotationRef686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationRef696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAnnotationRef733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAnnotationRef756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleImport839 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard955 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleQualifiedNameWithWildCard974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1174 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1190 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1240 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1293 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpSingleAssign1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpMultiAssign1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1588 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1641 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1664 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOr1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1847 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1900 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1923 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpAnd2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2106 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2159 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2182 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpEquality2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpEquality2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2386 = new BitSet(new long[]{0x0000001F00000002L});
    public static final BitSet FOLLOW_32_in_ruleXRelationalExpression2422 = new BitSet(new long[]{0x0020008000800010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2445 = new BitSet(new long[]{0x0000001F00000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2506 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2529 = new BitSet(new long[]{0x0000001F00000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpCompare2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpCompare2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpCompare2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpCompare2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2772 = new BitSet(new long[]{0x000003F800000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2825 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2848 = new BitSet(new long[]{0x000003F800000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpOther2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpOther2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpOther2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpOther2994 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleOpOther3007 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleOpOther3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpOther3052 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleOpOther3065 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpOther3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpOther3110 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleOpOther3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpOther3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpOther3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3259 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3312 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3335 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpAdd3423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpAdd3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3539 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3592 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3615 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpMulti3703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpMulti3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOpMulti3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOpMulti3760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3868 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOpUnary4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpUnary4022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpUnary4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4138 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXCastedExpression4173 = new BitSet(new long[]{0x0020008000800010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4196 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4291 = new BitSet(new long[]{0x001C000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXMemberFeatureCall4340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4363 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4379 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4401 = new BitSet(new long[]{0x001C000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXMemberFeatureCall4487 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_51_in_ruleXMemberFeatureCall4511 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_52_in_ruleXMemberFeatureCall4548 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_36_in_ruleXMemberFeatureCall4577 = new BitSet(new long[]{0x0020008000800010L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4598 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_16_in_ruleXMemberFeatureCall4611 = new BitSet(new long[]{0x0020008000800010L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4632 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_35_in_ruleXMemberFeatureCall4646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4671 = new BitSet(new long[]{0x00BC000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXMemberFeatureCall4705 = new BitSet(new long[]{0x29E10C90008201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4790 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4818 = new BitSet(new long[]{0x0040000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXMemberFeatureCall4831 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4852 = new BitSet(new long[]{0x0040000000010000L});
    public static final BitSet FOLLOW_54_in_ruleXMemberFeatureCall4869 = new BitSet(new long[]{0x009C000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4902 = new BitSet(new long[]{0x001C000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXClosure5641 = new BitSet(new long[]{0x2BA10C90008201F0L,0x000000000000FF7EL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5712 = new BitSet(new long[]{0x0100000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXClosure5725 = new BitSet(new long[]{0x0020008000800010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5746 = new BitSet(new long[]{0x0100000000010000L});
    public static final BitSet FOLLOW_56_in_ruleXClosure5768 = new BitSet(new long[]{0x2AA10C10000201F0L,0x000000000000FF7EL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5805 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXClosure5817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5919 = new BitSet(new long[]{0x2CA10C10000201F2L,0x000000000000FF7EL});
    public static final BitSet FOLLOW_58_in_ruleXExpressionInClosure5932 = new BitSet(new long[]{0x28A10C10000201F2L,0x000000000000FF7EL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6090 = new BitSet(new long[]{0x0100000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXShortClosure6103 = new BitSet(new long[]{0x0020008000800010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6124 = new BitSet(new long[]{0x0100000000010000L});
    public static final BitSet FOLLOW_56_in_ruleXShortClosure6146 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXParenthesizedExpression6265 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6287 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXParenthesizedExpression6298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXIfExpression6390 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXIfExpression6402 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6423 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXIfExpression6435 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6456 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXIfExpression6477 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXSwitchExpression6593 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6636 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleXSwitchExpression6648 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6672 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6737 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleXSwitchExpression6749 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6772 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6784 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXSwitchExpression6798 = new BitSet(new long[]{0x4020008000800010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6819 = new BitSet(new long[]{0xC020008000840010L,0x0000000000000001L});
    public static final BitSet FOLLOW_63_in_ruleXSwitchExpression6833 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleXSwitchExpression6845 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6866 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXSwitchExpression6880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6972 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleXCasePart6986 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7007 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleXCasePart7021 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression7088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXForLoopExpression7134 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXForLoopExpression7146 = new BitSet(new long[]{0x0020008000800010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7167 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleXForLoopExpression7179 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7200 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXForLoopExpression7212 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXWhileExpression7325 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXWhileExpression7337 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7358 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXWhileExpression7370 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXDoWhileExpression7483 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleXDoWhileExpression7516 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXDoWhileExpression7528 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7549 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXDoWhileExpression7561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleXBlockExpression7653 = new BitSet(new long[]{0x28A10C10000601F0L,0x000000000000FF7EL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7675 = new BitSet(new long[]{0x2CA10C10000601F0L,0x000000000000FF7EL});
    public static final BitSet FOLLOW_58_in_ruleXBlockExpression7688 = new BitSet(new long[]{0x28A10C10000601F0L,0x000000000000FF7EL});
    public static final BitSet FOLLOW_18_in_ruleXBlockExpression7704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXVariableDeclaration7922 = new BitSet(new long[]{0x0020008000800010L});
    public static final BitSet FOLLOW_69_in_ruleXVariableDeclaration7953 = new BitSet(new long[]{0x0020008000800010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8022 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8051 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleXVariableDeclaration8065 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8180 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8418 = new BitSet(new long[]{0x0000001000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_36_in_ruleXFeatureCall8432 = new BitSet(new long[]{0x0020008000800010L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8453 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_16_in_ruleXFeatureCall8466 = new BitSet(new long[]{0x0020008000800010L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8487 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_35_in_ruleXFeatureCall8501 = new BitSet(new long[]{0x0000001000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8526 = new BitSet(new long[]{0x00A0000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXFeatureCall8560 = new BitSet(new long[]{0x29E10C90008201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8645 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8673 = new BitSet(new long[]{0x0040000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXFeatureCall8686 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8707 = new BitSet(new long[]{0x0040000000010000L});
    public static final BitSet FOLLOW_54_in_ruleXFeatureCall8724 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleIdOrSuper8877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleStaticQualifier8994 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall9045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXConstructorCall9091 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9114 = new BitSet(new long[]{0x00A0001000000002L});
    public static final BitSet FOLLOW_36_in_ruleXConstructorCall9135 = new BitSet(new long[]{0x0020008000800010L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9157 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_16_in_ruleXConstructorCall9170 = new BitSet(new long[]{0x0020008000800010L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9191 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_35_in_ruleXConstructorCall9205 = new BitSet(new long[]{0x00A0000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXConstructorCall9228 = new BitSet(new long[]{0x29E10C90008201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9301 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9329 = new BitSet(new long[]{0x0040000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXConstructorCall9342 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9363 = new BitSet(new long[]{0x0040000000010000L});
    public static final BitSet FOLLOW_54_in_ruleXConstructorCall9380 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXBooleanLiteral9507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXBooleanLiteral9531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXNullLiteral9637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXTypeLiteral9932 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXTypeLiteral9944 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9967 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXTypeLiteral9979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression10025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleXThrowExpression10071 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression10092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleXReturnExpression10184 = new BitSet(new long[]{0x28A10C10000201F2L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleXTryCatchFinallyExpression10308 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10359 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_80_in_ruleXTryCatchFinallyExpression10381 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleXTryCatchFinallyExpression10425 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleXCatchClause10539 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXCatchClause10552 = new BitSet(new long[]{0x0020008000800010L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10573 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXCatchClause10585 = new BitSet(new long[]{0x28A10C10000201F0L,0x000000000000FF4EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10701 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleQualifiedName10729 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10752 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10889 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10915 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleNumber10935 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference11040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11088 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleJvmTypeReference11126 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleJvmTypeReference11138 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef11215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXFunctionTypeRef11253 = new BitSet(new long[]{0x0060008000800010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11275 = new BitSet(new long[]{0x0040000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXFunctionTypeRef11288 = new BitSet(new long[]{0x0020008000800010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11309 = new BitSet(new long[]{0x0040000000010000L});
    public static final BitSet FOLLOW_54_in_ruleXFunctionTypeRef11325 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXFunctionTypeRef11339 = new BitSet(new long[]{0x0020008000800010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11454 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleJvmParameterizedTypeReference11475 = new BitSet(new long[]{0x0020008000800010L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11497 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_16_in_ruleJvmParameterizedTypeReference11510 = new BitSet(new long[]{0x0020008000800010L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11531 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_35_in_ruleJvmParameterizedTypeReference11545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleJvmWildcardTypeReference11758 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080040L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleJvmUpperBound11892 = new BitSet(new long[]{0x0020008000800010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleJvmUpperBoundAnded11996 = new BitSet(new long[]{0x0020008000800010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound12063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleJvmLowerBound12100 = new BitSet(new long[]{0x0020008000800010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID12160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID12171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID12210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalGuiceModules1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalGuiceModules1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalGuiceModules1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalGuiceModules2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred5_InternalGuiceModules2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalGuiceModules2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalGuiceModules2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred8_InternalGuiceModules3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred9_InternalGuiceModules3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalGuiceModules3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalGuiceModules3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred12_InternalGuiceModules4154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred13_InternalGuiceModules4308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred13_InternalGuiceModules4317 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalGuiceModules4323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred14_InternalGuiceModules4426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred14_InternalGuiceModules4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred14_InternalGuiceModules4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred15_InternalGuiceModules4687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalGuiceModules4739 = new BitSet(new long[]{0x0100000000010000L});
    public static final BitSet FOLLOW_16_in_synpred16_InternalGuiceModules4746 = new BitSet(new long[]{0x0020008000800010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalGuiceModules4753 = new BitSet(new long[]{0x0100000000010000L});
    public static final BitSet FOLLOW_56_in_synpred16_InternalGuiceModules4767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred17_InternalGuiceModules4885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred18_InternalGuiceModules5658 = new BitSet(new long[]{0x0100000000010000L});
    public static final BitSet FOLLOW_16_in_synpred18_InternalGuiceModules5665 = new BitSet(new long[]{0x0020008000800010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred18_InternalGuiceModules5672 = new BitSet(new long[]{0x0100000000010000L});
    public static final BitSet FOLLOW_56_in_synpred18_InternalGuiceModules5686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_synpred20_InternalGuiceModules6469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred21_InternalGuiceModules6611 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_synpred21_InternalGuiceModules6617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred22_InternalGuiceModules6693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred22_InternalGuiceModules6700 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_synpred22_InternalGuiceModules6706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred23_InternalGuiceModules7971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalGuiceModules7980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred24_InternalGuiceModules8542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred25_InternalGuiceModules8594 = new BitSet(new long[]{0x0100000000010000L});
    public static final BitSet FOLLOW_16_in_synpred25_InternalGuiceModules8601 = new BitSet(new long[]{0x0020008000800010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred25_InternalGuiceModules8608 = new BitSet(new long[]{0x0100000000010000L});
    public static final BitSet FOLLOW_56_in_synpred25_InternalGuiceModules8622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred26_InternalGuiceModules8740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred27_InternalGuiceModules9127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred28_InternalGuiceModules9220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred29_InternalGuiceModules9250 = new BitSet(new long[]{0x0100000000010000L});
    public static final BitSet FOLLOW_16_in_synpred29_InternalGuiceModules9257 = new BitSet(new long[]{0x0020008000800010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred29_InternalGuiceModules9264 = new BitSet(new long[]{0x0100000000010000L});
    public static final BitSet FOLLOW_56_in_synpred29_InternalGuiceModules9278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred30_InternalGuiceModules9396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred31_InternalGuiceModules10198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_synpred32_InternalGuiceModules10343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_synpred33_InternalGuiceModules10373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred35_InternalGuiceModules10720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred36_InternalGuiceModules11103 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred36_InternalGuiceModules11107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred37_InternalGuiceModules11467 = new BitSet(new long[]{0x0000000000000002L});

}