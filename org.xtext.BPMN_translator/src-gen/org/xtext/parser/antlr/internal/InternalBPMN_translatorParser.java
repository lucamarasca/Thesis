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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HEAD", "RULE_STRING", "RULE_BODY", "RULE_KEYWORDS", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<?'", "'version='", "'encoding='", "'?>'", "'_TASK'", "'_GATEWAY'", "'{'", "'}'", "'<'", "':'", "'='", "'>'", "'/>'", "'</'", "'TEMPERATURE'", "'['", "','", "']'", "'DISTANCE'", "'&lt;'", "'&le;'", "'&ge;'", "'&gt;'", "'&amp;'", "'||'", "')'", "'!='", "'!'", "'('", "'DEVICE'", "'NAMEID'", "'MQTT'", "'HTTP'", "'NAME'", "'SERVER_IP'", "'REQUEST_TYPE'", "'CONTENT_TYPE'", "'HEADER'", "'DATA'", "'NETWORK'", "'BROKER_USER'", "'BROKER_PASSWORD'", "'BROKER'", "'SUBTOPICS'", "'TOPIC_NAME'", "'PUBTOPICS'", "'SSID'", "'PASSWORD'", "'PROTOCOL_DEVICE'", "'PINS'", "'SENSOR_ID'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
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
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
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
    // InternalBPMN_translator.g:319:1: rulecontent returns [EObject current=null] : ( () ( ( ( ( (lv_type_1_1= '_TASK' | lv_type_1_2= '_GATEWAY' ) ) ) otherlv_2= '{' ( (lv_codex_3_0= rulecodex ) ) otherlv_4= '}' ) | ( (lv_element_5_0= ruleelement ) ) | ( ( (lv_body_6_0= rulepreconditions ) )* ( ( (lv_body_7_1= RULE_BODY | lv_body_7_2= rulevariables ) ) ) ( (lv_body_8_0= ruleconditions ) )* ) | ( (lv_keywords_9_0= RULE_KEYWORDS ) ) | ( (lv_data_10_0= RULE_STRING ) ) )* ) ;
    public final EObject rulecontent() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_1=null;
        Token lv_type_1_2=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_body_7_1=null;
        Token lv_keywords_9_0=null;
        Token lv_data_10_0=null;
        EObject lv_codex_3_0 = null;

        EObject lv_element_5_0 = null;

        AntlrDatatypeRuleToken lv_body_6_0 = null;

        AntlrDatatypeRuleToken lv_body_7_2 = null;

        AntlrDatatypeRuleToken lv_body_8_0 = null;



        	enterRule();

        try {
            // InternalBPMN_translator.g:325:2: ( ( () ( ( ( ( (lv_type_1_1= '_TASK' | lv_type_1_2= '_GATEWAY' ) ) ) otherlv_2= '{' ( (lv_codex_3_0= rulecodex ) ) otherlv_4= '}' ) | ( (lv_element_5_0= ruleelement ) ) | ( ( (lv_body_6_0= rulepreconditions ) )* ( ( (lv_body_7_1= RULE_BODY | lv_body_7_2= rulevariables ) ) ) ( (lv_body_8_0= ruleconditions ) )* ) | ( (lv_keywords_9_0= RULE_KEYWORDS ) ) | ( (lv_data_10_0= RULE_STRING ) ) )* ) )
            // InternalBPMN_translator.g:326:2: ( () ( ( ( ( (lv_type_1_1= '_TASK' | lv_type_1_2= '_GATEWAY' ) ) ) otherlv_2= '{' ( (lv_codex_3_0= rulecodex ) ) otherlv_4= '}' ) | ( (lv_element_5_0= ruleelement ) ) | ( ( (lv_body_6_0= rulepreconditions ) )* ( ( (lv_body_7_1= RULE_BODY | lv_body_7_2= rulevariables ) ) ) ( (lv_body_8_0= ruleconditions ) )* ) | ( (lv_keywords_9_0= RULE_KEYWORDS ) ) | ( (lv_data_10_0= RULE_STRING ) ) )* )
            {
            // InternalBPMN_translator.g:326:2: ( () ( ( ( ( (lv_type_1_1= '_TASK' | lv_type_1_2= '_GATEWAY' ) ) ) otherlv_2= '{' ( (lv_codex_3_0= rulecodex ) ) otherlv_4= '}' ) | ( (lv_element_5_0= ruleelement ) ) | ( ( (lv_body_6_0= rulepreconditions ) )* ( ( (lv_body_7_1= RULE_BODY | lv_body_7_2= rulevariables ) ) ) ( (lv_body_8_0= ruleconditions ) )* ) | ( (lv_keywords_9_0= RULE_KEYWORDS ) ) | ( (lv_data_10_0= RULE_STRING ) ) )* )
            // InternalBPMN_translator.g:327:3: () ( ( ( ( (lv_type_1_1= '_TASK' | lv_type_1_2= '_GATEWAY' ) ) ) otherlv_2= '{' ( (lv_codex_3_0= rulecodex ) ) otherlv_4= '}' ) | ( (lv_element_5_0= ruleelement ) ) | ( ( (lv_body_6_0= rulepreconditions ) )* ( ( (lv_body_7_1= RULE_BODY | lv_body_7_2= rulevariables ) ) ) ( (lv_body_8_0= ruleconditions ) )* ) | ( (lv_keywords_9_0= RULE_KEYWORDS ) ) | ( (lv_data_10_0= RULE_STRING ) ) )*
            {
            // InternalBPMN_translator.g:327:3: ()
            // InternalBPMN_translator.g:328:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContentAccess().getContentAction_0(),
            					current);
            			

            }

            // InternalBPMN_translator.g:334:3: ( ( ( ( (lv_type_1_1= '_TASK' | lv_type_1_2= '_GATEWAY' ) ) ) otherlv_2= '{' ( (lv_codex_3_0= rulecodex ) ) otherlv_4= '}' ) | ( (lv_element_5_0= ruleelement ) ) | ( ( (lv_body_6_0= rulepreconditions ) )* ( ( (lv_body_7_1= RULE_BODY | lv_body_7_2= rulevariables ) ) ) ( (lv_body_8_0= ruleconditions ) )* ) | ( (lv_keywords_9_0= RULE_KEYWORDS ) ) | ( (lv_data_10_0= RULE_STRING ) ) )*
            loop8:
            do {
                int alt8=6;
                switch ( input.LA(1) ) {
                case 18:
                case 19:
                    {
                    alt8=1;
                    }
                    break;
                case 22:
                    {
                    alt8=2;
                    }
                    break;
                case RULE_BODY:
                case 28:
                case 32:
                case 41:
                case 42:
                    {
                    alt8=3;
                    }
                    break;
                case RULE_KEYWORDS:
                    {
                    alt8=4;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt8=5;
                    }
                    break;

                }

                switch (alt8) {
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
            	    // InternalBPMN_translator.g:412:4: ( ( (lv_body_6_0= rulepreconditions ) )* ( ( (lv_body_7_1= RULE_BODY | lv_body_7_2= rulevariables ) ) ) ( (lv_body_8_0= ruleconditions ) )* )
            	    {
            	    // InternalBPMN_translator.g:412:4: ( ( (lv_body_6_0= rulepreconditions ) )* ( ( (lv_body_7_1= RULE_BODY | lv_body_7_2= rulevariables ) ) ) ( (lv_body_8_0= ruleconditions ) )* )
            	    // InternalBPMN_translator.g:413:5: ( (lv_body_6_0= rulepreconditions ) )* ( ( (lv_body_7_1= RULE_BODY | lv_body_7_2= rulevariables ) ) ) ( (lv_body_8_0= ruleconditions ) )*
            	    {
            	    // InternalBPMN_translator.g:413:5: ( (lv_body_6_0= rulepreconditions ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( ((LA5_0>=41 && LA5_0<=42)) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalBPMN_translator.g:414:6: (lv_body_6_0= rulepreconditions )
            	    	    {
            	    	    // InternalBPMN_translator.g:414:6: (lv_body_6_0= rulepreconditions )
            	    	    // InternalBPMN_translator.g:415:7: lv_body_6_0= rulepreconditions
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getContentAccess().getBodyPreconditionsParserRuleCall_1_2_0_0());
            	    	    						
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_body_6_0=rulepreconditions();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getContentRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"body",
            	    	    								lv_body_6_0,
            	    	    								"org.xtext.BPMN_translator.preconditions");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    // InternalBPMN_translator.g:432:5: ( ( (lv_body_7_1= RULE_BODY | lv_body_7_2= rulevariables ) ) )
            	    // InternalBPMN_translator.g:433:6: ( (lv_body_7_1= RULE_BODY | lv_body_7_2= rulevariables ) )
            	    {
            	    // InternalBPMN_translator.g:433:6: ( (lv_body_7_1= RULE_BODY | lv_body_7_2= rulevariables ) )
            	    // InternalBPMN_translator.g:434:7: (lv_body_7_1= RULE_BODY | lv_body_7_2= rulevariables )
            	    {
            	    // InternalBPMN_translator.g:434:7: (lv_body_7_1= RULE_BODY | lv_body_7_2= rulevariables )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==RULE_BODY) ) {
            	        int LA6_1 = input.LA(2);

            	        if ( (LA6_1==EOF||(LA6_1>=RULE_STRING && LA6_1<=RULE_KEYWORDS)||(LA6_1>=18 && LA6_1<=19)||LA6_1==22||LA6_1==24||(LA6_1>=27 && LA6_1<=28)||(LA6_1>=32 && LA6_1<=42)) ) {
            	            alt6=1;
            	        }
            	        else if ( (LA6_1==29) ) {
            	            alt6=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 6, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA6_0==28||LA6_0==32) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalBPMN_translator.g:435:8: lv_body_7_1= RULE_BODY
            	            {
            	            lv_body_7_1=(Token)match(input,RULE_BODY,FOLLOW_15); 

            	            								newLeafNode(lv_body_7_1, grammarAccess.getContentAccess().getBodyBODYTerminalRuleCall_1_2_1_0_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getContentRule());
            	            								}
            	            								addWithLastConsumed(
            	            									current,
            	            									"body",
            	            									lv_body_7_1,
            	            									"org.xtext.BPMN_translator.BODY");
            	            							

            	            }
            	            break;
            	        case 2 :
            	            // InternalBPMN_translator.g:450:8: lv_body_7_2= rulevariables
            	            {

            	            								newCompositeNode(grammarAccess.getContentAccess().getBodyVariablesParserRuleCall_1_2_1_0_1());
            	            							
            	            pushFollow(FOLLOW_15);
            	            lv_body_7_2=rulevariables();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getContentRule());
            	            								}
            	            								add(
            	            									current,
            	            									"body",
            	            									lv_body_7_2,
            	            									"org.xtext.BPMN_translator.variables");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalBPMN_translator.g:468:5: ( (lv_body_8_0= ruleconditions ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==24||(LA7_0>=33 && LA7_0<=40)) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalBPMN_translator.g:469:6: (lv_body_8_0= ruleconditions )
            	    	    {
            	    	    // InternalBPMN_translator.g:469:6: (lv_body_8_0= ruleconditions )
            	    	    // InternalBPMN_translator.g:470:7: lv_body_8_0= ruleconditions
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getContentAccess().getBodyConditionsParserRuleCall_1_2_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_15);
            	    	    lv_body_8_0=ruleconditions();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getContentRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"body",
            	    	    								lv_body_8_0,
            	    	    								"org.xtext.BPMN_translator.conditions");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalBPMN_translator.g:489:4: ( (lv_keywords_9_0= RULE_KEYWORDS ) )
            	    {
            	    // InternalBPMN_translator.g:489:4: ( (lv_keywords_9_0= RULE_KEYWORDS ) )
            	    // InternalBPMN_translator.g:490:5: (lv_keywords_9_0= RULE_KEYWORDS )
            	    {
            	    // InternalBPMN_translator.g:490:5: (lv_keywords_9_0= RULE_KEYWORDS )
            	    // InternalBPMN_translator.g:491:6: lv_keywords_9_0= RULE_KEYWORDS
            	    {
            	    lv_keywords_9_0=(Token)match(input,RULE_KEYWORDS,FOLLOW_13); 

            	    						newLeafNode(lv_keywords_9_0, grammarAccess.getContentAccess().getKeywordsKEYWORDSTerminalRuleCall_1_3_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getContentRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"keywords",
            	    							lv_keywords_9_0,
            	    							"org.xtext.BPMN_translator.KEYWORDS");
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalBPMN_translator.g:508:4: ( (lv_data_10_0= RULE_STRING ) )
            	    {
            	    // InternalBPMN_translator.g:508:4: ( (lv_data_10_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:509:5: (lv_data_10_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:509:5: (lv_data_10_0= RULE_STRING )
            	    // InternalBPMN_translator.g:510:6: lv_data_10_0= RULE_STRING
            	    {
            	    lv_data_10_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    						newLeafNode(lv_data_10_0, grammarAccess.getContentAccess().getDataSTRINGTerminalRuleCall_1_4_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getContentRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"data",
            	    							lv_data_10_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

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
    // $ANTLR end "rulecontent"


    // $ANTLR start "entryRuleOpen"
    // InternalBPMN_translator.g:531:1: entryRuleOpen returns [EObject current=null] : iv_ruleOpen= ruleOpen EOF ;
    public final EObject entryRuleOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpen = null;


        try {
            // InternalBPMN_translator.g:531:45: (iv_ruleOpen= ruleOpen EOF )
            // InternalBPMN_translator.g:532:2: iv_ruleOpen= ruleOpen EOF
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
    // InternalBPMN_translator.g:538:1: ruleOpen returns [EObject current=null] : (otherlv_0= '<' ( (lv_head_1_0= RULE_HEAD ) ) otherlv_2= ':' ( (lv_keywords_3_0= RULE_KEYWORDS ) ) ( ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' ) | ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* otherlv_10= '>' ) ;
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
            // InternalBPMN_translator.g:544:2: ( (otherlv_0= '<' ( (lv_head_1_0= RULE_HEAD ) ) otherlv_2= ':' ( (lv_keywords_3_0= RULE_KEYWORDS ) ) ( ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' ) | ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* otherlv_10= '>' ) )
            // InternalBPMN_translator.g:545:2: (otherlv_0= '<' ( (lv_head_1_0= RULE_HEAD ) ) otherlv_2= ':' ( (lv_keywords_3_0= RULE_KEYWORDS ) ) ( ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' ) | ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* otherlv_10= '>' )
            {
            // InternalBPMN_translator.g:545:2: (otherlv_0= '<' ( (lv_head_1_0= RULE_HEAD ) ) otherlv_2= ':' ( (lv_keywords_3_0= RULE_KEYWORDS ) ) ( ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' ) | ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* otherlv_10= '>' )
            // InternalBPMN_translator.g:546:3: otherlv_0= '<' ( (lv_head_1_0= RULE_HEAD ) ) otherlv_2= ':' ( (lv_keywords_3_0= RULE_KEYWORDS ) ) ( ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' ) | ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* otherlv_10= '>'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOpenAccess().getLessThanSignKeyword_0());
            		
            // InternalBPMN_translator.g:550:3: ( (lv_head_1_0= RULE_HEAD ) )
            // InternalBPMN_translator.g:551:4: (lv_head_1_0= RULE_HEAD )
            {
            // InternalBPMN_translator.g:551:4: (lv_head_1_0= RULE_HEAD )
            // InternalBPMN_translator.g:552:5: lv_head_1_0= RULE_HEAD
            {
            lv_head_1_0=(Token)match(input,RULE_HEAD,FOLLOW_16); 

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

            otherlv_2=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getOpenAccess().getColonKeyword_2());
            		
            // InternalBPMN_translator.g:572:3: ( (lv_keywords_3_0= RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:573:4: (lv_keywords_3_0= RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:573:4: (lv_keywords_3_0= RULE_KEYWORDS )
            // InternalBPMN_translator.g:574:5: lv_keywords_3_0= RULE_KEYWORDS
            {
            lv_keywords_3_0=(Token)match(input,RULE_KEYWORDS,FOLLOW_18); 

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

            // InternalBPMN_translator.g:590:3: ( ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' ) | ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_HEAD) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==23) ) {
                        alt10=1;
                    }
                    else if ( (LA10_2==24) ) {
                        alt10=2;
                    }


                }
                else if ( (LA10_0==RULE_KEYWORDS) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBPMN_translator.g:591:4: ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' )
            	    {
            	    // InternalBPMN_translator.g:591:4: ( ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':' )
            	    // InternalBPMN_translator.g:592:5: ( (lv_head1_4_0= RULE_HEAD ) ) otherlv_5= ':'
            	    {
            	    // InternalBPMN_translator.g:592:5: ( (lv_head1_4_0= RULE_HEAD ) )
            	    // InternalBPMN_translator.g:593:6: (lv_head1_4_0= RULE_HEAD )
            	    {
            	    // InternalBPMN_translator.g:593:6: (lv_head1_4_0= RULE_HEAD )
            	    // InternalBPMN_translator.g:594:7: lv_head1_4_0= RULE_HEAD
            	    {
            	    lv_head1_4_0=(Token)match(input,RULE_HEAD,FOLLOW_16); 

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

            	    otherlv_5=(Token)match(input,23,FOLLOW_18); 

            	    					newLeafNode(otherlv_5, grammarAccess.getOpenAccess().getColonKeyword_4_0_1());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBPMN_translator.g:616:4: ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:616:4: ( ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:617:5: ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) )
            	    {
            	    // InternalBPMN_translator.g:617:5: ( ( (lv_head1_6_0= RULE_HEAD ) ) | ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==RULE_HEAD) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==RULE_KEYWORDS) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalBPMN_translator.g:618:6: ( (lv_head1_6_0= RULE_HEAD ) )
            	            {
            	            // InternalBPMN_translator.g:618:6: ( (lv_head1_6_0= RULE_HEAD ) )
            	            // InternalBPMN_translator.g:619:7: (lv_head1_6_0= RULE_HEAD )
            	            {
            	            // InternalBPMN_translator.g:619:7: (lv_head1_6_0= RULE_HEAD )
            	            // InternalBPMN_translator.g:620:8: lv_head1_6_0= RULE_HEAD
            	            {
            	            lv_head1_6_0=(Token)match(input,RULE_HEAD,FOLLOW_19); 

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
            	            // InternalBPMN_translator.g:637:6: ( (lv_keywords1_7_0= RULE_KEYWORDS ) )
            	            {
            	            // InternalBPMN_translator.g:637:6: ( (lv_keywords1_7_0= RULE_KEYWORDS ) )
            	            // InternalBPMN_translator.g:638:7: (lv_keywords1_7_0= RULE_KEYWORDS )
            	            {
            	            // InternalBPMN_translator.g:638:7: (lv_keywords1_7_0= RULE_KEYWORDS )
            	            // InternalBPMN_translator.g:639:8: lv_keywords1_7_0= RULE_KEYWORDS
            	            {
            	            lv_keywords1_7_0=(Token)match(input,RULE_KEYWORDS,FOLLOW_19); 

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
            	    				
            	    // InternalBPMN_translator.g:660:5: ( (lv_value_9_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:661:6: (lv_value_9_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:661:6: (lv_value_9_0= RULE_STRING )
            	    // InternalBPMN_translator.g:662:7: lv_value_9_0= RULE_STRING
            	    {
            	    lv_value_9_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

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
            	    break loop10;
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
    // InternalBPMN_translator.g:688:1: entryRuleSingleton returns [EObject current=null] : iv_ruleSingleton= ruleSingleton EOF ;
    public final EObject entryRuleSingleton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleton = null;


        try {
            // InternalBPMN_translator.g:688:50: (iv_ruleSingleton= ruleSingleton EOF )
            // InternalBPMN_translator.g:689:2: iv_ruleSingleton= ruleSingleton EOF
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
    // InternalBPMN_translator.g:695:1: ruleSingleton returns [EObject current=null] : ( () (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' ( (lv_keywords_4_0= RULE_KEYWORDS ) ) ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | ( ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* ) otherlv_10= '/>' ) ;
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
            // InternalBPMN_translator.g:701:2: ( ( () (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' ( (lv_keywords_4_0= RULE_KEYWORDS ) ) ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | ( ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* ) otherlv_10= '/>' ) )
            // InternalBPMN_translator.g:702:2: ( () (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' ( (lv_keywords_4_0= RULE_KEYWORDS ) ) ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | ( ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* ) otherlv_10= '/>' )
            {
            // InternalBPMN_translator.g:702:2: ( () (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' ( (lv_keywords_4_0= RULE_KEYWORDS ) ) ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | ( ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* ) otherlv_10= '/>' )
            // InternalBPMN_translator.g:703:3: () (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' ( (lv_keywords_4_0= RULE_KEYWORDS ) ) ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | ( ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* ) otherlv_10= '/>'
            {
            // InternalBPMN_translator.g:703:3: ()
            // InternalBPMN_translator.g:704:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSingletonAccess().getSingletonAction_0(),
            					current);
            			

            }

            // InternalBPMN_translator.g:710:3: (otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' ( (lv_keywords_4_0= RULE_KEYWORDS ) ) ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | ( ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )* )
            // InternalBPMN_translator.g:711:4: otherlv_1= '<' this_HEAD_2= RULE_HEAD otherlv_3= ':' ( (lv_keywords_4_0= RULE_KEYWORDS ) ) ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | ( ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )*
            {
            otherlv_1=(Token)match(input,22,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getSingletonAccess().getLessThanSignKeyword_1_0());
            			
            this_HEAD_2=(Token)match(input,RULE_HEAD,FOLLOW_16); 

            				newLeafNode(this_HEAD_2, grammarAccess.getSingletonAccess().getHEADTerminalRuleCall_1_1());
            			
            otherlv_3=(Token)match(input,23,FOLLOW_17); 

            				newLeafNode(otherlv_3, grammarAccess.getSingletonAccess().getColonKeyword_1_2());
            			
            // InternalBPMN_translator.g:723:4: ( (lv_keywords_4_0= RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:724:5: (lv_keywords_4_0= RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:724:5: (lv_keywords_4_0= RULE_KEYWORDS )
            // InternalBPMN_translator.g:725:6: lv_keywords_4_0= RULE_KEYWORDS
            {
            lv_keywords_4_0=(Token)match(input,RULE_KEYWORDS,FOLLOW_20); 

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

            // InternalBPMN_translator.g:741:4: ( (this_HEAD_5= RULE_HEAD otherlv_6= ':' ) | ( ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_HEAD) ) {
                    alt11=1;
                }
                else if ( (LA11_0==RULE_KEYWORDS) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBPMN_translator.g:742:5: (this_HEAD_5= RULE_HEAD otherlv_6= ':' )
            	    {
            	    // InternalBPMN_translator.g:742:5: (this_HEAD_5= RULE_HEAD otherlv_6= ':' )
            	    // InternalBPMN_translator.g:743:6: this_HEAD_5= RULE_HEAD otherlv_6= ':'
            	    {
            	    this_HEAD_5=(Token)match(input,RULE_HEAD,FOLLOW_16); 

            	    						newLeafNode(this_HEAD_5, grammarAccess.getSingletonAccess().getHEADTerminalRuleCall_1_4_0_0());
            	    					
            	    otherlv_6=(Token)match(input,23,FOLLOW_20); 

            	    						newLeafNode(otherlv_6, grammarAccess.getSingletonAccess().getColonKeyword_1_4_0_1());
            	    					

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBPMN_translator.g:753:5: ( ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:753:5: ( ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:754:6: ( (lv_keywords1_7_0= RULE_KEYWORDS ) ) otherlv_8= '=' ( (lv_value_9_0= RULE_STRING ) )
            	    {
            	    // InternalBPMN_translator.g:754:6: ( (lv_keywords1_7_0= RULE_KEYWORDS ) )
            	    // InternalBPMN_translator.g:755:7: (lv_keywords1_7_0= RULE_KEYWORDS )
            	    {
            	    // InternalBPMN_translator.g:755:7: (lv_keywords1_7_0= RULE_KEYWORDS )
            	    // InternalBPMN_translator.g:756:8: lv_keywords1_7_0= RULE_KEYWORDS
            	    {
            	    lv_keywords1_7_0=(Token)match(input,RULE_KEYWORDS,FOLLOW_19); 

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
            	    					
            	    // InternalBPMN_translator.g:776:6: ( (lv_value_9_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:777:7: (lv_value_9_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:777:7: (lv_value_9_0= RULE_STRING )
            	    // InternalBPMN_translator.g:778:8: lv_value_9_0= RULE_STRING
            	    {
            	    lv_value_9_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

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
            	    break loop11;
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
    // InternalBPMN_translator.g:805:1: entryRuleClose returns [EObject current=null] : iv_ruleClose= ruleClose EOF ;
    public final EObject entryRuleClose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClose = null;


        try {
            // InternalBPMN_translator.g:805:46: (iv_ruleClose= ruleClose EOF )
            // InternalBPMN_translator.g:806:2: iv_ruleClose= ruleClose EOF
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
    // InternalBPMN_translator.g:812:1: ruleClose returns [EObject current=null] : ( () (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' ) ) ;
    public final EObject ruleClose() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_HEAD_2=null;
        Token otherlv_3=null;
        Token this_KEYWORDS_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalBPMN_translator.g:818:2: ( ( () (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' ) ) )
            // InternalBPMN_translator.g:819:2: ( () (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' ) )
            {
            // InternalBPMN_translator.g:819:2: ( () (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' ) )
            // InternalBPMN_translator.g:820:3: () (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' )
            {
            // InternalBPMN_translator.g:820:3: ()
            // InternalBPMN_translator.g:821:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCloseAccess().getCloseAction_0(),
            					current);
            			

            }

            // InternalBPMN_translator.g:827:3: (otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>' )
            // InternalBPMN_translator.g:828:4: otherlv_1= '</' this_HEAD_2= RULE_HEAD otherlv_3= ':' this_KEYWORDS_4= RULE_KEYWORDS otherlv_5= '>'
            {
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getCloseAccess().getLessThanSignSolidusKeyword_1_0());
            			
            this_HEAD_2=(Token)match(input,RULE_HEAD,FOLLOW_16); 

            				newLeafNode(this_HEAD_2, grammarAccess.getCloseAccess().getHEADTerminalRuleCall_1_1());
            			
            otherlv_3=(Token)match(input,23,FOLLOW_17); 

            				newLeafNode(otherlv_3, grammarAccess.getCloseAccess().getColonKeyword_1_2());
            			
            this_KEYWORDS_4=(Token)match(input,RULE_KEYWORDS,FOLLOW_21); 

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
    // InternalBPMN_translator.g:853:1: entryRulevariables returns [String current=null] : iv_rulevariables= rulevariables EOF ;
    public final String entryRulevariables() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariables = null;


        try {
            // InternalBPMN_translator.g:853:49: (iv_rulevariables= rulevariables EOF )
            // InternalBPMN_translator.g:854:2: iv_rulevariables= rulevariables EOF
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
    // InternalBPMN_translator.g:860:1: rulevariables returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'TEMPERATURE' kw= '[' this_BODY_2= RULE_BODY kw= ',' this_BODY_4= RULE_BODY kw= ']' ) | (kw= 'DISTANCE' kw= '[' this_BODY_8= RULE_BODY kw= ',' this_BODY_10= RULE_BODY kw= ']' ) | (this_BODY_12= RULE_BODY kw= '[' this_BODY_14= RULE_BODY kw= ']' ) ) ;
    public final AntlrDatatypeRuleToken rulevariables() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_BODY_2=null;
        Token this_BODY_4=null;
        Token this_BODY_8=null;
        Token this_BODY_10=null;
        Token this_BODY_12=null;
        Token this_BODY_14=null;


        	enterRule();

        try {
            // InternalBPMN_translator.g:866:2: ( ( (kw= 'TEMPERATURE' kw= '[' this_BODY_2= RULE_BODY kw= ',' this_BODY_4= RULE_BODY kw= ']' ) | (kw= 'DISTANCE' kw= '[' this_BODY_8= RULE_BODY kw= ',' this_BODY_10= RULE_BODY kw= ']' ) | (this_BODY_12= RULE_BODY kw= '[' this_BODY_14= RULE_BODY kw= ']' ) ) )
            // InternalBPMN_translator.g:867:2: ( (kw= 'TEMPERATURE' kw= '[' this_BODY_2= RULE_BODY kw= ',' this_BODY_4= RULE_BODY kw= ']' ) | (kw= 'DISTANCE' kw= '[' this_BODY_8= RULE_BODY kw= ',' this_BODY_10= RULE_BODY kw= ']' ) | (this_BODY_12= RULE_BODY kw= '[' this_BODY_14= RULE_BODY kw= ']' ) )
            {
            // InternalBPMN_translator.g:867:2: ( (kw= 'TEMPERATURE' kw= '[' this_BODY_2= RULE_BODY kw= ',' this_BODY_4= RULE_BODY kw= ']' ) | (kw= 'DISTANCE' kw= '[' this_BODY_8= RULE_BODY kw= ',' this_BODY_10= RULE_BODY kw= ']' ) | (this_BODY_12= RULE_BODY kw= '[' this_BODY_14= RULE_BODY kw= ']' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt12=1;
                }
                break;
            case 32:
                {
                alt12=2;
                }
                break;
            case RULE_BODY:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalBPMN_translator.g:868:3: (kw= 'TEMPERATURE' kw= '[' this_BODY_2= RULE_BODY kw= ',' this_BODY_4= RULE_BODY kw= ']' )
                    {
                    // InternalBPMN_translator.g:868:3: (kw= 'TEMPERATURE' kw= '[' this_BODY_2= RULE_BODY kw= ',' this_BODY_4= RULE_BODY kw= ']' )
                    // InternalBPMN_translator.g:869:4: kw= 'TEMPERATURE' kw= '[' this_BODY_2= RULE_BODY kw= ',' this_BODY_4= RULE_BODY kw= ']'
                    {
                    kw=(Token)match(input,28,FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getVariablesAccess().getTEMPERATUREKeyword_0_0());
                    			
                    kw=(Token)match(input,29,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getVariablesAccess().getLeftSquareBracketKeyword_0_1());
                    			
                    this_BODY_2=(Token)match(input,RULE_BODY,FOLLOW_24); 

                    				current.merge(this_BODY_2);
                    			

                    				newLeafNode(this_BODY_2, grammarAccess.getVariablesAccess().getBODYTerminalRuleCall_0_2());
                    			
                    kw=(Token)match(input,30,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getVariablesAccess().getCommaKeyword_0_3());
                    			
                    this_BODY_4=(Token)match(input,RULE_BODY,FOLLOW_25); 

                    				current.merge(this_BODY_4);
                    			

                    				newLeafNode(this_BODY_4, grammarAccess.getVariablesAccess().getBODYTerminalRuleCall_0_4());
                    			
                    kw=(Token)match(input,31,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getVariablesAccess().getRightSquareBracketKeyword_0_5());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:905:3: (kw= 'DISTANCE' kw= '[' this_BODY_8= RULE_BODY kw= ',' this_BODY_10= RULE_BODY kw= ']' )
                    {
                    // InternalBPMN_translator.g:905:3: (kw= 'DISTANCE' kw= '[' this_BODY_8= RULE_BODY kw= ',' this_BODY_10= RULE_BODY kw= ']' )
                    // InternalBPMN_translator.g:906:4: kw= 'DISTANCE' kw= '[' this_BODY_8= RULE_BODY kw= ',' this_BODY_10= RULE_BODY kw= ']'
                    {
                    kw=(Token)match(input,32,FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getVariablesAccess().getDISTANCEKeyword_1_0());
                    			
                    kw=(Token)match(input,29,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getVariablesAccess().getLeftSquareBracketKeyword_1_1());
                    			
                    this_BODY_8=(Token)match(input,RULE_BODY,FOLLOW_24); 

                    				current.merge(this_BODY_8);
                    			

                    				newLeafNode(this_BODY_8, grammarAccess.getVariablesAccess().getBODYTerminalRuleCall_1_2());
                    			
                    kw=(Token)match(input,30,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getVariablesAccess().getCommaKeyword_1_3());
                    			
                    this_BODY_10=(Token)match(input,RULE_BODY,FOLLOW_25); 

                    				current.merge(this_BODY_10);
                    			

                    				newLeafNode(this_BODY_10, grammarAccess.getVariablesAccess().getBODYTerminalRuleCall_1_4());
                    			
                    kw=(Token)match(input,31,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getVariablesAccess().getRightSquareBracketKeyword_1_5());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBPMN_translator.g:942:3: (this_BODY_12= RULE_BODY kw= '[' this_BODY_14= RULE_BODY kw= ']' )
                    {
                    // InternalBPMN_translator.g:942:3: (this_BODY_12= RULE_BODY kw= '[' this_BODY_14= RULE_BODY kw= ']' )
                    // InternalBPMN_translator.g:943:4: this_BODY_12= RULE_BODY kw= '[' this_BODY_14= RULE_BODY kw= ']'
                    {
                    this_BODY_12=(Token)match(input,RULE_BODY,FOLLOW_22); 

                    				current.merge(this_BODY_12);
                    			

                    				newLeafNode(this_BODY_12, grammarAccess.getVariablesAccess().getBODYTerminalRuleCall_2_0());
                    			
                    kw=(Token)match(input,29,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getVariablesAccess().getLeftSquareBracketKeyword_2_1());
                    			
                    this_BODY_14=(Token)match(input,RULE_BODY,FOLLOW_25); 

                    				current.merge(this_BODY_14);
                    			

                    				newLeafNode(this_BODY_14, grammarAccess.getVariablesAccess().getBODYTerminalRuleCall_2_2());
                    			
                    kw=(Token)match(input,31,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getVariablesAccess().getRightSquareBracketKeyword_2_3());
                    			

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
    // $ANTLR end "rulevariables"


    // $ANTLR start "entryRuleconditions"
    // InternalBPMN_translator.g:972:1: entryRuleconditions returns [String current=null] : iv_ruleconditions= ruleconditions EOF ;
    public final String entryRuleconditions() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconditions = null;


        try {
            // InternalBPMN_translator.g:972:50: (iv_ruleconditions= ruleconditions EOF )
            // InternalBPMN_translator.g:973:2: iv_ruleconditions= ruleconditions EOF
            {
             newCompositeNode(grammarAccess.getConditionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconditions=ruleconditions();

            state._fsp--;

             current =iv_ruleconditions.getText(); 
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
    // $ANTLR end "entryRuleconditions"


    // $ANTLR start "ruleconditions"
    // InternalBPMN_translator.g:979:1: ruleconditions returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&lt;' | kw= '&le;' | kw= '&ge;' | kw= '&gt;' | kw= '=' | kw= '&amp;' | kw= '||' | kw= ')' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleconditions() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBPMN_translator.g:985:2: ( (kw= '&lt;' | kw= '&le;' | kw= '&ge;' | kw= '&gt;' | kw= '=' | kw= '&amp;' | kw= '||' | kw= ')' | kw= '!=' ) )
            // InternalBPMN_translator.g:986:2: (kw= '&lt;' | kw= '&le;' | kw= '&ge;' | kw= '&gt;' | kw= '=' | kw= '&amp;' | kw= '||' | kw= ')' | kw= '!=' )
            {
            // InternalBPMN_translator.g:986:2: (kw= '&lt;' | kw= '&le;' | kw= '&ge;' | kw= '&gt;' | kw= '=' | kw= '&amp;' | kw= '||' | kw= ')' | kw= '!=' )
            int alt13=9;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt13=1;
                }
                break;
            case 34:
                {
                alt13=2;
                }
                break;
            case 35:
                {
                alt13=3;
                }
                break;
            case 36:
                {
                alt13=4;
                }
                break;
            case 24:
                {
                alt13=5;
                }
                break;
            case 37:
                {
                alt13=6;
                }
                break;
            case 38:
                {
                alt13=7;
                }
                break;
            case 39:
                {
                alt13=8;
                }
                break;
            case 40:
                {
                alt13=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalBPMN_translator.g:987:3: kw= '&lt;'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConditionsAccess().getLtKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:993:3: kw= '&le;'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConditionsAccess().getLeKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBPMN_translator.g:999:3: kw= '&ge;'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConditionsAccess().getGeKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBPMN_translator.g:1005:3: kw= '&gt;'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConditionsAccess().getGtKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalBPMN_translator.g:1011:3: kw= '='
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConditionsAccess().getEqualsSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalBPMN_translator.g:1017:3: kw= '&amp;'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConditionsAccess().getAmpKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalBPMN_translator.g:1023:3: kw= '||'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConditionsAccess().getVerticalLineVerticalLineKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalBPMN_translator.g:1029:3: kw= ')'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConditionsAccess().getRightParenthesisKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalBPMN_translator.g:1035:3: kw= '!='
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConditionsAccess().getExclamationMarkEqualsSignKeyword_8());
                    		

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
    // $ANTLR end "ruleconditions"


    // $ANTLR start "entryRulepreconditions"
    // InternalBPMN_translator.g:1044:1: entryRulepreconditions returns [String current=null] : iv_rulepreconditions= rulepreconditions EOF ;
    public final String entryRulepreconditions() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepreconditions = null;


        try {
            // InternalBPMN_translator.g:1044:53: (iv_rulepreconditions= rulepreconditions EOF )
            // InternalBPMN_translator.g:1045:2: iv_rulepreconditions= rulepreconditions EOF
            {
             newCompositeNode(grammarAccess.getPreconditionsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepreconditions=rulepreconditions();

            state._fsp--;

             current =iv_rulepreconditions.getText(); 
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
    // $ANTLR end "entryRulepreconditions"


    // $ANTLR start "rulepreconditions"
    // InternalBPMN_translator.g:1051:1: rulepreconditions returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '(' ) ;
    public final AntlrDatatypeRuleToken rulepreconditions() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBPMN_translator.g:1057:2: ( (kw= '!' | kw= '(' ) )
            // InternalBPMN_translator.g:1058:2: (kw= '!' | kw= '(' )
            {
            // InternalBPMN_translator.g:1058:2: (kw= '!' | kw= '(' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) ) {
                alt14=1;
            }
            else if ( (LA14_0==42) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalBPMN_translator.g:1059:3: kw= '!'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPreconditionsAccess().getExclamationMarkKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:1065:3: kw= '('
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPreconditionsAccess().getLeftParenthesisKeyword_1());
                    		

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
    // $ANTLR end "rulepreconditions"


    // $ANTLR start "entryRulecodex"
    // InternalBPMN_translator.g:1074:1: entryRulecodex returns [EObject current=null] : iv_rulecodex= rulecodex EOF ;
    public final EObject entryRulecodex() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecodex = null;


        try {
            // InternalBPMN_translator.g:1074:46: (iv_rulecodex= rulecodex EOF )
            // InternalBPMN_translator.g:1075:2: iv_rulecodex= rulecodex EOF
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
    // InternalBPMN_translator.g:1081:1: rulecodex returns [EObject current=null] : ( ( (lv_device_code_0_0= ruledevice ) ) ( (lv_protocol_1_0= ruleprotocol ) )* ( (lv_sensor_code_2_0= rulesensor ) )* ) ;
    public final EObject rulecodex() throws RecognitionException {
        EObject current = null;

        EObject lv_device_code_0_0 = null;

        EObject lv_protocol_1_0 = null;

        EObject lv_sensor_code_2_0 = null;



        	enterRule();

        try {
            // InternalBPMN_translator.g:1087:2: ( ( ( (lv_device_code_0_0= ruledevice ) ) ( (lv_protocol_1_0= ruleprotocol ) )* ( (lv_sensor_code_2_0= rulesensor ) )* ) )
            // InternalBPMN_translator.g:1088:2: ( ( (lv_device_code_0_0= ruledevice ) ) ( (lv_protocol_1_0= ruleprotocol ) )* ( (lv_sensor_code_2_0= rulesensor ) )* )
            {
            // InternalBPMN_translator.g:1088:2: ( ( (lv_device_code_0_0= ruledevice ) ) ( (lv_protocol_1_0= ruleprotocol ) )* ( (lv_sensor_code_2_0= rulesensor ) )* )
            // InternalBPMN_translator.g:1089:3: ( (lv_device_code_0_0= ruledevice ) ) ( (lv_protocol_1_0= ruleprotocol ) )* ( (lv_sensor_code_2_0= rulesensor ) )*
            {
            // InternalBPMN_translator.g:1089:3: ( (lv_device_code_0_0= ruledevice ) )
            // InternalBPMN_translator.g:1090:4: (lv_device_code_0_0= ruledevice )
            {
            // InternalBPMN_translator.g:1090:4: (lv_device_code_0_0= ruledevice )
            // InternalBPMN_translator.g:1091:5: lv_device_code_0_0= ruledevice
            {

            					newCompositeNode(grammarAccess.getCodexAccess().getDevice_codeDeviceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalBPMN_translator.g:1108:3: ( (lv_protocol_1_0= ruleprotocol ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=45 && LA15_0<=46)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBPMN_translator.g:1109:4: (lv_protocol_1_0= ruleprotocol )
            	    {
            	    // InternalBPMN_translator.g:1109:4: (lv_protocol_1_0= ruleprotocol )
            	    // InternalBPMN_translator.g:1110:5: lv_protocol_1_0= ruleprotocol
            	    {

            	    					newCompositeNode(grammarAccess.getCodexAccess().getProtocolProtocolParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_26);
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
            	    break loop15;
                }
            } while (true);

            // InternalBPMN_translator.g:1127:3: ( (lv_sensor_code_2_0= rulesensor ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==28||LA16_0==32) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBPMN_translator.g:1128:4: (lv_sensor_code_2_0= rulesensor )
            	    {
            	    // InternalBPMN_translator.g:1128:4: (lv_sensor_code_2_0= rulesensor )
            	    // InternalBPMN_translator.g:1129:5: lv_sensor_code_2_0= rulesensor
            	    {

            	    					newCompositeNode(grammarAccess.getCodexAccess().getSensor_codeSensorParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_27);
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
            	    break loop16;
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
    // InternalBPMN_translator.g:1150:1: entryRuledevice returns [EObject current=null] : iv_ruledevice= ruledevice EOF ;
    public final EObject entryRuledevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledevice = null;


        try {
            // InternalBPMN_translator.g:1150:47: (iv_ruledevice= ruledevice EOF )
            // InternalBPMN_translator.g:1151:2: iv_ruledevice= ruledevice EOF
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
    // InternalBPMN_translator.g:1157:1: ruledevice returns [EObject current=null] : (otherlv_0= 'DEVICE' otherlv_1= ':' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'NAMEID' otherlv_4= ':' ( (lv_id_5_0= RULE_STRING ) ) ) ;
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
            // InternalBPMN_translator.g:1163:2: ( (otherlv_0= 'DEVICE' otherlv_1= ':' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'NAMEID' otherlv_4= ':' ( (lv_id_5_0= RULE_STRING ) ) ) )
            // InternalBPMN_translator.g:1164:2: (otherlv_0= 'DEVICE' otherlv_1= ':' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'NAMEID' otherlv_4= ':' ( (lv_id_5_0= RULE_STRING ) ) )
            {
            // InternalBPMN_translator.g:1164:2: (otherlv_0= 'DEVICE' otherlv_1= ':' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'NAMEID' otherlv_4= ':' ( (lv_id_5_0= RULE_STRING ) ) )
            // InternalBPMN_translator.g:1165:3: otherlv_0= 'DEVICE' otherlv_1= ':' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'NAMEID' otherlv_4= ':' ( (lv_id_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getDeviceAccess().getDEVICEKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDeviceAccess().getColonKeyword_1());
            		
            // InternalBPMN_translator.g:1173:3: ( (lv_device_2_0= RULE_STRING ) )
            // InternalBPMN_translator.g:1174:4: (lv_device_2_0= RULE_STRING )
            {
            // InternalBPMN_translator.g:1174:4: (lv_device_2_0= RULE_STRING )
            // InternalBPMN_translator.g:1175:5: lv_device_2_0= RULE_STRING
            {
            lv_device_2_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

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

            otherlv_3=(Token)match(input,44,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getDeviceAccess().getNAMEIDKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getDeviceAccess().getColonKeyword_4());
            		
            // InternalBPMN_translator.g:1199:3: ( (lv_id_5_0= RULE_STRING ) )
            // InternalBPMN_translator.g:1200:4: (lv_id_5_0= RULE_STRING )
            {
            // InternalBPMN_translator.g:1200:4: (lv_id_5_0= RULE_STRING )
            // InternalBPMN_translator.g:1201:5: lv_id_5_0= RULE_STRING
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
    // InternalBPMN_translator.g:1221:1: entryRuleprotocol returns [EObject current=null] : iv_ruleprotocol= ruleprotocol EOF ;
    public final EObject entryRuleprotocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprotocol = null;


        try {
            // InternalBPMN_translator.g:1221:49: (iv_ruleprotocol= ruleprotocol EOF )
            // InternalBPMN_translator.g:1222:2: iv_ruleprotocol= ruleprotocol EOF
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
    // InternalBPMN_translator.g:1228:1: ruleprotocol returns [EObject current=null] : ( ( ( (lv_pname_0_0= 'MQTT' ) ) otherlv_1= '{' ( ( (lv_mqtt_data_2_0= rulemqtt_data ) ) ( (lv_mqtt_device_3_0= ruleprotocol_device ) ) ) otherlv_4= '}' ) | ( ( (lv_pname_5_0= 'HTTP' ) ) otherlv_6= '{' ( ( (lv_http_data_7_0= rulehttp_data ) ) ( (lv_http_device_8_0= ruleprotocol_device ) ) ) otherlv_9= '}' ) ) ;
    public final EObject ruleprotocol() throws RecognitionException {
        EObject current = null;

        Token lv_pname_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token lv_pname_5_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_mqtt_data_2_0 = null;

        EObject lv_mqtt_device_3_0 = null;

        EObject lv_http_data_7_0 = null;

        EObject lv_http_device_8_0 = null;



        	enterRule();

        try {
            // InternalBPMN_translator.g:1234:2: ( ( ( ( (lv_pname_0_0= 'MQTT' ) ) otherlv_1= '{' ( ( (lv_mqtt_data_2_0= rulemqtt_data ) ) ( (lv_mqtt_device_3_0= ruleprotocol_device ) ) ) otherlv_4= '}' ) | ( ( (lv_pname_5_0= 'HTTP' ) ) otherlv_6= '{' ( ( (lv_http_data_7_0= rulehttp_data ) ) ( (lv_http_device_8_0= ruleprotocol_device ) ) ) otherlv_9= '}' ) ) )
            // InternalBPMN_translator.g:1235:2: ( ( ( (lv_pname_0_0= 'MQTT' ) ) otherlv_1= '{' ( ( (lv_mqtt_data_2_0= rulemqtt_data ) ) ( (lv_mqtt_device_3_0= ruleprotocol_device ) ) ) otherlv_4= '}' ) | ( ( (lv_pname_5_0= 'HTTP' ) ) otherlv_6= '{' ( ( (lv_http_data_7_0= rulehttp_data ) ) ( (lv_http_device_8_0= ruleprotocol_device ) ) ) otherlv_9= '}' ) )
            {
            // InternalBPMN_translator.g:1235:2: ( ( ( (lv_pname_0_0= 'MQTT' ) ) otherlv_1= '{' ( ( (lv_mqtt_data_2_0= rulemqtt_data ) ) ( (lv_mqtt_device_3_0= ruleprotocol_device ) ) ) otherlv_4= '}' ) | ( ( (lv_pname_5_0= 'HTTP' ) ) otherlv_6= '{' ( ( (lv_http_data_7_0= rulehttp_data ) ) ( (lv_http_device_8_0= ruleprotocol_device ) ) ) otherlv_9= '}' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==45) ) {
                alt17=1;
            }
            else if ( (LA17_0==46) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalBPMN_translator.g:1236:3: ( ( (lv_pname_0_0= 'MQTT' ) ) otherlv_1= '{' ( ( (lv_mqtt_data_2_0= rulemqtt_data ) ) ( (lv_mqtt_device_3_0= ruleprotocol_device ) ) ) otherlv_4= '}' )
                    {
                    // InternalBPMN_translator.g:1236:3: ( ( (lv_pname_0_0= 'MQTT' ) ) otherlv_1= '{' ( ( (lv_mqtt_data_2_0= rulemqtt_data ) ) ( (lv_mqtt_device_3_0= ruleprotocol_device ) ) ) otherlv_4= '}' )
                    // InternalBPMN_translator.g:1237:4: ( (lv_pname_0_0= 'MQTT' ) ) otherlv_1= '{' ( ( (lv_mqtt_data_2_0= rulemqtt_data ) ) ( (lv_mqtt_device_3_0= ruleprotocol_device ) ) ) otherlv_4= '}'
                    {
                    // InternalBPMN_translator.g:1237:4: ( (lv_pname_0_0= 'MQTT' ) )
                    // InternalBPMN_translator.g:1238:5: (lv_pname_0_0= 'MQTT' )
                    {
                    // InternalBPMN_translator.g:1238:5: (lv_pname_0_0= 'MQTT' )
                    // InternalBPMN_translator.g:1239:6: lv_pname_0_0= 'MQTT'
                    {
                    lv_pname_0_0=(Token)match(input,45,FOLLOW_10); 

                    						newLeafNode(lv_pname_0_0, grammarAccess.getProtocolAccess().getPnameMQTTKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProtocolRule());
                    						}
                    						addWithLastConsumed(current, "pname", lv_pname_0_0, "MQTT");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_29); 

                    				newLeafNode(otherlv_1, grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_0_1());
                    			
                    // InternalBPMN_translator.g:1255:4: ( ( (lv_mqtt_data_2_0= rulemqtt_data ) ) ( (lv_mqtt_device_3_0= ruleprotocol_device ) ) )
                    // InternalBPMN_translator.g:1256:5: ( (lv_mqtt_data_2_0= rulemqtt_data ) ) ( (lv_mqtt_device_3_0= ruleprotocol_device ) )
                    {
                    // InternalBPMN_translator.g:1256:5: ( (lv_mqtt_data_2_0= rulemqtt_data ) )
                    // InternalBPMN_translator.g:1257:6: (lv_mqtt_data_2_0= rulemqtt_data )
                    {
                    // InternalBPMN_translator.g:1257:6: (lv_mqtt_data_2_0= rulemqtt_data )
                    // InternalBPMN_translator.g:1258:7: lv_mqtt_data_2_0= rulemqtt_data
                    {

                    							newCompositeNode(grammarAccess.getProtocolAccess().getMqtt_dataMqtt_dataParserRuleCall_0_2_0_0());
                    						
                    pushFollow(FOLLOW_29);
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

                    // InternalBPMN_translator.g:1275:5: ( (lv_mqtt_device_3_0= ruleprotocol_device ) )
                    // InternalBPMN_translator.g:1276:6: (lv_mqtt_device_3_0= ruleprotocol_device )
                    {
                    // InternalBPMN_translator.g:1276:6: (lv_mqtt_device_3_0= ruleprotocol_device )
                    // InternalBPMN_translator.g:1277:7: lv_mqtt_device_3_0= ruleprotocol_device
                    {

                    							newCompositeNode(grammarAccess.getProtocolAccess().getMqtt_deviceProtocol_deviceParserRuleCall_0_2_1_0());
                    						
                    pushFollow(FOLLOW_12);
                    lv_mqtt_device_3_0=ruleprotocol_device();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getProtocolRule());
                    							}
                    							add(
                    								current,
                    								"mqtt_device",
                    								lv_mqtt_device_3_0,
                    								"org.xtext.BPMN_translator.protocol_device");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:1301:3: ( ( (lv_pname_5_0= 'HTTP' ) ) otherlv_6= '{' ( ( (lv_http_data_7_0= rulehttp_data ) ) ( (lv_http_device_8_0= ruleprotocol_device ) ) ) otherlv_9= '}' )
                    {
                    // InternalBPMN_translator.g:1301:3: ( ( (lv_pname_5_0= 'HTTP' ) ) otherlv_6= '{' ( ( (lv_http_data_7_0= rulehttp_data ) ) ( (lv_http_device_8_0= ruleprotocol_device ) ) ) otherlv_9= '}' )
                    // InternalBPMN_translator.g:1302:4: ( (lv_pname_5_0= 'HTTP' ) ) otherlv_6= '{' ( ( (lv_http_data_7_0= rulehttp_data ) ) ( (lv_http_device_8_0= ruleprotocol_device ) ) ) otherlv_9= '}'
                    {
                    // InternalBPMN_translator.g:1302:4: ( (lv_pname_5_0= 'HTTP' ) )
                    // InternalBPMN_translator.g:1303:5: (lv_pname_5_0= 'HTTP' )
                    {
                    // InternalBPMN_translator.g:1303:5: (lv_pname_5_0= 'HTTP' )
                    // InternalBPMN_translator.g:1304:6: lv_pname_5_0= 'HTTP'
                    {
                    lv_pname_5_0=(Token)match(input,46,FOLLOW_10); 

                    						newLeafNode(lv_pname_5_0, grammarAccess.getProtocolAccess().getPnameHTTPKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProtocolRule());
                    						}
                    						addWithLastConsumed(current, "pname", lv_pname_5_0, "HTTP");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,20,FOLLOW_30); 

                    				newLeafNode(otherlv_6, grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_1_1());
                    			
                    // InternalBPMN_translator.g:1320:4: ( ( (lv_http_data_7_0= rulehttp_data ) ) ( (lv_http_device_8_0= ruleprotocol_device ) ) )
                    // InternalBPMN_translator.g:1321:5: ( (lv_http_data_7_0= rulehttp_data ) ) ( (lv_http_device_8_0= ruleprotocol_device ) )
                    {
                    // InternalBPMN_translator.g:1321:5: ( (lv_http_data_7_0= rulehttp_data ) )
                    // InternalBPMN_translator.g:1322:6: (lv_http_data_7_0= rulehttp_data )
                    {
                    // InternalBPMN_translator.g:1322:6: (lv_http_data_7_0= rulehttp_data )
                    // InternalBPMN_translator.g:1323:7: lv_http_data_7_0= rulehttp_data
                    {

                    							newCompositeNode(grammarAccess.getProtocolAccess().getHttp_dataHttp_dataParserRuleCall_1_2_0_0());
                    						
                    pushFollow(FOLLOW_29);
                    lv_http_data_7_0=rulehttp_data();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getProtocolRule());
                    							}
                    							add(
                    								current,
                    								"http_data",
                    								lv_http_data_7_0,
                    								"org.xtext.BPMN_translator.http_data");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalBPMN_translator.g:1340:5: ( (lv_http_device_8_0= ruleprotocol_device ) )
                    // InternalBPMN_translator.g:1341:6: (lv_http_device_8_0= ruleprotocol_device )
                    {
                    // InternalBPMN_translator.g:1341:6: (lv_http_device_8_0= ruleprotocol_device )
                    // InternalBPMN_translator.g:1342:7: lv_http_device_8_0= ruleprotocol_device
                    {

                    							newCompositeNode(grammarAccess.getProtocolAccess().getHttp_deviceProtocol_deviceParserRuleCall_1_2_1_0());
                    						
                    pushFollow(FOLLOW_12);
                    lv_http_device_8_0=ruleprotocol_device();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getProtocolRule());
                    							}
                    							add(
                    								current,
                    								"http_device",
                    								lv_http_device_8_0,
                    								"org.xtext.BPMN_translator.protocol_device");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    otherlv_9=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_1_3());
                    			

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
    // $ANTLR end "ruleprotocol"


    // $ANTLR start "entryRulehttp_data"
    // InternalBPMN_translator.g:1369:1: entryRulehttp_data returns [EObject current=null] : iv_rulehttp_data= rulehttp_data EOF ;
    public final EObject entryRulehttp_data() throws RecognitionException {
        EObject current = null;

        EObject iv_rulehttp_data = null;


        try {
            // InternalBPMN_translator.g:1369:50: (iv_rulehttp_data= rulehttp_data EOF )
            // InternalBPMN_translator.g:1370:2: iv_rulehttp_data= rulehttp_data EOF
            {
             newCompositeNode(grammarAccess.getHttp_dataRule()); 
            pushFollow(FOLLOW_1);
            iv_rulehttp_data=rulehttp_data();

            state._fsp--;

             current =iv_rulehttp_data; 
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
    // $ANTLR end "entryRulehttp_data"


    // $ANTLR start "rulehttp_data"
    // InternalBPMN_translator.g:1376:1: rulehttp_data returns [EObject current=null] : ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'SERVER_IP' otherlv_5= '=' ( (lv_server_ip_6_0= RULE_STRING ) ) ) | (otherlv_7= 'REQUEST_TYPE' otherlv_8= '=' ( (lv_request_type_9_0= RULE_STRING ) ) ) | (otherlv_10= 'CONTENT_TYPE' otherlv_11= '=' ( (lv_content_type_12_0= RULE_STRING ) ) ) | (otherlv_13= 'HEADER' otherlv_14= '=' ( (lv_header_15_0= RULE_STRING ) ) ) | (otherlv_16= 'DATA' otherlv_17= '=' ( (lv_data_18_0= RULE_STRING ) ) ) | (otherlv_19= 'NETWORK' otherlv_20= '{' ( (lv_mqtt_network_data_21_0= rulemqtt_network_data ) )* otherlv_22= '}' ) )* ) ;
    public final EObject rulehttp_data() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_pname_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_server_ip_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_request_type_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_content_type_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_header_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_data_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject lv_mqtt_network_data_21_0 = null;



        	enterRule();

        try {
            // InternalBPMN_translator.g:1382:2: ( ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'SERVER_IP' otherlv_5= '=' ( (lv_server_ip_6_0= RULE_STRING ) ) ) | (otherlv_7= 'REQUEST_TYPE' otherlv_8= '=' ( (lv_request_type_9_0= RULE_STRING ) ) ) | (otherlv_10= 'CONTENT_TYPE' otherlv_11= '=' ( (lv_content_type_12_0= RULE_STRING ) ) ) | (otherlv_13= 'HEADER' otherlv_14= '=' ( (lv_header_15_0= RULE_STRING ) ) ) | (otherlv_16= 'DATA' otherlv_17= '=' ( (lv_data_18_0= RULE_STRING ) ) ) | (otherlv_19= 'NETWORK' otherlv_20= '{' ( (lv_mqtt_network_data_21_0= rulemqtt_network_data ) )* otherlv_22= '}' ) )* ) )
            // InternalBPMN_translator.g:1383:2: ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'SERVER_IP' otherlv_5= '=' ( (lv_server_ip_6_0= RULE_STRING ) ) ) | (otherlv_7= 'REQUEST_TYPE' otherlv_8= '=' ( (lv_request_type_9_0= RULE_STRING ) ) ) | (otherlv_10= 'CONTENT_TYPE' otherlv_11= '=' ( (lv_content_type_12_0= RULE_STRING ) ) ) | (otherlv_13= 'HEADER' otherlv_14= '=' ( (lv_header_15_0= RULE_STRING ) ) ) | (otherlv_16= 'DATA' otherlv_17= '=' ( (lv_data_18_0= RULE_STRING ) ) ) | (otherlv_19= 'NETWORK' otherlv_20= '{' ( (lv_mqtt_network_data_21_0= rulemqtt_network_data ) )* otherlv_22= '}' ) )* )
            {
            // InternalBPMN_translator.g:1383:2: ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'SERVER_IP' otherlv_5= '=' ( (lv_server_ip_6_0= RULE_STRING ) ) ) | (otherlv_7= 'REQUEST_TYPE' otherlv_8= '=' ( (lv_request_type_9_0= RULE_STRING ) ) ) | (otherlv_10= 'CONTENT_TYPE' otherlv_11= '=' ( (lv_content_type_12_0= RULE_STRING ) ) ) | (otherlv_13= 'HEADER' otherlv_14= '=' ( (lv_header_15_0= RULE_STRING ) ) ) | (otherlv_16= 'DATA' otherlv_17= '=' ( (lv_data_18_0= RULE_STRING ) ) ) | (otherlv_19= 'NETWORK' otherlv_20= '{' ( (lv_mqtt_network_data_21_0= rulemqtt_network_data ) )* otherlv_22= '}' ) )* )
            // InternalBPMN_translator.g:1384:3: () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'SERVER_IP' otherlv_5= '=' ( (lv_server_ip_6_0= RULE_STRING ) ) ) | (otherlv_7= 'REQUEST_TYPE' otherlv_8= '=' ( (lv_request_type_9_0= RULE_STRING ) ) ) | (otherlv_10= 'CONTENT_TYPE' otherlv_11= '=' ( (lv_content_type_12_0= RULE_STRING ) ) ) | (otherlv_13= 'HEADER' otherlv_14= '=' ( (lv_header_15_0= RULE_STRING ) ) ) | (otherlv_16= 'DATA' otherlv_17= '=' ( (lv_data_18_0= RULE_STRING ) ) ) | (otherlv_19= 'NETWORK' otherlv_20= '{' ( (lv_mqtt_network_data_21_0= rulemqtt_network_data ) )* otherlv_22= '}' ) )*
            {
            // InternalBPMN_translator.g:1384:3: ()
            // InternalBPMN_translator.g:1385:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHttp_dataAccess().getHttp_dataAction_0(),
            					current);
            			

            }

            // InternalBPMN_translator.g:1391:3: ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'SERVER_IP' otherlv_5= '=' ( (lv_server_ip_6_0= RULE_STRING ) ) ) | (otherlv_7= 'REQUEST_TYPE' otherlv_8= '=' ( (lv_request_type_9_0= RULE_STRING ) ) ) | (otherlv_10= 'CONTENT_TYPE' otherlv_11= '=' ( (lv_content_type_12_0= RULE_STRING ) ) ) | (otherlv_13= 'HEADER' otherlv_14= '=' ( (lv_header_15_0= RULE_STRING ) ) ) | (otherlv_16= 'DATA' otherlv_17= '=' ( (lv_data_18_0= RULE_STRING ) ) ) | (otherlv_19= 'NETWORK' otherlv_20= '{' ( (lv_mqtt_network_data_21_0= rulemqtt_network_data ) )* otherlv_22= '}' ) )*
            loop19:
            do {
                int alt19=8;
                switch ( input.LA(1) ) {
                case 47:
                    {
                    alt19=1;
                    }
                    break;
                case 48:
                    {
                    alt19=2;
                    }
                    break;
                case 49:
                    {
                    alt19=3;
                    }
                    break;
                case 50:
                    {
                    alt19=4;
                    }
                    break;
                case 51:
                    {
                    alt19=5;
                    }
                    break;
                case 52:
                    {
                    alt19=6;
                    }
                    break;
                case 53:
                    {
                    alt19=7;
                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // InternalBPMN_translator.g:1392:4: (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:1392:4: (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:1393:5: otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,47,FOLLOW_19); 

            	    					newLeafNode(otherlv_1, grammarAccess.getHttp_dataAccess().getNAMEKeyword_1_0_0());
            	    				
            	    otherlv_2=(Token)match(input,24,FOLLOW_6); 

            	    					newLeafNode(otherlv_2, grammarAccess.getHttp_dataAccess().getEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalBPMN_translator.g:1401:5: ( (lv_pname_3_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:1402:6: (lv_pname_3_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:1402:6: (lv_pname_3_0= RULE_STRING )
            	    // InternalBPMN_translator.g:1403:7: lv_pname_3_0= RULE_STRING
            	    {
            	    lv_pname_3_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            	    							newLeafNode(lv_pname_3_0, grammarAccess.getHttp_dataAccess().getPnameSTRINGTerminalRuleCall_1_0_2_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getHttp_dataRule());
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
            	    // InternalBPMN_translator.g:1421:4: (otherlv_4= 'SERVER_IP' otherlv_5= '=' ( (lv_server_ip_6_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:1421:4: (otherlv_4= 'SERVER_IP' otherlv_5= '=' ( (lv_server_ip_6_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:1422:5: otherlv_4= 'SERVER_IP' otherlv_5= '=' ( (lv_server_ip_6_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,48,FOLLOW_19); 

            	    					newLeafNode(otherlv_4, grammarAccess.getHttp_dataAccess().getSERVER_IPKeyword_1_1_0());
            	    				
            	    otherlv_5=(Token)match(input,24,FOLLOW_6); 

            	    					newLeafNode(otherlv_5, grammarAccess.getHttp_dataAccess().getEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalBPMN_translator.g:1430:5: ( (lv_server_ip_6_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:1431:6: (lv_server_ip_6_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:1431:6: (lv_server_ip_6_0= RULE_STRING )
            	    // InternalBPMN_translator.g:1432:7: lv_server_ip_6_0= RULE_STRING
            	    {
            	    lv_server_ip_6_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            	    							newLeafNode(lv_server_ip_6_0, grammarAccess.getHttp_dataAccess().getServer_ipSTRINGTerminalRuleCall_1_1_2_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getHttp_dataRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"server_ip",
            	    								lv_server_ip_6_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBPMN_translator.g:1450:4: (otherlv_7= 'REQUEST_TYPE' otherlv_8= '=' ( (lv_request_type_9_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:1450:4: (otherlv_7= 'REQUEST_TYPE' otherlv_8= '=' ( (lv_request_type_9_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:1451:5: otherlv_7= 'REQUEST_TYPE' otherlv_8= '=' ( (lv_request_type_9_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,49,FOLLOW_19); 

            	    					newLeafNode(otherlv_7, grammarAccess.getHttp_dataAccess().getREQUEST_TYPEKeyword_1_2_0());
            	    				
            	    otherlv_8=(Token)match(input,24,FOLLOW_6); 

            	    					newLeafNode(otherlv_8, grammarAccess.getHttp_dataAccess().getEqualsSignKeyword_1_2_1());
            	    				
            	    // InternalBPMN_translator.g:1459:5: ( (lv_request_type_9_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:1460:6: (lv_request_type_9_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:1460:6: (lv_request_type_9_0= RULE_STRING )
            	    // InternalBPMN_translator.g:1461:7: lv_request_type_9_0= RULE_STRING
            	    {
            	    lv_request_type_9_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            	    							newLeafNode(lv_request_type_9_0, grammarAccess.getHttp_dataAccess().getRequest_typeSTRINGTerminalRuleCall_1_2_2_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getHttp_dataRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"request_type",
            	    								lv_request_type_9_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalBPMN_translator.g:1479:4: (otherlv_10= 'CONTENT_TYPE' otherlv_11= '=' ( (lv_content_type_12_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:1479:4: (otherlv_10= 'CONTENT_TYPE' otherlv_11= '=' ( (lv_content_type_12_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:1480:5: otherlv_10= 'CONTENT_TYPE' otherlv_11= '=' ( (lv_content_type_12_0= RULE_STRING ) )
            	    {
            	    otherlv_10=(Token)match(input,50,FOLLOW_19); 

            	    					newLeafNode(otherlv_10, grammarAccess.getHttp_dataAccess().getCONTENT_TYPEKeyword_1_3_0());
            	    				
            	    otherlv_11=(Token)match(input,24,FOLLOW_6); 

            	    					newLeafNode(otherlv_11, grammarAccess.getHttp_dataAccess().getEqualsSignKeyword_1_3_1());
            	    				
            	    // InternalBPMN_translator.g:1488:5: ( (lv_content_type_12_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:1489:6: (lv_content_type_12_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:1489:6: (lv_content_type_12_0= RULE_STRING )
            	    // InternalBPMN_translator.g:1490:7: lv_content_type_12_0= RULE_STRING
            	    {
            	    lv_content_type_12_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            	    							newLeafNode(lv_content_type_12_0, grammarAccess.getHttp_dataAccess().getContent_typeSTRINGTerminalRuleCall_1_3_2_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getHttp_dataRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"content_type",
            	    								lv_content_type_12_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalBPMN_translator.g:1508:4: (otherlv_13= 'HEADER' otherlv_14= '=' ( (lv_header_15_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:1508:4: (otherlv_13= 'HEADER' otherlv_14= '=' ( (lv_header_15_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:1509:5: otherlv_13= 'HEADER' otherlv_14= '=' ( (lv_header_15_0= RULE_STRING ) )
            	    {
            	    otherlv_13=(Token)match(input,51,FOLLOW_19); 

            	    					newLeafNode(otherlv_13, grammarAccess.getHttp_dataAccess().getHEADERKeyword_1_4_0());
            	    				
            	    otherlv_14=(Token)match(input,24,FOLLOW_6); 

            	    					newLeafNode(otherlv_14, grammarAccess.getHttp_dataAccess().getEqualsSignKeyword_1_4_1());
            	    				
            	    // InternalBPMN_translator.g:1517:5: ( (lv_header_15_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:1518:6: (lv_header_15_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:1518:6: (lv_header_15_0= RULE_STRING )
            	    // InternalBPMN_translator.g:1519:7: lv_header_15_0= RULE_STRING
            	    {
            	    lv_header_15_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            	    							newLeafNode(lv_header_15_0, grammarAccess.getHttp_dataAccess().getHeaderSTRINGTerminalRuleCall_1_4_2_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getHttp_dataRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"header",
            	    								lv_header_15_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalBPMN_translator.g:1537:4: (otherlv_16= 'DATA' otherlv_17= '=' ( (lv_data_18_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:1537:4: (otherlv_16= 'DATA' otherlv_17= '=' ( (lv_data_18_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:1538:5: otherlv_16= 'DATA' otherlv_17= '=' ( (lv_data_18_0= RULE_STRING ) )
            	    {
            	    otherlv_16=(Token)match(input,52,FOLLOW_19); 

            	    					newLeafNode(otherlv_16, grammarAccess.getHttp_dataAccess().getDATAKeyword_1_5_0());
            	    				
            	    otherlv_17=(Token)match(input,24,FOLLOW_6); 

            	    					newLeafNode(otherlv_17, grammarAccess.getHttp_dataAccess().getEqualsSignKeyword_1_5_1());
            	    				
            	    // InternalBPMN_translator.g:1546:5: ( (lv_data_18_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:1547:6: (lv_data_18_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:1547:6: (lv_data_18_0= RULE_STRING )
            	    // InternalBPMN_translator.g:1548:7: lv_data_18_0= RULE_STRING
            	    {
            	    lv_data_18_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            	    							newLeafNode(lv_data_18_0, grammarAccess.getHttp_dataAccess().getDataSTRINGTerminalRuleCall_1_5_2_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getHttp_dataRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"data",
            	    								lv_data_18_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalBPMN_translator.g:1566:4: (otherlv_19= 'NETWORK' otherlv_20= '{' ( (lv_mqtt_network_data_21_0= rulemqtt_network_data ) )* otherlv_22= '}' )
            	    {
            	    // InternalBPMN_translator.g:1566:4: (otherlv_19= 'NETWORK' otherlv_20= '{' ( (lv_mqtt_network_data_21_0= rulemqtt_network_data ) )* otherlv_22= '}' )
            	    // InternalBPMN_translator.g:1567:5: otherlv_19= 'NETWORK' otherlv_20= '{' ( (lv_mqtt_network_data_21_0= rulemqtt_network_data ) )* otherlv_22= '}'
            	    {
            	    otherlv_19=(Token)match(input,53,FOLLOW_10); 

            	    					newLeafNode(otherlv_19, grammarAccess.getHttp_dataAccess().getNETWORKKeyword_1_6_0());
            	    				
            	    otherlv_20=(Token)match(input,20,FOLLOW_32); 

            	    					newLeafNode(otherlv_20, grammarAccess.getHttp_dataAccess().getLeftCurlyBracketKeyword_1_6_1());
            	    				
            	    // InternalBPMN_translator.g:1575:5: ( (lv_mqtt_network_data_21_0= rulemqtt_network_data ) )*
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( (LA18_0==60) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // InternalBPMN_translator.g:1576:6: (lv_mqtt_network_data_21_0= rulemqtt_network_data )
            	    	    {
            	    	    // InternalBPMN_translator.g:1576:6: (lv_mqtt_network_data_21_0= rulemqtt_network_data )
            	    	    // InternalBPMN_translator.g:1577:7: lv_mqtt_network_data_21_0= rulemqtt_network_data
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getHttp_dataAccess().getMqtt_network_dataMqtt_network_dataParserRuleCall_1_6_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_32);
            	    	    lv_mqtt_network_data_21_0=rulemqtt_network_data();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getHttp_dataRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"mqtt_network_data",
            	    	    								lv_mqtt_network_data_21_0,
            	    	    								"org.xtext.BPMN_translator.mqtt_network_data");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop18;
            	        }
            	    } while (true);

            	    otherlv_22=(Token)match(input,21,FOLLOW_31); 

            	    					newLeafNode(otherlv_22, grammarAccess.getHttp_dataAccess().getRightCurlyBracketKeyword_1_6_3());
            	    				

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
    // $ANTLR end "rulehttp_data"


    // $ANTLR start "entryRulemqtt_data"
    // InternalBPMN_translator.g:1604:1: entryRulemqtt_data returns [EObject current=null] : iv_rulemqtt_data= rulemqtt_data EOF ;
    public final EObject entryRulemqtt_data() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemqtt_data = null;


        try {
            // InternalBPMN_translator.g:1604:50: (iv_rulemqtt_data= rulemqtt_data EOF )
            // InternalBPMN_translator.g:1605:2: iv_rulemqtt_data= rulemqtt_data EOF
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
    // InternalBPMN_translator.g:1611:1: rulemqtt_data returns [EObject current=null] : ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'BROKER_USER' otherlv_5= '=' ( (lv_broker_user_6_0= RULE_STRING ) ) ) | (otherlv_7= 'BROKER_PASSWORD' otherlv_8= '=' ( (lv_broker_password_9_0= RULE_STRING ) ) ) | (otherlv_10= 'BROKER' otherlv_11= '=' ( (lv_broker_12_0= RULE_STRING ) ) ) | (otherlv_13= 'NETWORK' otherlv_14= '{' ( (lv_mqtt_network_data_15_0= rulemqtt_network_data ) )* otherlv_16= '}' ) | (otherlv_17= 'SUBTOPICS' otherlv_18= '{' (otherlv_19= 'TOPIC_NAME' otherlv_20= '=' ( (lv_subtopics_21_0= RULE_STRING ) ) )* otherlv_22= '}' ) | (otherlv_23= 'PUBTOPICS' otherlv_24= '{' ( (otherlv_25= 'TOPIC_NAME' otherlv_26= '=' ( (lv_pubtopics_27_0= RULE_STRING ) )* ) | (otherlv_28= 'DATA' otherlv_29= '=' ( ( (lv_value_30_1= RULE_STRING | lv_value_30_2= rulevariables ) ) ) ) )* otherlv_31= '}' ) )* ) ;
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
        Token lv_value_30_1=null;
        Token otherlv_31=null;
        EObject lv_mqtt_network_data_15_0 = null;

        AntlrDatatypeRuleToken lv_value_30_2 = null;



        	enterRule();

        try {
            // InternalBPMN_translator.g:1617:2: ( ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'BROKER_USER' otherlv_5= '=' ( (lv_broker_user_6_0= RULE_STRING ) ) ) | (otherlv_7= 'BROKER_PASSWORD' otherlv_8= '=' ( (lv_broker_password_9_0= RULE_STRING ) ) ) | (otherlv_10= 'BROKER' otherlv_11= '=' ( (lv_broker_12_0= RULE_STRING ) ) ) | (otherlv_13= 'NETWORK' otherlv_14= '{' ( (lv_mqtt_network_data_15_0= rulemqtt_network_data ) )* otherlv_16= '}' ) | (otherlv_17= 'SUBTOPICS' otherlv_18= '{' (otherlv_19= 'TOPIC_NAME' otherlv_20= '=' ( (lv_subtopics_21_0= RULE_STRING ) ) )* otherlv_22= '}' ) | (otherlv_23= 'PUBTOPICS' otherlv_24= '{' ( (otherlv_25= 'TOPIC_NAME' otherlv_26= '=' ( (lv_pubtopics_27_0= RULE_STRING ) )* ) | (otherlv_28= 'DATA' otherlv_29= '=' ( ( (lv_value_30_1= RULE_STRING | lv_value_30_2= rulevariables ) ) ) ) )* otherlv_31= '}' ) )* ) )
            // InternalBPMN_translator.g:1618:2: ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'BROKER_USER' otherlv_5= '=' ( (lv_broker_user_6_0= RULE_STRING ) ) ) | (otherlv_7= 'BROKER_PASSWORD' otherlv_8= '=' ( (lv_broker_password_9_0= RULE_STRING ) ) ) | (otherlv_10= 'BROKER' otherlv_11= '=' ( (lv_broker_12_0= RULE_STRING ) ) ) | (otherlv_13= 'NETWORK' otherlv_14= '{' ( (lv_mqtt_network_data_15_0= rulemqtt_network_data ) )* otherlv_16= '}' ) | (otherlv_17= 'SUBTOPICS' otherlv_18= '{' (otherlv_19= 'TOPIC_NAME' otherlv_20= '=' ( (lv_subtopics_21_0= RULE_STRING ) ) )* otherlv_22= '}' ) | (otherlv_23= 'PUBTOPICS' otherlv_24= '{' ( (otherlv_25= 'TOPIC_NAME' otherlv_26= '=' ( (lv_pubtopics_27_0= RULE_STRING ) )* ) | (otherlv_28= 'DATA' otherlv_29= '=' ( ( (lv_value_30_1= RULE_STRING | lv_value_30_2= rulevariables ) ) ) ) )* otherlv_31= '}' ) )* )
            {
            // InternalBPMN_translator.g:1618:2: ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'BROKER_USER' otherlv_5= '=' ( (lv_broker_user_6_0= RULE_STRING ) ) ) | (otherlv_7= 'BROKER_PASSWORD' otherlv_8= '=' ( (lv_broker_password_9_0= RULE_STRING ) ) ) | (otherlv_10= 'BROKER' otherlv_11= '=' ( (lv_broker_12_0= RULE_STRING ) ) ) | (otherlv_13= 'NETWORK' otherlv_14= '{' ( (lv_mqtt_network_data_15_0= rulemqtt_network_data ) )* otherlv_16= '}' ) | (otherlv_17= 'SUBTOPICS' otherlv_18= '{' (otherlv_19= 'TOPIC_NAME' otherlv_20= '=' ( (lv_subtopics_21_0= RULE_STRING ) ) )* otherlv_22= '}' ) | (otherlv_23= 'PUBTOPICS' otherlv_24= '{' ( (otherlv_25= 'TOPIC_NAME' otherlv_26= '=' ( (lv_pubtopics_27_0= RULE_STRING ) )* ) | (otherlv_28= 'DATA' otherlv_29= '=' ( ( (lv_value_30_1= RULE_STRING | lv_value_30_2= rulevariables ) ) ) ) )* otherlv_31= '}' ) )* )
            // InternalBPMN_translator.g:1619:3: () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'BROKER_USER' otherlv_5= '=' ( (lv_broker_user_6_0= RULE_STRING ) ) ) | (otherlv_7= 'BROKER_PASSWORD' otherlv_8= '=' ( (lv_broker_password_9_0= RULE_STRING ) ) ) | (otherlv_10= 'BROKER' otherlv_11= '=' ( (lv_broker_12_0= RULE_STRING ) ) ) | (otherlv_13= 'NETWORK' otherlv_14= '{' ( (lv_mqtt_network_data_15_0= rulemqtt_network_data ) )* otherlv_16= '}' ) | (otherlv_17= 'SUBTOPICS' otherlv_18= '{' (otherlv_19= 'TOPIC_NAME' otherlv_20= '=' ( (lv_subtopics_21_0= RULE_STRING ) ) )* otherlv_22= '}' ) | (otherlv_23= 'PUBTOPICS' otherlv_24= '{' ( (otherlv_25= 'TOPIC_NAME' otherlv_26= '=' ( (lv_pubtopics_27_0= RULE_STRING ) )* ) | (otherlv_28= 'DATA' otherlv_29= '=' ( ( (lv_value_30_1= RULE_STRING | lv_value_30_2= rulevariables ) ) ) ) )* otherlv_31= '}' ) )*
            {
            // InternalBPMN_translator.g:1619:3: ()
            // InternalBPMN_translator.g:1620:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMqtt_dataAccess().getMqtt_dataAction_0(),
            					current);
            			

            }

            // InternalBPMN_translator.g:1626:3: ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'BROKER_USER' otherlv_5= '=' ( (lv_broker_user_6_0= RULE_STRING ) ) ) | (otherlv_7= 'BROKER_PASSWORD' otherlv_8= '=' ( (lv_broker_password_9_0= RULE_STRING ) ) ) | (otherlv_10= 'BROKER' otherlv_11= '=' ( (lv_broker_12_0= RULE_STRING ) ) ) | (otherlv_13= 'NETWORK' otherlv_14= '{' ( (lv_mqtt_network_data_15_0= rulemqtt_network_data ) )* otherlv_16= '}' ) | (otherlv_17= 'SUBTOPICS' otherlv_18= '{' (otherlv_19= 'TOPIC_NAME' otherlv_20= '=' ( (lv_subtopics_21_0= RULE_STRING ) ) )* otherlv_22= '}' ) | (otherlv_23= 'PUBTOPICS' otherlv_24= '{' ( (otherlv_25= 'TOPIC_NAME' otherlv_26= '=' ( (lv_pubtopics_27_0= RULE_STRING ) )* ) | (otherlv_28= 'DATA' otherlv_29= '=' ( ( (lv_value_30_1= RULE_STRING | lv_value_30_2= rulevariables ) ) ) ) )* otherlv_31= '}' ) )*
            loop25:
            do {
                int alt25=8;
                switch ( input.LA(1) ) {
                case 47:
                    {
                    alt25=1;
                    }
                    break;
                case 54:
                    {
                    alt25=2;
                    }
                    break;
                case 55:
                    {
                    alt25=3;
                    }
                    break;
                case 56:
                    {
                    alt25=4;
                    }
                    break;
                case 53:
                    {
                    alt25=5;
                    }
                    break;
                case 57:
                    {
                    alt25=6;
                    }
                    break;
                case 59:
                    {
                    alt25=7;
                    }
                    break;

                }

                switch (alt25) {
            	case 1 :
            	    // InternalBPMN_translator.g:1627:4: (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:1627:4: (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:1628:5: otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,47,FOLLOW_19); 

            	    					newLeafNode(otherlv_1, grammarAccess.getMqtt_dataAccess().getNAMEKeyword_1_0_0());
            	    				
            	    otherlv_2=(Token)match(input,24,FOLLOW_6); 

            	    					newLeafNode(otherlv_2, grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalBPMN_translator.g:1636:5: ( (lv_pname_3_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:1637:6: (lv_pname_3_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:1637:6: (lv_pname_3_0= RULE_STRING )
            	    // InternalBPMN_translator.g:1638:7: lv_pname_3_0= RULE_STRING
            	    {
            	    lv_pname_3_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

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
            	    // InternalBPMN_translator.g:1656:4: (otherlv_4= 'BROKER_USER' otherlv_5= '=' ( (lv_broker_user_6_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:1656:4: (otherlv_4= 'BROKER_USER' otherlv_5= '=' ( (lv_broker_user_6_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:1657:5: otherlv_4= 'BROKER_USER' otherlv_5= '=' ( (lv_broker_user_6_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,54,FOLLOW_19); 

            	    					newLeafNode(otherlv_4, grammarAccess.getMqtt_dataAccess().getBROKER_USERKeyword_1_1_0());
            	    				
            	    otherlv_5=(Token)match(input,24,FOLLOW_6); 

            	    					newLeafNode(otherlv_5, grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalBPMN_translator.g:1665:5: ( (lv_broker_user_6_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:1666:6: (lv_broker_user_6_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:1666:6: (lv_broker_user_6_0= RULE_STRING )
            	    // InternalBPMN_translator.g:1667:7: lv_broker_user_6_0= RULE_STRING
            	    {
            	    lv_broker_user_6_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

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
            	    // InternalBPMN_translator.g:1685:4: (otherlv_7= 'BROKER_PASSWORD' otherlv_8= '=' ( (lv_broker_password_9_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:1685:4: (otherlv_7= 'BROKER_PASSWORD' otherlv_8= '=' ( (lv_broker_password_9_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:1686:5: otherlv_7= 'BROKER_PASSWORD' otherlv_8= '=' ( (lv_broker_password_9_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,55,FOLLOW_19); 

            	    					newLeafNode(otherlv_7, grammarAccess.getMqtt_dataAccess().getBROKER_PASSWORDKeyword_1_2_0());
            	    				
            	    otherlv_8=(Token)match(input,24,FOLLOW_6); 

            	    					newLeafNode(otherlv_8, grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_2_1());
            	    				
            	    // InternalBPMN_translator.g:1694:5: ( (lv_broker_password_9_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:1695:6: (lv_broker_password_9_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:1695:6: (lv_broker_password_9_0= RULE_STRING )
            	    // InternalBPMN_translator.g:1696:7: lv_broker_password_9_0= RULE_STRING
            	    {
            	    lv_broker_password_9_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

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
            	    // InternalBPMN_translator.g:1714:4: (otherlv_10= 'BROKER' otherlv_11= '=' ( (lv_broker_12_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:1714:4: (otherlv_10= 'BROKER' otherlv_11= '=' ( (lv_broker_12_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:1715:5: otherlv_10= 'BROKER' otherlv_11= '=' ( (lv_broker_12_0= RULE_STRING ) )
            	    {
            	    otherlv_10=(Token)match(input,56,FOLLOW_19); 

            	    					newLeafNode(otherlv_10, grammarAccess.getMqtt_dataAccess().getBROKERKeyword_1_3_0());
            	    				
            	    otherlv_11=(Token)match(input,24,FOLLOW_6); 

            	    					newLeafNode(otherlv_11, grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_3_1());
            	    				
            	    // InternalBPMN_translator.g:1723:5: ( (lv_broker_12_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:1724:6: (lv_broker_12_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:1724:6: (lv_broker_12_0= RULE_STRING )
            	    // InternalBPMN_translator.g:1725:7: lv_broker_12_0= RULE_STRING
            	    {
            	    lv_broker_12_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

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
            	    // InternalBPMN_translator.g:1743:4: (otherlv_13= 'NETWORK' otherlv_14= '{' ( (lv_mqtt_network_data_15_0= rulemqtt_network_data ) )* otherlv_16= '}' )
            	    {
            	    // InternalBPMN_translator.g:1743:4: (otherlv_13= 'NETWORK' otherlv_14= '{' ( (lv_mqtt_network_data_15_0= rulemqtt_network_data ) )* otherlv_16= '}' )
            	    // InternalBPMN_translator.g:1744:5: otherlv_13= 'NETWORK' otherlv_14= '{' ( (lv_mqtt_network_data_15_0= rulemqtt_network_data ) )* otherlv_16= '}'
            	    {
            	    otherlv_13=(Token)match(input,53,FOLLOW_10); 

            	    					newLeafNode(otherlv_13, grammarAccess.getMqtt_dataAccess().getNETWORKKeyword_1_4_0());
            	    				
            	    otherlv_14=(Token)match(input,20,FOLLOW_32); 

            	    					newLeafNode(otherlv_14, grammarAccess.getMqtt_dataAccess().getLeftCurlyBracketKeyword_1_4_1());
            	    				
            	    // InternalBPMN_translator.g:1752:5: ( (lv_mqtt_network_data_15_0= rulemqtt_network_data ) )*
            	    loop20:
            	    do {
            	        int alt20=2;
            	        int LA20_0 = input.LA(1);

            	        if ( (LA20_0==60) ) {
            	            alt20=1;
            	        }


            	        switch (alt20) {
            	    	case 1 :
            	    	    // InternalBPMN_translator.g:1753:6: (lv_mqtt_network_data_15_0= rulemqtt_network_data )
            	    	    {
            	    	    // InternalBPMN_translator.g:1753:6: (lv_mqtt_network_data_15_0= rulemqtt_network_data )
            	    	    // InternalBPMN_translator.g:1754:7: lv_mqtt_network_data_15_0= rulemqtt_network_data
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getMqtt_dataAccess().getMqtt_network_dataMqtt_network_dataParserRuleCall_1_4_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_32);
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
            	    	    break loop20;
            	        }
            	    } while (true);

            	    otherlv_16=(Token)match(input,21,FOLLOW_33); 

            	    					newLeafNode(otherlv_16, grammarAccess.getMqtt_dataAccess().getRightCurlyBracketKeyword_1_4_3());
            	    				

            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalBPMN_translator.g:1777:4: (otherlv_17= 'SUBTOPICS' otherlv_18= '{' (otherlv_19= 'TOPIC_NAME' otherlv_20= '=' ( (lv_subtopics_21_0= RULE_STRING ) ) )* otherlv_22= '}' )
            	    {
            	    // InternalBPMN_translator.g:1777:4: (otherlv_17= 'SUBTOPICS' otherlv_18= '{' (otherlv_19= 'TOPIC_NAME' otherlv_20= '=' ( (lv_subtopics_21_0= RULE_STRING ) ) )* otherlv_22= '}' )
            	    // InternalBPMN_translator.g:1778:5: otherlv_17= 'SUBTOPICS' otherlv_18= '{' (otherlv_19= 'TOPIC_NAME' otherlv_20= '=' ( (lv_subtopics_21_0= RULE_STRING ) ) )* otherlv_22= '}'
            	    {
            	    otherlv_17=(Token)match(input,57,FOLLOW_10); 

            	    					newLeafNode(otherlv_17, grammarAccess.getMqtt_dataAccess().getSUBTOPICSKeyword_1_5_0());
            	    				
            	    otherlv_18=(Token)match(input,20,FOLLOW_34); 

            	    					newLeafNode(otherlv_18, grammarAccess.getMqtt_dataAccess().getLeftCurlyBracketKeyword_1_5_1());
            	    				
            	    // InternalBPMN_translator.g:1786:5: (otherlv_19= 'TOPIC_NAME' otherlv_20= '=' ( (lv_subtopics_21_0= RULE_STRING ) ) )*
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==58) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // InternalBPMN_translator.g:1787:6: otherlv_19= 'TOPIC_NAME' otherlv_20= '=' ( (lv_subtopics_21_0= RULE_STRING ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,58,FOLLOW_19); 

            	    	    						newLeafNode(otherlv_19, grammarAccess.getMqtt_dataAccess().getTOPIC_NAMEKeyword_1_5_2_0());
            	    	    					
            	    	    otherlv_20=(Token)match(input,24,FOLLOW_6); 

            	    	    						newLeafNode(otherlv_20, grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_5_2_1());
            	    	    					
            	    	    // InternalBPMN_translator.g:1795:6: ( (lv_subtopics_21_0= RULE_STRING ) )
            	    	    // InternalBPMN_translator.g:1796:7: (lv_subtopics_21_0= RULE_STRING )
            	    	    {
            	    	    // InternalBPMN_translator.g:1796:7: (lv_subtopics_21_0= RULE_STRING )
            	    	    // InternalBPMN_translator.g:1797:8: lv_subtopics_21_0= RULE_STRING
            	    	    {
            	    	    lv_subtopics_21_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

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
            	    	    break loop21;
            	        }
            	    } while (true);

            	    otherlv_22=(Token)match(input,21,FOLLOW_33); 

            	    					newLeafNode(otherlv_22, grammarAccess.getMqtt_dataAccess().getRightCurlyBracketKeyword_1_5_3());
            	    				

            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalBPMN_translator.g:1820:4: (otherlv_23= 'PUBTOPICS' otherlv_24= '{' ( (otherlv_25= 'TOPIC_NAME' otherlv_26= '=' ( (lv_pubtopics_27_0= RULE_STRING ) )* ) | (otherlv_28= 'DATA' otherlv_29= '=' ( ( (lv_value_30_1= RULE_STRING | lv_value_30_2= rulevariables ) ) ) ) )* otherlv_31= '}' )
            	    {
            	    // InternalBPMN_translator.g:1820:4: (otherlv_23= 'PUBTOPICS' otherlv_24= '{' ( (otherlv_25= 'TOPIC_NAME' otherlv_26= '=' ( (lv_pubtopics_27_0= RULE_STRING ) )* ) | (otherlv_28= 'DATA' otherlv_29= '=' ( ( (lv_value_30_1= RULE_STRING | lv_value_30_2= rulevariables ) ) ) ) )* otherlv_31= '}' )
            	    // InternalBPMN_translator.g:1821:5: otherlv_23= 'PUBTOPICS' otherlv_24= '{' ( (otherlv_25= 'TOPIC_NAME' otherlv_26= '=' ( (lv_pubtopics_27_0= RULE_STRING ) )* ) | (otherlv_28= 'DATA' otherlv_29= '=' ( ( (lv_value_30_1= RULE_STRING | lv_value_30_2= rulevariables ) ) ) ) )* otherlv_31= '}'
            	    {
            	    otherlv_23=(Token)match(input,59,FOLLOW_10); 

            	    					newLeafNode(otherlv_23, grammarAccess.getMqtt_dataAccess().getPUBTOPICSKeyword_1_6_0());
            	    				
            	    otherlv_24=(Token)match(input,20,FOLLOW_35); 

            	    					newLeafNode(otherlv_24, grammarAccess.getMqtt_dataAccess().getLeftCurlyBracketKeyword_1_6_1());
            	    				
            	    // InternalBPMN_translator.g:1829:5: ( (otherlv_25= 'TOPIC_NAME' otherlv_26= '=' ( (lv_pubtopics_27_0= RULE_STRING ) )* ) | (otherlv_28= 'DATA' otherlv_29= '=' ( ( (lv_value_30_1= RULE_STRING | lv_value_30_2= rulevariables ) ) ) ) )*
            	    loop24:
            	    do {
            	        int alt24=3;
            	        int LA24_0 = input.LA(1);

            	        if ( (LA24_0==58) ) {
            	            alt24=1;
            	        }
            	        else if ( (LA24_0==52) ) {
            	            alt24=2;
            	        }


            	        switch (alt24) {
            	    	case 1 :
            	    	    // InternalBPMN_translator.g:1830:6: (otherlv_25= 'TOPIC_NAME' otherlv_26= '=' ( (lv_pubtopics_27_0= RULE_STRING ) )* )
            	    	    {
            	    	    // InternalBPMN_translator.g:1830:6: (otherlv_25= 'TOPIC_NAME' otherlv_26= '=' ( (lv_pubtopics_27_0= RULE_STRING ) )* )
            	    	    // InternalBPMN_translator.g:1831:7: otherlv_25= 'TOPIC_NAME' otherlv_26= '=' ( (lv_pubtopics_27_0= RULE_STRING ) )*
            	    	    {
            	    	    otherlv_25=(Token)match(input,58,FOLLOW_19); 

            	    	    							newLeafNode(otherlv_25, grammarAccess.getMqtt_dataAccess().getTOPIC_NAMEKeyword_1_6_2_0_0());
            	    	    						
            	    	    otherlv_26=(Token)match(input,24,FOLLOW_36); 

            	    	    							newLeafNode(otherlv_26, grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_6_2_0_1());
            	    	    						
            	    	    // InternalBPMN_translator.g:1839:7: ( (lv_pubtopics_27_0= RULE_STRING ) )*
            	    	    loop22:
            	    	    do {
            	    	        int alt22=2;
            	    	        int LA22_0 = input.LA(1);

            	    	        if ( (LA22_0==RULE_STRING) ) {
            	    	            alt22=1;
            	    	        }


            	    	        switch (alt22) {
            	    	    	case 1 :
            	    	    	    // InternalBPMN_translator.g:1840:8: (lv_pubtopics_27_0= RULE_STRING )
            	    	    	    {
            	    	    	    // InternalBPMN_translator.g:1840:8: (lv_pubtopics_27_0= RULE_STRING )
            	    	    	    // InternalBPMN_translator.g:1841:9: lv_pubtopics_27_0= RULE_STRING
            	    	    	    {
            	    	    	    lv_pubtopics_27_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

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
            	    	    	    break loop22;
            	    	        }
            	    	    } while (true);


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalBPMN_translator.g:1859:6: (otherlv_28= 'DATA' otherlv_29= '=' ( ( (lv_value_30_1= RULE_STRING | lv_value_30_2= rulevariables ) ) ) )
            	    	    {
            	    	    // InternalBPMN_translator.g:1859:6: (otherlv_28= 'DATA' otherlv_29= '=' ( ( (lv_value_30_1= RULE_STRING | lv_value_30_2= rulevariables ) ) ) )
            	    	    // InternalBPMN_translator.g:1860:7: otherlv_28= 'DATA' otherlv_29= '=' ( ( (lv_value_30_1= RULE_STRING | lv_value_30_2= rulevariables ) ) )
            	    	    {
            	    	    otherlv_28=(Token)match(input,52,FOLLOW_19); 

            	    	    							newLeafNode(otherlv_28, grammarAccess.getMqtt_dataAccess().getDATAKeyword_1_6_2_1_0());
            	    	    						
            	    	    otherlv_29=(Token)match(input,24,FOLLOW_37); 

            	    	    							newLeafNode(otherlv_29, grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_6_2_1_1());
            	    	    						
            	    	    // InternalBPMN_translator.g:1868:7: ( ( (lv_value_30_1= RULE_STRING | lv_value_30_2= rulevariables ) ) )
            	    	    // InternalBPMN_translator.g:1869:8: ( (lv_value_30_1= RULE_STRING | lv_value_30_2= rulevariables ) )
            	    	    {
            	    	    // InternalBPMN_translator.g:1869:8: ( (lv_value_30_1= RULE_STRING | lv_value_30_2= rulevariables ) )
            	    	    // InternalBPMN_translator.g:1870:9: (lv_value_30_1= RULE_STRING | lv_value_30_2= rulevariables )
            	    	    {
            	    	    // InternalBPMN_translator.g:1870:9: (lv_value_30_1= RULE_STRING | lv_value_30_2= rulevariables )
            	    	    int alt23=2;
            	    	    int LA23_0 = input.LA(1);

            	    	    if ( (LA23_0==RULE_STRING) ) {
            	    	        alt23=1;
            	    	    }
            	    	    else if ( (LA23_0==RULE_BODY||LA23_0==28||LA23_0==32) ) {
            	    	        alt23=2;
            	    	    }
            	    	    else {
            	    	        NoViableAltException nvae =
            	    	            new NoViableAltException("", 23, 0, input);

            	    	        throw nvae;
            	    	    }
            	    	    switch (alt23) {
            	    	        case 1 :
            	    	            // InternalBPMN_translator.g:1871:10: lv_value_30_1= RULE_STRING
            	    	            {
            	    	            lv_value_30_1=(Token)match(input,RULE_STRING,FOLLOW_35); 

            	    	            										newLeafNode(lv_value_30_1, grammarAccess.getMqtt_dataAccess().getValueSTRINGTerminalRuleCall_1_6_2_1_2_0_0());
            	    	            									

            	    	            										if (current==null) {
            	    	            											current = createModelElement(grammarAccess.getMqtt_dataRule());
            	    	            										}
            	    	            										addWithLastConsumed(
            	    	            											current,
            	    	            											"value",
            	    	            											lv_value_30_1,
            	    	            											"org.eclipse.xtext.common.Terminals.STRING");
            	    	            									

            	    	            }
            	    	            break;
            	    	        case 2 :
            	    	            // InternalBPMN_translator.g:1886:10: lv_value_30_2= rulevariables
            	    	            {

            	    	            										newCompositeNode(grammarAccess.getMqtt_dataAccess().getValueVariablesParserRuleCall_1_6_2_1_2_0_1());
            	    	            									
            	    	            pushFollow(FOLLOW_35);
            	    	            lv_value_30_2=rulevariables();

            	    	            state._fsp--;


            	    	            										if (current==null) {
            	    	            											current = createModelElementForParent(grammarAccess.getMqtt_dataRule());
            	    	            										}
            	    	            										add(
            	    	            											current,
            	    	            											"value",
            	    	            											lv_value_30_2,
            	    	            											"org.xtext.BPMN_translator.variables");
            	    	            										afterParserOrEnumRuleCall();
            	    	            									

            	    	            }
            	    	            break;

            	    	    }


            	    	    }


            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop24;
            	        }
            	    } while (true);

            	    otherlv_31=(Token)match(input,21,FOLLOW_33); 

            	    					newLeafNode(otherlv_31, grammarAccess.getMqtt_dataAccess().getRightCurlyBracketKeyword_1_6_3());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalBPMN_translator.g:1916:1: entryRulemqtt_network_data returns [EObject current=null] : iv_rulemqtt_network_data= rulemqtt_network_data EOF ;
    public final EObject entryRulemqtt_network_data() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemqtt_network_data = null;


        try {
            // InternalBPMN_translator.g:1916:58: (iv_rulemqtt_network_data= rulemqtt_network_data EOF )
            // InternalBPMN_translator.g:1917:2: iv_rulemqtt_network_data= rulemqtt_network_data EOF
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
    // InternalBPMN_translator.g:1923:1: rulemqtt_network_data returns [EObject current=null] : (otherlv_0= 'SSID' otherlv_1= '=' ( (lv_ssid_2_0= RULE_STRING ) ) otherlv_3= 'PASSWORD' otherlv_4= '=' ( (lv_password_5_0= RULE_STRING ) ) ) ;
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
            // InternalBPMN_translator.g:1929:2: ( (otherlv_0= 'SSID' otherlv_1= '=' ( (lv_ssid_2_0= RULE_STRING ) ) otherlv_3= 'PASSWORD' otherlv_4= '=' ( (lv_password_5_0= RULE_STRING ) ) ) )
            // InternalBPMN_translator.g:1930:2: (otherlv_0= 'SSID' otherlv_1= '=' ( (lv_ssid_2_0= RULE_STRING ) ) otherlv_3= 'PASSWORD' otherlv_4= '=' ( (lv_password_5_0= RULE_STRING ) ) )
            {
            // InternalBPMN_translator.g:1930:2: (otherlv_0= 'SSID' otherlv_1= '=' ( (lv_ssid_2_0= RULE_STRING ) ) otherlv_3= 'PASSWORD' otherlv_4= '=' ( (lv_password_5_0= RULE_STRING ) ) )
            // InternalBPMN_translator.g:1931:3: otherlv_0= 'SSID' otherlv_1= '=' ( (lv_ssid_2_0= RULE_STRING ) ) otherlv_3= 'PASSWORD' otherlv_4= '=' ( (lv_password_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMqtt_network_dataAccess().getSSIDKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getMqtt_network_dataAccess().getEqualsSignKeyword_1());
            		
            // InternalBPMN_translator.g:1939:3: ( (lv_ssid_2_0= RULE_STRING ) )
            // InternalBPMN_translator.g:1940:4: (lv_ssid_2_0= RULE_STRING )
            {
            // InternalBPMN_translator.g:1940:4: (lv_ssid_2_0= RULE_STRING )
            // InternalBPMN_translator.g:1941:5: lv_ssid_2_0= RULE_STRING
            {
            lv_ssid_2_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

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

            otherlv_3=(Token)match(input,61,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getMqtt_network_dataAccess().getPASSWORDKeyword_3());
            		
            otherlv_4=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getMqtt_network_dataAccess().getEqualsSignKeyword_4());
            		
            // InternalBPMN_translator.g:1965:3: ( (lv_password_5_0= RULE_STRING ) )
            // InternalBPMN_translator.g:1966:4: (lv_password_5_0= RULE_STRING )
            {
            // InternalBPMN_translator.g:1966:4: (lv_password_5_0= RULE_STRING )
            // InternalBPMN_translator.g:1967:5: lv_password_5_0= RULE_STRING
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


    // $ANTLR start "entryRuleprotocol_device"
    // InternalBPMN_translator.g:1987:1: entryRuleprotocol_device returns [EObject current=null] : iv_ruleprotocol_device= ruleprotocol_device EOF ;
    public final EObject entryRuleprotocol_device() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprotocol_device = null;


        try {
            // InternalBPMN_translator.g:1987:56: (iv_ruleprotocol_device= ruleprotocol_device EOF )
            // InternalBPMN_translator.g:1988:2: iv_ruleprotocol_device= ruleprotocol_device EOF
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
    // InternalBPMN_translator.g:1994:1: ruleprotocol_device returns [EObject current=null] : (otherlv_0= 'PROTOCOL_DEVICE' otherlv_1= '{' otherlv_2= 'NAME' otherlv_3= '=' ( (lv_dname_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject ruleprotocol_device() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_dname_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalBPMN_translator.g:2000:2: ( (otherlv_0= 'PROTOCOL_DEVICE' otherlv_1= '{' otherlv_2= 'NAME' otherlv_3= '=' ( (lv_dname_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // InternalBPMN_translator.g:2001:2: (otherlv_0= 'PROTOCOL_DEVICE' otherlv_1= '{' otherlv_2= 'NAME' otherlv_3= '=' ( (lv_dname_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // InternalBPMN_translator.g:2001:2: (otherlv_0= 'PROTOCOL_DEVICE' otherlv_1= '{' otherlv_2= 'NAME' otherlv_3= '=' ( (lv_dname_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // InternalBPMN_translator.g:2002:3: otherlv_0= 'PROTOCOL_DEVICE' otherlv_1= '{' otherlv_2= 'NAME' otherlv_3= '=' ( (lv_dname_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getProtocol_deviceAccess().getPROTOCOL_DEVICEKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getProtocol_deviceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,47,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getProtocol_deviceAccess().getNAMEKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getProtocol_deviceAccess().getEqualsSignKeyword_3());
            		
            // InternalBPMN_translator.g:2018:3: ( (lv_dname_4_0= RULE_STRING ) )
            // InternalBPMN_translator.g:2019:4: (lv_dname_4_0= RULE_STRING )
            {
            // InternalBPMN_translator.g:2019:4: (lv_dname_4_0= RULE_STRING )
            // InternalBPMN_translator.g:2020:5: lv_dname_4_0= RULE_STRING
            {
            lv_dname_4_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_dname_4_0, grammarAccess.getProtocol_deviceAccess().getDnameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProtocol_deviceRule());
            					}
            					addWithLastConsumed(
            						current,
            						"dname",
            						lv_dname_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProtocol_deviceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalBPMN_translator.g:2044:1: entryRulesensor returns [EObject current=null] : iv_rulesensor= rulesensor EOF ;
    public final EObject entryRulesensor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesensor = null;


        try {
            // InternalBPMN_translator.g:2044:47: (iv_rulesensor= rulesensor EOF )
            // InternalBPMN_translator.g:2045:2: iv_rulesensor= rulesensor EOF
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
    // InternalBPMN_translator.g:2051:1: rulesensor returns [EObject current=null] : ( ( ( (lv_sname_0_0= 'TEMPERATURE' ) ) otherlv_1= '{' ( (lv_sensor_2_0= rulesensor_data ) ) otherlv_3= '}' ) | ( ( (lv_sname_4_0= 'DISTANCE' ) ) otherlv_5= '{' ( (lv_sensor_6_0= rulesensor_data ) ) otherlv_7= '}' ) ) ;
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
            // InternalBPMN_translator.g:2057:2: ( ( ( ( (lv_sname_0_0= 'TEMPERATURE' ) ) otherlv_1= '{' ( (lv_sensor_2_0= rulesensor_data ) ) otherlv_3= '}' ) | ( ( (lv_sname_4_0= 'DISTANCE' ) ) otherlv_5= '{' ( (lv_sensor_6_0= rulesensor_data ) ) otherlv_7= '}' ) ) )
            // InternalBPMN_translator.g:2058:2: ( ( ( (lv_sname_0_0= 'TEMPERATURE' ) ) otherlv_1= '{' ( (lv_sensor_2_0= rulesensor_data ) ) otherlv_3= '}' ) | ( ( (lv_sname_4_0= 'DISTANCE' ) ) otherlv_5= '{' ( (lv_sensor_6_0= rulesensor_data ) ) otherlv_7= '}' ) )
            {
            // InternalBPMN_translator.g:2058:2: ( ( ( (lv_sname_0_0= 'TEMPERATURE' ) ) otherlv_1= '{' ( (lv_sensor_2_0= rulesensor_data ) ) otherlv_3= '}' ) | ( ( (lv_sname_4_0= 'DISTANCE' ) ) otherlv_5= '{' ( (lv_sensor_6_0= rulesensor_data ) ) otherlv_7= '}' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            else if ( (LA26_0==32) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalBPMN_translator.g:2059:3: ( ( (lv_sname_0_0= 'TEMPERATURE' ) ) otherlv_1= '{' ( (lv_sensor_2_0= rulesensor_data ) ) otherlv_3= '}' )
                    {
                    // InternalBPMN_translator.g:2059:3: ( ( (lv_sname_0_0= 'TEMPERATURE' ) ) otherlv_1= '{' ( (lv_sensor_2_0= rulesensor_data ) ) otherlv_3= '}' )
                    // InternalBPMN_translator.g:2060:4: ( (lv_sname_0_0= 'TEMPERATURE' ) ) otherlv_1= '{' ( (lv_sensor_2_0= rulesensor_data ) ) otherlv_3= '}'
                    {
                    // InternalBPMN_translator.g:2060:4: ( (lv_sname_0_0= 'TEMPERATURE' ) )
                    // InternalBPMN_translator.g:2061:5: (lv_sname_0_0= 'TEMPERATURE' )
                    {
                    // InternalBPMN_translator.g:2061:5: (lv_sname_0_0= 'TEMPERATURE' )
                    // InternalBPMN_translator.g:2062:6: lv_sname_0_0= 'TEMPERATURE'
                    {
                    lv_sname_0_0=(Token)match(input,28,FOLLOW_10); 

                    						newLeafNode(lv_sname_0_0, grammarAccess.getSensorAccess().getSnameTEMPERATUREKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSensorRule());
                    						}
                    						addWithLastConsumed(current, "sname", lv_sname_0_0, "TEMPERATURE");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_40); 

                    				newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_0_1());
                    			
                    // InternalBPMN_translator.g:2078:4: ( (lv_sensor_2_0= rulesensor_data ) )
                    // InternalBPMN_translator.g:2079:5: (lv_sensor_2_0= rulesensor_data )
                    {
                    // InternalBPMN_translator.g:2079:5: (lv_sensor_2_0= rulesensor_data )
                    // InternalBPMN_translator.g:2080:6: lv_sensor_2_0= rulesensor_data
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
                    // InternalBPMN_translator.g:2103:3: ( ( (lv_sname_4_0= 'DISTANCE' ) ) otherlv_5= '{' ( (lv_sensor_6_0= rulesensor_data ) ) otherlv_7= '}' )
                    {
                    // InternalBPMN_translator.g:2103:3: ( ( (lv_sname_4_0= 'DISTANCE' ) ) otherlv_5= '{' ( (lv_sensor_6_0= rulesensor_data ) ) otherlv_7= '}' )
                    // InternalBPMN_translator.g:2104:4: ( (lv_sname_4_0= 'DISTANCE' ) ) otherlv_5= '{' ( (lv_sensor_6_0= rulesensor_data ) ) otherlv_7= '}'
                    {
                    // InternalBPMN_translator.g:2104:4: ( (lv_sname_4_0= 'DISTANCE' ) )
                    // InternalBPMN_translator.g:2105:5: (lv_sname_4_0= 'DISTANCE' )
                    {
                    // InternalBPMN_translator.g:2105:5: (lv_sname_4_0= 'DISTANCE' )
                    // InternalBPMN_translator.g:2106:6: lv_sname_4_0= 'DISTANCE'
                    {
                    lv_sname_4_0=(Token)match(input,32,FOLLOW_10); 

                    						newLeafNode(lv_sname_4_0, grammarAccess.getSensorAccess().getSnameDISTANCEKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSensorRule());
                    						}
                    						addWithLastConsumed(current, "sname", lv_sname_4_0, "DISTANCE");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_40); 

                    				newLeafNode(otherlv_5, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_1_1());
                    			
                    // InternalBPMN_translator.g:2122:4: ( (lv_sensor_6_0= rulesensor_data ) )
                    // InternalBPMN_translator.g:2123:5: (lv_sensor_6_0= rulesensor_data )
                    {
                    // InternalBPMN_translator.g:2123:5: (lv_sensor_6_0= rulesensor_data )
                    // InternalBPMN_translator.g:2124:6: lv_sensor_6_0= rulesensor_data
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
    // InternalBPMN_translator.g:2150:1: entryRulesensor_data returns [EObject current=null] : iv_rulesensor_data= rulesensor_data EOF ;
    public final EObject entryRulesensor_data() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesensor_data = null;


        try {
            // InternalBPMN_translator.g:2150:52: (iv_rulesensor_data= rulesensor_data EOF )
            // InternalBPMN_translator.g:2151:2: iv_rulesensor_data= rulesensor_data EOF
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
    // InternalBPMN_translator.g:2157:1: rulesensor_data returns [EObject current=null] : ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'PINS' otherlv_5= '=' ( (lv_pins_6_0= RULE_STRING ) ) ) | (otherlv_7= 'SENSOR_ID' otherlv_8= '=' ( (lv_sensor_id_9_0= RULE_STRING ) ) ) )* ) ;
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
            // InternalBPMN_translator.g:2163:2: ( ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'PINS' otherlv_5= '=' ( (lv_pins_6_0= RULE_STRING ) ) ) | (otherlv_7= 'SENSOR_ID' otherlv_8= '=' ( (lv_sensor_id_9_0= RULE_STRING ) ) ) )* ) )
            // InternalBPMN_translator.g:2164:2: ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'PINS' otherlv_5= '=' ( (lv_pins_6_0= RULE_STRING ) ) ) | (otherlv_7= 'SENSOR_ID' otherlv_8= '=' ( (lv_sensor_id_9_0= RULE_STRING ) ) ) )* )
            {
            // InternalBPMN_translator.g:2164:2: ( () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'PINS' otherlv_5= '=' ( (lv_pins_6_0= RULE_STRING ) ) ) | (otherlv_7= 'SENSOR_ID' otherlv_8= '=' ( (lv_sensor_id_9_0= RULE_STRING ) ) ) )* )
            // InternalBPMN_translator.g:2165:3: () ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'PINS' otherlv_5= '=' ( (lv_pins_6_0= RULE_STRING ) ) ) | (otherlv_7= 'SENSOR_ID' otherlv_8= '=' ( (lv_sensor_id_9_0= RULE_STRING ) ) ) )*
            {
            // InternalBPMN_translator.g:2165:3: ()
            // InternalBPMN_translator.g:2166:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensor_dataAccess().getSensor_dataAction_0(),
            					current);
            			

            }

            // InternalBPMN_translator.g:2172:3: ( (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) ) | (otherlv_4= 'PINS' otherlv_5= '=' ( (lv_pins_6_0= RULE_STRING ) ) ) | (otherlv_7= 'SENSOR_ID' otherlv_8= '=' ( (lv_sensor_id_9_0= RULE_STRING ) ) ) )*
            loop27:
            do {
                int alt27=4;
                switch ( input.LA(1) ) {
                case 47:
                    {
                    alt27=1;
                    }
                    break;
                case 63:
                    {
                    alt27=2;
                    }
                    break;
                case 64:
                    {
                    alt27=3;
                    }
                    break;

                }

                switch (alt27) {
            	case 1 :
            	    // InternalBPMN_translator.g:2173:4: (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:2173:4: (otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:2174:5: otherlv_1= 'NAME' otherlv_2= '=' ( (lv_pname_3_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,47,FOLLOW_19); 

            	    					newLeafNode(otherlv_1, grammarAccess.getSensor_dataAccess().getNAMEKeyword_1_0_0());
            	    				
            	    otherlv_2=(Token)match(input,24,FOLLOW_6); 

            	    					newLeafNode(otherlv_2, grammarAccess.getSensor_dataAccess().getEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalBPMN_translator.g:2182:5: ( (lv_pname_3_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:2183:6: (lv_pname_3_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:2183:6: (lv_pname_3_0= RULE_STRING )
            	    // InternalBPMN_translator.g:2184:7: lv_pname_3_0= RULE_STRING
            	    {
            	    lv_pname_3_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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
            	    // InternalBPMN_translator.g:2202:4: (otherlv_4= 'PINS' otherlv_5= '=' ( (lv_pins_6_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:2202:4: (otherlv_4= 'PINS' otherlv_5= '=' ( (lv_pins_6_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:2203:5: otherlv_4= 'PINS' otherlv_5= '=' ( (lv_pins_6_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,63,FOLLOW_19); 

            	    					newLeafNode(otherlv_4, grammarAccess.getSensor_dataAccess().getPINSKeyword_1_1_0());
            	    				
            	    otherlv_5=(Token)match(input,24,FOLLOW_6); 

            	    					newLeafNode(otherlv_5, grammarAccess.getSensor_dataAccess().getEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalBPMN_translator.g:2211:5: ( (lv_pins_6_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:2212:6: (lv_pins_6_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:2212:6: (lv_pins_6_0= RULE_STRING )
            	    // InternalBPMN_translator.g:2213:7: lv_pins_6_0= RULE_STRING
            	    {
            	    lv_pins_6_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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
            	    // InternalBPMN_translator.g:2231:4: (otherlv_7= 'SENSOR_ID' otherlv_8= '=' ( (lv_sensor_id_9_0= RULE_STRING ) ) )
            	    {
            	    // InternalBPMN_translator.g:2231:4: (otherlv_7= 'SENSOR_ID' otherlv_8= '=' ( (lv_sensor_id_9_0= RULE_STRING ) ) )
            	    // InternalBPMN_translator.g:2232:5: otherlv_7= 'SENSOR_ID' otherlv_8= '=' ( (lv_sensor_id_9_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,64,FOLLOW_19); 

            	    					newLeafNode(otherlv_7, grammarAccess.getSensor_dataAccess().getSENSOR_IDKeyword_1_2_0());
            	    				
            	    otherlv_8=(Token)match(input,24,FOLLOW_6); 

            	    					newLeafNode(otherlv_8, grammarAccess.getSensor_dataAccess().getEqualsSignKeyword_1_2_1());
            	    				
            	    // InternalBPMN_translator.g:2240:5: ( (lv_sensor_id_9_0= RULE_STRING ) )
            	    // InternalBPMN_translator.g:2241:6: (lv_sensor_id_9_0= RULE_STRING )
            	    {
            	    // InternalBPMN_translator.g:2241:6: (lv_sensor_id_9_0= RULE_STRING )
            	    // InternalBPMN_translator.g:2242:7: lv_sensor_id_9_0= RULE_STRING
            	    {
            	    lv_sensor_id_9_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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
            	    break loop27;
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
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000601184C00E0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000601104C00E2L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000060110000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000007FF114C00E2L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000090L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000090L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000600110000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000110000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x4BE0800000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x4BFF800000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x003F800000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x1000000000200000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0BE0800000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0400000000200000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0410000000200000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0410000000200020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000060110000060L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x8000800000200000L,0x0000000000000001L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x8000800000000002L,0x0000000000000001L});

}