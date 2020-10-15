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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BODY", "RULE_KEYWORDS", "RULE_STRING", "RULE_HEAD", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'/>'", "'<'", "':'", "'='", "'>'", "'</'"
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


    // $ANTLR start "entryRuleOpening"
    // InternalBPMN_translator.g:103:1: entryRuleOpening : ruleOpening EOF ;
    public final void entryRuleOpening() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:104:1: ( ruleOpening EOF )
            // InternalBPMN_translator.g:105:1: ruleOpening EOF
            {
             before(grammarAccess.getOpeningRule()); 
            pushFollow(FOLLOW_1);
            ruleOpening();

            state._fsp--;

             after(grammarAccess.getOpeningRule()); 
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
    // $ANTLR end "entryRuleOpening"


    // $ANTLR start "ruleOpening"
    // InternalBPMN_translator.g:112:1: ruleOpening : ( ( rule__Opening__Alternatives ) ) ;
    public final void ruleOpening() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:116:2: ( ( ( rule__Opening__Alternatives ) ) )
            // InternalBPMN_translator.g:117:2: ( ( rule__Opening__Alternatives ) )
            {
            // InternalBPMN_translator.g:117:2: ( ( rule__Opening__Alternatives ) )
            // InternalBPMN_translator.g:118:3: ( rule__Opening__Alternatives )
            {
             before(grammarAccess.getOpeningAccess().getAlternatives()); 
            // InternalBPMN_translator.g:119:3: ( rule__Opening__Alternatives )
            // InternalBPMN_translator.g:119:4: rule__Opening__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Opening__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOpening"


    // $ANTLR start "entryRuleData"
    // InternalBPMN_translator.g:128:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:129:1: ( ruleData EOF )
            // InternalBPMN_translator.g:130:1: ruleData EOF
            {
             before(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataRule()); 
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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalBPMN_translator.g:137:1: ruleData : ( ( rule__Data__Alternatives ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:141:2: ( ( ( rule__Data__Alternatives ) ) )
            // InternalBPMN_translator.g:142:2: ( ( rule__Data__Alternatives ) )
            {
            // InternalBPMN_translator.g:142:2: ( ( rule__Data__Alternatives ) )
            // InternalBPMN_translator.g:143:3: ( rule__Data__Alternatives )
            {
             before(grammarAccess.getDataAccess().getAlternatives()); 
            // InternalBPMN_translator.g:144:3: ( rule__Data__Alternatives )
            // InternalBPMN_translator.g:144:4: rule__Data__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Data__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getAlternatives()); 

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
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleOpen"
    // InternalBPMN_translator.g:153:1: entryRuleOpen : ruleOpen EOF ;
    public final void entryRuleOpen() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:154:1: ( ruleOpen EOF )
            // InternalBPMN_translator.g:155:1: ruleOpen EOF
            {
             before(grammarAccess.getOpenRule()); 
            pushFollow(FOLLOW_1);
            ruleOpen();

            state._fsp--;

             after(grammarAccess.getOpenRule()); 
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
    // $ANTLR end "entryRuleOpen"


    // $ANTLR start "ruleOpen"
    // InternalBPMN_translator.g:162:1: ruleOpen : ( ( rule__Open__Group__0 ) ) ;
    public final void ruleOpen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:166:2: ( ( ( rule__Open__Group__0 ) ) )
            // InternalBPMN_translator.g:167:2: ( ( rule__Open__Group__0 ) )
            {
            // InternalBPMN_translator.g:167:2: ( ( rule__Open__Group__0 ) )
            // InternalBPMN_translator.g:168:3: ( rule__Open__Group__0 )
            {
             before(grammarAccess.getOpenAccess().getGroup()); 
            // InternalBPMN_translator.g:169:3: ( rule__Open__Group__0 )
            // InternalBPMN_translator.g:169:4: rule__Open__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Open__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpenAccess().getGroup()); 

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
    // $ANTLR end "ruleOpen"


    // $ANTLR start "entryRuleClose"
    // InternalBPMN_translator.g:178:1: entryRuleClose : ruleClose EOF ;
    public final void entryRuleClose() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:179:1: ( ruleClose EOF )
            // InternalBPMN_translator.g:180:1: ruleClose EOF
            {
             before(grammarAccess.getCloseRule()); 
            pushFollow(FOLLOW_1);
            ruleClose();

            state._fsp--;

             after(grammarAccess.getCloseRule()); 
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
    // $ANTLR end "entryRuleClose"


    // $ANTLR start "ruleClose"
    // InternalBPMN_translator.g:187:1: ruleClose : ( ( rule__Close__Group__0 ) ) ;
    public final void ruleClose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:191:2: ( ( ( rule__Close__Group__0 ) ) )
            // InternalBPMN_translator.g:192:2: ( ( rule__Close__Group__0 ) )
            {
            // InternalBPMN_translator.g:192:2: ( ( rule__Close__Group__0 ) )
            // InternalBPMN_translator.g:193:3: ( rule__Close__Group__0 )
            {
             before(grammarAccess.getCloseAccess().getGroup()); 
            // InternalBPMN_translator.g:194:3: ( rule__Close__Group__0 )
            // InternalBPMN_translator.g:194:4: rule__Close__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Close__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCloseAccess().getGroup()); 

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
    // $ANTLR end "ruleClose"


    // $ANTLR start "rule__Opening__Alternatives"
    // InternalBPMN_translator.g:202:1: rule__Opening__Alternatives : ( ( ( rule__Opening__Group_0__0 ) ) | ( ( rule__Opening__Group_1__0 ) ) );
    public final void rule__Opening__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:206:1: ( ( ( rule__Opening__Group_0__0 ) ) | ( ( rule__Opening__Group_1__0 ) ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalBPMN_translator.g:207:2: ( ( rule__Opening__Group_0__0 ) )
                    {
                    // InternalBPMN_translator.g:207:2: ( ( rule__Opening__Group_0__0 ) )
                    // InternalBPMN_translator.g:208:3: ( rule__Opening__Group_0__0 )
                    {
                     before(grammarAccess.getOpeningAccess().getGroup_0()); 
                    // InternalBPMN_translator.g:209:3: ( rule__Opening__Group_0__0 )
                    // InternalBPMN_translator.g:209:4: rule__Opening__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Opening__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpeningAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:213:2: ( ( rule__Opening__Group_1__0 ) )
                    {
                    // InternalBPMN_translator.g:213:2: ( ( rule__Opening__Group_1__0 ) )
                    // InternalBPMN_translator.g:214:3: ( rule__Opening__Group_1__0 )
                    {
                     before(grammarAccess.getOpeningAccess().getGroup_1()); 
                    // InternalBPMN_translator.g:215:3: ( rule__Opening__Group_1__0 )
                    // InternalBPMN_translator.g:215:4: rule__Opening__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Opening__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpeningAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Opening__Alternatives"


    // $ANTLR start "rule__Opening__Alternatives_0_1_2_0_4"
    // InternalBPMN_translator.g:223:1: rule__Opening__Alternatives_0_1_2_0_4 : ( ( ( rule__Opening__Group_0_1_2_0_4_0__0 ) ) | ( ( rule__Opening__Group_0_1_2_0_4_1__0 ) ) );
    public final void rule__Opening__Alternatives_0_1_2_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:227:1: ( ( ( rule__Opening__Group_0_1_2_0_4_0__0 ) ) | ( ( rule__Opening__Group_0_1_2_0_4_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_HEAD) ) {
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
                    // InternalBPMN_translator.g:228:2: ( ( rule__Opening__Group_0_1_2_0_4_0__0 ) )
                    {
                    // InternalBPMN_translator.g:228:2: ( ( rule__Opening__Group_0_1_2_0_4_0__0 ) )
                    // InternalBPMN_translator.g:229:3: ( rule__Opening__Group_0_1_2_0_4_0__0 )
                    {
                     before(grammarAccess.getOpeningAccess().getGroup_0_1_2_0_4_0()); 
                    // InternalBPMN_translator.g:230:3: ( rule__Opening__Group_0_1_2_0_4_0__0 )
                    // InternalBPMN_translator.g:230:4: rule__Opening__Group_0_1_2_0_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Opening__Group_0_1_2_0_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpeningAccess().getGroup_0_1_2_0_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:234:2: ( ( rule__Opening__Group_0_1_2_0_4_1__0 ) )
                    {
                    // InternalBPMN_translator.g:234:2: ( ( rule__Opening__Group_0_1_2_0_4_1__0 ) )
                    // InternalBPMN_translator.g:235:3: ( rule__Opening__Group_0_1_2_0_4_1__0 )
                    {
                     before(grammarAccess.getOpeningAccess().getGroup_0_1_2_0_4_1()); 
                    // InternalBPMN_translator.g:236:3: ( rule__Opening__Group_0_1_2_0_4_1__0 )
                    // InternalBPMN_translator.g:236:4: rule__Opening__Group_0_1_2_0_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Opening__Group_0_1_2_0_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpeningAccess().getGroup_0_1_2_0_4_1()); 

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
    // $ANTLR end "rule__Opening__Alternatives_0_1_2_0_4"


    // $ANTLR start "rule__Opening__Alternatives_1_1_0_4"
    // InternalBPMN_translator.g:244:1: rule__Opening__Alternatives_1_1_0_4 : ( ( ( rule__Opening__Group_1_1_0_4_0__0 ) ) | ( ( rule__Opening__Group_1_1_0_4_1__0 ) ) );
    public final void rule__Opening__Alternatives_1_1_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:248:1: ( ( ( rule__Opening__Group_1_1_0_4_0__0 ) ) | ( ( rule__Opening__Group_1_1_0_4_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_HEAD) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_KEYWORDS) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBPMN_translator.g:249:2: ( ( rule__Opening__Group_1_1_0_4_0__0 ) )
                    {
                    // InternalBPMN_translator.g:249:2: ( ( rule__Opening__Group_1_1_0_4_0__0 ) )
                    // InternalBPMN_translator.g:250:3: ( rule__Opening__Group_1_1_0_4_0__0 )
                    {
                     before(grammarAccess.getOpeningAccess().getGroup_1_1_0_4_0()); 
                    // InternalBPMN_translator.g:251:3: ( rule__Opening__Group_1_1_0_4_0__0 )
                    // InternalBPMN_translator.g:251:4: rule__Opening__Group_1_1_0_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Opening__Group_1_1_0_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpeningAccess().getGroup_1_1_0_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:255:2: ( ( rule__Opening__Group_1_1_0_4_1__0 ) )
                    {
                    // InternalBPMN_translator.g:255:2: ( ( rule__Opening__Group_1_1_0_4_1__0 ) )
                    // InternalBPMN_translator.g:256:3: ( rule__Opening__Group_1_1_0_4_1__0 )
                    {
                     before(grammarAccess.getOpeningAccess().getGroup_1_1_0_4_1()); 
                    // InternalBPMN_translator.g:257:3: ( rule__Opening__Group_1_1_0_4_1__0 )
                    // InternalBPMN_translator.g:257:4: rule__Opening__Group_1_1_0_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Opening__Group_1_1_0_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpeningAccess().getGroup_1_1_0_4_1()); 

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
    // $ANTLR end "rule__Opening__Alternatives_1_1_0_4"


    // $ANTLR start "rule__Data__Alternatives"
    // InternalBPMN_translator.g:265:1: rule__Data__Alternatives : ( ( RULE_BODY ) | ( RULE_KEYWORDS ) | ( RULE_STRING ) );
    public final void rule__Data__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:269:1: ( ( RULE_BODY ) | ( RULE_KEYWORDS ) | ( RULE_STRING ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_BODY:
                {
                alt4=1;
                }
                break;
            case RULE_KEYWORDS:
                {
                alt4=2;
                }
                break;
            case RULE_STRING:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalBPMN_translator.g:270:2: ( RULE_BODY )
                    {
                    // InternalBPMN_translator.g:270:2: ( RULE_BODY )
                    // InternalBPMN_translator.g:271:3: RULE_BODY
                    {
                     before(grammarAccess.getDataAccess().getBODYTerminalRuleCall_0()); 
                    match(input,RULE_BODY,FOLLOW_2); 
                     after(grammarAccess.getDataAccess().getBODYTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:276:2: ( RULE_KEYWORDS )
                    {
                    // InternalBPMN_translator.g:276:2: ( RULE_KEYWORDS )
                    // InternalBPMN_translator.g:277:3: RULE_KEYWORDS
                    {
                     before(grammarAccess.getDataAccess().getKEYWORDSTerminalRuleCall_1()); 
                    match(input,RULE_KEYWORDS,FOLLOW_2); 
                     after(grammarAccess.getDataAccess().getKEYWORDSTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBPMN_translator.g:282:2: ( RULE_STRING )
                    {
                    // InternalBPMN_translator.g:282:2: ( RULE_STRING )
                    // InternalBPMN_translator.g:283:3: RULE_STRING
                    {
                     before(grammarAccess.getDataAccess().getSTRINGTerminalRuleCall_2()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getDataAccess().getSTRINGTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Data__Alternatives"


    // $ANTLR start "rule__Open__Alternatives_1_4"
    // InternalBPMN_translator.g:292:1: rule__Open__Alternatives_1_4 : ( ( ( rule__Open__Group_1_4_0__0 ) ) | ( ( rule__Open__Group_1_4_1__0 ) ) );
    public final void rule__Open__Alternatives_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:296:1: ( ( ( rule__Open__Group_1_4_0__0 ) ) | ( ( rule__Open__Group_1_4_1__0 ) ) )
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
                    // InternalBPMN_translator.g:297:2: ( ( rule__Open__Group_1_4_0__0 ) )
                    {
                    // InternalBPMN_translator.g:297:2: ( ( rule__Open__Group_1_4_0__0 ) )
                    // InternalBPMN_translator.g:298:3: ( rule__Open__Group_1_4_0__0 )
                    {
                     before(grammarAccess.getOpenAccess().getGroup_1_4_0()); 
                    // InternalBPMN_translator.g:299:3: ( rule__Open__Group_1_4_0__0 )
                    // InternalBPMN_translator.g:299:4: rule__Open__Group_1_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Open__Group_1_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpenAccess().getGroup_1_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:303:2: ( ( rule__Open__Group_1_4_1__0 ) )
                    {
                    // InternalBPMN_translator.g:303:2: ( ( rule__Open__Group_1_4_1__0 ) )
                    // InternalBPMN_translator.g:304:3: ( rule__Open__Group_1_4_1__0 )
                    {
                     before(grammarAccess.getOpenAccess().getGroup_1_4_1()); 
                    // InternalBPMN_translator.g:305:3: ( rule__Open__Group_1_4_1__0 )
                    // InternalBPMN_translator.g:305:4: rule__Open__Group_1_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Open__Group_1_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpenAccess().getGroup_1_4_1()); 

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
    // $ANTLR end "rule__Open__Alternatives_1_4"


    // $ANTLR start "rule__Open__Alternatives_2"
    // InternalBPMN_translator.g:313:1: rule__Open__Alternatives_2 : ( ( ruleData ) | ( ( rule__Open__ProvaAssignment_2_1 ) ) );
    public final void rule__Open__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:317:1: ( ( ruleData ) | ( ( rule__Open__ProvaAssignment_2_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_BODY && LA6_0<=RULE_STRING)) ) {
                alt6=1;
            }
            else if ( (LA6_0==EOF||LA6_0==15||LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBPMN_translator.g:318:2: ( ruleData )
                    {
                    // InternalBPMN_translator.g:318:2: ( ruleData )
                    // InternalBPMN_translator.g:319:3: ruleData
                    {
                     before(grammarAccess.getOpenAccess().getDataParserRuleCall_2_0()); 
                    pushFollow(FOLLOW_2);
                    ruleData();

                    state._fsp--;

                     after(grammarAccess.getOpenAccess().getDataParserRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:324:2: ( ( rule__Open__ProvaAssignment_2_1 ) )
                    {
                    // InternalBPMN_translator.g:324:2: ( ( rule__Open__ProvaAssignment_2_1 ) )
                    // InternalBPMN_translator.g:325:3: ( rule__Open__ProvaAssignment_2_1 )
                    {
                     before(grammarAccess.getOpenAccess().getProvaAssignment_2_1()); 
                    // InternalBPMN_translator.g:326:3: ( rule__Open__ProvaAssignment_2_1 )
                    // InternalBPMN_translator.g:326:4: rule__Open__ProvaAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Open__ProvaAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpenAccess().getProvaAssignment_2_1()); 

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
    // $ANTLR end "rule__Open__Alternatives_2"


    // $ANTLR start "rule__Xml__Group__0"
    // InternalBPMN_translator.g:334:1: rule__Xml__Group__0 : rule__Xml__Group__0__Impl rule__Xml__Group__1 ;
    public final void rule__Xml__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:338:1: ( rule__Xml__Group__0__Impl rule__Xml__Group__1 )
            // InternalBPMN_translator.g:339:2: rule__Xml__Group__0__Impl rule__Xml__Group__1
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
    // InternalBPMN_translator.g:346:1: rule__Xml__Group__0__Impl : ( () ) ;
    public final void rule__Xml__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:350:1: ( ( () ) )
            // InternalBPMN_translator.g:351:1: ( () )
            {
            // InternalBPMN_translator.g:351:1: ( () )
            // InternalBPMN_translator.g:352:2: ()
            {
             before(grammarAccess.getXmlAccess().getXmlAction_0()); 
            // InternalBPMN_translator.g:353:2: ()
            // InternalBPMN_translator.g:353:3: 
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
    // InternalBPMN_translator.g:361:1: rule__Xml__Group__1 : rule__Xml__Group__1__Impl ;
    public final void rule__Xml__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:365:1: ( rule__Xml__Group__1__Impl )
            // InternalBPMN_translator.g:366:2: rule__Xml__Group__1__Impl
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
    // InternalBPMN_translator.g:372:1: rule__Xml__Group__1__Impl : ( ( rule__Xml__Opening_tagAssignment_1 ) ) ;
    public final void rule__Xml__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:376:1: ( ( ( rule__Xml__Opening_tagAssignment_1 ) ) )
            // InternalBPMN_translator.g:377:1: ( ( rule__Xml__Opening_tagAssignment_1 ) )
            {
            // InternalBPMN_translator.g:377:1: ( ( rule__Xml__Opening_tagAssignment_1 ) )
            // InternalBPMN_translator.g:378:2: ( rule__Xml__Opening_tagAssignment_1 )
            {
             before(grammarAccess.getXmlAccess().getOpening_tagAssignment_1()); 
            // InternalBPMN_translator.g:379:2: ( rule__Xml__Opening_tagAssignment_1 )
            // InternalBPMN_translator.g:379:3: rule__Xml__Opening_tagAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Xml__Opening_tagAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXmlAccess().getOpening_tagAssignment_1()); 

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


    // $ANTLR start "rule__Opening__Group_0__0"
    // InternalBPMN_translator.g:388:1: rule__Opening__Group_0__0 : rule__Opening__Group_0__0__Impl rule__Opening__Group_0__1 ;
    public final void rule__Opening__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:392:1: ( rule__Opening__Group_0__0__Impl rule__Opening__Group_0__1 )
            // InternalBPMN_translator.g:393:2: rule__Opening__Group_0__0__Impl rule__Opening__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Opening__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Opening__Group_0__1();

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
    // $ANTLR end "rule__Opening__Group_0__0"


    // $ANTLR start "rule__Opening__Group_0__0__Impl"
    // InternalBPMN_translator.g:400:1: rule__Opening__Group_0__0__Impl : ( () ) ;
    public final void rule__Opening__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:404:1: ( ( () ) )
            // InternalBPMN_translator.g:405:1: ( () )
            {
            // InternalBPMN_translator.g:405:1: ( () )
            // InternalBPMN_translator.g:406:2: ()
            {
             before(grammarAccess.getOpeningAccess().getOpeningAction_0_0()); 
            // InternalBPMN_translator.g:407:2: ()
            // InternalBPMN_translator.g:407:3: 
            {
            }

             after(grammarAccess.getOpeningAccess().getOpeningAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Opening__Group_0__0__Impl"


    // $ANTLR start "rule__Opening__Group_0__1"
    // InternalBPMN_translator.g:415:1: rule__Opening__Group_0__1 : rule__Opening__Group_0__1__Impl ;
    public final void rule__Opening__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:419:1: ( rule__Opening__Group_0__1__Impl )
            // InternalBPMN_translator.g:420:2: rule__Opening__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Opening__Group_0__1__Impl();

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
    // $ANTLR end "rule__Opening__Group_0__1"


    // $ANTLR start "rule__Opening__Group_0__1__Impl"
    // InternalBPMN_translator.g:426:1: rule__Opening__Group_0__1__Impl : ( ( rule__Opening__Group_0_1__0 ) ) ;
    public final void rule__Opening__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:430:1: ( ( ( rule__Opening__Group_0_1__0 ) ) )
            // InternalBPMN_translator.g:431:1: ( ( rule__Opening__Group_0_1__0 ) )
            {
            // InternalBPMN_translator.g:431:1: ( ( rule__Opening__Group_0_1__0 ) )
            // InternalBPMN_translator.g:432:2: ( rule__Opening__Group_0_1__0 )
            {
             before(grammarAccess.getOpeningAccess().getGroup_0_1()); 
            // InternalBPMN_translator.g:433:2: ( rule__Opening__Group_0_1__0 )
            // InternalBPMN_translator.g:433:3: rule__Opening__Group_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Opening__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__Opening__Group_0__1__Impl"


    // $ANTLR start "rule__Opening__Group_0_1__0"
    // InternalBPMN_translator.g:442:1: rule__Opening__Group_0_1__0 : rule__Opening__Group_0_1__0__Impl rule__Opening__Group_0_1__1 ;
    public final void rule__Opening__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:446:1: ( rule__Opening__Group_0_1__0__Impl rule__Opening__Group_0_1__1 )
            // InternalBPMN_translator.g:447:2: rule__Opening__Group_0_1__0__Impl rule__Opening__Group_0_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Opening__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Opening__Group_0_1__1();

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
    // $ANTLR end "rule__Opening__Group_0_1__0"


    // $ANTLR start "rule__Opening__Group_0_1__0__Impl"
    // InternalBPMN_translator.g:454:1: rule__Opening__Group_0_1__0__Impl : ( ( rule__Opening__Group_0_1_0__0 ) ) ;
    public final void rule__Opening__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:458:1: ( ( ( rule__Opening__Group_0_1_0__0 ) ) )
            // InternalBPMN_translator.g:459:1: ( ( rule__Opening__Group_0_1_0__0 ) )
            {
            // InternalBPMN_translator.g:459:1: ( ( rule__Opening__Group_0_1_0__0 ) )
            // InternalBPMN_translator.g:460:2: ( rule__Opening__Group_0_1_0__0 )
            {
             before(grammarAccess.getOpeningAccess().getGroup_0_1_0()); 
            // InternalBPMN_translator.g:461:2: ( rule__Opening__Group_0_1_0__0 )
            // InternalBPMN_translator.g:461:3: rule__Opening__Group_0_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Opening__Group_0_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getGroup_0_1_0()); 

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
    // $ANTLR end "rule__Opening__Group_0_1__0__Impl"


    // $ANTLR start "rule__Opening__Group_0_1__1"
    // InternalBPMN_translator.g:469:1: rule__Opening__Group_0_1__1 : rule__Opening__Group_0_1__1__Impl rule__Opening__Group_0_1__2 ;
    public final void rule__Opening__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:473:1: ( rule__Opening__Group_0_1__1__Impl rule__Opening__Group_0_1__2 )
            // InternalBPMN_translator.g:474:2: rule__Opening__Group_0_1__1__Impl rule__Opening__Group_0_1__2
            {
            pushFollow(FOLLOW_3);
            rule__Opening__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Opening__Group_0_1__2();

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
    // $ANTLR end "rule__Opening__Group_0_1__1"


    // $ANTLR start "rule__Opening__Group_0_1__1__Impl"
    // InternalBPMN_translator.g:481:1: rule__Opening__Group_0_1__1__Impl : ( ( rule__Opening__Group_0_1_1__0 )* ) ;
    public final void rule__Opening__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:485:1: ( ( ( rule__Opening__Group_0_1_1__0 )* ) )
            // InternalBPMN_translator.g:486:1: ( ( rule__Opening__Group_0_1_1__0 )* )
            {
            // InternalBPMN_translator.g:486:1: ( ( rule__Opening__Group_0_1_1__0 )* )
            // InternalBPMN_translator.g:487:2: ( rule__Opening__Group_0_1_1__0 )*
            {
             before(grammarAccess.getOpeningAccess().getGroup_0_1_1()); 
            // InternalBPMN_translator.g:488:2: ( rule__Opening__Group_0_1_1__0 )*
            loop7:
            do {
                int alt7=2;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // InternalBPMN_translator.g:488:3: rule__Opening__Group_0_1_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Opening__Group_0_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getOpeningAccess().getGroup_0_1_1()); 

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
    // $ANTLR end "rule__Opening__Group_0_1__1__Impl"


    // $ANTLR start "rule__Opening__Group_0_1__2"
    // InternalBPMN_translator.g:496:1: rule__Opening__Group_0_1__2 : rule__Opening__Group_0_1__2__Impl ;
    public final void rule__Opening__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:500:1: ( rule__Opening__Group_0_1__2__Impl )
            // InternalBPMN_translator.g:501:2: rule__Opening__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Opening__Group_0_1__2__Impl();

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
    // $ANTLR end "rule__Opening__Group_0_1__2"


    // $ANTLR start "rule__Opening__Group_0_1__2__Impl"
    // InternalBPMN_translator.g:507:1: rule__Opening__Group_0_1__2__Impl : ( ( rule__Opening__Group_0_1_2__0 )* ) ;
    public final void rule__Opening__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:511:1: ( ( ( rule__Opening__Group_0_1_2__0 )* ) )
            // InternalBPMN_translator.g:512:1: ( ( rule__Opening__Group_0_1_2__0 )* )
            {
            // InternalBPMN_translator.g:512:1: ( ( rule__Opening__Group_0_1_2__0 )* )
            // InternalBPMN_translator.g:513:2: ( rule__Opening__Group_0_1_2__0 )*
            {
             before(grammarAccess.getOpeningAccess().getGroup_0_1_2()); 
            // InternalBPMN_translator.g:514:2: ( rule__Opening__Group_0_1_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBPMN_translator.g:514:3: rule__Opening__Group_0_1_2__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Opening__Group_0_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getOpeningAccess().getGroup_0_1_2()); 

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
    // $ANTLR end "rule__Opening__Group_0_1__2__Impl"


    // $ANTLR start "rule__Opening__Group_0_1_0__0"
    // InternalBPMN_translator.g:523:1: rule__Opening__Group_0_1_0__0 : rule__Opening__Group_0_1_0__0__Impl rule__Opening__Group_0_1_0__1 ;
    public final void rule__Opening__Group_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:527:1: ( rule__Opening__Group_0_1_0__0__Impl rule__Opening__Group_0_1_0__1 )
            // InternalBPMN_translator.g:528:2: rule__Opening__Group_0_1_0__0__Impl rule__Opening__Group_0_1_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Opening__Group_0_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Opening__Group_0_1_0__1();

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
    // $ANTLR end "rule__Opening__Group_0_1_0__0"


    // $ANTLR start "rule__Opening__Group_0_1_0__0__Impl"
    // InternalBPMN_translator.g:535:1: rule__Opening__Group_0_1_0__0__Impl : ( ( rule__Opening__ProvaAssignment_0_1_0_0 ) ) ;
    public final void rule__Opening__Group_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:539:1: ( ( ( rule__Opening__ProvaAssignment_0_1_0_0 ) ) )
            // InternalBPMN_translator.g:540:1: ( ( rule__Opening__ProvaAssignment_0_1_0_0 ) )
            {
            // InternalBPMN_translator.g:540:1: ( ( rule__Opening__ProvaAssignment_0_1_0_0 ) )
            // InternalBPMN_translator.g:541:2: ( rule__Opening__ProvaAssignment_0_1_0_0 )
            {
             before(grammarAccess.getOpeningAccess().getProvaAssignment_0_1_0_0()); 
            // InternalBPMN_translator.g:542:2: ( rule__Opening__ProvaAssignment_0_1_0_0 )
            // InternalBPMN_translator.g:542:3: rule__Opening__ProvaAssignment_0_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Opening__ProvaAssignment_0_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getProvaAssignment_0_1_0_0()); 

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
    // $ANTLR end "rule__Opening__Group_0_1_0__0__Impl"


    // $ANTLR start "rule__Opening__Group_0_1_0__1"
    // InternalBPMN_translator.g:550:1: rule__Opening__Group_0_1_0__1 : rule__Opening__Group_0_1_0__1__Impl ;
    public final void rule__Opening__Group_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:554:1: ( rule__Opening__Group_0_1_0__1__Impl )
            // InternalBPMN_translator.g:555:2: rule__Opening__Group_0_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Opening__Group_0_1_0__1__Impl();

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
    // $ANTLR end "rule__Opening__Group_0_1_0__1"


    // $ANTLR start "rule__Opening__Group_0_1_0__1__Impl"
    // InternalBPMN_translator.g:561:1: rule__Opening__Group_0_1_0__1__Impl : ( ( rule__Opening__Prova1Assignment_0_1_0_1 ) ) ;
    public final void rule__Opening__Group_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:565:1: ( ( ( rule__Opening__Prova1Assignment_0_1_0_1 ) ) )
            // InternalBPMN_translator.g:566:1: ( ( rule__Opening__Prova1Assignment_0_1_0_1 ) )
            {
            // InternalBPMN_translator.g:566:1: ( ( rule__Opening__Prova1Assignment_0_1_0_1 ) )
            // InternalBPMN_translator.g:567:2: ( rule__Opening__Prova1Assignment_0_1_0_1 )
            {
             before(grammarAccess.getOpeningAccess().getProva1Assignment_0_1_0_1()); 
            // InternalBPMN_translator.g:568:2: ( rule__Opening__Prova1Assignment_0_1_0_1 )
            // InternalBPMN_translator.g:568:3: rule__Opening__Prova1Assignment_0_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Opening__Prova1Assignment_0_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getProva1Assignment_0_1_0_1()); 

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
    // $ANTLR end "rule__Opening__Group_0_1_0__1__Impl"


    // $ANTLR start "rule__Opening__Group_0_1_1__0"
    // InternalBPMN_translator.g:577:1: rule__Opening__Group_0_1_1__0 : rule__Opening__Group_0_1_1__0__Impl rule__Opening__Group_0_1_1__1 ;
    public final void rule__Opening__Group_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:581:1: ( rule__Opening__Group_0_1_1__0__Impl rule__Opening__Group_0_1_1__1 )
            // InternalBPMN_translator.g:582:2: rule__Opening__Group_0_1_1__0__Impl rule__Opening__Group_0_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Opening__Group_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Opening__Group_0_1_1__1();

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
    // $ANTLR end "rule__Opening__Group_0_1_1__0"


    // $ANTLR start "rule__Opening__Group_0_1_1__0__Impl"
    // InternalBPMN_translator.g:589:1: rule__Opening__Group_0_1_1__0__Impl : ( ( rule__Opening__ProvaAssignment_0_1_1_0 ) ) ;
    public final void rule__Opening__Group_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:593:1: ( ( ( rule__Opening__ProvaAssignment_0_1_1_0 ) ) )
            // InternalBPMN_translator.g:594:1: ( ( rule__Opening__ProvaAssignment_0_1_1_0 ) )
            {
            // InternalBPMN_translator.g:594:1: ( ( rule__Opening__ProvaAssignment_0_1_1_0 ) )
            // InternalBPMN_translator.g:595:2: ( rule__Opening__ProvaAssignment_0_1_1_0 )
            {
             before(grammarAccess.getOpeningAccess().getProvaAssignment_0_1_1_0()); 
            // InternalBPMN_translator.g:596:2: ( rule__Opening__ProvaAssignment_0_1_1_0 )
            // InternalBPMN_translator.g:596:3: rule__Opening__ProvaAssignment_0_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Opening__ProvaAssignment_0_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getProvaAssignment_0_1_1_0()); 

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
    // $ANTLR end "rule__Opening__Group_0_1_1__0__Impl"


    // $ANTLR start "rule__Opening__Group_0_1_1__1"
    // InternalBPMN_translator.g:604:1: rule__Opening__Group_0_1_1__1 : rule__Opening__Group_0_1_1__1__Impl ;
    public final void rule__Opening__Group_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:608:1: ( rule__Opening__Group_0_1_1__1__Impl )
            // InternalBPMN_translator.g:609:2: rule__Opening__Group_0_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Opening__Group_0_1_1__1__Impl();

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
    // $ANTLR end "rule__Opening__Group_0_1_1__1"


    // $ANTLR start "rule__Opening__Group_0_1_1__1__Impl"
    // InternalBPMN_translator.g:615:1: rule__Opening__Group_0_1_1__1__Impl : ( ( rule__Opening__Prova1Assignment_0_1_1_1 ) ) ;
    public final void rule__Opening__Group_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:619:1: ( ( ( rule__Opening__Prova1Assignment_0_1_1_1 ) ) )
            // InternalBPMN_translator.g:620:1: ( ( rule__Opening__Prova1Assignment_0_1_1_1 ) )
            {
            // InternalBPMN_translator.g:620:1: ( ( rule__Opening__Prova1Assignment_0_1_1_1 ) )
            // InternalBPMN_translator.g:621:2: ( rule__Opening__Prova1Assignment_0_1_1_1 )
            {
             before(grammarAccess.getOpeningAccess().getProva1Assignment_0_1_1_1()); 
            // InternalBPMN_translator.g:622:2: ( rule__Opening__Prova1Assignment_0_1_1_1 )
            // InternalBPMN_translator.g:622:3: rule__Opening__Prova1Assignment_0_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Opening__Prova1Assignment_0_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getProva1Assignment_0_1_1_1()); 

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
    // $ANTLR end "rule__Opening__Group_0_1_1__1__Impl"


    // $ANTLR start "rule__Opening__Group_0_1_2__0"
    // InternalBPMN_translator.g:631:1: rule__Opening__Group_0_1_2__0 : rule__Opening__Group_0_1_2__0__Impl rule__Opening__Group_0_1_2__1 ;
    public final void rule__Opening__Group_0_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:635:1: ( rule__Opening__Group_0_1_2__0__Impl rule__Opening__Group_0_1_2__1 )
            // InternalBPMN_translator.g:636:2: rule__Opening__Group_0_1_2__0__Impl rule__Opening__Group_0_1_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Opening__Group_0_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Opening__Group_0_1_2__1();

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
    // $ANTLR end "rule__Opening__Group_0_1_2__0"


    // $ANTLR start "rule__Opening__Group_0_1_2__0__Impl"
    // InternalBPMN_translator.g:643:1: rule__Opening__Group_0_1_2__0__Impl : ( ( rule__Opening__Group_0_1_2_0__0 ) ) ;
    public final void rule__Opening__Group_0_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:647:1: ( ( ( rule__Opening__Group_0_1_2_0__0 ) ) )
            // InternalBPMN_translator.g:648:1: ( ( rule__Opening__Group_0_1_2_0__0 ) )
            {
            // InternalBPMN_translator.g:648:1: ( ( rule__Opening__Group_0_1_2_0__0 ) )
            // InternalBPMN_translator.g:649:2: ( rule__Opening__Group_0_1_2_0__0 )
            {
             before(grammarAccess.getOpeningAccess().getGroup_0_1_2_0()); 
            // InternalBPMN_translator.g:650:2: ( rule__Opening__Group_0_1_2_0__0 )
            // InternalBPMN_translator.g:650:3: rule__Opening__Group_0_1_2_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Opening__Group_0_1_2_0__0();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getGroup_0_1_2_0()); 

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
    // $ANTLR end "rule__Opening__Group_0_1_2__0__Impl"


    // $ANTLR start "rule__Opening__Group_0_1_2__1"
    // InternalBPMN_translator.g:658:1: rule__Opening__Group_0_1_2__1 : rule__Opening__Group_0_1_2__1__Impl ;
    public final void rule__Opening__Group_0_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:662:1: ( rule__Opening__Group_0_1_2__1__Impl )
            // InternalBPMN_translator.g:663:2: rule__Opening__Group_0_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Opening__Group_0_1_2__1__Impl();

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
    // $ANTLR end "rule__Opening__Group_0_1_2__1"


    // $ANTLR start "rule__Opening__Group_0_1_2__1__Impl"
    // InternalBPMN_translator.g:669:1: rule__Opening__Group_0_1_2__1__Impl : ( '/>' ) ;
    public final void rule__Opening__Group_0_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:673:1: ( ( '/>' ) )
            // InternalBPMN_translator.g:674:1: ( '/>' )
            {
            // InternalBPMN_translator.g:674:1: ( '/>' )
            // InternalBPMN_translator.g:675:2: '/>'
            {
             before(grammarAccess.getOpeningAccess().getSolidusGreaterThanSignKeyword_0_1_2_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getOpeningAccess().getSolidusGreaterThanSignKeyword_0_1_2_1()); 

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
    // $ANTLR end "rule__Opening__Group_0_1_2__1__Impl"


    // $ANTLR start "rule__Opening__Group_0_1_2_0__0"
    // InternalBPMN_translator.g:685:1: rule__Opening__Group_0_1_2_0__0 : rule__Opening__Group_0_1_2_0__0__Impl rule__Opening__Group_0_1_2_0__1 ;
    public final void rule__Opening__Group_0_1_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:689:1: ( rule__Opening__Group_0_1_2_0__0__Impl rule__Opening__Group_0_1_2_0__1 )
            // InternalBPMN_translator.g:690:2: rule__Opening__Group_0_1_2_0__0__Impl rule__Opening__Group_0_1_2_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Opening__Group_0_1_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Opening__Group_0_1_2_0__1();

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
    // $ANTLR end "rule__Opening__Group_0_1_2_0__0"


    // $ANTLR start "rule__Opening__Group_0_1_2_0__0__Impl"
    // InternalBPMN_translator.g:697:1: rule__Opening__Group_0_1_2_0__0__Impl : ( '<' ) ;
    public final void rule__Opening__Group_0_1_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:701:1: ( ( '<' ) )
            // InternalBPMN_translator.g:702:1: ( '<' )
            {
            // InternalBPMN_translator.g:702:1: ( '<' )
            // InternalBPMN_translator.g:703:2: '<'
            {
             before(grammarAccess.getOpeningAccess().getLessThanSignKeyword_0_1_2_0_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getOpeningAccess().getLessThanSignKeyword_0_1_2_0_0()); 

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
    // $ANTLR end "rule__Opening__Group_0_1_2_0__0__Impl"


    // $ANTLR start "rule__Opening__Group_0_1_2_0__1"
    // InternalBPMN_translator.g:712:1: rule__Opening__Group_0_1_2_0__1 : rule__Opening__Group_0_1_2_0__1__Impl rule__Opening__Group_0_1_2_0__2 ;
    public final void rule__Opening__Group_0_1_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:716:1: ( rule__Opening__Group_0_1_2_0__1__Impl rule__Opening__Group_0_1_2_0__2 )
            // InternalBPMN_translator.g:717:2: rule__Opening__Group_0_1_2_0__1__Impl rule__Opening__Group_0_1_2_0__2
            {
            pushFollow(FOLLOW_8);
            rule__Opening__Group_0_1_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Opening__Group_0_1_2_0__2();

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
    // $ANTLR end "rule__Opening__Group_0_1_2_0__1"


    // $ANTLR start "rule__Opening__Group_0_1_2_0__1__Impl"
    // InternalBPMN_translator.g:724:1: rule__Opening__Group_0_1_2_0__1__Impl : ( RULE_HEAD ) ;
    public final void rule__Opening__Group_0_1_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:728:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:729:1: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:729:1: ( RULE_HEAD )
            // InternalBPMN_translator.g:730:2: RULE_HEAD
            {
             before(grammarAccess.getOpeningAccess().getHEADTerminalRuleCall_0_1_2_0_1()); 
            match(input,RULE_HEAD,FOLLOW_2); 
             after(grammarAccess.getOpeningAccess().getHEADTerminalRuleCall_0_1_2_0_1()); 

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
    // $ANTLR end "rule__Opening__Group_0_1_2_0__1__Impl"


    // $ANTLR start "rule__Opening__Group_0_1_2_0__2"
    // InternalBPMN_translator.g:739:1: rule__Opening__Group_0_1_2_0__2 : rule__Opening__Group_0_1_2_0__2__Impl rule__Opening__Group_0_1_2_0__3 ;
    public final void rule__Opening__Group_0_1_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:743:1: ( rule__Opening__Group_0_1_2_0__2__Impl rule__Opening__Group_0_1_2_0__3 )
            // InternalBPMN_translator.g:744:2: rule__Opening__Group_0_1_2_0__2__Impl rule__Opening__Group_0_1_2_0__3
            {
            pushFollow(FOLLOW_9);
            rule__Opening__Group_0_1_2_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Opening__Group_0_1_2_0__3();

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
    // $ANTLR end "rule__Opening__Group_0_1_2_0__2"


    // $ANTLR start "rule__Opening__Group_0_1_2_0__2__Impl"
    // InternalBPMN_translator.g:751:1: rule__Opening__Group_0_1_2_0__2__Impl : ( ':' ) ;
    public final void rule__Opening__Group_0_1_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:755:1: ( ( ':' ) )
            // InternalBPMN_translator.g:756:1: ( ':' )
            {
            // InternalBPMN_translator.g:756:1: ( ':' )
            // InternalBPMN_translator.g:757:2: ':'
            {
             before(grammarAccess.getOpeningAccess().getColonKeyword_0_1_2_0_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getOpeningAccess().getColonKeyword_0_1_2_0_2()); 

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
    // $ANTLR end "rule__Opening__Group_0_1_2_0__2__Impl"


    // $ANTLR start "rule__Opening__Group_0_1_2_0__3"
    // InternalBPMN_translator.g:766:1: rule__Opening__Group_0_1_2_0__3 : rule__Opening__Group_0_1_2_0__3__Impl rule__Opening__Group_0_1_2_0__4 ;
    public final void rule__Opening__Group_0_1_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:770:1: ( rule__Opening__Group_0_1_2_0__3__Impl rule__Opening__Group_0_1_2_0__4 )
            // InternalBPMN_translator.g:771:2: rule__Opening__Group_0_1_2_0__3__Impl rule__Opening__Group_0_1_2_0__4
            {
            pushFollow(FOLLOW_10);
            rule__Opening__Group_0_1_2_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Opening__Group_0_1_2_0__4();

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
    // $ANTLR end "rule__Opening__Group_0_1_2_0__3"


    // $ANTLR start "rule__Opening__Group_0_1_2_0__3__Impl"
    // InternalBPMN_translator.g:778:1: rule__Opening__Group_0_1_2_0__3__Impl : ( RULE_KEYWORDS ) ;
    public final void rule__Opening__Group_0_1_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:782:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:783:1: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:783:1: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:784:2: RULE_KEYWORDS
            {
             before(grammarAccess.getOpeningAccess().getKEYWORDSTerminalRuleCall_0_1_2_0_3()); 
            match(input,RULE_KEYWORDS,FOLLOW_2); 
             after(grammarAccess.getOpeningAccess().getKEYWORDSTerminalRuleCall_0_1_2_0_3()); 

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
    // $ANTLR end "rule__Opening__Group_0_1_2_0__3__Impl"


    // $ANTLR start "rule__Opening__Group_0_1_2_0__4"
    // InternalBPMN_translator.g:793:1: rule__Opening__Group_0_1_2_0__4 : rule__Opening__Group_0_1_2_0__4__Impl ;
    public final void rule__Opening__Group_0_1_2_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:797:1: ( rule__Opening__Group_0_1_2_0__4__Impl )
            // InternalBPMN_translator.g:798:2: rule__Opening__Group_0_1_2_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Opening__Group_0_1_2_0__4__Impl();

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
    // $ANTLR end "rule__Opening__Group_0_1_2_0__4"


    // $ANTLR start "rule__Opening__Group_0_1_2_0__4__Impl"
    // InternalBPMN_translator.g:804:1: rule__Opening__Group_0_1_2_0__4__Impl : ( ( rule__Opening__Alternatives_0_1_2_0_4 )* ) ;
    public final void rule__Opening__Group_0_1_2_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:808:1: ( ( ( rule__Opening__Alternatives_0_1_2_0_4 )* ) )
            // InternalBPMN_translator.g:809:1: ( ( rule__Opening__Alternatives_0_1_2_0_4 )* )
            {
            // InternalBPMN_translator.g:809:1: ( ( rule__Opening__Alternatives_0_1_2_0_4 )* )
            // InternalBPMN_translator.g:810:2: ( rule__Opening__Alternatives_0_1_2_0_4 )*
            {
             before(grammarAccess.getOpeningAccess().getAlternatives_0_1_2_0_4()); 
            // InternalBPMN_translator.g:811:2: ( rule__Opening__Alternatives_0_1_2_0_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_KEYWORDS||LA9_0==RULE_HEAD) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBPMN_translator.g:811:3: rule__Opening__Alternatives_0_1_2_0_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Opening__Alternatives_0_1_2_0_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getOpeningAccess().getAlternatives_0_1_2_0_4()); 

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
    // $ANTLR end "rule__Opening__Group_0_1_2_0__4__Impl"


    // $ANTLR start "rule__Opening__Group_0_1_2_0_4_0__0"
    // InternalBPMN_translator.g:820:1: rule__Opening__Group_0_1_2_0_4_0__0 : rule__Opening__Group_0_1_2_0_4_0__0__Impl rule__Opening__Group_0_1_2_0_4_0__1 ;
    public final void rule__Opening__Group_0_1_2_0_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:824:1: ( rule__Opening__Group_0_1_2_0_4_0__0__Impl rule__Opening__Group_0_1_2_0_4_0__1 )
            // InternalBPMN_translator.g:825:2: rule__Opening__Group_0_1_2_0_4_0__0__Impl rule__Opening__Group_0_1_2_0_4_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Opening__Group_0_1_2_0_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Opening__Group_0_1_2_0_4_0__1();

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
    // $ANTLR end "rule__Opening__Group_0_1_2_0_4_0__0"


    // $ANTLR start "rule__Opening__Group_0_1_2_0_4_0__0__Impl"
    // InternalBPMN_translator.g:832:1: rule__Opening__Group_0_1_2_0_4_0__0__Impl : ( RULE_HEAD ) ;
    public final void rule__Opening__Group_0_1_2_0_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:836:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:837:1: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:837:1: ( RULE_HEAD )
            // InternalBPMN_translator.g:838:2: RULE_HEAD
            {
             before(grammarAccess.getOpeningAccess().getHEADTerminalRuleCall_0_1_2_0_4_0_0()); 
            match(input,RULE_HEAD,FOLLOW_2); 
             after(grammarAccess.getOpeningAccess().getHEADTerminalRuleCall_0_1_2_0_4_0_0()); 

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
    // $ANTLR end "rule__Opening__Group_0_1_2_0_4_0__0__Impl"


    // $ANTLR start "rule__Opening__Group_0_1_2_0_4_0__1"
    // InternalBPMN_translator.g:847:1: rule__Opening__Group_0_1_2_0_4_0__1 : rule__Opening__Group_0_1_2_0_4_0__1__Impl ;
    public final void rule__Opening__Group_0_1_2_0_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:851:1: ( rule__Opening__Group_0_1_2_0_4_0__1__Impl )
            // InternalBPMN_translator.g:852:2: rule__Opening__Group_0_1_2_0_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Opening__Group_0_1_2_0_4_0__1__Impl();

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
    // $ANTLR end "rule__Opening__Group_0_1_2_0_4_0__1"


    // $ANTLR start "rule__Opening__Group_0_1_2_0_4_0__1__Impl"
    // InternalBPMN_translator.g:858:1: rule__Opening__Group_0_1_2_0_4_0__1__Impl : ( ':' ) ;
    public final void rule__Opening__Group_0_1_2_0_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:862:1: ( ( ':' ) )
            // InternalBPMN_translator.g:863:1: ( ':' )
            {
            // InternalBPMN_translator.g:863:1: ( ':' )
            // InternalBPMN_translator.g:864:2: ':'
            {
             before(grammarAccess.getOpeningAccess().getColonKeyword_0_1_2_0_4_0_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getOpeningAccess().getColonKeyword_0_1_2_0_4_0_1()); 

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
    // $ANTLR end "rule__Opening__Group_0_1_2_0_4_0__1__Impl"


    // $ANTLR start "rule__Opening__Group_0_1_2_0_4_1__0"
    // InternalBPMN_translator.g:874:1: rule__Opening__Group_0_1_2_0_4_1__0 : rule__Opening__Group_0_1_2_0_4_1__0__Impl rule__Opening__Group_0_1_2_0_4_1__1 ;
    public final void rule__Opening__Group_0_1_2_0_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:878:1: ( rule__Opening__Group_0_1_2_0_4_1__0__Impl rule__Opening__Group_0_1_2_0_4_1__1 )
            // InternalBPMN_translator.g:879:2: rule__Opening__Group_0_1_2_0_4_1__0__Impl rule__Opening__Group_0_1_2_0_4_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Opening__Group_0_1_2_0_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Opening__Group_0_1_2_0_4_1__1();

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
    // $ANTLR end "rule__Opening__Group_0_1_2_0_4_1__0"


    // $ANTLR start "rule__Opening__Group_0_1_2_0_4_1__0__Impl"
    // InternalBPMN_translator.g:886:1: rule__Opening__Group_0_1_2_0_4_1__0__Impl : ( RULE_KEYWORDS ) ;
    public final void rule__Opening__Group_0_1_2_0_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:890:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:891:1: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:891:1: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:892:2: RULE_KEYWORDS
            {
             before(grammarAccess.getOpeningAccess().getKEYWORDSTerminalRuleCall_0_1_2_0_4_1_0()); 
            match(input,RULE_KEYWORDS,FOLLOW_2); 
             after(grammarAccess.getOpeningAccess().getKEYWORDSTerminalRuleCall_0_1_2_0_4_1_0()); 

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
    // $ANTLR end "rule__Opening__Group_0_1_2_0_4_1__0__Impl"


    // $ANTLR start "rule__Opening__Group_0_1_2_0_4_1__1"
    // InternalBPMN_translator.g:901:1: rule__Opening__Group_0_1_2_0_4_1__1 : rule__Opening__Group_0_1_2_0_4_1__1__Impl rule__Opening__Group_0_1_2_0_4_1__2 ;
    public final void rule__Opening__Group_0_1_2_0_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:905:1: ( rule__Opening__Group_0_1_2_0_4_1__1__Impl rule__Opening__Group_0_1_2_0_4_1__2 )
            // InternalBPMN_translator.g:906:2: rule__Opening__Group_0_1_2_0_4_1__1__Impl rule__Opening__Group_0_1_2_0_4_1__2
            {
            pushFollow(FOLLOW_13);
            rule__Opening__Group_0_1_2_0_4_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Opening__Group_0_1_2_0_4_1__2();

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
    // $ANTLR end "rule__Opening__Group_0_1_2_0_4_1__1"


    // $ANTLR start "rule__Opening__Group_0_1_2_0_4_1__1__Impl"
    // InternalBPMN_translator.g:913:1: rule__Opening__Group_0_1_2_0_4_1__1__Impl : ( '=' ) ;
    public final void rule__Opening__Group_0_1_2_0_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:917:1: ( ( '=' ) )
            // InternalBPMN_translator.g:918:1: ( '=' )
            {
            // InternalBPMN_translator.g:918:1: ( '=' )
            // InternalBPMN_translator.g:919:2: '='
            {
             before(grammarAccess.getOpeningAccess().getEqualsSignKeyword_0_1_2_0_4_1_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getOpeningAccess().getEqualsSignKeyword_0_1_2_0_4_1_1()); 

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
    // $ANTLR end "rule__Opening__Group_0_1_2_0_4_1__1__Impl"


    // $ANTLR start "rule__Opening__Group_0_1_2_0_4_1__2"
    // InternalBPMN_translator.g:928:1: rule__Opening__Group_0_1_2_0_4_1__2 : rule__Opening__Group_0_1_2_0_4_1__2__Impl ;
    public final void rule__Opening__Group_0_1_2_0_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:932:1: ( rule__Opening__Group_0_1_2_0_4_1__2__Impl )
            // InternalBPMN_translator.g:933:2: rule__Opening__Group_0_1_2_0_4_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Opening__Group_0_1_2_0_4_1__2__Impl();

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
    // $ANTLR end "rule__Opening__Group_0_1_2_0_4_1__2"


    // $ANTLR start "rule__Opening__Group_0_1_2_0_4_1__2__Impl"
    // InternalBPMN_translator.g:939:1: rule__Opening__Group_0_1_2_0_4_1__2__Impl : ( ( rule__Opening__ValueAssignment_0_1_2_0_4_1_2 ) ) ;
    public final void rule__Opening__Group_0_1_2_0_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:943:1: ( ( ( rule__Opening__ValueAssignment_0_1_2_0_4_1_2 ) ) )
            // InternalBPMN_translator.g:944:1: ( ( rule__Opening__ValueAssignment_0_1_2_0_4_1_2 ) )
            {
            // InternalBPMN_translator.g:944:1: ( ( rule__Opening__ValueAssignment_0_1_2_0_4_1_2 ) )
            // InternalBPMN_translator.g:945:2: ( rule__Opening__ValueAssignment_0_1_2_0_4_1_2 )
            {
             before(grammarAccess.getOpeningAccess().getValueAssignment_0_1_2_0_4_1_2()); 
            // InternalBPMN_translator.g:946:2: ( rule__Opening__ValueAssignment_0_1_2_0_4_1_2 )
            // InternalBPMN_translator.g:946:3: rule__Opening__ValueAssignment_0_1_2_0_4_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Opening__ValueAssignment_0_1_2_0_4_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getValueAssignment_0_1_2_0_4_1_2()); 

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
    // $ANTLR end "rule__Opening__Group_0_1_2_0_4_1__2__Impl"


    // $ANTLR start "rule__Opening__Group_1__0"
    // InternalBPMN_translator.g:955:1: rule__Opening__Group_1__0 : rule__Opening__Group_1__0__Impl rule__Opening__Group_1__1 ;
    public final void rule__Opening__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:959:1: ( rule__Opening__Group_1__0__Impl rule__Opening__Group_1__1 )
            // InternalBPMN_translator.g:960:2: rule__Opening__Group_1__0__Impl rule__Opening__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Opening__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Opening__Group_1__1();

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
    // $ANTLR end "rule__Opening__Group_1__0"


    // $ANTLR start "rule__Opening__Group_1__0__Impl"
    // InternalBPMN_translator.g:967:1: rule__Opening__Group_1__0__Impl : ( () ) ;
    public final void rule__Opening__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:971:1: ( ( () ) )
            // InternalBPMN_translator.g:972:1: ( () )
            {
            // InternalBPMN_translator.g:972:1: ( () )
            // InternalBPMN_translator.g:973:2: ()
            {
             before(grammarAccess.getOpeningAccess().getOpeningAction_1_0()); 
            // InternalBPMN_translator.g:974:2: ()
            // InternalBPMN_translator.g:974:3: 
            {
            }

             after(grammarAccess.getOpeningAccess().getOpeningAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Opening__Group_1__0__Impl"


    // $ANTLR start "rule__Opening__Group_1__1"
    // InternalBPMN_translator.g:982:1: rule__Opening__Group_1__1 : rule__Opening__Group_1__1__Impl ;
    public final void rule__Opening__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:986:1: ( rule__Opening__Group_1__1__Impl )
            // InternalBPMN_translator.g:987:2: rule__Opening__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Opening__Group_1__1__Impl();

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
    // $ANTLR end "rule__Opening__Group_1__1"


    // $ANTLR start "rule__Opening__Group_1__1__Impl"
    // InternalBPMN_translator.g:993:1: rule__Opening__Group_1__1__Impl : ( ( rule__Opening__Group_1_1__0 )* ) ;
    public final void rule__Opening__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:997:1: ( ( ( rule__Opening__Group_1_1__0 )* ) )
            // InternalBPMN_translator.g:998:1: ( ( rule__Opening__Group_1_1__0 )* )
            {
            // InternalBPMN_translator.g:998:1: ( ( rule__Opening__Group_1_1__0 )* )
            // InternalBPMN_translator.g:999:2: ( rule__Opening__Group_1_1__0 )*
            {
             before(grammarAccess.getOpeningAccess().getGroup_1_1()); 
            // InternalBPMN_translator.g:1000:2: ( rule__Opening__Group_1_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBPMN_translator.g:1000:3: rule__Opening__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Opening__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getOpeningAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Opening__Group_1__1__Impl"


    // $ANTLR start "rule__Opening__Group_1_1__0"
    // InternalBPMN_translator.g:1009:1: rule__Opening__Group_1_1__0 : rule__Opening__Group_1_1__0__Impl rule__Opening__Group_1_1__1 ;
    public final void rule__Opening__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1013:1: ( rule__Opening__Group_1_1__0__Impl rule__Opening__Group_1_1__1 )
            // InternalBPMN_translator.g:1014:2: rule__Opening__Group_1_1__0__Impl rule__Opening__Group_1_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Opening__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Opening__Group_1_1__1();

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
    // $ANTLR end "rule__Opening__Group_1_1__0"


    // $ANTLR start "rule__Opening__Group_1_1__0__Impl"
    // InternalBPMN_translator.g:1021:1: rule__Opening__Group_1_1__0__Impl : ( ( rule__Opening__Group_1_1_0__0 ) ) ;
    public final void rule__Opening__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1025:1: ( ( ( rule__Opening__Group_1_1_0__0 ) ) )
            // InternalBPMN_translator.g:1026:1: ( ( rule__Opening__Group_1_1_0__0 ) )
            {
            // InternalBPMN_translator.g:1026:1: ( ( rule__Opening__Group_1_1_0__0 ) )
            // InternalBPMN_translator.g:1027:2: ( rule__Opening__Group_1_1_0__0 )
            {
             before(grammarAccess.getOpeningAccess().getGroup_1_1_0()); 
            // InternalBPMN_translator.g:1028:2: ( rule__Opening__Group_1_1_0__0 )
            // InternalBPMN_translator.g:1028:3: rule__Opening__Group_1_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Opening__Group_1_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getGroup_1_1_0()); 

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
    // $ANTLR end "rule__Opening__Group_1_1__0__Impl"


    // $ANTLR start "rule__Opening__Group_1_1__1"
    // InternalBPMN_translator.g:1036:1: rule__Opening__Group_1_1__1 : rule__Opening__Group_1_1__1__Impl ;
    public final void rule__Opening__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1040:1: ( rule__Opening__Group_1_1__1__Impl )
            // InternalBPMN_translator.g:1041:2: rule__Opening__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Opening__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__Opening__Group_1_1__1"


    // $ANTLR start "rule__Opening__Group_1_1__1__Impl"
    // InternalBPMN_translator.g:1047:1: rule__Opening__Group_1_1__1__Impl : ( '/>' ) ;
    public final void rule__Opening__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1051:1: ( ( '/>' ) )
            // InternalBPMN_translator.g:1052:1: ( '/>' )
            {
            // InternalBPMN_translator.g:1052:1: ( '/>' )
            // InternalBPMN_translator.g:1053:2: '/>'
            {
             before(grammarAccess.getOpeningAccess().getSolidusGreaterThanSignKeyword_1_1_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getOpeningAccess().getSolidusGreaterThanSignKeyword_1_1_1()); 

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
    // $ANTLR end "rule__Opening__Group_1_1__1__Impl"


    // $ANTLR start "rule__Opening__Group_1_1_0__0"
    // InternalBPMN_translator.g:1063:1: rule__Opening__Group_1_1_0__0 : rule__Opening__Group_1_1_0__0__Impl rule__Opening__Group_1_1_0__1 ;
    public final void rule__Opening__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1067:1: ( rule__Opening__Group_1_1_0__0__Impl rule__Opening__Group_1_1_0__1 )
            // InternalBPMN_translator.g:1068:2: rule__Opening__Group_1_1_0__0__Impl rule__Opening__Group_1_1_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Opening__Group_1_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Opening__Group_1_1_0__1();

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
    // $ANTLR end "rule__Opening__Group_1_1_0__0"


    // $ANTLR start "rule__Opening__Group_1_1_0__0__Impl"
    // InternalBPMN_translator.g:1075:1: rule__Opening__Group_1_1_0__0__Impl : ( '<' ) ;
    public final void rule__Opening__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1079:1: ( ( '<' ) )
            // InternalBPMN_translator.g:1080:1: ( '<' )
            {
            // InternalBPMN_translator.g:1080:1: ( '<' )
            // InternalBPMN_translator.g:1081:2: '<'
            {
             before(grammarAccess.getOpeningAccess().getLessThanSignKeyword_1_1_0_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getOpeningAccess().getLessThanSignKeyword_1_1_0_0()); 

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
    // $ANTLR end "rule__Opening__Group_1_1_0__0__Impl"


    // $ANTLR start "rule__Opening__Group_1_1_0__1"
    // InternalBPMN_translator.g:1090:1: rule__Opening__Group_1_1_0__1 : rule__Opening__Group_1_1_0__1__Impl rule__Opening__Group_1_1_0__2 ;
    public final void rule__Opening__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1094:1: ( rule__Opening__Group_1_1_0__1__Impl rule__Opening__Group_1_1_0__2 )
            // InternalBPMN_translator.g:1095:2: rule__Opening__Group_1_1_0__1__Impl rule__Opening__Group_1_1_0__2
            {
            pushFollow(FOLLOW_8);
            rule__Opening__Group_1_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Opening__Group_1_1_0__2();

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
    // $ANTLR end "rule__Opening__Group_1_1_0__1"


    // $ANTLR start "rule__Opening__Group_1_1_0__1__Impl"
    // InternalBPMN_translator.g:1102:1: rule__Opening__Group_1_1_0__1__Impl : ( RULE_HEAD ) ;
    public final void rule__Opening__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1106:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:1107:1: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:1107:1: ( RULE_HEAD )
            // InternalBPMN_translator.g:1108:2: RULE_HEAD
            {
             before(grammarAccess.getOpeningAccess().getHEADTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_HEAD,FOLLOW_2); 
             after(grammarAccess.getOpeningAccess().getHEADTerminalRuleCall_1_1_0_1()); 

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
    // $ANTLR end "rule__Opening__Group_1_1_0__1__Impl"


    // $ANTLR start "rule__Opening__Group_1_1_0__2"
    // InternalBPMN_translator.g:1117:1: rule__Opening__Group_1_1_0__2 : rule__Opening__Group_1_1_0__2__Impl rule__Opening__Group_1_1_0__3 ;
    public final void rule__Opening__Group_1_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1121:1: ( rule__Opening__Group_1_1_0__2__Impl rule__Opening__Group_1_1_0__3 )
            // InternalBPMN_translator.g:1122:2: rule__Opening__Group_1_1_0__2__Impl rule__Opening__Group_1_1_0__3
            {
            pushFollow(FOLLOW_9);
            rule__Opening__Group_1_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Opening__Group_1_1_0__3();

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
    // $ANTLR end "rule__Opening__Group_1_1_0__2"


    // $ANTLR start "rule__Opening__Group_1_1_0__2__Impl"
    // InternalBPMN_translator.g:1129:1: rule__Opening__Group_1_1_0__2__Impl : ( ':' ) ;
    public final void rule__Opening__Group_1_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1133:1: ( ( ':' ) )
            // InternalBPMN_translator.g:1134:1: ( ':' )
            {
            // InternalBPMN_translator.g:1134:1: ( ':' )
            // InternalBPMN_translator.g:1135:2: ':'
            {
             before(grammarAccess.getOpeningAccess().getColonKeyword_1_1_0_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getOpeningAccess().getColonKeyword_1_1_0_2()); 

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
    // $ANTLR end "rule__Opening__Group_1_1_0__2__Impl"


    // $ANTLR start "rule__Opening__Group_1_1_0__3"
    // InternalBPMN_translator.g:1144:1: rule__Opening__Group_1_1_0__3 : rule__Opening__Group_1_1_0__3__Impl rule__Opening__Group_1_1_0__4 ;
    public final void rule__Opening__Group_1_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1148:1: ( rule__Opening__Group_1_1_0__3__Impl rule__Opening__Group_1_1_0__4 )
            // InternalBPMN_translator.g:1149:2: rule__Opening__Group_1_1_0__3__Impl rule__Opening__Group_1_1_0__4
            {
            pushFollow(FOLLOW_10);
            rule__Opening__Group_1_1_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Opening__Group_1_1_0__4();

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
    // $ANTLR end "rule__Opening__Group_1_1_0__3"


    // $ANTLR start "rule__Opening__Group_1_1_0__3__Impl"
    // InternalBPMN_translator.g:1156:1: rule__Opening__Group_1_1_0__3__Impl : ( RULE_KEYWORDS ) ;
    public final void rule__Opening__Group_1_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1160:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:1161:1: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:1161:1: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:1162:2: RULE_KEYWORDS
            {
             before(grammarAccess.getOpeningAccess().getKEYWORDSTerminalRuleCall_1_1_0_3()); 
            match(input,RULE_KEYWORDS,FOLLOW_2); 
             after(grammarAccess.getOpeningAccess().getKEYWORDSTerminalRuleCall_1_1_0_3()); 

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
    // $ANTLR end "rule__Opening__Group_1_1_0__3__Impl"


    // $ANTLR start "rule__Opening__Group_1_1_0__4"
    // InternalBPMN_translator.g:1171:1: rule__Opening__Group_1_1_0__4 : rule__Opening__Group_1_1_0__4__Impl ;
    public final void rule__Opening__Group_1_1_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1175:1: ( rule__Opening__Group_1_1_0__4__Impl )
            // InternalBPMN_translator.g:1176:2: rule__Opening__Group_1_1_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Opening__Group_1_1_0__4__Impl();

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
    // $ANTLR end "rule__Opening__Group_1_1_0__4"


    // $ANTLR start "rule__Opening__Group_1_1_0__4__Impl"
    // InternalBPMN_translator.g:1182:1: rule__Opening__Group_1_1_0__4__Impl : ( ( rule__Opening__Alternatives_1_1_0_4 )* ) ;
    public final void rule__Opening__Group_1_1_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1186:1: ( ( ( rule__Opening__Alternatives_1_1_0_4 )* ) )
            // InternalBPMN_translator.g:1187:1: ( ( rule__Opening__Alternatives_1_1_0_4 )* )
            {
            // InternalBPMN_translator.g:1187:1: ( ( rule__Opening__Alternatives_1_1_0_4 )* )
            // InternalBPMN_translator.g:1188:2: ( rule__Opening__Alternatives_1_1_0_4 )*
            {
             before(grammarAccess.getOpeningAccess().getAlternatives_1_1_0_4()); 
            // InternalBPMN_translator.g:1189:2: ( rule__Opening__Alternatives_1_1_0_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_KEYWORDS||LA11_0==RULE_HEAD) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBPMN_translator.g:1189:3: rule__Opening__Alternatives_1_1_0_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Opening__Alternatives_1_1_0_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getOpeningAccess().getAlternatives_1_1_0_4()); 

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
    // $ANTLR end "rule__Opening__Group_1_1_0__4__Impl"


    // $ANTLR start "rule__Opening__Group_1_1_0_4_0__0"
    // InternalBPMN_translator.g:1198:1: rule__Opening__Group_1_1_0_4_0__0 : rule__Opening__Group_1_1_0_4_0__0__Impl rule__Opening__Group_1_1_0_4_0__1 ;
    public final void rule__Opening__Group_1_1_0_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1202:1: ( rule__Opening__Group_1_1_0_4_0__0__Impl rule__Opening__Group_1_1_0_4_0__1 )
            // InternalBPMN_translator.g:1203:2: rule__Opening__Group_1_1_0_4_0__0__Impl rule__Opening__Group_1_1_0_4_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Opening__Group_1_1_0_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Opening__Group_1_1_0_4_0__1();

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
    // $ANTLR end "rule__Opening__Group_1_1_0_4_0__0"


    // $ANTLR start "rule__Opening__Group_1_1_0_4_0__0__Impl"
    // InternalBPMN_translator.g:1210:1: rule__Opening__Group_1_1_0_4_0__0__Impl : ( RULE_HEAD ) ;
    public final void rule__Opening__Group_1_1_0_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1214:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:1215:1: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:1215:1: ( RULE_HEAD )
            // InternalBPMN_translator.g:1216:2: RULE_HEAD
            {
             before(grammarAccess.getOpeningAccess().getHEADTerminalRuleCall_1_1_0_4_0_0()); 
            match(input,RULE_HEAD,FOLLOW_2); 
             after(grammarAccess.getOpeningAccess().getHEADTerminalRuleCall_1_1_0_4_0_0()); 

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
    // $ANTLR end "rule__Opening__Group_1_1_0_4_0__0__Impl"


    // $ANTLR start "rule__Opening__Group_1_1_0_4_0__1"
    // InternalBPMN_translator.g:1225:1: rule__Opening__Group_1_1_0_4_0__1 : rule__Opening__Group_1_1_0_4_0__1__Impl ;
    public final void rule__Opening__Group_1_1_0_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1229:1: ( rule__Opening__Group_1_1_0_4_0__1__Impl )
            // InternalBPMN_translator.g:1230:2: rule__Opening__Group_1_1_0_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Opening__Group_1_1_0_4_0__1__Impl();

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
    // $ANTLR end "rule__Opening__Group_1_1_0_4_0__1"


    // $ANTLR start "rule__Opening__Group_1_1_0_4_0__1__Impl"
    // InternalBPMN_translator.g:1236:1: rule__Opening__Group_1_1_0_4_0__1__Impl : ( ':' ) ;
    public final void rule__Opening__Group_1_1_0_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1240:1: ( ( ':' ) )
            // InternalBPMN_translator.g:1241:1: ( ':' )
            {
            // InternalBPMN_translator.g:1241:1: ( ':' )
            // InternalBPMN_translator.g:1242:2: ':'
            {
             before(grammarAccess.getOpeningAccess().getColonKeyword_1_1_0_4_0_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getOpeningAccess().getColonKeyword_1_1_0_4_0_1()); 

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
    // $ANTLR end "rule__Opening__Group_1_1_0_4_0__1__Impl"


    // $ANTLR start "rule__Opening__Group_1_1_0_4_1__0"
    // InternalBPMN_translator.g:1252:1: rule__Opening__Group_1_1_0_4_1__0 : rule__Opening__Group_1_1_0_4_1__0__Impl rule__Opening__Group_1_1_0_4_1__1 ;
    public final void rule__Opening__Group_1_1_0_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1256:1: ( rule__Opening__Group_1_1_0_4_1__0__Impl rule__Opening__Group_1_1_0_4_1__1 )
            // InternalBPMN_translator.g:1257:2: rule__Opening__Group_1_1_0_4_1__0__Impl rule__Opening__Group_1_1_0_4_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Opening__Group_1_1_0_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Opening__Group_1_1_0_4_1__1();

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
    // $ANTLR end "rule__Opening__Group_1_1_0_4_1__0"


    // $ANTLR start "rule__Opening__Group_1_1_0_4_1__0__Impl"
    // InternalBPMN_translator.g:1264:1: rule__Opening__Group_1_1_0_4_1__0__Impl : ( RULE_KEYWORDS ) ;
    public final void rule__Opening__Group_1_1_0_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1268:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:1269:1: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:1269:1: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:1270:2: RULE_KEYWORDS
            {
             before(grammarAccess.getOpeningAccess().getKEYWORDSTerminalRuleCall_1_1_0_4_1_0()); 
            match(input,RULE_KEYWORDS,FOLLOW_2); 
             after(grammarAccess.getOpeningAccess().getKEYWORDSTerminalRuleCall_1_1_0_4_1_0()); 

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
    // $ANTLR end "rule__Opening__Group_1_1_0_4_1__0__Impl"


    // $ANTLR start "rule__Opening__Group_1_1_0_4_1__1"
    // InternalBPMN_translator.g:1279:1: rule__Opening__Group_1_1_0_4_1__1 : rule__Opening__Group_1_1_0_4_1__1__Impl rule__Opening__Group_1_1_0_4_1__2 ;
    public final void rule__Opening__Group_1_1_0_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1283:1: ( rule__Opening__Group_1_1_0_4_1__1__Impl rule__Opening__Group_1_1_0_4_1__2 )
            // InternalBPMN_translator.g:1284:2: rule__Opening__Group_1_1_0_4_1__1__Impl rule__Opening__Group_1_1_0_4_1__2
            {
            pushFollow(FOLLOW_13);
            rule__Opening__Group_1_1_0_4_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Opening__Group_1_1_0_4_1__2();

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
    // $ANTLR end "rule__Opening__Group_1_1_0_4_1__1"


    // $ANTLR start "rule__Opening__Group_1_1_0_4_1__1__Impl"
    // InternalBPMN_translator.g:1291:1: rule__Opening__Group_1_1_0_4_1__1__Impl : ( '=' ) ;
    public final void rule__Opening__Group_1_1_0_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1295:1: ( ( '=' ) )
            // InternalBPMN_translator.g:1296:1: ( '=' )
            {
            // InternalBPMN_translator.g:1296:1: ( '=' )
            // InternalBPMN_translator.g:1297:2: '='
            {
             before(grammarAccess.getOpeningAccess().getEqualsSignKeyword_1_1_0_4_1_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getOpeningAccess().getEqualsSignKeyword_1_1_0_4_1_1()); 

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
    // $ANTLR end "rule__Opening__Group_1_1_0_4_1__1__Impl"


    // $ANTLR start "rule__Opening__Group_1_1_0_4_1__2"
    // InternalBPMN_translator.g:1306:1: rule__Opening__Group_1_1_0_4_1__2 : rule__Opening__Group_1_1_0_4_1__2__Impl ;
    public final void rule__Opening__Group_1_1_0_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1310:1: ( rule__Opening__Group_1_1_0_4_1__2__Impl )
            // InternalBPMN_translator.g:1311:2: rule__Opening__Group_1_1_0_4_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Opening__Group_1_1_0_4_1__2__Impl();

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
    // $ANTLR end "rule__Opening__Group_1_1_0_4_1__2"


    // $ANTLR start "rule__Opening__Group_1_1_0_4_1__2__Impl"
    // InternalBPMN_translator.g:1317:1: rule__Opening__Group_1_1_0_4_1__2__Impl : ( ( rule__Opening__ValueAssignment_1_1_0_4_1_2 ) ) ;
    public final void rule__Opening__Group_1_1_0_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1321:1: ( ( ( rule__Opening__ValueAssignment_1_1_0_4_1_2 ) ) )
            // InternalBPMN_translator.g:1322:1: ( ( rule__Opening__ValueAssignment_1_1_0_4_1_2 ) )
            {
            // InternalBPMN_translator.g:1322:1: ( ( rule__Opening__ValueAssignment_1_1_0_4_1_2 ) )
            // InternalBPMN_translator.g:1323:2: ( rule__Opening__ValueAssignment_1_1_0_4_1_2 )
            {
             before(grammarAccess.getOpeningAccess().getValueAssignment_1_1_0_4_1_2()); 
            // InternalBPMN_translator.g:1324:2: ( rule__Opening__ValueAssignment_1_1_0_4_1_2 )
            // InternalBPMN_translator.g:1324:3: rule__Opening__ValueAssignment_1_1_0_4_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Opening__ValueAssignment_1_1_0_4_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getValueAssignment_1_1_0_4_1_2()); 

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
    // $ANTLR end "rule__Opening__Group_1_1_0_4_1__2__Impl"


    // $ANTLR start "rule__Open__Group__0"
    // InternalBPMN_translator.g:1333:1: rule__Open__Group__0 : rule__Open__Group__0__Impl rule__Open__Group__1 ;
    public final void rule__Open__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1337:1: ( rule__Open__Group__0__Impl rule__Open__Group__1 )
            // InternalBPMN_translator.g:1338:2: rule__Open__Group__0__Impl rule__Open__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Open__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Open__Group__1();

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
    // $ANTLR end "rule__Open__Group__0"


    // $ANTLR start "rule__Open__Group__0__Impl"
    // InternalBPMN_translator.g:1345:1: rule__Open__Group__0__Impl : ( () ) ;
    public final void rule__Open__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1349:1: ( ( () ) )
            // InternalBPMN_translator.g:1350:1: ( () )
            {
            // InternalBPMN_translator.g:1350:1: ( () )
            // InternalBPMN_translator.g:1351:2: ()
            {
             before(grammarAccess.getOpenAccess().getOpensAction_0()); 
            // InternalBPMN_translator.g:1352:2: ()
            // InternalBPMN_translator.g:1352:3: 
            {
            }

             after(grammarAccess.getOpenAccess().getOpensAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Open__Group__0__Impl"


    // $ANTLR start "rule__Open__Group__1"
    // InternalBPMN_translator.g:1360:1: rule__Open__Group__1 : rule__Open__Group__1__Impl rule__Open__Group__2 ;
    public final void rule__Open__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1364:1: ( rule__Open__Group__1__Impl rule__Open__Group__2 )
            // InternalBPMN_translator.g:1365:2: rule__Open__Group__1__Impl rule__Open__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Open__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Open__Group__2();

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
    // $ANTLR end "rule__Open__Group__1"


    // $ANTLR start "rule__Open__Group__1__Impl"
    // InternalBPMN_translator.g:1372:1: rule__Open__Group__1__Impl : ( ( rule__Open__Group_1__0 ) ) ;
    public final void rule__Open__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1376:1: ( ( ( rule__Open__Group_1__0 ) ) )
            // InternalBPMN_translator.g:1377:1: ( ( rule__Open__Group_1__0 ) )
            {
            // InternalBPMN_translator.g:1377:1: ( ( rule__Open__Group_1__0 ) )
            // InternalBPMN_translator.g:1378:2: ( rule__Open__Group_1__0 )
            {
             before(grammarAccess.getOpenAccess().getGroup_1()); 
            // InternalBPMN_translator.g:1379:2: ( rule__Open__Group_1__0 )
            // InternalBPMN_translator.g:1379:3: rule__Open__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Open__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getOpenAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Open__Group__1__Impl"


    // $ANTLR start "rule__Open__Group__2"
    // InternalBPMN_translator.g:1387:1: rule__Open__Group__2 : rule__Open__Group__2__Impl ;
    public final void rule__Open__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1391:1: ( rule__Open__Group__2__Impl )
            // InternalBPMN_translator.g:1392:2: rule__Open__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Open__Group__2__Impl();

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
    // $ANTLR end "rule__Open__Group__2"


    // $ANTLR start "rule__Open__Group__2__Impl"
    // InternalBPMN_translator.g:1398:1: rule__Open__Group__2__Impl : ( ( rule__Open__Alternatives_2 ) ) ;
    public final void rule__Open__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1402:1: ( ( ( rule__Open__Alternatives_2 ) ) )
            // InternalBPMN_translator.g:1403:1: ( ( rule__Open__Alternatives_2 ) )
            {
            // InternalBPMN_translator.g:1403:1: ( ( rule__Open__Alternatives_2 ) )
            // InternalBPMN_translator.g:1404:2: ( rule__Open__Alternatives_2 )
            {
             before(grammarAccess.getOpenAccess().getAlternatives_2()); 
            // InternalBPMN_translator.g:1405:2: ( rule__Open__Alternatives_2 )
            // InternalBPMN_translator.g:1405:3: rule__Open__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Open__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getOpenAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Open__Group__2__Impl"


    // $ANTLR start "rule__Open__Group_1__0"
    // InternalBPMN_translator.g:1414:1: rule__Open__Group_1__0 : rule__Open__Group_1__0__Impl rule__Open__Group_1__1 ;
    public final void rule__Open__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1418:1: ( rule__Open__Group_1__0__Impl rule__Open__Group_1__1 )
            // InternalBPMN_translator.g:1419:2: rule__Open__Group_1__0__Impl rule__Open__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Open__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Open__Group_1__1();

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
    // $ANTLR end "rule__Open__Group_1__0"


    // $ANTLR start "rule__Open__Group_1__0__Impl"
    // InternalBPMN_translator.g:1426:1: rule__Open__Group_1__0__Impl : ( '<' ) ;
    public final void rule__Open__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1430:1: ( ( '<' ) )
            // InternalBPMN_translator.g:1431:1: ( '<' )
            {
            // InternalBPMN_translator.g:1431:1: ( '<' )
            // InternalBPMN_translator.g:1432:2: '<'
            {
             before(grammarAccess.getOpenAccess().getLessThanSignKeyword_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getOpenAccess().getLessThanSignKeyword_1_0()); 

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
    // $ANTLR end "rule__Open__Group_1__0__Impl"


    // $ANTLR start "rule__Open__Group_1__1"
    // InternalBPMN_translator.g:1441:1: rule__Open__Group_1__1 : rule__Open__Group_1__1__Impl rule__Open__Group_1__2 ;
    public final void rule__Open__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1445:1: ( rule__Open__Group_1__1__Impl rule__Open__Group_1__2 )
            // InternalBPMN_translator.g:1446:2: rule__Open__Group_1__1__Impl rule__Open__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__Open__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Open__Group_1__2();

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
    // $ANTLR end "rule__Open__Group_1__1"


    // $ANTLR start "rule__Open__Group_1__1__Impl"
    // InternalBPMN_translator.g:1453:1: rule__Open__Group_1__1__Impl : ( RULE_HEAD ) ;
    public final void rule__Open__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1457:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:1458:1: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:1458:1: ( RULE_HEAD )
            // InternalBPMN_translator.g:1459:2: RULE_HEAD
            {
             before(grammarAccess.getOpenAccess().getHEADTerminalRuleCall_1_1()); 
            match(input,RULE_HEAD,FOLLOW_2); 
             after(grammarAccess.getOpenAccess().getHEADTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Open__Group_1__1__Impl"


    // $ANTLR start "rule__Open__Group_1__2"
    // InternalBPMN_translator.g:1468:1: rule__Open__Group_1__2 : rule__Open__Group_1__2__Impl rule__Open__Group_1__3 ;
    public final void rule__Open__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1472:1: ( rule__Open__Group_1__2__Impl rule__Open__Group_1__3 )
            // InternalBPMN_translator.g:1473:2: rule__Open__Group_1__2__Impl rule__Open__Group_1__3
            {
            pushFollow(FOLLOW_9);
            rule__Open__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Open__Group_1__3();

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
    // $ANTLR end "rule__Open__Group_1__2"


    // $ANTLR start "rule__Open__Group_1__2__Impl"
    // InternalBPMN_translator.g:1480:1: rule__Open__Group_1__2__Impl : ( ':' ) ;
    public final void rule__Open__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1484:1: ( ( ':' ) )
            // InternalBPMN_translator.g:1485:1: ( ':' )
            {
            // InternalBPMN_translator.g:1485:1: ( ':' )
            // InternalBPMN_translator.g:1486:2: ':'
            {
             before(grammarAccess.getOpenAccess().getColonKeyword_1_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getOpenAccess().getColonKeyword_1_2()); 

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
    // $ANTLR end "rule__Open__Group_1__2__Impl"


    // $ANTLR start "rule__Open__Group_1__3"
    // InternalBPMN_translator.g:1495:1: rule__Open__Group_1__3 : rule__Open__Group_1__3__Impl rule__Open__Group_1__4 ;
    public final void rule__Open__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1499:1: ( rule__Open__Group_1__3__Impl rule__Open__Group_1__4 )
            // InternalBPMN_translator.g:1500:2: rule__Open__Group_1__3__Impl rule__Open__Group_1__4
            {
            pushFollow(FOLLOW_15);
            rule__Open__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Open__Group_1__4();

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
    // $ANTLR end "rule__Open__Group_1__3"


    // $ANTLR start "rule__Open__Group_1__3__Impl"
    // InternalBPMN_translator.g:1507:1: rule__Open__Group_1__3__Impl : ( RULE_KEYWORDS ) ;
    public final void rule__Open__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1511:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:1512:1: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:1512:1: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:1513:2: RULE_KEYWORDS
            {
             before(grammarAccess.getOpenAccess().getKEYWORDSTerminalRuleCall_1_3()); 
            match(input,RULE_KEYWORDS,FOLLOW_2); 
             after(grammarAccess.getOpenAccess().getKEYWORDSTerminalRuleCall_1_3()); 

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
    // $ANTLR end "rule__Open__Group_1__3__Impl"


    // $ANTLR start "rule__Open__Group_1__4"
    // InternalBPMN_translator.g:1522:1: rule__Open__Group_1__4 : rule__Open__Group_1__4__Impl rule__Open__Group_1__5 ;
    public final void rule__Open__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1526:1: ( rule__Open__Group_1__4__Impl rule__Open__Group_1__5 )
            // InternalBPMN_translator.g:1527:2: rule__Open__Group_1__4__Impl rule__Open__Group_1__5
            {
            pushFollow(FOLLOW_15);
            rule__Open__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Open__Group_1__5();

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
    // $ANTLR end "rule__Open__Group_1__4"


    // $ANTLR start "rule__Open__Group_1__4__Impl"
    // InternalBPMN_translator.g:1534:1: rule__Open__Group_1__4__Impl : ( ( rule__Open__Alternatives_1_4 )* ) ;
    public final void rule__Open__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1538:1: ( ( ( rule__Open__Alternatives_1_4 )* ) )
            // InternalBPMN_translator.g:1539:1: ( ( rule__Open__Alternatives_1_4 )* )
            {
            // InternalBPMN_translator.g:1539:1: ( ( rule__Open__Alternatives_1_4 )* )
            // InternalBPMN_translator.g:1540:2: ( rule__Open__Alternatives_1_4 )*
            {
             before(grammarAccess.getOpenAccess().getAlternatives_1_4()); 
            // InternalBPMN_translator.g:1541:2: ( rule__Open__Alternatives_1_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_KEYWORDS||LA12_0==RULE_HEAD) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBPMN_translator.g:1541:3: rule__Open__Alternatives_1_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Open__Alternatives_1_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getOpenAccess().getAlternatives_1_4()); 

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
    // $ANTLR end "rule__Open__Group_1__4__Impl"


    // $ANTLR start "rule__Open__Group_1__5"
    // InternalBPMN_translator.g:1549:1: rule__Open__Group_1__5 : rule__Open__Group_1__5__Impl ;
    public final void rule__Open__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1553:1: ( rule__Open__Group_1__5__Impl )
            // InternalBPMN_translator.g:1554:2: rule__Open__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Open__Group_1__5__Impl();

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
    // $ANTLR end "rule__Open__Group_1__5"


    // $ANTLR start "rule__Open__Group_1__5__Impl"
    // InternalBPMN_translator.g:1560:1: rule__Open__Group_1__5__Impl : ( '>' ) ;
    public final void rule__Open__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1564:1: ( ( '>' ) )
            // InternalBPMN_translator.g:1565:1: ( '>' )
            {
            // InternalBPMN_translator.g:1565:1: ( '>' )
            // InternalBPMN_translator.g:1566:2: '>'
            {
             before(grammarAccess.getOpenAccess().getGreaterThanSignKeyword_1_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getOpenAccess().getGreaterThanSignKeyword_1_5()); 

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
    // $ANTLR end "rule__Open__Group_1__5__Impl"


    // $ANTLR start "rule__Open__Group_1_4_0__0"
    // InternalBPMN_translator.g:1576:1: rule__Open__Group_1_4_0__0 : rule__Open__Group_1_4_0__0__Impl rule__Open__Group_1_4_0__1 ;
    public final void rule__Open__Group_1_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1580:1: ( rule__Open__Group_1_4_0__0__Impl rule__Open__Group_1_4_0__1 )
            // InternalBPMN_translator.g:1581:2: rule__Open__Group_1_4_0__0__Impl rule__Open__Group_1_4_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Open__Group_1_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Open__Group_1_4_0__1();

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
    // $ANTLR end "rule__Open__Group_1_4_0__0"


    // $ANTLR start "rule__Open__Group_1_4_0__0__Impl"
    // InternalBPMN_translator.g:1588:1: rule__Open__Group_1_4_0__0__Impl : ( RULE_HEAD ) ;
    public final void rule__Open__Group_1_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1592:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:1593:1: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:1593:1: ( RULE_HEAD )
            // InternalBPMN_translator.g:1594:2: RULE_HEAD
            {
             before(grammarAccess.getOpenAccess().getHEADTerminalRuleCall_1_4_0_0()); 
            match(input,RULE_HEAD,FOLLOW_2); 
             after(grammarAccess.getOpenAccess().getHEADTerminalRuleCall_1_4_0_0()); 

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
    // $ANTLR end "rule__Open__Group_1_4_0__0__Impl"


    // $ANTLR start "rule__Open__Group_1_4_0__1"
    // InternalBPMN_translator.g:1603:1: rule__Open__Group_1_4_0__1 : rule__Open__Group_1_4_0__1__Impl ;
    public final void rule__Open__Group_1_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1607:1: ( rule__Open__Group_1_4_0__1__Impl )
            // InternalBPMN_translator.g:1608:2: rule__Open__Group_1_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Open__Group_1_4_0__1__Impl();

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
    // $ANTLR end "rule__Open__Group_1_4_0__1"


    // $ANTLR start "rule__Open__Group_1_4_0__1__Impl"
    // InternalBPMN_translator.g:1614:1: rule__Open__Group_1_4_0__1__Impl : ( ':' ) ;
    public final void rule__Open__Group_1_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1618:1: ( ( ':' ) )
            // InternalBPMN_translator.g:1619:1: ( ':' )
            {
            // InternalBPMN_translator.g:1619:1: ( ':' )
            // InternalBPMN_translator.g:1620:2: ':'
            {
             before(grammarAccess.getOpenAccess().getColonKeyword_1_4_0_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getOpenAccess().getColonKeyword_1_4_0_1()); 

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
    // $ANTLR end "rule__Open__Group_1_4_0__1__Impl"


    // $ANTLR start "rule__Open__Group_1_4_1__0"
    // InternalBPMN_translator.g:1630:1: rule__Open__Group_1_4_1__0 : rule__Open__Group_1_4_1__0__Impl rule__Open__Group_1_4_1__1 ;
    public final void rule__Open__Group_1_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1634:1: ( rule__Open__Group_1_4_1__0__Impl rule__Open__Group_1_4_1__1 )
            // InternalBPMN_translator.g:1635:2: rule__Open__Group_1_4_1__0__Impl rule__Open__Group_1_4_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Open__Group_1_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Open__Group_1_4_1__1();

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
    // $ANTLR end "rule__Open__Group_1_4_1__0"


    // $ANTLR start "rule__Open__Group_1_4_1__0__Impl"
    // InternalBPMN_translator.g:1642:1: rule__Open__Group_1_4_1__0__Impl : ( RULE_KEYWORDS ) ;
    public final void rule__Open__Group_1_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1646:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:1647:1: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:1647:1: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:1648:2: RULE_KEYWORDS
            {
             before(grammarAccess.getOpenAccess().getKEYWORDSTerminalRuleCall_1_4_1_0()); 
            match(input,RULE_KEYWORDS,FOLLOW_2); 
             after(grammarAccess.getOpenAccess().getKEYWORDSTerminalRuleCall_1_4_1_0()); 

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
    // $ANTLR end "rule__Open__Group_1_4_1__0__Impl"


    // $ANTLR start "rule__Open__Group_1_4_1__1"
    // InternalBPMN_translator.g:1657:1: rule__Open__Group_1_4_1__1 : rule__Open__Group_1_4_1__1__Impl rule__Open__Group_1_4_1__2 ;
    public final void rule__Open__Group_1_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1661:1: ( rule__Open__Group_1_4_1__1__Impl rule__Open__Group_1_4_1__2 )
            // InternalBPMN_translator.g:1662:2: rule__Open__Group_1_4_1__1__Impl rule__Open__Group_1_4_1__2
            {
            pushFollow(FOLLOW_13);
            rule__Open__Group_1_4_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Open__Group_1_4_1__2();

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
    // $ANTLR end "rule__Open__Group_1_4_1__1"


    // $ANTLR start "rule__Open__Group_1_4_1__1__Impl"
    // InternalBPMN_translator.g:1669:1: rule__Open__Group_1_4_1__1__Impl : ( '=' ) ;
    public final void rule__Open__Group_1_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1673:1: ( ( '=' ) )
            // InternalBPMN_translator.g:1674:1: ( '=' )
            {
            // InternalBPMN_translator.g:1674:1: ( '=' )
            // InternalBPMN_translator.g:1675:2: '='
            {
             before(grammarAccess.getOpenAccess().getEqualsSignKeyword_1_4_1_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getOpenAccess().getEqualsSignKeyword_1_4_1_1()); 

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
    // $ANTLR end "rule__Open__Group_1_4_1__1__Impl"


    // $ANTLR start "rule__Open__Group_1_4_1__2"
    // InternalBPMN_translator.g:1684:1: rule__Open__Group_1_4_1__2 : rule__Open__Group_1_4_1__2__Impl ;
    public final void rule__Open__Group_1_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1688:1: ( rule__Open__Group_1_4_1__2__Impl )
            // InternalBPMN_translator.g:1689:2: rule__Open__Group_1_4_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Open__Group_1_4_1__2__Impl();

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
    // $ANTLR end "rule__Open__Group_1_4_1__2"


    // $ANTLR start "rule__Open__Group_1_4_1__2__Impl"
    // InternalBPMN_translator.g:1695:1: rule__Open__Group_1_4_1__2__Impl : ( ( rule__Open__ValueAssignment_1_4_1_2 ) ) ;
    public final void rule__Open__Group_1_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1699:1: ( ( ( rule__Open__ValueAssignment_1_4_1_2 ) ) )
            // InternalBPMN_translator.g:1700:1: ( ( rule__Open__ValueAssignment_1_4_1_2 ) )
            {
            // InternalBPMN_translator.g:1700:1: ( ( rule__Open__ValueAssignment_1_4_1_2 ) )
            // InternalBPMN_translator.g:1701:2: ( rule__Open__ValueAssignment_1_4_1_2 )
            {
             before(grammarAccess.getOpenAccess().getValueAssignment_1_4_1_2()); 
            // InternalBPMN_translator.g:1702:2: ( rule__Open__ValueAssignment_1_4_1_2 )
            // InternalBPMN_translator.g:1702:3: rule__Open__ValueAssignment_1_4_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Open__ValueAssignment_1_4_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOpenAccess().getValueAssignment_1_4_1_2()); 

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
    // $ANTLR end "rule__Open__Group_1_4_1__2__Impl"


    // $ANTLR start "rule__Close__Group__0"
    // InternalBPMN_translator.g:1711:1: rule__Close__Group__0 : rule__Close__Group__0__Impl rule__Close__Group__1 ;
    public final void rule__Close__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1715:1: ( rule__Close__Group__0__Impl rule__Close__Group__1 )
            // InternalBPMN_translator.g:1716:2: rule__Close__Group__0__Impl rule__Close__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Close__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Close__Group__1();

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
    // $ANTLR end "rule__Close__Group__0"


    // $ANTLR start "rule__Close__Group__0__Impl"
    // InternalBPMN_translator.g:1723:1: rule__Close__Group__0__Impl : ( () ) ;
    public final void rule__Close__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1727:1: ( ( () ) )
            // InternalBPMN_translator.g:1728:1: ( () )
            {
            // InternalBPMN_translator.g:1728:1: ( () )
            // InternalBPMN_translator.g:1729:2: ()
            {
             before(grammarAccess.getCloseAccess().getCloseAction_0()); 
            // InternalBPMN_translator.g:1730:2: ()
            // InternalBPMN_translator.g:1730:3: 
            {
            }

             after(grammarAccess.getCloseAccess().getCloseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Close__Group__0__Impl"


    // $ANTLR start "rule__Close__Group__1"
    // InternalBPMN_translator.g:1738:1: rule__Close__Group__1 : rule__Close__Group__1__Impl ;
    public final void rule__Close__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1742:1: ( rule__Close__Group__1__Impl )
            // InternalBPMN_translator.g:1743:2: rule__Close__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Close__Group__1__Impl();

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
    // $ANTLR end "rule__Close__Group__1"


    // $ANTLR start "rule__Close__Group__1__Impl"
    // InternalBPMN_translator.g:1749:1: rule__Close__Group__1__Impl : ( ( rule__Close__Group_1__0 ) ) ;
    public final void rule__Close__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1753:1: ( ( ( rule__Close__Group_1__0 ) ) )
            // InternalBPMN_translator.g:1754:1: ( ( rule__Close__Group_1__0 ) )
            {
            // InternalBPMN_translator.g:1754:1: ( ( rule__Close__Group_1__0 ) )
            // InternalBPMN_translator.g:1755:2: ( rule__Close__Group_1__0 )
            {
             before(grammarAccess.getCloseAccess().getGroup_1()); 
            // InternalBPMN_translator.g:1756:2: ( rule__Close__Group_1__0 )
            // InternalBPMN_translator.g:1756:3: rule__Close__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Close__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getCloseAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Close__Group__1__Impl"


    // $ANTLR start "rule__Close__Group_1__0"
    // InternalBPMN_translator.g:1765:1: rule__Close__Group_1__0 : rule__Close__Group_1__0__Impl rule__Close__Group_1__1 ;
    public final void rule__Close__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1769:1: ( rule__Close__Group_1__0__Impl rule__Close__Group_1__1 )
            // InternalBPMN_translator.g:1770:2: rule__Close__Group_1__0__Impl rule__Close__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Close__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Close__Group_1__1();

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
    // $ANTLR end "rule__Close__Group_1__0"


    // $ANTLR start "rule__Close__Group_1__0__Impl"
    // InternalBPMN_translator.g:1777:1: rule__Close__Group_1__0__Impl : ( '</' ) ;
    public final void rule__Close__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1781:1: ( ( '</' ) )
            // InternalBPMN_translator.g:1782:1: ( '</' )
            {
            // InternalBPMN_translator.g:1782:1: ( '</' )
            // InternalBPMN_translator.g:1783:2: '</'
            {
             before(grammarAccess.getCloseAccess().getLessThanSignSolidusKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCloseAccess().getLessThanSignSolidusKeyword_1_0()); 

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
    // $ANTLR end "rule__Close__Group_1__0__Impl"


    // $ANTLR start "rule__Close__Group_1__1"
    // InternalBPMN_translator.g:1792:1: rule__Close__Group_1__1 : rule__Close__Group_1__1__Impl rule__Close__Group_1__2 ;
    public final void rule__Close__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1796:1: ( rule__Close__Group_1__1__Impl rule__Close__Group_1__2 )
            // InternalBPMN_translator.g:1797:2: rule__Close__Group_1__1__Impl rule__Close__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__Close__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Close__Group_1__2();

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
    // $ANTLR end "rule__Close__Group_1__1"


    // $ANTLR start "rule__Close__Group_1__1__Impl"
    // InternalBPMN_translator.g:1804:1: rule__Close__Group_1__1__Impl : ( RULE_HEAD ) ;
    public final void rule__Close__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1808:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:1809:1: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:1809:1: ( RULE_HEAD )
            // InternalBPMN_translator.g:1810:2: RULE_HEAD
            {
             before(grammarAccess.getCloseAccess().getHEADTerminalRuleCall_1_1()); 
            match(input,RULE_HEAD,FOLLOW_2); 
             after(grammarAccess.getCloseAccess().getHEADTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Close__Group_1__1__Impl"


    // $ANTLR start "rule__Close__Group_1__2"
    // InternalBPMN_translator.g:1819:1: rule__Close__Group_1__2 : rule__Close__Group_1__2__Impl rule__Close__Group_1__3 ;
    public final void rule__Close__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1823:1: ( rule__Close__Group_1__2__Impl rule__Close__Group_1__3 )
            // InternalBPMN_translator.g:1824:2: rule__Close__Group_1__2__Impl rule__Close__Group_1__3
            {
            pushFollow(FOLLOW_9);
            rule__Close__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Close__Group_1__3();

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
    // $ANTLR end "rule__Close__Group_1__2"


    // $ANTLR start "rule__Close__Group_1__2__Impl"
    // InternalBPMN_translator.g:1831:1: rule__Close__Group_1__2__Impl : ( ':' ) ;
    public final void rule__Close__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1835:1: ( ( ':' ) )
            // InternalBPMN_translator.g:1836:1: ( ':' )
            {
            // InternalBPMN_translator.g:1836:1: ( ':' )
            // InternalBPMN_translator.g:1837:2: ':'
            {
             before(grammarAccess.getCloseAccess().getColonKeyword_1_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCloseAccess().getColonKeyword_1_2()); 

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
    // $ANTLR end "rule__Close__Group_1__2__Impl"


    // $ANTLR start "rule__Close__Group_1__3"
    // InternalBPMN_translator.g:1846:1: rule__Close__Group_1__3 : rule__Close__Group_1__3__Impl rule__Close__Group_1__4 ;
    public final void rule__Close__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1850:1: ( rule__Close__Group_1__3__Impl rule__Close__Group_1__4 )
            // InternalBPMN_translator.g:1851:2: rule__Close__Group_1__3__Impl rule__Close__Group_1__4
            {
            pushFollow(FOLLOW_16);
            rule__Close__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Close__Group_1__4();

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
    // $ANTLR end "rule__Close__Group_1__3"


    // $ANTLR start "rule__Close__Group_1__3__Impl"
    // InternalBPMN_translator.g:1858:1: rule__Close__Group_1__3__Impl : ( RULE_KEYWORDS ) ;
    public final void rule__Close__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1862:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:1863:1: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:1863:1: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:1864:2: RULE_KEYWORDS
            {
             before(grammarAccess.getCloseAccess().getKEYWORDSTerminalRuleCall_1_3()); 
            match(input,RULE_KEYWORDS,FOLLOW_2); 
             after(grammarAccess.getCloseAccess().getKEYWORDSTerminalRuleCall_1_3()); 

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
    // $ANTLR end "rule__Close__Group_1__3__Impl"


    // $ANTLR start "rule__Close__Group_1__4"
    // InternalBPMN_translator.g:1873:1: rule__Close__Group_1__4 : rule__Close__Group_1__4__Impl ;
    public final void rule__Close__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1877:1: ( rule__Close__Group_1__4__Impl )
            // InternalBPMN_translator.g:1878:2: rule__Close__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Close__Group_1__4__Impl();

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
    // $ANTLR end "rule__Close__Group_1__4"


    // $ANTLR start "rule__Close__Group_1__4__Impl"
    // InternalBPMN_translator.g:1884:1: rule__Close__Group_1__4__Impl : ( '>' ) ;
    public final void rule__Close__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1888:1: ( ( '>' ) )
            // InternalBPMN_translator.g:1889:1: ( '>' )
            {
            // InternalBPMN_translator.g:1889:1: ( '>' )
            // InternalBPMN_translator.g:1890:2: '>'
            {
             before(grammarAccess.getCloseAccess().getGreaterThanSignKeyword_1_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCloseAccess().getGreaterThanSignKeyword_1_4()); 

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
    // $ANTLR end "rule__Close__Group_1__4__Impl"


    // $ANTLR start "rule__Model__ModelAssignment"
    // InternalBPMN_translator.g:1900:1: rule__Model__ModelAssignment : ( ruleXml ) ;
    public final void rule__Model__ModelAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1904:1: ( ( ruleXml ) )
            // InternalBPMN_translator.g:1905:2: ( ruleXml )
            {
            // InternalBPMN_translator.g:1905:2: ( ruleXml )
            // InternalBPMN_translator.g:1906:3: ruleXml
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


    // $ANTLR start "rule__Xml__Opening_tagAssignment_1"
    // InternalBPMN_translator.g:1915:1: rule__Xml__Opening_tagAssignment_1 : ( ruleOpening ) ;
    public final void rule__Xml__Opening_tagAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1919:1: ( ( ruleOpening ) )
            // InternalBPMN_translator.g:1920:2: ( ruleOpening )
            {
            // InternalBPMN_translator.g:1920:2: ( ruleOpening )
            // InternalBPMN_translator.g:1921:3: ruleOpening
            {
             before(grammarAccess.getXmlAccess().getOpening_tagOpeningParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOpening();

            state._fsp--;

             after(grammarAccess.getXmlAccess().getOpening_tagOpeningParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Xml__Opening_tagAssignment_1"


    // $ANTLR start "rule__Opening__ProvaAssignment_0_1_0_0"
    // InternalBPMN_translator.g:1930:1: rule__Opening__ProvaAssignment_0_1_0_0 : ( ruleOpen ) ;
    public final void rule__Opening__ProvaAssignment_0_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1934:1: ( ( ruleOpen ) )
            // InternalBPMN_translator.g:1935:2: ( ruleOpen )
            {
            // InternalBPMN_translator.g:1935:2: ( ruleOpen )
            // InternalBPMN_translator.g:1936:3: ruleOpen
            {
             before(grammarAccess.getOpeningAccess().getProvaOpenParserRuleCall_0_1_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOpen();

            state._fsp--;

             after(grammarAccess.getOpeningAccess().getProvaOpenParserRuleCall_0_1_0_0_0()); 

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
    // $ANTLR end "rule__Opening__ProvaAssignment_0_1_0_0"


    // $ANTLR start "rule__Opening__Prova1Assignment_0_1_0_1"
    // InternalBPMN_translator.g:1945:1: rule__Opening__Prova1Assignment_0_1_0_1 : ( ruleClose ) ;
    public final void rule__Opening__Prova1Assignment_0_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1949:1: ( ( ruleClose ) )
            // InternalBPMN_translator.g:1950:2: ( ruleClose )
            {
            // InternalBPMN_translator.g:1950:2: ( ruleClose )
            // InternalBPMN_translator.g:1951:3: ruleClose
            {
             before(grammarAccess.getOpeningAccess().getProva1CloseParserRuleCall_0_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClose();

            state._fsp--;

             after(grammarAccess.getOpeningAccess().getProva1CloseParserRuleCall_0_1_0_1_0()); 

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
    // $ANTLR end "rule__Opening__Prova1Assignment_0_1_0_1"


    // $ANTLR start "rule__Opening__ProvaAssignment_0_1_1_0"
    // InternalBPMN_translator.g:1960:1: rule__Opening__ProvaAssignment_0_1_1_0 : ( ruleOpen ) ;
    public final void rule__Opening__ProvaAssignment_0_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1964:1: ( ( ruleOpen ) )
            // InternalBPMN_translator.g:1965:2: ( ruleOpen )
            {
            // InternalBPMN_translator.g:1965:2: ( ruleOpen )
            // InternalBPMN_translator.g:1966:3: ruleOpen
            {
             before(grammarAccess.getOpeningAccess().getProvaOpenParserRuleCall_0_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOpen();

            state._fsp--;

             after(grammarAccess.getOpeningAccess().getProvaOpenParserRuleCall_0_1_1_0_0()); 

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
    // $ANTLR end "rule__Opening__ProvaAssignment_0_1_1_0"


    // $ANTLR start "rule__Opening__Prova1Assignment_0_1_1_1"
    // InternalBPMN_translator.g:1975:1: rule__Opening__Prova1Assignment_0_1_1_1 : ( ruleClose ) ;
    public final void rule__Opening__Prova1Assignment_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1979:1: ( ( ruleClose ) )
            // InternalBPMN_translator.g:1980:2: ( ruleClose )
            {
            // InternalBPMN_translator.g:1980:2: ( ruleClose )
            // InternalBPMN_translator.g:1981:3: ruleClose
            {
             before(grammarAccess.getOpeningAccess().getProva1CloseParserRuleCall_0_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClose();

            state._fsp--;

             after(grammarAccess.getOpeningAccess().getProva1CloseParserRuleCall_0_1_1_1_0()); 

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
    // $ANTLR end "rule__Opening__Prova1Assignment_0_1_1_1"


    // $ANTLR start "rule__Opening__ValueAssignment_0_1_2_0_4_1_2"
    // InternalBPMN_translator.g:1990:1: rule__Opening__ValueAssignment_0_1_2_0_4_1_2 : ( RULE_STRING ) ;
    public final void rule__Opening__ValueAssignment_0_1_2_0_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1994:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:1995:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:1995:2: ( RULE_STRING )
            // InternalBPMN_translator.g:1996:3: RULE_STRING
            {
             before(grammarAccess.getOpeningAccess().getValueSTRINGTerminalRuleCall_0_1_2_0_4_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOpeningAccess().getValueSTRINGTerminalRuleCall_0_1_2_0_4_1_2_0()); 

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
    // $ANTLR end "rule__Opening__ValueAssignment_0_1_2_0_4_1_2"


    // $ANTLR start "rule__Opening__ValueAssignment_1_1_0_4_1_2"
    // InternalBPMN_translator.g:2005:1: rule__Opening__ValueAssignment_1_1_0_4_1_2 : ( RULE_STRING ) ;
    public final void rule__Opening__ValueAssignment_1_1_0_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2009:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:2010:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:2010:2: ( RULE_STRING )
            // InternalBPMN_translator.g:2011:3: RULE_STRING
            {
             before(grammarAccess.getOpeningAccess().getValueSTRINGTerminalRuleCall_1_1_0_4_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOpeningAccess().getValueSTRINGTerminalRuleCall_1_1_0_4_1_2_0()); 

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
    // $ANTLR end "rule__Opening__ValueAssignment_1_1_0_4_1_2"


    // $ANTLR start "rule__Open__ValueAssignment_1_4_1_2"
    // InternalBPMN_translator.g:2020:1: rule__Open__ValueAssignment_1_4_1_2 : ( RULE_STRING ) ;
    public final void rule__Open__ValueAssignment_1_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2024:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:2025:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:2025:2: ( RULE_STRING )
            // InternalBPMN_translator.g:2026:3: RULE_STRING
            {
             before(grammarAccess.getOpenAccess().getValueSTRINGTerminalRuleCall_1_4_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOpenAccess().getValueSTRINGTerminalRuleCall_1_4_1_2_0()); 

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
    // $ANTLR end "rule__Open__ValueAssignment_1_4_1_2"


    // $ANTLR start "rule__Open__ProvaAssignment_2_1"
    // InternalBPMN_translator.g:2035:1: rule__Open__ProvaAssignment_2_1 : ( ruleOpening ) ;
    public final void rule__Open__ProvaAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2039:1: ( ( ruleOpening ) )
            // InternalBPMN_translator.g:2040:2: ( ruleOpening )
            {
            // InternalBPMN_translator.g:2040:2: ( ruleOpening )
            // InternalBPMN_translator.g:2041:3: ruleOpening
            {
             before(grammarAccess.getOpenAccess().getProvaOpeningParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOpening();

            state._fsp--;

             after(grammarAccess.getOpenAccess().getProvaOpeningParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Open__ProvaAssignment_2_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\2\13\uffff";
    static final String dfa_3s = "\1\17\1\7\1\uffff\1\20\2\5\1\20\1\21\1\uffff\1\5\1\6\1\5";
    static final String dfa_4s = "\1\23\1\7\1\uffff\1\20\1\5\1\22\1\20\1\21\1\uffff\1\22\1\6\1\22";
    static final String dfa_5s = "\2\uffff\1\2\5\uffff\1\1\3\uffff";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\3\uffff\1\2",
            "\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\7\1\uffff\1\6\6\uffff\1\2\3\uffff\1\10",
            "\1\11",
            "\1\12",
            "",
            "\1\7\1\uffff\1\6\6\uffff\1\2\3\uffff\1\10",
            "\1\13",
            "\1\7\1\uffff\1\6\6\uffff\1\2\3\uffff\1\10"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

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
            return "202:1: rule__Opening__Alternatives : ( ( ( rule__Opening__Group_0__0 ) ) | ( ( rule__Opening__Group_1__0 ) ) );";
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 488:2: ( rule__Opening__Group_0_1_1__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000000A2L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000400A0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});

}