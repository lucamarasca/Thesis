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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HEAD", "RULE_STRING", "RULE_BODY", "RULE_KEYWORDS", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<?'", "'version='", "'encoding='", "'?>'", "'<'", "':'", "'='", "'>'", "'/>'", "'</'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int RULE_KEYWORDS=7;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_HEAD=4;
    public static final int RULE_BODY=6;
    public static final int RULE_ID=9;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=8;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
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

                if ( (LA2_0==18) ) {
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
    // InternalBPMN_translator.g:328:1: rulecontent returns [EObject current=null] : ( () ( ( (lv_element_1_0= ruleelement ) ) | ( (lv_body_2_0= RULE_BODY ) ) | ( (lv_keywords_3_0= RULE_KEYWORDS ) ) | ( (lv_data_4_0= RULE_STRING ) ) )* ) ;
    public final EObject rulecontent() throws RecognitionException {
        EObject current = null;

        Token lv_body_2_0=null;
        Token lv_keywords_3_0=null;
        Token lv_data_4_0=null;
        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalBPMN_translator.g:334:2: ( ( () ( ( (lv_element_1_0= ruleelement ) ) | ( (lv_body_2_0= RULE_BODY ) ) | ( (lv_keywords_3_0= RULE_KEYWORDS ) ) | ( (lv_data_4_0= RULE_STRING ) ) )* ) )
            // InternalBPMN_translator.g:335:2: ( () ( ( (lv_element_1_0= ruleelement ) ) | ( (lv_body_2_0= RULE_BODY ) ) | ( (lv_keywords_3_0= RULE_KEYWORDS ) ) | ( (lv_data_4_0= RULE_STRING ) ) )* )
            {
            // InternalBPMN_translator.g:335:2: ( () ( ( (lv_element_1_0= ruleelement ) ) | ( (lv_body_2_0= RULE_BODY ) ) | ( (lv_keywords_3_0= RULE_KEYWORDS ) ) | ( (lv_data_4_0= RULE_STRING ) ) )* )
            // InternalBPMN_translator.g:336:3: () ( ( (lv_element_1_0= ruleelement ) ) | ( (lv_body_2_0= RULE_BODY ) ) | ( (lv_keywords_3_0= RULE_KEYWORDS ) ) | ( (lv_data_4_0= RULE_STRING ) ) )*
            {
            // InternalBPMN_translator.g:336:3: ()
            // InternalBPMN_translator.g:337:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContentAccess().getContentAction_0(),
            					current);
            			

            }

            // InternalBPMN_translator.g:343:3: ( ( (lv_element_1_0= ruleelement ) ) | ( (lv_body_2_0= RULE_BODY ) ) | ( (lv_keywords_3_0= RULE_KEYWORDS ) ) | ( (lv_data_4_0= RULE_STRING ) ) )*
            loop4:
            do {
                int alt4=5;
                switch ( input.LA(1) ) {
                case 18:
                    {
                    alt4=1;
                    }
                    break;
                case RULE_BODY:
                    {
                    alt4=2;
                    }
                    break;
                case RULE_KEYWORDS:
                    {
                    alt4=3;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt4=4;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // InternalBPMN_translator.g:344:4: ( (lv_element_1_0= ruleelement ) )
            	    {
            	    // InternalBPMN_translator.g:344:4: ( (lv_element_1_0= ruleelement ) )
            	    // InternalBPMN_translator.g:345:5: (lv_element_1_0= ruleelement )
            	    {
            	    // InternalBPMN_translator.g:345:5: (lv_element_1_0= ruleelement )
            	    // InternalBPMN_translator.g:346:6: lv_element_1_0= ruleelement
            	    {

            	    						newCompositeNode(grammarAccess.getContentAccess().getElementElementParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_element_1_0=ruleelement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getContentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"element",
            	    							lv_element_1_0,
            	    							"org.xtext.BPMN_translator.element");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBPMN_translator.g:364:4: ( (lv_body_2_0= RULE_BODY ) )
            	    {
            	    // InternalBPMN_translator.g:364:4: ( (lv_body_2_0= RULE_BODY ) )
            	    // InternalBPMN_translator.g:365:5: (lv_body_2_0= RULE_BODY )
            	    {
            	    // InternalBPMN_translator.g:365:5: (lv_body_2_0= RULE_BODY )
            	    // InternalBPMN_translator.g:366:6: lv_body_2_0= RULE_BODY
            	    {
            	    lv_body_2_0=(Token)match(input,RULE_BODY,FOLLOW_10); 

            	    						newLeafNode(lv_body_2_0, grammarAccess.getContentAccess().getBodyBODYTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getContentRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"body",
            	    							lv_body_2_0,
            	    							"org.xtext.BPMN_translator.BODY");
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBPMN_translator.g:383:4: ( (lv_keywords_3_0= RULE_KEYWORDS ) )
            	    {
            	    // InternalBPMN_translator.g:383:4: ( (lv_keywords_3_0= RULE_KEYWORDS ) )
            	    // InternalBPMN_translator.g:384:5: (lv_keywords_3_0= RULE_KEYWORDS )
            	    {
            	    // InternalBPMN_translator.g:384:5: (lv_keywords_3_0= RULE_KEYWORDS )
            	    // InternalBPMN_translator.g:385:6: lv_keywords_3_0= RULE_KEYWORDS
            	    {
            	    lv_keywords_3_0=(Token)match(input,RULE_KEYWORDS,FOLLOW_10); 

            	    						newLeafNode(lv_keywords_3_0, grammarAccess.getContentAccess().getKeywordsKEYWORDSTerminalRuleCall_1_2_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getContentRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"keywords",
            	    							lv_keywords_3_0,
            	    							"org.xtext.BPMN_translator.KEYWORDS");
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalBPMN_translator.g:402:4: ( (lv_data_4_0= RULE_STRING ) )
            	    {
            	    // InternalBPMN_translator.g:402:4: ( (lv_data_4_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:403:5: (lv_data_4_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:403:5: (lv_data_4_0= RULE_STRING )
            	    // InternalBPMN_translator.g:404:6: lv_data_4_0= RULE_STRING
            	    {
            	    lv_data_4_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    						newLeafNode(lv_data_4_0, grammarAccess.getContentAccess().getDataSTRINGTerminalRuleCall_1_3_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getContentRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"data",
            	    							lv_data_4_0,
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
    // InternalBPMN_translator.g:425:1: entryRuleOpen returns [EObject current=null] : iv_ruleOpen= ruleOpen EOF ;
    public final EObject entryRuleOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpen = null;


        try {
            // InternalBPMN_translator.g:425:45: (iv_ruleOpen= ruleOpen EOF )
            // InternalBPMN_translator.g:426:2: iv_ruleOpen= ruleOpen EOF
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
    // InternalBPMN_translator.g:432:1: ruleOpen returns [EObject current=null] : (otherlv_0= '<' ( (lv_head_1_0= RULE_HEAD ) ) otherlv_2= ':' ( (lv_keywords_3_0= RULE_KEYWORDS ) ) ( ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' ) | ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* otherlv_10= '>' ) ;
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
            // InternalBPMN_translator.g:438:2: ( (otherlv_0= '<' ( (lv_head_1_0= RULE_HEAD ) ) otherlv_2= ':' ( (lv_keywords_3_0= RULE_KEYWORDS ) ) ( ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' ) | ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* otherlv_10= '>' ) )
            // InternalBPMN_translator.g:439:2: (otherlv_0= '<' ( (lv_head_1_0= RULE_HEAD ) ) otherlv_2= ':' ( (lv_keywords_3_0= RULE_KEYWORDS ) ) ( ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' ) | ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* otherlv_10= '>' )
            {
            // InternalBPMN_translator.g:439:2: (otherlv_0= '<' ( (lv_head_1_0= RULE_HEAD ) ) otherlv_2= ':' ( (lv_keywords_3_0= RULE_KEYWORDS ) ) ( ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' ) | ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* otherlv_10= '>' )
            // InternalBPMN_translator.g:440:3: otherlv_0= '<' ( (lv_head_1_0= RULE_HEAD ) ) otherlv_2= ':' ( (lv_keywords_3_0= RULE_KEYWORDS ) ) ( ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' ) | ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* otherlv_10= '>'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOpenAccess().getLessThanSignKeyword_0());
            		
            // InternalBPMN_translator.g:444:3: ( (lv_head_1_0= RULE_HEAD ) )
            // InternalBPMN_translator.g:445:4: (lv_head_1_0= RULE_HEAD )
            {
            // InternalBPMN_translator.g:445:4: (lv_head_1_0= RULE_HEAD )
            // InternalBPMN_translator.g:446:5: lv_head_1_0= RULE_HEAD
            {
            lv_head_1_0=(Token)match(input,RULE_HEAD,FOLLOW_11); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getOpenAccess().getColonKeyword_2());
            		
            // InternalBPMN_translator.g:466:3: ( (lv_keywords_3_0= RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:467:4: (lv_keywords_3_0= RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:467:4: (lv_keywords_3_0= RULE_KEYWORDS )
            // InternalBPMN_translator.g:468:5: lv_keywords_3_0= RULE_KEYWORDS
            {
            lv_keywords_3_0=(Token)match(input,RULE_KEYWORDS,FOLLOW_13); 

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

            // InternalBPMN_translator.g:484:3: ( ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' ) | ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_HEAD) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==20) ) {
                        alt6=2;
                    }
                    else if ( (LA6_2==19) ) {
                        alt6=1;
                    }


                }
                else if ( (LA6_0==RULE_KEYWORDS) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBPMN_translator.g:485:4: ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' )
            	    {
            	    // InternalBPMN_translator.g:485:4: ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' )
            	    // InternalBPMN_translator.g:486:5: ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':'
            	    {
            	    // InternalBPMN_translator.g:486:5: ( (lv_head1_4_0= RULE_HEAD ) )
            	    // InternalBPMN_translator.g:487:6: (lv_head1_4_0= RULE_HEAD )
            	    {
            	    // InternalBPMN_translator.g:487:6: (lv_head1_4_0= RULE_HEAD )
            	    // InternalBPMN_translator.g:488:7: lv_head1_4_0= RULE_HEAD
            	    {
            	    lv_head1_4_0=(Token)match(input,RULE_HEAD,FOLLOW_11); 

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

            	    otherlv_5=(Token)match(input,19,FOLLOW_13); 

            	    					newLeafNode(otherlv_5, grammarAccess.getOpenAccess().getColonKeyword_4_0_1());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBPMN_translator.g:510:4: ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:510:4: ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:511:5: ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) )
            	    {
            	    // InternalBPMN_translator.g:511:5: ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) )
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
            	            // InternalBPMN_translator.g:512:6: ( (lv_head1_6_0= RULE_HEAD ) )
            	            {
            	            // InternalBPMN_translator.g:512:6: ( (lv_head1_6_0= RULE_HEAD ) )
            	            // InternalBPMN_translator.g:513:7: (lv_head1_6_0= RULE_HEAD )
            	            {
            	            // InternalBPMN_translator.g:513:7: (lv_head1_6_0= RULE_HEAD )
            	            // InternalBPMN_translator.g:514:8: lv_head1_6_0= RULE_HEAD
            	            {
            	            lv_head1_6_0=(Token)match(input,RULE_HEAD,FOLLOW_14); 

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
            	            // InternalBPMN_translator.g:531:6: ( (lv_keywords1_7_0= RULE_KEYWORDS ) )
            	            {
            	            // InternalBPMN_translator.g:531:6: ( (lv_keywords1_7_0= RULE_KEYWORDS ) )
            	            // InternalBPMN_translator.g:532:7: (lv_keywords1_7_0= RULE_KEYWORDS )
            	            {
            	            // InternalBPMN_translator.g:532:7: (lv_keywords1_7_0= RULE_KEYWORDS )
            	            // InternalBPMN_translator.g:533:8: lv_keywords1_7_0= RULE_KEYWORDS
            	            {
            	            lv_keywords1_7_0=(Token)match(input,RULE_KEYWORDS,FOLLOW_14); 

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

            	    otherlv_8=(Token)match(input,20,FOLLOW_6); 

            	    					newLeafNode(otherlv_8, grammarAccess.getOpenAccess().getEqualsSignKeyword_4_1_1());
            	    				
            	    // InternalBPMN_translator.g:554:5: ( (lv_value_9_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:555:6: (lv_value_9_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:555:6: (lv_value_9_0= RULE_STRING )
            	    // InternalBPMN_translator.g:556:7: lv_value_9_0= RULE_STRING
            	    {
            	    lv_value_9_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

            otherlv_10=(Token)match(input,21,FOLLOW_2); 

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
    // InternalBPMN_translator.g:582:1: entryRuleSingleton returns [EObject current=null] : iv_ruleSingleton= ruleSingleton EOF ;
    public final EObject entryRuleSingleton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleton = null;


        try {
            // InternalBPMN_translator.g:582:50: (iv_ruleSingleton= ruleSingleton EOF )
            // InternalBPMN_translator.g:583:2: iv_ruleSingleton= ruleSingleton EOF
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
    // InternalBPMN_translator.g:589:1: ruleSingleton returns [EObject current=null] : ( () (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* ) otherlv_10= '/>' ) ;
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
            // InternalBPMN_translator.g:595:2: ( ( () (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* ) otherlv_10= '/>' ) )
            // InternalBPMN_translator.g:596:2: ( () (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* ) otherlv_10= '/>' )
            {
            // InternalBPMN_translator.g:596:2: ( () (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* ) otherlv_10= '/>' )
            // InternalBPMN_translator.g:597:3: () (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* ) otherlv_10= '/>'
            {
            // InternalBPMN_translator.g:597:3: ()
            // InternalBPMN_translator.g:598:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSingletonAccess().getSingletonAction_0(),
            					current);
            			

            }

            // InternalBPMN_translator.g:604:3: (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* )
            // InternalBPMN_translator.g:605:4: otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )*
            {
            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getSingletonAccess().getLessThanSignKeyword_1_0());
            			
            this_HEAD_2=(Token)match(input,RULE_HEAD,FOLLOW_11); 

            				newLeafNode(this_HEAD_2, grammarAccess.getSingletonAccess().getHEADTerminalRuleCall_1_1());
            			
            otherlv_3=(Token)match(input,19,FOLLOW_12); 

            				newLeafNode(otherlv_3, grammarAccess.getSingletonAccess().getColonKeyword_1_2());
            			
            this_KEYWORDS_4=(Token)match(input,RULE_KEYWORDS,FOLLOW_15); 

            				newLeafNode(this_KEYWORDS_4, grammarAccess.getSingletonAccess().getKEYWORDSTerminalRuleCall_1_3());
            			
            // InternalBPMN_translator.g:621:4: ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )*
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
            	    // InternalBPMN_translator.g:622:5: (this_HEAD_5= RULE_HEAD otherlv_6= ':' )
            	    {
            	    // InternalBPMN_translator.g:622:5: (this_HEAD_5= RULE_HEAD otherlv_6= ':' )
            	    // InternalBPMN_translator.g:623:6: this_HEAD_5= RULE_HEAD otherlv_6= ':'
            	    {
            	    this_HEAD_5=(Token)match(input,RULE_HEAD,FOLLOW_11); 

            	    						newLeafNode(this_HEAD_5, grammarAccess.getSingletonAccess().getHEADTerminalRuleCall_1_4_0_0());
            	    					
            	    otherlv_6=(Token)match(input,19,FOLLOW_15); 

            	    						newLeafNode(otherlv_6, grammarAccess.getSingletonAccess().getColonKeyword_1_4_0_1());
            	    					

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBPMN_translator.g:633:5: (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:633:5: (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:634:6: this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) )
            	    {
            	    this_KEYWORDS_7=(Token)match(input,RULE_KEYWORDS,FOLLOW_14); 

            	    						newLeafNode(this_KEYWORDS_7, grammarAccess.getSingletonAccess().getKEYWORDSTerminalRuleCall_1_4_1_0());
            	    					
            	    otherlv_8=(Token)match(input,20,FOLLOW_6); 

            	    						newLeafNode(otherlv_8, grammarAccess.getSingletonAccess().getEqualsSignKeyword_1_4_1_1());
            	    					
            	    // InternalBPMN_translator.g:642:6: ( (lv_value_9_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:643:7: (lv_value_9_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:643:7: (lv_value_9_0= RULE_STRING )
            	    // InternalBPMN_translator.g:644:8: lv_value_9_0= RULE_STRING
            	    {
            	    lv_value_9_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

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
    // InternalBPMN_translator.g:671:1: entryRuleClose returns [EObject current=null] : iv_ruleClose= ruleClose EOF ;
    public final EObject entryRuleClose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClose = null;


        try {
            // InternalBPMN_translator.g:671:46: (iv_ruleClose= ruleClose EOF )
            // InternalBPMN_translator.g:672:2: iv_ruleClose= ruleClose EOF
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
    // InternalBPMN_translator.g:678:1: ruleClose returns [EObject current=null] : ( () (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' ) ) ;
    public final EObject ruleClose() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_HEAD_2=null;
        Token otherlv_3=null;
        Token this_KEYWORDS_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalBPMN_translator.g:684:2: ( ( () (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' ) ) )
            // InternalBPMN_translator.g:685:2: ( () (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' ) )
            {
            // InternalBPMN_translator.g:685:2: ( () (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' ) )
            // InternalBPMN_translator.g:686:3: () (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' )
            {
            // InternalBPMN_translator.g:686:3: ()
            // InternalBPMN_translator.g:687:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCloseAccess().getCloseAction_0(),
            					current);
            			

            }

            // InternalBPMN_translator.g:693:3: (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' )
            // InternalBPMN_translator.g:694:4: otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>'
            {
            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getCloseAccess().getLessThanSignSolidusKeyword_1_0());
            			
            this_HEAD_2=(Token)match(input,RULE_HEAD,FOLLOW_11); 

            				newLeafNode(this_HEAD_2, grammarAccess.getCloseAccess().getHEADTerminalRuleCall_1_1());
            			
            otherlv_3=(Token)match(input,19,FOLLOW_12); 

            				newLeafNode(otherlv_3, grammarAccess.getCloseAccess().getColonKeyword_1_2());
            			
            this_KEYWORDS_4=(Token)match(input,RULE_KEYWORDS,FOLLOW_16); 

            				newLeafNode(this_KEYWORDS_4, grammarAccess.getCloseAccess().getKEYWORDSTerminalRuleCall_1_3());
            			
            otherlv_5=(Token)match(input,21,FOLLOW_2); 

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

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\22\1\4\1\23\1\7\1\4\1\23\1\24\2\uffff\1\4\1\5\1\4";
    static final String dfa_3s = "\1\22\1\4\1\23\1\7\1\26\2\24\2\uffff\1\26\1\5\1\26";
    static final String dfa_4s = "\7\uffff\1\1\1\2\3\uffff";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5\2\uffff\1\6\15\uffff\1\7\1\10",
            "\1\11\1\7",
            "\1\12",
            "",
            "",
            "\1\5\2\uffff\1\6\15\uffff\1\7\1\10",
            "\1\13",
            "\1\5\2\uffff\1\6\15\uffff\1\7\1\10"
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000008400E0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000400E2L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200090L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400090L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});

}