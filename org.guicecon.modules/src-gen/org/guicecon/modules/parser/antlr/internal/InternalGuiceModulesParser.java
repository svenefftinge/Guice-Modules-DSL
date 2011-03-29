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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'module'", "'mixin'", "','", "'{'", "'}'", "'override'", "'bind'", "'to'", "'toInstance'", "'@'", "'import'", "'.*'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "'('", "')'", "'['", "'|'", "']'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'for'", "'while'", "'do'", "';'", "'var'", "'val'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'", "'super'"
    };
    public static final int T__42=42;
    public static final int T__12=12;
    public static final int T__28=28;
    public static final int T__57=57;
    public static final int T__23=23;
    public static final int T__80=80;
    public static final int T__51=51;
    public static final int T__13=13;
    public static final int RULE_STRING=6;
    public static final int T__69=69;
    public static final int T__47=47;
    public static final int T__73=73;
    public static final int T__50=50;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__19=19;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__67=67;
    public static final int T__74=74;
    public static final int T__39=39;
    public static final int T__30=30;
    public static final int T__52=52;
    public static final int T__46=46;
    public static final int T__68=68;
    public static final int T__17=17;
    public static final int T__62=62;
    public static final int RULE_INT=5;
    public static final int T__27=27;
    public static final int T__24=24;
    public static final int T__49=49;
    public static final int T__61=61;
    public static final int T__59=59;
    public static final int T__54=54;
    public static final int T__48=48;
    public static final int T__34=34;
    public static final int T__56=56;
    public static final int T__15=15;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__35=35;
    public static final int RULE_ID=4;
    public static final int T__78=78;
    public static final int T__36=36;
    public static final int T__20=20;
    public static final int T__58=58;
    public static final int T__79=79;
    public static final int T__64=64;
    public static final int T__44=44;
    public static final int T__66=66;
    public static final int T__14=14;
    public static final int T__33=33;
    public static final int T__22=22;
    public static final int T__11=11;
    public static final int T__77=77;
    public static final int T__55=55;
    public static final int T__29=29;
    public static final int T__45=45;
    public static final int RULE_WS=9;
    public static final int T__63=63;
    public static final int T__75=75;
    public static final int T__43=43;
    public static final int T__31=31;
    public static final int T__40=40;
    public static final int EOF=-1;
    public static final int T__53=53;
    public static final int T__16=16;
    public static final int T__32=32;
    public static final int T__38=38;
    public static final int T__76=76;
    public static final int T__37=37;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__60=60;
    public static final int T__41=41;
    public static final int T__71=71;
    public static final int T__18=18;

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
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModule122); if (state.failed) return current;
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

                if ( (LA1_0==22) ) {
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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleModule177); if (state.failed) return current;
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

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:142:4: otherlv_5= 'mixin' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleModule212); if (state.failed) return current;
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

                        if ( (LA2_0==14) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:161:4: otherlv_7= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleModule248); if (state.failed) return current;
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

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleModule287); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_6());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:184:1: ( (lv_bindings_10_0= ruleBinding ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=17 && LA4_0<=18)) ) {
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

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleModule321); if (state.failed) return current;
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

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:228:1: (lv_override_0_0= 'override' )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:228:1: (lv_override_0_0= 'override' )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:229:3: lv_override_0_0= 'override'
                    {
                    lv_override_0_0=(Token)match(input,17,FOLLOW_17_in_ruleBinding410); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleBinding436); if (state.failed) return current;
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

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            switch (alt6) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:264:3: (otherlv_3= 'to' ( (lv_to_4_0= ruleKey ) ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:264:3: (otherlv_3= 'to' ( (lv_to_4_0= ruleKey ) ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:264:5: otherlv_3= 'to' ( (lv_to_4_0= ruleKey ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleBinding471); if (state.failed) return current;
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
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleBinding512); if (state.failed) return current;
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

            if ( (LA7_0==21) ) {
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
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleAnnotationRef733); if (state.failed) return current;
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
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleImport839); if (state.failed) return current;
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

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:482:2: kw= '.*'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleQualifiedNameWithWildCard974); if (state.failed) return current;
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:534:1: ruleXAssignment returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:537:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:538:1: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:538:1: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==24) ) {
                    alt10=1;
                }
                else if ( (LA10_1==EOF||(LA10_1>=RULE_ID && LA10_1<=RULE_STRING)||(LA10_1>=14 && LA10_1<=18)||(LA10_1>=25 && LA10_1<=50)||(LA10_1>=52 && LA10_1<=76)) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_STRING)||LA10_0==15||LA10_0==34||(LA10_0>=37 && LA10_0<=38)||LA10_0==43||LA10_0==48||LA10_0==50||LA10_0==53||LA10_0==55||(LA10_0>=59 && LA10_0<=61)||(LA10_0>=66 && LA10_0<=73)) ) {
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:538:2: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:538:2: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:538:3: () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
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

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:544:2: ( (otherlv_1= RULE_ID ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:545:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:545:1: (otherlv_1= RULE_ID )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:546:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXAssignment1171); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1187);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:565:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:566:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:566:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:567:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1207);
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:584:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:584:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:585:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1237);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:593:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==25) ) {
                        int LA9_1 = input.LA(2);

                        if ( (synpred1_InternalGuiceModules()) ) {
                            alt9=1;
                        }
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:593:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:593:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:593:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:598:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:598:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:598:7: ()
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:599:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:604:2: ( ( ruleOpMultiAssign ) )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:605:1: ( ruleOpMultiAssign )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:605:1: ( ruleOpMultiAssign )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:606:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1290);
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

                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:619:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:620:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:620:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:621:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1313);
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:645:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:646:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:647:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1353);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1364); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:654:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:657:28: (kw= '=' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:659:2: kw= '='
            {
            kw=(Token)match(input,24,FOLLOW_24_in_ruleOpSingleAssign1401); if (state.failed) return current;
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:672:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:673:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:674:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1441);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1452); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:681:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:684:28: (kw= '+=' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:686:2: kw= '+='
            {
            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpMultiAssign1489); if (state.failed) return current;
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:699:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:700:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:701:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1528);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1538); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:708:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:711:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:712:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:712:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:713:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1585);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:721:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    int LA11_2 = input.LA(2);

                    if ( (synpred2_InternalGuiceModules()) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:721:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:721:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:721:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:726:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:726:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:726:7: ()
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:727:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:732:2: ( ( ruleOpOr ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:733:1: ( ruleOpOr )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:733:1: ( ruleOpOr )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:734:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1638);
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

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:747:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:748:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:748:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:749:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1661);
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:773:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:774:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:775:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1700);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1711); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:782:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:785:28: (kw= '||' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:787:2: kw= '||'
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOr1748); if (state.failed) return current;
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:800:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:801:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:802:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1787);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1797); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:809:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:812:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:813:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:813:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:814:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1844);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:822:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred3_InternalGuiceModules()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:822:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:822:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:822:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:827:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:827:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:827:7: ()
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:828:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:833:2: ( ( ruleOpAnd ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:834:1: ( ruleOpAnd )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:834:1: ( ruleOpAnd )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:835:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1897);
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

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:848:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:849:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:849:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:850:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1920);
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:874:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:875:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:876:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1959);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1970); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:883:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:886:28: (kw= '&&' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:888:2: kw= '&&'
            {
            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpAnd2007); if (state.failed) return current;
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:901:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:902:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:903:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2046);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2056); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:910:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:913:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:914:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:914:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:915:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2103);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:923:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred4_InternalGuiceModules()) ) {
                        alt13=1;
                    }


                }
                else if ( (LA13_0==29) ) {
                    int LA13_3 = input.LA(2);

                    if ( (synpred4_InternalGuiceModules()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:923:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:923:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:923:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:928:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:928:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:928:7: ()
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:929:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:934:2: ( ( ruleOpEquality ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:935:1: ( ruleOpEquality )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:935:1: ( ruleOpEquality )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:936:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2156);
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

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:949:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:950:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:950:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:951:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2179);
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:975:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:976:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:977:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2218);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2229); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:984:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:987:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:988:1: (kw= '==' | kw= '!=' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:988:1: (kw= '==' | kw= '!=' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            else if ( (LA14_0==29) ) {
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:989:2: kw= '=='
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpEquality2267); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:996:2: kw= '!='
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpEquality2286); if (state.failed) return current;
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1009:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1010:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1011:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2326);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2336); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1018:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1021:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1022:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1022:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1023:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2383);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1031:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop15:
            do {
                int alt15=3;
                switch ( input.LA(1) ) {
                case 30:
                    {
                    int LA15_2 = input.LA(2);

                    if ( (synpred5_InternalGuiceModules()) ) {
                        alt15=1;
                    }


                    }
                    break;
                case 31:
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

                    if ( (synpred6_InternalGuiceModules()) ) {
                        alt15=2;
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
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1031:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1031:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1031:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1031:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1031:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1033:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1033:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1033:6: ()
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1034:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleXRelationalExpression2419); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1043:3: ( ( ruleQualifiedName ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1044:1: ( ruleQualifiedName )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1044:1: ( ruleQualifiedName )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1045:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2444);
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
            	    break;
            	case 2 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1059:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1059:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1059:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1059:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1059:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1064:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1064:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1064:7: ()
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1065:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1070:2: ( ( ruleOpCompare ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1071:1: ( ruleOpCompare )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1071:1: ( ruleOpCompare )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1072:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2505);
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

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1085:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1086:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1086:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1087:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2528);
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1111:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1112:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1113:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2568);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2579); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1120:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1123:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1124:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1124:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt16=1;
                }
                break;
            case 32:
                {
                alt16=2;
                }
                break;
            case 33:
                {
                alt16=3;
                }
                break;
            case 34:
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1125:2: kw= '>='
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpCompare2617); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1132:2: kw= '<='
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpCompare2636); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1139:2: kw= '>'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpCompare2655); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1146:2: kw= '<'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpCompare2674); if (state.failed) return current;
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1159:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1160:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1161:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2714);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2724); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1168:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1171:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1172:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1172:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1173:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2771);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1181:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35) ) {
                    int LA17_2 = input.LA(2);

                    if ( (synpred7_InternalGuiceModules()) ) {
                        alt17=1;
                    }


                }
                else if ( (LA17_0==36) ) {
                    int LA17_3 = input.LA(2);

                    if ( (synpred7_InternalGuiceModules()) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1181:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1181:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1181:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1186:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1186:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1186:7: ()
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1187:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1192:2: ( ( ruleOpOther ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1193:1: ( ruleOpOther )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1193:1: ( ruleOpOther )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1194:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2824);
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

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1207:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1208:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1208:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1209:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2847);
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1233:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1234:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1235:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2886);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2897); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1242:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1245:28: ( (kw= '->' | kw= '..' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1246:1: (kw= '->' | kw= '..' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1246:1: (kw= '->' | kw= '..' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            else if ( (LA18_0==36) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1247:2: kw= '->'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther2935); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1254:2: kw= '..'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpOther2954); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1267:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1268:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1269:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2994);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3004); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1276:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1279:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1280:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1280:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1281:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3051);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1289:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==37) ) {
                    int LA19_2 = input.LA(2);

                    if ( (synpred8_InternalGuiceModules()) ) {
                        alt19=1;
                    }


                }
                else if ( (LA19_0==38) ) {
                    int LA19_3 = input.LA(2);

                    if ( (synpred8_InternalGuiceModules()) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1289:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1289:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1289:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1294:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1294:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1294:7: ()
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1295:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1300:2: ( ( ruleOpAdd ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1301:1: ( ruleOpAdd )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1301:1: ( ruleOpAdd )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1302:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3104);
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

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1315:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1316:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1316:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1317:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3127);
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
            	    break loop19;
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1341:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1342:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1343:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3166);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3177); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1350:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1353:28: ( (kw= '+' | kw= '-' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1354:1: (kw= '+' | kw= '-' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1354:1: (kw= '+' | kw= '-' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            else if ( (LA20_0==38) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1355:2: kw= '+'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpAdd3215); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1362:2: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpAdd3234); if (state.failed) return current;
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1375:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1376:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1377:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3274);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3284); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1384:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1387:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1388:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1388:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1389:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3331);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1397:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop21:
            do {
                int alt21=2;
                switch ( input.LA(1) ) {
                case 39:
                    {
                    int LA21_2 = input.LA(2);

                    if ( (synpred9_InternalGuiceModules()) ) {
                        alt21=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA21_3 = input.LA(2);

                    if ( (synpred9_InternalGuiceModules()) ) {
                        alt21=1;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA21_4 = input.LA(2);

                    if ( (synpred9_InternalGuiceModules()) ) {
                        alt21=1;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA21_5 = input.LA(2);

                    if ( (synpred9_InternalGuiceModules()) ) {
                        alt21=1;
                    }


                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1397:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1397:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1397:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1402:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1402:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1402:7: ()
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1403:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1408:2: ( ( ruleOpMulti ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1409:1: ( ruleOpMulti )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1409:1: ( ruleOpMulti )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1410:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3384);
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

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1423:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1424:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1424:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1425:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3407);
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1449:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1450:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1451:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3446);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3457); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1458:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1461:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1462:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1462:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt22=1;
                }
                break;
            case 40:
                {
                alt22=2;
                }
                break;
            case 41:
                {
                alt22=3;
                }
                break;
            case 42:
                {
                alt22=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1463:2: kw= '*'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpMulti3495); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1470:2: kw= '**'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpMulti3514); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1477:2: kw= '/'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpMulti3533); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1484:2: kw= '%'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpMulti3552); if (state.failed) return current;
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1497:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1498:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1499:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3592);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3602); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1506:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1509:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1510:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1510:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=37 && LA23_0<=38)||LA23_0==43) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_STRING)||LA23_0==15||LA23_0==34||LA23_0==48||LA23_0==50||LA23_0==53||LA23_0==55||(LA23_0>=59 && LA23_0<=61)||(LA23_0>=66 && LA23_0<=73)) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1510:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1510:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1510:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1510:3: ()
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1511:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1516:2: ( ( ruleOpUnary ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1517:1: ( ruleOpUnary )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1517:1: ( ruleOpUnary )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1518:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3660);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1531:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1532:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1532:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1533:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3681);
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1551:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3710);
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1567:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1568:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1569:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3746);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3757); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1576:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1579:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1580:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1580:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt24=1;
                }
                break;
            case 38:
                {
                alt24=2;
                }
                break;
            case 37:
                {
                alt24=3;
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1581:2: kw= '!'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpUnary3795); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1588:2: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpUnary3814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1595:2: kw= '+'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpUnary3833); if (state.failed) return current;
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1608:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1609:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1610:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3873);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3883); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1617:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1620:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1621:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1621:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1622:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3930);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1630:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==44) ) {
                    int LA25_2 = input.LA(2);

                    if ( (synpred10_InternalGuiceModules()) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1630:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1630:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1630:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1632:5: ( () otherlv_2= 'as' )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1632:6: () otherlv_2= 'as'
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1632:6: ()
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1633:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXCastedExpression3965); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1642:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1643:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1643:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1644:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3988);
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
            	    break loop25;
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1668:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1669:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1670:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4026);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4036); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1677:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
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


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1680:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1681:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1681:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1682:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4083);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1690:1: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            loop32:
            do {
                int alt32=3;
                switch ( input.LA(1) ) {
                case 45:
                    {
                    int LA32_2 = input.LA(2);

                    if ( (synpred11_InternalGuiceModules()) ) {
                        alt32=1;
                    }
                    else if ( (synpred12_InternalGuiceModules()) ) {
                        alt32=2;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA32_3 = input.LA(2);

                    if ( (synpred12_InternalGuiceModules()) ) {
                        alt32=2;
                    }


                    }
                    break;
                case 47:
                    {
                    int LA32_4 = input.LA(2);

                    if ( (synpred12_InternalGuiceModules()) ) {
                        alt32=2;
                    }


                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1690:2: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1690:2: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1690:3: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1690:3: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1690:4: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1697:25: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1697:26: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1697:26: ()
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1698:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4132); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1707:1: ( (otherlv_3= RULE_ID ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1708:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1708:1: (otherlv_3= RULE_ID )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1709:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXMemberFeatureCall4152); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4168);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1728:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1729:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1729:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1730:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4190);
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
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1747:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1747:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1747:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1747:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1747:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1763:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1763:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1763:8: ()
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1764:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1769:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt26=3;
            	    switch ( input.LA(1) ) {
            	    case 45:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case 47:
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
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1769:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4276); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1774:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1774:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1775:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1775:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1776:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,46,FOLLOW_46_in_ruleXMemberFeatureCall4300); if (state.failed) return current;
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
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1790:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1790:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1791:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1791:1: (lv_spreading_9_0= '*.' )
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1792:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,47,FOLLOW_47_in_ruleXMemberFeatureCall4337); if (state.failed) return current;
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

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1805:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==34) ) {
            	        alt28=1;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1805:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,34,FOLLOW_34_in_ruleXMemberFeatureCall4366); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1809:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1810:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1810:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1811:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4387);
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

            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1827:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop27:
            	            do {
            	                int alt27=2;
            	                int LA27_0 = input.LA(1);

            	                if ( (LA27_0==14) ) {
            	                    alt27=1;
            	                }


            	                switch (alt27) {
            	            	case 1 :
            	            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1827:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleXMemberFeatureCall4400); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1831:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1832:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1832:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1833:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4421);
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
            	            	    break loop27;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,33,FOLLOW_33_in_ruleXMemberFeatureCall4435); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1853:3: ( (otherlv_15= RULE_ID ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1854:1: (otherlv_15= RULE_ID )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1854:1: (otherlv_15= RULE_ID )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1855:3: otherlv_15= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXMemberFeatureCall4457); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_15, grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1866:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt31=2;
            	    alt31 = dfa31.predict(input);
            	    switch (alt31) {
            	        case 1 :
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1866:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1866:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1866:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1873:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1874:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,48,FOLLOW_48_in_ruleXMemberFeatureCall4491); if (state.failed) return current;
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

            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1887:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt30=3;
            	            alt30 = dfa30.predict(input);
            	            switch (alt30) {
            	                case 1 :
            	                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1887:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1887:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1887:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1899:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1900:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4566);
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
            	                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1917:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1917:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1917:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1917:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1918:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1918:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1919:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4594);
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

            	                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1935:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop29:
            	                    do {
            	                        int alt29=2;
            	                        int LA29_0 = input.LA(1);

            	                        if ( (LA29_0==14) ) {
            	                            alt29=1;
            	                        }


            	                        switch (alt29) {
            	                    	case 1 :
            	                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1935:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,14,FOLLOW_14_in_ruleXMemberFeatureCall4607); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1939:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1940:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1940:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1941:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4628);
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
            	                    	    break loop29;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,49,FOLLOW_49_in_ruleXMemberFeatureCall4645); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1969:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1970:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1971:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4686);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4696); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1978:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1981:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1982:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1982:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt33=13;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt33=1;
                }
                break;
            case 15:
                {
                alt33=2;
                }
                break;
            case 55:
                {
                alt33=3;
                }
                break;
            case RULE_ID:
            case 34:
                {
                alt33=4;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 50:
            case 67:
            case 68:
            case 69:
            case 70:
                {
                alt33=5;
                }
                break;
            case 53:
                {
                alt33=6;
                }
                break;
            case 59:
                {
                alt33=7;
                }
                break;
            case 60:
                {
                alt33=8;
                }
                break;
            case 61:
                {
                alt33=9;
                }
                break;
            case 71:
                {
                alt33=10;
                }
                break;
            case 72:
                {
                alt33=11;
                }
                break;
            case 73:
                {
                alt33=12;
                }
                break;
            case 48:
                {
                alt33=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1983:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4743);
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1993:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4770);
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2003:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4797);
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2013:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4824);
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2023:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4851);
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2033:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4878);
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2043:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4905);
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2053:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4932);
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2063:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4959);
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2073:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4986);
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2083:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5013);
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2093:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5040);
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2103:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5067);
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2119:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2120:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2121:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5102);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5112); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2128:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XIntLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2131:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2132:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2132:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt34=6;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt34=1;
                }
                break;
            case 67:
            case 68:
                {
                alt34=2;
                }
                break;
            case RULE_INT:
                {
                alt34=3;
                }
                break;
            case 69:
                {
                alt34=4;
                }
                break;
            case RULE_STRING:
                {
                alt34=5;
                }
                break;
            case 70:
                {
                alt34=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2133:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5159);
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2143:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5186);
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2153:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral5213);
                    this_XIntLiteral_2=ruleXIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIntLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2163:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5240);
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2173:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5267);
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2183:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5294);
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2199:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2200:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2201:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5329);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5339); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2208:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_formalParameters_2_0 = null;

        EObject lv_formalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2211:28: ( ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2212:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2212:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2212:2: () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']'
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2212:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2213:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXClosure5385); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2222:1: ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID||LA36_0==48||LA36_0==76) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2222:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2222:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2223:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2223:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2224:3: lv_formalParameters_2_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5407);
                    lv_formalParameters_2_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"formalParameters",
                              		lv_formalParameters_2_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2240:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==14) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2240:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleXClosure5420); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2244:1: ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2245:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2245:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2246:3: lv_formalParameters_4_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5441);
                    	    lv_formalParameters_4_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"formalParameters",
                    	              		lv_formalParameters_4_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,51,FOLLOW_51_in_ruleXClosure5457); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXClosureAccess().getVerticalLineKeyword_3());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2266:1: ( (lv_expression_6_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2267:1: (lv_expression_6_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2267:1: (lv_expression_6_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2268:3: lv_expression_6_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXClosure5478);
            lv_expression_6_0=ruleXExpression();

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
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,52,FOLLOW_52_in_ruleXClosure5490); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_5());
                  
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


    // $ANTLR start "entryRuleXShortClosure"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2296:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2297:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2298:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5526);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5536); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2305:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalParameters_1_0 = null;

        EObject lv_formalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2308:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2309:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2309:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2309:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2309:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2309:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2320:5: ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2320:6: () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|'
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2320:6: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2321:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2326:2: ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID||LA38_0==48||LA38_0==76) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2326:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2326:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2327:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2327:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2328:3: lv_formalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5634);
                    lv_formalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"formalParameters",
                              		lv_formalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2344:2: (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==14) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2344:4: otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleXShortClosure5647); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2348:1: ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2349:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2349:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2350:3: lv_formalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5668);
                    	    lv_formalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"formalParameters",
                    	              		lv_formalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleXShortClosure5684); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXShortClosureAccess().getVerticalLineKeyword_0_0_2());
                  
            }

            }


            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2370:3: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2371:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2371:1: (lv_expression_5_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2372:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5707);
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2396:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2397:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2398:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5743);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5753); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2405:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2408:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2409:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2409:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2409:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleXParenthesizedExpression5790); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5812);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXParenthesizedExpression5823); if (state.failed) return current;
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2434:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2435:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2436:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5859);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5869); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2443:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2446:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2447:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2447:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2447:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2447:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2448:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXIfExpression5915); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXIfExpression5927); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2461:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2462:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2462:1: (lv_if_3_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2463:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5948);
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

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXIfExpression5960); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2483:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2484:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2484:1: (lv_then_5_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2485:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5981);
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

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2501:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==54) ) {
                int LA39_1 = input.LA(2);

                if ( (synpred16_InternalGuiceModules()) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2501:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2501:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2501:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,54,FOLLOW_54_in_ruleXIfExpression6002); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2506:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2507:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2507:1: (lv_else_7_0= ruleXExpression )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2508:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6024);
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2532:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2533:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2534:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6062);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6072); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2541:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_localVarName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_switch_4_0 = null;

        EObject lv_cases_6_0 = null;

        EObject lv_default_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2544:28: ( ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2545:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2545:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2545:2: () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2545:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2546:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression6118); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2555:1: ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==56) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2555:2: ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':'
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2555:2: ( (lv_localVarName_2_0= RULE_ID ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2556:1: (lv_localVarName_2_0= RULE_ID )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2556:1: (lv_localVarName_2_0= RULE_ID )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2557:3: lv_localVarName_2_0= RULE_ID
                    {
                    lv_localVarName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXSwitchExpression6136); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_localVarName_2_0, grammarAccess.getXSwitchExpressionAccess().getLocalVarNameIDTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_2_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression6153); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2577:3: ( (lv_switch_4_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2578:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2578:1: (lv_switch_4_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2579:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6176);
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleXSwitchExpression6188); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2599:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID||LA41_0==48||LA41_0==56||LA41_0==58||LA41_0==76) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2600:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2600:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2601:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6209);
            	    lv_cases_6_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_6_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2617:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==57) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2617:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6223); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression6235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2625:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2626:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2626:1: (lv_default_9_0= ruleXExpression )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2627:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6256);
                    lv_default_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_9_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleXSwitchExpression6270); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_7());
                  
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2655:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2656:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2657:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6306);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6316); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2664:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2667:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2668:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2668:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2668:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2668:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID||LA43_0==48||LA43_0==76) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2669:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2669:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2670:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6362);
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

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2686:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==58) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2686:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXCasePart6376); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2690:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2691:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2691:1: (lv_case_2_0= ruleXExpression )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2692:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6397);
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

            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleXCasePart6411); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2712:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2713:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2713:1: (lv_then_4_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2714:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6432);
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2738:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2739:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2740:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6468);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6478); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2747:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2750:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2751:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2751:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2751:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2751:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2752:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXForLoopExpression6524); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXForLoopExpression6536); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2765:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2766:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2766:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2767:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6557);
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

            otherlv_4=(Token)match(input,56,FOLLOW_56_in_ruleXForLoopExpression6569); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2787:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2788:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2788:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2789:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6590);
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

            otherlv_6=(Token)match(input,49,FOLLOW_49_in_ruleXForLoopExpression6602); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2809:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2810:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2810:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2811:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6623);
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2835:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2836:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2837:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6659);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6669); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2844:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2847:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2848:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2848:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2848:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2848:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2849:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXWhileExpression6715); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXWhileExpression6727); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2862:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2863:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2863:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2864:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6748);
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

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXWhileExpression6760); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2884:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2885:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2885:1: (lv_body_5_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2886:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6781);
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2910:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2911:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2912:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6817);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6827); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2919:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2922:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2923:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2923:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2923:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2923:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2924:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXDoWhileExpression6873); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2933:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2934:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2934:1: (lv_body_2_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2935:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6894);
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

            otherlv_3=(Token)match(input,60,FOLLOW_60_in_ruleXDoWhileExpression6906); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleXDoWhileExpression6918); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2959:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2960:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2960:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2961:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6939);
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

            otherlv_6=(Token)match(input,49,FOLLOW_49_in_ruleXDoWhileExpression6951); if (state.failed) return current;
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2989:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2990:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2991:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6987);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression6997); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2998:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3001:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3002:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3002:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3002:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3002:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3003:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleXBlockExpression7043); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3012:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_STRING)||LA46_0==15||LA46_0==34||(LA46_0>=37 && LA46_0<=38)||LA46_0==43||LA46_0==48||LA46_0==50||LA46_0==53||LA46_0==55||(LA46_0>=59 && LA46_0<=61)||(LA46_0>=63 && LA46_0<=64)||(LA46_0>=66 && LA46_0<=73)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3012:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3012:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3013:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3013:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3014:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7065);
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

            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3030:2: (otherlv_3= ';' )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==62) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3030:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,62,FOLLOW_62_in_ruleXBlockExpression7078); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleXBlockExpression7094); if (state.failed) return current;
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3046:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3047:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3048:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7130);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7140); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3055:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3058:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3059:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3059:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=63 && LA47_0<=64)) ) {
                alt47=1;
            }
            else if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_STRING)||LA47_0==15||LA47_0==34||(LA47_0>=37 && LA47_0<=38)||LA47_0==43||LA47_0==48||LA47_0==50||LA47_0==53||LA47_0==55||(LA47_0>=59 && LA47_0<=61)||(LA47_0>=66 && LA47_0<=73)) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3060:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7187);
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3070:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7214);
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3086:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3087:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3088:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7249);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7259); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3095:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3098:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3099:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3099:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3099:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3099:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3100:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3105:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==63) ) {
                alt48=1;
            }
            else if ( (LA48_0==64) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3105:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3105:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3106:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3106:1: (lv_writeable_1_0= 'var' )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3107:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,63,FOLLOW_63_in_ruleXVariableDeclaration7312); if (state.failed) return current;
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3121:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleXVariableDeclaration7343); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3125:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) ) | ( (lv_name_5_0= RULE_ID ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                int LA49_1 = input.LA(2);

                if ( (synpred17_InternalGuiceModules()) ) {
                    alt49=1;
                }
                else if ( (true) ) {
                    alt49=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA49_0==48) && (synpred17_InternalGuiceModules())) {
                alt49=1;
            }
            else if ( (LA49_0==76) && (synpred17_InternalGuiceModules())) {
                alt49=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3125:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3125:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3125:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3134:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3134:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= RULE_ID ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3134:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3135:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3135:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3136:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7392);
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

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3152:2: ( (lv_name_4_0= RULE_ID ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3153:1: (lv_name_4_0= RULE_ID )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3153:1: (lv_name_4_0= RULE_ID )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3154:3: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXVariableDeclaration7409); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_4_0, grammarAccess.getXVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3171:6: ( (lv_name_5_0= RULE_ID ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3171:6: ( (lv_name_5_0= RULE_ID ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3172:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3172:1: (lv_name_5_0= RULE_ID )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3173:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXVariableDeclaration7439); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_5_0, grammarAccess.getXVariableDeclarationAccess().getNameIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3189:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==24) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3189:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleXVariableDeclaration7458); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3193:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3194:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3194:1: (lv_right_7_0= ruleXExpression )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3195:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7479);
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3219:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3220:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3221:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7517);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7527); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3228:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_parameterType_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3231:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3232:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3232:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3232:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3232:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==RULE_ID||LA51_1==34||LA51_1==45) ) {
                    alt51=1;
                }
            }
            else if ( (LA51_0==48||LA51_0==76) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3233:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3233:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3234:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7573);
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

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3250:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3251:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3251:1: (lv_name_1_0= RULE_ID )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3252:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJvmFormalParameter7591); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getJvmFormalParameterAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
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


    // $ANTLR start "entryRuleXFeatureCall"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3276:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3277:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3278:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7632);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7642); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3285:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( (otherlv_7= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3288:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( (otherlv_7= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3289:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( (otherlv_7= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3289:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( (otherlv_7= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3289:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( (otherlv_7= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3289:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3290:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3295:2: ( ( ruleStaticQualifier ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==65) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3296:1: ( ruleStaticQualifier )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3296:1: ( ruleStaticQualifier )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3297:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7699);
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

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3310:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==34) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3310:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleXFeatureCall7713); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3314:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3315:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3315:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3316:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7734);
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

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3332:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==14) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3332:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleXFeatureCall7747); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3336:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3337:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3337:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3338:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7768);
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
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleXFeatureCall7782); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3358:3: ( (otherlv_7= RULE_ID ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3359:1: (otherlv_7= RULE_ID )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3359:1: (otherlv_7= RULE_ID )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3360:3: otherlv_7= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXFeatureCall7804); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_7, grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	
            }

            }


            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3371:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt57=2;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3371:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3371:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3371:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3378:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3379:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,48,FOLLOW_48_in_ruleXFeatureCall7838); if (state.failed) return current;
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

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3392:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt56=3;
                    alt56 = dfa56.predict(input);
                    switch (alt56) {
                        case 1 :
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3392:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3392:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3392:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3404:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3405:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7913);
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
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3422:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3422:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3422:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3422:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3423:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3423:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3424:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7941);
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

                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3440:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop55:
                            do {
                                int alt55=2;
                                int LA55_0 = input.LA(1);

                                if ( (LA55_0==14) ) {
                                    alt55=1;
                                }


                                switch (alt55) {
                            	case 1 :
                            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3440:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleXFeatureCall7954); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3444:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3445:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3445:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3446:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7975);
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
                            	    break loop55;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,49,FOLLOW_49_in_ruleXFeatureCall7992); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
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


    // $ANTLR start "entryRuleStaticQualifier"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3474:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3475:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3476:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8031);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8042); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3483:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3486:28: ( (this_ID_0= RULE_ID kw= '::' )+ )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3487:1: (this_ID_0= RULE_ID kw= '::' )+
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3487:1: (this_ID_0= RULE_ID kw= '::' )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_ID) ) {
                    int LA58_2 = input.LA(2);

                    if ( (LA58_2==65) ) {
                        alt58=1;
                    }


                }


                switch (alt58) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3487:6: this_ID_0= RULE_ID kw= '::'
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStaticQualifier8082); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_0, grammarAccess.getStaticQualifierAccess().getIDTerminalRuleCall_0()); 
            	          
            	    }
            	    kw=(Token)match(input,65,FOLLOW_65_in_ruleStaticQualifier8100); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3508:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3509:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3510:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8141);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8151); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3517:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) ;
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


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3520:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3521:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3521:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3521:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3521:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3522:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXConstructorCall8197); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3531:1: ( ( ruleQualifiedName ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3532:1: ( ruleQualifiedName )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3532:1: ( ruleQualifiedName )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3533:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8220);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3546:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==34) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3546:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleXConstructorCall8233); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3550:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3551:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3551:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3552:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8254);
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

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3568:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==14) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3568:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleXConstructorCall8267); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3572:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3573:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3573:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3574:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8288);
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
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleXConstructorCall8302); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,48,FOLLOW_48_in_ruleXConstructorCall8316); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3598:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt62=3;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3598:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3598:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3598:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3610:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3611:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8378);
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3628:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3628:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3628:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3628:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3629:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3629:1: (lv_arguments_10_0= ruleXExpression )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3630:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8406);
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

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3646:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==14) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3646:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleXConstructorCall8419); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3650:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3651:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3651:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3652:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8440);
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
                    	    break loop61;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,49,FOLLOW_49_in_ruleXConstructorCall8457); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_6());
                  
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3680:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3681:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3682:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8493);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral8503); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3689:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3692:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3693:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3693:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3693:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3693:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3694:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3699:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==67) ) {
                alt63=1;
            }
            else if ( (LA63_0==68) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3699:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXBooleanLiteral8550); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3704:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3704:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3705:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3705:1: (lv_isTrue_2_0= 'true' )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3706:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,68,FOLLOW_68_in_ruleXBooleanLiteral8574); if (state.failed) return current;
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3727:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3728:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3729:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8624);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral8634); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3736:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3739:28: ( ( () otherlv_1= 'null' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3740:1: ( () otherlv_1= 'null' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3740:1: ( () otherlv_1= 'null' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3740:2: () otherlv_1= 'null'
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3740:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3741:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXNullLiteral8680); if (state.failed) return current;
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


    // $ANTLR start "entryRuleXIntLiteral"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3758:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3759:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3760:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8716);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral8726); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIntLiteral"


    // $ANTLR start "ruleXIntLiteral"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3767:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3770:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3771:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3771:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3771:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3771:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3772:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3777:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3778:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3778:1: (lv_value_1_0= RULE_INT )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3779:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral8777); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXIntLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXIntLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"INT");
              	    
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
    // $ANTLR end "ruleXIntLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3803:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3804:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3805:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8818);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral8828); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3812:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3815:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3816:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3816:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3816:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3816:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3817:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3822:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3823:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3823:1: (lv_value_1_0= RULE_STRING )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3824:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral8879); if (state.failed) return current;
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3848:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3849:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3850:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral8920);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral8930); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3857:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3860:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3861:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3861:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3861:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3861:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3862:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXTypeLiteral8976); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXTypeLiteral8988); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3875:1: ( ( ruleQualifiedName ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3876:1: ( ruleQualifiedName )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3876:1: ( ruleQualifiedName )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3877:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9011);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXTypeLiteral9023); if (state.failed) return current;
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3902:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3903:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3904:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9059);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9069); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3911:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3914:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3915:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3915:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3915:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3915:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3916:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXThrowExpression9115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3925:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3926:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3926:1: (lv_expression_2_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3927:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9136);
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3951:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3952:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3953:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9172);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9182); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3960:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3963:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3964:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3964:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3964:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3964:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3965:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXReturnExpression9228); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3974:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3974:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3979:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3980:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9259);
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4004:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4005:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4006:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9296);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9306); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4013:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4016:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4017:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4017:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4017:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4017:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4018:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXTryCatchFinallyExpression9352); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4027:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4028:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4028:1: (lv_expression_2_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4029:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9373);
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

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4045:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==75) ) {
                alt67=1;
            }
            else if ( (LA67_0==74) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4045:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4045:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4045:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4045:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt65=0;
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==75) ) {
                            int LA65_2 = input.LA(2);

                            if ( (synpred22_InternalGuiceModules()) ) {
                                alt65=1;
                            }


                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4045:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4047:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4048:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9403);
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
                    	    if ( cnt65 >= 1 ) break loop65;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(65, input);
                                throw eee;
                        }
                        cnt65++;
                    } while (true);

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4064:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==74) ) {
                        int LA66_1 = input.LA(2);

                        if ( (synpred23_InternalGuiceModules()) ) {
                            alt66=1;
                        }
                    }
                    switch (alt66) {
                        case 1 :
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4064:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4064:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4064:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,74,FOLLOW_74_in_ruleXTryCatchFinallyExpression9425); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4069:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4070:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4070:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4071:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9447);
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4088:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4088:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4088:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,74,FOLLOW_74_in_ruleXTryCatchFinallyExpression9469); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4092:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4093:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4093:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4094:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9490);
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4118:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4119:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4120:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9528);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause9538); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4127:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4130:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4131:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4131:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4131:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4131:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4131:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleXCatchClause9583); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleXCatchClause9596); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4140:1: ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4141:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4141:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4142:3: lv_declaredParam_2_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause9617);
            lv_declaredParam_2_0=ruleJvmFormalParameter();

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
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleXCatchClause9629); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4162:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4163:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4163:1: (lv_expression_4_0= ruleXExpression )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4164:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause9650);
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4188:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4189:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4190:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9687);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName9698); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4197:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4200:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4201:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4201:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4201:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName9738); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4208:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==45) ) {
                    int LA68_2 = input.LA(2);

                    if ( (LA68_2==RULE_ID) ) {
                        int LA68_3 = input.LA(3);

                        if ( (synpred25_InternalGuiceModules()) ) {
                            alt68=1;
                        }


                    }


                }


                switch (alt68) {
            	case 1 :
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4208:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4208:2: ( ( '.' )=>kw= '.' )
            	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4208:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,45,FOLLOW_45_in_ruleQualifiedName9766); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName9782); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop68;
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


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4231:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4232:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4233:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9829);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference9839); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4240:1: ruleJvmTypeReference returns [EObject current=null] : (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_1 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4243:28: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4244:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4244:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID) ) {
                alt69=1;
            }
            else if ( (LA69_0==48||LA69_0==76) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4245:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference9886);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4255:5: this_XFunctionTypeRef_1= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference9913);
                    this_XFunctionTypeRef_1=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_1; 
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4271:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4272:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4273:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef9948);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef9958); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4280:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4283:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4284:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4284:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4284:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4284:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==48) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4284:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleXFunctionTypeRef9996); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4288:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4289:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4289:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4290:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10017);
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

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4306:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==14) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4306:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleXFunctionTypeRef10030); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4310:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4311:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4311:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4312:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10051);
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
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXFunctionTypeRef10065); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,76,FOLLOW_76_in_ruleXFunctionTypeRef10079); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4336:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4337:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4337:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4338:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10100);
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4362:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4363:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4364:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10136);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10146); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4371:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4374:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4375:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4375:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4375:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4375:2: ( ( ruleQualifiedName ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4376:1: ( ruleQualifiedName )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4376:1: ( ruleQualifiedName )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4377:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10194);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4390:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4390:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4390:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4390:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleJvmParameterizedTypeReference10215); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4395:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4396:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4396:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4397:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10237);
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

                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4413:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==14) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4413:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleJvmParameterizedTypeReference10250); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4417:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4418:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4418:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4419:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10271);
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
                    	    break loop72;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleJvmParameterizedTypeReference10285); if (state.failed) return current;
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4447:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4448:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4449:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10323);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10333); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4456:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4459:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4460:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4460:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_ID||LA74_0==48||LA74_0==76) ) {
                alt74=1;
            }
            else if ( (LA74_0==77) ) {
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4461:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10380);
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4471:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10407);
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4487:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4488:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4489:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10442);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10452); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4496:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4499:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4500:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4500:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4500:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4500:2: ()
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4501:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleJvmWildcardTypeReference10498); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4510:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt75=3;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==78) ) {
                alt75=1;
            }
            else if ( (LA75_0==80) ) {
                alt75=2;
            }
            switch (alt75) {
                case 1 :
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4510:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4510:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4511:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4511:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4512:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference10520);
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
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4529:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4529:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4530:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4530:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4531:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference10547);
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4555:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4556:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4557:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound10585);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound10595); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4564:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4567:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4568:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4568:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4568:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleJvmUpperBound10632); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4572:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4573:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4573:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4574:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10653);
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4598:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4599:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4600:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10689);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10699); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4607:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4610:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4611:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4611:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4611:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleJvmUpperBoundAnded10736); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4615:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4616:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4616:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4617:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10757);
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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4641:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4642:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4643:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound10793);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound10803); if (state.failed) return current;

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
    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4650:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4653:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4654:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4654:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4654:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleJvmLowerBound10840); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4658:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4659:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4659:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4660:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound10861);
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

    // $ANTLR start synpred1_InternalGuiceModules
    public final void synpred1_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:593:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:593:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:593:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:593:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:593:5: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:594:1: 
        {
        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:594:2: ( ( ruleOpMultiAssign ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:595:1: ( ruleOpMultiAssign )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:595:1: ( ruleOpMultiAssign )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:596:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalGuiceModules1258);
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
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:721:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:721:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:721:4: ( () ( ( ruleOpOr ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:721:5: () ( ( ruleOpOr ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:721:5: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:722:1: 
        {
        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:722:2: ( ( ruleOpOr ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:723:1: ( ruleOpOr )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:723:1: ( ruleOpOr )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:724:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalGuiceModules1606);
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
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:822:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:822:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:822:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:822:5: () ( ( ruleOpAnd ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:822:5: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:823:1: 
        {
        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:823:2: ( ( ruleOpAnd ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:824:1: ( ruleOpAnd )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:824:1: ( ruleOpAnd )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:825:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalGuiceModules1865);
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
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:923:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:923:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:923:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:923:5: () ( ( ruleOpEquality ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:923:5: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:924:1: 
        {
        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:924:2: ( ( ruleOpEquality ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:925:1: ( ruleOpEquality )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:925:1: ( ruleOpEquality )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:926:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalGuiceModules2124);
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
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1031:4: ( ( () 'instanceof' ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1031:5: ( () 'instanceof' )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1031:5: ( () 'instanceof' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1031:6: () 'instanceof'
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1031:6: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1032:1: 
        {
        }

        match(input,30,FOLLOW_30_in_synpred5_InternalGuiceModules2400); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalGuiceModules

    // $ANTLR start synpred6_InternalGuiceModules
    public final void synpred6_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1059:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1059:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1059:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1059:10: () ( ( ruleOpCompare ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1059:10: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1060:1: 
        {
        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1060:2: ( ( ruleOpCompare ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1061:1: ( ruleOpCompare )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1061:1: ( ruleOpCompare )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1062:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalGuiceModules2473);
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
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1181:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1181:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1181:4: ( () ( ( ruleOpOther ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1181:5: () ( ( ruleOpOther ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1181:5: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1182:1: 
        {
        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1182:2: ( ( ruleOpOther ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1183:1: ( ruleOpOther )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1183:1: ( ruleOpOther )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1184:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalGuiceModules2792);
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
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1289:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1289:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1289:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1289:5: () ( ( ruleOpAdd ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1289:5: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1290:1: 
        {
        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1290:2: ( ( ruleOpAdd ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1291:1: ( ruleOpAdd )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1291:1: ( ruleOpAdd )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1292:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalGuiceModules3072);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalGuiceModules

    // $ANTLR start synpred9_InternalGuiceModules
    public final void synpred9_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1397:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1397:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1397:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1397:5: () ( ( ruleOpMulti ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1397:5: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1398:1: 
        {
        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1398:2: ( ( ruleOpMulti ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1399:1: ( ruleOpMulti )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1399:1: ( ruleOpMulti )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1400:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalGuiceModules3352);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalGuiceModules

    // $ANTLR start synpred10_InternalGuiceModules
    public final void synpred10_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1630:3: ( ( () 'as' ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1630:4: ( () 'as' )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1630:4: ( () 'as' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1630:5: () 'as'
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1630:5: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1631:1: 
        {
        }

        match(input,44,FOLLOW_44_in_synpred10_InternalGuiceModules3946); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalGuiceModules

    // $ANTLR start synpred11_InternalGuiceModules
    public final void synpred11_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1690:4: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1690:5: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1690:5: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1690:6: () '.' ( ( RULE_ID ) ) ruleOpSingleAssign
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1690:6: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1691:1: 
        {
        }

        match(input,45,FOLLOW_45_in_synpred11_InternalGuiceModules4100); if (state.failed) return ;
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1692:1: ( ( RULE_ID ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1693:1: ( RULE_ID )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1693:1: ( RULE_ID )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1694:2: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred11_InternalGuiceModules4108); if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalGuiceModules4115);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalGuiceModules

    // $ANTLR start synpred12_InternalGuiceModules
    public final void synpred12_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1747:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1747:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1747:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1747:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1747:10: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1748:1: 
        {
        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1748:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt76=3;
        switch ( input.LA(1) ) {
        case 45:
            {
            alt76=1;
            }
            break;
        case 46:
            {
            alt76=2;
            }
            break;
        case 47:
            {
            alt76=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 76, 0, input);

            throw nvae;
        }

        switch (alt76) {
            case 1 :
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1748:4: '.'
                {
                match(input,45,FOLLOW_45_in_synpred12_InternalGuiceModules4215); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1750:6: ( ( '?.' ) )
                {
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1750:6: ( ( '?.' ) )
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1751:1: ( '?.' )
                {
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1751:1: ( '?.' )
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1752:2: '?.'
                {
                match(input,46,FOLLOW_46_in_synpred12_InternalGuiceModules4229); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1757:6: ( ( '*.' ) )
                {
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1757:6: ( ( '*.' ) )
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1758:1: ( '*.' )
                {
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1758:1: ( '*.' )
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1759:2: '*.'
                {
                match(input,47,FOLLOW_47_in_synpred12_InternalGuiceModules4249); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalGuiceModules

    // $ANTLR start synpred13_InternalGuiceModules
    public final void synpred13_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1866:4: ( ( '(' ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1867:1: ( '(' )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1867:1: ( '(' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1868:2: '('
        {
        match(input,48,FOLLOW_48_in_synpred13_InternalGuiceModules4473); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalGuiceModules

    // $ANTLR start synpred14_InternalGuiceModules
    public final void synpred14_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1887:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1887:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1887:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1887:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1887:6: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1888:1: 
        {
        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1888:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt78=2;
        int LA78_0 = input.LA(1);

        if ( (LA78_0==RULE_ID||LA78_0==48||LA78_0==76) ) {
            alt78=1;
        }
        switch (alt78) {
            case 1 :
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1888:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1888:3: ( ( ruleJvmFormalParameter ) )
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1889:1: ( ruleJvmFormalParameter )
                {
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1889:1: ( ruleJvmFormalParameter )
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1890:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGuiceModules4525);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1892:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop77:
                do {
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==14) ) {
                        alt77=1;
                    }


                    switch (alt77) {
                	case 1 :
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1892:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,14,FOLLOW_14_in_synpred14_InternalGuiceModules4532); if (state.failed) return ;
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1893:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1894:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1894:1: ( ruleJvmFormalParameter )
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:1895:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGuiceModules4539);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop77;
                    }
                } while (true);


                }
                break;

        }

        match(input,51,FOLLOW_51_in_synpred14_InternalGuiceModules4549); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalGuiceModules

    // $ANTLR start synpred16_InternalGuiceModules
    public final void synpred16_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2501:4: ( 'else' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:2501:6: 'else'
        {
        match(input,54,FOLLOW_54_in_synpred16_InternalGuiceModules5994); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalGuiceModules

    // $ANTLR start synpred17_InternalGuiceModules
    public final void synpred17_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3125:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3125:5: ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3125:5: ( ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3125:6: ( ( ruleJvmTypeReference ) ) ( ( RULE_ID ) )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3125:6: ( ( ruleJvmTypeReference ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3126:1: ( ruleJvmTypeReference )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3126:1: ( ruleJvmTypeReference )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3127:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred17_InternalGuiceModules7361);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3129:2: ( ( RULE_ID ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3130:1: ( RULE_ID )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3130:1: ( RULE_ID )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3131:1: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred17_InternalGuiceModules7370); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalGuiceModules

    // $ANTLR start synpred18_InternalGuiceModules
    public final void synpred18_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3371:4: ( ( '(' ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3372:1: ( '(' )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3372:1: ( '(' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3373:2: '('
        {
        match(input,48,FOLLOW_48_in_synpred18_InternalGuiceModules7820); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalGuiceModules

    // $ANTLR start synpred19_InternalGuiceModules
    public final void synpred19_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3392:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3392:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3392:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3392:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3392:6: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3393:1: 
        {
        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3393:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt82=2;
        int LA82_0 = input.LA(1);

        if ( (LA82_0==RULE_ID||LA82_0==48||LA82_0==76) ) {
            alt82=1;
        }
        switch (alt82) {
            case 1 :
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3393:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3393:3: ( ( ruleJvmFormalParameter ) )
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3394:1: ( ruleJvmFormalParameter )
                {
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3394:1: ( ruleJvmFormalParameter )
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3395:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGuiceModules7872);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3397:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop81:
                do {
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==14) ) {
                        alt81=1;
                    }


                    switch (alt81) {
                	case 1 :
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3397:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,14,FOLLOW_14_in_synpred19_InternalGuiceModules7879); if (state.failed) return ;
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3398:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3399:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3399:1: ( ruleJvmFormalParameter )
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3400:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGuiceModules7886);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop81;
                    }
                } while (true);


                }
                break;

        }

        match(input,51,FOLLOW_51_in_synpred19_InternalGuiceModules7896); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalGuiceModules

    // $ANTLR start synpred20_InternalGuiceModules
    public final void synpred20_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3598:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3598:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3598:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3598:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3598:5: ()
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3599:1: 
        {
        }

        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3599:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt84=2;
        int LA84_0 = input.LA(1);

        if ( (LA84_0==RULE_ID||LA84_0==48||LA84_0==76) ) {
            alt84=1;
        }
        switch (alt84) {
            case 1 :
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3599:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3599:3: ( ( ruleJvmFormalParameter ) )
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3600:1: ( ruleJvmFormalParameter )
                {
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3600:1: ( ruleJvmFormalParameter )
                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3601:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGuiceModules8337);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3603:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop83:
                do {
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==14) ) {
                        alt83=1;
                    }


                    switch (alt83) {
                	case 1 :
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3603:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,14,FOLLOW_14_in_synpred20_InternalGuiceModules8344); if (state.failed) return ;
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3604:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3605:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3605:1: ( ruleJvmFormalParameter )
                	    // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3606:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGuiceModules8351);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop83;
                    }
                } while (true);


                }
                break;

        }

        match(input,51,FOLLOW_51_in_synpred20_InternalGuiceModules8361); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalGuiceModules

    // $ANTLR start synpred21_InternalGuiceModules
    public final void synpred21_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3974:2: ( ( ruleXExpression ) )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3975:1: ( ruleXExpression )
        {
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3975:1: ( ruleXExpression )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:3976:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred21_InternalGuiceModules9242);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalGuiceModules

    // $ANTLR start synpred22_InternalGuiceModules
    public final void synpred22_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4045:5: ( 'catch' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4045:7: 'catch'
        {
        match(input,75,FOLLOW_75_in_synpred22_InternalGuiceModules9387); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalGuiceModules

    // $ANTLR start synpred23_InternalGuiceModules
    public final void synpred23_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4064:5: ( 'finally' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4064:7: 'finally'
        {
        match(input,74,FOLLOW_74_in_synpred23_InternalGuiceModules9417); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalGuiceModules

    // $ANTLR start synpred25_InternalGuiceModules
    public final void synpred25_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4208:3: ( '.' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4209:2: '.'
        {
        match(input,45,FOLLOW_45_in_synpred25_InternalGuiceModules9757); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalGuiceModules

    // $ANTLR start synpred26_InternalGuiceModules
    public final void synpred26_InternalGuiceModules_fragment() throws RecognitionException {   
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4390:4: ( '<' )
        // ../org.guicecon.modules/src-gen/org/guicecon/modules/parser/antlr/internal/InternalGuiceModules.g:4390:6: '<'
        {
        match(input,34,FOLLOW_34_in_synpred26_InternalGuiceModules10207); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalGuiceModules

    // Delegated rules

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
    public final boolean synpred19_InternalGuiceModules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalGuiceModules_fragment(); // can never throw exception
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


    protected DFA31 dfa31 = new DFA31(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA73 dfa73 = new DFA73(this);
    static final String DFA31_eotS =
        "\75\uffff";
    static final String DFA31_eofS =
        "\1\2\74\uffff";
    static final String DFA31_minS =
        "\1\4\1\0\73\uffff";
    static final String DFA31_maxS =
        "\1\114\1\0\73\uffff";
    static final String DFA31_acceptS =
        "\2\uffff\1\2\71\uffff\1\1";
    static final String DFA31_specialS =
        "\1\uffff\1\0\73\uffff}>";
    static final String[] DFA31_transitionS = {
            "\3\2\7\uffff\5\2\6\uffff\27\2\1\1\2\2\1\uffff\15\2\1\uffff\13"+
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
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "1866:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_1 = input.LA(1);

                         
                        int index31_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalGuiceModules()) ) {s = 60;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA30_eotS =
        "\33\uffff";
    static final String DFA30_eofS =
        "\33\uffff";
    static final String DFA30_minS =
        "\1\4\2\0\30\uffff";
    static final String DFA30_maxS =
        "\1\114\2\0\30\uffff";
    static final String DFA30_acceptS =
        "\3\uffff\2\1\1\2\24\uffff\1\3";
    static final String DFA30_specialS =
        "\1\0\1\1\1\2\30\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\1\2\5\10\uffff\1\5\22\uffff\1\5\2\uffff\2\5\4\uffff\1\5\4"+
            "\uffff\1\2\1\32\1\5\1\4\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5"+
            "\4\uffff\10\5\2\uffff\1\3",
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
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1887:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_0 = input.LA(1);

                         
                        int index30_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_0==RULE_ID) ) {s = 1;}

                        else if ( (LA30_0==48) ) {s = 2;}

                        else if ( (LA30_0==76) && (synpred14_InternalGuiceModules())) {s = 3;}

                        else if ( (LA30_0==51) && (synpred14_InternalGuiceModules())) {s = 4;}

                        else if ( ((LA30_0>=RULE_INT && LA30_0<=RULE_STRING)||LA30_0==15||LA30_0==34||(LA30_0>=37 && LA30_0<=38)||LA30_0==43||LA30_0==50||LA30_0==53||LA30_0==55||(LA30_0>=59 && LA30_0<=61)||(LA30_0>=66 && LA30_0<=73)) ) {s = 5;}

                        else if ( (LA30_0==49) ) {s = 26;}

                         
                        input.seek(index30_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_1 = input.LA(1);

                         
                        int index30_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalGuiceModules()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index30_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA30_2 = input.LA(1);

                         
                        int index30_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalGuiceModules()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index30_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA57_eotS =
        "\75\uffff";
    static final String DFA57_eofS =
        "\1\2\74\uffff";
    static final String DFA57_minS =
        "\1\4\1\0\73\uffff";
    static final String DFA57_maxS =
        "\1\114\1\0\73\uffff";
    static final String DFA57_acceptS =
        "\2\uffff\1\2\71\uffff\1\1";
    static final String DFA57_specialS =
        "\1\uffff\1\0\73\uffff}>";
    static final String[] DFA57_transitionS = {
            "\3\2\7\uffff\5\2\6\uffff\27\2\1\1\2\2\1\uffff\15\2\1\uffff\13"+
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
            ""
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "3371:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_1 = input.LA(1);

                         
                        int index57_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalGuiceModules()) ) {s = 60;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index57_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA56_eotS =
        "\33\uffff";
    static final String DFA56_eofS =
        "\33\uffff";
    static final String DFA56_minS =
        "\1\4\2\0\30\uffff";
    static final String DFA56_maxS =
        "\1\114\2\0\30\uffff";
    static final String DFA56_acceptS =
        "\3\uffff\2\1\1\2\24\uffff\1\3";
    static final String DFA56_specialS =
        "\1\0\1\1\1\2\30\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\1\2\5\10\uffff\1\5\22\uffff\1\5\2\uffff\2\5\4\uffff\1\5\4"+
            "\uffff\1\2\1\32\1\5\1\4\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5"+
            "\4\uffff\10\5\2\uffff\1\3",
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
            ""
    };

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "3392:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_0 = input.LA(1);

                         
                        int index56_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA56_0==RULE_ID) ) {s = 1;}

                        else if ( (LA56_0==48) ) {s = 2;}

                        else if ( (LA56_0==76) && (synpred19_InternalGuiceModules())) {s = 3;}

                        else if ( (LA56_0==51) && (synpred19_InternalGuiceModules())) {s = 4;}

                        else if ( ((LA56_0>=RULE_INT && LA56_0<=RULE_STRING)||LA56_0==15||LA56_0==34||(LA56_0>=37 && LA56_0<=38)||LA56_0==43||LA56_0==50||LA56_0==53||LA56_0==55||(LA56_0>=59 && LA56_0<=61)||(LA56_0>=66 && LA56_0<=73)) ) {s = 5;}

                        else if ( (LA56_0==49) ) {s = 26;}

                         
                        input.seek(index56_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA56_1 = input.LA(1);

                         
                        int index56_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalGuiceModules()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index56_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA56_2 = input.LA(1);

                         
                        int index56_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalGuiceModules()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index56_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA62_eotS =
        "\33\uffff";
    static final String DFA62_eofS =
        "\33\uffff";
    static final String DFA62_minS =
        "\1\4\2\0\30\uffff";
    static final String DFA62_maxS =
        "\1\114\2\0\30\uffff";
    static final String DFA62_acceptS =
        "\3\uffff\2\1\1\2\24\uffff\1\3";
    static final String DFA62_specialS =
        "\1\0\1\1\1\2\30\uffff}>";
    static final String[] DFA62_transitionS = {
            "\1\1\2\5\10\uffff\1\5\22\uffff\1\5\2\uffff\2\5\4\uffff\1\5\4"+
            "\uffff\1\2\1\32\1\5\1\4\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5"+
            "\4\uffff\10\5\2\uffff\1\3",
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
            ""
    };

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "3598:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_0 = input.LA(1);

                         
                        int index62_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA62_0==RULE_ID) ) {s = 1;}

                        else if ( (LA62_0==48) ) {s = 2;}

                        else if ( (LA62_0==76) && (synpred20_InternalGuiceModules())) {s = 3;}

                        else if ( (LA62_0==51) && (synpred20_InternalGuiceModules())) {s = 4;}

                        else if ( ((LA62_0>=RULE_INT && LA62_0<=RULE_STRING)||LA62_0==15||LA62_0==34||(LA62_0>=37 && LA62_0<=38)||LA62_0==43||LA62_0==50||LA62_0==53||LA62_0==55||(LA62_0>=59 && LA62_0<=61)||(LA62_0>=66 && LA62_0<=73)) ) {s = 5;}

                        else if ( (LA62_0==49) ) {s = 26;}

                         
                        input.seek(index62_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA62_1 = input.LA(1);

                         
                        int index62_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGuiceModules()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index62_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA62_2 = input.LA(1);

                         
                        int index62_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGuiceModules()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index62_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA64_eotS =
        "\75\uffff";
    static final String DFA64_eofS =
        "\1\30\74\uffff";
    static final String DFA64_minS =
        "\1\4\27\0\45\uffff";
    static final String DFA64_maxS =
        "\1\114\27\0\45\uffff";
    static final String DFA64_acceptS =
        "\30\uffff\1\2\43\uffff\1\1";
    static final String DFA64_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\45\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\1\1\14\1\16\7\uffff\1\30\1\6\3\30\6\uffff\11\30\1\10\2\30"+
            "\1\4\1\3\4\30\1\2\4\30\1\27\1\30\1\11\1\uffff\1\30\1\20\1\30"+
            "\1\7\3\30\1\21\1\22\1\23\3\30\1\uffff\1\5\1\12\1\13\1\15\1\17"+
            "\1\24\1\25\1\26\3\30",
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
            return "3974:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
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
                        if ( (synpred21_InternalGuiceModules()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA64_2 = input.LA(1);

                         
                        int index64_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGuiceModules()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index64_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA64_3 = input.LA(1);

                         
                        int index64_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGuiceModules()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index64_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA64_4 = input.LA(1);

                         
                        int index64_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGuiceModules()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index64_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA64_5 = input.LA(1);

                         
                        int index64_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGuiceModules()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index64_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA64_6 = input.LA(1);

                         
                        int index64_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGuiceModules()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index64_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA64_7 = input.LA(1);

                         
                        int index64_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGuiceModules()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index64_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA64_8 = input.LA(1);

                         
                        int index64_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGuiceModules()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index64_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA64_9 = input.LA(1);

                         
                        int index64_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGuiceModules()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index64_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA64_10 = input.LA(1);

                         
                        int index64_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGuiceModules()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index64_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA64_11 = input.LA(1);

                         
                        int index64_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGuiceModules()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index64_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA64_12 = input.LA(1);

                         
                        int index64_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGuiceModules()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index64_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA64_13 = input.LA(1);

                         
                        int index64_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGuiceModules()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index64_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA64_14 = input.LA(1);

                         
                        int index64_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGuiceModules()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index64_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA64_15 = input.LA(1);

                         
                        int index64_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGuiceModules()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index64_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA64_16 = input.LA(1);

                         
                        int index64_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGuiceModules()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index64_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA64_17 = input.LA(1);

                         
                        int index64_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGuiceModules()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index64_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA64_18 = input.LA(1);

                         
                        int index64_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGuiceModules()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index64_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA64_19 = input.LA(1);

                         
                        int index64_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGuiceModules()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index64_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA64_20 = input.LA(1);

                         
                        int index64_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGuiceModules()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index64_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA64_21 = input.LA(1);

                         
                        int index64_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGuiceModules()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index64_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA64_22 = input.LA(1);

                         
                        int index64_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGuiceModules()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index64_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA64_23 = input.LA(1);

                         
                        int index64_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGuiceModules()) ) {s = 60;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index64_23);
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
    static final String DFA73_eotS =
        "\77\uffff";
    static final String DFA73_eofS =
        "\1\2\76\uffff";
    static final String DFA73_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA73_maxS =
        "\1\114\1\0\75\uffff";
    static final String DFA73_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA73_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA73_transitionS = {
            "\3\2\7\uffff\7\2\4\uffff\11\2\1\1\20\2\1\uffff\15\2\1\uffff"+
            "\13\2",
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
            return "4390:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
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
                        if ( (synpred26_InternalGuiceModules()) ) {s = 62;}

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
 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModule122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModule143 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModule164 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_12_in_ruleModule177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModule194 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleModule212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModule235 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleModule248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModule271 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleModule287 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_ruleBinding_in_ruleModule308 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_16_in_ruleModule321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_entryRuleBinding357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinding367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBinding410 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBinding436 = new BitSet(new long[]{0x0001000000200010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleKey_in_ruleBinding457 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_19_in_ruleBinding471 = new BitSet(new long[]{0x0001000000200010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleKey_in_ruleBinding492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBinding512 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleBinding533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKey_in_entryRuleKey572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKey582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationRef_in_ruleKey628 = new BitSet(new long[]{0x0001000000200010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleKey650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationRef_in_entryRuleAnnotationRef686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationRef696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAnnotationRef733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAnnotationRef756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleImport839 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard955 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleQualifiedNameWithWildCard974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXAssignment1171 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1187 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1237 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1290 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpSingleAssign1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpMultiAssign1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1585 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1638 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1661 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpOr1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1844 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1897 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1920 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpAnd2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2103 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2156 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2179 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpEquality2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpEquality2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2383 = new BitSet(new long[]{0x00000007C0000002L});
    public static final BitSet FOLLOW_30_in_ruleXRelationalExpression2419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2444 = new BitSet(new long[]{0x00000007C0000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2505 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2528 = new BitSet(new long[]{0x00000007C0000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpCompare2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpCompare2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpCompare2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpCompare2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2771 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2824 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2847 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpOther2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpOther2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3051 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3104 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3127 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpAdd3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpAdd3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3331 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3384 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3407 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpMulti3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpMulti3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpMulti3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpMulti3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3660 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpUnary3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpUnary3814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpUnary3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3930 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleXCastedExpression3965 = new BitSet(new long[]{0x0001000000200010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3988 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4083 = new BitSet(new long[]{0x0000E00000000002L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXMemberFeatureCall4152 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4168 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4190 = new BitSet(new long[]{0x0000E00000000002L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4276 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_46_in_ruleXMemberFeatureCall4300 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_47_in_ruleXMemberFeatureCall4337 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_34_in_ruleXMemberFeatureCall4366 = new BitSet(new long[]{0x0001000000200010L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4387 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_14_in_ruleXMemberFeatureCall4400 = new BitSet(new long[]{0x0001000000200010L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4421 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_33_in_ruleXMemberFeatureCall4435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXMemberFeatureCall4457 = new BitSet(new long[]{0x0001E00000000002L});
    public static final BitSet FOLLOW_48_in_ruleXMemberFeatureCall4491 = new BitSet(new long[]{0x38AF086400208070L,0x00000000000013FCL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4566 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4594 = new BitSet(new long[]{0x0002000000004000L});
    public static final BitSet FOLLOW_14_in_ruleXMemberFeatureCall4607 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4628 = new BitSet(new long[]{0x0002000000004000L});
    public static final BitSet FOLLOW_49_in_ruleXMemberFeatureCall4645 = new BitSet(new long[]{0x0000E00000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXClosure5385 = new BitSet(new long[]{0x0009000000200010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5407 = new BitSet(new long[]{0x0008000000004000L});
    public static final BitSet FOLLOW_14_in_ruleXClosure5420 = new BitSet(new long[]{0x0001000000200010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5441 = new BitSet(new long[]{0x0008000000004000L});
    public static final BitSet FOLLOW_51_in_ruleXClosure5457 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXClosure5478 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXClosure5490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5634 = new BitSet(new long[]{0x0008000000004000L});
    public static final BitSet FOLLOW_14_in_ruleXShortClosure5647 = new BitSet(new long[]{0x0001000000200010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5668 = new BitSet(new long[]{0x0008000000004000L});
    public static final BitSet FOLLOW_51_in_ruleXShortClosure5684 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXParenthesizedExpression5790 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5812 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXParenthesizedExpression5823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXIfExpression5915 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXIfExpression5927 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5948 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXIfExpression5960 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5981 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXIfExpression6002 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression6118 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXSwitchExpression6136 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression6153 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6176 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXSwitchExpression6188 = new BitSet(new long[]{0x0501000000200010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6209 = new BitSet(new long[]{0x0701000000210010L,0x0000000000001000L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6223 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression6235 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6256 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXSwitchExpression6270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6362 = new BitSet(new long[]{0x0500000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXCasePart6376 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6397 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXCasePart6411 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXForLoopExpression6524 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXForLoopExpression6536 = new BitSet(new long[]{0x0001000000200010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6557 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXForLoopExpression6569 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6590 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXForLoopExpression6602 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXWhileExpression6715 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXWhileExpression6727 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6748 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXWhileExpression6760 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXDoWhileExpression6873 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6894 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXDoWhileExpression6906 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXDoWhileExpression6918 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6939 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXDoWhileExpression6951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression6997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleXBlockExpression7043 = new BitSet(new long[]{0xB8A5086400018070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7065 = new BitSet(new long[]{0xF8A5086400018070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_62_in_ruleXBlockExpression7078 = new BitSet(new long[]{0xB8A5086400018070L,0x00000000000003FDL});
    public static final BitSet FOLLOW_16_in_ruleXBlockExpression7094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXVariableDeclaration7312 = new BitSet(new long[]{0x0001000000200010L,0x0000000000001000L});
    public static final BitSet FOLLOW_64_in_ruleXVariableDeclaration7343 = new BitSet(new long[]{0x0001000000200010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXVariableDeclaration7409 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXVariableDeclaration7439 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleXVariableDeclaration7458 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJvmFormalParameter7591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7699 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_34_in_ruleXFeatureCall7713 = new BitSet(new long[]{0x0001000000200010L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7734 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_14_in_ruleXFeatureCall7747 = new BitSet(new long[]{0x0001000000200010L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7768 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_33_in_ruleXFeatureCall7782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXFeatureCall7804 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXFeatureCall7838 = new BitSet(new long[]{0x38AF086400208070L,0x00000000000013FCL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7913 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7941 = new BitSet(new long[]{0x0002000000004000L});
    public static final BitSet FOLLOW_14_in_ruleXFeatureCall7954 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7975 = new BitSet(new long[]{0x0002000000004000L});
    public static final BitSet FOLLOW_49_in_ruleXFeatureCall7992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStaticQualifier8082 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleStaticQualifier8100 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXConstructorCall8197 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8220 = new BitSet(new long[]{0x0001000400000000L});
    public static final BitSet FOLLOW_34_in_ruleXConstructorCall8233 = new BitSet(new long[]{0x0001000000200010L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8254 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_14_in_ruleXConstructorCall8267 = new BitSet(new long[]{0x0001000000200010L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8288 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_33_in_ruleXConstructorCall8302 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXConstructorCall8316 = new BitSet(new long[]{0x38AF086400208070L,0x00000000000013FCL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8378 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8406 = new BitSet(new long[]{0x0002000000004000L});
    public static final BitSet FOLLOW_14_in_ruleXConstructorCall8419 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8440 = new BitSet(new long[]{0x0002000000004000L});
    public static final BitSet FOLLOW_49_in_ruleXConstructorCall8457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral8503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXBooleanLiteral8550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXBooleanLiteral8574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral8634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXNullLiteral8680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral8726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral8777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral8828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral8879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral8920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral8930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXTypeLiteral8976 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXTypeLiteral8988 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9011 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXTypeLiteral9023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXThrowExpression9115 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXReturnExpression9228 = new BitSet(new long[]{0x38A5086400008072L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXTryCatchFinallyExpression9352 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9403 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_74_in_ruleXTryCatchFinallyExpression9425 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXTryCatchFinallyExpression9469 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause9538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXCatchClause9583 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXCatchClause9596 = new BitSet(new long[]{0x0001000000200010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause9617 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXCatchClause9629 = new BitSet(new long[]{0x38A5086400008070L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause9650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName9698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName9738 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleQualifiedName9766 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName9782 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference9839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference9886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference9913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef9948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef9958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXFunctionTypeRef9996 = new BitSet(new long[]{0x0001000000200010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10017 = new BitSet(new long[]{0x0002000000004000L});
    public static final BitSet FOLLOW_14_in_ruleXFunctionTypeRef10030 = new BitSet(new long[]{0x0001000000200010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10051 = new BitSet(new long[]{0x0002000000004000L});
    public static final BitSet FOLLOW_49_in_ruleXFunctionTypeRef10065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleXFunctionTypeRef10079 = new BitSet(new long[]{0x0001000000200010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10194 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleJvmParameterizedTypeReference10215 = new BitSet(new long[]{0x0001000000200010L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10237 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_14_in_ruleJvmParameterizedTypeReference10250 = new BitSet(new long[]{0x0001000000200010L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10271 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_33_in_ruleJvmParameterizedTypeReference10285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleJvmWildcardTypeReference10498 = new BitSet(new long[]{0x0000000000000002L,0x0000000000014000L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference10520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference10547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound10585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound10595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleJvmUpperBound10632 = new BitSet(new long[]{0x0001000000200010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleJvmUpperBoundAnded10736 = new BitSet(new long[]{0x0001000000200010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound10793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound10803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleJvmLowerBound10840 = new BitSet(new long[]{0x0001000000200010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound10861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalGuiceModules1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalGuiceModules1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalGuiceModules1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalGuiceModules2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred5_InternalGuiceModules2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalGuiceModules2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalGuiceModules2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalGuiceModules3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalGuiceModules3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred10_InternalGuiceModules3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred11_InternalGuiceModules4100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred11_InternalGuiceModules4108 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalGuiceModules4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred12_InternalGuiceModules4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred12_InternalGuiceModules4229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred12_InternalGuiceModules4249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred13_InternalGuiceModules4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGuiceModules4525 = new BitSet(new long[]{0x0008000000004000L});
    public static final BitSet FOLLOW_14_in_synpred14_InternalGuiceModules4532 = new BitSet(new long[]{0x0001000000200010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalGuiceModules4539 = new BitSet(new long[]{0x0008000000004000L});
    public static final BitSet FOLLOW_51_in_synpred14_InternalGuiceModules4549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred16_InternalGuiceModules5994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred17_InternalGuiceModules7361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred17_InternalGuiceModules7370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred18_InternalGuiceModules7820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGuiceModules7872 = new BitSet(new long[]{0x0008000000004000L});
    public static final BitSet FOLLOW_14_in_synpred19_InternalGuiceModules7879 = new BitSet(new long[]{0x0001000000200010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalGuiceModules7886 = new BitSet(new long[]{0x0008000000004000L});
    public static final BitSet FOLLOW_51_in_synpred19_InternalGuiceModules7896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGuiceModules8337 = new BitSet(new long[]{0x0008000000004000L});
    public static final BitSet FOLLOW_14_in_synpred20_InternalGuiceModules8344 = new BitSet(new long[]{0x0001000000200010L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGuiceModules8351 = new BitSet(new long[]{0x0008000000004000L});
    public static final BitSet FOLLOW_51_in_synpred20_InternalGuiceModules8361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred21_InternalGuiceModules9242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_synpred22_InternalGuiceModules9387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_synpred23_InternalGuiceModules9417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred25_InternalGuiceModules9757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_synpred26_InternalGuiceModules10207 = new BitSet(new long[]{0x0000000000000002L});

}