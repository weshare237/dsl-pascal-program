package org.xtext.pascal.program.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.pascal.program.services.DemoFkdGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDemoFkdParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SIGNED_INTEGER_NUMBER", "RULE_INTEGER_NUMBER", "RULE_RELATIONAL_OPERATOR", "RULE_ADDITION_OPERATOR", "RULE_MULTIPLICATION_OPERATOR", "RULE_STRING", "RULE_REAL_NUMBER", "RULE_SIGNED_REAL_NUMBER", "RULE_NUMERIC_SUBRANGE", "RULE_VISIBILITY_SUPPORTED", "RULE_UNSIGNED_DIGIT_SEQUENCE", "RULE_DIGIT_SEQUENCE", "RULE_DIGIT", "RULE_ML_COMMENT", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'.'", "'import'", "'.*'", "'program'", "'('", "')'", "';'", "','", "'uses'", "'begin'", "'end'", "':'", "':='", "'['", "']'", "'^'", "'in'", "'='", "'or'", "'div'", "'mod'", "'and'", "'nil'", "'true'", "'false'", "'not'", "'while'", "'do'", "'repeat'", "'until'", "'for'", "'to'", "'downto'", "'if'", "'then'", "'else'", "'case'", "'of'", "'with'", "'goto'", "'label'", "'const'", "'type'", "'..'", "'packed'", "'array'", "'record'", "'class'", "'set'", "'file'", "'var'", "'forward'", "'procedure'", "'function'"
    };
    public static final int T__50=50;
    public static final int RULE_VISIBILITY_SUPPORTED=14;
    public static final int RULE_UNSIGNED_DIGIT_SEQUENCE=15;
    public static final int RULE_REAL_NUMBER=11;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int RULE_NUMERIC_SUBRANGE=13;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_DIGIT=17;
    public static final int RULE_SIGNED_REAL_NUMBER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=19;
    public static final int T__29=29;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int RULE_INTEGER_NUMBER=6;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_RELATIONAL_OPERATOR=7;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=20;
    public static final int RULE_DIGIT_SEQUENCE=16;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=21;
    public static final int RULE_MULTIPLICATION_OPERATOR=9;
    public static final int RULE_ANY_OTHER=22;
    public static final int RULE_SIGNED_INTEGER_NUMBER=5;
    public static final int T__48=48;
    public static final int RULE_ADDITION_OPERATOR=8;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDemoFkdParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDemoFkdParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDemoFkdParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDemoFkd.g"; }



     	private DemoFkdGrammarAccess grammarAccess;

        public InternalDemoFkdParser(TokenStream input, DemoFkdGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "pascal";
       	}

       	@Override
       	protected DemoFkdGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulepascal"
    // InternalDemoFkd.g:64:1: entryRulepascal returns [EObject current=null] : iv_rulepascal= rulepascal EOF ;
    public final EObject entryRulepascal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepascal = null;


        try {
            // InternalDemoFkd.g:64:47: (iv_rulepascal= rulepascal EOF )
            // InternalDemoFkd.g:65:2: iv_rulepascal= rulepascal EOF
            {
             newCompositeNode(grammarAccess.getPascalRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepascal=rulepascal();

            state._fsp--;

             current =iv_rulepascal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepascal"


    // $ANTLR start "rulepascal"
    // InternalDemoFkd.g:71:1: rulepascal returns [EObject current=null] : ( (lv_program_0_0= ruleAbstractElement ) )* ;
    public final EObject rulepascal() throws RecognitionException {
        EObject current = null;

        EObject lv_program_0_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:77:2: ( ( (lv_program_0_0= ruleAbstractElement ) )* )
            // InternalDemoFkd.g:78:2: ( (lv_program_0_0= ruleAbstractElement ) )*
            {
            // InternalDemoFkd.g:78:2: ( (lv_program_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==23||LA1_0==27||LA1_0==29) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDemoFkd.g:79:3: (lv_program_0_0= ruleAbstractElement )
            	    {
            	    // InternalDemoFkd.g:79:3: (lv_program_0_0= ruleAbstractElement )
            	    // InternalDemoFkd.g:80:4: lv_program_0_0= ruleAbstractElement
            	    {

            	    				newCompositeNode(grammarAccess.getPascalAccess().getProgramAbstractElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_program_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getPascalRule());
            	    				}
            	    				add(
            	    					current,
            	    					"program",
            	    					lv_program_0_0,
            	    					"org.xtext.pascal.program.DemoFkd.AbstractElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepascal"


    // $ANTLR start "entryRulePackageDeclaration"
    // InternalDemoFkd.g:100:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // InternalDemoFkd.g:100:59: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // InternalDemoFkd.g:101:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;

             current =iv_rulePackageDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // InternalDemoFkd.g:107:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_program_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_program_3_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:113:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_program_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // InternalDemoFkd.g:114:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_program_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // InternalDemoFkd.g:114:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_program_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // InternalDemoFkd.g:115:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_program_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
            		
            // InternalDemoFkd.g:119:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalDemoFkd.g:120:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalDemoFkd.g:120:4: (lv_name_1_0= ruleQualifiedName )
            // InternalDemoFkd.g:121:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.pascal.program.DemoFkd.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDemoFkd.g:142:3: ( (lv_program_3_0= ruleAbstractElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==23||LA2_0==27||LA2_0==29) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDemoFkd.g:143:4: (lv_program_3_0= ruleAbstractElement )
            	    {
            	    // InternalDemoFkd.g:143:4: (lv_program_3_0= ruleAbstractElement )
            	    // InternalDemoFkd.g:144:5: lv_program_3_0= ruleAbstractElement
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getProgramAbstractElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_program_3_0=ruleAbstractElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"program",
            	    						lv_program_3_0,
            	    						"org.xtext.pascal.program.DemoFkd.AbstractElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalDemoFkd.g:169:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalDemoFkd.g:169:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalDemoFkd.g:170:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalDemoFkd.g:176:1: ruleAbstractElement returns [EObject current=null] : (this_PackageDeclaration_0= rulePackageDeclaration | this_program_1= ruleprogram | this_Import_2= ruleImport ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDeclaration_0 = null;

        EObject this_program_1 = null;

        EObject this_Import_2 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:182:2: ( (this_PackageDeclaration_0= rulePackageDeclaration | this_program_1= ruleprogram | this_Import_2= ruleImport ) )
            // InternalDemoFkd.g:183:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_program_1= ruleprogram | this_Import_2= ruleImport )
            {
            // InternalDemoFkd.g:183:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_program_1= ruleprogram | this_Import_2= ruleImport )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt3=1;
                }
                break;
            case 29:
                {
                alt3=2;
                }
                break;
            case 27:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDemoFkd.g:184:3: this_PackageDeclaration_0= rulePackageDeclaration
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PackageDeclaration_0=rulePackageDeclaration();

                    state._fsp--;


                    			current = this_PackageDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:193:3: this_program_1= ruleprogram
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getProgramParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_program_1=ruleprogram();

                    state._fsp--;


                    			current = this_program_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDemoFkd.g:202:3: this_Import_2= ruleImport
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Import_2=ruleImport();

                    state._fsp--;


                    			current = this_Import_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDemoFkd.g:214:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalDemoFkd.g:214:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDemoFkd.g:215:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDemoFkd.g:221:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDemoFkd.g:227:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDemoFkd.g:228:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDemoFkd.g:228:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDemoFkd.g:229:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalDemoFkd.g:236:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==26) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDemoFkd.g:237:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,26,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleImport"
    // InternalDemoFkd.g:254:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalDemoFkd.g:254:47: (iv_ruleImport= ruleImport EOF )
            // InternalDemoFkd.g:255:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalDemoFkd.g:261:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:267:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalDemoFkd.g:268:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalDemoFkd.g:268:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalDemoFkd.g:269:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalDemoFkd.g:273:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalDemoFkd.g:274:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalDemoFkd.g:274:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalDemoFkd.g:275:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"org.xtext.pascal.program.DemoFkd.QualifiedNameWithWildcard");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalDemoFkd.g:296:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalDemoFkd.g:296:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalDemoFkd.g:297:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalDemoFkd.g:303:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:309:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalDemoFkd.g:310:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalDemoFkd.g:310:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalDemoFkd.g:311:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalDemoFkd.g:321:3: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDemoFkd.g:322:4: kw= '.*'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleprogram"
    // InternalDemoFkd.g:332:1: entryRuleprogram returns [EObject current=null] : iv_ruleprogram= ruleprogram EOF ;
    public final EObject entryRuleprogram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram = null;


        try {
            // InternalDemoFkd.g:332:48: (iv_ruleprogram= ruleprogram EOF )
            // InternalDemoFkd.g:333:2: iv_ruleprogram= ruleprogram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprogram=ruleprogram();

            state._fsp--;

             current =iv_ruleprogram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprogram"


    // $ANTLR start "ruleprogram"
    // InternalDemoFkd.g:339:1: ruleprogram returns [EObject current=null] : ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' ) ;
    public final EObject ruleprogram() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_1_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:345:2: ( ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' ) )
            // InternalDemoFkd.g:346:2: ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' )
            {
            // InternalDemoFkd.g:346:2: ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' )
            // InternalDemoFkd.g:347:3: ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.'
            {
            // InternalDemoFkd.g:347:3: ( (lv_heading_0_0= ruleprogram_heading_block ) )
            // InternalDemoFkd.g:348:4: (lv_heading_0_0= ruleprogram_heading_block )
            {
            // InternalDemoFkd.g:348:4: (lv_heading_0_0= ruleprogram_heading_block )
            // InternalDemoFkd.g:349:5: lv_heading_0_0= ruleprogram_heading_block
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getHeadingProgram_heading_blockParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_heading_0_0=ruleprogram_heading_block();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"heading",
            						lv_heading_0_0,
            						"org.xtext.pascal.program.DemoFkd.program_heading_block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDemoFkd.g:366:3: ( (lv_block_1_0= ruleblock ) )
            // InternalDemoFkd.g:367:4: (lv_block_1_0= ruleblock )
            {
            // InternalDemoFkd.g:367:4: (lv_block_1_0= ruleblock )
            // InternalDemoFkd.g:368:5: lv_block_1_0= ruleblock
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_block_1_0=ruleblock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_1_0,
            						"org.xtext.pascal.program.DemoFkd.block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getFullStopKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprogram"


    // $ANTLR start "entryRuleprogram_heading_block"
    // InternalDemoFkd.g:393:1: entryRuleprogram_heading_block returns [EObject current=null] : iv_ruleprogram_heading_block= ruleprogram_heading_block EOF ;
    public final EObject entryRuleprogram_heading_block() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram_heading_block = null;


        try {
            // InternalDemoFkd.g:393:62: (iv_ruleprogram_heading_block= ruleprogram_heading_block EOF )
            // InternalDemoFkd.g:394:2: iv_ruleprogram_heading_block= ruleprogram_heading_block EOF
            {
             newCompositeNode(grammarAccess.getProgram_heading_blockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprogram_heading_block=ruleprogram_heading_block();

            state._fsp--;

             current =iv_ruleprogram_heading_block; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprogram_heading_block"


    // $ANTLR start "ruleprogram_heading_block"
    // InternalDemoFkd.g:400:1: ruleprogram_heading_block returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';' ) ;
    public final EObject ruleprogram_heading_block() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_identifiers_3_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:406:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';' ) )
            // InternalDemoFkd.g:407:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';' )
            {
            // InternalDemoFkd.g:407:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';' )
            // InternalDemoFkd.g:408:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0());
            		
            // InternalDemoFkd.g:412:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDemoFkd.g:413:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDemoFkd.g:413:4: (lv_name_1_0= RULE_ID )
            // InternalDemoFkd.g:414:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProgram_heading_blockAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgram_heading_blockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDemoFkd.g:430:3: (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDemoFkd.g:431:4: otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getProgram_heading_blockAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalDemoFkd.g:435:4: ( (lv_identifiers_3_0= ruleidentifier_list ) )
                    // InternalDemoFkd.g:436:5: (lv_identifiers_3_0= ruleidentifier_list )
                    {
                    // InternalDemoFkd.g:436:5: (lv_identifiers_3_0= ruleidentifier_list )
                    // InternalDemoFkd.g:437:6: lv_identifiers_3_0= ruleidentifier_list
                    {

                    						newCompositeNode(grammarAccess.getProgram_heading_blockAccess().getIdentifiersIdentifier_listParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_identifiers_3_0=ruleidentifier_list();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgram_heading_blockRule());
                    						}
                    						set(
                    							current,
                    							"identifiers",
                    							lv_identifiers_3_0,
                    							"org.xtext.pascal.program.DemoFkd.identifier_list");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,31,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getProgram_heading_blockAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprogram_heading_block"


    // $ANTLR start "entryRuleidentifier_list"
    // InternalDemoFkd.g:467:1: entryRuleidentifier_list returns [EObject current=null] : iv_ruleidentifier_list= ruleidentifier_list EOF ;
    public final EObject entryRuleidentifier_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentifier_list = null;


        try {
            // InternalDemoFkd.g:467:56: (iv_ruleidentifier_list= ruleidentifier_list EOF )
            // InternalDemoFkd.g:468:2: iv_ruleidentifier_list= ruleidentifier_list EOF
            {
             newCompositeNode(grammarAccess.getIdentifier_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleidentifier_list=ruleidentifier_list();

            state._fsp--;

             current =iv_ruleidentifier_list; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleidentifier_list"


    // $ANTLR start "ruleidentifier_list"
    // InternalDemoFkd.g:474:1: ruleidentifier_list returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleidentifier_list() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;


        	enterRule();

        try {
            // InternalDemoFkd.g:480:2: ( ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) )
            // InternalDemoFkd.g:481:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            {
            // InternalDemoFkd.g:481:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            // InternalDemoFkd.g:482:3: ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            {
            // InternalDemoFkd.g:482:3: ( (lv_names_0_0= RULE_ID ) )
            // InternalDemoFkd.g:483:4: (lv_names_0_0= RULE_ID )
            {
            // InternalDemoFkd.g:483:4: (lv_names_0_0= RULE_ID )
            // InternalDemoFkd.g:484:5: lv_names_0_0= RULE_ID
            {
            lv_names_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_names_0_0, grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIdentifier_listRule());
            					}
            					addWithLastConsumed(
            						current,
            						"names",
            						lv_names_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDemoFkd.g:500:3: (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==33) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDemoFkd.g:501:4: otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalDemoFkd.g:505:4: ( (lv_names_2_0= RULE_ID ) )
            	    // InternalDemoFkd.g:506:5: (lv_names_2_0= RULE_ID )
            	    {
            	    // InternalDemoFkd.g:506:5: (lv_names_2_0= RULE_ID )
            	    // InternalDemoFkd.g:507:6: lv_names_2_0= RULE_ID
            	    {
            	    lv_names_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    						newLeafNode(lv_names_2_0, grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getIdentifier_listRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"names",
            	    							lv_names_2_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleidentifier_list"


    // $ANTLR start "entryRuleblock"
    // InternalDemoFkd.g:528:1: entryRuleblock returns [EObject current=null] : iv_ruleblock= ruleblock EOF ;
    public final EObject entryRuleblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleblock = null;


        try {
            // InternalDemoFkd.g:528:46: (iv_ruleblock= ruleblock EOF )
            // InternalDemoFkd.g:529:2: iv_ruleblock= ruleblock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleblock=ruleblock();

            state._fsp--;

             current =iv_ruleblock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleblock"


    // $ANTLR start "ruleblock"
    // InternalDemoFkd.g:535:1: ruleblock returns [EObject current=null] : ( ( (lv_uses_command_0_0= ruleuses_command_definition_part ) )? ( (lv_label_1_0= rulelabel_declaration_part ) )? ( (lv_constant_2_0= ruleconstant_definition_part ) )? ( (lv_type_3_0= ruletype_definition_part ) )? ( (lv_variable_4_0= rulevariable_declaration_part ) )? ( (lv_abstraction_5_0= ruleprocedure_and_function_declaration_part ) )? ( (lv_statement_6_0= rulestatement_part ) ) ) ;
    public final EObject ruleblock() throws RecognitionException {
        EObject current = null;

        EObject lv_uses_command_0_0 = null;

        EObject lv_label_1_0 = null;

        EObject lv_constant_2_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_variable_4_0 = null;

        EObject lv_abstraction_5_0 = null;

        EObject lv_statement_6_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:541:2: ( ( ( (lv_uses_command_0_0= ruleuses_command_definition_part ) )? ( (lv_label_1_0= rulelabel_declaration_part ) )? ( (lv_constant_2_0= ruleconstant_definition_part ) )? ( (lv_type_3_0= ruletype_definition_part ) )? ( (lv_variable_4_0= rulevariable_declaration_part ) )? ( (lv_abstraction_5_0= ruleprocedure_and_function_declaration_part ) )? ( (lv_statement_6_0= rulestatement_part ) ) ) )
            // InternalDemoFkd.g:542:2: ( ( (lv_uses_command_0_0= ruleuses_command_definition_part ) )? ( (lv_label_1_0= rulelabel_declaration_part ) )? ( (lv_constant_2_0= ruleconstant_definition_part ) )? ( (lv_type_3_0= ruletype_definition_part ) )? ( (lv_variable_4_0= rulevariable_declaration_part ) )? ( (lv_abstraction_5_0= ruleprocedure_and_function_declaration_part ) )? ( (lv_statement_6_0= rulestatement_part ) ) )
            {
            // InternalDemoFkd.g:542:2: ( ( (lv_uses_command_0_0= ruleuses_command_definition_part ) )? ( (lv_label_1_0= rulelabel_declaration_part ) )? ( (lv_constant_2_0= ruleconstant_definition_part ) )? ( (lv_type_3_0= ruletype_definition_part ) )? ( (lv_variable_4_0= rulevariable_declaration_part ) )? ( (lv_abstraction_5_0= ruleprocedure_and_function_declaration_part ) )? ( (lv_statement_6_0= rulestatement_part ) ) )
            // InternalDemoFkd.g:543:3: ( (lv_uses_command_0_0= ruleuses_command_definition_part ) )? ( (lv_label_1_0= rulelabel_declaration_part ) )? ( (lv_constant_2_0= ruleconstant_definition_part ) )? ( (lv_type_3_0= ruletype_definition_part ) )? ( (lv_variable_4_0= rulevariable_declaration_part ) )? ( (lv_abstraction_5_0= ruleprocedure_and_function_declaration_part ) )? ( (lv_statement_6_0= rulestatement_part ) )
            {
            // InternalDemoFkd.g:543:3: ( (lv_uses_command_0_0= ruleuses_command_definition_part ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==34) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDemoFkd.g:544:4: (lv_uses_command_0_0= ruleuses_command_definition_part )
                    {
                    // InternalDemoFkd.g:544:4: (lv_uses_command_0_0= ruleuses_command_definition_part )
                    // InternalDemoFkd.g:545:5: lv_uses_command_0_0= ruleuses_command_definition_part
                    {

                    					newCompositeNode(grammarAccess.getBlockAccess().getUses_commandUses_command_definition_partParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_uses_command_0_0=ruleuses_command_definition_part();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBlockRule());
                    					}
                    					set(
                    						current,
                    						"uses_command",
                    						lv_uses_command_0_0,
                    						"org.xtext.pascal.program.DemoFkd.uses_command_definition_part");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDemoFkd.g:562:3: ( (lv_label_1_0= rulelabel_declaration_part ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==66) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDemoFkd.g:563:4: (lv_label_1_0= rulelabel_declaration_part )
                    {
                    // InternalDemoFkd.g:563:4: (lv_label_1_0= rulelabel_declaration_part )
                    // InternalDemoFkd.g:564:5: lv_label_1_0= rulelabel_declaration_part
                    {

                    					newCompositeNode(grammarAccess.getBlockAccess().getLabelLabel_declaration_partParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_label_1_0=rulelabel_declaration_part();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBlockRule());
                    					}
                    					set(
                    						current,
                    						"label",
                    						lv_label_1_0,
                    						"org.xtext.pascal.program.DemoFkd.label_declaration_part");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDemoFkd.g:581:3: ( (lv_constant_2_0= ruleconstant_definition_part ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==67) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDemoFkd.g:582:4: (lv_constant_2_0= ruleconstant_definition_part )
                    {
                    // InternalDemoFkd.g:582:4: (lv_constant_2_0= ruleconstant_definition_part )
                    // InternalDemoFkd.g:583:5: lv_constant_2_0= ruleconstant_definition_part
                    {

                    					newCompositeNode(grammarAccess.getBlockAccess().getConstantConstant_definition_partParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_constant_2_0=ruleconstant_definition_part();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBlockRule());
                    					}
                    					set(
                    						current,
                    						"constant",
                    						lv_constant_2_0,
                    						"org.xtext.pascal.program.DemoFkd.constant_definition_part");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDemoFkd.g:600:3: ( (lv_type_3_0= ruletype_definition_part ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==68) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDemoFkd.g:601:4: (lv_type_3_0= ruletype_definition_part )
                    {
                    // InternalDemoFkd.g:601:4: (lv_type_3_0= ruletype_definition_part )
                    // InternalDemoFkd.g:602:5: lv_type_3_0= ruletype_definition_part
                    {

                    					newCompositeNode(grammarAccess.getBlockAccess().getTypeType_definition_partParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_type_3_0=ruletype_definition_part();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBlockRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_3_0,
                    						"org.xtext.pascal.program.DemoFkd.type_definition_part");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDemoFkd.g:619:3: ( (lv_variable_4_0= rulevariable_declaration_part ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==76) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDemoFkd.g:620:4: (lv_variable_4_0= rulevariable_declaration_part )
                    {
                    // InternalDemoFkd.g:620:4: (lv_variable_4_0= rulevariable_declaration_part )
                    // InternalDemoFkd.g:621:5: lv_variable_4_0= rulevariable_declaration_part
                    {

                    					newCompositeNode(grammarAccess.getBlockAccess().getVariableVariable_declaration_partParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_variable_4_0=rulevariable_declaration_part();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBlockRule());
                    					}
                    					set(
                    						current,
                    						"variable",
                    						lv_variable_4_0,
                    						"org.xtext.pascal.program.DemoFkd.variable_declaration_part");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDemoFkd.g:638:3: ( (lv_abstraction_5_0= ruleprocedure_and_function_declaration_part ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=78 && LA13_0<=79)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDemoFkd.g:639:4: (lv_abstraction_5_0= ruleprocedure_and_function_declaration_part )
                    {
                    // InternalDemoFkd.g:639:4: (lv_abstraction_5_0= ruleprocedure_and_function_declaration_part )
                    // InternalDemoFkd.g:640:5: lv_abstraction_5_0= ruleprocedure_and_function_declaration_part
                    {

                    					newCompositeNode(grammarAccess.getBlockAccess().getAbstractionProcedure_and_function_declaration_partParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_abstraction_5_0=ruleprocedure_and_function_declaration_part();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBlockRule());
                    					}
                    					set(
                    						current,
                    						"abstraction",
                    						lv_abstraction_5_0,
                    						"org.xtext.pascal.program.DemoFkd.procedure_and_function_declaration_part");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDemoFkd.g:657:3: ( (lv_statement_6_0= rulestatement_part ) )
            // InternalDemoFkd.g:658:4: (lv_statement_6_0= rulestatement_part )
            {
            // InternalDemoFkd.g:658:4: (lv_statement_6_0= rulestatement_part )
            // InternalDemoFkd.g:659:5: lv_statement_6_0= rulestatement_part
            {

            					newCompositeNode(grammarAccess.getBlockAccess().getStatementStatement_partParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_6_0=rulestatement_part();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlockRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_6_0,
            						"org.xtext.pascal.program.DemoFkd.statement_part");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleblock"


    // $ANTLR start "entryRuleuses_command_definition_part"
    // InternalDemoFkd.g:680:1: entryRuleuses_command_definition_part returns [EObject current=null] : iv_ruleuses_command_definition_part= ruleuses_command_definition_part EOF ;
    public final EObject entryRuleuses_command_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuses_command_definition_part = null;


        try {
            // InternalDemoFkd.g:680:69: (iv_ruleuses_command_definition_part= ruleuses_command_definition_part EOF )
            // InternalDemoFkd.g:681:2: iv_ruleuses_command_definition_part= ruleuses_command_definition_part EOF
            {
             newCompositeNode(grammarAccess.getUses_command_definition_partRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleuses_command_definition_part=ruleuses_command_definition_part();

            state._fsp--;

             current =iv_ruleuses_command_definition_part; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleuses_command_definition_part"


    // $ANTLR start "ruleuses_command_definition_part"
    // InternalDemoFkd.g:687:1: ruleuses_command_definition_part returns [EObject current=null] : (otherlv_0= 'uses' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleuses_command_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDemoFkd.g:693:2: ( (otherlv_0= 'uses' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' ) )
            // InternalDemoFkd.g:694:2: (otherlv_0= 'uses' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )
            {
            // InternalDemoFkd.g:694:2: (otherlv_0= 'uses' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';' )
            // InternalDemoFkd.g:695:3: otherlv_0= 'uses' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUses_command_definition_partAccess().getUsesKeyword_0());
            		
            // InternalDemoFkd.g:699:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDemoFkd.g:700:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDemoFkd.g:700:4: (lv_name_1_0= RULE_ID )
            // InternalDemoFkd.g:701:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUses_command_definition_partAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUses_command_definition_partRule());
            					}
            					addWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDemoFkd.g:717:3: (otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDemoFkd.g:718:4: otherlv_2= ',' ( (lv_name_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getUses_command_definition_partAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalDemoFkd.g:722:4: ( (lv_name_3_0= RULE_ID ) )
            	    // InternalDemoFkd.g:723:5: (lv_name_3_0= RULE_ID )
            	    {
            	    // InternalDemoFkd.g:723:5: (lv_name_3_0= RULE_ID )
            	    // InternalDemoFkd.g:724:6: lv_name_3_0= RULE_ID
            	    {
            	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    						newLeafNode(lv_name_3_0, grammarAccess.getUses_command_definition_partAccess().getNameIDTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getUses_command_definition_partRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_3_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getUses_command_definition_partAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleuses_command_definition_part"


    // $ANTLR start "entryRulestatement_part"
    // InternalDemoFkd.g:749:1: entryRulestatement_part returns [EObject current=null] : iv_rulestatement_part= rulestatement_part EOF ;
    public final EObject entryRulestatement_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_part = null;


        try {
            // InternalDemoFkd.g:749:55: (iv_rulestatement_part= rulestatement_part EOF )
            // InternalDemoFkd.g:750:2: iv_rulestatement_part= rulestatement_part EOF
            {
             newCompositeNode(grammarAccess.getStatement_partRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestatement_part=rulestatement_part();

            state._fsp--;

             current =iv_rulestatement_part; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatement_part"


    // $ANTLR start "rulestatement_part"
    // InternalDemoFkd.g:756:1: rulestatement_part returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) ;
    public final EObject rulestatement_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_1_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:762:2: ( (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) )
            // InternalDemoFkd.g:763:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            {
            // InternalDemoFkd.g:763:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            // InternalDemoFkd.g:764:3: otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getStatement_partAccess().getBeginKeyword_0());
            		
            // InternalDemoFkd.g:768:3: ( (lv_sequence_1_0= rulestatement_sequence ) )
            // InternalDemoFkd.g:769:4: (lv_sequence_1_0= rulestatement_sequence )
            {
            // InternalDemoFkd.g:769:4: (lv_sequence_1_0= rulestatement_sequence )
            // InternalDemoFkd.g:770:5: lv_sequence_1_0= rulestatement_sequence
            {

            					newCompositeNode(grammarAccess.getStatement_partAccess().getSequenceStatement_sequenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_sequence_1_0=rulestatement_sequence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatement_partRule());
            					}
            					set(
            						current,
            						"sequence",
            						lv_sequence_1_0,
            						"org.xtext.pascal.program.DemoFkd.statement_sequence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getStatement_partAccess().getEndKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement_part"


    // $ANTLR start "entryRulestatement_sequence"
    // InternalDemoFkd.g:795:1: entryRulestatement_sequence returns [EObject current=null] : iv_rulestatement_sequence= rulestatement_sequence EOF ;
    public final EObject entryRulestatement_sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_sequence = null;


        try {
            // InternalDemoFkd.g:795:59: (iv_rulestatement_sequence= rulestatement_sequence EOF )
            // InternalDemoFkd.g:796:2: iv_rulestatement_sequence= rulestatement_sequence EOF
            {
             newCompositeNode(grammarAccess.getStatement_sequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestatement_sequence=rulestatement_sequence();

            state._fsp--;

             current =iv_rulestatement_sequence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatement_sequence"


    // $ANTLR start "rulestatement_sequence"
    // InternalDemoFkd.g:802:1: rulestatement_sequence returns [EObject current=null] : ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* ) ;
    public final EObject rulestatement_sequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_statements_0_0 = null;

        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:808:2: ( ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* ) )
            // InternalDemoFkd.g:809:2: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* )
            {
            // InternalDemoFkd.g:809:2: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* )
            // InternalDemoFkd.g:810:3: ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )*
            {
            // InternalDemoFkd.g:810:3: ( (lv_statements_0_0= rulestatement ) )
            // InternalDemoFkd.g:811:4: (lv_statements_0_0= rulestatement )
            {
            // InternalDemoFkd.g:811:4: (lv_statements_0_0= rulestatement )
            // InternalDemoFkd.g:812:5: lv_statements_0_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_statements_0_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatement_sequenceRule());
            					}
            					add(
            						current,
            						"statements",
            						lv_statements_0_0,
            						"org.xtext.pascal.program.DemoFkd.statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDemoFkd.g:829:3: (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==32) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDemoFkd.g:830:4: otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) )
            	    {
            	    otherlv_1=(Token)match(input,32,FOLLOW_16); 

            	    				newLeafNode(otherlv_1, grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalDemoFkd.g:834:4: ( (lv_statements_2_0= rulestatement ) )
            	    // InternalDemoFkd.g:835:5: (lv_statements_2_0= rulestatement )
            	    {
            	    // InternalDemoFkd.g:835:5: (lv_statements_2_0= rulestatement )
            	    // InternalDemoFkd.g:836:6: lv_statements_2_0= rulestatement
            	    {

            	    						newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_statements_2_0=rulestatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStatement_sequenceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"statements",
            	    							lv_statements_2_0,
            	    							"org.xtext.pascal.program.DemoFkd.statement");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement_sequence"


    // $ANTLR start "entryRulestatement"
    // InternalDemoFkd.g:858:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // InternalDemoFkd.g:858:50: (iv_rulestatement= rulestatement EOF )
            // InternalDemoFkd.g:859:2: iv_rulestatement= rulestatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestatement=rulestatement();

            state._fsp--;

             current =iv_rulestatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // InternalDemoFkd.g:865:1: rulestatement returns [EObject current=null] : ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_label_0_0 = null;

        EObject lv_simple_2_0 = null;

        EObject lv_structured_3_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:871:2: ( ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) ) )
            // InternalDemoFkd.g:872:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) )
            {
            // InternalDemoFkd.g:872:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) )
            // InternalDemoFkd.g:873:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) )
            {
            // InternalDemoFkd.g:873:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_SIGNED_INTEGER_NUMBER && LA16_0<=RULE_INTEGER_NUMBER)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDemoFkd.g:874:4: ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':'
                    {
                    // InternalDemoFkd.g:874:4: ( (lv_label_0_0= rulelabel ) )
                    // InternalDemoFkd.g:875:5: (lv_label_0_0= rulelabel )
                    {
                    // InternalDemoFkd.g:875:5: (lv_label_0_0= rulelabel )
                    // InternalDemoFkd.g:876:6: lv_label_0_0= rulelabel
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getLabelLabelParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_label_0_0=rulelabel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_0_0,
                    							"org.xtext.pascal.program.DemoFkd.label");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,37,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalDemoFkd.g:898:3: ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==EOF||LA17_0==RULE_ID||LA17_0==32||LA17_0==36||LA17_0==55||LA17_0==61||LA17_0==65) ) {
                alt17=1;
            }
            else if ( (LA17_0==35||LA17_0==52||LA17_0==54||LA17_0==56||LA17_0==59||LA17_0==62||LA17_0==64) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalDemoFkd.g:899:4: ( (lv_simple_2_0= rulesimple_statement ) )
                    {
                    // InternalDemoFkd.g:899:4: ( (lv_simple_2_0= rulesimple_statement ) )
                    // InternalDemoFkd.g:900:5: (lv_simple_2_0= rulesimple_statement )
                    {
                    // InternalDemoFkd.g:900:5: (lv_simple_2_0= rulesimple_statement )
                    // InternalDemoFkd.g:901:6: lv_simple_2_0= rulesimple_statement
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getSimpleSimple_statementParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_simple_2_0=rulesimple_statement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"simple",
                    							lv_simple_2_0,
                    							"org.xtext.pascal.program.DemoFkd.simple_statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:919:4: ( (lv_structured_3_0= rulestructured_statement ) )
                    {
                    // InternalDemoFkd.g:919:4: ( (lv_structured_3_0= rulestructured_statement ) )
                    // InternalDemoFkd.g:920:5: (lv_structured_3_0= rulestructured_statement )
                    {
                    // InternalDemoFkd.g:920:5: (lv_structured_3_0= rulestructured_statement )
                    // InternalDemoFkd.g:921:6: lv_structured_3_0= rulestructured_statement
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getStructuredStructured_statementParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_structured_3_0=rulestructured_statement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"structured",
                    							lv_structured_3_0,
                    							"org.xtext.pascal.program.DemoFkd.structured_statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRulelabel"
    // InternalDemoFkd.g:943:1: entryRulelabel returns [EObject current=null] : iv_rulelabel= rulelabel EOF ;
    public final EObject entryRulelabel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel = null;


        try {
            // InternalDemoFkd.g:943:46: (iv_rulelabel= rulelabel EOF )
            // InternalDemoFkd.g:944:2: iv_rulelabel= rulelabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelabel=rulelabel();

            state._fsp--;

             current =iv_rulelabel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelabel"


    // $ANTLR start "rulelabel"
    // InternalDemoFkd.g:950:1: rulelabel returns [EObject current=null] : ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) ) ;
    public final EObject rulelabel() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token lv_number_1_0=null;


        	enterRule();

        try {
            // InternalDemoFkd.g:956:2: ( ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) ) )
            // InternalDemoFkd.g:957:2: ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) )
            {
            // InternalDemoFkd.g:957:2: ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_INTEGER_NUMBER) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalDemoFkd.g:958:3: ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    {
                    // InternalDemoFkd.g:958:3: ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    // InternalDemoFkd.g:959:4: (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    {
                    // InternalDemoFkd.g:959:4: (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    // InternalDemoFkd.g:960:5: lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER
                    {
                    lv_number_0_0=(Token)match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_number_0_0, grammarAccess.getLabelAccess().getNumberSIGNED_INTEGER_NUMBERTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLabelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"number",
                    						lv_number_0_0,
                    						"org.xtext.pascal.program.DemoFkd.SIGNED_INTEGER_NUMBER");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:977:3: ( (lv_number_1_0= RULE_INTEGER_NUMBER ) )
                    {
                    // InternalDemoFkd.g:977:3: ( (lv_number_1_0= RULE_INTEGER_NUMBER ) )
                    // InternalDemoFkd.g:978:4: (lv_number_1_0= RULE_INTEGER_NUMBER )
                    {
                    // InternalDemoFkd.g:978:4: (lv_number_1_0= RULE_INTEGER_NUMBER )
                    // InternalDemoFkd.g:979:5: lv_number_1_0= RULE_INTEGER_NUMBER
                    {
                    lv_number_1_0=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_number_1_0, grammarAccess.getLabelAccess().getNumberINTEGER_NUMBERTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLabelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"number",
                    						lv_number_1_0,
                    						"org.xtext.pascal.program.DemoFkd.INTEGER_NUMBER");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelabel"


    // $ANTLR start "entryRulesimple_statement"
    // InternalDemoFkd.g:999:1: entryRulesimple_statement returns [EObject current=null] : iv_rulesimple_statement= rulesimple_statement EOF ;
    public final EObject entryRulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_statement = null;


        try {
            // InternalDemoFkd.g:999:57: (iv_rulesimple_statement= rulesimple_statement EOF )
            // InternalDemoFkd.g:1000:2: iv_rulesimple_statement= rulesimple_statement EOF
            {
             newCompositeNode(grammarAccess.getSimple_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesimple_statement=rulesimple_statement();

            state._fsp--;

             current =iv_rulesimple_statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesimple_statement"


    // $ANTLR start "rulesimple_statement"
    // InternalDemoFkd.g:1006:1: rulesimple_statement returns [EObject current=null] : ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) | ( (lv_function_noargs_3_0= RULE_ID ) ) )? ;
    public final EObject rulesimple_statement() throws RecognitionException {
        EObject current = null;

        Token lv_function_noargs_3_0=null;
        EObject lv_assignment_0_0 = null;

        EObject lv_function_1_0 = null;

        EObject lv_goto_2_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:1012:2: ( ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) | ( (lv_function_noargs_3_0= RULE_ID ) ) )? )
            // InternalDemoFkd.g:1013:2: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) | ( (lv_function_noargs_3_0= RULE_ID ) ) )?
            {
            // InternalDemoFkd.g:1013:2: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) | ( (lv_function_noargs_3_0= RULE_ID ) ) )?
            int alt19=5;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                    case 30:
                        {
                        alt19=2;
                        }
                        break;
                    case 26:
                    case 38:
                    case 39:
                    case 41:
                        {
                        alt19=1;
                        }
                        break;
                    case EOF:
                    case 32:
                    case 36:
                    case 55:
                    case 61:
                        {
                        alt19=4;
                        }
                        break;
                }

            }
            else if ( (LA19_0==65) ) {
                alt19=3;
            }
            switch (alt19) {
                case 1 :
                    // InternalDemoFkd.g:1014:3: ( (lv_assignment_0_0= ruleassignment_statement ) )
                    {
                    // InternalDemoFkd.g:1014:3: ( (lv_assignment_0_0= ruleassignment_statement ) )
                    // InternalDemoFkd.g:1015:4: (lv_assignment_0_0= ruleassignment_statement )
                    {
                    // InternalDemoFkd.g:1015:4: (lv_assignment_0_0= ruleassignment_statement )
                    // InternalDemoFkd.g:1016:5: lv_assignment_0_0= ruleassignment_statement
                    {

                    					newCompositeNode(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_statementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_assignment_0_0=ruleassignment_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                    					}
                    					set(
                    						current,
                    						"assignment",
                    						lv_assignment_0_0,
                    						"org.xtext.pascal.program.DemoFkd.assignment_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:1034:3: ( (lv_function_1_0= rulefunction_designator ) )
                    {
                    // InternalDemoFkd.g:1034:3: ( (lv_function_1_0= rulefunction_designator ) )
                    // InternalDemoFkd.g:1035:4: (lv_function_1_0= rulefunction_designator )
                    {
                    // InternalDemoFkd.g:1035:4: (lv_function_1_0= rulefunction_designator )
                    // InternalDemoFkd.g:1036:5: lv_function_1_0= rulefunction_designator
                    {

                    					newCompositeNode(grammarAccess.getSimple_statementAccess().getFunctionFunction_designatorParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_function_1_0=rulefunction_designator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                    					}
                    					set(
                    						current,
                    						"function",
                    						lv_function_1_0,
                    						"org.xtext.pascal.program.DemoFkd.function_designator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDemoFkd.g:1054:3: ( (lv_goto_2_0= rulegoto_statement ) )
                    {
                    // InternalDemoFkd.g:1054:3: ( (lv_goto_2_0= rulegoto_statement ) )
                    // InternalDemoFkd.g:1055:4: (lv_goto_2_0= rulegoto_statement )
                    {
                    // InternalDemoFkd.g:1055:4: (lv_goto_2_0= rulegoto_statement )
                    // InternalDemoFkd.g:1056:5: lv_goto_2_0= rulegoto_statement
                    {

                    					newCompositeNode(grammarAccess.getSimple_statementAccess().getGotoGoto_statementParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_goto_2_0=rulegoto_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                    					}
                    					set(
                    						current,
                    						"goto",
                    						lv_goto_2_0,
                    						"org.xtext.pascal.program.DemoFkd.goto_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDemoFkd.g:1074:3: ( (lv_function_noargs_3_0= RULE_ID ) )
                    {
                    // InternalDemoFkd.g:1074:3: ( (lv_function_noargs_3_0= RULE_ID ) )
                    // InternalDemoFkd.g:1075:4: (lv_function_noargs_3_0= RULE_ID )
                    {
                    // InternalDemoFkd.g:1075:4: (lv_function_noargs_3_0= RULE_ID )
                    // InternalDemoFkd.g:1076:5: lv_function_noargs_3_0= RULE_ID
                    {
                    lv_function_noargs_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_function_noargs_3_0, grammarAccess.getSimple_statementAccess().getFunction_noargsIDTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimple_statementRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"function_noargs",
                    						lv_function_noargs_3_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesimple_statement"


    // $ANTLR start "entryRuleassignment_statement"
    // InternalDemoFkd.g:1096:1: entryRuleassignment_statement returns [EObject current=null] : iv_ruleassignment_statement= ruleassignment_statement EOF ;
    public final EObject entryRuleassignment_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignment_statement = null;


        try {
            // InternalDemoFkd.g:1096:61: (iv_ruleassignment_statement= ruleassignment_statement EOF )
            // InternalDemoFkd.g:1097:2: iv_ruleassignment_statement= ruleassignment_statement EOF
            {
             newCompositeNode(grammarAccess.getAssignment_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleassignment_statement=ruleassignment_statement();

            state._fsp--;

             current =iv_ruleassignment_statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleassignment_statement"


    // $ANTLR start "ruleassignment_statement"
    // InternalDemoFkd.g:1103:1: ruleassignment_statement returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) ) ;
    public final EObject ruleassignment_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:1109:2: ( ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) ) )
            // InternalDemoFkd.g:1110:2: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) )
            {
            // InternalDemoFkd.g:1110:2: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) )
            // InternalDemoFkd.g:1111:3: ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) )
            {
            // InternalDemoFkd.g:1111:3: ( (lv_variable_0_0= rulevariable ) )
            // InternalDemoFkd.g:1112:4: (lv_variable_0_0= rulevariable )
            {
            // InternalDemoFkd.g:1112:4: (lv_variable_0_0= rulevariable )
            // InternalDemoFkd.g:1113:5: lv_variable_0_0= rulevariable
            {

            					newCompositeNode(grammarAccess.getAssignment_statementAccess().getVariableVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_variable_0_0=rulevariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignment_statementRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_0_0,
            						"org.xtext.pascal.program.DemoFkd.variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1());
            		
            // InternalDemoFkd.g:1134:3: ( (lv_expression_2_0= ruleexpression ) )
            // InternalDemoFkd.g:1135:4: (lv_expression_2_0= ruleexpression )
            {
            // InternalDemoFkd.g:1135:4: (lv_expression_2_0= ruleexpression )
            // InternalDemoFkd.g:1136:5: lv_expression_2_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getAssignment_statementAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignment_statementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"org.xtext.pascal.program.DemoFkd.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleassignment_statement"


    // $ANTLR start "entryRulevariable"
    // InternalDemoFkd.g:1157:1: entryRulevariable returns [EObject current=null] : iv_rulevariable= rulevariable EOF ;
    public final EObject entryRulevariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable = null;


        try {
            // InternalDemoFkd.g:1157:49: (iv_rulevariable= rulevariable EOF )
            // InternalDemoFkd.g:1158:2: iv_rulevariable= rulevariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable=rulevariable();

            state._fsp--;

             current =iv_rulevariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable"


    // $ANTLR start "rulevariable"
    // InternalDemoFkd.g:1164:1: rulevariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) ) ;
    public final EObject rulevariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_variable_1_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:1170:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) ) )
            // InternalDemoFkd.g:1171:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) )
            {
            // InternalDemoFkd.g:1171:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) )
            // InternalDemoFkd.g:1172:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) )
            {
            // InternalDemoFkd.g:1172:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDemoFkd.g:1173:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDemoFkd.g:1173:4: (lv_name_0_0= RULE_ID )
            // InternalDemoFkd.g:1174:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDemoFkd.g:1190:3: ( (lv_variable_1_0= rulevar_ ) )
            // InternalDemoFkd.g:1191:4: (lv_variable_1_0= rulevar_ )
            {
            // InternalDemoFkd.g:1191:4: (lv_variable_1_0= rulevar_ )
            // InternalDemoFkd.g:1192:5: lv_variable_1_0= rulevar_
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getVariableVar_ParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_variable_1_0=rulevar_();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_1_0,
            						"org.xtext.pascal.program.DemoFkd.var_");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable"


    // $ANTLR start "entryRulevar_"
    // InternalDemoFkd.g:1213:1: entryRulevar_ returns [EObject current=null] : iv_rulevar_= rulevar_ EOF ;
    public final EObject entryRulevar_() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevar_ = null;


        try {
            // InternalDemoFkd.g:1213:45: (iv_rulevar_= rulevar_ EOF )
            // InternalDemoFkd.g:1214:2: iv_rulevar_= rulevar_ EOF
            {
             newCompositeNode(grammarAccess.getVar_Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulevar_=rulevar_();

            state._fsp--;

             current =iv_rulevar_; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevar_"


    // $ANTLR start "rulevar_"
    // InternalDemoFkd.g:1220:1: rulevar_ returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) ) )? ;
    public final EObject rulevar_() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_accessor_4_0=null;
        Token lv_name_5_0=null;
        Token otherlv_7=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_array_3_0 = null;

        EObject lv_variable_6_0 = null;

        EObject lv_pointer_8_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:1226:2: ( ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) ) )? )
            // InternalDemoFkd.g:1227:2: ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) ) )?
            {
            // InternalDemoFkd.g:1227:2: ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) ) )?
            int alt20=4;
            switch ( input.LA(1) ) {
                case 39:
                    {
                    alt20=1;
                    }
                    break;
                case 26:
                    {
                    alt20=2;
                    }
                    break;
                case 41:
                    {
                    alt20=3;
                    }
                    break;
            }

            switch (alt20) {
                case 1 :
                    // InternalDemoFkd.g:1228:3: (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) )
                    {
                    // InternalDemoFkd.g:1228:3: (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) )
                    // InternalDemoFkd.g:1229:4: otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) )
                    {
                    otherlv_0=(Token)match(input,39,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getVar_Access().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalDemoFkd.g:1233:4: ( (lv_expressions_1_0= ruleexpression_list ) )
                    // InternalDemoFkd.g:1234:5: (lv_expressions_1_0= ruleexpression_list )
                    {
                    // InternalDemoFkd.g:1234:5: (lv_expressions_1_0= ruleexpression_list )
                    // InternalDemoFkd.g:1235:6: lv_expressions_1_0= ruleexpression_list
                    {

                    						newCompositeNode(grammarAccess.getVar_Access().getExpressionsExpression_listParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_expressions_1_0=ruleexpression_list();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVar_Rule());
                    						}
                    						set(
                    							current,
                    							"expressions",
                    							lv_expressions_1_0,
                    							"org.xtext.pascal.program.DemoFkd.expression_list");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,40,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getVar_Access().getRightSquareBracketKeyword_0_2());
                    			
                    // InternalDemoFkd.g:1256:4: ( (lv_array_3_0= rulevar_ ) )
                    // InternalDemoFkd.g:1257:5: (lv_array_3_0= rulevar_ )
                    {
                    // InternalDemoFkd.g:1257:5: (lv_array_3_0= rulevar_ )
                    // InternalDemoFkd.g:1258:6: lv_array_3_0= rulevar_
                    {

                    						newCompositeNode(grammarAccess.getVar_Access().getArrayVar_ParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_array_3_0=rulevar_();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVar_Rule());
                    						}
                    						set(
                    							current,
                    							"array",
                    							lv_array_3_0,
                    							"org.xtext.pascal.program.DemoFkd.var_");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:1277:3: ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) )
                    {
                    // InternalDemoFkd.g:1277:3: ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) )
                    // InternalDemoFkd.g:1278:4: ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) )
                    {
                    // InternalDemoFkd.g:1278:4: ( (lv_accessor_4_0= '.' ) )
                    // InternalDemoFkd.g:1279:5: (lv_accessor_4_0= '.' )
                    {
                    // InternalDemoFkd.g:1279:5: (lv_accessor_4_0= '.' )
                    // InternalDemoFkd.g:1280:6: lv_accessor_4_0= '.'
                    {
                    lv_accessor_4_0=(Token)match(input,26,FOLLOW_4); 

                    						newLeafNode(lv_accessor_4_0, grammarAccess.getVar_Access().getAccessorFullStopKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVar_Rule());
                    						}
                    						setWithLastConsumed(current, "accessor", lv_accessor_4_0 != null, ".");
                    					

                    }


                    }

                    // InternalDemoFkd.g:1292:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalDemoFkd.g:1293:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalDemoFkd.g:1293:5: (lv_name_5_0= RULE_ID )
                    // InternalDemoFkd.g:1294:6: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(lv_name_5_0, grammarAccess.getVar_Access().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVar_Rule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalDemoFkd.g:1310:4: ( (lv_variable_6_0= rulevar_ ) )
                    // InternalDemoFkd.g:1311:5: (lv_variable_6_0= rulevar_ )
                    {
                    // InternalDemoFkd.g:1311:5: (lv_variable_6_0= rulevar_ )
                    // InternalDemoFkd.g:1312:6: lv_variable_6_0= rulevar_
                    {

                    						newCompositeNode(grammarAccess.getVar_Access().getVariableVar_ParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_variable_6_0=rulevar_();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVar_Rule());
                    						}
                    						set(
                    							current,
                    							"variable",
                    							lv_variable_6_0,
                    							"org.xtext.pascal.program.DemoFkd.var_");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDemoFkd.g:1331:3: (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) )
                    {
                    // InternalDemoFkd.g:1331:3: (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) )
                    // InternalDemoFkd.g:1332:4: otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) )
                    {
                    otherlv_7=(Token)match(input,41,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getVar_Access().getCircumflexAccentKeyword_2_0());
                    			
                    // InternalDemoFkd.g:1336:4: ( (lv_pointer_8_0= rulevar_ ) )
                    // InternalDemoFkd.g:1337:5: (lv_pointer_8_0= rulevar_ )
                    {
                    // InternalDemoFkd.g:1337:5: (lv_pointer_8_0= rulevar_ )
                    // InternalDemoFkd.g:1338:6: lv_pointer_8_0= rulevar_
                    {

                    						newCompositeNode(grammarAccess.getVar_Access().getPointerVar_ParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_pointer_8_0=rulevar_();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVar_Rule());
                    						}
                    						set(
                    							current,
                    							"pointer",
                    							lv_pointer_8_0,
                    							"org.xtext.pascal.program.DemoFkd.var_");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevar_"


    // $ANTLR start "entryRuleexpression_list"
    // InternalDemoFkd.g:1360:1: entryRuleexpression_list returns [EObject current=null] : iv_ruleexpression_list= ruleexpression_list EOF ;
    public final EObject entryRuleexpression_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression_list = null;


        try {
            // InternalDemoFkd.g:1360:56: (iv_ruleexpression_list= ruleexpression_list EOF )
            // InternalDemoFkd.g:1361:2: iv_ruleexpression_list= ruleexpression_list EOF
            {
             newCompositeNode(grammarAccess.getExpression_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleexpression_list=ruleexpression_list();

            state._fsp--;

             current =iv_ruleexpression_list; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpression_list"


    // $ANTLR start "ruleexpression_list"
    // InternalDemoFkd.g:1367:1: ruleexpression_list returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* ) ;
    public final EObject ruleexpression_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:1373:2: ( ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* ) )
            // InternalDemoFkd.g:1374:2: ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* )
            {
            // InternalDemoFkd.g:1374:2: ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* )
            // InternalDemoFkd.g:1375:3: ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )*
            {
            // InternalDemoFkd.g:1375:3: ( (lv_expressions_0_0= ruleexpression ) )
            // InternalDemoFkd.g:1376:4: (lv_expressions_0_0= ruleexpression )
            {
            // InternalDemoFkd.g:1376:4: (lv_expressions_0_0= ruleexpression )
            // InternalDemoFkd.g:1377:5: lv_expressions_0_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_expressions_0_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpression_listRule());
            					}
            					add(
            						current,
            						"expressions",
            						lv_expressions_0_0,
            						"org.xtext.pascal.program.DemoFkd.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDemoFkd.g:1394:3: (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDemoFkd.g:1395:4: otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_21); 

            	    				newLeafNode(otherlv_1, grammarAccess.getExpression_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalDemoFkd.g:1399:4: ( (lv_expressions_2_0= ruleexpression ) )
            	    // InternalDemoFkd.g:1400:5: (lv_expressions_2_0= ruleexpression )
            	    {
            	    // InternalDemoFkd.g:1400:5: (lv_expressions_2_0= ruleexpression )
            	    // InternalDemoFkd.g:1401:6: lv_expressions_2_0= ruleexpression
            	    {

            	    						newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_expressions_2_0=ruleexpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpression_listRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expressions",
            	    							lv_expressions_2_0,
            	    							"org.xtext.pascal.program.DemoFkd.expression");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpression_list"


    // $ANTLR start "entryRuleexpression"
    // InternalDemoFkd.g:1423:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // InternalDemoFkd.g:1423:51: (iv_ruleexpression= ruleexpression EOF )
            // InternalDemoFkd.g:1424:2: iv_ruleexpression= ruleexpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleexpression=ruleexpression();

            state._fsp--;

             current =iv_ruleexpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalDemoFkd.g:1430:1: ruleexpression returns [EObject current=null] : ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        Token lv_operators_1_0=null;
        Token lv_operators_2_0=null;
        Token lv_operators_3_0=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:1436:2: ( ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? ) )
            // InternalDemoFkd.g:1437:2: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? )
            {
            // InternalDemoFkd.g:1437:2: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? )
            // InternalDemoFkd.g:1438:3: ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )?
            {
            // InternalDemoFkd.g:1438:3: ( (lv_expressions_0_0= rulesimple_expression ) )
            // InternalDemoFkd.g:1439:4: (lv_expressions_0_0= rulesimple_expression )
            {
            // InternalDemoFkd.g:1439:4: (lv_expressions_0_0= rulesimple_expression )
            // InternalDemoFkd.g:1440:5: lv_expressions_0_0= rulesimple_expression
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
            lv_expressions_0_0=rulesimple_expression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					add(
            						current,
            						"expressions",
            						lv_expressions_0_0,
            						"org.xtext.pascal.program.DemoFkd.simple_expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDemoFkd.g:1457:3: ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_RELATIONAL_OPERATOR||(LA23_0>=42 && LA23_0<=43)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDemoFkd.g:1458:4: ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) )
                    {
                    // InternalDemoFkd.g:1458:4: ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) )
                    int alt22=3;
                    switch ( input.LA(1) ) {
                    case RULE_RELATIONAL_OPERATOR:
                        {
                        alt22=1;
                        }
                        break;
                    case 42:
                        {
                        alt22=2;
                        }
                        break;
                    case 43:
                        {
                        alt22=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }

                    switch (alt22) {
                        case 1 :
                            // InternalDemoFkd.g:1459:5: ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) )
                            {
                            // InternalDemoFkd.g:1459:5: ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) )
                            // InternalDemoFkd.g:1460:6: (lv_operators_1_0= RULE_RELATIONAL_OPERATOR )
                            {
                            // InternalDemoFkd.g:1460:6: (lv_operators_1_0= RULE_RELATIONAL_OPERATOR )
                            // InternalDemoFkd.g:1461:7: lv_operators_1_0= RULE_RELATIONAL_OPERATOR
                            {
                            lv_operators_1_0=(Token)match(input,RULE_RELATIONAL_OPERATOR,FOLLOW_21); 

                            							newLeafNode(lv_operators_1_0, grammarAccess.getExpressionAccess().getOperatorsRELATIONAL_OPERATORTerminalRuleCall_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getExpressionRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"operators",
                            								lv_operators_1_0,
                            								"org.xtext.pascal.program.DemoFkd.RELATIONAL_OPERATOR");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalDemoFkd.g:1478:5: ( (lv_operators_2_0= 'in' ) )
                            {
                            // InternalDemoFkd.g:1478:5: ( (lv_operators_2_0= 'in' ) )
                            // InternalDemoFkd.g:1479:6: (lv_operators_2_0= 'in' )
                            {
                            // InternalDemoFkd.g:1479:6: (lv_operators_2_0= 'in' )
                            // InternalDemoFkd.g:1480:7: lv_operators_2_0= 'in'
                            {
                            lv_operators_2_0=(Token)match(input,42,FOLLOW_21); 

                            							newLeafNode(lv_operators_2_0, grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getExpressionRule());
                            							}
                            							addWithLastConsumed(current, "operators", lv_operators_2_0, "in");
                            						

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalDemoFkd.g:1493:5: ( (lv_operators_3_0= '=' ) )
                            {
                            // InternalDemoFkd.g:1493:5: ( (lv_operators_3_0= '=' ) )
                            // InternalDemoFkd.g:1494:6: (lv_operators_3_0= '=' )
                            {
                            // InternalDemoFkd.g:1494:6: (lv_operators_3_0= '=' )
                            // InternalDemoFkd.g:1495:7: lv_operators_3_0= '='
                            {
                            lv_operators_3_0=(Token)match(input,43,FOLLOW_21); 

                            							newLeafNode(lv_operators_3_0, grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getExpressionRule());
                            							}
                            							addWithLastConsumed(current, "operators", lv_operators_3_0, "=");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalDemoFkd.g:1508:4: ( (lv_expressions_4_0= rulesimple_expression ) )
                    // InternalDemoFkd.g:1509:5: (lv_expressions_4_0= rulesimple_expression )
                    {
                    // InternalDemoFkd.g:1509:5: (lv_expressions_4_0= rulesimple_expression )
                    // InternalDemoFkd.g:1510:6: lv_expressions_4_0= rulesimple_expression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expressions_4_0=rulesimple_expression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						add(
                    							current,
                    							"expressions",
                    							lv_expressions_4_0,
                    							"org.xtext.pascal.program.DemoFkd.simple_expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulesimple_expression"
    // InternalDemoFkd.g:1532:1: entryRulesimple_expression returns [EObject current=null] : iv_rulesimple_expression= rulesimple_expression EOF ;
    public final EObject entryRulesimple_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_expression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalDemoFkd.g:1534:2: (iv_rulesimple_expression= rulesimple_expression EOF )
            // InternalDemoFkd.g:1535:2: iv_rulesimple_expression= rulesimple_expression EOF
            {
             newCompositeNode(grammarAccess.getSimple_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesimple_expression=rulesimple_expression();

            state._fsp--;

             current =iv_rulesimple_expression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulesimple_expression"


    // $ANTLR start "rulesimple_expression"
    // InternalDemoFkd.g:1544:1: rulesimple_expression returns [EObject current=null] : ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* ) ;
    public final EObject rulesimple_expression() throws RecognitionException {
        EObject current = null;

        Token lv_prefixOperator_0_0=null;
        Token lv_operators_2_0=null;
        Token lv_operators_3_0=null;
        EObject lv_terms_1_0 = null;

        EObject lv_terms_4_0 = null;

        EObject lv_terms_5_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalDemoFkd.g:1551:2: ( ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* ) )
            // InternalDemoFkd.g:1552:2: ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* )
            {
            // InternalDemoFkd.g:1552:2: ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* )
            // InternalDemoFkd.g:1553:3: ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )*
            {
            // InternalDemoFkd.g:1553:3: ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ADDITION_OPERATOR) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDemoFkd.g:1554:4: (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR )
                    {
                    // InternalDemoFkd.g:1554:4: (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR )
                    // InternalDemoFkd.g:1555:5: lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR
                    {
                    lv_prefixOperator_0_0=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_21); 

                    					newLeafNode(lv_prefixOperator_0_0, grammarAccess.getSimple_expressionAccess().getPrefixOperatorADDITION_OPERATORTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimple_expressionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"prefixOperator",
                    						lv_prefixOperator_0_0,
                    						"org.xtext.pascal.program.DemoFkd.ADDITION_OPERATOR");
                    				

                    }


                    }
                    break;

            }

            // InternalDemoFkd.g:1571:3: ( (lv_terms_1_0= ruleterm ) )
            // InternalDemoFkd.g:1572:4: (lv_terms_1_0= ruleterm )
            {
            // InternalDemoFkd.g:1572:4: (lv_terms_1_0= ruleterm )
            // InternalDemoFkd.g:1573:5: lv_terms_1_0= ruleterm
            {

            					newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_terms_1_0=ruleterm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
            					}
            					add(
            						current,
            						"terms",
            						lv_terms_1_0,
            						"org.xtext.pascal.program.DemoFkd.term");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDemoFkd.g:1590:3: ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )*
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ADDITION_OPERATOR||LA26_0==44) ) {
                    alt26=1;
                }
                else if ( (LA26_0==RULE_INTEGER_NUMBER||LA26_0==RULE_REAL_NUMBER) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDemoFkd.g:1591:4: ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) )
            	    {
            	    // InternalDemoFkd.g:1591:4: ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) )
            	    // InternalDemoFkd.g:1592:5: ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) )
            	    {
            	    // InternalDemoFkd.g:1592:5: ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==RULE_ADDITION_OPERATOR) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==44) ) {
            	        alt25=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // InternalDemoFkd.g:1593:6: ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )
            	            {
            	            // InternalDemoFkd.g:1593:6: ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )
            	            // InternalDemoFkd.g:1594:7: (lv_operators_2_0= RULE_ADDITION_OPERATOR )
            	            {
            	            // InternalDemoFkd.g:1594:7: (lv_operators_2_0= RULE_ADDITION_OPERATOR )
            	            // InternalDemoFkd.g:1595:8: lv_operators_2_0= RULE_ADDITION_OPERATOR
            	            {
            	            lv_operators_2_0=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_21); 

            	            								newLeafNode(lv_operators_2_0, grammarAccess.getSimple_expressionAccess().getOperatorsADDITION_OPERATORTerminalRuleCall_2_0_0_0_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getSimple_expressionRule());
            	            								}
            	            								addWithLastConsumed(
            	            									current,
            	            									"operators",
            	            									lv_operators_2_0,
            	            									"org.xtext.pascal.program.DemoFkd.ADDITION_OPERATOR");
            	            							

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDemoFkd.g:1612:6: ( (lv_operators_3_0= 'or' ) )
            	            {
            	            // InternalDemoFkd.g:1612:6: ( (lv_operators_3_0= 'or' ) )
            	            // InternalDemoFkd.g:1613:7: (lv_operators_3_0= 'or' )
            	            {
            	            // InternalDemoFkd.g:1613:7: (lv_operators_3_0= 'or' )
            	            // InternalDemoFkd.g:1614:8: lv_operators_3_0= 'or'
            	            {
            	            lv_operators_3_0=(Token)match(input,44,FOLLOW_21); 

            	            								newLeafNode(lv_operators_3_0, grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getSimple_expressionRule());
            	            								}
            	            								addWithLastConsumed(current, "operators", lv_operators_3_0, "or");
            	            							

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalDemoFkd.g:1627:5: ( (lv_terms_4_0= ruleterm ) )
            	    // InternalDemoFkd.g:1628:6: (lv_terms_4_0= ruleterm )
            	    {
            	    // InternalDemoFkd.g:1628:6: (lv_terms_4_0= ruleterm )
            	    // InternalDemoFkd.g:1629:7: lv_terms_4_0= ruleterm
            	    {

            	    							newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_2_0_1_0());
            	    						
            	    pushFollow(FOLLOW_25);
            	    lv_terms_4_0=ruleterm();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
            	    							}
            	    							add(
            	    								current,
            	    								"terms",
            	    								lv_terms_4_0,
            	    								"org.xtext.pascal.program.DemoFkd.term");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDemoFkd.g:1648:4: ( (lv_terms_5_0= ruleunsigned_number ) )
            	    {
            	    // InternalDemoFkd.g:1648:4: ( (lv_terms_5_0= ruleunsigned_number ) )
            	    // InternalDemoFkd.g:1649:5: (lv_terms_5_0= ruleunsigned_number )
            	    {
            	    // InternalDemoFkd.g:1649:5: (lv_terms_5_0= ruleunsigned_number )
            	    // InternalDemoFkd.g:1650:6: lv_terms_5_0= ruleunsigned_number
            	    {

            	    						newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsUnsigned_numberParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_terms_5_0=ruleunsigned_number();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"terms",
            	    							lv_terms_5_0,
            	    							"org.xtext.pascal.program.DemoFkd.unsigned_number");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // $ANTLR end "rulesimple_expression"


    // $ANTLR start "entryRuleterm"
    // InternalDemoFkd.g:1675:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // InternalDemoFkd.g:1675:45: (iv_ruleterm= ruleterm EOF )
            // InternalDemoFkd.g:1676:2: iv_ruleterm= ruleterm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleterm=ruleterm();

            state._fsp--;

             current =iv_ruleterm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // InternalDemoFkd.g:1682:1: ruleterm returns [EObject current=null] : ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* ) ;
    public final EObject ruleterm() throws RecognitionException {
        EObject current = null;

        Token lv_operators_1_0=null;
        Token lv_operators_2_0=null;
        Token lv_operators_3_0=null;
        Token lv_operators_4_0=null;
        EObject lv_factors_0_0 = null;

        EObject lv_factors_5_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:1688:2: ( ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* ) )
            // InternalDemoFkd.g:1689:2: ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* )
            {
            // InternalDemoFkd.g:1689:2: ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* )
            // InternalDemoFkd.g:1690:3: ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )*
            {
            // InternalDemoFkd.g:1690:3: ( (lv_factors_0_0= rulefactor ) )
            // InternalDemoFkd.g:1691:4: (lv_factors_0_0= rulefactor )
            {
            // InternalDemoFkd.g:1691:4: (lv_factors_0_0= rulefactor )
            // InternalDemoFkd.g:1692:5: lv_factors_0_0= rulefactor
            {

            					newCompositeNode(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_factors_0_0=rulefactor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTermRule());
            					}
            					add(
            						current,
            						"factors",
            						lv_factors_0_0,
            						"org.xtext.pascal.program.DemoFkd.factor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDemoFkd.g:1709:3: ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_MULTIPLICATION_OPERATOR||(LA28_0>=45 && LA28_0<=47)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalDemoFkd.g:1710:4: ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) )
            	    {
            	    // InternalDemoFkd.g:1710:4: ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) )
            	    int alt27=4;
            	    switch ( input.LA(1) ) {
            	    case RULE_MULTIPLICATION_OPERATOR:
            	        {
            	        alt27=1;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt27=2;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt27=3;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt27=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt27) {
            	        case 1 :
            	            // InternalDemoFkd.g:1711:5: ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) )
            	            {
            	            // InternalDemoFkd.g:1711:5: ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) )
            	            // InternalDemoFkd.g:1712:6: (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR )
            	            {
            	            // InternalDemoFkd.g:1712:6: (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR )
            	            // InternalDemoFkd.g:1713:7: lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR
            	            {
            	            lv_operators_1_0=(Token)match(input,RULE_MULTIPLICATION_OPERATOR,FOLLOW_21); 

            	            							newLeafNode(lv_operators_1_0, grammarAccess.getTermAccess().getOperatorsMULTIPLICATION_OPERATORTerminalRuleCall_1_0_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getTermRule());
            	            							}
            	            							addWithLastConsumed(
            	            								current,
            	            								"operators",
            	            								lv_operators_1_0,
            	            								"org.xtext.pascal.program.DemoFkd.MULTIPLICATION_OPERATOR");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDemoFkd.g:1730:5: ( (lv_operators_2_0= 'div' ) )
            	            {
            	            // InternalDemoFkd.g:1730:5: ( (lv_operators_2_0= 'div' ) )
            	            // InternalDemoFkd.g:1731:6: (lv_operators_2_0= 'div' )
            	            {
            	            // InternalDemoFkd.g:1731:6: (lv_operators_2_0= 'div' )
            	            // InternalDemoFkd.g:1732:7: lv_operators_2_0= 'div'
            	            {
            	            lv_operators_2_0=(Token)match(input,45,FOLLOW_21); 

            	            							newLeafNode(lv_operators_2_0, grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getTermRule());
            	            							}
            	            							addWithLastConsumed(current, "operators", lv_operators_2_0, "div");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalDemoFkd.g:1745:5: ( (lv_operators_3_0= 'mod' ) )
            	            {
            	            // InternalDemoFkd.g:1745:5: ( (lv_operators_3_0= 'mod' ) )
            	            // InternalDemoFkd.g:1746:6: (lv_operators_3_0= 'mod' )
            	            {
            	            // InternalDemoFkd.g:1746:6: (lv_operators_3_0= 'mod' )
            	            // InternalDemoFkd.g:1747:7: lv_operators_3_0= 'mod'
            	            {
            	            lv_operators_3_0=(Token)match(input,46,FOLLOW_21); 

            	            							newLeafNode(lv_operators_3_0, grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getTermRule());
            	            							}
            	            							addWithLastConsumed(current, "operators", lv_operators_3_0, "mod");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalDemoFkd.g:1760:5: ( (lv_operators_4_0= 'and' ) )
            	            {
            	            // InternalDemoFkd.g:1760:5: ( (lv_operators_4_0= 'and' ) )
            	            // InternalDemoFkd.g:1761:6: (lv_operators_4_0= 'and' )
            	            {
            	            // InternalDemoFkd.g:1761:6: (lv_operators_4_0= 'and' )
            	            // InternalDemoFkd.g:1762:7: lv_operators_4_0= 'and'
            	            {
            	            lv_operators_4_0=(Token)match(input,47,FOLLOW_21); 

            	            							newLeafNode(lv_operators_4_0, grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getTermRule());
            	            							}
            	            							addWithLastConsumed(current, "operators", lv_operators_4_0, "and");
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalDemoFkd.g:1775:4: ( (lv_factors_5_0= rulefactor ) )
            	    // InternalDemoFkd.g:1776:5: (lv_factors_5_0= rulefactor )
            	    {
            	    // InternalDemoFkd.g:1776:5: (lv_factors_5_0= rulefactor )
            	    // InternalDemoFkd.g:1777:6: lv_factors_5_0= rulefactor
            	    {

            	    						newCompositeNode(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_factors_5_0=rulefactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTermRule());
            	    						}
            	    						add(
            	    							current,
            	    							"factors",
            	    							lv_factors_5_0,
            	    							"org.xtext.pascal.program.DemoFkd.factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRulefactor"
    // InternalDemoFkd.g:1799:1: entryRulefactor returns [EObject current=null] : iv_rulefactor= rulefactor EOF ;
    public final EObject entryRulefactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefactor = null;


        try {
            // InternalDemoFkd.g:1799:47: (iv_rulefactor= rulefactor EOF )
            // InternalDemoFkd.g:1800:2: iv_rulefactor= rulefactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefactor=rulefactor();

            state._fsp--;

             current =iv_rulefactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefactor"


    // $ANTLR start "rulefactor"
    // InternalDemoFkd.g:1806:1: rulefactor returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) ) ;
    public final EObject rulefactor() throws RecognitionException {
        EObject current = null;

        Token lv_string_2_0=null;
        Token lv_nil_4_0=null;
        Token lv_boolean_5_0=null;
        Token lv_boolean_6_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_variable_0_0 = null;

        EObject lv_number_1_0 = null;

        EObject lv_set_3_0 = null;

        EObject lv_function_7_0 = null;

        EObject lv_expression_9_0 = null;

        EObject lv_not_12_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:1812:2: ( ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) ) )
            // InternalDemoFkd.g:1813:2: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) )
            {
            // InternalDemoFkd.g:1813:2: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) )
            int alt29=10;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalDemoFkd.g:1814:3: ( (lv_variable_0_0= rulevariable ) )
                    {
                    // InternalDemoFkd.g:1814:3: ( (lv_variable_0_0= rulevariable ) )
                    // InternalDemoFkd.g:1815:4: (lv_variable_0_0= rulevariable )
                    {
                    // InternalDemoFkd.g:1815:4: (lv_variable_0_0= rulevariable )
                    // InternalDemoFkd.g:1816:5: lv_variable_0_0= rulevariable
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getVariableVariableParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variable_0_0=rulevariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"variable",
                    						lv_variable_0_0,
                    						"org.xtext.pascal.program.DemoFkd.variable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:1834:3: ( (lv_number_1_0= rulenumber ) )
                    {
                    // InternalDemoFkd.g:1834:3: ( (lv_number_1_0= rulenumber ) )
                    // InternalDemoFkd.g:1835:4: (lv_number_1_0= rulenumber )
                    {
                    // InternalDemoFkd.g:1835:4: (lv_number_1_0= rulenumber )
                    // InternalDemoFkd.g:1836:5: lv_number_1_0= rulenumber
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getNumberNumberParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_number_1_0=rulenumber();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"number",
                    						lv_number_1_0,
                    						"org.xtext.pascal.program.DemoFkd.number");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDemoFkd.g:1854:3: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // InternalDemoFkd.g:1854:3: ( (lv_string_2_0= RULE_STRING ) )
                    // InternalDemoFkd.g:1855:4: (lv_string_2_0= RULE_STRING )
                    {
                    // InternalDemoFkd.g:1855:4: (lv_string_2_0= RULE_STRING )
                    // InternalDemoFkd.g:1856:5: lv_string_2_0= RULE_STRING
                    {
                    lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_2_0, grammarAccess.getFactorAccess().getStringSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDemoFkd.g:1873:3: ( (lv_set_3_0= ruleset ) )
                    {
                    // InternalDemoFkd.g:1873:3: ( (lv_set_3_0= ruleset ) )
                    // InternalDemoFkd.g:1874:4: (lv_set_3_0= ruleset )
                    {
                    // InternalDemoFkd.g:1874:4: (lv_set_3_0= ruleset )
                    // InternalDemoFkd.g:1875:5: lv_set_3_0= ruleset
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getSetSetParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_set_3_0=ruleset();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"set",
                    						lv_set_3_0,
                    						"org.xtext.pascal.program.DemoFkd.set");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDemoFkd.g:1893:3: ( (lv_nil_4_0= 'nil' ) )
                    {
                    // InternalDemoFkd.g:1893:3: ( (lv_nil_4_0= 'nil' ) )
                    // InternalDemoFkd.g:1894:4: (lv_nil_4_0= 'nil' )
                    {
                    // InternalDemoFkd.g:1894:4: (lv_nil_4_0= 'nil' )
                    // InternalDemoFkd.g:1895:5: lv_nil_4_0= 'nil'
                    {
                    lv_nil_4_0=(Token)match(input,48,FOLLOW_2); 

                    					newLeafNode(lv_nil_4_0, grammarAccess.getFactorAccess().getNilNilKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorRule());
                    					}
                    					setWithLastConsumed(current, "nil", lv_nil_4_0 != null, "nil");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalDemoFkd.g:1908:3: ( (lv_boolean_5_0= 'true' ) )
                    {
                    // InternalDemoFkd.g:1908:3: ( (lv_boolean_5_0= 'true' ) )
                    // InternalDemoFkd.g:1909:4: (lv_boolean_5_0= 'true' )
                    {
                    // InternalDemoFkd.g:1909:4: (lv_boolean_5_0= 'true' )
                    // InternalDemoFkd.g:1910:5: lv_boolean_5_0= 'true'
                    {
                    lv_boolean_5_0=(Token)match(input,49,FOLLOW_2); 

                    					newLeafNode(lv_boolean_5_0, grammarAccess.getFactorAccess().getBooleanTrueKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorRule());
                    					}
                    					setWithLastConsumed(current, "boolean", lv_boolean_5_0, "true");
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalDemoFkd.g:1923:3: ( (lv_boolean_6_0= 'false' ) )
                    {
                    // InternalDemoFkd.g:1923:3: ( (lv_boolean_6_0= 'false' ) )
                    // InternalDemoFkd.g:1924:4: (lv_boolean_6_0= 'false' )
                    {
                    // InternalDemoFkd.g:1924:4: (lv_boolean_6_0= 'false' )
                    // InternalDemoFkd.g:1925:5: lv_boolean_6_0= 'false'
                    {
                    lv_boolean_6_0=(Token)match(input,50,FOLLOW_2); 

                    					newLeafNode(lv_boolean_6_0, grammarAccess.getFactorAccess().getBooleanFalseKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorRule());
                    					}
                    					setWithLastConsumed(current, "boolean", lv_boolean_6_0, "false");
                    				

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalDemoFkd.g:1938:3: ( (lv_function_7_0= rulefunction_designator ) )
                    {
                    // InternalDemoFkd.g:1938:3: ( (lv_function_7_0= rulefunction_designator ) )
                    // InternalDemoFkd.g:1939:4: (lv_function_7_0= rulefunction_designator )
                    {
                    // InternalDemoFkd.g:1939:4: (lv_function_7_0= rulefunction_designator )
                    // InternalDemoFkd.g:1940:5: lv_function_7_0= rulefunction_designator
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getFunctionFunction_designatorParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_function_7_0=rulefunction_designator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"function",
                    						lv_function_7_0,
                    						"org.xtext.pascal.program.DemoFkd.function_designator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalDemoFkd.g:1958:3: (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' )
                    {
                    // InternalDemoFkd.g:1958:3: (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' )
                    // InternalDemoFkd.g:1959:4: otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')'
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_21); 

                    				newLeafNode(otherlv_8, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_8_0());
                    			
                    // InternalDemoFkd.g:1963:4: ( (lv_expression_9_0= ruleexpression ) )
                    // InternalDemoFkd.g:1964:5: (lv_expression_9_0= ruleexpression )
                    {
                    // InternalDemoFkd.g:1964:5: (lv_expression_9_0= ruleexpression )
                    // InternalDemoFkd.g:1965:6: lv_expression_9_0= ruleexpression
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_expression_9_0=ruleexpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_9_0,
                    							"org.xtext.pascal.program.DemoFkd.expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getFactorAccess().getRightParenthesisKeyword_8_2());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalDemoFkd.g:1988:3: (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) )
                    {
                    // InternalDemoFkd.g:1988:3: (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) )
                    // InternalDemoFkd.g:1989:4: otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) )
                    {
                    otherlv_11=(Token)match(input,51,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getFactorAccess().getNotKeyword_9_0());
                    			
                    // InternalDemoFkd.g:1993:4: ( (lv_not_12_0= rulefactor ) )
                    // InternalDemoFkd.g:1994:5: (lv_not_12_0= rulefactor )
                    {
                    // InternalDemoFkd.g:1994:5: (lv_not_12_0= rulefactor )
                    // InternalDemoFkd.g:1995:6: lv_not_12_0= rulefactor
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getNotFactorParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_not_12_0=rulefactor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    						}
                    						set(
                    							current,
                    							"not",
                    							lv_not_12_0,
                    							"org.xtext.pascal.program.DemoFkd.factor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefactor"


    // $ANTLR start "entryRulenumber"
    // InternalDemoFkd.g:2017:1: entryRulenumber returns [EObject current=null] : iv_rulenumber= rulenumber EOF ;
    public final EObject entryRulenumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumber = null;


        try {
            // InternalDemoFkd.g:2017:47: (iv_rulenumber= rulenumber EOF )
            // InternalDemoFkd.g:2018:2: iv_rulenumber= rulenumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_rulenumber=rulenumber();

            state._fsp--;

             current =iv_rulenumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenumber"


    // $ANTLR start "rulenumber"
    // InternalDemoFkd.g:2024:1: rulenumber returns [EObject current=null] : ( (lv_number_0_0= ruleany_number ) ) ;
    public final EObject rulenumber() throws RecognitionException {
        EObject current = null;

        EObject lv_number_0_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:2030:2: ( ( (lv_number_0_0= ruleany_number ) ) )
            // InternalDemoFkd.g:2031:2: ( (lv_number_0_0= ruleany_number ) )
            {
            // InternalDemoFkd.g:2031:2: ( (lv_number_0_0= ruleany_number ) )
            // InternalDemoFkd.g:2032:3: (lv_number_0_0= ruleany_number )
            {
            // InternalDemoFkd.g:2032:3: (lv_number_0_0= ruleany_number )
            // InternalDemoFkd.g:2033:4: lv_number_0_0= ruleany_number
            {

            				newCompositeNode(grammarAccess.getNumberAccess().getNumberAny_numberParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_number_0_0=ruleany_number();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNumberRule());
            				}
            				set(
            					current,
            					"number",
            					lv_number_0_0,
            					"org.xtext.pascal.program.DemoFkd.any_number");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenumber"


    // $ANTLR start "entryRuleany_number"
    // InternalDemoFkd.g:2053:1: entryRuleany_number returns [EObject current=null] : iv_ruleany_number= ruleany_number EOF ;
    public final EObject entryRuleany_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleany_number = null;


        try {
            // InternalDemoFkd.g:2053:51: (iv_ruleany_number= ruleany_number EOF )
            // InternalDemoFkd.g:2054:2: iv_ruleany_number= ruleany_number EOF
            {
             newCompositeNode(grammarAccess.getAny_numberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleany_number=ruleany_number();

            state._fsp--;

             current =iv_ruleany_number; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleany_number"


    // $ANTLR start "ruleany_number"
    // InternalDemoFkd.g:2060:1: ruleany_number returns [EObject current=null] : (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number ) ;
    public final EObject ruleany_number() throws RecognitionException {
        EObject current = null;

        EObject this_unsigned_number_0 = null;

        EObject this_signed_number_1 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:2066:2: ( (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number ) )
            // InternalDemoFkd.g:2067:2: (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number )
            {
            // InternalDemoFkd.g:2067:2: (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INTEGER_NUMBER||LA30_0==RULE_REAL_NUMBER) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_SIGNED_INTEGER_NUMBER||LA30_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalDemoFkd.g:2068:3: this_unsigned_number_0= ruleunsigned_number
                    {

                    			newCompositeNode(grammarAccess.getAny_numberAccess().getUnsigned_numberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_unsigned_number_0=ruleunsigned_number();

                    state._fsp--;


                    			current = this_unsigned_number_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:2077:3: this_signed_number_1= rulesigned_number
                    {

                    			newCompositeNode(grammarAccess.getAny_numberAccess().getSigned_numberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_signed_number_1=rulesigned_number();

                    state._fsp--;


                    			current = this_signed_number_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleany_number"


    // $ANTLR start "entryRuleunsigned_number"
    // InternalDemoFkd.g:2089:1: entryRuleunsigned_number returns [EObject current=null] : iv_ruleunsigned_number= ruleunsigned_number EOF ;
    public final EObject entryRuleunsigned_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsigned_number = null;


        try {
            // InternalDemoFkd.g:2089:56: (iv_ruleunsigned_number= ruleunsigned_number EOF )
            // InternalDemoFkd.g:2090:2: iv_ruleunsigned_number= ruleunsigned_number EOF
            {
             newCompositeNode(grammarAccess.getUnsigned_numberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunsigned_number=ruleunsigned_number();

            state._fsp--;

             current =iv_ruleunsigned_number; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunsigned_number"


    // $ANTLR start "ruleunsigned_number"
    // InternalDemoFkd.g:2096:1: ruleunsigned_number returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) ) ;
    public final EObject ruleunsigned_number() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_real_1_0=null;


        	enterRule();

        try {
            // InternalDemoFkd.g:2102:2: ( ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) ) )
            // InternalDemoFkd.g:2103:2: ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) )
            {
            // InternalDemoFkd.g:2103:2: ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INTEGER_NUMBER) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_REAL_NUMBER) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalDemoFkd.g:2104:3: ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) )
                    {
                    // InternalDemoFkd.g:2104:3: ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) )
                    // InternalDemoFkd.g:2105:4: (lv_integer_0_0= RULE_INTEGER_NUMBER )
                    {
                    // InternalDemoFkd.g:2105:4: (lv_integer_0_0= RULE_INTEGER_NUMBER )
                    // InternalDemoFkd.g:2106:5: lv_integer_0_0= RULE_INTEGER_NUMBER
                    {
                    lv_integer_0_0=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_integer_0_0, grammarAccess.getUnsigned_numberAccess().getIntegerINTEGER_NUMBERTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnsigned_numberRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"integer",
                    						lv_integer_0_0,
                    						"org.xtext.pascal.program.DemoFkd.INTEGER_NUMBER");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:2123:3: ( (lv_real_1_0= RULE_REAL_NUMBER ) )
                    {
                    // InternalDemoFkd.g:2123:3: ( (lv_real_1_0= RULE_REAL_NUMBER ) )
                    // InternalDemoFkd.g:2124:4: (lv_real_1_0= RULE_REAL_NUMBER )
                    {
                    // InternalDemoFkd.g:2124:4: (lv_real_1_0= RULE_REAL_NUMBER )
                    // InternalDemoFkd.g:2125:5: lv_real_1_0= RULE_REAL_NUMBER
                    {
                    lv_real_1_0=(Token)match(input,RULE_REAL_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_real_1_0, grammarAccess.getUnsigned_numberAccess().getRealREAL_NUMBERTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnsigned_numberRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"real",
                    						lv_real_1_0,
                    						"org.xtext.pascal.program.DemoFkd.REAL_NUMBER");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunsigned_number"


    // $ANTLR start "entryRulesigned_number"
    // InternalDemoFkd.g:2145:1: entryRulesigned_number returns [EObject current=null] : iv_rulesigned_number= rulesigned_number EOF ;
    public final EObject entryRulesigned_number() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesigned_number = null;


        try {
            // InternalDemoFkd.g:2145:54: (iv_rulesigned_number= rulesigned_number EOF )
            // InternalDemoFkd.g:2146:2: iv_rulesigned_number= rulesigned_number EOF
            {
             newCompositeNode(grammarAccess.getSigned_numberRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesigned_number=rulesigned_number();

            state._fsp--;

             current =iv_rulesigned_number; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesigned_number"


    // $ANTLR start "rulesigned_number"
    // InternalDemoFkd.g:2152:1: rulesigned_number returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) ) ;
    public final EObject rulesigned_number() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_real_1_0=null;


        	enterRule();

        try {
            // InternalDemoFkd.g:2158:2: ( ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) ) )
            // InternalDemoFkd.g:2159:2: ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) )
            {
            // InternalDemoFkd.g:2159:2: ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalDemoFkd.g:2160:3: ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    {
                    // InternalDemoFkd.g:2160:3: ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    // InternalDemoFkd.g:2161:4: (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    {
                    // InternalDemoFkd.g:2161:4: (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    // InternalDemoFkd.g:2162:5: lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER
                    {
                    lv_integer_0_0=(Token)match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_integer_0_0, grammarAccess.getSigned_numberAccess().getIntegerSIGNED_INTEGER_NUMBERTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSigned_numberRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"integer",
                    						lv_integer_0_0,
                    						"org.xtext.pascal.program.DemoFkd.SIGNED_INTEGER_NUMBER");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:2179:3: ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) )
                    {
                    // InternalDemoFkd.g:2179:3: ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) )
                    // InternalDemoFkd.g:2180:4: (lv_real_1_0= RULE_SIGNED_REAL_NUMBER )
                    {
                    // InternalDemoFkd.g:2180:4: (lv_real_1_0= RULE_SIGNED_REAL_NUMBER )
                    // InternalDemoFkd.g:2181:5: lv_real_1_0= RULE_SIGNED_REAL_NUMBER
                    {
                    lv_real_1_0=(Token)match(input,RULE_SIGNED_REAL_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_real_1_0, grammarAccess.getSigned_numberAccess().getRealSIGNED_REAL_NUMBERTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSigned_numberRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"real",
                    						lv_real_1_0,
                    						"org.xtext.pascal.program.DemoFkd.SIGNED_REAL_NUMBER");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesigned_number"


    // $ANTLR start "entryRuleset"
    // InternalDemoFkd.g:2201:1: entryRuleset returns [EObject current=null] : iv_ruleset= ruleset EOF ;
    public final EObject entryRuleset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset = null;


        try {
            // InternalDemoFkd.g:2201:44: (iv_ruleset= ruleset EOF )
            // InternalDemoFkd.g:2202:2: iv_ruleset= ruleset EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleset=ruleset();

            state._fsp--;

             current =iv_ruleset; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleset"


    // $ANTLR start "ruleset"
    // InternalDemoFkd.g:2208:1: ruleset returns [EObject current=null] : ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) ) ;
    public final EObject ruleset() throws RecognitionException {
        EObject current = null;

        Token lv_brackets_0_0=null;
        Token lv_brackets_2_0=null;
        EObject lv_expressions_1_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:2214:2: ( ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) ) )
            // InternalDemoFkd.g:2215:2: ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) )
            {
            // InternalDemoFkd.g:2215:2: ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) )
            // InternalDemoFkd.g:2216:3: ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) )
            {
            // InternalDemoFkd.g:2216:3: ( (lv_brackets_0_0= '[' ) )
            // InternalDemoFkd.g:2217:4: (lv_brackets_0_0= '[' )
            {
            // InternalDemoFkd.g:2217:4: (lv_brackets_0_0= '[' )
            // InternalDemoFkd.g:2218:5: lv_brackets_0_0= '['
            {
            lv_brackets_0_0=(Token)match(input,39,FOLLOW_27); 

            					newLeafNode(lv_brackets_0_0, grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetRule());
            					}
            					addWithLastConsumed(current, "brackets", lv_brackets_0_0, "[");
            				

            }


            }

            // InternalDemoFkd.g:2230:3: ( (lv_expressions_1_0= ruleexpression_list ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_INTEGER_NUMBER)||LA33_0==RULE_ADDITION_OPERATOR||(LA33_0>=RULE_STRING && LA33_0<=RULE_SIGNED_REAL_NUMBER)||LA33_0==30||LA33_0==39||(LA33_0>=48 && LA33_0<=51)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDemoFkd.g:2231:4: (lv_expressions_1_0= ruleexpression_list )
                    {
                    // InternalDemoFkd.g:2231:4: (lv_expressions_1_0= ruleexpression_list )
                    // InternalDemoFkd.g:2232:5: lv_expressions_1_0= ruleexpression_list
                    {

                    					newCompositeNode(grammarAccess.getSetAccess().getExpressionsExpression_listParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_expressions_1_0=ruleexpression_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSetRule());
                    					}
                    					set(
                    						current,
                    						"expressions",
                    						lv_expressions_1_0,
                    						"org.xtext.pascal.program.DemoFkd.expression_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDemoFkd.g:2249:3: ( (lv_brackets_2_0= ']' ) )
            // InternalDemoFkd.g:2250:4: (lv_brackets_2_0= ']' )
            {
            // InternalDemoFkd.g:2250:4: (lv_brackets_2_0= ']' )
            // InternalDemoFkd.g:2251:5: lv_brackets_2_0= ']'
            {
            lv_brackets_2_0=(Token)match(input,40,FOLLOW_2); 

            					newLeafNode(lv_brackets_2_0, grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetRule());
            					}
            					addWithLastConsumed(current, "brackets", lv_brackets_2_0, "]");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleset"


    // $ANTLR start "entryRulefunction_designator"
    // InternalDemoFkd.g:2267:1: entryRulefunction_designator returns [EObject current=null] : iv_rulefunction_designator= rulefunction_designator EOF ;
    public final EObject entryRulefunction_designator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_designator = null;


        try {
            // InternalDemoFkd.g:2267:60: (iv_rulefunction_designator= rulefunction_designator EOF )
            // InternalDemoFkd.g:2268:2: iv_rulefunction_designator= rulefunction_designator EOF
            {
             newCompositeNode(grammarAccess.getFunction_designatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunction_designator=rulefunction_designator();

            state._fsp--;

             current =iv_rulefunction_designator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunction_designator"


    // $ANTLR start "rulefunction_designator"
    // InternalDemoFkd.g:2274:1: rulefunction_designator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' ) ;
    public final EObject rulefunction_designator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:2280:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' ) )
            // InternalDemoFkd.g:2281:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' )
            {
            // InternalDemoFkd.g:2281:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' )
            // InternalDemoFkd.g:2282:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')'
            {
            // InternalDemoFkd.g:2282:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDemoFkd.g:2283:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDemoFkd.g:2283:4: (lv_name_0_0= RULE_ID )
            // InternalDemoFkd.g:2284:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFunction_designatorAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunction_designatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDemoFkd.g:2304:3: ( (lv_expressions_2_0= ruleexpression_list ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_INTEGER_NUMBER)||LA34_0==RULE_ADDITION_OPERATOR||(LA34_0>=RULE_STRING && LA34_0<=RULE_SIGNED_REAL_NUMBER)||LA34_0==30||LA34_0==39||(LA34_0>=48 && LA34_0<=51)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDemoFkd.g:2305:4: (lv_expressions_2_0= ruleexpression_list )
                    {
                    // InternalDemoFkd.g:2305:4: (lv_expressions_2_0= ruleexpression_list )
                    // InternalDemoFkd.g:2306:5: lv_expressions_2_0= ruleexpression_list
                    {

                    					newCompositeNode(grammarAccess.getFunction_designatorAccess().getExpressionsExpression_listParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_expressions_2_0=ruleexpression_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunction_designatorRule());
                    					}
                    					set(
                    						current,
                    						"expressions",
                    						lv_expressions_2_0,
                    						"org.xtext.pascal.program.DemoFkd.expression_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunction_designator"


    // $ANTLR start "entryRulestructured_statement"
    // InternalDemoFkd.g:2331:1: entryRulestructured_statement returns [EObject current=null] : iv_rulestructured_statement= rulestructured_statement EOF ;
    public final EObject entryRulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_statement = null;


        try {
            // InternalDemoFkd.g:2331:61: (iv_rulestructured_statement= rulestructured_statement EOF )
            // InternalDemoFkd.g:2332:2: iv_rulestructured_statement= rulestructured_statement EOF
            {
             newCompositeNode(grammarAccess.getStructured_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestructured_statement=rulestructured_statement();

            state._fsp--;

             current =iv_rulestructured_statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestructured_statement"


    // $ANTLR start "rulestructured_statement"
    // InternalDemoFkd.g:2338:1: rulestructured_statement returns [EObject current=null] : ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) | ( (lv_withStmt_3_0= rulewith_statement ) ) ) ;
    public final EObject rulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_compound_0_0 = null;

        EObject lv_repetitive_1_0 = null;

        EObject lv_conditional_2_0 = null;

        EObject lv_withStmt_3_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:2344:2: ( ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) | ( (lv_withStmt_3_0= rulewith_statement ) ) ) )
            // InternalDemoFkd.g:2345:2: ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) | ( (lv_withStmt_3_0= rulewith_statement ) ) )
            {
            // InternalDemoFkd.g:2345:2: ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) | ( (lv_withStmt_3_0= rulewith_statement ) ) )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt35=1;
                }
                break;
            case 52:
            case 54:
            case 56:
                {
                alt35=2;
                }
                break;
            case 59:
            case 62:
                {
                alt35=3;
                }
                break;
            case 64:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalDemoFkd.g:2346:3: ( (lv_compound_0_0= rulecompound_statement ) )
                    {
                    // InternalDemoFkd.g:2346:3: ( (lv_compound_0_0= rulecompound_statement ) )
                    // InternalDemoFkd.g:2347:4: (lv_compound_0_0= rulecompound_statement )
                    {
                    // InternalDemoFkd.g:2347:4: (lv_compound_0_0= rulecompound_statement )
                    // InternalDemoFkd.g:2348:5: lv_compound_0_0= rulecompound_statement
                    {

                    					newCompositeNode(grammarAccess.getStructured_statementAccess().getCompoundCompound_statementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_compound_0_0=rulecompound_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                    					}
                    					set(
                    						current,
                    						"compound",
                    						lv_compound_0_0,
                    						"org.xtext.pascal.program.DemoFkd.compound_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:2366:3: ( (lv_repetitive_1_0= rulerepetitive_statement ) )
                    {
                    // InternalDemoFkd.g:2366:3: ( (lv_repetitive_1_0= rulerepetitive_statement ) )
                    // InternalDemoFkd.g:2367:4: (lv_repetitive_1_0= rulerepetitive_statement )
                    {
                    // InternalDemoFkd.g:2367:4: (lv_repetitive_1_0= rulerepetitive_statement )
                    // InternalDemoFkd.g:2368:5: lv_repetitive_1_0= rulerepetitive_statement
                    {

                    					newCompositeNode(grammarAccess.getStructured_statementAccess().getRepetitiveRepetitive_statementParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_repetitive_1_0=rulerepetitive_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                    					}
                    					set(
                    						current,
                    						"repetitive",
                    						lv_repetitive_1_0,
                    						"org.xtext.pascal.program.DemoFkd.repetitive_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDemoFkd.g:2386:3: ( (lv_conditional_2_0= ruleconditional_statement ) )
                    {
                    // InternalDemoFkd.g:2386:3: ( (lv_conditional_2_0= ruleconditional_statement ) )
                    // InternalDemoFkd.g:2387:4: (lv_conditional_2_0= ruleconditional_statement )
                    {
                    // InternalDemoFkd.g:2387:4: (lv_conditional_2_0= ruleconditional_statement )
                    // InternalDemoFkd.g:2388:5: lv_conditional_2_0= ruleconditional_statement
                    {

                    					newCompositeNode(grammarAccess.getStructured_statementAccess().getConditionalConditional_statementParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_conditional_2_0=ruleconditional_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                    					}
                    					set(
                    						current,
                    						"conditional",
                    						lv_conditional_2_0,
                    						"org.xtext.pascal.program.DemoFkd.conditional_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDemoFkd.g:2406:3: ( (lv_withStmt_3_0= rulewith_statement ) )
                    {
                    // InternalDemoFkd.g:2406:3: ( (lv_withStmt_3_0= rulewith_statement ) )
                    // InternalDemoFkd.g:2407:4: (lv_withStmt_3_0= rulewith_statement )
                    {
                    // InternalDemoFkd.g:2407:4: (lv_withStmt_3_0= rulewith_statement )
                    // InternalDemoFkd.g:2408:5: lv_withStmt_3_0= rulewith_statement
                    {

                    					newCompositeNode(grammarAccess.getStructured_statementAccess().getWithStmtWith_statementParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_withStmt_3_0=rulewith_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                    					}
                    					set(
                    						current,
                    						"withStmt",
                    						lv_withStmt_3_0,
                    						"org.xtext.pascal.program.DemoFkd.with_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestructured_statement"


    // $ANTLR start "entryRulecompound_statement"
    // InternalDemoFkd.g:2429:1: entryRulecompound_statement returns [EObject current=null] : iv_rulecompound_statement= rulecompound_statement EOF ;
    public final EObject entryRulecompound_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompound_statement = null;


        try {
            // InternalDemoFkd.g:2429:59: (iv_rulecompound_statement= rulecompound_statement EOF )
            // InternalDemoFkd.g:2430:2: iv_rulecompound_statement= rulecompound_statement EOF
            {
             newCompositeNode(grammarAccess.getCompound_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecompound_statement=rulecompound_statement();

            state._fsp--;

             current =iv_rulecompound_statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecompound_statement"


    // $ANTLR start "rulecompound_statement"
    // InternalDemoFkd.g:2436:1: rulecompound_statement returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) ;
    public final EObject rulecompound_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_1_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:2442:2: ( (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) )
            // InternalDemoFkd.g:2443:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            {
            // InternalDemoFkd.g:2443:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            // InternalDemoFkd.g:2444:3: otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getCompound_statementAccess().getBeginKeyword_0());
            		
            // InternalDemoFkd.g:2448:3: ( (lv_sequence_1_0= rulestatement_sequence ) )
            // InternalDemoFkd.g:2449:4: (lv_sequence_1_0= rulestatement_sequence )
            {
            // InternalDemoFkd.g:2449:4: (lv_sequence_1_0= rulestatement_sequence )
            // InternalDemoFkd.g:2450:5: lv_sequence_1_0= rulestatement_sequence
            {

            					newCompositeNode(grammarAccess.getCompound_statementAccess().getSequenceStatement_sequenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_sequence_1_0=rulestatement_sequence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompound_statementRule());
            					}
            					set(
            						current,
            						"sequence",
            						lv_sequence_1_0,
            						"org.xtext.pascal.program.DemoFkd.statement_sequence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCompound_statementAccess().getEndKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecompound_statement"


    // $ANTLR start "entryRulerepetitive_statement"
    // InternalDemoFkd.g:2475:1: entryRulerepetitive_statement returns [EObject current=null] : iv_rulerepetitive_statement= rulerepetitive_statement EOF ;
    public final EObject entryRulerepetitive_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepetitive_statement = null;


        try {
            // InternalDemoFkd.g:2475:61: (iv_rulerepetitive_statement= rulerepetitive_statement EOF )
            // InternalDemoFkd.g:2476:2: iv_rulerepetitive_statement= rulerepetitive_statement EOF
            {
             newCompositeNode(grammarAccess.getRepetitive_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerepetitive_statement=rulerepetitive_statement();

            state._fsp--;

             current =iv_rulerepetitive_statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerepetitive_statement"


    // $ANTLR start "rulerepetitive_statement"
    // InternalDemoFkd.g:2482:1: rulerepetitive_statement returns [EObject current=null] : ( ( (lv_whileStmt_0_0= rulewhile_statement ) ) | ( (lv_repeatStmt_1_0= rulerepeat_statement ) ) | ( (lv_forStmt_2_0= rulefor_statement ) ) ) ;
    public final EObject rulerepetitive_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_whileStmt_0_0 = null;

        EObject lv_repeatStmt_1_0 = null;

        EObject lv_forStmt_2_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:2488:2: ( ( ( (lv_whileStmt_0_0= rulewhile_statement ) ) | ( (lv_repeatStmt_1_0= rulerepeat_statement ) ) | ( (lv_forStmt_2_0= rulefor_statement ) ) ) )
            // InternalDemoFkd.g:2489:2: ( ( (lv_whileStmt_0_0= rulewhile_statement ) ) | ( (lv_repeatStmt_1_0= rulerepeat_statement ) ) | ( (lv_forStmt_2_0= rulefor_statement ) ) )
            {
            // InternalDemoFkd.g:2489:2: ( ( (lv_whileStmt_0_0= rulewhile_statement ) ) | ( (lv_repeatStmt_1_0= rulerepeat_statement ) ) | ( (lv_forStmt_2_0= rulefor_statement ) ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt36=1;
                }
                break;
            case 54:
                {
                alt36=2;
                }
                break;
            case 56:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalDemoFkd.g:2490:3: ( (lv_whileStmt_0_0= rulewhile_statement ) )
                    {
                    // InternalDemoFkd.g:2490:3: ( (lv_whileStmt_0_0= rulewhile_statement ) )
                    // InternalDemoFkd.g:2491:4: (lv_whileStmt_0_0= rulewhile_statement )
                    {
                    // InternalDemoFkd.g:2491:4: (lv_whileStmt_0_0= rulewhile_statement )
                    // InternalDemoFkd.g:2492:5: lv_whileStmt_0_0= rulewhile_statement
                    {

                    					newCompositeNode(grammarAccess.getRepetitive_statementAccess().getWhileStmtWhile_statementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_whileStmt_0_0=rulewhile_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRepetitive_statementRule());
                    					}
                    					set(
                    						current,
                    						"whileStmt",
                    						lv_whileStmt_0_0,
                    						"org.xtext.pascal.program.DemoFkd.while_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:2510:3: ( (lv_repeatStmt_1_0= rulerepeat_statement ) )
                    {
                    // InternalDemoFkd.g:2510:3: ( (lv_repeatStmt_1_0= rulerepeat_statement ) )
                    // InternalDemoFkd.g:2511:4: (lv_repeatStmt_1_0= rulerepeat_statement )
                    {
                    // InternalDemoFkd.g:2511:4: (lv_repeatStmt_1_0= rulerepeat_statement )
                    // InternalDemoFkd.g:2512:5: lv_repeatStmt_1_0= rulerepeat_statement
                    {

                    					newCompositeNode(grammarAccess.getRepetitive_statementAccess().getRepeatStmtRepeat_statementParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_repeatStmt_1_0=rulerepeat_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRepetitive_statementRule());
                    					}
                    					set(
                    						current,
                    						"repeatStmt",
                    						lv_repeatStmt_1_0,
                    						"org.xtext.pascal.program.DemoFkd.repeat_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDemoFkd.g:2530:3: ( (lv_forStmt_2_0= rulefor_statement ) )
                    {
                    // InternalDemoFkd.g:2530:3: ( (lv_forStmt_2_0= rulefor_statement ) )
                    // InternalDemoFkd.g:2531:4: (lv_forStmt_2_0= rulefor_statement )
                    {
                    // InternalDemoFkd.g:2531:4: (lv_forStmt_2_0= rulefor_statement )
                    // InternalDemoFkd.g:2532:5: lv_forStmt_2_0= rulefor_statement
                    {

                    					newCompositeNode(grammarAccess.getRepetitive_statementAccess().getForStmtFor_statementParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_forStmt_2_0=rulefor_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRepetitive_statementRule());
                    					}
                    					set(
                    						current,
                    						"forStmt",
                    						lv_forStmt_2_0,
                    						"org.xtext.pascal.program.DemoFkd.for_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerepetitive_statement"


    // $ANTLR start "entryRulewhile_statement"
    // InternalDemoFkd.g:2553:1: entryRulewhile_statement returns [EObject current=null] : iv_rulewhile_statement= rulewhile_statement EOF ;
    public final EObject entryRulewhile_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewhile_statement = null;


        try {
            // InternalDemoFkd.g:2553:56: (iv_rulewhile_statement= rulewhile_statement EOF )
            // InternalDemoFkd.g:2554:2: iv_rulewhile_statement= rulewhile_statement EOF
            {
             newCompositeNode(grammarAccess.getWhile_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulewhile_statement=rulewhile_statement();

            state._fsp--;

             current =iv_rulewhile_statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulewhile_statement"


    // $ANTLR start "rulewhile_statement"
    // InternalDemoFkd.g:2560:1: rulewhile_statement returns [EObject current=null] : (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) ) ;
    public final EObject rulewhile_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:2566:2: ( (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) ) )
            // InternalDemoFkd.g:2567:2: (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) )
            {
            // InternalDemoFkd.g:2567:2: (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) )
            // InternalDemoFkd.g:2568:3: otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getWhile_statementAccess().getWhileKeyword_0());
            		
            // InternalDemoFkd.g:2572:3: ( (lv_expression_1_0= ruleexpression ) )
            // InternalDemoFkd.g:2573:4: (lv_expression_1_0= ruleexpression )
            {
            // InternalDemoFkd.g:2573:4: (lv_expression_1_0= ruleexpression )
            // InternalDemoFkd.g:2574:5: lv_expression_1_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getWhile_statementAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
            lv_expression_1_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhile_statementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.pascal.program.DemoFkd.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,53,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getWhile_statementAccess().getDoKeyword_2());
            		
            // InternalDemoFkd.g:2595:3: ( (lv_statement_3_0= rulestatement ) )
            // InternalDemoFkd.g:2596:4: (lv_statement_3_0= rulestatement )
            {
            // InternalDemoFkd.g:2596:4: (lv_statement_3_0= rulestatement )
            // InternalDemoFkd.g:2597:5: lv_statement_3_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getWhile_statementAccess().getStatementStatementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_3_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhile_statementRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_3_0,
            						"org.xtext.pascal.program.DemoFkd.statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulewhile_statement"


    // $ANTLR start "entryRulerepeat_statement"
    // InternalDemoFkd.g:2618:1: entryRulerepeat_statement returns [EObject current=null] : iv_rulerepeat_statement= rulerepeat_statement EOF ;
    public final EObject entryRulerepeat_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepeat_statement = null;


        try {
            // InternalDemoFkd.g:2618:57: (iv_rulerepeat_statement= rulerepeat_statement EOF )
            // InternalDemoFkd.g:2619:2: iv_rulerepeat_statement= rulerepeat_statement EOF
            {
             newCompositeNode(grammarAccess.getRepeat_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerepeat_statement=rulerepeat_statement();

            state._fsp--;

             current =iv_rulerepeat_statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerepeat_statement"


    // $ANTLR start "rulerepeat_statement"
    // InternalDemoFkd.g:2625:1: rulerepeat_statement returns [EObject current=null] : (otherlv_0= 'repeat' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) ) ;
    public final EObject rulerepeat_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:2631:2: ( (otherlv_0= 'repeat' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) ) )
            // InternalDemoFkd.g:2632:2: (otherlv_0= 'repeat' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) )
            {
            // InternalDemoFkd.g:2632:2: (otherlv_0= 'repeat' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) )
            // InternalDemoFkd.g:2633:3: otherlv_0= 'repeat' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getRepeat_statementAccess().getRepeatKeyword_0());
            		
            // InternalDemoFkd.g:2637:3: ( (lv_sequence_1_0= rulestatement_sequence ) )
            // InternalDemoFkd.g:2638:4: (lv_sequence_1_0= rulestatement_sequence )
            {
            // InternalDemoFkd.g:2638:4: (lv_sequence_1_0= rulestatement_sequence )
            // InternalDemoFkd.g:2639:5: lv_sequence_1_0= rulestatement_sequence
            {

            					newCompositeNode(grammarAccess.getRepeat_statementAccess().getSequenceStatement_sequenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
            lv_sequence_1_0=rulestatement_sequence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeat_statementRule());
            					}
            					set(
            						current,
            						"sequence",
            						lv_sequence_1_0,
            						"org.xtext.pascal.program.DemoFkd.statement_sequence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,55,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getRepeat_statementAccess().getUntilKeyword_2());
            		
            // InternalDemoFkd.g:2660:3: ( (lv_expression_3_0= ruleexpression ) )
            // InternalDemoFkd.g:2661:4: (lv_expression_3_0= ruleexpression )
            {
            // InternalDemoFkd.g:2661:4: (lv_expression_3_0= ruleexpression )
            // InternalDemoFkd.g:2662:5: lv_expression_3_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getRepeat_statementAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeat_statementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"org.xtext.pascal.program.DemoFkd.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerepeat_statement"


    // $ANTLR start "entryRulefor_statement"
    // InternalDemoFkd.g:2683:1: entryRulefor_statement returns [EObject current=null] : iv_rulefor_statement= rulefor_statement EOF ;
    public final EObject entryRulefor_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefor_statement = null;


        try {
            // InternalDemoFkd.g:2683:54: (iv_rulefor_statement= rulefor_statement EOF )
            // InternalDemoFkd.g:2684:2: iv_rulefor_statement= rulefor_statement EOF
            {
             newCompositeNode(grammarAccess.getFor_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefor_statement=rulefor_statement();

            state._fsp--;

             current =iv_rulefor_statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefor_statement"


    // $ANTLR start "rulefor_statement"
    // InternalDemoFkd.g:2690:1: rulefor_statement returns [EObject current=null] : (otherlv_0= 'for' ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= 'to' | otherlv_3= 'downto' ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= 'do' ( (lv_statement_6_0= rulestatement ) ) ) ;
    public final EObject rulefor_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_assignment_1_0 = null;

        EObject lv_expression_4_0 = null;

        EObject lv_statement_6_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:2696:2: ( (otherlv_0= 'for' ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= 'to' | otherlv_3= 'downto' ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= 'do' ( (lv_statement_6_0= rulestatement ) ) ) )
            // InternalDemoFkd.g:2697:2: (otherlv_0= 'for' ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= 'to' | otherlv_3= 'downto' ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= 'do' ( (lv_statement_6_0= rulestatement ) ) )
            {
            // InternalDemoFkd.g:2697:2: (otherlv_0= 'for' ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= 'to' | otherlv_3= 'downto' ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= 'do' ( (lv_statement_6_0= rulestatement ) ) )
            // InternalDemoFkd.g:2698:3: otherlv_0= 'for' ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= 'to' | otherlv_3= 'downto' ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= 'do' ( (lv_statement_6_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFor_statementAccess().getForKeyword_0());
            		
            // InternalDemoFkd.g:2702:3: ( (lv_assignment_1_0= ruleassignment_statement ) )
            // InternalDemoFkd.g:2703:4: (lv_assignment_1_0= ruleassignment_statement )
            {
            // InternalDemoFkd.g:2703:4: (lv_assignment_1_0= ruleassignment_statement )
            // InternalDemoFkd.g:2704:5: lv_assignment_1_0= ruleassignment_statement
            {

            					newCompositeNode(grammarAccess.getFor_statementAccess().getAssignmentAssignment_statementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_32);
            lv_assignment_1_0=ruleassignment_statement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFor_statementRule());
            					}
            					set(
            						current,
            						"assignment",
            						lv_assignment_1_0,
            						"org.xtext.pascal.program.DemoFkd.assignment_statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDemoFkd.g:2721:3: (otherlv_2= 'to' | otherlv_3= 'downto' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==57) ) {
                alt37=1;
            }
            else if ( (LA37_0==58) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalDemoFkd.g:2722:4: otherlv_2= 'to'
                    {
                    otherlv_2=(Token)match(input,57,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getFor_statementAccess().getToKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:2727:4: otherlv_3= 'downto'
                    {
                    otherlv_3=(Token)match(input,58,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getFor_statementAccess().getDowntoKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalDemoFkd.g:2732:3: ( (lv_expression_4_0= ruleexpression ) )
            // InternalDemoFkd.g:2733:4: (lv_expression_4_0= ruleexpression )
            {
            // InternalDemoFkd.g:2733:4: (lv_expression_4_0= ruleexpression )
            // InternalDemoFkd.g:2734:5: lv_expression_4_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getFor_statementAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_30);
            lv_expression_4_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFor_statementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_4_0,
            						"org.xtext.pascal.program.DemoFkd.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,53,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getFor_statementAccess().getDoKeyword_4());
            		
            // InternalDemoFkd.g:2755:3: ( (lv_statement_6_0= rulestatement ) )
            // InternalDemoFkd.g:2756:4: (lv_statement_6_0= rulestatement )
            {
            // InternalDemoFkd.g:2756:4: (lv_statement_6_0= rulestatement )
            // InternalDemoFkd.g:2757:5: lv_statement_6_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getFor_statementAccess().getStatementStatementParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_6_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFor_statementRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_6_0,
            						"org.xtext.pascal.program.DemoFkd.statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefor_statement"


    // $ANTLR start "entryRuleconditional_statement"
    // InternalDemoFkd.g:2778:1: entryRuleconditional_statement returns [EObject current=null] : iv_ruleconditional_statement= ruleconditional_statement EOF ;
    public final EObject entryRuleconditional_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconditional_statement = null;


        try {
            // InternalDemoFkd.g:2778:62: (iv_ruleconditional_statement= ruleconditional_statement EOF )
            // InternalDemoFkd.g:2779:2: iv_ruleconditional_statement= ruleconditional_statement EOF
            {
             newCompositeNode(grammarAccess.getConditional_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconditional_statement=ruleconditional_statement();

            state._fsp--;

             current =iv_ruleconditional_statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconditional_statement"


    // $ANTLR start "ruleconditional_statement"
    // InternalDemoFkd.g:2785:1: ruleconditional_statement returns [EObject current=null] : ( ( (lv_ifStmt_0_0= ruleif_statement ) ) | ( (lv_caseStmt_1_0= rulecase_statement ) ) ) ;
    public final EObject ruleconditional_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_ifStmt_0_0 = null;

        EObject lv_caseStmt_1_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:2791:2: ( ( ( (lv_ifStmt_0_0= ruleif_statement ) ) | ( (lv_caseStmt_1_0= rulecase_statement ) ) ) )
            // InternalDemoFkd.g:2792:2: ( ( (lv_ifStmt_0_0= ruleif_statement ) ) | ( (lv_caseStmt_1_0= rulecase_statement ) ) )
            {
            // InternalDemoFkd.g:2792:2: ( ( (lv_ifStmt_0_0= ruleif_statement ) ) | ( (lv_caseStmt_1_0= rulecase_statement ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==59) ) {
                alt38=1;
            }
            else if ( (LA38_0==62) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalDemoFkd.g:2793:3: ( (lv_ifStmt_0_0= ruleif_statement ) )
                    {
                    // InternalDemoFkd.g:2793:3: ( (lv_ifStmt_0_0= ruleif_statement ) )
                    // InternalDemoFkd.g:2794:4: (lv_ifStmt_0_0= ruleif_statement )
                    {
                    // InternalDemoFkd.g:2794:4: (lv_ifStmt_0_0= ruleif_statement )
                    // InternalDemoFkd.g:2795:5: lv_ifStmt_0_0= ruleif_statement
                    {

                    					newCompositeNode(grammarAccess.getConditional_statementAccess().getIfStmtIf_statementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ifStmt_0_0=ruleif_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditional_statementRule());
                    					}
                    					set(
                    						current,
                    						"ifStmt",
                    						lv_ifStmt_0_0,
                    						"org.xtext.pascal.program.DemoFkd.if_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:2813:3: ( (lv_caseStmt_1_0= rulecase_statement ) )
                    {
                    // InternalDemoFkd.g:2813:3: ( (lv_caseStmt_1_0= rulecase_statement ) )
                    // InternalDemoFkd.g:2814:4: (lv_caseStmt_1_0= rulecase_statement )
                    {
                    // InternalDemoFkd.g:2814:4: (lv_caseStmt_1_0= rulecase_statement )
                    // InternalDemoFkd.g:2815:5: lv_caseStmt_1_0= rulecase_statement
                    {

                    					newCompositeNode(grammarAccess.getConditional_statementAccess().getCaseStmtCase_statementParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_caseStmt_1_0=rulecase_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditional_statementRule());
                    					}
                    					set(
                    						current,
                    						"caseStmt",
                    						lv_caseStmt_1_0,
                    						"org.xtext.pascal.program.DemoFkd.case_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconditional_statement"


    // $ANTLR start "entryRuleif_statement"
    // InternalDemoFkd.g:2836:1: entryRuleif_statement returns [EObject current=null] : iv_ruleif_statement= ruleif_statement EOF ;
    public final EObject entryRuleif_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleif_statement = null;


        try {
            // InternalDemoFkd.g:2836:53: (iv_ruleif_statement= ruleif_statement EOF )
            // InternalDemoFkd.g:2837:2: iv_ruleif_statement= ruleif_statement EOF
            {
             newCompositeNode(grammarAccess.getIf_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleif_statement=ruleif_statement();

            state._fsp--;

             current =iv_ruleif_statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleif_statement"


    // $ANTLR start "ruleif_statement"
    // InternalDemoFkd.g:2843:1: ruleif_statement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) ) )? ) ;
    public final EObject ruleif_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_1_0 = null;

        EObject lv_ifStatement_3_0 = null;

        EObject lv_elseStatement_5_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:2849:2: ( (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) ) )? ) )
            // InternalDemoFkd.g:2850:2: (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) ) )? )
            {
            // InternalDemoFkd.g:2850:2: (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) ) )? )
            // InternalDemoFkd.g:2851:3: otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) ) )?
            {
            otherlv_0=(Token)match(input,59,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getIf_statementAccess().getIfKeyword_0());
            		
            // InternalDemoFkd.g:2855:3: ( (lv_expression_1_0= ruleexpression ) )
            // InternalDemoFkd.g:2856:4: (lv_expression_1_0= ruleexpression )
            {
            // InternalDemoFkd.g:2856:4: (lv_expression_1_0= ruleexpression )
            // InternalDemoFkd.g:2857:5: lv_expression_1_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getIf_statementAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_expression_1_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIf_statementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.pascal.program.DemoFkd.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,60,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getIf_statementAccess().getThenKeyword_2());
            		
            // InternalDemoFkd.g:2878:3: ( (lv_ifStatement_3_0= rulestatement ) )
            // InternalDemoFkd.g:2879:4: (lv_ifStatement_3_0= rulestatement )
            {
            // InternalDemoFkd.g:2879:4: (lv_ifStatement_3_0= rulestatement )
            // InternalDemoFkd.g:2880:5: lv_ifStatement_3_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getIf_statementAccess().getIfStatementStatementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
            lv_ifStatement_3_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIf_statementRule());
            					}
            					set(
            						current,
            						"ifStatement",
            						lv_ifStatement_3_0,
            						"org.xtext.pascal.program.DemoFkd.statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDemoFkd.g:2897:3: (otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==61) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDemoFkd.g:2898:4: otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) )
                    {
                    otherlv_4=(Token)match(input,61,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getIf_statementAccess().getElseKeyword_4_0());
                    			
                    // InternalDemoFkd.g:2902:4: ( (lv_elseStatement_5_0= rulestatement ) )
                    // InternalDemoFkd.g:2903:5: (lv_elseStatement_5_0= rulestatement )
                    {
                    // InternalDemoFkd.g:2903:5: (lv_elseStatement_5_0= rulestatement )
                    // InternalDemoFkd.g:2904:6: lv_elseStatement_5_0= rulestatement
                    {

                    						newCompositeNode(grammarAccess.getIf_statementAccess().getElseStatementStatementParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_elseStatement_5_0=rulestatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIf_statementRule());
                    						}
                    						set(
                    							current,
                    							"elseStatement",
                    							lv_elseStatement_5_0,
                    							"org.xtext.pascal.program.DemoFkd.statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleif_statement"


    // $ANTLR start "entryRulecase_statement"
    // InternalDemoFkd.g:2926:1: entryRulecase_statement returns [EObject current=null] : iv_rulecase_statement= rulecase_statement EOF ;
    public final EObject entryRulecase_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_statement = null;


        try {
            // InternalDemoFkd.g:2926:55: (iv_rulecase_statement= rulecase_statement EOF )
            // InternalDemoFkd.g:2927:2: iv_rulecase_statement= rulecase_statement EOF
            {
             newCompositeNode(grammarAccess.getCase_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecase_statement=rulecase_statement();

            state._fsp--;

             current =iv_rulecase_statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecase_statement"


    // $ANTLR start "rulecase_statement"
    // InternalDemoFkd.g:2933:1: rulecase_statement returns [EObject current=null] : (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_cases_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_cases_5_0= rulecase_limb ) ) )* (otherlv_6= ';' )? otherlv_7= 'end' ) ;
    public final EObject rulecase_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_expression_1_0 = null;

        EObject lv_cases_3_0 = null;

        EObject lv_cases_5_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:2939:2: ( (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_cases_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_cases_5_0= rulecase_limb ) ) )* (otherlv_6= ';' )? otherlv_7= 'end' ) )
            // InternalDemoFkd.g:2940:2: (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_cases_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_cases_5_0= rulecase_limb ) ) )* (otherlv_6= ';' )? otherlv_7= 'end' )
            {
            // InternalDemoFkd.g:2940:2: (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_cases_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_cases_5_0= rulecase_limb ) ) )* (otherlv_6= ';' )? otherlv_7= 'end' )
            // InternalDemoFkd.g:2941:3: otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_cases_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_cases_5_0= rulecase_limb ) ) )* (otherlv_6= ';' )? otherlv_7= 'end'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getCase_statementAccess().getCaseKeyword_0());
            		
            // InternalDemoFkd.g:2945:3: ( (lv_expression_1_0= ruleexpression ) )
            // InternalDemoFkd.g:2946:4: (lv_expression_1_0= ruleexpression )
            {
            // InternalDemoFkd.g:2946:4: (lv_expression_1_0= ruleexpression )
            // InternalDemoFkd.g:2947:5: lv_expression_1_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getCase_statementAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
            lv_expression_1_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCase_statementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.pascal.program.DemoFkd.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,63,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getCase_statementAccess().getOfKeyword_2());
            		
            // InternalDemoFkd.g:2968:3: ( (lv_cases_3_0= rulecase_limb ) )
            // InternalDemoFkd.g:2969:4: (lv_cases_3_0= rulecase_limb )
            {
            // InternalDemoFkd.g:2969:4: (lv_cases_3_0= rulecase_limb )
            // InternalDemoFkd.g:2970:5: lv_cases_3_0= rulecase_limb
            {

            					newCompositeNode(grammarAccess.getCase_statementAccess().getCasesCase_limbParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_37);
            lv_cases_3_0=rulecase_limb();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCase_statementRule());
            					}
            					add(
            						current,
            						"cases",
            						lv_cases_3_0,
            						"org.xtext.pascal.program.DemoFkd.case_limb");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDemoFkd.g:2987:3: (otherlv_4= ';' ( (lv_cases_5_0= rulecase_limb ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==32) ) {
                    int LA40_1 = input.LA(2);

                    if ( ((LA40_1>=RULE_ID && LA40_1<=RULE_INTEGER_NUMBER)||LA40_1==RULE_ADDITION_OPERATOR||(LA40_1>=RULE_STRING && LA40_1<=RULE_SIGNED_REAL_NUMBER)||(LA40_1>=48 && LA40_1<=50)) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // InternalDemoFkd.g:2988:4: otherlv_4= ';' ( (lv_cases_5_0= rulecase_limb ) )
            	    {
            	    otherlv_4=(Token)match(input,32,FOLLOW_36); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCase_statementAccess().getSemicolonKeyword_4_0());
            	    			
            	    // InternalDemoFkd.g:2992:4: ( (lv_cases_5_0= rulecase_limb ) )
            	    // InternalDemoFkd.g:2993:5: (lv_cases_5_0= rulecase_limb )
            	    {
            	    // InternalDemoFkd.g:2993:5: (lv_cases_5_0= rulecase_limb )
            	    // InternalDemoFkd.g:2994:6: lv_cases_5_0= rulecase_limb
            	    {

            	    						newCompositeNode(grammarAccess.getCase_statementAccess().getCasesCase_limbParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_cases_5_0=rulecase_limb();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCase_statementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"cases",
            	    							lv_cases_5_0,
            	    							"org.xtext.pascal.program.DemoFkd.case_limb");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // InternalDemoFkd.g:3012:3: (otherlv_6= ';' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==32) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDemoFkd.g:3013:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getCase_statementAccess().getSemicolonKeyword_5());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCase_statementAccess().getEndKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecase_statement"


    // $ANTLR start "entryRulecase_limb"
    // InternalDemoFkd.g:3026:1: entryRulecase_limb returns [EObject current=null] : iv_rulecase_limb= rulecase_limb EOF ;
    public final EObject entryRulecase_limb() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_limb = null;


        try {
            // InternalDemoFkd.g:3026:50: (iv_rulecase_limb= rulecase_limb EOF )
            // InternalDemoFkd.g:3027:2: iv_rulecase_limb= rulecase_limb EOF
            {
             newCompositeNode(grammarAccess.getCase_limbRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecase_limb=rulecase_limb();

            state._fsp--;

             current =iv_rulecase_limb; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecase_limb"


    // $ANTLR start "rulecase_limb"
    // InternalDemoFkd.g:3033:1: rulecase_limb returns [EObject current=null] : ( ( (lv_cases_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) ) ;
    public final EObject rulecase_limb() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_cases_0_0 = null;

        EObject lv_statement_2_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:3039:2: ( ( ( (lv_cases_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) ) )
            // InternalDemoFkd.g:3040:2: ( ( (lv_cases_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) )
            {
            // InternalDemoFkd.g:3040:2: ( ( (lv_cases_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) )
            // InternalDemoFkd.g:3041:3: ( (lv_cases_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) )
            {
            // InternalDemoFkd.g:3041:3: ( (lv_cases_0_0= rulecase_label_list ) )
            // InternalDemoFkd.g:3042:4: (lv_cases_0_0= rulecase_label_list )
            {
            // InternalDemoFkd.g:3042:4: (lv_cases_0_0= rulecase_label_list )
            // InternalDemoFkd.g:3043:5: lv_cases_0_0= rulecase_label_list
            {

            					newCompositeNode(grammarAccess.getCase_limbAccess().getCasesCase_label_listParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_cases_0_0=rulecase_label_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCase_limbRule());
            					}
            					set(
            						current,
            						"cases",
            						lv_cases_0_0,
            						"org.xtext.pascal.program.DemoFkd.case_label_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getCase_limbAccess().getColonKeyword_1());
            		
            // InternalDemoFkd.g:3064:3: ( (lv_statement_2_0= rulestatement ) )
            // InternalDemoFkd.g:3065:4: (lv_statement_2_0= rulestatement )
            {
            // InternalDemoFkd.g:3065:4: (lv_statement_2_0= rulestatement )
            // InternalDemoFkd.g:3066:5: lv_statement_2_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getCase_limbAccess().getStatementStatementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_2_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCase_limbRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_2_0,
            						"org.xtext.pascal.program.DemoFkd.statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecase_limb"


    // $ANTLR start "entryRulecase_label_list"
    // InternalDemoFkd.g:3087:1: entryRulecase_label_list returns [EObject current=null] : iv_rulecase_label_list= rulecase_label_list EOF ;
    public final EObject entryRulecase_label_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_label_list = null;


        try {
            // InternalDemoFkd.g:3087:56: (iv_rulecase_label_list= rulecase_label_list EOF )
            // InternalDemoFkd.g:3088:2: iv_rulecase_label_list= rulecase_label_list EOF
            {
             newCompositeNode(grammarAccess.getCase_label_listRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecase_label_list=rulecase_label_list();

            state._fsp--;

             current =iv_rulecase_label_list; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecase_label_list"


    // $ANTLR start "rulecase_label_list"
    // InternalDemoFkd.g:3094:1: rulecase_label_list returns [EObject current=null] : ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) ) )* ) ;
    public final EObject rulecase_label_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constants_0_0 = null;

        EObject lv_constants_2_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:3100:2: ( ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) ) )* ) )
            // InternalDemoFkd.g:3101:2: ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) ) )* )
            {
            // InternalDemoFkd.g:3101:2: ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) ) )* )
            // InternalDemoFkd.g:3102:3: ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) ) )*
            {
            // InternalDemoFkd.g:3102:3: ( (lv_constants_0_0= ruleconstant ) )
            // InternalDemoFkd.g:3103:4: (lv_constants_0_0= ruleconstant )
            {
            // InternalDemoFkd.g:3103:4: (lv_constants_0_0= ruleconstant )
            // InternalDemoFkd.g:3104:5: lv_constants_0_0= ruleconstant
            {

            					newCompositeNode(grammarAccess.getCase_label_listAccess().getConstantsConstantParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_constants_0_0=ruleconstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCase_label_listRule());
            					}
            					add(
            						current,
            						"constants",
            						lv_constants_0_0,
            						"org.xtext.pascal.program.DemoFkd.constant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDemoFkd.g:3121:3: (otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==33) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalDemoFkd.g:3122:4: otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_36); 

            	    				newLeafNode(otherlv_1, grammarAccess.getCase_label_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalDemoFkd.g:3126:4: ( (lv_constants_2_0= ruleconstant ) )
            	    // InternalDemoFkd.g:3127:5: (lv_constants_2_0= ruleconstant )
            	    {
            	    // InternalDemoFkd.g:3127:5: (lv_constants_2_0= ruleconstant )
            	    // InternalDemoFkd.g:3128:6: lv_constants_2_0= ruleconstant
            	    {

            	    						newCompositeNode(grammarAccess.getCase_label_listAccess().getConstantsConstantParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_constants_2_0=ruleconstant();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCase_label_listRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constants",
            	    							lv_constants_2_0,
            	    							"org.xtext.pascal.program.DemoFkd.constant");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecase_label_list"


    // $ANTLR start "entryRuleconstant"
    // InternalDemoFkd.g:3150:1: entryRuleconstant returns [EObject current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final EObject entryRuleconstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant = null;


        try {
            // InternalDemoFkd.g:3150:49: (iv_ruleconstant= ruleconstant EOF )
            // InternalDemoFkd.g:3151:2: iv_ruleconstant= ruleconstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstant=ruleconstant();

            state._fsp--;

             current =iv_ruleconstant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstant"


    // $ANTLR start "ruleconstant"
    // InternalDemoFkd.g:3157:1: ruleconstant returns [EObject current=null] : ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) | ( (lv_nil_6_0= 'nil' ) ) ) ;
    public final EObject ruleconstant() throws RecognitionException {
        EObject current = null;

        Token lv_opterator_0_0=null;
        Token lv_name_1_0=null;
        Token lv_string_3_0=null;
        Token lv_boolLiteral_4_0=null;
        Token lv_boolLiteral_5_0=null;
        Token lv_nil_6_0=null;
        EObject lv_number_2_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:3163:2: ( ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) | ( (lv_nil_6_0= 'nil' ) ) ) )
            // InternalDemoFkd.g:3164:2: ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) | ( (lv_nil_6_0= 'nil' ) ) )
            {
            // InternalDemoFkd.g:3164:2: ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) | ( (lv_nil_6_0= 'nil' ) ) )
            int alt45=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_INTEGER_NUMBER:
            case RULE_ADDITION_OPERATOR:
            case RULE_REAL_NUMBER:
            case RULE_SIGNED_REAL_NUMBER:
                {
                alt45=1;
                }
                break;
            case RULE_STRING:
                {
                alt45=2;
                }
                break;
            case 49:
                {
                alt45=3;
                }
                break;
            case 50:
                {
                alt45=4;
                }
                break;
            case 48:
                {
                alt45=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalDemoFkd.g:3165:3: ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) )
                    {
                    // InternalDemoFkd.g:3165:3: ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) )
                    // InternalDemoFkd.g:3166:4: ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) )
                    {
                    // InternalDemoFkd.g:3166:4: ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_ADDITION_OPERATOR) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalDemoFkd.g:3167:5: (lv_opterator_0_0= RULE_ADDITION_OPERATOR )
                            {
                            // InternalDemoFkd.g:3167:5: (lv_opterator_0_0= RULE_ADDITION_OPERATOR )
                            // InternalDemoFkd.g:3168:6: lv_opterator_0_0= RULE_ADDITION_OPERATOR
                            {
                            lv_opterator_0_0=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_38); 

                            						newLeafNode(lv_opterator_0_0, grammarAccess.getConstantAccess().getOpteratorADDITION_OPERATORTerminalRuleCall_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getConstantRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"opterator",
                            							lv_opterator_0_0,
                            							"org.xtext.pascal.program.DemoFkd.ADDITION_OPERATOR");
                            					

                            }


                            }
                            break;

                    }

                    // InternalDemoFkd.g:3184:4: ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==RULE_ID) ) {
                        alt44=1;
                    }
                    else if ( ((LA44_0>=RULE_SIGNED_INTEGER_NUMBER && LA44_0<=RULE_INTEGER_NUMBER)||(LA44_0>=RULE_REAL_NUMBER && LA44_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                        alt44=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalDemoFkd.g:3185:5: ( (lv_name_1_0= RULE_ID ) )
                            {
                            // InternalDemoFkd.g:3185:5: ( (lv_name_1_0= RULE_ID ) )
                            // InternalDemoFkd.g:3186:6: (lv_name_1_0= RULE_ID )
                            {
                            // InternalDemoFkd.g:3186:6: (lv_name_1_0= RULE_ID )
                            // InternalDemoFkd.g:3187:7: lv_name_1_0= RULE_ID
                            {
                            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_name_1_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstantRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_1_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalDemoFkd.g:3204:5: ( (lv_number_2_0= rulenumber ) )
                            {
                            // InternalDemoFkd.g:3204:5: ( (lv_number_2_0= rulenumber ) )
                            // InternalDemoFkd.g:3205:6: (lv_number_2_0= rulenumber )
                            {
                            // InternalDemoFkd.g:3205:6: (lv_number_2_0= rulenumber )
                            // InternalDemoFkd.g:3206:7: lv_number_2_0= rulenumber
                            {

                            							newCompositeNode(grammarAccess.getConstantAccess().getNumberNumberParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_number_2_0=rulenumber();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getConstantRule());
                            							}
                            							set(
                            								current,
                            								"number",
                            								lv_number_2_0,
                            								"org.xtext.pascal.program.DemoFkd.number");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:3226:3: ( (lv_string_3_0= RULE_STRING ) )
                    {
                    // InternalDemoFkd.g:3226:3: ( (lv_string_3_0= RULE_STRING ) )
                    // InternalDemoFkd.g:3227:4: (lv_string_3_0= RULE_STRING )
                    {
                    // InternalDemoFkd.g:3227:4: (lv_string_3_0= RULE_STRING )
                    // InternalDemoFkd.g:3228:5: lv_string_3_0= RULE_STRING
                    {
                    lv_string_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_3_0, grammarAccess.getConstantAccess().getStringSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_3_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDemoFkd.g:3245:3: ( (lv_boolLiteral_4_0= 'true' ) )
                    {
                    // InternalDemoFkd.g:3245:3: ( (lv_boolLiteral_4_0= 'true' ) )
                    // InternalDemoFkd.g:3246:4: (lv_boolLiteral_4_0= 'true' )
                    {
                    // InternalDemoFkd.g:3246:4: (lv_boolLiteral_4_0= 'true' )
                    // InternalDemoFkd.g:3247:5: lv_boolLiteral_4_0= 'true'
                    {
                    lv_boolLiteral_4_0=(Token)match(input,49,FOLLOW_2); 

                    					newLeafNode(lv_boolLiteral_4_0, grammarAccess.getConstantAccess().getBoolLiteralTrueKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(current, "boolLiteral", lv_boolLiteral_4_0, "true");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDemoFkd.g:3260:3: ( (lv_boolLiteral_5_0= 'false' ) )
                    {
                    // InternalDemoFkd.g:3260:3: ( (lv_boolLiteral_5_0= 'false' ) )
                    // InternalDemoFkd.g:3261:4: (lv_boolLiteral_5_0= 'false' )
                    {
                    // InternalDemoFkd.g:3261:4: (lv_boolLiteral_5_0= 'false' )
                    // InternalDemoFkd.g:3262:5: lv_boolLiteral_5_0= 'false'
                    {
                    lv_boolLiteral_5_0=(Token)match(input,50,FOLLOW_2); 

                    					newLeafNode(lv_boolLiteral_5_0, grammarAccess.getConstantAccess().getBoolLiteralFalseKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(current, "boolLiteral", lv_boolLiteral_5_0, "false");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDemoFkd.g:3275:3: ( (lv_nil_6_0= 'nil' ) )
                    {
                    // InternalDemoFkd.g:3275:3: ( (lv_nil_6_0= 'nil' ) )
                    // InternalDemoFkd.g:3276:4: (lv_nil_6_0= 'nil' )
                    {
                    // InternalDemoFkd.g:3276:4: (lv_nil_6_0= 'nil' )
                    // InternalDemoFkd.g:3277:5: lv_nil_6_0= 'nil'
                    {
                    lv_nil_6_0=(Token)match(input,48,FOLLOW_2); 

                    					newLeafNode(lv_nil_6_0, grammarAccess.getConstantAccess().getNilNilKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(current, "nil", lv_nil_6_0, "nil");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstant"


    // $ANTLR start "entryRulewith_statement"
    // InternalDemoFkd.g:3293:1: entryRulewith_statement returns [EObject current=null] : iv_rulewith_statement= rulewith_statement EOF ;
    public final EObject entryRulewith_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewith_statement = null;


        try {
            // InternalDemoFkd.g:3293:55: (iv_rulewith_statement= rulewith_statement EOF )
            // InternalDemoFkd.g:3294:2: iv_rulewith_statement= rulewith_statement EOF
            {
             newCompositeNode(grammarAccess.getWith_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulewith_statement=rulewith_statement();

            state._fsp--;

             current =iv_rulewith_statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulewith_statement"


    // $ANTLR start "rulewith_statement"
    // InternalDemoFkd.g:3300:1: rulewith_statement returns [EObject current=null] : (otherlv_0= 'with' ( (lv_variables_1_0= rulevariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) ) ) ;
    public final EObject rulewith_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;

        EObject lv_statement_5_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:3306:2: ( (otherlv_0= 'with' ( (lv_variables_1_0= rulevariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) ) ) )
            // InternalDemoFkd.g:3307:2: (otherlv_0= 'with' ( (lv_variables_1_0= rulevariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) ) )
            {
            // InternalDemoFkd.g:3307:2: (otherlv_0= 'with' ( (lv_variables_1_0= rulevariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) ) )
            // InternalDemoFkd.g:3308:3: otherlv_0= 'with' ( (lv_variables_1_0= rulevariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWith_statementAccess().getWithKeyword_0());
            		
            // InternalDemoFkd.g:3312:3: ( (lv_variables_1_0= rulevariable ) )
            // InternalDemoFkd.g:3313:4: (lv_variables_1_0= rulevariable )
            {
            // InternalDemoFkd.g:3313:4: (lv_variables_1_0= rulevariable )
            // InternalDemoFkd.g:3314:5: lv_variables_1_0= rulevariable
            {

            					newCompositeNode(grammarAccess.getWith_statementAccess().getVariablesVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_39);
            lv_variables_1_0=rulevariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWith_statementRule());
            					}
            					add(
            						current,
            						"variables",
            						lv_variables_1_0,
            						"org.xtext.pascal.program.DemoFkd.variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDemoFkd.g:3331:3: (otherlv_2= ',' ( (lv_variables_3_0= rulevariable ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==33) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalDemoFkd.g:3332:4: otherlv_2= ',' ( (lv_variables_3_0= rulevariable ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getWith_statementAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalDemoFkd.g:3336:4: ( (lv_variables_3_0= rulevariable ) )
            	    // InternalDemoFkd.g:3337:5: (lv_variables_3_0= rulevariable )
            	    {
            	    // InternalDemoFkd.g:3337:5: (lv_variables_3_0= rulevariable )
            	    // InternalDemoFkd.g:3338:6: lv_variables_3_0= rulevariable
            	    {

            	    						newCompositeNode(grammarAccess.getWith_statementAccess().getVariablesVariableParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
            	    lv_variables_3_0=rulevariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWith_statementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variables",
            	    							lv_variables_3_0,
            	    							"org.xtext.pascal.program.DemoFkd.variable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_4=(Token)match(input,53,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getWith_statementAccess().getDoKeyword_3());
            		
            // InternalDemoFkd.g:3360:3: ( (lv_statement_5_0= rulestatement ) )
            // InternalDemoFkd.g:3361:4: (lv_statement_5_0= rulestatement )
            {
            // InternalDemoFkd.g:3361:4: (lv_statement_5_0= rulestatement )
            // InternalDemoFkd.g:3362:5: lv_statement_5_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getWith_statementAccess().getStatementStatementParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_5_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWith_statementRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_5_0,
            						"org.xtext.pascal.program.DemoFkd.statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulewith_statement"


    // $ANTLR start "entryRulegoto_statement"
    // InternalDemoFkd.g:3383:1: entryRulegoto_statement returns [EObject current=null] : iv_rulegoto_statement= rulegoto_statement EOF ;
    public final EObject entryRulegoto_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegoto_statement = null;


        try {
            // InternalDemoFkd.g:3383:55: (iv_rulegoto_statement= rulegoto_statement EOF )
            // InternalDemoFkd.g:3384:2: iv_rulegoto_statement= rulegoto_statement EOF
            {
             newCompositeNode(grammarAccess.getGoto_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulegoto_statement=rulegoto_statement();

            state._fsp--;

             current =iv_rulegoto_statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulegoto_statement"


    // $ANTLR start "rulegoto_statement"
    // InternalDemoFkd.g:3390:1: rulegoto_statement returns [EObject current=null] : (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) ) ;
    public final EObject rulegoto_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_label_1_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:3396:2: ( (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) ) )
            // InternalDemoFkd.g:3397:2: (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) )
            {
            // InternalDemoFkd.g:3397:2: (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) )
            // InternalDemoFkd.g:3398:3: otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getGoto_statementAccess().getGotoKeyword_0());
            		
            // InternalDemoFkd.g:3402:3: ( (lv_label_1_0= rulelabel ) )
            // InternalDemoFkd.g:3403:4: (lv_label_1_0= rulelabel )
            {
            // InternalDemoFkd.g:3403:4: (lv_label_1_0= rulelabel )
            // InternalDemoFkd.g:3404:5: lv_label_1_0= rulelabel
            {

            					newCompositeNode(grammarAccess.getGoto_statementAccess().getLabelLabelParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_label_1_0=rulelabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGoto_statementRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_1_0,
            						"org.xtext.pascal.program.DemoFkd.label");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulegoto_statement"


    // $ANTLR start "entryRulelabel_declaration_part"
    // InternalDemoFkd.g:3425:1: entryRulelabel_declaration_part returns [EObject current=null] : iv_rulelabel_declaration_part= rulelabel_declaration_part EOF ;
    public final EObject entryRulelabel_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel_declaration_part = null;


        try {
            // InternalDemoFkd.g:3425:63: (iv_rulelabel_declaration_part= rulelabel_declaration_part EOF )
            // InternalDemoFkd.g:3426:2: iv_rulelabel_declaration_part= rulelabel_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getLabel_declaration_partRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelabel_declaration_part=rulelabel_declaration_part();

            state._fsp--;

             current =iv_rulelabel_declaration_part; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelabel_declaration_part"


    // $ANTLR start "rulelabel_declaration_part"
    // InternalDemoFkd.g:3432:1: rulelabel_declaration_part returns [EObject current=null] : (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';' ) ;
    public final EObject rulelabel_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_labels_1_0 = null;

        EObject lv_labels_3_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:3438:2: ( (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';' ) )
            // InternalDemoFkd.g:3439:2: (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';' )
            {
            // InternalDemoFkd.g:3439:2: (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';' )
            // InternalDemoFkd.g:3440:3: otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getLabel_declaration_partAccess().getLabelKeyword_0());
            		
            // InternalDemoFkd.g:3444:3: ( (lv_labels_1_0= rulelabel ) )
            // InternalDemoFkd.g:3445:4: (lv_labels_1_0= rulelabel )
            {
            // InternalDemoFkd.g:3445:4: (lv_labels_1_0= rulelabel )
            // InternalDemoFkd.g:3446:5: lv_labels_1_0= rulelabel
            {

            					newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelsLabelParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_labels_1_0=rulelabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLabel_declaration_partRule());
            					}
            					add(
            						current,
            						"labels",
            						lv_labels_1_0,
            						"org.xtext.pascal.program.DemoFkd.label");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDemoFkd.g:3463:3: (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==33) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalDemoFkd.g:3464:4: otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_40); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLabel_declaration_partAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalDemoFkd.g:3468:4: ( (lv_labels_3_0= rulelabel ) )
            	    // InternalDemoFkd.g:3469:5: (lv_labels_3_0= rulelabel )
            	    {
            	    // InternalDemoFkd.g:3469:5: (lv_labels_3_0= rulelabel )
            	    // InternalDemoFkd.g:3470:6: lv_labels_3_0= rulelabel
            	    {

            	    						newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelsLabelParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_labels_3_0=rulelabel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLabel_declaration_partRule());
            	    						}
            	    						add(
            	    							current,
            	    							"labels",
            	    							lv_labels_3_0,
            	    							"org.xtext.pascal.program.DemoFkd.label");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_4=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLabel_declaration_partAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelabel_declaration_part"


    // $ANTLR start "entryRuleconstant_definition_part"
    // InternalDemoFkd.g:3496:1: entryRuleconstant_definition_part returns [EObject current=null] : iv_ruleconstant_definition_part= ruleconstant_definition_part EOF ;
    public final EObject entryRuleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition_part = null;


        try {
            // InternalDemoFkd.g:3496:65: (iv_ruleconstant_definition_part= ruleconstant_definition_part EOF )
            // InternalDemoFkd.g:3497:2: iv_ruleconstant_definition_part= ruleconstant_definition_part EOF
            {
             newCompositeNode(grammarAccess.getConstant_definition_partRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstant_definition_part=ruleconstant_definition_part();

            state._fsp--;

             current =iv_ruleconstant_definition_part; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstant_definition_part"


    // $ANTLR start "ruleconstant_definition_part"
    // InternalDemoFkd.g:3503:1: ruleconstant_definition_part returns [EObject current=null] : (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ ) ;
    public final EObject ruleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_consts_1_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:3509:2: ( (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ ) )
            // InternalDemoFkd.g:3510:2: (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ )
            {
            // InternalDemoFkd.g:3510:2: (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ )
            // InternalDemoFkd.g:3511:3: otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+
            {
            otherlv_0=(Token)match(input,67,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConstant_definition_partAccess().getConstKeyword_0());
            		
            // InternalDemoFkd.g:3515:3: ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ID) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalDemoFkd.g:3516:4: ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';'
            	    {
            	    // InternalDemoFkd.g:3516:4: ( (lv_consts_1_0= ruleconstant_definition ) )
            	    // InternalDemoFkd.g:3517:5: (lv_consts_1_0= ruleconstant_definition )
            	    {
            	    // InternalDemoFkd.g:3517:5: (lv_consts_1_0= ruleconstant_definition )
            	    // InternalDemoFkd.g:3518:6: lv_consts_1_0= ruleconstant_definition
            	    {

            	    						newCompositeNode(grammarAccess.getConstant_definition_partAccess().getConstsConstant_definitionParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_consts_1_0=ruleconstant_definition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConstant_definition_partRule());
            	    						}
            	    						add(
            	    							current,
            	    							"consts",
            	    							lv_consts_1_0,
            	    							"org.xtext.pascal.program.DemoFkd.constant_definition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_41); 

            	    				newLeafNode(otherlv_2, grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstant_definition_part"


    // $ANTLR start "entryRuleconstant_definition"
    // InternalDemoFkd.g:3544:1: entryRuleconstant_definition returns [EObject current=null] : iv_ruleconstant_definition= ruleconstant_definition EOF ;
    public final EObject entryRuleconstant_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition = null;


        try {
            // InternalDemoFkd.g:3544:60: (iv_ruleconstant_definition= ruleconstant_definition EOF )
            // InternalDemoFkd.g:3545:2: iv_ruleconstant_definition= ruleconstant_definition EOF
            {
             newCompositeNode(grammarAccess.getConstant_definitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstant_definition=ruleconstant_definition();

            state._fsp--;

             current =iv_ruleconstant_definition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstant_definition"


    // $ANTLR start "ruleconstant_definition"
    // InternalDemoFkd.g:3551:1: ruleconstant_definition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) ) ;
    public final EObject ruleconstant_definition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_const_2_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:3557:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) ) )
            // InternalDemoFkd.g:3558:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) )
            {
            // InternalDemoFkd.g:3558:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) )
            // InternalDemoFkd.g:3559:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) )
            {
            // InternalDemoFkd.g:3559:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDemoFkd.g:3560:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDemoFkd.g:3560:4: (lv_name_0_0= RULE_ID )
            // InternalDemoFkd.g:3561:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_42); 

            					newLeafNode(lv_name_0_0, grammarAccess.getConstant_definitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstant_definitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1());
            		
            // InternalDemoFkd.g:3581:3: ( (lv_const_2_0= ruleconstant ) )
            // InternalDemoFkd.g:3582:4: (lv_const_2_0= ruleconstant )
            {
            // InternalDemoFkd.g:3582:4: (lv_const_2_0= ruleconstant )
            // InternalDemoFkd.g:3583:5: lv_const_2_0= ruleconstant
            {

            					newCompositeNode(grammarAccess.getConstant_definitionAccess().getConstConstantParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_const_2_0=ruleconstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstant_definitionRule());
            					}
            					set(
            						current,
            						"const",
            						lv_const_2_0,
            						"org.xtext.pascal.program.DemoFkd.constant");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstant_definition"


    // $ANTLR start "entryRuletype_definition_part"
    // InternalDemoFkd.g:3604:1: entryRuletype_definition_part returns [EObject current=null] : iv_ruletype_definition_part= ruletype_definition_part EOF ;
    public final EObject entryRuletype_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition_part = null;


        try {
            // InternalDemoFkd.g:3604:61: (iv_ruletype_definition_part= ruletype_definition_part EOF )
            // InternalDemoFkd.g:3605:2: iv_ruletype_definition_part= ruletype_definition_part EOF
            {
             newCompositeNode(grammarAccess.getType_definition_partRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletype_definition_part=ruletype_definition_part();

            state._fsp--;

             current =iv_ruletype_definition_part; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype_definition_part"


    // $ANTLR start "ruletype_definition_part"
    // InternalDemoFkd.g:3611:1: ruletype_definition_part returns [EObject current=null] : (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ ) ;
    public final EObject ruletype_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_types_1_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:3617:2: ( (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ ) )
            // InternalDemoFkd.g:3618:2: (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ )
            {
            // InternalDemoFkd.g:3618:2: (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ )
            // InternalDemoFkd.g:3619:3: otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+
            {
            otherlv_0=(Token)match(input,68,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getType_definition_partAccess().getTypeKeyword_0());
            		
            // InternalDemoFkd.g:3623:3: ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalDemoFkd.g:3624:4: ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';'
            	    {
            	    // InternalDemoFkd.g:3624:4: ( (lv_types_1_0= ruletype_definition ) )
            	    // InternalDemoFkd.g:3625:5: (lv_types_1_0= ruletype_definition )
            	    {
            	    // InternalDemoFkd.g:3625:5: (lv_types_1_0= ruletype_definition )
            	    // InternalDemoFkd.g:3626:6: lv_types_1_0= ruletype_definition
            	    {

            	    						newCompositeNode(grammarAccess.getType_definition_partAccess().getTypesType_definitionParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_types_1_0=ruletype_definition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getType_definition_partRule());
            	    						}
            	    						add(
            	    							current,
            	    							"types",
            	    							lv_types_1_0,
            	    							"org.xtext.pascal.program.DemoFkd.type_definition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_41); 

            	    				newLeafNode(otherlv_2, grammarAccess.getType_definition_partAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype_definition_part"


    // $ANTLR start "entryRuletype_definition"
    // InternalDemoFkd.g:3652:1: entryRuletype_definition returns [EObject current=null] : iv_ruletype_definition= ruletype_definition EOF ;
    public final EObject entryRuletype_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition = null;


        try {
            // InternalDemoFkd.g:3652:56: (iv_ruletype_definition= ruletype_definition EOF )
            // InternalDemoFkd.g:3653:2: iv_ruletype_definition= ruletype_definition EOF
            {
             newCompositeNode(grammarAccess.getType_definitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletype_definition=ruletype_definition();

            state._fsp--;

             current =iv_ruletype_definition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype_definition"


    // $ANTLR start "ruletype_definition"
    // InternalDemoFkd.g:3659:1: ruletype_definition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruletype_definition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:3665:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalDemoFkd.g:3666:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalDemoFkd.g:3666:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) )
            // InternalDemoFkd.g:3667:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) )
            {
            // InternalDemoFkd.g:3667:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDemoFkd.g:3668:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDemoFkd.g:3668:4: (lv_name_0_0= RULE_ID )
            // InternalDemoFkd.g:3669:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_42); 

            					newLeafNode(lv_name_0_0, grammarAccess.getType_definitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getType_definitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1());
            		
            // InternalDemoFkd.g:3689:3: ( (lv_type_2_0= ruletype ) )
            // InternalDemoFkd.g:3690:4: (lv_type_2_0= ruletype )
            {
            // InternalDemoFkd.g:3690:4: (lv_type_2_0= ruletype )
            // InternalDemoFkd.g:3691:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getType_definitionAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getType_definitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.pascal.program.DemoFkd.type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype_definition"


    // $ANTLR start "entryRuletype"
    // InternalDemoFkd.g:3712:1: entryRuletype returns [EObject current=null] : iv_ruletype= ruletype EOF ;
    public final EObject entryRuletype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype = null;


        try {
            // InternalDemoFkd.g:3712:45: (iv_ruletype= ruletype EOF )
            // InternalDemoFkd.g:3713:2: iv_ruletype= ruletype EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletype=ruletype();

            state._fsp--;

             current =iv_ruletype; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype"


    // $ANTLR start "ruletype"
    // InternalDemoFkd.g:3719:1: ruletype returns [EObject current=null] : ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) ) ;
    public final EObject ruletype() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_0_0 = null;

        EObject lv_structured_1_0 = null;

        EObject lv_pointer_2_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:3725:2: ( ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) ) )
            // InternalDemoFkd.g:3726:2: ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) )
            {
            // InternalDemoFkd.g:3726:2: ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) )
            int alt50=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_INTEGER_NUMBER:
            case RULE_ADDITION_OPERATOR:
            case RULE_STRING:
            case RULE_REAL_NUMBER:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_NUMERIC_SUBRANGE:
            case 30:
            case 48:
            case 49:
            case 50:
                {
                alt50=1;
                }
                break;
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                {
                alt50=2;
                }
                break;
            case 41:
                {
                alt50=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalDemoFkd.g:3727:3: ( (lv_simple_0_0= rulesimple_type ) )
                    {
                    // InternalDemoFkd.g:3727:3: ( (lv_simple_0_0= rulesimple_type ) )
                    // InternalDemoFkd.g:3728:4: (lv_simple_0_0= rulesimple_type )
                    {
                    // InternalDemoFkd.g:3728:4: (lv_simple_0_0= rulesimple_type )
                    // InternalDemoFkd.g:3729:5: lv_simple_0_0= rulesimple_type
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getSimpleSimple_typeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_simple_0_0=rulesimple_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"simple",
                    						lv_simple_0_0,
                    						"org.xtext.pascal.program.DemoFkd.simple_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:3747:3: ( (lv_structured_1_0= rulestructured_type ) )
                    {
                    // InternalDemoFkd.g:3747:3: ( (lv_structured_1_0= rulestructured_type ) )
                    // InternalDemoFkd.g:3748:4: (lv_structured_1_0= rulestructured_type )
                    {
                    // InternalDemoFkd.g:3748:4: (lv_structured_1_0= rulestructured_type )
                    // InternalDemoFkd.g:3749:5: lv_structured_1_0= rulestructured_type
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getStructuredStructured_typeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_structured_1_0=rulestructured_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"structured",
                    						lv_structured_1_0,
                    						"org.xtext.pascal.program.DemoFkd.structured_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDemoFkd.g:3767:3: ( (lv_pointer_2_0= rulepointer_type ) )
                    {
                    // InternalDemoFkd.g:3767:3: ( (lv_pointer_2_0= rulepointer_type ) )
                    // InternalDemoFkd.g:3768:4: (lv_pointer_2_0= rulepointer_type )
                    {
                    // InternalDemoFkd.g:3768:4: (lv_pointer_2_0= rulepointer_type )
                    // InternalDemoFkd.g:3769:5: lv_pointer_2_0= rulepointer_type
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getPointerPointer_typeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_pointer_2_0=rulepointer_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"pointer",
                    						lv_pointer_2_0,
                    						"org.xtext.pascal.program.DemoFkd.pointer_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype"


    // $ANTLR start "entryRulesimple_type"
    // InternalDemoFkd.g:3790:1: entryRulesimple_type returns [EObject current=null] : iv_rulesimple_type= rulesimple_type EOF ;
    public final EObject entryRulesimple_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_type = null;


        try {
            // InternalDemoFkd.g:3790:52: (iv_rulesimple_type= rulesimple_type EOF )
            // InternalDemoFkd.g:3791:2: iv_rulesimple_type= rulesimple_type EOF
            {
             newCompositeNode(grammarAccess.getSimple_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesimple_type=rulesimple_type();

            state._fsp--;

             current =iv_rulesimple_type; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesimple_type"


    // $ANTLR start "rulesimple_type"
    // InternalDemoFkd.g:3797:1: rulesimple_type returns [EObject current=null] : ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulesimple_type() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_subrange_0_0 = null;

        EObject lv_enumerated_1_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:3803:2: ( ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalDemoFkd.g:3804:2: ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalDemoFkd.g:3804:2: ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) )
            int alt51=3;
            switch ( input.LA(1) ) {
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_INTEGER_NUMBER:
            case RULE_ADDITION_OPERATOR:
            case RULE_STRING:
            case RULE_REAL_NUMBER:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_NUMERIC_SUBRANGE:
            case 48:
            case 49:
            case 50:
                {
                alt51=1;
                }
                break;
            case RULE_ID:
                {
                int LA51_2 = input.LA(2);

                if ( (LA51_2==69) ) {
                    alt51=1;
                }
                else if ( (LA51_2==EOF||(LA51_2>=31 && LA51_2<=33)||LA51_2==36||LA51_2==40) ) {
                    alt51=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 2, input);

                    throw nvae;
                }
                }
                break;
            case 30:
                {
                alt51=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalDemoFkd.g:3805:3: ( (lv_subrange_0_0= rulesubrange_type ) )
                    {
                    // InternalDemoFkd.g:3805:3: ( (lv_subrange_0_0= rulesubrange_type ) )
                    // InternalDemoFkd.g:3806:4: (lv_subrange_0_0= rulesubrange_type )
                    {
                    // InternalDemoFkd.g:3806:4: (lv_subrange_0_0= rulesubrange_type )
                    // InternalDemoFkd.g:3807:5: lv_subrange_0_0= rulesubrange_type
                    {

                    					newCompositeNode(grammarAccess.getSimple_typeAccess().getSubrangeSubrange_typeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_subrange_0_0=rulesubrange_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_typeRule());
                    					}
                    					set(
                    						current,
                    						"subrange",
                    						lv_subrange_0_0,
                    						"org.xtext.pascal.program.DemoFkd.subrange_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:3825:3: ( (lv_enumerated_1_0= ruleenumerated_type ) )
                    {
                    // InternalDemoFkd.g:3825:3: ( (lv_enumerated_1_0= ruleenumerated_type ) )
                    // InternalDemoFkd.g:3826:4: (lv_enumerated_1_0= ruleenumerated_type )
                    {
                    // InternalDemoFkd.g:3826:4: (lv_enumerated_1_0= ruleenumerated_type )
                    // InternalDemoFkd.g:3827:5: lv_enumerated_1_0= ruleenumerated_type
                    {

                    					newCompositeNode(grammarAccess.getSimple_typeAccess().getEnumeratedEnumerated_typeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_enumerated_1_0=ruleenumerated_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_typeRule());
                    					}
                    					set(
                    						current,
                    						"enumerated",
                    						lv_enumerated_1_0,
                    						"org.xtext.pascal.program.DemoFkd.enumerated_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDemoFkd.g:3845:3: ( (lv_name_2_0= RULE_ID ) )
                    {
                    // InternalDemoFkd.g:3845:3: ( (lv_name_2_0= RULE_ID ) )
                    // InternalDemoFkd.g:3846:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalDemoFkd.g:3846:4: (lv_name_2_0= RULE_ID )
                    // InternalDemoFkd.g:3847:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getSimple_typeAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimple_typeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesimple_type"


    // $ANTLR start "entryRulesubrange_type"
    // InternalDemoFkd.g:3867:1: entryRulesubrange_type returns [EObject current=null] : iv_rulesubrange_type= rulesubrange_type EOF ;
    public final EObject entryRulesubrange_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesubrange_type = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalDemoFkd.g:3869:2: (iv_rulesubrange_type= rulesubrange_type EOF )
            // InternalDemoFkd.g:3870:2: iv_rulesubrange_type= rulesubrange_type EOF
            {
             newCompositeNode(grammarAccess.getSubrange_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesubrange_type=rulesubrange_type();

            state._fsp--;

             current =iv_rulesubrange_type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulesubrange_type"


    // $ANTLR start "rulesubrange_type"
    // InternalDemoFkd.g:3879:1: rulesubrange_type returns [EObject current=null] : ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) ) ;
    public final EObject rulesubrange_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_subrange_3_0=null;
        EObject lv_initialConst_0_0 = null;

        EObject lv_finalConst_2_0 = null;

        EObject lv_const_4_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalDemoFkd.g:3886:2: ( ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) ) )
            // InternalDemoFkd.g:3887:2: ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) )
            {
            // InternalDemoFkd.g:3887:2: ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_ID && LA52_0<=RULE_INTEGER_NUMBER)||LA52_0==RULE_ADDITION_OPERATOR||(LA52_0>=RULE_STRING && LA52_0<=RULE_SIGNED_REAL_NUMBER)||(LA52_0>=48 && LA52_0<=50)) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_NUMERIC_SUBRANGE) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalDemoFkd.g:3888:3: ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) )
                    {
                    // InternalDemoFkd.g:3888:3: ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) )
                    // InternalDemoFkd.g:3889:4: ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) )
                    {
                    // InternalDemoFkd.g:3889:4: ( (lv_initialConst_0_0= ruleconstant ) )
                    // InternalDemoFkd.g:3890:5: (lv_initialConst_0_0= ruleconstant )
                    {
                    // InternalDemoFkd.g:3890:5: (lv_initialConst_0_0= ruleconstant )
                    // InternalDemoFkd.g:3891:6: lv_initialConst_0_0= ruleconstant
                    {

                    						newCompositeNode(grammarAccess.getSubrange_typeAccess().getInitialConstConstantParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_initialConst_0_0=ruleconstant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
                    						}
                    						set(
                    							current,
                    							"initialConst",
                    							lv_initialConst_0_0,
                    							"org.xtext.pascal.program.DemoFkd.constant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,69,FOLLOW_36); 

                    				newLeafNode(otherlv_1, grammarAccess.getSubrange_typeAccess().getFullStopFullStopKeyword_0_1());
                    			
                    // InternalDemoFkd.g:3912:4: ( (lv_finalConst_2_0= ruleconstant ) )
                    // InternalDemoFkd.g:3913:5: (lv_finalConst_2_0= ruleconstant )
                    {
                    // InternalDemoFkd.g:3913:5: (lv_finalConst_2_0= ruleconstant )
                    // InternalDemoFkd.g:3914:6: lv_finalConst_2_0= ruleconstant
                    {

                    						newCompositeNode(grammarAccess.getSubrange_typeAccess().getFinalConstConstantParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_finalConst_2_0=ruleconstant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
                    						}
                    						set(
                    							current,
                    							"finalConst",
                    							lv_finalConst_2_0,
                    							"org.xtext.pascal.program.DemoFkd.constant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:3933:3: ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) )
                    {
                    // InternalDemoFkd.g:3933:3: ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) )
                    // InternalDemoFkd.g:3934:4: ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) )
                    {
                    // InternalDemoFkd.g:3934:4: ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) )
                    // InternalDemoFkd.g:3935:5: (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE )
                    {
                    // InternalDemoFkd.g:3935:5: (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE )
                    // InternalDemoFkd.g:3936:6: lv_subrange_3_0= RULE_NUMERIC_SUBRANGE
                    {
                    lv_subrange_3_0=(Token)match(input,RULE_NUMERIC_SUBRANGE,FOLLOW_36); 

                    						newLeafNode(lv_subrange_3_0, grammarAccess.getSubrange_typeAccess().getSubrangeNUMERIC_SUBRANGETerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSubrange_typeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"subrange",
                    							lv_subrange_3_0,
                    							"org.xtext.pascal.program.DemoFkd.NUMERIC_SUBRANGE");
                    					

                    }


                    }

                    // InternalDemoFkd.g:3952:4: ( (lv_const_4_0= ruleconstant ) )
                    // InternalDemoFkd.g:3953:5: (lv_const_4_0= ruleconstant )
                    {
                    // InternalDemoFkd.g:3953:5: (lv_const_4_0= ruleconstant )
                    // InternalDemoFkd.g:3954:6: lv_const_4_0= ruleconstant
                    {

                    						newCompositeNode(grammarAccess.getSubrange_typeAccess().getConstConstantParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_const_4_0=ruleconstant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
                    						}
                    						set(
                    							current,
                    							"const",
                    							lv_const_4_0,
                    							"org.xtext.pascal.program.DemoFkd.constant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

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
    // $ANTLR end "rulesubrange_type"


    // $ANTLR start "entryRuleenumerated_type"
    // InternalDemoFkd.g:3979:1: entryRuleenumerated_type returns [EObject current=null] : iv_ruleenumerated_type= ruleenumerated_type EOF ;
    public final EObject entryRuleenumerated_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenumerated_type = null;


        try {
            // InternalDemoFkd.g:3979:56: (iv_ruleenumerated_type= ruleenumerated_type EOF )
            // InternalDemoFkd.g:3980:2: iv_ruleenumerated_type= ruleenumerated_type EOF
            {
             newCompositeNode(grammarAccess.getEnumerated_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleenumerated_type=ruleenumerated_type();

            state._fsp--;

             current =iv_ruleenumerated_type; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleenumerated_type"


    // $ANTLR start "ruleenumerated_type"
    // InternalDemoFkd.g:3986:1: ruleenumerated_type returns [EObject current=null] : (otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')' ) ;
    public final EObject ruleenumerated_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifiers_1_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:3992:2: ( (otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')' ) )
            // InternalDemoFkd.g:3993:2: (otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')' )
            {
            // InternalDemoFkd.g:3993:2: (otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')' )
            // InternalDemoFkd.g:3994:3: otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerated_typeAccess().getLeftParenthesisKeyword_0());
            		
            // InternalDemoFkd.g:3998:3: ( (lv_identifiers_1_0= ruleidentifier_list ) )
            // InternalDemoFkd.g:3999:4: (lv_identifiers_1_0= ruleidentifier_list )
            {
            // InternalDemoFkd.g:3999:4: (lv_identifiers_1_0= ruleidentifier_list )
            // InternalDemoFkd.g:4000:5: lv_identifiers_1_0= ruleidentifier_list
            {

            					newCompositeNode(grammarAccess.getEnumerated_typeAccess().getIdentifiersIdentifier_listParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_identifiers_1_0=ruleidentifier_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerated_typeRule());
            					}
            					set(
            						current,
            						"identifiers",
            						lv_identifiers_1_0,
            						"org.xtext.pascal.program.DemoFkd.identifier_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerated_typeAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleenumerated_type"


    // $ANTLR start "entryRulestructured_type"
    // InternalDemoFkd.g:4025:1: entryRulestructured_type returns [EObject current=null] : iv_rulestructured_type= rulestructured_type EOF ;
    public final EObject entryRulestructured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_type = null;


        try {
            // InternalDemoFkd.g:4025:56: (iv_rulestructured_type= rulestructured_type EOF )
            // InternalDemoFkd.g:4026:2: iv_rulestructured_type= rulestructured_type EOF
            {
             newCompositeNode(grammarAccess.getStructured_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestructured_type=rulestructured_type();

            state._fsp--;

             current =iv_rulestructured_type; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestructured_type"


    // $ANTLR start "rulestructured_type"
    // InternalDemoFkd.g:4032:1: rulestructured_type returns [EObject current=null] : ( ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) ) ;
    public final EObject rulestructured_type() throws RecognitionException {
        EObject current = null;

        Token lv_packed_0_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:4038:2: ( ( ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) ) )
            // InternalDemoFkd.g:4039:2: ( ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) )
            {
            // InternalDemoFkd.g:4039:2: ( ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) )
            // InternalDemoFkd.g:4040:3: ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) )
            {
            // InternalDemoFkd.g:4040:3: ( (lv_packed_0_0= 'packed' ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==70) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalDemoFkd.g:4041:4: (lv_packed_0_0= 'packed' )
                    {
                    // InternalDemoFkd.g:4041:4: (lv_packed_0_0= 'packed' )
                    // InternalDemoFkd.g:4042:5: lv_packed_0_0= 'packed'
                    {
                    lv_packed_0_0=(Token)match(input,70,FOLLOW_45); 

                    					newLeafNode(lv_packed_0_0, grammarAccess.getStructured_typeAccess().getPackedPackedKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStructured_typeRule());
                    					}
                    					setWithLastConsumed(current, "packed", lv_packed_0_0 != null, "packed");
                    				

                    }


                    }
                    break;

            }

            // InternalDemoFkd.g:4054:3: ( (lv_type_1_0= ruleunpacked_structured_type ) )
            // InternalDemoFkd.g:4055:4: (lv_type_1_0= ruleunpacked_structured_type )
            {
            // InternalDemoFkd.g:4055:4: (lv_type_1_0= ruleunpacked_structured_type )
            // InternalDemoFkd.g:4056:5: lv_type_1_0= ruleunpacked_structured_type
            {

            					newCompositeNode(grammarAccess.getStructured_typeAccess().getTypeUnpacked_structured_typeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleunpacked_structured_type();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStructured_typeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.pascal.program.DemoFkd.unpacked_structured_type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestructured_type"


    // $ANTLR start "entryRuleunpacked_structured_type"
    // InternalDemoFkd.g:4077:1: entryRuleunpacked_structured_type returns [EObject current=null] : iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF ;
    public final EObject entryRuleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpacked_structured_type = null;


        try {
            // InternalDemoFkd.g:4077:65: (iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF )
            // InternalDemoFkd.g:4078:2: iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF
            {
             newCompositeNode(grammarAccess.getUnpacked_structured_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunpacked_structured_type=ruleunpacked_structured_type();

            state._fsp--;

             current =iv_ruleunpacked_structured_type; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunpacked_structured_type"


    // $ANTLR start "ruleunpacked_structured_type"
    // InternalDemoFkd.g:4084:1: ruleunpacked_structured_type returns [EObject current=null] : ( ( (lv_array_0_0= rulearray_type ) ) | ( (lv_dynamic_1_0= ruledynamic_array_type ) ) | ( (lv_record_2_0= rulerecord_type ) ) | ( (lv_set_3_0= ruleset_type ) ) | ( (lv_file_4_0= rulefile_type ) ) | ( (lv_class_5_0= ruleclass_type ) ) ) ;
    public final EObject ruleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject lv_array_0_0 = null;

        EObject lv_dynamic_1_0 = null;

        EObject lv_record_2_0 = null;

        EObject lv_set_3_0 = null;

        EObject lv_file_4_0 = null;

        EObject lv_class_5_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:4090:2: ( ( ( (lv_array_0_0= rulearray_type ) ) | ( (lv_dynamic_1_0= ruledynamic_array_type ) ) | ( (lv_record_2_0= rulerecord_type ) ) | ( (lv_set_3_0= ruleset_type ) ) | ( (lv_file_4_0= rulefile_type ) ) | ( (lv_class_5_0= ruleclass_type ) ) ) )
            // InternalDemoFkd.g:4091:2: ( ( (lv_array_0_0= rulearray_type ) ) | ( (lv_dynamic_1_0= ruledynamic_array_type ) ) | ( (lv_record_2_0= rulerecord_type ) ) | ( (lv_set_3_0= ruleset_type ) ) | ( (lv_file_4_0= rulefile_type ) ) | ( (lv_class_5_0= ruleclass_type ) ) )
            {
            // InternalDemoFkd.g:4091:2: ( ( (lv_array_0_0= rulearray_type ) ) | ( (lv_dynamic_1_0= ruledynamic_array_type ) ) | ( (lv_record_2_0= rulerecord_type ) ) | ( (lv_set_3_0= ruleset_type ) ) | ( (lv_file_4_0= rulefile_type ) ) | ( (lv_class_5_0= ruleclass_type ) ) )
            int alt54=6;
            switch ( input.LA(1) ) {
            case 71:
                {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==63) ) {
                    alt54=2;
                }
                else if ( (LA54_1==39) ) {
                    alt54=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }
                }
                break;
            case 72:
                {
                alt54=3;
                }
                break;
            case 74:
                {
                alt54=4;
                }
                break;
            case 75:
                {
                alt54=5;
                }
                break;
            case 73:
                {
                alt54=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalDemoFkd.g:4092:3: ( (lv_array_0_0= rulearray_type ) )
                    {
                    // InternalDemoFkd.g:4092:3: ( (lv_array_0_0= rulearray_type ) )
                    // InternalDemoFkd.g:4093:4: (lv_array_0_0= rulearray_type )
                    {
                    // InternalDemoFkd.g:4093:4: (lv_array_0_0= rulearray_type )
                    // InternalDemoFkd.g:4094:5: lv_array_0_0= rulearray_type
                    {

                    					newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getArrayArray_typeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_array_0_0=rulearray_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    					}
                    					set(
                    						current,
                    						"array",
                    						lv_array_0_0,
                    						"org.xtext.pascal.program.DemoFkd.array_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:4112:3: ( (lv_dynamic_1_0= ruledynamic_array_type ) )
                    {
                    // InternalDemoFkd.g:4112:3: ( (lv_dynamic_1_0= ruledynamic_array_type ) )
                    // InternalDemoFkd.g:4113:4: (lv_dynamic_1_0= ruledynamic_array_type )
                    {
                    // InternalDemoFkd.g:4113:4: (lv_dynamic_1_0= ruledynamic_array_type )
                    // InternalDemoFkd.g:4114:5: lv_dynamic_1_0= ruledynamic_array_type
                    {

                    					newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getDynamicDynamic_array_typeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_dynamic_1_0=ruledynamic_array_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    					}
                    					set(
                    						current,
                    						"dynamic",
                    						lv_dynamic_1_0,
                    						"org.xtext.pascal.program.DemoFkd.dynamic_array_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDemoFkd.g:4132:3: ( (lv_record_2_0= rulerecord_type ) )
                    {
                    // InternalDemoFkd.g:4132:3: ( (lv_record_2_0= rulerecord_type ) )
                    // InternalDemoFkd.g:4133:4: (lv_record_2_0= rulerecord_type )
                    {
                    // InternalDemoFkd.g:4133:4: (lv_record_2_0= rulerecord_type )
                    // InternalDemoFkd.g:4134:5: lv_record_2_0= rulerecord_type
                    {

                    					newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getRecordRecord_typeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_record_2_0=rulerecord_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    					}
                    					set(
                    						current,
                    						"record",
                    						lv_record_2_0,
                    						"org.xtext.pascal.program.DemoFkd.record_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDemoFkd.g:4152:3: ( (lv_set_3_0= ruleset_type ) )
                    {
                    // InternalDemoFkd.g:4152:3: ( (lv_set_3_0= ruleset_type ) )
                    // InternalDemoFkd.g:4153:4: (lv_set_3_0= ruleset_type )
                    {
                    // InternalDemoFkd.g:4153:4: (lv_set_3_0= ruleset_type )
                    // InternalDemoFkd.g:4154:5: lv_set_3_0= ruleset_type
                    {

                    					newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getSetSet_typeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_set_3_0=ruleset_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    					}
                    					set(
                    						current,
                    						"set",
                    						lv_set_3_0,
                    						"org.xtext.pascal.program.DemoFkd.set_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDemoFkd.g:4172:3: ( (lv_file_4_0= rulefile_type ) )
                    {
                    // InternalDemoFkd.g:4172:3: ( (lv_file_4_0= rulefile_type ) )
                    // InternalDemoFkd.g:4173:4: (lv_file_4_0= rulefile_type )
                    {
                    // InternalDemoFkd.g:4173:4: (lv_file_4_0= rulefile_type )
                    // InternalDemoFkd.g:4174:5: lv_file_4_0= rulefile_type
                    {

                    					newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getFileFile_typeParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_file_4_0=rulefile_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    					}
                    					set(
                    						current,
                    						"file",
                    						lv_file_4_0,
                    						"org.xtext.pascal.program.DemoFkd.file_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalDemoFkd.g:4192:3: ( (lv_class_5_0= ruleclass_type ) )
                    {
                    // InternalDemoFkd.g:4192:3: ( (lv_class_5_0= ruleclass_type ) )
                    // InternalDemoFkd.g:4193:4: (lv_class_5_0= ruleclass_type )
                    {
                    // InternalDemoFkd.g:4193:4: (lv_class_5_0= ruleclass_type )
                    // InternalDemoFkd.g:4194:5: lv_class_5_0= ruleclass_type
                    {

                    					newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getClassClass_typeParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_class_5_0=ruleclass_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    					}
                    					set(
                    						current,
                    						"class",
                    						lv_class_5_0,
                    						"org.xtext.pascal.program.DemoFkd.class_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunpacked_structured_type"


    // $ANTLR start "entryRulearray_type"
    // InternalDemoFkd.g:4215:1: entryRulearray_type returns [EObject current=null] : iv_rulearray_type= rulearray_type EOF ;
    public final EObject entryRulearray_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearray_type = null;


        try {
            // InternalDemoFkd.g:4215:51: (iv_rulearray_type= rulearray_type EOF )
            // InternalDemoFkd.g:4216:2: iv_rulearray_type= rulearray_type EOF
            {
             newCompositeNode(grammarAccess.getArray_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulearray_type=rulearray_type();

            state._fsp--;

             current =iv_rulearray_type; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulearray_type"


    // $ANTLR start "rulearray_type"
    // InternalDemoFkd.g:4222:1: rulearray_type returns [EObject current=null] : (otherlv_0= 'array' otherlv_1= '[' ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruletype ) ) ) ;
    public final EObject rulearray_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_indexes_2_0 = null;

        EObject lv_indexes_4_0 = null;

        EObject lv_type_7_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:4228:2: ( (otherlv_0= 'array' otherlv_1= '[' ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruletype ) ) ) )
            // InternalDemoFkd.g:4229:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruletype ) ) )
            {
            // InternalDemoFkd.g:4229:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruletype ) ) )
            // InternalDemoFkd.g:4230:3: otherlv_0= 'array' otherlv_1= '[' ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getArray_typeAccess().getArrayKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getArray_typeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalDemoFkd.g:4238:3: ( (lv_indexes_2_0= ruleindex_type ) )
            // InternalDemoFkd.g:4239:4: (lv_indexes_2_0= ruleindex_type )
            {
            // InternalDemoFkd.g:4239:4: (lv_indexes_2_0= ruleindex_type )
            // InternalDemoFkd.g:4240:5: lv_indexes_2_0= ruleindex_type
            {

            					newCompositeNode(grammarAccess.getArray_typeAccess().getIndexesIndex_typeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_48);
            lv_indexes_2_0=ruleindex_type();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArray_typeRule());
            					}
            					add(
            						current,
            						"indexes",
            						lv_indexes_2_0,
            						"org.xtext.pascal.program.DemoFkd.index_type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDemoFkd.g:4257:3: (otherlv_3= ',' ( (lv_indexes_4_0= ruleindex_type ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==33) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalDemoFkd.g:4258:4: otherlv_3= ',' ( (lv_indexes_4_0= ruleindex_type ) )
            	    {
            	    otherlv_3=(Token)match(input,33,FOLLOW_47); 

            	    				newLeafNode(otherlv_3, grammarAccess.getArray_typeAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalDemoFkd.g:4262:4: ( (lv_indexes_4_0= ruleindex_type ) )
            	    // InternalDemoFkd.g:4263:5: (lv_indexes_4_0= ruleindex_type )
            	    {
            	    // InternalDemoFkd.g:4263:5: (lv_indexes_4_0= ruleindex_type )
            	    // InternalDemoFkd.g:4264:6: lv_indexes_4_0= ruleindex_type
            	    {

            	    						newCompositeNode(grammarAccess.getArray_typeAccess().getIndexesIndex_typeParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_48);
            	    lv_indexes_4_0=ruleindex_type();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getArray_typeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"indexes",
            	    							lv_indexes_4_0,
            	    							"org.xtext.pascal.program.DemoFkd.index_type");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            otherlv_5=(Token)match(input,40,FOLLOW_35); 

            			newLeafNode(otherlv_5, grammarAccess.getArray_typeAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_6=(Token)match(input,63,FOLLOW_43); 

            			newLeafNode(otherlv_6, grammarAccess.getArray_typeAccess().getOfKeyword_5());
            		
            // InternalDemoFkd.g:4290:3: ( (lv_type_7_0= ruletype ) )
            // InternalDemoFkd.g:4291:4: (lv_type_7_0= ruletype )
            {
            // InternalDemoFkd.g:4291:4: (lv_type_7_0= ruletype )
            // InternalDemoFkd.g:4292:5: lv_type_7_0= ruletype
            {

            					newCompositeNode(grammarAccess.getArray_typeAccess().getTypeTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_7_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArray_typeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_7_0,
            						"org.xtext.pascal.program.DemoFkd.type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulearray_type"


    // $ANTLR start "entryRuledynamic_array_type"
    // InternalDemoFkd.g:4313:1: entryRuledynamic_array_type returns [EObject current=null] : iv_ruledynamic_array_type= ruledynamic_array_type EOF ;
    public final EObject entryRuledynamic_array_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledynamic_array_type = null;


        try {
            // InternalDemoFkd.g:4313:59: (iv_ruledynamic_array_type= ruledynamic_array_type EOF )
            // InternalDemoFkd.g:4314:2: iv_ruledynamic_array_type= ruledynamic_array_type EOF
            {
             newCompositeNode(grammarAccess.getDynamic_array_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruledynamic_array_type=ruledynamic_array_type();

            state._fsp--;

             current =iv_ruledynamic_array_type; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledynamic_array_type"


    // $ANTLR start "ruledynamic_array_type"
    // InternalDemoFkd.g:4320:1: ruledynamic_array_type returns [EObject current=null] : (otherlv_0= 'array' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruledynamic_array_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:4326:2: ( (otherlv_0= 'array' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalDemoFkd.g:4327:2: (otherlv_0= 'array' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalDemoFkd.g:4327:2: (otherlv_0= 'array' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) )
            // InternalDemoFkd.g:4328:3: otherlv_0= 'array' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getDynamic_array_typeAccess().getArrayKeyword_0());
            		
            otherlv_1=(Token)match(input,63,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getDynamic_array_typeAccess().getOfKeyword_1());
            		
            // InternalDemoFkd.g:4336:3: ( (lv_type_2_0= ruletype ) )
            // InternalDemoFkd.g:4337:4: (lv_type_2_0= ruletype )
            {
            // InternalDemoFkd.g:4337:4: (lv_type_2_0= ruletype )
            // InternalDemoFkd.g:4338:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getDynamic_array_typeAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDynamic_array_typeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.pascal.program.DemoFkd.type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledynamic_array_type"


    // $ANTLR start "entryRuleindex_type"
    // InternalDemoFkd.g:4359:1: entryRuleindex_type returns [EObject current=null] : iv_ruleindex_type= ruleindex_type EOF ;
    public final EObject entryRuleindex_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleindex_type = null;


        try {
            // InternalDemoFkd.g:4359:51: (iv_ruleindex_type= ruleindex_type EOF )
            // InternalDemoFkd.g:4360:2: iv_ruleindex_type= ruleindex_type EOF
            {
             newCompositeNode(grammarAccess.getIndex_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleindex_type=ruleindex_type();

            state._fsp--;

             current =iv_ruleindex_type; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleindex_type"


    // $ANTLR start "ruleindex_type"
    // InternalDemoFkd.g:4366:1: ruleindex_type returns [EObject current=null] : ( (lv_type_0_0= rulesimple_type ) ) ;
    public final EObject ruleindex_type() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:4372:2: ( ( (lv_type_0_0= rulesimple_type ) ) )
            // InternalDemoFkd.g:4373:2: ( (lv_type_0_0= rulesimple_type ) )
            {
            // InternalDemoFkd.g:4373:2: ( (lv_type_0_0= rulesimple_type ) )
            // InternalDemoFkd.g:4374:3: (lv_type_0_0= rulesimple_type )
            {
            // InternalDemoFkd.g:4374:3: (lv_type_0_0= rulesimple_type )
            // InternalDemoFkd.g:4375:4: lv_type_0_0= rulesimple_type
            {

            				newCompositeNode(grammarAccess.getIndex_typeAccess().getTypeSimple_typeParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_type_0_0=rulesimple_type();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getIndex_typeRule());
            				}
            				set(
            					current,
            					"type",
            					lv_type_0_0,
            					"org.xtext.pascal.program.DemoFkd.simple_type");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleindex_type"


    // $ANTLR start "entryRulerecord_type"
    // InternalDemoFkd.g:4395:1: entryRulerecord_type returns [EObject current=null] : iv_rulerecord_type= rulerecord_type EOF ;
    public final EObject entryRulerecord_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecord_type = null;


        try {
            // InternalDemoFkd.g:4395:52: (iv_rulerecord_type= rulerecord_type EOF )
            // InternalDemoFkd.g:4396:2: iv_rulerecord_type= rulerecord_type EOF
            {
             newCompositeNode(grammarAccess.getRecord_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerecord_type=rulerecord_type();

            state._fsp--;

             current =iv_rulerecord_type; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerecord_type"


    // $ANTLR start "rulerecord_type"
    // InternalDemoFkd.g:4402:1: rulerecord_type returns [EObject current=null] : ( ( (lv_recordKeyword_0_0= 'record' ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= 'end' ) ) ) ;
    public final EObject rulerecord_type() throws RecognitionException {
        EObject current = null;

        Token lv_recordKeyword_0_0=null;
        Token lv_endKeyword_2_0=null;
        EObject lv_fields_1_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:4408:2: ( ( ( (lv_recordKeyword_0_0= 'record' ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= 'end' ) ) ) )
            // InternalDemoFkd.g:4409:2: ( ( (lv_recordKeyword_0_0= 'record' ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= 'end' ) ) )
            {
            // InternalDemoFkd.g:4409:2: ( ( (lv_recordKeyword_0_0= 'record' ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= 'end' ) ) )
            // InternalDemoFkd.g:4410:3: ( (lv_recordKeyword_0_0= 'record' ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= 'end' ) )
            {
            // InternalDemoFkd.g:4410:3: ( (lv_recordKeyword_0_0= 'record' ) )
            // InternalDemoFkd.g:4411:4: (lv_recordKeyword_0_0= 'record' )
            {
            // InternalDemoFkd.g:4411:4: (lv_recordKeyword_0_0= 'record' )
            // InternalDemoFkd.g:4412:5: lv_recordKeyword_0_0= 'record'
            {
            lv_recordKeyword_0_0=(Token)match(input,72,FOLLOW_49); 

            					newLeafNode(lv_recordKeyword_0_0, grammarAccess.getRecord_typeAccess().getRecordKeywordRecordKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecord_typeRule());
            					}
            					setWithLastConsumed(current, "recordKeyword", lv_recordKeyword_0_0, "record");
            				

            }


            }

            // InternalDemoFkd.g:4424:3: ( (lv_fields_1_0= rulefield_list ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID||LA56_0==62) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalDemoFkd.g:4425:4: (lv_fields_1_0= rulefield_list )
                    {
                    // InternalDemoFkd.g:4425:4: (lv_fields_1_0= rulefield_list )
                    // InternalDemoFkd.g:4426:5: lv_fields_1_0= rulefield_list
                    {

                    					newCompositeNode(grammarAccess.getRecord_typeAccess().getFieldsField_listParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_fields_1_0=rulefield_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRecord_typeRule());
                    					}
                    					set(
                    						current,
                    						"fields",
                    						lv_fields_1_0,
                    						"org.xtext.pascal.program.DemoFkd.field_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDemoFkd.g:4443:3: ( (lv_endKeyword_2_0= 'end' ) )
            // InternalDemoFkd.g:4444:4: (lv_endKeyword_2_0= 'end' )
            {
            // InternalDemoFkd.g:4444:4: (lv_endKeyword_2_0= 'end' )
            // InternalDemoFkd.g:4445:5: lv_endKeyword_2_0= 'end'
            {
            lv_endKeyword_2_0=(Token)match(input,36,FOLLOW_2); 

            					newLeafNode(lv_endKeyword_2_0, grammarAccess.getRecord_typeAccess().getEndKeywordEndKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecord_typeRule());
            					}
            					setWithLastConsumed(current, "endKeyword", lv_endKeyword_2_0, "end");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerecord_type"


    // $ANTLR start "entryRuleclass_type"
    // InternalDemoFkd.g:4461:1: entryRuleclass_type returns [EObject current=null] : iv_ruleclass_type= ruleclass_type EOF ;
    public final EObject entryRuleclass_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleclass_type = null;


        try {
            // InternalDemoFkd.g:4461:51: (iv_ruleclass_type= ruleclass_type EOF )
            // InternalDemoFkd.g:4462:2: iv_ruleclass_type= ruleclass_type EOF
            {
             newCompositeNode(grammarAccess.getClass_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleclass_type=ruleclass_type();

            state._fsp--;

             current =iv_ruleclass_type; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleclass_type"


    // $ANTLR start "ruleclass_type"
    // InternalDemoFkd.g:4468:1: ruleclass_type returns [EObject current=null] : ( ( (lv_classKeyword_0_0= 'class' ) ) ( (lv_members_1_0= rulemember_list ) )? ( (lv_endKeyword_2_0= 'end' ) ) ) ;
    public final EObject ruleclass_type() throws RecognitionException {
        EObject current = null;

        Token lv_classKeyword_0_0=null;
        Token lv_endKeyword_2_0=null;
        EObject lv_members_1_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:4474:2: ( ( ( (lv_classKeyword_0_0= 'class' ) ) ( (lv_members_1_0= rulemember_list ) )? ( (lv_endKeyword_2_0= 'end' ) ) ) )
            // InternalDemoFkd.g:4475:2: ( ( (lv_classKeyword_0_0= 'class' ) ) ( (lv_members_1_0= rulemember_list ) )? ( (lv_endKeyword_2_0= 'end' ) ) )
            {
            // InternalDemoFkd.g:4475:2: ( ( (lv_classKeyword_0_0= 'class' ) ) ( (lv_members_1_0= rulemember_list ) )? ( (lv_endKeyword_2_0= 'end' ) ) )
            // InternalDemoFkd.g:4476:3: ( (lv_classKeyword_0_0= 'class' ) ) ( (lv_members_1_0= rulemember_list ) )? ( (lv_endKeyword_2_0= 'end' ) )
            {
            // InternalDemoFkd.g:4476:3: ( (lv_classKeyword_0_0= 'class' ) )
            // InternalDemoFkd.g:4477:4: (lv_classKeyword_0_0= 'class' )
            {
            // InternalDemoFkd.g:4477:4: (lv_classKeyword_0_0= 'class' )
            // InternalDemoFkd.g:4478:5: lv_classKeyword_0_0= 'class'
            {
            lv_classKeyword_0_0=(Token)match(input,73,FOLLOW_50); 

            					newLeafNode(lv_classKeyword_0_0, grammarAccess.getClass_typeAccess().getClassKeywordClassKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClass_typeRule());
            					}
            					setWithLastConsumed(current, "classKeyword", lv_classKeyword_0_0, "class");
            				

            }


            }

            // InternalDemoFkd.g:4490:3: ( (lv_members_1_0= rulemember_list ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_VISIBILITY_SUPPORTED) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalDemoFkd.g:4491:4: (lv_members_1_0= rulemember_list )
                    {
                    // InternalDemoFkd.g:4491:4: (lv_members_1_0= rulemember_list )
                    // InternalDemoFkd.g:4492:5: lv_members_1_0= rulemember_list
                    {

                    					newCompositeNode(grammarAccess.getClass_typeAccess().getMembersMember_listParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_members_1_0=rulemember_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClass_typeRule());
                    					}
                    					set(
                    						current,
                    						"members",
                    						lv_members_1_0,
                    						"org.xtext.pascal.program.DemoFkd.member_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDemoFkd.g:4509:3: ( (lv_endKeyword_2_0= 'end' ) )
            // InternalDemoFkd.g:4510:4: (lv_endKeyword_2_0= 'end' )
            {
            // InternalDemoFkd.g:4510:4: (lv_endKeyword_2_0= 'end' )
            // InternalDemoFkd.g:4511:5: lv_endKeyword_2_0= 'end'
            {
            lv_endKeyword_2_0=(Token)match(input,36,FOLLOW_2); 

            					newLeafNode(lv_endKeyword_2_0, grammarAccess.getClass_typeAccess().getEndKeywordEndKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClass_typeRule());
            					}
            					setWithLastConsumed(current, "endKeyword", lv_endKeyword_2_0, "end");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleclass_type"


    // $ANTLR start "entryRulemember_list"
    // InternalDemoFkd.g:4527:1: entryRulemember_list returns [EObject current=null] : iv_rulemember_list= rulemember_list EOF ;
    public final EObject entryRulemember_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemember_list = null;


        try {
            // InternalDemoFkd.g:4527:52: (iv_rulemember_list= rulemember_list EOF )
            // InternalDemoFkd.g:4528:2: iv_rulemember_list= rulemember_list EOF
            {
             newCompositeNode(grammarAccess.getMember_listRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemember_list=rulemember_list();

            state._fsp--;

             current =iv_rulemember_list; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemember_list"


    // $ANTLR start "rulemember_list"
    // InternalDemoFkd.g:4534:1: rulemember_list returns [EObject current=null] : ( ( (this_properties_part_0= ruleproperties_part (otherlv_1= ';' ( (lv_methods_2_0= rulemethod_part ) ) )? ) | ( (lv_methods_3_0= rulemethod_part ) ) ) (otherlv_4= ';' )? ) ;
    public final EObject rulemember_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_properties_part_0 = null;

        EObject lv_methods_2_0 = null;

        EObject lv_methods_3_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:4540:2: ( ( ( (this_properties_part_0= ruleproperties_part (otherlv_1= ';' ( (lv_methods_2_0= rulemethod_part ) ) )? ) | ( (lv_methods_3_0= rulemethod_part ) ) ) (otherlv_4= ';' )? ) )
            // InternalDemoFkd.g:4541:2: ( ( (this_properties_part_0= ruleproperties_part (otherlv_1= ';' ( (lv_methods_2_0= rulemethod_part ) ) )? ) | ( (lv_methods_3_0= rulemethod_part ) ) ) (otherlv_4= ';' )? )
            {
            // InternalDemoFkd.g:4541:2: ( ( (this_properties_part_0= ruleproperties_part (otherlv_1= ';' ( (lv_methods_2_0= rulemethod_part ) ) )? ) | ( (lv_methods_3_0= rulemethod_part ) ) ) (otherlv_4= ';' )? )
            // InternalDemoFkd.g:4542:3: ( (this_properties_part_0= ruleproperties_part (otherlv_1= ';' ( (lv_methods_2_0= rulemethod_part ) ) )? ) | ( (lv_methods_3_0= rulemethod_part ) ) ) (otherlv_4= ';' )?
            {
            // InternalDemoFkd.g:4542:3: ( (this_properties_part_0= ruleproperties_part (otherlv_1= ';' ( (lv_methods_2_0= rulemethod_part ) ) )? ) | ( (lv_methods_3_0= rulemethod_part ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_VISIBILITY_SUPPORTED) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==RULE_ID) ) {
                    alt59=1;
                }
                else if ( ((LA59_1>=78 && LA59_1<=79)) ) {
                    alt59=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalDemoFkd.g:4543:4: (this_properties_part_0= ruleproperties_part (otherlv_1= ';' ( (lv_methods_2_0= rulemethod_part ) ) )? )
                    {
                    // InternalDemoFkd.g:4543:4: (this_properties_part_0= ruleproperties_part (otherlv_1= ';' ( (lv_methods_2_0= rulemethod_part ) ) )? )
                    // InternalDemoFkd.g:4544:5: this_properties_part_0= ruleproperties_part (otherlv_1= ';' ( (lv_methods_2_0= rulemethod_part ) ) )?
                    {

                    					newCompositeNode(grammarAccess.getMember_listAccess().getProperties_partParserRuleCall_0_0_0());
                    				
                    pushFollow(FOLLOW_18);
                    this_properties_part_0=ruleproperties_part();

                    state._fsp--;


                    					current = this_properties_part_0;
                    					afterParserOrEnumRuleCall();
                    				
                    // InternalDemoFkd.g:4552:5: (otherlv_1= ';' ( (lv_methods_2_0= rulemethod_part ) ) )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==32) ) {
                        int LA58_1 = input.LA(2);

                        if ( (LA58_1==RULE_VISIBILITY_SUPPORTED) ) {
                            alt58=1;
                        }
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalDemoFkd.g:4553:6: otherlv_1= ';' ( (lv_methods_2_0= rulemethod_part ) )
                            {
                            otherlv_1=(Token)match(input,32,FOLLOW_51); 

                            						newLeafNode(otherlv_1, grammarAccess.getMember_listAccess().getSemicolonKeyword_0_0_1_0());
                            					
                            // InternalDemoFkd.g:4557:6: ( (lv_methods_2_0= rulemethod_part ) )
                            // InternalDemoFkd.g:4558:7: (lv_methods_2_0= rulemethod_part )
                            {
                            // InternalDemoFkd.g:4558:7: (lv_methods_2_0= rulemethod_part )
                            // InternalDemoFkd.g:4559:8: lv_methods_2_0= rulemethod_part
                            {

                            								newCompositeNode(grammarAccess.getMember_listAccess().getMethodsMethod_partParserRuleCall_0_0_1_1_0());
                            							
                            pushFollow(FOLLOW_18);
                            lv_methods_2_0=rulemethod_part();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getMember_listRule());
                            								}
                            								add(
                            									current,
                            									"methods",
                            									lv_methods_2_0,
                            									"org.xtext.pascal.program.DemoFkd.method_part");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:4579:4: ( (lv_methods_3_0= rulemethod_part ) )
                    {
                    // InternalDemoFkd.g:4579:4: ( (lv_methods_3_0= rulemethod_part ) )
                    // InternalDemoFkd.g:4580:5: (lv_methods_3_0= rulemethod_part )
                    {
                    // InternalDemoFkd.g:4580:5: (lv_methods_3_0= rulemethod_part )
                    // InternalDemoFkd.g:4581:6: lv_methods_3_0= rulemethod_part
                    {

                    						newCompositeNode(grammarAccess.getMember_listAccess().getMethodsMethod_partParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_methods_3_0=rulemethod_part();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMember_listRule());
                    						}
                    						add(
                    							current,
                    							"methods",
                    							lv_methods_3_0,
                    							"org.xtext.pascal.program.DemoFkd.method_part");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDemoFkd.g:4599:3: (otherlv_4= ';' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==32) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalDemoFkd.g:4600:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getMember_listAccess().getSemicolonKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemember_list"


    // $ANTLR start "entryRuleproperties_part"
    // InternalDemoFkd.g:4609:1: entryRuleproperties_part returns [EObject current=null] : iv_ruleproperties_part= ruleproperties_part EOF ;
    public final EObject entryRuleproperties_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleproperties_part = null;


        try {
            // InternalDemoFkd.g:4609:56: (iv_ruleproperties_part= ruleproperties_part EOF )
            // InternalDemoFkd.g:4610:2: iv_ruleproperties_part= ruleproperties_part EOF
            {
             newCompositeNode(grammarAccess.getProperties_partRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleproperties_part=ruleproperties_part();

            state._fsp--;

             current =iv_ruleproperties_part; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleproperties_part"


    // $ANTLR start "ruleproperties_part"
    // InternalDemoFkd.g:4616:1: ruleproperties_part returns [EObject current=null] : ( ( (lv_visibility_0_0= RULE_VISIBILITY_SUPPORTED ) ) ( (lv_sections_1_0= ruleproperty_section ) ) (otherlv_2= ';' ( (lv_sections_3_0= ruleproperty_section ) ) )* ) ;
    public final EObject ruleproperties_part() throws RecognitionException {
        EObject current = null;

        Token lv_visibility_0_0=null;
        Token otherlv_2=null;
        EObject lv_sections_1_0 = null;

        EObject lv_sections_3_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:4622:2: ( ( ( (lv_visibility_0_0= RULE_VISIBILITY_SUPPORTED ) ) ( (lv_sections_1_0= ruleproperty_section ) ) (otherlv_2= ';' ( (lv_sections_3_0= ruleproperty_section ) ) )* ) )
            // InternalDemoFkd.g:4623:2: ( ( (lv_visibility_0_0= RULE_VISIBILITY_SUPPORTED ) ) ( (lv_sections_1_0= ruleproperty_section ) ) (otherlv_2= ';' ( (lv_sections_3_0= ruleproperty_section ) ) )* )
            {
            // InternalDemoFkd.g:4623:2: ( ( (lv_visibility_0_0= RULE_VISIBILITY_SUPPORTED ) ) ( (lv_sections_1_0= ruleproperty_section ) ) (otherlv_2= ';' ( (lv_sections_3_0= ruleproperty_section ) ) )* )
            // InternalDemoFkd.g:4624:3: ( (lv_visibility_0_0= RULE_VISIBILITY_SUPPORTED ) ) ( (lv_sections_1_0= ruleproperty_section ) ) (otherlv_2= ';' ( (lv_sections_3_0= ruleproperty_section ) ) )*
            {
            // InternalDemoFkd.g:4624:3: ( (lv_visibility_0_0= RULE_VISIBILITY_SUPPORTED ) )
            // InternalDemoFkd.g:4625:4: (lv_visibility_0_0= RULE_VISIBILITY_SUPPORTED )
            {
            // InternalDemoFkd.g:4625:4: (lv_visibility_0_0= RULE_VISIBILITY_SUPPORTED )
            // InternalDemoFkd.g:4626:5: lv_visibility_0_0= RULE_VISIBILITY_SUPPORTED
            {
            lv_visibility_0_0=(Token)match(input,RULE_VISIBILITY_SUPPORTED,FOLLOW_4); 

            					newLeafNode(lv_visibility_0_0, grammarAccess.getProperties_partAccess().getVisibilityVISIBILITY_SUPPORTEDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProperties_partRule());
            					}
            					setWithLastConsumed(
            						current,
            						"visibility",
            						lv_visibility_0_0,
            						"org.xtext.pascal.program.DemoFkd.VISIBILITY_SUPPORTED");
            				

            }


            }

            // InternalDemoFkd.g:4642:3: ( (lv_sections_1_0= ruleproperty_section ) )
            // InternalDemoFkd.g:4643:4: (lv_sections_1_0= ruleproperty_section )
            {
            // InternalDemoFkd.g:4643:4: (lv_sections_1_0= ruleproperty_section )
            // InternalDemoFkd.g:4644:5: lv_sections_1_0= ruleproperty_section
            {

            					newCompositeNode(grammarAccess.getProperties_partAccess().getSectionsProperty_sectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_sections_1_0=ruleproperty_section();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProperties_partRule());
            					}
            					add(
            						current,
            						"sections",
            						lv_sections_1_0,
            						"org.xtext.pascal.program.DemoFkd.property_section");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDemoFkd.g:4661:3: (otherlv_2= ';' ( (lv_sections_3_0= ruleproperty_section ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==32) ) {
                    int LA61_1 = input.LA(2);

                    if ( (LA61_1==RULE_ID) ) {
                        alt61=1;
                    }


                }


                switch (alt61) {
            	case 1 :
            	    // InternalDemoFkd.g:4662:4: otherlv_2= ';' ( (lv_sections_3_0= ruleproperty_section ) )
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getProperties_partAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalDemoFkd.g:4666:4: ( (lv_sections_3_0= ruleproperty_section ) )
            	    // InternalDemoFkd.g:4667:5: (lv_sections_3_0= ruleproperty_section )
            	    {
            	    // InternalDemoFkd.g:4667:5: (lv_sections_3_0= ruleproperty_section )
            	    // InternalDemoFkd.g:4668:6: lv_sections_3_0= ruleproperty_section
            	    {

            	    						newCompositeNode(grammarAccess.getProperties_partAccess().getSectionsProperty_sectionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_sections_3_0=ruleproperty_section();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProperties_partRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sections",
            	    							lv_sections_3_0,
            	    							"org.xtext.pascal.program.DemoFkd.property_section");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleproperties_part"


    // $ANTLR start "entryRuleproperty_section"
    // InternalDemoFkd.g:4690:1: entryRuleproperty_section returns [EObject current=null] : iv_ruleproperty_section= ruleproperty_section EOF ;
    public final EObject entryRuleproperty_section() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleproperty_section = null;


        try {
            // InternalDemoFkd.g:4690:57: (iv_ruleproperty_section= ruleproperty_section EOF )
            // InternalDemoFkd.g:4691:2: iv_ruleproperty_section= ruleproperty_section EOF
            {
             newCompositeNode(grammarAccess.getProperty_sectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleproperty_section=ruleproperty_section();

            state._fsp--;

             current =iv_ruleproperty_section; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleproperty_section"


    // $ANTLR start "ruleproperty_section"
    // InternalDemoFkd.g:4697:1: ruleproperty_section returns [EObject current=null] : ( ( (lv_properties_0_0= ruleproperty_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruleproperty_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_properties_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:4703:2: ( ( ( (lv_properties_0_0= ruleproperty_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalDemoFkd.g:4704:2: ( ( (lv_properties_0_0= ruleproperty_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalDemoFkd.g:4704:2: ( ( (lv_properties_0_0= ruleproperty_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            // InternalDemoFkd.g:4705:3: ( (lv_properties_0_0= ruleproperty_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) )
            {
            // InternalDemoFkd.g:4705:3: ( (lv_properties_0_0= ruleproperty_list ) )
            // InternalDemoFkd.g:4706:4: (lv_properties_0_0= ruleproperty_list )
            {
            // InternalDemoFkd.g:4706:4: (lv_properties_0_0= ruleproperty_list )
            // InternalDemoFkd.g:4707:5: lv_properties_0_0= ruleproperty_list
            {

            					newCompositeNode(grammarAccess.getProperty_sectionAccess().getPropertiesProperty_listParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_properties_0_0=ruleproperty_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProperty_sectionRule());
            					}
            					set(
            						current,
            						"properties",
            						lv_properties_0_0,
            						"org.xtext.pascal.program.DemoFkd.property_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getProperty_sectionAccess().getColonKeyword_1());
            		
            // InternalDemoFkd.g:4728:3: ( (lv_type_2_0= ruletype ) )
            // InternalDemoFkd.g:4729:4: (lv_type_2_0= ruletype )
            {
            // InternalDemoFkd.g:4729:4: (lv_type_2_0= ruletype )
            // InternalDemoFkd.g:4730:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getProperty_sectionAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProperty_sectionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.pascal.program.DemoFkd.type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleproperty_section"


    // $ANTLR start "entryRuleproperty_list"
    // InternalDemoFkd.g:4751:1: entryRuleproperty_list returns [EObject current=null] : iv_ruleproperty_list= ruleproperty_list EOF ;
    public final EObject entryRuleproperty_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleproperty_list = null;


        try {
            // InternalDemoFkd.g:4751:54: (iv_ruleproperty_list= ruleproperty_list EOF )
            // InternalDemoFkd.g:4752:2: iv_ruleproperty_list= ruleproperty_list EOF
            {
             newCompositeNode(grammarAccess.getProperty_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleproperty_list=ruleproperty_list();

            state._fsp--;

             current =iv_ruleproperty_list; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleproperty_list"


    // $ANTLR start "ruleproperty_list"
    // InternalDemoFkd.g:4758:1: ruleproperty_list returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleproperty_list() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;


        	enterRule();

        try {
            // InternalDemoFkd.g:4764:2: ( ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) )
            // InternalDemoFkd.g:4765:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            {
            // InternalDemoFkd.g:4765:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            // InternalDemoFkd.g:4766:3: ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            {
            // InternalDemoFkd.g:4766:3: ( (lv_names_0_0= RULE_ID ) )
            // InternalDemoFkd.g:4767:4: (lv_names_0_0= RULE_ID )
            {
            // InternalDemoFkd.g:4767:4: (lv_names_0_0= RULE_ID )
            // InternalDemoFkd.g:4768:5: lv_names_0_0= RULE_ID
            {
            lv_names_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_names_0_0, grammarAccess.getProperty_listAccess().getNamesIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProperty_listRule());
            					}
            					addWithLastConsumed(
            						current,
            						"names",
            						lv_names_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDemoFkd.g:4784:3: (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==33) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalDemoFkd.g:4785:4: otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getProperty_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalDemoFkd.g:4789:4: ( (lv_names_2_0= RULE_ID ) )
            	    // InternalDemoFkd.g:4790:5: (lv_names_2_0= RULE_ID )
            	    {
            	    // InternalDemoFkd.g:4790:5: (lv_names_2_0= RULE_ID )
            	    // InternalDemoFkd.g:4791:6: lv_names_2_0= RULE_ID
            	    {
            	    lv_names_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    						newLeafNode(lv_names_2_0, grammarAccess.getProperty_listAccess().getNamesIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getProperty_listRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"names",
            	    							lv_names_2_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleproperty_list"


    // $ANTLR start "entryRulemethod_part"
    // InternalDemoFkd.g:4812:1: entryRulemethod_part returns [EObject current=null] : iv_rulemethod_part= rulemethod_part EOF ;
    public final EObject entryRulemethod_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemethod_part = null;


        try {
            // InternalDemoFkd.g:4812:52: (iv_rulemethod_part= rulemethod_part EOF )
            // InternalDemoFkd.g:4813:2: iv_rulemethod_part= rulemethod_part EOF
            {
             newCompositeNode(grammarAccess.getMethod_partRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemethod_part=rulemethod_part();

            state._fsp--;

             current =iv_rulemethod_part; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemethod_part"


    // $ANTLR start "rulemethod_part"
    // InternalDemoFkd.g:4819:1: rulemethod_part returns [EObject current=null] : ( ( (lv_visibility_0_0= RULE_VISIBILITY_SUPPORTED ) ) ( (lv_sections_1_0= rulemethod_section ) ) (otherlv_2= ';' ( (lv_sections_3_0= rulemethod_section ) ) )* ) ;
    public final EObject rulemethod_part() throws RecognitionException {
        EObject current = null;

        Token lv_visibility_0_0=null;
        Token otherlv_2=null;
        EObject lv_sections_1_0 = null;

        EObject lv_sections_3_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:4825:2: ( ( ( (lv_visibility_0_0= RULE_VISIBILITY_SUPPORTED ) ) ( (lv_sections_1_0= rulemethod_section ) ) (otherlv_2= ';' ( (lv_sections_3_0= rulemethod_section ) ) )* ) )
            // InternalDemoFkd.g:4826:2: ( ( (lv_visibility_0_0= RULE_VISIBILITY_SUPPORTED ) ) ( (lv_sections_1_0= rulemethod_section ) ) (otherlv_2= ';' ( (lv_sections_3_0= rulemethod_section ) ) )* )
            {
            // InternalDemoFkd.g:4826:2: ( ( (lv_visibility_0_0= RULE_VISIBILITY_SUPPORTED ) ) ( (lv_sections_1_0= rulemethod_section ) ) (otherlv_2= ';' ( (lv_sections_3_0= rulemethod_section ) ) )* )
            // InternalDemoFkd.g:4827:3: ( (lv_visibility_0_0= RULE_VISIBILITY_SUPPORTED ) ) ( (lv_sections_1_0= rulemethod_section ) ) (otherlv_2= ';' ( (lv_sections_3_0= rulemethod_section ) ) )*
            {
            // InternalDemoFkd.g:4827:3: ( (lv_visibility_0_0= RULE_VISIBILITY_SUPPORTED ) )
            // InternalDemoFkd.g:4828:4: (lv_visibility_0_0= RULE_VISIBILITY_SUPPORTED )
            {
            // InternalDemoFkd.g:4828:4: (lv_visibility_0_0= RULE_VISIBILITY_SUPPORTED )
            // InternalDemoFkd.g:4829:5: lv_visibility_0_0= RULE_VISIBILITY_SUPPORTED
            {
            lv_visibility_0_0=(Token)match(input,RULE_VISIBILITY_SUPPORTED,FOLLOW_52); 

            					newLeafNode(lv_visibility_0_0, grammarAccess.getMethod_partAccess().getVisibilityVISIBILITY_SUPPORTEDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethod_partRule());
            					}
            					setWithLastConsumed(
            						current,
            						"visibility",
            						lv_visibility_0_0,
            						"org.xtext.pascal.program.DemoFkd.VISIBILITY_SUPPORTED");
            				

            }


            }

            // InternalDemoFkd.g:4845:3: ( (lv_sections_1_0= rulemethod_section ) )
            // InternalDemoFkd.g:4846:4: (lv_sections_1_0= rulemethod_section )
            {
            // InternalDemoFkd.g:4846:4: (lv_sections_1_0= rulemethod_section )
            // InternalDemoFkd.g:4847:5: lv_sections_1_0= rulemethod_section
            {

            					newCompositeNode(grammarAccess.getMethod_partAccess().getSectionsMethod_sectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_sections_1_0=rulemethod_section();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethod_partRule());
            					}
            					add(
            						current,
            						"sections",
            						lv_sections_1_0,
            						"org.xtext.pascal.program.DemoFkd.method_section");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDemoFkd.g:4864:3: (otherlv_2= ';' ( (lv_sections_3_0= rulemethod_section ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==32) ) {
                    int LA63_1 = input.LA(2);

                    if ( ((LA63_1>=78 && LA63_1<=79)) ) {
                        alt63=1;
                    }


                }


                switch (alt63) {
            	case 1 :
            	    // InternalDemoFkd.g:4865:4: otherlv_2= ';' ( (lv_sections_3_0= rulemethod_section ) )
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_52); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMethod_partAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalDemoFkd.g:4869:4: ( (lv_sections_3_0= rulemethod_section ) )
            	    // InternalDemoFkd.g:4870:5: (lv_sections_3_0= rulemethod_section )
            	    {
            	    // InternalDemoFkd.g:4870:5: (lv_sections_3_0= rulemethod_section )
            	    // InternalDemoFkd.g:4871:6: lv_sections_3_0= rulemethod_section
            	    {

            	    						newCompositeNode(grammarAccess.getMethod_partAccess().getSectionsMethod_sectionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_sections_3_0=rulemethod_section();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMethod_partRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sections",
            	    							lv_sections_3_0,
            	    							"org.xtext.pascal.program.DemoFkd.method_section");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemethod_part"


    // $ANTLR start "entryRulemethod_section"
    // InternalDemoFkd.g:4893:1: entryRulemethod_section returns [EObject current=null] : iv_rulemethod_section= rulemethod_section EOF ;
    public final EObject entryRulemethod_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemethod_section = null;


        try {
            // InternalDemoFkd.g:4893:55: (iv_rulemethod_section= rulemethod_section EOF )
            // InternalDemoFkd.g:4894:2: iv_rulemethod_section= rulemethod_section EOF
            {
             newCompositeNode(grammarAccess.getMethod_sectionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemethod_section=rulemethod_section();

            state._fsp--;

             current =iv_rulemethod_section; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemethod_section"


    // $ANTLR start "rulemethod_section"
    // InternalDemoFkd.g:4900:1: rulemethod_section returns [EObject current=null] : ( (lv_methods_0_0= ruleabstraction_heading ) ) ;
    public final EObject rulemethod_section() throws RecognitionException {
        EObject current = null;

        EObject lv_methods_0_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:4906:2: ( ( (lv_methods_0_0= ruleabstraction_heading ) ) )
            // InternalDemoFkd.g:4907:2: ( (lv_methods_0_0= ruleabstraction_heading ) )
            {
            // InternalDemoFkd.g:4907:2: ( (lv_methods_0_0= ruleabstraction_heading ) )
            // InternalDemoFkd.g:4908:3: (lv_methods_0_0= ruleabstraction_heading )
            {
            // InternalDemoFkd.g:4908:3: (lv_methods_0_0= ruleabstraction_heading )
            // InternalDemoFkd.g:4909:4: lv_methods_0_0= ruleabstraction_heading
            {

            				newCompositeNode(grammarAccess.getMethod_sectionAccess().getMethodsAbstraction_headingParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_methods_0_0=ruleabstraction_heading();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getMethod_sectionRule());
            				}
            				add(
            					current,
            					"methods",
            					lv_methods_0_0,
            					"org.xtext.pascal.program.DemoFkd.abstraction_heading");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemethod_section"


    // $ANTLR start "entryRulefield_list"
    // InternalDemoFkd.g:4929:1: entryRulefield_list returns [EObject current=null] : iv_rulefield_list= rulefield_list EOF ;
    public final EObject entryRulefield_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefield_list = null;


        try {
            // InternalDemoFkd.g:4929:51: (iv_rulefield_list= rulefield_list EOF )
            // InternalDemoFkd.g:4930:2: iv_rulefield_list= rulefield_list EOF
            {
             newCompositeNode(grammarAccess.getField_listRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefield_list=rulefield_list();

            state._fsp--;

             current =iv_rulefield_list; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefield_list"


    // $ANTLR start "rulefield_list"
    // InternalDemoFkd.g:4936:1: rulefield_list returns [EObject current=null] : ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= ';' )? ) ;
    public final EObject rulefield_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_fixed_0_0 = null;

        EObject lv_variants_2_0 = null;

        EObject lv_variants_3_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:4942:2: ( ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= ';' )? ) )
            // InternalDemoFkd.g:4943:2: ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= ';' )? )
            {
            // InternalDemoFkd.g:4943:2: ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= ';' )? )
            // InternalDemoFkd.g:4944:3: ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= ';' )?
            {
            // InternalDemoFkd.g:4944:3: ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_ID) ) {
                alt65=1;
            }
            else if ( (LA65_0==62) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalDemoFkd.g:4945:4: ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? )
                    {
                    // InternalDemoFkd.g:4945:4: ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? )
                    // InternalDemoFkd.g:4946:5: ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )?
                    {
                    // InternalDemoFkd.g:4946:5: ( (lv_fixed_0_0= rulefixed_part ) )
                    // InternalDemoFkd.g:4947:6: (lv_fixed_0_0= rulefixed_part )
                    {
                    // InternalDemoFkd.g:4947:6: (lv_fixed_0_0= rulefixed_part )
                    // InternalDemoFkd.g:4948:7: lv_fixed_0_0= rulefixed_part
                    {

                    							newCompositeNode(grammarAccess.getField_listAccess().getFixedFixed_partParserRuleCall_0_0_0_0());
                    						
                    pushFollow(FOLLOW_18);
                    lv_fixed_0_0=rulefixed_part();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getField_listRule());
                    							}
                    							set(
                    								current,
                    								"fixed",
                    								lv_fixed_0_0,
                    								"org.xtext.pascal.program.DemoFkd.fixed_part");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalDemoFkd.g:4965:5: (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==32) ) {
                        int LA64_1 = input.LA(2);

                        if ( (LA64_1==62) ) {
                            alt64=1;
                        }
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalDemoFkd.g:4966:6: otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) )
                            {
                            otherlv_1=(Token)match(input,32,FOLLOW_53); 

                            						newLeafNode(otherlv_1, grammarAccess.getField_listAccess().getSemicolonKeyword_0_0_1_0());
                            					
                            // InternalDemoFkd.g:4970:6: ( (lv_variants_2_0= rulevariant_part ) )
                            // InternalDemoFkd.g:4971:7: (lv_variants_2_0= rulevariant_part )
                            {
                            // InternalDemoFkd.g:4971:7: (lv_variants_2_0= rulevariant_part )
                            // InternalDemoFkd.g:4972:8: lv_variants_2_0= rulevariant_part
                            {

                            								newCompositeNode(grammarAccess.getField_listAccess().getVariantsVariant_partParserRuleCall_0_0_1_1_0());
                            							
                            pushFollow(FOLLOW_18);
                            lv_variants_2_0=rulevariant_part();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getField_listRule());
                            								}
                            								add(
                            									current,
                            									"variants",
                            									lv_variants_2_0,
                            									"org.xtext.pascal.program.DemoFkd.variant_part");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:4992:4: ( (lv_variants_3_0= rulevariant_part ) )
                    {
                    // InternalDemoFkd.g:4992:4: ( (lv_variants_3_0= rulevariant_part ) )
                    // InternalDemoFkd.g:4993:5: (lv_variants_3_0= rulevariant_part )
                    {
                    // InternalDemoFkd.g:4993:5: (lv_variants_3_0= rulevariant_part )
                    // InternalDemoFkd.g:4994:6: lv_variants_3_0= rulevariant_part
                    {

                    						newCompositeNode(grammarAccess.getField_listAccess().getVariantsVariant_partParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_variants_3_0=rulevariant_part();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getField_listRule());
                    						}
                    						add(
                    							current,
                    							"variants",
                    							lv_variants_3_0,
                    							"org.xtext.pascal.program.DemoFkd.variant_part");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDemoFkd.g:5012:3: (otherlv_4= ';' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==32) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalDemoFkd.g:5013:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getField_listAccess().getSemicolonKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefield_list"


    // $ANTLR start "entryRulefixed_part"
    // InternalDemoFkd.g:5022:1: entryRulefixed_part returns [EObject current=null] : iv_rulefixed_part= rulefixed_part EOF ;
    public final EObject entryRulefixed_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefixed_part = null;


        try {
            // InternalDemoFkd.g:5022:51: (iv_rulefixed_part= rulefixed_part EOF )
            // InternalDemoFkd.g:5023:2: iv_rulefixed_part= rulefixed_part EOF
            {
             newCompositeNode(grammarAccess.getFixed_partRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefixed_part=rulefixed_part();

            state._fsp--;

             current =iv_rulefixed_part; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefixed_part"


    // $ANTLR start "rulefixed_part"
    // InternalDemoFkd.g:5029:1: rulefixed_part returns [EObject current=null] : ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )* ) ;
    public final EObject rulefixed_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sections_0_0 = null;

        EObject lv_sections_2_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:5035:2: ( ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )* ) )
            // InternalDemoFkd.g:5036:2: ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )* )
            {
            // InternalDemoFkd.g:5036:2: ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )* )
            // InternalDemoFkd.g:5037:3: ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )*
            {
            // InternalDemoFkd.g:5037:3: ( (lv_sections_0_0= rulerecord_section ) )
            // InternalDemoFkd.g:5038:4: (lv_sections_0_0= rulerecord_section )
            {
            // InternalDemoFkd.g:5038:4: (lv_sections_0_0= rulerecord_section )
            // InternalDemoFkd.g:5039:5: lv_sections_0_0= rulerecord_section
            {

            					newCompositeNode(grammarAccess.getFixed_partAccess().getSectionsRecord_sectionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_sections_0_0=rulerecord_section();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFixed_partRule());
            					}
            					add(
            						current,
            						"sections",
            						lv_sections_0_0,
            						"org.xtext.pascal.program.DemoFkd.record_section");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDemoFkd.g:5056:3: (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==32) ) {
                    int LA67_1 = input.LA(2);

                    if ( (LA67_1==RULE_ID) ) {
                        alt67=1;
                    }


                }


                switch (alt67) {
            	case 1 :
            	    // InternalDemoFkd.g:5057:4: otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) )
            	    {
            	    otherlv_1=(Token)match(input,32,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getFixed_partAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalDemoFkd.g:5061:4: ( (lv_sections_2_0= rulerecord_section ) )
            	    // InternalDemoFkd.g:5062:5: (lv_sections_2_0= rulerecord_section )
            	    {
            	    // InternalDemoFkd.g:5062:5: (lv_sections_2_0= rulerecord_section )
            	    // InternalDemoFkd.g:5063:6: lv_sections_2_0= rulerecord_section
            	    {

            	    						newCompositeNode(grammarAccess.getFixed_partAccess().getSectionsRecord_sectionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_sections_2_0=rulerecord_section();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFixed_partRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sections",
            	    							lv_sections_2_0,
            	    							"org.xtext.pascal.program.DemoFkd.record_section");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefixed_part"


    // $ANTLR start "entryRulevariable_identifier_list"
    // InternalDemoFkd.g:5085:1: entryRulevariable_identifier_list returns [EObject current=null] : iv_rulevariable_identifier_list= rulevariable_identifier_list EOF ;
    public final EObject entryRulevariable_identifier_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_identifier_list = null;


        try {
            // InternalDemoFkd.g:5085:65: (iv_rulevariable_identifier_list= rulevariable_identifier_list EOF )
            // InternalDemoFkd.g:5086:2: iv_rulevariable_identifier_list= rulevariable_identifier_list EOF
            {
             newCompositeNode(grammarAccess.getVariable_identifier_listRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable_identifier_list=rulevariable_identifier_list();

            state._fsp--;

             current =iv_rulevariable_identifier_list; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable_identifier_list"


    // $ANTLR start "rulevariable_identifier_list"
    // InternalDemoFkd.g:5092:1: rulevariable_identifier_list returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) ;
    public final EObject rulevariable_identifier_list() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;


        	enterRule();

        try {
            // InternalDemoFkd.g:5098:2: ( ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) )
            // InternalDemoFkd.g:5099:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            {
            // InternalDemoFkd.g:5099:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            // InternalDemoFkd.g:5100:3: ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            {
            // InternalDemoFkd.g:5100:3: ( (lv_names_0_0= RULE_ID ) )
            // InternalDemoFkd.g:5101:4: (lv_names_0_0= RULE_ID )
            {
            // InternalDemoFkd.g:5101:4: (lv_names_0_0= RULE_ID )
            // InternalDemoFkd.g:5102:5: lv_names_0_0= RULE_ID
            {
            lv_names_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_names_0_0, grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariable_identifier_listRule());
            					}
            					addWithLastConsumed(
            						current,
            						"names",
            						lv_names_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDemoFkd.g:5118:3: (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==33) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalDemoFkd.g:5119:4: otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVariable_identifier_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalDemoFkd.g:5123:4: ( (lv_names_2_0= RULE_ID ) )
            	    // InternalDemoFkd.g:5124:5: (lv_names_2_0= RULE_ID )
            	    {
            	    // InternalDemoFkd.g:5124:5: (lv_names_2_0= RULE_ID )
            	    // InternalDemoFkd.g:5125:6: lv_names_2_0= RULE_ID
            	    {
            	    lv_names_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    						newLeafNode(lv_names_2_0, grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getVariable_identifier_listRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"names",
            	    							lv_names_2_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_identifier_list"


    // $ANTLR start "entryRulevariable_section"
    // InternalDemoFkd.g:5146:1: entryRulevariable_section returns [EObject current=null] : iv_rulevariable_section= rulevariable_section EOF ;
    public final EObject entryRulevariable_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_section = null;


        try {
            // InternalDemoFkd.g:5146:57: (iv_rulevariable_section= rulevariable_section EOF )
            // InternalDemoFkd.g:5147:2: iv_rulevariable_section= rulevariable_section EOF
            {
             newCompositeNode(grammarAccess.getVariable_sectionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable_section=rulevariable_section();

            state._fsp--;

             current =iv_rulevariable_section; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable_section"


    // $ANTLR start "rulevariable_section"
    // InternalDemoFkd.g:5153:1: rulevariable_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulevariable_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:5159:2: ( ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalDemoFkd.g:5160:2: ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalDemoFkd.g:5160:2: ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            // InternalDemoFkd.g:5161:3: ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) )
            {
            // InternalDemoFkd.g:5161:3: ( (lv_identifiers_0_0= rulevariable_identifier_list ) )
            // InternalDemoFkd.g:5162:4: (lv_identifiers_0_0= rulevariable_identifier_list )
            {
            // InternalDemoFkd.g:5162:4: (lv_identifiers_0_0= rulevariable_identifier_list )
            // InternalDemoFkd.g:5163:5: lv_identifiers_0_0= rulevariable_identifier_list
            {

            					newCompositeNode(grammarAccess.getVariable_sectionAccess().getIdentifiersVariable_identifier_listParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_identifiers_0_0=rulevariable_identifier_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariable_sectionRule());
            					}
            					set(
            						current,
            						"identifiers",
            						lv_identifiers_0_0,
            						"org.xtext.pascal.program.DemoFkd.variable_identifier_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getVariable_sectionAccess().getColonKeyword_1());
            		
            // InternalDemoFkd.g:5184:3: ( (lv_type_2_0= ruletype ) )
            // InternalDemoFkd.g:5185:4: (lv_type_2_0= ruletype )
            {
            // InternalDemoFkd.g:5185:4: (lv_type_2_0= ruletype )
            // InternalDemoFkd.g:5186:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getVariable_sectionAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariable_sectionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.pascal.program.DemoFkd.type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_section"


    // $ANTLR start "entryRulerecord_section"
    // InternalDemoFkd.g:5207:1: entryRulerecord_section returns [EObject current=null] : iv_rulerecord_section= rulerecord_section EOF ;
    public final EObject entryRulerecord_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecord_section = null;


        try {
            // InternalDemoFkd.g:5207:55: (iv_rulerecord_section= rulerecord_section EOF )
            // InternalDemoFkd.g:5208:2: iv_rulerecord_section= rulerecord_section EOF
            {
             newCompositeNode(grammarAccess.getRecord_sectionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerecord_section=rulerecord_section();

            state._fsp--;

             current =iv_rulerecord_section; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerecord_section"


    // $ANTLR start "rulerecord_section"
    // InternalDemoFkd.g:5214:1: rulerecord_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulerecord_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:5220:2: ( ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalDemoFkd.g:5221:2: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalDemoFkd.g:5221:2: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            // InternalDemoFkd.g:5222:3: ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) )
            {
            // InternalDemoFkd.g:5222:3: ( (lv_identifiers_0_0= ruleidentifier_list ) )
            // InternalDemoFkd.g:5223:4: (lv_identifiers_0_0= ruleidentifier_list )
            {
            // InternalDemoFkd.g:5223:4: (lv_identifiers_0_0= ruleidentifier_list )
            // InternalDemoFkd.g:5224:5: lv_identifiers_0_0= ruleidentifier_list
            {

            					newCompositeNode(grammarAccess.getRecord_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_identifiers_0_0=ruleidentifier_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecord_sectionRule());
            					}
            					set(
            						current,
            						"identifiers",
            						lv_identifiers_0_0,
            						"org.xtext.pascal.program.DemoFkd.identifier_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getRecord_sectionAccess().getColonKeyword_1());
            		
            // InternalDemoFkd.g:5245:3: ( (lv_type_2_0= ruletype ) )
            // InternalDemoFkd.g:5246:4: (lv_type_2_0= ruletype )
            {
            // InternalDemoFkd.g:5246:4: (lv_type_2_0= ruletype )
            // InternalDemoFkd.g:5247:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getRecord_sectionAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecord_sectionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.pascal.program.DemoFkd.type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerecord_section"


    // $ANTLR start "entryRulevariant_part"
    // InternalDemoFkd.g:5268:1: entryRulevariant_part returns [EObject current=null] : iv_rulevariant_part= rulevariant_part EOF ;
    public final EObject entryRulevariant_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariant_part = null;


        try {
            // InternalDemoFkd.g:5268:53: (iv_rulevariant_part= rulevariant_part EOF )
            // InternalDemoFkd.g:5269:2: iv_rulevariant_part= rulevariant_part EOF
            {
             newCompositeNode(grammarAccess.getVariant_partRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariant_part=rulevariant_part();

            state._fsp--;

             current =iv_rulevariant_part; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariant_part"


    // $ANTLR start "rulevariant_part"
    // InternalDemoFkd.g:5275:1: rulevariant_part returns [EObject current=null] : (otherlv_0= 'case' ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) ) )* ) ;
    public final EObject rulevariant_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_tag_1_0 = null;

        EObject lv_variants_4_0 = null;

        EObject lv_variants_6_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:5281:2: ( (otherlv_0= 'case' ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) ) )* ) )
            // InternalDemoFkd.g:5282:2: (otherlv_0= 'case' ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) ) )* )
            {
            // InternalDemoFkd.g:5282:2: (otherlv_0= 'case' ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) ) )* )
            // InternalDemoFkd.g:5283:3: otherlv_0= 'case' ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) ) )*
            {
            otherlv_0=(Token)match(input,62,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVariant_partAccess().getCaseKeyword_0());
            		
            // InternalDemoFkd.g:5287:3: ( (lv_tag_1_0= ruletag_field ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID) ) {
                int LA69_1 = input.LA(2);

                if ( (LA69_1==37) ) {
                    alt69=1;
                }
            }
            switch (alt69) {
                case 1 :
                    // InternalDemoFkd.g:5288:4: (lv_tag_1_0= ruletag_field )
                    {
                    // InternalDemoFkd.g:5288:4: (lv_tag_1_0= ruletag_field )
                    // InternalDemoFkd.g:5289:5: lv_tag_1_0= ruletag_field
                    {

                    					newCompositeNode(grammarAccess.getVariant_partAccess().getTagTag_fieldParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_tag_1_0=ruletag_field();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariant_partRule());
                    					}
                    					set(
                    						current,
                    						"tag",
                    						lv_tag_1_0,
                    						"org.xtext.pascal.program.DemoFkd.tag_field");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDemoFkd.g:5306:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDemoFkd.g:5307:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDemoFkd.g:5307:4: (lv_name_2_0= RULE_ID )
            // InternalDemoFkd.g:5308:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(lv_name_2_0, grammarAccess.getVariant_partAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariant_partRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,63,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getVariant_partAccess().getOfKeyword_3());
            		
            // InternalDemoFkd.g:5328:3: ( (lv_variants_4_0= rulevariant ) )
            // InternalDemoFkd.g:5329:4: (lv_variants_4_0= rulevariant )
            {
            // InternalDemoFkd.g:5329:4: (lv_variants_4_0= rulevariant )
            // InternalDemoFkd.g:5330:5: lv_variants_4_0= rulevariant
            {

            					newCompositeNode(grammarAccess.getVariant_partAccess().getVariantsVariantParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_variants_4_0=rulevariant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariant_partRule());
            					}
            					add(
            						current,
            						"variants",
            						lv_variants_4_0,
            						"org.xtext.pascal.program.DemoFkd.variant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDemoFkd.g:5347:3: (otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==32) ) {
                    int LA70_1 = input.LA(2);

                    if ( ((LA70_1>=RULE_ID && LA70_1<=RULE_INTEGER_NUMBER)||LA70_1==RULE_ADDITION_OPERATOR||(LA70_1>=RULE_STRING && LA70_1<=RULE_SIGNED_REAL_NUMBER)||(LA70_1>=48 && LA70_1<=50)) ) {
                        alt70=1;
                    }


                }


                switch (alt70) {
            	case 1 :
            	    // InternalDemoFkd.g:5348:4: otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) )
            	    {
            	    otherlv_5=(Token)match(input,32,FOLLOW_36); 

            	    				newLeafNode(otherlv_5, grammarAccess.getVariant_partAccess().getSemicolonKeyword_5_0());
            	    			
            	    // InternalDemoFkd.g:5352:4: ( (lv_variants_6_0= rulevariant ) )
            	    // InternalDemoFkd.g:5353:5: (lv_variants_6_0= rulevariant )
            	    {
            	    // InternalDemoFkd.g:5353:5: (lv_variants_6_0= rulevariant )
            	    // InternalDemoFkd.g:5354:6: lv_variants_6_0= rulevariant
            	    {

            	    						newCompositeNode(grammarAccess.getVariant_partAccess().getVariantsVariantParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_variants_6_0=rulevariant();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVariant_partRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variants",
            	    							lv_variants_6_0,
            	    							"org.xtext.pascal.program.DemoFkd.variant");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariant_part"


    // $ANTLR start "entryRuletag_field"
    // InternalDemoFkd.g:5376:1: entryRuletag_field returns [EObject current=null] : iv_ruletag_field= ruletag_field EOF ;
    public final EObject entryRuletag_field() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletag_field = null;


        try {
            // InternalDemoFkd.g:5376:50: (iv_ruletag_field= ruletag_field EOF )
            // InternalDemoFkd.g:5377:2: iv_ruletag_field= ruletag_field EOF
            {
             newCompositeNode(grammarAccess.getTag_fieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletag_field=ruletag_field();

            state._fsp--;

             current =iv_ruletag_field; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletag_field"


    // $ANTLR start "ruletag_field"
    // InternalDemoFkd.g:5383:1: ruletag_field returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) ;
    public final EObject ruletag_field() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDemoFkd.g:5389:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) )
            // InternalDemoFkd.g:5390:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )
            {
            // InternalDemoFkd.g:5390:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )
            // InternalDemoFkd.g:5391:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':'
            {
            // InternalDemoFkd.g:5391:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDemoFkd.g:5392:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDemoFkd.g:5392:4: (lv_name_0_0= RULE_ID )
            // InternalDemoFkd.g:5393:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTag_fieldAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTag_fieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTag_fieldAccess().getColonKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletag_field"


    // $ANTLR start "entryRulevariant"
    // InternalDemoFkd.g:5417:1: entryRulevariant returns [EObject current=null] : iv_rulevariant= rulevariant EOF ;
    public final EObject entryRulevariant() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariant = null;


        try {
            // InternalDemoFkd.g:5417:48: (iv_rulevariant= rulevariant EOF )
            // InternalDemoFkd.g:5418:2: iv_rulevariant= rulevariant EOF
            {
             newCompositeNode(grammarAccess.getVariantRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariant=rulevariant();

            state._fsp--;

             current =iv_rulevariant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariant"


    // $ANTLR start "rulevariant"
    // InternalDemoFkd.g:5424:1: rulevariant returns [EObject current=null] : ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= ')' ) ;
    public final EObject rulevariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_labels_0_0 = null;

        EObject lv_fields_3_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:5430:2: ( ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= ')' ) )
            // InternalDemoFkd.g:5431:2: ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= ')' )
            {
            // InternalDemoFkd.g:5431:2: ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= ')' )
            // InternalDemoFkd.g:5432:3: ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= ')'
            {
            // InternalDemoFkd.g:5432:3: ( (lv_labels_0_0= rulecase_label_list ) )
            // InternalDemoFkd.g:5433:4: (lv_labels_0_0= rulecase_label_list )
            {
            // InternalDemoFkd.g:5433:4: (lv_labels_0_0= rulecase_label_list )
            // InternalDemoFkd.g:5434:5: lv_labels_0_0= rulecase_label_list
            {

            					newCompositeNode(grammarAccess.getVariantAccess().getLabelsCase_label_listParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_labels_0_0=rulecase_label_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariantRule());
            					}
            					set(
            						current,
            						"labels",
            						lv_labels_0_0,
            						"org.xtext.pascal.program.DemoFkd.case_label_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getVariantAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getVariantAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDemoFkd.g:5459:3: ( (lv_fields_3_0= rulefield_list ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_ID||LA71_0==62) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalDemoFkd.g:5460:4: (lv_fields_3_0= rulefield_list )
                    {
                    // InternalDemoFkd.g:5460:4: (lv_fields_3_0= rulefield_list )
                    // InternalDemoFkd.g:5461:5: lv_fields_3_0= rulefield_list
                    {

                    					newCompositeNode(grammarAccess.getVariantAccess().getFieldsField_listParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_fields_3_0=rulefield_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariantRule());
                    					}
                    					set(
                    						current,
                    						"fields",
                    						lv_fields_3_0,
                    						"org.xtext.pascal.program.DemoFkd.field_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVariantAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariant"


    // $ANTLR start "entryRuleset_type"
    // InternalDemoFkd.g:5486:1: entryRuleset_type returns [EObject current=null] : iv_ruleset_type= ruleset_type EOF ;
    public final EObject entryRuleset_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset_type = null;


        try {
            // InternalDemoFkd.g:5486:49: (iv_ruleset_type= ruleset_type EOF )
            // InternalDemoFkd.g:5487:2: iv_ruleset_type= ruleset_type EOF
            {
             newCompositeNode(grammarAccess.getSet_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleset_type=ruleset_type();

            state._fsp--;

             current =iv_ruleset_type; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleset_type"


    // $ANTLR start "ruleset_type"
    // InternalDemoFkd.g:5493:1: ruleset_type returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruleset_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:5499:2: ( (otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalDemoFkd.g:5500:2: (otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalDemoFkd.g:5500:2: (otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) )
            // InternalDemoFkd.g:5501:3: otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getSet_typeAccess().getSetKeyword_0());
            		
            otherlv_1=(Token)match(input,63,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getSet_typeAccess().getOfKeyword_1());
            		
            // InternalDemoFkd.g:5509:3: ( (lv_type_2_0= ruletype ) )
            // InternalDemoFkd.g:5510:4: (lv_type_2_0= ruletype )
            {
            // InternalDemoFkd.g:5510:4: (lv_type_2_0= ruletype )
            // InternalDemoFkd.g:5511:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getSet_typeAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSet_typeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.pascal.program.DemoFkd.type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleset_type"


    // $ANTLR start "entryRulefile_type"
    // InternalDemoFkd.g:5532:1: entryRulefile_type returns [EObject current=null] : iv_rulefile_type= rulefile_type EOF ;
    public final EObject entryRulefile_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefile_type = null;


        try {
            // InternalDemoFkd.g:5532:50: (iv_rulefile_type= rulefile_type EOF )
            // InternalDemoFkd.g:5533:2: iv_rulefile_type= rulefile_type EOF
            {
             newCompositeNode(grammarAccess.getFile_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefile_type=rulefile_type();

            state._fsp--;

             current =iv_rulefile_type; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefile_type"


    // $ANTLR start "rulefile_type"
    // InternalDemoFkd.g:5539:1: rulefile_type returns [EObject current=null] : (otherlv_0= 'file' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulefile_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:5545:2: ( (otherlv_0= 'file' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalDemoFkd.g:5546:2: (otherlv_0= 'file' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalDemoFkd.g:5546:2: (otherlv_0= 'file' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) )
            // InternalDemoFkd.g:5547:3: otherlv_0= 'file' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getFile_typeAccess().getFileKeyword_0());
            		
            otherlv_1=(Token)match(input,63,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getFile_typeAccess().getOfKeyword_1());
            		
            // InternalDemoFkd.g:5555:3: ( (lv_type_2_0= ruletype ) )
            // InternalDemoFkd.g:5556:4: (lv_type_2_0= ruletype )
            {
            // InternalDemoFkd.g:5556:4: (lv_type_2_0= ruletype )
            // InternalDemoFkd.g:5557:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getFile_typeAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFile_typeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.pascal.program.DemoFkd.type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefile_type"


    // $ANTLR start "entryRulepointer_type"
    // InternalDemoFkd.g:5578:1: entryRulepointer_type returns [EObject current=null] : iv_rulepointer_type= rulepointer_type EOF ;
    public final EObject entryRulepointer_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepointer_type = null;


        try {
            // InternalDemoFkd.g:5578:53: (iv_rulepointer_type= rulepointer_type EOF )
            // InternalDemoFkd.g:5579:2: iv_rulepointer_type= rulepointer_type EOF
            {
             newCompositeNode(grammarAccess.getPointer_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepointer_type=rulepointer_type();

            state._fsp--;

             current =iv_rulepointer_type; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepointer_type"


    // $ANTLR start "rulepointer_type"
    // InternalDemoFkd.g:5585:1: rulepointer_type returns [EObject current=null] : (otherlv_0= '^' ( (lv_type_1_0= ruletype ) ) ) ;
    public final EObject rulepointer_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:5591:2: ( (otherlv_0= '^' ( (lv_type_1_0= ruletype ) ) ) )
            // InternalDemoFkd.g:5592:2: (otherlv_0= '^' ( (lv_type_1_0= ruletype ) ) )
            {
            // InternalDemoFkd.g:5592:2: (otherlv_0= '^' ( (lv_type_1_0= ruletype ) ) )
            // InternalDemoFkd.g:5593:3: otherlv_0= '^' ( (lv_type_1_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getPointer_typeAccess().getCircumflexAccentKeyword_0());
            		
            // InternalDemoFkd.g:5597:3: ( (lv_type_1_0= ruletype ) )
            // InternalDemoFkd.g:5598:4: (lv_type_1_0= ruletype )
            {
            // InternalDemoFkd.g:5598:4: (lv_type_1_0= ruletype )
            // InternalDemoFkd.g:5599:5: lv_type_1_0= ruletype
            {

            					newCompositeNode(grammarAccess.getPointer_typeAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPointer_typeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.pascal.program.DemoFkd.type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepointer_type"


    // $ANTLR start "entryRulevariable_declaration_part"
    // InternalDemoFkd.g:5620:1: entryRulevariable_declaration_part returns [EObject current=null] : iv_rulevariable_declaration_part= rulevariable_declaration_part EOF ;
    public final EObject entryRulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declaration_part = null;


        try {
            // InternalDemoFkd.g:5620:66: (iv_rulevariable_declaration_part= rulevariable_declaration_part EOF )
            // InternalDemoFkd.g:5621:2: iv_rulevariable_declaration_part= rulevariable_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getVariable_declaration_partRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable_declaration_part=rulevariable_declaration_part();

            state._fsp--;

             current =iv_rulevariable_declaration_part; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable_declaration_part"


    // $ANTLR start "rulevariable_declaration_part"
    // InternalDemoFkd.g:5627:1: rulevariable_declaration_part returns [EObject current=null] : (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* ) ;
    public final EObject rulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sections_1_0 = null;

        EObject lv_sections_3_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:5633:2: ( (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* ) )
            // InternalDemoFkd.g:5634:2: (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* )
            {
            // InternalDemoFkd.g:5634:2: (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* )
            // InternalDemoFkd.g:5635:3: otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )*
            {
            otherlv_0=(Token)match(input,76,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0());
            		
            // InternalDemoFkd.g:5639:3: ( (lv_sections_1_0= rulevariable_section ) )
            // InternalDemoFkd.g:5640:4: (lv_sections_1_0= rulevariable_section )
            {
            // InternalDemoFkd.g:5640:4: (lv_sections_1_0= rulevariable_section )
            // InternalDemoFkd.g:5641:5: lv_sections_1_0= rulevariable_section
            {

            					newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_sections_1_0=rulevariable_section();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariable_declaration_partRule());
            					}
            					add(
            						current,
            						"sections",
            						lv_sections_1_0,
            						"org.xtext.pascal.program.DemoFkd.variable_section");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2());
            		
            // InternalDemoFkd.g:5662:3: ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==RULE_ID) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalDemoFkd.g:5663:4: ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';'
            	    {
            	    // InternalDemoFkd.g:5663:4: ( (lv_sections_3_0= rulevariable_section ) )
            	    // InternalDemoFkd.g:5664:5: (lv_sections_3_0= rulevariable_section )
            	    {
            	    // InternalDemoFkd.g:5664:5: (lv_sections_3_0= rulevariable_section )
            	    // InternalDemoFkd.g:5665:6: lv_sections_3_0= rulevariable_section
            	    {

            	    						newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_sections_3_0=rulevariable_section();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVariable_declaration_partRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sections",
            	    							lv_sections_3_0,
            	    							"org.xtext.pascal.program.DemoFkd.variable_section");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,32,FOLLOW_41); 

            	    				newLeafNode(otherlv_4, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_declaration_part"


    // $ANTLR start "entryRuleprocedure_and_function_declaration_part"
    // InternalDemoFkd.g:5691:1: entryRuleprocedure_and_function_declaration_part returns [EObject current=null] : iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF ;
    public final EObject entryRuleprocedure_and_function_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_and_function_declaration_part = null;


        try {
            // InternalDemoFkd.g:5691:80: (iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF )
            // InternalDemoFkd.g:5692:2: iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_and_function_declaration_part=ruleprocedure_and_function_declaration_part();

            state._fsp--;

             current =iv_ruleprocedure_and_function_declaration_part; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprocedure_and_function_declaration_part"


    // $ANTLR start "ruleprocedure_and_function_declaration_part"
    // InternalDemoFkd.g:5698:1: ruleprocedure_and_function_declaration_part returns [EObject current=null] : ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= ';' )+ ;
    public final EObject ruleprocedure_and_function_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_procedures_0_0 = null;

        EObject lv_functions_1_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:5704:2: ( ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= ';' )+ )
            // InternalDemoFkd.g:5705:2: ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= ';' )+
            {
            // InternalDemoFkd.g:5705:2: ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= ';' )+
            int cnt74=0;
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( ((LA74_0>=78 && LA74_0<=79)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalDemoFkd.g:5706:3: ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= ';'
            	    {
            	    // InternalDemoFkd.g:5706:3: ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) )
            	    int alt73=2;
            	    int LA73_0 = input.LA(1);

            	    if ( (LA73_0==78) ) {
            	        alt73=1;
            	    }
            	    else if ( (LA73_0==79) ) {
            	        alt73=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 73, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt73) {
            	        case 1 :
            	            // InternalDemoFkd.g:5707:4: ( (lv_procedures_0_0= ruleprocedure_declaration ) )
            	            {
            	            // InternalDemoFkd.g:5707:4: ( (lv_procedures_0_0= ruleprocedure_declaration ) )
            	            // InternalDemoFkd.g:5708:5: (lv_procedures_0_0= ruleprocedure_declaration )
            	            {
            	            // InternalDemoFkd.g:5708:5: (lv_procedures_0_0= ruleprocedure_declaration )
            	            // InternalDemoFkd.g:5709:6: lv_procedures_0_0= ruleprocedure_declaration
            	            {

            	            						newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partAccess().getProceduresProcedure_declarationParserRuleCall_0_0_0());
            	            					
            	            pushFollow(FOLLOW_13);
            	            lv_procedures_0_0=ruleprocedure_declaration();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProcedure_and_function_declaration_partRule());
            	            						}
            	            						add(
            	            							current,
            	            							"procedures",
            	            							lv_procedures_0_0,
            	            							"org.xtext.pascal.program.DemoFkd.procedure_declaration");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDemoFkd.g:5727:4: ( (lv_functions_1_0= rulefunction_declaration ) )
            	            {
            	            // InternalDemoFkd.g:5727:4: ( (lv_functions_1_0= rulefunction_declaration ) )
            	            // InternalDemoFkd.g:5728:5: (lv_functions_1_0= rulefunction_declaration )
            	            {
            	            // InternalDemoFkd.g:5728:5: (lv_functions_1_0= rulefunction_declaration )
            	            // InternalDemoFkd.g:5729:6: lv_functions_1_0= rulefunction_declaration
            	            {

            	            						newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partAccess().getFunctionsFunction_declarationParserRuleCall_0_1_0());
            	            					
            	            pushFollow(FOLLOW_13);
            	            lv_functions_1_0=rulefunction_declaration();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProcedure_and_function_declaration_partRule());
            	            						}
            	            						add(
            	            							current,
            	            							"functions",
            	            							lv_functions_1_0,
            	            							"org.xtext.pascal.program.DemoFkd.function_declaration");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_55); 

            	    			newLeafNode(otherlv_2, grammarAccess.getProcedure_and_function_declaration_partAccess().getSemicolonKeyword_1());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt74 >= 1 ) break loop74;
                        EarlyExitException eee =
                            new EarlyExitException(74, input);
                        throw eee;
                }
                cnt74++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprocedure_and_function_declaration_part"


    // $ANTLR start "entryRuleabstraction_heading"
    // InternalDemoFkd.g:5755:1: entryRuleabstraction_heading returns [EObject current=null] : iv_ruleabstraction_heading= ruleabstraction_heading EOF ;
    public final EObject entryRuleabstraction_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleabstraction_heading = null;


        try {
            // InternalDemoFkd.g:5755:60: (iv_ruleabstraction_heading= ruleabstraction_heading EOF )
            // InternalDemoFkd.g:5756:2: iv_ruleabstraction_heading= ruleabstraction_heading EOF
            {
             newCompositeNode(grammarAccess.getAbstraction_headingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleabstraction_heading=ruleabstraction_heading();

            state._fsp--;

             current =iv_ruleabstraction_heading; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleabstraction_heading"


    // $ANTLR start "ruleabstraction_heading"
    // InternalDemoFkd.g:5762:1: ruleabstraction_heading returns [EObject current=null] : (this_procedure_heading_0= ruleprocedure_heading | this_function_heading_1= rulefunction_heading ) ;
    public final EObject ruleabstraction_heading() throws RecognitionException {
        EObject current = null;

        EObject this_procedure_heading_0 = null;

        EObject this_function_heading_1 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:5768:2: ( (this_procedure_heading_0= ruleprocedure_heading | this_function_heading_1= rulefunction_heading ) )
            // InternalDemoFkd.g:5769:2: (this_procedure_heading_0= ruleprocedure_heading | this_function_heading_1= rulefunction_heading )
            {
            // InternalDemoFkd.g:5769:2: (this_procedure_heading_0= ruleprocedure_heading | this_function_heading_1= rulefunction_heading )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==78) ) {
                alt75=1;
            }
            else if ( (LA75_0==79) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalDemoFkd.g:5770:3: this_procedure_heading_0= ruleprocedure_heading
                    {

                    			newCompositeNode(grammarAccess.getAbstraction_headingAccess().getProcedure_headingParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_procedure_heading_0=ruleprocedure_heading();

                    state._fsp--;


                    			current = this_procedure_heading_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:5779:3: this_function_heading_1= rulefunction_heading
                    {

                    			newCompositeNode(grammarAccess.getAbstraction_headingAccess().getFunction_headingParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_function_heading_1=rulefunction_heading();

                    state._fsp--;


                    			current = this_function_heading_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleabstraction_heading"


    // $ANTLR start "entryRuleprocedure_declaration"
    // InternalDemoFkd.g:5791:1: entryRuleprocedure_declaration returns [EObject current=null] : iv_ruleprocedure_declaration= ruleprocedure_declaration EOF ;
    public final EObject entryRuleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_declaration = null;


        try {
            // InternalDemoFkd.g:5791:62: (iv_ruleprocedure_declaration= ruleprocedure_declaration EOF )
            // InternalDemoFkd.g:5792:2: iv_ruleprocedure_declaration= ruleprocedure_declaration EOF
            {
             newCompositeNode(grammarAccess.getProcedure_declarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_declaration=ruleprocedure_declaration();

            state._fsp--;

             current =iv_ruleprocedure_declaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprocedure_declaration"


    // $ANTLR start "ruleprocedure_declaration"
    // InternalDemoFkd.g:5798:1: ruleprocedure_declaration returns [EObject current=null] : ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) ) ;
    public final EObject ruleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_forward_3_0=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:5804:2: ( ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) ) )
            // InternalDemoFkd.g:5805:2: ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) )
            {
            // InternalDemoFkd.g:5805:2: ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) )
            // InternalDemoFkd.g:5806:3: ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) )
            {
            // InternalDemoFkd.g:5806:3: ( (lv_heading_0_0= ruleprocedure_heading ) )
            // InternalDemoFkd.g:5807:4: (lv_heading_0_0= ruleprocedure_heading )
            {
            // InternalDemoFkd.g:5807:4: (lv_heading_0_0= ruleprocedure_heading )
            // InternalDemoFkd.g:5808:5: lv_heading_0_0= ruleprocedure_heading
            {

            					newCompositeNode(grammarAccess.getProcedure_declarationAccess().getHeadingProcedure_headingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_heading_0_0=ruleprocedure_heading();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcedure_declarationRule());
            					}
            					set(
            						current,
            						"heading",
            						lv_heading_0_0,
            						"org.xtext.pascal.program.DemoFkd.procedure_heading");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getProcedure_declarationAccess().getSemicolonKeyword_1());
            		
            // InternalDemoFkd.g:5829:3: ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=34 && LA76_0<=35)||(LA76_0>=66 && LA76_0<=68)||LA76_0==76||(LA76_0>=78 && LA76_0<=79)) ) {
                alt76=1;
            }
            else if ( (LA76_0==77) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalDemoFkd.g:5830:4: ( (lv_block_2_0= ruleblock ) )
                    {
                    // InternalDemoFkd.g:5830:4: ( (lv_block_2_0= ruleblock ) )
                    // InternalDemoFkd.g:5831:5: (lv_block_2_0= ruleblock )
                    {
                    // InternalDemoFkd.g:5831:5: (lv_block_2_0= ruleblock )
                    // InternalDemoFkd.g:5832:6: lv_block_2_0= ruleblock
                    {

                    						newCompositeNode(grammarAccess.getProcedure_declarationAccess().getBlockBlockParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_block_2_0=ruleblock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcedure_declarationRule());
                    						}
                    						set(
                    							current,
                    							"block",
                    							lv_block_2_0,
                    							"org.xtext.pascal.program.DemoFkd.block");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:5850:4: ( (lv_forward_3_0= 'forward' ) )
                    {
                    // InternalDemoFkd.g:5850:4: ( (lv_forward_3_0= 'forward' ) )
                    // InternalDemoFkd.g:5851:5: (lv_forward_3_0= 'forward' )
                    {
                    // InternalDemoFkd.g:5851:5: (lv_forward_3_0= 'forward' )
                    // InternalDemoFkd.g:5852:6: lv_forward_3_0= 'forward'
                    {
                    lv_forward_3_0=(Token)match(input,77,FOLLOW_2); 

                    						newLeafNode(lv_forward_3_0, grammarAccess.getProcedure_declarationAccess().getForwardForwardKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProcedure_declarationRule());
                    						}
                    						setWithLastConsumed(current, "forward", lv_forward_3_0 != null, "forward");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprocedure_declaration"


    // $ANTLR start "entryRuleprocedure_heading"
    // InternalDemoFkd.g:5869:1: entryRuleprocedure_heading returns [EObject current=null] : iv_ruleprocedure_heading= ruleprocedure_heading EOF ;
    public final EObject entryRuleprocedure_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_heading = null;


        try {
            // InternalDemoFkd.g:5869:58: (iv_ruleprocedure_heading= ruleprocedure_heading EOF )
            // InternalDemoFkd.g:5870:2: iv_ruleprocedure_heading= ruleprocedure_heading EOF
            {
             newCompositeNode(grammarAccess.getProcedure_headingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_heading=ruleprocedure_heading();

            state._fsp--;

             current =iv_ruleprocedure_heading; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprocedure_heading"


    // $ANTLR start "ruleprocedure_heading"
    // InternalDemoFkd.g:5876:1: ruleprocedure_heading returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? ) ;
    public final EObject ruleprocedure_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:5882:2: ( (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? ) )
            // InternalDemoFkd.g:5883:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? )
            {
            // InternalDemoFkd.g:5883:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? )
            // InternalDemoFkd.g:5884:3: otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            {
            otherlv_0=(Token)match(input,78,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProcedure_headingAccess().getProcedureKeyword_0());
            		
            // InternalDemoFkd.g:5888:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDemoFkd.g:5889:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDemoFkd.g:5889:4: (lv_name_1_0= RULE_ID )
            // InternalDemoFkd.g:5890:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_57); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcedure_headingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcedure_headingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDemoFkd.g:5906:3: ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==30) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalDemoFkd.g:5907:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    {
                    // InternalDemoFkd.g:5907:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    // InternalDemoFkd.g:5908:5: lv_parameters_2_0= ruleformal_parameter_list
                    {

                    					newCompositeNode(grammarAccess.getProcedure_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_parameters_2_0=ruleformal_parameter_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcedure_headingRule());
                    					}
                    					set(
                    						current,
                    						"parameters",
                    						lv_parameters_2_0,
                    						"org.xtext.pascal.program.DemoFkd.formal_parameter_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprocedure_heading"


    // $ANTLR start "entryRuleformal_parameter_list"
    // InternalDemoFkd.g:5929:1: entryRuleformal_parameter_list returns [EObject current=null] : iv_ruleformal_parameter_list= ruleformal_parameter_list EOF ;
    public final EObject entryRuleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_list = null;


        try {
            // InternalDemoFkd.g:5929:62: (iv_ruleformal_parameter_list= ruleformal_parameter_list EOF )
            // InternalDemoFkd.g:5930:2: iv_ruleformal_parameter_list= ruleformal_parameter_list EOF
            {
             newCompositeNode(grammarAccess.getFormal_parameter_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleformal_parameter_list=ruleformal_parameter_list();

            state._fsp--;

             current =iv_ruleformal_parameter_list; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleformal_parameter_list"


    // $ANTLR start "ruleformal_parameter_list"
    // InternalDemoFkd.g:5936:1: ruleformal_parameter_list returns [EObject current=null] : (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:5942:2: ( (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' ) )
            // InternalDemoFkd.g:5943:2: (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' )
            {
            // InternalDemoFkd.g:5943:2: (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' )
            // InternalDemoFkd.g:5944:3: otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_58); 

            			newLeafNode(otherlv_0, grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0());
            		
            // InternalDemoFkd.g:5948:3: ( (lv_parameters_1_0= ruleformal_parameter_section ) )
            // InternalDemoFkd.g:5949:4: (lv_parameters_1_0= ruleformal_parameter_section )
            {
            // InternalDemoFkd.g:5949:4: (lv_parameters_1_0= ruleformal_parameter_section )
            // InternalDemoFkd.g:5950:5: lv_parameters_1_0= ruleformal_parameter_section
            {

            					newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_59);
            lv_parameters_1_0=ruleformal_parameter_section();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormal_parameter_listRule());
            					}
            					add(
            						current,
            						"parameters",
            						lv_parameters_1_0,
            						"org.xtext.pascal.program.DemoFkd.formal_parameter_section");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDemoFkd.g:5967:3: (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==32) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalDemoFkd.g:5968:4: otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) )
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_58); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalDemoFkd.g:5972:4: ( (lv_parameters_3_0= ruleformal_parameter_section ) )
            	    // InternalDemoFkd.g:5973:5: (lv_parameters_3_0= ruleformal_parameter_section )
            	    {
            	    // InternalDemoFkd.g:5973:5: (lv_parameters_3_0= ruleformal_parameter_section )
            	    // InternalDemoFkd.g:5974:6: lv_parameters_3_0= ruleformal_parameter_section
            	    {

            	    						newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_59);
            	    lv_parameters_3_0=ruleformal_parameter_section();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFormal_parameter_listRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_3_0,
            	    							"org.xtext.pascal.program.DemoFkd.formal_parameter_section");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            otherlv_4=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFormal_parameter_listAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleformal_parameter_list"


    // $ANTLR start "entryRuleformal_parameter_section"
    // InternalDemoFkd.g:6000:1: entryRuleformal_parameter_section returns [EObject current=null] : iv_ruleformal_parameter_section= ruleformal_parameter_section EOF ;
    public final EObject entryRuleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_section = null;


        try {
            // InternalDemoFkd.g:6000:65: (iv_ruleformal_parameter_section= ruleformal_parameter_section EOF )
            // InternalDemoFkd.g:6001:2: iv_ruleformal_parameter_section= ruleformal_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getFormal_parameter_sectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleformal_parameter_section=ruleformal_parameter_section();

            state._fsp--;

             current =iv_ruleformal_parameter_section; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleformal_parameter_section"


    // $ANTLR start "ruleformal_parameter_section"
    // InternalDemoFkd.g:6007:1: ruleformal_parameter_section returns [EObject current=null] : ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) ) ;
    public final EObject ruleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_procedure_2_0 = null;

        EObject lv_function_3_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:6013:2: ( ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) ) )
            // InternalDemoFkd.g:6014:2: ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) )
            {
            // InternalDemoFkd.g:6014:2: ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) )
            int alt79=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt79=1;
                }
                break;
            case 76:
                {
                alt79=2;
                }
                break;
            case 78:
                {
                alt79=3;
                }
                break;
            case 79:
                {
                alt79=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // InternalDemoFkd.g:6015:3: ( (lv_value_0_0= rulevalue_parameter_section ) )
                    {
                    // InternalDemoFkd.g:6015:3: ( (lv_value_0_0= rulevalue_parameter_section ) )
                    // InternalDemoFkd.g:6016:4: (lv_value_0_0= rulevalue_parameter_section )
                    {
                    // InternalDemoFkd.g:6016:4: (lv_value_0_0= rulevalue_parameter_section )
                    // InternalDemoFkd.g:6017:5: lv_value_0_0= rulevalue_parameter_section
                    {

                    					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getValueValue_parameter_sectionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=rulevalue_parameter_section();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"org.xtext.pascal.program.DemoFkd.value_parameter_section");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:6035:3: ( (lv_variable_1_0= rulevariable_parameter_section ) )
                    {
                    // InternalDemoFkd.g:6035:3: ( (lv_variable_1_0= rulevariable_parameter_section ) )
                    // InternalDemoFkd.g:6036:4: (lv_variable_1_0= rulevariable_parameter_section )
                    {
                    // InternalDemoFkd.g:6036:4: (lv_variable_1_0= rulevariable_parameter_section )
                    // InternalDemoFkd.g:6037:5: lv_variable_1_0= rulevariable_parameter_section
                    {

                    					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getVariableVariable_parameter_sectionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variable_1_0=rulevariable_parameter_section();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    					}
                    					set(
                    						current,
                    						"variable",
                    						lv_variable_1_0,
                    						"org.xtext.pascal.program.DemoFkd.variable_parameter_section");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDemoFkd.g:6055:3: ( (lv_procedure_2_0= ruleprocedure_heading ) )
                    {
                    // InternalDemoFkd.g:6055:3: ( (lv_procedure_2_0= ruleprocedure_heading ) )
                    // InternalDemoFkd.g:6056:4: (lv_procedure_2_0= ruleprocedure_heading )
                    {
                    // InternalDemoFkd.g:6056:4: (lv_procedure_2_0= ruleprocedure_heading )
                    // InternalDemoFkd.g:6057:5: lv_procedure_2_0= ruleprocedure_heading
                    {

                    					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getProcedureProcedure_headingParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_procedure_2_0=ruleprocedure_heading();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    					}
                    					set(
                    						current,
                    						"procedure",
                    						lv_procedure_2_0,
                    						"org.xtext.pascal.program.DemoFkd.procedure_heading");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDemoFkd.g:6075:3: ( (lv_function_3_0= rulefunction_heading ) )
                    {
                    // InternalDemoFkd.g:6075:3: ( (lv_function_3_0= rulefunction_heading ) )
                    // InternalDemoFkd.g:6076:4: (lv_function_3_0= rulefunction_heading )
                    {
                    // InternalDemoFkd.g:6076:4: (lv_function_3_0= rulefunction_heading )
                    // InternalDemoFkd.g:6077:5: lv_function_3_0= rulefunction_heading
                    {

                    					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getFunctionFunction_headingParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_function_3_0=rulefunction_heading();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    					}
                    					set(
                    						current,
                    						"function",
                    						lv_function_3_0,
                    						"org.xtext.pascal.program.DemoFkd.function_heading");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleformal_parameter_section"


    // $ANTLR start "entryRulevalue_parameter_section"
    // InternalDemoFkd.g:6098:1: entryRulevalue_parameter_section returns [EObject current=null] : iv_rulevalue_parameter_section= rulevalue_parameter_section EOF ;
    public final EObject entryRulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalue_parameter_section = null;


        try {
            // InternalDemoFkd.g:6098:64: (iv_rulevalue_parameter_section= rulevalue_parameter_section EOF )
            // InternalDemoFkd.g:6099:2: iv_rulevalue_parameter_section= rulevalue_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getValue_parameter_sectionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevalue_parameter_section=rulevalue_parameter_section();

            state._fsp--;

             current =iv_rulevalue_parameter_section; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevalue_parameter_section"


    // $ANTLR start "rulevalue_parameter_section"
    // InternalDemoFkd.g:6105:1: rulevalue_parameter_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) ) ;
    public final EObject rulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:6111:2: ( ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) ) )
            // InternalDemoFkd.g:6112:2: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) )
            {
            // InternalDemoFkd.g:6112:2: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) )
            // InternalDemoFkd.g:6113:3: ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) )
            {
            // InternalDemoFkd.g:6113:3: ( (lv_identifiers_0_0= ruleidentifier_list ) )
            // InternalDemoFkd.g:6114:4: (lv_identifiers_0_0= ruleidentifier_list )
            {
            // InternalDemoFkd.g:6114:4: (lv_identifiers_0_0= ruleidentifier_list )
            // InternalDemoFkd.g:6115:5: lv_identifiers_0_0= ruleidentifier_list
            {

            					newCompositeNode(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_identifiers_0_0=ruleidentifier_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValue_parameter_sectionRule());
            					}
            					set(
            						current,
            						"identifiers",
            						lv_identifiers_0_0,
            						"org.xtext.pascal.program.DemoFkd.identifier_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_60); 

            			newLeafNode(otherlv_1, grammarAccess.getValue_parameter_sectionAccess().getColonKeyword_1());
            		
            // InternalDemoFkd.g:6136:3: ( (lv_type_2_0= ruleparameter_type ) )
            // InternalDemoFkd.g:6137:4: (lv_type_2_0= ruleparameter_type )
            {
            // InternalDemoFkd.g:6137:4: (lv_type_2_0= ruleparameter_type )
            // InternalDemoFkd.g:6138:5: lv_type_2_0= ruleparameter_type
            {

            					newCompositeNode(grammarAccess.getValue_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleparameter_type();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValue_parameter_sectionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.pascal.program.DemoFkd.parameter_type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevalue_parameter_section"


    // $ANTLR start "entryRuleparameter_type"
    // InternalDemoFkd.g:6159:1: entryRuleparameter_type returns [EObject current=null] : iv_ruleparameter_type= ruleparameter_type EOF ;
    public final EObject entryRuleparameter_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter_type = null;


        try {
            // InternalDemoFkd.g:6159:55: (iv_ruleparameter_type= ruleparameter_type EOF )
            // InternalDemoFkd.g:6160:2: iv_ruleparameter_type= ruleparameter_type EOF
            {
             newCompositeNode(grammarAccess.getParameter_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleparameter_type=ruleparameter_type();

            state._fsp--;

             current =iv_ruleparameter_type; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleparameter_type"


    // $ANTLR start "ruleparameter_type"
    // InternalDemoFkd.g:6166:1: ruleparameter_type returns [EObject current=null] : ( ( (lv_array_0_0= ruleconformant_array_schema ) ) | ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleparameter_type() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_array_0_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:6172:2: ( ( ( (lv_array_0_0= ruleconformant_array_schema ) ) | ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDemoFkd.g:6173:2: ( ( (lv_array_0_0= ruleconformant_array_schema ) ) | ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDemoFkd.g:6173:2: ( ( (lv_array_0_0= ruleconformant_array_schema ) ) | ( (lv_name_1_0= RULE_ID ) ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( ((LA80_0>=70 && LA80_0<=71)) ) {
                alt80=1;
            }
            else if ( (LA80_0==RULE_ID) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // InternalDemoFkd.g:6174:3: ( (lv_array_0_0= ruleconformant_array_schema ) )
                    {
                    // InternalDemoFkd.g:6174:3: ( (lv_array_0_0= ruleconformant_array_schema ) )
                    // InternalDemoFkd.g:6175:4: (lv_array_0_0= ruleconformant_array_schema )
                    {
                    // InternalDemoFkd.g:6175:4: (lv_array_0_0= ruleconformant_array_schema )
                    // InternalDemoFkd.g:6176:5: lv_array_0_0= ruleconformant_array_schema
                    {

                    					newCompositeNode(grammarAccess.getParameter_typeAccess().getArrayConformant_array_schemaParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_array_0_0=ruleconformant_array_schema();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParameter_typeRule());
                    					}
                    					set(
                    						current,
                    						"array",
                    						lv_array_0_0,
                    						"org.xtext.pascal.program.DemoFkd.conformant_array_schema");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:6194:3: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalDemoFkd.g:6194:3: ( (lv_name_1_0= RULE_ID ) )
                    // InternalDemoFkd.g:6195:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDemoFkd.g:6195:4: (lv_name_1_0= RULE_ID )
                    // InternalDemoFkd.g:6196:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getParameter_typeAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameter_typeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleparameter_type"


    // $ANTLR start "entryRuleconformant_array_schema"
    // InternalDemoFkd.g:6216:1: entryRuleconformant_array_schema returns [EObject current=null] : iv_ruleconformant_array_schema= ruleconformant_array_schema EOF ;
    public final EObject entryRuleconformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconformant_array_schema = null;


        try {
            // InternalDemoFkd.g:6216:64: (iv_ruleconformant_array_schema= ruleconformant_array_schema EOF )
            // InternalDemoFkd.g:6217:2: iv_ruleconformant_array_schema= ruleconformant_array_schema EOF
            {
             newCompositeNode(grammarAccess.getConformant_array_schemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconformant_array_schema=ruleconformant_array_schema();

            state._fsp--;

             current =iv_ruleconformant_array_schema; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconformant_array_schema"


    // $ANTLR start "ruleconformant_array_schema"
    // InternalDemoFkd.g:6223:1: ruleconformant_array_schema returns [EObject current=null] : ( ( (lv_packed_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) ) ) ;
    public final EObject ruleconformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject lv_packed_0_0 = null;

        EObject lv_unpacked_1_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:6229:2: ( ( ( (lv_packed_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) ) ) )
            // InternalDemoFkd.g:6230:2: ( ( (lv_packed_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) ) )
            {
            // InternalDemoFkd.g:6230:2: ( ( (lv_packed_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==70) ) {
                alt81=1;
            }
            else if ( (LA81_0==71) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalDemoFkd.g:6231:3: ( (lv_packed_0_0= rulepacked_conformant_array_schema ) )
                    {
                    // InternalDemoFkd.g:6231:3: ( (lv_packed_0_0= rulepacked_conformant_array_schema ) )
                    // InternalDemoFkd.g:6232:4: (lv_packed_0_0= rulepacked_conformant_array_schema )
                    {
                    // InternalDemoFkd.g:6232:4: (lv_packed_0_0= rulepacked_conformant_array_schema )
                    // InternalDemoFkd.g:6233:5: lv_packed_0_0= rulepacked_conformant_array_schema
                    {

                    					newCompositeNode(grammarAccess.getConformant_array_schemaAccess().getPackedPacked_conformant_array_schemaParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_packed_0_0=rulepacked_conformant_array_schema();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConformant_array_schemaRule());
                    					}
                    					set(
                    						current,
                    						"packed",
                    						lv_packed_0_0,
                    						"org.xtext.pascal.program.DemoFkd.packed_conformant_array_schema");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:6251:3: ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) )
                    {
                    // InternalDemoFkd.g:6251:3: ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) )
                    // InternalDemoFkd.g:6252:4: (lv_unpacked_1_0= ruleunpacked_conformant_array_schema )
                    {
                    // InternalDemoFkd.g:6252:4: (lv_unpacked_1_0= ruleunpacked_conformant_array_schema )
                    // InternalDemoFkd.g:6253:5: lv_unpacked_1_0= ruleunpacked_conformant_array_schema
                    {

                    					newCompositeNode(grammarAccess.getConformant_array_schemaAccess().getUnpackedUnpacked_conformant_array_schemaParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_unpacked_1_0=ruleunpacked_conformant_array_schema();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConformant_array_schemaRule());
                    					}
                    					set(
                    						current,
                    						"unpacked",
                    						lv_unpacked_1_0,
                    						"org.xtext.pascal.program.DemoFkd.unpacked_conformant_array_schema");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconformant_array_schema"


    // $ANTLR start "entryRulepacked_conformant_array_schema"
    // InternalDemoFkd.g:6274:1: entryRulepacked_conformant_array_schema returns [EObject current=null] : iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF ;
    public final EObject entryRulepacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepacked_conformant_array_schema = null;


        try {
            // InternalDemoFkd.g:6274:71: (iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF )
            // InternalDemoFkd.g:6275:2: iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF
            {
             newCompositeNode(grammarAccess.getPacked_conformant_array_schemaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepacked_conformant_array_schema=rulepacked_conformant_array_schema();

            state._fsp--;

             current =iv_rulepacked_conformant_array_schema; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepacked_conformant_array_schema"


    // $ANTLR start "rulepacked_conformant_array_schema"
    // InternalDemoFkd.g:6281:1: rulepacked_conformant_array_schema returns [EObject current=null] : (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_name_6_0= RULE_ID ) ) ) ;
    public final EObject rulepacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        EObject lv_bound_3_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:6287:2: ( (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_name_6_0= RULE_ID ) ) ) )
            // InternalDemoFkd.g:6288:2: (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_name_6_0= RULE_ID ) ) )
            {
            // InternalDemoFkd.g:6288:2: (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_name_6_0= RULE_ID ) ) )
            // InternalDemoFkd.g:6289:3: otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_name_6_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_61); 

            			newLeafNode(otherlv_0, grammarAccess.getPacked_conformant_array_schemaAccess().getPackedKeyword_0());
            		
            otherlv_1=(Token)match(input,71,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getPacked_conformant_array_schemaAccess().getArrayKeyword_1());
            		
            otherlv_2=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPacked_conformant_array_schemaAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalDemoFkd.g:6301:3: ( (lv_bound_3_0= rulebound_specification ) )
            // InternalDemoFkd.g:6302:4: (lv_bound_3_0= rulebound_specification )
            {
            // InternalDemoFkd.g:6302:4: (lv_bound_3_0= rulebound_specification )
            // InternalDemoFkd.g:6303:5: lv_bound_3_0= rulebound_specification
            {

            					newCompositeNode(grammarAccess.getPacked_conformant_array_schemaAccess().getBoundBound_specificationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_bound_3_0=rulebound_specification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPacked_conformant_array_schemaRule());
            					}
            					set(
            						current,
            						"bound",
            						lv_bound_3_0,
            						"org.xtext.pascal.program.DemoFkd.bound_specification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,40,FOLLOW_35); 

            			newLeafNode(otherlv_4, grammarAccess.getPacked_conformant_array_schemaAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,63,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getPacked_conformant_array_schemaAccess().getOfKeyword_5());
            		
            // InternalDemoFkd.g:6328:3: ( (lv_name_6_0= RULE_ID ) )
            // InternalDemoFkd.g:6329:4: (lv_name_6_0= RULE_ID )
            {
            // InternalDemoFkd.g:6329:4: (lv_name_6_0= RULE_ID )
            // InternalDemoFkd.g:6330:5: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_6_0, grammarAccess.getPacked_conformant_array_schemaAccess().getNameIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPacked_conformant_array_schemaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepacked_conformant_array_schema"


    // $ANTLR start "entryRulebound_specification"
    // InternalDemoFkd.g:6350:1: entryRulebound_specification returns [EObject current=null] : iv_rulebound_specification= rulebound_specification EOF ;
    public final EObject entryRulebound_specification() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebound_specification = null;


        try {
            // InternalDemoFkd.g:6350:60: (iv_rulebound_specification= rulebound_specification EOF )
            // InternalDemoFkd.g:6351:2: iv_rulebound_specification= rulebound_specification EOF
            {
             newCompositeNode(grammarAccess.getBound_specificationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulebound_specification=rulebound_specification();

            state._fsp--;

             current =iv_rulebound_specification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebound_specification"


    // $ANTLR start "rulebound_specification"
    // InternalDemoFkd.g:6357:1: rulebound_specification returns [EObject current=null] : ( ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= '..' ( (lv_final_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject rulebound_specification() throws RecognitionException {
        EObject current = null;

        Token lv_initial_0_0=null;
        Token otherlv_1=null;
        Token lv_final_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalDemoFkd.g:6363:2: ( ( ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= '..' ( (lv_final_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) ) )
            // InternalDemoFkd.g:6364:2: ( ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= '..' ( (lv_final_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )
            {
            // InternalDemoFkd.g:6364:2: ( ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= '..' ( (lv_final_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )
            // InternalDemoFkd.g:6365:3: ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= '..' ( (lv_final_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) )
            {
            // InternalDemoFkd.g:6365:3: ( (lv_initial_0_0= RULE_ID ) )
            // InternalDemoFkd.g:6366:4: (lv_initial_0_0= RULE_ID )
            {
            // InternalDemoFkd.g:6366:4: (lv_initial_0_0= RULE_ID )
            // InternalDemoFkd.g:6367:5: lv_initial_0_0= RULE_ID
            {
            lv_initial_0_0=(Token)match(input,RULE_ID,FOLLOW_44); 

            					newLeafNode(lv_initial_0_0, grammarAccess.getBound_specificationAccess().getInitialIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBound_specificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"initial",
            						lv_initial_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,69,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBound_specificationAccess().getFullStopFullStopKeyword_1());
            		
            // InternalDemoFkd.g:6387:3: ( (lv_final_2_0= RULE_ID ) )
            // InternalDemoFkd.g:6388:4: (lv_final_2_0= RULE_ID )
            {
            // InternalDemoFkd.g:6388:4: (lv_final_2_0= RULE_ID )
            // InternalDemoFkd.g:6389:5: lv_final_2_0= RULE_ID
            {
            lv_final_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_final_2_0, grammarAccess.getBound_specificationAccess().getFinalIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBound_specificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"final",
            						lv_final_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getBound_specificationAccess().getColonKeyword_3());
            		
            // InternalDemoFkd.g:6409:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalDemoFkd.g:6410:4: (lv_name_4_0= RULE_ID )
            {
            // InternalDemoFkd.g:6410:4: (lv_name_4_0= RULE_ID )
            // InternalDemoFkd.g:6411:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_4_0, grammarAccess.getBound_specificationAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBound_specificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebound_specification"


    // $ANTLR start "entryRuleunpacked_conformant_array_schema"
    // InternalDemoFkd.g:6431:1: entryRuleunpacked_conformant_array_schema returns [EObject current=null] : iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF ;
    public final EObject entryRuleunpacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpacked_conformant_array_schema = null;


        try {
            // InternalDemoFkd.g:6431:73: (iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF )
            // InternalDemoFkd.g:6432:2: iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF
            {
             newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunpacked_conformant_array_schema=ruleunpacked_conformant_array_schema();

            state._fsp--;

             current =iv_ruleunpacked_conformant_array_schema; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunpacked_conformant_array_schema"


    // $ANTLR start "ruleunpacked_conformant_array_schema"
    // InternalDemoFkd.g:6438:1: ruleunpacked_conformant_array_schema returns [EObject current=null] : (otherlv_0= 'array' otherlv_1= '[' ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruleparameter_type ) ) ) ;
    public final EObject ruleunpacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_bounds_2_0 = null;

        EObject lv_bounds_4_0 = null;

        EObject lv_type_7_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:6444:2: ( (otherlv_0= 'array' otherlv_1= '[' ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruleparameter_type ) ) ) )
            // InternalDemoFkd.g:6445:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruleparameter_type ) ) )
            {
            // InternalDemoFkd.g:6445:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruleparameter_type ) ) )
            // InternalDemoFkd.g:6446:3: otherlv_0= 'array' otherlv_1= '[' ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruleparameter_type ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getUnpacked_conformant_array_schemaAccess().getArrayKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getUnpacked_conformant_array_schemaAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalDemoFkd.g:6454:3: ( (lv_bounds_2_0= rulebound_specification ) )
            // InternalDemoFkd.g:6455:4: (lv_bounds_2_0= rulebound_specification )
            {
            // InternalDemoFkd.g:6455:4: (lv_bounds_2_0= rulebound_specification )
            // InternalDemoFkd.g:6456:5: lv_bounds_2_0= rulebound_specification
            {

            					newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBoundsBound_specificationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_62);
            lv_bounds_2_0=rulebound_specification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnpacked_conformant_array_schemaRule());
            					}
            					add(
            						current,
            						"bounds",
            						lv_bounds_2_0,
            						"org.xtext.pascal.program.DemoFkd.bound_specification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDemoFkd.g:6473:3: (otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==32) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalDemoFkd.g:6474:4: otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) )
            	    {
            	    otherlv_3=(Token)match(input,32,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getUnpacked_conformant_array_schemaAccess().getSemicolonKeyword_3_0());
            	    			
            	    // InternalDemoFkd.g:6478:4: ( (lv_bounds_4_0= rulebound_specification ) )
            	    // InternalDemoFkd.g:6479:5: (lv_bounds_4_0= rulebound_specification )
            	    {
            	    // InternalDemoFkd.g:6479:5: (lv_bounds_4_0= rulebound_specification )
            	    // InternalDemoFkd.g:6480:6: lv_bounds_4_0= rulebound_specification
            	    {

            	    						newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBoundsBound_specificationParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_62);
            	    lv_bounds_4_0=rulebound_specification();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUnpacked_conformant_array_schemaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"bounds",
            	    							lv_bounds_4_0,
            	    							"org.xtext.pascal.program.DemoFkd.bound_specification");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            otherlv_5=(Token)match(input,40,FOLLOW_35); 

            			newLeafNode(otherlv_5, grammarAccess.getUnpacked_conformant_array_schemaAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_6=(Token)match(input,63,FOLLOW_60); 

            			newLeafNode(otherlv_6, grammarAccess.getUnpacked_conformant_array_schemaAccess().getOfKeyword_5());
            		
            // InternalDemoFkd.g:6506:3: ( (lv_type_7_0= ruleparameter_type ) )
            // InternalDemoFkd.g:6507:4: (lv_type_7_0= ruleparameter_type )
            {
            // InternalDemoFkd.g:6507:4: (lv_type_7_0= ruleparameter_type )
            // InternalDemoFkd.g:6508:5: lv_type_7_0= ruleparameter_type
            {

            					newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getTypeParameter_typeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_7_0=ruleparameter_type();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnpacked_conformant_array_schemaRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_7_0,
            						"org.xtext.pascal.program.DemoFkd.parameter_type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunpacked_conformant_array_schema"


    // $ANTLR start "entryRulevariable_parameter_section"
    // InternalDemoFkd.g:6529:1: entryRulevariable_parameter_section returns [EObject current=null] : iv_rulevariable_parameter_section= rulevariable_parameter_section EOF ;
    public final EObject entryRulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_parameter_section = null;


        try {
            // InternalDemoFkd.g:6529:67: (iv_rulevariable_parameter_section= rulevariable_parameter_section EOF )
            // InternalDemoFkd.g:6530:2: iv_rulevariable_parameter_section= rulevariable_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getVariable_parameter_sectionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable_parameter_section=rulevariable_parameter_section();

            state._fsp--;

             current =iv_rulevariable_parameter_section; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable_parameter_section"


    // $ANTLR start "rulevariable_parameter_section"
    // InternalDemoFkd.g:6536:1: rulevariable_parameter_section returns [EObject current=null] : (otherlv_0= 'var' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) ) ;
    public final EObject rulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifiers_1_0 = null;

        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:6542:2: ( (otherlv_0= 'var' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) ) )
            // InternalDemoFkd.g:6543:2: (otherlv_0= 'var' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) )
            {
            // InternalDemoFkd.g:6543:2: (otherlv_0= 'var' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) )
            // InternalDemoFkd.g:6544:3: otherlv_0= 'var' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVariable_parameter_sectionAccess().getVarKeyword_0());
            		
            // InternalDemoFkd.g:6548:3: ( (lv_identifiers_1_0= ruleidentifier_list ) )
            // InternalDemoFkd.g:6549:4: (lv_identifiers_1_0= ruleidentifier_list )
            {
            // InternalDemoFkd.g:6549:4: (lv_identifiers_1_0= ruleidentifier_list )
            // InternalDemoFkd.g:6550:5: lv_identifiers_1_0= ruleidentifier_list
            {

            					newCompositeNode(grammarAccess.getVariable_parameter_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_identifiers_1_0=ruleidentifier_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariable_parameter_sectionRule());
            					}
            					set(
            						current,
            						"identifiers",
            						lv_identifiers_1_0,
            						"org.xtext.pascal.program.DemoFkd.identifier_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_60); 

            			newLeafNode(otherlv_2, grammarAccess.getVariable_parameter_sectionAccess().getColonKeyword_2());
            		
            // InternalDemoFkd.g:6571:3: ( (lv_type_3_0= ruleparameter_type ) )
            // InternalDemoFkd.g:6572:4: (lv_type_3_0= ruleparameter_type )
            {
            // InternalDemoFkd.g:6572:4: (lv_type_3_0= ruleparameter_type )
            // InternalDemoFkd.g:6573:5: lv_type_3_0= ruleparameter_type
            {

            					newCompositeNode(grammarAccess.getVariable_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleparameter_type();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariable_parameter_sectionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.pascal.program.DemoFkd.parameter_type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_parameter_section"


    // $ANTLR start "entryRulefunction_heading"
    // InternalDemoFkd.g:6594:1: entryRulefunction_heading returns [EObject current=null] : iv_rulefunction_heading= rulefunction_heading EOF ;
    public final EObject entryRulefunction_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_heading = null;


        try {
            // InternalDemoFkd.g:6594:57: (iv_rulefunction_heading= rulefunction_heading EOF )
            // InternalDemoFkd.g:6595:2: iv_rulefunction_heading= rulefunction_heading EOF
            {
             newCompositeNode(grammarAccess.getFunction_headingRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunction_heading=rulefunction_heading();

            state._fsp--;

             current =iv_rulefunction_heading; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunction_heading"


    // $ANTLR start "rulefunction_heading"
    // InternalDemoFkd.g:6601:1: rulefunction_heading returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) ) ;
    public final EObject rulefunction_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_returnType_4_0=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:6607:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) ) )
            // InternalDemoFkd.g:6608:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) )
            {
            // InternalDemoFkd.g:6608:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) )
            // InternalDemoFkd.g:6609:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,79,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFunction_headingAccess().getFunctionKeyword_0());
            		
            // InternalDemoFkd.g:6613:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDemoFkd.g:6614:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDemoFkd.g:6614:4: (lv_name_1_0= RULE_ID )
            // InternalDemoFkd.g:6615:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_63); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunction_headingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunction_headingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDemoFkd.g:6631:3: ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==30) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalDemoFkd.g:6632:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    {
                    // InternalDemoFkd.g:6632:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    // InternalDemoFkd.g:6633:5: lv_parameters_2_0= ruleformal_parameter_list
                    {

                    					newCompositeNode(grammarAccess.getFunction_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_19);
                    lv_parameters_2_0=ruleformal_parameter_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunction_headingRule());
                    					}
                    					set(
                    						current,
                    						"parameters",
                    						lv_parameters_2_0,
                    						"org.xtext.pascal.program.DemoFkd.formal_parameter_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getFunction_headingAccess().getColonKeyword_3());
            		
            // InternalDemoFkd.g:6654:3: ( (lv_returnType_4_0= RULE_ID ) )
            // InternalDemoFkd.g:6655:4: (lv_returnType_4_0= RULE_ID )
            {
            // InternalDemoFkd.g:6655:4: (lv_returnType_4_0= RULE_ID )
            // InternalDemoFkd.g:6656:5: lv_returnType_4_0= RULE_ID
            {
            lv_returnType_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_returnType_4_0, grammarAccess.getFunction_headingAccess().getReturnTypeIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunction_headingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"returnType",
            						lv_returnType_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunction_heading"


    // $ANTLR start "entryRulefunction_declaration"
    // InternalDemoFkd.g:6676:1: entryRulefunction_declaration returns [EObject current=null] : iv_rulefunction_declaration= rulefunction_declaration EOF ;
    public final EObject entryRulefunction_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_declaration = null;


        try {
            // InternalDemoFkd.g:6676:61: (iv_rulefunction_declaration= rulefunction_declaration EOF )
            // InternalDemoFkd.g:6677:2: iv_rulefunction_declaration= rulefunction_declaration EOF
            {
             newCompositeNode(grammarAccess.getFunction_declarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunction_declaration=rulefunction_declaration();

            state._fsp--;

             current =iv_rulefunction_declaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunction_declaration"


    // $ANTLR start "rulefunction_declaration"
    // InternalDemoFkd.g:6683:1: rulefunction_declaration returns [EObject current=null] : ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) ) ;
    public final EObject rulefunction_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_forward_3_0=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalDemoFkd.g:6689:2: ( ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) ) )
            // InternalDemoFkd.g:6690:2: ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) )
            {
            // InternalDemoFkd.g:6690:2: ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) )
            // InternalDemoFkd.g:6691:3: ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) )
            {
            // InternalDemoFkd.g:6691:3: ( (lv_heading_0_0= rulefunction_heading ) )
            // InternalDemoFkd.g:6692:4: (lv_heading_0_0= rulefunction_heading )
            {
            // InternalDemoFkd.g:6692:4: (lv_heading_0_0= rulefunction_heading )
            // InternalDemoFkd.g:6693:5: lv_heading_0_0= rulefunction_heading
            {

            					newCompositeNode(grammarAccess.getFunction_declarationAccess().getHeadingFunction_headingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_heading_0_0=rulefunction_heading();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunction_declarationRule());
            					}
            					set(
            						current,
            						"heading",
            						lv_heading_0_0,
            						"org.xtext.pascal.program.DemoFkd.function_heading");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getFunction_declarationAccess().getSemicolonKeyword_1());
            		
            // InternalDemoFkd.g:6714:3: ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( ((LA84_0>=34 && LA84_0<=35)||(LA84_0>=66 && LA84_0<=68)||LA84_0==76||(LA84_0>=78 && LA84_0<=79)) ) {
                alt84=1;
            }
            else if ( (LA84_0==77) ) {
                alt84=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalDemoFkd.g:6715:4: ( (lv_block_2_0= ruleblock ) )
                    {
                    // InternalDemoFkd.g:6715:4: ( (lv_block_2_0= ruleblock ) )
                    // InternalDemoFkd.g:6716:5: (lv_block_2_0= ruleblock )
                    {
                    // InternalDemoFkd.g:6716:5: (lv_block_2_0= ruleblock )
                    // InternalDemoFkd.g:6717:6: lv_block_2_0= ruleblock
                    {

                    						newCompositeNode(grammarAccess.getFunction_declarationAccess().getBlockBlockParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_block_2_0=ruleblock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunction_declarationRule());
                    						}
                    						set(
                    							current,
                    							"block",
                    							lv_block_2_0,
                    							"org.xtext.pascal.program.DemoFkd.block");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:6735:4: ( (lv_forward_3_0= 'forward' ) )
                    {
                    // InternalDemoFkd.g:6735:4: ( (lv_forward_3_0= 'forward' ) )
                    // InternalDemoFkd.g:6736:5: (lv_forward_3_0= 'forward' )
                    {
                    // InternalDemoFkd.g:6736:5: (lv_forward_3_0= 'forward' )
                    // InternalDemoFkd.g:6737:6: lv_forward_3_0= 'forward'
                    {
                    lv_forward_3_0=(Token)match(input,77,FOLLOW_2); 

                    						newLeafNode(lv_forward_3_0, grammarAccess.getFunction_declarationAccess().getForwardForwardKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunction_declarationRule());
                    						}
                    						setWithLastConsumed(current, "forward", lv_forward_3_0 != null, "forward");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunction_declaration"

    // Delegated rules


    protected DFA29 dfa29 = new DFA29(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\1\12\12\uffff";
    static final String dfa_3s = "\1\4\1\6\12\uffff";
    static final String dfa_4s = "\1\63\1\77\12\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\12\1\1\1\10";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\2\3\uffff\1\3\2\2\21\uffff\1\10\10\uffff\1\4\10\uffff\1\5\1\6\1\7\1\11",
            "\4\12\1\uffff\1\12\16\uffff\1\12\3\uffff\1\13\3\12\2\uffff\1\12\2\uffff\11\12\5\uffff\1\12\1\uffff\1\12\1\uffff\2\12\1\uffff\2\12\1\uffff\1\12",
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

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1813:2: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000028800002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000002A800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000C00000000L,0x000000000000D01CL});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x4950000800000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000F008040001D70L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000028004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000C0000000082L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000942L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000E00000000202L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000F018040001D70L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000F0080C0001D70L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0007000000001D70L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001100000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000001870L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0020000200000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0007020040003D70L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0007000040003D70L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000010200000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x4000001000000010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000001000004000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x4000000000000010L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x4000000080000010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000C00000000L,0x000000000000F01CL});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000010L,0x000000000000D000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000010L,0x00000000000000C0L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000010100000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000002040000000L});

}