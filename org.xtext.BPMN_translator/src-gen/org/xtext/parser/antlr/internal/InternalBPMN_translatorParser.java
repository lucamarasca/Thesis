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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HEAD", "RULE_KEYWORDS", "RULE_STRING", "RULE_BODY", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "':'", "'='", "'/>'", "'>'", "'</'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int RULE_KEYWORDS=5;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_HEAD=4;
    public static final int RULE_BODY=7;
    public static final int RULE_ID=9;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=10;

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
    // InternalBPMN_translator.g:107:1: ruleXml returns [EObject current=null] : ( () ( (lv_opening_tag_1_0= ruleOpening ) ) ) ;
    public final EObject ruleXml() throws RecognitionException {
        EObject current = null;

        EObject lv_opening_tag_1_0 = null;



        	enterRule();

        try {
            // InternalBPMN_translator.g:113:2: ( ( () ( (lv_opening_tag_1_0= ruleOpening ) ) ) )
            // InternalBPMN_translator.g:114:2: ( () ( (lv_opening_tag_1_0= ruleOpening ) ) )
            {
            // InternalBPMN_translator.g:114:2: ( () ( (lv_opening_tag_1_0= ruleOpening ) ) )
            // InternalBPMN_translator.g:115:3: () ( (lv_opening_tag_1_0= ruleOpening ) )
            {
            // InternalBPMN_translator.g:115:3: ()
            // InternalBPMN_translator.g:116:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXmlAccess().getXmlAction_0(),
            					current);
            			

            }

            // InternalBPMN_translator.g:122:3: ( (lv_opening_tag_1_0= ruleOpening ) )
            // InternalBPMN_translator.g:123:4: (lv_opening_tag_1_0= ruleOpening )
            {
            // InternalBPMN_translator.g:123:4: (lv_opening_tag_1_0= ruleOpening )
            // InternalBPMN_translator.g:124:5: lv_opening_tag_1_0= ruleOpening
            {

            					newCompositeNode(grammarAccess.getXmlAccess().getOpening_tagOpeningParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_opening_tag_1_0=ruleOpening();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXmlRule());
            					}
            					add(
            						current,
            						"opening_tag",
            						lv_opening_tag_1_0,
            						"org.xtext.BPMN_translator.Opening");
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
    // $ANTLR end "ruleXml"


    // $ANTLR start "entryRuleOpening"
    // InternalBPMN_translator.g:145:1: entryRuleOpening returns [EObject current=null] : iv_ruleOpening= ruleOpening EOF ;
    public final EObject entryRuleOpening() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpening = null;


        try {
            // InternalBPMN_translator.g:145:48: (iv_ruleOpening= ruleOpening EOF )
            // InternalBPMN_translator.g:146:2: iv_ruleOpening= ruleOpening EOF
            {
             newCompositeNode(grammarAccess.getOpeningRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpening=ruleOpening();

            state._fsp--;

             current =iv_ruleOpening; 
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
    // $ANTLR end "entryRuleOpening"


    // $ANTLR start "ruleOpening"
    // InternalBPMN_translator.g:152:1: ruleOpening returns [EObject current=null] : ( ( () ( ( ( (lv_Prova_1_0= ruleOpen ) ) ( (lv_Prova1_2_0= ruleClose ) ) ) ( ( (lv_Prova_3_0= ruleOpen ) ) ( (lv_Prova1_4_0= ruleClose ) ) )* ( (otherlv_5= '<' this_HEAD_6= RULE_HEAD otherlv_7= ':' this_KEYWORDS_8= RULE_KEYWORDS ( (this_HEAD_9= RULE_HEAD otherlv_10= ':' ) | (this_KEYWORDS_11= RULE_KEYWORDS otherlv_12= '=' ( (lv_value_13_0= RULE_STRING ) ) ) )* ) otherlv_14= '/>' )* ) ) | ( () ( (otherlv_16= '<' this_HEAD_17= RULE_HEAD otherlv_18= ':' this_KEYWORDS_19= RULE_KEYWORDS ( (this_HEAD_20= RULE_HEAD otherlv_21= ':' ) | (this_KEYWORDS_22= RULE_KEYWORDS otherlv_23= '=' ( (lv_value_24_0= RULE_STRING ) ) ) )* ) otherlv_25= '/>' )* ) ) ;
    public final EObject ruleOpening() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token this_HEAD_6=null;
        Token otherlv_7=null;
        Token this_KEYWORDS_8=null;
        Token this_HEAD_9=null;
        Token otherlv_10=null;
        Token this_KEYWORDS_11=null;
        Token otherlv_12=null;
        Token lv_value_13_0=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token this_HEAD_17=null;
        Token otherlv_18=null;
        Token this_KEYWORDS_19=null;
        Token this_HEAD_20=null;
        Token otherlv_21=null;
        Token this_KEYWORDS_22=null;
        Token otherlv_23=null;
        Token lv_value_24_0=null;
        Token otherlv_25=null;
        EObject lv_Prova_1_0 = null;

        EObject lv_Prova1_2_0 = null;

        EObject lv_Prova_3_0 = null;

        EObject lv_Prova1_4_0 = null;



        	enterRule();

        try {
            // InternalBPMN_translator.g:158:2: ( ( ( () ( ( ( (lv_Prova_1_0= ruleOpen ) ) ( (lv_Prova1_2_0= ruleClose ) ) ) ( ( (lv_Prova_3_0= ruleOpen ) ) ( (lv_Prova1_4_0= ruleClose ) ) )* ( (otherlv_5= '<' this_HEAD_6= RULE_HEAD otherlv_7= ':' this_KEYWORDS_8= RULE_KEYWORDS ( (this_HEAD_9= RULE_HEAD otherlv_10= ':' ) | (this_KEYWORDS_11= RULE_KEYWORDS otherlv_12= '=' ( (lv_value_13_0= RULE_STRING ) ) ) )* ) otherlv_14= '/>' )* ) ) | ( () ( (otherlv_16= '<' this_HEAD_17= RULE_HEAD otherlv_18= ':' this_KEYWORDS_19= RULE_KEYWORDS ( (this_HEAD_20= RULE_HEAD otherlv_21= ':' ) | (this_KEYWORDS_22= RULE_KEYWORDS otherlv_23= '=' ( (lv_value_24_0= RULE_STRING ) ) ) )* ) otherlv_25= '/>' )* ) ) )
            // InternalBPMN_translator.g:159:2: ( ( () ( ( ( (lv_Prova_1_0= ruleOpen ) ) ( (lv_Prova1_2_0= ruleClose ) ) ) ( ( (lv_Prova_3_0= ruleOpen ) ) ( (lv_Prova1_4_0= ruleClose ) ) )* ( (otherlv_5= '<' this_HEAD_6= RULE_HEAD otherlv_7= ':' this_KEYWORDS_8= RULE_KEYWORDS ( (this_HEAD_9= RULE_HEAD otherlv_10= ':' ) | (this_KEYWORDS_11= RULE_KEYWORDS otherlv_12= '=' ( (lv_value_13_0= RULE_STRING ) ) ) )* ) otherlv_14= '/>' )* ) ) | ( () ( (otherlv_16= '<' this_HEAD_17= RULE_HEAD otherlv_18= ':' this_KEYWORDS_19= RULE_KEYWORDS ( (this_HEAD_20= RULE_HEAD otherlv_21= ':' ) | (this_KEYWORDS_22= RULE_KEYWORDS otherlv_23= '=' ( (lv_value_24_0= RULE_STRING ) ) ) )* ) otherlv_25= '/>' )* ) )
            {
            // InternalBPMN_translator.g:159:2: ( ( () ( ( ( (lv_Prova_1_0= ruleOpen ) ) ( (lv_Prova1_2_0= ruleClose ) ) ) ( ( (lv_Prova_3_0= ruleOpen ) ) ( (lv_Prova1_4_0= ruleClose ) ) )* ( (otherlv_5= '<' this_HEAD_6= RULE_HEAD otherlv_7= ':' this_KEYWORDS_8= RULE_KEYWORDS ( (this_HEAD_9= RULE_HEAD otherlv_10= ':' ) | (this_KEYWORDS_11= RULE_KEYWORDS otherlv_12= '=' ( (lv_value_13_0= RULE_STRING ) ) ) )* ) otherlv_14= '/>' )* ) ) | ( () ( (otherlv_16= '<' this_HEAD_17= RULE_HEAD otherlv_18= ':' this_KEYWORDS_19= RULE_KEYWORDS ( (this_HEAD_20= RULE_HEAD otherlv_21= ':' ) | (this_KEYWORDS_22= RULE_KEYWORDS otherlv_23= '=' ( (lv_value_24_0= RULE_STRING ) ) ) )* ) otherlv_25= '/>' )* ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalBPMN_translator.g:160:3: ( () ( ( ( (lv_Prova_1_0= ruleOpen ) ) ( (lv_Prova1_2_0= ruleClose ) ) ) ( ( (lv_Prova_3_0= ruleOpen ) ) ( (lv_Prova1_4_0= ruleClose ) ) )* ( (otherlv_5= '<' this_HEAD_6= RULE_HEAD otherlv_7= ':' this_KEYWORDS_8= RULE_KEYWORDS ( (this_HEAD_9= RULE_HEAD otherlv_10= ':' ) | (this_KEYWORDS_11= RULE_KEYWORDS otherlv_12= '=' ( (lv_value_13_0= RULE_STRING ) ) ) )* ) otherlv_14= '/>' )* ) )
                    {
                    // InternalBPMN_translator.g:160:3: ( () ( ( ( (lv_Prova_1_0= ruleOpen ) ) ( (lv_Prova1_2_0= ruleClose ) ) ) ( ( (lv_Prova_3_0= ruleOpen ) ) ( (lv_Prova1_4_0= ruleClose ) ) )* ( (otherlv_5= '<' this_HEAD_6= RULE_HEAD otherlv_7= ':' this_KEYWORDS_8= RULE_KEYWORDS ( (this_HEAD_9= RULE_HEAD otherlv_10= ':' ) | (this_KEYWORDS_11= RULE_KEYWORDS otherlv_12= '=' ( (lv_value_13_0= RULE_STRING ) ) ) )* ) otherlv_14= '/>' )* ) )
                    // InternalBPMN_translator.g:161:4: () ( ( ( (lv_Prova_1_0= ruleOpen ) ) ( (lv_Prova1_2_0= ruleClose ) ) ) ( ( (lv_Prova_3_0= ruleOpen ) ) ( (lv_Prova1_4_0= ruleClose ) ) )* ( (otherlv_5= '<' this_HEAD_6= RULE_HEAD otherlv_7= ':' this_KEYWORDS_8= RULE_KEYWORDS ( (this_HEAD_9= RULE_HEAD otherlv_10= ':' ) | (this_KEYWORDS_11= RULE_KEYWORDS otherlv_12= '=' ( (lv_value_13_0= RULE_STRING ) ) ) )* ) otherlv_14= '/>' )* )
                    {
                    // InternalBPMN_translator.g:161:4: ()
                    // InternalBPMN_translator.g:162:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOpeningAccess().getOpeningAction_0_0(),
                    						current);
                    				

                    }

                    // InternalBPMN_translator.g:168:4: ( ( ( (lv_Prova_1_0= ruleOpen ) ) ( (lv_Prova1_2_0= ruleClose ) ) ) ( ( (lv_Prova_3_0= ruleOpen ) ) ( (lv_Prova1_4_0= ruleClose ) ) )* ( (otherlv_5= '<' this_HEAD_6= RULE_HEAD otherlv_7= ':' this_KEYWORDS_8= RULE_KEYWORDS ( (this_HEAD_9= RULE_HEAD otherlv_10= ':' ) | (this_KEYWORDS_11= RULE_KEYWORDS otherlv_12= '=' ( (lv_value_13_0= RULE_STRING ) ) ) )* ) otherlv_14= '/>' )* )
                    // InternalBPMN_translator.g:169:5: ( ( (lv_Prova_1_0= ruleOpen ) ) ( (lv_Prova1_2_0= ruleClose ) ) ) ( ( (lv_Prova_3_0= ruleOpen ) ) ( (lv_Prova1_4_0= ruleClose ) ) )* ( (otherlv_5= '<' this_HEAD_6= RULE_HEAD otherlv_7= ':' this_KEYWORDS_8= RULE_KEYWORDS ( (this_HEAD_9= RULE_HEAD otherlv_10= ':' ) | (this_KEYWORDS_11= RULE_KEYWORDS otherlv_12= '=' ( (lv_value_13_0= RULE_STRING ) ) ) )* ) otherlv_14= '/>' )*
                    {
                    // InternalBPMN_translator.g:169:5: ( ( (lv_Prova_1_0= ruleOpen ) ) ( (lv_Prova1_2_0= ruleClose ) ) )
                    // InternalBPMN_translator.g:170:6: ( (lv_Prova_1_0= ruleOpen ) ) ( (lv_Prova1_2_0= ruleClose ) )
                    {
                    // InternalBPMN_translator.g:170:6: ( (lv_Prova_1_0= ruleOpen ) )
                    // InternalBPMN_translator.g:171:7: (lv_Prova_1_0= ruleOpen )
                    {
                    // InternalBPMN_translator.g:171:7: (lv_Prova_1_0= ruleOpen )
                    // InternalBPMN_translator.g:172:8: lv_Prova_1_0= ruleOpen
                    {

                    								newCompositeNode(grammarAccess.getOpeningAccess().getProvaOpenParserRuleCall_0_1_0_0_0());
                    							
                    pushFollow(FOLLOW_3);
                    lv_Prova_1_0=ruleOpen();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getOpeningRule());
                    								}
                    								add(
                    									current,
                    									"Prova",
                    									lv_Prova_1_0,
                    									"org.xtext.BPMN_translator.Open");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }

                    // InternalBPMN_translator.g:189:6: ( (lv_Prova1_2_0= ruleClose ) )
                    // InternalBPMN_translator.g:190:7: (lv_Prova1_2_0= ruleClose )
                    {
                    // InternalBPMN_translator.g:190:7: (lv_Prova1_2_0= ruleClose )
                    // InternalBPMN_translator.g:191:8: lv_Prova1_2_0= ruleClose
                    {

                    								newCompositeNode(grammarAccess.getOpeningAccess().getProva1CloseParserRuleCall_0_1_0_1_0());
                    							
                    pushFollow(FOLLOW_4);
                    lv_Prova1_2_0=ruleClose();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getOpeningRule());
                    								}
                    								add(
                    									current,
                    									"Prova1",
                    									lv_Prova1_2_0,
                    									"org.xtext.BPMN_translator.Close");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }


                    }

                    // InternalBPMN_translator.g:209:5: ( ( (lv_Prova_3_0= ruleOpen ) ) ( (lv_Prova1_4_0= ruleClose ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        alt1 = dfa1.predict(input);
                        switch (alt1) {
                    	case 1 :
                    	    // InternalBPMN_translator.g:210:6: ( (lv_Prova_3_0= ruleOpen ) ) ( (lv_Prova1_4_0= ruleClose ) )
                    	    {
                    	    // InternalBPMN_translator.g:210:6: ( (lv_Prova_3_0= ruleOpen ) )
                    	    // InternalBPMN_translator.g:211:7: (lv_Prova_3_0= ruleOpen )
                    	    {
                    	    // InternalBPMN_translator.g:211:7: (lv_Prova_3_0= ruleOpen )
                    	    // InternalBPMN_translator.g:212:8: lv_Prova_3_0= ruleOpen
                    	    {

                    	    								newCompositeNode(grammarAccess.getOpeningAccess().getProvaOpenParserRuleCall_0_1_1_0_0());
                    	    							
                    	    pushFollow(FOLLOW_3);
                    	    lv_Prova_3_0=ruleOpen();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getOpeningRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"Prova",
                    	    									lv_Prova_3_0,
                    	    									"org.xtext.BPMN_translator.Open");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }

                    	    // InternalBPMN_translator.g:229:6: ( (lv_Prova1_4_0= ruleClose ) )
                    	    // InternalBPMN_translator.g:230:7: (lv_Prova1_4_0= ruleClose )
                    	    {
                    	    // InternalBPMN_translator.g:230:7: (lv_Prova1_4_0= ruleClose )
                    	    // InternalBPMN_translator.g:231:8: lv_Prova1_4_0= ruleClose
                    	    {

                    	    								newCompositeNode(grammarAccess.getOpeningAccess().getProva1CloseParserRuleCall_0_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_4);
                    	    lv_Prova1_4_0=ruleClose();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getOpeningRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"Prova1",
                    	    									lv_Prova1_4_0,
                    	    									"org.xtext.BPMN_translator.Close");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    // InternalBPMN_translator.g:249:5: ( (otherlv_5= '<' this_HEAD_6= RULE_HEAD otherlv_7= ':' this_KEYWORDS_8= RULE_KEYWORDS ( (this_HEAD_9= RULE_HEAD otherlv_10= ':' ) | (this_KEYWORDS_11= RULE_KEYWORDS otherlv_12= '=' ( (lv_value_13_0= RULE_STRING ) ) ) )* ) otherlv_14= '/>' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalBPMN_translator.g:250:6: (otherlv_5= '<' this_HEAD_6= RULE_HEAD otherlv_7= ':' this_KEYWORDS_8= RULE_KEYWORDS ( (this_HEAD_9= RULE_HEAD otherlv_10= ':' ) | (this_KEYWORDS_11= RULE_KEYWORDS otherlv_12= '=' ( (lv_value_13_0= RULE_STRING ) ) ) )* ) otherlv_14= '/>'
                    	    {
                    	    // InternalBPMN_translator.g:250:6: (otherlv_5= '<' this_HEAD_6= RULE_HEAD otherlv_7= ':' this_KEYWORDS_8= RULE_KEYWORDS ( (this_HEAD_9= RULE_HEAD otherlv_10= ':' ) | (this_KEYWORDS_11= RULE_KEYWORDS otherlv_12= '=' ( (lv_value_13_0= RULE_STRING ) ) ) )* )
                    	    // InternalBPMN_translator.g:251:7: otherlv_5= '<' this_HEAD_6= RULE_HEAD otherlv_7= ':' this_KEYWORDS_8= RULE_KEYWORDS ( (this_HEAD_9= RULE_HEAD otherlv_10= ':' ) | (this_KEYWORDS_11= RULE_KEYWORDS otherlv_12= '=' ( (lv_value_13_0= RULE_STRING ) ) ) )*
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

                    	    							newLeafNode(otherlv_5, grammarAccess.getOpeningAccess().getLessThanSignKeyword_0_1_2_0_0());
                    	    						
                    	    this_HEAD_6=(Token)match(input,RULE_HEAD,FOLLOW_6); 

                    	    							newLeafNode(this_HEAD_6, grammarAccess.getOpeningAccess().getHEADTerminalRuleCall_0_1_2_0_1());
                    	    						
                    	    otherlv_7=(Token)match(input,15,FOLLOW_7); 

                    	    							newLeafNode(otherlv_7, grammarAccess.getOpeningAccess().getColonKeyword_0_1_2_0_2());
                    	    						
                    	    this_KEYWORDS_8=(Token)match(input,RULE_KEYWORDS,FOLLOW_8); 

                    	    							newLeafNode(this_KEYWORDS_8, grammarAccess.getOpeningAccess().getKEYWORDSTerminalRuleCall_0_1_2_0_3());
                    	    						
                    	    // InternalBPMN_translator.g:267:7: ( (this_HEAD_9= RULE_HEAD otherlv_10= ':' ) | (this_KEYWORDS_11= RULE_KEYWORDS otherlv_12= '=' ( (lv_value_13_0= RULE_STRING ) ) ) )*
                    	    loop2:
                    	    do {
                    	        int alt2=3;
                    	        int LA2_0 = input.LA(1);

                    	        if ( (LA2_0==RULE_HEAD) ) {
                    	            alt2=1;
                    	        }
                    	        else if ( (LA2_0==RULE_KEYWORDS) ) {
                    	            alt2=2;
                    	        }


                    	        switch (alt2) {
                    	    	case 1 :
                    	    	    // InternalBPMN_translator.g:268:8: (this_HEAD_9= RULE_HEAD otherlv_10= ':' )
                    	    	    {
                    	    	    // InternalBPMN_translator.g:268:8: (this_HEAD_9= RULE_HEAD otherlv_10= ':' )
                    	    	    // InternalBPMN_translator.g:269:9: this_HEAD_9= RULE_HEAD otherlv_10= ':'
                    	    	    {
                    	    	    this_HEAD_9=(Token)match(input,RULE_HEAD,FOLLOW_6); 

                    	    	    									newLeafNode(this_HEAD_9, grammarAccess.getOpeningAccess().getHEADTerminalRuleCall_0_1_2_0_4_0_0());
                    	    	    								
                    	    	    otherlv_10=(Token)match(input,15,FOLLOW_8); 

                    	    	    									newLeafNode(otherlv_10, grammarAccess.getOpeningAccess().getColonKeyword_0_1_2_0_4_0_1());
                    	    	    								

                    	    	    }


                    	    	    }
                    	    	    break;
                    	    	case 2 :
                    	    	    // InternalBPMN_translator.g:279:8: (this_KEYWORDS_11= RULE_KEYWORDS otherlv_12= '=' ( (lv_value_13_0= RULE_STRING ) ) )
                    	    	    {
                    	    	    // InternalBPMN_translator.g:279:8: (this_KEYWORDS_11= RULE_KEYWORDS otherlv_12= '=' ( (lv_value_13_0= RULE_STRING ) ) )
                    	    	    // InternalBPMN_translator.g:280:9: this_KEYWORDS_11= RULE_KEYWORDS otherlv_12= '=' ( (lv_value_13_0= RULE_STRING ) )
                    	    	    {
                    	    	    this_KEYWORDS_11=(Token)match(input,RULE_KEYWORDS,FOLLOW_9); 

                    	    	    									newLeafNode(this_KEYWORDS_11, grammarAccess.getOpeningAccess().getKEYWORDSTerminalRuleCall_0_1_2_0_4_1_0());
                    	    	    								
                    	    	    otherlv_12=(Token)match(input,16,FOLLOW_10); 

                    	    	    									newLeafNode(otherlv_12, grammarAccess.getOpeningAccess().getEqualsSignKeyword_0_1_2_0_4_1_1());
                    	    	    								
                    	    	    // InternalBPMN_translator.g:288:9: ( (lv_value_13_0= RULE_STRING ) )
                    	    	    // InternalBPMN_translator.g:289:10: (lv_value_13_0= RULE_STRING )
                    	    	    {
                    	    	    // InternalBPMN_translator.g:289:10: (lv_value_13_0= RULE_STRING )
                    	    	    // InternalBPMN_translator.g:290:11: lv_value_13_0= RULE_STRING
                    	    	    {
                    	    	    lv_value_13_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    	    	    											newLeafNode(lv_value_13_0, grammarAccess.getOpeningAccess().getValueSTRINGTerminalRuleCall_0_1_2_0_4_1_2_0());
                    	    	    										

                    	    	    											if (current==null) {
                    	    	    												current = createModelElement(grammarAccess.getOpeningRule());
                    	    	    											}
                    	    	    											addWithLastConsumed(
                    	    	    												current,
                    	    	    												"value",
                    	    	    												lv_value_13_0,
                    	    	    												"org.eclipse.xtext.common.Terminals.STRING");
                    	    	    										

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

                    	    otherlv_14=(Token)match(input,17,FOLLOW_4); 

                    	    						newLeafNode(otherlv_14, grammarAccess.getOpeningAccess().getSolidusGreaterThanSignKeyword_0_1_2_1());
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:317:3: ( () ( (otherlv_16= '<' this_HEAD_17= RULE_HEAD otherlv_18= ':' this_KEYWORDS_19= RULE_KEYWORDS ( (this_HEAD_20= RULE_HEAD otherlv_21= ':' ) | (this_KEYWORDS_22= RULE_KEYWORDS otherlv_23= '=' ( (lv_value_24_0= RULE_STRING ) ) ) )* ) otherlv_25= '/>' )* )
                    {
                    // InternalBPMN_translator.g:317:3: ( () ( (otherlv_16= '<' this_HEAD_17= RULE_HEAD otherlv_18= ':' this_KEYWORDS_19= RULE_KEYWORDS ( (this_HEAD_20= RULE_HEAD otherlv_21= ':' ) | (this_KEYWORDS_22= RULE_KEYWORDS otherlv_23= '=' ( (lv_value_24_0= RULE_STRING ) ) ) )* ) otherlv_25= '/>' )* )
                    // InternalBPMN_translator.g:318:4: () ( (otherlv_16= '<' this_HEAD_17= RULE_HEAD otherlv_18= ':' this_KEYWORDS_19= RULE_KEYWORDS ( (this_HEAD_20= RULE_HEAD otherlv_21= ':' ) | (this_KEYWORDS_22= RULE_KEYWORDS otherlv_23= '=' ( (lv_value_24_0= RULE_STRING ) ) ) )* ) otherlv_25= '/>' )*
                    {
                    // InternalBPMN_translator.g:318:4: ()
                    // InternalBPMN_translator.g:319:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOpeningAccess().getOpeningAction_1_0(),
                    						current);
                    				

                    }

                    // InternalBPMN_translator.g:325:4: ( (otherlv_16= '<' this_HEAD_17= RULE_HEAD otherlv_18= ':' this_KEYWORDS_19= RULE_KEYWORDS ( (this_HEAD_20= RULE_HEAD otherlv_21= ':' ) | (this_KEYWORDS_22= RULE_KEYWORDS otherlv_23= '=' ( (lv_value_24_0= RULE_STRING ) ) ) )* ) otherlv_25= '/>' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBPMN_translator.g:326:5: (otherlv_16= '<' this_HEAD_17= RULE_HEAD otherlv_18= ':' this_KEYWORDS_19= RULE_KEYWORDS ( (this_HEAD_20= RULE_HEAD otherlv_21= ':' ) | (this_KEYWORDS_22= RULE_KEYWORDS otherlv_23= '=' ( (lv_value_24_0= RULE_STRING ) ) ) )* ) otherlv_25= '/>'
                    	    {
                    	    // InternalBPMN_translator.g:326:5: (otherlv_16= '<' this_HEAD_17= RULE_HEAD otherlv_18= ':' this_KEYWORDS_19= RULE_KEYWORDS ( (this_HEAD_20= RULE_HEAD otherlv_21= ':' ) | (this_KEYWORDS_22= RULE_KEYWORDS otherlv_23= '=' ( (lv_value_24_0= RULE_STRING ) ) ) )* )
                    	    // InternalBPMN_translator.g:327:6: otherlv_16= '<' this_HEAD_17= RULE_HEAD otherlv_18= ':' this_KEYWORDS_19= RULE_KEYWORDS ( (this_HEAD_20= RULE_HEAD otherlv_21= ':' ) | (this_KEYWORDS_22= RULE_KEYWORDS otherlv_23= '=' ( (lv_value_24_0= RULE_STRING ) ) ) )*
                    	    {
                    	    otherlv_16=(Token)match(input,14,FOLLOW_5); 

                    	    						newLeafNode(otherlv_16, grammarAccess.getOpeningAccess().getLessThanSignKeyword_1_1_0_0());
                    	    					
                    	    this_HEAD_17=(Token)match(input,RULE_HEAD,FOLLOW_6); 

                    	    						newLeafNode(this_HEAD_17, grammarAccess.getOpeningAccess().getHEADTerminalRuleCall_1_1_0_1());
                    	    					
                    	    otherlv_18=(Token)match(input,15,FOLLOW_7); 

                    	    						newLeafNode(otherlv_18, grammarAccess.getOpeningAccess().getColonKeyword_1_1_0_2());
                    	    					
                    	    this_KEYWORDS_19=(Token)match(input,RULE_KEYWORDS,FOLLOW_8); 

                    	    						newLeafNode(this_KEYWORDS_19, grammarAccess.getOpeningAccess().getKEYWORDSTerminalRuleCall_1_1_0_3());
                    	    					
                    	    // InternalBPMN_translator.g:343:6: ( (this_HEAD_20= RULE_HEAD otherlv_21= ':' ) | (this_KEYWORDS_22= RULE_KEYWORDS otherlv_23= '=' ( (lv_value_24_0= RULE_STRING ) ) ) )*
                    	    loop4:
                    	    do {
                    	        int alt4=3;
                    	        int LA4_0 = input.LA(1);

                    	        if ( (LA4_0==RULE_HEAD) ) {
                    	            alt4=1;
                    	        }
                    	        else if ( (LA4_0==RULE_KEYWORDS) ) {
                    	            alt4=2;
                    	        }


                    	        switch (alt4) {
                    	    	case 1 :
                    	    	    // InternalBPMN_translator.g:344:7: (this_HEAD_20= RULE_HEAD otherlv_21= ':' )
                    	    	    {
                    	    	    // InternalBPMN_translator.g:344:7: (this_HEAD_20= RULE_HEAD otherlv_21= ':' )
                    	    	    // InternalBPMN_translator.g:345:8: this_HEAD_20= RULE_HEAD otherlv_21= ':'
                    	    	    {
                    	    	    this_HEAD_20=(Token)match(input,RULE_HEAD,FOLLOW_6); 

                    	    	    								newLeafNode(this_HEAD_20, grammarAccess.getOpeningAccess().getHEADTerminalRuleCall_1_1_0_4_0_0());
                    	    	    							
                    	    	    otherlv_21=(Token)match(input,15,FOLLOW_8); 

                    	    	    								newLeafNode(otherlv_21, grammarAccess.getOpeningAccess().getColonKeyword_1_1_0_4_0_1());
                    	    	    							

                    	    	    }


                    	    	    }
                    	    	    break;
                    	    	case 2 :
                    	    	    // InternalBPMN_translator.g:355:7: (this_KEYWORDS_22= RULE_KEYWORDS otherlv_23= '=' ( (lv_value_24_0= RULE_STRING ) ) )
                    	    	    {
                    	    	    // InternalBPMN_translator.g:355:7: (this_KEYWORDS_22= RULE_KEYWORDS otherlv_23= '=' ( (lv_value_24_0= RULE_STRING ) ) )
                    	    	    // InternalBPMN_translator.g:356:8: this_KEYWORDS_22= RULE_KEYWORDS otherlv_23= '=' ( (lv_value_24_0= RULE_STRING ) )
                    	    	    {
                    	    	    this_KEYWORDS_22=(Token)match(input,RULE_KEYWORDS,FOLLOW_9); 

                    	    	    								newLeafNode(this_KEYWORDS_22, grammarAccess.getOpeningAccess().getKEYWORDSTerminalRuleCall_1_1_0_4_1_0());
                    	    	    							
                    	    	    otherlv_23=(Token)match(input,16,FOLLOW_10); 

                    	    	    								newLeafNode(otherlv_23, grammarAccess.getOpeningAccess().getEqualsSignKeyword_1_1_0_4_1_1());
                    	    	    							
                    	    	    // InternalBPMN_translator.g:364:8: ( (lv_value_24_0= RULE_STRING ) )
                    	    	    // InternalBPMN_translator.g:365:9: (lv_value_24_0= RULE_STRING )
                    	    	    {
                    	    	    // InternalBPMN_translator.g:365:9: (lv_value_24_0= RULE_STRING )
                    	    	    // InternalBPMN_translator.g:366:10: lv_value_24_0= RULE_STRING
                    	    	    {
                    	    	    lv_value_24_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    	    	    										newLeafNode(lv_value_24_0, grammarAccess.getOpeningAccess().getValueSTRINGTerminalRuleCall_1_1_0_4_1_2_0());
                    	    	    									

                    	    	    										if (current==null) {
                    	    	    											current = createModelElement(grammarAccess.getOpeningRule());
                    	    	    										}
                    	    	    										addWithLastConsumed(
                    	    	    											current,
                    	    	    											"value",
                    	    	    											lv_value_24_0,
                    	    	    											"org.eclipse.xtext.common.Terminals.STRING");
                    	    	    									

                    	    	    }


                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop4;
                    	        }
                    	    } while (true);


                    	    }

                    	    otherlv_25=(Token)match(input,17,FOLLOW_4); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getOpeningAccess().getSolidusGreaterThanSignKeyword_1_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


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
    // $ANTLR end "ruleOpening"


    // $ANTLR start "entryRuleData"
    // InternalBPMN_translator.g:395:1: entryRuleData returns [String current=null] : iv_ruleData= ruleData EOF ;
    public final String entryRuleData() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleData = null;


        try {
            // InternalBPMN_translator.g:395:44: (iv_ruleData= ruleData EOF )
            // InternalBPMN_translator.g:396:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData.getText(); 
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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalBPMN_translator.g:402:1: ruleData returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BODY_0= RULE_BODY | this_KEYWORDS_1= RULE_KEYWORDS | this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleData() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BODY_0=null;
        Token this_KEYWORDS_1=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalBPMN_translator.g:408:2: ( (this_BODY_0= RULE_BODY | this_KEYWORDS_1= RULE_KEYWORDS | this_STRING_2= RULE_STRING ) )
            // InternalBPMN_translator.g:409:2: (this_BODY_0= RULE_BODY | this_KEYWORDS_1= RULE_KEYWORDS | this_STRING_2= RULE_STRING )
            {
            // InternalBPMN_translator.g:409:2: (this_BODY_0= RULE_BODY | this_KEYWORDS_1= RULE_KEYWORDS | this_STRING_2= RULE_STRING )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_BODY:
                {
                alt7=1;
                }
                break;
            case RULE_KEYWORDS:
                {
                alt7=2;
                }
                break;
            case RULE_STRING:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBPMN_translator.g:410:3: this_BODY_0= RULE_BODY
                    {
                    this_BODY_0=(Token)match(input,RULE_BODY,FOLLOW_2); 

                    			current.merge(this_BODY_0);
                    		

                    			newLeafNode(this_BODY_0, grammarAccess.getDataAccess().getBODYTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:418:3: this_KEYWORDS_1= RULE_KEYWORDS
                    {
                    this_KEYWORDS_1=(Token)match(input,RULE_KEYWORDS,FOLLOW_2); 

                    			current.merge(this_KEYWORDS_1);
                    		

                    			newLeafNode(this_KEYWORDS_1, grammarAccess.getDataAccess().getKEYWORDSTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBPMN_translator.g:426:3: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_2);
                    		

                    			newLeafNode(this_STRING_2, grammarAccess.getDataAccess().getSTRINGTerminalRuleCall_2());
                    		

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
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleOpen"
    // InternalBPMN_translator.g:437:1: entryRuleOpen returns [EObject current=null] : iv_ruleOpen= ruleOpen EOF ;
    public final EObject entryRuleOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpen = null;


        try {
            // InternalBPMN_translator.g:437:45: (iv_ruleOpen= ruleOpen EOF )
            // InternalBPMN_translator.g:438:2: iv_ruleOpen= ruleOpen EOF
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
    // InternalBPMN_translator.g:444:1: ruleOpen returns [EObject current=null] : ( () (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* otherlv_10= '>' ) ( ruleData | ( (lv_prova_12_0= ruleOpening ) ) ) ) ;
    public final EObject ruleOpen() throws RecognitionException {
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
        EObject lv_prova_12_0 = null;



        	enterRule();

        try {
            // InternalBPMN_translator.g:450:2: ( ( () (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* otherlv_10= '>' ) ( ruleData | ( (lv_prova_12_0= ruleOpening ) ) ) ) )
            // InternalBPMN_translator.g:451:2: ( () (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* otherlv_10= '>' ) ( ruleData | ( (lv_prova_12_0= ruleOpening ) ) ) )
            {
            // InternalBPMN_translator.g:451:2: ( () (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* otherlv_10= '>' ) ( ruleData | ( (lv_prova_12_0= ruleOpening ) ) ) )
            // InternalBPMN_translator.g:452:3: () (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* otherlv_10= '>' ) ( ruleData | ( (lv_prova_12_0= ruleOpening ) ) )
            {
            // InternalBPMN_translator.g:452:3: ()
            // InternalBPMN_translator.g:453:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOpenAccess().getOpensAction_0(),
            					current);
            			

            }

            // InternalBPMN_translator.g:459:3: (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* otherlv_10= '>' )
            // InternalBPMN_translator.g:460:4: otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* otherlv_10= '>'
            {
            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            				newLeafNode(otherlv_1, grammarAccess.getOpenAccess().getLessThanSignKeyword_1_0());
            			
            this_HEAD_2=(Token)match(input,RULE_HEAD,FOLLOW_6); 

            				newLeafNode(this_HEAD_2, grammarAccess.getOpenAccess().getHEADTerminalRuleCall_1_1());
            			
            otherlv_3=(Token)match(input,15,FOLLOW_7); 

            				newLeafNode(otherlv_3, grammarAccess.getOpenAccess().getColonKeyword_1_2());
            			
            this_KEYWORDS_4=(Token)match(input,RULE_KEYWORDS,FOLLOW_11); 

            				newLeafNode(this_KEYWORDS_4, grammarAccess.getOpenAccess().getKEYWORDSTerminalRuleCall_1_3());
            			
            // InternalBPMN_translator.g:476:4: ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_HEAD) ) {
                    alt8=1;
                }
                else if ( (LA8_0==RULE_KEYWORDS) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBPMN_translator.g:477:5: (this_HEAD_5= RULE_HEAD otherlv_6= ':' )
            	    {
            	    // InternalBPMN_translator.g:477:5: (this_HEAD_5= RULE_HEAD otherlv_6= ':' )
            	    // InternalBPMN_translator.g:478:6: this_HEAD_5= RULE_HEAD otherlv_6= ':'
            	    {
            	    this_HEAD_5=(Token)match(input,RULE_HEAD,FOLLOW_6); 

            	    						newLeafNode(this_HEAD_5, grammarAccess.getOpenAccess().getHEADTerminalRuleCall_1_4_0_0());
            	    					
            	    otherlv_6=(Token)match(input,15,FOLLOW_11); 

            	    						newLeafNode(otherlv_6, grammarAccess.getOpenAccess().getColonKeyword_1_4_0_1());
            	    					

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBPMN_translator.g:488:5: (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:488:5: (this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:489:6: this_KEYWORDS_7= RULE_KEYWORDS otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) )
            	    {
            	    this_KEYWORDS_7=(Token)match(input,RULE_KEYWORDS,FOLLOW_9); 

            	    						newLeafNode(this_KEYWORDS_7, grammarAccess.getOpenAccess().getKEYWORDSTerminalRuleCall_1_4_1_0());
            	    					
            	    otherlv_8=(Token)match(input,16,FOLLOW_10); 

            	    						newLeafNode(otherlv_8, grammarAccess.getOpenAccess().getEqualsSignKeyword_1_4_1_1());
            	    					
            	    // InternalBPMN_translator.g:497:6: ( (lv_value_9_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:498:7: (lv_value_9_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:498:7: (lv_value_9_0= RULE_STRING )
            	    // InternalBPMN_translator.g:499:8: lv_value_9_0= RULE_STRING
            	    {
            	    lv_value_9_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	    								newLeafNode(lv_value_9_0, grammarAccess.getOpenAccess().getValueSTRINGTerminalRuleCall_1_4_1_2_0());
            	    							

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
            	    break loop8;
                }
            } while (true);

            otherlv_10=(Token)match(input,18,FOLLOW_12); 

            				newLeafNode(otherlv_10, grammarAccess.getOpenAccess().getGreaterThanSignKeyword_1_5());
            			

            }

            // InternalBPMN_translator.g:522:3: ( ruleData | ( (lv_prova_12_0= ruleOpening ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_KEYWORDS && LA9_0<=RULE_BODY)) ) {
                alt9=1;
            }
            else if ( (LA9_0==EOF||LA9_0==14||LA9_0==19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalBPMN_translator.g:523:4: ruleData
                    {

                    				newCompositeNode(grammarAccess.getOpenAccess().getDataParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_2);
                    ruleData();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:531:4: ( (lv_prova_12_0= ruleOpening ) )
                    {
                    // InternalBPMN_translator.g:531:4: ( (lv_prova_12_0= ruleOpening ) )
                    // InternalBPMN_translator.g:532:5: (lv_prova_12_0= ruleOpening )
                    {
                    // InternalBPMN_translator.g:532:5: (lv_prova_12_0= ruleOpening )
                    // InternalBPMN_translator.g:533:6: lv_prova_12_0= ruleOpening
                    {

                    						newCompositeNode(grammarAccess.getOpenAccess().getProvaOpeningParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_prova_12_0=ruleOpening();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpenRule());
                    						}
                    						add(
                    							current,
                    							"prova",
                    							lv_prova_12_0,
                    							"org.xtext.BPMN_translator.Opening");
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
    // $ANTLR end "ruleOpen"


    // $ANTLR start "entryRuleClose"
    // InternalBPMN_translator.g:555:1: entryRuleClose returns [EObject current=null] : iv_ruleClose= ruleClose EOF ;
    public final EObject entryRuleClose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClose = null;


        try {
            // InternalBPMN_translator.g:555:46: (iv_ruleClose= ruleClose EOF )
            // InternalBPMN_translator.g:556:2: iv_ruleClose= ruleClose EOF
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
    // InternalBPMN_translator.g:562:1: ruleClose returns [EObject current=null] : ( () (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' ) ) ;
    public final EObject ruleClose() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_HEAD_2=null;
        Token otherlv_3=null;
        Token this_KEYWORDS_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalBPMN_translator.g:568:2: ( ( () (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' ) ) )
            // InternalBPMN_translator.g:569:2: ( () (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' ) )
            {
            // InternalBPMN_translator.g:569:2: ( () (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' ) )
            // InternalBPMN_translator.g:570:3: () (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' )
            {
            // InternalBPMN_translator.g:570:3: ()
            // InternalBPMN_translator.g:571:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCloseAccess().getCloseAction_0(),
            					current);
            			

            }

            // InternalBPMN_translator.g:577:3: (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' )
            // InternalBPMN_translator.g:578:4: otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>'
            {
            otherlv_1=(Token)match(input,19,FOLLOW_5); 

            				newLeafNode(otherlv_1, grammarAccess.getCloseAccess().getLessThanSignSolidusKeyword_1_0());
            			
            this_HEAD_2=(Token)match(input,RULE_HEAD,FOLLOW_6); 

            				newLeafNode(this_HEAD_2, grammarAccess.getCloseAccess().getHEADTerminalRuleCall_1_1());
            			
            otherlv_3=(Token)match(input,15,FOLLOW_7); 

            				newLeafNode(otherlv_3, grammarAccess.getCloseAccess().getColonKeyword_1_2());
            			
            this_KEYWORDS_4=(Token)match(input,RULE_KEYWORDS,FOLLOW_13); 

            				newLeafNode(this_KEYWORDS_4, grammarAccess.getCloseAccess().getKEYWORDSTerminalRuleCall_1_3());
            			
            otherlv_5=(Token)match(input,18,FOLLOW_2); 

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


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\2\13\uffff";
    static final String dfa_3s = "\1\16\1\4\1\uffff\1\17\1\5\1\4\1\17\1\20\1\uffff\1\4\1\6\1\4";
    static final String dfa_4s = "\1\23\1\4\1\uffff\1\17\1\5\1\22\1\17\1\20\1\uffff\1\22\1\6\1\22";
    static final String dfa_5s = "\2\uffff\1\2\5\uffff\1\1\3\uffff";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\4\uffff\1\2",
            "\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6\1\7\13\uffff\1\2\1\10",
            "\1\11",
            "\1\12",
            "",
            "\1\6\1\7\13\uffff\1\2\1\10",
            "\1\13",
            "\1\6\1\7\13\uffff\1\2\1\10"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "159:2: ( ( () ( ( ( (lv_Prova_1_0= ruleOpen ) ) ( (lv_Prova1_2_0= ruleClose ) ) ) ( ( (lv_Prova_3_0= ruleOpen ) ) ( (lv_Prova1_4_0= ruleClose ) ) )* ( (otherlv_5= '<' this_HEAD_6= RULE_HEAD otherlv_7= ':' this_KEYWORDS_8= RULE_KEYWORDS ( (this_HEAD_9= RULE_HEAD otherlv_10= ':' ) | (this_KEYWORDS_11= RULE_KEYWORDS otherlv_12= '=' ( (lv_value_13_0= RULE_STRING ) ) ) )* ) otherlv_14= '/>' )* ) ) | ( () ( (otherlv_16= '<' this_HEAD_17= RULE_HEAD otherlv_18= ':' this_KEYWORDS_19= RULE_KEYWORDS ( (this_HEAD_20= RULE_HEAD otherlv_21= ':' ) | (this_KEYWORDS_22= RULE_KEYWORDS otherlv_23= '=' ( (lv_value_24_0= RULE_STRING ) ) ) )* ) otherlv_25= '/>' )* ) )";
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 209:5: ( ( (lv_Prova_3_0= ruleOpen ) ) ( (lv_Prova1_4_0= ruleClose ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000040E0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});

}