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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BODY", "RULE_KEYWORDS", "RULE_STRING", "RULE_HEAD", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "'</'", "':'", "'='", "'/>'", "'>'"
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
    public static final int RULE_HEAD=7;
    public static final int RULE_BODY=4;
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
    // InternalBPMN_translator.g:107:1: ruleXml returns [EObject current=null] : ( () ( (lv_tag_1_0= ruleTag ) )* ) ;
    public final EObject ruleXml() throws RecognitionException {
        EObject current = null;

        EObject lv_tag_1_0 = null;



        	enterRule();

        try {
            // InternalBPMN_translator.g:113:2: ( ( () ( (lv_tag_1_0= ruleTag ) )* ) )
            // InternalBPMN_translator.g:114:2: ( () ( (lv_tag_1_0= ruleTag ) )* )
            {
            // InternalBPMN_translator.g:114:2: ( () ( (lv_tag_1_0= ruleTag ) )* )
            // InternalBPMN_translator.g:115:3: () ( (lv_tag_1_0= ruleTag ) )*
            {
            // InternalBPMN_translator.g:115:3: ()
            // InternalBPMN_translator.g:116:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXmlAccess().getXmlAction_0(),
            					current);
            			

            }

            // InternalBPMN_translator.g:122:3: ( (lv_tag_1_0= ruleTag ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_BODY && LA1_0<=RULE_STRING)||(LA1_0>=14 && LA1_0<=15)||(LA1_0>=18 && LA1_0<=19)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBPMN_translator.g:123:4: (lv_tag_1_0= ruleTag )
            	    {
            	    // InternalBPMN_translator.g:123:4: (lv_tag_1_0= ruleTag )
            	    // InternalBPMN_translator.g:124:5: lv_tag_1_0= ruleTag
            	    {

            	    					newCompositeNode(grammarAccess.getXmlAccess().getTagTagParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_tag_1_0=ruleTag();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getXmlRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tag",
            	    						lv_tag_1_0,
            	    						"org.xtext.BPMN_translator.Tag");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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


    // $ANTLR start "entryRuleTag"
    // InternalBPMN_translator.g:145:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // InternalBPMN_translator.g:145:44: (iv_ruleTag= ruleTag EOF )
            // InternalBPMN_translator.g:146:2: iv_ruleTag= ruleTag EOF
            {
             newCompositeNode(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTag=ruleTag();

            state._fsp--;

             current =iv_ruleTag; 
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
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalBPMN_translator.g:152:1: ruleTag returns [EObject current=null] : (this_Singleton_0= ruleSingleton | ( ( (lv_result_1_0= RULE_BODY ) ) | ( (lv_result_2_0= RULE_KEYWORDS ) ) ) | ( (lv_result_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        Token lv_result_1_0=null;
        Token lv_result_2_0=null;
        Token lv_result_3_0=null;
        EObject this_Singleton_0 = null;



        	enterRule();

        try {
            // InternalBPMN_translator.g:158:2: ( (this_Singleton_0= ruleSingleton | ( ( (lv_result_1_0= RULE_BODY ) ) | ( (lv_result_2_0= RULE_KEYWORDS ) ) ) | ( (lv_result_3_0= RULE_STRING ) ) ) )
            // InternalBPMN_translator.g:159:2: (this_Singleton_0= ruleSingleton | ( ( (lv_result_1_0= RULE_BODY ) ) | ( (lv_result_2_0= RULE_KEYWORDS ) ) ) | ( (lv_result_3_0= RULE_STRING ) ) )
            {
            // InternalBPMN_translator.g:159:2: (this_Singleton_0= ruleSingleton | ( ( (lv_result_1_0= RULE_BODY ) ) | ( (lv_result_2_0= RULE_KEYWORDS ) ) ) | ( (lv_result_3_0= RULE_STRING ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
            case 15:
            case 18:
            case 19:
                {
                alt3=1;
                }
                break;
            case RULE_BODY:
            case RULE_KEYWORDS:
                {
                alt3=2;
                }
                break;
            case RULE_STRING:
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
                    // InternalBPMN_translator.g:160:3: this_Singleton_0= ruleSingleton
                    {

                    			newCompositeNode(grammarAccess.getTagAccess().getSingletonParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Singleton_0=ruleSingleton();

                    state._fsp--;


                    			current = this_Singleton_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:169:3: ( ( (lv_result_1_0= RULE_BODY ) ) | ( (lv_result_2_0= RULE_KEYWORDS ) ) )
                    {
                    // InternalBPMN_translator.g:169:3: ( ( (lv_result_1_0= RULE_BODY ) ) | ( (lv_result_2_0= RULE_KEYWORDS ) ) )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RULE_BODY) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==RULE_KEYWORDS) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalBPMN_translator.g:170:4: ( (lv_result_1_0= RULE_BODY ) )
                            {
                            // InternalBPMN_translator.g:170:4: ( (lv_result_1_0= RULE_BODY ) )
                            // InternalBPMN_translator.g:171:5: (lv_result_1_0= RULE_BODY )
                            {
                            // InternalBPMN_translator.g:171:5: (lv_result_1_0= RULE_BODY )
                            // InternalBPMN_translator.g:172:6: lv_result_1_0= RULE_BODY
                            {
                            lv_result_1_0=(Token)match(input,RULE_BODY,FOLLOW_2); 

                            						newLeafNode(lv_result_1_0, grammarAccess.getTagAccess().getResultBODYTerminalRuleCall_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTagRule());
                            						}
                            						addWithLastConsumed(
                            							current,
                            							"result",
                            							lv_result_1_0,
                            							"org.xtext.BPMN_translator.BODY");
                            					

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalBPMN_translator.g:189:4: ( (lv_result_2_0= RULE_KEYWORDS ) )
                            {
                            // InternalBPMN_translator.g:189:4: ( (lv_result_2_0= RULE_KEYWORDS ) )
                            // InternalBPMN_translator.g:190:5: (lv_result_2_0= RULE_KEYWORDS )
                            {
                            // InternalBPMN_translator.g:190:5: (lv_result_2_0= RULE_KEYWORDS )
                            // InternalBPMN_translator.g:191:6: lv_result_2_0= RULE_KEYWORDS
                            {
                            lv_result_2_0=(Token)match(input,RULE_KEYWORDS,FOLLOW_2); 

                            						newLeafNode(lv_result_2_0, grammarAccess.getTagAccess().getResultKEYWORDSTerminalRuleCall_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTagRule());
                            						}
                            						addWithLastConsumed(
                            							current,
                            							"result",
                            							lv_result_2_0,
                            							"org.xtext.BPMN_translator.KEYWORDS");
                            					

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // InternalBPMN_translator.g:209:3: ( (lv_result_3_0= RULE_STRING ) )
                    {
                    // InternalBPMN_translator.g:209:3: ( (lv_result_3_0= RULE_STRING ) )
                    // InternalBPMN_translator.g:210:4: (lv_result_3_0= RULE_STRING )
                    {
                    // InternalBPMN_translator.g:210:4: (lv_result_3_0= RULE_STRING )
                    // InternalBPMN_translator.g:211:5: lv_result_3_0= RULE_STRING
                    {
                    lv_result_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_result_3_0, grammarAccess.getTagAccess().getResultSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTagRule());
                    					}
                    					addWithLastConsumed(
                    						current,
                    						"result",
                    						lv_result_3_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

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
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleSingleton"
    // InternalBPMN_translator.g:231:1: entryRuleSingleton returns [EObject current=null] : iv_ruleSingleton= ruleSingleton EOF ;
    public final EObject entryRuleSingleton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleton = null;


        try {
            // InternalBPMN_translator.g:231:50: (iv_ruleSingleton= ruleSingleton EOF )
            // InternalBPMN_translator.g:232:2: iv_ruleSingleton= ruleSingleton EOF
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
    // InternalBPMN_translator.g:238:1: ruleSingleton returns [EObject current=null] : ( () ( ( (otherlv_1= '<' | otherlv_2= '</' ) this_HEAD_3= RULE_HEAD otherlv_4= ':' this_KEYWORDS_5= RULE_KEYWORDS ( (this_HEAD_6= RULE_HEAD otherlv_7= ':' ) | (this_KEYWORDS_8= RULE_KEYWORDS otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) ) )* ) | otherlv_11= '/>' | otherlv_12= '>' ) ) ;
    public final EObject ruleSingleton() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_HEAD_3=null;
        Token otherlv_4=null;
        Token this_KEYWORDS_5=null;
        Token this_HEAD_6=null;
        Token otherlv_7=null;
        Token this_KEYWORDS_8=null;
        Token otherlv_9=null;
        Token lv_value_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalBPMN_translator.g:244:2: ( ( () ( ( (otherlv_1= '<' | otherlv_2= '</' ) this_HEAD_3= RULE_HEAD otherlv_4= ':' this_KEYWORDS_5= RULE_KEYWORDS ( (this_HEAD_6= RULE_HEAD otherlv_7= ':' ) | (this_KEYWORDS_8= RULE_KEYWORDS otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) ) )* ) | otherlv_11= '/>' | otherlv_12= '>' ) ) )
            // InternalBPMN_translator.g:245:2: ( () ( ( (otherlv_1= '<' | otherlv_2= '</' ) this_HEAD_3= RULE_HEAD otherlv_4= ':' this_KEYWORDS_5= RULE_KEYWORDS ( (this_HEAD_6= RULE_HEAD otherlv_7= ':' ) | (this_KEYWORDS_8= RULE_KEYWORDS otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) ) )* ) | otherlv_11= '/>' | otherlv_12= '>' ) )
            {
            // InternalBPMN_translator.g:245:2: ( () ( ( (otherlv_1= '<' | otherlv_2= '</' ) this_HEAD_3= RULE_HEAD otherlv_4= ':' this_KEYWORDS_5= RULE_KEYWORDS ( (this_HEAD_6= RULE_HEAD otherlv_7= ':' ) | (this_KEYWORDS_8= RULE_KEYWORDS otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) ) )* ) | otherlv_11= '/>' | otherlv_12= '>' ) )
            // InternalBPMN_translator.g:246:3: () ( ( (otherlv_1= '<' | otherlv_2= '</' ) this_HEAD_3= RULE_HEAD otherlv_4= ':' this_KEYWORDS_5= RULE_KEYWORDS ( (this_HEAD_6= RULE_HEAD otherlv_7= ':' ) | (this_KEYWORDS_8= RULE_KEYWORDS otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) ) )* ) | otherlv_11= '/>' | otherlv_12= '>' )
            {
            // InternalBPMN_translator.g:246:3: ()
            // InternalBPMN_translator.g:247:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSingletonAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalBPMN_translator.g:253:3: ( ( (otherlv_1= '<' | otherlv_2= '</' ) this_HEAD_3= RULE_HEAD otherlv_4= ':' this_KEYWORDS_5= RULE_KEYWORDS ( (this_HEAD_6= RULE_HEAD otherlv_7= ':' ) | (this_KEYWORDS_8= RULE_KEYWORDS otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) ) )* ) | otherlv_11= '/>' | otherlv_12= '>' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 14:
            case 15:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalBPMN_translator.g:254:4: ( (otherlv_1= '<' | otherlv_2= '</' ) this_HEAD_3= RULE_HEAD otherlv_4= ':' this_KEYWORDS_5= RULE_KEYWORDS ( (this_HEAD_6= RULE_HEAD otherlv_7= ':' ) | (this_KEYWORDS_8= RULE_KEYWORDS otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) ) )* )
                    {
                    // InternalBPMN_translator.g:254:4: ( (otherlv_1= '<' | otherlv_2= '</' ) this_HEAD_3= RULE_HEAD otherlv_4= ':' this_KEYWORDS_5= RULE_KEYWORDS ( (this_HEAD_6= RULE_HEAD otherlv_7= ':' ) | (this_KEYWORDS_8= RULE_KEYWORDS otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) ) )* )
                    // InternalBPMN_translator.g:255:5: (otherlv_1= '<' | otherlv_2= '</' ) this_HEAD_3= RULE_HEAD otherlv_4= ':' this_KEYWORDS_5= RULE_KEYWORDS ( (this_HEAD_6= RULE_HEAD otherlv_7= ':' ) | (this_KEYWORDS_8= RULE_KEYWORDS otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) ) )*
                    {
                    // InternalBPMN_translator.g:255:5: (otherlv_1= '<' | otherlv_2= '</' )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==14) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==15) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalBPMN_translator.g:256:6: otherlv_1= '<'
                            {
                            otherlv_1=(Token)match(input,14,FOLLOW_4); 

                            						newLeafNode(otherlv_1, grammarAccess.getSingletonAccess().getLessThanSignKeyword_1_0_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalBPMN_translator.g:261:6: otherlv_2= '</'
                            {
                            otherlv_2=(Token)match(input,15,FOLLOW_4); 

                            						newLeafNode(otherlv_2, grammarAccess.getSingletonAccess().getLessThanSignSolidusKeyword_1_0_0_1());
                            					

                            }
                            break;

                    }

                    this_HEAD_3=(Token)match(input,RULE_HEAD,FOLLOW_5); 

                    					newLeafNode(this_HEAD_3, grammarAccess.getSingletonAccess().getHEADTerminalRuleCall_1_0_1());
                    				
                    otherlv_4=(Token)match(input,16,FOLLOW_6); 

                    					newLeafNode(otherlv_4, grammarAccess.getSingletonAccess().getColonKeyword_1_0_2());
                    				
                    this_KEYWORDS_5=(Token)match(input,RULE_KEYWORDS,FOLLOW_7); 

                    					newLeafNode(this_KEYWORDS_5, grammarAccess.getSingletonAccess().getKEYWORDSTerminalRuleCall_1_0_3());
                    				
                    // InternalBPMN_translator.g:278:5: ( (this_HEAD_6= RULE_HEAD otherlv_7= ':' ) | (this_KEYWORDS_8= RULE_KEYWORDS otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_KEYWORDS) ) {
                            int LA5_2 = input.LA(2);

                            if ( (LA5_2==17) ) {
                                alt5=2;
                            }


                        }
                        else if ( (LA5_0==RULE_HEAD) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBPMN_translator.g:279:6: (this_HEAD_6= RULE_HEAD otherlv_7= ':' )
                    	    {
                    	    // InternalBPMN_translator.g:279:6: (this_HEAD_6= RULE_HEAD otherlv_7= ':' )
                    	    // InternalBPMN_translator.g:280:7: this_HEAD_6= RULE_HEAD otherlv_7= ':'
                    	    {
                    	    this_HEAD_6=(Token)match(input,RULE_HEAD,FOLLOW_5); 

                    	    							newLeafNode(this_HEAD_6, grammarAccess.getSingletonAccess().getHEADTerminalRuleCall_1_0_4_0_0());
                    	    						
                    	    otherlv_7=(Token)match(input,16,FOLLOW_7); 

                    	    							newLeafNode(otherlv_7, grammarAccess.getSingletonAccess().getColonKeyword_1_0_4_0_1());
                    	    						

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBPMN_translator.g:290:6: (this_KEYWORDS_8= RULE_KEYWORDS otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) )
                    	    {
                    	    // InternalBPMN_translator.g:290:6: (this_KEYWORDS_8= RULE_KEYWORDS otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) ) )
                    	    // InternalBPMN_translator.g:291:7: this_KEYWORDS_8= RULE_KEYWORDS otherlv_9= '=' ( (lv_value_10_0= RULE_STRING ) )
                    	    {
                    	    this_KEYWORDS_8=(Token)match(input,RULE_KEYWORDS,FOLLOW_8); 

                    	    							newLeafNode(this_KEYWORDS_8, grammarAccess.getSingletonAccess().getKEYWORDSTerminalRuleCall_1_0_4_1_0());
                    	    						
                    	    otherlv_9=(Token)match(input,17,FOLLOW_9); 

                    	    							newLeafNode(otherlv_9, grammarAccess.getSingletonAccess().getEqualsSignKeyword_1_0_4_1_1());
                    	    						
                    	    // InternalBPMN_translator.g:299:7: ( (lv_value_10_0= RULE_STRING ) )
                    	    // InternalBPMN_translator.g:300:8: (lv_value_10_0= RULE_STRING )
                    	    {
                    	    // InternalBPMN_translator.g:300:8: (lv_value_10_0= RULE_STRING )
                    	    // InternalBPMN_translator.g:301:9: lv_value_10_0= RULE_STRING
                    	    {
                    	    lv_value_10_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    	    									newLeafNode(lv_value_10_0, grammarAccess.getSingletonAccess().getValueSTRINGTerminalRuleCall_1_0_4_1_2_0());
                    	    								

                    	    									if (current==null) {
                    	    										current = createModelElement(grammarAccess.getSingletonRule());
                    	    									}
                    	    									addWithLastConsumed(
                    	    										current,
                    	    										"value",
                    	    										lv_value_10_0,
                    	    										"org.eclipse.xtext.common.Terminals.STRING");
                    	    								

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:321:4: otherlv_11= '/>'
                    {
                    otherlv_11=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getSingletonAccess().getSolidusGreaterThanSignKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalBPMN_translator.g:326:4: otherlv_12= '>'
                    {
                    otherlv_12=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getSingletonAccess().getGreaterThanSignKeyword_1_2());
                    			

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
    // $ANTLR end "ruleSingleton"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000CC072L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000000A2L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});

}