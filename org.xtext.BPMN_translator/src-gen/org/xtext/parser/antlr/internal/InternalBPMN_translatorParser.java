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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HEAD", "RULE_STRING", "RULE_BODY", "RULE_KEYWORDS", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<?'", "'version='", "'encoding='", "'?>'", "'_TASK'", "'_GATEWAY'", "'{'", "'}'", "'<'", "':'", "'='", "'>'", "'/>'", "'</'", "'TEMPERATURE'", "'&lt;'", "'&le;'", "'&ge;'", "'&gt;'", "'DEVICE'", "'NAMEID'", "'MQTT'", "'NAME'", "'BROKER_USER'", "'BROKER_PASSWORD'", "'BROKER'", "'NETWORK'", "'SUBTOPICS'", "'TOPIC_NAME'", "'PUBTOPICS'", "'DATA'", "'SSID'", "'PASSWORD'", "'PROTOCOL_DEVICE'", "'DISTANCE'", "'PINS'", "'SENSOR_ID'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_BODY=6;
    public static final int RULE_ID=9;
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
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_KEYWORDS=7;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_HEAD=4;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
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

                if ( (LA2_0==22) ) {
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
    // InternalBPMN_translator.g:221:1: ruleelement returns [EObject current=null] : ( ( ( (lv_open_0_0= ruleOpen ) ) ( (lv_contents_1_0= rulecontent ) ) ( (lv_close_tag_2_0= ruleClose ) ) ) | ( (lv_singleton_tag_3_0= ruleSingleton ) ) ) ;
    public final EObject ruleelement() throws RecognitionException {
        EObject current = null;

        EObject lv_open_0_0 = null;

        EObject lv_contents_1_0 = null;

        EObject lv_close_tag_2_0 = null;

        EObject lv_singleton_tag_3_0 = null;



        	enterRule();

        try {
            // InternalBPMN_translator.g:227:2: ( ( ( ( (lv_open_0_0= ruleOpen ) ) ( (lv_contents_1_0= rulecontent ) ) ( (lv_close_tag_2_0= ruleClose ) ) ) | ( (lv_singleton_tag_3_0= ruleSingleton ) ) ) )
            // InternalBPMN_translator.g:228:2: ( ( ( (lv_open_0_0= ruleOpen ) ) ( (lv_contents_1_0= rulecontent ) ) ( (lv_close_tag_2_0= ruleClose ) ) ) | ( (lv_singleton_tag_3_0= ruleSingleton ) ) )
            {
            // InternalBPMN_translator.g:228:2: ( ( ( (lv_open_0_0= ruleOpen ) ) ( (lv_contents_1_0= rulecontent ) ) ( (lv_close_tag_2_0= ruleClose ) ) ) | ( (lv_singleton_tag_3_0= ruleSingleton ) ) )
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
                    // InternalBPMN_translator.g:289:3: ( (lv_singleton_tag_3_0= ruleSingleton ) )
                    {
                    // InternalBPMN_translator.g:289:3: ( (lv_singleton_tag_3_0= ruleSingleton ) )
                    // InternalBPMN_translator.g:290:4: (lv_singleton_tag_3_0= ruleSingleton )
                    {
                    // InternalBPMN_translator.g:290:4: (lv_singleton_tag_3_0= ruleSingleton )
                    // InternalBPMN_translator.g:291:5: lv_singleton_tag_3_0= ruleSingleton
                    {

                    					newCompositeNode(grammarAccess.getElementAccess().getSingleton_tagSingletonParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_singleton_tag_3_0=ruleSingleton();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementRule());
                    					}
                    					add(
                    						current,
                    						"singleton_tag",
                    						lv_singleton_tag_3_0,
                    						"org.xtext.BPMN_translator.Singleton");
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
    // $ANTLR end "ruleelement"


    // $ANTLR start "entryRulecontent"
    // InternalBPMN_translator.g:312:1: entryRulecontent returns [EObject current=null] : iv_rulecontent= rulecontent EOF ;
    public final EObject entryRulecontent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecontent = null;


        try {
            // InternalBPMN_translator.g:312:48: (iv_rulecontent= rulecontent EOF )
            // InternalBPMN_translator.g:313:2: iv_rulecontent= rulecontent EOF
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
    // InternalBPMN_translator.g:319:1: rulecontent returns [EObject current=null] : ( () ( ( ( ( (lv_type_1_1= '_TASK' | lv_type_1_2= '_GATEWAY' ) ) ) otherlv_2= '{' ( (lv_codex_3_0= rulecodex ) ) otherlv_4= '}' ) | ( (lv_element_5_0= ruleelement ) ) | ( ( (lv_body_6_1= RULE_BODY | lv_body_6_2= rulevariables ) ) ) | ( (lv_keywords_7_0= RULE_KEYWORDS ) ) | ( (lv_data_8_0= RULE_STRING ) ) )* ) ;
    public final EObject rulecontent() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_1=null;
        Token lv_type_1_2=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_body_6_1=null;
        Token lv_keywords_7_0=null;
        Token lv_data_8_0=null;
        EObject lv_codex_3_0 = null;

        EObject lv_element_5_0 = null;

        AntlrDatatypeRuleToken lv_body_6_2 = null;



        	enterRule();

        try {
            // InternalBPMN_translator.g:325:2: ( ( () ( ( ( ( (lv_type_1_1= '_TASK' | lv_type_1_2= '_GATEWAY' ) ) ) otherlv_2= '{' ( (lv_codex_3_0= rulecodex ) ) otherlv_4= '}' ) | ( (lv_element_5_0= ruleelement ) ) | ( ( (lv_body_6_1= RULE_BODY | lv_body_6_2= rulevariables ) ) ) | ( (lv_keywords_7_0= RULE_KEYWORDS ) ) | ( (lv_data_8_0= RULE_STRING ) ) )* ) )
            // InternalBPMN_translator.g:326:2: ( () ( ( ( ( (lv_type_1_1= '_TASK' | lv_type_1_2= '_GATEWAY' ) ) ) otherlv_2= '{' ( (lv_codex_3_0= rulecodex ) ) otherlv_4= '}' ) | ( (lv_element_5_0= ruleelement ) ) | ( ( (lv_body_6_1= RULE_BODY | lv_body_6_2= rulevariables ) ) ) | ( (lv_keywords_7_0= RULE_KEYWORDS ) ) | ( (lv_data_8_0= RULE_STRING ) ) )* )
            {
            // InternalBPMN_translator.g:326:2: ( () ( ( ( ( (lv_type_1_1= '_TASK' | lv_type_1_2= '_GATEWAY' ) ) ) otherlv_2= '{' ( (lv_codex_3_0= rulecodex ) ) otherlv_4= '}' ) | ( (lv_element_5_0= ruleelement ) ) | ( ( (lv_body_6_1= RULE_BODY | lv_body_6_2= rulevariables ) ) ) | ( (lv_keywords_7_0= RULE_KEYWORDS ) ) | ( (lv_data_8_0= RULE_STRING ) ) )* )
            // InternalBPMN_translator.g:327:3: () ( ( ( ( (lv_type_1_1= '_TASK' | lv_type_1_2= '_GATEWAY' ) ) ) otherlv_2= '{' ( (lv_codex_3_0= rulecodex ) ) otherlv_4= '}' ) | ( (lv_element_5_0= ruleelement ) ) | ( ( (lv_body_6_1= RULE_BODY | lv_body_6_2= rulevariables ) ) ) | ( (lv_keywords_7_0= RULE_KEYWORDS ) ) | ( (lv_data_8_0= RULE_STRING ) ) )*
            {
            // InternalBPMN_translator.g:327:3: ()
            // InternalBPMN_translator.g:328:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContentAccess().getContentAction_0(),
            					current);
            			

            }

            // InternalBPMN_translator.g:334:3: ( ( ( ( (lv_type_1_1= '_TASK' | lv_type_1_2= '_GATEWAY' ) ) ) otherlv_2= '{' ( (lv_codex_3_0= rulecodex ) ) otherlv_4= '}' ) | ( (lv_element_5_0= ruleelement ) ) | ( ( (lv_body_6_1= RULE_BODY | lv_body_6_2= rulevariables ) ) ) | ( (lv_keywords_7_0= RULE_KEYWORDS ) ) | ( (lv_data_8_0= RULE_STRING ) ) )*
            loop6:
            do {
                int alt6=6;
                switch ( input.LA(1) ) {
                case 18:
                case 19:
                    {
                    alt6=1;
                    }
                    break;
                case 22:
                    {
                    alt6=2;
                    }
                    break;
                case RULE_BODY:
                case 28:
                    {
                    alt6=3;
                    }
                    break;
                case RULE_KEYWORDS:
                    {
                    alt6=4;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt6=5;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // InternalBPMN_translator.g:335:4: ( ( ( (lv_type_1_1= '_TASK' | lv_type_1_2= '_GATEWAY' ) ) ) otherlv_2= '{' ( (lv_codex_3_0= rulecodex ) ) otherlv_4= '}' )
            	    {
            	    // InternalBPMN_translator.g:335:4: ( ( ( (lv_type_1_1= '_TASK' | lv_type_1_2= '_GATEWAY' ) ) ) otherlv_2= '{' ( (lv_codex_3_0= rulecodex ) ) otherlv_4= '}' )
            	    // InternalBPMN_translator.g:336:5: ( ( (lv_type_1_1= '_TASK' | lv_type_1_2= '_GATEWAY' ) ) ) otherlv_2= '{' ( (lv_codex_3_0= rulecodex ) ) otherlv_4= '}'
            	    {
            	    // InternalBPMN_translator.g:336:5: ( ( (lv_type_1_1= '_TASK' | lv_type_1_2= '_GATEWAY' ) ) )
            	    // InternalBPMN_translator.g:337:6: ( (lv_type_1_1= '_TASK' | lv_type_1_2= '_GATEWAY' ) )
            	    {
            	    // InternalBPMN_translator.g:337:6: ( (lv_type_1_1= '_TASK' | lv_type_1_2= '_GATEWAY' ) )
            	    // InternalBPMN_translator.g:338:7: (lv_type_1_1= '_TASK' | lv_type_1_2= '_GATEWAY' )
            	    {
            	    // InternalBPMN_translator.g:338:7: (lv_type_1_1= '_TASK' | lv_type_1_2= '_GATEWAY' )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==18) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==19) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalBPMN_translator.g:339:8: lv_type_1_1= '_TASK'
            	            {
            	            lv_type_1_1=(Token)match(input,18,FOLLOW_10); 

            	            								newLeafNode(lv_type_1_1, grammarAccess.getContentAccess().getType_TASKKeyword_1_0_0_0_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getContentRule());
            	            								}
            	            								addWithLastConsumed(current, "type", lv_type_1_1, null);
            	            							

            	            }
            	            break;
            	        case 2 :
            	            // InternalBPMN_translator.g:350:8: lv_type_1_2= '_GATEWAY'
            	            {
            	            lv_type_1_2=(Token)match(input,19,FOLLOW_10); 

            	            								newLeafNode(lv_type_1_2, grammarAccess.getContentAccess().getType_GATEWAYKeyword_1_0_0_0_1());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getContentRule());
            	            								}
            	            								addWithLastConsumed(current, "type", lv_type_1_2, null);
            	            							

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_11); 

            	    					newLeafNode(otherlv_2, grammarAccess.getContentAccess().getLeftCurlyBracketKeyword_1_0_1());
            	    				
            	    // InternalBPMN_translator.g:367:5: ( (lv_codex_3_0= rulecodex ) )
            	    // InternalBPMN_translator.g:368:6: (lv_codex_3_0= rulecodex )
            	    {
            	    // InternalBPMN_translator.g:368:6: (lv_codex_3_0= rulecodex )
            	    // InternalBPMN_translator.g:369:7: lv_codex_3_0= rulecodex
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

            	    otherlv_4=(Token)match(input,21,FOLLOW_13); 

            	    					newLeafNode(otherlv_4, grammarAccess.getContentAccess().getRightCurlyBracketKeyword_1_0_3());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBPMN_translator.g:392:4: ( (lv_element_5_0= ruleelement ) )
            	    {
            	    // InternalBPMN_translator.g:392:4: ( (lv_element_5_0= ruleelement ) )
            	    // InternalBPMN_translator.g:393:5: (lv_element_5_0= ruleelement )
            	    {
            	    // InternalBPMN_translator.g:393:5: (lv_element_5_0= ruleelement )
            	    // InternalBPMN_translator.g:394:6: lv_element_5_0= ruleelement
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
            	    // InternalBPMN_translator.g:412:4: ( ( (lv_body_6_1= RULE_BODY | lv_body_6_2= rulevariables ) ) )
            	    {
            	    // InternalBPMN_translator.g:412:4: ( ( (lv_body_6_1= RULE_BODY | lv_body_6_2= rulevariables ) ) )
            	    // InternalBPMN_translator.g:413:5: ( (lv_body_6_1= RULE_BODY | lv_body_6_2= rulevariables ) )
            	    {
            	    // InternalBPMN_translator.g:413:5: ( (lv_body_6_1= RULE_BODY | lv_body_6_2= rulevariables ) )
            	    // InternalBPMN_translator.g:414:6: (lv_body_6_1= RULE_BODY | lv_body_6_2= rulevariables )
            	    {
            	    // InternalBPMN_translator.g:414:6: (lv_body_6_1= RULE_BODY | lv_body_6_2= rulevariables )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==RULE_BODY) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==28) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalBPMN_translator.g:415:7: lv_body_6_1= RULE_BODY
            	            {
            	            lv_body_6_1=(Token)match(input,RULE_BODY,FOLLOW_13); 

            	            							newLeafNode(lv_body_6_1, grammarAccess.getContentAccess().getBodyBODYTerminalRuleCall_1_2_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getContentRule());
            	            							}
            	            							addWithLastConsumed(
            	            								current,
            	            								"body",
            	            								lv_body_6_1,
            	            								"org.xtext.BPMN_translator.BODY");
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalBPMN_translator.g:430:7: lv_body_6_2= rulevariables
            	            {

            	            							newCompositeNode(grammarAccess.getContentAccess().getBodyVariablesParserRuleCall_1_2_0_1());
            	            						
            	            pushFollow(FOLLOW_13);
            	            lv_body_6_2=rulevariables();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getContentRule());
            	            							}
            	            							add(
            	            								current,
            	            								"body",
            	            								lv_body_6_2,
            	            								"org.xtext.BPMN_translator.variables");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalBPMN_translator.g:449:4: ( (lv_keywords_7_0= RULE_KEYWORDS ) )
            	    {
            	    // InternalBPMN_translator.g:449:4: ( (lv_keywords_7_0= RULE_KEYWORDS ) )
            	    // InternalBPMN_translator.g:450:5: (lv_keywords_7_0= RULE_KEYWORDS )
            	    {
            	    // InternalBPMN_translator.g:450:5: (lv_keywords_7_0= RULE_KEYWORDS )
            	    // InternalBPMN_translator.g:451:6: lv_keywords_7_0= RULE_KEYWORDS
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
            	    // InternalBPMN_translator.g:468:4: ( (lv_data_8_0= RULE_STRING ) )
            	    {
            	    // InternalBPMN_translator.g:468:4: ( (lv_data_8_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:469:5: (lv_data_8_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:469:5: (lv_data_8_0= RULE_STRING )
            	    // InternalBPMN_translator.g:470:6: lv_data_8_0= RULE_STRING
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
            	    break loop6;
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
    // InternalBPMN_translator.g:491:1: entryRuleOpen returns [EObject current=null] : iv_ruleOpen= ruleOpen EOF ;
    public final EObject entryRuleOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpen = null;


        try {
            // InternalBPMN_translator.g:491:45: (iv_ruleOpen= ruleOpen EOF )
            // InternalBPMN_translator.g:492:2: iv_ruleOpen= ruleOpen EOF
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
    // InternalBPMN_translator.g:498:1: ruleOpen returns [EObject current=null] : (otherlv_0= '<' ( (lv_head_1_0= RULE_HEAD ) ) otherlv_2= ':' ( (lv_keywords_3_0= RULE_KEYWORDS ) ) ( ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' ) | ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* otherlv_10= '>' ) ;
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
            // InternalBPMN_translator.g:504:2: ( (otherlv_0= '<' ( (lv_head_1_0= RULE_HEAD ) ) otherlv_2= ':' ( (lv_keywords_3_0= RULE_KEYWORDS ) ) ( ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' ) | ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* otherlv_10= '>' ) )
            // InternalBPMN_translator.g:505:2: (otherlv_0= '<' ( (lv_head_1_0= RULE_HEAD ) ) otherlv_2= ':' ( (lv_keywords_3_0= RULE_KEYWORDS ) ) ( ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' ) | ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* otherlv_10= '>' )
            {
            // InternalBPMN_translator.g:505:2: (otherlv_0= '<' ( (lv_head_1_0= RULE_HEAD ) ) otherlv_2= ':' ( (lv_keywords_3_0= RULE_KEYWORDS ) ) ( ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' ) | ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* otherlv_10= '>' )
            // InternalBPMN_translator.g:506:3: otherlv_0= '<' ( (lv_head_1_0= RULE_HEAD ) ) otherlv_2= ':' ( (lv_keywords_3_0= RULE_KEYWORDS ) ) ( ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' ) | ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* otherlv_10= '>'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOpenAccess().getLessThanSignKeyword_0());
            		
            // InternalBPMN_translator.g:510:3: ( (lv_head_1_0= RULE_HEAD ) )
            // InternalBPMN_translator.g:511:4: (lv_head_1_0= RULE_HEAD )
            {
            // InternalBPMN_translator.g:511:4: (lv_head_1_0= RULE_HEAD )
            // InternalBPMN_translator.g:512:5: lv_head_1_0= RULE_HEAD
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

            otherlv_2=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getOpenAccess().getColonKeyword_2());
            		
            // InternalBPMN_translator.g:532:3: ( (lv_keywords_3_0= RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:533:4: (lv_keywords_3_0= RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:533:4: (lv_keywords_3_0= RULE_KEYWORDS )
            // InternalBPMN_translator.g:534:5: lv_keywords_3_0= RULE_KEYWORDS
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

            // InternalBPMN_translator.g:550:3: ( ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' ) | ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_HEAD) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==24) ) {
                        alt8=2;
                    }
                    else if ( (LA8_2==23) ) {
                        alt8=1;
                    }


                }
                else if ( (LA8_0==RULE_KEYWORDS) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBPMN_translator.g:551:4: ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' )
            	    {
            	    // InternalBPMN_translator.g:551:4: ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' )
            	    // InternalBPMN_translator.g:552:5: ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':'
            	    {
            	    // InternalBPMN_translator.g:552:5: ( (lv_head1_4_0= RULE_HEAD ) )
            	    // InternalBPMN_translator.g:553:6: (lv_head1_4_0= RULE_HEAD )
            	    {
            	    // InternalBPMN_translator.g:553:6: (lv_head1_4_0= RULE_HEAD )
            	    // InternalBPMN_translator.g:554:7: lv_head1_4_0= RULE_HEAD
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

            	    otherlv_5=(Token)match(input,23,FOLLOW_16); 

            	    					newLeafNode(otherlv_5, grammarAccess.getOpenAccess().getColonKeyword_4_0_1());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBPMN_translator.g:576:4: ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:576:4: ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:577:5: ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) )
            	    {
            	    // InternalBPMN_translator.g:577:5: ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==RULE_HEAD) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==RULE_KEYWORDS) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalBPMN_translator.g:578:6: ( (lv_head1_6_0= RULE_HEAD ) )
            	            {
            	            // InternalBPMN_translator.g:578:6: ( (lv_head1_6_0= RULE_HEAD ) )
            	            // InternalBPMN_translator.g:579:7: (lv_head1_6_0= RULE_HEAD )
            	            {
            	            // InternalBPMN_translator.g:579:7: (lv_head1_6_0= RULE_HEAD )
            	            // InternalBPMN_translator.g:580:8: lv_head1_6_0= RULE_HEAD
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
            	            // InternalBPMN_translator.g:597:6: ( (lv_keywords1_7_0= RULE_KEYWORDS ) )
            	            {
            	            // InternalBPMN_translator.g:597:6: ( (lv_keywords1_7_0= RULE_KEYWORDS ) )
            	            // InternalBPMN_translator.g:598:7: (lv_keywords1_7_0= RULE_KEYWORDS )
            	            {
            	            // InternalBPMN_translator.g:598:7: (lv_keywords1_7_0= RULE_KEYWORDS )
            	            // InternalBPMN_translator.g:599:8: lv_keywords1_7_0= RULE_KEYWORDS
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

            	    otherlv_8=(Token)match(input,24,FOLLOW_6); 

            	    					newLeafNode(otherlv_8, grammarAccess.getOpenAccess().getEqualsSignKeyword_4_1_1());
            	    				
            	    // InternalBPMN_translator.g:620:5: ( (lv_value_9_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:621:6: (lv_value_9_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:621:6: (lv_value_9_0= RULE_STRING )
            	    // InternalBPMN_translator.g:622:7: lv_value_9_0= RULE_STRING
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
            	    break loop8;
                }
            } while (true);

            otherlv_10=(Token)match(input,25,FOLLOW_2); 

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
    // InternalBPMN_translator.g:648:1: entryRuleSingleton returns [EObject current=null] : iv_ruleSingleton= ruleSingleton EOF ;
    public final EObject entryRuleSingleton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleton = null;


        try {
            // InternalBPMN_translator.g:648:50: (iv_ruleSingleton= ruleSingleton EOF )
            // InternalBPMN_translator.g:649:2: iv_ruleSingleton= ruleSingleton EOF
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
    // InternalBPMN_translator.g:655:1: ruleSingleton returns [EObject current=null] : ( () (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' ( (lv_keywords_4_0= RULE_KEYWORDS ) ) ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | ( ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* ) otherlv_10= '/>' ) ;
    public final EObject ruleSingleton() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_HEAD_2=null;
        Token otherlv_3=null;
        Token lv_keywords_4_0=null;
        Token this_HEAD_5=null;
        Token otherlv_6=null;
        Token lv_keywords1_7_0=null;
        Token otherlv_8=null;
        Token lv_value_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalBPMN_translator.g:661:2: ( ( () (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' ( (lv_keywords_4_0= RULE_KEYWORDS ) ) ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | ( ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* ) otherlv_10= '/>' ) )
            // InternalBPMN_translator.g:662:2: ( () (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' ( (lv_keywords_4_0= RULE_KEYWORDS ) ) ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | ( ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* ) otherlv_10= '/>' )
            {
            // InternalBPMN_translator.g:662:2: ( () (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' ( (lv_keywords_4_0= RULE_KEYWORDS ) ) ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | ( ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* ) otherlv_10= '/>' )
            // InternalBPMN_translator.g:663:3: () (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' ( (lv_keywords_4_0= RULE_KEYWORDS ) ) ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | ( ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* ) otherlv_10= '/>'
            {
            // InternalBPMN_translator.g:663:3: ()
            // InternalBPMN_translator.g:664:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSingletonAccess().getSingletonAction_0(),
            					current);
            			

            }

            // InternalBPMN_translator.g:670:3: (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' ( (lv_keywords_4_0= RULE_KEYWORDS ) ) ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | ( ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* )
            // InternalBPMN_translator.g:671:4: otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' ( (lv_keywords_4_0= RULE_KEYWORDS ) ) ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | ( ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )*
            {
            otherlv_1=(Token)match(input,22,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getSingletonAccess().getLessThanSignKeyword_1_0());
            			
            this_HEAD_2=(Token)match(input,RULE_HEAD,FOLLOW_14); 

            				newLeafNode(this_HEAD_2, grammarAccess.getSingletonAccess().getHEADTerminalRuleCall_1_1());
            			
            otherlv_3=(Token)match(input,23,FOLLOW_15); 

            				newLeafNode(otherlv_3, grammarAccess.getSingletonAccess().getColonKeyword_1_2());
            			
            // InternalBPMN_translator.g:683:4: ( (lv_keywords_4_0= RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:684:5: (lv_keywords_4_0= RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:684:5: (lv_keywords_4_0= RULE_KEYWORDS )
            // InternalBPMN_translator.g:685:6: lv_keywords_4_0= RULE_KEYWORDS
            {
            lv_keywords_4_0=(Token)match(input,RULE_KEYWORDS,FOLLOW_18); 

            						newLeafNode(lv_keywords_4_0, grammarAccess.getSingletonAccess().getKeywordsKEYWORDSTerminalRuleCall_1_3_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getSingletonRule());
            						}
            						addWithLastConsumed(
            							current,
            							"keywords",
            							lv_keywords_4_0,
            							"org.xtext.BPMN_translator.KEYWORDS");
            					

            }


            }

            // InternalBPMN_translator.g:701:4: ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | ( ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_HEAD) ) {
                    alt9=1;
                }
                else if ( (LA9_0==RULE_KEYWORDS) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBPMN_translator.g:702:5: (this_HEAD_5= RULE_HEAD otherlv_6= ':' )
            	    {
            	    // InternalBPMN_translator.g:702:5: (this_HEAD_5= RULE_HEAD otherlv_6= ':' )
            	    // InternalBPMN_translator.g:703:6: this_HEAD_5= RULE_HEAD otherlv_6= ':'
            	    {
            	    this_HEAD_5=(Token)match(input,RULE_HEAD,FOLLOW_14); 

            	    						newLeafNode(this_HEAD_5, grammarAccess.getSingletonAccess().getHEADTerminalRuleCall_1_4_0_0());
            	    					
            	    otherlv_6=(Token)match(input,23,FOLLOW_18); 

            	    						newLeafNode(otherlv_6, grammarAccess.getSingletonAccess().getColonKeyword_1_4_0_1());
            	    					

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBPMN_translator.g:713:5: ( ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:713:5: ( ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:714:6: ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) )
            	    {
            	    // InternalBPMN_translator.g:714:6: ( (lv_keywords1_7_0= RULE_KEYWORDS ) )
            	    // InternalBPMN_translator.g:715:7: (lv_keywords1_7_0= RULE_KEYWORDS )
            	    {
            	    // InternalBPMN_translator.g:715:7: (lv_keywords1_7_0= RULE_KEYWORDS )
            	    // InternalBPMN_translator.g:716:8: lv_keywords1_7_0= RULE_KEYWORDS
            	    {
            	    lv_keywords1_7_0=(Token)match(input,RULE_KEYWORDS,FOLLOW_17); 

            	    								newLeafNode(lv_keywords1_7_0, grammarAccess.getSingletonAccess().getKeywords1KEYWORDSTerminalRuleCall_1_4_1_0_0());
            	    							

            	    								if (current==null) {
            	    									current = createModelElement(grammarAccess.getSingletonRule());
            	    								}
            	    								addWithLastConsumed(
            	    									current,
            	    									"keywords1",
            	    									lv_keywords1_7_0,
            	    									"org.xtext.BPMN_translator.KEYWORDS");
            	    							

            	    }


            	    }

            	    otherlv_8=(Token)match(input,24,FOLLOW_6); 

            	    						newLeafNode(otherlv_8, grammarAccess.getSingletonAccess().getEqualsSignKeyword_1_4_1_1());
            	    					
            	    // InternalBPMN_translator.g:736:6: ( (lv_value_9_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:737:7: (lv_value_9_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:737:7: (lv_value_9_0= RULE_STRING )
            	    // InternalBPMN_translator.g:738:8: lv_value_9_0= RULE_STRING
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
            	    break loop9;
                }
            } while (true);


            }

            otherlv_10=(Token)match(input,26,FOLLOW_2); 

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
    // InternalBPMN_translator.g:765:1: entryRuleClose returns [EObject current=null] : iv_ruleClose= ruleClose EOF ;
    public final EObject entryRuleClose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClose = null;


        try {
            // InternalBPMN_translator.g:765:46: (iv_ruleClose= ruleClose EOF )
            // InternalBPMN_translator.g:766:2: iv_ruleClose= ruleClose EOF
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
    // InternalBPMN_translator.g:772:1: ruleClose returns [EObject current=null] : ( () (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' ) ) ;
    public final EObject ruleClose() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_HEAD_2=null;
        Token otherlv_3=null;
        Token this_KEYWORDS_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalBPMN_translator.g:778:2: ( ( () (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' ) ) )
            // InternalBPMN_translator.g:779:2: ( () (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' ) )
            {
            // InternalBPMN_translator.g:779:2: ( () (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' ) )
            // InternalBPMN_translator.g:780:3: () (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' )
            {
            // InternalBPMN_translator.g:780:3: ()
            // InternalBPMN_translator.g:781:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCloseAccess().getCloseAction_0(),
            					current);
            			

            }

            // InternalBPMN_translator.g:787:3: (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' )
            // InternalBPMN_translator.g:788:4: otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>'
            {
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getCloseAccess().getLessThanSignSolidusKeyword_1_0());
            			
            this_HEAD_2=(Token)match(input,RULE_HEAD,FOLLOW_14); 

            				newLeafNode(this_HEAD_2, grammarAccess.getCloseAccess().getHEADTerminalRuleCall_1_1());
            			
            otherlv_3=(Token)match(input,23,FOLLOW_15); 

            				newLeafNode(otherlv_3, grammarAccess.getCloseAccess().getColonKeyword_1_2());
            			
            this_KEYWORDS_4=(Token)match(input,RULE_KEYWORDS,FOLLOW_19); 

            				newLeafNode(this_KEYWORDS_4, grammarAccess.getCloseAccess().getKEYWORDSTerminalRuleCall_1_3());
            			
            otherlv_5=(Token)match(input,25,FOLLOW_2); 

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


    // $ANTLR start "entryRulevariables"
    // InternalBPMN_translator.g:813:1: entryRulevariables returns [String current=null] : iv_rulevariables= rulevariables EOF ;
    public final String entryRulevariables() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariables = null;


        try {
            // InternalBPMN_translator.g:813:49: (iv_rulevariables= rulevariables EOF )
            // InternalBPMN_translator.g:814:2: iv_rulevariables= rulevariables EOF
            {
             newCompositeNode(grammarAccess.getVariablesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariables=rulevariables();

            state._fsp--;

             current =iv_rulevariables.getText(); 
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
    // $ANTLR end "entryRulevariables"


    // $ANTLR start "rulevariables"
    // InternalBPMN_translator.g:820:1: rulevariables returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'TEMPERATURE' (kw= '&lt;' | kw= '&le;' | kw= '&ge;' | kw= '&gt;' | kw= '=' )* this_BODY_6= RULE_BODY ) ;
    public final AntlrDatatypeRuleToken rulevariables() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_BODY_6=null;


        	enterRule();

        try {
            // InternalBPMN_translator.g:826:2: ( (kw= 'TEMPERATURE' (kw= '&lt;' | kw= '&le;' | kw= '&ge;' | kw= '&gt;' | kw= '=' )* this_BODY_6= RULE_BODY ) )
            // InternalBPMN_translator.g:827:2: (kw= 'TEMPERATURE' (kw= '&lt;' | kw= '&le;' | kw= '&ge;' | kw= '&gt;' | kw= '=' )* this_BODY_6= RULE_BODY )
            {
            // InternalBPMN_translator.g:827:2: (kw= 'TEMPERATURE' (kw= '&lt;' | kw= '&le;' | kw= '&ge;' | kw= '&gt;' | kw= '=' )* this_BODY_6= RULE_BODY )
            // InternalBPMN_translator.g:828:3: kw= 'TEMPERATURE' (kw= '&lt;' | kw= '&le;' | kw= '&ge;' | kw= '&gt;' | kw= '=' )* this_BODY_6= RULE_BODY
            {
            kw=(Token)match(input,28,FOLLOW_20); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getVariablesAccess().getTEMPERATUREKeyword_0());
            		
            // InternalBPMN_translator.g:833:3: (kw= '&lt;' | kw= '&le;' | kw= '&ge;' | kw= '&gt;' | kw= '=' )*
            loop10:
            do {
                int alt10=6;
                switch ( input.LA(1) ) {
                case 29:
                    {
                    alt10=1;
                    }
                    break;
                case 30:
                    {
                    alt10=2;
                    }
                    break;
                case 31:
                    {
                    alt10=3;
                    }
                    break;
                case 32:
                    {
                    alt10=4;
                    }
                    break;
                case 24:
                    {
                    alt10=5;
                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // InternalBPMN_translator.g:834:4: kw= '&lt;'
            	    {
            	    kw=(Token)match(input,29,FOLLOW_20); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getVariablesAccess().getLtKeyword_1_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalBPMN_translator.g:840:4: kw= '&le;'
            	    {
            	    kw=(Token)match(input,30,FOLLOW_20); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getVariablesAccess().getLeKeyword_1_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalBPMN_translator.g:846:4: kw= '&ge;'
            	    {
            	    kw=(Token)match(input,31,FOLLOW_20); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getVariablesAccess().getGeKeyword_1_2());
            	    			

            	    }
            	    break;
            	case 4 :
            	    // InternalBPMN_translator.g:852:4: kw= '&gt;'
            	    {
            	    kw=(Token)match(input,32,FOLLOW_20); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getVariablesAccess().getGtKeyword_1_3());
            	    			

            	    }
            	    break;
            	case 5 :
            	    // InternalBPMN_translator.g:858:4: kw= '='
            	    {
            	    kw=(Token)match(input,24,FOLLOW_20); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getVariablesAccess().getEqualsSignKeyword_1_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            this_BODY_6=(Token)match(input,RULE_BODY,FOLLOW_2); 

            			current.merge(this_BODY_6);
            		

            			newLeafNode(this_BODY_6, grammarAccess.getVariablesAccess().getBODYTerminalRuleCall_2());
            		

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
    // $ANTLR end "rulevariables"


    // $ANTLR start "entryRulecodex"
    // InternalBPMN_translator.g:875:1: entryRulecodex returns [EObject current=null] : iv_rulecodex= rulecodex EOF ;
    public final EObject entryRulecodex() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecodex = null;


        try {
            // InternalBPMN_translator.g:875:46: (iv_rulecodex= rulecodex EOF )
            // InternalBPMN_translator.g:876:2: iv_rulecodex= rulecodex EOF
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
    // InternalBPMN_translator.g:882:1: rulecodex returns [EObject current=null] : ( ( (lv_device_code_0_0= ruledevice ) ) ( (lv_protocol_1_0= ruleprotocol ) )* ( (lv_sensor_code_2_0= rulesensor ) )* ) ;
    public final EObject rulecodex() throws RecognitionException {
        EObject current = null;

        EObject lv_device_code_0_0 = null;

        EObject lv_protocol_1_0 = null;

        EObject lv_sensor_code_2_0 = null;



        	enterRule();

        try {
            // InternalBPMN_translator.g:888:2: ( ( ( (lv_device_code_0_0= ruledevice ) ) ( (lv_protocol_1_0= ruleprotocol ) )* ( (lv_sensor_code_2_0= rulesensor ) )* ) )
            // InternalBPMN_translator.g:889:2: ( ( (lv_device_code_0_0= ruledevice ) ) ( (lv_protocol_1_0= ruleprotocol ) )* ( (lv_sensor_code_2_0= rulesensor ) )* )
            {
            // InternalBPMN_translator.g:889:2: ( ( (lv_device_code_0_0= ruledevice ) ) ( (lv_protocol_1_0= ruleprotocol ) )* ( (lv_sensor_code_2_0= rulesensor ) )* )
            // InternalBPMN_translator.g:890:3: ( (lv_device_code_0_0= ruledevice ) ) ( (lv_protocol_1_0= ruleprotocol ) )* ( (lv_sensor_code_2_0= rulesensor ) )*
            {
            // InternalBPMN_translator.g:890:3: ( (lv_device_code_0_0= ruledevice ) )
            // InternalBPMN_translator.g:891:4: (lv_device_code_0_0= ruledevice )
            {
            // InternalBPMN_translator.g:891:4: (lv_device_code_0_0= ruledevice )
            // InternalBPMN_translator.g:892:5: lv_device_code_0_0= ruledevice
            {

            					newCompositeNode(grammarAccess.getCodexAccess().getDevice_codeDeviceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalBPMN_translator.g:909:3: ( (lv_protocol_1_0= ruleprotocol ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==35) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBPMN_translator.g:910:4: (lv_protocol_1_0= ruleprotocol )
            	    {
            	    // InternalBPMN_translator.g:910:4: (lv_protocol_1_0= ruleprotocol )
            	    // InternalBPMN_translator.g:911:5: lv_protocol_1_0= ruleprotocol
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
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalBPMN_translator.g:928:3: ( (lv_sensor_code_2_0= rulesensor ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28||LA12_0==48) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBPMN_translator.g:929:4: (lv_sensor_code_2_0= rulesensor )
            	    {
            	    // InternalBPMN_translator.g:929:4: (lv_sensor_code_2_0= rulesensor )
            	    // InternalBPMN_translator.g:930:5: lv_sensor_code_2_0= rulesensor
            	    {

            	    					newCompositeNode(grammarAccess.getCodexAccess().getSensor_codeSensorParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_22);
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
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "rulecodex"


    // $ANTLR start "entryRuledevice"
    // InternalBPMN_translator.g:951:1: entryRuledevice returns [EObject current=null] : iv_ruledevice= ruledevice EOF ;
    public final EObject entryRuledevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledevice = null;


        try {
            // InternalBPMN_translator.g:951:47: (iv_ruledevice= ruledevice EOF )
            // InternalBPMN_translator.g:952:2: iv_ruledevice= ruledevice EOF
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
    // InternalBPMN_translator.g:958:1: ruledevice returns [EObject current=null] : (otherlv_0= 'DEVICE' otherlv_1= ':' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'NAMEID' otherlv_4= ':' ( (lv_id_5_0= RULE_STRING ) ) ) ;
    public final EObject ruledevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_device_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_id_5_0=null;


        	enterRule();

        try {
            // InternalBPMN_translator.g:964:2: ( (otherlv_0= 'DEVICE' otherlv_1= ':' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'NAMEID' otherlv_4= ':' ( (lv_id_5_0= RULE_STRING ) ) ) )
            // InternalBPMN_translator.g:965:2: (otherlv_0= 'DEVICE' otherlv_1= ':' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'NAMEID' otherlv_4= ':' ( (lv_id_5_0= RULE_STRING ) ) )
            {
            // InternalBPMN_translator.g:965:2: (otherlv_0= 'DEVICE' otherlv_1= ':' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'NAMEID' otherlv_4= ':' ( (lv_id_5_0= RULE_STRING ) ) )
            // InternalBPMN_translator.g:966:3: otherlv_0= 'DEVICE' otherlv_1= ':' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'NAMEID' otherlv_4= ':' ( (lv_id_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getDeviceAccess().getDEVICEKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDeviceAccess().getColonKeyword_1());
            		
            // InternalBPMN_translator.g:974:3: ( (lv_device_2_0= RULE_STRING ) )
            // InternalBPMN_translator.g:975:4: (lv_device_2_0= RULE_STRING )
            {
            // InternalBPMN_translator.g:975:4: (lv_device_2_0= RULE_STRING )
            // InternalBPMN_translator.g:976:5: lv_device_2_0= RULE_STRING
            {
            lv_device_2_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

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

            otherlv_3=(Token)match(input,34,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getDeviceAccess().getNAMEIDKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getDeviceAccess().getColonKeyword_4());
            		
            // InternalBPMN_translator.g:1000:3: ( (lv_id_5_0= RULE_STRING ) )
            // InternalBPMN_translator.g:1001:4: (lv_id_5_0= RULE_STRING )
            {
            // InternalBPMN_translator.g:1001:4: (lv_id_5_0= RULE_STRING )
            // InternalBPMN_translator.g:1002:5: lv_id_5_0= RULE_STRING
            {
            lv_id_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_id_5_0, grammarAccess.getDeviceAccess().getIdSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeviceRule());
            					}
            					addWithLastConsumed(
            						current,
            						"id",
            						lv_id_5_0,
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
    // InternalBPMN_translator.g:1022:1: entryRuleprotocol returns [EObject current=null] : iv_ruleprotocol= ruleprotocol EOF ;
    public final EObject entryRuleprotocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprotocol = null;


        try {
            // InternalBPMN_translator.g:1022:49: (iv_ruleprotocol= ruleprotocol EOF )
            // InternalBPMN_translator.g:1023:2: iv_ruleprotocol= ruleprotocol EOF
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
    // InternalBPMN_translator.g:1029:1: ruleprotocol returns [EObject current=null] : ( ( (lv_pname_0_0= 'MQTT' ) ) otherlv_1= '{' ( ( (lv_mqtt_data_2_0= rulemqtt_data ) ) ( (lv_mqtt_device_3_0= rulemqtt_device ) ) ) otherlv_4= '}' ) ;
    public final EObject ruleprotocol() throws RecognitionException {
        EObject current = null;

        Token lv_pname_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_mqtt_data_2_0 = null;

        EObject lv_mqtt_device_3_0 = null;



        	enterRule();

        try {
            // InternalBPMN_translator.g:1035:2: ( ( ( (lv_pname_0_0= 'MQTT' ) ) otherlv_1= '{' ( ( (lv_mqtt_data_2_0= rulemqtt_data ) ) ( (lv_mqtt_device_3_0= rulemqtt_device ) ) ) otherlv_4= '}' ) )
            // InternalBPMN_translator.g:1036:2: ( ( (lv_pname_0_0= 'MQTT' ) ) otherlv_1= '{' ( ( (lv_mqtt_data_2_0= rulemqtt_data ) ) ( (lv_mqtt_device_3_0= rulemqtt_device ) ) ) otherlv_4= '}' )
            {
            // InternalBPMN_translator.g:1036:2: ( ( (lv_pname_0_0= 'MQTT' ) ) otherlv_1= '{' ( ( (lv_mqtt_data_2_0= rulemqtt_data ) ) ( (lv_mqtt_device_3_0= rulemqtt_device ) ) ) otherlv_4= '}' )
            // InternalBPMN_translator.g:1037:3: ( (lv_pname_0_0= 'MQTT' ) ) otherlv_1= '{' ( ( (lv_mqtt_data_2_0= rulemqtt_data ) ) ( (lv_mqtt_device_3_0= rulemqtt_device ) ) ) otherlv_4= '}'
            {
            // InternalBPMN_translator.g:1037:3: ( (lv_pname_0_0= 'MQTT' ) )
            // InternalBPMN_translator.g:1038:4: (lv_pname_0_0= 'MQTT' )
            {
            // InternalBPMN_translator.g:1038:4: (lv_pname_0_0= 'MQTT' )
            // InternalBPMN_translator.g:1039:5: lv_pname_0_0= 'MQTT'
            {
            lv_pname_0_0=(Token)match(input,35,FOLLOW_10); 

            					newLeafNode(lv_pname_0_0, grammarAccess.getProtocolAccess().getPnameMQTTKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProtocolRule());
            					}
            					addWithLastConsumed(current, "pname", lv_pname_0_0, "MQTT");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBPMN_translator.g:1055:3: ( ( (lv_mqtt_data_2_0= rulemqtt_data ) ) ( (lv_mqtt_device_3_0= rulemqtt_device ) ) )
            // InternalBPMN_translator.g:1056:4: ( (lv_mqtt_data_2_0= rulemqtt_data ) ) ( (lv_mqtt_device_3_0= rulemqtt_device ) )
            {
            // InternalBPMN_translator.g:1056:4: ( (lv_mqtt_data_2_0= rulemqtt_data ) )
            // InternalBPMN_translator.g:1057:5: (lv_mqtt_data_2_0= rulemqtt_data )
            {
            // InternalBPMN_translator.g:1057:5: (lv_mqtt_data_2_0= rulemqtt_data )
            // InternalBPMN_translator.g:1058:6: lv_mqtt_data_2_0= rulemqtt_data
            {

            						newCompositeNode(grammarAccess.getProtocolAccess().getMqtt_dataMqtt_dataParserRuleCall_2_0_0());
            					
            pushFollow(FOLLOW_24);
            lv_mqtt_data_2_0=rulemqtt_data();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getProtocolRule());
            						}
            						add(
            							current,
            							"mqtt_data",
            							lv_mqtt_data_2_0,
            							"org.xtext.BPMN_translator.mqtt_data");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalBPMN_translator.g:1075:4: ( (lv_mqtt_device_3_0= rulemqtt_device ) )
            // InternalBPMN_translator.g:1076:5: (lv_mqtt_device_3_0= rulemqtt_device )
            {
            // InternalBPMN_translator.g:1076:5: (lv_mqtt_device_3_0= rulemqtt_device )
            // InternalBPMN_translator.g:1077:6: lv_mqtt_device_3_0= rulemqtt_device
            {

            						newCompositeNode(grammarAccess.getProtocolAccess().getMqtt_deviceMqtt_deviceParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_12);
            lv_mqtt_device_3_0=rulemqtt_device();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getProtocolRule());
            						}
            						add(
            							current,
            							"mqtt_device",
            							lv_mqtt_device_3_0,
            							"org.xtext.BPMN_translator.mqtt_device");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

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


    // $ANTLR start "entryRulemqtt_data"
    // InternalBPMN_translator.g:1103:1: entryRulemqtt_data returns [EObject current=null] : iv_rulemqtt_data= rulemqtt_data EOF ;
    public final EObject entryRulemqtt_data() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemqtt_data = null;


        try {
            // InternalBPMN_translator.g:1103:50: (iv_rulemqtt_data= rulemqtt_data EOF )
            // InternalBPMN_translator.g:1104:2: iv_rulemqtt_data= rulemqtt_data EOF
            {
             newCompositeNode(grammarAccess.getMqtt_dataRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemqtt_data=rulemqtt_data();

            state._fsp--;

             current =iv_rulemqtt_data; 
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
    // $ANTLR end "entryRulemqtt_data"


    // $ANTLR start "rulemqtt_data"
    // InternalBPMN_translator.g:1110:1: rulemqtt_data returns [EObject current=null] : ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'BROKER_USER' otherlv_5= '=' ( (lv_broker_user_6_0= RULE_STRING ) ) ) | (otherlv_7= 'BROKER_PASSWORD' otherlv_8= '=' ( (lv_broker_password_9_0= RULE_STRING ) ) ) | (otherlv_10= 'BROKER' otherlv_11= '=' ( (lv_broker_12_0= RULE_STRING ) ) ) | (otherlv_13= 'NETWORK' otherlv_14= '{' ( (lv_mqtt_network_data_15_0= rulemqtt_network_data ) )* otherlv_16= '}' ) | (otherlv_17= 'SUBTOPICS' otherlv_18= '{' (otherlv_19= 'TOPIC_NAME' otherlv_20= '=' ( (lv_subtopics_21_0= RULE_STRING ) ) )* otherlv_22= '}' ) | (otherlv_23= 'PUBTOPICS' otherlv_24= '{' ( (otherlv_25= 'TOPIC_NAME' otherlv_26= '=' ( (lv_pubtopics_27_0= RULE_STRING ) )* ) | (otherlv_28= 'DATA' otherlv_29= '=' ( (lv_value_30_0= RULE_STRING ) ) ) )* otherlv_31= '}' ) )* ) ;
    public final EObject rulemqtt_data() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_pname_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_broker_user_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_broker_password_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_broker_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_subtopics_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token lv_pubtopics_27_0=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token lv_value_30_0=null;
        Token otherlv_31=null;
        EObject lv_mqtt_network_data_15_0 = null;



        	enterRule();

        try {
            // InternalBPMN_translator.g:1116:2: ( ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'BROKER_USER' otherlv_5= '=' ( (lv_broker_user_6_0= RULE_STRING ) ) ) | (otherlv_7= 'BROKER_PASSWORD' otherlv_8= '=' ( (lv_broker_password_9_0= RULE_STRING ) ) ) | (otherlv_10= 'BROKER' otherlv_11= '=' ( (lv_broker_12_0= RULE_STRING ) ) ) | (otherlv_13= 'NETWORK' otherlv_14= '{' ( (lv_mqtt_network_data_15_0= rulemqtt_network_data ) )* otherlv_16= '}' ) | (otherlv_17= 'SUBTOPICS' otherlv_18= '{' (otherlv_19= 'TOPIC_NAME' otherlv_20= '=' ( (lv_subtopics_21_0= RULE_STRING ) ) )* otherlv_22= '}' ) | (otherlv_23= 'PUBTOPICS' otherlv_24= '{' ( (otherlv_25= 'TOPIC_NAME' otherlv_26= '=' ( (lv_pubtopics_27_0= RULE_STRING ) )* ) | (otherlv_28= 'DATA' otherlv_29= '=' ( (lv_value_30_0= RULE_STRING ) ) ) )* otherlv_31= '}' ) )* ) )
            // InternalBPMN_translator.g:1117:2: ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'BROKER_USER' otherlv_5= '=' ( (lv_broker_user_6_0= RULE_STRING ) ) ) | (otherlv_7= 'BROKER_PASSWORD' otherlv_8= '=' ( (lv_broker_password_9_0= RULE_STRING ) ) ) | (otherlv_10= 'BROKER' otherlv_11= '=' ( (lv_broker_12_0= RULE_STRING ) ) ) | (otherlv_13= 'NETWORK' otherlv_14= '{' ( (lv_mqtt_network_data_15_0= rulemqtt_network_data ) )* otherlv_16= '}' ) | (otherlv_17= 'SUBTOPICS' otherlv_18= '{' (otherlv_19= 'TOPIC_NAME' otherlv_20= '=' ( (lv_subtopics_21_0= RULE_STRING ) ) )* otherlv_22= '}' ) | (otherlv_23= 'PUBTOPICS' otherlv_24= '{' ( (otherlv_25= 'TOPIC_NAME' otherlv_26= '=' ( (lv_pubtopics_27_0= RULE_STRING ) )* ) | (otherlv_28= 'DATA' otherlv_29= '=' ( (lv_value_30_0= RULE_STRING ) ) ) )* otherlv_31= '}' ) )* )
            {
            // InternalBPMN_translator.g:1117:2: ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'BROKER_USER' otherlv_5= '=' ( (lv_broker_user_6_0= RULE_STRING ) ) ) | (otherlv_7= 'BROKER_PASSWORD' otherlv_8= '=' ( (lv_broker_password_9_0= RULE_STRING ) ) ) | (otherlv_10= 'BROKER' otherlv_11= '=' ( (lv_broker_12_0= RULE_STRING ) ) ) | (otherlv_13= 'NETWORK' otherlv_14= '{' ( (lv_mqtt_network_data_15_0= rulemqtt_network_data ) )* otherlv_16= '}' ) | (otherlv_17= 'SUBTOPICS' otherlv_18= '{' (otherlv_19= 'TOPIC_NAME' otherlv_20= '=' ( (lv_subtopics_21_0= RULE_STRING ) ) )* otherlv_22= '}' ) | (otherlv_23= 'PUBTOPICS' otherlv_24= '{' ( (otherlv_25= 'TOPIC_NAME' otherlv_26= '=' ( (lv_pubtopics_27_0= RULE_STRING ) )* ) | (otherlv_28= 'DATA' otherlv_29= '=' ( (lv_value_30_0= RULE_STRING ) ) ) )* otherlv_31= '}' ) )* )
            // InternalBPMN_translator.g:1118:3: () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'BROKER_USER' otherlv_5= '=' ( (lv_broker_user_6_0= RULE_STRING ) ) ) | (otherlv_7= 'BROKER_PASSWORD' otherlv_8= '=' ( (lv_broker_password_9_0= RULE_STRING ) ) ) | (otherlv_10= 'BROKER' otherlv_11= '=' ( (lv_broker_12_0= RULE_STRING ) ) ) | (otherlv_13= 'NETWORK' otherlv_14= '{' ( (lv_mqtt_network_data_15_0= rulemqtt_network_data ) )* otherlv_16= '}' ) | (otherlv_17= 'SUBTOPICS' otherlv_18= '{' (otherlv_19= 'TOPIC_NAME' otherlv_20= '=' ( (lv_subtopics_21_0= RULE_STRING ) ) )* otherlv_22= '}' ) | (otherlv_23= 'PUBTOPICS' otherlv_24= '{' ( (otherlv_25= 'TOPIC_NAME' otherlv_26= '=' ( (lv_pubtopics_27_0= RULE_STRING ) )* ) | (otherlv_28= 'DATA' otherlv_29= '=' ( (lv_value_30_0= RULE_STRING ) ) ) )* otherlv_31= '}' ) )*
            {
            // InternalBPMN_translator.g:1118:3: ()
            // InternalBPMN_translator.g:1119:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMqtt_dataAccess().getMqtt_dataAction_0(),
            					current);
            			

            }

            // InternalBPMN_translator.g:1125:3: ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'BROKER_USER' otherlv_5= '=' ( (lv_broker_user_6_0= RULE_STRING ) ) ) | (otherlv_7= 'BROKER_PASSWORD' otherlv_8= '=' ( (lv_broker_password_9_0= RULE_STRING ) ) ) | (otherlv_10= 'BROKER' otherlv_11= '=' ( (lv_broker_12_0= RULE_STRING ) ) ) | (otherlv_13= 'NETWORK' otherlv_14= '{' ( (lv_mqtt_network_data_15_0= rulemqtt_network_data ) )* otherlv_16= '}' ) | (otherlv_17= 'SUBTOPICS' otherlv_18= '{' (otherlv_19= 'TOPIC_NAME' otherlv_20= '=' ( (lv_subtopics_21_0= RULE_STRING ) ) )* otherlv_22= '}' ) | (otherlv_23= 'PUBTOPICS' otherlv_24= '{' ( (otherlv_25= 'TOPIC_NAME' otherlv_26= '=' ( (lv_pubtopics_27_0= RULE_STRING ) )* ) | (otherlv_28= 'DATA' otherlv_29= '=' ( (lv_value_30_0= RULE_STRING ) ) ) )* otherlv_31= '}' ) )*
            loop17:
            do {
                int alt17=8;
                switch ( input.LA(1) ) {
                case 36:
                    {
                    alt17=1;
                    }
                    break;
                case 37:
                    {
                    alt17=2;
                    }
                    break;
                case 38:
                    {
                    alt17=3;
                    }
                    break;
                case 39:
                    {
                    alt17=4;
                    }
                    break;
                case 40:
                    {
                    alt17=5;
                    }
                    break;
                case 41:
                    {
                    alt17=6;
                    }
                    break;
                case 43:
                    {
                    alt17=7;
                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // InternalBPMN_translator.g:1126:4: (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:1126:4: (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:1127:5: otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,36,FOLLOW_17); 

            	    					newLeafNode(otherlv_1, grammarAccess.getMqtt_dataAccess().getNAMEKeyword_1_0_0());
            	    				
            	    otherlv_2=(Token)match(input,24,FOLLOW_6); 

            	    					newLeafNode(otherlv_2, grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalBPMN_translator.g:1135:5: ( (lv_pname_3_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:1136:6: (lv_pname_3_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:1136:6: (lv_pname_3_0= RULE_STRING )
            	    // InternalBPMN_translator.g:1137:7: lv_pname_3_0= RULE_STRING
            	    {
            	    lv_pname_3_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	    							newLeafNode(lv_pname_3_0, grammarAccess.getMqtt_dataAccess().getPnameSTRINGTerminalRuleCall_1_0_2_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getMqtt_dataRule());
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
            	    // InternalBPMN_translator.g:1155:4: (otherlv_4= 'BROKER_USER' otherlv_5= '=' ( (lv_broker_user_6_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:1155:4: (otherlv_4= 'BROKER_USER' otherlv_5= '=' ( (lv_broker_user_6_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:1156:5: otherlv_4= 'BROKER_USER' otherlv_5= '=' ( (lv_broker_user_6_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,37,FOLLOW_17); 

            	    					newLeafNode(otherlv_4, grammarAccess.getMqtt_dataAccess().getBROKER_USERKeyword_1_1_0());
            	    				
            	    otherlv_5=(Token)match(input,24,FOLLOW_6); 

            	    					newLeafNode(otherlv_5, grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalBPMN_translator.g:1164:5: ( (lv_broker_user_6_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:1165:6: (lv_broker_user_6_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:1165:6: (lv_broker_user_6_0= RULE_STRING )
            	    // InternalBPMN_translator.g:1166:7: lv_broker_user_6_0= RULE_STRING
            	    {
            	    lv_broker_user_6_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	    							newLeafNode(lv_broker_user_6_0, grammarAccess.getMqtt_dataAccess().getBroker_userSTRINGTerminalRuleCall_1_1_2_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getMqtt_dataRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"broker_user",
            	    								lv_broker_user_6_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBPMN_translator.g:1184:4: (otherlv_7= 'BROKER_PASSWORD' otherlv_8= '=' ( (lv_broker_password_9_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:1184:4: (otherlv_7= 'BROKER_PASSWORD' otherlv_8= '=' ( (lv_broker_password_9_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:1185:5: otherlv_7= 'BROKER_PASSWORD' otherlv_8= '=' ( (lv_broker_password_9_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,38,FOLLOW_17); 

            	    					newLeafNode(otherlv_7, grammarAccess.getMqtt_dataAccess().getBROKER_PASSWORDKeyword_1_2_0());
            	    				
            	    otherlv_8=(Token)match(input,24,FOLLOW_6); 

            	    					newLeafNode(otherlv_8, grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_2_1());
            	    				
            	    // InternalBPMN_translator.g:1193:5: ( (lv_broker_password_9_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:1194:6: (lv_broker_password_9_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:1194:6: (lv_broker_password_9_0= RULE_STRING )
            	    // InternalBPMN_translator.g:1195:7: lv_broker_password_9_0= RULE_STRING
            	    {
            	    lv_broker_password_9_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	    							newLeafNode(lv_broker_password_9_0, grammarAccess.getMqtt_dataAccess().getBroker_passwordSTRINGTerminalRuleCall_1_2_2_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getMqtt_dataRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"broker_password",
            	    								lv_broker_password_9_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalBPMN_translator.g:1213:4: (otherlv_10= 'BROKER' otherlv_11= '=' ( (lv_broker_12_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:1213:4: (otherlv_10= 'BROKER' otherlv_11= '=' ( (lv_broker_12_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:1214:5: otherlv_10= 'BROKER' otherlv_11= '=' ( (lv_broker_12_0= RULE_STRING ) )
            	    {
            	    otherlv_10=(Token)match(input,39,FOLLOW_17); 

            	    					newLeafNode(otherlv_10, grammarAccess.getMqtt_dataAccess().getBROKERKeyword_1_3_0());
            	    				
            	    otherlv_11=(Token)match(input,24,FOLLOW_6); 

            	    					newLeafNode(otherlv_11, grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_3_1());
            	    				
            	    // InternalBPMN_translator.g:1222:5: ( (lv_broker_12_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:1223:6: (lv_broker_12_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:1223:6: (lv_broker_12_0= RULE_STRING )
            	    // InternalBPMN_translator.g:1224:7: lv_broker_12_0= RULE_STRING
            	    {
            	    lv_broker_12_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	    							newLeafNode(lv_broker_12_0, grammarAccess.getMqtt_dataAccess().getBrokerSTRINGTerminalRuleCall_1_3_2_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getMqtt_dataRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"broker",
            	    								lv_broker_12_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalBPMN_translator.g:1242:4: (otherlv_13= 'NETWORK' otherlv_14= '{' ( (lv_mqtt_network_data_15_0= rulemqtt_network_data ) )* otherlv_16= '}' )
            	    {
            	    // InternalBPMN_translator.g:1242:4: (otherlv_13= 'NETWORK' otherlv_14= '{' ( (lv_mqtt_network_data_15_0= rulemqtt_network_data ) )* otherlv_16= '}' )
            	    // InternalBPMN_translator.g:1243:5: otherlv_13= 'NETWORK' otherlv_14= '{' ( (lv_mqtt_network_data_15_0= rulemqtt_network_data ) )* otherlv_16= '}'
            	    {
            	    otherlv_13=(Token)match(input,40,FOLLOW_10); 

            	    					newLeafNode(otherlv_13, grammarAccess.getMqtt_dataAccess().getNETWORKKeyword_1_4_0());
            	    				
            	    otherlv_14=(Token)match(input,20,FOLLOW_26); 

            	    					newLeafNode(otherlv_14, grammarAccess.getMqtt_dataAccess().getLeftCurlyBracketKeyword_1_4_1());
            	    				
            	    // InternalBPMN_translator.g:1251:5: ( (lv_mqtt_network_data_15_0= rulemqtt_network_data ) )*
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0==45) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // InternalBPMN_translator.g:1252:6: (lv_mqtt_network_data_15_0= rulemqtt_network_data )
            	    	    {
            	    	    // InternalBPMN_translator.g:1252:6: (lv_mqtt_network_data_15_0= rulemqtt_network_data )
            	    	    // InternalBPMN_translator.g:1253:7: lv_mqtt_network_data_15_0= rulemqtt_network_data
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getMqtt_dataAccess().getMqtt_network_dataMqtt_network_dataParserRuleCall_1_4_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_26);
            	    	    lv_mqtt_network_data_15_0=rulemqtt_network_data();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getMqtt_dataRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"mqtt_network_data",
            	    	    								lv_mqtt_network_data_15_0,
            	    	    								"org.xtext.BPMN_translator.mqtt_network_data");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop13;
            	        }
            	    } while (true);

            	    otherlv_16=(Token)match(input,21,FOLLOW_25); 

            	    					newLeafNode(otherlv_16, grammarAccess.getMqtt_dataAccess().getRightCurlyBracketKeyword_1_4_3());
            	    				

            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalBPMN_translator.g:1276:4: (otherlv_17= 'SUBTOPICS' otherlv_18= '{' (otherlv_19= 'TOPIC_NAME' otherlv_20= '=' ( (lv_subtopics_21_0= RULE_STRING ) ) )* otherlv_22= '}' )
            	    {
            	    // InternalBPMN_translator.g:1276:4: (otherlv_17= 'SUBTOPICS' otherlv_18= '{' (otherlv_19= 'TOPIC_NAME' otherlv_20= '=' ( (lv_subtopics_21_0= RULE_STRING ) ) )* otherlv_22= '}' )
            	    // InternalBPMN_translator.g:1277:5: otherlv_17= 'SUBTOPICS' otherlv_18= '{' (otherlv_19= 'TOPIC_NAME' otherlv_20= '=' ( (lv_subtopics_21_0= RULE_STRING ) ) )* otherlv_22= '}'
            	    {
            	    otherlv_17=(Token)match(input,41,FOLLOW_10); 

            	    					newLeafNode(otherlv_17, grammarAccess.getMqtt_dataAccess().getSUBTOPICSKeyword_1_5_0());
            	    				
            	    otherlv_18=(Token)match(input,20,FOLLOW_27); 

            	    					newLeafNode(otherlv_18, grammarAccess.getMqtt_dataAccess().getLeftCurlyBracketKeyword_1_5_1());
            	    				
            	    // InternalBPMN_translator.g:1285:5: (otherlv_19= 'TOPIC_NAME' otherlv_20= '=' ( (lv_subtopics_21_0= RULE_STRING ) ) )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==42) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // InternalBPMN_translator.g:1286:6: otherlv_19= 'TOPIC_NAME' otherlv_20= '=' ( (lv_subtopics_21_0= RULE_STRING ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,42,FOLLOW_17); 

            	    	    						newLeafNode(otherlv_19, grammarAccess.getMqtt_dataAccess().getTOPIC_NAMEKeyword_1_5_2_0());
            	    	    					
            	    	    otherlv_20=(Token)match(input,24,FOLLOW_6); 

            	    	    						newLeafNode(otherlv_20, grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_5_2_1());
            	    	    					
            	    	    // InternalBPMN_translator.g:1294:6: ( (lv_subtopics_21_0= RULE_STRING ) )
            	    	    // InternalBPMN_translator.g:1295:7: (lv_subtopics_21_0= RULE_STRING )
            	    	    {
            	    	    // InternalBPMN_translator.g:1295:7: (lv_subtopics_21_0= RULE_STRING )
            	    	    // InternalBPMN_translator.g:1296:8: lv_subtopics_21_0= RULE_STRING
            	    	    {
            	    	    lv_subtopics_21_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            	    	    								newLeafNode(lv_subtopics_21_0, grammarAccess.getMqtt_dataAccess().getSubtopicsSTRINGTerminalRuleCall_1_5_2_2_0());
            	    	    							

            	    	    								if (current==null) {
            	    	    									current = createModelElement(grammarAccess.getMqtt_dataRule());
            	    	    								}
            	    	    								addWithLastConsumed(
            	    	    									current,
            	    	    									"subtopics",
            	    	    									lv_subtopics_21_0,
            	    	    									"org.eclipse.xtext.common.Terminals.STRING");
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop14;
            	        }
            	    } while (true);

            	    otherlv_22=(Token)match(input,21,FOLLOW_25); 

            	    					newLeafNode(otherlv_22, grammarAccess.getMqtt_dataAccess().getRightCurlyBracketKeyword_1_5_3());
            	    				

            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalBPMN_translator.g:1319:4: (otherlv_23= 'PUBTOPICS' otherlv_24= '{' ( (otherlv_25= 'TOPIC_NAME' otherlv_26= '=' ( (lv_pubtopics_27_0= RULE_STRING ) )* ) | (otherlv_28= 'DATA' otherlv_29= '=' ( (lv_value_30_0= RULE_STRING ) ) ) )* otherlv_31= '}' )
            	    {
            	    // InternalBPMN_translator.g:1319:4: (otherlv_23= 'PUBTOPICS' otherlv_24= '{' ( (otherlv_25= 'TOPIC_NAME' otherlv_26= '=' ( (lv_pubtopics_27_0= RULE_STRING ) )* ) | (otherlv_28= 'DATA' otherlv_29= '=' ( (lv_value_30_0= RULE_STRING ) ) ) )* otherlv_31= '}' )
            	    // InternalBPMN_translator.g:1320:5: otherlv_23= 'PUBTOPICS' otherlv_24= '{' ( (otherlv_25= 'TOPIC_NAME' otherlv_26= '=' ( (lv_pubtopics_27_0= RULE_STRING ) )* ) | (otherlv_28= 'DATA' otherlv_29= '=' ( (lv_value_30_0= RULE_STRING ) ) ) )* otherlv_31= '}'
            	    {
            	    otherlv_23=(Token)match(input,43,FOLLOW_10); 

            	    					newLeafNode(otherlv_23, grammarAccess.getMqtt_dataAccess().getPUBTOPICSKeyword_1_6_0());
            	    				
            	    otherlv_24=(Token)match(input,20,FOLLOW_28); 

            	    					newLeafNode(otherlv_24, grammarAccess.getMqtt_dataAccess().getLeftCurlyBracketKeyword_1_6_1());
            	    				
            	    // InternalBPMN_translator.g:1328:5: ( (otherlv_25= 'TOPIC_NAME' otherlv_26= '=' ( (lv_pubtopics_27_0= RULE_STRING ) )* ) | (otherlv_28= 'DATA' otherlv_29= '=' ( (lv_value_30_0= RULE_STRING ) ) ) )*
            	    loop16:
            	    do {
            	        int alt16=3;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==42) ) {
            	            alt16=1;
            	        }
            	        else if ( (LA16_0==44) ) {
            	            alt16=2;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // InternalBPMN_translator.g:1329:6: (otherlv_25= 'TOPIC_NAME' otherlv_26= '=' ( (lv_pubtopics_27_0= RULE_STRING ) )* )
            	    	    {
            	    	    // InternalBPMN_translator.g:1329:6: (otherlv_25= 'TOPIC_NAME' otherlv_26= '=' ( (lv_pubtopics_27_0= RULE_STRING ) )* )
            	    	    // InternalBPMN_translator.g:1330:7: otherlv_25= 'TOPIC_NAME' otherlv_26= '=' ( (lv_pubtopics_27_0= RULE_STRING ) )*
            	    	    {
            	    	    otherlv_25=(Token)match(input,42,FOLLOW_17); 

            	    	    							newLeafNode(otherlv_25, grammarAccess.getMqtt_dataAccess().getTOPIC_NAMEKeyword_1_6_2_0_0());
            	    	    						
            	    	    otherlv_26=(Token)match(input,24,FOLLOW_29); 

            	    	    							newLeafNode(otherlv_26, grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_6_2_0_1());
            	    	    						
            	    	    // InternalBPMN_translator.g:1338:7: ( (lv_pubtopics_27_0= RULE_STRING ) )*
            	    	    loop15:
            	    	    do {
            	    	        int alt15=2;
            	    	        int LA15_0 = input.LA(1);

            	    	        if ( (LA15_0==RULE_STRING) ) {
            	    	            alt15=1;
            	    	        }


            	    	        switch (alt15) {
            	    	    	case 1 :
            	    	    	    // InternalBPMN_translator.g:1339:8: (lv_pubtopics_27_0= RULE_STRING )
            	    	    	    {
            	    	    	    // InternalBPMN_translator.g:1339:8: (lv_pubtopics_27_0= RULE_STRING )
            	    	    	    // InternalBPMN_translator.g:1340:9: lv_pubtopics_27_0= RULE_STRING
            	    	    	    {
            	    	    	    lv_pubtopics_27_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            	    	    	    									newLeafNode(lv_pubtopics_27_0, grammarAccess.getMqtt_dataAccess().getPubtopicsSTRINGTerminalRuleCall_1_6_2_0_2_0());
            	    	    	    								

            	    	    	    									if (current==null) {
            	    	    	    										current = createModelElement(grammarAccess.getMqtt_dataRule());
            	    	    	    									}
            	    	    	    									addWithLastConsumed(
            	    	    	    										current,
            	    	    	    										"pubtopics",
            	    	    	    										lv_pubtopics_27_0,
            	    	    	    										"org.eclipse.xtext.common.Terminals.STRING");
            	    	    	    								

            	    	    	    }


            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop15;
            	    	        }
            	    	    } while (true);


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalBPMN_translator.g:1358:6: (otherlv_28= 'DATA' otherlv_29= '=' ( (lv_value_30_0= RULE_STRING ) ) )
            	    	    {
            	    	    // InternalBPMN_translator.g:1358:6: (otherlv_28= 'DATA' otherlv_29= '=' ( (lv_value_30_0= RULE_STRING ) ) )
            	    	    // InternalBPMN_translator.g:1359:7: otherlv_28= 'DATA' otherlv_29= '=' ( (lv_value_30_0= RULE_STRING ) )
            	    	    {
            	    	    otherlv_28=(Token)match(input,44,FOLLOW_17); 

            	    	    							newLeafNode(otherlv_28, grammarAccess.getMqtt_dataAccess().getDATAKeyword_1_6_2_1_0());
            	    	    						
            	    	    otherlv_29=(Token)match(input,24,FOLLOW_6); 

            	    	    							newLeafNode(otherlv_29, grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_6_2_1_1());
            	    	    						
            	    	    // InternalBPMN_translator.g:1367:7: ( (lv_value_30_0= RULE_STRING ) )
            	    	    // InternalBPMN_translator.g:1368:8: (lv_value_30_0= RULE_STRING )
            	    	    {
            	    	    // InternalBPMN_translator.g:1368:8: (lv_value_30_0= RULE_STRING )
            	    	    // InternalBPMN_translator.g:1369:9: lv_value_30_0= RULE_STRING
            	    	    {
            	    	    lv_value_30_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            	    	    									newLeafNode(lv_value_30_0, grammarAccess.getMqtt_dataAccess().getValueSTRINGTerminalRuleCall_1_6_2_1_2_0());
            	    	    								

            	    	    									if (current==null) {
            	    	    										current = createModelElement(grammarAccess.getMqtt_dataRule());
            	    	    									}
            	    	    									addWithLastConsumed(
            	    	    										current,
            	    	    										"value",
            	    	    										lv_value_30_0,
            	    	    										"org.eclipse.xtext.common.Terminals.STRING");
            	    	    								

            	    	    }


            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop16;
            	        }
            	    } while (true);

            	    otherlv_31=(Token)match(input,21,FOLLOW_25); 

            	    					newLeafNode(otherlv_31, grammarAccess.getMqtt_dataAccess().getRightCurlyBracketKeyword_1_6_3());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "rulemqtt_data"


    // $ANTLR start "entryRulemqtt_network_data"
    // InternalBPMN_translator.g:1397:1: entryRulemqtt_network_data returns [EObject current=null] : iv_rulemqtt_network_data= rulemqtt_network_data EOF ;
    public final EObject entryRulemqtt_network_data() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemqtt_network_data = null;


        try {
            // InternalBPMN_translator.g:1397:58: (iv_rulemqtt_network_data= rulemqtt_network_data EOF )
            // InternalBPMN_translator.g:1398:2: iv_rulemqtt_network_data= rulemqtt_network_data EOF
            {
             newCompositeNode(grammarAccess.getMqtt_network_dataRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemqtt_network_data=rulemqtt_network_data();

            state._fsp--;

             current =iv_rulemqtt_network_data; 
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
    // $ANTLR end "entryRulemqtt_network_data"


    // $ANTLR start "rulemqtt_network_data"
    // InternalBPMN_translator.g:1404:1: rulemqtt_network_data returns [EObject current=null] : (otherlv_0= 'SSID' otherlv_1= '=' ( (lv_ssid_2_0= RULE_STRING ) ) otherlv_3= 'PASSWORD' otherlv_4= '=' ( (lv_password_5_0= RULE_STRING ) ) ) ;
    public final EObject rulemqtt_network_data() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ssid_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_password_5_0=null;


        	enterRule();

        try {
            // InternalBPMN_translator.g:1410:2: ( (otherlv_0= 'SSID' otherlv_1= '=' ( (lv_ssid_2_0= RULE_STRING ) ) otherlv_3= 'PASSWORD' otherlv_4= '=' ( (lv_password_5_0= RULE_STRING ) ) ) )
            // InternalBPMN_translator.g:1411:2: (otherlv_0= 'SSID' otherlv_1= '=' ( (lv_ssid_2_0= RULE_STRING ) ) otherlv_3= 'PASSWORD' otherlv_4= '=' ( (lv_password_5_0= RULE_STRING ) ) )
            {
            // InternalBPMN_translator.g:1411:2: (otherlv_0= 'SSID' otherlv_1= '=' ( (lv_ssid_2_0= RULE_STRING ) ) otherlv_3= 'PASSWORD' otherlv_4= '=' ( (lv_password_5_0= RULE_STRING ) ) )
            // InternalBPMN_translator.g:1412:3: otherlv_0= 'SSID' otherlv_1= '=' ( (lv_ssid_2_0= RULE_STRING ) ) otherlv_3= 'PASSWORD' otherlv_4= '=' ( (lv_password_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getMqtt_network_dataAccess().getSSIDKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getMqtt_network_dataAccess().getEqualsSignKeyword_1());
            		
            // InternalBPMN_translator.g:1420:3: ( (lv_ssid_2_0= RULE_STRING ) )
            // InternalBPMN_translator.g:1421:4: (lv_ssid_2_0= RULE_STRING )
            {
            // InternalBPMN_translator.g:1421:4: (lv_ssid_2_0= RULE_STRING )
            // InternalBPMN_translator.g:1422:5: lv_ssid_2_0= RULE_STRING
            {
            lv_ssid_2_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            					newLeafNode(lv_ssid_2_0, grammarAccess.getMqtt_network_dataAccess().getSsidSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMqtt_network_dataRule());
            					}
            					addWithLastConsumed(
            						current,
            						"ssid",
            						lv_ssid_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,46,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getMqtt_network_dataAccess().getPASSWORDKeyword_3());
            		
            otherlv_4=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getMqtt_network_dataAccess().getEqualsSignKeyword_4());
            		
            // InternalBPMN_translator.g:1446:3: ( (lv_password_5_0= RULE_STRING ) )
            // InternalBPMN_translator.g:1447:4: (lv_password_5_0= RULE_STRING )
            {
            // InternalBPMN_translator.g:1447:4: (lv_password_5_0= RULE_STRING )
            // InternalBPMN_translator.g:1448:5: lv_password_5_0= RULE_STRING
            {
            lv_password_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_password_5_0, grammarAccess.getMqtt_network_dataAccess().getPasswordSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMqtt_network_dataRule());
            					}
            					addWithLastConsumed(
            						current,
            						"password",
            						lv_password_5_0,
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
    // $ANTLR end "rulemqtt_network_data"


    // $ANTLR start "entryRulemqtt_device"
    // InternalBPMN_translator.g:1468:1: entryRulemqtt_device returns [EObject current=null] : iv_rulemqtt_device= rulemqtt_device EOF ;
    public final EObject entryRulemqtt_device() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemqtt_device = null;


        try {
            // InternalBPMN_translator.g:1468:52: (iv_rulemqtt_device= rulemqtt_device EOF )
            // InternalBPMN_translator.g:1469:2: iv_rulemqtt_device= rulemqtt_device EOF
            {
             newCompositeNode(grammarAccess.getMqtt_deviceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemqtt_device=rulemqtt_device();

            state._fsp--;

             current =iv_rulemqtt_device; 
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
    // $ANTLR end "entryRulemqtt_device"


    // $ANTLR start "rulemqtt_device"
    // InternalBPMN_translator.g:1475:1: rulemqtt_device returns [EObject current=null] : (otherlv_0= 'PROTOCOL_DEVICE' otherlv_1= '{' otherlv_2= 'NAME' otherlv_3= '=' ( (lv_dname_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject rulemqtt_device() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_dname_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalBPMN_translator.g:1481:2: ( (otherlv_0= 'PROTOCOL_DEVICE' otherlv_1= '{' otherlv_2= 'NAME' otherlv_3= '=' ( (lv_dname_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // InternalBPMN_translator.g:1482:2: (otherlv_0= 'PROTOCOL_DEVICE' otherlv_1= '{' otherlv_2= 'NAME' otherlv_3= '=' ( (lv_dname_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // InternalBPMN_translator.g:1482:2: (otherlv_0= 'PROTOCOL_DEVICE' otherlv_1= '{' otherlv_2= 'NAME' otherlv_3= '=' ( (lv_dname_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // InternalBPMN_translator.g:1483:3: otherlv_0= 'PROTOCOL_DEVICE' otherlv_1= '{' otherlv_2= 'NAME' otherlv_3= '=' ( (lv_dname_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMqtt_deviceAccess().getPROTOCOL_DEVICEKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getMqtt_deviceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getMqtt_deviceAccess().getNAMEKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getMqtt_deviceAccess().getEqualsSignKeyword_3());
            		
            // InternalBPMN_translator.g:1499:3: ( (lv_dname_4_0= RULE_STRING ) )
            // InternalBPMN_translator.g:1500:4: (lv_dname_4_0= RULE_STRING )
            {
            // InternalBPMN_translator.g:1500:4: (lv_dname_4_0= RULE_STRING )
            // InternalBPMN_translator.g:1501:5: lv_dname_4_0= RULE_STRING
            {
            lv_dname_4_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_dname_4_0, grammarAccess.getMqtt_deviceAccess().getDnameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMqtt_deviceRule());
            					}
            					addWithLastConsumed(
            						current,
            						"dname",
            						lv_dname_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMqtt_deviceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulemqtt_device"


    // $ANTLR start "entryRulesensor"
    // InternalBPMN_translator.g:1525:1: entryRulesensor returns [EObject current=null] : iv_rulesensor= rulesensor EOF ;
    public final EObject entryRulesensor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesensor = null;


        try {
            // InternalBPMN_translator.g:1525:47: (iv_rulesensor= rulesensor EOF )
            // InternalBPMN_translator.g:1526:2: iv_rulesensor= rulesensor EOF
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
    // InternalBPMN_translator.g:1532:1: rulesensor returns [EObject current=null] : ( ( ( (lv_sname_0_0= 'TEMPERATURE' ) ) otherlv_1= '{' ( (lv_sensor_2_0= rulesensor_data ) ) otherlv_3= '}' ) | ( ( (lv_sname_4_0= 'DISTANCE' ) ) otherlv_5= '{' ( (lv_sensor_6_0= rulesensor_data ) ) otherlv_7= '}' ) ) ;
    public final EObject rulesensor() throws RecognitionException {
        EObject current = null;

        Token lv_sname_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_sname_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_sensor_2_0 = null;

        EObject lv_sensor_6_0 = null;



        	enterRule();

        try {
            // InternalBPMN_translator.g:1538:2: ( ( ( ( (lv_sname_0_0= 'TEMPERATURE' ) ) otherlv_1= '{' ( (lv_sensor_2_0= rulesensor_data ) ) otherlv_3= '}' ) | ( ( (lv_sname_4_0= 'DISTANCE' ) ) otherlv_5= '{' ( (lv_sensor_6_0= rulesensor_data ) ) otherlv_7= '}' ) ) )
            // InternalBPMN_translator.g:1539:2: ( ( ( (lv_sname_0_0= 'TEMPERATURE' ) ) otherlv_1= '{' ( (lv_sensor_2_0= rulesensor_data ) ) otherlv_3= '}' ) | ( ( (lv_sname_4_0= 'DISTANCE' ) ) otherlv_5= '{' ( (lv_sensor_6_0= rulesensor_data ) ) otherlv_7= '}' ) )
            {
            // InternalBPMN_translator.g:1539:2: ( ( ( (lv_sname_0_0= 'TEMPERATURE' ) ) otherlv_1= '{' ( (lv_sensor_2_0= rulesensor_data ) ) otherlv_3= '}' ) | ( ( (lv_sname_4_0= 'DISTANCE' ) ) otherlv_5= '{' ( (lv_sensor_6_0= rulesensor_data ) ) otherlv_7= '}' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            else if ( (LA18_0==48) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalBPMN_translator.g:1540:3: ( ( (lv_sname_0_0= 'TEMPERATURE' ) ) otherlv_1= '{' ( (lv_sensor_2_0= rulesensor_data ) ) otherlv_3= '}' )
                    {
                    // InternalBPMN_translator.g:1540:3: ( ( (lv_sname_0_0= 'TEMPERATURE' ) ) otherlv_1= '{' ( (lv_sensor_2_0= rulesensor_data ) ) otherlv_3= '}' )
                    // InternalBPMN_translator.g:1541:4: ( (lv_sname_0_0= 'TEMPERATURE' ) ) otherlv_1= '{' ( (lv_sensor_2_0= rulesensor_data ) ) otherlv_3= '}'
                    {
                    // InternalBPMN_translator.g:1541:4: ( (lv_sname_0_0= 'TEMPERATURE' ) )
                    // InternalBPMN_translator.g:1542:5: (lv_sname_0_0= 'TEMPERATURE' )
                    {
                    // InternalBPMN_translator.g:1542:5: (lv_sname_0_0= 'TEMPERATURE' )
                    // InternalBPMN_translator.g:1543:6: lv_sname_0_0= 'TEMPERATURE'
                    {
                    lv_sname_0_0=(Token)match(input,28,FOLLOW_10); 

                    						newLeafNode(lv_sname_0_0, grammarAccess.getSensorAccess().getSnameTEMPERATUREKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSensorRule());
                    						}
                    						addWithLastConsumed(current, "sname", lv_sname_0_0, "TEMPERATURE");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_32); 

                    				newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_0_1());
                    			
                    // InternalBPMN_translator.g:1559:4: ( (lv_sensor_2_0= rulesensor_data ) )
                    // InternalBPMN_translator.g:1560:5: (lv_sensor_2_0= rulesensor_data )
                    {
                    // InternalBPMN_translator.g:1560:5: (lv_sensor_2_0= rulesensor_data )
                    // InternalBPMN_translator.g:1561:6: lv_sensor_2_0= rulesensor_data
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getSensorSensor_dataParserRuleCall_0_2_0());
                    					
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

                    otherlv_3=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:1584:3: ( ( (lv_sname_4_0= 'DISTANCE' ) ) otherlv_5= '{' ( (lv_sensor_6_0= rulesensor_data ) ) otherlv_7= '}' )
                    {
                    // InternalBPMN_translator.g:1584:3: ( ( (lv_sname_4_0= 'DISTANCE' ) ) otherlv_5= '{' ( (lv_sensor_6_0= rulesensor_data ) ) otherlv_7= '}' )
                    // InternalBPMN_translator.g:1585:4: ( (lv_sname_4_0= 'DISTANCE' ) ) otherlv_5= '{' ( (lv_sensor_6_0= rulesensor_data ) ) otherlv_7= '}'
                    {
                    // InternalBPMN_translator.g:1585:4: ( (lv_sname_4_0= 'DISTANCE' ) )
                    // InternalBPMN_translator.g:1586:5: (lv_sname_4_0= 'DISTANCE' )
                    {
                    // InternalBPMN_translator.g:1586:5: (lv_sname_4_0= 'DISTANCE' )
                    // InternalBPMN_translator.g:1587:6: lv_sname_4_0= 'DISTANCE'
                    {
                    lv_sname_4_0=(Token)match(input,48,FOLLOW_10); 

                    						newLeafNode(lv_sname_4_0, grammarAccess.getSensorAccess().getSnameDISTANCEKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSensorRule());
                    						}
                    						addWithLastConsumed(current, "sname", lv_sname_4_0, "DISTANCE");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_32); 

                    				newLeafNode(otherlv_5, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_1_1());
                    			
                    // InternalBPMN_translator.g:1603:4: ( (lv_sensor_6_0= rulesensor_data ) )
                    // InternalBPMN_translator.g:1604:5: (lv_sensor_6_0= rulesensor_data )
                    {
                    // InternalBPMN_translator.g:1604:5: (lv_sensor_6_0= rulesensor_data )
                    // InternalBPMN_translator.g:1605:6: lv_sensor_6_0= rulesensor_data
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getSensorSensor_dataParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_sensor_6_0=rulesensor_data();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						add(
                    							current,
                    							"sensor",
                    							lv_sensor_6_0,
                    							"org.xtext.BPMN_translator.sensor_data");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_1_3());
                    			

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
    // $ANTLR end "rulesensor"


    // $ANTLR start "entryRulesensor_data"
    // InternalBPMN_translator.g:1631:1: entryRulesensor_data returns [EObject current=null] : iv_rulesensor_data= rulesensor_data EOF ;
    public final EObject entryRulesensor_data() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesensor_data = null;


        try {
            // InternalBPMN_translator.g:1631:52: (iv_rulesensor_data= rulesensor_data EOF )
            // InternalBPMN_translator.g:1632:2: iv_rulesensor_data= rulesensor_data EOF
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
    // InternalBPMN_translator.g:1638:1: rulesensor_data returns [EObject current=null] : ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'PINS' otherlv_5= '=' ( (lv_pins_6_0= RULE_STRING ) ) ) | (otherlv_7= 'SENSOR_ID' otherlv_8= '=' ( (lv_sensor_id_9_0= RULE_STRING ) ) ) )* ) ;
    public final EObject rulesensor_data() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_pname_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_pins_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_sensor_id_9_0=null;


        	enterRule();

        try {
            // InternalBPMN_translator.g:1644:2: ( ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'PINS' otherlv_5= '=' ( (lv_pins_6_0= RULE_STRING ) ) ) | (otherlv_7= 'SENSOR_ID' otherlv_8= '=' ( (lv_sensor_id_9_0= RULE_STRING ) ) ) )* ) )
            // InternalBPMN_translator.g:1645:2: ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'PINS' otherlv_5= '=' ( (lv_pins_6_0= RULE_STRING ) ) ) | (otherlv_7= 'SENSOR_ID' otherlv_8= '=' ( (lv_sensor_id_9_0= RULE_STRING ) ) ) )* )
            {
            // InternalBPMN_translator.g:1645:2: ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'PINS' otherlv_5= '=' ( (lv_pins_6_0= RULE_STRING ) ) ) | (otherlv_7= 'SENSOR_ID' otherlv_8= '=' ( (lv_sensor_id_9_0= RULE_STRING ) ) ) )* )
            // InternalBPMN_translator.g:1646:3: () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'PINS' otherlv_5= '=' ( (lv_pins_6_0= RULE_STRING ) ) ) | (otherlv_7= 'SENSOR_ID' otherlv_8= '=' ( (lv_sensor_id_9_0= RULE_STRING ) ) ) )*
            {
            // InternalBPMN_translator.g:1646:3: ()
            // InternalBPMN_translator.g:1647:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensor_dataAccess().getSensor_dataAction_0(),
            					current);
            			

            }

            // InternalBPMN_translator.g:1653:3: ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'PINS' otherlv_5= '=' ( (lv_pins_6_0= RULE_STRING ) ) ) | (otherlv_7= 'SENSOR_ID' otherlv_8= '=' ( (lv_sensor_id_9_0= RULE_STRING ) ) ) )*
            loop19:
            do {
                int alt19=4;
                switch ( input.LA(1) ) {
                case 36:
                    {
                    alt19=1;
                    }
                    break;
                case 49:
                    {
                    alt19=2;
                    }
                    break;
                case 50:
                    {
                    alt19=3;
                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // InternalBPMN_translator.g:1654:4: (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:1654:4: (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:1655:5: otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,36,FOLLOW_17); 

            	    					newLeafNode(otherlv_1, grammarAccess.getSensor_dataAccess().getNAMEKeyword_1_0_0());
            	    				
            	    otherlv_2=(Token)match(input,24,FOLLOW_6); 

            	    					newLeafNode(otherlv_2, grammarAccess.getSensor_dataAccess().getEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalBPMN_translator.g:1663:5: ( (lv_pname_3_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:1664:6: (lv_pname_3_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:1664:6: (lv_pname_3_0= RULE_STRING )
            	    // InternalBPMN_translator.g:1665:7: lv_pname_3_0= RULE_STRING
            	    {
            	    lv_pname_3_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

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
            	    // InternalBPMN_translator.g:1683:4: (otherlv_4= 'PINS' otherlv_5= '=' ( (lv_pins_6_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:1683:4: (otherlv_4= 'PINS' otherlv_5= '=' ( (lv_pins_6_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:1684:5: otherlv_4= 'PINS' otherlv_5= '=' ( (lv_pins_6_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,49,FOLLOW_17); 

            	    					newLeafNode(otherlv_4, grammarAccess.getSensor_dataAccess().getPINSKeyword_1_1_0());
            	    				
            	    otherlv_5=(Token)match(input,24,FOLLOW_6); 

            	    					newLeafNode(otherlv_5, grammarAccess.getSensor_dataAccess().getEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalBPMN_translator.g:1692:5: ( (lv_pins_6_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:1693:6: (lv_pins_6_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:1693:6: (lv_pins_6_0= RULE_STRING )
            	    // InternalBPMN_translator.g:1694:7: lv_pins_6_0= RULE_STRING
            	    {
            	    lv_pins_6_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            	    							newLeafNode(lv_pins_6_0, grammarAccess.getSensor_dataAccess().getPinsSTRINGTerminalRuleCall_1_1_2_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getSensor_dataRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"pins",
            	    								lv_pins_6_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBPMN_translator.g:1712:4: (otherlv_7= 'SENSOR_ID' otherlv_8= '=' ( (lv_sensor_id_9_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:1712:4: (otherlv_7= 'SENSOR_ID' otherlv_8= '=' ( (lv_sensor_id_9_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:1713:5: otherlv_7= 'SENSOR_ID' otherlv_8= '=' ( (lv_sensor_id_9_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,50,FOLLOW_17); 

            	    					newLeafNode(otherlv_7, grammarAccess.getSensor_dataAccess().getSENSOR_IDKeyword_1_2_0());
            	    				
            	    otherlv_8=(Token)match(input,24,FOLLOW_6); 

            	    					newLeafNode(otherlv_8, grammarAccess.getSensor_dataAccess().getEqualsSignKeyword_1_2_1());
            	    				
            	    // InternalBPMN_translator.g:1721:5: ( (lv_sensor_id_9_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:1722:6: (lv_sensor_id_9_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:1722:6: (lv_sensor_id_9_0= RULE_STRING )
            	    // InternalBPMN_translator.g:1723:7: lv_sensor_id_9_0= RULE_STRING
            	    {
            	    lv_sensor_id_9_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            	    							newLeafNode(lv_sensor_id_9_0, grammarAccess.getSensor_dataAccess().getSensor_idSTRINGTerminalRuleCall_1_2_2_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getSensor_dataRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"sensor_id",
            	    								lv_sensor_id_9_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

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
    static final String dfa_2s = "\1\26\1\4\1\27\1\7\1\4\1\27\1\30\2\uffff\1\4\1\5\1\4";
    static final String dfa_3s = "\1\26\1\4\1\27\1\7\1\32\2\30\2\uffff\1\32\1\5\1\32";
    static final String dfa_4s = "\7\uffff\1\1\1\2\3\uffff";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5\2\uffff\1\6\21\uffff\1\7\1\10",
            "\1\11\1\7",
            "\1\12",
            "",
            "",
            "\1\5\2\uffff\1\6\21\uffff\1\7\1\10",
            "\1\13",
            "\1\5\2\uffff\1\6\21\uffff\1\7\1\10"
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
            return "228:2: ( ( ( (lv_open_0_0= ruleOpen ) ) ( (lv_contents_1_0= rulecontent ) ) ( (lv_close_tag_2_0= ruleClose ) ) ) | ( (lv_singleton_tag_3_0= ruleSingleton ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000184C00E0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000104C00E2L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000090L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000090L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000001E1000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001000810000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001000010000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00008BF000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000BF000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000040000200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000140000200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000140000200020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0006001000200000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0006001000000002L});

}