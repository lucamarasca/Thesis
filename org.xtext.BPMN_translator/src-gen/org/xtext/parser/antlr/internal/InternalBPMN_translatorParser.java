package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.BPMN_translatorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBPMN_translatorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HEAD", "RULE_STRING", "RULE_BODY", "RULE_KEYWORDS", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<?'", "'version='", "'encoding='", "'?>'", "'TRANSLATE'", "'{'", "'}'", "'<'", "':'", "'='", "'>'", "'/>'", "'</'", "'DEVICE'", "'NETWORK_PROTOCOL'", "'NAME'", "'CLIENT_MAC'", "'CLIENT_IP'", "'SERVER_IP'", "'PROTOCOL_DEVICE'", "'SENSOR'", "'TYPE'", "'PINS'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int RULE_KEYWORDS=7;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_HEAD=4;
    public static final int RULE_BODY=6;
    public static final int RULE_ID=9;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBPMN_translatorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBPMN_translatorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBPMN_translatorParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBPMN_translator.g"; }



     	private BPMN_translatorGrammarAccess grammarAccess;

        public InternalBPMN_translatorParser(TokenStream input, BPMN_translatorGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected BPMN_translatorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalBPMN_translator.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalBPMN_translator.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalBPMN_translator.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBPMN_translator.g:71:1: ruleModel returns [EObject current=null] : ( (lv_model_0_0= ruleXml ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_model_0_0 = null;



        	enterRule();

        try {
            // InternalBPMN_translator.g:77:2: ( ( (lv_model_0_0= ruleXml ) ) )
            // InternalBPMN_translator.g:78:2: ( (lv_model_0_0= ruleXml ) )
            {
            // InternalBPMN_translator.g:78:2: ( (lv_model_0_0= ruleXml ) )
            // InternalBPMN_translator.g:79:3: (lv_model_0_0= ruleXml )
            {
            // InternalBPMN_translator.g:79:3: (lv_model_0_0= ruleXml )
            // InternalBPMN_translator.g:80:4: lv_model_0_0= ruleXml
            {

            				newCompositeNode(grammarAccess.getModelAccess().getModelXmlParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_model_0_0=ruleXml();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				add(
            					current,
            					"model",
            					lv_model_0_0,
            					"org.xtext.BPMN_translator.Xml");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleXml"
    // InternalBPMN_translator.g:100:1: entryRuleXml returns [EObject current=null] : iv_ruleXml= ruleXml EOF ;
    public final EObject entryRuleXml() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXml = null;


        try {
            // InternalBPMN_translator.g:100:44: (iv_ruleXml= ruleXml EOF )
            // InternalBPMN_translator.g:101:2: iv_ruleXml= ruleXml EOF
            {
             newCompositeNode(grammarAccess.getXmlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXml=ruleXml();

            state._fsp--;

             current =iv_ruleXml; 
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
    // $ANTLR end "entryRuleXml"


    // $ANTLR start "ruleXml"
    // InternalBPMN_translator.g:107:1: ruleXml returns [EObject current=null] : ( () ( ruleprolog )? ( (lv_prova_2_0= ruleelement ) )* ) ;
    public final EObject ruleXml() throws RecognitionException {
        EObject current = null;

        EObject lv_prova_2_0 = null;



        	enterRule();

        try {
            // InternalBPMN_translator.g:113:2: ( ( () ( ruleprolog )? ( (lv_prova_2_0= ruleelement ) )* ) )
            // InternalBPMN_translator.g:114:2: ( () ( ruleprolog )? ( (lv_prova_2_0= ruleelement ) )* )
            {
            // InternalBPMN_translator.g:114:2: ( () ( ruleprolog )? ( (lv_prova_2_0= ruleelement ) )* )
            // InternalBPMN_translator.g:115:3: () ( ruleprolog )? ( (lv_prova_2_0= ruleelement ) )*
            {
            // InternalBPMN_translator.g:115:3: ()
            // InternalBPMN_translator.g:116:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXmlAccess().getXmlAction_0(),
            					current);
            			

            }

            // InternalBPMN_translator.g:122:3: ( ruleprolog )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalBPMN_translator.g:123:4: ruleprolog
                    {

                    				newCompositeNode(grammarAccess.getXmlAccess().getPrologParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_3);
                    ruleprolog();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalBPMN_translator.g:131:3: ( (lv_prova_2_0= ruleelement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBPMN_translator.g:132:4: (lv_prova_2_0= ruleelement )
            	    {
            	    // InternalBPMN_translator.g:132:4: (lv_prova_2_0= ruleelement )
            	    // InternalBPMN_translator.g:133:5: lv_prova_2_0= ruleelement
            	    {

            	    					newCompositeNode(grammarAccess.getXmlAccess().getProvaElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_prova_2_0=ruleelement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getXmlRule());
            	    					}
            	    					add(
            	    						current,
            	    						"prova",
            	    						lv_prova_2_0,
            	    						"org.xtext.BPMN_translator.element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleXml"


    // $ANTLR start "entryRuleprolog"
    // InternalBPMN_translator.g:154:1: entryRuleprolog returns [String current=null] : iv_ruleprolog= ruleprolog EOF ;
    public final String entryRuleprolog() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleprolog = null;


        try {
            // InternalBPMN_translator.g:154:46: (iv_ruleprolog= ruleprolog EOF )
            // InternalBPMN_translator.g:155:2: iv_ruleprolog= ruleprolog EOF
            {
             newCompositeNode(grammarAccess.getPrologRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprolog=ruleprolog();

            state._fsp--;

             current =iv_ruleprolog.getText(); 
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
    // $ANTLR end "entryRuleprolog"


    // $ANTLR start "ruleprolog"
    // InternalBPMN_translator.g:161:1: ruleprolog returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<?' this_HEAD_1= RULE_HEAD kw= 'version=' this_STRING_3= RULE_STRING kw= 'encoding=' this_STRING_5= RULE_STRING kw= '?>' ) ;
    public final AntlrDatatypeRuleToken ruleprolog() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_HEAD_1=null;
        Token this_STRING_3=null;
        Token this_STRING_5=null;


        	enterRule();

        try {
            // InternalBPMN_translator.g:167:2: ( (kw= '<?' this_HEAD_1= RULE_HEAD kw= 'version=' this_STRING_3= RULE_STRING kw= 'encoding=' this_STRING_5= RULE_STRING kw= '?>' ) )
            // InternalBPMN_translator.g:168:2: (kw= '<?' this_HEAD_1= RULE_HEAD kw= 'version=' this_STRING_3= RULE_STRING kw= 'encoding=' this_STRING_5= RULE_STRING kw= '?>' )
            {
            // InternalBPMN_translator.g:168:2: (kw= '<?' this_HEAD_1= RULE_HEAD kw= 'version=' this_STRING_3= RULE_STRING kw= 'encoding=' this_STRING_5= RULE_STRING kw= '?>' )
            // InternalBPMN_translator.g:169:3: kw= '<?' this_HEAD_1= RULE_HEAD kw= 'version=' this_STRING_3= RULE_STRING kw= 'encoding=' this_STRING_5= RULE_STRING kw= '?>'
            {
            kw=(Token)match(input,14,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPrologAccess().getLessThanSignQuestionMarkKeyword_0());
            		
            this_HEAD_1=(Token)match(input,RULE_HEAD,FOLLOW_5); 

            			current.merge(this_HEAD_1);
            		

            			newLeafNode(this_HEAD_1, grammarAccess.getPrologAccess().getHEADTerminalRuleCall_1());
            		
            kw=(Token)match(input,15,FOLLOW_6); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPrologAccess().getVersionKeyword_2());
            		
            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_7); 

            			current.merge(this_STRING_3);
            		

            			newLeafNode(this_STRING_3, grammarAccess.getPrologAccess().getSTRINGTerminalRuleCall_3());
            		
            kw=(Token)match(input,16,FOLLOW_6); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPrologAccess().getEncodingKeyword_4());
            		
            this_STRING_5=(Token)match(input,RULE_STRING,FOLLOW_8); 

            			current.merge(this_STRING_5);
            		

            			newLeafNode(this_STRING_5, grammarAccess.getPrologAccess().getSTRINGTerminalRuleCall_5());
            		
            kw=(Token)match(input,17,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPrologAccess().getQuestionMarkGreaterThanSignKeyword_6());
            		

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
    // $ANTLR end "ruleprolog"


    // $ANTLR start "entryRuleelement"
    // InternalBPMN_translator.g:214:1: entryRuleelement returns [EObject current=null] : iv_ruleelement= ruleelement EOF ;
    public final EObject entryRuleelement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleelement = null;


        try {
            // InternalBPMN_translator.g:214:48: (iv_ruleelement= ruleelement EOF )
            // InternalBPMN_translator.g:215:2: iv_ruleelement= ruleelement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleelement=ruleelement();

            state._fsp--;

             current =iv_ruleelement; 
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
    // $ANTLR end "entryRuleelement"


    // $ANTLR start "ruleelement"
    // InternalBPMN_translator.g:221:1: ruleelement returns [EObject current=null] : ( ( ( (lv_open_0_0= ruleOpen ) ) ( (lv_contents_1_0= rulecontent ) ) ( (lv_close_tag_2_0= ruleClose ) ) ) | ( () ( (lv_singleton_tag_4_0= ruleSingleton ) ) ) ) ;
    public final EObject ruleelement() throws RecognitionException {
        EObject current = null;

        EObject lv_open_0_0 = null;

        EObject lv_contents_1_0 = null;

        EObject lv_close_tag_2_0 = null;

        EObject lv_singleton_tag_4_0 = null;



        	enterRule();

        try {
            // InternalBPMN_translator.g:227:2: ( ( ( ( (lv_open_0_0= ruleOpen ) ) ( (lv_contents_1_0= rulecontent ) ) ( (lv_close_tag_2_0= ruleClose ) ) ) | ( () ( (lv_singleton_tag_4_0= ruleSingleton ) ) ) ) )
            // InternalBPMN_translator.g:228:2: ( ( ( (lv_open_0_0= ruleOpen ) ) ( (lv_contents_1_0= rulecontent ) ) ( (lv_close_tag_2_0= ruleClose ) ) ) | ( () ( (lv_singleton_tag_4_0= ruleSingleton ) ) ) )
            {
            // InternalBPMN_translator.g:228:2: ( ( ( (lv_open_0_0= ruleOpen ) ) ( (lv_contents_1_0= rulecontent ) ) ( (lv_close_tag_2_0= ruleClose ) ) ) | ( () ( (lv_singleton_tag_4_0= ruleSingleton ) ) ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalBPMN_translator.g:229:3: ( ( (lv_open_0_0= ruleOpen ) ) ( (lv_contents_1_0= rulecontent ) ) ( (lv_close_tag_2_0= ruleClose ) ) )
                    {
                    // InternalBPMN_translator.g:229:3: ( ( (lv_open_0_0= ruleOpen ) ) ( (lv_contents_1_0= rulecontent ) ) ( (lv_close_tag_2_0= ruleClose ) ) )
                    // InternalBPMN_translator.g:230:4: ( (lv_open_0_0= ruleOpen ) ) ( (lv_contents_1_0= rulecontent ) ) ( (lv_close_tag_2_0= ruleClose ) )
                    {
                    // InternalBPMN_translator.g:230:4: ( (lv_open_0_0= ruleOpen ) )
                    // InternalBPMN_translator.g:231:5: (lv_open_0_0= ruleOpen )
                    {
                    // InternalBPMN_translator.g:231:5: (lv_open_0_0= ruleOpen )
                    // InternalBPMN_translator.g:232:6: lv_open_0_0= ruleOpen
                    {

                    						newCompositeNode(grammarAccess.getElementAccess().getOpenOpenParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_open_0_0=ruleOpen();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementRule());
                    						}
                    						add(
                    							current,
                    							"open",
                    							lv_open_0_0,
                    							"org.xtext.BPMN_translator.Open");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBPMN_translator.g:249:4: ( (lv_contents_1_0= rulecontent ) )
                    // InternalBPMN_translator.g:250:5: (lv_contents_1_0= rulecontent )
                    {
                    // InternalBPMN_translator.g:250:5: (lv_contents_1_0= rulecontent )
                    // InternalBPMN_translator.g:251:6: lv_contents_1_0= rulecontent
                    {

                    						newCompositeNode(grammarAccess.getElementAccess().getContentsContentParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_contents_1_0=rulecontent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementRule());
                    						}
                    						add(
                    							current,
                    							"contents",
                    							lv_contents_1_0,
                    							"org.xtext.BPMN_translator.content");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBPMN_translator.g:268:4: ( (lv_close_tag_2_0= ruleClose ) )
                    // InternalBPMN_translator.g:269:5: (lv_close_tag_2_0= ruleClose )
                    {
                    // InternalBPMN_translator.g:269:5: (lv_close_tag_2_0= ruleClose )
                    // InternalBPMN_translator.g:270:6: lv_close_tag_2_0= ruleClose
                    {

                    						newCompositeNode(grammarAccess.getElementAccess().getClose_tagCloseParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_close_tag_2_0=ruleClose();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementRule());
                    						}
                    						add(
                    							current,
                    							"close_tag",
                    							lv_close_tag_2_0,
                    							"org.xtext.BPMN_translator.Close");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:289:3: ( () ( (lv_singleton_tag_4_0= ruleSingleton ) ) )
                    {
                    // InternalBPMN_translator.g:289:3: ( () ( (lv_singleton_tag_4_0= ruleSingleton ) ) )
                    // InternalBPMN_translator.g:290:4: () ( (lv_singleton_tag_4_0= ruleSingleton ) )
                    {
                    // InternalBPMN_translator.g:290:4: ()
                    // InternalBPMN_translator.g:291:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getElementAccess().getElement_valueAction_1_0(),
                    						current);
                    				

                    }

                    // InternalBPMN_translator.g:297:4: ( (lv_singleton_tag_4_0= ruleSingleton ) )
                    // InternalBPMN_translator.g:298:5: (lv_singleton_tag_4_0= ruleSingleton )
                    {
                    // InternalBPMN_translator.g:298:5: (lv_singleton_tag_4_0= ruleSingleton )
                    // InternalBPMN_translator.g:299:6: lv_singleton_tag_4_0= ruleSingleton
                    {

                    						newCompositeNode(grammarAccess.getElementAccess().getSingleton_tagSingletonParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_singleton_tag_4_0=ruleSingleton();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementRule());
                    						}
                    						add(
                    							current,
                    							"singleton_tag",
                    							lv_singleton_tag_4_0,
                    							"org.xtext.BPMN_translator.Singleton");
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
    // $ANTLR end "ruleelement"


    // $ANTLR start "entryRulecontent"
    // InternalBPMN_translator.g:321:1: entryRulecontent returns [EObject current=null] : iv_rulecontent= rulecontent EOF ;
    public final EObject entryRulecontent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecontent = null;


        try {
            // InternalBPMN_translator.g:321:48: (iv_rulecontent= rulecontent EOF )
            // InternalBPMN_translator.g:322:2: iv_rulecontent= rulecontent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecontent=rulecontent();

            state._fsp--;

             current =iv_rulecontent; 
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
    // $ANTLR end "entryRulecontent"


    // $ANTLR start "rulecontent"
    // InternalBPMN_translator.g:328:1: rulecontent returns [EObject current=null] : ( () ( (otherlv_1= 'TRANSLATE' otherlv_2= '{' ( (lv_codex_3_0= rulecodex ) ) otherlv_4= '}' ) | ( (lv_element_5_0= ruleelement ) ) | ( (lv_body_6_0= RULE_BODY ) ) | ( (lv_keywords_7_0= RULE_KEYWORDS ) ) | ( (lv_data_8_0= RULE_STRING ) ) )* ) ;
    public final EObject rulecontent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_body_6_0=null;
        Token lv_keywords_7_0=null;
        Token lv_data_8_0=null;
        EObject lv_codex_3_0 = null;

        EObject lv_element_5_0 = null;



        	enterRule();

        try {
            // InternalBPMN_translator.g:334:2: ( ( () ( (otherlv_1= 'TRANSLATE' otherlv_2= '{' ( (lv_codex_3_0= rulecodex ) ) otherlv_4= '}' ) | ( (lv_element_5_0= ruleelement ) ) | ( (lv_body_6_0= RULE_BODY ) ) | ( (lv_keywords_7_0= RULE_KEYWORDS ) ) | ( (lv_data_8_0= RULE_STRING ) ) )* ) )
            // InternalBPMN_translator.g:335:2: ( () ( (otherlv_1= 'TRANSLATE' otherlv_2= '{' ( (lv_codex_3_0= rulecodex ) ) otherlv_4= '}' ) | ( (lv_element_5_0= ruleelement ) ) | ( (lv_body_6_0= RULE_BODY ) ) | ( (lv_keywords_7_0= RULE_KEYWORDS ) ) | ( (lv_data_8_0= RULE_STRING ) ) )* )
            {
            // InternalBPMN_translator.g:335:2: ( () ( (otherlv_1= 'TRANSLATE' otherlv_2= '{' ( (lv_codex_3_0= rulecodex ) ) otherlv_4= '}' ) | ( (lv_element_5_0= ruleelement ) ) | ( (lv_body_6_0= RULE_BODY ) ) | ( (lv_keywords_7_0= RULE_KEYWORDS ) ) | ( (lv_data_8_0= RULE_STRING ) ) )* )
            // InternalBPMN_translator.g:336:3: () ( (otherlv_1= 'TRANSLATE' otherlv_2= '{' ( (lv_codex_3_0= rulecodex ) ) otherlv_4= '}' ) | ( (lv_element_5_0= ruleelement ) ) | ( (lv_body_6_0= RULE_BODY ) ) | ( (lv_keywords_7_0= RULE_KEYWORDS ) ) | ( (lv_data_8_0= RULE_STRING ) ) )*
            {
            // InternalBPMN_translator.g:336:3: ()
            // InternalBPMN_translator.g:337:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContentAccess().getContentAction_0(),
            					current);
            			

            }

            // InternalBPMN_translator.g:343:3: ( (otherlv_1= 'TRANSLATE' otherlv_2= '{' ( (lv_codex_3_0= rulecodex ) ) otherlv_4= '}' ) | ( (lv_element_5_0= ruleelement ) ) | ( (lv_body_6_0= RULE_BODY ) ) | ( (lv_keywords_7_0= RULE_KEYWORDS ) ) | ( (lv_data_8_0= RULE_STRING ) ) )*
            loop4:
            do {
                int alt4=6;
                switch ( input.LA(1) ) {
                case 18:
                    {
                    alt4=1;
                    }
                    break;
                case 21:
                    {
                    alt4=2;
                    }
                    break;
                case RULE_BODY:
                    {
                    alt4=3;
                    }
                    break;
                case RULE_KEYWORDS:
                    {
                    alt4=4;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt4=5;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // InternalBPMN_translator.g:344:4: (otherlv_1= 'TRANSLATE' otherlv_2= '{' ( (lv_codex_3_0= rulecodex ) ) otherlv_4= '}' )
            	    {
            	    // InternalBPMN_translator.g:344:4: (otherlv_1= 'TRANSLATE' otherlv_2= '{' ( (lv_codex_3_0= rulecodex ) ) otherlv_4= '}' )
            	    // InternalBPMN_translator.g:345:5: otherlv_1= 'TRANSLATE' otherlv_2= '{' ( (lv_codex_3_0= rulecodex ) ) otherlv_4= '}'
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_10); 

            	    					newLeafNode(otherlv_1, grammarAccess.getContentAccess().getTRANSLATEKeyword_1_0_0());
            	    				
            	    otherlv_2=(Token)match(input,19,FOLLOW_11); 

            	    					newLeafNode(otherlv_2, grammarAccess.getContentAccess().getLeftCurlyBracketKeyword_1_0_1());
            	    				
            	    // InternalBPMN_translator.g:353:5: ( (lv_codex_3_0= rulecodex ) )
            	    // InternalBPMN_translator.g:354:6: (lv_codex_3_0= rulecodex )
            	    {
            	    // InternalBPMN_translator.g:354:6: (lv_codex_3_0= rulecodex )
            	    // InternalBPMN_translator.g:355:7: lv_codex_3_0= rulecodex
            	    {

            	    							newCompositeNode(grammarAccess.getContentAccess().getCodexCodexParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_12);
            	    lv_codex_3_0=rulecodex();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getContentRule());
            	    							}
            	    							add(
            	    								current,
            	    								"codex",
            	    								lv_codex_3_0,
            	    								"org.xtext.BPMN_translator.codex");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    otherlv_4=(Token)match(input,20,FOLLOW_13); 

            	    					newLeafNode(otherlv_4, grammarAccess.getContentAccess().getRightCurlyBracketKeyword_1_0_3());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBPMN_translator.g:378:4: ( (lv_element_5_0= ruleelement ) )
            	    {
            	    // InternalBPMN_translator.g:378:4: ( (lv_element_5_0= ruleelement ) )
            	    // InternalBPMN_translator.g:379:5: (lv_element_5_0= ruleelement )
            	    {
            	    // InternalBPMN_translator.g:379:5: (lv_element_5_0= ruleelement )
            	    // InternalBPMN_translator.g:380:6: lv_element_5_0= ruleelement
            	    {

            	    						newCompositeNode(grammarAccess.getContentAccess().getElementElementParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_element_5_0=ruleelement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getContentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"element",
            	    							lv_element_5_0,
            	    							"org.xtext.BPMN_translator.element");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBPMN_translator.g:398:4: ( (lv_body_6_0= RULE_BODY ) )
            	    {
            	    // InternalBPMN_translator.g:398:4: ( (lv_body_6_0= RULE_BODY ) )
            	    // InternalBPMN_translator.g:399:5: (lv_body_6_0= RULE_BODY )
            	    {
            	    // InternalBPMN_translator.g:399:5: (lv_body_6_0= RULE_BODY )
            	    // InternalBPMN_translator.g:400:6: lv_body_6_0= RULE_BODY
            	    {
            	    lv_body_6_0=(Token)match(input,RULE_BODY,FOLLOW_13); 

            	    						newLeafNode(lv_body_6_0, grammarAccess.getContentAccess().getBodyBODYTerminalRuleCall_1_2_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getContentRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"body",
            	    							lv_body_6_0,
            	    							"org.xtext.BPMN_translator.BODY");
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalBPMN_translator.g:417:4: ( (lv_keywords_7_0= RULE_KEYWORDS ) )
            	    {
            	    // InternalBPMN_translator.g:417:4: ( (lv_keywords_7_0= RULE_KEYWORDS ) )
            	    // InternalBPMN_translator.g:418:5: (lv_keywords_7_0= RULE_KEYWORDS )
            	    {
            	    // InternalBPMN_translator.g:418:5: (lv_keywords_7_0= RULE_KEYWORDS )
            	    // InternalBPMN_translator.g:419:6: lv_keywords_7_0= RULE_KEYWORDS
            	    {
            	    lv_keywords_7_0=(Token)match(input,RULE_KEYWORDS,FOLLOW_13); 

            	    						newLeafNode(lv_keywords_7_0, grammarAccess.getContentAccess().getKeywordsKEYWORDSTerminalRuleCall_1_3_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getContentRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"keywords",
            	    							lv_keywords_7_0,
            	    							"org.xtext.BPMN_translator.KEYWORDS");
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalBPMN_translator.g:436:4: ( (lv_data_8_0= RULE_STRING ) )
            	    {
            	    // InternalBPMN_translator.g:436:4: ( (lv_data_8_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:437:5: (lv_data_8_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:437:5: (lv_data_8_0= RULE_STRING )
            	    // InternalBPMN_translator.g:438:6: lv_data_8_0= RULE_STRING
            	    {
            	    lv_data_8_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    						newLeafNode(lv_data_8_0, grammarAccess.getContentAccess().getDataSTRINGTerminalRuleCall_1_4_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getContentRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"data",
            	    							lv_data_8_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


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
    // $ANTLR end "rulecontent"


    // $ANTLR start "entryRuleOpen"
    // InternalBPMN_translator.g:459:1: entryRuleOpen returns [EObject current=null] : iv_ruleOpen= ruleOpen EOF ;
    public final EObject entryRuleOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpen = null;


        try {
            // InternalBPMN_translator.g:459:45: (iv_ruleOpen= ruleOpen EOF )
            // InternalBPMN_translator.g:460:2: iv_ruleOpen= ruleOpen EOF
            {
             newCompositeNode(grammarAccess.getOpenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpen=ruleOpen();

            state._fsp--;

             current =iv_ruleOpen; 
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
    // $ANTLR end "entryRuleOpen"


    // $ANTLR start "ruleOpen"
    // InternalBPMN_translator.g:466:1: ruleOpen returns [EObject current=null] : (otherlv_0= '<' ( (lv_head_1_0= RULE_HEAD ) ) otherlv_2= ':' ( (lv_keywords_3_0= RULE_KEYWORDS ) ) ( ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' ) | ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* otherlv_10= '>' ) ;
    public final EObject ruleOpen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_head_1_0=null;
        Token otherlv_2=null;
        Token lv_keywords_3_0=null;
        Token lv_head1_4_0=null;
        Token otherlv_5=null;
        Token lv_head1_6_0=null;
        Token lv_keywords1_7_0=null;
        Token otherlv_8=null;
        Token lv_value_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalBPMN_translator.g:472:2: ( (otherlv_0= '<' ( (lv_head_1_0= RULE_HEAD ) ) otherlv_2= ':' ( (lv_keywords_3_0= RULE_KEYWORDS ) ) ( ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' ) | ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* otherlv_10= '>' ) )
            // InternalBPMN_translator.g:473:2: (otherlv_0= '<' ( (lv_head_1_0= RULE_HEAD ) ) otherlv_2= ':' ( (lv_keywords_3_0= RULE_KEYWORDS ) ) ( ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' ) | ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* otherlv_10= '>' )
            {
            // InternalBPMN_translator.g:473:2: (otherlv_0= '<' ( (lv_head_1_0= RULE_HEAD ) ) otherlv_2= ':' ( (lv_keywords_3_0= RULE_KEYWORDS ) ) ( ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' ) | ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* otherlv_10= '>' )
            // InternalBPMN_translator.g:474:3: otherlv_0= '<' ( (lv_head_1_0= RULE_HEAD ) ) otherlv_2= ':' ( (lv_keywords_3_0= RULE_KEYWORDS ) ) ( ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' ) | ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* otherlv_10= '>'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOpenAccess().getLessThanSignKeyword_0());
            		
            // InternalBPMN_translator.g:478:3: ( (lv_head_1_0= RULE_HEAD ) )
            // InternalBPMN_translator.g:479:4: (lv_head_1_0= RULE_HEAD )
            {
            // InternalBPMN_translator.g:479:4: (lv_head_1_0= RULE_HEAD )
            // InternalBPMN_translator.g:480:5: lv_head_1_0= RULE_HEAD
            {
            lv_head_1_0=(Token)match(input,RULE_HEAD,FOLLOW_14); 

            					newLeafNode(lv_head_1_0, grammarAccess.getOpenAccess().getHeadHEADTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpenRule());
            					}
            					addWithLastConsumed(
            						current,
            						"head",
            						lv_head_1_0,
            						"org.xtext.BPMN_translator.HEAD");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getOpenAccess().getColonKeyword_2());
            		
            // InternalBPMN_translator.g:500:3: ( (lv_keywords_3_0= RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:501:4: (lv_keywords_3_0= RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:501:4: (lv_keywords_3_0= RULE_KEYWORDS )
            // InternalBPMN_translator.g:502:5: lv_keywords_3_0= RULE_KEYWORDS
            {
            lv_keywords_3_0=(Token)match(input,RULE_KEYWORDS,FOLLOW_16); 

            					newLeafNode(lv_keywords_3_0, grammarAccess.getOpenAccess().getKeywordsKEYWORDSTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpenRule());
            					}
            					addWithLastConsumed(
            						current,
            						"keywords",
            						lv_keywords_3_0,
            						"org.xtext.BPMN_translator.KEYWORDS");
            				

            }


            }

            // InternalBPMN_translator.g:518:3: ( ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' ) | ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_HEAD) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==23) ) {
                        alt6=2;
                    }
                    else if ( (LA6_2==22) ) {
                        alt6=1;
                    }


                }
                else if ( (LA6_0==RULE_KEYWORDS) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBPMN_translator.g:519:4: ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' )
            	    {
            	    // InternalBPMN_translator.g:519:4: ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' )
            	    // InternalBPMN_translator.g:520:5: ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':'
            	    {
            	    // InternalBPMN_translator.g:520:5: ( (lv_head1_4_0= RULE_HEAD ) )
            	    // InternalBPMN_translator.g:521:6: (lv_head1_4_0= RULE_HEAD )
            	    {
            	    // InternalBPMN_translator.g:521:6: (lv_head1_4_0= RULE_HEAD )
            	    // InternalBPMN_translator.g:522:7: lv_head1_4_0= RULE_HEAD
            	    {
            	    lv_head1_4_0=(Token)match(input,RULE_HEAD,FOLLOW_14); 

            	    							newLeafNode(lv_head1_4_0, grammarAccess.getOpenAccess().getHead1HEADTerminalRuleCall_4_0_0_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getOpenRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"head1",
            	    								lv_head1_4_0,
            	    								"org.xtext.BPMN_translator.HEAD");
            	    						

            	    }


            	    }

            	    otherlv_5=(Token)match(input,22,FOLLOW_16); 

            	    					newLeafNode(otherlv_5, grammarAccess.getOpenAccess().getColonKeyword_4_0_1());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBPMN_translator.g:544:4: ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:544:4: ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:545:5: ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) )
            	    {
            	    // InternalBPMN_translator.g:545:5: ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==RULE_HEAD) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==RULE_KEYWORDS) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalBPMN_translator.g:546:6: ( (lv_head1_6_0= RULE_HEAD ) )
            	            {
            	            // InternalBPMN_translator.g:546:6: ( (lv_head1_6_0= RULE_HEAD ) )
            	            // InternalBPMN_translator.g:547:7: (lv_head1_6_0= RULE_HEAD )
            	            {
            	            // InternalBPMN_translator.g:547:7: (lv_head1_6_0= RULE_HEAD )
            	            // InternalBPMN_translator.g:548:8: lv_head1_6_0= RULE_HEAD
            	            {
            	            lv_head1_6_0=(Token)match(input,RULE_HEAD,FOLLOW_17); 

            	            								newLeafNode(lv_head1_6_0, grammarAccess.getOpenAccess().getHead1HEADTerminalRuleCall_4_1_0_0_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getOpenRule());
            	            								}
            	            								addWithLastConsumed(
            	            									current,
            	            									"head1",
            	            									lv_head1_6_0,
            	            									"org.xtext.BPMN_translator.HEAD");
            	            							

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalBPMN_translator.g:565:6: ( (lv_keywords1_7_0= RULE_KEYWORDS ) )
            	            {
            	            // InternalBPMN_translator.g:565:6: ( (lv_keywords1_7_0= RULE_KEYWORDS ) )
            	            // InternalBPMN_translator.g:566:7: (lv_keywords1_7_0= RULE_KEYWORDS )
            	            {
            	            // InternalBPMN_translator.g:566:7: (lv_keywords1_7_0= RULE_KEYWORDS )
            	            // InternalBPMN_translator.g:567:8: lv_keywords1_7_0= RULE_KEYWORDS
            	            {
            	            lv_keywords1_7_0=(Token)match(input,RULE_KEYWORDS,FOLLOW_17); 

            	            								newLeafNode(lv_keywords1_7_0, grammarAccess.getOpenAccess().getKeywords1KEYWORDSTerminalRuleCall_4_1_0_1_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getOpenRule());
            	            								}
            	            								addWithLastConsumed(
            	            									current,
            	            									"keywords1",
            	            									lv_keywords1_7_0,
            	            									"org.xtext.BPMN_translator.KEYWORDS");
            	            							

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_8=(Token)match(input,23,FOLLOW_6); 

            	    					newLeafNode(otherlv_8, grammarAccess.getOpenAccess().getEqualsSignKeyword_4_1_1());
            	    				
            	    // InternalBPMN_translator.g:588:5: ( (lv_value_9_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:589:6: (lv_value_9_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:589:6: (lv_value_9_0= RULE_STRING )
            	    // InternalBPMN_translator.g:590:7: lv_value_9_0= RULE_STRING
            	    {
            	    lv_value_9_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            	    							newLeafNode(lv_value_9_0, grammarAccess.getOpenAccess().getValueSTRINGTerminalRuleCall_4_1_2_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getOpenRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"value",
            	    								lv_value_9_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_10=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getOpenAccess().getGreaterThanSignKeyword_5());
            		

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
    // $ANTLR end "ruleOpen"


    // $ANTLR start "entryRuleSingleton"
    // InternalBPMN_translator.g:616:1: entryRuleSingleton returns [EObject current=null] : iv_ruleSingleton= ruleSingleton EOF ;
    public final EObject entryRuleSingleton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleton = null;


        try {
            // InternalBPMN_translator.g:616:50: (iv_ruleSingleton= ruleSingleton EOF )
            // InternalBPMN_translator.g:617:2: iv_ruleSingleton= ruleSingleton EOF
            {
             newCompositeNode(grammarAccess.getSingletonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleton=ruleSingleton();

            state._fsp--;

             current =iv_ruleSingleton; 
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
    // $ANTLR end "entryRuleSingleton"


    // $ANTLR start "ruleSingleton"
    // InternalBPMN_translator.g:623:1: ruleSingleton returns [EObject current=null] : ( () (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* ) otherlv_10= '/>' ) ;
    public final EObject ruleSingleton() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_HEAD_2=null;
        Token otherlv_3=null;
        Token this_KEYWORDS_4=null;
        Token this_HEAD_5=null;
        Token otherlv_6=null;
        Token this_KEYWORDS_7=null;
        Token otherlv_8=null;
        Token lv_value_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalBPMN_translator.g:629:2: ( ( () (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* ) otherlv_10= '/>' ) )
            // InternalBPMN_translator.g:630:2: ( () (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* ) otherlv_10= '/>' )
            {
            // InternalBPMN_translator.g:630:2: ( () (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* ) otherlv_10= '/>' )
            // InternalBPMN_translator.g:631:3: () (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* ) otherlv_10= '/>'
            {
            // InternalBPMN_translator.g:631:3: ()
            // InternalBPMN_translator.g:632:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSingletonAccess().getSingletonAction_0(),
            					current);
            			

            }

            // InternalBPMN_translator.g:638:3: (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* )
            // InternalBPMN_translator.g:639:4: otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )*
            {
            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getSingletonAccess().getLessThanSignKeyword_1_0());
            			
            this_HEAD_2=(Token)match(input,RULE_HEAD,FOLLOW_14); 

            				newLeafNode(this_HEAD_2, grammarAccess.getSingletonAccess().getHEADTerminalRuleCall_1_1());
            			
            otherlv_3=(Token)match(input,22,FOLLOW_15); 

            				newLeafNode(otherlv_3, grammarAccess.getSingletonAccess().getColonKeyword_1_2());
            			
            this_KEYWORDS_4=(Token)match(input,RULE_KEYWORDS,FOLLOW_18); 

            				newLeafNode(this_KEYWORDS_4, grammarAccess.getSingletonAccess().getKEYWORDSTerminalRuleCall_1_3());
            			
            // InternalBPMN_translator.g:655:4: ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_HEAD) ) {
                    alt7=1;
                }
                else if ( (LA7_0==RULE_KEYWORDS) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBPMN_translator.g:656:5: (this_HEAD_5= RULE_HEAD otherlv_6= ':' )
            	    {
            	    // InternalBPMN_translator.g:656:5: (this_HEAD_5= RULE_HEAD otherlv_6= ':' )
            	    // InternalBPMN_translator.g:657:6: this_HEAD_5= RULE_HEAD otherlv_6= ':'
            	    {
            	    this_HEAD_5=(Token)match(input,RULE_HEAD,FOLLOW_14); 

            	    						newLeafNode(this_HEAD_5, grammarAccess.getSingletonAccess().getHEADTerminalRuleCall_1_4_0_0());
            	    					
            	    otherlv_6=(Token)match(input,22,FOLLOW_18); 

            	    						newLeafNode(otherlv_6, grammarAccess.getSingletonAccess().getColonKeyword_1_4_0_1());
            	    					

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBPMN_translator.g:667:5: (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:667:5: (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:668:6: this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) )
            	    {
            	    this_KEYWORDS_7=(Token)match(input,RULE_KEYWORDS,FOLLOW_17); 

            	    						newLeafNode(this_KEYWORDS_7, grammarAccess.getSingletonAccess().getKEYWORDSTerminalRuleCall_1_4_1_0());
            	    					
            	    otherlv_8=(Token)match(input,23,FOLLOW_6); 

            	    						newLeafNode(otherlv_8, grammarAccess.getSingletonAccess().getEqualsSignKeyword_1_4_1_1());
            	    					
            	    // InternalBPMN_translator.g:676:6: ( (lv_value_9_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:677:7: (lv_value_9_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:677:7: (lv_value_9_0= RULE_STRING )
            	    // InternalBPMN_translator.g:678:8: lv_value_9_0= RULE_STRING
            	    {
            	    lv_value_9_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            	    								newLeafNode(lv_value_9_0, grammarAccess.getSingletonAccess().getValueSTRINGTerminalRuleCall_1_4_1_2_0());
            	    							

            	    								if (current==null) {
            	    									current = createModelElement(grammarAccess.getSingletonRule());
            	    								}
            	    								addWithLastConsumed(
            	    									current,
            	    									"value",
            	    									lv_value_9_0,
            	    									"org.eclipse.xtext.common.Terminals.STRING");
            	    							

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            otherlv_10=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getSingletonAccess().getSolidusGreaterThanSignKeyword_2());
            		

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
    // $ANTLR end "ruleSingleton"


    // $ANTLR start "entryRuleClose"
    // InternalBPMN_translator.g:705:1: entryRuleClose returns [EObject current=null] : iv_ruleClose= ruleClose EOF ;
    public final EObject entryRuleClose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClose = null;


        try {
            // InternalBPMN_translator.g:705:46: (iv_ruleClose= ruleClose EOF )
            // InternalBPMN_translator.g:706:2: iv_ruleClose= ruleClose EOF
            {
             newCompositeNode(grammarAccess.getCloseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClose=ruleClose();

            state._fsp--;

             current =iv_ruleClose; 
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
    // $ANTLR end "entryRuleClose"


    // $ANTLR start "ruleClose"
    // InternalBPMN_translator.g:712:1: ruleClose returns [EObject current=null] : ( () (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' ) ) ;
    public final EObject ruleClose() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_HEAD_2=null;
        Token otherlv_3=null;
        Token this_KEYWORDS_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalBPMN_translator.g:718:2: ( ( () (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' ) ) )
            // InternalBPMN_translator.g:719:2: ( () (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' ) )
            {
            // InternalBPMN_translator.g:719:2: ( () (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' ) )
            // InternalBPMN_translator.g:720:3: () (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' )
            {
            // InternalBPMN_translator.g:720:3: ()
            // InternalBPMN_translator.g:721:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCloseAccess().getCloseAction_0(),
            					current);
            			

            }

            // InternalBPMN_translator.g:727:3: (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' )
            // InternalBPMN_translator.g:728:4: otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>'
            {
            otherlv_1=(Token)match(input,26,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getCloseAccess().getLessThanSignSolidusKeyword_1_0());
            			
            this_HEAD_2=(Token)match(input,RULE_HEAD,FOLLOW_14); 

            				newLeafNode(this_HEAD_2, grammarAccess.getCloseAccess().getHEADTerminalRuleCall_1_1());
            			
            otherlv_3=(Token)match(input,22,FOLLOW_15); 

            				newLeafNode(otherlv_3, grammarAccess.getCloseAccess().getColonKeyword_1_2());
            			
            this_KEYWORDS_4=(Token)match(input,RULE_KEYWORDS,FOLLOW_19); 

            				newLeafNode(this_KEYWORDS_4, grammarAccess.getCloseAccess().getKEYWORDSTerminalRuleCall_1_3());
            			
            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            				newLeafNode(otherlv_5, grammarAccess.getCloseAccess().getGreaterThanSignKeyword_1_4());
            			

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
    // $ANTLR end "ruleClose"


    // $ANTLR start "entryRulecodex"
    // InternalBPMN_translator.g:753:1: entryRulecodex returns [EObject current=null] : iv_rulecodex= rulecodex EOF ;
    public final EObject entryRulecodex() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecodex = null;


        try {
            // InternalBPMN_translator.g:753:46: (iv_rulecodex= rulecodex EOF )
            // InternalBPMN_translator.g:754:2: iv_rulecodex= rulecodex EOF
            {
             newCompositeNode(grammarAccess.getCodexRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecodex=rulecodex();

            state._fsp--;

             current =iv_rulecodex; 
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
    // $ANTLR end "entryRulecodex"


    // $ANTLR start "rulecodex"
    // InternalBPMN_translator.g:760:1: rulecodex returns [EObject current=null] : ( ( (lv_device_code_0_0= ruledevice ) ) ( (lv_protocol_1_0= ruleprotocol ) ) ( (lv_sensor_code_2_0= rulesensor ) ) ) ;
    public final EObject rulecodex() throws RecognitionException {
        EObject current = null;

        EObject lv_device_code_0_0 = null;

        EObject lv_protocol_1_0 = null;

        EObject lv_sensor_code_2_0 = null;



        	enterRule();

        try {
            // InternalBPMN_translator.g:766:2: ( ( ( (lv_device_code_0_0= ruledevice ) ) ( (lv_protocol_1_0= ruleprotocol ) ) ( (lv_sensor_code_2_0= rulesensor ) ) ) )
            // InternalBPMN_translator.g:767:2: ( ( (lv_device_code_0_0= ruledevice ) ) ( (lv_protocol_1_0= ruleprotocol ) ) ( (lv_sensor_code_2_0= rulesensor ) ) )
            {
            // InternalBPMN_translator.g:767:2: ( ( (lv_device_code_0_0= ruledevice ) ) ( (lv_protocol_1_0= ruleprotocol ) ) ( (lv_sensor_code_2_0= rulesensor ) ) )
            // InternalBPMN_translator.g:768:3: ( (lv_device_code_0_0= ruledevice ) ) ( (lv_protocol_1_0= ruleprotocol ) ) ( (lv_sensor_code_2_0= rulesensor ) )
            {
            // InternalBPMN_translator.g:768:3: ( (lv_device_code_0_0= ruledevice ) )
            // InternalBPMN_translator.g:769:4: (lv_device_code_0_0= ruledevice )
            {
            // InternalBPMN_translator.g:769:4: (lv_device_code_0_0= ruledevice )
            // InternalBPMN_translator.g:770:5: lv_device_code_0_0= ruledevice
            {

            					newCompositeNode(grammarAccess.getCodexAccess().getDevice_codeDeviceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_device_code_0_0=ruledevice();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCodexRule());
            					}
            					add(
            						current,
            						"device_code",
            						lv_device_code_0_0,
            						"org.xtext.BPMN_translator.device");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBPMN_translator.g:787:3: ( (lv_protocol_1_0= ruleprotocol ) )
            // InternalBPMN_translator.g:788:4: (lv_protocol_1_0= ruleprotocol )
            {
            // InternalBPMN_translator.g:788:4: (lv_protocol_1_0= ruleprotocol )
            // InternalBPMN_translator.g:789:5: lv_protocol_1_0= ruleprotocol
            {

            					newCompositeNode(grammarAccess.getCodexAccess().getProtocolProtocolParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_protocol_1_0=ruleprotocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCodexRule());
            					}
            					add(
            						current,
            						"protocol",
            						lv_protocol_1_0,
            						"org.xtext.BPMN_translator.protocol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBPMN_translator.g:806:3: ( (lv_sensor_code_2_0= rulesensor ) )
            // InternalBPMN_translator.g:807:4: (lv_sensor_code_2_0= rulesensor )
            {
            // InternalBPMN_translator.g:807:4: (lv_sensor_code_2_0= rulesensor )
            // InternalBPMN_translator.g:808:5: lv_sensor_code_2_0= rulesensor
            {

            					newCompositeNode(grammarAccess.getCodexAccess().getSensor_codeSensorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_sensor_code_2_0=rulesensor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCodexRule());
            					}
            					add(
            						current,
            						"sensor_code",
            						lv_sensor_code_2_0,
            						"org.xtext.BPMN_translator.sensor");
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
    // $ANTLR end "rulecodex"


    // $ANTLR start "entryRuledevice"
    // InternalBPMN_translator.g:829:1: entryRuledevice returns [EObject current=null] : iv_ruledevice= ruledevice EOF ;
    public final EObject entryRuledevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledevice = null;


        try {
            // InternalBPMN_translator.g:829:47: (iv_ruledevice= ruledevice EOF )
            // InternalBPMN_translator.g:830:2: iv_ruledevice= ruledevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruledevice=ruledevice();

            state._fsp--;

             current =iv_ruledevice; 
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
    // $ANTLR end "entryRuledevice"


    // $ANTLR start "ruledevice"
    // InternalBPMN_translator.g:836:1: ruledevice returns [EObject current=null] : (otherlv_0= 'DEVICE' otherlv_1= ':' ( (lv_device_2_0= RULE_STRING ) ) ) ;
    public final EObject ruledevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_device_2_0=null;


        	enterRule();

        try {
            // InternalBPMN_translator.g:842:2: ( (otherlv_0= 'DEVICE' otherlv_1= ':' ( (lv_device_2_0= RULE_STRING ) ) ) )
            // InternalBPMN_translator.g:843:2: (otherlv_0= 'DEVICE' otherlv_1= ':' ( (lv_device_2_0= RULE_STRING ) ) )
            {
            // InternalBPMN_translator.g:843:2: (otherlv_0= 'DEVICE' otherlv_1= ':' ( (lv_device_2_0= RULE_STRING ) ) )
            // InternalBPMN_translator.g:844:3: otherlv_0= 'DEVICE' otherlv_1= ':' ( (lv_device_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getDeviceAccess().getDEVICEKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDeviceAccess().getColonKeyword_1());
            		
            // InternalBPMN_translator.g:852:3: ( (lv_device_2_0= RULE_STRING ) )
            // InternalBPMN_translator.g:853:4: (lv_device_2_0= RULE_STRING )
            {
            // InternalBPMN_translator.g:853:4: (lv_device_2_0= RULE_STRING )
            // InternalBPMN_translator.g:854:5: lv_device_2_0= RULE_STRING
            {
            lv_device_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_device_2_0, grammarAccess.getDeviceAccess().getDeviceSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeviceRule());
            					}
            					addWithLastConsumed(
            						current,
            						"device",
            						lv_device_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruledevice"


    // $ANTLR start "entryRuleprotocol"
    // InternalBPMN_translator.g:874:1: entryRuleprotocol returns [EObject current=null] : iv_ruleprotocol= ruleprotocol EOF ;
    public final EObject entryRuleprotocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprotocol = null;


        try {
            // InternalBPMN_translator.g:874:49: (iv_ruleprotocol= ruleprotocol EOF )
            // InternalBPMN_translator.g:875:2: iv_ruleprotocol= ruleprotocol EOF
            {
             newCompositeNode(grammarAccess.getProtocolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprotocol=ruleprotocol();

            state._fsp--;

             current =iv_ruleprotocol; 
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
    // $ANTLR end "entryRuleprotocol"


    // $ANTLR start "ruleprotocol"
    // InternalBPMN_translator.g:881:1: ruleprotocol returns [EObject current=null] : (otherlv_0= 'NETWORK_PROTOCOL' otherlv_1= '{' ( ( (lv_protocol_data_2_0= ruleprotocol_data ) ) ( (lv_protocol_device_3_0= ruleprotocol_device ) ) ) otherlv_4= '}' ) ;
    public final EObject ruleprotocol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_protocol_data_2_0 = null;

        EObject lv_protocol_device_3_0 = null;



        	enterRule();

        try {
            // InternalBPMN_translator.g:887:2: ( (otherlv_0= 'NETWORK_PROTOCOL' otherlv_1= '{' ( ( (lv_protocol_data_2_0= ruleprotocol_data ) ) ( (lv_protocol_device_3_0= ruleprotocol_device ) ) ) otherlv_4= '}' ) )
            // InternalBPMN_translator.g:888:2: (otherlv_0= 'NETWORK_PROTOCOL' otherlv_1= '{' ( ( (lv_protocol_data_2_0= ruleprotocol_data ) ) ( (lv_protocol_device_3_0= ruleprotocol_device ) ) ) otherlv_4= '}' )
            {
            // InternalBPMN_translator.g:888:2: (otherlv_0= 'NETWORK_PROTOCOL' otherlv_1= '{' ( ( (lv_protocol_data_2_0= ruleprotocol_data ) ) ( (lv_protocol_device_3_0= ruleprotocol_device ) ) ) otherlv_4= '}' )
            // InternalBPMN_translator.g:889:3: otherlv_0= 'NETWORK_PROTOCOL' otherlv_1= '{' ( ( (lv_protocol_data_2_0= ruleprotocol_data ) ) ( (lv_protocol_device_3_0= ruleprotocol_device ) ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getProtocolAccess().getNETWORK_PROTOCOLKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBPMN_translator.g:897:3: ( ( (lv_protocol_data_2_0= ruleprotocol_data ) ) ( (lv_protocol_device_3_0= ruleprotocol_device ) ) )
            // InternalBPMN_translator.g:898:4: ( (lv_protocol_data_2_0= ruleprotocol_data ) ) ( (lv_protocol_device_3_0= ruleprotocol_device ) )
            {
            // InternalBPMN_translator.g:898:4: ( (lv_protocol_data_2_0= ruleprotocol_data ) )
            // InternalBPMN_translator.g:899:5: (lv_protocol_data_2_0= ruleprotocol_data )
            {
            // InternalBPMN_translator.g:899:5: (lv_protocol_data_2_0= ruleprotocol_data )
            // InternalBPMN_translator.g:900:6: lv_protocol_data_2_0= ruleprotocol_data
            {

            						newCompositeNode(grammarAccess.getProtocolAccess().getProtocol_dataProtocol_dataParserRuleCall_2_0_0());
            					
            pushFollow(FOLLOW_22);
            lv_protocol_data_2_0=ruleprotocol_data();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getProtocolRule());
            						}
            						add(
            							current,
            							"protocol_data",
            							lv_protocol_data_2_0,
            							"org.xtext.BPMN_translator.protocol_data");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalBPMN_translator.g:917:4: ( (lv_protocol_device_3_0= ruleprotocol_device ) )
            // InternalBPMN_translator.g:918:5: (lv_protocol_device_3_0= ruleprotocol_device )
            {
            // InternalBPMN_translator.g:918:5: (lv_protocol_device_3_0= ruleprotocol_device )
            // InternalBPMN_translator.g:919:6: lv_protocol_device_3_0= ruleprotocol_device
            {

            						newCompositeNode(grammarAccess.getProtocolAccess().getProtocol_deviceProtocol_deviceParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_12);
            lv_protocol_device_3_0=ruleprotocol_device();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getProtocolRule());
            						}
            						add(
            							current,
            							"protocol_device",
            							lv_protocol_device_3_0,
            							"org.xtext.BPMN_translator.protocol_device");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleprotocol"


    // $ANTLR start "entryRuleprotocol_data"
    // InternalBPMN_translator.g:945:1: entryRuleprotocol_data returns [EObject current=null] : iv_ruleprotocol_data= ruleprotocol_data EOF ;
    public final EObject entryRuleprotocol_data() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprotocol_data = null;


        try {
            // InternalBPMN_translator.g:945:54: (iv_ruleprotocol_data= ruleprotocol_data EOF )
            // InternalBPMN_translator.g:946:2: iv_ruleprotocol_data= ruleprotocol_data EOF
            {
             newCompositeNode(grammarAccess.getProtocol_dataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprotocol_data=ruleprotocol_data();

            state._fsp--;

             current =iv_ruleprotocol_data; 
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
    // $ANTLR end "entryRuleprotocol_data"


    // $ANTLR start "ruleprotocol_data"
    // InternalBPMN_translator.g:952:1: ruleprotocol_data returns [EObject current=null] : ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'CLIENT_MAC' otherlv_5= '=' ( (lv_mac_6_0= RULE_STRING ) ) ) | (otherlv_7= 'CLIENT_IP' otherlv_8= '=' ( (lv_ip_address_9_0= RULE_STRING ) ) ) | (otherlv_10= 'SERVER_IP' otherlv_11= '=' ( (lv_server_address_12_0= RULE_STRING ) ) ) )* ) ;
    public final EObject ruleprotocol_data() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_pname_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_mac_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_ip_address_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_server_address_12_0=null;


        	enterRule();

        try {
            // InternalBPMN_translator.g:958:2: ( ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'CLIENT_MAC' otherlv_5= '=' ( (lv_mac_6_0= RULE_STRING ) ) ) | (otherlv_7= 'CLIENT_IP' otherlv_8= '=' ( (lv_ip_address_9_0= RULE_STRING ) ) ) | (otherlv_10= 'SERVER_IP' otherlv_11= '=' ( (lv_server_address_12_0= RULE_STRING ) ) ) )* ) )
            // InternalBPMN_translator.g:959:2: ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'CLIENT_MAC' otherlv_5= '=' ( (lv_mac_6_0= RULE_STRING ) ) ) | (otherlv_7= 'CLIENT_IP' otherlv_8= '=' ( (lv_ip_address_9_0= RULE_STRING ) ) ) | (otherlv_10= 'SERVER_IP' otherlv_11= '=' ( (lv_server_address_12_0= RULE_STRING ) ) ) )* )
            {
            // InternalBPMN_translator.g:959:2: ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'CLIENT_MAC' otherlv_5= '=' ( (lv_mac_6_0= RULE_STRING ) ) ) | (otherlv_7= 'CLIENT_IP' otherlv_8= '=' ( (lv_ip_address_9_0= RULE_STRING ) ) ) | (otherlv_10= 'SERVER_IP' otherlv_11= '=' ( (lv_server_address_12_0= RULE_STRING ) ) ) )* )
            // InternalBPMN_translator.g:960:3: () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'CLIENT_MAC' otherlv_5= '=' ( (lv_mac_6_0= RULE_STRING ) ) ) | (otherlv_7= 'CLIENT_IP' otherlv_8= '=' ( (lv_ip_address_9_0= RULE_STRING ) ) ) | (otherlv_10= 'SERVER_IP' otherlv_11= '=' ( (lv_server_address_12_0= RULE_STRING ) ) ) )*
            {
            // InternalBPMN_translator.g:960:3: ()
            // InternalBPMN_translator.g:961:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtocol_dataAccess().getProtocol_dataAction_0(),
            					current);
            			

            }

            // InternalBPMN_translator.g:967:3: ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'CLIENT_MAC' otherlv_5= '=' ( (lv_mac_6_0= RULE_STRING ) ) ) | (otherlv_7= 'CLIENT_IP' otherlv_8= '=' ( (lv_ip_address_9_0= RULE_STRING ) ) ) | (otherlv_10= 'SERVER_IP' otherlv_11= '=' ( (lv_server_address_12_0= RULE_STRING ) ) ) )*
            loop8:
            do {
                int alt8=5;
                switch ( input.LA(1) ) {
                case 29:
                    {
                    alt8=1;
                    }
                    break;
                case 30:
                    {
                    alt8=2;
                    }
                    break;
                case 31:
                    {
                    alt8=3;
                    }
                    break;
                case 32:
                    {
                    alt8=4;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // InternalBPMN_translator.g:968:4: (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:968:4: (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:969:5: otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,29,FOLLOW_17); 

            	    					newLeafNode(otherlv_1, grammarAccess.getProtocol_dataAccess().getNAMEKeyword_1_0_0());
            	    				
            	    otherlv_2=(Token)match(input,23,FOLLOW_6); 

            	    					newLeafNode(otherlv_2, grammarAccess.getProtocol_dataAccess().getEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalBPMN_translator.g:977:5: ( (lv_pname_3_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:978:6: (lv_pname_3_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:978:6: (lv_pname_3_0= RULE_STRING )
            	    // InternalBPMN_translator.g:979:7: lv_pname_3_0= RULE_STRING
            	    {
            	    lv_pname_3_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            	    							newLeafNode(lv_pname_3_0, grammarAccess.getProtocol_dataAccess().getPnameSTRINGTerminalRuleCall_1_0_2_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getProtocol_dataRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"pname",
            	    								lv_pname_3_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBPMN_translator.g:997:4: (otherlv_4= 'CLIENT_MAC' otherlv_5= '=' ( (lv_mac_6_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:997:4: (otherlv_4= 'CLIENT_MAC' otherlv_5= '=' ( (lv_mac_6_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:998:5: otherlv_4= 'CLIENT_MAC' otherlv_5= '=' ( (lv_mac_6_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,30,FOLLOW_17); 

            	    					newLeafNode(otherlv_4, grammarAccess.getProtocol_dataAccess().getCLIENT_MACKeyword_1_1_0());
            	    				
            	    otherlv_5=(Token)match(input,23,FOLLOW_6); 

            	    					newLeafNode(otherlv_5, grammarAccess.getProtocol_dataAccess().getEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalBPMN_translator.g:1006:5: ( (lv_mac_6_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:1007:6: (lv_mac_6_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:1007:6: (lv_mac_6_0= RULE_STRING )
            	    // InternalBPMN_translator.g:1008:7: lv_mac_6_0= RULE_STRING
            	    {
            	    lv_mac_6_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            	    							newLeafNode(lv_mac_6_0, grammarAccess.getProtocol_dataAccess().getMacSTRINGTerminalRuleCall_1_1_2_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getProtocol_dataRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"mac",
            	    								lv_mac_6_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBPMN_translator.g:1026:4: (otherlv_7= 'CLIENT_IP' otherlv_8= '=' ( (lv_ip_address_9_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:1026:4: (otherlv_7= 'CLIENT_IP' otherlv_8= '=' ( (lv_ip_address_9_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:1027:5: otherlv_7= 'CLIENT_IP' otherlv_8= '=' ( (lv_ip_address_9_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,31,FOLLOW_17); 

            	    					newLeafNode(otherlv_7, grammarAccess.getProtocol_dataAccess().getCLIENT_IPKeyword_1_2_0());
            	    				
            	    otherlv_8=(Token)match(input,23,FOLLOW_6); 

            	    					newLeafNode(otherlv_8, grammarAccess.getProtocol_dataAccess().getEqualsSignKeyword_1_2_1());
            	    				
            	    // InternalBPMN_translator.g:1035:5: ( (lv_ip_address_9_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:1036:6: (lv_ip_address_9_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:1036:6: (lv_ip_address_9_0= RULE_STRING )
            	    // InternalBPMN_translator.g:1037:7: lv_ip_address_9_0= RULE_STRING
            	    {
            	    lv_ip_address_9_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            	    							newLeafNode(lv_ip_address_9_0, grammarAccess.getProtocol_dataAccess().getIp_addressSTRINGTerminalRuleCall_1_2_2_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getProtocol_dataRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"ip_address",
            	    								lv_ip_address_9_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalBPMN_translator.g:1055:4: (otherlv_10= 'SERVER_IP' otherlv_11= '=' ( (lv_server_address_12_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:1055:4: (otherlv_10= 'SERVER_IP' otherlv_11= '=' ( (lv_server_address_12_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:1056:5: otherlv_10= 'SERVER_IP' otherlv_11= '=' ( (lv_server_address_12_0= RULE_STRING ) )
            	    {
            	    otherlv_10=(Token)match(input,32,FOLLOW_17); 

            	    					newLeafNode(otherlv_10, grammarAccess.getProtocol_dataAccess().getSERVER_IPKeyword_1_3_0());
            	    				
            	    otherlv_11=(Token)match(input,23,FOLLOW_6); 

            	    					newLeafNode(otherlv_11, grammarAccess.getProtocol_dataAccess().getEqualsSignKeyword_1_3_1());
            	    				
            	    // InternalBPMN_translator.g:1064:5: ( (lv_server_address_12_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:1065:6: (lv_server_address_12_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:1065:6: (lv_server_address_12_0= RULE_STRING )
            	    // InternalBPMN_translator.g:1066:7: lv_server_address_12_0= RULE_STRING
            	    {
            	    lv_server_address_12_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            	    							newLeafNode(lv_server_address_12_0, grammarAccess.getProtocol_dataAccess().getServer_addressSTRINGTerminalRuleCall_1_3_2_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getProtocol_dataRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"server_address",
            	    								lv_server_address_12_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleprotocol_data"


    // $ANTLR start "entryRuleprotocol_device"
    // InternalBPMN_translator.g:1088:1: entryRuleprotocol_device returns [EObject current=null] : iv_ruleprotocol_device= ruleprotocol_device EOF ;
    public final EObject entryRuleprotocol_device() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprotocol_device = null;


        try {
            // InternalBPMN_translator.g:1088:56: (iv_ruleprotocol_device= ruleprotocol_device EOF )
            // InternalBPMN_translator.g:1089:2: iv_ruleprotocol_device= ruleprotocol_device EOF
            {
             newCompositeNode(grammarAccess.getProtocol_deviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprotocol_device=ruleprotocol_device();

            state._fsp--;

             current =iv_ruleprotocol_device; 
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
    // $ANTLR end "entryRuleprotocol_device"


    // $ANTLR start "ruleprotocol_device"
    // InternalBPMN_translator.g:1095:1: ruleprotocol_device returns [EObject current=null] : (otherlv_0= 'PROTOCOL_DEVICE' otherlv_1= '{' ( (lv_protocol_device_2_0= rulesensor_data ) ) otherlv_3= '}' ) ;
    public final EObject ruleprotocol_device() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_protocol_device_2_0 = null;



        	enterRule();

        try {
            // InternalBPMN_translator.g:1101:2: ( (otherlv_0= 'PROTOCOL_DEVICE' otherlv_1= '{' ( (lv_protocol_device_2_0= rulesensor_data ) ) otherlv_3= '}' ) )
            // InternalBPMN_translator.g:1102:2: (otherlv_0= 'PROTOCOL_DEVICE' otherlv_1= '{' ( (lv_protocol_device_2_0= rulesensor_data ) ) otherlv_3= '}' )
            {
            // InternalBPMN_translator.g:1102:2: (otherlv_0= 'PROTOCOL_DEVICE' otherlv_1= '{' ( (lv_protocol_device_2_0= rulesensor_data ) ) otherlv_3= '}' )
            // InternalBPMN_translator.g:1103:3: otherlv_0= 'PROTOCOL_DEVICE' otherlv_1= '{' ( (lv_protocol_device_2_0= rulesensor_data ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getProtocol_deviceAccess().getPROTOCOL_DEVICEKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getProtocol_deviceAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBPMN_translator.g:1111:3: ( (lv_protocol_device_2_0= rulesensor_data ) )
            // InternalBPMN_translator.g:1112:4: (lv_protocol_device_2_0= rulesensor_data )
            {
            // InternalBPMN_translator.g:1112:4: (lv_protocol_device_2_0= rulesensor_data )
            // InternalBPMN_translator.g:1113:5: lv_protocol_device_2_0= rulesensor_data
            {

            					newCompositeNode(grammarAccess.getProtocol_deviceAccess().getProtocol_deviceSensor_dataParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_protocol_device_2_0=rulesensor_data();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProtocol_deviceRule());
            					}
            					add(
            						current,
            						"protocol_device",
            						lv_protocol_device_2_0,
            						"org.xtext.BPMN_translator.sensor_data");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getProtocol_deviceAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleprotocol_device"


    // $ANTLR start "entryRulesensor"
    // InternalBPMN_translator.g:1138:1: entryRulesensor returns [EObject current=null] : iv_rulesensor= rulesensor EOF ;
    public final EObject entryRulesensor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesensor = null;


        try {
            // InternalBPMN_translator.g:1138:47: (iv_rulesensor= rulesensor EOF )
            // InternalBPMN_translator.g:1139:2: iv_rulesensor= rulesensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesensor=rulesensor();

            state._fsp--;

             current =iv_rulesensor; 
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
    // $ANTLR end "entryRulesensor"


    // $ANTLR start "rulesensor"
    // InternalBPMN_translator.g:1145:1: rulesensor returns [EObject current=null] : (otherlv_0= 'SENSOR' otherlv_1= '{' ( (lv_sensor_2_0= rulesensor_data ) ) otherlv_3= '}' ) ;
    public final EObject rulesensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_sensor_2_0 = null;



        	enterRule();

        try {
            // InternalBPMN_translator.g:1151:2: ( (otherlv_0= 'SENSOR' otherlv_1= '{' ( (lv_sensor_2_0= rulesensor_data ) ) otherlv_3= '}' ) )
            // InternalBPMN_translator.g:1152:2: (otherlv_0= 'SENSOR' otherlv_1= '{' ( (lv_sensor_2_0= rulesensor_data ) ) otherlv_3= '}' )
            {
            // InternalBPMN_translator.g:1152:2: (otherlv_0= 'SENSOR' otherlv_1= '{' ( (lv_sensor_2_0= rulesensor_data ) ) otherlv_3= '}' )
            // InternalBPMN_translator.g:1153:3: otherlv_0= 'SENSOR' otherlv_1= '{' ( (lv_sensor_2_0= rulesensor_data ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSENSORKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBPMN_translator.g:1161:3: ( (lv_sensor_2_0= rulesensor_data ) )
            // InternalBPMN_translator.g:1162:4: (lv_sensor_2_0= rulesensor_data )
            {
            // InternalBPMN_translator.g:1162:4: (lv_sensor_2_0= rulesensor_data )
            // InternalBPMN_translator.g:1163:5: lv_sensor_2_0= rulesensor_data
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getSensorSensor_dataParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_sensor_2_0=rulesensor_data();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					add(
            						current,
            						"sensor",
            						lv_sensor_2_0,
            						"org.xtext.BPMN_translator.sensor_data");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulesensor"


    // $ANTLR start "entryRulesensor_data"
    // InternalBPMN_translator.g:1188:1: entryRulesensor_data returns [EObject current=null] : iv_rulesensor_data= rulesensor_data EOF ;
    public final EObject entryRulesensor_data() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesensor_data = null;


        try {
            // InternalBPMN_translator.g:1188:52: (iv_rulesensor_data= rulesensor_data EOF )
            // InternalBPMN_translator.g:1189:2: iv_rulesensor_data= rulesensor_data EOF
            {
             newCompositeNode(grammarAccess.getSensor_dataRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesensor_data=rulesensor_data();

            state._fsp--;

             current =iv_rulesensor_data; 
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
    // $ANTLR end "entryRulesensor_data"


    // $ANTLR start "rulesensor_data"
    // InternalBPMN_translator.g:1195:1: rulesensor_data returns [EObject current=null] : ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'TYPE' otherlv_5= '=' ( (lv_type_6_0= RULE_STRING ) ) ) | (otherlv_7= 'PINS' otherlv_8= '=' ( (lv_pins_9_0= RULE_STRING ) ) ) )* ) ;
    public final EObject rulesensor_data() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_pname_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_type_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_pins_9_0=null;


        	enterRule();

        try {
            // InternalBPMN_translator.g:1201:2: ( ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'TYPE' otherlv_5= '=' ( (lv_type_6_0= RULE_STRING ) ) ) | (otherlv_7= 'PINS' otherlv_8= '=' ( (lv_pins_9_0= RULE_STRING ) ) ) )* ) )
            // InternalBPMN_translator.g:1202:2: ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'TYPE' otherlv_5= '=' ( (lv_type_6_0= RULE_STRING ) ) ) | (otherlv_7= 'PINS' otherlv_8= '=' ( (lv_pins_9_0= RULE_STRING ) ) ) )* )
            {
            // InternalBPMN_translator.g:1202:2: ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'TYPE' otherlv_5= '=' ( (lv_type_6_0= RULE_STRING ) ) ) | (otherlv_7= 'PINS' otherlv_8= '=' ( (lv_pins_9_0= RULE_STRING ) ) ) )* )
            // InternalBPMN_translator.g:1203:3: () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'TYPE' otherlv_5= '=' ( (lv_type_6_0= RULE_STRING ) ) ) | (otherlv_7= 'PINS' otherlv_8= '=' ( (lv_pins_9_0= RULE_STRING ) ) ) )*
            {
            // InternalBPMN_translator.g:1203:3: ()
            // InternalBPMN_translator.g:1204:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensor_dataAccess().getSensor_dataAction_0(),
            					current);
            			

            }

            // InternalBPMN_translator.g:1210:3: ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'TYPE' otherlv_5= '=' ( (lv_type_6_0= RULE_STRING ) ) ) | (otherlv_7= 'PINS' otherlv_8= '=' ( (lv_pins_9_0= RULE_STRING ) ) ) )*
            loop9:
            do {
                int alt9=4;
                switch ( input.LA(1) ) {
                case 29:
                    {
                    alt9=1;
                    }
                    break;
                case 35:
                    {
                    alt9=2;
                    }
                    break;
                case 36:
                    {
                    alt9=3;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // InternalBPMN_translator.g:1211:4: (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:1211:4: (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:1212:5: otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,29,FOLLOW_17); 

            	    					newLeafNode(otherlv_1, grammarAccess.getSensor_dataAccess().getNAMEKeyword_1_0_0());
            	    				
            	    otherlv_2=(Token)match(input,23,FOLLOW_6); 

            	    					newLeafNode(otherlv_2, grammarAccess.getSensor_dataAccess().getEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalBPMN_translator.g:1220:5: ( (lv_pname_3_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:1221:6: (lv_pname_3_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:1221:6: (lv_pname_3_0= RULE_STRING )
            	    // InternalBPMN_translator.g:1222:7: lv_pname_3_0= RULE_STRING
            	    {
            	    lv_pname_3_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	    							newLeafNode(lv_pname_3_0, grammarAccess.getSensor_dataAccess().getPnameSTRINGTerminalRuleCall_1_0_2_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getSensor_dataRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"pname",
            	    								lv_pname_3_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBPMN_translator.g:1240:4: (otherlv_4= 'TYPE' otherlv_5= '=' ( (lv_type_6_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:1240:4: (otherlv_4= 'TYPE' otherlv_5= '=' ( (lv_type_6_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:1241:5: otherlv_4= 'TYPE' otherlv_5= '=' ( (lv_type_6_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,35,FOLLOW_17); 

            	    					newLeafNode(otherlv_4, grammarAccess.getSensor_dataAccess().getTYPEKeyword_1_1_0());
            	    				
            	    otherlv_5=(Token)match(input,23,FOLLOW_6); 

            	    					newLeafNode(otherlv_5, grammarAccess.getSensor_dataAccess().getEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalBPMN_translator.g:1249:5: ( (lv_type_6_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:1250:6: (lv_type_6_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:1250:6: (lv_type_6_0= RULE_STRING )
            	    // InternalBPMN_translator.g:1251:7: lv_type_6_0= RULE_STRING
            	    {
            	    lv_type_6_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	    							newLeafNode(lv_type_6_0, grammarAccess.getSensor_dataAccess().getTypeSTRINGTerminalRuleCall_1_1_2_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getSensor_dataRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"type",
            	    								lv_type_6_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBPMN_translator.g:1269:4: (otherlv_7= 'PINS' otherlv_8= '=' ( (lv_pins_9_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:1269:4: (otherlv_7= 'PINS' otherlv_8= '=' ( (lv_pins_9_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:1270:5: otherlv_7= 'PINS' otherlv_8= '=' ( (lv_pins_9_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,36,FOLLOW_17); 

            	    					newLeafNode(otherlv_7, grammarAccess.getSensor_dataAccess().getPINSKeyword_1_2_0());
            	    				
            	    otherlv_8=(Token)match(input,23,FOLLOW_6); 

            	    					newLeafNode(otherlv_8, grammarAccess.getSensor_dataAccess().getEqualsSignKeyword_1_2_1());
            	    				
            	    // InternalBPMN_translator.g:1278:5: ( (lv_pins_9_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:1279:6: (lv_pins_9_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:1279:6: (lv_pins_9_0= RULE_STRING )
            	    // InternalBPMN_translator.g:1280:7: lv_pins_9_0= RULE_STRING
            	    {
            	    lv_pins_9_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	    							newLeafNode(lv_pins_9_0, grammarAccess.getSensor_dataAccess().getPinsSTRINGTerminalRuleCall_1_2_2_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getSensor_dataRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"pins",
            	    								lv_pins_9_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "rulesensor_data"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\25\1\4\1\26\1\7\1\4\1\26\1\27\2\uffff\1\4\1\5\1\4";
    static final String dfa_3s = "\1\25\1\4\1\26\1\7\1\31\2\27\2\uffff\1\31\1\5\1\31";
    static final String dfa_4s = "\7\uffff\1\1\1\2\3\uffff";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5\2\uffff\1\6\20\uffff\1\7\1\10",
            "\1\11\1\7",
            "\1\12",
            "",
            "",
            "\1\5\2\uffff\1\6\20\uffff\1\7\1\10",
            "\1\13",
            "\1\5\2\uffff\1\6\20\uffff\1\7\1\10"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "228:2: ( ( ( (lv_open_0_0= ruleOpen ) ) ( (lv_contents_1_0= rulecontent ) ) ( (lv_close_tag_2_0= ruleClose ) ) ) | ( () ( (lv_singleton_tag_4_0= ruleSingleton ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000042400E0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000002400E2L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000090L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000090L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000003E0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000001E0000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001820100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001820000002L});

}