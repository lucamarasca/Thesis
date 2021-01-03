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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BODY", "RULE_HEAD", "RULE_STRING", "RULE_KEYWORDS", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'_TASK'", "'_GATEWAY'", "'&lt;'", "'&le;'", "'&ge;'", "'&gt;'", "'='", "'&amp;'", "'||'", "')'", "'!='", "'!'", "'('", "'<?'", "'version='", "'encoding='", "'?>'", "'{'", "'}'", "'<'", "':'", "'>'", "'/>'", "'</'", "'TEMPERATURE'", "'['", "','", "']'", "'DEVICE'", "'NAMEID'", "'NAME'", "'SERVER_IP'", "'REQUEST_TYPE'", "'CONTENT_TYPE'", "'HEADER'", "'DATA'", "'NETWORK'", "'BROKER_USER'", "'BROKER_PASSWORD'", "'BROKER'", "'SUBTOPICS'", "'TOPIC_NAME'", "'PUBTOPICS'", "'SSID'", "'PASSWORD'", "'PROTOCOL_DEVICE'", "'PINS'", "'SENSOR_ID'", "'MQTT'", "'HTTP'", "'DISTANCE'"
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
    public static final int RULE_BODY=4;
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
    public static final int RULE_STRING=6;
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
    public static final int RULE_HEAD=5;
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


    // $ANTLR start "entryRuleprolog"
    // InternalBPMN_translator.g:103:1: entryRuleprolog : ruleprolog EOF ;
    public final void entryRuleprolog() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:104:1: ( ruleprolog EOF )
            // InternalBPMN_translator.g:105:1: ruleprolog EOF
            {
             before(grammarAccess.getPrologRule()); 
            pushFollow(FOLLOW_1);
            ruleprolog();

            state._fsp--;

             after(grammarAccess.getPrologRule()); 
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
    // $ANTLR end "entryRuleprolog"


    // $ANTLR start "ruleprolog"
    // InternalBPMN_translator.g:112:1: ruleprolog : ( ( rule__Prolog__Group__0 ) ) ;
    public final void ruleprolog() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:116:2: ( ( ( rule__Prolog__Group__0 ) ) )
            // InternalBPMN_translator.g:117:2: ( ( rule__Prolog__Group__0 ) )
            {
            // InternalBPMN_translator.g:117:2: ( ( rule__Prolog__Group__0 ) )
            // InternalBPMN_translator.g:118:3: ( rule__Prolog__Group__0 )
            {
             before(grammarAccess.getPrologAccess().getGroup()); 
            // InternalBPMN_translator.g:119:3: ( rule__Prolog__Group__0 )
            // InternalBPMN_translator.g:119:4: rule__Prolog__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Prolog__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrologAccess().getGroup()); 

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
    // $ANTLR end "ruleprolog"


    // $ANTLR start "entryRuleelement"
    // InternalBPMN_translator.g:128:1: entryRuleelement : ruleelement EOF ;
    public final void entryRuleelement() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:129:1: ( ruleelement EOF )
            // InternalBPMN_translator.g:130:1: ruleelement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleelement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
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
    // $ANTLR end "entryRuleelement"


    // $ANTLR start "ruleelement"
    // InternalBPMN_translator.g:137:1: ruleelement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleelement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:141:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalBPMN_translator.g:142:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalBPMN_translator.g:142:2: ( ( rule__Element__Alternatives ) )
            // InternalBPMN_translator.g:143:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalBPMN_translator.g:144:3: ( rule__Element__Alternatives )
            // InternalBPMN_translator.g:144:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleelement"


    // $ANTLR start "entryRulecontent"
    // InternalBPMN_translator.g:153:1: entryRulecontent : rulecontent EOF ;
    public final void entryRulecontent() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:154:1: ( rulecontent EOF )
            // InternalBPMN_translator.g:155:1: rulecontent EOF
            {
             before(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            rulecontent();

            state._fsp--;

             after(grammarAccess.getContentRule()); 
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
    // $ANTLR end "entryRulecontent"


    // $ANTLR start "rulecontent"
    // InternalBPMN_translator.g:162:1: rulecontent : ( ( rule__Content__Group__0 ) ) ;
    public final void rulecontent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:166:2: ( ( ( rule__Content__Group__0 ) ) )
            // InternalBPMN_translator.g:167:2: ( ( rule__Content__Group__0 ) )
            {
            // InternalBPMN_translator.g:167:2: ( ( rule__Content__Group__0 ) )
            // InternalBPMN_translator.g:168:3: ( rule__Content__Group__0 )
            {
             before(grammarAccess.getContentAccess().getGroup()); 
            // InternalBPMN_translator.g:169:3: ( rule__Content__Group__0 )
            // InternalBPMN_translator.g:169:4: rule__Content__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Content__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getGroup()); 

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
    // $ANTLR end "rulecontent"


    // $ANTLR start "entryRuleOpen"
    // InternalBPMN_translator.g:178:1: entryRuleOpen : ruleOpen EOF ;
    public final void entryRuleOpen() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:179:1: ( ruleOpen EOF )
            // InternalBPMN_translator.g:180:1: ruleOpen EOF
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
    // InternalBPMN_translator.g:187:1: ruleOpen : ( ( rule__Open__Group__0 ) ) ;
    public final void ruleOpen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:191:2: ( ( ( rule__Open__Group__0 ) ) )
            // InternalBPMN_translator.g:192:2: ( ( rule__Open__Group__0 ) )
            {
            // InternalBPMN_translator.g:192:2: ( ( rule__Open__Group__0 ) )
            // InternalBPMN_translator.g:193:3: ( rule__Open__Group__0 )
            {
             before(grammarAccess.getOpenAccess().getGroup()); 
            // InternalBPMN_translator.g:194:3: ( rule__Open__Group__0 )
            // InternalBPMN_translator.g:194:4: rule__Open__Group__0
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


    // $ANTLR start "entryRuleSingleton"
    // InternalBPMN_translator.g:203:1: entryRuleSingleton : ruleSingleton EOF ;
    public final void entryRuleSingleton() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:204:1: ( ruleSingleton EOF )
            // InternalBPMN_translator.g:205:1: ruleSingleton EOF
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
    // InternalBPMN_translator.g:212:1: ruleSingleton : ( ( rule__Singleton__Group__0 ) ) ;
    public final void ruleSingleton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:216:2: ( ( ( rule__Singleton__Group__0 ) ) )
            // InternalBPMN_translator.g:217:2: ( ( rule__Singleton__Group__0 ) )
            {
            // InternalBPMN_translator.g:217:2: ( ( rule__Singleton__Group__0 ) )
            // InternalBPMN_translator.g:218:3: ( rule__Singleton__Group__0 )
            {
             before(grammarAccess.getSingletonAccess().getGroup()); 
            // InternalBPMN_translator.g:219:3: ( rule__Singleton__Group__0 )
            // InternalBPMN_translator.g:219:4: rule__Singleton__Group__0
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


    // $ANTLR start "entryRuleClose"
    // InternalBPMN_translator.g:228:1: entryRuleClose : ruleClose EOF ;
    public final void entryRuleClose() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:229:1: ( ruleClose EOF )
            // InternalBPMN_translator.g:230:1: ruleClose EOF
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
    // InternalBPMN_translator.g:237:1: ruleClose : ( ( rule__Close__Group__0 ) ) ;
    public final void ruleClose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:241:2: ( ( ( rule__Close__Group__0 ) ) )
            // InternalBPMN_translator.g:242:2: ( ( rule__Close__Group__0 ) )
            {
            // InternalBPMN_translator.g:242:2: ( ( rule__Close__Group__0 ) )
            // InternalBPMN_translator.g:243:3: ( rule__Close__Group__0 )
            {
             before(grammarAccess.getCloseAccess().getGroup()); 
            // InternalBPMN_translator.g:244:3: ( rule__Close__Group__0 )
            // InternalBPMN_translator.g:244:4: rule__Close__Group__0
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


    // $ANTLR start "entryRulevariables"
    // InternalBPMN_translator.g:253:1: entryRulevariables : rulevariables EOF ;
    public final void entryRulevariables() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:254:1: ( rulevariables EOF )
            // InternalBPMN_translator.g:255:1: rulevariables EOF
            {
             before(grammarAccess.getVariablesRule()); 
            pushFollow(FOLLOW_1);
            rulevariables();

            state._fsp--;

             after(grammarAccess.getVariablesRule()); 
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
    // $ANTLR end "entryRulevariables"


    // $ANTLR start "rulevariables"
    // InternalBPMN_translator.g:262:1: rulevariables : ( ( rule__Variables__Alternatives ) ) ;
    public final void rulevariables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:266:2: ( ( ( rule__Variables__Alternatives ) ) )
            // InternalBPMN_translator.g:267:2: ( ( rule__Variables__Alternatives ) )
            {
            // InternalBPMN_translator.g:267:2: ( ( rule__Variables__Alternatives ) )
            // InternalBPMN_translator.g:268:3: ( rule__Variables__Alternatives )
            {
             before(grammarAccess.getVariablesAccess().getAlternatives()); 
            // InternalBPMN_translator.g:269:3: ( rule__Variables__Alternatives )
            // InternalBPMN_translator.g:269:4: rule__Variables__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Variables__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariablesAccess().getAlternatives()); 

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
    // $ANTLR end "rulevariables"


    // $ANTLR start "entryRuleconditions"
    // InternalBPMN_translator.g:278:1: entryRuleconditions : ruleconditions EOF ;
    public final void entryRuleconditions() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:279:1: ( ruleconditions EOF )
            // InternalBPMN_translator.g:280:1: ruleconditions EOF
            {
             before(grammarAccess.getConditionsRule()); 
            pushFollow(FOLLOW_1);
            ruleconditions();

            state._fsp--;

             after(grammarAccess.getConditionsRule()); 
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
    // $ANTLR end "entryRuleconditions"


    // $ANTLR start "ruleconditions"
    // InternalBPMN_translator.g:287:1: ruleconditions : ( ( rule__Conditions__Alternatives ) ) ;
    public final void ruleconditions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:291:2: ( ( ( rule__Conditions__Alternatives ) ) )
            // InternalBPMN_translator.g:292:2: ( ( rule__Conditions__Alternatives ) )
            {
            // InternalBPMN_translator.g:292:2: ( ( rule__Conditions__Alternatives ) )
            // InternalBPMN_translator.g:293:3: ( rule__Conditions__Alternatives )
            {
             before(grammarAccess.getConditionsAccess().getAlternatives()); 
            // InternalBPMN_translator.g:294:3: ( rule__Conditions__Alternatives )
            // InternalBPMN_translator.g:294:4: rule__Conditions__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Conditions__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleconditions"


    // $ANTLR start "entryRulepreconditions"
    // InternalBPMN_translator.g:303:1: entryRulepreconditions : rulepreconditions EOF ;
    public final void entryRulepreconditions() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:304:1: ( rulepreconditions EOF )
            // InternalBPMN_translator.g:305:1: rulepreconditions EOF
            {
             before(grammarAccess.getPreconditionsRule()); 
            pushFollow(FOLLOW_1);
            rulepreconditions();

            state._fsp--;

             after(grammarAccess.getPreconditionsRule()); 
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
    // $ANTLR end "entryRulepreconditions"


    // $ANTLR start "rulepreconditions"
    // InternalBPMN_translator.g:312:1: rulepreconditions : ( ( rule__Preconditions__Alternatives ) ) ;
    public final void rulepreconditions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:316:2: ( ( ( rule__Preconditions__Alternatives ) ) )
            // InternalBPMN_translator.g:317:2: ( ( rule__Preconditions__Alternatives ) )
            {
            // InternalBPMN_translator.g:317:2: ( ( rule__Preconditions__Alternatives ) )
            // InternalBPMN_translator.g:318:3: ( rule__Preconditions__Alternatives )
            {
             before(grammarAccess.getPreconditionsAccess().getAlternatives()); 
            // InternalBPMN_translator.g:319:3: ( rule__Preconditions__Alternatives )
            // InternalBPMN_translator.g:319:4: rule__Preconditions__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Preconditions__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPreconditionsAccess().getAlternatives()); 

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
    // $ANTLR end "rulepreconditions"


    // $ANTLR start "entryRulecodex"
    // InternalBPMN_translator.g:328:1: entryRulecodex : rulecodex EOF ;
    public final void entryRulecodex() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:329:1: ( rulecodex EOF )
            // InternalBPMN_translator.g:330:1: rulecodex EOF
            {
             before(grammarAccess.getCodexRule()); 
            pushFollow(FOLLOW_1);
            rulecodex();

            state._fsp--;

             after(grammarAccess.getCodexRule()); 
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
    // $ANTLR end "entryRulecodex"


    // $ANTLR start "rulecodex"
    // InternalBPMN_translator.g:337:1: rulecodex : ( ( rule__Codex__Group__0 ) ) ;
    public final void rulecodex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:341:2: ( ( ( rule__Codex__Group__0 ) ) )
            // InternalBPMN_translator.g:342:2: ( ( rule__Codex__Group__0 ) )
            {
            // InternalBPMN_translator.g:342:2: ( ( rule__Codex__Group__0 ) )
            // InternalBPMN_translator.g:343:3: ( rule__Codex__Group__0 )
            {
             before(grammarAccess.getCodexAccess().getGroup()); 
            // InternalBPMN_translator.g:344:3: ( rule__Codex__Group__0 )
            // InternalBPMN_translator.g:344:4: rule__Codex__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Codex__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCodexAccess().getGroup()); 

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
    // $ANTLR end "rulecodex"


    // $ANTLR start "entryRuledevice"
    // InternalBPMN_translator.g:353:1: entryRuledevice : ruledevice EOF ;
    public final void entryRuledevice() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:354:1: ( ruledevice EOF )
            // InternalBPMN_translator.g:355:1: ruledevice EOF
            {
             before(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            ruledevice();

            state._fsp--;

             after(grammarAccess.getDeviceRule()); 
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
    // $ANTLR end "entryRuledevice"


    // $ANTLR start "ruledevice"
    // InternalBPMN_translator.g:362:1: ruledevice : ( ( rule__Device__Group__0 ) ) ;
    public final void ruledevice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:366:2: ( ( ( rule__Device__Group__0 ) ) )
            // InternalBPMN_translator.g:367:2: ( ( rule__Device__Group__0 ) )
            {
            // InternalBPMN_translator.g:367:2: ( ( rule__Device__Group__0 ) )
            // InternalBPMN_translator.g:368:3: ( rule__Device__Group__0 )
            {
             before(grammarAccess.getDeviceAccess().getGroup()); 
            // InternalBPMN_translator.g:369:3: ( rule__Device__Group__0 )
            // InternalBPMN_translator.g:369:4: rule__Device__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getGroup()); 

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
    // $ANTLR end "ruledevice"


    // $ANTLR start "entryRuleprotocol"
    // InternalBPMN_translator.g:378:1: entryRuleprotocol : ruleprotocol EOF ;
    public final void entryRuleprotocol() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:379:1: ( ruleprotocol EOF )
            // InternalBPMN_translator.g:380:1: ruleprotocol EOF
            {
             before(grammarAccess.getProtocolRule()); 
            pushFollow(FOLLOW_1);
            ruleprotocol();

            state._fsp--;

             after(grammarAccess.getProtocolRule()); 
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
    // $ANTLR end "entryRuleprotocol"


    // $ANTLR start "ruleprotocol"
    // InternalBPMN_translator.g:387:1: ruleprotocol : ( ( rule__Protocol__Alternatives ) ) ;
    public final void ruleprotocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:391:2: ( ( ( rule__Protocol__Alternatives ) ) )
            // InternalBPMN_translator.g:392:2: ( ( rule__Protocol__Alternatives ) )
            {
            // InternalBPMN_translator.g:392:2: ( ( rule__Protocol__Alternatives ) )
            // InternalBPMN_translator.g:393:3: ( rule__Protocol__Alternatives )
            {
             before(grammarAccess.getProtocolAccess().getAlternatives()); 
            // InternalBPMN_translator.g:394:3: ( rule__Protocol__Alternatives )
            // InternalBPMN_translator.g:394:4: rule__Protocol__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getAlternatives()); 

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
    // $ANTLR end "ruleprotocol"


    // $ANTLR start "entryRulehttp_data"
    // InternalBPMN_translator.g:403:1: entryRulehttp_data : rulehttp_data EOF ;
    public final void entryRulehttp_data() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:404:1: ( rulehttp_data EOF )
            // InternalBPMN_translator.g:405:1: rulehttp_data EOF
            {
             before(grammarAccess.getHttp_dataRule()); 
            pushFollow(FOLLOW_1);
            rulehttp_data();

            state._fsp--;

             after(grammarAccess.getHttp_dataRule()); 
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
    // $ANTLR end "entryRulehttp_data"


    // $ANTLR start "rulehttp_data"
    // InternalBPMN_translator.g:412:1: rulehttp_data : ( ( rule__Http_data__Group__0 ) ) ;
    public final void rulehttp_data() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:416:2: ( ( ( rule__Http_data__Group__0 ) ) )
            // InternalBPMN_translator.g:417:2: ( ( rule__Http_data__Group__0 ) )
            {
            // InternalBPMN_translator.g:417:2: ( ( rule__Http_data__Group__0 ) )
            // InternalBPMN_translator.g:418:3: ( rule__Http_data__Group__0 )
            {
             before(grammarAccess.getHttp_dataAccess().getGroup()); 
            // InternalBPMN_translator.g:419:3: ( rule__Http_data__Group__0 )
            // InternalBPMN_translator.g:419:4: rule__Http_data__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Http_data__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHttp_dataAccess().getGroup()); 

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
    // $ANTLR end "rulehttp_data"


    // $ANTLR start "entryRulemqtt_data"
    // InternalBPMN_translator.g:428:1: entryRulemqtt_data : rulemqtt_data EOF ;
    public final void entryRulemqtt_data() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:429:1: ( rulemqtt_data EOF )
            // InternalBPMN_translator.g:430:1: rulemqtt_data EOF
            {
             before(grammarAccess.getMqtt_dataRule()); 
            pushFollow(FOLLOW_1);
            rulemqtt_data();

            state._fsp--;

             after(grammarAccess.getMqtt_dataRule()); 
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
    // $ANTLR end "entryRulemqtt_data"


    // $ANTLR start "rulemqtt_data"
    // InternalBPMN_translator.g:437:1: rulemqtt_data : ( ( rule__Mqtt_data__Group__0 ) ) ;
    public final void rulemqtt_data() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:441:2: ( ( ( rule__Mqtt_data__Group__0 ) ) )
            // InternalBPMN_translator.g:442:2: ( ( rule__Mqtt_data__Group__0 ) )
            {
            // InternalBPMN_translator.g:442:2: ( ( rule__Mqtt_data__Group__0 ) )
            // InternalBPMN_translator.g:443:3: ( rule__Mqtt_data__Group__0 )
            {
             before(grammarAccess.getMqtt_dataAccess().getGroup()); 
            // InternalBPMN_translator.g:444:3: ( rule__Mqtt_data__Group__0 )
            // InternalBPMN_translator.g:444:4: rule__Mqtt_data__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMqtt_dataAccess().getGroup()); 

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
    // $ANTLR end "rulemqtt_data"


    // $ANTLR start "entryRulemqtt_network_data"
    // InternalBPMN_translator.g:453:1: entryRulemqtt_network_data : rulemqtt_network_data EOF ;
    public final void entryRulemqtt_network_data() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:454:1: ( rulemqtt_network_data EOF )
            // InternalBPMN_translator.g:455:1: rulemqtt_network_data EOF
            {
             before(grammarAccess.getMqtt_network_dataRule()); 
            pushFollow(FOLLOW_1);
            rulemqtt_network_data();

            state._fsp--;

             after(grammarAccess.getMqtt_network_dataRule()); 
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
    // $ANTLR end "entryRulemqtt_network_data"


    // $ANTLR start "rulemqtt_network_data"
    // InternalBPMN_translator.g:462:1: rulemqtt_network_data : ( ( rule__Mqtt_network_data__Group__0 ) ) ;
    public final void rulemqtt_network_data() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:466:2: ( ( ( rule__Mqtt_network_data__Group__0 ) ) )
            // InternalBPMN_translator.g:467:2: ( ( rule__Mqtt_network_data__Group__0 ) )
            {
            // InternalBPMN_translator.g:467:2: ( ( rule__Mqtt_network_data__Group__0 ) )
            // InternalBPMN_translator.g:468:3: ( rule__Mqtt_network_data__Group__0 )
            {
             before(grammarAccess.getMqtt_network_dataAccess().getGroup()); 
            // InternalBPMN_translator.g:469:3: ( rule__Mqtt_network_data__Group__0 )
            // InternalBPMN_translator.g:469:4: rule__Mqtt_network_data__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mqtt_network_data__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMqtt_network_dataAccess().getGroup()); 

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
    // $ANTLR end "rulemqtt_network_data"


    // $ANTLR start "entryRuleprotocol_device"
    // InternalBPMN_translator.g:478:1: entryRuleprotocol_device : ruleprotocol_device EOF ;
    public final void entryRuleprotocol_device() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:479:1: ( ruleprotocol_device EOF )
            // InternalBPMN_translator.g:480:1: ruleprotocol_device EOF
            {
             before(grammarAccess.getProtocol_deviceRule()); 
            pushFollow(FOLLOW_1);
            ruleprotocol_device();

            state._fsp--;

             after(grammarAccess.getProtocol_deviceRule()); 
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
    // $ANTLR end "entryRuleprotocol_device"


    // $ANTLR start "ruleprotocol_device"
    // InternalBPMN_translator.g:487:1: ruleprotocol_device : ( ( rule__Protocol_device__Group__0 ) ) ;
    public final void ruleprotocol_device() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:491:2: ( ( ( rule__Protocol_device__Group__0 ) ) )
            // InternalBPMN_translator.g:492:2: ( ( rule__Protocol_device__Group__0 ) )
            {
            // InternalBPMN_translator.g:492:2: ( ( rule__Protocol_device__Group__0 ) )
            // InternalBPMN_translator.g:493:3: ( rule__Protocol_device__Group__0 )
            {
             before(grammarAccess.getProtocol_deviceAccess().getGroup()); 
            // InternalBPMN_translator.g:494:3: ( rule__Protocol_device__Group__0 )
            // InternalBPMN_translator.g:494:4: rule__Protocol_device__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Protocol_device__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtocol_deviceAccess().getGroup()); 

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
    // $ANTLR end "ruleprotocol_device"


    // $ANTLR start "entryRulesensor"
    // InternalBPMN_translator.g:503:1: entryRulesensor : rulesensor EOF ;
    public final void entryRulesensor() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:504:1: ( rulesensor EOF )
            // InternalBPMN_translator.g:505:1: rulesensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            rulesensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
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
    // $ANTLR end "entryRulesensor"


    // $ANTLR start "rulesensor"
    // InternalBPMN_translator.g:512:1: rulesensor : ( ( rule__Sensor__Alternatives ) ) ;
    public final void rulesensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:516:2: ( ( ( rule__Sensor__Alternatives ) ) )
            // InternalBPMN_translator.g:517:2: ( ( rule__Sensor__Alternatives ) )
            {
            // InternalBPMN_translator.g:517:2: ( ( rule__Sensor__Alternatives ) )
            // InternalBPMN_translator.g:518:3: ( rule__Sensor__Alternatives )
            {
             before(grammarAccess.getSensorAccess().getAlternatives()); 
            // InternalBPMN_translator.g:519:3: ( rule__Sensor__Alternatives )
            // InternalBPMN_translator.g:519:4: rule__Sensor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getAlternatives()); 

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
    // $ANTLR end "rulesensor"


    // $ANTLR start "entryRulesensor_data"
    // InternalBPMN_translator.g:528:1: entryRulesensor_data : rulesensor_data EOF ;
    public final void entryRulesensor_data() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:529:1: ( rulesensor_data EOF )
            // InternalBPMN_translator.g:530:1: rulesensor_data EOF
            {
             before(grammarAccess.getSensor_dataRule()); 
            pushFollow(FOLLOW_1);
            rulesensor_data();

            state._fsp--;

             after(grammarAccess.getSensor_dataRule()); 
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
    // $ANTLR end "entryRulesensor_data"


    // $ANTLR start "rulesensor_data"
    // InternalBPMN_translator.g:537:1: rulesensor_data : ( ( rule__Sensor_data__Group__0 ) ) ;
    public final void rulesensor_data() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:541:2: ( ( ( rule__Sensor_data__Group__0 ) ) )
            // InternalBPMN_translator.g:542:2: ( ( rule__Sensor_data__Group__0 ) )
            {
            // InternalBPMN_translator.g:542:2: ( ( rule__Sensor_data__Group__0 ) )
            // InternalBPMN_translator.g:543:3: ( rule__Sensor_data__Group__0 )
            {
             before(grammarAccess.getSensor_dataAccess().getGroup()); 
            // InternalBPMN_translator.g:544:3: ( rule__Sensor_data__Group__0 )
            // InternalBPMN_translator.g:544:4: rule__Sensor_data__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor_data__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensor_dataAccess().getGroup()); 

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
    // $ANTLR end "rulesensor_data"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalBPMN_translator.g:552:1: rule__Element__Alternatives : ( ( ( rule__Element__Group_0__0 ) ) | ( ( rule__Element__Singleton_tagAssignment_1 ) ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:556:1: ( ( ( rule__Element__Group_0__0 ) ) | ( ( rule__Element__Singleton_tagAssignment_1 ) ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalBPMN_translator.g:557:2: ( ( rule__Element__Group_0__0 ) )
                    {
                    // InternalBPMN_translator.g:557:2: ( ( rule__Element__Group_0__0 ) )
                    // InternalBPMN_translator.g:558:3: ( rule__Element__Group_0__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_0()); 
                    // InternalBPMN_translator.g:559:3: ( rule__Element__Group_0__0 )
                    // InternalBPMN_translator.g:559:4: rule__Element__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:563:2: ( ( rule__Element__Singleton_tagAssignment_1 ) )
                    {
                    // InternalBPMN_translator.g:563:2: ( ( rule__Element__Singleton_tagAssignment_1 ) )
                    // InternalBPMN_translator.g:564:3: ( rule__Element__Singleton_tagAssignment_1 )
                    {
                     before(grammarAccess.getElementAccess().getSingleton_tagAssignment_1()); 
                    // InternalBPMN_translator.g:565:3: ( rule__Element__Singleton_tagAssignment_1 )
                    // InternalBPMN_translator.g:565:4: rule__Element__Singleton_tagAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__Singleton_tagAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getSingleton_tagAssignment_1()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Content__Alternatives_1"
    // InternalBPMN_translator.g:573:1: rule__Content__Alternatives_1 : ( ( ( rule__Content__Group_1_0__0 ) ) | ( ( rule__Content__ElementAssignment_1_1 ) ) | ( ( rule__Content__Group_1_2__0 ) ) | ( ( rule__Content__KeywordsAssignment_1_3 ) ) | ( ( rule__Content__DataAssignment_1_4 ) ) );
    public final void rule__Content__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:577:1: ( ( ( rule__Content__Group_1_0__0 ) ) | ( ( rule__Content__ElementAssignment_1_1 ) ) | ( ( rule__Content__Group_1_2__0 ) ) | ( ( rule__Content__KeywordsAssignment_1_3 ) ) | ( ( rule__Content__DataAssignment_1_4 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 14:
            case 15:
                {
                alt2=1;
                }
                break;
            case 33:
                {
                alt2=2;
                }
                break;
            case RULE_BODY:
            case 25:
            case 26:
            case 38:
                {
                alt2=3;
                }
                break;
            case RULE_KEYWORDS:
                {
                alt2=4;
                }
                break;
            case RULE_STRING:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBPMN_translator.g:578:2: ( ( rule__Content__Group_1_0__0 ) )
                    {
                    // InternalBPMN_translator.g:578:2: ( ( rule__Content__Group_1_0__0 ) )
                    // InternalBPMN_translator.g:579:3: ( rule__Content__Group_1_0__0 )
                    {
                     before(grammarAccess.getContentAccess().getGroup_1_0()); 
                    // InternalBPMN_translator.g:580:3: ( rule__Content__Group_1_0__0 )
                    // InternalBPMN_translator.g:580:4: rule__Content__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Content__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getContentAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:584:2: ( ( rule__Content__ElementAssignment_1_1 ) )
                    {
                    // InternalBPMN_translator.g:584:2: ( ( rule__Content__ElementAssignment_1_1 ) )
                    // InternalBPMN_translator.g:585:3: ( rule__Content__ElementAssignment_1_1 )
                    {
                     before(grammarAccess.getContentAccess().getElementAssignment_1_1()); 
                    // InternalBPMN_translator.g:586:3: ( rule__Content__ElementAssignment_1_1 )
                    // InternalBPMN_translator.g:586:4: rule__Content__ElementAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Content__ElementAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getContentAccess().getElementAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBPMN_translator.g:590:2: ( ( rule__Content__Group_1_2__0 ) )
                    {
                    // InternalBPMN_translator.g:590:2: ( ( rule__Content__Group_1_2__0 ) )
                    // InternalBPMN_translator.g:591:3: ( rule__Content__Group_1_2__0 )
                    {
                     before(grammarAccess.getContentAccess().getGroup_1_2()); 
                    // InternalBPMN_translator.g:592:3: ( rule__Content__Group_1_2__0 )
                    // InternalBPMN_translator.g:592:4: rule__Content__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Content__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getContentAccess().getGroup_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBPMN_translator.g:596:2: ( ( rule__Content__KeywordsAssignment_1_3 ) )
                    {
                    // InternalBPMN_translator.g:596:2: ( ( rule__Content__KeywordsAssignment_1_3 ) )
                    // InternalBPMN_translator.g:597:3: ( rule__Content__KeywordsAssignment_1_3 )
                    {
                     before(grammarAccess.getContentAccess().getKeywordsAssignment_1_3()); 
                    // InternalBPMN_translator.g:598:3: ( rule__Content__KeywordsAssignment_1_3 )
                    // InternalBPMN_translator.g:598:4: rule__Content__KeywordsAssignment_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Content__KeywordsAssignment_1_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getContentAccess().getKeywordsAssignment_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBPMN_translator.g:602:2: ( ( rule__Content__DataAssignment_1_4 ) )
                    {
                    // InternalBPMN_translator.g:602:2: ( ( rule__Content__DataAssignment_1_4 ) )
                    // InternalBPMN_translator.g:603:3: ( rule__Content__DataAssignment_1_4 )
                    {
                     before(grammarAccess.getContentAccess().getDataAssignment_1_4()); 
                    // InternalBPMN_translator.g:604:3: ( rule__Content__DataAssignment_1_4 )
                    // InternalBPMN_translator.g:604:4: rule__Content__DataAssignment_1_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Content__DataAssignment_1_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getContentAccess().getDataAssignment_1_4()); 

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
    // $ANTLR end "rule__Content__Alternatives_1"


    // $ANTLR start "rule__Content__TypeAlternatives_1_0_0_0"
    // InternalBPMN_translator.g:612:1: rule__Content__TypeAlternatives_1_0_0_0 : ( ( '_TASK' ) | ( '_GATEWAY' ) );
    public final void rule__Content__TypeAlternatives_1_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:616:1: ( ( '_TASK' ) | ( '_GATEWAY' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBPMN_translator.g:617:2: ( '_TASK' )
                    {
                    // InternalBPMN_translator.g:617:2: ( '_TASK' )
                    // InternalBPMN_translator.g:618:3: '_TASK'
                    {
                     before(grammarAccess.getContentAccess().getType_TASKKeyword_1_0_0_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getContentAccess().getType_TASKKeyword_1_0_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:623:2: ( '_GATEWAY' )
                    {
                    // InternalBPMN_translator.g:623:2: ( '_GATEWAY' )
                    // InternalBPMN_translator.g:624:3: '_GATEWAY'
                    {
                     before(grammarAccess.getContentAccess().getType_GATEWAYKeyword_1_0_0_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getContentAccess().getType_GATEWAYKeyword_1_0_0_0_1()); 

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
    // $ANTLR end "rule__Content__TypeAlternatives_1_0_0_0"


    // $ANTLR start "rule__Content__BodyAlternatives_1_2_1_0"
    // InternalBPMN_translator.g:633:1: rule__Content__BodyAlternatives_1_2_1_0 : ( ( RULE_BODY ) | ( rulevariables ) );
    public final void rule__Content__BodyAlternatives_1_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:637:1: ( ( RULE_BODY ) | ( rulevariables ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_BODY) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==39) ) {
                    alt4=2;
                }
                else if ( (LA4_1==EOF||LA4_1==RULE_BODY||(LA4_1>=RULE_STRING && LA4_1<=RULE_KEYWORDS)||(LA4_1>=14 && LA4_1<=26)||LA4_1==33||(LA4_1>=37 && LA4_1<=38)) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==38) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBPMN_translator.g:638:2: ( RULE_BODY )
                    {
                    // InternalBPMN_translator.g:638:2: ( RULE_BODY )
                    // InternalBPMN_translator.g:639:3: RULE_BODY
                    {
                     before(grammarAccess.getContentAccess().getBodyBODYTerminalRuleCall_1_2_1_0_0()); 
                    match(input,RULE_BODY,FOLLOW_2); 
                     after(grammarAccess.getContentAccess().getBodyBODYTerminalRuleCall_1_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:644:2: ( rulevariables )
                    {
                    // InternalBPMN_translator.g:644:2: ( rulevariables )
                    // InternalBPMN_translator.g:645:3: rulevariables
                    {
                     before(grammarAccess.getContentAccess().getBodyVariablesParserRuleCall_1_2_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulevariables();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getBodyVariablesParserRuleCall_1_2_1_0_1()); 

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
    // $ANTLR end "rule__Content__BodyAlternatives_1_2_1_0"


    // $ANTLR start "rule__Open__Alternatives_4"
    // InternalBPMN_translator.g:654:1: rule__Open__Alternatives_4 : ( ( ( rule__Open__Group_4_0__0 ) ) | ( ( rule__Open__Group_4_1__0 ) ) );
    public final void rule__Open__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:658:1: ( ( ( rule__Open__Group_4_0__0 ) ) | ( ( rule__Open__Group_4_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_HEAD) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==34) ) {
                    alt5=1;
                }
                else if ( (LA5_1==20) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
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
                    // InternalBPMN_translator.g:659:2: ( ( rule__Open__Group_4_0__0 ) )
                    {
                    // InternalBPMN_translator.g:659:2: ( ( rule__Open__Group_4_0__0 ) )
                    // InternalBPMN_translator.g:660:3: ( rule__Open__Group_4_0__0 )
                    {
                     before(grammarAccess.getOpenAccess().getGroup_4_0()); 
                    // InternalBPMN_translator.g:661:3: ( rule__Open__Group_4_0__0 )
                    // InternalBPMN_translator.g:661:4: rule__Open__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Open__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpenAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:665:2: ( ( rule__Open__Group_4_1__0 ) )
                    {
                    // InternalBPMN_translator.g:665:2: ( ( rule__Open__Group_4_1__0 ) )
                    // InternalBPMN_translator.g:666:3: ( rule__Open__Group_4_1__0 )
                    {
                     before(grammarAccess.getOpenAccess().getGroup_4_1()); 
                    // InternalBPMN_translator.g:667:3: ( rule__Open__Group_4_1__0 )
                    // InternalBPMN_translator.g:667:4: rule__Open__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Open__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpenAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__Open__Alternatives_4"


    // $ANTLR start "rule__Open__Alternatives_4_1_0"
    // InternalBPMN_translator.g:675:1: rule__Open__Alternatives_4_1_0 : ( ( ( rule__Open__Head1Assignment_4_1_0_0 ) ) | ( ( rule__Open__Keywords1Assignment_4_1_0_1 ) ) );
    public final void rule__Open__Alternatives_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:679:1: ( ( ( rule__Open__Head1Assignment_4_1_0_0 ) ) | ( ( rule__Open__Keywords1Assignment_4_1_0_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_HEAD) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_KEYWORDS) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBPMN_translator.g:680:2: ( ( rule__Open__Head1Assignment_4_1_0_0 ) )
                    {
                    // InternalBPMN_translator.g:680:2: ( ( rule__Open__Head1Assignment_4_1_0_0 ) )
                    // InternalBPMN_translator.g:681:3: ( rule__Open__Head1Assignment_4_1_0_0 )
                    {
                     before(grammarAccess.getOpenAccess().getHead1Assignment_4_1_0_0()); 
                    // InternalBPMN_translator.g:682:3: ( rule__Open__Head1Assignment_4_1_0_0 )
                    // InternalBPMN_translator.g:682:4: rule__Open__Head1Assignment_4_1_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Open__Head1Assignment_4_1_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpenAccess().getHead1Assignment_4_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:686:2: ( ( rule__Open__Keywords1Assignment_4_1_0_1 ) )
                    {
                    // InternalBPMN_translator.g:686:2: ( ( rule__Open__Keywords1Assignment_4_1_0_1 ) )
                    // InternalBPMN_translator.g:687:3: ( rule__Open__Keywords1Assignment_4_1_0_1 )
                    {
                     before(grammarAccess.getOpenAccess().getKeywords1Assignment_4_1_0_1()); 
                    // InternalBPMN_translator.g:688:3: ( rule__Open__Keywords1Assignment_4_1_0_1 )
                    // InternalBPMN_translator.g:688:4: rule__Open__Keywords1Assignment_4_1_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Open__Keywords1Assignment_4_1_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpenAccess().getKeywords1Assignment_4_1_0_1()); 

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
    // $ANTLR end "rule__Open__Alternatives_4_1_0"


    // $ANTLR start "rule__Singleton__Alternatives_1_4"
    // InternalBPMN_translator.g:696:1: rule__Singleton__Alternatives_1_4 : ( ( ( rule__Singleton__Group_1_4_0__0 ) ) | ( ( rule__Singleton__Group_1_4_1__0 ) ) );
    public final void rule__Singleton__Alternatives_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:700:1: ( ( ( rule__Singleton__Group_1_4_0__0 ) ) | ( ( rule__Singleton__Group_1_4_1__0 ) ) )
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
                    // InternalBPMN_translator.g:701:2: ( ( rule__Singleton__Group_1_4_0__0 ) )
                    {
                    // InternalBPMN_translator.g:701:2: ( ( rule__Singleton__Group_1_4_0__0 ) )
                    // InternalBPMN_translator.g:702:3: ( rule__Singleton__Group_1_4_0__0 )
                    {
                     before(grammarAccess.getSingletonAccess().getGroup_1_4_0()); 
                    // InternalBPMN_translator.g:703:3: ( rule__Singleton__Group_1_4_0__0 )
                    // InternalBPMN_translator.g:703:4: rule__Singleton__Group_1_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Singleton__Group_1_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingletonAccess().getGroup_1_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:707:2: ( ( rule__Singleton__Group_1_4_1__0 ) )
                    {
                    // InternalBPMN_translator.g:707:2: ( ( rule__Singleton__Group_1_4_1__0 ) )
                    // InternalBPMN_translator.g:708:3: ( rule__Singleton__Group_1_4_1__0 )
                    {
                     before(grammarAccess.getSingletonAccess().getGroup_1_4_1()); 
                    // InternalBPMN_translator.g:709:3: ( rule__Singleton__Group_1_4_1__0 )
                    // InternalBPMN_translator.g:709:4: rule__Singleton__Group_1_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Singleton__Group_1_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingletonAccess().getGroup_1_4_1()); 

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
    // $ANTLR end "rule__Singleton__Alternatives_1_4"


    // $ANTLR start "rule__Variables__Alternatives"
    // InternalBPMN_translator.g:717:1: rule__Variables__Alternatives : ( ( ( rule__Variables__Group_0__0 ) ) | ( ( rule__Variables__Group_1__0 ) ) );
    public final void rule__Variables__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:721:1: ( ( ( rule__Variables__Group_0__0 ) ) | ( ( rule__Variables__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==38) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_BODY) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBPMN_translator.g:722:2: ( ( rule__Variables__Group_0__0 ) )
                    {
                    // InternalBPMN_translator.g:722:2: ( ( rule__Variables__Group_0__0 ) )
                    // InternalBPMN_translator.g:723:3: ( rule__Variables__Group_0__0 )
                    {
                     before(grammarAccess.getVariablesAccess().getGroup_0()); 
                    // InternalBPMN_translator.g:724:3: ( rule__Variables__Group_0__0 )
                    // InternalBPMN_translator.g:724:4: rule__Variables__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variables__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariablesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:728:2: ( ( rule__Variables__Group_1__0 ) )
                    {
                    // InternalBPMN_translator.g:728:2: ( ( rule__Variables__Group_1__0 ) )
                    // InternalBPMN_translator.g:729:3: ( rule__Variables__Group_1__0 )
                    {
                     before(grammarAccess.getVariablesAccess().getGroup_1()); 
                    // InternalBPMN_translator.g:730:3: ( rule__Variables__Group_1__0 )
                    // InternalBPMN_translator.g:730:4: rule__Variables__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variables__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariablesAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Variables__Alternatives"


    // $ANTLR start "rule__Conditions__Alternatives"
    // InternalBPMN_translator.g:738:1: rule__Conditions__Alternatives : ( ( '&lt;' ) | ( '&le;' ) | ( '&ge;' ) | ( '&gt;' ) | ( '=' ) | ( '&amp;' ) | ( '||' ) | ( ')' ) | ( '!=' ) );
    public final void rule__Conditions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:742:1: ( ( '&lt;' ) | ( '&le;' ) | ( '&ge;' ) | ( '&gt;' ) | ( '=' ) | ( '&amp;' ) | ( '||' ) | ( ')' ) | ( '!=' ) )
            int alt9=9;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt9=1;
                }
                break;
            case 17:
                {
                alt9=2;
                }
                break;
            case 18:
                {
                alt9=3;
                }
                break;
            case 19:
                {
                alt9=4;
                }
                break;
            case 20:
                {
                alt9=5;
                }
                break;
            case 21:
                {
                alt9=6;
                }
                break;
            case 22:
                {
                alt9=7;
                }
                break;
            case 23:
                {
                alt9=8;
                }
                break;
            case 24:
                {
                alt9=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalBPMN_translator.g:743:2: ( '&lt;' )
                    {
                    // InternalBPMN_translator.g:743:2: ( '&lt;' )
                    // InternalBPMN_translator.g:744:3: '&lt;'
                    {
                     before(grammarAccess.getConditionsAccess().getLtKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getConditionsAccess().getLtKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:749:2: ( '&le;' )
                    {
                    // InternalBPMN_translator.g:749:2: ( '&le;' )
                    // InternalBPMN_translator.g:750:3: '&le;'
                    {
                     before(grammarAccess.getConditionsAccess().getLeKeyword_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getConditionsAccess().getLeKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBPMN_translator.g:755:2: ( '&ge;' )
                    {
                    // InternalBPMN_translator.g:755:2: ( '&ge;' )
                    // InternalBPMN_translator.g:756:3: '&ge;'
                    {
                     before(grammarAccess.getConditionsAccess().getGeKeyword_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getConditionsAccess().getGeKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBPMN_translator.g:761:2: ( '&gt;' )
                    {
                    // InternalBPMN_translator.g:761:2: ( '&gt;' )
                    // InternalBPMN_translator.g:762:3: '&gt;'
                    {
                     before(grammarAccess.getConditionsAccess().getGtKeyword_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getConditionsAccess().getGtKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBPMN_translator.g:767:2: ( '=' )
                    {
                    // InternalBPMN_translator.g:767:2: ( '=' )
                    // InternalBPMN_translator.g:768:3: '='
                    {
                     before(grammarAccess.getConditionsAccess().getEqualsSignKeyword_4()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getConditionsAccess().getEqualsSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBPMN_translator.g:773:2: ( '&amp;' )
                    {
                    // InternalBPMN_translator.g:773:2: ( '&amp;' )
                    // InternalBPMN_translator.g:774:3: '&amp;'
                    {
                     before(grammarAccess.getConditionsAccess().getAmpKeyword_5()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getConditionsAccess().getAmpKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBPMN_translator.g:779:2: ( '||' )
                    {
                    // InternalBPMN_translator.g:779:2: ( '||' )
                    // InternalBPMN_translator.g:780:3: '||'
                    {
                     before(grammarAccess.getConditionsAccess().getVerticalLineVerticalLineKeyword_6()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getConditionsAccess().getVerticalLineVerticalLineKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBPMN_translator.g:785:2: ( ')' )
                    {
                    // InternalBPMN_translator.g:785:2: ( ')' )
                    // InternalBPMN_translator.g:786:3: ')'
                    {
                     before(grammarAccess.getConditionsAccess().getRightParenthesisKeyword_7()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getConditionsAccess().getRightParenthesisKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalBPMN_translator.g:791:2: ( '!=' )
                    {
                    // InternalBPMN_translator.g:791:2: ( '!=' )
                    // InternalBPMN_translator.g:792:3: '!='
                    {
                     before(grammarAccess.getConditionsAccess().getExclamationMarkEqualsSignKeyword_8()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getConditionsAccess().getExclamationMarkEqualsSignKeyword_8()); 

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
    // $ANTLR end "rule__Conditions__Alternatives"


    // $ANTLR start "rule__Preconditions__Alternatives"
    // InternalBPMN_translator.g:801:1: rule__Preconditions__Alternatives : ( ( '!' ) | ( '(' ) );
    public final void rule__Preconditions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:805:1: ( ( '!' ) | ( '(' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalBPMN_translator.g:806:2: ( '!' )
                    {
                    // InternalBPMN_translator.g:806:2: ( '!' )
                    // InternalBPMN_translator.g:807:3: '!'
                    {
                     before(grammarAccess.getPreconditionsAccess().getExclamationMarkKeyword_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getPreconditionsAccess().getExclamationMarkKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:812:2: ( '(' )
                    {
                    // InternalBPMN_translator.g:812:2: ( '(' )
                    // InternalBPMN_translator.g:813:3: '('
                    {
                     before(grammarAccess.getPreconditionsAccess().getLeftParenthesisKeyword_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getPreconditionsAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Preconditions__Alternatives"


    // $ANTLR start "rule__Protocol__Alternatives"
    // InternalBPMN_translator.g:822:1: rule__Protocol__Alternatives : ( ( ( rule__Protocol__Group_0__0 ) ) | ( ( rule__Protocol__Group_1__0 ) ) );
    public final void rule__Protocol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:826:1: ( ( ( rule__Protocol__Group_0__0 ) ) | ( ( rule__Protocol__Group_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==62) ) {
                alt11=1;
            }
            else if ( (LA11_0==63) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalBPMN_translator.g:827:2: ( ( rule__Protocol__Group_0__0 ) )
                    {
                    // InternalBPMN_translator.g:827:2: ( ( rule__Protocol__Group_0__0 ) )
                    // InternalBPMN_translator.g:828:3: ( rule__Protocol__Group_0__0 )
                    {
                     before(grammarAccess.getProtocolAccess().getGroup_0()); 
                    // InternalBPMN_translator.g:829:3: ( rule__Protocol__Group_0__0 )
                    // InternalBPMN_translator.g:829:4: rule__Protocol__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Protocol__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProtocolAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:833:2: ( ( rule__Protocol__Group_1__0 ) )
                    {
                    // InternalBPMN_translator.g:833:2: ( ( rule__Protocol__Group_1__0 ) )
                    // InternalBPMN_translator.g:834:3: ( rule__Protocol__Group_1__0 )
                    {
                     before(grammarAccess.getProtocolAccess().getGroup_1()); 
                    // InternalBPMN_translator.g:835:3: ( rule__Protocol__Group_1__0 )
                    // InternalBPMN_translator.g:835:4: rule__Protocol__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Protocol__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProtocolAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Protocol__Alternatives"


    // $ANTLR start "rule__Http_data__Alternatives_1"
    // InternalBPMN_translator.g:843:1: rule__Http_data__Alternatives_1 : ( ( ( rule__Http_data__Group_1_0__0 ) ) | ( ( rule__Http_data__Group_1_1__0 ) ) | ( ( rule__Http_data__Group_1_2__0 ) ) | ( ( rule__Http_data__Group_1_3__0 ) ) | ( ( rule__Http_data__Group_1_4__0 ) ) | ( ( rule__Http_data__Group_1_5__0 ) ) | ( ( rule__Http_data__Group_1_6__0 ) ) );
    public final void rule__Http_data__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:847:1: ( ( ( rule__Http_data__Group_1_0__0 ) ) | ( ( rule__Http_data__Group_1_1__0 ) ) | ( ( rule__Http_data__Group_1_2__0 ) ) | ( ( rule__Http_data__Group_1_3__0 ) ) | ( ( rule__Http_data__Group_1_4__0 ) ) | ( ( rule__Http_data__Group_1_5__0 ) ) | ( ( rule__Http_data__Group_1_6__0 ) ) )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt12=1;
                }
                break;
            case 45:
                {
                alt12=2;
                }
                break;
            case 46:
                {
                alt12=3;
                }
                break;
            case 47:
                {
                alt12=4;
                }
                break;
            case 48:
                {
                alt12=5;
                }
                break;
            case 49:
                {
                alt12=6;
                }
                break;
            case 50:
                {
                alt12=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalBPMN_translator.g:848:2: ( ( rule__Http_data__Group_1_0__0 ) )
                    {
                    // InternalBPMN_translator.g:848:2: ( ( rule__Http_data__Group_1_0__0 ) )
                    // InternalBPMN_translator.g:849:3: ( rule__Http_data__Group_1_0__0 )
                    {
                     before(grammarAccess.getHttp_dataAccess().getGroup_1_0()); 
                    // InternalBPMN_translator.g:850:3: ( rule__Http_data__Group_1_0__0 )
                    // InternalBPMN_translator.g:850:4: rule__Http_data__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Http_data__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHttp_dataAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:854:2: ( ( rule__Http_data__Group_1_1__0 ) )
                    {
                    // InternalBPMN_translator.g:854:2: ( ( rule__Http_data__Group_1_1__0 ) )
                    // InternalBPMN_translator.g:855:3: ( rule__Http_data__Group_1_1__0 )
                    {
                     before(grammarAccess.getHttp_dataAccess().getGroup_1_1()); 
                    // InternalBPMN_translator.g:856:3: ( rule__Http_data__Group_1_1__0 )
                    // InternalBPMN_translator.g:856:4: rule__Http_data__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Http_data__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHttp_dataAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBPMN_translator.g:860:2: ( ( rule__Http_data__Group_1_2__0 ) )
                    {
                    // InternalBPMN_translator.g:860:2: ( ( rule__Http_data__Group_1_2__0 ) )
                    // InternalBPMN_translator.g:861:3: ( rule__Http_data__Group_1_2__0 )
                    {
                     before(grammarAccess.getHttp_dataAccess().getGroup_1_2()); 
                    // InternalBPMN_translator.g:862:3: ( rule__Http_data__Group_1_2__0 )
                    // InternalBPMN_translator.g:862:4: rule__Http_data__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Http_data__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHttp_dataAccess().getGroup_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBPMN_translator.g:866:2: ( ( rule__Http_data__Group_1_3__0 ) )
                    {
                    // InternalBPMN_translator.g:866:2: ( ( rule__Http_data__Group_1_3__0 ) )
                    // InternalBPMN_translator.g:867:3: ( rule__Http_data__Group_1_3__0 )
                    {
                     before(grammarAccess.getHttp_dataAccess().getGroup_1_3()); 
                    // InternalBPMN_translator.g:868:3: ( rule__Http_data__Group_1_3__0 )
                    // InternalBPMN_translator.g:868:4: rule__Http_data__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Http_data__Group_1_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHttp_dataAccess().getGroup_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBPMN_translator.g:872:2: ( ( rule__Http_data__Group_1_4__0 ) )
                    {
                    // InternalBPMN_translator.g:872:2: ( ( rule__Http_data__Group_1_4__0 ) )
                    // InternalBPMN_translator.g:873:3: ( rule__Http_data__Group_1_4__0 )
                    {
                     before(grammarAccess.getHttp_dataAccess().getGroup_1_4()); 
                    // InternalBPMN_translator.g:874:3: ( rule__Http_data__Group_1_4__0 )
                    // InternalBPMN_translator.g:874:4: rule__Http_data__Group_1_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Http_data__Group_1_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHttp_dataAccess().getGroup_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBPMN_translator.g:878:2: ( ( rule__Http_data__Group_1_5__0 ) )
                    {
                    // InternalBPMN_translator.g:878:2: ( ( rule__Http_data__Group_1_5__0 ) )
                    // InternalBPMN_translator.g:879:3: ( rule__Http_data__Group_1_5__0 )
                    {
                     before(grammarAccess.getHttp_dataAccess().getGroup_1_5()); 
                    // InternalBPMN_translator.g:880:3: ( rule__Http_data__Group_1_5__0 )
                    // InternalBPMN_translator.g:880:4: rule__Http_data__Group_1_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Http_data__Group_1_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHttp_dataAccess().getGroup_1_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBPMN_translator.g:884:2: ( ( rule__Http_data__Group_1_6__0 ) )
                    {
                    // InternalBPMN_translator.g:884:2: ( ( rule__Http_data__Group_1_6__0 ) )
                    // InternalBPMN_translator.g:885:3: ( rule__Http_data__Group_1_6__0 )
                    {
                     before(grammarAccess.getHttp_dataAccess().getGroup_1_6()); 
                    // InternalBPMN_translator.g:886:3: ( rule__Http_data__Group_1_6__0 )
                    // InternalBPMN_translator.g:886:4: rule__Http_data__Group_1_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Http_data__Group_1_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHttp_dataAccess().getGroup_1_6()); 

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
    // $ANTLR end "rule__Http_data__Alternatives_1"


    // $ANTLR start "rule__Mqtt_data__Alternatives_1"
    // InternalBPMN_translator.g:894:1: rule__Mqtt_data__Alternatives_1 : ( ( ( rule__Mqtt_data__Group_1_0__0 ) ) | ( ( rule__Mqtt_data__Group_1_1__0 ) ) | ( ( rule__Mqtt_data__Group_1_2__0 ) ) | ( ( rule__Mqtt_data__Group_1_3__0 ) ) | ( ( rule__Mqtt_data__Group_1_4__0 ) ) | ( ( rule__Mqtt_data__Group_1_5__0 ) ) | ( ( rule__Mqtt_data__Group_1_6__0 ) ) );
    public final void rule__Mqtt_data__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:898:1: ( ( ( rule__Mqtt_data__Group_1_0__0 ) ) | ( ( rule__Mqtt_data__Group_1_1__0 ) ) | ( ( rule__Mqtt_data__Group_1_2__0 ) ) | ( ( rule__Mqtt_data__Group_1_3__0 ) ) | ( ( rule__Mqtt_data__Group_1_4__0 ) ) | ( ( rule__Mqtt_data__Group_1_5__0 ) ) | ( ( rule__Mqtt_data__Group_1_6__0 ) ) )
            int alt13=7;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt13=1;
                }
                break;
            case 51:
                {
                alt13=2;
                }
                break;
            case 52:
                {
                alt13=3;
                }
                break;
            case 53:
                {
                alt13=4;
                }
                break;
            case 50:
                {
                alt13=5;
                }
                break;
            case 54:
                {
                alt13=6;
                }
                break;
            case 56:
                {
                alt13=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalBPMN_translator.g:899:2: ( ( rule__Mqtt_data__Group_1_0__0 ) )
                    {
                    // InternalBPMN_translator.g:899:2: ( ( rule__Mqtt_data__Group_1_0__0 ) )
                    // InternalBPMN_translator.g:900:3: ( rule__Mqtt_data__Group_1_0__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_0()); 
                    // InternalBPMN_translator.g:901:3: ( rule__Mqtt_data__Group_1_0__0 )
                    // InternalBPMN_translator.g:901:4: rule__Mqtt_data__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mqtt_data__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMqtt_dataAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:905:2: ( ( rule__Mqtt_data__Group_1_1__0 ) )
                    {
                    // InternalBPMN_translator.g:905:2: ( ( rule__Mqtt_data__Group_1_1__0 ) )
                    // InternalBPMN_translator.g:906:3: ( rule__Mqtt_data__Group_1_1__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_1()); 
                    // InternalBPMN_translator.g:907:3: ( rule__Mqtt_data__Group_1_1__0 )
                    // InternalBPMN_translator.g:907:4: rule__Mqtt_data__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mqtt_data__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMqtt_dataAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBPMN_translator.g:911:2: ( ( rule__Mqtt_data__Group_1_2__0 ) )
                    {
                    // InternalBPMN_translator.g:911:2: ( ( rule__Mqtt_data__Group_1_2__0 ) )
                    // InternalBPMN_translator.g:912:3: ( rule__Mqtt_data__Group_1_2__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_2()); 
                    // InternalBPMN_translator.g:913:3: ( rule__Mqtt_data__Group_1_2__0 )
                    // InternalBPMN_translator.g:913:4: rule__Mqtt_data__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mqtt_data__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMqtt_dataAccess().getGroup_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBPMN_translator.g:917:2: ( ( rule__Mqtt_data__Group_1_3__0 ) )
                    {
                    // InternalBPMN_translator.g:917:2: ( ( rule__Mqtt_data__Group_1_3__0 ) )
                    // InternalBPMN_translator.g:918:3: ( rule__Mqtt_data__Group_1_3__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_3()); 
                    // InternalBPMN_translator.g:919:3: ( rule__Mqtt_data__Group_1_3__0 )
                    // InternalBPMN_translator.g:919:4: rule__Mqtt_data__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mqtt_data__Group_1_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMqtt_dataAccess().getGroup_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBPMN_translator.g:923:2: ( ( rule__Mqtt_data__Group_1_4__0 ) )
                    {
                    // InternalBPMN_translator.g:923:2: ( ( rule__Mqtt_data__Group_1_4__0 ) )
                    // InternalBPMN_translator.g:924:3: ( rule__Mqtt_data__Group_1_4__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_4()); 
                    // InternalBPMN_translator.g:925:3: ( rule__Mqtt_data__Group_1_4__0 )
                    // InternalBPMN_translator.g:925:4: rule__Mqtt_data__Group_1_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mqtt_data__Group_1_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMqtt_dataAccess().getGroup_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBPMN_translator.g:929:2: ( ( rule__Mqtt_data__Group_1_5__0 ) )
                    {
                    // InternalBPMN_translator.g:929:2: ( ( rule__Mqtt_data__Group_1_5__0 ) )
                    // InternalBPMN_translator.g:930:3: ( rule__Mqtt_data__Group_1_5__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_5()); 
                    // InternalBPMN_translator.g:931:3: ( rule__Mqtt_data__Group_1_5__0 )
                    // InternalBPMN_translator.g:931:4: rule__Mqtt_data__Group_1_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mqtt_data__Group_1_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMqtt_dataAccess().getGroup_1_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBPMN_translator.g:935:2: ( ( rule__Mqtt_data__Group_1_6__0 ) )
                    {
                    // InternalBPMN_translator.g:935:2: ( ( rule__Mqtt_data__Group_1_6__0 ) )
                    // InternalBPMN_translator.g:936:3: ( rule__Mqtt_data__Group_1_6__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_6()); 
                    // InternalBPMN_translator.g:937:3: ( rule__Mqtt_data__Group_1_6__0 )
                    // InternalBPMN_translator.g:937:4: rule__Mqtt_data__Group_1_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mqtt_data__Group_1_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMqtt_dataAccess().getGroup_1_6()); 

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
    // $ANTLR end "rule__Mqtt_data__Alternatives_1"


    // $ANTLR start "rule__Mqtt_data__Alternatives_1_6_2"
    // InternalBPMN_translator.g:945:1: rule__Mqtt_data__Alternatives_1_6_2 : ( ( ( rule__Mqtt_data__Group_1_6_2_0__0 ) ) | ( ( rule__Mqtt_data__Group_1_6_2_1__0 ) ) );
    public final void rule__Mqtt_data__Alternatives_1_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:949:1: ( ( ( rule__Mqtt_data__Group_1_6_2_0__0 ) ) | ( ( rule__Mqtt_data__Group_1_6_2_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==55) ) {
                alt14=1;
            }
            else if ( (LA14_0==49) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalBPMN_translator.g:950:2: ( ( rule__Mqtt_data__Group_1_6_2_0__0 ) )
                    {
                    // InternalBPMN_translator.g:950:2: ( ( rule__Mqtt_data__Group_1_6_2_0__0 ) )
                    // InternalBPMN_translator.g:951:3: ( rule__Mqtt_data__Group_1_6_2_0__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_6_2_0()); 
                    // InternalBPMN_translator.g:952:3: ( rule__Mqtt_data__Group_1_6_2_0__0 )
                    // InternalBPMN_translator.g:952:4: rule__Mqtt_data__Group_1_6_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mqtt_data__Group_1_6_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMqtt_dataAccess().getGroup_1_6_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:956:2: ( ( rule__Mqtt_data__Group_1_6_2_1__0 ) )
                    {
                    // InternalBPMN_translator.g:956:2: ( ( rule__Mqtt_data__Group_1_6_2_1__0 ) )
                    // InternalBPMN_translator.g:957:3: ( rule__Mqtt_data__Group_1_6_2_1__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_6_2_1()); 
                    // InternalBPMN_translator.g:958:3: ( rule__Mqtt_data__Group_1_6_2_1__0 )
                    // InternalBPMN_translator.g:958:4: rule__Mqtt_data__Group_1_6_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mqtt_data__Group_1_6_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMqtt_dataAccess().getGroup_1_6_2_1()); 

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
    // $ANTLR end "rule__Mqtt_data__Alternatives_1_6_2"


    // $ANTLR start "rule__Sensor__Alternatives"
    // InternalBPMN_translator.g:966:1: rule__Sensor__Alternatives : ( ( ( rule__Sensor__Group_0__0 ) ) | ( ( rule__Sensor__Group_1__0 ) ) );
    public final void rule__Sensor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:970:1: ( ( ( rule__Sensor__Group_0__0 ) ) | ( ( rule__Sensor__Group_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38) ) {
                alt15=1;
            }
            else if ( (LA15_0==64) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalBPMN_translator.g:971:2: ( ( rule__Sensor__Group_0__0 ) )
                    {
                    // InternalBPMN_translator.g:971:2: ( ( rule__Sensor__Group_0__0 ) )
                    // InternalBPMN_translator.g:972:3: ( rule__Sensor__Group_0__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_0()); 
                    // InternalBPMN_translator.g:973:3: ( rule__Sensor__Group_0__0 )
                    // InternalBPMN_translator.g:973:4: rule__Sensor__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSensorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:977:2: ( ( rule__Sensor__Group_1__0 ) )
                    {
                    // InternalBPMN_translator.g:977:2: ( ( rule__Sensor__Group_1__0 ) )
                    // InternalBPMN_translator.g:978:3: ( rule__Sensor__Group_1__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_1()); 
                    // InternalBPMN_translator.g:979:3: ( rule__Sensor__Group_1__0 )
                    // InternalBPMN_translator.g:979:4: rule__Sensor__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSensorAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Sensor__Alternatives"


    // $ANTLR start "rule__Sensor_data__Alternatives_1"
    // InternalBPMN_translator.g:987:1: rule__Sensor_data__Alternatives_1 : ( ( ( rule__Sensor_data__Group_1_0__0 ) ) | ( ( rule__Sensor_data__Group_1_1__0 ) ) | ( ( rule__Sensor_data__Group_1_2__0 ) ) );
    public final void rule__Sensor_data__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:991:1: ( ( ( rule__Sensor_data__Group_1_0__0 ) ) | ( ( rule__Sensor_data__Group_1_1__0 ) ) | ( ( rule__Sensor_data__Group_1_2__0 ) ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt16=1;
                }
                break;
            case 60:
                {
                alt16=2;
                }
                break;
            case 61:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalBPMN_translator.g:992:2: ( ( rule__Sensor_data__Group_1_0__0 ) )
                    {
                    // InternalBPMN_translator.g:992:2: ( ( rule__Sensor_data__Group_1_0__0 ) )
                    // InternalBPMN_translator.g:993:3: ( rule__Sensor_data__Group_1_0__0 )
                    {
                     before(grammarAccess.getSensor_dataAccess().getGroup_1_0()); 
                    // InternalBPMN_translator.g:994:3: ( rule__Sensor_data__Group_1_0__0 )
                    // InternalBPMN_translator.g:994:4: rule__Sensor_data__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor_data__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSensor_dataAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:998:2: ( ( rule__Sensor_data__Group_1_1__0 ) )
                    {
                    // InternalBPMN_translator.g:998:2: ( ( rule__Sensor_data__Group_1_1__0 ) )
                    // InternalBPMN_translator.g:999:3: ( rule__Sensor_data__Group_1_1__0 )
                    {
                     before(grammarAccess.getSensor_dataAccess().getGroup_1_1()); 
                    // InternalBPMN_translator.g:1000:3: ( rule__Sensor_data__Group_1_1__0 )
                    // InternalBPMN_translator.g:1000:4: rule__Sensor_data__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor_data__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSensor_dataAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBPMN_translator.g:1004:2: ( ( rule__Sensor_data__Group_1_2__0 ) )
                    {
                    // InternalBPMN_translator.g:1004:2: ( ( rule__Sensor_data__Group_1_2__0 ) )
                    // InternalBPMN_translator.g:1005:3: ( rule__Sensor_data__Group_1_2__0 )
                    {
                     before(grammarAccess.getSensor_dataAccess().getGroup_1_2()); 
                    // InternalBPMN_translator.g:1006:3: ( rule__Sensor_data__Group_1_2__0 )
                    // InternalBPMN_translator.g:1006:4: rule__Sensor_data__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor_data__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSensor_dataAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__Sensor_data__Alternatives_1"


    // $ANTLR start "rule__Xml__Group__0"
    // InternalBPMN_translator.g:1014:1: rule__Xml__Group__0 : rule__Xml__Group__0__Impl rule__Xml__Group__1 ;
    public final void rule__Xml__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1018:1: ( rule__Xml__Group__0__Impl rule__Xml__Group__1 )
            // InternalBPMN_translator.g:1019:2: rule__Xml__Group__0__Impl rule__Xml__Group__1
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
    // InternalBPMN_translator.g:1026:1: rule__Xml__Group__0__Impl : ( () ) ;
    public final void rule__Xml__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1030:1: ( ( () ) )
            // InternalBPMN_translator.g:1031:1: ( () )
            {
            // InternalBPMN_translator.g:1031:1: ( () )
            // InternalBPMN_translator.g:1032:2: ()
            {
             before(grammarAccess.getXmlAccess().getXmlAction_0()); 
            // InternalBPMN_translator.g:1033:2: ()
            // InternalBPMN_translator.g:1033:3: 
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
    // InternalBPMN_translator.g:1041:1: rule__Xml__Group__1 : rule__Xml__Group__1__Impl rule__Xml__Group__2 ;
    public final void rule__Xml__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1045:1: ( rule__Xml__Group__1__Impl rule__Xml__Group__2 )
            // InternalBPMN_translator.g:1046:2: rule__Xml__Group__1__Impl rule__Xml__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Xml__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xml__Group__2();

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
    // InternalBPMN_translator.g:1053:1: rule__Xml__Group__1__Impl : ( ( ruleprolog )? ) ;
    public final void rule__Xml__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1057:1: ( ( ( ruleprolog )? ) )
            // InternalBPMN_translator.g:1058:1: ( ( ruleprolog )? )
            {
            // InternalBPMN_translator.g:1058:1: ( ( ruleprolog )? )
            // InternalBPMN_translator.g:1059:2: ( ruleprolog )?
            {
             before(grammarAccess.getXmlAccess().getPrologParserRuleCall_1()); 
            // InternalBPMN_translator.g:1060:2: ( ruleprolog )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBPMN_translator.g:1060:3: ruleprolog
                    {
                    pushFollow(FOLLOW_2);
                    ruleprolog();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXmlAccess().getPrologParserRuleCall_1()); 

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


    // $ANTLR start "rule__Xml__Group__2"
    // InternalBPMN_translator.g:1068:1: rule__Xml__Group__2 : rule__Xml__Group__2__Impl ;
    public final void rule__Xml__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1072:1: ( rule__Xml__Group__2__Impl )
            // InternalBPMN_translator.g:1073:2: rule__Xml__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Xml__Group__2__Impl();

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
    // $ANTLR end "rule__Xml__Group__2"


    // $ANTLR start "rule__Xml__Group__2__Impl"
    // InternalBPMN_translator.g:1079:1: rule__Xml__Group__2__Impl : ( ( rule__Xml__ProvaAssignment_2 )* ) ;
    public final void rule__Xml__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1083:1: ( ( ( rule__Xml__ProvaAssignment_2 )* ) )
            // InternalBPMN_translator.g:1084:1: ( ( rule__Xml__ProvaAssignment_2 )* )
            {
            // InternalBPMN_translator.g:1084:1: ( ( rule__Xml__ProvaAssignment_2 )* )
            // InternalBPMN_translator.g:1085:2: ( rule__Xml__ProvaAssignment_2 )*
            {
             before(grammarAccess.getXmlAccess().getProvaAssignment_2()); 
            // InternalBPMN_translator.g:1086:2: ( rule__Xml__ProvaAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==33) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBPMN_translator.g:1086:3: rule__Xml__ProvaAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Xml__ProvaAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getXmlAccess().getProvaAssignment_2()); 

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
    // $ANTLR end "rule__Xml__Group__2__Impl"


    // $ANTLR start "rule__Prolog__Group__0"
    // InternalBPMN_translator.g:1095:1: rule__Prolog__Group__0 : rule__Prolog__Group__0__Impl rule__Prolog__Group__1 ;
    public final void rule__Prolog__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1099:1: ( rule__Prolog__Group__0__Impl rule__Prolog__Group__1 )
            // InternalBPMN_translator.g:1100:2: rule__Prolog__Group__0__Impl rule__Prolog__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Prolog__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Prolog__Group__1();

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
    // $ANTLR end "rule__Prolog__Group__0"


    // $ANTLR start "rule__Prolog__Group__0__Impl"
    // InternalBPMN_translator.g:1107:1: rule__Prolog__Group__0__Impl : ( '<?' ) ;
    public final void rule__Prolog__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1111:1: ( ( '<?' ) )
            // InternalBPMN_translator.g:1112:1: ( '<?' )
            {
            // InternalBPMN_translator.g:1112:1: ( '<?' )
            // InternalBPMN_translator.g:1113:2: '<?'
            {
             before(grammarAccess.getPrologAccess().getLessThanSignQuestionMarkKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPrologAccess().getLessThanSignQuestionMarkKeyword_0()); 

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
    // $ANTLR end "rule__Prolog__Group__0__Impl"


    // $ANTLR start "rule__Prolog__Group__1"
    // InternalBPMN_translator.g:1122:1: rule__Prolog__Group__1 : rule__Prolog__Group__1__Impl rule__Prolog__Group__2 ;
    public final void rule__Prolog__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1126:1: ( rule__Prolog__Group__1__Impl rule__Prolog__Group__2 )
            // InternalBPMN_translator.g:1127:2: rule__Prolog__Group__1__Impl rule__Prolog__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Prolog__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Prolog__Group__2();

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
    // $ANTLR end "rule__Prolog__Group__1"


    // $ANTLR start "rule__Prolog__Group__1__Impl"
    // InternalBPMN_translator.g:1134:1: rule__Prolog__Group__1__Impl : ( RULE_HEAD ) ;
    public final void rule__Prolog__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1138:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:1139:1: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:1139:1: ( RULE_HEAD )
            // InternalBPMN_translator.g:1140:2: RULE_HEAD
            {
             before(grammarAccess.getPrologAccess().getHEADTerminalRuleCall_1()); 
            match(input,RULE_HEAD,FOLLOW_2); 
             after(grammarAccess.getPrologAccess().getHEADTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Prolog__Group__1__Impl"


    // $ANTLR start "rule__Prolog__Group__2"
    // InternalBPMN_translator.g:1149:1: rule__Prolog__Group__2 : rule__Prolog__Group__2__Impl rule__Prolog__Group__3 ;
    public final void rule__Prolog__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1153:1: ( rule__Prolog__Group__2__Impl rule__Prolog__Group__3 )
            // InternalBPMN_translator.g:1154:2: rule__Prolog__Group__2__Impl rule__Prolog__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Prolog__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Prolog__Group__3();

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
    // $ANTLR end "rule__Prolog__Group__2"


    // $ANTLR start "rule__Prolog__Group__2__Impl"
    // InternalBPMN_translator.g:1161:1: rule__Prolog__Group__2__Impl : ( 'version=' ) ;
    public final void rule__Prolog__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1165:1: ( ( 'version=' ) )
            // InternalBPMN_translator.g:1166:1: ( 'version=' )
            {
            // InternalBPMN_translator.g:1166:1: ( 'version=' )
            // InternalBPMN_translator.g:1167:2: 'version='
            {
             before(grammarAccess.getPrologAccess().getVersionKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPrologAccess().getVersionKeyword_2()); 

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
    // $ANTLR end "rule__Prolog__Group__2__Impl"


    // $ANTLR start "rule__Prolog__Group__3"
    // InternalBPMN_translator.g:1176:1: rule__Prolog__Group__3 : rule__Prolog__Group__3__Impl rule__Prolog__Group__4 ;
    public final void rule__Prolog__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1180:1: ( rule__Prolog__Group__3__Impl rule__Prolog__Group__4 )
            // InternalBPMN_translator.g:1181:2: rule__Prolog__Group__3__Impl rule__Prolog__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Prolog__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Prolog__Group__4();

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
    // $ANTLR end "rule__Prolog__Group__3"


    // $ANTLR start "rule__Prolog__Group__3__Impl"
    // InternalBPMN_translator.g:1188:1: rule__Prolog__Group__3__Impl : ( RULE_STRING ) ;
    public final void rule__Prolog__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1192:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:1193:1: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:1193:1: ( RULE_STRING )
            // InternalBPMN_translator.g:1194:2: RULE_STRING
            {
             before(grammarAccess.getPrologAccess().getSTRINGTerminalRuleCall_3()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPrologAccess().getSTRINGTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__Prolog__Group__3__Impl"


    // $ANTLR start "rule__Prolog__Group__4"
    // InternalBPMN_translator.g:1203:1: rule__Prolog__Group__4 : rule__Prolog__Group__4__Impl rule__Prolog__Group__5 ;
    public final void rule__Prolog__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1207:1: ( rule__Prolog__Group__4__Impl rule__Prolog__Group__5 )
            // InternalBPMN_translator.g:1208:2: rule__Prolog__Group__4__Impl rule__Prolog__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Prolog__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Prolog__Group__5();

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
    // $ANTLR end "rule__Prolog__Group__4"


    // $ANTLR start "rule__Prolog__Group__4__Impl"
    // InternalBPMN_translator.g:1215:1: rule__Prolog__Group__4__Impl : ( 'encoding=' ) ;
    public final void rule__Prolog__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1219:1: ( ( 'encoding=' ) )
            // InternalBPMN_translator.g:1220:1: ( 'encoding=' )
            {
            // InternalBPMN_translator.g:1220:1: ( 'encoding=' )
            // InternalBPMN_translator.g:1221:2: 'encoding='
            {
             before(grammarAccess.getPrologAccess().getEncodingKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPrologAccess().getEncodingKeyword_4()); 

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
    // $ANTLR end "rule__Prolog__Group__4__Impl"


    // $ANTLR start "rule__Prolog__Group__5"
    // InternalBPMN_translator.g:1230:1: rule__Prolog__Group__5 : rule__Prolog__Group__5__Impl rule__Prolog__Group__6 ;
    public final void rule__Prolog__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1234:1: ( rule__Prolog__Group__5__Impl rule__Prolog__Group__6 )
            // InternalBPMN_translator.g:1235:2: rule__Prolog__Group__5__Impl rule__Prolog__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Prolog__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Prolog__Group__6();

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
    // $ANTLR end "rule__Prolog__Group__5"


    // $ANTLR start "rule__Prolog__Group__5__Impl"
    // InternalBPMN_translator.g:1242:1: rule__Prolog__Group__5__Impl : ( RULE_STRING ) ;
    public final void rule__Prolog__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1246:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:1247:1: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:1247:1: ( RULE_STRING )
            // InternalBPMN_translator.g:1248:2: RULE_STRING
            {
             before(grammarAccess.getPrologAccess().getSTRINGTerminalRuleCall_5()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPrologAccess().getSTRINGTerminalRuleCall_5()); 

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
    // $ANTLR end "rule__Prolog__Group__5__Impl"


    // $ANTLR start "rule__Prolog__Group__6"
    // InternalBPMN_translator.g:1257:1: rule__Prolog__Group__6 : rule__Prolog__Group__6__Impl ;
    public final void rule__Prolog__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1261:1: ( rule__Prolog__Group__6__Impl )
            // InternalBPMN_translator.g:1262:2: rule__Prolog__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Prolog__Group__6__Impl();

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
    // $ANTLR end "rule__Prolog__Group__6"


    // $ANTLR start "rule__Prolog__Group__6__Impl"
    // InternalBPMN_translator.g:1268:1: rule__Prolog__Group__6__Impl : ( '?>' ) ;
    public final void rule__Prolog__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1272:1: ( ( '?>' ) )
            // InternalBPMN_translator.g:1273:1: ( '?>' )
            {
            // InternalBPMN_translator.g:1273:1: ( '?>' )
            // InternalBPMN_translator.g:1274:2: '?>'
            {
             before(grammarAccess.getPrologAccess().getQuestionMarkGreaterThanSignKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPrologAccess().getQuestionMarkGreaterThanSignKeyword_6()); 

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
    // $ANTLR end "rule__Prolog__Group__6__Impl"


    // $ANTLR start "rule__Element__Group_0__0"
    // InternalBPMN_translator.g:1284:1: rule__Element__Group_0__0 : rule__Element__Group_0__0__Impl rule__Element__Group_0__1 ;
    public final void rule__Element__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1288:1: ( rule__Element__Group_0__0__Impl rule__Element__Group_0__1 )
            // InternalBPMN_translator.g:1289:2: rule__Element__Group_0__0__Impl rule__Element__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Element__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group_0__1();

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
    // $ANTLR end "rule__Element__Group_0__0"


    // $ANTLR start "rule__Element__Group_0__0__Impl"
    // InternalBPMN_translator.g:1296:1: rule__Element__Group_0__0__Impl : ( ( rule__Element__OpenAssignment_0_0 ) ) ;
    public final void rule__Element__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1300:1: ( ( ( rule__Element__OpenAssignment_0_0 ) ) )
            // InternalBPMN_translator.g:1301:1: ( ( rule__Element__OpenAssignment_0_0 ) )
            {
            // InternalBPMN_translator.g:1301:1: ( ( rule__Element__OpenAssignment_0_0 ) )
            // InternalBPMN_translator.g:1302:2: ( rule__Element__OpenAssignment_0_0 )
            {
             before(grammarAccess.getElementAccess().getOpenAssignment_0_0()); 
            // InternalBPMN_translator.g:1303:2: ( rule__Element__OpenAssignment_0_0 )
            // InternalBPMN_translator.g:1303:3: rule__Element__OpenAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Element__OpenAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getOpenAssignment_0_0()); 

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
    // $ANTLR end "rule__Element__Group_0__0__Impl"


    // $ANTLR start "rule__Element__Group_0__1"
    // InternalBPMN_translator.g:1311:1: rule__Element__Group_0__1 : rule__Element__Group_0__1__Impl rule__Element__Group_0__2 ;
    public final void rule__Element__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1315:1: ( rule__Element__Group_0__1__Impl rule__Element__Group_0__2 )
            // InternalBPMN_translator.g:1316:2: rule__Element__Group_0__1__Impl rule__Element__Group_0__2
            {
            pushFollow(FOLLOW_11);
            rule__Element__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group_0__2();

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
    // $ANTLR end "rule__Element__Group_0__1"


    // $ANTLR start "rule__Element__Group_0__1__Impl"
    // InternalBPMN_translator.g:1323:1: rule__Element__Group_0__1__Impl : ( ( rule__Element__ContentsAssignment_0_1 ) ) ;
    public final void rule__Element__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1327:1: ( ( ( rule__Element__ContentsAssignment_0_1 ) ) )
            // InternalBPMN_translator.g:1328:1: ( ( rule__Element__ContentsAssignment_0_1 ) )
            {
            // InternalBPMN_translator.g:1328:1: ( ( rule__Element__ContentsAssignment_0_1 ) )
            // InternalBPMN_translator.g:1329:2: ( rule__Element__ContentsAssignment_0_1 )
            {
             before(grammarAccess.getElementAccess().getContentsAssignment_0_1()); 
            // InternalBPMN_translator.g:1330:2: ( rule__Element__ContentsAssignment_0_1 )
            // InternalBPMN_translator.g:1330:3: rule__Element__ContentsAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Element__ContentsAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getContentsAssignment_0_1()); 

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
    // $ANTLR end "rule__Element__Group_0__1__Impl"


    // $ANTLR start "rule__Element__Group_0__2"
    // InternalBPMN_translator.g:1338:1: rule__Element__Group_0__2 : rule__Element__Group_0__2__Impl ;
    public final void rule__Element__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1342:1: ( rule__Element__Group_0__2__Impl )
            // InternalBPMN_translator.g:1343:2: rule__Element__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group_0__2__Impl();

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
    // $ANTLR end "rule__Element__Group_0__2"


    // $ANTLR start "rule__Element__Group_0__2__Impl"
    // InternalBPMN_translator.g:1349:1: rule__Element__Group_0__2__Impl : ( ( rule__Element__Close_tagAssignment_0_2 ) ) ;
    public final void rule__Element__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1353:1: ( ( ( rule__Element__Close_tagAssignment_0_2 ) ) )
            // InternalBPMN_translator.g:1354:1: ( ( rule__Element__Close_tagAssignment_0_2 ) )
            {
            // InternalBPMN_translator.g:1354:1: ( ( rule__Element__Close_tagAssignment_0_2 ) )
            // InternalBPMN_translator.g:1355:2: ( rule__Element__Close_tagAssignment_0_2 )
            {
             before(grammarAccess.getElementAccess().getClose_tagAssignment_0_2()); 
            // InternalBPMN_translator.g:1356:2: ( rule__Element__Close_tagAssignment_0_2 )
            // InternalBPMN_translator.g:1356:3: rule__Element__Close_tagAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Element__Close_tagAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getClose_tagAssignment_0_2()); 

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
    // $ANTLR end "rule__Element__Group_0__2__Impl"


    // $ANTLR start "rule__Content__Group__0"
    // InternalBPMN_translator.g:1365:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1369:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // InternalBPMN_translator.g:1370:2: rule__Content__Group__0__Impl rule__Content__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Content__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Content__Group__1();

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
    // $ANTLR end "rule__Content__Group__0"


    // $ANTLR start "rule__Content__Group__0__Impl"
    // InternalBPMN_translator.g:1377:1: rule__Content__Group__0__Impl : ( () ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1381:1: ( ( () ) )
            // InternalBPMN_translator.g:1382:1: ( () )
            {
            // InternalBPMN_translator.g:1382:1: ( () )
            // InternalBPMN_translator.g:1383:2: ()
            {
             before(grammarAccess.getContentAccess().getContentAction_0()); 
            // InternalBPMN_translator.g:1384:2: ()
            // InternalBPMN_translator.g:1384:3: 
            {
            }

             after(grammarAccess.getContentAccess().getContentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__0__Impl"


    // $ANTLR start "rule__Content__Group__1"
    // InternalBPMN_translator.g:1392:1: rule__Content__Group__1 : rule__Content__Group__1__Impl ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1396:1: ( rule__Content__Group__1__Impl )
            // InternalBPMN_translator.g:1397:2: rule__Content__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Content__Group__1__Impl();

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
    // $ANTLR end "rule__Content__Group__1"


    // $ANTLR start "rule__Content__Group__1__Impl"
    // InternalBPMN_translator.g:1403:1: rule__Content__Group__1__Impl : ( ( rule__Content__Alternatives_1 )* ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1407:1: ( ( ( rule__Content__Alternatives_1 )* ) )
            // InternalBPMN_translator.g:1408:1: ( ( rule__Content__Alternatives_1 )* )
            {
            // InternalBPMN_translator.g:1408:1: ( ( rule__Content__Alternatives_1 )* )
            // InternalBPMN_translator.g:1409:2: ( rule__Content__Alternatives_1 )*
            {
             before(grammarAccess.getContentAccess().getAlternatives_1()); 
            // InternalBPMN_translator.g:1410:2: ( rule__Content__Alternatives_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_BODY||(LA19_0>=RULE_STRING && LA19_0<=RULE_KEYWORDS)||(LA19_0>=14 && LA19_0<=15)||(LA19_0>=25 && LA19_0<=26)||LA19_0==33||LA19_0==38) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBPMN_translator.g:1410:3: rule__Content__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Content__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getContentAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Content__Group__1__Impl"


    // $ANTLR start "rule__Content__Group_1_0__0"
    // InternalBPMN_translator.g:1419:1: rule__Content__Group_1_0__0 : rule__Content__Group_1_0__0__Impl rule__Content__Group_1_0__1 ;
    public final void rule__Content__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1423:1: ( rule__Content__Group_1_0__0__Impl rule__Content__Group_1_0__1 )
            // InternalBPMN_translator.g:1424:2: rule__Content__Group_1_0__0__Impl rule__Content__Group_1_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Content__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Content__Group_1_0__1();

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
    // $ANTLR end "rule__Content__Group_1_0__0"


    // $ANTLR start "rule__Content__Group_1_0__0__Impl"
    // InternalBPMN_translator.g:1431:1: rule__Content__Group_1_0__0__Impl : ( ( rule__Content__TypeAssignment_1_0_0 ) ) ;
    public final void rule__Content__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1435:1: ( ( ( rule__Content__TypeAssignment_1_0_0 ) ) )
            // InternalBPMN_translator.g:1436:1: ( ( rule__Content__TypeAssignment_1_0_0 ) )
            {
            // InternalBPMN_translator.g:1436:1: ( ( rule__Content__TypeAssignment_1_0_0 ) )
            // InternalBPMN_translator.g:1437:2: ( rule__Content__TypeAssignment_1_0_0 )
            {
             before(grammarAccess.getContentAccess().getTypeAssignment_1_0_0()); 
            // InternalBPMN_translator.g:1438:2: ( rule__Content__TypeAssignment_1_0_0 )
            // InternalBPMN_translator.g:1438:3: rule__Content__TypeAssignment_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Content__TypeAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getTypeAssignment_1_0_0()); 

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
    // $ANTLR end "rule__Content__Group_1_0__0__Impl"


    // $ANTLR start "rule__Content__Group_1_0__1"
    // InternalBPMN_translator.g:1446:1: rule__Content__Group_1_0__1 : rule__Content__Group_1_0__1__Impl rule__Content__Group_1_0__2 ;
    public final void rule__Content__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1450:1: ( rule__Content__Group_1_0__1__Impl rule__Content__Group_1_0__2 )
            // InternalBPMN_translator.g:1451:2: rule__Content__Group_1_0__1__Impl rule__Content__Group_1_0__2
            {
            pushFollow(FOLLOW_14);
            rule__Content__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Content__Group_1_0__2();

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
    // $ANTLR end "rule__Content__Group_1_0__1"


    // $ANTLR start "rule__Content__Group_1_0__1__Impl"
    // InternalBPMN_translator.g:1458:1: rule__Content__Group_1_0__1__Impl : ( '{' ) ;
    public final void rule__Content__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1462:1: ( ( '{' ) )
            // InternalBPMN_translator.g:1463:1: ( '{' )
            {
            // InternalBPMN_translator.g:1463:1: ( '{' )
            // InternalBPMN_translator.g:1464:2: '{'
            {
             before(grammarAccess.getContentAccess().getLeftCurlyBracketKeyword_1_0_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getContentAccess().getLeftCurlyBracketKeyword_1_0_1()); 

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
    // $ANTLR end "rule__Content__Group_1_0__1__Impl"


    // $ANTLR start "rule__Content__Group_1_0__2"
    // InternalBPMN_translator.g:1473:1: rule__Content__Group_1_0__2 : rule__Content__Group_1_0__2__Impl rule__Content__Group_1_0__3 ;
    public final void rule__Content__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1477:1: ( rule__Content__Group_1_0__2__Impl rule__Content__Group_1_0__3 )
            // InternalBPMN_translator.g:1478:2: rule__Content__Group_1_0__2__Impl rule__Content__Group_1_0__3
            {
            pushFollow(FOLLOW_15);
            rule__Content__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Content__Group_1_0__3();

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
    // $ANTLR end "rule__Content__Group_1_0__2"


    // $ANTLR start "rule__Content__Group_1_0__2__Impl"
    // InternalBPMN_translator.g:1485:1: rule__Content__Group_1_0__2__Impl : ( ( rule__Content__CodexAssignment_1_0_2 ) ) ;
    public final void rule__Content__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1489:1: ( ( ( rule__Content__CodexAssignment_1_0_2 ) ) )
            // InternalBPMN_translator.g:1490:1: ( ( rule__Content__CodexAssignment_1_0_2 ) )
            {
            // InternalBPMN_translator.g:1490:1: ( ( rule__Content__CodexAssignment_1_0_2 ) )
            // InternalBPMN_translator.g:1491:2: ( rule__Content__CodexAssignment_1_0_2 )
            {
             before(grammarAccess.getContentAccess().getCodexAssignment_1_0_2()); 
            // InternalBPMN_translator.g:1492:2: ( rule__Content__CodexAssignment_1_0_2 )
            // InternalBPMN_translator.g:1492:3: rule__Content__CodexAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Content__CodexAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getCodexAssignment_1_0_2()); 

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
    // $ANTLR end "rule__Content__Group_1_0__2__Impl"


    // $ANTLR start "rule__Content__Group_1_0__3"
    // InternalBPMN_translator.g:1500:1: rule__Content__Group_1_0__3 : rule__Content__Group_1_0__3__Impl ;
    public final void rule__Content__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1504:1: ( rule__Content__Group_1_0__3__Impl )
            // InternalBPMN_translator.g:1505:2: rule__Content__Group_1_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Content__Group_1_0__3__Impl();

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
    // $ANTLR end "rule__Content__Group_1_0__3"


    // $ANTLR start "rule__Content__Group_1_0__3__Impl"
    // InternalBPMN_translator.g:1511:1: rule__Content__Group_1_0__3__Impl : ( '}' ) ;
    public final void rule__Content__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1515:1: ( ( '}' ) )
            // InternalBPMN_translator.g:1516:1: ( '}' )
            {
            // InternalBPMN_translator.g:1516:1: ( '}' )
            // InternalBPMN_translator.g:1517:2: '}'
            {
             before(grammarAccess.getContentAccess().getRightCurlyBracketKeyword_1_0_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getContentAccess().getRightCurlyBracketKeyword_1_0_3()); 

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
    // $ANTLR end "rule__Content__Group_1_0__3__Impl"


    // $ANTLR start "rule__Content__Group_1_2__0"
    // InternalBPMN_translator.g:1527:1: rule__Content__Group_1_2__0 : rule__Content__Group_1_2__0__Impl rule__Content__Group_1_2__1 ;
    public final void rule__Content__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1531:1: ( rule__Content__Group_1_2__0__Impl rule__Content__Group_1_2__1 )
            // InternalBPMN_translator.g:1532:2: rule__Content__Group_1_2__0__Impl rule__Content__Group_1_2__1
            {
            pushFollow(FOLLOW_16);
            rule__Content__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Content__Group_1_2__1();

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
    // $ANTLR end "rule__Content__Group_1_2__0"


    // $ANTLR start "rule__Content__Group_1_2__0__Impl"
    // InternalBPMN_translator.g:1539:1: rule__Content__Group_1_2__0__Impl : ( ( rule__Content__BodyAssignment_1_2_0 )* ) ;
    public final void rule__Content__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1543:1: ( ( ( rule__Content__BodyAssignment_1_2_0 )* ) )
            // InternalBPMN_translator.g:1544:1: ( ( rule__Content__BodyAssignment_1_2_0 )* )
            {
            // InternalBPMN_translator.g:1544:1: ( ( rule__Content__BodyAssignment_1_2_0 )* )
            // InternalBPMN_translator.g:1545:2: ( rule__Content__BodyAssignment_1_2_0 )*
            {
             before(grammarAccess.getContentAccess().getBodyAssignment_1_2_0()); 
            // InternalBPMN_translator.g:1546:2: ( rule__Content__BodyAssignment_1_2_0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=25 && LA20_0<=26)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBPMN_translator.g:1546:3: rule__Content__BodyAssignment_1_2_0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Content__BodyAssignment_1_2_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getContentAccess().getBodyAssignment_1_2_0()); 

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
    // $ANTLR end "rule__Content__Group_1_2__0__Impl"


    // $ANTLR start "rule__Content__Group_1_2__1"
    // InternalBPMN_translator.g:1554:1: rule__Content__Group_1_2__1 : rule__Content__Group_1_2__1__Impl rule__Content__Group_1_2__2 ;
    public final void rule__Content__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1558:1: ( rule__Content__Group_1_2__1__Impl rule__Content__Group_1_2__2 )
            // InternalBPMN_translator.g:1559:2: rule__Content__Group_1_2__1__Impl rule__Content__Group_1_2__2
            {
            pushFollow(FOLLOW_18);
            rule__Content__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Content__Group_1_2__2();

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
    // $ANTLR end "rule__Content__Group_1_2__1"


    // $ANTLR start "rule__Content__Group_1_2__1__Impl"
    // InternalBPMN_translator.g:1566:1: rule__Content__Group_1_2__1__Impl : ( ( rule__Content__BodyAssignment_1_2_1 ) ) ;
    public final void rule__Content__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1570:1: ( ( ( rule__Content__BodyAssignment_1_2_1 ) ) )
            // InternalBPMN_translator.g:1571:1: ( ( rule__Content__BodyAssignment_1_2_1 ) )
            {
            // InternalBPMN_translator.g:1571:1: ( ( rule__Content__BodyAssignment_1_2_1 ) )
            // InternalBPMN_translator.g:1572:2: ( rule__Content__BodyAssignment_1_2_1 )
            {
             before(grammarAccess.getContentAccess().getBodyAssignment_1_2_1()); 
            // InternalBPMN_translator.g:1573:2: ( rule__Content__BodyAssignment_1_2_1 )
            // InternalBPMN_translator.g:1573:3: rule__Content__BodyAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Content__BodyAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getBodyAssignment_1_2_1()); 

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
    // $ANTLR end "rule__Content__Group_1_2__1__Impl"


    // $ANTLR start "rule__Content__Group_1_2__2"
    // InternalBPMN_translator.g:1581:1: rule__Content__Group_1_2__2 : rule__Content__Group_1_2__2__Impl ;
    public final void rule__Content__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1585:1: ( rule__Content__Group_1_2__2__Impl )
            // InternalBPMN_translator.g:1586:2: rule__Content__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Content__Group_1_2__2__Impl();

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
    // $ANTLR end "rule__Content__Group_1_2__2"


    // $ANTLR start "rule__Content__Group_1_2__2__Impl"
    // InternalBPMN_translator.g:1592:1: rule__Content__Group_1_2__2__Impl : ( ( rule__Content__BodyAssignment_1_2_2 )* ) ;
    public final void rule__Content__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1596:1: ( ( ( rule__Content__BodyAssignment_1_2_2 )* ) )
            // InternalBPMN_translator.g:1597:1: ( ( rule__Content__BodyAssignment_1_2_2 )* )
            {
            // InternalBPMN_translator.g:1597:1: ( ( rule__Content__BodyAssignment_1_2_2 )* )
            // InternalBPMN_translator.g:1598:2: ( rule__Content__BodyAssignment_1_2_2 )*
            {
             before(grammarAccess.getContentAccess().getBodyAssignment_1_2_2()); 
            // InternalBPMN_translator.g:1599:2: ( rule__Content__BodyAssignment_1_2_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=16 && LA21_0<=24)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBPMN_translator.g:1599:3: rule__Content__BodyAssignment_1_2_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Content__BodyAssignment_1_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getContentAccess().getBodyAssignment_1_2_2()); 

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
    // $ANTLR end "rule__Content__Group_1_2__2__Impl"


    // $ANTLR start "rule__Open__Group__0"
    // InternalBPMN_translator.g:1608:1: rule__Open__Group__0 : rule__Open__Group__0__Impl rule__Open__Group__1 ;
    public final void rule__Open__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1612:1: ( rule__Open__Group__0__Impl rule__Open__Group__1 )
            // InternalBPMN_translator.g:1613:2: rule__Open__Group__0__Impl rule__Open__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalBPMN_translator.g:1620:1: rule__Open__Group__0__Impl : ( '<' ) ;
    public final void rule__Open__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1624:1: ( ( '<' ) )
            // InternalBPMN_translator.g:1625:1: ( '<' )
            {
            // InternalBPMN_translator.g:1625:1: ( '<' )
            // InternalBPMN_translator.g:1626:2: '<'
            {
             before(grammarAccess.getOpenAccess().getLessThanSignKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getOpenAccess().getLessThanSignKeyword_0()); 

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
    // $ANTLR end "rule__Open__Group__0__Impl"


    // $ANTLR start "rule__Open__Group__1"
    // InternalBPMN_translator.g:1635:1: rule__Open__Group__1 : rule__Open__Group__1__Impl rule__Open__Group__2 ;
    public final void rule__Open__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1639:1: ( rule__Open__Group__1__Impl rule__Open__Group__2 )
            // InternalBPMN_translator.g:1640:2: rule__Open__Group__1__Impl rule__Open__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalBPMN_translator.g:1647:1: rule__Open__Group__1__Impl : ( ( rule__Open__HeadAssignment_1 ) ) ;
    public final void rule__Open__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1651:1: ( ( ( rule__Open__HeadAssignment_1 ) ) )
            // InternalBPMN_translator.g:1652:1: ( ( rule__Open__HeadAssignment_1 ) )
            {
            // InternalBPMN_translator.g:1652:1: ( ( rule__Open__HeadAssignment_1 ) )
            // InternalBPMN_translator.g:1653:2: ( rule__Open__HeadAssignment_1 )
            {
             before(grammarAccess.getOpenAccess().getHeadAssignment_1()); 
            // InternalBPMN_translator.g:1654:2: ( rule__Open__HeadAssignment_1 )
            // InternalBPMN_translator.g:1654:3: rule__Open__HeadAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Open__HeadAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOpenAccess().getHeadAssignment_1()); 

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
    // InternalBPMN_translator.g:1662:1: rule__Open__Group__2 : rule__Open__Group__2__Impl rule__Open__Group__3 ;
    public final void rule__Open__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1666:1: ( rule__Open__Group__2__Impl rule__Open__Group__3 )
            // InternalBPMN_translator.g:1667:2: rule__Open__Group__2__Impl rule__Open__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Open__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Open__Group__3();

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
    // InternalBPMN_translator.g:1674:1: rule__Open__Group__2__Impl : ( ':' ) ;
    public final void rule__Open__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1678:1: ( ( ':' ) )
            // InternalBPMN_translator.g:1679:1: ( ':' )
            {
            // InternalBPMN_translator.g:1679:1: ( ':' )
            // InternalBPMN_translator.g:1680:2: ':'
            {
             before(grammarAccess.getOpenAccess().getColonKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getOpenAccess().getColonKeyword_2()); 

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


    // $ANTLR start "rule__Open__Group__3"
    // InternalBPMN_translator.g:1689:1: rule__Open__Group__3 : rule__Open__Group__3__Impl rule__Open__Group__4 ;
    public final void rule__Open__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1693:1: ( rule__Open__Group__3__Impl rule__Open__Group__4 )
            // InternalBPMN_translator.g:1694:2: rule__Open__Group__3__Impl rule__Open__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Open__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Open__Group__4();

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
    // $ANTLR end "rule__Open__Group__3"


    // $ANTLR start "rule__Open__Group__3__Impl"
    // InternalBPMN_translator.g:1701:1: rule__Open__Group__3__Impl : ( ( rule__Open__KeywordsAssignment_3 ) ) ;
    public final void rule__Open__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1705:1: ( ( ( rule__Open__KeywordsAssignment_3 ) ) )
            // InternalBPMN_translator.g:1706:1: ( ( rule__Open__KeywordsAssignment_3 ) )
            {
            // InternalBPMN_translator.g:1706:1: ( ( rule__Open__KeywordsAssignment_3 ) )
            // InternalBPMN_translator.g:1707:2: ( rule__Open__KeywordsAssignment_3 )
            {
             before(grammarAccess.getOpenAccess().getKeywordsAssignment_3()); 
            // InternalBPMN_translator.g:1708:2: ( rule__Open__KeywordsAssignment_3 )
            // InternalBPMN_translator.g:1708:3: rule__Open__KeywordsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Open__KeywordsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOpenAccess().getKeywordsAssignment_3()); 

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
    // $ANTLR end "rule__Open__Group__3__Impl"


    // $ANTLR start "rule__Open__Group__4"
    // InternalBPMN_translator.g:1716:1: rule__Open__Group__4 : rule__Open__Group__4__Impl rule__Open__Group__5 ;
    public final void rule__Open__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1720:1: ( rule__Open__Group__4__Impl rule__Open__Group__5 )
            // InternalBPMN_translator.g:1721:2: rule__Open__Group__4__Impl rule__Open__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Open__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Open__Group__5();

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
    // $ANTLR end "rule__Open__Group__4"


    // $ANTLR start "rule__Open__Group__4__Impl"
    // InternalBPMN_translator.g:1728:1: rule__Open__Group__4__Impl : ( ( rule__Open__Alternatives_4 )* ) ;
    public final void rule__Open__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1732:1: ( ( ( rule__Open__Alternatives_4 )* ) )
            // InternalBPMN_translator.g:1733:1: ( ( rule__Open__Alternatives_4 )* )
            {
            // InternalBPMN_translator.g:1733:1: ( ( rule__Open__Alternatives_4 )* )
            // InternalBPMN_translator.g:1734:2: ( rule__Open__Alternatives_4 )*
            {
             before(grammarAccess.getOpenAccess().getAlternatives_4()); 
            // InternalBPMN_translator.g:1735:2: ( rule__Open__Alternatives_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_HEAD||LA22_0==RULE_KEYWORDS) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBPMN_translator.g:1735:3: rule__Open__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Open__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getOpenAccess().getAlternatives_4()); 

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
    // $ANTLR end "rule__Open__Group__4__Impl"


    // $ANTLR start "rule__Open__Group__5"
    // InternalBPMN_translator.g:1743:1: rule__Open__Group__5 : rule__Open__Group__5__Impl ;
    public final void rule__Open__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1747:1: ( rule__Open__Group__5__Impl )
            // InternalBPMN_translator.g:1748:2: rule__Open__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Open__Group__5__Impl();

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
    // $ANTLR end "rule__Open__Group__5"


    // $ANTLR start "rule__Open__Group__5__Impl"
    // InternalBPMN_translator.g:1754:1: rule__Open__Group__5__Impl : ( '>' ) ;
    public final void rule__Open__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1758:1: ( ( '>' ) )
            // InternalBPMN_translator.g:1759:1: ( '>' )
            {
            // InternalBPMN_translator.g:1759:1: ( '>' )
            // InternalBPMN_translator.g:1760:2: '>'
            {
             before(grammarAccess.getOpenAccess().getGreaterThanSignKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getOpenAccess().getGreaterThanSignKeyword_5()); 

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
    // $ANTLR end "rule__Open__Group__5__Impl"


    // $ANTLR start "rule__Open__Group_4_0__0"
    // InternalBPMN_translator.g:1770:1: rule__Open__Group_4_0__0 : rule__Open__Group_4_0__0__Impl rule__Open__Group_4_0__1 ;
    public final void rule__Open__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1774:1: ( rule__Open__Group_4_0__0__Impl rule__Open__Group_4_0__1 )
            // InternalBPMN_translator.g:1775:2: rule__Open__Group_4_0__0__Impl rule__Open__Group_4_0__1
            {
            pushFollow(FOLLOW_20);
            rule__Open__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Open__Group_4_0__1();

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
    // $ANTLR end "rule__Open__Group_4_0__0"


    // $ANTLR start "rule__Open__Group_4_0__0__Impl"
    // InternalBPMN_translator.g:1782:1: rule__Open__Group_4_0__0__Impl : ( ( rule__Open__Head1Assignment_4_0_0 ) ) ;
    public final void rule__Open__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1786:1: ( ( ( rule__Open__Head1Assignment_4_0_0 ) ) )
            // InternalBPMN_translator.g:1787:1: ( ( rule__Open__Head1Assignment_4_0_0 ) )
            {
            // InternalBPMN_translator.g:1787:1: ( ( rule__Open__Head1Assignment_4_0_0 ) )
            // InternalBPMN_translator.g:1788:2: ( rule__Open__Head1Assignment_4_0_0 )
            {
             before(grammarAccess.getOpenAccess().getHead1Assignment_4_0_0()); 
            // InternalBPMN_translator.g:1789:2: ( rule__Open__Head1Assignment_4_0_0 )
            // InternalBPMN_translator.g:1789:3: rule__Open__Head1Assignment_4_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Open__Head1Assignment_4_0_0();

            state._fsp--;


            }

             after(grammarAccess.getOpenAccess().getHead1Assignment_4_0_0()); 

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
    // $ANTLR end "rule__Open__Group_4_0__0__Impl"


    // $ANTLR start "rule__Open__Group_4_0__1"
    // InternalBPMN_translator.g:1797:1: rule__Open__Group_4_0__1 : rule__Open__Group_4_0__1__Impl ;
    public final void rule__Open__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1801:1: ( rule__Open__Group_4_0__1__Impl )
            // InternalBPMN_translator.g:1802:2: rule__Open__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Open__Group_4_0__1__Impl();

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
    // $ANTLR end "rule__Open__Group_4_0__1"


    // $ANTLR start "rule__Open__Group_4_0__1__Impl"
    // InternalBPMN_translator.g:1808:1: rule__Open__Group_4_0__1__Impl : ( ':' ) ;
    public final void rule__Open__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1812:1: ( ( ':' ) )
            // InternalBPMN_translator.g:1813:1: ( ':' )
            {
            // InternalBPMN_translator.g:1813:1: ( ':' )
            // InternalBPMN_translator.g:1814:2: ':'
            {
             before(grammarAccess.getOpenAccess().getColonKeyword_4_0_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getOpenAccess().getColonKeyword_4_0_1()); 

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
    // $ANTLR end "rule__Open__Group_4_0__1__Impl"


    // $ANTLR start "rule__Open__Group_4_1__0"
    // InternalBPMN_translator.g:1824:1: rule__Open__Group_4_1__0 : rule__Open__Group_4_1__0__Impl rule__Open__Group_4_1__1 ;
    public final void rule__Open__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1828:1: ( rule__Open__Group_4_1__0__Impl rule__Open__Group_4_1__1 )
            // InternalBPMN_translator.g:1829:2: rule__Open__Group_4_1__0__Impl rule__Open__Group_4_1__1
            {
            pushFollow(FOLLOW_24);
            rule__Open__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Open__Group_4_1__1();

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
    // $ANTLR end "rule__Open__Group_4_1__0"


    // $ANTLR start "rule__Open__Group_4_1__0__Impl"
    // InternalBPMN_translator.g:1836:1: rule__Open__Group_4_1__0__Impl : ( ( rule__Open__Alternatives_4_1_0 ) ) ;
    public final void rule__Open__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1840:1: ( ( ( rule__Open__Alternatives_4_1_0 ) ) )
            // InternalBPMN_translator.g:1841:1: ( ( rule__Open__Alternatives_4_1_0 ) )
            {
            // InternalBPMN_translator.g:1841:1: ( ( rule__Open__Alternatives_4_1_0 ) )
            // InternalBPMN_translator.g:1842:2: ( rule__Open__Alternatives_4_1_0 )
            {
             before(grammarAccess.getOpenAccess().getAlternatives_4_1_0()); 
            // InternalBPMN_translator.g:1843:2: ( rule__Open__Alternatives_4_1_0 )
            // InternalBPMN_translator.g:1843:3: rule__Open__Alternatives_4_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Open__Alternatives_4_1_0();

            state._fsp--;


            }

             after(grammarAccess.getOpenAccess().getAlternatives_4_1_0()); 

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
    // $ANTLR end "rule__Open__Group_4_1__0__Impl"


    // $ANTLR start "rule__Open__Group_4_1__1"
    // InternalBPMN_translator.g:1851:1: rule__Open__Group_4_1__1 : rule__Open__Group_4_1__1__Impl rule__Open__Group_4_1__2 ;
    public final void rule__Open__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1855:1: ( rule__Open__Group_4_1__1__Impl rule__Open__Group_4_1__2 )
            // InternalBPMN_translator.g:1856:2: rule__Open__Group_4_1__1__Impl rule__Open__Group_4_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Open__Group_4_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Open__Group_4_1__2();

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
    // $ANTLR end "rule__Open__Group_4_1__1"


    // $ANTLR start "rule__Open__Group_4_1__1__Impl"
    // InternalBPMN_translator.g:1863:1: rule__Open__Group_4_1__1__Impl : ( '=' ) ;
    public final void rule__Open__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1867:1: ( ( '=' ) )
            // InternalBPMN_translator.g:1868:1: ( '=' )
            {
            // InternalBPMN_translator.g:1868:1: ( '=' )
            // InternalBPMN_translator.g:1869:2: '='
            {
             before(grammarAccess.getOpenAccess().getEqualsSignKeyword_4_1_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getOpenAccess().getEqualsSignKeyword_4_1_1()); 

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
    // $ANTLR end "rule__Open__Group_4_1__1__Impl"


    // $ANTLR start "rule__Open__Group_4_1__2"
    // InternalBPMN_translator.g:1878:1: rule__Open__Group_4_1__2 : rule__Open__Group_4_1__2__Impl ;
    public final void rule__Open__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1882:1: ( rule__Open__Group_4_1__2__Impl )
            // InternalBPMN_translator.g:1883:2: rule__Open__Group_4_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Open__Group_4_1__2__Impl();

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
    // $ANTLR end "rule__Open__Group_4_1__2"


    // $ANTLR start "rule__Open__Group_4_1__2__Impl"
    // InternalBPMN_translator.g:1889:1: rule__Open__Group_4_1__2__Impl : ( ( rule__Open__ValueAssignment_4_1_2 ) ) ;
    public final void rule__Open__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1893:1: ( ( ( rule__Open__ValueAssignment_4_1_2 ) ) )
            // InternalBPMN_translator.g:1894:1: ( ( rule__Open__ValueAssignment_4_1_2 ) )
            {
            // InternalBPMN_translator.g:1894:1: ( ( rule__Open__ValueAssignment_4_1_2 ) )
            // InternalBPMN_translator.g:1895:2: ( rule__Open__ValueAssignment_4_1_2 )
            {
             before(grammarAccess.getOpenAccess().getValueAssignment_4_1_2()); 
            // InternalBPMN_translator.g:1896:2: ( rule__Open__ValueAssignment_4_1_2 )
            // InternalBPMN_translator.g:1896:3: rule__Open__ValueAssignment_4_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Open__ValueAssignment_4_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOpenAccess().getValueAssignment_4_1_2()); 

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
    // $ANTLR end "rule__Open__Group_4_1__2__Impl"


    // $ANTLR start "rule__Singleton__Group__0"
    // InternalBPMN_translator.g:1905:1: rule__Singleton__Group__0 : rule__Singleton__Group__0__Impl rule__Singleton__Group__1 ;
    public final void rule__Singleton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1909:1: ( rule__Singleton__Group__0__Impl rule__Singleton__Group__1 )
            // InternalBPMN_translator.g:1910:2: rule__Singleton__Group__0__Impl rule__Singleton__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalBPMN_translator.g:1917:1: rule__Singleton__Group__0__Impl : ( () ) ;
    public final void rule__Singleton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1921:1: ( ( () ) )
            // InternalBPMN_translator.g:1922:1: ( () )
            {
            // InternalBPMN_translator.g:1922:1: ( () )
            // InternalBPMN_translator.g:1923:2: ()
            {
             before(grammarAccess.getSingletonAccess().getSingletonAction_0()); 
            // InternalBPMN_translator.g:1924:2: ()
            // InternalBPMN_translator.g:1924:3: 
            {
            }

             after(grammarAccess.getSingletonAccess().getSingletonAction_0()); 

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
    // InternalBPMN_translator.g:1932:1: rule__Singleton__Group__1 : rule__Singleton__Group__1__Impl rule__Singleton__Group__2 ;
    public final void rule__Singleton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1936:1: ( rule__Singleton__Group__1__Impl rule__Singleton__Group__2 )
            // InternalBPMN_translator.g:1937:2: rule__Singleton__Group__1__Impl rule__Singleton__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Singleton__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Singleton__Group__2();

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
    // InternalBPMN_translator.g:1944:1: rule__Singleton__Group__1__Impl : ( ( rule__Singleton__Group_1__0 ) ) ;
    public final void rule__Singleton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1948:1: ( ( ( rule__Singleton__Group_1__0 ) ) )
            // InternalBPMN_translator.g:1949:1: ( ( rule__Singleton__Group_1__0 ) )
            {
            // InternalBPMN_translator.g:1949:1: ( ( rule__Singleton__Group_1__0 ) )
            // InternalBPMN_translator.g:1950:2: ( rule__Singleton__Group_1__0 )
            {
             before(grammarAccess.getSingletonAccess().getGroup_1()); 
            // InternalBPMN_translator.g:1951:2: ( rule__Singleton__Group_1__0 )
            // InternalBPMN_translator.g:1951:3: rule__Singleton__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Singleton__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getSingletonAccess().getGroup_1()); 

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


    // $ANTLR start "rule__Singleton__Group__2"
    // InternalBPMN_translator.g:1959:1: rule__Singleton__Group__2 : rule__Singleton__Group__2__Impl ;
    public final void rule__Singleton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1963:1: ( rule__Singleton__Group__2__Impl )
            // InternalBPMN_translator.g:1964:2: rule__Singleton__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Singleton__Group__2__Impl();

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
    // $ANTLR end "rule__Singleton__Group__2"


    // $ANTLR start "rule__Singleton__Group__2__Impl"
    // InternalBPMN_translator.g:1970:1: rule__Singleton__Group__2__Impl : ( '/>' ) ;
    public final void rule__Singleton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1974:1: ( ( '/>' ) )
            // InternalBPMN_translator.g:1975:1: ( '/>' )
            {
            // InternalBPMN_translator.g:1975:1: ( '/>' )
            // InternalBPMN_translator.g:1976:2: '/>'
            {
             before(grammarAccess.getSingletonAccess().getSolidusGreaterThanSignKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSingletonAccess().getSolidusGreaterThanSignKeyword_2()); 

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
    // $ANTLR end "rule__Singleton__Group__2__Impl"


    // $ANTLR start "rule__Singleton__Group_1__0"
    // InternalBPMN_translator.g:1986:1: rule__Singleton__Group_1__0 : rule__Singleton__Group_1__0__Impl rule__Singleton__Group_1__1 ;
    public final void rule__Singleton__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1990:1: ( rule__Singleton__Group_1__0__Impl rule__Singleton__Group_1__1 )
            // InternalBPMN_translator.g:1991:2: rule__Singleton__Group_1__0__Impl rule__Singleton__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Singleton__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Singleton__Group_1__1();

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
    // $ANTLR end "rule__Singleton__Group_1__0"


    // $ANTLR start "rule__Singleton__Group_1__0__Impl"
    // InternalBPMN_translator.g:1998:1: rule__Singleton__Group_1__0__Impl : ( '<' ) ;
    public final void rule__Singleton__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2002:1: ( ( '<' ) )
            // InternalBPMN_translator.g:2003:1: ( '<' )
            {
            // InternalBPMN_translator.g:2003:1: ( '<' )
            // InternalBPMN_translator.g:2004:2: '<'
            {
             before(grammarAccess.getSingletonAccess().getLessThanSignKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSingletonAccess().getLessThanSignKeyword_1_0()); 

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
    // $ANTLR end "rule__Singleton__Group_1__0__Impl"


    // $ANTLR start "rule__Singleton__Group_1__1"
    // InternalBPMN_translator.g:2013:1: rule__Singleton__Group_1__1 : rule__Singleton__Group_1__1__Impl rule__Singleton__Group_1__2 ;
    public final void rule__Singleton__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2017:1: ( rule__Singleton__Group_1__1__Impl rule__Singleton__Group_1__2 )
            // InternalBPMN_translator.g:2018:2: rule__Singleton__Group_1__1__Impl rule__Singleton__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__Singleton__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Singleton__Group_1__2();

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
    // $ANTLR end "rule__Singleton__Group_1__1"


    // $ANTLR start "rule__Singleton__Group_1__1__Impl"
    // InternalBPMN_translator.g:2025:1: rule__Singleton__Group_1__1__Impl : ( RULE_HEAD ) ;
    public final void rule__Singleton__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2029:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:2030:1: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:2030:1: ( RULE_HEAD )
            // InternalBPMN_translator.g:2031:2: RULE_HEAD
            {
             before(grammarAccess.getSingletonAccess().getHEADTerminalRuleCall_1_1()); 
            match(input,RULE_HEAD,FOLLOW_2); 
             after(grammarAccess.getSingletonAccess().getHEADTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Singleton__Group_1__1__Impl"


    // $ANTLR start "rule__Singleton__Group_1__2"
    // InternalBPMN_translator.g:2040:1: rule__Singleton__Group_1__2 : rule__Singleton__Group_1__2__Impl rule__Singleton__Group_1__3 ;
    public final void rule__Singleton__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2044:1: ( rule__Singleton__Group_1__2__Impl rule__Singleton__Group_1__3 )
            // InternalBPMN_translator.g:2045:2: rule__Singleton__Group_1__2__Impl rule__Singleton__Group_1__3
            {
            pushFollow(FOLLOW_21);
            rule__Singleton__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Singleton__Group_1__3();

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
    // $ANTLR end "rule__Singleton__Group_1__2"


    // $ANTLR start "rule__Singleton__Group_1__2__Impl"
    // InternalBPMN_translator.g:2052:1: rule__Singleton__Group_1__2__Impl : ( ':' ) ;
    public final void rule__Singleton__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2056:1: ( ( ':' ) )
            // InternalBPMN_translator.g:2057:1: ( ':' )
            {
            // InternalBPMN_translator.g:2057:1: ( ':' )
            // InternalBPMN_translator.g:2058:2: ':'
            {
             before(grammarAccess.getSingletonAccess().getColonKeyword_1_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSingletonAccess().getColonKeyword_1_2()); 

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
    // $ANTLR end "rule__Singleton__Group_1__2__Impl"


    // $ANTLR start "rule__Singleton__Group_1__3"
    // InternalBPMN_translator.g:2067:1: rule__Singleton__Group_1__3 : rule__Singleton__Group_1__3__Impl rule__Singleton__Group_1__4 ;
    public final void rule__Singleton__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2071:1: ( rule__Singleton__Group_1__3__Impl rule__Singleton__Group_1__4 )
            // InternalBPMN_translator.g:2072:2: rule__Singleton__Group_1__3__Impl rule__Singleton__Group_1__4
            {
            pushFollow(FOLLOW_27);
            rule__Singleton__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Singleton__Group_1__4();

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
    // $ANTLR end "rule__Singleton__Group_1__3"


    // $ANTLR start "rule__Singleton__Group_1__3__Impl"
    // InternalBPMN_translator.g:2079:1: rule__Singleton__Group_1__3__Impl : ( ( rule__Singleton__KeywordsAssignment_1_3 ) ) ;
    public final void rule__Singleton__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2083:1: ( ( ( rule__Singleton__KeywordsAssignment_1_3 ) ) )
            // InternalBPMN_translator.g:2084:1: ( ( rule__Singleton__KeywordsAssignment_1_3 ) )
            {
            // InternalBPMN_translator.g:2084:1: ( ( rule__Singleton__KeywordsAssignment_1_3 ) )
            // InternalBPMN_translator.g:2085:2: ( rule__Singleton__KeywordsAssignment_1_3 )
            {
             before(grammarAccess.getSingletonAccess().getKeywordsAssignment_1_3()); 
            // InternalBPMN_translator.g:2086:2: ( rule__Singleton__KeywordsAssignment_1_3 )
            // InternalBPMN_translator.g:2086:3: rule__Singleton__KeywordsAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Singleton__KeywordsAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getSingletonAccess().getKeywordsAssignment_1_3()); 

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
    // $ANTLR end "rule__Singleton__Group_1__3__Impl"


    // $ANTLR start "rule__Singleton__Group_1__4"
    // InternalBPMN_translator.g:2094:1: rule__Singleton__Group_1__4 : rule__Singleton__Group_1__4__Impl ;
    public final void rule__Singleton__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2098:1: ( rule__Singleton__Group_1__4__Impl )
            // InternalBPMN_translator.g:2099:2: rule__Singleton__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Singleton__Group_1__4__Impl();

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
    // $ANTLR end "rule__Singleton__Group_1__4"


    // $ANTLR start "rule__Singleton__Group_1__4__Impl"
    // InternalBPMN_translator.g:2105:1: rule__Singleton__Group_1__4__Impl : ( ( rule__Singleton__Alternatives_1_4 )* ) ;
    public final void rule__Singleton__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2109:1: ( ( ( rule__Singleton__Alternatives_1_4 )* ) )
            // InternalBPMN_translator.g:2110:1: ( ( rule__Singleton__Alternatives_1_4 )* )
            {
            // InternalBPMN_translator.g:2110:1: ( ( rule__Singleton__Alternatives_1_4 )* )
            // InternalBPMN_translator.g:2111:2: ( rule__Singleton__Alternatives_1_4 )*
            {
             before(grammarAccess.getSingletonAccess().getAlternatives_1_4()); 
            // InternalBPMN_translator.g:2112:2: ( rule__Singleton__Alternatives_1_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_HEAD||LA23_0==RULE_KEYWORDS) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBPMN_translator.g:2112:3: rule__Singleton__Alternatives_1_4
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Singleton__Alternatives_1_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getSingletonAccess().getAlternatives_1_4()); 

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
    // $ANTLR end "rule__Singleton__Group_1__4__Impl"


    // $ANTLR start "rule__Singleton__Group_1_4_0__0"
    // InternalBPMN_translator.g:2121:1: rule__Singleton__Group_1_4_0__0 : rule__Singleton__Group_1_4_0__0__Impl rule__Singleton__Group_1_4_0__1 ;
    public final void rule__Singleton__Group_1_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2125:1: ( rule__Singleton__Group_1_4_0__0__Impl rule__Singleton__Group_1_4_0__1 )
            // InternalBPMN_translator.g:2126:2: rule__Singleton__Group_1_4_0__0__Impl rule__Singleton__Group_1_4_0__1
            {
            pushFollow(FOLLOW_20);
            rule__Singleton__Group_1_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Singleton__Group_1_4_0__1();

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
    // $ANTLR end "rule__Singleton__Group_1_4_0__0"


    // $ANTLR start "rule__Singleton__Group_1_4_0__0__Impl"
    // InternalBPMN_translator.g:2133:1: rule__Singleton__Group_1_4_0__0__Impl : ( RULE_HEAD ) ;
    public final void rule__Singleton__Group_1_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2137:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:2138:1: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:2138:1: ( RULE_HEAD )
            // InternalBPMN_translator.g:2139:2: RULE_HEAD
            {
             before(grammarAccess.getSingletonAccess().getHEADTerminalRuleCall_1_4_0_0()); 
            match(input,RULE_HEAD,FOLLOW_2); 
             after(grammarAccess.getSingletonAccess().getHEADTerminalRuleCall_1_4_0_0()); 

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
    // $ANTLR end "rule__Singleton__Group_1_4_0__0__Impl"


    // $ANTLR start "rule__Singleton__Group_1_4_0__1"
    // InternalBPMN_translator.g:2148:1: rule__Singleton__Group_1_4_0__1 : rule__Singleton__Group_1_4_0__1__Impl ;
    public final void rule__Singleton__Group_1_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2152:1: ( rule__Singleton__Group_1_4_0__1__Impl )
            // InternalBPMN_translator.g:2153:2: rule__Singleton__Group_1_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Singleton__Group_1_4_0__1__Impl();

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
    // $ANTLR end "rule__Singleton__Group_1_4_0__1"


    // $ANTLR start "rule__Singleton__Group_1_4_0__1__Impl"
    // InternalBPMN_translator.g:2159:1: rule__Singleton__Group_1_4_0__1__Impl : ( ':' ) ;
    public final void rule__Singleton__Group_1_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2163:1: ( ( ':' ) )
            // InternalBPMN_translator.g:2164:1: ( ':' )
            {
            // InternalBPMN_translator.g:2164:1: ( ':' )
            // InternalBPMN_translator.g:2165:2: ':'
            {
             before(grammarAccess.getSingletonAccess().getColonKeyword_1_4_0_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSingletonAccess().getColonKeyword_1_4_0_1()); 

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
    // $ANTLR end "rule__Singleton__Group_1_4_0__1__Impl"


    // $ANTLR start "rule__Singleton__Group_1_4_1__0"
    // InternalBPMN_translator.g:2175:1: rule__Singleton__Group_1_4_1__0 : rule__Singleton__Group_1_4_1__0__Impl rule__Singleton__Group_1_4_1__1 ;
    public final void rule__Singleton__Group_1_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2179:1: ( rule__Singleton__Group_1_4_1__0__Impl rule__Singleton__Group_1_4_1__1 )
            // InternalBPMN_translator.g:2180:2: rule__Singleton__Group_1_4_1__0__Impl rule__Singleton__Group_1_4_1__1
            {
            pushFollow(FOLLOW_24);
            rule__Singleton__Group_1_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Singleton__Group_1_4_1__1();

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
    // $ANTLR end "rule__Singleton__Group_1_4_1__0"


    // $ANTLR start "rule__Singleton__Group_1_4_1__0__Impl"
    // InternalBPMN_translator.g:2187:1: rule__Singleton__Group_1_4_1__0__Impl : ( ( rule__Singleton__Keywords1Assignment_1_4_1_0 ) ) ;
    public final void rule__Singleton__Group_1_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2191:1: ( ( ( rule__Singleton__Keywords1Assignment_1_4_1_0 ) ) )
            // InternalBPMN_translator.g:2192:1: ( ( rule__Singleton__Keywords1Assignment_1_4_1_0 ) )
            {
            // InternalBPMN_translator.g:2192:1: ( ( rule__Singleton__Keywords1Assignment_1_4_1_0 ) )
            // InternalBPMN_translator.g:2193:2: ( rule__Singleton__Keywords1Assignment_1_4_1_0 )
            {
             before(grammarAccess.getSingletonAccess().getKeywords1Assignment_1_4_1_0()); 
            // InternalBPMN_translator.g:2194:2: ( rule__Singleton__Keywords1Assignment_1_4_1_0 )
            // InternalBPMN_translator.g:2194:3: rule__Singleton__Keywords1Assignment_1_4_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Singleton__Keywords1Assignment_1_4_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSingletonAccess().getKeywords1Assignment_1_4_1_0()); 

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
    // $ANTLR end "rule__Singleton__Group_1_4_1__0__Impl"


    // $ANTLR start "rule__Singleton__Group_1_4_1__1"
    // InternalBPMN_translator.g:2202:1: rule__Singleton__Group_1_4_1__1 : rule__Singleton__Group_1_4_1__1__Impl rule__Singleton__Group_1_4_1__2 ;
    public final void rule__Singleton__Group_1_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2206:1: ( rule__Singleton__Group_1_4_1__1__Impl rule__Singleton__Group_1_4_1__2 )
            // InternalBPMN_translator.g:2207:2: rule__Singleton__Group_1_4_1__1__Impl rule__Singleton__Group_1_4_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Singleton__Group_1_4_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Singleton__Group_1_4_1__2();

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
    // $ANTLR end "rule__Singleton__Group_1_4_1__1"


    // $ANTLR start "rule__Singleton__Group_1_4_1__1__Impl"
    // InternalBPMN_translator.g:2214:1: rule__Singleton__Group_1_4_1__1__Impl : ( '=' ) ;
    public final void rule__Singleton__Group_1_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2218:1: ( ( '=' ) )
            // InternalBPMN_translator.g:2219:1: ( '=' )
            {
            // InternalBPMN_translator.g:2219:1: ( '=' )
            // InternalBPMN_translator.g:2220:2: '='
            {
             before(grammarAccess.getSingletonAccess().getEqualsSignKeyword_1_4_1_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSingletonAccess().getEqualsSignKeyword_1_4_1_1()); 

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
    // $ANTLR end "rule__Singleton__Group_1_4_1__1__Impl"


    // $ANTLR start "rule__Singleton__Group_1_4_1__2"
    // InternalBPMN_translator.g:2229:1: rule__Singleton__Group_1_4_1__2 : rule__Singleton__Group_1_4_1__2__Impl ;
    public final void rule__Singleton__Group_1_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2233:1: ( rule__Singleton__Group_1_4_1__2__Impl )
            // InternalBPMN_translator.g:2234:2: rule__Singleton__Group_1_4_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Singleton__Group_1_4_1__2__Impl();

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
    // $ANTLR end "rule__Singleton__Group_1_4_1__2"


    // $ANTLR start "rule__Singleton__Group_1_4_1__2__Impl"
    // InternalBPMN_translator.g:2240:1: rule__Singleton__Group_1_4_1__2__Impl : ( ( rule__Singleton__ValueAssignment_1_4_1_2 ) ) ;
    public final void rule__Singleton__Group_1_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2244:1: ( ( ( rule__Singleton__ValueAssignment_1_4_1_2 ) ) )
            // InternalBPMN_translator.g:2245:1: ( ( rule__Singleton__ValueAssignment_1_4_1_2 ) )
            {
            // InternalBPMN_translator.g:2245:1: ( ( rule__Singleton__ValueAssignment_1_4_1_2 ) )
            // InternalBPMN_translator.g:2246:2: ( rule__Singleton__ValueAssignment_1_4_1_2 )
            {
             before(grammarAccess.getSingletonAccess().getValueAssignment_1_4_1_2()); 
            // InternalBPMN_translator.g:2247:2: ( rule__Singleton__ValueAssignment_1_4_1_2 )
            // InternalBPMN_translator.g:2247:3: rule__Singleton__ValueAssignment_1_4_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Singleton__ValueAssignment_1_4_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSingletonAccess().getValueAssignment_1_4_1_2()); 

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
    // $ANTLR end "rule__Singleton__Group_1_4_1__2__Impl"


    // $ANTLR start "rule__Close__Group__0"
    // InternalBPMN_translator.g:2256:1: rule__Close__Group__0 : rule__Close__Group__0__Impl rule__Close__Group__1 ;
    public final void rule__Close__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2260:1: ( rule__Close__Group__0__Impl rule__Close__Group__1 )
            // InternalBPMN_translator.g:2261:2: rule__Close__Group__0__Impl rule__Close__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalBPMN_translator.g:2268:1: rule__Close__Group__0__Impl : ( () ) ;
    public final void rule__Close__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2272:1: ( ( () ) )
            // InternalBPMN_translator.g:2273:1: ( () )
            {
            // InternalBPMN_translator.g:2273:1: ( () )
            // InternalBPMN_translator.g:2274:2: ()
            {
             before(grammarAccess.getCloseAccess().getCloseAction_0()); 
            // InternalBPMN_translator.g:2275:2: ()
            // InternalBPMN_translator.g:2275:3: 
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
    // InternalBPMN_translator.g:2283:1: rule__Close__Group__1 : rule__Close__Group__1__Impl ;
    public final void rule__Close__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2287:1: ( rule__Close__Group__1__Impl )
            // InternalBPMN_translator.g:2288:2: rule__Close__Group__1__Impl
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
    // InternalBPMN_translator.g:2294:1: rule__Close__Group__1__Impl : ( ( rule__Close__Group_1__0 ) ) ;
    public final void rule__Close__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2298:1: ( ( ( rule__Close__Group_1__0 ) ) )
            // InternalBPMN_translator.g:2299:1: ( ( rule__Close__Group_1__0 ) )
            {
            // InternalBPMN_translator.g:2299:1: ( ( rule__Close__Group_1__0 ) )
            // InternalBPMN_translator.g:2300:2: ( rule__Close__Group_1__0 )
            {
             before(grammarAccess.getCloseAccess().getGroup_1()); 
            // InternalBPMN_translator.g:2301:2: ( rule__Close__Group_1__0 )
            // InternalBPMN_translator.g:2301:3: rule__Close__Group_1__0
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
    // InternalBPMN_translator.g:2310:1: rule__Close__Group_1__0 : rule__Close__Group_1__0__Impl rule__Close__Group_1__1 ;
    public final void rule__Close__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2314:1: ( rule__Close__Group_1__0__Impl rule__Close__Group_1__1 )
            // InternalBPMN_translator.g:2315:2: rule__Close__Group_1__0__Impl rule__Close__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalBPMN_translator.g:2322:1: rule__Close__Group_1__0__Impl : ( '</' ) ;
    public final void rule__Close__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2326:1: ( ( '</' ) )
            // InternalBPMN_translator.g:2327:1: ( '</' )
            {
            // InternalBPMN_translator.g:2327:1: ( '</' )
            // InternalBPMN_translator.g:2328:2: '</'
            {
             before(grammarAccess.getCloseAccess().getLessThanSignSolidusKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2337:1: rule__Close__Group_1__1 : rule__Close__Group_1__1__Impl rule__Close__Group_1__2 ;
    public final void rule__Close__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2341:1: ( rule__Close__Group_1__1__Impl rule__Close__Group_1__2 )
            // InternalBPMN_translator.g:2342:2: rule__Close__Group_1__1__Impl rule__Close__Group_1__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalBPMN_translator.g:2349:1: rule__Close__Group_1__1__Impl : ( RULE_HEAD ) ;
    public final void rule__Close__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2353:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:2354:1: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:2354:1: ( RULE_HEAD )
            // InternalBPMN_translator.g:2355:2: RULE_HEAD
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
    // InternalBPMN_translator.g:2364:1: rule__Close__Group_1__2 : rule__Close__Group_1__2__Impl rule__Close__Group_1__3 ;
    public final void rule__Close__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2368:1: ( rule__Close__Group_1__2__Impl rule__Close__Group_1__3 )
            // InternalBPMN_translator.g:2369:2: rule__Close__Group_1__2__Impl rule__Close__Group_1__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalBPMN_translator.g:2376:1: rule__Close__Group_1__2__Impl : ( ':' ) ;
    public final void rule__Close__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2380:1: ( ( ':' ) )
            // InternalBPMN_translator.g:2381:1: ( ':' )
            {
            // InternalBPMN_translator.g:2381:1: ( ':' )
            // InternalBPMN_translator.g:2382:2: ':'
            {
             before(grammarAccess.getCloseAccess().getColonKeyword_1_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2391:1: rule__Close__Group_1__3 : rule__Close__Group_1__3__Impl rule__Close__Group_1__4 ;
    public final void rule__Close__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2395:1: ( rule__Close__Group_1__3__Impl rule__Close__Group_1__4 )
            // InternalBPMN_translator.g:2396:2: rule__Close__Group_1__3__Impl rule__Close__Group_1__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalBPMN_translator.g:2403:1: rule__Close__Group_1__3__Impl : ( RULE_KEYWORDS ) ;
    public final void rule__Close__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2407:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:2408:1: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:2408:1: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:2409:2: RULE_KEYWORDS
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
    // InternalBPMN_translator.g:2418:1: rule__Close__Group_1__4 : rule__Close__Group_1__4__Impl ;
    public final void rule__Close__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2422:1: ( rule__Close__Group_1__4__Impl )
            // InternalBPMN_translator.g:2423:2: rule__Close__Group_1__4__Impl
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
    // InternalBPMN_translator.g:2429:1: rule__Close__Group_1__4__Impl : ( '>' ) ;
    public final void rule__Close__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2433:1: ( ( '>' ) )
            // InternalBPMN_translator.g:2434:1: ( '>' )
            {
            // InternalBPMN_translator.g:2434:1: ( '>' )
            // InternalBPMN_translator.g:2435:2: '>'
            {
             before(grammarAccess.getCloseAccess().getGreaterThanSignKeyword_1_4()); 
            match(input,35,FOLLOW_2); 
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


    // $ANTLR start "rule__Variables__Group_0__0"
    // InternalBPMN_translator.g:2445:1: rule__Variables__Group_0__0 : rule__Variables__Group_0__0__Impl rule__Variables__Group_0__1 ;
    public final void rule__Variables__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2449:1: ( rule__Variables__Group_0__0__Impl rule__Variables__Group_0__1 )
            // InternalBPMN_translator.g:2450:2: rule__Variables__Group_0__0__Impl rule__Variables__Group_0__1
            {
            pushFollow(FOLLOW_29);
            rule__Variables__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variables__Group_0__1();

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
    // $ANTLR end "rule__Variables__Group_0__0"


    // $ANTLR start "rule__Variables__Group_0__0__Impl"
    // InternalBPMN_translator.g:2457:1: rule__Variables__Group_0__0__Impl : ( 'TEMPERATURE' ) ;
    public final void rule__Variables__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2461:1: ( ( 'TEMPERATURE' ) )
            // InternalBPMN_translator.g:2462:1: ( 'TEMPERATURE' )
            {
            // InternalBPMN_translator.g:2462:1: ( 'TEMPERATURE' )
            // InternalBPMN_translator.g:2463:2: 'TEMPERATURE'
            {
             before(grammarAccess.getVariablesAccess().getTEMPERATUREKeyword_0_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getVariablesAccess().getTEMPERATUREKeyword_0_0()); 

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
    // $ANTLR end "rule__Variables__Group_0__0__Impl"


    // $ANTLR start "rule__Variables__Group_0__1"
    // InternalBPMN_translator.g:2472:1: rule__Variables__Group_0__1 : rule__Variables__Group_0__1__Impl rule__Variables__Group_0__2 ;
    public final void rule__Variables__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2476:1: ( rule__Variables__Group_0__1__Impl rule__Variables__Group_0__2 )
            // InternalBPMN_translator.g:2477:2: rule__Variables__Group_0__1__Impl rule__Variables__Group_0__2
            {
            pushFollow(FOLLOW_30);
            rule__Variables__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variables__Group_0__2();

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
    // $ANTLR end "rule__Variables__Group_0__1"


    // $ANTLR start "rule__Variables__Group_0__1__Impl"
    // InternalBPMN_translator.g:2484:1: rule__Variables__Group_0__1__Impl : ( '[' ) ;
    public final void rule__Variables__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2488:1: ( ( '[' ) )
            // InternalBPMN_translator.g:2489:1: ( '[' )
            {
            // InternalBPMN_translator.g:2489:1: ( '[' )
            // InternalBPMN_translator.g:2490:2: '['
            {
             before(grammarAccess.getVariablesAccess().getLeftSquareBracketKeyword_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVariablesAccess().getLeftSquareBracketKeyword_0_1()); 

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
    // $ANTLR end "rule__Variables__Group_0__1__Impl"


    // $ANTLR start "rule__Variables__Group_0__2"
    // InternalBPMN_translator.g:2499:1: rule__Variables__Group_0__2 : rule__Variables__Group_0__2__Impl rule__Variables__Group_0__3 ;
    public final void rule__Variables__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2503:1: ( rule__Variables__Group_0__2__Impl rule__Variables__Group_0__3 )
            // InternalBPMN_translator.g:2504:2: rule__Variables__Group_0__2__Impl rule__Variables__Group_0__3
            {
            pushFollow(FOLLOW_31);
            rule__Variables__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variables__Group_0__3();

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
    // $ANTLR end "rule__Variables__Group_0__2"


    // $ANTLR start "rule__Variables__Group_0__2__Impl"
    // InternalBPMN_translator.g:2511:1: rule__Variables__Group_0__2__Impl : ( RULE_BODY ) ;
    public final void rule__Variables__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2515:1: ( ( RULE_BODY ) )
            // InternalBPMN_translator.g:2516:1: ( RULE_BODY )
            {
            // InternalBPMN_translator.g:2516:1: ( RULE_BODY )
            // InternalBPMN_translator.g:2517:2: RULE_BODY
            {
             before(grammarAccess.getVariablesAccess().getBODYTerminalRuleCall_0_2()); 
            match(input,RULE_BODY,FOLLOW_2); 
             after(grammarAccess.getVariablesAccess().getBODYTerminalRuleCall_0_2()); 

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
    // $ANTLR end "rule__Variables__Group_0__2__Impl"


    // $ANTLR start "rule__Variables__Group_0__3"
    // InternalBPMN_translator.g:2526:1: rule__Variables__Group_0__3 : rule__Variables__Group_0__3__Impl rule__Variables__Group_0__4 ;
    public final void rule__Variables__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2530:1: ( rule__Variables__Group_0__3__Impl rule__Variables__Group_0__4 )
            // InternalBPMN_translator.g:2531:2: rule__Variables__Group_0__3__Impl rule__Variables__Group_0__4
            {
            pushFollow(FOLLOW_30);
            rule__Variables__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variables__Group_0__4();

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
    // $ANTLR end "rule__Variables__Group_0__3"


    // $ANTLR start "rule__Variables__Group_0__3__Impl"
    // InternalBPMN_translator.g:2538:1: rule__Variables__Group_0__3__Impl : ( ',' ) ;
    public final void rule__Variables__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2542:1: ( ( ',' ) )
            // InternalBPMN_translator.g:2543:1: ( ',' )
            {
            // InternalBPMN_translator.g:2543:1: ( ',' )
            // InternalBPMN_translator.g:2544:2: ','
            {
             before(grammarAccess.getVariablesAccess().getCommaKeyword_0_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getVariablesAccess().getCommaKeyword_0_3()); 

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
    // $ANTLR end "rule__Variables__Group_0__3__Impl"


    // $ANTLR start "rule__Variables__Group_0__4"
    // InternalBPMN_translator.g:2553:1: rule__Variables__Group_0__4 : rule__Variables__Group_0__4__Impl rule__Variables__Group_0__5 ;
    public final void rule__Variables__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2557:1: ( rule__Variables__Group_0__4__Impl rule__Variables__Group_0__5 )
            // InternalBPMN_translator.g:2558:2: rule__Variables__Group_0__4__Impl rule__Variables__Group_0__5
            {
            pushFollow(FOLLOW_32);
            rule__Variables__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variables__Group_0__5();

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
    // $ANTLR end "rule__Variables__Group_0__4"


    // $ANTLR start "rule__Variables__Group_0__4__Impl"
    // InternalBPMN_translator.g:2565:1: rule__Variables__Group_0__4__Impl : ( RULE_BODY ) ;
    public final void rule__Variables__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2569:1: ( ( RULE_BODY ) )
            // InternalBPMN_translator.g:2570:1: ( RULE_BODY )
            {
            // InternalBPMN_translator.g:2570:1: ( RULE_BODY )
            // InternalBPMN_translator.g:2571:2: RULE_BODY
            {
             before(grammarAccess.getVariablesAccess().getBODYTerminalRuleCall_0_4()); 
            match(input,RULE_BODY,FOLLOW_2); 
             after(grammarAccess.getVariablesAccess().getBODYTerminalRuleCall_0_4()); 

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
    // $ANTLR end "rule__Variables__Group_0__4__Impl"


    // $ANTLR start "rule__Variables__Group_0__5"
    // InternalBPMN_translator.g:2580:1: rule__Variables__Group_0__5 : rule__Variables__Group_0__5__Impl ;
    public final void rule__Variables__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2584:1: ( rule__Variables__Group_0__5__Impl )
            // InternalBPMN_translator.g:2585:2: rule__Variables__Group_0__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variables__Group_0__5__Impl();

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
    // $ANTLR end "rule__Variables__Group_0__5"


    // $ANTLR start "rule__Variables__Group_0__5__Impl"
    // InternalBPMN_translator.g:2591:1: rule__Variables__Group_0__5__Impl : ( ']' ) ;
    public final void rule__Variables__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2595:1: ( ( ']' ) )
            // InternalBPMN_translator.g:2596:1: ( ']' )
            {
            // InternalBPMN_translator.g:2596:1: ( ']' )
            // InternalBPMN_translator.g:2597:2: ']'
            {
             before(grammarAccess.getVariablesAccess().getRightSquareBracketKeyword_0_5()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getVariablesAccess().getRightSquareBracketKeyword_0_5()); 

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
    // $ANTLR end "rule__Variables__Group_0__5__Impl"


    // $ANTLR start "rule__Variables__Group_1__0"
    // InternalBPMN_translator.g:2607:1: rule__Variables__Group_1__0 : rule__Variables__Group_1__0__Impl rule__Variables__Group_1__1 ;
    public final void rule__Variables__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2611:1: ( rule__Variables__Group_1__0__Impl rule__Variables__Group_1__1 )
            // InternalBPMN_translator.g:2612:2: rule__Variables__Group_1__0__Impl rule__Variables__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__Variables__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variables__Group_1__1();

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
    // $ANTLR end "rule__Variables__Group_1__0"


    // $ANTLR start "rule__Variables__Group_1__0__Impl"
    // InternalBPMN_translator.g:2619:1: rule__Variables__Group_1__0__Impl : ( RULE_BODY ) ;
    public final void rule__Variables__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2623:1: ( ( RULE_BODY ) )
            // InternalBPMN_translator.g:2624:1: ( RULE_BODY )
            {
            // InternalBPMN_translator.g:2624:1: ( RULE_BODY )
            // InternalBPMN_translator.g:2625:2: RULE_BODY
            {
             before(grammarAccess.getVariablesAccess().getBODYTerminalRuleCall_1_0()); 
            match(input,RULE_BODY,FOLLOW_2); 
             after(grammarAccess.getVariablesAccess().getBODYTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Variables__Group_1__0__Impl"


    // $ANTLR start "rule__Variables__Group_1__1"
    // InternalBPMN_translator.g:2634:1: rule__Variables__Group_1__1 : rule__Variables__Group_1__1__Impl rule__Variables__Group_1__2 ;
    public final void rule__Variables__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2638:1: ( rule__Variables__Group_1__1__Impl rule__Variables__Group_1__2 )
            // InternalBPMN_translator.g:2639:2: rule__Variables__Group_1__1__Impl rule__Variables__Group_1__2
            {
            pushFollow(FOLLOW_30);
            rule__Variables__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variables__Group_1__2();

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
    // $ANTLR end "rule__Variables__Group_1__1"


    // $ANTLR start "rule__Variables__Group_1__1__Impl"
    // InternalBPMN_translator.g:2646:1: rule__Variables__Group_1__1__Impl : ( '[' ) ;
    public final void rule__Variables__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2650:1: ( ( '[' ) )
            // InternalBPMN_translator.g:2651:1: ( '[' )
            {
            // InternalBPMN_translator.g:2651:1: ( '[' )
            // InternalBPMN_translator.g:2652:2: '['
            {
             before(grammarAccess.getVariablesAccess().getLeftSquareBracketKeyword_1_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVariablesAccess().getLeftSquareBracketKeyword_1_1()); 

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
    // $ANTLR end "rule__Variables__Group_1__1__Impl"


    // $ANTLR start "rule__Variables__Group_1__2"
    // InternalBPMN_translator.g:2661:1: rule__Variables__Group_1__2 : rule__Variables__Group_1__2__Impl rule__Variables__Group_1__3 ;
    public final void rule__Variables__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2665:1: ( rule__Variables__Group_1__2__Impl rule__Variables__Group_1__3 )
            // InternalBPMN_translator.g:2666:2: rule__Variables__Group_1__2__Impl rule__Variables__Group_1__3
            {
            pushFollow(FOLLOW_32);
            rule__Variables__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variables__Group_1__3();

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
    // $ANTLR end "rule__Variables__Group_1__2"


    // $ANTLR start "rule__Variables__Group_1__2__Impl"
    // InternalBPMN_translator.g:2673:1: rule__Variables__Group_1__2__Impl : ( RULE_BODY ) ;
    public final void rule__Variables__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2677:1: ( ( RULE_BODY ) )
            // InternalBPMN_translator.g:2678:1: ( RULE_BODY )
            {
            // InternalBPMN_translator.g:2678:1: ( RULE_BODY )
            // InternalBPMN_translator.g:2679:2: RULE_BODY
            {
             before(grammarAccess.getVariablesAccess().getBODYTerminalRuleCall_1_2()); 
            match(input,RULE_BODY,FOLLOW_2); 
             after(grammarAccess.getVariablesAccess().getBODYTerminalRuleCall_1_2()); 

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
    // $ANTLR end "rule__Variables__Group_1__2__Impl"


    // $ANTLR start "rule__Variables__Group_1__3"
    // InternalBPMN_translator.g:2688:1: rule__Variables__Group_1__3 : rule__Variables__Group_1__3__Impl ;
    public final void rule__Variables__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2692:1: ( rule__Variables__Group_1__3__Impl )
            // InternalBPMN_translator.g:2693:2: rule__Variables__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variables__Group_1__3__Impl();

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
    // $ANTLR end "rule__Variables__Group_1__3"


    // $ANTLR start "rule__Variables__Group_1__3__Impl"
    // InternalBPMN_translator.g:2699:1: rule__Variables__Group_1__3__Impl : ( ']' ) ;
    public final void rule__Variables__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2703:1: ( ( ']' ) )
            // InternalBPMN_translator.g:2704:1: ( ']' )
            {
            // InternalBPMN_translator.g:2704:1: ( ']' )
            // InternalBPMN_translator.g:2705:2: ']'
            {
             before(grammarAccess.getVariablesAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getVariablesAccess().getRightSquareBracketKeyword_1_3()); 

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
    // $ANTLR end "rule__Variables__Group_1__3__Impl"


    // $ANTLR start "rule__Codex__Group__0"
    // InternalBPMN_translator.g:2715:1: rule__Codex__Group__0 : rule__Codex__Group__0__Impl rule__Codex__Group__1 ;
    public final void rule__Codex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2719:1: ( rule__Codex__Group__0__Impl rule__Codex__Group__1 )
            // InternalBPMN_translator.g:2720:2: rule__Codex__Group__0__Impl rule__Codex__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Codex__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Codex__Group__1();

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
    // $ANTLR end "rule__Codex__Group__0"


    // $ANTLR start "rule__Codex__Group__0__Impl"
    // InternalBPMN_translator.g:2727:1: rule__Codex__Group__0__Impl : ( ( rule__Codex__Device_codeAssignment_0 ) ) ;
    public final void rule__Codex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2731:1: ( ( ( rule__Codex__Device_codeAssignment_0 ) ) )
            // InternalBPMN_translator.g:2732:1: ( ( rule__Codex__Device_codeAssignment_0 ) )
            {
            // InternalBPMN_translator.g:2732:1: ( ( rule__Codex__Device_codeAssignment_0 ) )
            // InternalBPMN_translator.g:2733:2: ( rule__Codex__Device_codeAssignment_0 )
            {
             before(grammarAccess.getCodexAccess().getDevice_codeAssignment_0()); 
            // InternalBPMN_translator.g:2734:2: ( rule__Codex__Device_codeAssignment_0 )
            // InternalBPMN_translator.g:2734:3: rule__Codex__Device_codeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Codex__Device_codeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCodexAccess().getDevice_codeAssignment_0()); 

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
    // $ANTLR end "rule__Codex__Group__0__Impl"


    // $ANTLR start "rule__Codex__Group__1"
    // InternalBPMN_translator.g:2742:1: rule__Codex__Group__1 : rule__Codex__Group__1__Impl rule__Codex__Group__2 ;
    public final void rule__Codex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2746:1: ( rule__Codex__Group__1__Impl rule__Codex__Group__2 )
            // InternalBPMN_translator.g:2747:2: rule__Codex__Group__1__Impl rule__Codex__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__Codex__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Codex__Group__2();

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
    // $ANTLR end "rule__Codex__Group__1"


    // $ANTLR start "rule__Codex__Group__1__Impl"
    // InternalBPMN_translator.g:2754:1: rule__Codex__Group__1__Impl : ( ( rule__Codex__ProtocolAssignment_1 )* ) ;
    public final void rule__Codex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2758:1: ( ( ( rule__Codex__ProtocolAssignment_1 )* ) )
            // InternalBPMN_translator.g:2759:1: ( ( rule__Codex__ProtocolAssignment_1 )* )
            {
            // InternalBPMN_translator.g:2759:1: ( ( rule__Codex__ProtocolAssignment_1 )* )
            // InternalBPMN_translator.g:2760:2: ( rule__Codex__ProtocolAssignment_1 )*
            {
             before(grammarAccess.getCodexAccess().getProtocolAssignment_1()); 
            // InternalBPMN_translator.g:2761:2: ( rule__Codex__ProtocolAssignment_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=62 && LA24_0<=63)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBPMN_translator.g:2761:3: rule__Codex__ProtocolAssignment_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Codex__ProtocolAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getCodexAccess().getProtocolAssignment_1()); 

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
    // $ANTLR end "rule__Codex__Group__1__Impl"


    // $ANTLR start "rule__Codex__Group__2"
    // InternalBPMN_translator.g:2769:1: rule__Codex__Group__2 : rule__Codex__Group__2__Impl ;
    public final void rule__Codex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2773:1: ( rule__Codex__Group__2__Impl )
            // InternalBPMN_translator.g:2774:2: rule__Codex__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Codex__Group__2__Impl();

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
    // $ANTLR end "rule__Codex__Group__2"


    // $ANTLR start "rule__Codex__Group__2__Impl"
    // InternalBPMN_translator.g:2780:1: rule__Codex__Group__2__Impl : ( ( rule__Codex__Sensor_codeAssignment_2 )* ) ;
    public final void rule__Codex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2784:1: ( ( ( rule__Codex__Sensor_codeAssignment_2 )* ) )
            // InternalBPMN_translator.g:2785:1: ( ( rule__Codex__Sensor_codeAssignment_2 )* )
            {
            // InternalBPMN_translator.g:2785:1: ( ( rule__Codex__Sensor_codeAssignment_2 )* )
            // InternalBPMN_translator.g:2786:2: ( rule__Codex__Sensor_codeAssignment_2 )*
            {
             before(grammarAccess.getCodexAccess().getSensor_codeAssignment_2()); 
            // InternalBPMN_translator.g:2787:2: ( rule__Codex__Sensor_codeAssignment_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==38||LA25_0==64) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBPMN_translator.g:2787:3: rule__Codex__Sensor_codeAssignment_2
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Codex__Sensor_codeAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getCodexAccess().getSensor_codeAssignment_2()); 

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
    // $ANTLR end "rule__Codex__Group__2__Impl"


    // $ANTLR start "rule__Device__Group__0"
    // InternalBPMN_translator.g:2796:1: rule__Device__Group__0 : rule__Device__Group__0__Impl rule__Device__Group__1 ;
    public final void rule__Device__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2800:1: ( rule__Device__Group__0__Impl rule__Device__Group__1 )
            // InternalBPMN_translator.g:2801:2: rule__Device__Group__0__Impl rule__Device__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Device__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__1();

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
    // $ANTLR end "rule__Device__Group__0"


    // $ANTLR start "rule__Device__Group__0__Impl"
    // InternalBPMN_translator.g:2808:1: rule__Device__Group__0__Impl : ( 'DEVICE' ) ;
    public final void rule__Device__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2812:1: ( ( 'DEVICE' ) )
            // InternalBPMN_translator.g:2813:1: ( 'DEVICE' )
            {
            // InternalBPMN_translator.g:2813:1: ( 'DEVICE' )
            // InternalBPMN_translator.g:2814:2: 'DEVICE'
            {
             before(grammarAccess.getDeviceAccess().getDEVICEKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getDEVICEKeyword_0()); 

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
    // $ANTLR end "rule__Device__Group__0__Impl"


    // $ANTLR start "rule__Device__Group__1"
    // InternalBPMN_translator.g:2823:1: rule__Device__Group__1 : rule__Device__Group__1__Impl rule__Device__Group__2 ;
    public final void rule__Device__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2827:1: ( rule__Device__Group__1__Impl rule__Device__Group__2 )
            // InternalBPMN_translator.g:2828:2: rule__Device__Group__1__Impl rule__Device__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Device__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__2();

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
    // $ANTLR end "rule__Device__Group__1"


    // $ANTLR start "rule__Device__Group__1__Impl"
    // InternalBPMN_translator.g:2835:1: rule__Device__Group__1__Impl : ( ':' ) ;
    public final void rule__Device__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2839:1: ( ( ':' ) )
            // InternalBPMN_translator.g:2840:1: ( ':' )
            {
            // InternalBPMN_translator.g:2840:1: ( ':' )
            // InternalBPMN_translator.g:2841:2: ':'
            {
             before(grammarAccess.getDeviceAccess().getColonKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Device__Group__1__Impl"


    // $ANTLR start "rule__Device__Group__2"
    // InternalBPMN_translator.g:2850:1: rule__Device__Group__2 : rule__Device__Group__2__Impl rule__Device__Group__3 ;
    public final void rule__Device__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2854:1: ( rule__Device__Group__2__Impl rule__Device__Group__3 )
            // InternalBPMN_translator.g:2855:2: rule__Device__Group__2__Impl rule__Device__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__Device__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__3();

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
    // $ANTLR end "rule__Device__Group__2"


    // $ANTLR start "rule__Device__Group__2__Impl"
    // InternalBPMN_translator.g:2862:1: rule__Device__Group__2__Impl : ( ( rule__Device__DeviceAssignment_2 ) ) ;
    public final void rule__Device__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2866:1: ( ( ( rule__Device__DeviceAssignment_2 ) ) )
            // InternalBPMN_translator.g:2867:1: ( ( rule__Device__DeviceAssignment_2 ) )
            {
            // InternalBPMN_translator.g:2867:1: ( ( rule__Device__DeviceAssignment_2 ) )
            // InternalBPMN_translator.g:2868:2: ( rule__Device__DeviceAssignment_2 )
            {
             before(grammarAccess.getDeviceAccess().getDeviceAssignment_2()); 
            // InternalBPMN_translator.g:2869:2: ( rule__Device__DeviceAssignment_2 )
            // InternalBPMN_translator.g:2869:3: rule__Device__DeviceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Device__DeviceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getDeviceAssignment_2()); 

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
    // $ANTLR end "rule__Device__Group__2__Impl"


    // $ANTLR start "rule__Device__Group__3"
    // InternalBPMN_translator.g:2877:1: rule__Device__Group__3 : rule__Device__Group__3__Impl rule__Device__Group__4 ;
    public final void rule__Device__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2881:1: ( rule__Device__Group__3__Impl rule__Device__Group__4 )
            // InternalBPMN_translator.g:2882:2: rule__Device__Group__3__Impl rule__Device__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Device__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__4();

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
    // $ANTLR end "rule__Device__Group__3"


    // $ANTLR start "rule__Device__Group__3__Impl"
    // InternalBPMN_translator.g:2889:1: rule__Device__Group__3__Impl : ( 'NAMEID' ) ;
    public final void rule__Device__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2893:1: ( ( 'NAMEID' ) )
            // InternalBPMN_translator.g:2894:1: ( 'NAMEID' )
            {
            // InternalBPMN_translator.g:2894:1: ( 'NAMEID' )
            // InternalBPMN_translator.g:2895:2: 'NAMEID'
            {
             before(grammarAccess.getDeviceAccess().getNAMEIDKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getNAMEIDKeyword_3()); 

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
    // $ANTLR end "rule__Device__Group__3__Impl"


    // $ANTLR start "rule__Device__Group__4"
    // InternalBPMN_translator.g:2904:1: rule__Device__Group__4 : rule__Device__Group__4__Impl rule__Device__Group__5 ;
    public final void rule__Device__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2908:1: ( rule__Device__Group__4__Impl rule__Device__Group__5 )
            // InternalBPMN_translator.g:2909:2: rule__Device__Group__4__Impl rule__Device__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Device__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__5();

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
    // $ANTLR end "rule__Device__Group__4"


    // $ANTLR start "rule__Device__Group__4__Impl"
    // InternalBPMN_translator.g:2916:1: rule__Device__Group__4__Impl : ( ':' ) ;
    public final void rule__Device__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2920:1: ( ( ':' ) )
            // InternalBPMN_translator.g:2921:1: ( ':' )
            {
            // InternalBPMN_translator.g:2921:1: ( ':' )
            // InternalBPMN_translator.g:2922:2: ':'
            {
             before(grammarAccess.getDeviceAccess().getColonKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__Device__Group__4__Impl"


    // $ANTLR start "rule__Device__Group__5"
    // InternalBPMN_translator.g:2931:1: rule__Device__Group__5 : rule__Device__Group__5__Impl ;
    public final void rule__Device__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2935:1: ( rule__Device__Group__5__Impl )
            // InternalBPMN_translator.g:2936:2: rule__Device__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group__5__Impl();

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
    // $ANTLR end "rule__Device__Group__5"


    // $ANTLR start "rule__Device__Group__5__Impl"
    // InternalBPMN_translator.g:2942:1: rule__Device__Group__5__Impl : ( ( rule__Device__IdAssignment_5 ) ) ;
    public final void rule__Device__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2946:1: ( ( ( rule__Device__IdAssignment_5 ) ) )
            // InternalBPMN_translator.g:2947:1: ( ( rule__Device__IdAssignment_5 ) )
            {
            // InternalBPMN_translator.g:2947:1: ( ( rule__Device__IdAssignment_5 ) )
            // InternalBPMN_translator.g:2948:2: ( rule__Device__IdAssignment_5 )
            {
             before(grammarAccess.getDeviceAccess().getIdAssignment_5()); 
            // InternalBPMN_translator.g:2949:2: ( rule__Device__IdAssignment_5 )
            // InternalBPMN_translator.g:2949:3: rule__Device__IdAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Device__IdAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getIdAssignment_5()); 

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
    // $ANTLR end "rule__Device__Group__5__Impl"


    // $ANTLR start "rule__Protocol__Group_0__0"
    // InternalBPMN_translator.g:2958:1: rule__Protocol__Group_0__0 : rule__Protocol__Group_0__0__Impl rule__Protocol__Group_0__1 ;
    public final void rule__Protocol__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2962:1: ( rule__Protocol__Group_0__0__Impl rule__Protocol__Group_0__1 )
            // InternalBPMN_translator.g:2963:2: rule__Protocol__Group_0__0__Impl rule__Protocol__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Protocol__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group_0__1();

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
    // $ANTLR end "rule__Protocol__Group_0__0"


    // $ANTLR start "rule__Protocol__Group_0__0__Impl"
    // InternalBPMN_translator.g:2970:1: rule__Protocol__Group_0__0__Impl : ( ( rule__Protocol__PnameAssignment_0_0 ) ) ;
    public final void rule__Protocol__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2974:1: ( ( ( rule__Protocol__PnameAssignment_0_0 ) ) )
            // InternalBPMN_translator.g:2975:1: ( ( rule__Protocol__PnameAssignment_0_0 ) )
            {
            // InternalBPMN_translator.g:2975:1: ( ( rule__Protocol__PnameAssignment_0_0 ) )
            // InternalBPMN_translator.g:2976:2: ( rule__Protocol__PnameAssignment_0_0 )
            {
             before(grammarAccess.getProtocolAccess().getPnameAssignment_0_0()); 
            // InternalBPMN_translator.g:2977:2: ( rule__Protocol__PnameAssignment_0_0 )
            // InternalBPMN_translator.g:2977:3: rule__Protocol__PnameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__PnameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getPnameAssignment_0_0()); 

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
    // $ANTLR end "rule__Protocol__Group_0__0__Impl"


    // $ANTLR start "rule__Protocol__Group_0__1"
    // InternalBPMN_translator.g:2985:1: rule__Protocol__Group_0__1 : rule__Protocol__Group_0__1__Impl rule__Protocol__Group_0__2 ;
    public final void rule__Protocol__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2989:1: ( rule__Protocol__Group_0__1__Impl rule__Protocol__Group_0__2 )
            // InternalBPMN_translator.g:2990:2: rule__Protocol__Group_0__1__Impl rule__Protocol__Group_0__2
            {
            pushFollow(FOLLOW_37);
            rule__Protocol__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group_0__2();

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
    // $ANTLR end "rule__Protocol__Group_0__1"


    // $ANTLR start "rule__Protocol__Group_0__1__Impl"
    // InternalBPMN_translator.g:2997:1: rule__Protocol__Group_0__1__Impl : ( '{' ) ;
    public final void rule__Protocol__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3001:1: ( ( '{' ) )
            // InternalBPMN_translator.g:3002:1: ( '{' )
            {
            // InternalBPMN_translator.g:3002:1: ( '{' )
            // InternalBPMN_translator.g:3003:2: '{'
            {
             before(grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_0_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_0_1()); 

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
    // $ANTLR end "rule__Protocol__Group_0__1__Impl"


    // $ANTLR start "rule__Protocol__Group_0__2"
    // InternalBPMN_translator.g:3012:1: rule__Protocol__Group_0__2 : rule__Protocol__Group_0__2__Impl rule__Protocol__Group_0__3 ;
    public final void rule__Protocol__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3016:1: ( rule__Protocol__Group_0__2__Impl rule__Protocol__Group_0__3 )
            // InternalBPMN_translator.g:3017:2: rule__Protocol__Group_0__2__Impl rule__Protocol__Group_0__3
            {
            pushFollow(FOLLOW_15);
            rule__Protocol__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group_0__3();

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
    // $ANTLR end "rule__Protocol__Group_0__2"


    // $ANTLR start "rule__Protocol__Group_0__2__Impl"
    // InternalBPMN_translator.g:3024:1: rule__Protocol__Group_0__2__Impl : ( ( rule__Protocol__Group_0_2__0 ) ) ;
    public final void rule__Protocol__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3028:1: ( ( ( rule__Protocol__Group_0_2__0 ) ) )
            // InternalBPMN_translator.g:3029:1: ( ( rule__Protocol__Group_0_2__0 ) )
            {
            // InternalBPMN_translator.g:3029:1: ( ( rule__Protocol__Group_0_2__0 ) )
            // InternalBPMN_translator.g:3030:2: ( rule__Protocol__Group_0_2__0 )
            {
             before(grammarAccess.getProtocolAccess().getGroup_0_2()); 
            // InternalBPMN_translator.g:3031:2: ( rule__Protocol__Group_0_2__0 )
            // InternalBPMN_translator.g:3031:3: rule__Protocol__Group_0_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Group_0_2__0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getGroup_0_2()); 

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
    // $ANTLR end "rule__Protocol__Group_0__2__Impl"


    // $ANTLR start "rule__Protocol__Group_0__3"
    // InternalBPMN_translator.g:3039:1: rule__Protocol__Group_0__3 : rule__Protocol__Group_0__3__Impl ;
    public final void rule__Protocol__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3043:1: ( rule__Protocol__Group_0__3__Impl )
            // InternalBPMN_translator.g:3044:2: rule__Protocol__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Group_0__3__Impl();

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
    // $ANTLR end "rule__Protocol__Group_0__3"


    // $ANTLR start "rule__Protocol__Group_0__3__Impl"
    // InternalBPMN_translator.g:3050:1: rule__Protocol__Group_0__3__Impl : ( '}' ) ;
    public final void rule__Protocol__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3054:1: ( ( '}' ) )
            // InternalBPMN_translator.g:3055:1: ( '}' )
            {
            // InternalBPMN_translator.g:3055:1: ( '}' )
            // InternalBPMN_translator.g:3056:2: '}'
            {
             before(grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_0_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_0_3()); 

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
    // $ANTLR end "rule__Protocol__Group_0__3__Impl"


    // $ANTLR start "rule__Protocol__Group_0_2__0"
    // InternalBPMN_translator.g:3066:1: rule__Protocol__Group_0_2__0 : rule__Protocol__Group_0_2__0__Impl rule__Protocol__Group_0_2__1 ;
    public final void rule__Protocol__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3070:1: ( rule__Protocol__Group_0_2__0__Impl rule__Protocol__Group_0_2__1 )
            // InternalBPMN_translator.g:3071:2: rule__Protocol__Group_0_2__0__Impl rule__Protocol__Group_0_2__1
            {
            pushFollow(FOLLOW_38);
            rule__Protocol__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group_0_2__1();

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
    // $ANTLR end "rule__Protocol__Group_0_2__0"


    // $ANTLR start "rule__Protocol__Group_0_2__0__Impl"
    // InternalBPMN_translator.g:3078:1: rule__Protocol__Group_0_2__0__Impl : ( ( rule__Protocol__Mqtt_dataAssignment_0_2_0 ) ) ;
    public final void rule__Protocol__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3082:1: ( ( ( rule__Protocol__Mqtt_dataAssignment_0_2_0 ) ) )
            // InternalBPMN_translator.g:3083:1: ( ( rule__Protocol__Mqtt_dataAssignment_0_2_0 ) )
            {
            // InternalBPMN_translator.g:3083:1: ( ( rule__Protocol__Mqtt_dataAssignment_0_2_0 ) )
            // InternalBPMN_translator.g:3084:2: ( rule__Protocol__Mqtt_dataAssignment_0_2_0 )
            {
             before(grammarAccess.getProtocolAccess().getMqtt_dataAssignment_0_2_0()); 
            // InternalBPMN_translator.g:3085:2: ( rule__Protocol__Mqtt_dataAssignment_0_2_0 )
            // InternalBPMN_translator.g:3085:3: rule__Protocol__Mqtt_dataAssignment_0_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Mqtt_dataAssignment_0_2_0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getMqtt_dataAssignment_0_2_0()); 

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
    // $ANTLR end "rule__Protocol__Group_0_2__0__Impl"


    // $ANTLR start "rule__Protocol__Group_0_2__1"
    // InternalBPMN_translator.g:3093:1: rule__Protocol__Group_0_2__1 : rule__Protocol__Group_0_2__1__Impl ;
    public final void rule__Protocol__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3097:1: ( rule__Protocol__Group_0_2__1__Impl )
            // InternalBPMN_translator.g:3098:2: rule__Protocol__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Group_0_2__1__Impl();

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
    // $ANTLR end "rule__Protocol__Group_0_2__1"


    // $ANTLR start "rule__Protocol__Group_0_2__1__Impl"
    // InternalBPMN_translator.g:3104:1: rule__Protocol__Group_0_2__1__Impl : ( ( rule__Protocol__Mqtt_deviceAssignment_0_2_1 ) ) ;
    public final void rule__Protocol__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3108:1: ( ( ( rule__Protocol__Mqtt_deviceAssignment_0_2_1 ) ) )
            // InternalBPMN_translator.g:3109:1: ( ( rule__Protocol__Mqtt_deviceAssignment_0_2_1 ) )
            {
            // InternalBPMN_translator.g:3109:1: ( ( rule__Protocol__Mqtt_deviceAssignment_0_2_1 ) )
            // InternalBPMN_translator.g:3110:2: ( rule__Protocol__Mqtt_deviceAssignment_0_2_1 )
            {
             before(grammarAccess.getProtocolAccess().getMqtt_deviceAssignment_0_2_1()); 
            // InternalBPMN_translator.g:3111:2: ( rule__Protocol__Mqtt_deviceAssignment_0_2_1 )
            // InternalBPMN_translator.g:3111:3: rule__Protocol__Mqtt_deviceAssignment_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Mqtt_deviceAssignment_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getMqtt_deviceAssignment_0_2_1()); 

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
    // $ANTLR end "rule__Protocol__Group_0_2__1__Impl"


    // $ANTLR start "rule__Protocol__Group_1__0"
    // InternalBPMN_translator.g:3120:1: rule__Protocol__Group_1__0 : rule__Protocol__Group_1__0__Impl rule__Protocol__Group_1__1 ;
    public final void rule__Protocol__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3124:1: ( rule__Protocol__Group_1__0__Impl rule__Protocol__Group_1__1 )
            // InternalBPMN_translator.g:3125:2: rule__Protocol__Group_1__0__Impl rule__Protocol__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Protocol__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group_1__1();

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
    // $ANTLR end "rule__Protocol__Group_1__0"


    // $ANTLR start "rule__Protocol__Group_1__0__Impl"
    // InternalBPMN_translator.g:3132:1: rule__Protocol__Group_1__0__Impl : ( ( rule__Protocol__PnameAssignment_1_0 ) ) ;
    public final void rule__Protocol__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3136:1: ( ( ( rule__Protocol__PnameAssignment_1_0 ) ) )
            // InternalBPMN_translator.g:3137:1: ( ( rule__Protocol__PnameAssignment_1_0 ) )
            {
            // InternalBPMN_translator.g:3137:1: ( ( rule__Protocol__PnameAssignment_1_0 ) )
            // InternalBPMN_translator.g:3138:2: ( rule__Protocol__PnameAssignment_1_0 )
            {
             before(grammarAccess.getProtocolAccess().getPnameAssignment_1_0()); 
            // InternalBPMN_translator.g:3139:2: ( rule__Protocol__PnameAssignment_1_0 )
            // InternalBPMN_translator.g:3139:3: rule__Protocol__PnameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__PnameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getPnameAssignment_1_0()); 

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
    // $ANTLR end "rule__Protocol__Group_1__0__Impl"


    // $ANTLR start "rule__Protocol__Group_1__1"
    // InternalBPMN_translator.g:3147:1: rule__Protocol__Group_1__1 : rule__Protocol__Group_1__1__Impl rule__Protocol__Group_1__2 ;
    public final void rule__Protocol__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3151:1: ( rule__Protocol__Group_1__1__Impl rule__Protocol__Group_1__2 )
            // InternalBPMN_translator.g:3152:2: rule__Protocol__Group_1__1__Impl rule__Protocol__Group_1__2
            {
            pushFollow(FOLLOW_39);
            rule__Protocol__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group_1__2();

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
    // $ANTLR end "rule__Protocol__Group_1__1"


    // $ANTLR start "rule__Protocol__Group_1__1__Impl"
    // InternalBPMN_translator.g:3159:1: rule__Protocol__Group_1__1__Impl : ( '{' ) ;
    public final void rule__Protocol__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3163:1: ( ( '{' ) )
            // InternalBPMN_translator.g:3164:1: ( '{' )
            {
            // InternalBPMN_translator.g:3164:1: ( '{' )
            // InternalBPMN_translator.g:3165:2: '{'
            {
             before(grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_1_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_1_1()); 

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
    // $ANTLR end "rule__Protocol__Group_1__1__Impl"


    // $ANTLR start "rule__Protocol__Group_1__2"
    // InternalBPMN_translator.g:3174:1: rule__Protocol__Group_1__2 : rule__Protocol__Group_1__2__Impl rule__Protocol__Group_1__3 ;
    public final void rule__Protocol__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3178:1: ( rule__Protocol__Group_1__2__Impl rule__Protocol__Group_1__3 )
            // InternalBPMN_translator.g:3179:2: rule__Protocol__Group_1__2__Impl rule__Protocol__Group_1__3
            {
            pushFollow(FOLLOW_15);
            rule__Protocol__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group_1__3();

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
    // $ANTLR end "rule__Protocol__Group_1__2"


    // $ANTLR start "rule__Protocol__Group_1__2__Impl"
    // InternalBPMN_translator.g:3186:1: rule__Protocol__Group_1__2__Impl : ( ( rule__Protocol__Group_1_2__0 ) ) ;
    public final void rule__Protocol__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3190:1: ( ( ( rule__Protocol__Group_1_2__0 ) ) )
            // InternalBPMN_translator.g:3191:1: ( ( rule__Protocol__Group_1_2__0 ) )
            {
            // InternalBPMN_translator.g:3191:1: ( ( rule__Protocol__Group_1_2__0 ) )
            // InternalBPMN_translator.g:3192:2: ( rule__Protocol__Group_1_2__0 )
            {
             before(grammarAccess.getProtocolAccess().getGroup_1_2()); 
            // InternalBPMN_translator.g:3193:2: ( rule__Protocol__Group_1_2__0 )
            // InternalBPMN_translator.g:3193:3: rule__Protocol__Group_1_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Group_1_2__0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__Protocol__Group_1__2__Impl"


    // $ANTLR start "rule__Protocol__Group_1__3"
    // InternalBPMN_translator.g:3201:1: rule__Protocol__Group_1__3 : rule__Protocol__Group_1__3__Impl ;
    public final void rule__Protocol__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3205:1: ( rule__Protocol__Group_1__3__Impl )
            // InternalBPMN_translator.g:3206:2: rule__Protocol__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Group_1__3__Impl();

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
    // $ANTLR end "rule__Protocol__Group_1__3"


    // $ANTLR start "rule__Protocol__Group_1__3__Impl"
    // InternalBPMN_translator.g:3212:1: rule__Protocol__Group_1__3__Impl : ( '}' ) ;
    public final void rule__Protocol__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3216:1: ( ( '}' ) )
            // InternalBPMN_translator.g:3217:1: ( '}' )
            {
            // InternalBPMN_translator.g:3217:1: ( '}' )
            // InternalBPMN_translator.g:3218:2: '}'
            {
             before(grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_1_3()); 

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
    // $ANTLR end "rule__Protocol__Group_1__3__Impl"


    // $ANTLR start "rule__Protocol__Group_1_2__0"
    // InternalBPMN_translator.g:3228:1: rule__Protocol__Group_1_2__0 : rule__Protocol__Group_1_2__0__Impl rule__Protocol__Group_1_2__1 ;
    public final void rule__Protocol__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3232:1: ( rule__Protocol__Group_1_2__0__Impl rule__Protocol__Group_1_2__1 )
            // InternalBPMN_translator.g:3233:2: rule__Protocol__Group_1_2__0__Impl rule__Protocol__Group_1_2__1
            {
            pushFollow(FOLLOW_38);
            rule__Protocol__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group_1_2__1();

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
    // $ANTLR end "rule__Protocol__Group_1_2__0"


    // $ANTLR start "rule__Protocol__Group_1_2__0__Impl"
    // InternalBPMN_translator.g:3240:1: rule__Protocol__Group_1_2__0__Impl : ( ( rule__Protocol__Http_dataAssignment_1_2_0 ) ) ;
    public final void rule__Protocol__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3244:1: ( ( ( rule__Protocol__Http_dataAssignment_1_2_0 ) ) )
            // InternalBPMN_translator.g:3245:1: ( ( rule__Protocol__Http_dataAssignment_1_2_0 ) )
            {
            // InternalBPMN_translator.g:3245:1: ( ( rule__Protocol__Http_dataAssignment_1_2_0 ) )
            // InternalBPMN_translator.g:3246:2: ( rule__Protocol__Http_dataAssignment_1_2_0 )
            {
             before(grammarAccess.getProtocolAccess().getHttp_dataAssignment_1_2_0()); 
            // InternalBPMN_translator.g:3247:2: ( rule__Protocol__Http_dataAssignment_1_2_0 )
            // InternalBPMN_translator.g:3247:3: rule__Protocol__Http_dataAssignment_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Http_dataAssignment_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getHttp_dataAssignment_1_2_0()); 

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
    // $ANTLR end "rule__Protocol__Group_1_2__0__Impl"


    // $ANTLR start "rule__Protocol__Group_1_2__1"
    // InternalBPMN_translator.g:3255:1: rule__Protocol__Group_1_2__1 : rule__Protocol__Group_1_2__1__Impl ;
    public final void rule__Protocol__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3259:1: ( rule__Protocol__Group_1_2__1__Impl )
            // InternalBPMN_translator.g:3260:2: rule__Protocol__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__Protocol__Group_1_2__1"


    // $ANTLR start "rule__Protocol__Group_1_2__1__Impl"
    // InternalBPMN_translator.g:3266:1: rule__Protocol__Group_1_2__1__Impl : ( ( rule__Protocol__Http_deviceAssignment_1_2_1 ) ) ;
    public final void rule__Protocol__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3270:1: ( ( ( rule__Protocol__Http_deviceAssignment_1_2_1 ) ) )
            // InternalBPMN_translator.g:3271:1: ( ( rule__Protocol__Http_deviceAssignment_1_2_1 ) )
            {
            // InternalBPMN_translator.g:3271:1: ( ( rule__Protocol__Http_deviceAssignment_1_2_1 ) )
            // InternalBPMN_translator.g:3272:2: ( rule__Protocol__Http_deviceAssignment_1_2_1 )
            {
             before(grammarAccess.getProtocolAccess().getHttp_deviceAssignment_1_2_1()); 
            // InternalBPMN_translator.g:3273:2: ( rule__Protocol__Http_deviceAssignment_1_2_1 )
            // InternalBPMN_translator.g:3273:3: rule__Protocol__Http_deviceAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Http_deviceAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getHttp_deviceAssignment_1_2_1()); 

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
    // $ANTLR end "rule__Protocol__Group_1_2__1__Impl"


    // $ANTLR start "rule__Http_data__Group__0"
    // InternalBPMN_translator.g:3282:1: rule__Http_data__Group__0 : rule__Http_data__Group__0__Impl rule__Http_data__Group__1 ;
    public final void rule__Http_data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3286:1: ( rule__Http_data__Group__0__Impl rule__Http_data__Group__1 )
            // InternalBPMN_translator.g:3287:2: rule__Http_data__Group__0__Impl rule__Http_data__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Http_data__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Http_data__Group__1();

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
    // $ANTLR end "rule__Http_data__Group__0"


    // $ANTLR start "rule__Http_data__Group__0__Impl"
    // InternalBPMN_translator.g:3294:1: rule__Http_data__Group__0__Impl : ( () ) ;
    public final void rule__Http_data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3298:1: ( ( () ) )
            // InternalBPMN_translator.g:3299:1: ( () )
            {
            // InternalBPMN_translator.g:3299:1: ( () )
            // InternalBPMN_translator.g:3300:2: ()
            {
             before(grammarAccess.getHttp_dataAccess().getHttp_dataAction_0()); 
            // InternalBPMN_translator.g:3301:2: ()
            // InternalBPMN_translator.g:3301:3: 
            {
            }

             after(grammarAccess.getHttp_dataAccess().getHttp_dataAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Http_data__Group__0__Impl"


    // $ANTLR start "rule__Http_data__Group__1"
    // InternalBPMN_translator.g:3309:1: rule__Http_data__Group__1 : rule__Http_data__Group__1__Impl ;
    public final void rule__Http_data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3313:1: ( rule__Http_data__Group__1__Impl )
            // InternalBPMN_translator.g:3314:2: rule__Http_data__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Http_data__Group__1__Impl();

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
    // $ANTLR end "rule__Http_data__Group__1"


    // $ANTLR start "rule__Http_data__Group__1__Impl"
    // InternalBPMN_translator.g:3320:1: rule__Http_data__Group__1__Impl : ( ( rule__Http_data__Alternatives_1 )* ) ;
    public final void rule__Http_data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3324:1: ( ( ( rule__Http_data__Alternatives_1 )* ) )
            // InternalBPMN_translator.g:3325:1: ( ( rule__Http_data__Alternatives_1 )* )
            {
            // InternalBPMN_translator.g:3325:1: ( ( rule__Http_data__Alternatives_1 )* )
            // InternalBPMN_translator.g:3326:2: ( rule__Http_data__Alternatives_1 )*
            {
             before(grammarAccess.getHttp_dataAccess().getAlternatives_1()); 
            // InternalBPMN_translator.g:3327:2: ( rule__Http_data__Alternatives_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=44 && LA26_0<=50)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBPMN_translator.g:3327:3: rule__Http_data__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__Http_data__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getHttp_dataAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Http_data__Group__1__Impl"


    // $ANTLR start "rule__Http_data__Group_1_0__0"
    // InternalBPMN_translator.g:3336:1: rule__Http_data__Group_1_0__0 : rule__Http_data__Group_1_0__0__Impl rule__Http_data__Group_1_0__1 ;
    public final void rule__Http_data__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3340:1: ( rule__Http_data__Group_1_0__0__Impl rule__Http_data__Group_1_0__1 )
            // InternalBPMN_translator.g:3341:2: rule__Http_data__Group_1_0__0__Impl rule__Http_data__Group_1_0__1
            {
            pushFollow(FOLLOW_24);
            rule__Http_data__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Http_data__Group_1_0__1();

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
    // $ANTLR end "rule__Http_data__Group_1_0__0"


    // $ANTLR start "rule__Http_data__Group_1_0__0__Impl"
    // InternalBPMN_translator.g:3348:1: rule__Http_data__Group_1_0__0__Impl : ( 'NAME' ) ;
    public final void rule__Http_data__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3352:1: ( ( 'NAME' ) )
            // InternalBPMN_translator.g:3353:1: ( 'NAME' )
            {
            // InternalBPMN_translator.g:3353:1: ( 'NAME' )
            // InternalBPMN_translator.g:3354:2: 'NAME'
            {
             before(grammarAccess.getHttp_dataAccess().getNAMEKeyword_1_0_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getHttp_dataAccess().getNAMEKeyword_1_0_0()); 

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
    // $ANTLR end "rule__Http_data__Group_1_0__0__Impl"


    // $ANTLR start "rule__Http_data__Group_1_0__1"
    // InternalBPMN_translator.g:3363:1: rule__Http_data__Group_1_0__1 : rule__Http_data__Group_1_0__1__Impl rule__Http_data__Group_1_0__2 ;
    public final void rule__Http_data__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3367:1: ( rule__Http_data__Group_1_0__1__Impl rule__Http_data__Group_1_0__2 )
            // InternalBPMN_translator.g:3368:2: rule__Http_data__Group_1_0__1__Impl rule__Http_data__Group_1_0__2
            {
            pushFollow(FOLLOW_7);
            rule__Http_data__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Http_data__Group_1_0__2();

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
    // $ANTLR end "rule__Http_data__Group_1_0__1"


    // $ANTLR start "rule__Http_data__Group_1_0__1__Impl"
    // InternalBPMN_translator.g:3375:1: rule__Http_data__Group_1_0__1__Impl : ( '=' ) ;
    public final void rule__Http_data__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3379:1: ( ( '=' ) )
            // InternalBPMN_translator.g:3380:1: ( '=' )
            {
            // InternalBPMN_translator.g:3380:1: ( '=' )
            // InternalBPMN_translator.g:3381:2: '='
            {
             before(grammarAccess.getHttp_dataAccess().getEqualsSignKeyword_1_0_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getHttp_dataAccess().getEqualsSignKeyword_1_0_1()); 

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
    // $ANTLR end "rule__Http_data__Group_1_0__1__Impl"


    // $ANTLR start "rule__Http_data__Group_1_0__2"
    // InternalBPMN_translator.g:3390:1: rule__Http_data__Group_1_0__2 : rule__Http_data__Group_1_0__2__Impl ;
    public final void rule__Http_data__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3394:1: ( rule__Http_data__Group_1_0__2__Impl )
            // InternalBPMN_translator.g:3395:2: rule__Http_data__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Http_data__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__Http_data__Group_1_0__2"


    // $ANTLR start "rule__Http_data__Group_1_0__2__Impl"
    // InternalBPMN_translator.g:3401:1: rule__Http_data__Group_1_0__2__Impl : ( ( rule__Http_data__PnameAssignment_1_0_2 ) ) ;
    public final void rule__Http_data__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3405:1: ( ( ( rule__Http_data__PnameAssignment_1_0_2 ) ) )
            // InternalBPMN_translator.g:3406:1: ( ( rule__Http_data__PnameAssignment_1_0_2 ) )
            {
            // InternalBPMN_translator.g:3406:1: ( ( rule__Http_data__PnameAssignment_1_0_2 ) )
            // InternalBPMN_translator.g:3407:2: ( rule__Http_data__PnameAssignment_1_0_2 )
            {
             before(grammarAccess.getHttp_dataAccess().getPnameAssignment_1_0_2()); 
            // InternalBPMN_translator.g:3408:2: ( rule__Http_data__PnameAssignment_1_0_2 )
            // InternalBPMN_translator.g:3408:3: rule__Http_data__PnameAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Http_data__PnameAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getHttp_dataAccess().getPnameAssignment_1_0_2()); 

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
    // $ANTLR end "rule__Http_data__Group_1_0__2__Impl"


    // $ANTLR start "rule__Http_data__Group_1_1__0"
    // InternalBPMN_translator.g:3417:1: rule__Http_data__Group_1_1__0 : rule__Http_data__Group_1_1__0__Impl rule__Http_data__Group_1_1__1 ;
    public final void rule__Http_data__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3421:1: ( rule__Http_data__Group_1_1__0__Impl rule__Http_data__Group_1_1__1 )
            // InternalBPMN_translator.g:3422:2: rule__Http_data__Group_1_1__0__Impl rule__Http_data__Group_1_1__1
            {
            pushFollow(FOLLOW_24);
            rule__Http_data__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Http_data__Group_1_1__1();

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
    // $ANTLR end "rule__Http_data__Group_1_1__0"


    // $ANTLR start "rule__Http_data__Group_1_1__0__Impl"
    // InternalBPMN_translator.g:3429:1: rule__Http_data__Group_1_1__0__Impl : ( 'SERVER_IP' ) ;
    public final void rule__Http_data__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3433:1: ( ( 'SERVER_IP' ) )
            // InternalBPMN_translator.g:3434:1: ( 'SERVER_IP' )
            {
            // InternalBPMN_translator.g:3434:1: ( 'SERVER_IP' )
            // InternalBPMN_translator.g:3435:2: 'SERVER_IP'
            {
             before(grammarAccess.getHttp_dataAccess().getSERVER_IPKeyword_1_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getHttp_dataAccess().getSERVER_IPKeyword_1_1_0()); 

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
    // $ANTLR end "rule__Http_data__Group_1_1__0__Impl"


    // $ANTLR start "rule__Http_data__Group_1_1__1"
    // InternalBPMN_translator.g:3444:1: rule__Http_data__Group_1_1__1 : rule__Http_data__Group_1_1__1__Impl rule__Http_data__Group_1_1__2 ;
    public final void rule__Http_data__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3448:1: ( rule__Http_data__Group_1_1__1__Impl rule__Http_data__Group_1_1__2 )
            // InternalBPMN_translator.g:3449:2: rule__Http_data__Group_1_1__1__Impl rule__Http_data__Group_1_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Http_data__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Http_data__Group_1_1__2();

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
    // $ANTLR end "rule__Http_data__Group_1_1__1"


    // $ANTLR start "rule__Http_data__Group_1_1__1__Impl"
    // InternalBPMN_translator.g:3456:1: rule__Http_data__Group_1_1__1__Impl : ( '=' ) ;
    public final void rule__Http_data__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3460:1: ( ( '=' ) )
            // InternalBPMN_translator.g:3461:1: ( '=' )
            {
            // InternalBPMN_translator.g:3461:1: ( '=' )
            // InternalBPMN_translator.g:3462:2: '='
            {
             before(grammarAccess.getHttp_dataAccess().getEqualsSignKeyword_1_1_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getHttp_dataAccess().getEqualsSignKeyword_1_1_1()); 

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
    // $ANTLR end "rule__Http_data__Group_1_1__1__Impl"


    // $ANTLR start "rule__Http_data__Group_1_1__2"
    // InternalBPMN_translator.g:3471:1: rule__Http_data__Group_1_1__2 : rule__Http_data__Group_1_1__2__Impl ;
    public final void rule__Http_data__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3475:1: ( rule__Http_data__Group_1_1__2__Impl )
            // InternalBPMN_translator.g:3476:2: rule__Http_data__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Http_data__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__Http_data__Group_1_1__2"


    // $ANTLR start "rule__Http_data__Group_1_1__2__Impl"
    // InternalBPMN_translator.g:3482:1: rule__Http_data__Group_1_1__2__Impl : ( ( rule__Http_data__Server_ipAssignment_1_1_2 ) ) ;
    public final void rule__Http_data__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3486:1: ( ( ( rule__Http_data__Server_ipAssignment_1_1_2 ) ) )
            // InternalBPMN_translator.g:3487:1: ( ( rule__Http_data__Server_ipAssignment_1_1_2 ) )
            {
            // InternalBPMN_translator.g:3487:1: ( ( rule__Http_data__Server_ipAssignment_1_1_2 ) )
            // InternalBPMN_translator.g:3488:2: ( rule__Http_data__Server_ipAssignment_1_1_2 )
            {
             before(grammarAccess.getHttp_dataAccess().getServer_ipAssignment_1_1_2()); 
            // InternalBPMN_translator.g:3489:2: ( rule__Http_data__Server_ipAssignment_1_1_2 )
            // InternalBPMN_translator.g:3489:3: rule__Http_data__Server_ipAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Http_data__Server_ipAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getHttp_dataAccess().getServer_ipAssignment_1_1_2()); 

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
    // $ANTLR end "rule__Http_data__Group_1_1__2__Impl"


    // $ANTLR start "rule__Http_data__Group_1_2__0"
    // InternalBPMN_translator.g:3498:1: rule__Http_data__Group_1_2__0 : rule__Http_data__Group_1_2__0__Impl rule__Http_data__Group_1_2__1 ;
    public final void rule__Http_data__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3502:1: ( rule__Http_data__Group_1_2__0__Impl rule__Http_data__Group_1_2__1 )
            // InternalBPMN_translator.g:3503:2: rule__Http_data__Group_1_2__0__Impl rule__Http_data__Group_1_2__1
            {
            pushFollow(FOLLOW_24);
            rule__Http_data__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Http_data__Group_1_2__1();

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
    // $ANTLR end "rule__Http_data__Group_1_2__0"


    // $ANTLR start "rule__Http_data__Group_1_2__0__Impl"
    // InternalBPMN_translator.g:3510:1: rule__Http_data__Group_1_2__0__Impl : ( 'REQUEST_TYPE' ) ;
    public final void rule__Http_data__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3514:1: ( ( 'REQUEST_TYPE' ) )
            // InternalBPMN_translator.g:3515:1: ( 'REQUEST_TYPE' )
            {
            // InternalBPMN_translator.g:3515:1: ( 'REQUEST_TYPE' )
            // InternalBPMN_translator.g:3516:2: 'REQUEST_TYPE'
            {
             before(grammarAccess.getHttp_dataAccess().getREQUEST_TYPEKeyword_1_2_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getHttp_dataAccess().getREQUEST_TYPEKeyword_1_2_0()); 

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
    // $ANTLR end "rule__Http_data__Group_1_2__0__Impl"


    // $ANTLR start "rule__Http_data__Group_1_2__1"
    // InternalBPMN_translator.g:3525:1: rule__Http_data__Group_1_2__1 : rule__Http_data__Group_1_2__1__Impl rule__Http_data__Group_1_2__2 ;
    public final void rule__Http_data__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3529:1: ( rule__Http_data__Group_1_2__1__Impl rule__Http_data__Group_1_2__2 )
            // InternalBPMN_translator.g:3530:2: rule__Http_data__Group_1_2__1__Impl rule__Http_data__Group_1_2__2
            {
            pushFollow(FOLLOW_7);
            rule__Http_data__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Http_data__Group_1_2__2();

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
    // $ANTLR end "rule__Http_data__Group_1_2__1"


    // $ANTLR start "rule__Http_data__Group_1_2__1__Impl"
    // InternalBPMN_translator.g:3537:1: rule__Http_data__Group_1_2__1__Impl : ( '=' ) ;
    public final void rule__Http_data__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3541:1: ( ( '=' ) )
            // InternalBPMN_translator.g:3542:1: ( '=' )
            {
            // InternalBPMN_translator.g:3542:1: ( '=' )
            // InternalBPMN_translator.g:3543:2: '='
            {
             before(grammarAccess.getHttp_dataAccess().getEqualsSignKeyword_1_2_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getHttp_dataAccess().getEqualsSignKeyword_1_2_1()); 

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
    // $ANTLR end "rule__Http_data__Group_1_2__1__Impl"


    // $ANTLR start "rule__Http_data__Group_1_2__2"
    // InternalBPMN_translator.g:3552:1: rule__Http_data__Group_1_2__2 : rule__Http_data__Group_1_2__2__Impl ;
    public final void rule__Http_data__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3556:1: ( rule__Http_data__Group_1_2__2__Impl )
            // InternalBPMN_translator.g:3557:2: rule__Http_data__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Http_data__Group_1_2__2__Impl();

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
    // $ANTLR end "rule__Http_data__Group_1_2__2"


    // $ANTLR start "rule__Http_data__Group_1_2__2__Impl"
    // InternalBPMN_translator.g:3563:1: rule__Http_data__Group_1_2__2__Impl : ( ( rule__Http_data__Request_typeAssignment_1_2_2 ) ) ;
    public final void rule__Http_data__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3567:1: ( ( ( rule__Http_data__Request_typeAssignment_1_2_2 ) ) )
            // InternalBPMN_translator.g:3568:1: ( ( rule__Http_data__Request_typeAssignment_1_2_2 ) )
            {
            // InternalBPMN_translator.g:3568:1: ( ( rule__Http_data__Request_typeAssignment_1_2_2 ) )
            // InternalBPMN_translator.g:3569:2: ( rule__Http_data__Request_typeAssignment_1_2_2 )
            {
             before(grammarAccess.getHttp_dataAccess().getRequest_typeAssignment_1_2_2()); 
            // InternalBPMN_translator.g:3570:2: ( rule__Http_data__Request_typeAssignment_1_2_2 )
            // InternalBPMN_translator.g:3570:3: rule__Http_data__Request_typeAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Http_data__Request_typeAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getHttp_dataAccess().getRequest_typeAssignment_1_2_2()); 

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
    // $ANTLR end "rule__Http_data__Group_1_2__2__Impl"


    // $ANTLR start "rule__Http_data__Group_1_3__0"
    // InternalBPMN_translator.g:3579:1: rule__Http_data__Group_1_3__0 : rule__Http_data__Group_1_3__0__Impl rule__Http_data__Group_1_3__1 ;
    public final void rule__Http_data__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3583:1: ( rule__Http_data__Group_1_3__0__Impl rule__Http_data__Group_1_3__1 )
            // InternalBPMN_translator.g:3584:2: rule__Http_data__Group_1_3__0__Impl rule__Http_data__Group_1_3__1
            {
            pushFollow(FOLLOW_24);
            rule__Http_data__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Http_data__Group_1_3__1();

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
    // $ANTLR end "rule__Http_data__Group_1_3__0"


    // $ANTLR start "rule__Http_data__Group_1_3__0__Impl"
    // InternalBPMN_translator.g:3591:1: rule__Http_data__Group_1_3__0__Impl : ( 'CONTENT_TYPE' ) ;
    public final void rule__Http_data__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3595:1: ( ( 'CONTENT_TYPE' ) )
            // InternalBPMN_translator.g:3596:1: ( 'CONTENT_TYPE' )
            {
            // InternalBPMN_translator.g:3596:1: ( 'CONTENT_TYPE' )
            // InternalBPMN_translator.g:3597:2: 'CONTENT_TYPE'
            {
             before(grammarAccess.getHttp_dataAccess().getCONTENT_TYPEKeyword_1_3_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getHttp_dataAccess().getCONTENT_TYPEKeyword_1_3_0()); 

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
    // $ANTLR end "rule__Http_data__Group_1_3__0__Impl"


    // $ANTLR start "rule__Http_data__Group_1_3__1"
    // InternalBPMN_translator.g:3606:1: rule__Http_data__Group_1_3__1 : rule__Http_data__Group_1_3__1__Impl rule__Http_data__Group_1_3__2 ;
    public final void rule__Http_data__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3610:1: ( rule__Http_data__Group_1_3__1__Impl rule__Http_data__Group_1_3__2 )
            // InternalBPMN_translator.g:3611:2: rule__Http_data__Group_1_3__1__Impl rule__Http_data__Group_1_3__2
            {
            pushFollow(FOLLOW_7);
            rule__Http_data__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Http_data__Group_1_3__2();

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
    // $ANTLR end "rule__Http_data__Group_1_3__1"


    // $ANTLR start "rule__Http_data__Group_1_3__1__Impl"
    // InternalBPMN_translator.g:3618:1: rule__Http_data__Group_1_3__1__Impl : ( '=' ) ;
    public final void rule__Http_data__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3622:1: ( ( '=' ) )
            // InternalBPMN_translator.g:3623:1: ( '=' )
            {
            // InternalBPMN_translator.g:3623:1: ( '=' )
            // InternalBPMN_translator.g:3624:2: '='
            {
             before(grammarAccess.getHttp_dataAccess().getEqualsSignKeyword_1_3_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getHttp_dataAccess().getEqualsSignKeyword_1_3_1()); 

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
    // $ANTLR end "rule__Http_data__Group_1_3__1__Impl"


    // $ANTLR start "rule__Http_data__Group_1_3__2"
    // InternalBPMN_translator.g:3633:1: rule__Http_data__Group_1_3__2 : rule__Http_data__Group_1_3__2__Impl ;
    public final void rule__Http_data__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3637:1: ( rule__Http_data__Group_1_3__2__Impl )
            // InternalBPMN_translator.g:3638:2: rule__Http_data__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Http_data__Group_1_3__2__Impl();

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
    // $ANTLR end "rule__Http_data__Group_1_3__2"


    // $ANTLR start "rule__Http_data__Group_1_3__2__Impl"
    // InternalBPMN_translator.g:3644:1: rule__Http_data__Group_1_3__2__Impl : ( ( rule__Http_data__Content_typeAssignment_1_3_2 ) ) ;
    public final void rule__Http_data__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3648:1: ( ( ( rule__Http_data__Content_typeAssignment_1_3_2 ) ) )
            // InternalBPMN_translator.g:3649:1: ( ( rule__Http_data__Content_typeAssignment_1_3_2 ) )
            {
            // InternalBPMN_translator.g:3649:1: ( ( rule__Http_data__Content_typeAssignment_1_3_2 ) )
            // InternalBPMN_translator.g:3650:2: ( rule__Http_data__Content_typeAssignment_1_3_2 )
            {
             before(grammarAccess.getHttp_dataAccess().getContent_typeAssignment_1_3_2()); 
            // InternalBPMN_translator.g:3651:2: ( rule__Http_data__Content_typeAssignment_1_3_2 )
            // InternalBPMN_translator.g:3651:3: rule__Http_data__Content_typeAssignment_1_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Http_data__Content_typeAssignment_1_3_2();

            state._fsp--;


            }

             after(grammarAccess.getHttp_dataAccess().getContent_typeAssignment_1_3_2()); 

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
    // $ANTLR end "rule__Http_data__Group_1_3__2__Impl"


    // $ANTLR start "rule__Http_data__Group_1_4__0"
    // InternalBPMN_translator.g:3660:1: rule__Http_data__Group_1_4__0 : rule__Http_data__Group_1_4__0__Impl rule__Http_data__Group_1_4__1 ;
    public final void rule__Http_data__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3664:1: ( rule__Http_data__Group_1_4__0__Impl rule__Http_data__Group_1_4__1 )
            // InternalBPMN_translator.g:3665:2: rule__Http_data__Group_1_4__0__Impl rule__Http_data__Group_1_4__1
            {
            pushFollow(FOLLOW_24);
            rule__Http_data__Group_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Http_data__Group_1_4__1();

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
    // $ANTLR end "rule__Http_data__Group_1_4__0"


    // $ANTLR start "rule__Http_data__Group_1_4__0__Impl"
    // InternalBPMN_translator.g:3672:1: rule__Http_data__Group_1_4__0__Impl : ( 'HEADER' ) ;
    public final void rule__Http_data__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3676:1: ( ( 'HEADER' ) )
            // InternalBPMN_translator.g:3677:1: ( 'HEADER' )
            {
            // InternalBPMN_translator.g:3677:1: ( 'HEADER' )
            // InternalBPMN_translator.g:3678:2: 'HEADER'
            {
             before(grammarAccess.getHttp_dataAccess().getHEADERKeyword_1_4_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getHttp_dataAccess().getHEADERKeyword_1_4_0()); 

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
    // $ANTLR end "rule__Http_data__Group_1_4__0__Impl"


    // $ANTLR start "rule__Http_data__Group_1_4__1"
    // InternalBPMN_translator.g:3687:1: rule__Http_data__Group_1_4__1 : rule__Http_data__Group_1_4__1__Impl rule__Http_data__Group_1_4__2 ;
    public final void rule__Http_data__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3691:1: ( rule__Http_data__Group_1_4__1__Impl rule__Http_data__Group_1_4__2 )
            // InternalBPMN_translator.g:3692:2: rule__Http_data__Group_1_4__1__Impl rule__Http_data__Group_1_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Http_data__Group_1_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Http_data__Group_1_4__2();

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
    // $ANTLR end "rule__Http_data__Group_1_4__1"


    // $ANTLR start "rule__Http_data__Group_1_4__1__Impl"
    // InternalBPMN_translator.g:3699:1: rule__Http_data__Group_1_4__1__Impl : ( '=' ) ;
    public final void rule__Http_data__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3703:1: ( ( '=' ) )
            // InternalBPMN_translator.g:3704:1: ( '=' )
            {
            // InternalBPMN_translator.g:3704:1: ( '=' )
            // InternalBPMN_translator.g:3705:2: '='
            {
             before(grammarAccess.getHttp_dataAccess().getEqualsSignKeyword_1_4_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getHttp_dataAccess().getEqualsSignKeyword_1_4_1()); 

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
    // $ANTLR end "rule__Http_data__Group_1_4__1__Impl"


    // $ANTLR start "rule__Http_data__Group_1_4__2"
    // InternalBPMN_translator.g:3714:1: rule__Http_data__Group_1_4__2 : rule__Http_data__Group_1_4__2__Impl ;
    public final void rule__Http_data__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3718:1: ( rule__Http_data__Group_1_4__2__Impl )
            // InternalBPMN_translator.g:3719:2: rule__Http_data__Group_1_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Http_data__Group_1_4__2__Impl();

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
    // $ANTLR end "rule__Http_data__Group_1_4__2"


    // $ANTLR start "rule__Http_data__Group_1_4__2__Impl"
    // InternalBPMN_translator.g:3725:1: rule__Http_data__Group_1_4__2__Impl : ( ( rule__Http_data__HeaderAssignment_1_4_2 ) ) ;
    public final void rule__Http_data__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3729:1: ( ( ( rule__Http_data__HeaderAssignment_1_4_2 ) ) )
            // InternalBPMN_translator.g:3730:1: ( ( rule__Http_data__HeaderAssignment_1_4_2 ) )
            {
            // InternalBPMN_translator.g:3730:1: ( ( rule__Http_data__HeaderAssignment_1_4_2 ) )
            // InternalBPMN_translator.g:3731:2: ( rule__Http_data__HeaderAssignment_1_4_2 )
            {
             before(grammarAccess.getHttp_dataAccess().getHeaderAssignment_1_4_2()); 
            // InternalBPMN_translator.g:3732:2: ( rule__Http_data__HeaderAssignment_1_4_2 )
            // InternalBPMN_translator.g:3732:3: rule__Http_data__HeaderAssignment_1_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Http_data__HeaderAssignment_1_4_2();

            state._fsp--;


            }

             after(grammarAccess.getHttp_dataAccess().getHeaderAssignment_1_4_2()); 

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
    // $ANTLR end "rule__Http_data__Group_1_4__2__Impl"


    // $ANTLR start "rule__Http_data__Group_1_5__0"
    // InternalBPMN_translator.g:3741:1: rule__Http_data__Group_1_5__0 : rule__Http_data__Group_1_5__0__Impl rule__Http_data__Group_1_5__1 ;
    public final void rule__Http_data__Group_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3745:1: ( rule__Http_data__Group_1_5__0__Impl rule__Http_data__Group_1_5__1 )
            // InternalBPMN_translator.g:3746:2: rule__Http_data__Group_1_5__0__Impl rule__Http_data__Group_1_5__1
            {
            pushFollow(FOLLOW_24);
            rule__Http_data__Group_1_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Http_data__Group_1_5__1();

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
    // $ANTLR end "rule__Http_data__Group_1_5__0"


    // $ANTLR start "rule__Http_data__Group_1_5__0__Impl"
    // InternalBPMN_translator.g:3753:1: rule__Http_data__Group_1_5__0__Impl : ( 'DATA' ) ;
    public final void rule__Http_data__Group_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3757:1: ( ( 'DATA' ) )
            // InternalBPMN_translator.g:3758:1: ( 'DATA' )
            {
            // InternalBPMN_translator.g:3758:1: ( 'DATA' )
            // InternalBPMN_translator.g:3759:2: 'DATA'
            {
             before(grammarAccess.getHttp_dataAccess().getDATAKeyword_1_5_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getHttp_dataAccess().getDATAKeyword_1_5_0()); 

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
    // $ANTLR end "rule__Http_data__Group_1_5__0__Impl"


    // $ANTLR start "rule__Http_data__Group_1_5__1"
    // InternalBPMN_translator.g:3768:1: rule__Http_data__Group_1_5__1 : rule__Http_data__Group_1_5__1__Impl rule__Http_data__Group_1_5__2 ;
    public final void rule__Http_data__Group_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3772:1: ( rule__Http_data__Group_1_5__1__Impl rule__Http_data__Group_1_5__2 )
            // InternalBPMN_translator.g:3773:2: rule__Http_data__Group_1_5__1__Impl rule__Http_data__Group_1_5__2
            {
            pushFollow(FOLLOW_7);
            rule__Http_data__Group_1_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Http_data__Group_1_5__2();

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
    // $ANTLR end "rule__Http_data__Group_1_5__1"


    // $ANTLR start "rule__Http_data__Group_1_5__1__Impl"
    // InternalBPMN_translator.g:3780:1: rule__Http_data__Group_1_5__1__Impl : ( '=' ) ;
    public final void rule__Http_data__Group_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3784:1: ( ( '=' ) )
            // InternalBPMN_translator.g:3785:1: ( '=' )
            {
            // InternalBPMN_translator.g:3785:1: ( '=' )
            // InternalBPMN_translator.g:3786:2: '='
            {
             before(grammarAccess.getHttp_dataAccess().getEqualsSignKeyword_1_5_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getHttp_dataAccess().getEqualsSignKeyword_1_5_1()); 

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
    // $ANTLR end "rule__Http_data__Group_1_5__1__Impl"


    // $ANTLR start "rule__Http_data__Group_1_5__2"
    // InternalBPMN_translator.g:3795:1: rule__Http_data__Group_1_5__2 : rule__Http_data__Group_1_5__2__Impl ;
    public final void rule__Http_data__Group_1_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3799:1: ( rule__Http_data__Group_1_5__2__Impl )
            // InternalBPMN_translator.g:3800:2: rule__Http_data__Group_1_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Http_data__Group_1_5__2__Impl();

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
    // $ANTLR end "rule__Http_data__Group_1_5__2"


    // $ANTLR start "rule__Http_data__Group_1_5__2__Impl"
    // InternalBPMN_translator.g:3806:1: rule__Http_data__Group_1_5__2__Impl : ( ( rule__Http_data__DataAssignment_1_5_2 ) ) ;
    public final void rule__Http_data__Group_1_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3810:1: ( ( ( rule__Http_data__DataAssignment_1_5_2 ) ) )
            // InternalBPMN_translator.g:3811:1: ( ( rule__Http_data__DataAssignment_1_5_2 ) )
            {
            // InternalBPMN_translator.g:3811:1: ( ( rule__Http_data__DataAssignment_1_5_2 ) )
            // InternalBPMN_translator.g:3812:2: ( rule__Http_data__DataAssignment_1_5_2 )
            {
             before(grammarAccess.getHttp_dataAccess().getDataAssignment_1_5_2()); 
            // InternalBPMN_translator.g:3813:2: ( rule__Http_data__DataAssignment_1_5_2 )
            // InternalBPMN_translator.g:3813:3: rule__Http_data__DataAssignment_1_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Http_data__DataAssignment_1_5_2();

            state._fsp--;


            }

             after(grammarAccess.getHttp_dataAccess().getDataAssignment_1_5_2()); 

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
    // $ANTLR end "rule__Http_data__Group_1_5__2__Impl"


    // $ANTLR start "rule__Http_data__Group_1_6__0"
    // InternalBPMN_translator.g:3822:1: rule__Http_data__Group_1_6__0 : rule__Http_data__Group_1_6__0__Impl rule__Http_data__Group_1_6__1 ;
    public final void rule__Http_data__Group_1_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3826:1: ( rule__Http_data__Group_1_6__0__Impl rule__Http_data__Group_1_6__1 )
            // InternalBPMN_translator.g:3827:2: rule__Http_data__Group_1_6__0__Impl rule__Http_data__Group_1_6__1
            {
            pushFollow(FOLLOW_13);
            rule__Http_data__Group_1_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Http_data__Group_1_6__1();

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
    // $ANTLR end "rule__Http_data__Group_1_6__0"


    // $ANTLR start "rule__Http_data__Group_1_6__0__Impl"
    // InternalBPMN_translator.g:3834:1: rule__Http_data__Group_1_6__0__Impl : ( 'NETWORK' ) ;
    public final void rule__Http_data__Group_1_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3838:1: ( ( 'NETWORK' ) )
            // InternalBPMN_translator.g:3839:1: ( 'NETWORK' )
            {
            // InternalBPMN_translator.g:3839:1: ( 'NETWORK' )
            // InternalBPMN_translator.g:3840:2: 'NETWORK'
            {
             before(grammarAccess.getHttp_dataAccess().getNETWORKKeyword_1_6_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getHttp_dataAccess().getNETWORKKeyword_1_6_0()); 

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
    // $ANTLR end "rule__Http_data__Group_1_6__0__Impl"


    // $ANTLR start "rule__Http_data__Group_1_6__1"
    // InternalBPMN_translator.g:3849:1: rule__Http_data__Group_1_6__1 : rule__Http_data__Group_1_6__1__Impl rule__Http_data__Group_1_6__2 ;
    public final void rule__Http_data__Group_1_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3853:1: ( rule__Http_data__Group_1_6__1__Impl rule__Http_data__Group_1_6__2 )
            // InternalBPMN_translator.g:3854:2: rule__Http_data__Group_1_6__1__Impl rule__Http_data__Group_1_6__2
            {
            pushFollow(FOLLOW_41);
            rule__Http_data__Group_1_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Http_data__Group_1_6__2();

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
    // $ANTLR end "rule__Http_data__Group_1_6__1"


    // $ANTLR start "rule__Http_data__Group_1_6__1__Impl"
    // InternalBPMN_translator.g:3861:1: rule__Http_data__Group_1_6__1__Impl : ( '{' ) ;
    public final void rule__Http_data__Group_1_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3865:1: ( ( '{' ) )
            // InternalBPMN_translator.g:3866:1: ( '{' )
            {
            // InternalBPMN_translator.g:3866:1: ( '{' )
            // InternalBPMN_translator.g:3867:2: '{'
            {
             before(grammarAccess.getHttp_dataAccess().getLeftCurlyBracketKeyword_1_6_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getHttp_dataAccess().getLeftCurlyBracketKeyword_1_6_1()); 

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
    // $ANTLR end "rule__Http_data__Group_1_6__1__Impl"


    // $ANTLR start "rule__Http_data__Group_1_6__2"
    // InternalBPMN_translator.g:3876:1: rule__Http_data__Group_1_6__2 : rule__Http_data__Group_1_6__2__Impl rule__Http_data__Group_1_6__3 ;
    public final void rule__Http_data__Group_1_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3880:1: ( rule__Http_data__Group_1_6__2__Impl rule__Http_data__Group_1_6__3 )
            // InternalBPMN_translator.g:3881:2: rule__Http_data__Group_1_6__2__Impl rule__Http_data__Group_1_6__3
            {
            pushFollow(FOLLOW_41);
            rule__Http_data__Group_1_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Http_data__Group_1_6__3();

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
    // $ANTLR end "rule__Http_data__Group_1_6__2"


    // $ANTLR start "rule__Http_data__Group_1_6__2__Impl"
    // InternalBPMN_translator.g:3888:1: rule__Http_data__Group_1_6__2__Impl : ( ( rule__Http_data__Mqtt_network_dataAssignment_1_6_2 )* ) ;
    public final void rule__Http_data__Group_1_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3892:1: ( ( ( rule__Http_data__Mqtt_network_dataAssignment_1_6_2 )* ) )
            // InternalBPMN_translator.g:3893:1: ( ( rule__Http_data__Mqtt_network_dataAssignment_1_6_2 )* )
            {
            // InternalBPMN_translator.g:3893:1: ( ( rule__Http_data__Mqtt_network_dataAssignment_1_6_2 )* )
            // InternalBPMN_translator.g:3894:2: ( rule__Http_data__Mqtt_network_dataAssignment_1_6_2 )*
            {
             before(grammarAccess.getHttp_dataAccess().getMqtt_network_dataAssignment_1_6_2()); 
            // InternalBPMN_translator.g:3895:2: ( rule__Http_data__Mqtt_network_dataAssignment_1_6_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==57) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalBPMN_translator.g:3895:3: rule__Http_data__Mqtt_network_dataAssignment_1_6_2
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__Http_data__Mqtt_network_dataAssignment_1_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getHttp_dataAccess().getMqtt_network_dataAssignment_1_6_2()); 

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
    // $ANTLR end "rule__Http_data__Group_1_6__2__Impl"


    // $ANTLR start "rule__Http_data__Group_1_6__3"
    // InternalBPMN_translator.g:3903:1: rule__Http_data__Group_1_6__3 : rule__Http_data__Group_1_6__3__Impl ;
    public final void rule__Http_data__Group_1_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3907:1: ( rule__Http_data__Group_1_6__3__Impl )
            // InternalBPMN_translator.g:3908:2: rule__Http_data__Group_1_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Http_data__Group_1_6__3__Impl();

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
    // $ANTLR end "rule__Http_data__Group_1_6__3"


    // $ANTLR start "rule__Http_data__Group_1_6__3__Impl"
    // InternalBPMN_translator.g:3914:1: rule__Http_data__Group_1_6__3__Impl : ( '}' ) ;
    public final void rule__Http_data__Group_1_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3918:1: ( ( '}' ) )
            // InternalBPMN_translator.g:3919:1: ( '}' )
            {
            // InternalBPMN_translator.g:3919:1: ( '}' )
            // InternalBPMN_translator.g:3920:2: '}'
            {
             before(grammarAccess.getHttp_dataAccess().getRightCurlyBracketKeyword_1_6_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getHttp_dataAccess().getRightCurlyBracketKeyword_1_6_3()); 

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
    // $ANTLR end "rule__Http_data__Group_1_6__3__Impl"


    // $ANTLR start "rule__Mqtt_data__Group__0"
    // InternalBPMN_translator.g:3930:1: rule__Mqtt_data__Group__0 : rule__Mqtt_data__Group__0__Impl rule__Mqtt_data__Group__1 ;
    public final void rule__Mqtt_data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3934:1: ( rule__Mqtt_data__Group__0__Impl rule__Mqtt_data__Group__1 )
            // InternalBPMN_translator.g:3935:2: rule__Mqtt_data__Group__0__Impl rule__Mqtt_data__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Mqtt_data__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group__1();

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
    // $ANTLR end "rule__Mqtt_data__Group__0"


    // $ANTLR start "rule__Mqtt_data__Group__0__Impl"
    // InternalBPMN_translator.g:3942:1: rule__Mqtt_data__Group__0__Impl : ( () ) ;
    public final void rule__Mqtt_data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3946:1: ( ( () ) )
            // InternalBPMN_translator.g:3947:1: ( () )
            {
            // InternalBPMN_translator.g:3947:1: ( () )
            // InternalBPMN_translator.g:3948:2: ()
            {
             before(grammarAccess.getMqtt_dataAccess().getMqtt_dataAction_0()); 
            // InternalBPMN_translator.g:3949:2: ()
            // InternalBPMN_translator.g:3949:3: 
            {
            }

             after(grammarAccess.getMqtt_dataAccess().getMqtt_dataAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mqtt_data__Group__0__Impl"


    // $ANTLR start "rule__Mqtt_data__Group__1"
    // InternalBPMN_translator.g:3957:1: rule__Mqtt_data__Group__1 : rule__Mqtt_data__Group__1__Impl ;
    public final void rule__Mqtt_data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3961:1: ( rule__Mqtt_data__Group__1__Impl )
            // InternalBPMN_translator.g:3962:2: rule__Mqtt_data__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group__1__Impl();

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
    // $ANTLR end "rule__Mqtt_data__Group__1"


    // $ANTLR start "rule__Mqtt_data__Group__1__Impl"
    // InternalBPMN_translator.g:3968:1: rule__Mqtt_data__Group__1__Impl : ( ( rule__Mqtt_data__Alternatives_1 )* ) ;
    public final void rule__Mqtt_data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3972:1: ( ( ( rule__Mqtt_data__Alternatives_1 )* ) )
            // InternalBPMN_translator.g:3973:1: ( ( rule__Mqtt_data__Alternatives_1 )* )
            {
            // InternalBPMN_translator.g:3973:1: ( ( rule__Mqtt_data__Alternatives_1 )* )
            // InternalBPMN_translator.g:3974:2: ( rule__Mqtt_data__Alternatives_1 )*
            {
             before(grammarAccess.getMqtt_dataAccess().getAlternatives_1()); 
            // InternalBPMN_translator.g:3975:2: ( rule__Mqtt_data__Alternatives_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==44||(LA28_0>=50 && LA28_0<=54)||LA28_0==56) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalBPMN_translator.g:3975:3: rule__Mqtt_data__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__Mqtt_data__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getMqtt_dataAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Mqtt_data__Group__1__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_0__0"
    // InternalBPMN_translator.g:3984:1: rule__Mqtt_data__Group_1_0__0 : rule__Mqtt_data__Group_1_0__0__Impl rule__Mqtt_data__Group_1_0__1 ;
    public final void rule__Mqtt_data__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3988:1: ( rule__Mqtt_data__Group_1_0__0__Impl rule__Mqtt_data__Group_1_0__1 )
            // InternalBPMN_translator.g:3989:2: rule__Mqtt_data__Group_1_0__0__Impl rule__Mqtt_data__Group_1_0__1
            {
            pushFollow(FOLLOW_24);
            rule__Mqtt_data__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_0__1();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_0__0"


    // $ANTLR start "rule__Mqtt_data__Group_1_0__0__Impl"
    // InternalBPMN_translator.g:3996:1: rule__Mqtt_data__Group_1_0__0__Impl : ( 'NAME' ) ;
    public final void rule__Mqtt_data__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4000:1: ( ( 'NAME' ) )
            // InternalBPMN_translator.g:4001:1: ( 'NAME' )
            {
            // InternalBPMN_translator.g:4001:1: ( 'NAME' )
            // InternalBPMN_translator.g:4002:2: 'NAME'
            {
             before(grammarAccess.getMqtt_dataAccess().getNAMEKeyword_1_0_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getNAMEKeyword_1_0_0()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_0__0__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_0__1"
    // InternalBPMN_translator.g:4011:1: rule__Mqtt_data__Group_1_0__1 : rule__Mqtt_data__Group_1_0__1__Impl rule__Mqtt_data__Group_1_0__2 ;
    public final void rule__Mqtt_data__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4015:1: ( rule__Mqtt_data__Group_1_0__1__Impl rule__Mqtt_data__Group_1_0__2 )
            // InternalBPMN_translator.g:4016:2: rule__Mqtt_data__Group_1_0__1__Impl rule__Mqtt_data__Group_1_0__2
            {
            pushFollow(FOLLOW_7);
            rule__Mqtt_data__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_0__2();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_0__1"


    // $ANTLR start "rule__Mqtt_data__Group_1_0__1__Impl"
    // InternalBPMN_translator.g:4023:1: rule__Mqtt_data__Group_1_0__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4027:1: ( ( '=' ) )
            // InternalBPMN_translator.g:4028:1: ( '=' )
            {
            // InternalBPMN_translator.g:4028:1: ( '=' )
            // InternalBPMN_translator.g:4029:2: '='
            {
             before(grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_0_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_0_1()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_0__1__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_0__2"
    // InternalBPMN_translator.g:4038:1: rule__Mqtt_data__Group_1_0__2 : rule__Mqtt_data__Group_1_0__2__Impl ;
    public final void rule__Mqtt_data__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4042:1: ( rule__Mqtt_data__Group_1_0__2__Impl )
            // InternalBPMN_translator.g:4043:2: rule__Mqtt_data__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_0__2"


    // $ANTLR start "rule__Mqtt_data__Group_1_0__2__Impl"
    // InternalBPMN_translator.g:4049:1: rule__Mqtt_data__Group_1_0__2__Impl : ( ( rule__Mqtt_data__PnameAssignment_1_0_2 ) ) ;
    public final void rule__Mqtt_data__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4053:1: ( ( ( rule__Mqtt_data__PnameAssignment_1_0_2 ) ) )
            // InternalBPMN_translator.g:4054:1: ( ( rule__Mqtt_data__PnameAssignment_1_0_2 ) )
            {
            // InternalBPMN_translator.g:4054:1: ( ( rule__Mqtt_data__PnameAssignment_1_0_2 ) )
            // InternalBPMN_translator.g:4055:2: ( rule__Mqtt_data__PnameAssignment_1_0_2 )
            {
             before(grammarAccess.getMqtt_dataAccess().getPnameAssignment_1_0_2()); 
            // InternalBPMN_translator.g:4056:2: ( rule__Mqtt_data__PnameAssignment_1_0_2 )
            // InternalBPMN_translator.g:4056:3: rule__Mqtt_data__PnameAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Mqtt_data__PnameAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getMqtt_dataAccess().getPnameAssignment_1_0_2()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_0__2__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_1__0"
    // InternalBPMN_translator.g:4065:1: rule__Mqtt_data__Group_1_1__0 : rule__Mqtt_data__Group_1_1__0__Impl rule__Mqtt_data__Group_1_1__1 ;
    public final void rule__Mqtt_data__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4069:1: ( rule__Mqtt_data__Group_1_1__0__Impl rule__Mqtt_data__Group_1_1__1 )
            // InternalBPMN_translator.g:4070:2: rule__Mqtt_data__Group_1_1__0__Impl rule__Mqtt_data__Group_1_1__1
            {
            pushFollow(FOLLOW_24);
            rule__Mqtt_data__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_1__1();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_1__0"


    // $ANTLR start "rule__Mqtt_data__Group_1_1__0__Impl"
    // InternalBPMN_translator.g:4077:1: rule__Mqtt_data__Group_1_1__0__Impl : ( 'BROKER_USER' ) ;
    public final void rule__Mqtt_data__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4081:1: ( ( 'BROKER_USER' ) )
            // InternalBPMN_translator.g:4082:1: ( 'BROKER_USER' )
            {
            // InternalBPMN_translator.g:4082:1: ( 'BROKER_USER' )
            // InternalBPMN_translator.g:4083:2: 'BROKER_USER'
            {
             before(grammarAccess.getMqtt_dataAccess().getBROKER_USERKeyword_1_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getBROKER_USERKeyword_1_1_0()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_1__0__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_1__1"
    // InternalBPMN_translator.g:4092:1: rule__Mqtt_data__Group_1_1__1 : rule__Mqtt_data__Group_1_1__1__Impl rule__Mqtt_data__Group_1_1__2 ;
    public final void rule__Mqtt_data__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4096:1: ( rule__Mqtt_data__Group_1_1__1__Impl rule__Mqtt_data__Group_1_1__2 )
            // InternalBPMN_translator.g:4097:2: rule__Mqtt_data__Group_1_1__1__Impl rule__Mqtt_data__Group_1_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Mqtt_data__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_1__2();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_1__1"


    // $ANTLR start "rule__Mqtt_data__Group_1_1__1__Impl"
    // InternalBPMN_translator.g:4104:1: rule__Mqtt_data__Group_1_1__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4108:1: ( ( '=' ) )
            // InternalBPMN_translator.g:4109:1: ( '=' )
            {
            // InternalBPMN_translator.g:4109:1: ( '=' )
            // InternalBPMN_translator.g:4110:2: '='
            {
             before(grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_1_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_1_1()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_1__1__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_1__2"
    // InternalBPMN_translator.g:4119:1: rule__Mqtt_data__Group_1_1__2 : rule__Mqtt_data__Group_1_1__2__Impl ;
    public final void rule__Mqtt_data__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4123:1: ( rule__Mqtt_data__Group_1_1__2__Impl )
            // InternalBPMN_translator.g:4124:2: rule__Mqtt_data__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_1__2"


    // $ANTLR start "rule__Mqtt_data__Group_1_1__2__Impl"
    // InternalBPMN_translator.g:4130:1: rule__Mqtt_data__Group_1_1__2__Impl : ( ( rule__Mqtt_data__Broker_userAssignment_1_1_2 ) ) ;
    public final void rule__Mqtt_data__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4134:1: ( ( ( rule__Mqtt_data__Broker_userAssignment_1_1_2 ) ) )
            // InternalBPMN_translator.g:4135:1: ( ( rule__Mqtt_data__Broker_userAssignment_1_1_2 ) )
            {
            // InternalBPMN_translator.g:4135:1: ( ( rule__Mqtt_data__Broker_userAssignment_1_1_2 ) )
            // InternalBPMN_translator.g:4136:2: ( rule__Mqtt_data__Broker_userAssignment_1_1_2 )
            {
             before(grammarAccess.getMqtt_dataAccess().getBroker_userAssignment_1_1_2()); 
            // InternalBPMN_translator.g:4137:2: ( rule__Mqtt_data__Broker_userAssignment_1_1_2 )
            // InternalBPMN_translator.g:4137:3: rule__Mqtt_data__Broker_userAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Broker_userAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMqtt_dataAccess().getBroker_userAssignment_1_1_2()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_1__2__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_2__0"
    // InternalBPMN_translator.g:4146:1: rule__Mqtt_data__Group_1_2__0 : rule__Mqtt_data__Group_1_2__0__Impl rule__Mqtt_data__Group_1_2__1 ;
    public final void rule__Mqtt_data__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4150:1: ( rule__Mqtt_data__Group_1_2__0__Impl rule__Mqtt_data__Group_1_2__1 )
            // InternalBPMN_translator.g:4151:2: rule__Mqtt_data__Group_1_2__0__Impl rule__Mqtt_data__Group_1_2__1
            {
            pushFollow(FOLLOW_24);
            rule__Mqtt_data__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_2__1();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_2__0"


    // $ANTLR start "rule__Mqtt_data__Group_1_2__0__Impl"
    // InternalBPMN_translator.g:4158:1: rule__Mqtt_data__Group_1_2__0__Impl : ( 'BROKER_PASSWORD' ) ;
    public final void rule__Mqtt_data__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4162:1: ( ( 'BROKER_PASSWORD' ) )
            // InternalBPMN_translator.g:4163:1: ( 'BROKER_PASSWORD' )
            {
            // InternalBPMN_translator.g:4163:1: ( 'BROKER_PASSWORD' )
            // InternalBPMN_translator.g:4164:2: 'BROKER_PASSWORD'
            {
             before(grammarAccess.getMqtt_dataAccess().getBROKER_PASSWORDKeyword_1_2_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getBROKER_PASSWORDKeyword_1_2_0()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_2__0__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_2__1"
    // InternalBPMN_translator.g:4173:1: rule__Mqtt_data__Group_1_2__1 : rule__Mqtt_data__Group_1_2__1__Impl rule__Mqtt_data__Group_1_2__2 ;
    public final void rule__Mqtt_data__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4177:1: ( rule__Mqtt_data__Group_1_2__1__Impl rule__Mqtt_data__Group_1_2__2 )
            // InternalBPMN_translator.g:4178:2: rule__Mqtt_data__Group_1_2__1__Impl rule__Mqtt_data__Group_1_2__2
            {
            pushFollow(FOLLOW_7);
            rule__Mqtt_data__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_2__2();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_2__1"


    // $ANTLR start "rule__Mqtt_data__Group_1_2__1__Impl"
    // InternalBPMN_translator.g:4185:1: rule__Mqtt_data__Group_1_2__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4189:1: ( ( '=' ) )
            // InternalBPMN_translator.g:4190:1: ( '=' )
            {
            // InternalBPMN_translator.g:4190:1: ( '=' )
            // InternalBPMN_translator.g:4191:2: '='
            {
             before(grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_2_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_2_1()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_2__1__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_2__2"
    // InternalBPMN_translator.g:4200:1: rule__Mqtt_data__Group_1_2__2 : rule__Mqtt_data__Group_1_2__2__Impl ;
    public final void rule__Mqtt_data__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4204:1: ( rule__Mqtt_data__Group_1_2__2__Impl )
            // InternalBPMN_translator.g:4205:2: rule__Mqtt_data__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_2__2__Impl();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_2__2"


    // $ANTLR start "rule__Mqtt_data__Group_1_2__2__Impl"
    // InternalBPMN_translator.g:4211:1: rule__Mqtt_data__Group_1_2__2__Impl : ( ( rule__Mqtt_data__Broker_passwordAssignment_1_2_2 ) ) ;
    public final void rule__Mqtt_data__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4215:1: ( ( ( rule__Mqtt_data__Broker_passwordAssignment_1_2_2 ) ) )
            // InternalBPMN_translator.g:4216:1: ( ( rule__Mqtt_data__Broker_passwordAssignment_1_2_2 ) )
            {
            // InternalBPMN_translator.g:4216:1: ( ( rule__Mqtt_data__Broker_passwordAssignment_1_2_2 ) )
            // InternalBPMN_translator.g:4217:2: ( rule__Mqtt_data__Broker_passwordAssignment_1_2_2 )
            {
             before(grammarAccess.getMqtt_dataAccess().getBroker_passwordAssignment_1_2_2()); 
            // InternalBPMN_translator.g:4218:2: ( rule__Mqtt_data__Broker_passwordAssignment_1_2_2 )
            // InternalBPMN_translator.g:4218:3: rule__Mqtt_data__Broker_passwordAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Broker_passwordAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getMqtt_dataAccess().getBroker_passwordAssignment_1_2_2()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_2__2__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_3__0"
    // InternalBPMN_translator.g:4227:1: rule__Mqtt_data__Group_1_3__0 : rule__Mqtt_data__Group_1_3__0__Impl rule__Mqtt_data__Group_1_3__1 ;
    public final void rule__Mqtt_data__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4231:1: ( rule__Mqtt_data__Group_1_3__0__Impl rule__Mqtt_data__Group_1_3__1 )
            // InternalBPMN_translator.g:4232:2: rule__Mqtt_data__Group_1_3__0__Impl rule__Mqtt_data__Group_1_3__1
            {
            pushFollow(FOLLOW_24);
            rule__Mqtt_data__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_3__1();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_3__0"


    // $ANTLR start "rule__Mqtt_data__Group_1_3__0__Impl"
    // InternalBPMN_translator.g:4239:1: rule__Mqtt_data__Group_1_3__0__Impl : ( 'BROKER' ) ;
    public final void rule__Mqtt_data__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4243:1: ( ( 'BROKER' ) )
            // InternalBPMN_translator.g:4244:1: ( 'BROKER' )
            {
            // InternalBPMN_translator.g:4244:1: ( 'BROKER' )
            // InternalBPMN_translator.g:4245:2: 'BROKER'
            {
             before(grammarAccess.getMqtt_dataAccess().getBROKERKeyword_1_3_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getBROKERKeyword_1_3_0()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_3__0__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_3__1"
    // InternalBPMN_translator.g:4254:1: rule__Mqtt_data__Group_1_3__1 : rule__Mqtt_data__Group_1_3__1__Impl rule__Mqtt_data__Group_1_3__2 ;
    public final void rule__Mqtt_data__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4258:1: ( rule__Mqtt_data__Group_1_3__1__Impl rule__Mqtt_data__Group_1_3__2 )
            // InternalBPMN_translator.g:4259:2: rule__Mqtt_data__Group_1_3__1__Impl rule__Mqtt_data__Group_1_3__2
            {
            pushFollow(FOLLOW_7);
            rule__Mqtt_data__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_3__2();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_3__1"


    // $ANTLR start "rule__Mqtt_data__Group_1_3__1__Impl"
    // InternalBPMN_translator.g:4266:1: rule__Mqtt_data__Group_1_3__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4270:1: ( ( '=' ) )
            // InternalBPMN_translator.g:4271:1: ( '=' )
            {
            // InternalBPMN_translator.g:4271:1: ( '=' )
            // InternalBPMN_translator.g:4272:2: '='
            {
             before(grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_3_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_3_1()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_3__1__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_3__2"
    // InternalBPMN_translator.g:4281:1: rule__Mqtt_data__Group_1_3__2 : rule__Mqtt_data__Group_1_3__2__Impl ;
    public final void rule__Mqtt_data__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4285:1: ( rule__Mqtt_data__Group_1_3__2__Impl )
            // InternalBPMN_translator.g:4286:2: rule__Mqtt_data__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_3__2__Impl();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_3__2"


    // $ANTLR start "rule__Mqtt_data__Group_1_3__2__Impl"
    // InternalBPMN_translator.g:4292:1: rule__Mqtt_data__Group_1_3__2__Impl : ( ( rule__Mqtt_data__BrokerAssignment_1_3_2 ) ) ;
    public final void rule__Mqtt_data__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4296:1: ( ( ( rule__Mqtt_data__BrokerAssignment_1_3_2 ) ) )
            // InternalBPMN_translator.g:4297:1: ( ( rule__Mqtt_data__BrokerAssignment_1_3_2 ) )
            {
            // InternalBPMN_translator.g:4297:1: ( ( rule__Mqtt_data__BrokerAssignment_1_3_2 ) )
            // InternalBPMN_translator.g:4298:2: ( rule__Mqtt_data__BrokerAssignment_1_3_2 )
            {
             before(grammarAccess.getMqtt_dataAccess().getBrokerAssignment_1_3_2()); 
            // InternalBPMN_translator.g:4299:2: ( rule__Mqtt_data__BrokerAssignment_1_3_2 )
            // InternalBPMN_translator.g:4299:3: rule__Mqtt_data__BrokerAssignment_1_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Mqtt_data__BrokerAssignment_1_3_2();

            state._fsp--;


            }

             after(grammarAccess.getMqtt_dataAccess().getBrokerAssignment_1_3_2()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_3__2__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_4__0"
    // InternalBPMN_translator.g:4308:1: rule__Mqtt_data__Group_1_4__0 : rule__Mqtt_data__Group_1_4__0__Impl rule__Mqtt_data__Group_1_4__1 ;
    public final void rule__Mqtt_data__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4312:1: ( rule__Mqtt_data__Group_1_4__0__Impl rule__Mqtt_data__Group_1_4__1 )
            // InternalBPMN_translator.g:4313:2: rule__Mqtt_data__Group_1_4__0__Impl rule__Mqtt_data__Group_1_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Mqtt_data__Group_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_4__1();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_4__0"


    // $ANTLR start "rule__Mqtt_data__Group_1_4__0__Impl"
    // InternalBPMN_translator.g:4320:1: rule__Mqtt_data__Group_1_4__0__Impl : ( 'NETWORK' ) ;
    public final void rule__Mqtt_data__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4324:1: ( ( 'NETWORK' ) )
            // InternalBPMN_translator.g:4325:1: ( 'NETWORK' )
            {
            // InternalBPMN_translator.g:4325:1: ( 'NETWORK' )
            // InternalBPMN_translator.g:4326:2: 'NETWORK'
            {
             before(grammarAccess.getMqtt_dataAccess().getNETWORKKeyword_1_4_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getNETWORKKeyword_1_4_0()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_4__0__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_4__1"
    // InternalBPMN_translator.g:4335:1: rule__Mqtt_data__Group_1_4__1 : rule__Mqtt_data__Group_1_4__1__Impl rule__Mqtt_data__Group_1_4__2 ;
    public final void rule__Mqtt_data__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4339:1: ( rule__Mqtt_data__Group_1_4__1__Impl rule__Mqtt_data__Group_1_4__2 )
            // InternalBPMN_translator.g:4340:2: rule__Mqtt_data__Group_1_4__1__Impl rule__Mqtt_data__Group_1_4__2
            {
            pushFollow(FOLLOW_41);
            rule__Mqtt_data__Group_1_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_4__2();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_4__1"


    // $ANTLR start "rule__Mqtt_data__Group_1_4__1__Impl"
    // InternalBPMN_translator.g:4347:1: rule__Mqtt_data__Group_1_4__1__Impl : ( '{' ) ;
    public final void rule__Mqtt_data__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4351:1: ( ( '{' ) )
            // InternalBPMN_translator.g:4352:1: ( '{' )
            {
            // InternalBPMN_translator.g:4352:1: ( '{' )
            // InternalBPMN_translator.g:4353:2: '{'
            {
             before(grammarAccess.getMqtt_dataAccess().getLeftCurlyBracketKeyword_1_4_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getLeftCurlyBracketKeyword_1_4_1()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_4__1__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_4__2"
    // InternalBPMN_translator.g:4362:1: rule__Mqtt_data__Group_1_4__2 : rule__Mqtt_data__Group_1_4__2__Impl rule__Mqtt_data__Group_1_4__3 ;
    public final void rule__Mqtt_data__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4366:1: ( rule__Mqtt_data__Group_1_4__2__Impl rule__Mqtt_data__Group_1_4__3 )
            // InternalBPMN_translator.g:4367:2: rule__Mqtt_data__Group_1_4__2__Impl rule__Mqtt_data__Group_1_4__3
            {
            pushFollow(FOLLOW_41);
            rule__Mqtt_data__Group_1_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_4__3();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_4__2"


    // $ANTLR start "rule__Mqtt_data__Group_1_4__2__Impl"
    // InternalBPMN_translator.g:4374:1: rule__Mqtt_data__Group_1_4__2__Impl : ( ( rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 )* ) ;
    public final void rule__Mqtt_data__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4378:1: ( ( ( rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 )* ) )
            // InternalBPMN_translator.g:4379:1: ( ( rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 )* )
            {
            // InternalBPMN_translator.g:4379:1: ( ( rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 )* )
            // InternalBPMN_translator.g:4380:2: ( rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 )*
            {
             before(grammarAccess.getMqtt_dataAccess().getMqtt_network_dataAssignment_1_4_2()); 
            // InternalBPMN_translator.g:4381:2: ( rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==57) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalBPMN_translator.g:4381:3: rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getMqtt_dataAccess().getMqtt_network_dataAssignment_1_4_2()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_4__2__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_4__3"
    // InternalBPMN_translator.g:4389:1: rule__Mqtt_data__Group_1_4__3 : rule__Mqtt_data__Group_1_4__3__Impl ;
    public final void rule__Mqtt_data__Group_1_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4393:1: ( rule__Mqtt_data__Group_1_4__3__Impl )
            // InternalBPMN_translator.g:4394:2: rule__Mqtt_data__Group_1_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_4__3__Impl();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_4__3"


    // $ANTLR start "rule__Mqtt_data__Group_1_4__3__Impl"
    // InternalBPMN_translator.g:4400:1: rule__Mqtt_data__Group_1_4__3__Impl : ( '}' ) ;
    public final void rule__Mqtt_data__Group_1_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4404:1: ( ( '}' ) )
            // InternalBPMN_translator.g:4405:1: ( '}' )
            {
            // InternalBPMN_translator.g:4405:1: ( '}' )
            // InternalBPMN_translator.g:4406:2: '}'
            {
             before(grammarAccess.getMqtt_dataAccess().getRightCurlyBracketKeyword_1_4_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getRightCurlyBracketKeyword_1_4_3()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_4__3__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_5__0"
    // InternalBPMN_translator.g:4416:1: rule__Mqtt_data__Group_1_5__0 : rule__Mqtt_data__Group_1_5__0__Impl rule__Mqtt_data__Group_1_5__1 ;
    public final void rule__Mqtt_data__Group_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4420:1: ( rule__Mqtt_data__Group_1_5__0__Impl rule__Mqtt_data__Group_1_5__1 )
            // InternalBPMN_translator.g:4421:2: rule__Mqtt_data__Group_1_5__0__Impl rule__Mqtt_data__Group_1_5__1
            {
            pushFollow(FOLLOW_13);
            rule__Mqtt_data__Group_1_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_5__1();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_5__0"


    // $ANTLR start "rule__Mqtt_data__Group_1_5__0__Impl"
    // InternalBPMN_translator.g:4428:1: rule__Mqtt_data__Group_1_5__0__Impl : ( 'SUBTOPICS' ) ;
    public final void rule__Mqtt_data__Group_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4432:1: ( ( 'SUBTOPICS' ) )
            // InternalBPMN_translator.g:4433:1: ( 'SUBTOPICS' )
            {
            // InternalBPMN_translator.g:4433:1: ( 'SUBTOPICS' )
            // InternalBPMN_translator.g:4434:2: 'SUBTOPICS'
            {
             before(grammarAccess.getMqtt_dataAccess().getSUBTOPICSKeyword_1_5_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getSUBTOPICSKeyword_1_5_0()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_5__0__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_5__1"
    // InternalBPMN_translator.g:4443:1: rule__Mqtt_data__Group_1_5__1 : rule__Mqtt_data__Group_1_5__1__Impl rule__Mqtt_data__Group_1_5__2 ;
    public final void rule__Mqtt_data__Group_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4447:1: ( rule__Mqtt_data__Group_1_5__1__Impl rule__Mqtt_data__Group_1_5__2 )
            // InternalBPMN_translator.g:4448:2: rule__Mqtt_data__Group_1_5__1__Impl rule__Mqtt_data__Group_1_5__2
            {
            pushFollow(FOLLOW_44);
            rule__Mqtt_data__Group_1_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_5__2();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_5__1"


    // $ANTLR start "rule__Mqtt_data__Group_1_5__1__Impl"
    // InternalBPMN_translator.g:4455:1: rule__Mqtt_data__Group_1_5__1__Impl : ( '{' ) ;
    public final void rule__Mqtt_data__Group_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4459:1: ( ( '{' ) )
            // InternalBPMN_translator.g:4460:1: ( '{' )
            {
            // InternalBPMN_translator.g:4460:1: ( '{' )
            // InternalBPMN_translator.g:4461:2: '{'
            {
             before(grammarAccess.getMqtt_dataAccess().getLeftCurlyBracketKeyword_1_5_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getLeftCurlyBracketKeyword_1_5_1()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_5__1__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_5__2"
    // InternalBPMN_translator.g:4470:1: rule__Mqtt_data__Group_1_5__2 : rule__Mqtt_data__Group_1_5__2__Impl rule__Mqtt_data__Group_1_5__3 ;
    public final void rule__Mqtt_data__Group_1_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4474:1: ( rule__Mqtt_data__Group_1_5__2__Impl rule__Mqtt_data__Group_1_5__3 )
            // InternalBPMN_translator.g:4475:2: rule__Mqtt_data__Group_1_5__2__Impl rule__Mqtt_data__Group_1_5__3
            {
            pushFollow(FOLLOW_44);
            rule__Mqtt_data__Group_1_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_5__3();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_5__2"


    // $ANTLR start "rule__Mqtt_data__Group_1_5__2__Impl"
    // InternalBPMN_translator.g:4482:1: rule__Mqtt_data__Group_1_5__2__Impl : ( ( rule__Mqtt_data__Group_1_5_2__0 )* ) ;
    public final void rule__Mqtt_data__Group_1_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4486:1: ( ( ( rule__Mqtt_data__Group_1_5_2__0 )* ) )
            // InternalBPMN_translator.g:4487:1: ( ( rule__Mqtt_data__Group_1_5_2__0 )* )
            {
            // InternalBPMN_translator.g:4487:1: ( ( rule__Mqtt_data__Group_1_5_2__0 )* )
            // InternalBPMN_translator.g:4488:2: ( rule__Mqtt_data__Group_1_5_2__0 )*
            {
             before(grammarAccess.getMqtt_dataAccess().getGroup_1_5_2()); 
            // InternalBPMN_translator.g:4489:2: ( rule__Mqtt_data__Group_1_5_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==55) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalBPMN_translator.g:4489:3: rule__Mqtt_data__Group_1_5_2__0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__Mqtt_data__Group_1_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getMqtt_dataAccess().getGroup_1_5_2()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_5__2__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_5__3"
    // InternalBPMN_translator.g:4497:1: rule__Mqtt_data__Group_1_5__3 : rule__Mqtt_data__Group_1_5__3__Impl ;
    public final void rule__Mqtt_data__Group_1_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4501:1: ( rule__Mqtt_data__Group_1_5__3__Impl )
            // InternalBPMN_translator.g:4502:2: rule__Mqtt_data__Group_1_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_5__3__Impl();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_5__3"


    // $ANTLR start "rule__Mqtt_data__Group_1_5__3__Impl"
    // InternalBPMN_translator.g:4508:1: rule__Mqtt_data__Group_1_5__3__Impl : ( '}' ) ;
    public final void rule__Mqtt_data__Group_1_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4512:1: ( ( '}' ) )
            // InternalBPMN_translator.g:4513:1: ( '}' )
            {
            // InternalBPMN_translator.g:4513:1: ( '}' )
            // InternalBPMN_translator.g:4514:2: '}'
            {
             before(grammarAccess.getMqtt_dataAccess().getRightCurlyBracketKeyword_1_5_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getRightCurlyBracketKeyword_1_5_3()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_5__3__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_5_2__0"
    // InternalBPMN_translator.g:4524:1: rule__Mqtt_data__Group_1_5_2__0 : rule__Mqtt_data__Group_1_5_2__0__Impl rule__Mqtt_data__Group_1_5_2__1 ;
    public final void rule__Mqtt_data__Group_1_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4528:1: ( rule__Mqtt_data__Group_1_5_2__0__Impl rule__Mqtt_data__Group_1_5_2__1 )
            // InternalBPMN_translator.g:4529:2: rule__Mqtt_data__Group_1_5_2__0__Impl rule__Mqtt_data__Group_1_5_2__1
            {
            pushFollow(FOLLOW_24);
            rule__Mqtt_data__Group_1_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_5_2__1();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_5_2__0"


    // $ANTLR start "rule__Mqtt_data__Group_1_5_2__0__Impl"
    // InternalBPMN_translator.g:4536:1: rule__Mqtt_data__Group_1_5_2__0__Impl : ( 'TOPIC_NAME' ) ;
    public final void rule__Mqtt_data__Group_1_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4540:1: ( ( 'TOPIC_NAME' ) )
            // InternalBPMN_translator.g:4541:1: ( 'TOPIC_NAME' )
            {
            // InternalBPMN_translator.g:4541:1: ( 'TOPIC_NAME' )
            // InternalBPMN_translator.g:4542:2: 'TOPIC_NAME'
            {
             before(grammarAccess.getMqtt_dataAccess().getTOPIC_NAMEKeyword_1_5_2_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getTOPIC_NAMEKeyword_1_5_2_0()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_5_2__0__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_5_2__1"
    // InternalBPMN_translator.g:4551:1: rule__Mqtt_data__Group_1_5_2__1 : rule__Mqtt_data__Group_1_5_2__1__Impl rule__Mqtt_data__Group_1_5_2__2 ;
    public final void rule__Mqtt_data__Group_1_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4555:1: ( rule__Mqtt_data__Group_1_5_2__1__Impl rule__Mqtt_data__Group_1_5_2__2 )
            // InternalBPMN_translator.g:4556:2: rule__Mqtt_data__Group_1_5_2__1__Impl rule__Mqtt_data__Group_1_5_2__2
            {
            pushFollow(FOLLOW_7);
            rule__Mqtt_data__Group_1_5_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_5_2__2();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_5_2__1"


    // $ANTLR start "rule__Mqtt_data__Group_1_5_2__1__Impl"
    // InternalBPMN_translator.g:4563:1: rule__Mqtt_data__Group_1_5_2__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4567:1: ( ( '=' ) )
            // InternalBPMN_translator.g:4568:1: ( '=' )
            {
            // InternalBPMN_translator.g:4568:1: ( '=' )
            // InternalBPMN_translator.g:4569:2: '='
            {
             before(grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_5_2_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_5_2_1()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_5_2__1__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_5_2__2"
    // InternalBPMN_translator.g:4578:1: rule__Mqtt_data__Group_1_5_2__2 : rule__Mqtt_data__Group_1_5_2__2__Impl ;
    public final void rule__Mqtt_data__Group_1_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4582:1: ( rule__Mqtt_data__Group_1_5_2__2__Impl )
            // InternalBPMN_translator.g:4583:2: rule__Mqtt_data__Group_1_5_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_5_2__2__Impl();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_5_2__2"


    // $ANTLR start "rule__Mqtt_data__Group_1_5_2__2__Impl"
    // InternalBPMN_translator.g:4589:1: rule__Mqtt_data__Group_1_5_2__2__Impl : ( ( rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 ) ) ;
    public final void rule__Mqtt_data__Group_1_5_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4593:1: ( ( ( rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 ) ) )
            // InternalBPMN_translator.g:4594:1: ( ( rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 ) )
            {
            // InternalBPMN_translator.g:4594:1: ( ( rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 ) )
            // InternalBPMN_translator.g:4595:2: ( rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 )
            {
             before(grammarAccess.getMqtt_dataAccess().getSubtopicsAssignment_1_5_2_2()); 
            // InternalBPMN_translator.g:4596:2: ( rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 )
            // InternalBPMN_translator.g:4596:3: rule__Mqtt_data__SubtopicsAssignment_1_5_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Mqtt_data__SubtopicsAssignment_1_5_2_2();

            state._fsp--;


            }

             after(grammarAccess.getMqtt_dataAccess().getSubtopicsAssignment_1_5_2_2()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_5_2__2__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_6__0"
    // InternalBPMN_translator.g:4605:1: rule__Mqtt_data__Group_1_6__0 : rule__Mqtt_data__Group_1_6__0__Impl rule__Mqtt_data__Group_1_6__1 ;
    public final void rule__Mqtt_data__Group_1_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4609:1: ( rule__Mqtt_data__Group_1_6__0__Impl rule__Mqtt_data__Group_1_6__1 )
            // InternalBPMN_translator.g:4610:2: rule__Mqtt_data__Group_1_6__0__Impl rule__Mqtt_data__Group_1_6__1
            {
            pushFollow(FOLLOW_13);
            rule__Mqtt_data__Group_1_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_6__1();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_6__0"


    // $ANTLR start "rule__Mqtt_data__Group_1_6__0__Impl"
    // InternalBPMN_translator.g:4617:1: rule__Mqtt_data__Group_1_6__0__Impl : ( 'PUBTOPICS' ) ;
    public final void rule__Mqtt_data__Group_1_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4621:1: ( ( 'PUBTOPICS' ) )
            // InternalBPMN_translator.g:4622:1: ( 'PUBTOPICS' )
            {
            // InternalBPMN_translator.g:4622:1: ( 'PUBTOPICS' )
            // InternalBPMN_translator.g:4623:2: 'PUBTOPICS'
            {
             before(grammarAccess.getMqtt_dataAccess().getPUBTOPICSKeyword_1_6_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getPUBTOPICSKeyword_1_6_0()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_6__0__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_6__1"
    // InternalBPMN_translator.g:4632:1: rule__Mqtt_data__Group_1_6__1 : rule__Mqtt_data__Group_1_6__1__Impl rule__Mqtt_data__Group_1_6__2 ;
    public final void rule__Mqtt_data__Group_1_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4636:1: ( rule__Mqtt_data__Group_1_6__1__Impl rule__Mqtt_data__Group_1_6__2 )
            // InternalBPMN_translator.g:4637:2: rule__Mqtt_data__Group_1_6__1__Impl rule__Mqtt_data__Group_1_6__2
            {
            pushFollow(FOLLOW_46);
            rule__Mqtt_data__Group_1_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_6__2();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_6__1"


    // $ANTLR start "rule__Mqtt_data__Group_1_6__1__Impl"
    // InternalBPMN_translator.g:4644:1: rule__Mqtt_data__Group_1_6__1__Impl : ( '{' ) ;
    public final void rule__Mqtt_data__Group_1_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4648:1: ( ( '{' ) )
            // InternalBPMN_translator.g:4649:1: ( '{' )
            {
            // InternalBPMN_translator.g:4649:1: ( '{' )
            // InternalBPMN_translator.g:4650:2: '{'
            {
             before(grammarAccess.getMqtt_dataAccess().getLeftCurlyBracketKeyword_1_6_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getLeftCurlyBracketKeyword_1_6_1()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_6__1__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_6__2"
    // InternalBPMN_translator.g:4659:1: rule__Mqtt_data__Group_1_6__2 : rule__Mqtt_data__Group_1_6__2__Impl rule__Mqtt_data__Group_1_6__3 ;
    public final void rule__Mqtt_data__Group_1_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4663:1: ( rule__Mqtt_data__Group_1_6__2__Impl rule__Mqtt_data__Group_1_6__3 )
            // InternalBPMN_translator.g:4664:2: rule__Mqtt_data__Group_1_6__2__Impl rule__Mqtt_data__Group_1_6__3
            {
            pushFollow(FOLLOW_46);
            rule__Mqtt_data__Group_1_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_6__3();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_6__2"


    // $ANTLR start "rule__Mqtt_data__Group_1_6__2__Impl"
    // InternalBPMN_translator.g:4671:1: rule__Mqtt_data__Group_1_6__2__Impl : ( ( rule__Mqtt_data__Alternatives_1_6_2 )* ) ;
    public final void rule__Mqtt_data__Group_1_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4675:1: ( ( ( rule__Mqtt_data__Alternatives_1_6_2 )* ) )
            // InternalBPMN_translator.g:4676:1: ( ( rule__Mqtt_data__Alternatives_1_6_2 )* )
            {
            // InternalBPMN_translator.g:4676:1: ( ( rule__Mqtt_data__Alternatives_1_6_2 )* )
            // InternalBPMN_translator.g:4677:2: ( rule__Mqtt_data__Alternatives_1_6_2 )*
            {
             before(grammarAccess.getMqtt_dataAccess().getAlternatives_1_6_2()); 
            // InternalBPMN_translator.g:4678:2: ( rule__Mqtt_data__Alternatives_1_6_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==49||LA31_0==55) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalBPMN_translator.g:4678:3: rule__Mqtt_data__Alternatives_1_6_2
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__Mqtt_data__Alternatives_1_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getMqtt_dataAccess().getAlternatives_1_6_2()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_6__2__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_6__3"
    // InternalBPMN_translator.g:4686:1: rule__Mqtt_data__Group_1_6__3 : rule__Mqtt_data__Group_1_6__3__Impl ;
    public final void rule__Mqtt_data__Group_1_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4690:1: ( rule__Mqtt_data__Group_1_6__3__Impl )
            // InternalBPMN_translator.g:4691:2: rule__Mqtt_data__Group_1_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_6__3__Impl();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_6__3"


    // $ANTLR start "rule__Mqtt_data__Group_1_6__3__Impl"
    // InternalBPMN_translator.g:4697:1: rule__Mqtt_data__Group_1_6__3__Impl : ( '}' ) ;
    public final void rule__Mqtt_data__Group_1_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4701:1: ( ( '}' ) )
            // InternalBPMN_translator.g:4702:1: ( '}' )
            {
            // InternalBPMN_translator.g:4702:1: ( '}' )
            // InternalBPMN_translator.g:4703:2: '}'
            {
             before(grammarAccess.getMqtt_dataAccess().getRightCurlyBracketKeyword_1_6_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getRightCurlyBracketKeyword_1_6_3()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_6__3__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_6_2_0__0"
    // InternalBPMN_translator.g:4713:1: rule__Mqtt_data__Group_1_6_2_0__0 : rule__Mqtt_data__Group_1_6_2_0__0__Impl rule__Mqtt_data__Group_1_6_2_0__1 ;
    public final void rule__Mqtt_data__Group_1_6_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4717:1: ( rule__Mqtt_data__Group_1_6_2_0__0__Impl rule__Mqtt_data__Group_1_6_2_0__1 )
            // InternalBPMN_translator.g:4718:2: rule__Mqtt_data__Group_1_6_2_0__0__Impl rule__Mqtt_data__Group_1_6_2_0__1
            {
            pushFollow(FOLLOW_24);
            rule__Mqtt_data__Group_1_6_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_6_2_0__1();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_6_2_0__0"


    // $ANTLR start "rule__Mqtt_data__Group_1_6_2_0__0__Impl"
    // InternalBPMN_translator.g:4725:1: rule__Mqtt_data__Group_1_6_2_0__0__Impl : ( 'TOPIC_NAME' ) ;
    public final void rule__Mqtt_data__Group_1_6_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4729:1: ( ( 'TOPIC_NAME' ) )
            // InternalBPMN_translator.g:4730:1: ( 'TOPIC_NAME' )
            {
            // InternalBPMN_translator.g:4730:1: ( 'TOPIC_NAME' )
            // InternalBPMN_translator.g:4731:2: 'TOPIC_NAME'
            {
             before(grammarAccess.getMqtt_dataAccess().getTOPIC_NAMEKeyword_1_6_2_0_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getTOPIC_NAMEKeyword_1_6_2_0_0()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_6_2_0__0__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_6_2_0__1"
    // InternalBPMN_translator.g:4740:1: rule__Mqtt_data__Group_1_6_2_0__1 : rule__Mqtt_data__Group_1_6_2_0__1__Impl rule__Mqtt_data__Group_1_6_2_0__2 ;
    public final void rule__Mqtt_data__Group_1_6_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4744:1: ( rule__Mqtt_data__Group_1_6_2_0__1__Impl rule__Mqtt_data__Group_1_6_2_0__2 )
            // InternalBPMN_translator.g:4745:2: rule__Mqtt_data__Group_1_6_2_0__1__Impl rule__Mqtt_data__Group_1_6_2_0__2
            {
            pushFollow(FOLLOW_7);
            rule__Mqtt_data__Group_1_6_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_6_2_0__2();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_6_2_0__1"


    // $ANTLR start "rule__Mqtt_data__Group_1_6_2_0__1__Impl"
    // InternalBPMN_translator.g:4752:1: rule__Mqtt_data__Group_1_6_2_0__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_6_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4756:1: ( ( '=' ) )
            // InternalBPMN_translator.g:4757:1: ( '=' )
            {
            // InternalBPMN_translator.g:4757:1: ( '=' )
            // InternalBPMN_translator.g:4758:2: '='
            {
             before(grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_6_2_0_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_6_2_0_1()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_6_2_0__1__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_6_2_0__2"
    // InternalBPMN_translator.g:4767:1: rule__Mqtt_data__Group_1_6_2_0__2 : rule__Mqtt_data__Group_1_6_2_0__2__Impl ;
    public final void rule__Mqtt_data__Group_1_6_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4771:1: ( rule__Mqtt_data__Group_1_6_2_0__2__Impl )
            // InternalBPMN_translator.g:4772:2: rule__Mqtt_data__Group_1_6_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_6_2_0__2__Impl();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_6_2_0__2"


    // $ANTLR start "rule__Mqtt_data__Group_1_6_2_0__2__Impl"
    // InternalBPMN_translator.g:4778:1: rule__Mqtt_data__Group_1_6_2_0__2__Impl : ( ( rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 )* ) ;
    public final void rule__Mqtt_data__Group_1_6_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4782:1: ( ( ( rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 )* ) )
            // InternalBPMN_translator.g:4783:1: ( ( rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 )* )
            {
            // InternalBPMN_translator.g:4783:1: ( ( rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 )* )
            // InternalBPMN_translator.g:4784:2: ( rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 )*
            {
             before(grammarAccess.getMqtt_dataAccess().getPubtopicsAssignment_1_6_2_0_2()); 
            // InternalBPMN_translator.g:4785:2: ( rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_STRING) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalBPMN_translator.g:4785:3: rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getMqtt_dataAccess().getPubtopicsAssignment_1_6_2_0_2()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_6_2_0__2__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_6_2_1__0"
    // InternalBPMN_translator.g:4794:1: rule__Mqtt_data__Group_1_6_2_1__0 : rule__Mqtt_data__Group_1_6_2_1__0__Impl rule__Mqtt_data__Group_1_6_2_1__1 ;
    public final void rule__Mqtt_data__Group_1_6_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4798:1: ( rule__Mqtt_data__Group_1_6_2_1__0__Impl rule__Mqtt_data__Group_1_6_2_1__1 )
            // InternalBPMN_translator.g:4799:2: rule__Mqtt_data__Group_1_6_2_1__0__Impl rule__Mqtt_data__Group_1_6_2_1__1
            {
            pushFollow(FOLLOW_24);
            rule__Mqtt_data__Group_1_6_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_6_2_1__1();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_6_2_1__0"


    // $ANTLR start "rule__Mqtt_data__Group_1_6_2_1__0__Impl"
    // InternalBPMN_translator.g:4806:1: rule__Mqtt_data__Group_1_6_2_1__0__Impl : ( 'DATA' ) ;
    public final void rule__Mqtt_data__Group_1_6_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4810:1: ( ( 'DATA' ) )
            // InternalBPMN_translator.g:4811:1: ( 'DATA' )
            {
            // InternalBPMN_translator.g:4811:1: ( 'DATA' )
            // InternalBPMN_translator.g:4812:2: 'DATA'
            {
             before(grammarAccess.getMqtt_dataAccess().getDATAKeyword_1_6_2_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getDATAKeyword_1_6_2_1_0()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_6_2_1__0__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_6_2_1__1"
    // InternalBPMN_translator.g:4821:1: rule__Mqtt_data__Group_1_6_2_1__1 : rule__Mqtt_data__Group_1_6_2_1__1__Impl rule__Mqtt_data__Group_1_6_2_1__2 ;
    public final void rule__Mqtt_data__Group_1_6_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4825:1: ( rule__Mqtt_data__Group_1_6_2_1__1__Impl rule__Mqtt_data__Group_1_6_2_1__2 )
            // InternalBPMN_translator.g:4826:2: rule__Mqtt_data__Group_1_6_2_1__1__Impl rule__Mqtt_data__Group_1_6_2_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Mqtt_data__Group_1_6_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_6_2_1__2();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_6_2_1__1"


    // $ANTLR start "rule__Mqtt_data__Group_1_6_2_1__1__Impl"
    // InternalBPMN_translator.g:4833:1: rule__Mqtt_data__Group_1_6_2_1__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_6_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4837:1: ( ( '=' ) )
            // InternalBPMN_translator.g:4838:1: ( '=' )
            {
            // InternalBPMN_translator.g:4838:1: ( '=' )
            // InternalBPMN_translator.g:4839:2: '='
            {
             before(grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_6_2_1_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_6_2_1_1()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_6_2_1__1__Impl"


    // $ANTLR start "rule__Mqtt_data__Group_1_6_2_1__2"
    // InternalBPMN_translator.g:4848:1: rule__Mqtt_data__Group_1_6_2_1__2 : rule__Mqtt_data__Group_1_6_2_1__2__Impl ;
    public final void rule__Mqtt_data__Group_1_6_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4852:1: ( rule__Mqtt_data__Group_1_6_2_1__2__Impl )
            // InternalBPMN_translator.g:4853:2: rule__Mqtt_data__Group_1_6_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mqtt_data__Group_1_6_2_1__2__Impl();

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
    // $ANTLR end "rule__Mqtt_data__Group_1_6_2_1__2"


    // $ANTLR start "rule__Mqtt_data__Group_1_6_2_1__2__Impl"
    // InternalBPMN_translator.g:4859:1: rule__Mqtt_data__Group_1_6_2_1__2__Impl : ( ( rule__Mqtt_data__ValueAssignment_1_6_2_1_2 ) ) ;
    public final void rule__Mqtt_data__Group_1_6_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4863:1: ( ( ( rule__Mqtt_data__ValueAssignment_1_6_2_1_2 ) ) )
            // InternalBPMN_translator.g:4864:1: ( ( rule__Mqtt_data__ValueAssignment_1_6_2_1_2 ) )
            {
            // InternalBPMN_translator.g:4864:1: ( ( rule__Mqtt_data__ValueAssignment_1_6_2_1_2 ) )
            // InternalBPMN_translator.g:4865:2: ( rule__Mqtt_data__ValueAssignment_1_6_2_1_2 )
            {
             before(grammarAccess.getMqtt_dataAccess().getValueAssignment_1_6_2_1_2()); 
            // InternalBPMN_translator.g:4866:2: ( rule__Mqtt_data__ValueAssignment_1_6_2_1_2 )
            // InternalBPMN_translator.g:4866:3: rule__Mqtt_data__ValueAssignment_1_6_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Mqtt_data__ValueAssignment_1_6_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMqtt_dataAccess().getValueAssignment_1_6_2_1_2()); 

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
    // $ANTLR end "rule__Mqtt_data__Group_1_6_2_1__2__Impl"


    // $ANTLR start "rule__Mqtt_network_data__Group__0"
    // InternalBPMN_translator.g:4875:1: rule__Mqtt_network_data__Group__0 : rule__Mqtt_network_data__Group__0__Impl rule__Mqtt_network_data__Group__1 ;
    public final void rule__Mqtt_network_data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4879:1: ( rule__Mqtt_network_data__Group__0__Impl rule__Mqtt_network_data__Group__1 )
            // InternalBPMN_translator.g:4880:2: rule__Mqtt_network_data__Group__0__Impl rule__Mqtt_network_data__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Mqtt_network_data__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_network_data__Group__1();

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
    // $ANTLR end "rule__Mqtt_network_data__Group__0"


    // $ANTLR start "rule__Mqtt_network_data__Group__0__Impl"
    // InternalBPMN_translator.g:4887:1: rule__Mqtt_network_data__Group__0__Impl : ( 'SSID' ) ;
    public final void rule__Mqtt_network_data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4891:1: ( ( 'SSID' ) )
            // InternalBPMN_translator.g:4892:1: ( 'SSID' )
            {
            // InternalBPMN_translator.g:4892:1: ( 'SSID' )
            // InternalBPMN_translator.g:4893:2: 'SSID'
            {
             before(grammarAccess.getMqtt_network_dataAccess().getSSIDKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getMqtt_network_dataAccess().getSSIDKeyword_0()); 

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
    // $ANTLR end "rule__Mqtt_network_data__Group__0__Impl"


    // $ANTLR start "rule__Mqtt_network_data__Group__1"
    // InternalBPMN_translator.g:4902:1: rule__Mqtt_network_data__Group__1 : rule__Mqtt_network_data__Group__1__Impl rule__Mqtt_network_data__Group__2 ;
    public final void rule__Mqtt_network_data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4906:1: ( rule__Mqtt_network_data__Group__1__Impl rule__Mqtt_network_data__Group__2 )
            // InternalBPMN_translator.g:4907:2: rule__Mqtt_network_data__Group__1__Impl rule__Mqtt_network_data__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Mqtt_network_data__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_network_data__Group__2();

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
    // $ANTLR end "rule__Mqtt_network_data__Group__1"


    // $ANTLR start "rule__Mqtt_network_data__Group__1__Impl"
    // InternalBPMN_translator.g:4914:1: rule__Mqtt_network_data__Group__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_network_data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4918:1: ( ( '=' ) )
            // InternalBPMN_translator.g:4919:1: ( '=' )
            {
            // InternalBPMN_translator.g:4919:1: ( '=' )
            // InternalBPMN_translator.g:4920:2: '='
            {
             before(grammarAccess.getMqtt_network_dataAccess().getEqualsSignKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMqtt_network_dataAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Mqtt_network_data__Group__1__Impl"


    // $ANTLR start "rule__Mqtt_network_data__Group__2"
    // InternalBPMN_translator.g:4929:1: rule__Mqtt_network_data__Group__2 : rule__Mqtt_network_data__Group__2__Impl rule__Mqtt_network_data__Group__3 ;
    public final void rule__Mqtt_network_data__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4933:1: ( rule__Mqtt_network_data__Group__2__Impl rule__Mqtt_network_data__Group__3 )
            // InternalBPMN_translator.g:4934:2: rule__Mqtt_network_data__Group__2__Impl rule__Mqtt_network_data__Group__3
            {
            pushFollow(FOLLOW_49);
            rule__Mqtt_network_data__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_network_data__Group__3();

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
    // $ANTLR end "rule__Mqtt_network_data__Group__2"


    // $ANTLR start "rule__Mqtt_network_data__Group__2__Impl"
    // InternalBPMN_translator.g:4941:1: rule__Mqtt_network_data__Group__2__Impl : ( ( rule__Mqtt_network_data__SsidAssignment_2 ) ) ;
    public final void rule__Mqtt_network_data__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4945:1: ( ( ( rule__Mqtt_network_data__SsidAssignment_2 ) ) )
            // InternalBPMN_translator.g:4946:1: ( ( rule__Mqtt_network_data__SsidAssignment_2 ) )
            {
            // InternalBPMN_translator.g:4946:1: ( ( rule__Mqtt_network_data__SsidAssignment_2 ) )
            // InternalBPMN_translator.g:4947:2: ( rule__Mqtt_network_data__SsidAssignment_2 )
            {
             before(grammarAccess.getMqtt_network_dataAccess().getSsidAssignment_2()); 
            // InternalBPMN_translator.g:4948:2: ( rule__Mqtt_network_data__SsidAssignment_2 )
            // InternalBPMN_translator.g:4948:3: rule__Mqtt_network_data__SsidAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Mqtt_network_data__SsidAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMqtt_network_dataAccess().getSsidAssignment_2()); 

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
    // $ANTLR end "rule__Mqtt_network_data__Group__2__Impl"


    // $ANTLR start "rule__Mqtt_network_data__Group__3"
    // InternalBPMN_translator.g:4956:1: rule__Mqtt_network_data__Group__3 : rule__Mqtt_network_data__Group__3__Impl rule__Mqtt_network_data__Group__4 ;
    public final void rule__Mqtt_network_data__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4960:1: ( rule__Mqtt_network_data__Group__3__Impl rule__Mqtt_network_data__Group__4 )
            // InternalBPMN_translator.g:4961:2: rule__Mqtt_network_data__Group__3__Impl rule__Mqtt_network_data__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Mqtt_network_data__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_network_data__Group__4();

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
    // $ANTLR end "rule__Mqtt_network_data__Group__3"


    // $ANTLR start "rule__Mqtt_network_data__Group__3__Impl"
    // InternalBPMN_translator.g:4968:1: rule__Mqtt_network_data__Group__3__Impl : ( 'PASSWORD' ) ;
    public final void rule__Mqtt_network_data__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4972:1: ( ( 'PASSWORD' ) )
            // InternalBPMN_translator.g:4973:1: ( 'PASSWORD' )
            {
            // InternalBPMN_translator.g:4973:1: ( 'PASSWORD' )
            // InternalBPMN_translator.g:4974:2: 'PASSWORD'
            {
             before(grammarAccess.getMqtt_network_dataAccess().getPASSWORDKeyword_3()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getMqtt_network_dataAccess().getPASSWORDKeyword_3()); 

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
    // $ANTLR end "rule__Mqtt_network_data__Group__3__Impl"


    // $ANTLR start "rule__Mqtt_network_data__Group__4"
    // InternalBPMN_translator.g:4983:1: rule__Mqtt_network_data__Group__4 : rule__Mqtt_network_data__Group__4__Impl rule__Mqtt_network_data__Group__5 ;
    public final void rule__Mqtt_network_data__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4987:1: ( rule__Mqtt_network_data__Group__4__Impl rule__Mqtt_network_data__Group__5 )
            // InternalBPMN_translator.g:4988:2: rule__Mqtt_network_data__Group__4__Impl rule__Mqtt_network_data__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Mqtt_network_data__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_network_data__Group__5();

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
    // $ANTLR end "rule__Mqtt_network_data__Group__4"


    // $ANTLR start "rule__Mqtt_network_data__Group__4__Impl"
    // InternalBPMN_translator.g:4995:1: rule__Mqtt_network_data__Group__4__Impl : ( '=' ) ;
    public final void rule__Mqtt_network_data__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4999:1: ( ( '=' ) )
            // InternalBPMN_translator.g:5000:1: ( '=' )
            {
            // InternalBPMN_translator.g:5000:1: ( '=' )
            // InternalBPMN_translator.g:5001:2: '='
            {
             before(grammarAccess.getMqtt_network_dataAccess().getEqualsSignKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMqtt_network_dataAccess().getEqualsSignKeyword_4()); 

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
    // $ANTLR end "rule__Mqtt_network_data__Group__4__Impl"


    // $ANTLR start "rule__Mqtt_network_data__Group__5"
    // InternalBPMN_translator.g:5010:1: rule__Mqtt_network_data__Group__5 : rule__Mqtt_network_data__Group__5__Impl ;
    public final void rule__Mqtt_network_data__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5014:1: ( rule__Mqtt_network_data__Group__5__Impl )
            // InternalBPMN_translator.g:5015:2: rule__Mqtt_network_data__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mqtt_network_data__Group__5__Impl();

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
    // $ANTLR end "rule__Mqtt_network_data__Group__5"


    // $ANTLR start "rule__Mqtt_network_data__Group__5__Impl"
    // InternalBPMN_translator.g:5021:1: rule__Mqtt_network_data__Group__5__Impl : ( ( rule__Mqtt_network_data__PasswordAssignment_5 ) ) ;
    public final void rule__Mqtt_network_data__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5025:1: ( ( ( rule__Mqtt_network_data__PasswordAssignment_5 ) ) )
            // InternalBPMN_translator.g:5026:1: ( ( rule__Mqtt_network_data__PasswordAssignment_5 ) )
            {
            // InternalBPMN_translator.g:5026:1: ( ( rule__Mqtt_network_data__PasswordAssignment_5 ) )
            // InternalBPMN_translator.g:5027:2: ( rule__Mqtt_network_data__PasswordAssignment_5 )
            {
             before(grammarAccess.getMqtt_network_dataAccess().getPasswordAssignment_5()); 
            // InternalBPMN_translator.g:5028:2: ( rule__Mqtt_network_data__PasswordAssignment_5 )
            // InternalBPMN_translator.g:5028:3: rule__Mqtt_network_data__PasswordAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Mqtt_network_data__PasswordAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMqtt_network_dataAccess().getPasswordAssignment_5()); 

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
    // $ANTLR end "rule__Mqtt_network_data__Group__5__Impl"


    // $ANTLR start "rule__Protocol_device__Group__0"
    // InternalBPMN_translator.g:5037:1: rule__Protocol_device__Group__0 : rule__Protocol_device__Group__0__Impl rule__Protocol_device__Group__1 ;
    public final void rule__Protocol_device__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5041:1: ( rule__Protocol_device__Group__0__Impl rule__Protocol_device__Group__1 )
            // InternalBPMN_translator.g:5042:2: rule__Protocol_device__Group__0__Impl rule__Protocol_device__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Protocol_device__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol_device__Group__1();

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
    // $ANTLR end "rule__Protocol_device__Group__0"


    // $ANTLR start "rule__Protocol_device__Group__0__Impl"
    // InternalBPMN_translator.g:5049:1: rule__Protocol_device__Group__0__Impl : ( 'PROTOCOL_DEVICE' ) ;
    public final void rule__Protocol_device__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5053:1: ( ( 'PROTOCOL_DEVICE' ) )
            // InternalBPMN_translator.g:5054:1: ( 'PROTOCOL_DEVICE' )
            {
            // InternalBPMN_translator.g:5054:1: ( 'PROTOCOL_DEVICE' )
            // InternalBPMN_translator.g:5055:2: 'PROTOCOL_DEVICE'
            {
             before(grammarAccess.getProtocol_deviceAccess().getPROTOCOL_DEVICEKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getProtocol_deviceAccess().getPROTOCOL_DEVICEKeyword_0()); 

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
    // $ANTLR end "rule__Protocol_device__Group__0__Impl"


    // $ANTLR start "rule__Protocol_device__Group__1"
    // InternalBPMN_translator.g:5064:1: rule__Protocol_device__Group__1 : rule__Protocol_device__Group__1__Impl rule__Protocol_device__Group__2 ;
    public final void rule__Protocol_device__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5068:1: ( rule__Protocol_device__Group__1__Impl rule__Protocol_device__Group__2 )
            // InternalBPMN_translator.g:5069:2: rule__Protocol_device__Group__1__Impl rule__Protocol_device__Group__2
            {
            pushFollow(FOLLOW_50);
            rule__Protocol_device__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol_device__Group__2();

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
    // $ANTLR end "rule__Protocol_device__Group__1"


    // $ANTLR start "rule__Protocol_device__Group__1__Impl"
    // InternalBPMN_translator.g:5076:1: rule__Protocol_device__Group__1__Impl : ( '{' ) ;
    public final void rule__Protocol_device__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5080:1: ( ( '{' ) )
            // InternalBPMN_translator.g:5081:1: ( '{' )
            {
            // InternalBPMN_translator.g:5081:1: ( '{' )
            // InternalBPMN_translator.g:5082:2: '{'
            {
             before(grammarAccess.getProtocol_deviceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getProtocol_deviceAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Protocol_device__Group__1__Impl"


    // $ANTLR start "rule__Protocol_device__Group__2"
    // InternalBPMN_translator.g:5091:1: rule__Protocol_device__Group__2 : rule__Protocol_device__Group__2__Impl rule__Protocol_device__Group__3 ;
    public final void rule__Protocol_device__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5095:1: ( rule__Protocol_device__Group__2__Impl rule__Protocol_device__Group__3 )
            // InternalBPMN_translator.g:5096:2: rule__Protocol_device__Group__2__Impl rule__Protocol_device__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Protocol_device__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol_device__Group__3();

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
    // $ANTLR end "rule__Protocol_device__Group__2"


    // $ANTLR start "rule__Protocol_device__Group__2__Impl"
    // InternalBPMN_translator.g:5103:1: rule__Protocol_device__Group__2__Impl : ( 'NAME' ) ;
    public final void rule__Protocol_device__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5107:1: ( ( 'NAME' ) )
            // InternalBPMN_translator.g:5108:1: ( 'NAME' )
            {
            // InternalBPMN_translator.g:5108:1: ( 'NAME' )
            // InternalBPMN_translator.g:5109:2: 'NAME'
            {
             before(grammarAccess.getProtocol_deviceAccess().getNAMEKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getProtocol_deviceAccess().getNAMEKeyword_2()); 

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
    // $ANTLR end "rule__Protocol_device__Group__2__Impl"


    // $ANTLR start "rule__Protocol_device__Group__3"
    // InternalBPMN_translator.g:5118:1: rule__Protocol_device__Group__3 : rule__Protocol_device__Group__3__Impl rule__Protocol_device__Group__4 ;
    public final void rule__Protocol_device__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5122:1: ( rule__Protocol_device__Group__3__Impl rule__Protocol_device__Group__4 )
            // InternalBPMN_translator.g:5123:2: rule__Protocol_device__Group__3__Impl rule__Protocol_device__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Protocol_device__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol_device__Group__4();

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
    // $ANTLR end "rule__Protocol_device__Group__3"


    // $ANTLR start "rule__Protocol_device__Group__3__Impl"
    // InternalBPMN_translator.g:5130:1: rule__Protocol_device__Group__3__Impl : ( '=' ) ;
    public final void rule__Protocol_device__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5134:1: ( ( '=' ) )
            // InternalBPMN_translator.g:5135:1: ( '=' )
            {
            // InternalBPMN_translator.g:5135:1: ( '=' )
            // InternalBPMN_translator.g:5136:2: '='
            {
             before(grammarAccess.getProtocol_deviceAccess().getEqualsSignKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProtocol_deviceAccess().getEqualsSignKeyword_3()); 

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
    // $ANTLR end "rule__Protocol_device__Group__3__Impl"


    // $ANTLR start "rule__Protocol_device__Group__4"
    // InternalBPMN_translator.g:5145:1: rule__Protocol_device__Group__4 : rule__Protocol_device__Group__4__Impl rule__Protocol_device__Group__5 ;
    public final void rule__Protocol_device__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5149:1: ( rule__Protocol_device__Group__4__Impl rule__Protocol_device__Group__5 )
            // InternalBPMN_translator.g:5150:2: rule__Protocol_device__Group__4__Impl rule__Protocol_device__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Protocol_device__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol_device__Group__5();

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
    // $ANTLR end "rule__Protocol_device__Group__4"


    // $ANTLR start "rule__Protocol_device__Group__4__Impl"
    // InternalBPMN_translator.g:5157:1: rule__Protocol_device__Group__4__Impl : ( ( rule__Protocol_device__DnameAssignment_4 ) ) ;
    public final void rule__Protocol_device__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5161:1: ( ( ( rule__Protocol_device__DnameAssignment_4 ) ) )
            // InternalBPMN_translator.g:5162:1: ( ( rule__Protocol_device__DnameAssignment_4 ) )
            {
            // InternalBPMN_translator.g:5162:1: ( ( rule__Protocol_device__DnameAssignment_4 ) )
            // InternalBPMN_translator.g:5163:2: ( rule__Protocol_device__DnameAssignment_4 )
            {
             before(grammarAccess.getProtocol_deviceAccess().getDnameAssignment_4()); 
            // InternalBPMN_translator.g:5164:2: ( rule__Protocol_device__DnameAssignment_4 )
            // InternalBPMN_translator.g:5164:3: rule__Protocol_device__DnameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Protocol_device__DnameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProtocol_deviceAccess().getDnameAssignment_4()); 

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
    // $ANTLR end "rule__Protocol_device__Group__4__Impl"


    // $ANTLR start "rule__Protocol_device__Group__5"
    // InternalBPMN_translator.g:5172:1: rule__Protocol_device__Group__5 : rule__Protocol_device__Group__5__Impl ;
    public final void rule__Protocol_device__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5176:1: ( rule__Protocol_device__Group__5__Impl )
            // InternalBPMN_translator.g:5177:2: rule__Protocol_device__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Protocol_device__Group__5__Impl();

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
    // $ANTLR end "rule__Protocol_device__Group__5"


    // $ANTLR start "rule__Protocol_device__Group__5__Impl"
    // InternalBPMN_translator.g:5183:1: rule__Protocol_device__Group__5__Impl : ( '}' ) ;
    public final void rule__Protocol_device__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5187:1: ( ( '}' ) )
            // InternalBPMN_translator.g:5188:1: ( '}' )
            {
            // InternalBPMN_translator.g:5188:1: ( '}' )
            // InternalBPMN_translator.g:5189:2: '}'
            {
             before(grammarAccess.getProtocol_deviceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProtocol_deviceAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Protocol_device__Group__5__Impl"


    // $ANTLR start "rule__Sensor__Group_0__0"
    // InternalBPMN_translator.g:5199:1: rule__Sensor__Group_0__0 : rule__Sensor__Group_0__0__Impl rule__Sensor__Group_0__1 ;
    public final void rule__Sensor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5203:1: ( rule__Sensor__Group_0__0__Impl rule__Sensor__Group_0__1 )
            // InternalBPMN_translator.g:5204:2: rule__Sensor__Group_0__0__Impl rule__Sensor__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Sensor__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_0__1();

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
    // $ANTLR end "rule__Sensor__Group_0__0"


    // $ANTLR start "rule__Sensor__Group_0__0__Impl"
    // InternalBPMN_translator.g:5211:1: rule__Sensor__Group_0__0__Impl : ( ( rule__Sensor__SnameAssignment_0_0 ) ) ;
    public final void rule__Sensor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5215:1: ( ( ( rule__Sensor__SnameAssignment_0_0 ) ) )
            // InternalBPMN_translator.g:5216:1: ( ( rule__Sensor__SnameAssignment_0_0 ) )
            {
            // InternalBPMN_translator.g:5216:1: ( ( rule__Sensor__SnameAssignment_0_0 ) )
            // InternalBPMN_translator.g:5217:2: ( rule__Sensor__SnameAssignment_0_0 )
            {
             before(grammarAccess.getSensorAccess().getSnameAssignment_0_0()); 
            // InternalBPMN_translator.g:5218:2: ( rule__Sensor__SnameAssignment_0_0 )
            // InternalBPMN_translator.g:5218:3: rule__Sensor__SnameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__SnameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getSnameAssignment_0_0()); 

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
    // $ANTLR end "rule__Sensor__Group_0__0__Impl"


    // $ANTLR start "rule__Sensor__Group_0__1"
    // InternalBPMN_translator.g:5226:1: rule__Sensor__Group_0__1 : rule__Sensor__Group_0__1__Impl rule__Sensor__Group_0__2 ;
    public final void rule__Sensor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5230:1: ( rule__Sensor__Group_0__1__Impl rule__Sensor__Group_0__2 )
            // InternalBPMN_translator.g:5231:2: rule__Sensor__Group_0__1__Impl rule__Sensor__Group_0__2
            {
            pushFollow(FOLLOW_51);
            rule__Sensor__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_0__2();

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
    // $ANTLR end "rule__Sensor__Group_0__1"


    // $ANTLR start "rule__Sensor__Group_0__1__Impl"
    // InternalBPMN_translator.g:5238:1: rule__Sensor__Group_0__1__Impl : ( '{' ) ;
    public final void rule__Sensor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5242:1: ( ( '{' ) )
            // InternalBPMN_translator.g:5243:1: ( '{' )
            {
            // InternalBPMN_translator.g:5243:1: ( '{' )
            // InternalBPMN_translator.g:5244:2: '{'
            {
             before(grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_0_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_0_1()); 

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
    // $ANTLR end "rule__Sensor__Group_0__1__Impl"


    // $ANTLR start "rule__Sensor__Group_0__2"
    // InternalBPMN_translator.g:5253:1: rule__Sensor__Group_0__2 : rule__Sensor__Group_0__2__Impl rule__Sensor__Group_0__3 ;
    public final void rule__Sensor__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5257:1: ( rule__Sensor__Group_0__2__Impl rule__Sensor__Group_0__3 )
            // InternalBPMN_translator.g:5258:2: rule__Sensor__Group_0__2__Impl rule__Sensor__Group_0__3
            {
            pushFollow(FOLLOW_15);
            rule__Sensor__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_0__3();

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
    // $ANTLR end "rule__Sensor__Group_0__2"


    // $ANTLR start "rule__Sensor__Group_0__2__Impl"
    // InternalBPMN_translator.g:5265:1: rule__Sensor__Group_0__2__Impl : ( ( rule__Sensor__SensorAssignment_0_2 ) ) ;
    public final void rule__Sensor__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5269:1: ( ( ( rule__Sensor__SensorAssignment_0_2 ) ) )
            // InternalBPMN_translator.g:5270:1: ( ( rule__Sensor__SensorAssignment_0_2 ) )
            {
            // InternalBPMN_translator.g:5270:1: ( ( rule__Sensor__SensorAssignment_0_2 ) )
            // InternalBPMN_translator.g:5271:2: ( rule__Sensor__SensorAssignment_0_2 )
            {
             before(grammarAccess.getSensorAccess().getSensorAssignment_0_2()); 
            // InternalBPMN_translator.g:5272:2: ( rule__Sensor__SensorAssignment_0_2 )
            // InternalBPMN_translator.g:5272:3: rule__Sensor__SensorAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__SensorAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getSensorAssignment_0_2()); 

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
    // $ANTLR end "rule__Sensor__Group_0__2__Impl"


    // $ANTLR start "rule__Sensor__Group_0__3"
    // InternalBPMN_translator.g:5280:1: rule__Sensor__Group_0__3 : rule__Sensor__Group_0__3__Impl ;
    public final void rule__Sensor__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5284:1: ( rule__Sensor__Group_0__3__Impl )
            // InternalBPMN_translator.g:5285:2: rule__Sensor__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_0__3__Impl();

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
    // $ANTLR end "rule__Sensor__Group_0__3"


    // $ANTLR start "rule__Sensor__Group_0__3__Impl"
    // InternalBPMN_translator.g:5291:1: rule__Sensor__Group_0__3__Impl : ( '}' ) ;
    public final void rule__Sensor__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5295:1: ( ( '}' ) )
            // InternalBPMN_translator.g:5296:1: ( '}' )
            {
            // InternalBPMN_translator.g:5296:1: ( '}' )
            // InternalBPMN_translator.g:5297:2: '}'
            {
             before(grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_0_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_0_3()); 

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
    // $ANTLR end "rule__Sensor__Group_0__3__Impl"


    // $ANTLR start "rule__Sensor__Group_1__0"
    // InternalBPMN_translator.g:5307:1: rule__Sensor__Group_1__0 : rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1 ;
    public final void rule__Sensor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5311:1: ( rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1 )
            // InternalBPMN_translator.g:5312:2: rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Sensor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_1__1();

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
    // $ANTLR end "rule__Sensor__Group_1__0"


    // $ANTLR start "rule__Sensor__Group_1__0__Impl"
    // InternalBPMN_translator.g:5319:1: rule__Sensor__Group_1__0__Impl : ( ( rule__Sensor__SnameAssignment_1_0 ) ) ;
    public final void rule__Sensor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5323:1: ( ( ( rule__Sensor__SnameAssignment_1_0 ) ) )
            // InternalBPMN_translator.g:5324:1: ( ( rule__Sensor__SnameAssignment_1_0 ) )
            {
            // InternalBPMN_translator.g:5324:1: ( ( rule__Sensor__SnameAssignment_1_0 ) )
            // InternalBPMN_translator.g:5325:2: ( rule__Sensor__SnameAssignment_1_0 )
            {
             before(grammarAccess.getSensorAccess().getSnameAssignment_1_0()); 
            // InternalBPMN_translator.g:5326:2: ( rule__Sensor__SnameAssignment_1_0 )
            // InternalBPMN_translator.g:5326:3: rule__Sensor__SnameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__SnameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getSnameAssignment_1_0()); 

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
    // $ANTLR end "rule__Sensor__Group_1__0__Impl"


    // $ANTLR start "rule__Sensor__Group_1__1"
    // InternalBPMN_translator.g:5334:1: rule__Sensor__Group_1__1 : rule__Sensor__Group_1__1__Impl rule__Sensor__Group_1__2 ;
    public final void rule__Sensor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5338:1: ( rule__Sensor__Group_1__1__Impl rule__Sensor__Group_1__2 )
            // InternalBPMN_translator.g:5339:2: rule__Sensor__Group_1__1__Impl rule__Sensor__Group_1__2
            {
            pushFollow(FOLLOW_51);
            rule__Sensor__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_1__2();

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
    // $ANTLR end "rule__Sensor__Group_1__1"


    // $ANTLR start "rule__Sensor__Group_1__1__Impl"
    // InternalBPMN_translator.g:5346:1: rule__Sensor__Group_1__1__Impl : ( '{' ) ;
    public final void rule__Sensor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5350:1: ( ( '{' ) )
            // InternalBPMN_translator.g:5351:1: ( '{' )
            {
            // InternalBPMN_translator.g:5351:1: ( '{' )
            // InternalBPMN_translator.g:5352:2: '{'
            {
             before(grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_1_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_1_1()); 

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
    // $ANTLR end "rule__Sensor__Group_1__1__Impl"


    // $ANTLR start "rule__Sensor__Group_1__2"
    // InternalBPMN_translator.g:5361:1: rule__Sensor__Group_1__2 : rule__Sensor__Group_1__2__Impl rule__Sensor__Group_1__3 ;
    public final void rule__Sensor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5365:1: ( rule__Sensor__Group_1__2__Impl rule__Sensor__Group_1__3 )
            // InternalBPMN_translator.g:5366:2: rule__Sensor__Group_1__2__Impl rule__Sensor__Group_1__3
            {
            pushFollow(FOLLOW_15);
            rule__Sensor__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_1__3();

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
    // $ANTLR end "rule__Sensor__Group_1__2"


    // $ANTLR start "rule__Sensor__Group_1__2__Impl"
    // InternalBPMN_translator.g:5373:1: rule__Sensor__Group_1__2__Impl : ( ( rule__Sensor__SensorAssignment_1_2 ) ) ;
    public final void rule__Sensor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5377:1: ( ( ( rule__Sensor__SensorAssignment_1_2 ) ) )
            // InternalBPMN_translator.g:5378:1: ( ( rule__Sensor__SensorAssignment_1_2 ) )
            {
            // InternalBPMN_translator.g:5378:1: ( ( rule__Sensor__SensorAssignment_1_2 ) )
            // InternalBPMN_translator.g:5379:2: ( rule__Sensor__SensorAssignment_1_2 )
            {
             before(grammarAccess.getSensorAccess().getSensorAssignment_1_2()); 
            // InternalBPMN_translator.g:5380:2: ( rule__Sensor__SensorAssignment_1_2 )
            // InternalBPMN_translator.g:5380:3: rule__Sensor__SensorAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__SensorAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getSensorAssignment_1_2()); 

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
    // $ANTLR end "rule__Sensor__Group_1__2__Impl"


    // $ANTLR start "rule__Sensor__Group_1__3"
    // InternalBPMN_translator.g:5388:1: rule__Sensor__Group_1__3 : rule__Sensor__Group_1__3__Impl ;
    public final void rule__Sensor__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5392:1: ( rule__Sensor__Group_1__3__Impl )
            // InternalBPMN_translator.g:5393:2: rule__Sensor__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_1__3__Impl();

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
    // $ANTLR end "rule__Sensor__Group_1__3"


    // $ANTLR start "rule__Sensor__Group_1__3__Impl"
    // InternalBPMN_translator.g:5399:1: rule__Sensor__Group_1__3__Impl : ( '}' ) ;
    public final void rule__Sensor__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5403:1: ( ( '}' ) )
            // InternalBPMN_translator.g:5404:1: ( '}' )
            {
            // InternalBPMN_translator.g:5404:1: ( '}' )
            // InternalBPMN_translator.g:5405:2: '}'
            {
             before(grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_1_3()); 

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
    // $ANTLR end "rule__Sensor__Group_1__3__Impl"


    // $ANTLR start "rule__Sensor_data__Group__0"
    // InternalBPMN_translator.g:5415:1: rule__Sensor_data__Group__0 : rule__Sensor_data__Group__0__Impl rule__Sensor_data__Group__1 ;
    public final void rule__Sensor_data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5419:1: ( rule__Sensor_data__Group__0__Impl rule__Sensor_data__Group__1 )
            // InternalBPMN_translator.g:5420:2: rule__Sensor_data__Group__0__Impl rule__Sensor_data__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__Sensor_data__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor_data__Group__1();

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
    // $ANTLR end "rule__Sensor_data__Group__0"


    // $ANTLR start "rule__Sensor_data__Group__0__Impl"
    // InternalBPMN_translator.g:5427:1: rule__Sensor_data__Group__0__Impl : ( () ) ;
    public final void rule__Sensor_data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5431:1: ( ( () ) )
            // InternalBPMN_translator.g:5432:1: ( () )
            {
            // InternalBPMN_translator.g:5432:1: ( () )
            // InternalBPMN_translator.g:5433:2: ()
            {
             before(grammarAccess.getSensor_dataAccess().getSensor_dataAction_0()); 
            // InternalBPMN_translator.g:5434:2: ()
            // InternalBPMN_translator.g:5434:3: 
            {
            }

             after(grammarAccess.getSensor_dataAccess().getSensor_dataAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor_data__Group__0__Impl"


    // $ANTLR start "rule__Sensor_data__Group__1"
    // InternalBPMN_translator.g:5442:1: rule__Sensor_data__Group__1 : rule__Sensor_data__Group__1__Impl ;
    public final void rule__Sensor_data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5446:1: ( rule__Sensor_data__Group__1__Impl )
            // InternalBPMN_translator.g:5447:2: rule__Sensor_data__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor_data__Group__1__Impl();

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
    // $ANTLR end "rule__Sensor_data__Group__1"


    // $ANTLR start "rule__Sensor_data__Group__1__Impl"
    // InternalBPMN_translator.g:5453:1: rule__Sensor_data__Group__1__Impl : ( ( rule__Sensor_data__Alternatives_1 )* ) ;
    public final void rule__Sensor_data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5457:1: ( ( ( rule__Sensor_data__Alternatives_1 )* ) )
            // InternalBPMN_translator.g:5458:1: ( ( rule__Sensor_data__Alternatives_1 )* )
            {
            // InternalBPMN_translator.g:5458:1: ( ( rule__Sensor_data__Alternatives_1 )* )
            // InternalBPMN_translator.g:5459:2: ( rule__Sensor_data__Alternatives_1 )*
            {
             before(grammarAccess.getSensor_dataAccess().getAlternatives_1()); 
            // InternalBPMN_translator.g:5460:2: ( rule__Sensor_data__Alternatives_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==44||(LA33_0>=60 && LA33_0<=61)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalBPMN_translator.g:5460:3: rule__Sensor_data__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__Sensor_data__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getSensor_dataAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Sensor_data__Group__1__Impl"


    // $ANTLR start "rule__Sensor_data__Group_1_0__0"
    // InternalBPMN_translator.g:5469:1: rule__Sensor_data__Group_1_0__0 : rule__Sensor_data__Group_1_0__0__Impl rule__Sensor_data__Group_1_0__1 ;
    public final void rule__Sensor_data__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5473:1: ( rule__Sensor_data__Group_1_0__0__Impl rule__Sensor_data__Group_1_0__1 )
            // InternalBPMN_translator.g:5474:2: rule__Sensor_data__Group_1_0__0__Impl rule__Sensor_data__Group_1_0__1
            {
            pushFollow(FOLLOW_24);
            rule__Sensor_data__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor_data__Group_1_0__1();

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
    // $ANTLR end "rule__Sensor_data__Group_1_0__0"


    // $ANTLR start "rule__Sensor_data__Group_1_0__0__Impl"
    // InternalBPMN_translator.g:5481:1: rule__Sensor_data__Group_1_0__0__Impl : ( 'NAME' ) ;
    public final void rule__Sensor_data__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5485:1: ( ( 'NAME' ) )
            // InternalBPMN_translator.g:5486:1: ( 'NAME' )
            {
            // InternalBPMN_translator.g:5486:1: ( 'NAME' )
            // InternalBPMN_translator.g:5487:2: 'NAME'
            {
             before(grammarAccess.getSensor_dataAccess().getNAMEKeyword_1_0_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSensor_dataAccess().getNAMEKeyword_1_0_0()); 

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
    // $ANTLR end "rule__Sensor_data__Group_1_0__0__Impl"


    // $ANTLR start "rule__Sensor_data__Group_1_0__1"
    // InternalBPMN_translator.g:5496:1: rule__Sensor_data__Group_1_0__1 : rule__Sensor_data__Group_1_0__1__Impl rule__Sensor_data__Group_1_0__2 ;
    public final void rule__Sensor_data__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5500:1: ( rule__Sensor_data__Group_1_0__1__Impl rule__Sensor_data__Group_1_0__2 )
            // InternalBPMN_translator.g:5501:2: rule__Sensor_data__Group_1_0__1__Impl rule__Sensor_data__Group_1_0__2
            {
            pushFollow(FOLLOW_7);
            rule__Sensor_data__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor_data__Group_1_0__2();

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
    // $ANTLR end "rule__Sensor_data__Group_1_0__1"


    // $ANTLR start "rule__Sensor_data__Group_1_0__1__Impl"
    // InternalBPMN_translator.g:5508:1: rule__Sensor_data__Group_1_0__1__Impl : ( '=' ) ;
    public final void rule__Sensor_data__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5512:1: ( ( '=' ) )
            // InternalBPMN_translator.g:5513:1: ( '=' )
            {
            // InternalBPMN_translator.g:5513:1: ( '=' )
            // InternalBPMN_translator.g:5514:2: '='
            {
             before(grammarAccess.getSensor_dataAccess().getEqualsSignKeyword_1_0_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSensor_dataAccess().getEqualsSignKeyword_1_0_1()); 

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
    // $ANTLR end "rule__Sensor_data__Group_1_0__1__Impl"


    // $ANTLR start "rule__Sensor_data__Group_1_0__2"
    // InternalBPMN_translator.g:5523:1: rule__Sensor_data__Group_1_0__2 : rule__Sensor_data__Group_1_0__2__Impl ;
    public final void rule__Sensor_data__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5527:1: ( rule__Sensor_data__Group_1_0__2__Impl )
            // InternalBPMN_translator.g:5528:2: rule__Sensor_data__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor_data__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__Sensor_data__Group_1_0__2"


    // $ANTLR start "rule__Sensor_data__Group_1_0__2__Impl"
    // InternalBPMN_translator.g:5534:1: rule__Sensor_data__Group_1_0__2__Impl : ( ( rule__Sensor_data__PnameAssignment_1_0_2 ) ) ;
    public final void rule__Sensor_data__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5538:1: ( ( ( rule__Sensor_data__PnameAssignment_1_0_2 ) ) )
            // InternalBPMN_translator.g:5539:1: ( ( rule__Sensor_data__PnameAssignment_1_0_2 ) )
            {
            // InternalBPMN_translator.g:5539:1: ( ( rule__Sensor_data__PnameAssignment_1_0_2 ) )
            // InternalBPMN_translator.g:5540:2: ( rule__Sensor_data__PnameAssignment_1_0_2 )
            {
             before(grammarAccess.getSensor_dataAccess().getPnameAssignment_1_0_2()); 
            // InternalBPMN_translator.g:5541:2: ( rule__Sensor_data__PnameAssignment_1_0_2 )
            // InternalBPMN_translator.g:5541:3: rule__Sensor_data__PnameAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Sensor_data__PnameAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getSensor_dataAccess().getPnameAssignment_1_0_2()); 

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
    // $ANTLR end "rule__Sensor_data__Group_1_0__2__Impl"


    // $ANTLR start "rule__Sensor_data__Group_1_1__0"
    // InternalBPMN_translator.g:5550:1: rule__Sensor_data__Group_1_1__0 : rule__Sensor_data__Group_1_1__0__Impl rule__Sensor_data__Group_1_1__1 ;
    public final void rule__Sensor_data__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5554:1: ( rule__Sensor_data__Group_1_1__0__Impl rule__Sensor_data__Group_1_1__1 )
            // InternalBPMN_translator.g:5555:2: rule__Sensor_data__Group_1_1__0__Impl rule__Sensor_data__Group_1_1__1
            {
            pushFollow(FOLLOW_24);
            rule__Sensor_data__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor_data__Group_1_1__1();

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
    // $ANTLR end "rule__Sensor_data__Group_1_1__0"


    // $ANTLR start "rule__Sensor_data__Group_1_1__0__Impl"
    // InternalBPMN_translator.g:5562:1: rule__Sensor_data__Group_1_1__0__Impl : ( 'PINS' ) ;
    public final void rule__Sensor_data__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5566:1: ( ( 'PINS' ) )
            // InternalBPMN_translator.g:5567:1: ( 'PINS' )
            {
            // InternalBPMN_translator.g:5567:1: ( 'PINS' )
            // InternalBPMN_translator.g:5568:2: 'PINS'
            {
             before(grammarAccess.getSensor_dataAccess().getPINSKeyword_1_1_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getSensor_dataAccess().getPINSKeyword_1_1_0()); 

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
    // $ANTLR end "rule__Sensor_data__Group_1_1__0__Impl"


    // $ANTLR start "rule__Sensor_data__Group_1_1__1"
    // InternalBPMN_translator.g:5577:1: rule__Sensor_data__Group_1_1__1 : rule__Sensor_data__Group_1_1__1__Impl rule__Sensor_data__Group_1_1__2 ;
    public final void rule__Sensor_data__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5581:1: ( rule__Sensor_data__Group_1_1__1__Impl rule__Sensor_data__Group_1_1__2 )
            // InternalBPMN_translator.g:5582:2: rule__Sensor_data__Group_1_1__1__Impl rule__Sensor_data__Group_1_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Sensor_data__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor_data__Group_1_1__2();

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
    // $ANTLR end "rule__Sensor_data__Group_1_1__1"


    // $ANTLR start "rule__Sensor_data__Group_1_1__1__Impl"
    // InternalBPMN_translator.g:5589:1: rule__Sensor_data__Group_1_1__1__Impl : ( '=' ) ;
    public final void rule__Sensor_data__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5593:1: ( ( '=' ) )
            // InternalBPMN_translator.g:5594:1: ( '=' )
            {
            // InternalBPMN_translator.g:5594:1: ( '=' )
            // InternalBPMN_translator.g:5595:2: '='
            {
             before(grammarAccess.getSensor_dataAccess().getEqualsSignKeyword_1_1_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSensor_dataAccess().getEqualsSignKeyword_1_1_1()); 

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
    // $ANTLR end "rule__Sensor_data__Group_1_1__1__Impl"


    // $ANTLR start "rule__Sensor_data__Group_1_1__2"
    // InternalBPMN_translator.g:5604:1: rule__Sensor_data__Group_1_1__2 : rule__Sensor_data__Group_1_1__2__Impl ;
    public final void rule__Sensor_data__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5608:1: ( rule__Sensor_data__Group_1_1__2__Impl )
            // InternalBPMN_translator.g:5609:2: rule__Sensor_data__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor_data__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__Sensor_data__Group_1_1__2"


    // $ANTLR start "rule__Sensor_data__Group_1_1__2__Impl"
    // InternalBPMN_translator.g:5615:1: rule__Sensor_data__Group_1_1__2__Impl : ( ( rule__Sensor_data__PinsAssignment_1_1_2 ) ) ;
    public final void rule__Sensor_data__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5619:1: ( ( ( rule__Sensor_data__PinsAssignment_1_1_2 ) ) )
            // InternalBPMN_translator.g:5620:1: ( ( rule__Sensor_data__PinsAssignment_1_1_2 ) )
            {
            // InternalBPMN_translator.g:5620:1: ( ( rule__Sensor_data__PinsAssignment_1_1_2 ) )
            // InternalBPMN_translator.g:5621:2: ( rule__Sensor_data__PinsAssignment_1_1_2 )
            {
             before(grammarAccess.getSensor_dataAccess().getPinsAssignment_1_1_2()); 
            // InternalBPMN_translator.g:5622:2: ( rule__Sensor_data__PinsAssignment_1_1_2 )
            // InternalBPMN_translator.g:5622:3: rule__Sensor_data__PinsAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Sensor_data__PinsAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSensor_dataAccess().getPinsAssignment_1_1_2()); 

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
    // $ANTLR end "rule__Sensor_data__Group_1_1__2__Impl"


    // $ANTLR start "rule__Sensor_data__Group_1_2__0"
    // InternalBPMN_translator.g:5631:1: rule__Sensor_data__Group_1_2__0 : rule__Sensor_data__Group_1_2__0__Impl rule__Sensor_data__Group_1_2__1 ;
    public final void rule__Sensor_data__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5635:1: ( rule__Sensor_data__Group_1_2__0__Impl rule__Sensor_data__Group_1_2__1 )
            // InternalBPMN_translator.g:5636:2: rule__Sensor_data__Group_1_2__0__Impl rule__Sensor_data__Group_1_2__1
            {
            pushFollow(FOLLOW_24);
            rule__Sensor_data__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor_data__Group_1_2__1();

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
    // $ANTLR end "rule__Sensor_data__Group_1_2__0"


    // $ANTLR start "rule__Sensor_data__Group_1_2__0__Impl"
    // InternalBPMN_translator.g:5643:1: rule__Sensor_data__Group_1_2__0__Impl : ( 'SENSOR_ID' ) ;
    public final void rule__Sensor_data__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5647:1: ( ( 'SENSOR_ID' ) )
            // InternalBPMN_translator.g:5648:1: ( 'SENSOR_ID' )
            {
            // InternalBPMN_translator.g:5648:1: ( 'SENSOR_ID' )
            // InternalBPMN_translator.g:5649:2: 'SENSOR_ID'
            {
             before(grammarAccess.getSensor_dataAccess().getSENSOR_IDKeyword_1_2_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getSensor_dataAccess().getSENSOR_IDKeyword_1_2_0()); 

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
    // $ANTLR end "rule__Sensor_data__Group_1_2__0__Impl"


    // $ANTLR start "rule__Sensor_data__Group_1_2__1"
    // InternalBPMN_translator.g:5658:1: rule__Sensor_data__Group_1_2__1 : rule__Sensor_data__Group_1_2__1__Impl rule__Sensor_data__Group_1_2__2 ;
    public final void rule__Sensor_data__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5662:1: ( rule__Sensor_data__Group_1_2__1__Impl rule__Sensor_data__Group_1_2__2 )
            // InternalBPMN_translator.g:5663:2: rule__Sensor_data__Group_1_2__1__Impl rule__Sensor_data__Group_1_2__2
            {
            pushFollow(FOLLOW_7);
            rule__Sensor_data__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor_data__Group_1_2__2();

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
    // $ANTLR end "rule__Sensor_data__Group_1_2__1"


    // $ANTLR start "rule__Sensor_data__Group_1_2__1__Impl"
    // InternalBPMN_translator.g:5670:1: rule__Sensor_data__Group_1_2__1__Impl : ( '=' ) ;
    public final void rule__Sensor_data__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5674:1: ( ( '=' ) )
            // InternalBPMN_translator.g:5675:1: ( '=' )
            {
            // InternalBPMN_translator.g:5675:1: ( '=' )
            // InternalBPMN_translator.g:5676:2: '='
            {
             before(grammarAccess.getSensor_dataAccess().getEqualsSignKeyword_1_2_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSensor_dataAccess().getEqualsSignKeyword_1_2_1()); 

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
    // $ANTLR end "rule__Sensor_data__Group_1_2__1__Impl"


    // $ANTLR start "rule__Sensor_data__Group_1_2__2"
    // InternalBPMN_translator.g:5685:1: rule__Sensor_data__Group_1_2__2 : rule__Sensor_data__Group_1_2__2__Impl ;
    public final void rule__Sensor_data__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5689:1: ( rule__Sensor_data__Group_1_2__2__Impl )
            // InternalBPMN_translator.g:5690:2: rule__Sensor_data__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor_data__Group_1_2__2__Impl();

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
    // $ANTLR end "rule__Sensor_data__Group_1_2__2"


    // $ANTLR start "rule__Sensor_data__Group_1_2__2__Impl"
    // InternalBPMN_translator.g:5696:1: rule__Sensor_data__Group_1_2__2__Impl : ( ( rule__Sensor_data__Sensor_idAssignment_1_2_2 ) ) ;
    public final void rule__Sensor_data__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5700:1: ( ( ( rule__Sensor_data__Sensor_idAssignment_1_2_2 ) ) )
            // InternalBPMN_translator.g:5701:1: ( ( rule__Sensor_data__Sensor_idAssignment_1_2_2 ) )
            {
            // InternalBPMN_translator.g:5701:1: ( ( rule__Sensor_data__Sensor_idAssignment_1_2_2 ) )
            // InternalBPMN_translator.g:5702:2: ( rule__Sensor_data__Sensor_idAssignment_1_2_2 )
            {
             before(grammarAccess.getSensor_dataAccess().getSensor_idAssignment_1_2_2()); 
            // InternalBPMN_translator.g:5703:2: ( rule__Sensor_data__Sensor_idAssignment_1_2_2 )
            // InternalBPMN_translator.g:5703:3: rule__Sensor_data__Sensor_idAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Sensor_data__Sensor_idAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getSensor_dataAccess().getSensor_idAssignment_1_2_2()); 

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
    // $ANTLR end "rule__Sensor_data__Group_1_2__2__Impl"


    // $ANTLR start "rule__Model__ModelAssignment"
    // InternalBPMN_translator.g:5712:1: rule__Model__ModelAssignment : ( ruleXml ) ;
    public final void rule__Model__ModelAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5716:1: ( ( ruleXml ) )
            // InternalBPMN_translator.g:5717:2: ( ruleXml )
            {
            // InternalBPMN_translator.g:5717:2: ( ruleXml )
            // InternalBPMN_translator.g:5718:3: ruleXml
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


    // $ANTLR start "rule__Xml__ProvaAssignment_2"
    // InternalBPMN_translator.g:5727:1: rule__Xml__ProvaAssignment_2 : ( ruleelement ) ;
    public final void rule__Xml__ProvaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5731:1: ( ( ruleelement ) )
            // InternalBPMN_translator.g:5732:2: ( ruleelement )
            {
            // InternalBPMN_translator.g:5732:2: ( ruleelement )
            // InternalBPMN_translator.g:5733:3: ruleelement
            {
             before(grammarAccess.getXmlAccess().getProvaElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleelement();

            state._fsp--;

             after(grammarAccess.getXmlAccess().getProvaElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Xml__ProvaAssignment_2"


    // $ANTLR start "rule__Element__OpenAssignment_0_0"
    // InternalBPMN_translator.g:5742:1: rule__Element__OpenAssignment_0_0 : ( ruleOpen ) ;
    public final void rule__Element__OpenAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5746:1: ( ( ruleOpen ) )
            // InternalBPMN_translator.g:5747:2: ( ruleOpen )
            {
            // InternalBPMN_translator.g:5747:2: ( ruleOpen )
            // InternalBPMN_translator.g:5748:3: ruleOpen
            {
             before(grammarAccess.getElementAccess().getOpenOpenParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOpen();

            state._fsp--;

             after(grammarAccess.getElementAccess().getOpenOpenParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Element__OpenAssignment_0_0"


    // $ANTLR start "rule__Element__ContentsAssignment_0_1"
    // InternalBPMN_translator.g:5757:1: rule__Element__ContentsAssignment_0_1 : ( rulecontent ) ;
    public final void rule__Element__ContentsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5761:1: ( ( rulecontent ) )
            // InternalBPMN_translator.g:5762:2: ( rulecontent )
            {
            // InternalBPMN_translator.g:5762:2: ( rulecontent )
            // InternalBPMN_translator.g:5763:3: rulecontent
            {
             before(grammarAccess.getElementAccess().getContentsContentParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            rulecontent();

            state._fsp--;

             after(grammarAccess.getElementAccess().getContentsContentParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Element__ContentsAssignment_0_1"


    // $ANTLR start "rule__Element__Close_tagAssignment_0_2"
    // InternalBPMN_translator.g:5772:1: rule__Element__Close_tagAssignment_0_2 : ( ruleClose ) ;
    public final void rule__Element__Close_tagAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5776:1: ( ( ruleClose ) )
            // InternalBPMN_translator.g:5777:2: ( ruleClose )
            {
            // InternalBPMN_translator.g:5777:2: ( ruleClose )
            // InternalBPMN_translator.g:5778:3: ruleClose
            {
             before(grammarAccess.getElementAccess().getClose_tagCloseParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleClose();

            state._fsp--;

             after(grammarAccess.getElementAccess().getClose_tagCloseParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Element__Close_tagAssignment_0_2"


    // $ANTLR start "rule__Element__Singleton_tagAssignment_1"
    // InternalBPMN_translator.g:5787:1: rule__Element__Singleton_tagAssignment_1 : ( ruleSingleton ) ;
    public final void rule__Element__Singleton_tagAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5791:1: ( ( ruleSingleton ) )
            // InternalBPMN_translator.g:5792:2: ( ruleSingleton )
            {
            // InternalBPMN_translator.g:5792:2: ( ruleSingleton )
            // InternalBPMN_translator.g:5793:3: ruleSingleton
            {
             before(grammarAccess.getElementAccess().getSingleton_tagSingletonParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSingleton();

            state._fsp--;

             after(grammarAccess.getElementAccess().getSingleton_tagSingletonParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Element__Singleton_tagAssignment_1"


    // $ANTLR start "rule__Content__TypeAssignment_1_0_0"
    // InternalBPMN_translator.g:5802:1: rule__Content__TypeAssignment_1_0_0 : ( ( rule__Content__TypeAlternatives_1_0_0_0 ) ) ;
    public final void rule__Content__TypeAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5806:1: ( ( ( rule__Content__TypeAlternatives_1_0_0_0 ) ) )
            // InternalBPMN_translator.g:5807:2: ( ( rule__Content__TypeAlternatives_1_0_0_0 ) )
            {
            // InternalBPMN_translator.g:5807:2: ( ( rule__Content__TypeAlternatives_1_0_0_0 ) )
            // InternalBPMN_translator.g:5808:3: ( rule__Content__TypeAlternatives_1_0_0_0 )
            {
             before(grammarAccess.getContentAccess().getTypeAlternatives_1_0_0_0()); 
            // InternalBPMN_translator.g:5809:3: ( rule__Content__TypeAlternatives_1_0_0_0 )
            // InternalBPMN_translator.g:5809:4: rule__Content__TypeAlternatives_1_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Content__TypeAlternatives_1_0_0_0();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getTypeAlternatives_1_0_0_0()); 

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
    // $ANTLR end "rule__Content__TypeAssignment_1_0_0"


    // $ANTLR start "rule__Content__CodexAssignment_1_0_2"
    // InternalBPMN_translator.g:5817:1: rule__Content__CodexAssignment_1_0_2 : ( rulecodex ) ;
    public final void rule__Content__CodexAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5821:1: ( ( rulecodex ) )
            // InternalBPMN_translator.g:5822:2: ( rulecodex )
            {
            // InternalBPMN_translator.g:5822:2: ( rulecodex )
            // InternalBPMN_translator.g:5823:3: rulecodex
            {
             before(grammarAccess.getContentAccess().getCodexCodexParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            rulecodex();

            state._fsp--;

             after(grammarAccess.getContentAccess().getCodexCodexParserRuleCall_1_0_2_0()); 

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
    // $ANTLR end "rule__Content__CodexAssignment_1_0_2"


    // $ANTLR start "rule__Content__ElementAssignment_1_1"
    // InternalBPMN_translator.g:5832:1: rule__Content__ElementAssignment_1_1 : ( ruleelement ) ;
    public final void rule__Content__ElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5836:1: ( ( ruleelement ) )
            // InternalBPMN_translator.g:5837:2: ( ruleelement )
            {
            // InternalBPMN_translator.g:5837:2: ( ruleelement )
            // InternalBPMN_translator.g:5838:3: ruleelement
            {
             before(grammarAccess.getContentAccess().getElementElementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleelement();

            state._fsp--;

             after(grammarAccess.getContentAccess().getElementElementParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Content__ElementAssignment_1_1"


    // $ANTLR start "rule__Content__BodyAssignment_1_2_0"
    // InternalBPMN_translator.g:5847:1: rule__Content__BodyAssignment_1_2_0 : ( rulepreconditions ) ;
    public final void rule__Content__BodyAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5851:1: ( ( rulepreconditions ) )
            // InternalBPMN_translator.g:5852:2: ( rulepreconditions )
            {
            // InternalBPMN_translator.g:5852:2: ( rulepreconditions )
            // InternalBPMN_translator.g:5853:3: rulepreconditions
            {
             before(grammarAccess.getContentAccess().getBodyPreconditionsParserRuleCall_1_2_0_0()); 
            pushFollow(FOLLOW_2);
            rulepreconditions();

            state._fsp--;

             after(grammarAccess.getContentAccess().getBodyPreconditionsParserRuleCall_1_2_0_0()); 

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
    // $ANTLR end "rule__Content__BodyAssignment_1_2_0"


    // $ANTLR start "rule__Content__BodyAssignment_1_2_1"
    // InternalBPMN_translator.g:5862:1: rule__Content__BodyAssignment_1_2_1 : ( ( rule__Content__BodyAlternatives_1_2_1_0 ) ) ;
    public final void rule__Content__BodyAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5866:1: ( ( ( rule__Content__BodyAlternatives_1_2_1_0 ) ) )
            // InternalBPMN_translator.g:5867:2: ( ( rule__Content__BodyAlternatives_1_2_1_0 ) )
            {
            // InternalBPMN_translator.g:5867:2: ( ( rule__Content__BodyAlternatives_1_2_1_0 ) )
            // InternalBPMN_translator.g:5868:3: ( rule__Content__BodyAlternatives_1_2_1_0 )
            {
             before(grammarAccess.getContentAccess().getBodyAlternatives_1_2_1_0()); 
            // InternalBPMN_translator.g:5869:3: ( rule__Content__BodyAlternatives_1_2_1_0 )
            // InternalBPMN_translator.g:5869:4: rule__Content__BodyAlternatives_1_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Content__BodyAlternatives_1_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getBodyAlternatives_1_2_1_0()); 

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
    // $ANTLR end "rule__Content__BodyAssignment_1_2_1"


    // $ANTLR start "rule__Content__BodyAssignment_1_2_2"
    // InternalBPMN_translator.g:5877:1: rule__Content__BodyAssignment_1_2_2 : ( ruleconditions ) ;
    public final void rule__Content__BodyAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5881:1: ( ( ruleconditions ) )
            // InternalBPMN_translator.g:5882:2: ( ruleconditions )
            {
            // InternalBPMN_translator.g:5882:2: ( ruleconditions )
            // InternalBPMN_translator.g:5883:3: ruleconditions
            {
             before(grammarAccess.getContentAccess().getBodyConditionsParserRuleCall_1_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleconditions();

            state._fsp--;

             after(grammarAccess.getContentAccess().getBodyConditionsParserRuleCall_1_2_2_0()); 

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
    // $ANTLR end "rule__Content__BodyAssignment_1_2_2"


    // $ANTLR start "rule__Content__KeywordsAssignment_1_3"
    // InternalBPMN_translator.g:5892:1: rule__Content__KeywordsAssignment_1_3 : ( RULE_KEYWORDS ) ;
    public final void rule__Content__KeywordsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5896:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:5897:2: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:5897:2: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:5898:3: RULE_KEYWORDS
            {
             before(grammarAccess.getContentAccess().getKeywordsKEYWORDSTerminalRuleCall_1_3_0()); 
            match(input,RULE_KEYWORDS,FOLLOW_2); 
             after(grammarAccess.getContentAccess().getKeywordsKEYWORDSTerminalRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__Content__KeywordsAssignment_1_3"


    // $ANTLR start "rule__Content__DataAssignment_1_4"
    // InternalBPMN_translator.g:5907:1: rule__Content__DataAssignment_1_4 : ( RULE_STRING ) ;
    public final void rule__Content__DataAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5911:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:5912:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:5912:2: ( RULE_STRING )
            // InternalBPMN_translator.g:5913:3: RULE_STRING
            {
             before(grammarAccess.getContentAccess().getDataSTRINGTerminalRuleCall_1_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getContentAccess().getDataSTRINGTerminalRuleCall_1_4_0()); 

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
    // $ANTLR end "rule__Content__DataAssignment_1_4"


    // $ANTLR start "rule__Open__HeadAssignment_1"
    // InternalBPMN_translator.g:5922:1: rule__Open__HeadAssignment_1 : ( RULE_HEAD ) ;
    public final void rule__Open__HeadAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5926:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:5927:2: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:5927:2: ( RULE_HEAD )
            // InternalBPMN_translator.g:5928:3: RULE_HEAD
            {
             before(grammarAccess.getOpenAccess().getHeadHEADTerminalRuleCall_1_0()); 
            match(input,RULE_HEAD,FOLLOW_2); 
             after(grammarAccess.getOpenAccess().getHeadHEADTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Open__HeadAssignment_1"


    // $ANTLR start "rule__Open__KeywordsAssignment_3"
    // InternalBPMN_translator.g:5937:1: rule__Open__KeywordsAssignment_3 : ( RULE_KEYWORDS ) ;
    public final void rule__Open__KeywordsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5941:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:5942:2: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:5942:2: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:5943:3: RULE_KEYWORDS
            {
             before(grammarAccess.getOpenAccess().getKeywordsKEYWORDSTerminalRuleCall_3_0()); 
            match(input,RULE_KEYWORDS,FOLLOW_2); 
             after(grammarAccess.getOpenAccess().getKeywordsKEYWORDSTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Open__KeywordsAssignment_3"


    // $ANTLR start "rule__Open__Head1Assignment_4_0_0"
    // InternalBPMN_translator.g:5952:1: rule__Open__Head1Assignment_4_0_0 : ( RULE_HEAD ) ;
    public final void rule__Open__Head1Assignment_4_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5956:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:5957:2: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:5957:2: ( RULE_HEAD )
            // InternalBPMN_translator.g:5958:3: RULE_HEAD
            {
             before(grammarAccess.getOpenAccess().getHead1HEADTerminalRuleCall_4_0_0_0()); 
            match(input,RULE_HEAD,FOLLOW_2); 
             after(grammarAccess.getOpenAccess().getHead1HEADTerminalRuleCall_4_0_0_0()); 

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
    // $ANTLR end "rule__Open__Head1Assignment_4_0_0"


    // $ANTLR start "rule__Open__Head1Assignment_4_1_0_0"
    // InternalBPMN_translator.g:5967:1: rule__Open__Head1Assignment_4_1_0_0 : ( RULE_HEAD ) ;
    public final void rule__Open__Head1Assignment_4_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5971:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:5972:2: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:5972:2: ( RULE_HEAD )
            // InternalBPMN_translator.g:5973:3: RULE_HEAD
            {
             before(grammarAccess.getOpenAccess().getHead1HEADTerminalRuleCall_4_1_0_0_0()); 
            match(input,RULE_HEAD,FOLLOW_2); 
             after(grammarAccess.getOpenAccess().getHead1HEADTerminalRuleCall_4_1_0_0_0()); 

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
    // $ANTLR end "rule__Open__Head1Assignment_4_1_0_0"


    // $ANTLR start "rule__Open__Keywords1Assignment_4_1_0_1"
    // InternalBPMN_translator.g:5982:1: rule__Open__Keywords1Assignment_4_1_0_1 : ( RULE_KEYWORDS ) ;
    public final void rule__Open__Keywords1Assignment_4_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5986:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:5987:2: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:5987:2: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:5988:3: RULE_KEYWORDS
            {
             before(grammarAccess.getOpenAccess().getKeywords1KEYWORDSTerminalRuleCall_4_1_0_1_0()); 
            match(input,RULE_KEYWORDS,FOLLOW_2); 
             after(grammarAccess.getOpenAccess().getKeywords1KEYWORDSTerminalRuleCall_4_1_0_1_0()); 

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
    // $ANTLR end "rule__Open__Keywords1Assignment_4_1_0_1"


    // $ANTLR start "rule__Open__ValueAssignment_4_1_2"
    // InternalBPMN_translator.g:5997:1: rule__Open__ValueAssignment_4_1_2 : ( RULE_STRING ) ;
    public final void rule__Open__ValueAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6001:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6002:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6002:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6003:3: RULE_STRING
            {
             before(grammarAccess.getOpenAccess().getValueSTRINGTerminalRuleCall_4_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOpenAccess().getValueSTRINGTerminalRuleCall_4_1_2_0()); 

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
    // $ANTLR end "rule__Open__ValueAssignment_4_1_2"


    // $ANTLR start "rule__Singleton__KeywordsAssignment_1_3"
    // InternalBPMN_translator.g:6012:1: rule__Singleton__KeywordsAssignment_1_3 : ( RULE_KEYWORDS ) ;
    public final void rule__Singleton__KeywordsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6016:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:6017:2: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:6017:2: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:6018:3: RULE_KEYWORDS
            {
             before(grammarAccess.getSingletonAccess().getKeywordsKEYWORDSTerminalRuleCall_1_3_0()); 
            match(input,RULE_KEYWORDS,FOLLOW_2); 
             after(grammarAccess.getSingletonAccess().getKeywordsKEYWORDSTerminalRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__Singleton__KeywordsAssignment_1_3"


    // $ANTLR start "rule__Singleton__Keywords1Assignment_1_4_1_0"
    // InternalBPMN_translator.g:6027:1: rule__Singleton__Keywords1Assignment_1_4_1_0 : ( RULE_KEYWORDS ) ;
    public final void rule__Singleton__Keywords1Assignment_1_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6031:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:6032:2: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:6032:2: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:6033:3: RULE_KEYWORDS
            {
             before(grammarAccess.getSingletonAccess().getKeywords1KEYWORDSTerminalRuleCall_1_4_1_0_0()); 
            match(input,RULE_KEYWORDS,FOLLOW_2); 
             after(grammarAccess.getSingletonAccess().getKeywords1KEYWORDSTerminalRuleCall_1_4_1_0_0()); 

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
    // $ANTLR end "rule__Singleton__Keywords1Assignment_1_4_1_0"


    // $ANTLR start "rule__Singleton__ValueAssignment_1_4_1_2"
    // InternalBPMN_translator.g:6042:1: rule__Singleton__ValueAssignment_1_4_1_2 : ( RULE_STRING ) ;
    public final void rule__Singleton__ValueAssignment_1_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6046:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6047:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6047:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6048:3: RULE_STRING
            {
             before(grammarAccess.getSingletonAccess().getValueSTRINGTerminalRuleCall_1_4_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSingletonAccess().getValueSTRINGTerminalRuleCall_1_4_1_2_0()); 

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
    // $ANTLR end "rule__Singleton__ValueAssignment_1_4_1_2"


    // $ANTLR start "rule__Codex__Device_codeAssignment_0"
    // InternalBPMN_translator.g:6057:1: rule__Codex__Device_codeAssignment_0 : ( ruledevice ) ;
    public final void rule__Codex__Device_codeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6061:1: ( ( ruledevice ) )
            // InternalBPMN_translator.g:6062:2: ( ruledevice )
            {
            // InternalBPMN_translator.g:6062:2: ( ruledevice )
            // InternalBPMN_translator.g:6063:3: ruledevice
            {
             before(grammarAccess.getCodexAccess().getDevice_codeDeviceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruledevice();

            state._fsp--;

             after(grammarAccess.getCodexAccess().getDevice_codeDeviceParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Codex__Device_codeAssignment_0"


    // $ANTLR start "rule__Codex__ProtocolAssignment_1"
    // InternalBPMN_translator.g:6072:1: rule__Codex__ProtocolAssignment_1 : ( ruleprotocol ) ;
    public final void rule__Codex__ProtocolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6076:1: ( ( ruleprotocol ) )
            // InternalBPMN_translator.g:6077:2: ( ruleprotocol )
            {
            // InternalBPMN_translator.g:6077:2: ( ruleprotocol )
            // InternalBPMN_translator.g:6078:3: ruleprotocol
            {
             before(grammarAccess.getCodexAccess().getProtocolProtocolParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleprotocol();

            state._fsp--;

             after(grammarAccess.getCodexAccess().getProtocolProtocolParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Codex__ProtocolAssignment_1"


    // $ANTLR start "rule__Codex__Sensor_codeAssignment_2"
    // InternalBPMN_translator.g:6087:1: rule__Codex__Sensor_codeAssignment_2 : ( rulesensor ) ;
    public final void rule__Codex__Sensor_codeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6091:1: ( ( rulesensor ) )
            // InternalBPMN_translator.g:6092:2: ( rulesensor )
            {
            // InternalBPMN_translator.g:6092:2: ( rulesensor )
            // InternalBPMN_translator.g:6093:3: rulesensor
            {
             before(grammarAccess.getCodexAccess().getSensor_codeSensorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulesensor();

            state._fsp--;

             after(grammarAccess.getCodexAccess().getSensor_codeSensorParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Codex__Sensor_codeAssignment_2"


    // $ANTLR start "rule__Device__DeviceAssignment_2"
    // InternalBPMN_translator.g:6102:1: rule__Device__DeviceAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Device__DeviceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6106:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6107:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6107:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6108:3: RULE_STRING
            {
             before(grammarAccess.getDeviceAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Device__DeviceAssignment_2"


    // $ANTLR start "rule__Device__IdAssignment_5"
    // InternalBPMN_translator.g:6117:1: rule__Device__IdAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Device__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6121:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6122:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6122:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6123:3: RULE_STRING
            {
             before(grammarAccess.getDeviceAccess().getIdSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getIdSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Device__IdAssignment_5"


    // $ANTLR start "rule__Protocol__PnameAssignment_0_0"
    // InternalBPMN_translator.g:6132:1: rule__Protocol__PnameAssignment_0_0 : ( ( 'MQTT' ) ) ;
    public final void rule__Protocol__PnameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6136:1: ( ( ( 'MQTT' ) ) )
            // InternalBPMN_translator.g:6137:2: ( ( 'MQTT' ) )
            {
            // InternalBPMN_translator.g:6137:2: ( ( 'MQTT' ) )
            // InternalBPMN_translator.g:6138:3: ( 'MQTT' )
            {
             before(grammarAccess.getProtocolAccess().getPnameMQTTKeyword_0_0_0()); 
            // InternalBPMN_translator.g:6139:3: ( 'MQTT' )
            // InternalBPMN_translator.g:6140:4: 'MQTT'
            {
             before(grammarAccess.getProtocolAccess().getPnameMQTTKeyword_0_0_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getProtocolAccess().getPnameMQTTKeyword_0_0_0()); 

            }

             after(grammarAccess.getProtocolAccess().getPnameMQTTKeyword_0_0_0()); 

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
    // $ANTLR end "rule__Protocol__PnameAssignment_0_0"


    // $ANTLR start "rule__Protocol__Mqtt_dataAssignment_0_2_0"
    // InternalBPMN_translator.g:6151:1: rule__Protocol__Mqtt_dataAssignment_0_2_0 : ( rulemqtt_data ) ;
    public final void rule__Protocol__Mqtt_dataAssignment_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6155:1: ( ( rulemqtt_data ) )
            // InternalBPMN_translator.g:6156:2: ( rulemqtt_data )
            {
            // InternalBPMN_translator.g:6156:2: ( rulemqtt_data )
            // InternalBPMN_translator.g:6157:3: rulemqtt_data
            {
             before(grammarAccess.getProtocolAccess().getMqtt_dataMqtt_dataParserRuleCall_0_2_0_0()); 
            pushFollow(FOLLOW_2);
            rulemqtt_data();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getMqtt_dataMqtt_dataParserRuleCall_0_2_0_0()); 

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
    // $ANTLR end "rule__Protocol__Mqtt_dataAssignment_0_2_0"


    // $ANTLR start "rule__Protocol__Mqtt_deviceAssignment_0_2_1"
    // InternalBPMN_translator.g:6166:1: rule__Protocol__Mqtt_deviceAssignment_0_2_1 : ( ruleprotocol_device ) ;
    public final void rule__Protocol__Mqtt_deviceAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6170:1: ( ( ruleprotocol_device ) )
            // InternalBPMN_translator.g:6171:2: ( ruleprotocol_device )
            {
            // InternalBPMN_translator.g:6171:2: ( ruleprotocol_device )
            // InternalBPMN_translator.g:6172:3: ruleprotocol_device
            {
             before(grammarAccess.getProtocolAccess().getMqtt_deviceProtocol_deviceParserRuleCall_0_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleprotocol_device();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getMqtt_deviceProtocol_deviceParserRuleCall_0_2_1_0()); 

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
    // $ANTLR end "rule__Protocol__Mqtt_deviceAssignment_0_2_1"


    // $ANTLR start "rule__Protocol__PnameAssignment_1_0"
    // InternalBPMN_translator.g:6181:1: rule__Protocol__PnameAssignment_1_0 : ( ( 'HTTP' ) ) ;
    public final void rule__Protocol__PnameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6185:1: ( ( ( 'HTTP' ) ) )
            // InternalBPMN_translator.g:6186:2: ( ( 'HTTP' ) )
            {
            // InternalBPMN_translator.g:6186:2: ( ( 'HTTP' ) )
            // InternalBPMN_translator.g:6187:3: ( 'HTTP' )
            {
             before(grammarAccess.getProtocolAccess().getPnameHTTPKeyword_1_0_0()); 
            // InternalBPMN_translator.g:6188:3: ( 'HTTP' )
            // InternalBPMN_translator.g:6189:4: 'HTTP'
            {
             before(grammarAccess.getProtocolAccess().getPnameHTTPKeyword_1_0_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getProtocolAccess().getPnameHTTPKeyword_1_0_0()); 

            }

             after(grammarAccess.getProtocolAccess().getPnameHTTPKeyword_1_0_0()); 

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
    // $ANTLR end "rule__Protocol__PnameAssignment_1_0"


    // $ANTLR start "rule__Protocol__Http_dataAssignment_1_2_0"
    // InternalBPMN_translator.g:6200:1: rule__Protocol__Http_dataAssignment_1_2_0 : ( rulehttp_data ) ;
    public final void rule__Protocol__Http_dataAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6204:1: ( ( rulehttp_data ) )
            // InternalBPMN_translator.g:6205:2: ( rulehttp_data )
            {
            // InternalBPMN_translator.g:6205:2: ( rulehttp_data )
            // InternalBPMN_translator.g:6206:3: rulehttp_data
            {
             before(grammarAccess.getProtocolAccess().getHttp_dataHttp_dataParserRuleCall_1_2_0_0()); 
            pushFollow(FOLLOW_2);
            rulehttp_data();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getHttp_dataHttp_dataParserRuleCall_1_2_0_0()); 

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
    // $ANTLR end "rule__Protocol__Http_dataAssignment_1_2_0"


    // $ANTLR start "rule__Protocol__Http_deviceAssignment_1_2_1"
    // InternalBPMN_translator.g:6215:1: rule__Protocol__Http_deviceAssignment_1_2_1 : ( ruleprotocol_device ) ;
    public final void rule__Protocol__Http_deviceAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6219:1: ( ( ruleprotocol_device ) )
            // InternalBPMN_translator.g:6220:2: ( ruleprotocol_device )
            {
            // InternalBPMN_translator.g:6220:2: ( ruleprotocol_device )
            // InternalBPMN_translator.g:6221:3: ruleprotocol_device
            {
             before(grammarAccess.getProtocolAccess().getHttp_deviceProtocol_deviceParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleprotocol_device();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getHttp_deviceProtocol_deviceParserRuleCall_1_2_1_0()); 

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
    // $ANTLR end "rule__Protocol__Http_deviceAssignment_1_2_1"


    // $ANTLR start "rule__Http_data__PnameAssignment_1_0_2"
    // InternalBPMN_translator.g:6230:1: rule__Http_data__PnameAssignment_1_0_2 : ( RULE_STRING ) ;
    public final void rule__Http_data__PnameAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6234:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6235:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6235:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6236:3: RULE_STRING
            {
             before(grammarAccess.getHttp_dataAccess().getPnameSTRINGTerminalRuleCall_1_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHttp_dataAccess().getPnameSTRINGTerminalRuleCall_1_0_2_0()); 

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
    // $ANTLR end "rule__Http_data__PnameAssignment_1_0_2"


    // $ANTLR start "rule__Http_data__Server_ipAssignment_1_1_2"
    // InternalBPMN_translator.g:6245:1: rule__Http_data__Server_ipAssignment_1_1_2 : ( RULE_STRING ) ;
    public final void rule__Http_data__Server_ipAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6249:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6250:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6250:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6251:3: RULE_STRING
            {
             before(grammarAccess.getHttp_dataAccess().getServer_ipSTRINGTerminalRuleCall_1_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHttp_dataAccess().getServer_ipSTRINGTerminalRuleCall_1_1_2_0()); 

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
    // $ANTLR end "rule__Http_data__Server_ipAssignment_1_1_2"


    // $ANTLR start "rule__Http_data__Request_typeAssignment_1_2_2"
    // InternalBPMN_translator.g:6260:1: rule__Http_data__Request_typeAssignment_1_2_2 : ( RULE_STRING ) ;
    public final void rule__Http_data__Request_typeAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6264:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6265:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6265:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6266:3: RULE_STRING
            {
             before(grammarAccess.getHttp_dataAccess().getRequest_typeSTRINGTerminalRuleCall_1_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHttp_dataAccess().getRequest_typeSTRINGTerminalRuleCall_1_2_2_0()); 

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
    // $ANTLR end "rule__Http_data__Request_typeAssignment_1_2_2"


    // $ANTLR start "rule__Http_data__Content_typeAssignment_1_3_2"
    // InternalBPMN_translator.g:6275:1: rule__Http_data__Content_typeAssignment_1_3_2 : ( RULE_STRING ) ;
    public final void rule__Http_data__Content_typeAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6279:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6280:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6280:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6281:3: RULE_STRING
            {
             before(grammarAccess.getHttp_dataAccess().getContent_typeSTRINGTerminalRuleCall_1_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHttp_dataAccess().getContent_typeSTRINGTerminalRuleCall_1_3_2_0()); 

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
    // $ANTLR end "rule__Http_data__Content_typeAssignment_1_3_2"


    // $ANTLR start "rule__Http_data__HeaderAssignment_1_4_2"
    // InternalBPMN_translator.g:6290:1: rule__Http_data__HeaderAssignment_1_4_2 : ( RULE_STRING ) ;
    public final void rule__Http_data__HeaderAssignment_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6294:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6295:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6295:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6296:3: RULE_STRING
            {
             before(grammarAccess.getHttp_dataAccess().getHeaderSTRINGTerminalRuleCall_1_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHttp_dataAccess().getHeaderSTRINGTerminalRuleCall_1_4_2_0()); 

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
    // $ANTLR end "rule__Http_data__HeaderAssignment_1_4_2"


    // $ANTLR start "rule__Http_data__DataAssignment_1_5_2"
    // InternalBPMN_translator.g:6305:1: rule__Http_data__DataAssignment_1_5_2 : ( RULE_STRING ) ;
    public final void rule__Http_data__DataAssignment_1_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6309:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6310:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6310:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6311:3: RULE_STRING
            {
             before(grammarAccess.getHttp_dataAccess().getDataSTRINGTerminalRuleCall_1_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHttp_dataAccess().getDataSTRINGTerminalRuleCall_1_5_2_0()); 

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
    // $ANTLR end "rule__Http_data__DataAssignment_1_5_2"


    // $ANTLR start "rule__Http_data__Mqtt_network_dataAssignment_1_6_2"
    // InternalBPMN_translator.g:6320:1: rule__Http_data__Mqtt_network_dataAssignment_1_6_2 : ( rulemqtt_network_data ) ;
    public final void rule__Http_data__Mqtt_network_dataAssignment_1_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6324:1: ( ( rulemqtt_network_data ) )
            // InternalBPMN_translator.g:6325:2: ( rulemqtt_network_data )
            {
            // InternalBPMN_translator.g:6325:2: ( rulemqtt_network_data )
            // InternalBPMN_translator.g:6326:3: rulemqtt_network_data
            {
             before(grammarAccess.getHttp_dataAccess().getMqtt_network_dataMqtt_network_dataParserRuleCall_1_6_2_0()); 
            pushFollow(FOLLOW_2);
            rulemqtt_network_data();

            state._fsp--;

             after(grammarAccess.getHttp_dataAccess().getMqtt_network_dataMqtt_network_dataParserRuleCall_1_6_2_0()); 

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
    // $ANTLR end "rule__Http_data__Mqtt_network_dataAssignment_1_6_2"


    // $ANTLR start "rule__Mqtt_data__PnameAssignment_1_0_2"
    // InternalBPMN_translator.g:6335:1: rule__Mqtt_data__PnameAssignment_1_0_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_data__PnameAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6339:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6340:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6340:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6341:3: RULE_STRING
            {
             before(grammarAccess.getMqtt_dataAccess().getPnameSTRINGTerminalRuleCall_1_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getPnameSTRINGTerminalRuleCall_1_0_2_0()); 

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
    // $ANTLR end "rule__Mqtt_data__PnameAssignment_1_0_2"


    // $ANTLR start "rule__Mqtt_data__Broker_userAssignment_1_1_2"
    // InternalBPMN_translator.g:6350:1: rule__Mqtt_data__Broker_userAssignment_1_1_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_data__Broker_userAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6354:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6355:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6355:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6356:3: RULE_STRING
            {
             before(grammarAccess.getMqtt_dataAccess().getBroker_userSTRINGTerminalRuleCall_1_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getBroker_userSTRINGTerminalRuleCall_1_1_2_0()); 

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
    // $ANTLR end "rule__Mqtt_data__Broker_userAssignment_1_1_2"


    // $ANTLR start "rule__Mqtt_data__Broker_passwordAssignment_1_2_2"
    // InternalBPMN_translator.g:6365:1: rule__Mqtt_data__Broker_passwordAssignment_1_2_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_data__Broker_passwordAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6369:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6370:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6370:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6371:3: RULE_STRING
            {
             before(grammarAccess.getMqtt_dataAccess().getBroker_passwordSTRINGTerminalRuleCall_1_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getBroker_passwordSTRINGTerminalRuleCall_1_2_2_0()); 

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
    // $ANTLR end "rule__Mqtt_data__Broker_passwordAssignment_1_2_2"


    // $ANTLR start "rule__Mqtt_data__BrokerAssignment_1_3_2"
    // InternalBPMN_translator.g:6380:1: rule__Mqtt_data__BrokerAssignment_1_3_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_data__BrokerAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6384:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6385:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6385:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6386:3: RULE_STRING
            {
             before(grammarAccess.getMqtt_dataAccess().getBrokerSTRINGTerminalRuleCall_1_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getBrokerSTRINGTerminalRuleCall_1_3_2_0()); 

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
    // $ANTLR end "rule__Mqtt_data__BrokerAssignment_1_3_2"


    // $ANTLR start "rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2"
    // InternalBPMN_translator.g:6395:1: rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 : ( rulemqtt_network_data ) ;
    public final void rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6399:1: ( ( rulemqtt_network_data ) )
            // InternalBPMN_translator.g:6400:2: ( rulemqtt_network_data )
            {
            // InternalBPMN_translator.g:6400:2: ( rulemqtt_network_data )
            // InternalBPMN_translator.g:6401:3: rulemqtt_network_data
            {
             before(grammarAccess.getMqtt_dataAccess().getMqtt_network_dataMqtt_network_dataParserRuleCall_1_4_2_0()); 
            pushFollow(FOLLOW_2);
            rulemqtt_network_data();

            state._fsp--;

             after(grammarAccess.getMqtt_dataAccess().getMqtt_network_dataMqtt_network_dataParserRuleCall_1_4_2_0()); 

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
    // $ANTLR end "rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2"


    // $ANTLR start "rule__Mqtt_data__SubtopicsAssignment_1_5_2_2"
    // InternalBPMN_translator.g:6410:1: rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_data__SubtopicsAssignment_1_5_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6414:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6415:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6415:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6416:3: RULE_STRING
            {
             before(grammarAccess.getMqtt_dataAccess().getSubtopicsSTRINGTerminalRuleCall_1_5_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getSubtopicsSTRINGTerminalRuleCall_1_5_2_2_0()); 

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
    // $ANTLR end "rule__Mqtt_data__SubtopicsAssignment_1_5_2_2"


    // $ANTLR start "rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2"
    // InternalBPMN_translator.g:6425:1: rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6429:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6430:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6430:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6431:3: RULE_STRING
            {
             before(grammarAccess.getMqtt_dataAccess().getPubtopicsSTRINGTerminalRuleCall_1_6_2_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getPubtopicsSTRINGTerminalRuleCall_1_6_2_0_2_0()); 

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
    // $ANTLR end "rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2"


    // $ANTLR start "rule__Mqtt_data__ValueAssignment_1_6_2_1_2"
    // InternalBPMN_translator.g:6440:1: rule__Mqtt_data__ValueAssignment_1_6_2_1_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_data__ValueAssignment_1_6_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6444:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6445:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6445:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6446:3: RULE_STRING
            {
             before(grammarAccess.getMqtt_dataAccess().getValueSTRINGTerminalRuleCall_1_6_2_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMqtt_dataAccess().getValueSTRINGTerminalRuleCall_1_6_2_1_2_0()); 

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
    // $ANTLR end "rule__Mqtt_data__ValueAssignment_1_6_2_1_2"


    // $ANTLR start "rule__Mqtt_network_data__SsidAssignment_2"
    // InternalBPMN_translator.g:6455:1: rule__Mqtt_network_data__SsidAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_network_data__SsidAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6459:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6460:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6460:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6461:3: RULE_STRING
            {
             before(grammarAccess.getMqtt_network_dataAccess().getSsidSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMqtt_network_dataAccess().getSsidSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Mqtt_network_data__SsidAssignment_2"


    // $ANTLR start "rule__Mqtt_network_data__PasswordAssignment_5"
    // InternalBPMN_translator.g:6470:1: rule__Mqtt_network_data__PasswordAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Mqtt_network_data__PasswordAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6474:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6475:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6475:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6476:3: RULE_STRING
            {
             before(grammarAccess.getMqtt_network_dataAccess().getPasswordSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMqtt_network_dataAccess().getPasswordSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Mqtt_network_data__PasswordAssignment_5"


    // $ANTLR start "rule__Protocol_device__DnameAssignment_4"
    // InternalBPMN_translator.g:6485:1: rule__Protocol_device__DnameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Protocol_device__DnameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6489:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6490:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6490:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6491:3: RULE_STRING
            {
             before(grammarAccess.getProtocol_deviceAccess().getDnameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProtocol_deviceAccess().getDnameSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Protocol_device__DnameAssignment_4"


    // $ANTLR start "rule__Sensor__SnameAssignment_0_0"
    // InternalBPMN_translator.g:6500:1: rule__Sensor__SnameAssignment_0_0 : ( ( 'TEMPERATURE' ) ) ;
    public final void rule__Sensor__SnameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6504:1: ( ( ( 'TEMPERATURE' ) ) )
            // InternalBPMN_translator.g:6505:2: ( ( 'TEMPERATURE' ) )
            {
            // InternalBPMN_translator.g:6505:2: ( ( 'TEMPERATURE' ) )
            // InternalBPMN_translator.g:6506:3: ( 'TEMPERATURE' )
            {
             before(grammarAccess.getSensorAccess().getSnameTEMPERATUREKeyword_0_0_0()); 
            // InternalBPMN_translator.g:6507:3: ( 'TEMPERATURE' )
            // InternalBPMN_translator.g:6508:4: 'TEMPERATURE'
            {
             before(grammarAccess.getSensorAccess().getSnameTEMPERATUREKeyword_0_0_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSnameTEMPERATUREKeyword_0_0_0()); 

            }

             after(grammarAccess.getSensorAccess().getSnameTEMPERATUREKeyword_0_0_0()); 

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
    // $ANTLR end "rule__Sensor__SnameAssignment_0_0"


    // $ANTLR start "rule__Sensor__SensorAssignment_0_2"
    // InternalBPMN_translator.g:6519:1: rule__Sensor__SensorAssignment_0_2 : ( rulesensor_data ) ;
    public final void rule__Sensor__SensorAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6523:1: ( ( rulesensor_data ) )
            // InternalBPMN_translator.g:6524:2: ( rulesensor_data )
            {
            // InternalBPMN_translator.g:6524:2: ( rulesensor_data )
            // InternalBPMN_translator.g:6525:3: rulesensor_data
            {
             before(grammarAccess.getSensorAccess().getSensorSensor_dataParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            rulesensor_data();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getSensorSensor_dataParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Sensor__SensorAssignment_0_2"


    // $ANTLR start "rule__Sensor__SnameAssignment_1_0"
    // InternalBPMN_translator.g:6534:1: rule__Sensor__SnameAssignment_1_0 : ( ( 'DISTANCE' ) ) ;
    public final void rule__Sensor__SnameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6538:1: ( ( ( 'DISTANCE' ) ) )
            // InternalBPMN_translator.g:6539:2: ( ( 'DISTANCE' ) )
            {
            // InternalBPMN_translator.g:6539:2: ( ( 'DISTANCE' ) )
            // InternalBPMN_translator.g:6540:3: ( 'DISTANCE' )
            {
             before(grammarAccess.getSensorAccess().getSnameDISTANCEKeyword_1_0_0()); 
            // InternalBPMN_translator.g:6541:3: ( 'DISTANCE' )
            // InternalBPMN_translator.g:6542:4: 'DISTANCE'
            {
             before(grammarAccess.getSensorAccess().getSnameDISTANCEKeyword_1_0_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSnameDISTANCEKeyword_1_0_0()); 

            }

             after(grammarAccess.getSensorAccess().getSnameDISTANCEKeyword_1_0_0()); 

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
    // $ANTLR end "rule__Sensor__SnameAssignment_1_0"


    // $ANTLR start "rule__Sensor__SensorAssignment_1_2"
    // InternalBPMN_translator.g:6553:1: rule__Sensor__SensorAssignment_1_2 : ( rulesensor_data ) ;
    public final void rule__Sensor__SensorAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6557:1: ( ( rulesensor_data ) )
            // InternalBPMN_translator.g:6558:2: ( rulesensor_data )
            {
            // InternalBPMN_translator.g:6558:2: ( rulesensor_data )
            // InternalBPMN_translator.g:6559:3: rulesensor_data
            {
             before(grammarAccess.getSensorAccess().getSensorSensor_dataParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulesensor_data();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getSensorSensor_dataParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Sensor__SensorAssignment_1_2"


    // $ANTLR start "rule__Sensor_data__PnameAssignment_1_0_2"
    // InternalBPMN_translator.g:6568:1: rule__Sensor_data__PnameAssignment_1_0_2 : ( RULE_STRING ) ;
    public final void rule__Sensor_data__PnameAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6572:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6573:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6573:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6574:3: RULE_STRING
            {
             before(grammarAccess.getSensor_dataAccess().getPnameSTRINGTerminalRuleCall_1_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSensor_dataAccess().getPnameSTRINGTerminalRuleCall_1_0_2_0()); 

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
    // $ANTLR end "rule__Sensor_data__PnameAssignment_1_0_2"


    // $ANTLR start "rule__Sensor_data__PinsAssignment_1_1_2"
    // InternalBPMN_translator.g:6583:1: rule__Sensor_data__PinsAssignment_1_1_2 : ( RULE_STRING ) ;
    public final void rule__Sensor_data__PinsAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6587:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6588:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6588:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6589:3: RULE_STRING
            {
             before(grammarAccess.getSensor_dataAccess().getPinsSTRINGTerminalRuleCall_1_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSensor_dataAccess().getPinsSTRINGTerminalRuleCall_1_1_2_0()); 

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
    // $ANTLR end "rule__Sensor_data__PinsAssignment_1_1_2"


    // $ANTLR start "rule__Sensor_data__Sensor_idAssignment_1_2_2"
    // InternalBPMN_translator.g:6598:1: rule__Sensor_data__Sensor_idAssignment_1_2_2 : ( RULE_STRING ) ;
    public final void rule__Sensor_data__Sensor_idAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6602:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6603:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6603:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6604:3: RULE_STRING
            {
             before(grammarAccess.getSensor_dataAccess().getSensor_idSTRINGTerminalRuleCall_1_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSensor_dataAccess().getSensor_idSTRINGTerminalRuleCall_1_2_2_0()); 

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
    // $ANTLR end "rule__Sensor_data__Sensor_idAssignment_1_2_2"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\41\1\5\1\42\1\7\1\5\2\24\2\uffff\1\5\1\6\1\5";
    static final String dfa_3s = "\1\41\1\5\1\42\1\7\1\44\1\42\1\24\2\uffff\1\44\1\6\1\44";
    static final String dfa_4s = "\7\uffff\1\2\1\1\3\uffff";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5\1\uffff\1\6\33\uffff\1\10\1\7",
            "\1\10\15\uffff\1\11",
            "\1\12",
            "",
            "",
            "\1\5\1\uffff\1\6\33\uffff\1\10\1\7",
            "\1\13",
            "\1\5\1\uffff\1\6\33\uffff\1\10\1\7"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "552:1: rule__Element__Alternatives : ( ( ( rule__Element__Group_0__0 ) ) | ( ( rule__Element__Singleton_tagAssignment_1 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000420600C0D0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000420600C0D2L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004006000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001FF0000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001FF0002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000008000000A0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000000000A2L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0xC000004000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x017C100000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0007F00000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0007F00000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0200000100000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x017C100000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0080000100000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0082000100000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0082000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x3000100000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x3000100000000002L});

}