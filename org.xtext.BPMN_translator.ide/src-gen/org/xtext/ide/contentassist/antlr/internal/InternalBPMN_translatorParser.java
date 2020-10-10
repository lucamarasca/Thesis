package org.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.services.BPMN_translatorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBPMN_translatorParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HEAD", "RULE_KEYWORDS", "RULE_BODY", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'/>'", "'>'", "'<'", "'</'", "':'", "'='"
    };
    public static final int RULE_STRING=7;
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
    public static final int RULE_BODY=6;
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

    	public void setGrammarAccess(BPMN_translatorGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalBPMN_translator.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:54:1: ( ruleModel EOF )
            // InternalBPMN_translator.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBPMN_translator.g:62:1: ruleModel : ( ( rule__Model__ModelAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:66:2: ( ( ( rule__Model__ModelAssignment ) ) )
            // InternalBPMN_translator.g:67:2: ( ( rule__Model__ModelAssignment ) )
            {
            // InternalBPMN_translator.g:67:2: ( ( rule__Model__ModelAssignment ) )
            // InternalBPMN_translator.g:68:3: ( rule__Model__ModelAssignment )
            {
             before(grammarAccess.getModelAccess().getModelAssignment()); 
            // InternalBPMN_translator.g:69:3: ( rule__Model__ModelAssignment )
            // InternalBPMN_translator.g:69:4: rule__Model__ModelAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__ModelAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getModelAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleXml"
    // InternalBPMN_translator.g:78:1: entryRuleXml : ruleXml EOF ;
    public final void entryRuleXml() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:79:1: ( ruleXml EOF )
            // InternalBPMN_translator.g:80:1: ruleXml EOF
            {
             before(grammarAccess.getXmlRule()); 
            pushFollow(FOLLOW_1);
            ruleXml();

            state._fsp--;

             after(grammarAccess.getXmlRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXml"


    // $ANTLR start "ruleXml"
    // InternalBPMN_translator.g:87:1: ruleXml : ( ( rule__Xml__Group__0 ) ) ;
    public final void ruleXml() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:91:2: ( ( ( rule__Xml__Group__0 ) ) )
            // InternalBPMN_translator.g:92:2: ( ( rule__Xml__Group__0 ) )
            {
            // InternalBPMN_translator.g:92:2: ( ( rule__Xml__Group__0 ) )
            // InternalBPMN_translator.g:93:3: ( rule__Xml__Group__0 )
            {
             before(grammarAccess.getXmlAccess().getGroup()); 
            // InternalBPMN_translator.g:94:3: ( rule__Xml__Group__0 )
            // InternalBPMN_translator.g:94:4: rule__Xml__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Xml__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXmlAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXml"


    // $ANTLR start "entryRuleTag"
    // InternalBPMN_translator.g:103:1: entryRuleTag : ruleTag EOF ;
    public final void entryRuleTag() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:104:1: ( ruleTag EOF )
            // InternalBPMN_translator.g:105:1: ruleTag EOF
            {
             before(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getTagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalBPMN_translator.g:112:1: ruleTag : ( ( rule__Tag__Alternatives ) ) ;
    public final void ruleTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:116:2: ( ( ( rule__Tag__Alternatives ) ) )
            // InternalBPMN_translator.g:117:2: ( ( rule__Tag__Alternatives ) )
            {
            // InternalBPMN_translator.g:117:2: ( ( rule__Tag__Alternatives ) )
            // InternalBPMN_translator.g:118:3: ( rule__Tag__Alternatives )
            {
             before(grammarAccess.getTagAccess().getAlternatives()); 
            // InternalBPMN_translator.g:119:3: ( rule__Tag__Alternatives )
            // InternalBPMN_translator.g:119:4: rule__Tag__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Tag__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleSingleton"
    // InternalBPMN_translator.g:128:1: entryRuleSingleton : ruleSingleton EOF ;
    public final void entryRuleSingleton() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:129:1: ( ruleSingleton EOF )
            // InternalBPMN_translator.g:130:1: ruleSingleton EOF
            {
             before(grammarAccess.getSingletonRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleton();

            state._fsp--;

             after(grammarAccess.getSingletonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleton"


    // $ANTLR start "ruleSingleton"
    // InternalBPMN_translator.g:137:1: ruleSingleton : ( ( rule__Singleton__Group__0 ) ) ;
    public final void ruleSingleton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:141:2: ( ( ( rule__Singleton__Group__0 ) ) )
            // InternalBPMN_translator.g:142:2: ( ( rule__Singleton__Group__0 ) )
            {
            // InternalBPMN_translator.g:142:2: ( ( rule__Singleton__Group__0 ) )
            // InternalBPMN_translator.g:143:3: ( rule__Singleton__Group__0 )
            {
             before(grammarAccess.getSingletonAccess().getGroup()); 
            // InternalBPMN_translator.g:144:3: ( rule__Singleton__Group__0 )
            // InternalBPMN_translator.g:144:4: rule__Singleton__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Singleton__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingletonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleton"


    // $ANTLR start "rule__Tag__Alternatives"
    // InternalBPMN_translator.g:152:1: rule__Tag__Alternatives : ( ( ruleSingleton ) | ( ( rule__Tag__Alternatives_1 ) ) | ( ( rule__Tag__ResultAssignment_2 ) ) );
    public final void rule__Tag__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:156:1: ( ( ruleSingleton ) | ( ( rule__Tag__Alternatives_1 ) ) | ( ( rule__Tag__ResultAssignment_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 14:
            case 15:
            case 16:
            case 17:
                {
                alt1=1;
                }
                break;
            case RULE_KEYWORDS:
            case RULE_BODY:
                {
                alt1=2;
                }
                break;
            case RULE_STRING:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalBPMN_translator.g:157:2: ( ruleSingleton )
                    {
                    // InternalBPMN_translator.g:157:2: ( ruleSingleton )
                    // InternalBPMN_translator.g:158:3: ruleSingleton
                    {
                     before(grammarAccess.getTagAccess().getSingletonParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSingleton();

                    state._fsp--;

                     after(grammarAccess.getTagAccess().getSingletonParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:163:2: ( ( rule__Tag__Alternatives_1 ) )
                    {
                    // InternalBPMN_translator.g:163:2: ( ( rule__Tag__Alternatives_1 ) )
                    // InternalBPMN_translator.g:164:3: ( rule__Tag__Alternatives_1 )
                    {
                     before(grammarAccess.getTagAccess().getAlternatives_1()); 
                    // InternalBPMN_translator.g:165:3: ( rule__Tag__Alternatives_1 )
                    // InternalBPMN_translator.g:165:4: rule__Tag__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tag__Alternatives_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTagAccess().getAlternatives_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBPMN_translator.g:169:2: ( ( rule__Tag__ResultAssignment_2 ) )
                    {
                    // InternalBPMN_translator.g:169:2: ( ( rule__Tag__ResultAssignment_2 ) )
                    // InternalBPMN_translator.g:170:3: ( rule__Tag__ResultAssignment_2 )
                    {
                     before(grammarAccess.getTagAccess().getResultAssignment_2()); 
                    // InternalBPMN_translator.g:171:3: ( rule__Tag__ResultAssignment_2 )
                    // InternalBPMN_translator.g:171:4: rule__Tag__ResultAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tag__ResultAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTagAccess().getResultAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Alternatives"


    // $ANTLR start "rule__Tag__Alternatives_1"
    // InternalBPMN_translator.g:179:1: rule__Tag__Alternatives_1 : ( ( ( rule__Tag__ResultAssignment_1_0 ) ) | ( ( rule__Tag__ResultAssignment_1_1 ) ) );
    public final void rule__Tag__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:183:1: ( ( ( rule__Tag__ResultAssignment_1_0 ) ) | ( ( rule__Tag__ResultAssignment_1_1 ) ) )
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
                    // InternalBPMN_translator.g:184:2: ( ( rule__Tag__ResultAssignment_1_0 ) )
                    {
                    // InternalBPMN_translator.g:184:2: ( ( rule__Tag__ResultAssignment_1_0 ) )
                    // InternalBPMN_translator.g:185:3: ( rule__Tag__ResultAssignment_1_0 )
                    {
                     before(grammarAccess.getTagAccess().getResultAssignment_1_0()); 
                    // InternalBPMN_translator.g:186:3: ( rule__Tag__ResultAssignment_1_0 )
                    // InternalBPMN_translator.g:186:4: rule__Tag__ResultAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tag__ResultAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTagAccess().getResultAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:190:2: ( ( rule__Tag__ResultAssignment_1_1 ) )
                    {
                    // InternalBPMN_translator.g:190:2: ( ( rule__Tag__ResultAssignment_1_1 ) )
                    // InternalBPMN_translator.g:191:3: ( rule__Tag__ResultAssignment_1_1 )
                    {
                     before(grammarAccess.getTagAccess().getResultAssignment_1_1()); 
                    // InternalBPMN_translator.g:192:3: ( rule__Tag__ResultAssignment_1_1 )
                    // InternalBPMN_translator.g:192:4: rule__Tag__ResultAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tag__ResultAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTagAccess().getResultAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Alternatives_1"


    // $ANTLR start "rule__Singleton__Alternatives_1"
    // InternalBPMN_translator.g:200:1: rule__Singleton__Alternatives_1 : ( ( ( rule__Singleton__Group_1_0__0 ) ) | ( '/>' ) | ( '>' ) );
    public final void rule__Singleton__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:204:1: ( ( ( rule__Singleton__Group_1_0__0 ) ) | ( '/>' ) | ( '>' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 16:
            case 17:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
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
                    // InternalBPMN_translator.g:205:2: ( ( rule__Singleton__Group_1_0__0 ) )
                    {
                    // InternalBPMN_translator.g:205:2: ( ( rule__Singleton__Group_1_0__0 ) )
                    // InternalBPMN_translator.g:206:3: ( rule__Singleton__Group_1_0__0 )
                    {
                     before(grammarAccess.getSingletonAccess().getGroup_1_0()); 
                    // InternalBPMN_translator.g:207:3: ( rule__Singleton__Group_1_0__0 )
                    // InternalBPMN_translator.g:207:4: rule__Singleton__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Singleton__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingletonAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:211:2: ( '/>' )
                    {
                    // InternalBPMN_translator.g:211:2: ( '/>' )
                    // InternalBPMN_translator.g:212:3: '/>'
                    {
                     before(grammarAccess.getSingletonAccess().getSolidusGreaterThanSignKeyword_1_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSingletonAccess().getSolidusGreaterThanSignKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBPMN_translator.g:217:2: ( '>' )
                    {
                    // InternalBPMN_translator.g:217:2: ( '>' )
                    // InternalBPMN_translator.g:218:3: '>'
                    {
                     before(grammarAccess.getSingletonAccess().getGreaterThanSignKeyword_1_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSingletonAccess().getGreaterThanSignKeyword_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__Alternatives_1"


    // $ANTLR start "rule__Singleton__Alternatives_1_0_0"
    // InternalBPMN_translator.g:227:1: rule__Singleton__Alternatives_1_0_0 : ( ( '<' ) | ( '</' ) );
    public final void rule__Singleton__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:231:1: ( ( '<' ) | ( '</' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBPMN_translator.g:232:2: ( '<' )
                    {
                    // InternalBPMN_translator.g:232:2: ( '<' )
                    // InternalBPMN_translator.g:233:3: '<'
                    {
                     before(grammarAccess.getSingletonAccess().getLessThanSignKeyword_1_0_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSingletonAccess().getLessThanSignKeyword_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:238:2: ( '</' )
                    {
                    // InternalBPMN_translator.g:238:2: ( '</' )
                    // InternalBPMN_translator.g:239:3: '</'
                    {
                     before(grammarAccess.getSingletonAccess().getLessThanSignSolidusKeyword_1_0_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSingletonAccess().getLessThanSignSolidusKeyword_1_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__Alternatives_1_0_0"


    // $ANTLR start "rule__Singleton__Alternatives_1_0_4"
    // InternalBPMN_translator.g:248:1: rule__Singleton__Alternatives_1_0_4 : ( ( ( rule__Singleton__Group_1_0_4_0__0 ) ) | ( ( rule__Singleton__Group_1_0_4_1__0 ) ) );
    public final void rule__Singleton__Alternatives_1_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:252:1: ( ( ( rule__Singleton__Group_1_0_4_0__0 ) ) | ( ( rule__Singleton__Group_1_0_4_1__0 ) ) )
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
                    // InternalBPMN_translator.g:253:2: ( ( rule__Singleton__Group_1_0_4_0__0 ) )
                    {
                    // InternalBPMN_translator.g:253:2: ( ( rule__Singleton__Group_1_0_4_0__0 ) )
                    // InternalBPMN_translator.g:254:3: ( rule__Singleton__Group_1_0_4_0__0 )
                    {
                     before(grammarAccess.getSingletonAccess().getGroup_1_0_4_0()); 
                    // InternalBPMN_translator.g:255:3: ( rule__Singleton__Group_1_0_4_0__0 )
                    // InternalBPMN_translator.g:255:4: rule__Singleton__Group_1_0_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Singleton__Group_1_0_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingletonAccess().getGroup_1_0_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:259:2: ( ( rule__Singleton__Group_1_0_4_1__0 ) )
                    {
                    // InternalBPMN_translator.g:259:2: ( ( rule__Singleton__Group_1_0_4_1__0 ) )
                    // InternalBPMN_translator.g:260:3: ( rule__Singleton__Group_1_0_4_1__0 )
                    {
                     before(grammarAccess.getSingletonAccess().getGroup_1_0_4_1()); 
                    // InternalBPMN_translator.g:261:3: ( rule__Singleton__Group_1_0_4_1__0 )
                    // InternalBPMN_translator.g:261:4: rule__Singleton__Group_1_0_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Singleton__Group_1_0_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingletonAccess().getGroup_1_0_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__Alternatives_1_0_4"


    // $ANTLR start "rule__Xml__Group__0"
    // InternalBPMN_translator.g:269:1: rule__Xml__Group__0 : rule__Xml__Group__0__Impl rule__Xml__Group__1 ;
    public final void rule__Xml__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:273:1: ( rule__Xml__Group__0__Impl rule__Xml__Group__1 )
            // InternalBPMN_translator.g:274:2: rule__Xml__Group__0__Impl rule__Xml__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Xml__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xml__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xml__Group__0"


    // $ANTLR start "rule__Xml__Group__0__Impl"
    // InternalBPMN_translator.g:281:1: rule__Xml__Group__0__Impl : ( () ) ;
    public final void rule__Xml__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:285:1: ( ( () ) )
            // InternalBPMN_translator.g:286:1: ( () )
            {
            // InternalBPMN_translator.g:286:1: ( () )
            // InternalBPMN_translator.g:287:2: ()
            {
             before(grammarAccess.getXmlAccess().getXmlAction_0()); 
            // InternalBPMN_translator.g:288:2: ()
            // InternalBPMN_translator.g:288:3: 
            {
            }

             after(grammarAccess.getXmlAccess().getXmlAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xml__Group__0__Impl"


    // $ANTLR start "rule__Xml__Group__1"
    // InternalBPMN_translator.g:296:1: rule__Xml__Group__1 : rule__Xml__Group__1__Impl ;
    public final void rule__Xml__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:300:1: ( rule__Xml__Group__1__Impl )
            // InternalBPMN_translator.g:301:2: rule__Xml__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Xml__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xml__Group__1"


    // $ANTLR start "rule__Xml__Group__1__Impl"
    // InternalBPMN_translator.g:307:1: rule__Xml__Group__1__Impl : ( ( rule__Xml__TagAssignment_1 )* ) ;
    public final void rule__Xml__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:311:1: ( ( ( rule__Xml__TagAssignment_1 )* ) )
            // InternalBPMN_translator.g:312:1: ( ( rule__Xml__TagAssignment_1 )* )
            {
            // InternalBPMN_translator.g:312:1: ( ( rule__Xml__TagAssignment_1 )* )
            // InternalBPMN_translator.g:313:2: ( rule__Xml__TagAssignment_1 )*
            {
             before(grammarAccess.getXmlAccess().getTagAssignment_1()); 
            // InternalBPMN_translator.g:314:2: ( rule__Xml__TagAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_KEYWORDS && LA6_0<=RULE_STRING)||(LA6_0>=14 && LA6_0<=17)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBPMN_translator.g:314:3: rule__Xml__TagAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Xml__TagAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getXmlAccess().getTagAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xml__Group__1__Impl"


    // $ANTLR start "rule__Singleton__Group__0"
    // InternalBPMN_translator.g:323:1: rule__Singleton__Group__0 : rule__Singleton__Group__0__Impl rule__Singleton__Group__1 ;
    public final void rule__Singleton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:327:1: ( rule__Singleton__Group__0__Impl rule__Singleton__Group__1 )
            // InternalBPMN_translator.g:328:2: rule__Singleton__Group__0__Impl rule__Singleton__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Singleton__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Singleton__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__Group__0"


    // $ANTLR start "rule__Singleton__Group__0__Impl"
    // InternalBPMN_translator.g:335:1: rule__Singleton__Group__0__Impl : ( () ) ;
    public final void rule__Singleton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:339:1: ( ( () ) )
            // InternalBPMN_translator.g:340:1: ( () )
            {
            // InternalBPMN_translator.g:340:1: ( () )
            // InternalBPMN_translator.g:341:2: ()
            {
             before(grammarAccess.getSingletonAccess().getActionAction_0()); 
            // InternalBPMN_translator.g:342:2: ()
            // InternalBPMN_translator.g:342:3: 
            {
            }

             after(grammarAccess.getSingletonAccess().getActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__Group__0__Impl"


    // $ANTLR start "rule__Singleton__Group__1"
    // InternalBPMN_translator.g:350:1: rule__Singleton__Group__1 : rule__Singleton__Group__1__Impl ;
    public final void rule__Singleton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:354:1: ( rule__Singleton__Group__1__Impl )
            // InternalBPMN_translator.g:355:2: rule__Singleton__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Singleton__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__Group__1"


    // $ANTLR start "rule__Singleton__Group__1__Impl"
    // InternalBPMN_translator.g:361:1: rule__Singleton__Group__1__Impl : ( ( rule__Singleton__Alternatives_1 ) ) ;
    public final void rule__Singleton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:365:1: ( ( ( rule__Singleton__Alternatives_1 ) ) )
            // InternalBPMN_translator.g:366:1: ( ( rule__Singleton__Alternatives_1 ) )
            {
            // InternalBPMN_translator.g:366:1: ( ( rule__Singleton__Alternatives_1 ) )
            // InternalBPMN_translator.g:367:2: ( rule__Singleton__Alternatives_1 )
            {
             before(grammarAccess.getSingletonAccess().getAlternatives_1()); 
            // InternalBPMN_translator.g:368:2: ( rule__Singleton__Alternatives_1 )
            // InternalBPMN_translator.g:368:3: rule__Singleton__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Singleton__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSingletonAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__Group__1__Impl"


    // $ANTLR start "rule__Singleton__Group_1_0__0"
    // InternalBPMN_translator.g:377:1: rule__Singleton__Group_1_0__0 : rule__Singleton__Group_1_0__0__Impl rule__Singleton__Group_1_0__1 ;
    public final void rule__Singleton__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:381:1: ( rule__Singleton__Group_1_0__0__Impl rule__Singleton__Group_1_0__1 )
            // InternalBPMN_translator.g:382:2: rule__Singleton__Group_1_0__0__Impl rule__Singleton__Group_1_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Singleton__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Singleton__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__Group_1_0__0"


    // $ANTLR start "rule__Singleton__Group_1_0__0__Impl"
    // InternalBPMN_translator.g:389:1: rule__Singleton__Group_1_0__0__Impl : ( ( rule__Singleton__Alternatives_1_0_0 ) ) ;
    public final void rule__Singleton__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:393:1: ( ( ( rule__Singleton__Alternatives_1_0_0 ) ) )
            // InternalBPMN_translator.g:394:1: ( ( rule__Singleton__Alternatives_1_0_0 ) )
            {
            // InternalBPMN_translator.g:394:1: ( ( rule__Singleton__Alternatives_1_0_0 ) )
            // InternalBPMN_translator.g:395:2: ( rule__Singleton__Alternatives_1_0_0 )
            {
             before(grammarAccess.getSingletonAccess().getAlternatives_1_0_0()); 
            // InternalBPMN_translator.g:396:2: ( rule__Singleton__Alternatives_1_0_0 )
            // InternalBPMN_translator.g:396:3: rule__Singleton__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Singleton__Alternatives_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSingletonAccess().getAlternatives_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__Group_1_0__0__Impl"


    // $ANTLR start "rule__Singleton__Group_1_0__1"
    // InternalBPMN_translator.g:404:1: rule__Singleton__Group_1_0__1 : rule__Singleton__Group_1_0__1__Impl rule__Singleton__Group_1_0__2 ;
    public final void rule__Singleton__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:408:1: ( rule__Singleton__Group_1_0__1__Impl rule__Singleton__Group_1_0__2 )
            // InternalBPMN_translator.g:409:2: rule__Singleton__Group_1_0__1__Impl rule__Singleton__Group_1_0__2
            {
            pushFollow(FOLLOW_7);
            rule__Singleton__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Singleton__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__Group_1_0__1"


    // $ANTLR start "rule__Singleton__Group_1_0__1__Impl"
    // InternalBPMN_translator.g:416:1: rule__Singleton__Group_1_0__1__Impl : ( RULE_HEAD ) ;
    public final void rule__Singleton__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:420:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:421:1: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:421:1: ( RULE_HEAD )
            // InternalBPMN_translator.g:422:2: RULE_HEAD
            {
             before(grammarAccess.getSingletonAccess().getHEADTerminalRuleCall_1_0_1()); 
            match(input,RULE_HEAD,FOLLOW_2); 
             after(grammarAccess.getSingletonAccess().getHEADTerminalRuleCall_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__Group_1_0__1__Impl"


    // $ANTLR start "rule__Singleton__Group_1_0__2"
    // InternalBPMN_translator.g:431:1: rule__Singleton__Group_1_0__2 : rule__Singleton__Group_1_0__2__Impl rule__Singleton__Group_1_0__3 ;
    public final void rule__Singleton__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:435:1: ( rule__Singleton__Group_1_0__2__Impl rule__Singleton__Group_1_0__3 )
            // InternalBPMN_translator.g:436:2: rule__Singleton__Group_1_0__2__Impl rule__Singleton__Group_1_0__3
            {
            pushFollow(FOLLOW_8);
            rule__Singleton__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Singleton__Group_1_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__Group_1_0__2"


    // $ANTLR start "rule__Singleton__Group_1_0__2__Impl"
    // InternalBPMN_translator.g:443:1: rule__Singleton__Group_1_0__2__Impl : ( ':' ) ;
    public final void rule__Singleton__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:447:1: ( ( ':' ) )
            // InternalBPMN_translator.g:448:1: ( ':' )
            {
            // InternalBPMN_translator.g:448:1: ( ':' )
            // InternalBPMN_translator.g:449:2: ':'
            {
             before(grammarAccess.getSingletonAccess().getColonKeyword_1_0_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSingletonAccess().getColonKeyword_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__Group_1_0__2__Impl"


    // $ANTLR start "rule__Singleton__Group_1_0__3"
    // InternalBPMN_translator.g:458:1: rule__Singleton__Group_1_0__3 : rule__Singleton__Group_1_0__3__Impl rule__Singleton__Group_1_0__4 ;
    public final void rule__Singleton__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:462:1: ( rule__Singleton__Group_1_0__3__Impl rule__Singleton__Group_1_0__4 )
            // InternalBPMN_translator.g:463:2: rule__Singleton__Group_1_0__3__Impl rule__Singleton__Group_1_0__4
            {
            pushFollow(FOLLOW_9);
            rule__Singleton__Group_1_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Singleton__Group_1_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__Group_1_0__3"


    // $ANTLR start "rule__Singleton__Group_1_0__3__Impl"
    // InternalBPMN_translator.g:470:1: rule__Singleton__Group_1_0__3__Impl : ( RULE_KEYWORDS ) ;
    public final void rule__Singleton__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:474:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:475:1: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:475:1: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:476:2: RULE_KEYWORDS
            {
             before(grammarAccess.getSingletonAccess().getKEYWORDSTerminalRuleCall_1_0_3()); 
            match(input,RULE_KEYWORDS,FOLLOW_2); 
             after(grammarAccess.getSingletonAccess().getKEYWORDSTerminalRuleCall_1_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__Group_1_0__3__Impl"


    // $ANTLR start "rule__Singleton__Group_1_0__4"
    // InternalBPMN_translator.g:485:1: rule__Singleton__Group_1_0__4 : rule__Singleton__Group_1_0__4__Impl ;
    public final void rule__Singleton__Group_1_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:489:1: ( rule__Singleton__Group_1_0__4__Impl )
            // InternalBPMN_translator.g:490:2: rule__Singleton__Group_1_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Singleton__Group_1_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__Group_1_0__4"


    // $ANTLR start "rule__Singleton__Group_1_0__4__Impl"
    // InternalBPMN_translator.g:496:1: rule__Singleton__Group_1_0__4__Impl : ( ( rule__Singleton__Alternatives_1_0_4 )* ) ;
    public final void rule__Singleton__Group_1_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:500:1: ( ( ( rule__Singleton__Alternatives_1_0_4 )* ) )
            // InternalBPMN_translator.g:501:1: ( ( rule__Singleton__Alternatives_1_0_4 )* )
            {
            // InternalBPMN_translator.g:501:1: ( ( rule__Singleton__Alternatives_1_0_4 )* )
            // InternalBPMN_translator.g:502:2: ( rule__Singleton__Alternatives_1_0_4 )*
            {
             before(grammarAccess.getSingletonAccess().getAlternatives_1_0_4()); 
            // InternalBPMN_translator.g:503:2: ( rule__Singleton__Alternatives_1_0_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_KEYWORDS) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==19) ) {
                        alt7=1;
                    }


                }
                else if ( (LA7_0==RULE_HEAD) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBPMN_translator.g:503:3: rule__Singleton__Alternatives_1_0_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Singleton__Alternatives_1_0_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSingletonAccess().getAlternatives_1_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__Group_1_0__4__Impl"


    // $ANTLR start "rule__Singleton__Group_1_0_4_0__0"
    // InternalBPMN_translator.g:512:1: rule__Singleton__Group_1_0_4_0__0 : rule__Singleton__Group_1_0_4_0__0__Impl rule__Singleton__Group_1_0_4_0__1 ;
    public final void rule__Singleton__Group_1_0_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:516:1: ( rule__Singleton__Group_1_0_4_0__0__Impl rule__Singleton__Group_1_0_4_0__1 )
            // InternalBPMN_translator.g:517:2: rule__Singleton__Group_1_0_4_0__0__Impl rule__Singleton__Group_1_0_4_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Singleton__Group_1_0_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Singleton__Group_1_0_4_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__Group_1_0_4_0__0"


    // $ANTLR start "rule__Singleton__Group_1_0_4_0__0__Impl"
    // InternalBPMN_translator.g:524:1: rule__Singleton__Group_1_0_4_0__0__Impl : ( RULE_HEAD ) ;
    public final void rule__Singleton__Group_1_0_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:528:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:529:1: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:529:1: ( RULE_HEAD )
            // InternalBPMN_translator.g:530:2: RULE_HEAD
            {
             before(grammarAccess.getSingletonAccess().getHEADTerminalRuleCall_1_0_4_0_0()); 
            match(input,RULE_HEAD,FOLLOW_2); 
             after(grammarAccess.getSingletonAccess().getHEADTerminalRuleCall_1_0_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__Group_1_0_4_0__0__Impl"


    // $ANTLR start "rule__Singleton__Group_1_0_4_0__1"
    // InternalBPMN_translator.g:539:1: rule__Singleton__Group_1_0_4_0__1 : rule__Singleton__Group_1_0_4_0__1__Impl ;
    public final void rule__Singleton__Group_1_0_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:543:1: ( rule__Singleton__Group_1_0_4_0__1__Impl )
            // InternalBPMN_translator.g:544:2: rule__Singleton__Group_1_0_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Singleton__Group_1_0_4_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__Group_1_0_4_0__1"


    // $ANTLR start "rule__Singleton__Group_1_0_4_0__1__Impl"
    // InternalBPMN_translator.g:550:1: rule__Singleton__Group_1_0_4_0__1__Impl : ( ':' ) ;
    public final void rule__Singleton__Group_1_0_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:554:1: ( ( ':' ) )
            // InternalBPMN_translator.g:555:1: ( ':' )
            {
            // InternalBPMN_translator.g:555:1: ( ':' )
            // InternalBPMN_translator.g:556:2: ':'
            {
             before(grammarAccess.getSingletonAccess().getColonKeyword_1_0_4_0_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSingletonAccess().getColonKeyword_1_0_4_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__Group_1_0_4_0__1__Impl"


    // $ANTLR start "rule__Singleton__Group_1_0_4_1__0"
    // InternalBPMN_translator.g:566:1: rule__Singleton__Group_1_0_4_1__0 : rule__Singleton__Group_1_0_4_1__0__Impl rule__Singleton__Group_1_0_4_1__1 ;
    public final void rule__Singleton__Group_1_0_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:570:1: ( rule__Singleton__Group_1_0_4_1__0__Impl rule__Singleton__Group_1_0_4_1__1 )
            // InternalBPMN_translator.g:571:2: rule__Singleton__Group_1_0_4_1__0__Impl rule__Singleton__Group_1_0_4_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Singleton__Group_1_0_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Singleton__Group_1_0_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__Group_1_0_4_1__0"


    // $ANTLR start "rule__Singleton__Group_1_0_4_1__0__Impl"
    // InternalBPMN_translator.g:578:1: rule__Singleton__Group_1_0_4_1__0__Impl : ( RULE_KEYWORDS ) ;
    public final void rule__Singleton__Group_1_0_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:582:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:583:1: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:583:1: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:584:2: RULE_KEYWORDS
            {
             before(grammarAccess.getSingletonAccess().getKEYWORDSTerminalRuleCall_1_0_4_1_0()); 
            match(input,RULE_KEYWORDS,FOLLOW_2); 
             after(grammarAccess.getSingletonAccess().getKEYWORDSTerminalRuleCall_1_0_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__Group_1_0_4_1__0__Impl"


    // $ANTLR start "rule__Singleton__Group_1_0_4_1__1"
    // InternalBPMN_translator.g:593:1: rule__Singleton__Group_1_0_4_1__1 : rule__Singleton__Group_1_0_4_1__1__Impl rule__Singleton__Group_1_0_4_1__2 ;
    public final void rule__Singleton__Group_1_0_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:597:1: ( rule__Singleton__Group_1_0_4_1__1__Impl rule__Singleton__Group_1_0_4_1__2 )
            // InternalBPMN_translator.g:598:2: rule__Singleton__Group_1_0_4_1__1__Impl rule__Singleton__Group_1_0_4_1__2
            {
            pushFollow(FOLLOW_12);
            rule__Singleton__Group_1_0_4_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Singleton__Group_1_0_4_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__Group_1_0_4_1__1"


    // $ANTLR start "rule__Singleton__Group_1_0_4_1__1__Impl"
    // InternalBPMN_translator.g:605:1: rule__Singleton__Group_1_0_4_1__1__Impl : ( '=' ) ;
    public final void rule__Singleton__Group_1_0_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:609:1: ( ( '=' ) )
            // InternalBPMN_translator.g:610:1: ( '=' )
            {
            // InternalBPMN_translator.g:610:1: ( '=' )
            // InternalBPMN_translator.g:611:2: '='
            {
             before(grammarAccess.getSingletonAccess().getEqualsSignKeyword_1_0_4_1_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSingletonAccess().getEqualsSignKeyword_1_0_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__Group_1_0_4_1__1__Impl"


    // $ANTLR start "rule__Singleton__Group_1_0_4_1__2"
    // InternalBPMN_translator.g:620:1: rule__Singleton__Group_1_0_4_1__2 : rule__Singleton__Group_1_0_4_1__2__Impl ;
    public final void rule__Singleton__Group_1_0_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:624:1: ( rule__Singleton__Group_1_0_4_1__2__Impl )
            // InternalBPMN_translator.g:625:2: rule__Singleton__Group_1_0_4_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Singleton__Group_1_0_4_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__Group_1_0_4_1__2"


    // $ANTLR start "rule__Singleton__Group_1_0_4_1__2__Impl"
    // InternalBPMN_translator.g:631:1: rule__Singleton__Group_1_0_4_1__2__Impl : ( ( rule__Singleton__ValueAssignment_1_0_4_1_2 ) ) ;
    public final void rule__Singleton__Group_1_0_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:635:1: ( ( ( rule__Singleton__ValueAssignment_1_0_4_1_2 ) ) )
            // InternalBPMN_translator.g:636:1: ( ( rule__Singleton__ValueAssignment_1_0_4_1_2 ) )
            {
            // InternalBPMN_translator.g:636:1: ( ( rule__Singleton__ValueAssignment_1_0_4_1_2 ) )
            // InternalBPMN_translator.g:637:2: ( rule__Singleton__ValueAssignment_1_0_4_1_2 )
            {
             before(grammarAccess.getSingletonAccess().getValueAssignment_1_0_4_1_2()); 
            // InternalBPMN_translator.g:638:2: ( rule__Singleton__ValueAssignment_1_0_4_1_2 )
            // InternalBPMN_translator.g:638:3: rule__Singleton__ValueAssignment_1_0_4_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Singleton__ValueAssignment_1_0_4_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSingletonAccess().getValueAssignment_1_0_4_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__Group_1_0_4_1__2__Impl"


    // $ANTLR start "rule__Model__ModelAssignment"
    // InternalBPMN_translator.g:647:1: rule__Model__ModelAssignment : ( ruleXml ) ;
    public final void rule__Model__ModelAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:651:1: ( ( ruleXml ) )
            // InternalBPMN_translator.g:652:2: ( ruleXml )
            {
            // InternalBPMN_translator.g:652:2: ( ruleXml )
            // InternalBPMN_translator.g:653:3: ruleXml
            {
             before(grammarAccess.getModelAccess().getModelXmlParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleXml();

            state._fsp--;

             after(grammarAccess.getModelAccess().getModelXmlParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ModelAssignment"


    // $ANTLR start "rule__Xml__TagAssignment_1"
    // InternalBPMN_translator.g:662:1: rule__Xml__TagAssignment_1 : ( ruleTag ) ;
    public final void rule__Xml__TagAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:666:1: ( ( ruleTag ) )
            // InternalBPMN_translator.g:667:2: ( ruleTag )
            {
            // InternalBPMN_translator.g:667:2: ( ruleTag )
            // InternalBPMN_translator.g:668:3: ruleTag
            {
             before(grammarAccess.getXmlAccess().getTagTagParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getXmlAccess().getTagTagParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xml__TagAssignment_1"


    // $ANTLR start "rule__Tag__ResultAssignment_1_0"
    // InternalBPMN_translator.g:677:1: rule__Tag__ResultAssignment_1_0 : ( RULE_BODY ) ;
    public final void rule__Tag__ResultAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:681:1: ( ( RULE_BODY ) )
            // InternalBPMN_translator.g:682:2: ( RULE_BODY )
            {
            // InternalBPMN_translator.g:682:2: ( RULE_BODY )
            // InternalBPMN_translator.g:683:3: RULE_BODY
            {
             before(grammarAccess.getTagAccess().getResultBODYTerminalRuleCall_1_0_0()); 
            match(input,RULE_BODY,FOLLOW_2); 
             after(grammarAccess.getTagAccess().getResultBODYTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__ResultAssignment_1_0"


    // $ANTLR start "rule__Tag__ResultAssignment_1_1"
    // InternalBPMN_translator.g:692:1: rule__Tag__ResultAssignment_1_1 : ( RULE_KEYWORDS ) ;
    public final void rule__Tag__ResultAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:696:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:697:2: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:697:2: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:698:3: RULE_KEYWORDS
            {
             before(grammarAccess.getTagAccess().getResultKEYWORDSTerminalRuleCall_1_1_0()); 
            match(input,RULE_KEYWORDS,FOLLOW_2); 
             after(grammarAccess.getTagAccess().getResultKEYWORDSTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__ResultAssignment_1_1"


    // $ANTLR start "rule__Tag__ResultAssignment_2"
    // InternalBPMN_translator.g:707:1: rule__Tag__ResultAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Tag__ResultAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:711:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:712:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:712:2: ( RULE_STRING )
            // InternalBPMN_translator.g:713:3: RULE_STRING
            {
             before(grammarAccess.getTagAccess().getResultSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTagAccess().getResultSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__ResultAssignment_2"


    // $ANTLR start "rule__Singleton__ValueAssignment_1_0_4_1_2"
    // InternalBPMN_translator.g:722:1: rule__Singleton__ValueAssignment_1_0_4_1_2 : ( RULE_STRING ) ;
    public final void rule__Singleton__ValueAssignment_1_0_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:726:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:727:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:727:2: ( RULE_STRING )
            // InternalBPMN_translator.g:728:3: RULE_STRING
            {
             before(grammarAccess.getSingletonAccess().getValueSTRINGTerminalRuleCall_1_0_4_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSingletonAccess().getValueSTRINGTerminalRuleCall_1_0_4_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Singleton__ValueAssignment_1_0_4_1_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000003C0E0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000003C0E2L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});

}