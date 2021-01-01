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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BODY", "RULE_HEAD", "RULE_STRING", "RULE_KEYWORDS", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'_TASK'", "'_GATEWAY'", "'&lt;'", "'&le;'", "'&ge;'", "'&gt;'", "'='", "'&amp;'", "'||'", "')'", "'!'", "'('", "'<?'", "'version='", "'encoding='", "'?>'", "'{'", "'}'", "'<'", "':'", "'>'", "'/>'", "'</'", "'TEMPERATURE'", "'['", "','", "']'", "'DEVICE'", "'NAMEID'", "'NAME'", "'SERVER_IP'", "'REQUEST_TYPE'", "'CONTENT_TYPE'", "'HEADER'", "'DATA'", "'NETWORK'", "'BROKER_USER'", "'BROKER_PASSWORD'", "'BROKER'", "'SUBTOPICS'", "'TOPIC_NAME'", "'PUBTOPICS'", "'SSID'", "'PASSWORD'", "'PROTOCOL_DEVICE'", "'PINS'", "'SENSOR_ID'", "'MQTT'", "'HTTP'", "'DISTANCE'"
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


    // $ANTLR start "entryRulemqtt_device"
    // InternalBPMN_translator.g:478:1: entryRulemqtt_device : rulemqtt_device EOF ;
    public final void entryRulemqtt_device() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:479:1: ( rulemqtt_device EOF )
            // InternalBPMN_translator.g:480:1: rulemqtt_device EOF
            {
             before(grammarAccess.getMqtt_deviceRule()); 
            pushFollow(FOLLOW_1);
            rulemqtt_device();

            state._fsp--;

             after(grammarAccess.getMqtt_deviceRule()); 
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
    // $ANTLR end "entryRulemqtt_device"


    // $ANTLR start "rulemqtt_device"
    // InternalBPMN_translator.g:487:1: rulemqtt_device : ( ( rule__Mqtt_device__Group__0 ) ) ;
    public final void rulemqtt_device() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:491:2: ( ( ( rule__Mqtt_device__Group__0 ) ) )
            // InternalBPMN_translator.g:492:2: ( ( rule__Mqtt_device__Group__0 ) )
            {
            // InternalBPMN_translator.g:492:2: ( ( rule__Mqtt_device__Group__0 ) )
            // InternalBPMN_translator.g:493:3: ( rule__Mqtt_device__Group__0 )
            {
             before(grammarAccess.getMqtt_deviceAccess().getGroup()); 
            // InternalBPMN_translator.g:494:3: ( rule__Mqtt_device__Group__0 )
            // InternalBPMN_translator.g:494:4: rule__Mqtt_device__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mqtt_device__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMqtt_deviceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemqtt_device"


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
            case 32:
                {
                alt2=2;
                }
                break;
            case RULE_BODY:
            case 24:
            case 25:
            case 37:
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

                if ( (LA4_1==EOF||LA4_1==RULE_BODY||(LA4_1>=RULE_STRING && LA4_1<=RULE_KEYWORDS)||(LA4_1>=14 && LA4_1<=25)||LA4_1==32||(LA4_1>=36 && LA4_1<=37)) ) {
                    alt4=1;
                }
                else if ( (LA4_1==38) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==37) ) {
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

                if ( (LA5_1==20) ) {
                    alt5=2;
                }
                else if ( (LA5_1==33) ) {
                    alt5=1;
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

            if ( (LA8_0==37) ) {
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
    // InternalBPMN_translator.g:738:1: rule__Conditions__Alternatives : ( ( '&lt;' ) | ( '&le;' ) | ( '&ge;' ) | ( '&gt;' ) | ( '=' ) | ( '&amp;' ) | ( '||' ) | ( ')' ) );
    public final void rule__Conditions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:742:1: ( ( '&lt;' ) | ( '&le;' ) | ( '&ge;' ) | ( '&gt;' ) | ( '=' ) | ( '&amp;' ) | ( '||' ) | ( ')' ) )
            int alt9=8;
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

            }
        }
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
    // InternalBPMN_translator.g:795:1: rule__Preconditions__Alternatives : ( ( '!' ) | ( '(' ) );
    public final void rule__Preconditions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:799:1: ( ( '!' ) | ( '(' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            else if ( (LA10_0==25) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalBPMN_translator.g:800:2: ( '!' )
                    {
                    // InternalBPMN_translator.g:800:2: ( '!' )
                    // InternalBPMN_translator.g:801:3: '!'
                    {
                     before(grammarAccess.getPreconditionsAccess().getExclamationMarkKeyword_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getPreconditionsAccess().getExclamationMarkKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:806:2: ( '(' )
                    {
                    // InternalBPMN_translator.g:806:2: ( '(' )
                    // InternalBPMN_translator.g:807:3: '('
                    {
                     before(grammarAccess.getPreconditionsAccess().getLeftParenthesisKeyword_1()); 
                    match(input,25,FOLLOW_2); 
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
    // InternalBPMN_translator.g:816:1: rule__Protocol__Alternatives : ( ( ( rule__Protocol__Group_0__0 ) ) | ( ( rule__Protocol__Group_1__0 ) ) );
    public final void rule__Protocol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:820:1: ( ( ( rule__Protocol__Group_0__0 ) ) | ( ( rule__Protocol__Group_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==61) ) {
                alt11=1;
            }
            else if ( (LA11_0==62) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalBPMN_translator.g:821:2: ( ( rule__Protocol__Group_0__0 ) )
                    {
                    // InternalBPMN_translator.g:821:2: ( ( rule__Protocol__Group_0__0 ) )
                    // InternalBPMN_translator.g:822:3: ( rule__Protocol__Group_0__0 )
                    {
                     before(grammarAccess.getProtocolAccess().getGroup_0()); 
                    // InternalBPMN_translator.g:823:3: ( rule__Protocol__Group_0__0 )
                    // InternalBPMN_translator.g:823:4: rule__Protocol__Group_0__0
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
                    // InternalBPMN_translator.g:827:2: ( ( rule__Protocol__Group_1__0 ) )
                    {
                    // InternalBPMN_translator.g:827:2: ( ( rule__Protocol__Group_1__0 ) )
                    // InternalBPMN_translator.g:828:3: ( rule__Protocol__Group_1__0 )
                    {
                     before(grammarAccess.getProtocolAccess().getGroup_1()); 
                    // InternalBPMN_translator.g:829:3: ( rule__Protocol__Group_1__0 )
                    // InternalBPMN_translator.g:829:4: rule__Protocol__Group_1__0
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
    // InternalBPMN_translator.g:837:1: rule__Http_data__Alternatives_1 : ( ( ( rule__Http_data__Group_1_0__0 ) ) | ( ( rule__Http_data__Group_1_1__0 ) ) | ( ( rule__Http_data__Group_1_2__0 ) ) | ( ( rule__Http_data__Group_1_3__0 ) ) | ( ( rule__Http_data__Group_1_4__0 ) ) | ( ( rule__Http_data__Group_1_5__0 ) ) | ( ( rule__Http_data__Group_1_6__0 ) ) );
    public final void rule__Http_data__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:841:1: ( ( ( rule__Http_data__Group_1_0__0 ) ) | ( ( rule__Http_data__Group_1_1__0 ) ) | ( ( rule__Http_data__Group_1_2__0 ) ) | ( ( rule__Http_data__Group_1_3__0 ) ) | ( ( rule__Http_data__Group_1_4__0 ) ) | ( ( rule__Http_data__Group_1_5__0 ) ) | ( ( rule__Http_data__Group_1_6__0 ) ) )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt12=1;
                }
                break;
            case 44:
                {
                alt12=2;
                }
                break;
            case 45:
                {
                alt12=3;
                }
                break;
            case 46:
                {
                alt12=4;
                }
                break;
            case 47:
                {
                alt12=5;
                }
                break;
            case 48:
                {
                alt12=6;
                }
                break;
            case 49:
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
                    // InternalBPMN_translator.g:842:2: ( ( rule__Http_data__Group_1_0__0 ) )
                    {
                    // InternalBPMN_translator.g:842:2: ( ( rule__Http_data__Group_1_0__0 ) )
                    // InternalBPMN_translator.g:843:3: ( rule__Http_data__Group_1_0__0 )
                    {
                     before(grammarAccess.getHttp_dataAccess().getGroup_1_0()); 
                    // InternalBPMN_translator.g:844:3: ( rule__Http_data__Group_1_0__0 )
                    // InternalBPMN_translator.g:844:4: rule__Http_data__Group_1_0__0
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
                    // InternalBPMN_translator.g:848:2: ( ( rule__Http_data__Group_1_1__0 ) )
                    {
                    // InternalBPMN_translator.g:848:2: ( ( rule__Http_data__Group_1_1__0 ) )
                    // InternalBPMN_translator.g:849:3: ( rule__Http_data__Group_1_1__0 )
                    {
                     before(grammarAccess.getHttp_dataAccess().getGroup_1_1()); 
                    // InternalBPMN_translator.g:850:3: ( rule__Http_data__Group_1_1__0 )
                    // InternalBPMN_translator.g:850:4: rule__Http_data__Group_1_1__0
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
                    // InternalBPMN_translator.g:854:2: ( ( rule__Http_data__Group_1_2__0 ) )
                    {
                    // InternalBPMN_translator.g:854:2: ( ( rule__Http_data__Group_1_2__0 ) )
                    // InternalBPMN_translator.g:855:3: ( rule__Http_data__Group_1_2__0 )
                    {
                     before(grammarAccess.getHttp_dataAccess().getGroup_1_2()); 
                    // InternalBPMN_translator.g:856:3: ( rule__Http_data__Group_1_2__0 )
                    // InternalBPMN_translator.g:856:4: rule__Http_data__Group_1_2__0
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
                    // InternalBPMN_translator.g:860:2: ( ( rule__Http_data__Group_1_3__0 ) )
                    {
                    // InternalBPMN_translator.g:860:2: ( ( rule__Http_data__Group_1_3__0 ) )
                    // InternalBPMN_translator.g:861:3: ( rule__Http_data__Group_1_3__0 )
                    {
                     before(grammarAccess.getHttp_dataAccess().getGroup_1_3()); 
                    // InternalBPMN_translator.g:862:3: ( rule__Http_data__Group_1_3__0 )
                    // InternalBPMN_translator.g:862:4: rule__Http_data__Group_1_3__0
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
                    // InternalBPMN_translator.g:866:2: ( ( rule__Http_data__Group_1_4__0 ) )
                    {
                    // InternalBPMN_translator.g:866:2: ( ( rule__Http_data__Group_1_4__0 ) )
                    // InternalBPMN_translator.g:867:3: ( rule__Http_data__Group_1_4__0 )
                    {
                     before(grammarAccess.getHttp_dataAccess().getGroup_1_4()); 
                    // InternalBPMN_translator.g:868:3: ( rule__Http_data__Group_1_4__0 )
                    // InternalBPMN_translator.g:868:4: rule__Http_data__Group_1_4__0
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
                    // InternalBPMN_translator.g:872:2: ( ( rule__Http_data__Group_1_5__0 ) )
                    {
                    // InternalBPMN_translator.g:872:2: ( ( rule__Http_data__Group_1_5__0 ) )
                    // InternalBPMN_translator.g:873:3: ( rule__Http_data__Group_1_5__0 )
                    {
                     before(grammarAccess.getHttp_dataAccess().getGroup_1_5()); 
                    // InternalBPMN_translator.g:874:3: ( rule__Http_data__Group_1_5__0 )
                    // InternalBPMN_translator.g:874:4: rule__Http_data__Group_1_5__0
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
                    // InternalBPMN_translator.g:878:2: ( ( rule__Http_data__Group_1_6__0 ) )
                    {
                    // InternalBPMN_translator.g:878:2: ( ( rule__Http_data__Group_1_6__0 ) )
                    // InternalBPMN_translator.g:879:3: ( rule__Http_data__Group_1_6__0 )
                    {
                     before(grammarAccess.getHttp_dataAccess().getGroup_1_6()); 
                    // InternalBPMN_translator.g:880:3: ( rule__Http_data__Group_1_6__0 )
                    // InternalBPMN_translator.g:880:4: rule__Http_data__Group_1_6__0
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
    // InternalBPMN_translator.g:888:1: rule__Mqtt_data__Alternatives_1 : ( ( ( rule__Mqtt_data__Group_1_0__0 ) ) | ( ( rule__Mqtt_data__Group_1_1__0 ) ) | ( ( rule__Mqtt_data__Group_1_2__0 ) ) | ( ( rule__Mqtt_data__Group_1_3__0 ) ) | ( ( rule__Mqtt_data__Group_1_4__0 ) ) | ( ( rule__Mqtt_data__Group_1_5__0 ) ) | ( ( rule__Mqtt_data__Group_1_6__0 ) ) );
    public final void rule__Mqtt_data__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:892:1: ( ( ( rule__Mqtt_data__Group_1_0__0 ) ) | ( ( rule__Mqtt_data__Group_1_1__0 ) ) | ( ( rule__Mqtt_data__Group_1_2__0 ) ) | ( ( rule__Mqtt_data__Group_1_3__0 ) ) | ( ( rule__Mqtt_data__Group_1_4__0 ) ) | ( ( rule__Mqtt_data__Group_1_5__0 ) ) | ( ( rule__Mqtt_data__Group_1_6__0 ) ) )
            int alt13=7;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt13=1;
                }
                break;
            case 50:
                {
                alt13=2;
                }
                break;
            case 51:
                {
                alt13=3;
                }
                break;
            case 52:
                {
                alt13=4;
                }
                break;
            case 49:
                {
                alt13=5;
                }
                break;
            case 53:
                {
                alt13=6;
                }
                break;
            case 55:
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
                    // InternalBPMN_translator.g:893:2: ( ( rule__Mqtt_data__Group_1_0__0 ) )
                    {
                    // InternalBPMN_translator.g:893:2: ( ( rule__Mqtt_data__Group_1_0__0 ) )
                    // InternalBPMN_translator.g:894:3: ( rule__Mqtt_data__Group_1_0__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_0()); 
                    // InternalBPMN_translator.g:895:3: ( rule__Mqtt_data__Group_1_0__0 )
                    // InternalBPMN_translator.g:895:4: rule__Mqtt_data__Group_1_0__0
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
                    // InternalBPMN_translator.g:899:2: ( ( rule__Mqtt_data__Group_1_1__0 ) )
                    {
                    // InternalBPMN_translator.g:899:2: ( ( rule__Mqtt_data__Group_1_1__0 ) )
                    // InternalBPMN_translator.g:900:3: ( rule__Mqtt_data__Group_1_1__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_1()); 
                    // InternalBPMN_translator.g:901:3: ( rule__Mqtt_data__Group_1_1__0 )
                    // InternalBPMN_translator.g:901:4: rule__Mqtt_data__Group_1_1__0
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
                    // InternalBPMN_translator.g:905:2: ( ( rule__Mqtt_data__Group_1_2__0 ) )
                    {
                    // InternalBPMN_translator.g:905:2: ( ( rule__Mqtt_data__Group_1_2__0 ) )
                    // InternalBPMN_translator.g:906:3: ( rule__Mqtt_data__Group_1_2__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_2()); 
                    // InternalBPMN_translator.g:907:3: ( rule__Mqtt_data__Group_1_2__0 )
                    // InternalBPMN_translator.g:907:4: rule__Mqtt_data__Group_1_2__0
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
                    // InternalBPMN_translator.g:911:2: ( ( rule__Mqtt_data__Group_1_3__0 ) )
                    {
                    // InternalBPMN_translator.g:911:2: ( ( rule__Mqtt_data__Group_1_3__0 ) )
                    // InternalBPMN_translator.g:912:3: ( rule__Mqtt_data__Group_1_3__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_3()); 
                    // InternalBPMN_translator.g:913:3: ( rule__Mqtt_data__Group_1_3__0 )
                    // InternalBPMN_translator.g:913:4: rule__Mqtt_data__Group_1_3__0
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
                    // InternalBPMN_translator.g:917:2: ( ( rule__Mqtt_data__Group_1_4__0 ) )
                    {
                    // InternalBPMN_translator.g:917:2: ( ( rule__Mqtt_data__Group_1_4__0 ) )
                    // InternalBPMN_translator.g:918:3: ( rule__Mqtt_data__Group_1_4__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_4()); 
                    // InternalBPMN_translator.g:919:3: ( rule__Mqtt_data__Group_1_4__0 )
                    // InternalBPMN_translator.g:919:4: rule__Mqtt_data__Group_1_4__0
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
                    // InternalBPMN_translator.g:923:2: ( ( rule__Mqtt_data__Group_1_5__0 ) )
                    {
                    // InternalBPMN_translator.g:923:2: ( ( rule__Mqtt_data__Group_1_5__0 ) )
                    // InternalBPMN_translator.g:924:3: ( rule__Mqtt_data__Group_1_5__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_5()); 
                    // InternalBPMN_translator.g:925:3: ( rule__Mqtt_data__Group_1_5__0 )
                    // InternalBPMN_translator.g:925:4: rule__Mqtt_data__Group_1_5__0
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
                    // InternalBPMN_translator.g:929:2: ( ( rule__Mqtt_data__Group_1_6__0 ) )
                    {
                    // InternalBPMN_translator.g:929:2: ( ( rule__Mqtt_data__Group_1_6__0 ) )
                    // InternalBPMN_translator.g:930:3: ( rule__Mqtt_data__Group_1_6__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_6()); 
                    // InternalBPMN_translator.g:931:3: ( rule__Mqtt_data__Group_1_6__0 )
                    // InternalBPMN_translator.g:931:4: rule__Mqtt_data__Group_1_6__0
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
    // InternalBPMN_translator.g:939:1: rule__Mqtt_data__Alternatives_1_6_2 : ( ( ( rule__Mqtt_data__Group_1_6_2_0__0 ) ) | ( ( rule__Mqtt_data__Group_1_6_2_1__0 ) ) );
    public final void rule__Mqtt_data__Alternatives_1_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:943:1: ( ( ( rule__Mqtt_data__Group_1_6_2_0__0 ) ) | ( ( rule__Mqtt_data__Group_1_6_2_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==54) ) {
                alt14=1;
            }
            else if ( (LA14_0==48) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalBPMN_translator.g:944:2: ( ( rule__Mqtt_data__Group_1_6_2_0__0 ) )
                    {
                    // InternalBPMN_translator.g:944:2: ( ( rule__Mqtt_data__Group_1_6_2_0__0 ) )
                    // InternalBPMN_translator.g:945:3: ( rule__Mqtt_data__Group_1_6_2_0__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_6_2_0()); 
                    // InternalBPMN_translator.g:946:3: ( rule__Mqtt_data__Group_1_6_2_0__0 )
                    // InternalBPMN_translator.g:946:4: rule__Mqtt_data__Group_1_6_2_0__0
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
                    // InternalBPMN_translator.g:950:2: ( ( rule__Mqtt_data__Group_1_6_2_1__0 ) )
                    {
                    // InternalBPMN_translator.g:950:2: ( ( rule__Mqtt_data__Group_1_6_2_1__0 ) )
                    // InternalBPMN_translator.g:951:3: ( rule__Mqtt_data__Group_1_6_2_1__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_6_2_1()); 
                    // InternalBPMN_translator.g:952:3: ( rule__Mqtt_data__Group_1_6_2_1__0 )
                    // InternalBPMN_translator.g:952:4: rule__Mqtt_data__Group_1_6_2_1__0
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
    // InternalBPMN_translator.g:960:1: rule__Sensor__Alternatives : ( ( ( rule__Sensor__Group_0__0 ) ) | ( ( rule__Sensor__Group_1__0 ) ) );
    public final void rule__Sensor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:964:1: ( ( ( rule__Sensor__Group_0__0 ) ) | ( ( rule__Sensor__Group_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            else if ( (LA15_0==63) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalBPMN_translator.g:965:2: ( ( rule__Sensor__Group_0__0 ) )
                    {
                    // InternalBPMN_translator.g:965:2: ( ( rule__Sensor__Group_0__0 ) )
                    // InternalBPMN_translator.g:966:3: ( rule__Sensor__Group_0__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_0()); 
                    // InternalBPMN_translator.g:967:3: ( rule__Sensor__Group_0__0 )
                    // InternalBPMN_translator.g:967:4: rule__Sensor__Group_0__0
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
                    // InternalBPMN_translator.g:971:2: ( ( rule__Sensor__Group_1__0 ) )
                    {
                    // InternalBPMN_translator.g:971:2: ( ( rule__Sensor__Group_1__0 ) )
                    // InternalBPMN_translator.g:972:3: ( rule__Sensor__Group_1__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_1()); 
                    // InternalBPMN_translator.g:973:3: ( rule__Sensor__Group_1__0 )
                    // InternalBPMN_translator.g:973:4: rule__Sensor__Group_1__0
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
    // InternalBPMN_translator.g:981:1: rule__Sensor_data__Alternatives_1 : ( ( ( rule__Sensor_data__Group_1_0__0 ) ) | ( ( rule__Sensor_data__Group_1_1__0 ) ) | ( ( rule__Sensor_data__Group_1_2__0 ) ) );
    public final void rule__Sensor_data__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:985:1: ( ( ( rule__Sensor_data__Group_1_0__0 ) ) | ( ( rule__Sensor_data__Group_1_1__0 ) ) | ( ( rule__Sensor_data__Group_1_2__0 ) ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt16=1;
                }
                break;
            case 59:
                {
                alt16=2;
                }
                break;
            case 60:
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
                    // InternalBPMN_translator.g:986:2: ( ( rule__Sensor_data__Group_1_0__0 ) )
                    {
                    // InternalBPMN_translator.g:986:2: ( ( rule__Sensor_data__Group_1_0__0 ) )
                    // InternalBPMN_translator.g:987:3: ( rule__Sensor_data__Group_1_0__0 )
                    {
                     before(grammarAccess.getSensor_dataAccess().getGroup_1_0()); 
                    // InternalBPMN_translator.g:988:3: ( rule__Sensor_data__Group_1_0__0 )
                    // InternalBPMN_translator.g:988:4: rule__Sensor_data__Group_1_0__0
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
                    // InternalBPMN_translator.g:992:2: ( ( rule__Sensor_data__Group_1_1__0 ) )
                    {
                    // InternalBPMN_translator.g:992:2: ( ( rule__Sensor_data__Group_1_1__0 ) )
                    // InternalBPMN_translator.g:993:3: ( rule__Sensor_data__Group_1_1__0 )
                    {
                     before(grammarAccess.getSensor_dataAccess().getGroup_1_1()); 
                    // InternalBPMN_translator.g:994:3: ( rule__Sensor_data__Group_1_1__0 )
                    // InternalBPMN_translator.g:994:4: rule__Sensor_data__Group_1_1__0
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
                    // InternalBPMN_translator.g:998:2: ( ( rule__Sensor_data__Group_1_2__0 ) )
                    {
                    // InternalBPMN_translator.g:998:2: ( ( rule__Sensor_data__Group_1_2__0 ) )
                    // InternalBPMN_translator.g:999:3: ( rule__Sensor_data__Group_1_2__0 )
                    {
                     before(grammarAccess.getSensor_dataAccess().getGroup_1_2()); 
                    // InternalBPMN_translator.g:1000:3: ( rule__Sensor_data__Group_1_2__0 )
                    // InternalBPMN_translator.g:1000:4: rule__Sensor_data__Group_1_2__0
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
    // InternalBPMN_translator.g:1008:1: rule__Xml__Group__0 : rule__Xml__Group__0__Impl rule__Xml__Group__1 ;
    public final void rule__Xml__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1012:1: ( rule__Xml__Group__0__Impl rule__Xml__Group__1 )
            // InternalBPMN_translator.g:1013:2: rule__Xml__Group__0__Impl rule__Xml__Group__1
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
    // InternalBPMN_translator.g:1020:1: rule__Xml__Group__0__Impl : ( () ) ;
    public final void rule__Xml__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1024:1: ( ( () ) )
            // InternalBPMN_translator.g:1025:1: ( () )
            {
            // InternalBPMN_translator.g:1025:1: ( () )
            // InternalBPMN_translator.g:1026:2: ()
            {
             before(grammarAccess.getXmlAccess().getXmlAction_0()); 
            // InternalBPMN_translator.g:1027:2: ()
            // InternalBPMN_translator.g:1027:3: 
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
    // InternalBPMN_translator.g:1035:1: rule__Xml__Group__1 : rule__Xml__Group__1__Impl rule__Xml__Group__2 ;
    public final void rule__Xml__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1039:1: ( rule__Xml__Group__1__Impl rule__Xml__Group__2 )
            // InternalBPMN_translator.g:1040:2: rule__Xml__Group__1__Impl rule__Xml__Group__2
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
    // InternalBPMN_translator.g:1047:1: rule__Xml__Group__1__Impl : ( ( ruleprolog )? ) ;
    public final void rule__Xml__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1051:1: ( ( ( ruleprolog )? ) )
            // InternalBPMN_translator.g:1052:1: ( ( ruleprolog )? )
            {
            // InternalBPMN_translator.g:1052:1: ( ( ruleprolog )? )
            // InternalBPMN_translator.g:1053:2: ( ruleprolog )?
            {
             before(grammarAccess.getXmlAccess().getPrologParserRuleCall_1()); 
            // InternalBPMN_translator.g:1054:2: ( ruleprolog )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBPMN_translator.g:1054:3: ruleprolog
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
    // InternalBPMN_translator.g:1062:1: rule__Xml__Group__2 : rule__Xml__Group__2__Impl ;
    public final void rule__Xml__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1066:1: ( rule__Xml__Group__2__Impl )
            // InternalBPMN_translator.g:1067:2: rule__Xml__Group__2__Impl
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
    // InternalBPMN_translator.g:1073:1: rule__Xml__Group__2__Impl : ( ( rule__Xml__ProvaAssignment_2 )* ) ;
    public final void rule__Xml__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1077:1: ( ( ( rule__Xml__ProvaAssignment_2 )* ) )
            // InternalBPMN_translator.g:1078:1: ( ( rule__Xml__ProvaAssignment_2 )* )
            {
            // InternalBPMN_translator.g:1078:1: ( ( rule__Xml__ProvaAssignment_2 )* )
            // InternalBPMN_translator.g:1079:2: ( rule__Xml__ProvaAssignment_2 )*
            {
             before(grammarAccess.getXmlAccess().getProvaAssignment_2()); 
            // InternalBPMN_translator.g:1080:2: ( rule__Xml__ProvaAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBPMN_translator.g:1080:3: rule__Xml__ProvaAssignment_2
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
    // InternalBPMN_translator.g:1089:1: rule__Prolog__Group__0 : rule__Prolog__Group__0__Impl rule__Prolog__Group__1 ;
    public final void rule__Prolog__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1093:1: ( rule__Prolog__Group__0__Impl rule__Prolog__Group__1 )
            // InternalBPMN_translator.g:1094:2: rule__Prolog__Group__0__Impl rule__Prolog__Group__1
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
    // InternalBPMN_translator.g:1101:1: rule__Prolog__Group__0__Impl : ( '<?' ) ;
    public final void rule__Prolog__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1105:1: ( ( '<?' ) )
            // InternalBPMN_translator.g:1106:1: ( '<?' )
            {
            // InternalBPMN_translator.g:1106:1: ( '<?' )
            // InternalBPMN_translator.g:1107:2: '<?'
            {
             before(grammarAccess.getPrologAccess().getLessThanSignQuestionMarkKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBPMN_translator.g:1116:1: rule__Prolog__Group__1 : rule__Prolog__Group__1__Impl rule__Prolog__Group__2 ;
    public final void rule__Prolog__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1120:1: ( rule__Prolog__Group__1__Impl rule__Prolog__Group__2 )
            // InternalBPMN_translator.g:1121:2: rule__Prolog__Group__1__Impl rule__Prolog__Group__2
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
    // InternalBPMN_translator.g:1128:1: rule__Prolog__Group__1__Impl : ( RULE_HEAD ) ;
    public final void rule__Prolog__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1132:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:1133:1: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:1133:1: ( RULE_HEAD )
            // InternalBPMN_translator.g:1134:2: RULE_HEAD
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
    // InternalBPMN_translator.g:1143:1: rule__Prolog__Group__2 : rule__Prolog__Group__2__Impl rule__Prolog__Group__3 ;
    public final void rule__Prolog__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1147:1: ( rule__Prolog__Group__2__Impl rule__Prolog__Group__3 )
            // InternalBPMN_translator.g:1148:2: rule__Prolog__Group__2__Impl rule__Prolog__Group__3
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
    // InternalBPMN_translator.g:1155:1: rule__Prolog__Group__2__Impl : ( 'version=' ) ;
    public final void rule__Prolog__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1159:1: ( ( 'version=' ) )
            // InternalBPMN_translator.g:1160:1: ( 'version=' )
            {
            // InternalBPMN_translator.g:1160:1: ( 'version=' )
            // InternalBPMN_translator.g:1161:2: 'version='
            {
             before(grammarAccess.getPrologAccess().getVersionKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBPMN_translator.g:1170:1: rule__Prolog__Group__3 : rule__Prolog__Group__3__Impl rule__Prolog__Group__4 ;
    public final void rule__Prolog__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1174:1: ( rule__Prolog__Group__3__Impl rule__Prolog__Group__4 )
            // InternalBPMN_translator.g:1175:2: rule__Prolog__Group__3__Impl rule__Prolog__Group__4
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
    // InternalBPMN_translator.g:1182:1: rule__Prolog__Group__3__Impl : ( RULE_STRING ) ;
    public final void rule__Prolog__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1186:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:1187:1: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:1187:1: ( RULE_STRING )
            // InternalBPMN_translator.g:1188:2: RULE_STRING
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
    // InternalBPMN_translator.g:1197:1: rule__Prolog__Group__4 : rule__Prolog__Group__4__Impl rule__Prolog__Group__5 ;
    public final void rule__Prolog__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1201:1: ( rule__Prolog__Group__4__Impl rule__Prolog__Group__5 )
            // InternalBPMN_translator.g:1202:2: rule__Prolog__Group__4__Impl rule__Prolog__Group__5
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
    // InternalBPMN_translator.g:1209:1: rule__Prolog__Group__4__Impl : ( 'encoding=' ) ;
    public final void rule__Prolog__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1213:1: ( ( 'encoding=' ) )
            // InternalBPMN_translator.g:1214:1: ( 'encoding=' )
            {
            // InternalBPMN_translator.g:1214:1: ( 'encoding=' )
            // InternalBPMN_translator.g:1215:2: 'encoding='
            {
             before(grammarAccess.getPrologAccess().getEncodingKeyword_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBPMN_translator.g:1224:1: rule__Prolog__Group__5 : rule__Prolog__Group__5__Impl rule__Prolog__Group__6 ;
    public final void rule__Prolog__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1228:1: ( rule__Prolog__Group__5__Impl rule__Prolog__Group__6 )
            // InternalBPMN_translator.g:1229:2: rule__Prolog__Group__5__Impl rule__Prolog__Group__6
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
    // InternalBPMN_translator.g:1236:1: rule__Prolog__Group__5__Impl : ( RULE_STRING ) ;
    public final void rule__Prolog__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1240:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:1241:1: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:1241:1: ( RULE_STRING )
            // InternalBPMN_translator.g:1242:2: RULE_STRING
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
    // InternalBPMN_translator.g:1251:1: rule__Prolog__Group__6 : rule__Prolog__Group__6__Impl ;
    public final void rule__Prolog__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1255:1: ( rule__Prolog__Group__6__Impl )
            // InternalBPMN_translator.g:1256:2: rule__Prolog__Group__6__Impl
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
    // InternalBPMN_translator.g:1262:1: rule__Prolog__Group__6__Impl : ( '?>' ) ;
    public final void rule__Prolog__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1266:1: ( ( '?>' ) )
            // InternalBPMN_translator.g:1267:1: ( '?>' )
            {
            // InternalBPMN_translator.g:1267:1: ( '?>' )
            // InternalBPMN_translator.g:1268:2: '?>'
            {
             before(grammarAccess.getPrologAccess().getQuestionMarkGreaterThanSignKeyword_6()); 
            match(input,29,FOLLOW_2); 
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
    // InternalBPMN_translator.g:1278:1: rule__Element__Group_0__0 : rule__Element__Group_0__0__Impl rule__Element__Group_0__1 ;
    public final void rule__Element__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1282:1: ( rule__Element__Group_0__0__Impl rule__Element__Group_0__1 )
            // InternalBPMN_translator.g:1283:2: rule__Element__Group_0__0__Impl rule__Element__Group_0__1
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
    // InternalBPMN_translator.g:1290:1: rule__Element__Group_0__0__Impl : ( ( rule__Element__OpenAssignment_0_0 ) ) ;
    public final void rule__Element__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1294:1: ( ( ( rule__Element__OpenAssignment_0_0 ) ) )
            // InternalBPMN_translator.g:1295:1: ( ( rule__Element__OpenAssignment_0_0 ) )
            {
            // InternalBPMN_translator.g:1295:1: ( ( rule__Element__OpenAssignment_0_0 ) )
            // InternalBPMN_translator.g:1296:2: ( rule__Element__OpenAssignment_0_0 )
            {
             before(grammarAccess.getElementAccess().getOpenAssignment_0_0()); 
            // InternalBPMN_translator.g:1297:2: ( rule__Element__OpenAssignment_0_0 )
            // InternalBPMN_translator.g:1297:3: rule__Element__OpenAssignment_0_0
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
    // InternalBPMN_translator.g:1305:1: rule__Element__Group_0__1 : rule__Element__Group_0__1__Impl rule__Element__Group_0__2 ;
    public final void rule__Element__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1309:1: ( rule__Element__Group_0__1__Impl rule__Element__Group_0__2 )
            // InternalBPMN_translator.g:1310:2: rule__Element__Group_0__1__Impl rule__Element__Group_0__2
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
    // InternalBPMN_translator.g:1317:1: rule__Element__Group_0__1__Impl : ( ( rule__Element__ContentsAssignment_0_1 ) ) ;
    public final void rule__Element__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1321:1: ( ( ( rule__Element__ContentsAssignment_0_1 ) ) )
            // InternalBPMN_translator.g:1322:1: ( ( rule__Element__ContentsAssignment_0_1 ) )
            {
            // InternalBPMN_translator.g:1322:1: ( ( rule__Element__ContentsAssignment_0_1 ) )
            // InternalBPMN_translator.g:1323:2: ( rule__Element__ContentsAssignment_0_1 )
            {
             before(grammarAccess.getElementAccess().getContentsAssignment_0_1()); 
            // InternalBPMN_translator.g:1324:2: ( rule__Element__ContentsAssignment_0_1 )
            // InternalBPMN_translator.g:1324:3: rule__Element__ContentsAssignment_0_1
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
    // InternalBPMN_translator.g:1332:1: rule__Element__Group_0__2 : rule__Element__Group_0__2__Impl ;
    public final void rule__Element__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1336:1: ( rule__Element__Group_0__2__Impl )
            // InternalBPMN_translator.g:1337:2: rule__Element__Group_0__2__Impl
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
    // InternalBPMN_translator.g:1343:1: rule__Element__Group_0__2__Impl : ( ( rule__Element__Close_tagAssignment_0_2 ) ) ;
    public final void rule__Element__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1347:1: ( ( ( rule__Element__Close_tagAssignment_0_2 ) ) )
            // InternalBPMN_translator.g:1348:1: ( ( rule__Element__Close_tagAssignment_0_2 ) )
            {
            // InternalBPMN_translator.g:1348:1: ( ( rule__Element__Close_tagAssignment_0_2 ) )
            // InternalBPMN_translator.g:1349:2: ( rule__Element__Close_tagAssignment_0_2 )
            {
             before(grammarAccess.getElementAccess().getClose_tagAssignment_0_2()); 
            // InternalBPMN_translator.g:1350:2: ( rule__Element__Close_tagAssignment_0_2 )
            // InternalBPMN_translator.g:1350:3: rule__Element__Close_tagAssignment_0_2
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
    // InternalBPMN_translator.g:1359:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1363:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // InternalBPMN_translator.g:1364:2: rule__Content__Group__0__Impl rule__Content__Group__1
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
    // InternalBPMN_translator.g:1371:1: rule__Content__Group__0__Impl : ( () ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1375:1: ( ( () ) )
            // InternalBPMN_translator.g:1376:1: ( () )
            {
            // InternalBPMN_translator.g:1376:1: ( () )
            // InternalBPMN_translator.g:1377:2: ()
            {
             before(grammarAccess.getContentAccess().getContentAction_0()); 
            // InternalBPMN_translator.g:1378:2: ()
            // InternalBPMN_translator.g:1378:3: 
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
    // InternalBPMN_translator.g:1386:1: rule__Content__Group__1 : rule__Content__Group__1__Impl ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1390:1: ( rule__Content__Group__1__Impl )
            // InternalBPMN_translator.g:1391:2: rule__Content__Group__1__Impl
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
    // InternalBPMN_translator.g:1397:1: rule__Content__Group__1__Impl : ( ( rule__Content__Alternatives_1 )* ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1401:1: ( ( ( rule__Content__Alternatives_1 )* ) )
            // InternalBPMN_translator.g:1402:1: ( ( rule__Content__Alternatives_1 )* )
            {
            // InternalBPMN_translator.g:1402:1: ( ( rule__Content__Alternatives_1 )* )
            // InternalBPMN_translator.g:1403:2: ( rule__Content__Alternatives_1 )*
            {
             before(grammarAccess.getContentAccess().getAlternatives_1()); 
            // InternalBPMN_translator.g:1404:2: ( rule__Content__Alternatives_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_BODY||(LA19_0>=RULE_STRING && LA19_0<=RULE_KEYWORDS)||(LA19_0>=14 && LA19_0<=15)||(LA19_0>=24 && LA19_0<=25)||LA19_0==32||LA19_0==37) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBPMN_translator.g:1404:3: rule__Content__Alternatives_1
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
    // InternalBPMN_translator.g:1413:1: rule__Content__Group_1_0__0 : rule__Content__Group_1_0__0__Impl rule__Content__Group_1_0__1 ;
    public final void rule__Content__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1417:1: ( rule__Content__Group_1_0__0__Impl rule__Content__Group_1_0__1 )
            // InternalBPMN_translator.g:1418:2: rule__Content__Group_1_0__0__Impl rule__Content__Group_1_0__1
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
    // InternalBPMN_translator.g:1425:1: rule__Content__Group_1_0__0__Impl : ( ( rule__Content__TypeAssignment_1_0_0 ) ) ;
    public final void rule__Content__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1429:1: ( ( ( rule__Content__TypeAssignment_1_0_0 ) ) )
            // InternalBPMN_translator.g:1430:1: ( ( rule__Content__TypeAssignment_1_0_0 ) )
            {
            // InternalBPMN_translator.g:1430:1: ( ( rule__Content__TypeAssignment_1_0_0 ) )
            // InternalBPMN_translator.g:1431:2: ( rule__Content__TypeAssignment_1_0_0 )
            {
             before(grammarAccess.getContentAccess().getTypeAssignment_1_0_0()); 
            // InternalBPMN_translator.g:1432:2: ( rule__Content__TypeAssignment_1_0_0 )
            // InternalBPMN_translator.g:1432:3: rule__Content__TypeAssignment_1_0_0
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
    // InternalBPMN_translator.g:1440:1: rule__Content__Group_1_0__1 : rule__Content__Group_1_0__1__Impl rule__Content__Group_1_0__2 ;
    public final void rule__Content__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1444:1: ( rule__Content__Group_1_0__1__Impl rule__Content__Group_1_0__2 )
            // InternalBPMN_translator.g:1445:2: rule__Content__Group_1_0__1__Impl rule__Content__Group_1_0__2
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
    // InternalBPMN_translator.g:1452:1: rule__Content__Group_1_0__1__Impl : ( '{' ) ;
    public final void rule__Content__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1456:1: ( ( '{' ) )
            // InternalBPMN_translator.g:1457:1: ( '{' )
            {
            // InternalBPMN_translator.g:1457:1: ( '{' )
            // InternalBPMN_translator.g:1458:2: '{'
            {
             before(grammarAccess.getContentAccess().getLeftCurlyBracketKeyword_1_0_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBPMN_translator.g:1467:1: rule__Content__Group_1_0__2 : rule__Content__Group_1_0__2__Impl rule__Content__Group_1_0__3 ;
    public final void rule__Content__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1471:1: ( rule__Content__Group_1_0__2__Impl rule__Content__Group_1_0__3 )
            // InternalBPMN_translator.g:1472:2: rule__Content__Group_1_0__2__Impl rule__Content__Group_1_0__3
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
    // InternalBPMN_translator.g:1479:1: rule__Content__Group_1_0__2__Impl : ( ( rule__Content__CodexAssignment_1_0_2 ) ) ;
    public final void rule__Content__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1483:1: ( ( ( rule__Content__CodexAssignment_1_0_2 ) ) )
            // InternalBPMN_translator.g:1484:1: ( ( rule__Content__CodexAssignment_1_0_2 ) )
            {
            // InternalBPMN_translator.g:1484:1: ( ( rule__Content__CodexAssignment_1_0_2 ) )
            // InternalBPMN_translator.g:1485:2: ( rule__Content__CodexAssignment_1_0_2 )
            {
             before(grammarAccess.getContentAccess().getCodexAssignment_1_0_2()); 
            // InternalBPMN_translator.g:1486:2: ( rule__Content__CodexAssignment_1_0_2 )
            // InternalBPMN_translator.g:1486:3: rule__Content__CodexAssignment_1_0_2
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
    // InternalBPMN_translator.g:1494:1: rule__Content__Group_1_0__3 : rule__Content__Group_1_0__3__Impl ;
    public final void rule__Content__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1498:1: ( rule__Content__Group_1_0__3__Impl )
            // InternalBPMN_translator.g:1499:2: rule__Content__Group_1_0__3__Impl
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
    // InternalBPMN_translator.g:1505:1: rule__Content__Group_1_0__3__Impl : ( '}' ) ;
    public final void rule__Content__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1509:1: ( ( '}' ) )
            // InternalBPMN_translator.g:1510:1: ( '}' )
            {
            // InternalBPMN_translator.g:1510:1: ( '}' )
            // InternalBPMN_translator.g:1511:2: '}'
            {
             before(grammarAccess.getContentAccess().getRightCurlyBracketKeyword_1_0_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBPMN_translator.g:1521:1: rule__Content__Group_1_2__0 : rule__Content__Group_1_2__0__Impl rule__Content__Group_1_2__1 ;
    public final void rule__Content__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1525:1: ( rule__Content__Group_1_2__0__Impl rule__Content__Group_1_2__1 )
            // InternalBPMN_translator.g:1526:2: rule__Content__Group_1_2__0__Impl rule__Content__Group_1_2__1
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
    // InternalBPMN_translator.g:1533:1: rule__Content__Group_1_2__0__Impl : ( ( rule__Content__BodyAssignment_1_2_0 )* ) ;
    public final void rule__Content__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1537:1: ( ( ( rule__Content__BodyAssignment_1_2_0 )* ) )
            // InternalBPMN_translator.g:1538:1: ( ( rule__Content__BodyAssignment_1_2_0 )* )
            {
            // InternalBPMN_translator.g:1538:1: ( ( rule__Content__BodyAssignment_1_2_0 )* )
            // InternalBPMN_translator.g:1539:2: ( rule__Content__BodyAssignment_1_2_0 )*
            {
             before(grammarAccess.getContentAccess().getBodyAssignment_1_2_0()); 
            // InternalBPMN_translator.g:1540:2: ( rule__Content__BodyAssignment_1_2_0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=24 && LA20_0<=25)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBPMN_translator.g:1540:3: rule__Content__BodyAssignment_1_2_0
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
    // InternalBPMN_translator.g:1548:1: rule__Content__Group_1_2__1 : rule__Content__Group_1_2__1__Impl rule__Content__Group_1_2__2 ;
    public final void rule__Content__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1552:1: ( rule__Content__Group_1_2__1__Impl rule__Content__Group_1_2__2 )
            // InternalBPMN_translator.g:1553:2: rule__Content__Group_1_2__1__Impl rule__Content__Group_1_2__2
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
    // InternalBPMN_translator.g:1560:1: rule__Content__Group_1_2__1__Impl : ( ( rule__Content__BodyAssignment_1_2_1 ) ) ;
    public final void rule__Content__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1564:1: ( ( ( rule__Content__BodyAssignment_1_2_1 ) ) )
            // InternalBPMN_translator.g:1565:1: ( ( rule__Content__BodyAssignment_1_2_1 ) )
            {
            // InternalBPMN_translator.g:1565:1: ( ( rule__Content__BodyAssignment_1_2_1 ) )
            // InternalBPMN_translator.g:1566:2: ( rule__Content__BodyAssignment_1_2_1 )
            {
             before(grammarAccess.getContentAccess().getBodyAssignment_1_2_1()); 
            // InternalBPMN_translator.g:1567:2: ( rule__Content__BodyAssignment_1_2_1 )
            // InternalBPMN_translator.g:1567:3: rule__Content__BodyAssignment_1_2_1
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
    // InternalBPMN_translator.g:1575:1: rule__Content__Group_1_2__2 : rule__Content__Group_1_2__2__Impl ;
    public final void rule__Content__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1579:1: ( rule__Content__Group_1_2__2__Impl )
            // InternalBPMN_translator.g:1580:2: rule__Content__Group_1_2__2__Impl
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
    // InternalBPMN_translator.g:1586:1: rule__Content__Group_1_2__2__Impl : ( ( rule__Content__BodyAssignment_1_2_2 )* ) ;
    public final void rule__Content__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1590:1: ( ( ( rule__Content__BodyAssignment_1_2_2 )* ) )
            // InternalBPMN_translator.g:1591:1: ( ( rule__Content__BodyAssignment_1_2_2 )* )
            {
            // InternalBPMN_translator.g:1591:1: ( ( rule__Content__BodyAssignment_1_2_2 )* )
            // InternalBPMN_translator.g:1592:2: ( rule__Content__BodyAssignment_1_2_2 )*
            {
             before(grammarAccess.getContentAccess().getBodyAssignment_1_2_2()); 
            // InternalBPMN_translator.g:1593:2: ( rule__Content__BodyAssignment_1_2_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=16 && LA21_0<=23)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBPMN_translator.g:1593:3: rule__Content__BodyAssignment_1_2_2
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
    // InternalBPMN_translator.g:1602:1: rule__Open__Group__0 : rule__Open__Group__0__Impl rule__Open__Group__1 ;
    public final void rule__Open__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1606:1: ( rule__Open__Group__0__Impl rule__Open__Group__1 )
            // InternalBPMN_translator.g:1607:2: rule__Open__Group__0__Impl rule__Open__Group__1
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
    // InternalBPMN_translator.g:1614:1: rule__Open__Group__0__Impl : ( '<' ) ;
    public final void rule__Open__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1618:1: ( ( '<' ) )
            // InternalBPMN_translator.g:1619:1: ( '<' )
            {
            // InternalBPMN_translator.g:1619:1: ( '<' )
            // InternalBPMN_translator.g:1620:2: '<'
            {
             before(grammarAccess.getOpenAccess().getLessThanSignKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBPMN_translator.g:1629:1: rule__Open__Group__1 : rule__Open__Group__1__Impl rule__Open__Group__2 ;
    public final void rule__Open__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1633:1: ( rule__Open__Group__1__Impl rule__Open__Group__2 )
            // InternalBPMN_translator.g:1634:2: rule__Open__Group__1__Impl rule__Open__Group__2
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
    // InternalBPMN_translator.g:1641:1: rule__Open__Group__1__Impl : ( ( rule__Open__HeadAssignment_1 ) ) ;
    public final void rule__Open__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1645:1: ( ( ( rule__Open__HeadAssignment_1 ) ) )
            // InternalBPMN_translator.g:1646:1: ( ( rule__Open__HeadAssignment_1 ) )
            {
            // InternalBPMN_translator.g:1646:1: ( ( rule__Open__HeadAssignment_1 ) )
            // InternalBPMN_translator.g:1647:2: ( rule__Open__HeadAssignment_1 )
            {
             before(grammarAccess.getOpenAccess().getHeadAssignment_1()); 
            // InternalBPMN_translator.g:1648:2: ( rule__Open__HeadAssignment_1 )
            // InternalBPMN_translator.g:1648:3: rule__Open__HeadAssignment_1
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
    // InternalBPMN_translator.g:1656:1: rule__Open__Group__2 : rule__Open__Group__2__Impl rule__Open__Group__3 ;
    public final void rule__Open__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1660:1: ( rule__Open__Group__2__Impl rule__Open__Group__3 )
            // InternalBPMN_translator.g:1661:2: rule__Open__Group__2__Impl rule__Open__Group__3
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
    // InternalBPMN_translator.g:1668:1: rule__Open__Group__2__Impl : ( ':' ) ;
    public final void rule__Open__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1672:1: ( ( ':' ) )
            // InternalBPMN_translator.g:1673:1: ( ':' )
            {
            // InternalBPMN_translator.g:1673:1: ( ':' )
            // InternalBPMN_translator.g:1674:2: ':'
            {
             before(grammarAccess.getOpenAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBPMN_translator.g:1683:1: rule__Open__Group__3 : rule__Open__Group__3__Impl rule__Open__Group__4 ;
    public final void rule__Open__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1687:1: ( rule__Open__Group__3__Impl rule__Open__Group__4 )
            // InternalBPMN_translator.g:1688:2: rule__Open__Group__3__Impl rule__Open__Group__4
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
    // InternalBPMN_translator.g:1695:1: rule__Open__Group__3__Impl : ( ( rule__Open__KeywordsAssignment_3 ) ) ;
    public final void rule__Open__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1699:1: ( ( ( rule__Open__KeywordsAssignment_3 ) ) )
            // InternalBPMN_translator.g:1700:1: ( ( rule__Open__KeywordsAssignment_3 ) )
            {
            // InternalBPMN_translator.g:1700:1: ( ( rule__Open__KeywordsAssignment_3 ) )
            // InternalBPMN_translator.g:1701:2: ( rule__Open__KeywordsAssignment_3 )
            {
             before(grammarAccess.getOpenAccess().getKeywordsAssignment_3()); 
            // InternalBPMN_translator.g:1702:2: ( rule__Open__KeywordsAssignment_3 )
            // InternalBPMN_translator.g:1702:3: rule__Open__KeywordsAssignment_3
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
    // InternalBPMN_translator.g:1710:1: rule__Open__Group__4 : rule__Open__Group__4__Impl rule__Open__Group__5 ;
    public final void rule__Open__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1714:1: ( rule__Open__Group__4__Impl rule__Open__Group__5 )
            // InternalBPMN_translator.g:1715:2: rule__Open__Group__4__Impl rule__Open__Group__5
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
    // InternalBPMN_translator.g:1722:1: rule__Open__Group__4__Impl : ( ( rule__Open__Alternatives_4 )* ) ;
    public final void rule__Open__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1726:1: ( ( ( rule__Open__Alternatives_4 )* ) )
            // InternalBPMN_translator.g:1727:1: ( ( rule__Open__Alternatives_4 )* )
            {
            // InternalBPMN_translator.g:1727:1: ( ( rule__Open__Alternatives_4 )* )
            // InternalBPMN_translator.g:1728:2: ( rule__Open__Alternatives_4 )*
            {
             before(grammarAccess.getOpenAccess().getAlternatives_4()); 
            // InternalBPMN_translator.g:1729:2: ( rule__Open__Alternatives_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_HEAD||LA22_0==RULE_KEYWORDS) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBPMN_translator.g:1729:3: rule__Open__Alternatives_4
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
    // InternalBPMN_translator.g:1737:1: rule__Open__Group__5 : rule__Open__Group__5__Impl ;
    public final void rule__Open__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1741:1: ( rule__Open__Group__5__Impl )
            // InternalBPMN_translator.g:1742:2: rule__Open__Group__5__Impl
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
    // InternalBPMN_translator.g:1748:1: rule__Open__Group__5__Impl : ( '>' ) ;
    public final void rule__Open__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1752:1: ( ( '>' ) )
            // InternalBPMN_translator.g:1753:1: ( '>' )
            {
            // InternalBPMN_translator.g:1753:1: ( '>' )
            // InternalBPMN_translator.g:1754:2: '>'
            {
             before(grammarAccess.getOpenAccess().getGreaterThanSignKeyword_5()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBPMN_translator.g:1764:1: rule__Open__Group_4_0__0 : rule__Open__Group_4_0__0__Impl rule__Open__Group_4_0__1 ;
    public final void rule__Open__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1768:1: ( rule__Open__Group_4_0__0__Impl rule__Open__Group_4_0__1 )
            // InternalBPMN_translator.g:1769:2: rule__Open__Group_4_0__0__Impl rule__Open__Group_4_0__1
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
    // InternalBPMN_translator.g:1776:1: rule__Open__Group_4_0__0__Impl : ( ( rule__Open__Head1Assignment_4_0_0 ) ) ;
    public final void rule__Open__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1780:1: ( ( ( rule__Open__Head1Assignment_4_0_0 ) ) )
            // InternalBPMN_translator.g:1781:1: ( ( rule__Open__Head1Assignment_4_0_0 ) )
            {
            // InternalBPMN_translator.g:1781:1: ( ( rule__Open__Head1Assignment_4_0_0 ) )
            // InternalBPMN_translator.g:1782:2: ( rule__Open__Head1Assignment_4_0_0 )
            {
             before(grammarAccess.getOpenAccess().getHead1Assignment_4_0_0()); 
            // InternalBPMN_translator.g:1783:2: ( rule__Open__Head1Assignment_4_0_0 )
            // InternalBPMN_translator.g:1783:3: rule__Open__Head1Assignment_4_0_0
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
    // InternalBPMN_translator.g:1791:1: rule__Open__Group_4_0__1 : rule__Open__Group_4_0__1__Impl ;
    public final void rule__Open__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1795:1: ( rule__Open__Group_4_0__1__Impl )
            // InternalBPMN_translator.g:1796:2: rule__Open__Group_4_0__1__Impl
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
    // InternalBPMN_translator.g:1802:1: rule__Open__Group_4_0__1__Impl : ( ':' ) ;
    public final void rule__Open__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1806:1: ( ( ':' ) )
            // InternalBPMN_translator.g:1807:1: ( ':' )
            {
            // InternalBPMN_translator.g:1807:1: ( ':' )
            // InternalBPMN_translator.g:1808:2: ':'
            {
             before(grammarAccess.getOpenAccess().getColonKeyword_4_0_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBPMN_translator.g:1818:1: rule__Open__Group_4_1__0 : rule__Open__Group_4_1__0__Impl rule__Open__Group_4_1__1 ;
    public final void rule__Open__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1822:1: ( rule__Open__Group_4_1__0__Impl rule__Open__Group_4_1__1 )
            // InternalBPMN_translator.g:1823:2: rule__Open__Group_4_1__0__Impl rule__Open__Group_4_1__1
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
    // InternalBPMN_translator.g:1830:1: rule__Open__Group_4_1__0__Impl : ( ( rule__Open__Alternatives_4_1_0 ) ) ;
    public final void rule__Open__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1834:1: ( ( ( rule__Open__Alternatives_4_1_0 ) ) )
            // InternalBPMN_translator.g:1835:1: ( ( rule__Open__Alternatives_4_1_0 ) )
            {
            // InternalBPMN_translator.g:1835:1: ( ( rule__Open__Alternatives_4_1_0 ) )
            // InternalBPMN_translator.g:1836:2: ( rule__Open__Alternatives_4_1_0 )
            {
             before(grammarAccess.getOpenAccess().getAlternatives_4_1_0()); 
            // InternalBPMN_translator.g:1837:2: ( rule__Open__Alternatives_4_1_0 )
            // InternalBPMN_translator.g:1837:3: rule__Open__Alternatives_4_1_0
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
    // InternalBPMN_translator.g:1845:1: rule__Open__Group_4_1__1 : rule__Open__Group_4_1__1__Impl rule__Open__Group_4_1__2 ;
    public final void rule__Open__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1849:1: ( rule__Open__Group_4_1__1__Impl rule__Open__Group_4_1__2 )
            // InternalBPMN_translator.g:1850:2: rule__Open__Group_4_1__1__Impl rule__Open__Group_4_1__2
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
    // InternalBPMN_translator.g:1857:1: rule__Open__Group_4_1__1__Impl : ( '=' ) ;
    public final void rule__Open__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1861:1: ( ( '=' ) )
            // InternalBPMN_translator.g:1862:1: ( '=' )
            {
            // InternalBPMN_translator.g:1862:1: ( '=' )
            // InternalBPMN_translator.g:1863:2: '='
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
    // InternalBPMN_translator.g:1872:1: rule__Open__Group_4_1__2 : rule__Open__Group_4_1__2__Impl ;
    public final void rule__Open__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1876:1: ( rule__Open__Group_4_1__2__Impl )
            // InternalBPMN_translator.g:1877:2: rule__Open__Group_4_1__2__Impl
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
    // InternalBPMN_translator.g:1883:1: rule__Open__Group_4_1__2__Impl : ( ( rule__Open__ValueAssignment_4_1_2 ) ) ;
    public final void rule__Open__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1887:1: ( ( ( rule__Open__ValueAssignment_4_1_2 ) ) )
            // InternalBPMN_translator.g:1888:1: ( ( rule__Open__ValueAssignment_4_1_2 ) )
            {
            // InternalBPMN_translator.g:1888:1: ( ( rule__Open__ValueAssignment_4_1_2 ) )
            // InternalBPMN_translator.g:1889:2: ( rule__Open__ValueAssignment_4_1_2 )
            {
             before(grammarAccess.getOpenAccess().getValueAssignment_4_1_2()); 
            // InternalBPMN_translator.g:1890:2: ( rule__Open__ValueAssignment_4_1_2 )
            // InternalBPMN_translator.g:1890:3: rule__Open__ValueAssignment_4_1_2
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
    // InternalBPMN_translator.g:1899:1: rule__Singleton__Group__0 : rule__Singleton__Group__0__Impl rule__Singleton__Group__1 ;
    public final void rule__Singleton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1903:1: ( rule__Singleton__Group__0__Impl rule__Singleton__Group__1 )
            // InternalBPMN_translator.g:1904:2: rule__Singleton__Group__0__Impl rule__Singleton__Group__1
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
    // InternalBPMN_translator.g:1911:1: rule__Singleton__Group__0__Impl : ( () ) ;
    public final void rule__Singleton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1915:1: ( ( () ) )
            // InternalBPMN_translator.g:1916:1: ( () )
            {
            // InternalBPMN_translator.g:1916:1: ( () )
            // InternalBPMN_translator.g:1917:2: ()
            {
             before(grammarAccess.getSingletonAccess().getSingletonAction_0()); 
            // InternalBPMN_translator.g:1918:2: ()
            // InternalBPMN_translator.g:1918:3: 
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
    // InternalBPMN_translator.g:1926:1: rule__Singleton__Group__1 : rule__Singleton__Group__1__Impl rule__Singleton__Group__2 ;
    public final void rule__Singleton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1930:1: ( rule__Singleton__Group__1__Impl rule__Singleton__Group__2 )
            // InternalBPMN_translator.g:1931:2: rule__Singleton__Group__1__Impl rule__Singleton__Group__2
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
    // InternalBPMN_translator.g:1938:1: rule__Singleton__Group__1__Impl : ( ( rule__Singleton__Group_1__0 ) ) ;
    public final void rule__Singleton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1942:1: ( ( ( rule__Singleton__Group_1__0 ) ) )
            // InternalBPMN_translator.g:1943:1: ( ( rule__Singleton__Group_1__0 ) )
            {
            // InternalBPMN_translator.g:1943:1: ( ( rule__Singleton__Group_1__0 ) )
            // InternalBPMN_translator.g:1944:2: ( rule__Singleton__Group_1__0 )
            {
             before(grammarAccess.getSingletonAccess().getGroup_1()); 
            // InternalBPMN_translator.g:1945:2: ( rule__Singleton__Group_1__0 )
            // InternalBPMN_translator.g:1945:3: rule__Singleton__Group_1__0
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
    // InternalBPMN_translator.g:1953:1: rule__Singleton__Group__2 : rule__Singleton__Group__2__Impl ;
    public final void rule__Singleton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1957:1: ( rule__Singleton__Group__2__Impl )
            // InternalBPMN_translator.g:1958:2: rule__Singleton__Group__2__Impl
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
    // InternalBPMN_translator.g:1964:1: rule__Singleton__Group__2__Impl : ( '/>' ) ;
    public final void rule__Singleton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1968:1: ( ( '/>' ) )
            // InternalBPMN_translator.g:1969:1: ( '/>' )
            {
            // InternalBPMN_translator.g:1969:1: ( '/>' )
            // InternalBPMN_translator.g:1970:2: '/>'
            {
             before(grammarAccess.getSingletonAccess().getSolidusGreaterThanSignKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBPMN_translator.g:1980:1: rule__Singleton__Group_1__0 : rule__Singleton__Group_1__0__Impl rule__Singleton__Group_1__1 ;
    public final void rule__Singleton__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1984:1: ( rule__Singleton__Group_1__0__Impl rule__Singleton__Group_1__1 )
            // InternalBPMN_translator.g:1985:2: rule__Singleton__Group_1__0__Impl rule__Singleton__Group_1__1
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
    // InternalBPMN_translator.g:1992:1: rule__Singleton__Group_1__0__Impl : ( '<' ) ;
    public final void rule__Singleton__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1996:1: ( ( '<' ) )
            // InternalBPMN_translator.g:1997:1: ( '<' )
            {
            // InternalBPMN_translator.g:1997:1: ( '<' )
            // InternalBPMN_translator.g:1998:2: '<'
            {
             before(grammarAccess.getSingletonAccess().getLessThanSignKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2007:1: rule__Singleton__Group_1__1 : rule__Singleton__Group_1__1__Impl rule__Singleton__Group_1__2 ;
    public final void rule__Singleton__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2011:1: ( rule__Singleton__Group_1__1__Impl rule__Singleton__Group_1__2 )
            // InternalBPMN_translator.g:2012:2: rule__Singleton__Group_1__1__Impl rule__Singleton__Group_1__2
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
    // InternalBPMN_translator.g:2019:1: rule__Singleton__Group_1__1__Impl : ( RULE_HEAD ) ;
    public final void rule__Singleton__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2023:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:2024:1: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:2024:1: ( RULE_HEAD )
            // InternalBPMN_translator.g:2025:2: RULE_HEAD
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
    // InternalBPMN_translator.g:2034:1: rule__Singleton__Group_1__2 : rule__Singleton__Group_1__2__Impl rule__Singleton__Group_1__3 ;
    public final void rule__Singleton__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2038:1: ( rule__Singleton__Group_1__2__Impl rule__Singleton__Group_1__3 )
            // InternalBPMN_translator.g:2039:2: rule__Singleton__Group_1__2__Impl rule__Singleton__Group_1__3
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
    // InternalBPMN_translator.g:2046:1: rule__Singleton__Group_1__2__Impl : ( ':' ) ;
    public final void rule__Singleton__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2050:1: ( ( ':' ) )
            // InternalBPMN_translator.g:2051:1: ( ':' )
            {
            // InternalBPMN_translator.g:2051:1: ( ':' )
            // InternalBPMN_translator.g:2052:2: ':'
            {
             before(grammarAccess.getSingletonAccess().getColonKeyword_1_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2061:1: rule__Singleton__Group_1__3 : rule__Singleton__Group_1__3__Impl rule__Singleton__Group_1__4 ;
    public final void rule__Singleton__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2065:1: ( rule__Singleton__Group_1__3__Impl rule__Singleton__Group_1__4 )
            // InternalBPMN_translator.g:2066:2: rule__Singleton__Group_1__3__Impl rule__Singleton__Group_1__4
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
    // InternalBPMN_translator.g:2073:1: rule__Singleton__Group_1__3__Impl : ( ( rule__Singleton__KeywordsAssignment_1_3 ) ) ;
    public final void rule__Singleton__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2077:1: ( ( ( rule__Singleton__KeywordsAssignment_1_3 ) ) )
            // InternalBPMN_translator.g:2078:1: ( ( rule__Singleton__KeywordsAssignment_1_3 ) )
            {
            // InternalBPMN_translator.g:2078:1: ( ( rule__Singleton__KeywordsAssignment_1_3 ) )
            // InternalBPMN_translator.g:2079:2: ( rule__Singleton__KeywordsAssignment_1_3 )
            {
             before(grammarAccess.getSingletonAccess().getKeywordsAssignment_1_3()); 
            // InternalBPMN_translator.g:2080:2: ( rule__Singleton__KeywordsAssignment_1_3 )
            // InternalBPMN_translator.g:2080:3: rule__Singleton__KeywordsAssignment_1_3
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
    // InternalBPMN_translator.g:2088:1: rule__Singleton__Group_1__4 : rule__Singleton__Group_1__4__Impl ;
    public final void rule__Singleton__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2092:1: ( rule__Singleton__Group_1__4__Impl )
            // InternalBPMN_translator.g:2093:2: rule__Singleton__Group_1__4__Impl
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
    // InternalBPMN_translator.g:2099:1: rule__Singleton__Group_1__4__Impl : ( ( rule__Singleton__Alternatives_1_4 )* ) ;
    public final void rule__Singleton__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2103:1: ( ( ( rule__Singleton__Alternatives_1_4 )* ) )
            // InternalBPMN_translator.g:2104:1: ( ( rule__Singleton__Alternatives_1_4 )* )
            {
            // InternalBPMN_translator.g:2104:1: ( ( rule__Singleton__Alternatives_1_4 )* )
            // InternalBPMN_translator.g:2105:2: ( rule__Singleton__Alternatives_1_4 )*
            {
             before(grammarAccess.getSingletonAccess().getAlternatives_1_4()); 
            // InternalBPMN_translator.g:2106:2: ( rule__Singleton__Alternatives_1_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_HEAD||LA23_0==RULE_KEYWORDS) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBPMN_translator.g:2106:3: rule__Singleton__Alternatives_1_4
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
    // InternalBPMN_translator.g:2115:1: rule__Singleton__Group_1_4_0__0 : rule__Singleton__Group_1_4_0__0__Impl rule__Singleton__Group_1_4_0__1 ;
    public final void rule__Singleton__Group_1_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2119:1: ( rule__Singleton__Group_1_4_0__0__Impl rule__Singleton__Group_1_4_0__1 )
            // InternalBPMN_translator.g:2120:2: rule__Singleton__Group_1_4_0__0__Impl rule__Singleton__Group_1_4_0__1
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
    // InternalBPMN_translator.g:2127:1: rule__Singleton__Group_1_4_0__0__Impl : ( RULE_HEAD ) ;
    public final void rule__Singleton__Group_1_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2131:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:2132:1: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:2132:1: ( RULE_HEAD )
            // InternalBPMN_translator.g:2133:2: RULE_HEAD
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
    // InternalBPMN_translator.g:2142:1: rule__Singleton__Group_1_4_0__1 : rule__Singleton__Group_1_4_0__1__Impl ;
    public final void rule__Singleton__Group_1_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2146:1: ( rule__Singleton__Group_1_4_0__1__Impl )
            // InternalBPMN_translator.g:2147:2: rule__Singleton__Group_1_4_0__1__Impl
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
    // InternalBPMN_translator.g:2153:1: rule__Singleton__Group_1_4_0__1__Impl : ( ':' ) ;
    public final void rule__Singleton__Group_1_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2157:1: ( ( ':' ) )
            // InternalBPMN_translator.g:2158:1: ( ':' )
            {
            // InternalBPMN_translator.g:2158:1: ( ':' )
            // InternalBPMN_translator.g:2159:2: ':'
            {
             before(grammarAccess.getSingletonAccess().getColonKeyword_1_4_0_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2169:1: rule__Singleton__Group_1_4_1__0 : rule__Singleton__Group_1_4_1__0__Impl rule__Singleton__Group_1_4_1__1 ;
    public final void rule__Singleton__Group_1_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2173:1: ( rule__Singleton__Group_1_4_1__0__Impl rule__Singleton__Group_1_4_1__1 )
            // InternalBPMN_translator.g:2174:2: rule__Singleton__Group_1_4_1__0__Impl rule__Singleton__Group_1_4_1__1
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
    // InternalBPMN_translator.g:2181:1: rule__Singleton__Group_1_4_1__0__Impl : ( ( rule__Singleton__Keywords1Assignment_1_4_1_0 ) ) ;
    public final void rule__Singleton__Group_1_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2185:1: ( ( ( rule__Singleton__Keywords1Assignment_1_4_1_0 ) ) )
            // InternalBPMN_translator.g:2186:1: ( ( rule__Singleton__Keywords1Assignment_1_4_1_0 ) )
            {
            // InternalBPMN_translator.g:2186:1: ( ( rule__Singleton__Keywords1Assignment_1_4_1_0 ) )
            // InternalBPMN_translator.g:2187:2: ( rule__Singleton__Keywords1Assignment_1_4_1_0 )
            {
             before(grammarAccess.getSingletonAccess().getKeywords1Assignment_1_4_1_0()); 
            // InternalBPMN_translator.g:2188:2: ( rule__Singleton__Keywords1Assignment_1_4_1_0 )
            // InternalBPMN_translator.g:2188:3: rule__Singleton__Keywords1Assignment_1_4_1_0
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
    // InternalBPMN_translator.g:2196:1: rule__Singleton__Group_1_4_1__1 : rule__Singleton__Group_1_4_1__1__Impl rule__Singleton__Group_1_4_1__2 ;
    public final void rule__Singleton__Group_1_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2200:1: ( rule__Singleton__Group_1_4_1__1__Impl rule__Singleton__Group_1_4_1__2 )
            // InternalBPMN_translator.g:2201:2: rule__Singleton__Group_1_4_1__1__Impl rule__Singleton__Group_1_4_1__2
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
    // InternalBPMN_translator.g:2208:1: rule__Singleton__Group_1_4_1__1__Impl : ( '=' ) ;
    public final void rule__Singleton__Group_1_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2212:1: ( ( '=' ) )
            // InternalBPMN_translator.g:2213:1: ( '=' )
            {
            // InternalBPMN_translator.g:2213:1: ( '=' )
            // InternalBPMN_translator.g:2214:2: '='
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
    // InternalBPMN_translator.g:2223:1: rule__Singleton__Group_1_4_1__2 : rule__Singleton__Group_1_4_1__2__Impl ;
    public final void rule__Singleton__Group_1_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2227:1: ( rule__Singleton__Group_1_4_1__2__Impl )
            // InternalBPMN_translator.g:2228:2: rule__Singleton__Group_1_4_1__2__Impl
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
    // InternalBPMN_translator.g:2234:1: rule__Singleton__Group_1_4_1__2__Impl : ( ( rule__Singleton__ValueAssignment_1_4_1_2 ) ) ;
    public final void rule__Singleton__Group_1_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2238:1: ( ( ( rule__Singleton__ValueAssignment_1_4_1_2 ) ) )
            // InternalBPMN_translator.g:2239:1: ( ( rule__Singleton__ValueAssignment_1_4_1_2 ) )
            {
            // InternalBPMN_translator.g:2239:1: ( ( rule__Singleton__ValueAssignment_1_4_1_2 ) )
            // InternalBPMN_translator.g:2240:2: ( rule__Singleton__ValueAssignment_1_4_1_2 )
            {
             before(grammarAccess.getSingletonAccess().getValueAssignment_1_4_1_2()); 
            // InternalBPMN_translator.g:2241:2: ( rule__Singleton__ValueAssignment_1_4_1_2 )
            // InternalBPMN_translator.g:2241:3: rule__Singleton__ValueAssignment_1_4_1_2
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
    // InternalBPMN_translator.g:2250:1: rule__Close__Group__0 : rule__Close__Group__0__Impl rule__Close__Group__1 ;
    public final void rule__Close__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2254:1: ( rule__Close__Group__0__Impl rule__Close__Group__1 )
            // InternalBPMN_translator.g:2255:2: rule__Close__Group__0__Impl rule__Close__Group__1
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
    // InternalBPMN_translator.g:2262:1: rule__Close__Group__0__Impl : ( () ) ;
    public final void rule__Close__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2266:1: ( ( () ) )
            // InternalBPMN_translator.g:2267:1: ( () )
            {
            // InternalBPMN_translator.g:2267:1: ( () )
            // InternalBPMN_translator.g:2268:2: ()
            {
             before(grammarAccess.getCloseAccess().getCloseAction_0()); 
            // InternalBPMN_translator.g:2269:2: ()
            // InternalBPMN_translator.g:2269:3: 
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
    // InternalBPMN_translator.g:2277:1: rule__Close__Group__1 : rule__Close__Group__1__Impl ;
    public final void rule__Close__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2281:1: ( rule__Close__Group__1__Impl )
            // InternalBPMN_translator.g:2282:2: rule__Close__Group__1__Impl
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
    // InternalBPMN_translator.g:2288:1: rule__Close__Group__1__Impl : ( ( rule__Close__Group_1__0 ) ) ;
    public final void rule__Close__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2292:1: ( ( ( rule__Close__Group_1__0 ) ) )
            // InternalBPMN_translator.g:2293:1: ( ( rule__Close__Group_1__0 ) )
            {
            // InternalBPMN_translator.g:2293:1: ( ( rule__Close__Group_1__0 ) )
            // InternalBPMN_translator.g:2294:2: ( rule__Close__Group_1__0 )
            {
             before(grammarAccess.getCloseAccess().getGroup_1()); 
            // InternalBPMN_translator.g:2295:2: ( rule__Close__Group_1__0 )
            // InternalBPMN_translator.g:2295:3: rule__Close__Group_1__0
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
    // InternalBPMN_translator.g:2304:1: rule__Close__Group_1__0 : rule__Close__Group_1__0__Impl rule__Close__Group_1__1 ;
    public final void rule__Close__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2308:1: ( rule__Close__Group_1__0__Impl rule__Close__Group_1__1 )
            // InternalBPMN_translator.g:2309:2: rule__Close__Group_1__0__Impl rule__Close__Group_1__1
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
    // InternalBPMN_translator.g:2316:1: rule__Close__Group_1__0__Impl : ( '</' ) ;
    public final void rule__Close__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2320:1: ( ( '</' ) )
            // InternalBPMN_translator.g:2321:1: ( '</' )
            {
            // InternalBPMN_translator.g:2321:1: ( '</' )
            // InternalBPMN_translator.g:2322:2: '</'
            {
             before(grammarAccess.getCloseAccess().getLessThanSignSolidusKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2331:1: rule__Close__Group_1__1 : rule__Close__Group_1__1__Impl rule__Close__Group_1__2 ;
    public final void rule__Close__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2335:1: ( rule__Close__Group_1__1__Impl rule__Close__Group_1__2 )
            // InternalBPMN_translator.g:2336:2: rule__Close__Group_1__1__Impl rule__Close__Group_1__2
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
    // InternalBPMN_translator.g:2343:1: rule__Close__Group_1__1__Impl : ( RULE_HEAD ) ;
    public final void rule__Close__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2347:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:2348:1: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:2348:1: ( RULE_HEAD )
            // InternalBPMN_translator.g:2349:2: RULE_HEAD
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
    // InternalBPMN_translator.g:2358:1: rule__Close__Group_1__2 : rule__Close__Group_1__2__Impl rule__Close__Group_1__3 ;
    public final void rule__Close__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2362:1: ( rule__Close__Group_1__2__Impl rule__Close__Group_1__3 )
            // InternalBPMN_translator.g:2363:2: rule__Close__Group_1__2__Impl rule__Close__Group_1__3
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
    // InternalBPMN_translator.g:2370:1: rule__Close__Group_1__2__Impl : ( ':' ) ;
    public final void rule__Close__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2374:1: ( ( ':' ) )
            // InternalBPMN_translator.g:2375:1: ( ':' )
            {
            // InternalBPMN_translator.g:2375:1: ( ':' )
            // InternalBPMN_translator.g:2376:2: ':'
            {
             before(grammarAccess.getCloseAccess().getColonKeyword_1_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2385:1: rule__Close__Group_1__3 : rule__Close__Group_1__3__Impl rule__Close__Group_1__4 ;
    public final void rule__Close__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2389:1: ( rule__Close__Group_1__3__Impl rule__Close__Group_1__4 )
            // InternalBPMN_translator.g:2390:2: rule__Close__Group_1__3__Impl rule__Close__Group_1__4
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
    // InternalBPMN_translator.g:2397:1: rule__Close__Group_1__3__Impl : ( RULE_KEYWORDS ) ;
    public final void rule__Close__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2401:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:2402:1: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:2402:1: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:2403:2: RULE_KEYWORDS
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
    // InternalBPMN_translator.g:2412:1: rule__Close__Group_1__4 : rule__Close__Group_1__4__Impl ;
    public final void rule__Close__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2416:1: ( rule__Close__Group_1__4__Impl )
            // InternalBPMN_translator.g:2417:2: rule__Close__Group_1__4__Impl
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
    // InternalBPMN_translator.g:2423:1: rule__Close__Group_1__4__Impl : ( '>' ) ;
    public final void rule__Close__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2427:1: ( ( '>' ) )
            // InternalBPMN_translator.g:2428:1: ( '>' )
            {
            // InternalBPMN_translator.g:2428:1: ( '>' )
            // InternalBPMN_translator.g:2429:2: '>'
            {
             before(grammarAccess.getCloseAccess().getGreaterThanSignKeyword_1_4()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2439:1: rule__Variables__Group_0__0 : rule__Variables__Group_0__0__Impl rule__Variables__Group_0__1 ;
    public final void rule__Variables__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2443:1: ( rule__Variables__Group_0__0__Impl rule__Variables__Group_0__1 )
            // InternalBPMN_translator.g:2444:2: rule__Variables__Group_0__0__Impl rule__Variables__Group_0__1
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
    // InternalBPMN_translator.g:2451:1: rule__Variables__Group_0__0__Impl : ( 'TEMPERATURE' ) ;
    public final void rule__Variables__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2455:1: ( ( 'TEMPERATURE' ) )
            // InternalBPMN_translator.g:2456:1: ( 'TEMPERATURE' )
            {
            // InternalBPMN_translator.g:2456:1: ( 'TEMPERATURE' )
            // InternalBPMN_translator.g:2457:2: 'TEMPERATURE'
            {
             before(grammarAccess.getVariablesAccess().getTEMPERATUREKeyword_0_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2466:1: rule__Variables__Group_0__1 : rule__Variables__Group_0__1__Impl rule__Variables__Group_0__2 ;
    public final void rule__Variables__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2470:1: ( rule__Variables__Group_0__1__Impl rule__Variables__Group_0__2 )
            // InternalBPMN_translator.g:2471:2: rule__Variables__Group_0__1__Impl rule__Variables__Group_0__2
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
    // InternalBPMN_translator.g:2478:1: rule__Variables__Group_0__1__Impl : ( '[' ) ;
    public final void rule__Variables__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2482:1: ( ( '[' ) )
            // InternalBPMN_translator.g:2483:1: ( '[' )
            {
            // InternalBPMN_translator.g:2483:1: ( '[' )
            // InternalBPMN_translator.g:2484:2: '['
            {
             before(grammarAccess.getVariablesAccess().getLeftSquareBracketKeyword_0_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2493:1: rule__Variables__Group_0__2 : rule__Variables__Group_0__2__Impl rule__Variables__Group_0__3 ;
    public final void rule__Variables__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2497:1: ( rule__Variables__Group_0__2__Impl rule__Variables__Group_0__3 )
            // InternalBPMN_translator.g:2498:2: rule__Variables__Group_0__2__Impl rule__Variables__Group_0__3
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
    // InternalBPMN_translator.g:2505:1: rule__Variables__Group_0__2__Impl : ( RULE_BODY ) ;
    public final void rule__Variables__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2509:1: ( ( RULE_BODY ) )
            // InternalBPMN_translator.g:2510:1: ( RULE_BODY )
            {
            // InternalBPMN_translator.g:2510:1: ( RULE_BODY )
            // InternalBPMN_translator.g:2511:2: RULE_BODY
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
    // InternalBPMN_translator.g:2520:1: rule__Variables__Group_0__3 : rule__Variables__Group_0__3__Impl rule__Variables__Group_0__4 ;
    public final void rule__Variables__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2524:1: ( rule__Variables__Group_0__3__Impl rule__Variables__Group_0__4 )
            // InternalBPMN_translator.g:2525:2: rule__Variables__Group_0__3__Impl rule__Variables__Group_0__4
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
    // InternalBPMN_translator.g:2532:1: rule__Variables__Group_0__3__Impl : ( ',' ) ;
    public final void rule__Variables__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2536:1: ( ( ',' ) )
            // InternalBPMN_translator.g:2537:1: ( ',' )
            {
            // InternalBPMN_translator.g:2537:1: ( ',' )
            // InternalBPMN_translator.g:2538:2: ','
            {
             before(grammarAccess.getVariablesAccess().getCommaKeyword_0_3()); 
            match(input,39,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2547:1: rule__Variables__Group_0__4 : rule__Variables__Group_0__4__Impl rule__Variables__Group_0__5 ;
    public final void rule__Variables__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2551:1: ( rule__Variables__Group_0__4__Impl rule__Variables__Group_0__5 )
            // InternalBPMN_translator.g:2552:2: rule__Variables__Group_0__4__Impl rule__Variables__Group_0__5
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
    // InternalBPMN_translator.g:2559:1: rule__Variables__Group_0__4__Impl : ( RULE_BODY ) ;
    public final void rule__Variables__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2563:1: ( ( RULE_BODY ) )
            // InternalBPMN_translator.g:2564:1: ( RULE_BODY )
            {
            // InternalBPMN_translator.g:2564:1: ( RULE_BODY )
            // InternalBPMN_translator.g:2565:2: RULE_BODY
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
    // InternalBPMN_translator.g:2574:1: rule__Variables__Group_0__5 : rule__Variables__Group_0__5__Impl ;
    public final void rule__Variables__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2578:1: ( rule__Variables__Group_0__5__Impl )
            // InternalBPMN_translator.g:2579:2: rule__Variables__Group_0__5__Impl
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
    // InternalBPMN_translator.g:2585:1: rule__Variables__Group_0__5__Impl : ( ']' ) ;
    public final void rule__Variables__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2589:1: ( ( ']' ) )
            // InternalBPMN_translator.g:2590:1: ( ']' )
            {
            // InternalBPMN_translator.g:2590:1: ( ']' )
            // InternalBPMN_translator.g:2591:2: ']'
            {
             before(grammarAccess.getVariablesAccess().getRightSquareBracketKeyword_0_5()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2601:1: rule__Variables__Group_1__0 : rule__Variables__Group_1__0__Impl rule__Variables__Group_1__1 ;
    public final void rule__Variables__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2605:1: ( rule__Variables__Group_1__0__Impl rule__Variables__Group_1__1 )
            // InternalBPMN_translator.g:2606:2: rule__Variables__Group_1__0__Impl rule__Variables__Group_1__1
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
    // InternalBPMN_translator.g:2613:1: rule__Variables__Group_1__0__Impl : ( RULE_BODY ) ;
    public final void rule__Variables__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2617:1: ( ( RULE_BODY ) )
            // InternalBPMN_translator.g:2618:1: ( RULE_BODY )
            {
            // InternalBPMN_translator.g:2618:1: ( RULE_BODY )
            // InternalBPMN_translator.g:2619:2: RULE_BODY
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
    // InternalBPMN_translator.g:2628:1: rule__Variables__Group_1__1 : rule__Variables__Group_1__1__Impl rule__Variables__Group_1__2 ;
    public final void rule__Variables__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2632:1: ( rule__Variables__Group_1__1__Impl rule__Variables__Group_1__2 )
            // InternalBPMN_translator.g:2633:2: rule__Variables__Group_1__1__Impl rule__Variables__Group_1__2
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
    // InternalBPMN_translator.g:2640:1: rule__Variables__Group_1__1__Impl : ( '[' ) ;
    public final void rule__Variables__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2644:1: ( ( '[' ) )
            // InternalBPMN_translator.g:2645:1: ( '[' )
            {
            // InternalBPMN_translator.g:2645:1: ( '[' )
            // InternalBPMN_translator.g:2646:2: '['
            {
             before(grammarAccess.getVariablesAccess().getLeftSquareBracketKeyword_1_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2655:1: rule__Variables__Group_1__2 : rule__Variables__Group_1__2__Impl rule__Variables__Group_1__3 ;
    public final void rule__Variables__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2659:1: ( rule__Variables__Group_1__2__Impl rule__Variables__Group_1__3 )
            // InternalBPMN_translator.g:2660:2: rule__Variables__Group_1__2__Impl rule__Variables__Group_1__3
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
    // InternalBPMN_translator.g:2667:1: rule__Variables__Group_1__2__Impl : ( RULE_BODY ) ;
    public final void rule__Variables__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2671:1: ( ( RULE_BODY ) )
            // InternalBPMN_translator.g:2672:1: ( RULE_BODY )
            {
            // InternalBPMN_translator.g:2672:1: ( RULE_BODY )
            // InternalBPMN_translator.g:2673:2: RULE_BODY
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
    // InternalBPMN_translator.g:2682:1: rule__Variables__Group_1__3 : rule__Variables__Group_1__3__Impl ;
    public final void rule__Variables__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2686:1: ( rule__Variables__Group_1__3__Impl )
            // InternalBPMN_translator.g:2687:2: rule__Variables__Group_1__3__Impl
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
    // InternalBPMN_translator.g:2693:1: rule__Variables__Group_1__3__Impl : ( ']' ) ;
    public final void rule__Variables__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2697:1: ( ( ']' ) )
            // InternalBPMN_translator.g:2698:1: ( ']' )
            {
            // InternalBPMN_translator.g:2698:1: ( ']' )
            // InternalBPMN_translator.g:2699:2: ']'
            {
             before(grammarAccess.getVariablesAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2709:1: rule__Codex__Group__0 : rule__Codex__Group__0__Impl rule__Codex__Group__1 ;
    public final void rule__Codex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2713:1: ( rule__Codex__Group__0__Impl rule__Codex__Group__1 )
            // InternalBPMN_translator.g:2714:2: rule__Codex__Group__0__Impl rule__Codex__Group__1
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
    // InternalBPMN_translator.g:2721:1: rule__Codex__Group__0__Impl : ( ( rule__Codex__Device_codeAssignment_0 ) ) ;
    public final void rule__Codex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2725:1: ( ( ( rule__Codex__Device_codeAssignment_0 ) ) )
            // InternalBPMN_translator.g:2726:1: ( ( rule__Codex__Device_codeAssignment_0 ) )
            {
            // InternalBPMN_translator.g:2726:1: ( ( rule__Codex__Device_codeAssignment_0 ) )
            // InternalBPMN_translator.g:2727:2: ( rule__Codex__Device_codeAssignment_0 )
            {
             before(grammarAccess.getCodexAccess().getDevice_codeAssignment_0()); 
            // InternalBPMN_translator.g:2728:2: ( rule__Codex__Device_codeAssignment_0 )
            // InternalBPMN_translator.g:2728:3: rule__Codex__Device_codeAssignment_0
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
    // InternalBPMN_translator.g:2736:1: rule__Codex__Group__1 : rule__Codex__Group__1__Impl rule__Codex__Group__2 ;
    public final void rule__Codex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2740:1: ( rule__Codex__Group__1__Impl rule__Codex__Group__2 )
            // InternalBPMN_translator.g:2741:2: rule__Codex__Group__1__Impl rule__Codex__Group__2
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
    // InternalBPMN_translator.g:2748:1: rule__Codex__Group__1__Impl : ( ( rule__Codex__ProtocolAssignment_1 )* ) ;
    public final void rule__Codex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2752:1: ( ( ( rule__Codex__ProtocolAssignment_1 )* ) )
            // InternalBPMN_translator.g:2753:1: ( ( rule__Codex__ProtocolAssignment_1 )* )
            {
            // InternalBPMN_translator.g:2753:1: ( ( rule__Codex__ProtocolAssignment_1 )* )
            // InternalBPMN_translator.g:2754:2: ( rule__Codex__ProtocolAssignment_1 )*
            {
             before(grammarAccess.getCodexAccess().getProtocolAssignment_1()); 
            // InternalBPMN_translator.g:2755:2: ( rule__Codex__ProtocolAssignment_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=61 && LA24_0<=62)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBPMN_translator.g:2755:3: rule__Codex__ProtocolAssignment_1
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
    // InternalBPMN_translator.g:2763:1: rule__Codex__Group__2 : rule__Codex__Group__2__Impl ;
    public final void rule__Codex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2767:1: ( rule__Codex__Group__2__Impl )
            // InternalBPMN_translator.g:2768:2: rule__Codex__Group__2__Impl
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
    // InternalBPMN_translator.g:2774:1: rule__Codex__Group__2__Impl : ( ( rule__Codex__Sensor_codeAssignment_2 )* ) ;
    public final void rule__Codex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2778:1: ( ( ( rule__Codex__Sensor_codeAssignment_2 )* ) )
            // InternalBPMN_translator.g:2779:1: ( ( rule__Codex__Sensor_codeAssignment_2 )* )
            {
            // InternalBPMN_translator.g:2779:1: ( ( rule__Codex__Sensor_codeAssignment_2 )* )
            // InternalBPMN_translator.g:2780:2: ( rule__Codex__Sensor_codeAssignment_2 )*
            {
             before(grammarAccess.getCodexAccess().getSensor_codeAssignment_2()); 
            // InternalBPMN_translator.g:2781:2: ( rule__Codex__Sensor_codeAssignment_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==37||LA25_0==63) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBPMN_translator.g:2781:3: rule__Codex__Sensor_codeAssignment_2
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
    // InternalBPMN_translator.g:2790:1: rule__Device__Group__0 : rule__Device__Group__0__Impl rule__Device__Group__1 ;
    public final void rule__Device__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2794:1: ( rule__Device__Group__0__Impl rule__Device__Group__1 )
            // InternalBPMN_translator.g:2795:2: rule__Device__Group__0__Impl rule__Device__Group__1
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
    // InternalBPMN_translator.g:2802:1: rule__Device__Group__0__Impl : ( 'DEVICE' ) ;
    public final void rule__Device__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2806:1: ( ( 'DEVICE' ) )
            // InternalBPMN_translator.g:2807:1: ( 'DEVICE' )
            {
            // InternalBPMN_translator.g:2807:1: ( 'DEVICE' )
            // InternalBPMN_translator.g:2808:2: 'DEVICE'
            {
             before(grammarAccess.getDeviceAccess().getDEVICEKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2817:1: rule__Device__Group__1 : rule__Device__Group__1__Impl rule__Device__Group__2 ;
    public final void rule__Device__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2821:1: ( rule__Device__Group__1__Impl rule__Device__Group__2 )
            // InternalBPMN_translator.g:2822:2: rule__Device__Group__1__Impl rule__Device__Group__2
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
    // InternalBPMN_translator.g:2829:1: rule__Device__Group__1__Impl : ( ':' ) ;
    public final void rule__Device__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2833:1: ( ( ':' ) )
            // InternalBPMN_translator.g:2834:1: ( ':' )
            {
            // InternalBPMN_translator.g:2834:1: ( ':' )
            // InternalBPMN_translator.g:2835:2: ':'
            {
             before(grammarAccess.getDeviceAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2844:1: rule__Device__Group__2 : rule__Device__Group__2__Impl rule__Device__Group__3 ;
    public final void rule__Device__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2848:1: ( rule__Device__Group__2__Impl rule__Device__Group__3 )
            // InternalBPMN_translator.g:2849:2: rule__Device__Group__2__Impl rule__Device__Group__3
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
    // InternalBPMN_translator.g:2856:1: rule__Device__Group__2__Impl : ( ( rule__Device__DeviceAssignment_2 ) ) ;
    public final void rule__Device__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2860:1: ( ( ( rule__Device__DeviceAssignment_2 ) ) )
            // InternalBPMN_translator.g:2861:1: ( ( rule__Device__DeviceAssignment_2 ) )
            {
            // InternalBPMN_translator.g:2861:1: ( ( rule__Device__DeviceAssignment_2 ) )
            // InternalBPMN_translator.g:2862:2: ( rule__Device__DeviceAssignment_2 )
            {
             before(grammarAccess.getDeviceAccess().getDeviceAssignment_2()); 
            // InternalBPMN_translator.g:2863:2: ( rule__Device__DeviceAssignment_2 )
            // InternalBPMN_translator.g:2863:3: rule__Device__DeviceAssignment_2
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
    // InternalBPMN_translator.g:2871:1: rule__Device__Group__3 : rule__Device__Group__3__Impl rule__Device__Group__4 ;
    public final void rule__Device__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2875:1: ( rule__Device__Group__3__Impl rule__Device__Group__4 )
            // InternalBPMN_translator.g:2876:2: rule__Device__Group__3__Impl rule__Device__Group__4
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
    // InternalBPMN_translator.g:2883:1: rule__Device__Group__3__Impl : ( 'NAMEID' ) ;
    public final void rule__Device__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2887:1: ( ( 'NAMEID' ) )
            // InternalBPMN_translator.g:2888:1: ( 'NAMEID' )
            {
            // InternalBPMN_translator.g:2888:1: ( 'NAMEID' )
            // InternalBPMN_translator.g:2889:2: 'NAMEID'
            {
             before(grammarAccess.getDeviceAccess().getNAMEIDKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2898:1: rule__Device__Group__4 : rule__Device__Group__4__Impl rule__Device__Group__5 ;
    public final void rule__Device__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2902:1: ( rule__Device__Group__4__Impl rule__Device__Group__5 )
            // InternalBPMN_translator.g:2903:2: rule__Device__Group__4__Impl rule__Device__Group__5
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
    // InternalBPMN_translator.g:2910:1: rule__Device__Group__4__Impl : ( ':' ) ;
    public final void rule__Device__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2914:1: ( ( ':' ) )
            // InternalBPMN_translator.g:2915:1: ( ':' )
            {
            // InternalBPMN_translator.g:2915:1: ( ':' )
            // InternalBPMN_translator.g:2916:2: ':'
            {
             before(grammarAccess.getDeviceAccess().getColonKeyword_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2925:1: rule__Device__Group__5 : rule__Device__Group__5__Impl ;
    public final void rule__Device__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2929:1: ( rule__Device__Group__5__Impl )
            // InternalBPMN_translator.g:2930:2: rule__Device__Group__5__Impl
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
    // InternalBPMN_translator.g:2936:1: rule__Device__Group__5__Impl : ( ( rule__Device__IdAssignment_5 ) ) ;
    public final void rule__Device__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2940:1: ( ( ( rule__Device__IdAssignment_5 ) ) )
            // InternalBPMN_translator.g:2941:1: ( ( rule__Device__IdAssignment_5 ) )
            {
            // InternalBPMN_translator.g:2941:1: ( ( rule__Device__IdAssignment_5 ) )
            // InternalBPMN_translator.g:2942:2: ( rule__Device__IdAssignment_5 )
            {
             before(grammarAccess.getDeviceAccess().getIdAssignment_5()); 
            // InternalBPMN_translator.g:2943:2: ( rule__Device__IdAssignment_5 )
            // InternalBPMN_translator.g:2943:3: rule__Device__IdAssignment_5
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
    // InternalBPMN_translator.g:2952:1: rule__Protocol__Group_0__0 : rule__Protocol__Group_0__0__Impl rule__Protocol__Group_0__1 ;
    public final void rule__Protocol__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2956:1: ( rule__Protocol__Group_0__0__Impl rule__Protocol__Group_0__1 )
            // InternalBPMN_translator.g:2957:2: rule__Protocol__Group_0__0__Impl rule__Protocol__Group_0__1
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
    // InternalBPMN_translator.g:2964:1: rule__Protocol__Group_0__0__Impl : ( ( rule__Protocol__PnameAssignment_0_0 ) ) ;
    public final void rule__Protocol__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2968:1: ( ( ( rule__Protocol__PnameAssignment_0_0 ) ) )
            // InternalBPMN_translator.g:2969:1: ( ( rule__Protocol__PnameAssignment_0_0 ) )
            {
            // InternalBPMN_translator.g:2969:1: ( ( rule__Protocol__PnameAssignment_0_0 ) )
            // InternalBPMN_translator.g:2970:2: ( rule__Protocol__PnameAssignment_0_0 )
            {
             before(grammarAccess.getProtocolAccess().getPnameAssignment_0_0()); 
            // InternalBPMN_translator.g:2971:2: ( rule__Protocol__PnameAssignment_0_0 )
            // InternalBPMN_translator.g:2971:3: rule__Protocol__PnameAssignment_0_0
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
    // InternalBPMN_translator.g:2979:1: rule__Protocol__Group_0__1 : rule__Protocol__Group_0__1__Impl rule__Protocol__Group_0__2 ;
    public final void rule__Protocol__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2983:1: ( rule__Protocol__Group_0__1__Impl rule__Protocol__Group_0__2 )
            // InternalBPMN_translator.g:2984:2: rule__Protocol__Group_0__1__Impl rule__Protocol__Group_0__2
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
    // InternalBPMN_translator.g:2991:1: rule__Protocol__Group_0__1__Impl : ( '{' ) ;
    public final void rule__Protocol__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2995:1: ( ( '{' ) )
            // InternalBPMN_translator.g:2996:1: ( '{' )
            {
            // InternalBPMN_translator.g:2996:1: ( '{' )
            // InternalBPMN_translator.g:2997:2: '{'
            {
             before(grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_0_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3006:1: rule__Protocol__Group_0__2 : rule__Protocol__Group_0__2__Impl rule__Protocol__Group_0__3 ;
    public final void rule__Protocol__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3010:1: ( rule__Protocol__Group_0__2__Impl rule__Protocol__Group_0__3 )
            // InternalBPMN_translator.g:3011:2: rule__Protocol__Group_0__2__Impl rule__Protocol__Group_0__3
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
    // InternalBPMN_translator.g:3018:1: rule__Protocol__Group_0__2__Impl : ( ( rule__Protocol__Group_0_2__0 ) ) ;
    public final void rule__Protocol__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3022:1: ( ( ( rule__Protocol__Group_0_2__0 ) ) )
            // InternalBPMN_translator.g:3023:1: ( ( rule__Protocol__Group_0_2__0 ) )
            {
            // InternalBPMN_translator.g:3023:1: ( ( rule__Protocol__Group_0_2__0 ) )
            // InternalBPMN_translator.g:3024:2: ( rule__Protocol__Group_0_2__0 )
            {
             before(grammarAccess.getProtocolAccess().getGroup_0_2()); 
            // InternalBPMN_translator.g:3025:2: ( rule__Protocol__Group_0_2__0 )
            // InternalBPMN_translator.g:3025:3: rule__Protocol__Group_0_2__0
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
    // InternalBPMN_translator.g:3033:1: rule__Protocol__Group_0__3 : rule__Protocol__Group_0__3__Impl ;
    public final void rule__Protocol__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3037:1: ( rule__Protocol__Group_0__3__Impl )
            // InternalBPMN_translator.g:3038:2: rule__Protocol__Group_0__3__Impl
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
    // InternalBPMN_translator.g:3044:1: rule__Protocol__Group_0__3__Impl : ( '}' ) ;
    public final void rule__Protocol__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3048:1: ( ( '}' ) )
            // InternalBPMN_translator.g:3049:1: ( '}' )
            {
            // InternalBPMN_translator.g:3049:1: ( '}' )
            // InternalBPMN_translator.g:3050:2: '}'
            {
             before(grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_0_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3060:1: rule__Protocol__Group_0_2__0 : rule__Protocol__Group_0_2__0__Impl rule__Protocol__Group_0_2__1 ;
    public final void rule__Protocol__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3064:1: ( rule__Protocol__Group_0_2__0__Impl rule__Protocol__Group_0_2__1 )
            // InternalBPMN_translator.g:3065:2: rule__Protocol__Group_0_2__0__Impl rule__Protocol__Group_0_2__1
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
    // InternalBPMN_translator.g:3072:1: rule__Protocol__Group_0_2__0__Impl : ( ( rule__Protocol__Mqtt_dataAssignment_0_2_0 ) ) ;
    public final void rule__Protocol__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3076:1: ( ( ( rule__Protocol__Mqtt_dataAssignment_0_2_0 ) ) )
            // InternalBPMN_translator.g:3077:1: ( ( rule__Protocol__Mqtt_dataAssignment_0_2_0 ) )
            {
            // InternalBPMN_translator.g:3077:1: ( ( rule__Protocol__Mqtt_dataAssignment_0_2_0 ) )
            // InternalBPMN_translator.g:3078:2: ( rule__Protocol__Mqtt_dataAssignment_0_2_0 )
            {
             before(grammarAccess.getProtocolAccess().getMqtt_dataAssignment_0_2_0()); 
            // InternalBPMN_translator.g:3079:2: ( rule__Protocol__Mqtt_dataAssignment_0_2_0 )
            // InternalBPMN_translator.g:3079:3: rule__Protocol__Mqtt_dataAssignment_0_2_0
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
    // InternalBPMN_translator.g:3087:1: rule__Protocol__Group_0_2__1 : rule__Protocol__Group_0_2__1__Impl ;
    public final void rule__Protocol__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3091:1: ( rule__Protocol__Group_0_2__1__Impl )
            // InternalBPMN_translator.g:3092:2: rule__Protocol__Group_0_2__1__Impl
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
    // InternalBPMN_translator.g:3098:1: rule__Protocol__Group_0_2__1__Impl : ( ( rule__Protocol__Mqtt_deviceAssignment_0_2_1 ) ) ;
    public final void rule__Protocol__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3102:1: ( ( ( rule__Protocol__Mqtt_deviceAssignment_0_2_1 ) ) )
            // InternalBPMN_translator.g:3103:1: ( ( rule__Protocol__Mqtt_deviceAssignment_0_2_1 ) )
            {
            // InternalBPMN_translator.g:3103:1: ( ( rule__Protocol__Mqtt_deviceAssignment_0_2_1 ) )
            // InternalBPMN_translator.g:3104:2: ( rule__Protocol__Mqtt_deviceAssignment_0_2_1 )
            {
             before(grammarAccess.getProtocolAccess().getMqtt_deviceAssignment_0_2_1()); 
            // InternalBPMN_translator.g:3105:2: ( rule__Protocol__Mqtt_deviceAssignment_0_2_1 )
            // InternalBPMN_translator.g:3105:3: rule__Protocol__Mqtt_deviceAssignment_0_2_1
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
    // InternalBPMN_translator.g:3114:1: rule__Protocol__Group_1__0 : rule__Protocol__Group_1__0__Impl rule__Protocol__Group_1__1 ;
    public final void rule__Protocol__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3118:1: ( rule__Protocol__Group_1__0__Impl rule__Protocol__Group_1__1 )
            // InternalBPMN_translator.g:3119:2: rule__Protocol__Group_1__0__Impl rule__Protocol__Group_1__1
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
    // InternalBPMN_translator.g:3126:1: rule__Protocol__Group_1__0__Impl : ( ( rule__Protocol__PnameAssignment_1_0 ) ) ;
    public final void rule__Protocol__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3130:1: ( ( ( rule__Protocol__PnameAssignment_1_0 ) ) )
            // InternalBPMN_translator.g:3131:1: ( ( rule__Protocol__PnameAssignment_1_0 ) )
            {
            // InternalBPMN_translator.g:3131:1: ( ( rule__Protocol__PnameAssignment_1_0 ) )
            // InternalBPMN_translator.g:3132:2: ( rule__Protocol__PnameAssignment_1_0 )
            {
             before(grammarAccess.getProtocolAccess().getPnameAssignment_1_0()); 
            // InternalBPMN_translator.g:3133:2: ( rule__Protocol__PnameAssignment_1_0 )
            // InternalBPMN_translator.g:3133:3: rule__Protocol__PnameAssignment_1_0
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
    // InternalBPMN_translator.g:3141:1: rule__Protocol__Group_1__1 : rule__Protocol__Group_1__1__Impl rule__Protocol__Group_1__2 ;
    public final void rule__Protocol__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3145:1: ( rule__Protocol__Group_1__1__Impl rule__Protocol__Group_1__2 )
            // InternalBPMN_translator.g:3146:2: rule__Protocol__Group_1__1__Impl rule__Protocol__Group_1__2
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
    // InternalBPMN_translator.g:3153:1: rule__Protocol__Group_1__1__Impl : ( '{' ) ;
    public final void rule__Protocol__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3157:1: ( ( '{' ) )
            // InternalBPMN_translator.g:3158:1: ( '{' )
            {
            // InternalBPMN_translator.g:3158:1: ( '{' )
            // InternalBPMN_translator.g:3159:2: '{'
            {
             before(grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_1_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3168:1: rule__Protocol__Group_1__2 : rule__Protocol__Group_1__2__Impl rule__Protocol__Group_1__3 ;
    public final void rule__Protocol__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3172:1: ( rule__Protocol__Group_1__2__Impl rule__Protocol__Group_1__3 )
            // InternalBPMN_translator.g:3173:2: rule__Protocol__Group_1__2__Impl rule__Protocol__Group_1__3
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
    // InternalBPMN_translator.g:3180:1: rule__Protocol__Group_1__2__Impl : ( ( rule__Protocol__Group_1_2__0 ) ) ;
    public final void rule__Protocol__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3184:1: ( ( ( rule__Protocol__Group_1_2__0 ) ) )
            // InternalBPMN_translator.g:3185:1: ( ( rule__Protocol__Group_1_2__0 ) )
            {
            // InternalBPMN_translator.g:3185:1: ( ( rule__Protocol__Group_1_2__0 ) )
            // InternalBPMN_translator.g:3186:2: ( rule__Protocol__Group_1_2__0 )
            {
             before(grammarAccess.getProtocolAccess().getGroup_1_2()); 
            // InternalBPMN_translator.g:3187:2: ( rule__Protocol__Group_1_2__0 )
            // InternalBPMN_translator.g:3187:3: rule__Protocol__Group_1_2__0
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
    // InternalBPMN_translator.g:3195:1: rule__Protocol__Group_1__3 : rule__Protocol__Group_1__3__Impl ;
    public final void rule__Protocol__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3199:1: ( rule__Protocol__Group_1__3__Impl )
            // InternalBPMN_translator.g:3200:2: rule__Protocol__Group_1__3__Impl
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
    // InternalBPMN_translator.g:3206:1: rule__Protocol__Group_1__3__Impl : ( '}' ) ;
    public final void rule__Protocol__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3210:1: ( ( '}' ) )
            // InternalBPMN_translator.g:3211:1: ( '}' )
            {
            // InternalBPMN_translator.g:3211:1: ( '}' )
            // InternalBPMN_translator.g:3212:2: '}'
            {
             before(grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3222:1: rule__Protocol__Group_1_2__0 : rule__Protocol__Group_1_2__0__Impl rule__Protocol__Group_1_2__1 ;
    public final void rule__Protocol__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3226:1: ( rule__Protocol__Group_1_2__0__Impl rule__Protocol__Group_1_2__1 )
            // InternalBPMN_translator.g:3227:2: rule__Protocol__Group_1_2__0__Impl rule__Protocol__Group_1_2__1
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
    // InternalBPMN_translator.g:3234:1: rule__Protocol__Group_1_2__0__Impl : ( ( rule__Protocol__Http_dataAssignment_1_2_0 ) ) ;
    public final void rule__Protocol__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3238:1: ( ( ( rule__Protocol__Http_dataAssignment_1_2_0 ) ) )
            // InternalBPMN_translator.g:3239:1: ( ( rule__Protocol__Http_dataAssignment_1_2_0 ) )
            {
            // InternalBPMN_translator.g:3239:1: ( ( rule__Protocol__Http_dataAssignment_1_2_0 ) )
            // InternalBPMN_translator.g:3240:2: ( rule__Protocol__Http_dataAssignment_1_2_0 )
            {
             before(grammarAccess.getProtocolAccess().getHttp_dataAssignment_1_2_0()); 
            // InternalBPMN_translator.g:3241:2: ( rule__Protocol__Http_dataAssignment_1_2_0 )
            // InternalBPMN_translator.g:3241:3: rule__Protocol__Http_dataAssignment_1_2_0
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
    // InternalBPMN_translator.g:3249:1: rule__Protocol__Group_1_2__1 : rule__Protocol__Group_1_2__1__Impl ;
    public final void rule__Protocol__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3253:1: ( rule__Protocol__Group_1_2__1__Impl )
            // InternalBPMN_translator.g:3254:2: rule__Protocol__Group_1_2__1__Impl
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
    // InternalBPMN_translator.g:3260:1: rule__Protocol__Group_1_2__1__Impl : ( ( rule__Protocol__Mqtt_deviceAssignment_1_2_1 ) ) ;
    public final void rule__Protocol__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3264:1: ( ( ( rule__Protocol__Mqtt_deviceAssignment_1_2_1 ) ) )
            // InternalBPMN_translator.g:3265:1: ( ( rule__Protocol__Mqtt_deviceAssignment_1_2_1 ) )
            {
            // InternalBPMN_translator.g:3265:1: ( ( rule__Protocol__Mqtt_deviceAssignment_1_2_1 ) )
            // InternalBPMN_translator.g:3266:2: ( rule__Protocol__Mqtt_deviceAssignment_1_2_1 )
            {
             before(grammarAccess.getProtocolAccess().getMqtt_deviceAssignment_1_2_1()); 
            // InternalBPMN_translator.g:3267:2: ( rule__Protocol__Mqtt_deviceAssignment_1_2_1 )
            // InternalBPMN_translator.g:3267:3: rule__Protocol__Mqtt_deviceAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Mqtt_deviceAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getMqtt_deviceAssignment_1_2_1()); 

            }


            }

        }
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
    // InternalBPMN_translator.g:3276:1: rule__Http_data__Group__0 : rule__Http_data__Group__0__Impl rule__Http_data__Group__1 ;
    public final void rule__Http_data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3280:1: ( rule__Http_data__Group__0__Impl rule__Http_data__Group__1 )
            // InternalBPMN_translator.g:3281:2: rule__Http_data__Group__0__Impl rule__Http_data__Group__1
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
    // InternalBPMN_translator.g:3288:1: rule__Http_data__Group__0__Impl : ( () ) ;
    public final void rule__Http_data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3292:1: ( ( () ) )
            // InternalBPMN_translator.g:3293:1: ( () )
            {
            // InternalBPMN_translator.g:3293:1: ( () )
            // InternalBPMN_translator.g:3294:2: ()
            {
             before(grammarAccess.getHttp_dataAccess().getHttp_dataAction_0()); 
            // InternalBPMN_translator.g:3295:2: ()
            // InternalBPMN_translator.g:3295:3: 
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
    // InternalBPMN_translator.g:3303:1: rule__Http_data__Group__1 : rule__Http_data__Group__1__Impl ;
    public final void rule__Http_data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3307:1: ( rule__Http_data__Group__1__Impl )
            // InternalBPMN_translator.g:3308:2: rule__Http_data__Group__1__Impl
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
    // InternalBPMN_translator.g:3314:1: rule__Http_data__Group__1__Impl : ( ( rule__Http_data__Alternatives_1 )* ) ;
    public final void rule__Http_data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3318:1: ( ( ( rule__Http_data__Alternatives_1 )* ) )
            // InternalBPMN_translator.g:3319:1: ( ( rule__Http_data__Alternatives_1 )* )
            {
            // InternalBPMN_translator.g:3319:1: ( ( rule__Http_data__Alternatives_1 )* )
            // InternalBPMN_translator.g:3320:2: ( rule__Http_data__Alternatives_1 )*
            {
             before(grammarAccess.getHttp_dataAccess().getAlternatives_1()); 
            // InternalBPMN_translator.g:3321:2: ( rule__Http_data__Alternatives_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=43 && LA26_0<=49)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBPMN_translator.g:3321:3: rule__Http_data__Alternatives_1
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
    // InternalBPMN_translator.g:3330:1: rule__Http_data__Group_1_0__0 : rule__Http_data__Group_1_0__0__Impl rule__Http_data__Group_1_0__1 ;
    public final void rule__Http_data__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3334:1: ( rule__Http_data__Group_1_0__0__Impl rule__Http_data__Group_1_0__1 )
            // InternalBPMN_translator.g:3335:2: rule__Http_data__Group_1_0__0__Impl rule__Http_data__Group_1_0__1
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
    // InternalBPMN_translator.g:3342:1: rule__Http_data__Group_1_0__0__Impl : ( 'NAME' ) ;
    public final void rule__Http_data__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3346:1: ( ( 'NAME' ) )
            // InternalBPMN_translator.g:3347:1: ( 'NAME' )
            {
            // InternalBPMN_translator.g:3347:1: ( 'NAME' )
            // InternalBPMN_translator.g:3348:2: 'NAME'
            {
             before(grammarAccess.getHttp_dataAccess().getNAMEKeyword_1_0_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3357:1: rule__Http_data__Group_1_0__1 : rule__Http_data__Group_1_0__1__Impl rule__Http_data__Group_1_0__2 ;
    public final void rule__Http_data__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3361:1: ( rule__Http_data__Group_1_0__1__Impl rule__Http_data__Group_1_0__2 )
            // InternalBPMN_translator.g:3362:2: rule__Http_data__Group_1_0__1__Impl rule__Http_data__Group_1_0__2
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
    // InternalBPMN_translator.g:3369:1: rule__Http_data__Group_1_0__1__Impl : ( '=' ) ;
    public final void rule__Http_data__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3373:1: ( ( '=' ) )
            // InternalBPMN_translator.g:3374:1: ( '=' )
            {
            // InternalBPMN_translator.g:3374:1: ( '=' )
            // InternalBPMN_translator.g:3375:2: '='
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
    // InternalBPMN_translator.g:3384:1: rule__Http_data__Group_1_0__2 : rule__Http_data__Group_1_0__2__Impl ;
    public final void rule__Http_data__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3388:1: ( rule__Http_data__Group_1_0__2__Impl )
            // InternalBPMN_translator.g:3389:2: rule__Http_data__Group_1_0__2__Impl
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
    // InternalBPMN_translator.g:3395:1: rule__Http_data__Group_1_0__2__Impl : ( ( rule__Http_data__PnameAssignment_1_0_2 ) ) ;
    public final void rule__Http_data__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3399:1: ( ( ( rule__Http_data__PnameAssignment_1_0_2 ) ) )
            // InternalBPMN_translator.g:3400:1: ( ( rule__Http_data__PnameAssignment_1_0_2 ) )
            {
            // InternalBPMN_translator.g:3400:1: ( ( rule__Http_data__PnameAssignment_1_0_2 ) )
            // InternalBPMN_translator.g:3401:2: ( rule__Http_data__PnameAssignment_1_0_2 )
            {
             before(grammarAccess.getHttp_dataAccess().getPnameAssignment_1_0_2()); 
            // InternalBPMN_translator.g:3402:2: ( rule__Http_data__PnameAssignment_1_0_2 )
            // InternalBPMN_translator.g:3402:3: rule__Http_data__PnameAssignment_1_0_2
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
    // InternalBPMN_translator.g:3411:1: rule__Http_data__Group_1_1__0 : rule__Http_data__Group_1_1__0__Impl rule__Http_data__Group_1_1__1 ;
    public final void rule__Http_data__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3415:1: ( rule__Http_data__Group_1_1__0__Impl rule__Http_data__Group_1_1__1 )
            // InternalBPMN_translator.g:3416:2: rule__Http_data__Group_1_1__0__Impl rule__Http_data__Group_1_1__1
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
    // InternalBPMN_translator.g:3423:1: rule__Http_data__Group_1_1__0__Impl : ( 'SERVER_IP' ) ;
    public final void rule__Http_data__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3427:1: ( ( 'SERVER_IP' ) )
            // InternalBPMN_translator.g:3428:1: ( 'SERVER_IP' )
            {
            // InternalBPMN_translator.g:3428:1: ( 'SERVER_IP' )
            // InternalBPMN_translator.g:3429:2: 'SERVER_IP'
            {
             before(grammarAccess.getHttp_dataAccess().getSERVER_IPKeyword_1_1_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3438:1: rule__Http_data__Group_1_1__1 : rule__Http_data__Group_1_1__1__Impl rule__Http_data__Group_1_1__2 ;
    public final void rule__Http_data__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3442:1: ( rule__Http_data__Group_1_1__1__Impl rule__Http_data__Group_1_1__2 )
            // InternalBPMN_translator.g:3443:2: rule__Http_data__Group_1_1__1__Impl rule__Http_data__Group_1_1__2
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
    // InternalBPMN_translator.g:3450:1: rule__Http_data__Group_1_1__1__Impl : ( '=' ) ;
    public final void rule__Http_data__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3454:1: ( ( '=' ) )
            // InternalBPMN_translator.g:3455:1: ( '=' )
            {
            // InternalBPMN_translator.g:3455:1: ( '=' )
            // InternalBPMN_translator.g:3456:2: '='
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
    // InternalBPMN_translator.g:3465:1: rule__Http_data__Group_1_1__2 : rule__Http_data__Group_1_1__2__Impl ;
    public final void rule__Http_data__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3469:1: ( rule__Http_data__Group_1_1__2__Impl )
            // InternalBPMN_translator.g:3470:2: rule__Http_data__Group_1_1__2__Impl
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
    // InternalBPMN_translator.g:3476:1: rule__Http_data__Group_1_1__2__Impl : ( ( rule__Http_data__Server_ipAssignment_1_1_2 ) ) ;
    public final void rule__Http_data__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3480:1: ( ( ( rule__Http_data__Server_ipAssignment_1_1_2 ) ) )
            // InternalBPMN_translator.g:3481:1: ( ( rule__Http_data__Server_ipAssignment_1_1_2 ) )
            {
            // InternalBPMN_translator.g:3481:1: ( ( rule__Http_data__Server_ipAssignment_1_1_2 ) )
            // InternalBPMN_translator.g:3482:2: ( rule__Http_data__Server_ipAssignment_1_1_2 )
            {
             before(grammarAccess.getHttp_dataAccess().getServer_ipAssignment_1_1_2()); 
            // InternalBPMN_translator.g:3483:2: ( rule__Http_data__Server_ipAssignment_1_1_2 )
            // InternalBPMN_translator.g:3483:3: rule__Http_data__Server_ipAssignment_1_1_2
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
    // InternalBPMN_translator.g:3492:1: rule__Http_data__Group_1_2__0 : rule__Http_data__Group_1_2__0__Impl rule__Http_data__Group_1_2__1 ;
    public final void rule__Http_data__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3496:1: ( rule__Http_data__Group_1_2__0__Impl rule__Http_data__Group_1_2__1 )
            // InternalBPMN_translator.g:3497:2: rule__Http_data__Group_1_2__0__Impl rule__Http_data__Group_1_2__1
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
    // InternalBPMN_translator.g:3504:1: rule__Http_data__Group_1_2__0__Impl : ( 'REQUEST_TYPE' ) ;
    public final void rule__Http_data__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3508:1: ( ( 'REQUEST_TYPE' ) )
            // InternalBPMN_translator.g:3509:1: ( 'REQUEST_TYPE' )
            {
            // InternalBPMN_translator.g:3509:1: ( 'REQUEST_TYPE' )
            // InternalBPMN_translator.g:3510:2: 'REQUEST_TYPE'
            {
             before(grammarAccess.getHttp_dataAccess().getREQUEST_TYPEKeyword_1_2_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3519:1: rule__Http_data__Group_1_2__1 : rule__Http_data__Group_1_2__1__Impl rule__Http_data__Group_1_2__2 ;
    public final void rule__Http_data__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3523:1: ( rule__Http_data__Group_1_2__1__Impl rule__Http_data__Group_1_2__2 )
            // InternalBPMN_translator.g:3524:2: rule__Http_data__Group_1_2__1__Impl rule__Http_data__Group_1_2__2
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
    // InternalBPMN_translator.g:3531:1: rule__Http_data__Group_1_2__1__Impl : ( '=' ) ;
    public final void rule__Http_data__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3535:1: ( ( '=' ) )
            // InternalBPMN_translator.g:3536:1: ( '=' )
            {
            // InternalBPMN_translator.g:3536:1: ( '=' )
            // InternalBPMN_translator.g:3537:2: '='
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
    // InternalBPMN_translator.g:3546:1: rule__Http_data__Group_1_2__2 : rule__Http_data__Group_1_2__2__Impl ;
    public final void rule__Http_data__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3550:1: ( rule__Http_data__Group_1_2__2__Impl )
            // InternalBPMN_translator.g:3551:2: rule__Http_data__Group_1_2__2__Impl
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
    // InternalBPMN_translator.g:3557:1: rule__Http_data__Group_1_2__2__Impl : ( ( rule__Http_data__Request_typeAssignment_1_2_2 ) ) ;
    public final void rule__Http_data__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3561:1: ( ( ( rule__Http_data__Request_typeAssignment_1_2_2 ) ) )
            // InternalBPMN_translator.g:3562:1: ( ( rule__Http_data__Request_typeAssignment_1_2_2 ) )
            {
            // InternalBPMN_translator.g:3562:1: ( ( rule__Http_data__Request_typeAssignment_1_2_2 ) )
            // InternalBPMN_translator.g:3563:2: ( rule__Http_data__Request_typeAssignment_1_2_2 )
            {
             before(grammarAccess.getHttp_dataAccess().getRequest_typeAssignment_1_2_2()); 
            // InternalBPMN_translator.g:3564:2: ( rule__Http_data__Request_typeAssignment_1_2_2 )
            // InternalBPMN_translator.g:3564:3: rule__Http_data__Request_typeAssignment_1_2_2
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
    // InternalBPMN_translator.g:3573:1: rule__Http_data__Group_1_3__0 : rule__Http_data__Group_1_3__0__Impl rule__Http_data__Group_1_3__1 ;
    public final void rule__Http_data__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3577:1: ( rule__Http_data__Group_1_3__0__Impl rule__Http_data__Group_1_3__1 )
            // InternalBPMN_translator.g:3578:2: rule__Http_data__Group_1_3__0__Impl rule__Http_data__Group_1_3__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalBPMN_translator.g:3585:1: rule__Http_data__Group_1_3__0__Impl : ( 'CONTENT_TYPE' ) ;
    public final void rule__Http_data__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3589:1: ( ( 'CONTENT_TYPE' ) )
            // InternalBPMN_translator.g:3590:1: ( 'CONTENT_TYPE' )
            {
            // InternalBPMN_translator.g:3590:1: ( 'CONTENT_TYPE' )
            // InternalBPMN_translator.g:3591:2: 'CONTENT_TYPE'
            {
             before(grammarAccess.getHttp_dataAccess().getCONTENT_TYPEKeyword_1_3_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3600:1: rule__Http_data__Group_1_3__1 : rule__Http_data__Group_1_3__1__Impl ;
    public final void rule__Http_data__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3604:1: ( rule__Http_data__Group_1_3__1__Impl )
            // InternalBPMN_translator.g:3605:2: rule__Http_data__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Http_data__Group_1_3__1__Impl();

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
    // InternalBPMN_translator.g:3611:1: rule__Http_data__Group_1_3__1__Impl : ( ( rule__Http_data__Content_typeAssignment_1_3_1 ) ) ;
    public final void rule__Http_data__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3615:1: ( ( ( rule__Http_data__Content_typeAssignment_1_3_1 ) ) )
            // InternalBPMN_translator.g:3616:1: ( ( rule__Http_data__Content_typeAssignment_1_3_1 ) )
            {
            // InternalBPMN_translator.g:3616:1: ( ( rule__Http_data__Content_typeAssignment_1_3_1 ) )
            // InternalBPMN_translator.g:3617:2: ( rule__Http_data__Content_typeAssignment_1_3_1 )
            {
             before(grammarAccess.getHttp_dataAccess().getContent_typeAssignment_1_3_1()); 
            // InternalBPMN_translator.g:3618:2: ( rule__Http_data__Content_typeAssignment_1_3_1 )
            // InternalBPMN_translator.g:3618:3: rule__Http_data__Content_typeAssignment_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Http_data__Content_typeAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHttp_dataAccess().getContent_typeAssignment_1_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Http_data__Group_1_4__0"
    // InternalBPMN_translator.g:3627:1: rule__Http_data__Group_1_4__0 : rule__Http_data__Group_1_4__0__Impl rule__Http_data__Group_1_4__1 ;
    public final void rule__Http_data__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3631:1: ( rule__Http_data__Group_1_4__0__Impl rule__Http_data__Group_1_4__1 )
            // InternalBPMN_translator.g:3632:2: rule__Http_data__Group_1_4__0__Impl rule__Http_data__Group_1_4__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalBPMN_translator.g:3639:1: rule__Http_data__Group_1_4__0__Impl : ( 'HEADER' ) ;
    public final void rule__Http_data__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3643:1: ( ( 'HEADER' ) )
            // InternalBPMN_translator.g:3644:1: ( 'HEADER' )
            {
            // InternalBPMN_translator.g:3644:1: ( 'HEADER' )
            // InternalBPMN_translator.g:3645:2: 'HEADER'
            {
             before(grammarAccess.getHttp_dataAccess().getHEADERKeyword_1_4_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3654:1: rule__Http_data__Group_1_4__1 : rule__Http_data__Group_1_4__1__Impl ;
    public final void rule__Http_data__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3658:1: ( rule__Http_data__Group_1_4__1__Impl )
            // InternalBPMN_translator.g:3659:2: rule__Http_data__Group_1_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Http_data__Group_1_4__1__Impl();

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
    // InternalBPMN_translator.g:3665:1: rule__Http_data__Group_1_4__1__Impl : ( ( rule__Http_data__HeaderAssignment_1_4_1 ) ) ;
    public final void rule__Http_data__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3669:1: ( ( ( rule__Http_data__HeaderAssignment_1_4_1 ) ) )
            // InternalBPMN_translator.g:3670:1: ( ( rule__Http_data__HeaderAssignment_1_4_1 ) )
            {
            // InternalBPMN_translator.g:3670:1: ( ( rule__Http_data__HeaderAssignment_1_4_1 ) )
            // InternalBPMN_translator.g:3671:2: ( rule__Http_data__HeaderAssignment_1_4_1 )
            {
             before(grammarAccess.getHttp_dataAccess().getHeaderAssignment_1_4_1()); 
            // InternalBPMN_translator.g:3672:2: ( rule__Http_data__HeaderAssignment_1_4_1 )
            // InternalBPMN_translator.g:3672:3: rule__Http_data__HeaderAssignment_1_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Http_data__HeaderAssignment_1_4_1();

            state._fsp--;


            }

             after(grammarAccess.getHttp_dataAccess().getHeaderAssignment_1_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Http_data__Group_1_5__0"
    // InternalBPMN_translator.g:3681:1: rule__Http_data__Group_1_5__0 : rule__Http_data__Group_1_5__0__Impl rule__Http_data__Group_1_5__1 ;
    public final void rule__Http_data__Group_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3685:1: ( rule__Http_data__Group_1_5__0__Impl rule__Http_data__Group_1_5__1 )
            // InternalBPMN_translator.g:3686:2: rule__Http_data__Group_1_5__0__Impl rule__Http_data__Group_1_5__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalBPMN_translator.g:3693:1: rule__Http_data__Group_1_5__0__Impl : ( 'DATA' ) ;
    public final void rule__Http_data__Group_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3697:1: ( ( 'DATA' ) )
            // InternalBPMN_translator.g:3698:1: ( 'DATA' )
            {
            // InternalBPMN_translator.g:3698:1: ( 'DATA' )
            // InternalBPMN_translator.g:3699:2: 'DATA'
            {
             before(grammarAccess.getHttp_dataAccess().getDATAKeyword_1_5_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3708:1: rule__Http_data__Group_1_5__1 : rule__Http_data__Group_1_5__1__Impl ;
    public final void rule__Http_data__Group_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3712:1: ( rule__Http_data__Group_1_5__1__Impl )
            // InternalBPMN_translator.g:3713:2: rule__Http_data__Group_1_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Http_data__Group_1_5__1__Impl();

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
    // InternalBPMN_translator.g:3719:1: rule__Http_data__Group_1_5__1__Impl : ( ( rule__Http_data__DataAssignment_1_5_1 ) ) ;
    public final void rule__Http_data__Group_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3723:1: ( ( ( rule__Http_data__DataAssignment_1_5_1 ) ) )
            // InternalBPMN_translator.g:3724:1: ( ( rule__Http_data__DataAssignment_1_5_1 ) )
            {
            // InternalBPMN_translator.g:3724:1: ( ( rule__Http_data__DataAssignment_1_5_1 ) )
            // InternalBPMN_translator.g:3725:2: ( rule__Http_data__DataAssignment_1_5_1 )
            {
             before(grammarAccess.getHttp_dataAccess().getDataAssignment_1_5_1()); 
            // InternalBPMN_translator.g:3726:2: ( rule__Http_data__DataAssignment_1_5_1 )
            // InternalBPMN_translator.g:3726:3: rule__Http_data__DataAssignment_1_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Http_data__DataAssignment_1_5_1();

            state._fsp--;


            }

             after(grammarAccess.getHttp_dataAccess().getDataAssignment_1_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Http_data__Group_1_6__0"
    // InternalBPMN_translator.g:3735:1: rule__Http_data__Group_1_6__0 : rule__Http_data__Group_1_6__0__Impl rule__Http_data__Group_1_6__1 ;
    public final void rule__Http_data__Group_1_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3739:1: ( rule__Http_data__Group_1_6__0__Impl rule__Http_data__Group_1_6__1 )
            // InternalBPMN_translator.g:3740:2: rule__Http_data__Group_1_6__0__Impl rule__Http_data__Group_1_6__1
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
    // InternalBPMN_translator.g:3747:1: rule__Http_data__Group_1_6__0__Impl : ( 'NETWORK' ) ;
    public final void rule__Http_data__Group_1_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3751:1: ( ( 'NETWORK' ) )
            // InternalBPMN_translator.g:3752:1: ( 'NETWORK' )
            {
            // InternalBPMN_translator.g:3752:1: ( 'NETWORK' )
            // InternalBPMN_translator.g:3753:2: 'NETWORK'
            {
             before(grammarAccess.getHttp_dataAccess().getNETWORKKeyword_1_6_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3762:1: rule__Http_data__Group_1_6__1 : rule__Http_data__Group_1_6__1__Impl rule__Http_data__Group_1_6__2 ;
    public final void rule__Http_data__Group_1_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3766:1: ( rule__Http_data__Group_1_6__1__Impl rule__Http_data__Group_1_6__2 )
            // InternalBPMN_translator.g:3767:2: rule__Http_data__Group_1_6__1__Impl rule__Http_data__Group_1_6__2
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
    // InternalBPMN_translator.g:3774:1: rule__Http_data__Group_1_6__1__Impl : ( '{' ) ;
    public final void rule__Http_data__Group_1_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3778:1: ( ( '{' ) )
            // InternalBPMN_translator.g:3779:1: ( '{' )
            {
            // InternalBPMN_translator.g:3779:1: ( '{' )
            // InternalBPMN_translator.g:3780:2: '{'
            {
             before(grammarAccess.getHttp_dataAccess().getLeftCurlyBracketKeyword_1_6_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3789:1: rule__Http_data__Group_1_6__2 : rule__Http_data__Group_1_6__2__Impl rule__Http_data__Group_1_6__3 ;
    public final void rule__Http_data__Group_1_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3793:1: ( rule__Http_data__Group_1_6__2__Impl rule__Http_data__Group_1_6__3 )
            // InternalBPMN_translator.g:3794:2: rule__Http_data__Group_1_6__2__Impl rule__Http_data__Group_1_6__3
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
    // InternalBPMN_translator.g:3801:1: rule__Http_data__Group_1_6__2__Impl : ( ( rule__Http_data__Mqtt_network_dataAssignment_1_6_2 )* ) ;
    public final void rule__Http_data__Group_1_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3805:1: ( ( ( rule__Http_data__Mqtt_network_dataAssignment_1_6_2 )* ) )
            // InternalBPMN_translator.g:3806:1: ( ( rule__Http_data__Mqtt_network_dataAssignment_1_6_2 )* )
            {
            // InternalBPMN_translator.g:3806:1: ( ( rule__Http_data__Mqtt_network_dataAssignment_1_6_2 )* )
            // InternalBPMN_translator.g:3807:2: ( rule__Http_data__Mqtt_network_dataAssignment_1_6_2 )*
            {
             before(grammarAccess.getHttp_dataAccess().getMqtt_network_dataAssignment_1_6_2()); 
            // InternalBPMN_translator.g:3808:2: ( rule__Http_data__Mqtt_network_dataAssignment_1_6_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==56) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalBPMN_translator.g:3808:3: rule__Http_data__Mqtt_network_dataAssignment_1_6_2
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
    // InternalBPMN_translator.g:3816:1: rule__Http_data__Group_1_6__3 : rule__Http_data__Group_1_6__3__Impl ;
    public final void rule__Http_data__Group_1_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3820:1: ( rule__Http_data__Group_1_6__3__Impl )
            // InternalBPMN_translator.g:3821:2: rule__Http_data__Group_1_6__3__Impl
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
    // InternalBPMN_translator.g:3827:1: rule__Http_data__Group_1_6__3__Impl : ( '}' ) ;
    public final void rule__Http_data__Group_1_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3831:1: ( ( '}' ) )
            // InternalBPMN_translator.g:3832:1: ( '}' )
            {
            // InternalBPMN_translator.g:3832:1: ( '}' )
            // InternalBPMN_translator.g:3833:2: '}'
            {
             before(grammarAccess.getHttp_dataAccess().getRightCurlyBracketKeyword_1_6_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3843:1: rule__Mqtt_data__Group__0 : rule__Mqtt_data__Group__0__Impl rule__Mqtt_data__Group__1 ;
    public final void rule__Mqtt_data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3847:1: ( rule__Mqtt_data__Group__0__Impl rule__Mqtt_data__Group__1 )
            // InternalBPMN_translator.g:3848:2: rule__Mqtt_data__Group__0__Impl rule__Mqtt_data__Group__1
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
    // InternalBPMN_translator.g:3855:1: rule__Mqtt_data__Group__0__Impl : ( () ) ;
    public final void rule__Mqtt_data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3859:1: ( ( () ) )
            // InternalBPMN_translator.g:3860:1: ( () )
            {
            // InternalBPMN_translator.g:3860:1: ( () )
            // InternalBPMN_translator.g:3861:2: ()
            {
             before(grammarAccess.getMqtt_dataAccess().getMqtt_dataAction_0()); 
            // InternalBPMN_translator.g:3862:2: ()
            // InternalBPMN_translator.g:3862:3: 
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
    // InternalBPMN_translator.g:3870:1: rule__Mqtt_data__Group__1 : rule__Mqtt_data__Group__1__Impl ;
    public final void rule__Mqtt_data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3874:1: ( rule__Mqtt_data__Group__1__Impl )
            // InternalBPMN_translator.g:3875:2: rule__Mqtt_data__Group__1__Impl
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
    // InternalBPMN_translator.g:3881:1: rule__Mqtt_data__Group__1__Impl : ( ( rule__Mqtt_data__Alternatives_1 )* ) ;
    public final void rule__Mqtt_data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3885:1: ( ( ( rule__Mqtt_data__Alternatives_1 )* ) )
            // InternalBPMN_translator.g:3886:1: ( ( rule__Mqtt_data__Alternatives_1 )* )
            {
            // InternalBPMN_translator.g:3886:1: ( ( rule__Mqtt_data__Alternatives_1 )* )
            // InternalBPMN_translator.g:3887:2: ( rule__Mqtt_data__Alternatives_1 )*
            {
             before(grammarAccess.getMqtt_dataAccess().getAlternatives_1()); 
            // InternalBPMN_translator.g:3888:2: ( rule__Mqtt_data__Alternatives_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==43||(LA28_0>=49 && LA28_0<=53)||LA28_0==55) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalBPMN_translator.g:3888:3: rule__Mqtt_data__Alternatives_1
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
    // InternalBPMN_translator.g:3897:1: rule__Mqtt_data__Group_1_0__0 : rule__Mqtt_data__Group_1_0__0__Impl rule__Mqtt_data__Group_1_0__1 ;
    public final void rule__Mqtt_data__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3901:1: ( rule__Mqtt_data__Group_1_0__0__Impl rule__Mqtt_data__Group_1_0__1 )
            // InternalBPMN_translator.g:3902:2: rule__Mqtt_data__Group_1_0__0__Impl rule__Mqtt_data__Group_1_0__1
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
    // InternalBPMN_translator.g:3909:1: rule__Mqtt_data__Group_1_0__0__Impl : ( 'NAME' ) ;
    public final void rule__Mqtt_data__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3913:1: ( ( 'NAME' ) )
            // InternalBPMN_translator.g:3914:1: ( 'NAME' )
            {
            // InternalBPMN_translator.g:3914:1: ( 'NAME' )
            // InternalBPMN_translator.g:3915:2: 'NAME'
            {
             before(grammarAccess.getMqtt_dataAccess().getNAMEKeyword_1_0_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3924:1: rule__Mqtt_data__Group_1_0__1 : rule__Mqtt_data__Group_1_0__1__Impl rule__Mqtt_data__Group_1_0__2 ;
    public final void rule__Mqtt_data__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3928:1: ( rule__Mqtt_data__Group_1_0__1__Impl rule__Mqtt_data__Group_1_0__2 )
            // InternalBPMN_translator.g:3929:2: rule__Mqtt_data__Group_1_0__1__Impl rule__Mqtt_data__Group_1_0__2
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
    // InternalBPMN_translator.g:3936:1: rule__Mqtt_data__Group_1_0__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3940:1: ( ( '=' ) )
            // InternalBPMN_translator.g:3941:1: ( '=' )
            {
            // InternalBPMN_translator.g:3941:1: ( '=' )
            // InternalBPMN_translator.g:3942:2: '='
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
    // InternalBPMN_translator.g:3951:1: rule__Mqtt_data__Group_1_0__2 : rule__Mqtt_data__Group_1_0__2__Impl ;
    public final void rule__Mqtt_data__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3955:1: ( rule__Mqtt_data__Group_1_0__2__Impl )
            // InternalBPMN_translator.g:3956:2: rule__Mqtt_data__Group_1_0__2__Impl
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
    // InternalBPMN_translator.g:3962:1: rule__Mqtt_data__Group_1_0__2__Impl : ( ( rule__Mqtt_data__PnameAssignment_1_0_2 ) ) ;
    public final void rule__Mqtt_data__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3966:1: ( ( ( rule__Mqtt_data__PnameAssignment_1_0_2 ) ) )
            // InternalBPMN_translator.g:3967:1: ( ( rule__Mqtt_data__PnameAssignment_1_0_2 ) )
            {
            // InternalBPMN_translator.g:3967:1: ( ( rule__Mqtt_data__PnameAssignment_1_0_2 ) )
            // InternalBPMN_translator.g:3968:2: ( rule__Mqtt_data__PnameAssignment_1_0_2 )
            {
             before(grammarAccess.getMqtt_dataAccess().getPnameAssignment_1_0_2()); 
            // InternalBPMN_translator.g:3969:2: ( rule__Mqtt_data__PnameAssignment_1_0_2 )
            // InternalBPMN_translator.g:3969:3: rule__Mqtt_data__PnameAssignment_1_0_2
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
    // InternalBPMN_translator.g:3978:1: rule__Mqtt_data__Group_1_1__0 : rule__Mqtt_data__Group_1_1__0__Impl rule__Mqtt_data__Group_1_1__1 ;
    public final void rule__Mqtt_data__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3982:1: ( rule__Mqtt_data__Group_1_1__0__Impl rule__Mqtt_data__Group_1_1__1 )
            // InternalBPMN_translator.g:3983:2: rule__Mqtt_data__Group_1_1__0__Impl rule__Mqtt_data__Group_1_1__1
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
    // InternalBPMN_translator.g:3990:1: rule__Mqtt_data__Group_1_1__0__Impl : ( 'BROKER_USER' ) ;
    public final void rule__Mqtt_data__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3994:1: ( ( 'BROKER_USER' ) )
            // InternalBPMN_translator.g:3995:1: ( 'BROKER_USER' )
            {
            // InternalBPMN_translator.g:3995:1: ( 'BROKER_USER' )
            // InternalBPMN_translator.g:3996:2: 'BROKER_USER'
            {
             before(grammarAccess.getMqtt_dataAccess().getBROKER_USERKeyword_1_1_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4005:1: rule__Mqtt_data__Group_1_1__1 : rule__Mqtt_data__Group_1_1__1__Impl rule__Mqtt_data__Group_1_1__2 ;
    public final void rule__Mqtt_data__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4009:1: ( rule__Mqtt_data__Group_1_1__1__Impl rule__Mqtt_data__Group_1_1__2 )
            // InternalBPMN_translator.g:4010:2: rule__Mqtt_data__Group_1_1__1__Impl rule__Mqtt_data__Group_1_1__2
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
    // InternalBPMN_translator.g:4017:1: rule__Mqtt_data__Group_1_1__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4021:1: ( ( '=' ) )
            // InternalBPMN_translator.g:4022:1: ( '=' )
            {
            // InternalBPMN_translator.g:4022:1: ( '=' )
            // InternalBPMN_translator.g:4023:2: '='
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
    // InternalBPMN_translator.g:4032:1: rule__Mqtt_data__Group_1_1__2 : rule__Mqtt_data__Group_1_1__2__Impl ;
    public final void rule__Mqtt_data__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4036:1: ( rule__Mqtt_data__Group_1_1__2__Impl )
            // InternalBPMN_translator.g:4037:2: rule__Mqtt_data__Group_1_1__2__Impl
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
    // InternalBPMN_translator.g:4043:1: rule__Mqtt_data__Group_1_1__2__Impl : ( ( rule__Mqtt_data__Broker_userAssignment_1_1_2 ) ) ;
    public final void rule__Mqtt_data__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4047:1: ( ( ( rule__Mqtt_data__Broker_userAssignment_1_1_2 ) ) )
            // InternalBPMN_translator.g:4048:1: ( ( rule__Mqtt_data__Broker_userAssignment_1_1_2 ) )
            {
            // InternalBPMN_translator.g:4048:1: ( ( rule__Mqtt_data__Broker_userAssignment_1_1_2 ) )
            // InternalBPMN_translator.g:4049:2: ( rule__Mqtt_data__Broker_userAssignment_1_1_2 )
            {
             before(grammarAccess.getMqtt_dataAccess().getBroker_userAssignment_1_1_2()); 
            // InternalBPMN_translator.g:4050:2: ( rule__Mqtt_data__Broker_userAssignment_1_1_2 )
            // InternalBPMN_translator.g:4050:3: rule__Mqtt_data__Broker_userAssignment_1_1_2
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
    // InternalBPMN_translator.g:4059:1: rule__Mqtt_data__Group_1_2__0 : rule__Mqtt_data__Group_1_2__0__Impl rule__Mqtt_data__Group_1_2__1 ;
    public final void rule__Mqtt_data__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4063:1: ( rule__Mqtt_data__Group_1_2__0__Impl rule__Mqtt_data__Group_1_2__1 )
            // InternalBPMN_translator.g:4064:2: rule__Mqtt_data__Group_1_2__0__Impl rule__Mqtt_data__Group_1_2__1
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
    // InternalBPMN_translator.g:4071:1: rule__Mqtt_data__Group_1_2__0__Impl : ( 'BROKER_PASSWORD' ) ;
    public final void rule__Mqtt_data__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4075:1: ( ( 'BROKER_PASSWORD' ) )
            // InternalBPMN_translator.g:4076:1: ( 'BROKER_PASSWORD' )
            {
            // InternalBPMN_translator.g:4076:1: ( 'BROKER_PASSWORD' )
            // InternalBPMN_translator.g:4077:2: 'BROKER_PASSWORD'
            {
             before(grammarAccess.getMqtt_dataAccess().getBROKER_PASSWORDKeyword_1_2_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4086:1: rule__Mqtt_data__Group_1_2__1 : rule__Mqtt_data__Group_1_2__1__Impl rule__Mqtt_data__Group_1_2__2 ;
    public final void rule__Mqtt_data__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4090:1: ( rule__Mqtt_data__Group_1_2__1__Impl rule__Mqtt_data__Group_1_2__2 )
            // InternalBPMN_translator.g:4091:2: rule__Mqtt_data__Group_1_2__1__Impl rule__Mqtt_data__Group_1_2__2
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
    // InternalBPMN_translator.g:4098:1: rule__Mqtt_data__Group_1_2__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4102:1: ( ( '=' ) )
            // InternalBPMN_translator.g:4103:1: ( '=' )
            {
            // InternalBPMN_translator.g:4103:1: ( '=' )
            // InternalBPMN_translator.g:4104:2: '='
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
    // InternalBPMN_translator.g:4113:1: rule__Mqtt_data__Group_1_2__2 : rule__Mqtt_data__Group_1_2__2__Impl ;
    public final void rule__Mqtt_data__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4117:1: ( rule__Mqtt_data__Group_1_2__2__Impl )
            // InternalBPMN_translator.g:4118:2: rule__Mqtt_data__Group_1_2__2__Impl
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
    // InternalBPMN_translator.g:4124:1: rule__Mqtt_data__Group_1_2__2__Impl : ( ( rule__Mqtt_data__Broker_passwordAssignment_1_2_2 ) ) ;
    public final void rule__Mqtt_data__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4128:1: ( ( ( rule__Mqtt_data__Broker_passwordAssignment_1_2_2 ) ) )
            // InternalBPMN_translator.g:4129:1: ( ( rule__Mqtt_data__Broker_passwordAssignment_1_2_2 ) )
            {
            // InternalBPMN_translator.g:4129:1: ( ( rule__Mqtt_data__Broker_passwordAssignment_1_2_2 ) )
            // InternalBPMN_translator.g:4130:2: ( rule__Mqtt_data__Broker_passwordAssignment_1_2_2 )
            {
             before(grammarAccess.getMqtt_dataAccess().getBroker_passwordAssignment_1_2_2()); 
            // InternalBPMN_translator.g:4131:2: ( rule__Mqtt_data__Broker_passwordAssignment_1_2_2 )
            // InternalBPMN_translator.g:4131:3: rule__Mqtt_data__Broker_passwordAssignment_1_2_2
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
    // InternalBPMN_translator.g:4140:1: rule__Mqtt_data__Group_1_3__0 : rule__Mqtt_data__Group_1_3__0__Impl rule__Mqtt_data__Group_1_3__1 ;
    public final void rule__Mqtt_data__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4144:1: ( rule__Mqtt_data__Group_1_3__0__Impl rule__Mqtt_data__Group_1_3__1 )
            // InternalBPMN_translator.g:4145:2: rule__Mqtt_data__Group_1_3__0__Impl rule__Mqtt_data__Group_1_3__1
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
    // InternalBPMN_translator.g:4152:1: rule__Mqtt_data__Group_1_3__0__Impl : ( 'BROKER' ) ;
    public final void rule__Mqtt_data__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4156:1: ( ( 'BROKER' ) )
            // InternalBPMN_translator.g:4157:1: ( 'BROKER' )
            {
            // InternalBPMN_translator.g:4157:1: ( 'BROKER' )
            // InternalBPMN_translator.g:4158:2: 'BROKER'
            {
             before(grammarAccess.getMqtt_dataAccess().getBROKERKeyword_1_3_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4167:1: rule__Mqtt_data__Group_1_3__1 : rule__Mqtt_data__Group_1_3__1__Impl rule__Mqtt_data__Group_1_3__2 ;
    public final void rule__Mqtt_data__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4171:1: ( rule__Mqtt_data__Group_1_3__1__Impl rule__Mqtt_data__Group_1_3__2 )
            // InternalBPMN_translator.g:4172:2: rule__Mqtt_data__Group_1_3__1__Impl rule__Mqtt_data__Group_1_3__2
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
    // InternalBPMN_translator.g:4179:1: rule__Mqtt_data__Group_1_3__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4183:1: ( ( '=' ) )
            // InternalBPMN_translator.g:4184:1: ( '=' )
            {
            // InternalBPMN_translator.g:4184:1: ( '=' )
            // InternalBPMN_translator.g:4185:2: '='
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
    // InternalBPMN_translator.g:4194:1: rule__Mqtt_data__Group_1_3__2 : rule__Mqtt_data__Group_1_3__2__Impl ;
    public final void rule__Mqtt_data__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4198:1: ( rule__Mqtt_data__Group_1_3__2__Impl )
            // InternalBPMN_translator.g:4199:2: rule__Mqtt_data__Group_1_3__2__Impl
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
    // InternalBPMN_translator.g:4205:1: rule__Mqtt_data__Group_1_3__2__Impl : ( ( rule__Mqtt_data__BrokerAssignment_1_3_2 ) ) ;
    public final void rule__Mqtt_data__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4209:1: ( ( ( rule__Mqtt_data__BrokerAssignment_1_3_2 ) ) )
            // InternalBPMN_translator.g:4210:1: ( ( rule__Mqtt_data__BrokerAssignment_1_3_2 ) )
            {
            // InternalBPMN_translator.g:4210:1: ( ( rule__Mqtt_data__BrokerAssignment_1_3_2 ) )
            // InternalBPMN_translator.g:4211:2: ( rule__Mqtt_data__BrokerAssignment_1_3_2 )
            {
             before(grammarAccess.getMqtt_dataAccess().getBrokerAssignment_1_3_2()); 
            // InternalBPMN_translator.g:4212:2: ( rule__Mqtt_data__BrokerAssignment_1_3_2 )
            // InternalBPMN_translator.g:4212:3: rule__Mqtt_data__BrokerAssignment_1_3_2
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
    // InternalBPMN_translator.g:4221:1: rule__Mqtt_data__Group_1_4__0 : rule__Mqtt_data__Group_1_4__0__Impl rule__Mqtt_data__Group_1_4__1 ;
    public final void rule__Mqtt_data__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4225:1: ( rule__Mqtt_data__Group_1_4__0__Impl rule__Mqtt_data__Group_1_4__1 )
            // InternalBPMN_translator.g:4226:2: rule__Mqtt_data__Group_1_4__0__Impl rule__Mqtt_data__Group_1_4__1
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
    // InternalBPMN_translator.g:4233:1: rule__Mqtt_data__Group_1_4__0__Impl : ( 'NETWORK' ) ;
    public final void rule__Mqtt_data__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4237:1: ( ( 'NETWORK' ) )
            // InternalBPMN_translator.g:4238:1: ( 'NETWORK' )
            {
            // InternalBPMN_translator.g:4238:1: ( 'NETWORK' )
            // InternalBPMN_translator.g:4239:2: 'NETWORK'
            {
             before(grammarAccess.getMqtt_dataAccess().getNETWORKKeyword_1_4_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4248:1: rule__Mqtt_data__Group_1_4__1 : rule__Mqtt_data__Group_1_4__1__Impl rule__Mqtt_data__Group_1_4__2 ;
    public final void rule__Mqtt_data__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4252:1: ( rule__Mqtt_data__Group_1_4__1__Impl rule__Mqtt_data__Group_1_4__2 )
            // InternalBPMN_translator.g:4253:2: rule__Mqtt_data__Group_1_4__1__Impl rule__Mqtt_data__Group_1_4__2
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
    // InternalBPMN_translator.g:4260:1: rule__Mqtt_data__Group_1_4__1__Impl : ( '{' ) ;
    public final void rule__Mqtt_data__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4264:1: ( ( '{' ) )
            // InternalBPMN_translator.g:4265:1: ( '{' )
            {
            // InternalBPMN_translator.g:4265:1: ( '{' )
            // InternalBPMN_translator.g:4266:2: '{'
            {
             before(grammarAccess.getMqtt_dataAccess().getLeftCurlyBracketKeyword_1_4_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4275:1: rule__Mqtt_data__Group_1_4__2 : rule__Mqtt_data__Group_1_4__2__Impl rule__Mqtt_data__Group_1_4__3 ;
    public final void rule__Mqtt_data__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4279:1: ( rule__Mqtt_data__Group_1_4__2__Impl rule__Mqtt_data__Group_1_4__3 )
            // InternalBPMN_translator.g:4280:2: rule__Mqtt_data__Group_1_4__2__Impl rule__Mqtt_data__Group_1_4__3
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
    // InternalBPMN_translator.g:4287:1: rule__Mqtt_data__Group_1_4__2__Impl : ( ( rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 )* ) ;
    public final void rule__Mqtt_data__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4291:1: ( ( ( rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 )* ) )
            // InternalBPMN_translator.g:4292:1: ( ( rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 )* )
            {
            // InternalBPMN_translator.g:4292:1: ( ( rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 )* )
            // InternalBPMN_translator.g:4293:2: ( rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 )*
            {
             before(grammarAccess.getMqtt_dataAccess().getMqtt_network_dataAssignment_1_4_2()); 
            // InternalBPMN_translator.g:4294:2: ( rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==56) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalBPMN_translator.g:4294:3: rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2
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
    // InternalBPMN_translator.g:4302:1: rule__Mqtt_data__Group_1_4__3 : rule__Mqtt_data__Group_1_4__3__Impl ;
    public final void rule__Mqtt_data__Group_1_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4306:1: ( rule__Mqtt_data__Group_1_4__3__Impl )
            // InternalBPMN_translator.g:4307:2: rule__Mqtt_data__Group_1_4__3__Impl
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
    // InternalBPMN_translator.g:4313:1: rule__Mqtt_data__Group_1_4__3__Impl : ( '}' ) ;
    public final void rule__Mqtt_data__Group_1_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4317:1: ( ( '}' ) )
            // InternalBPMN_translator.g:4318:1: ( '}' )
            {
            // InternalBPMN_translator.g:4318:1: ( '}' )
            // InternalBPMN_translator.g:4319:2: '}'
            {
             before(grammarAccess.getMqtt_dataAccess().getRightCurlyBracketKeyword_1_4_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4329:1: rule__Mqtt_data__Group_1_5__0 : rule__Mqtt_data__Group_1_5__0__Impl rule__Mqtt_data__Group_1_5__1 ;
    public final void rule__Mqtt_data__Group_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4333:1: ( rule__Mqtt_data__Group_1_5__0__Impl rule__Mqtt_data__Group_1_5__1 )
            // InternalBPMN_translator.g:4334:2: rule__Mqtt_data__Group_1_5__0__Impl rule__Mqtt_data__Group_1_5__1
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
    // InternalBPMN_translator.g:4341:1: rule__Mqtt_data__Group_1_5__0__Impl : ( 'SUBTOPICS' ) ;
    public final void rule__Mqtt_data__Group_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4345:1: ( ( 'SUBTOPICS' ) )
            // InternalBPMN_translator.g:4346:1: ( 'SUBTOPICS' )
            {
            // InternalBPMN_translator.g:4346:1: ( 'SUBTOPICS' )
            // InternalBPMN_translator.g:4347:2: 'SUBTOPICS'
            {
             before(grammarAccess.getMqtt_dataAccess().getSUBTOPICSKeyword_1_5_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4356:1: rule__Mqtt_data__Group_1_5__1 : rule__Mqtt_data__Group_1_5__1__Impl rule__Mqtt_data__Group_1_5__2 ;
    public final void rule__Mqtt_data__Group_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4360:1: ( rule__Mqtt_data__Group_1_5__1__Impl rule__Mqtt_data__Group_1_5__2 )
            // InternalBPMN_translator.g:4361:2: rule__Mqtt_data__Group_1_5__1__Impl rule__Mqtt_data__Group_1_5__2
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
    // InternalBPMN_translator.g:4368:1: rule__Mqtt_data__Group_1_5__1__Impl : ( '{' ) ;
    public final void rule__Mqtt_data__Group_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4372:1: ( ( '{' ) )
            // InternalBPMN_translator.g:4373:1: ( '{' )
            {
            // InternalBPMN_translator.g:4373:1: ( '{' )
            // InternalBPMN_translator.g:4374:2: '{'
            {
             before(grammarAccess.getMqtt_dataAccess().getLeftCurlyBracketKeyword_1_5_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4383:1: rule__Mqtt_data__Group_1_5__2 : rule__Mqtt_data__Group_1_5__2__Impl rule__Mqtt_data__Group_1_5__3 ;
    public final void rule__Mqtt_data__Group_1_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4387:1: ( rule__Mqtt_data__Group_1_5__2__Impl rule__Mqtt_data__Group_1_5__3 )
            // InternalBPMN_translator.g:4388:2: rule__Mqtt_data__Group_1_5__2__Impl rule__Mqtt_data__Group_1_5__3
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
    // InternalBPMN_translator.g:4395:1: rule__Mqtt_data__Group_1_5__2__Impl : ( ( rule__Mqtt_data__Group_1_5_2__0 )* ) ;
    public final void rule__Mqtt_data__Group_1_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4399:1: ( ( ( rule__Mqtt_data__Group_1_5_2__0 )* ) )
            // InternalBPMN_translator.g:4400:1: ( ( rule__Mqtt_data__Group_1_5_2__0 )* )
            {
            // InternalBPMN_translator.g:4400:1: ( ( rule__Mqtt_data__Group_1_5_2__0 )* )
            // InternalBPMN_translator.g:4401:2: ( rule__Mqtt_data__Group_1_5_2__0 )*
            {
             before(grammarAccess.getMqtt_dataAccess().getGroup_1_5_2()); 
            // InternalBPMN_translator.g:4402:2: ( rule__Mqtt_data__Group_1_5_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==54) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalBPMN_translator.g:4402:3: rule__Mqtt_data__Group_1_5_2__0
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
    // InternalBPMN_translator.g:4410:1: rule__Mqtt_data__Group_1_5__3 : rule__Mqtt_data__Group_1_5__3__Impl ;
    public final void rule__Mqtt_data__Group_1_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4414:1: ( rule__Mqtt_data__Group_1_5__3__Impl )
            // InternalBPMN_translator.g:4415:2: rule__Mqtt_data__Group_1_5__3__Impl
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
    // InternalBPMN_translator.g:4421:1: rule__Mqtt_data__Group_1_5__3__Impl : ( '}' ) ;
    public final void rule__Mqtt_data__Group_1_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4425:1: ( ( '}' ) )
            // InternalBPMN_translator.g:4426:1: ( '}' )
            {
            // InternalBPMN_translator.g:4426:1: ( '}' )
            // InternalBPMN_translator.g:4427:2: '}'
            {
             before(grammarAccess.getMqtt_dataAccess().getRightCurlyBracketKeyword_1_5_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4437:1: rule__Mqtt_data__Group_1_5_2__0 : rule__Mqtt_data__Group_1_5_2__0__Impl rule__Mqtt_data__Group_1_5_2__1 ;
    public final void rule__Mqtt_data__Group_1_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4441:1: ( rule__Mqtt_data__Group_1_5_2__0__Impl rule__Mqtt_data__Group_1_5_2__1 )
            // InternalBPMN_translator.g:4442:2: rule__Mqtt_data__Group_1_5_2__0__Impl rule__Mqtt_data__Group_1_5_2__1
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
    // InternalBPMN_translator.g:4449:1: rule__Mqtt_data__Group_1_5_2__0__Impl : ( 'TOPIC_NAME' ) ;
    public final void rule__Mqtt_data__Group_1_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4453:1: ( ( 'TOPIC_NAME' ) )
            // InternalBPMN_translator.g:4454:1: ( 'TOPIC_NAME' )
            {
            // InternalBPMN_translator.g:4454:1: ( 'TOPIC_NAME' )
            // InternalBPMN_translator.g:4455:2: 'TOPIC_NAME'
            {
             before(grammarAccess.getMqtt_dataAccess().getTOPIC_NAMEKeyword_1_5_2_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4464:1: rule__Mqtt_data__Group_1_5_2__1 : rule__Mqtt_data__Group_1_5_2__1__Impl rule__Mqtt_data__Group_1_5_2__2 ;
    public final void rule__Mqtt_data__Group_1_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4468:1: ( rule__Mqtt_data__Group_1_5_2__1__Impl rule__Mqtt_data__Group_1_5_2__2 )
            // InternalBPMN_translator.g:4469:2: rule__Mqtt_data__Group_1_5_2__1__Impl rule__Mqtt_data__Group_1_5_2__2
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
    // InternalBPMN_translator.g:4476:1: rule__Mqtt_data__Group_1_5_2__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4480:1: ( ( '=' ) )
            // InternalBPMN_translator.g:4481:1: ( '=' )
            {
            // InternalBPMN_translator.g:4481:1: ( '=' )
            // InternalBPMN_translator.g:4482:2: '='
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
    // InternalBPMN_translator.g:4491:1: rule__Mqtt_data__Group_1_5_2__2 : rule__Mqtt_data__Group_1_5_2__2__Impl ;
    public final void rule__Mqtt_data__Group_1_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4495:1: ( rule__Mqtt_data__Group_1_5_2__2__Impl )
            // InternalBPMN_translator.g:4496:2: rule__Mqtt_data__Group_1_5_2__2__Impl
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
    // InternalBPMN_translator.g:4502:1: rule__Mqtt_data__Group_1_5_2__2__Impl : ( ( rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 ) ) ;
    public final void rule__Mqtt_data__Group_1_5_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4506:1: ( ( ( rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 ) ) )
            // InternalBPMN_translator.g:4507:1: ( ( rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 ) )
            {
            // InternalBPMN_translator.g:4507:1: ( ( rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 ) )
            // InternalBPMN_translator.g:4508:2: ( rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 )
            {
             before(grammarAccess.getMqtt_dataAccess().getSubtopicsAssignment_1_5_2_2()); 
            // InternalBPMN_translator.g:4509:2: ( rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 )
            // InternalBPMN_translator.g:4509:3: rule__Mqtt_data__SubtopicsAssignment_1_5_2_2
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
    // InternalBPMN_translator.g:4518:1: rule__Mqtt_data__Group_1_6__0 : rule__Mqtt_data__Group_1_6__0__Impl rule__Mqtt_data__Group_1_6__1 ;
    public final void rule__Mqtt_data__Group_1_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4522:1: ( rule__Mqtt_data__Group_1_6__0__Impl rule__Mqtt_data__Group_1_6__1 )
            // InternalBPMN_translator.g:4523:2: rule__Mqtt_data__Group_1_6__0__Impl rule__Mqtt_data__Group_1_6__1
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
    // InternalBPMN_translator.g:4530:1: rule__Mqtt_data__Group_1_6__0__Impl : ( 'PUBTOPICS' ) ;
    public final void rule__Mqtt_data__Group_1_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4534:1: ( ( 'PUBTOPICS' ) )
            // InternalBPMN_translator.g:4535:1: ( 'PUBTOPICS' )
            {
            // InternalBPMN_translator.g:4535:1: ( 'PUBTOPICS' )
            // InternalBPMN_translator.g:4536:2: 'PUBTOPICS'
            {
             before(grammarAccess.getMqtt_dataAccess().getPUBTOPICSKeyword_1_6_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4545:1: rule__Mqtt_data__Group_1_6__1 : rule__Mqtt_data__Group_1_6__1__Impl rule__Mqtt_data__Group_1_6__2 ;
    public final void rule__Mqtt_data__Group_1_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4549:1: ( rule__Mqtt_data__Group_1_6__1__Impl rule__Mqtt_data__Group_1_6__2 )
            // InternalBPMN_translator.g:4550:2: rule__Mqtt_data__Group_1_6__1__Impl rule__Mqtt_data__Group_1_6__2
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
    // InternalBPMN_translator.g:4557:1: rule__Mqtt_data__Group_1_6__1__Impl : ( '{' ) ;
    public final void rule__Mqtt_data__Group_1_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4561:1: ( ( '{' ) )
            // InternalBPMN_translator.g:4562:1: ( '{' )
            {
            // InternalBPMN_translator.g:4562:1: ( '{' )
            // InternalBPMN_translator.g:4563:2: '{'
            {
             before(grammarAccess.getMqtt_dataAccess().getLeftCurlyBracketKeyword_1_6_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4572:1: rule__Mqtt_data__Group_1_6__2 : rule__Mqtt_data__Group_1_6__2__Impl rule__Mqtt_data__Group_1_6__3 ;
    public final void rule__Mqtt_data__Group_1_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4576:1: ( rule__Mqtt_data__Group_1_6__2__Impl rule__Mqtt_data__Group_1_6__3 )
            // InternalBPMN_translator.g:4577:2: rule__Mqtt_data__Group_1_6__2__Impl rule__Mqtt_data__Group_1_6__3
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
    // InternalBPMN_translator.g:4584:1: rule__Mqtt_data__Group_1_6__2__Impl : ( ( rule__Mqtt_data__Alternatives_1_6_2 )* ) ;
    public final void rule__Mqtt_data__Group_1_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4588:1: ( ( ( rule__Mqtt_data__Alternatives_1_6_2 )* ) )
            // InternalBPMN_translator.g:4589:1: ( ( rule__Mqtt_data__Alternatives_1_6_2 )* )
            {
            // InternalBPMN_translator.g:4589:1: ( ( rule__Mqtt_data__Alternatives_1_6_2 )* )
            // InternalBPMN_translator.g:4590:2: ( rule__Mqtt_data__Alternatives_1_6_2 )*
            {
             before(grammarAccess.getMqtt_dataAccess().getAlternatives_1_6_2()); 
            // InternalBPMN_translator.g:4591:2: ( rule__Mqtt_data__Alternatives_1_6_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==48||LA31_0==54) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalBPMN_translator.g:4591:3: rule__Mqtt_data__Alternatives_1_6_2
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
    // InternalBPMN_translator.g:4599:1: rule__Mqtt_data__Group_1_6__3 : rule__Mqtt_data__Group_1_6__3__Impl ;
    public final void rule__Mqtt_data__Group_1_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4603:1: ( rule__Mqtt_data__Group_1_6__3__Impl )
            // InternalBPMN_translator.g:4604:2: rule__Mqtt_data__Group_1_6__3__Impl
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
    // InternalBPMN_translator.g:4610:1: rule__Mqtt_data__Group_1_6__3__Impl : ( '}' ) ;
    public final void rule__Mqtt_data__Group_1_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4614:1: ( ( '}' ) )
            // InternalBPMN_translator.g:4615:1: ( '}' )
            {
            // InternalBPMN_translator.g:4615:1: ( '}' )
            // InternalBPMN_translator.g:4616:2: '}'
            {
             before(grammarAccess.getMqtt_dataAccess().getRightCurlyBracketKeyword_1_6_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4626:1: rule__Mqtt_data__Group_1_6_2_0__0 : rule__Mqtt_data__Group_1_6_2_0__0__Impl rule__Mqtt_data__Group_1_6_2_0__1 ;
    public final void rule__Mqtt_data__Group_1_6_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4630:1: ( rule__Mqtt_data__Group_1_6_2_0__0__Impl rule__Mqtt_data__Group_1_6_2_0__1 )
            // InternalBPMN_translator.g:4631:2: rule__Mqtt_data__Group_1_6_2_0__0__Impl rule__Mqtt_data__Group_1_6_2_0__1
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
    // InternalBPMN_translator.g:4638:1: rule__Mqtt_data__Group_1_6_2_0__0__Impl : ( 'TOPIC_NAME' ) ;
    public final void rule__Mqtt_data__Group_1_6_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4642:1: ( ( 'TOPIC_NAME' ) )
            // InternalBPMN_translator.g:4643:1: ( 'TOPIC_NAME' )
            {
            // InternalBPMN_translator.g:4643:1: ( 'TOPIC_NAME' )
            // InternalBPMN_translator.g:4644:2: 'TOPIC_NAME'
            {
             before(grammarAccess.getMqtt_dataAccess().getTOPIC_NAMEKeyword_1_6_2_0_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4653:1: rule__Mqtt_data__Group_1_6_2_0__1 : rule__Mqtt_data__Group_1_6_2_0__1__Impl rule__Mqtt_data__Group_1_6_2_0__2 ;
    public final void rule__Mqtt_data__Group_1_6_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4657:1: ( rule__Mqtt_data__Group_1_6_2_0__1__Impl rule__Mqtt_data__Group_1_6_2_0__2 )
            // InternalBPMN_translator.g:4658:2: rule__Mqtt_data__Group_1_6_2_0__1__Impl rule__Mqtt_data__Group_1_6_2_0__2
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
    // InternalBPMN_translator.g:4665:1: rule__Mqtt_data__Group_1_6_2_0__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_6_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4669:1: ( ( '=' ) )
            // InternalBPMN_translator.g:4670:1: ( '=' )
            {
            // InternalBPMN_translator.g:4670:1: ( '=' )
            // InternalBPMN_translator.g:4671:2: '='
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
    // InternalBPMN_translator.g:4680:1: rule__Mqtt_data__Group_1_6_2_0__2 : rule__Mqtt_data__Group_1_6_2_0__2__Impl ;
    public final void rule__Mqtt_data__Group_1_6_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4684:1: ( rule__Mqtt_data__Group_1_6_2_0__2__Impl )
            // InternalBPMN_translator.g:4685:2: rule__Mqtt_data__Group_1_6_2_0__2__Impl
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
    // InternalBPMN_translator.g:4691:1: rule__Mqtt_data__Group_1_6_2_0__2__Impl : ( ( rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 )* ) ;
    public final void rule__Mqtt_data__Group_1_6_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4695:1: ( ( ( rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 )* ) )
            // InternalBPMN_translator.g:4696:1: ( ( rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 )* )
            {
            // InternalBPMN_translator.g:4696:1: ( ( rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 )* )
            // InternalBPMN_translator.g:4697:2: ( rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 )*
            {
             before(grammarAccess.getMqtt_dataAccess().getPubtopicsAssignment_1_6_2_0_2()); 
            // InternalBPMN_translator.g:4698:2: ( rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_STRING) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalBPMN_translator.g:4698:3: rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2
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
    // InternalBPMN_translator.g:4707:1: rule__Mqtt_data__Group_1_6_2_1__0 : rule__Mqtt_data__Group_1_6_2_1__0__Impl rule__Mqtt_data__Group_1_6_2_1__1 ;
    public final void rule__Mqtt_data__Group_1_6_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4711:1: ( rule__Mqtt_data__Group_1_6_2_1__0__Impl rule__Mqtt_data__Group_1_6_2_1__1 )
            // InternalBPMN_translator.g:4712:2: rule__Mqtt_data__Group_1_6_2_1__0__Impl rule__Mqtt_data__Group_1_6_2_1__1
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
    // InternalBPMN_translator.g:4719:1: rule__Mqtt_data__Group_1_6_2_1__0__Impl : ( 'DATA' ) ;
    public final void rule__Mqtt_data__Group_1_6_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4723:1: ( ( 'DATA' ) )
            // InternalBPMN_translator.g:4724:1: ( 'DATA' )
            {
            // InternalBPMN_translator.g:4724:1: ( 'DATA' )
            // InternalBPMN_translator.g:4725:2: 'DATA'
            {
             before(grammarAccess.getMqtt_dataAccess().getDATAKeyword_1_6_2_1_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4734:1: rule__Mqtt_data__Group_1_6_2_1__1 : rule__Mqtt_data__Group_1_6_2_1__1__Impl rule__Mqtt_data__Group_1_6_2_1__2 ;
    public final void rule__Mqtt_data__Group_1_6_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4738:1: ( rule__Mqtt_data__Group_1_6_2_1__1__Impl rule__Mqtt_data__Group_1_6_2_1__2 )
            // InternalBPMN_translator.g:4739:2: rule__Mqtt_data__Group_1_6_2_1__1__Impl rule__Mqtt_data__Group_1_6_2_1__2
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
    // InternalBPMN_translator.g:4746:1: rule__Mqtt_data__Group_1_6_2_1__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_6_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4750:1: ( ( '=' ) )
            // InternalBPMN_translator.g:4751:1: ( '=' )
            {
            // InternalBPMN_translator.g:4751:1: ( '=' )
            // InternalBPMN_translator.g:4752:2: '='
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
    // InternalBPMN_translator.g:4761:1: rule__Mqtt_data__Group_1_6_2_1__2 : rule__Mqtt_data__Group_1_6_2_1__2__Impl ;
    public final void rule__Mqtt_data__Group_1_6_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4765:1: ( rule__Mqtt_data__Group_1_6_2_1__2__Impl )
            // InternalBPMN_translator.g:4766:2: rule__Mqtt_data__Group_1_6_2_1__2__Impl
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
    // InternalBPMN_translator.g:4772:1: rule__Mqtt_data__Group_1_6_2_1__2__Impl : ( ( rule__Mqtt_data__ValueAssignment_1_6_2_1_2 ) ) ;
    public final void rule__Mqtt_data__Group_1_6_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4776:1: ( ( ( rule__Mqtt_data__ValueAssignment_1_6_2_1_2 ) ) )
            // InternalBPMN_translator.g:4777:1: ( ( rule__Mqtt_data__ValueAssignment_1_6_2_1_2 ) )
            {
            // InternalBPMN_translator.g:4777:1: ( ( rule__Mqtt_data__ValueAssignment_1_6_2_1_2 ) )
            // InternalBPMN_translator.g:4778:2: ( rule__Mqtt_data__ValueAssignment_1_6_2_1_2 )
            {
             before(grammarAccess.getMqtt_dataAccess().getValueAssignment_1_6_2_1_2()); 
            // InternalBPMN_translator.g:4779:2: ( rule__Mqtt_data__ValueAssignment_1_6_2_1_2 )
            // InternalBPMN_translator.g:4779:3: rule__Mqtt_data__ValueAssignment_1_6_2_1_2
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
    // InternalBPMN_translator.g:4788:1: rule__Mqtt_network_data__Group__0 : rule__Mqtt_network_data__Group__0__Impl rule__Mqtt_network_data__Group__1 ;
    public final void rule__Mqtt_network_data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4792:1: ( rule__Mqtt_network_data__Group__0__Impl rule__Mqtt_network_data__Group__1 )
            // InternalBPMN_translator.g:4793:2: rule__Mqtt_network_data__Group__0__Impl rule__Mqtt_network_data__Group__1
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
    // InternalBPMN_translator.g:4800:1: rule__Mqtt_network_data__Group__0__Impl : ( 'SSID' ) ;
    public final void rule__Mqtt_network_data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4804:1: ( ( 'SSID' ) )
            // InternalBPMN_translator.g:4805:1: ( 'SSID' )
            {
            // InternalBPMN_translator.g:4805:1: ( 'SSID' )
            // InternalBPMN_translator.g:4806:2: 'SSID'
            {
             before(grammarAccess.getMqtt_network_dataAccess().getSSIDKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4815:1: rule__Mqtt_network_data__Group__1 : rule__Mqtt_network_data__Group__1__Impl rule__Mqtt_network_data__Group__2 ;
    public final void rule__Mqtt_network_data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4819:1: ( rule__Mqtt_network_data__Group__1__Impl rule__Mqtt_network_data__Group__2 )
            // InternalBPMN_translator.g:4820:2: rule__Mqtt_network_data__Group__1__Impl rule__Mqtt_network_data__Group__2
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
    // InternalBPMN_translator.g:4827:1: rule__Mqtt_network_data__Group__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_network_data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4831:1: ( ( '=' ) )
            // InternalBPMN_translator.g:4832:1: ( '=' )
            {
            // InternalBPMN_translator.g:4832:1: ( '=' )
            // InternalBPMN_translator.g:4833:2: '='
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
    // InternalBPMN_translator.g:4842:1: rule__Mqtt_network_data__Group__2 : rule__Mqtt_network_data__Group__2__Impl rule__Mqtt_network_data__Group__3 ;
    public final void rule__Mqtt_network_data__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4846:1: ( rule__Mqtt_network_data__Group__2__Impl rule__Mqtt_network_data__Group__3 )
            // InternalBPMN_translator.g:4847:2: rule__Mqtt_network_data__Group__2__Impl rule__Mqtt_network_data__Group__3
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
    // InternalBPMN_translator.g:4854:1: rule__Mqtt_network_data__Group__2__Impl : ( ( rule__Mqtt_network_data__SsidAssignment_2 ) ) ;
    public final void rule__Mqtt_network_data__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4858:1: ( ( ( rule__Mqtt_network_data__SsidAssignment_2 ) ) )
            // InternalBPMN_translator.g:4859:1: ( ( rule__Mqtt_network_data__SsidAssignment_2 ) )
            {
            // InternalBPMN_translator.g:4859:1: ( ( rule__Mqtt_network_data__SsidAssignment_2 ) )
            // InternalBPMN_translator.g:4860:2: ( rule__Mqtt_network_data__SsidAssignment_2 )
            {
             before(grammarAccess.getMqtt_network_dataAccess().getSsidAssignment_2()); 
            // InternalBPMN_translator.g:4861:2: ( rule__Mqtt_network_data__SsidAssignment_2 )
            // InternalBPMN_translator.g:4861:3: rule__Mqtt_network_data__SsidAssignment_2
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
    // InternalBPMN_translator.g:4869:1: rule__Mqtt_network_data__Group__3 : rule__Mqtt_network_data__Group__3__Impl rule__Mqtt_network_data__Group__4 ;
    public final void rule__Mqtt_network_data__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4873:1: ( rule__Mqtt_network_data__Group__3__Impl rule__Mqtt_network_data__Group__4 )
            // InternalBPMN_translator.g:4874:2: rule__Mqtt_network_data__Group__3__Impl rule__Mqtt_network_data__Group__4
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
    // InternalBPMN_translator.g:4881:1: rule__Mqtt_network_data__Group__3__Impl : ( 'PASSWORD' ) ;
    public final void rule__Mqtt_network_data__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4885:1: ( ( 'PASSWORD' ) )
            // InternalBPMN_translator.g:4886:1: ( 'PASSWORD' )
            {
            // InternalBPMN_translator.g:4886:1: ( 'PASSWORD' )
            // InternalBPMN_translator.g:4887:2: 'PASSWORD'
            {
             before(grammarAccess.getMqtt_network_dataAccess().getPASSWORDKeyword_3()); 
            match(input,57,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4896:1: rule__Mqtt_network_data__Group__4 : rule__Mqtt_network_data__Group__4__Impl rule__Mqtt_network_data__Group__5 ;
    public final void rule__Mqtt_network_data__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4900:1: ( rule__Mqtt_network_data__Group__4__Impl rule__Mqtt_network_data__Group__5 )
            // InternalBPMN_translator.g:4901:2: rule__Mqtt_network_data__Group__4__Impl rule__Mqtt_network_data__Group__5
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
    // InternalBPMN_translator.g:4908:1: rule__Mqtt_network_data__Group__4__Impl : ( '=' ) ;
    public final void rule__Mqtt_network_data__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4912:1: ( ( '=' ) )
            // InternalBPMN_translator.g:4913:1: ( '=' )
            {
            // InternalBPMN_translator.g:4913:1: ( '=' )
            // InternalBPMN_translator.g:4914:2: '='
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
    // InternalBPMN_translator.g:4923:1: rule__Mqtt_network_data__Group__5 : rule__Mqtt_network_data__Group__5__Impl ;
    public final void rule__Mqtt_network_data__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4927:1: ( rule__Mqtt_network_data__Group__5__Impl )
            // InternalBPMN_translator.g:4928:2: rule__Mqtt_network_data__Group__5__Impl
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
    // InternalBPMN_translator.g:4934:1: rule__Mqtt_network_data__Group__5__Impl : ( ( rule__Mqtt_network_data__PasswordAssignment_5 ) ) ;
    public final void rule__Mqtt_network_data__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4938:1: ( ( ( rule__Mqtt_network_data__PasswordAssignment_5 ) ) )
            // InternalBPMN_translator.g:4939:1: ( ( rule__Mqtt_network_data__PasswordAssignment_5 ) )
            {
            // InternalBPMN_translator.g:4939:1: ( ( rule__Mqtt_network_data__PasswordAssignment_5 ) )
            // InternalBPMN_translator.g:4940:2: ( rule__Mqtt_network_data__PasswordAssignment_5 )
            {
             before(grammarAccess.getMqtt_network_dataAccess().getPasswordAssignment_5()); 
            // InternalBPMN_translator.g:4941:2: ( rule__Mqtt_network_data__PasswordAssignment_5 )
            // InternalBPMN_translator.g:4941:3: rule__Mqtt_network_data__PasswordAssignment_5
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


    // $ANTLR start "rule__Mqtt_device__Group__0"
    // InternalBPMN_translator.g:4950:1: rule__Mqtt_device__Group__0 : rule__Mqtt_device__Group__0__Impl rule__Mqtt_device__Group__1 ;
    public final void rule__Mqtt_device__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4954:1: ( rule__Mqtt_device__Group__0__Impl rule__Mqtt_device__Group__1 )
            // InternalBPMN_translator.g:4955:2: rule__Mqtt_device__Group__0__Impl rule__Mqtt_device__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Mqtt_device__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_device__Group__1();

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
    // $ANTLR end "rule__Mqtt_device__Group__0"


    // $ANTLR start "rule__Mqtt_device__Group__0__Impl"
    // InternalBPMN_translator.g:4962:1: rule__Mqtt_device__Group__0__Impl : ( 'PROTOCOL_DEVICE' ) ;
    public final void rule__Mqtt_device__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4966:1: ( ( 'PROTOCOL_DEVICE' ) )
            // InternalBPMN_translator.g:4967:1: ( 'PROTOCOL_DEVICE' )
            {
            // InternalBPMN_translator.g:4967:1: ( 'PROTOCOL_DEVICE' )
            // InternalBPMN_translator.g:4968:2: 'PROTOCOL_DEVICE'
            {
             before(grammarAccess.getMqtt_deviceAccess().getPROTOCOL_DEVICEKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getMqtt_deviceAccess().getPROTOCOL_DEVICEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mqtt_device__Group__0__Impl"


    // $ANTLR start "rule__Mqtt_device__Group__1"
    // InternalBPMN_translator.g:4977:1: rule__Mqtt_device__Group__1 : rule__Mqtt_device__Group__1__Impl rule__Mqtt_device__Group__2 ;
    public final void rule__Mqtt_device__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4981:1: ( rule__Mqtt_device__Group__1__Impl rule__Mqtt_device__Group__2 )
            // InternalBPMN_translator.g:4982:2: rule__Mqtt_device__Group__1__Impl rule__Mqtt_device__Group__2
            {
            pushFollow(FOLLOW_50);
            rule__Mqtt_device__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_device__Group__2();

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
    // $ANTLR end "rule__Mqtt_device__Group__1"


    // $ANTLR start "rule__Mqtt_device__Group__1__Impl"
    // InternalBPMN_translator.g:4989:1: rule__Mqtt_device__Group__1__Impl : ( '{' ) ;
    public final void rule__Mqtt_device__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4993:1: ( ( '{' ) )
            // InternalBPMN_translator.g:4994:1: ( '{' )
            {
            // InternalBPMN_translator.g:4994:1: ( '{' )
            // InternalBPMN_translator.g:4995:2: '{'
            {
             before(grammarAccess.getMqtt_deviceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMqtt_deviceAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mqtt_device__Group__1__Impl"


    // $ANTLR start "rule__Mqtt_device__Group__2"
    // InternalBPMN_translator.g:5004:1: rule__Mqtt_device__Group__2 : rule__Mqtt_device__Group__2__Impl rule__Mqtt_device__Group__3 ;
    public final void rule__Mqtt_device__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5008:1: ( rule__Mqtt_device__Group__2__Impl rule__Mqtt_device__Group__3 )
            // InternalBPMN_translator.g:5009:2: rule__Mqtt_device__Group__2__Impl rule__Mqtt_device__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Mqtt_device__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_device__Group__3();

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
    // $ANTLR end "rule__Mqtt_device__Group__2"


    // $ANTLR start "rule__Mqtt_device__Group__2__Impl"
    // InternalBPMN_translator.g:5016:1: rule__Mqtt_device__Group__2__Impl : ( 'NAME' ) ;
    public final void rule__Mqtt_device__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5020:1: ( ( 'NAME' ) )
            // InternalBPMN_translator.g:5021:1: ( 'NAME' )
            {
            // InternalBPMN_translator.g:5021:1: ( 'NAME' )
            // InternalBPMN_translator.g:5022:2: 'NAME'
            {
             before(grammarAccess.getMqtt_deviceAccess().getNAMEKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMqtt_deviceAccess().getNAMEKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mqtt_device__Group__2__Impl"


    // $ANTLR start "rule__Mqtt_device__Group__3"
    // InternalBPMN_translator.g:5031:1: rule__Mqtt_device__Group__3 : rule__Mqtt_device__Group__3__Impl rule__Mqtt_device__Group__4 ;
    public final void rule__Mqtt_device__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5035:1: ( rule__Mqtt_device__Group__3__Impl rule__Mqtt_device__Group__4 )
            // InternalBPMN_translator.g:5036:2: rule__Mqtt_device__Group__3__Impl rule__Mqtt_device__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Mqtt_device__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_device__Group__4();

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
    // $ANTLR end "rule__Mqtt_device__Group__3"


    // $ANTLR start "rule__Mqtt_device__Group__3__Impl"
    // InternalBPMN_translator.g:5043:1: rule__Mqtt_device__Group__3__Impl : ( '=' ) ;
    public final void rule__Mqtt_device__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5047:1: ( ( '=' ) )
            // InternalBPMN_translator.g:5048:1: ( '=' )
            {
            // InternalBPMN_translator.g:5048:1: ( '=' )
            // InternalBPMN_translator.g:5049:2: '='
            {
             before(grammarAccess.getMqtt_deviceAccess().getEqualsSignKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMqtt_deviceAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mqtt_device__Group__3__Impl"


    // $ANTLR start "rule__Mqtt_device__Group__4"
    // InternalBPMN_translator.g:5058:1: rule__Mqtt_device__Group__4 : rule__Mqtt_device__Group__4__Impl rule__Mqtt_device__Group__5 ;
    public final void rule__Mqtt_device__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5062:1: ( rule__Mqtt_device__Group__4__Impl rule__Mqtt_device__Group__5 )
            // InternalBPMN_translator.g:5063:2: rule__Mqtt_device__Group__4__Impl rule__Mqtt_device__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Mqtt_device__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mqtt_device__Group__5();

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
    // $ANTLR end "rule__Mqtt_device__Group__4"


    // $ANTLR start "rule__Mqtt_device__Group__4__Impl"
    // InternalBPMN_translator.g:5070:1: rule__Mqtt_device__Group__4__Impl : ( ( rule__Mqtt_device__DnameAssignment_4 ) ) ;
    public final void rule__Mqtt_device__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5074:1: ( ( ( rule__Mqtt_device__DnameAssignment_4 ) ) )
            // InternalBPMN_translator.g:5075:1: ( ( rule__Mqtt_device__DnameAssignment_4 ) )
            {
            // InternalBPMN_translator.g:5075:1: ( ( rule__Mqtt_device__DnameAssignment_4 ) )
            // InternalBPMN_translator.g:5076:2: ( rule__Mqtt_device__DnameAssignment_4 )
            {
             before(grammarAccess.getMqtt_deviceAccess().getDnameAssignment_4()); 
            // InternalBPMN_translator.g:5077:2: ( rule__Mqtt_device__DnameAssignment_4 )
            // InternalBPMN_translator.g:5077:3: rule__Mqtt_device__DnameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Mqtt_device__DnameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMqtt_deviceAccess().getDnameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mqtt_device__Group__4__Impl"


    // $ANTLR start "rule__Mqtt_device__Group__5"
    // InternalBPMN_translator.g:5085:1: rule__Mqtt_device__Group__5 : rule__Mqtt_device__Group__5__Impl ;
    public final void rule__Mqtt_device__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5089:1: ( rule__Mqtt_device__Group__5__Impl )
            // InternalBPMN_translator.g:5090:2: rule__Mqtt_device__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mqtt_device__Group__5__Impl();

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
    // $ANTLR end "rule__Mqtt_device__Group__5"


    // $ANTLR start "rule__Mqtt_device__Group__5__Impl"
    // InternalBPMN_translator.g:5096:1: rule__Mqtt_device__Group__5__Impl : ( '}' ) ;
    public final void rule__Mqtt_device__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5100:1: ( ( '}' ) )
            // InternalBPMN_translator.g:5101:1: ( '}' )
            {
            // InternalBPMN_translator.g:5101:1: ( '}' )
            // InternalBPMN_translator.g:5102:2: '}'
            {
             before(grammarAccess.getMqtt_deviceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMqtt_deviceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mqtt_device__Group__5__Impl"


    // $ANTLR start "rule__Sensor__Group_0__0"
    // InternalBPMN_translator.g:5112:1: rule__Sensor__Group_0__0 : rule__Sensor__Group_0__0__Impl rule__Sensor__Group_0__1 ;
    public final void rule__Sensor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5116:1: ( rule__Sensor__Group_0__0__Impl rule__Sensor__Group_0__1 )
            // InternalBPMN_translator.g:5117:2: rule__Sensor__Group_0__0__Impl rule__Sensor__Group_0__1
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
    // InternalBPMN_translator.g:5124:1: rule__Sensor__Group_0__0__Impl : ( ( rule__Sensor__SnameAssignment_0_0 ) ) ;
    public final void rule__Sensor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5128:1: ( ( ( rule__Sensor__SnameAssignment_0_0 ) ) )
            // InternalBPMN_translator.g:5129:1: ( ( rule__Sensor__SnameAssignment_0_0 ) )
            {
            // InternalBPMN_translator.g:5129:1: ( ( rule__Sensor__SnameAssignment_0_0 ) )
            // InternalBPMN_translator.g:5130:2: ( rule__Sensor__SnameAssignment_0_0 )
            {
             before(grammarAccess.getSensorAccess().getSnameAssignment_0_0()); 
            // InternalBPMN_translator.g:5131:2: ( rule__Sensor__SnameAssignment_0_0 )
            // InternalBPMN_translator.g:5131:3: rule__Sensor__SnameAssignment_0_0
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
    // InternalBPMN_translator.g:5139:1: rule__Sensor__Group_0__1 : rule__Sensor__Group_0__1__Impl rule__Sensor__Group_0__2 ;
    public final void rule__Sensor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5143:1: ( rule__Sensor__Group_0__1__Impl rule__Sensor__Group_0__2 )
            // InternalBPMN_translator.g:5144:2: rule__Sensor__Group_0__1__Impl rule__Sensor__Group_0__2
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
    // InternalBPMN_translator.g:5151:1: rule__Sensor__Group_0__1__Impl : ( '{' ) ;
    public final void rule__Sensor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5155:1: ( ( '{' ) )
            // InternalBPMN_translator.g:5156:1: ( '{' )
            {
            // InternalBPMN_translator.g:5156:1: ( '{' )
            // InternalBPMN_translator.g:5157:2: '{'
            {
             before(grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_0_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBPMN_translator.g:5166:1: rule__Sensor__Group_0__2 : rule__Sensor__Group_0__2__Impl rule__Sensor__Group_0__3 ;
    public final void rule__Sensor__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5170:1: ( rule__Sensor__Group_0__2__Impl rule__Sensor__Group_0__3 )
            // InternalBPMN_translator.g:5171:2: rule__Sensor__Group_0__2__Impl rule__Sensor__Group_0__3
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
    // InternalBPMN_translator.g:5178:1: rule__Sensor__Group_0__2__Impl : ( ( rule__Sensor__SensorAssignment_0_2 ) ) ;
    public final void rule__Sensor__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5182:1: ( ( ( rule__Sensor__SensorAssignment_0_2 ) ) )
            // InternalBPMN_translator.g:5183:1: ( ( rule__Sensor__SensorAssignment_0_2 ) )
            {
            // InternalBPMN_translator.g:5183:1: ( ( rule__Sensor__SensorAssignment_0_2 ) )
            // InternalBPMN_translator.g:5184:2: ( rule__Sensor__SensorAssignment_0_2 )
            {
             before(grammarAccess.getSensorAccess().getSensorAssignment_0_2()); 
            // InternalBPMN_translator.g:5185:2: ( rule__Sensor__SensorAssignment_0_2 )
            // InternalBPMN_translator.g:5185:3: rule__Sensor__SensorAssignment_0_2
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
    // InternalBPMN_translator.g:5193:1: rule__Sensor__Group_0__3 : rule__Sensor__Group_0__3__Impl ;
    public final void rule__Sensor__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5197:1: ( rule__Sensor__Group_0__3__Impl )
            // InternalBPMN_translator.g:5198:2: rule__Sensor__Group_0__3__Impl
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
    // InternalBPMN_translator.g:5204:1: rule__Sensor__Group_0__3__Impl : ( '}' ) ;
    public final void rule__Sensor__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5208:1: ( ( '}' ) )
            // InternalBPMN_translator.g:5209:1: ( '}' )
            {
            // InternalBPMN_translator.g:5209:1: ( '}' )
            // InternalBPMN_translator.g:5210:2: '}'
            {
             before(grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_0_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBPMN_translator.g:5220:1: rule__Sensor__Group_1__0 : rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1 ;
    public final void rule__Sensor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5224:1: ( rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1 )
            // InternalBPMN_translator.g:5225:2: rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1
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
    // InternalBPMN_translator.g:5232:1: rule__Sensor__Group_1__0__Impl : ( ( rule__Sensor__SnameAssignment_1_0 ) ) ;
    public final void rule__Sensor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5236:1: ( ( ( rule__Sensor__SnameAssignment_1_0 ) ) )
            // InternalBPMN_translator.g:5237:1: ( ( rule__Sensor__SnameAssignment_1_0 ) )
            {
            // InternalBPMN_translator.g:5237:1: ( ( rule__Sensor__SnameAssignment_1_0 ) )
            // InternalBPMN_translator.g:5238:2: ( rule__Sensor__SnameAssignment_1_0 )
            {
             before(grammarAccess.getSensorAccess().getSnameAssignment_1_0()); 
            // InternalBPMN_translator.g:5239:2: ( rule__Sensor__SnameAssignment_1_0 )
            // InternalBPMN_translator.g:5239:3: rule__Sensor__SnameAssignment_1_0
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
    // InternalBPMN_translator.g:5247:1: rule__Sensor__Group_1__1 : rule__Sensor__Group_1__1__Impl rule__Sensor__Group_1__2 ;
    public final void rule__Sensor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5251:1: ( rule__Sensor__Group_1__1__Impl rule__Sensor__Group_1__2 )
            // InternalBPMN_translator.g:5252:2: rule__Sensor__Group_1__1__Impl rule__Sensor__Group_1__2
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
    // InternalBPMN_translator.g:5259:1: rule__Sensor__Group_1__1__Impl : ( '{' ) ;
    public final void rule__Sensor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5263:1: ( ( '{' ) )
            // InternalBPMN_translator.g:5264:1: ( '{' )
            {
            // InternalBPMN_translator.g:5264:1: ( '{' )
            // InternalBPMN_translator.g:5265:2: '{'
            {
             before(grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_1_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBPMN_translator.g:5274:1: rule__Sensor__Group_1__2 : rule__Sensor__Group_1__2__Impl rule__Sensor__Group_1__3 ;
    public final void rule__Sensor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5278:1: ( rule__Sensor__Group_1__2__Impl rule__Sensor__Group_1__3 )
            // InternalBPMN_translator.g:5279:2: rule__Sensor__Group_1__2__Impl rule__Sensor__Group_1__3
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
    // InternalBPMN_translator.g:5286:1: rule__Sensor__Group_1__2__Impl : ( ( rule__Sensor__SensorAssignment_1_2 ) ) ;
    public final void rule__Sensor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5290:1: ( ( ( rule__Sensor__SensorAssignment_1_2 ) ) )
            // InternalBPMN_translator.g:5291:1: ( ( rule__Sensor__SensorAssignment_1_2 ) )
            {
            // InternalBPMN_translator.g:5291:1: ( ( rule__Sensor__SensorAssignment_1_2 ) )
            // InternalBPMN_translator.g:5292:2: ( rule__Sensor__SensorAssignment_1_2 )
            {
             before(grammarAccess.getSensorAccess().getSensorAssignment_1_2()); 
            // InternalBPMN_translator.g:5293:2: ( rule__Sensor__SensorAssignment_1_2 )
            // InternalBPMN_translator.g:5293:3: rule__Sensor__SensorAssignment_1_2
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
    // InternalBPMN_translator.g:5301:1: rule__Sensor__Group_1__3 : rule__Sensor__Group_1__3__Impl ;
    public final void rule__Sensor__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5305:1: ( rule__Sensor__Group_1__3__Impl )
            // InternalBPMN_translator.g:5306:2: rule__Sensor__Group_1__3__Impl
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
    // InternalBPMN_translator.g:5312:1: rule__Sensor__Group_1__3__Impl : ( '}' ) ;
    public final void rule__Sensor__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5316:1: ( ( '}' ) )
            // InternalBPMN_translator.g:5317:1: ( '}' )
            {
            // InternalBPMN_translator.g:5317:1: ( '}' )
            // InternalBPMN_translator.g:5318:2: '}'
            {
             before(grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBPMN_translator.g:5328:1: rule__Sensor_data__Group__0 : rule__Sensor_data__Group__0__Impl rule__Sensor_data__Group__1 ;
    public final void rule__Sensor_data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5332:1: ( rule__Sensor_data__Group__0__Impl rule__Sensor_data__Group__1 )
            // InternalBPMN_translator.g:5333:2: rule__Sensor_data__Group__0__Impl rule__Sensor_data__Group__1
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
    // InternalBPMN_translator.g:5340:1: rule__Sensor_data__Group__0__Impl : ( () ) ;
    public final void rule__Sensor_data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5344:1: ( ( () ) )
            // InternalBPMN_translator.g:5345:1: ( () )
            {
            // InternalBPMN_translator.g:5345:1: ( () )
            // InternalBPMN_translator.g:5346:2: ()
            {
             before(grammarAccess.getSensor_dataAccess().getSensor_dataAction_0()); 
            // InternalBPMN_translator.g:5347:2: ()
            // InternalBPMN_translator.g:5347:3: 
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
    // InternalBPMN_translator.g:5355:1: rule__Sensor_data__Group__1 : rule__Sensor_data__Group__1__Impl ;
    public final void rule__Sensor_data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5359:1: ( rule__Sensor_data__Group__1__Impl )
            // InternalBPMN_translator.g:5360:2: rule__Sensor_data__Group__1__Impl
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
    // InternalBPMN_translator.g:5366:1: rule__Sensor_data__Group__1__Impl : ( ( rule__Sensor_data__Alternatives_1 )* ) ;
    public final void rule__Sensor_data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5370:1: ( ( ( rule__Sensor_data__Alternatives_1 )* ) )
            // InternalBPMN_translator.g:5371:1: ( ( rule__Sensor_data__Alternatives_1 )* )
            {
            // InternalBPMN_translator.g:5371:1: ( ( rule__Sensor_data__Alternatives_1 )* )
            // InternalBPMN_translator.g:5372:2: ( rule__Sensor_data__Alternatives_1 )*
            {
             before(grammarAccess.getSensor_dataAccess().getAlternatives_1()); 
            // InternalBPMN_translator.g:5373:2: ( rule__Sensor_data__Alternatives_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==43||(LA33_0>=59 && LA33_0<=60)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalBPMN_translator.g:5373:3: rule__Sensor_data__Alternatives_1
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
    // InternalBPMN_translator.g:5382:1: rule__Sensor_data__Group_1_0__0 : rule__Sensor_data__Group_1_0__0__Impl rule__Sensor_data__Group_1_0__1 ;
    public final void rule__Sensor_data__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5386:1: ( rule__Sensor_data__Group_1_0__0__Impl rule__Sensor_data__Group_1_0__1 )
            // InternalBPMN_translator.g:5387:2: rule__Sensor_data__Group_1_0__0__Impl rule__Sensor_data__Group_1_0__1
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
    // InternalBPMN_translator.g:5394:1: rule__Sensor_data__Group_1_0__0__Impl : ( 'NAME' ) ;
    public final void rule__Sensor_data__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5398:1: ( ( 'NAME' ) )
            // InternalBPMN_translator.g:5399:1: ( 'NAME' )
            {
            // InternalBPMN_translator.g:5399:1: ( 'NAME' )
            // InternalBPMN_translator.g:5400:2: 'NAME'
            {
             before(grammarAccess.getSensor_dataAccess().getNAMEKeyword_1_0_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalBPMN_translator.g:5409:1: rule__Sensor_data__Group_1_0__1 : rule__Sensor_data__Group_1_0__1__Impl rule__Sensor_data__Group_1_0__2 ;
    public final void rule__Sensor_data__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5413:1: ( rule__Sensor_data__Group_1_0__1__Impl rule__Sensor_data__Group_1_0__2 )
            // InternalBPMN_translator.g:5414:2: rule__Sensor_data__Group_1_0__1__Impl rule__Sensor_data__Group_1_0__2
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
    // InternalBPMN_translator.g:5421:1: rule__Sensor_data__Group_1_0__1__Impl : ( '=' ) ;
    public final void rule__Sensor_data__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5425:1: ( ( '=' ) )
            // InternalBPMN_translator.g:5426:1: ( '=' )
            {
            // InternalBPMN_translator.g:5426:1: ( '=' )
            // InternalBPMN_translator.g:5427:2: '='
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
    // InternalBPMN_translator.g:5436:1: rule__Sensor_data__Group_1_0__2 : rule__Sensor_data__Group_1_0__2__Impl ;
    public final void rule__Sensor_data__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5440:1: ( rule__Sensor_data__Group_1_0__2__Impl )
            // InternalBPMN_translator.g:5441:2: rule__Sensor_data__Group_1_0__2__Impl
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
    // InternalBPMN_translator.g:5447:1: rule__Sensor_data__Group_1_0__2__Impl : ( ( rule__Sensor_data__PnameAssignment_1_0_2 ) ) ;
    public final void rule__Sensor_data__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5451:1: ( ( ( rule__Sensor_data__PnameAssignment_1_0_2 ) ) )
            // InternalBPMN_translator.g:5452:1: ( ( rule__Sensor_data__PnameAssignment_1_0_2 ) )
            {
            // InternalBPMN_translator.g:5452:1: ( ( rule__Sensor_data__PnameAssignment_1_0_2 ) )
            // InternalBPMN_translator.g:5453:2: ( rule__Sensor_data__PnameAssignment_1_0_2 )
            {
             before(grammarAccess.getSensor_dataAccess().getPnameAssignment_1_0_2()); 
            // InternalBPMN_translator.g:5454:2: ( rule__Sensor_data__PnameAssignment_1_0_2 )
            // InternalBPMN_translator.g:5454:3: rule__Sensor_data__PnameAssignment_1_0_2
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
    // InternalBPMN_translator.g:5463:1: rule__Sensor_data__Group_1_1__0 : rule__Sensor_data__Group_1_1__0__Impl rule__Sensor_data__Group_1_1__1 ;
    public final void rule__Sensor_data__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5467:1: ( rule__Sensor_data__Group_1_1__0__Impl rule__Sensor_data__Group_1_1__1 )
            // InternalBPMN_translator.g:5468:2: rule__Sensor_data__Group_1_1__0__Impl rule__Sensor_data__Group_1_1__1
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
    // InternalBPMN_translator.g:5475:1: rule__Sensor_data__Group_1_1__0__Impl : ( 'PINS' ) ;
    public final void rule__Sensor_data__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5479:1: ( ( 'PINS' ) )
            // InternalBPMN_translator.g:5480:1: ( 'PINS' )
            {
            // InternalBPMN_translator.g:5480:1: ( 'PINS' )
            // InternalBPMN_translator.g:5481:2: 'PINS'
            {
             before(grammarAccess.getSensor_dataAccess().getPINSKeyword_1_1_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalBPMN_translator.g:5490:1: rule__Sensor_data__Group_1_1__1 : rule__Sensor_data__Group_1_1__1__Impl rule__Sensor_data__Group_1_1__2 ;
    public final void rule__Sensor_data__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5494:1: ( rule__Sensor_data__Group_1_1__1__Impl rule__Sensor_data__Group_1_1__2 )
            // InternalBPMN_translator.g:5495:2: rule__Sensor_data__Group_1_1__1__Impl rule__Sensor_data__Group_1_1__2
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
    // InternalBPMN_translator.g:5502:1: rule__Sensor_data__Group_1_1__1__Impl : ( '=' ) ;
    public final void rule__Sensor_data__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5506:1: ( ( '=' ) )
            // InternalBPMN_translator.g:5507:1: ( '=' )
            {
            // InternalBPMN_translator.g:5507:1: ( '=' )
            // InternalBPMN_translator.g:5508:2: '='
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
    // InternalBPMN_translator.g:5517:1: rule__Sensor_data__Group_1_1__2 : rule__Sensor_data__Group_1_1__2__Impl ;
    public final void rule__Sensor_data__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5521:1: ( rule__Sensor_data__Group_1_1__2__Impl )
            // InternalBPMN_translator.g:5522:2: rule__Sensor_data__Group_1_1__2__Impl
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
    // InternalBPMN_translator.g:5528:1: rule__Sensor_data__Group_1_1__2__Impl : ( ( rule__Sensor_data__PinsAssignment_1_1_2 ) ) ;
    public final void rule__Sensor_data__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5532:1: ( ( ( rule__Sensor_data__PinsAssignment_1_1_2 ) ) )
            // InternalBPMN_translator.g:5533:1: ( ( rule__Sensor_data__PinsAssignment_1_1_2 ) )
            {
            // InternalBPMN_translator.g:5533:1: ( ( rule__Sensor_data__PinsAssignment_1_1_2 ) )
            // InternalBPMN_translator.g:5534:2: ( rule__Sensor_data__PinsAssignment_1_1_2 )
            {
             before(grammarAccess.getSensor_dataAccess().getPinsAssignment_1_1_2()); 
            // InternalBPMN_translator.g:5535:2: ( rule__Sensor_data__PinsAssignment_1_1_2 )
            // InternalBPMN_translator.g:5535:3: rule__Sensor_data__PinsAssignment_1_1_2
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
    // InternalBPMN_translator.g:5544:1: rule__Sensor_data__Group_1_2__0 : rule__Sensor_data__Group_1_2__0__Impl rule__Sensor_data__Group_1_2__1 ;
    public final void rule__Sensor_data__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5548:1: ( rule__Sensor_data__Group_1_2__0__Impl rule__Sensor_data__Group_1_2__1 )
            // InternalBPMN_translator.g:5549:2: rule__Sensor_data__Group_1_2__0__Impl rule__Sensor_data__Group_1_2__1
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
    // InternalBPMN_translator.g:5556:1: rule__Sensor_data__Group_1_2__0__Impl : ( 'SENSOR_ID' ) ;
    public final void rule__Sensor_data__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5560:1: ( ( 'SENSOR_ID' ) )
            // InternalBPMN_translator.g:5561:1: ( 'SENSOR_ID' )
            {
            // InternalBPMN_translator.g:5561:1: ( 'SENSOR_ID' )
            // InternalBPMN_translator.g:5562:2: 'SENSOR_ID'
            {
             before(grammarAccess.getSensor_dataAccess().getSENSOR_IDKeyword_1_2_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalBPMN_translator.g:5571:1: rule__Sensor_data__Group_1_2__1 : rule__Sensor_data__Group_1_2__1__Impl rule__Sensor_data__Group_1_2__2 ;
    public final void rule__Sensor_data__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5575:1: ( rule__Sensor_data__Group_1_2__1__Impl rule__Sensor_data__Group_1_2__2 )
            // InternalBPMN_translator.g:5576:2: rule__Sensor_data__Group_1_2__1__Impl rule__Sensor_data__Group_1_2__2
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
    // InternalBPMN_translator.g:5583:1: rule__Sensor_data__Group_1_2__1__Impl : ( '=' ) ;
    public final void rule__Sensor_data__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5587:1: ( ( '=' ) )
            // InternalBPMN_translator.g:5588:1: ( '=' )
            {
            // InternalBPMN_translator.g:5588:1: ( '=' )
            // InternalBPMN_translator.g:5589:2: '='
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
    // InternalBPMN_translator.g:5598:1: rule__Sensor_data__Group_1_2__2 : rule__Sensor_data__Group_1_2__2__Impl ;
    public final void rule__Sensor_data__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5602:1: ( rule__Sensor_data__Group_1_2__2__Impl )
            // InternalBPMN_translator.g:5603:2: rule__Sensor_data__Group_1_2__2__Impl
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
    // InternalBPMN_translator.g:5609:1: rule__Sensor_data__Group_1_2__2__Impl : ( ( rule__Sensor_data__Sensor_idAssignment_1_2_2 ) ) ;
    public final void rule__Sensor_data__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5613:1: ( ( ( rule__Sensor_data__Sensor_idAssignment_1_2_2 ) ) )
            // InternalBPMN_translator.g:5614:1: ( ( rule__Sensor_data__Sensor_idAssignment_1_2_2 ) )
            {
            // InternalBPMN_translator.g:5614:1: ( ( rule__Sensor_data__Sensor_idAssignment_1_2_2 ) )
            // InternalBPMN_translator.g:5615:2: ( rule__Sensor_data__Sensor_idAssignment_1_2_2 )
            {
             before(grammarAccess.getSensor_dataAccess().getSensor_idAssignment_1_2_2()); 
            // InternalBPMN_translator.g:5616:2: ( rule__Sensor_data__Sensor_idAssignment_1_2_2 )
            // InternalBPMN_translator.g:5616:3: rule__Sensor_data__Sensor_idAssignment_1_2_2
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
    // InternalBPMN_translator.g:5625:1: rule__Model__ModelAssignment : ( ruleXml ) ;
    public final void rule__Model__ModelAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5629:1: ( ( ruleXml ) )
            // InternalBPMN_translator.g:5630:2: ( ruleXml )
            {
            // InternalBPMN_translator.g:5630:2: ( ruleXml )
            // InternalBPMN_translator.g:5631:3: ruleXml
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
    // InternalBPMN_translator.g:5640:1: rule__Xml__ProvaAssignment_2 : ( ruleelement ) ;
    public final void rule__Xml__ProvaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5644:1: ( ( ruleelement ) )
            // InternalBPMN_translator.g:5645:2: ( ruleelement )
            {
            // InternalBPMN_translator.g:5645:2: ( ruleelement )
            // InternalBPMN_translator.g:5646:3: ruleelement
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
    // InternalBPMN_translator.g:5655:1: rule__Element__OpenAssignment_0_0 : ( ruleOpen ) ;
    public final void rule__Element__OpenAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5659:1: ( ( ruleOpen ) )
            // InternalBPMN_translator.g:5660:2: ( ruleOpen )
            {
            // InternalBPMN_translator.g:5660:2: ( ruleOpen )
            // InternalBPMN_translator.g:5661:3: ruleOpen
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
    // InternalBPMN_translator.g:5670:1: rule__Element__ContentsAssignment_0_1 : ( rulecontent ) ;
    public final void rule__Element__ContentsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5674:1: ( ( rulecontent ) )
            // InternalBPMN_translator.g:5675:2: ( rulecontent )
            {
            // InternalBPMN_translator.g:5675:2: ( rulecontent )
            // InternalBPMN_translator.g:5676:3: rulecontent
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
    // InternalBPMN_translator.g:5685:1: rule__Element__Close_tagAssignment_0_2 : ( ruleClose ) ;
    public final void rule__Element__Close_tagAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5689:1: ( ( ruleClose ) )
            // InternalBPMN_translator.g:5690:2: ( ruleClose )
            {
            // InternalBPMN_translator.g:5690:2: ( ruleClose )
            // InternalBPMN_translator.g:5691:3: ruleClose
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
    // InternalBPMN_translator.g:5700:1: rule__Element__Singleton_tagAssignment_1 : ( ruleSingleton ) ;
    public final void rule__Element__Singleton_tagAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5704:1: ( ( ruleSingleton ) )
            // InternalBPMN_translator.g:5705:2: ( ruleSingleton )
            {
            // InternalBPMN_translator.g:5705:2: ( ruleSingleton )
            // InternalBPMN_translator.g:5706:3: ruleSingleton
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
    // InternalBPMN_translator.g:5715:1: rule__Content__TypeAssignment_1_0_0 : ( ( rule__Content__TypeAlternatives_1_0_0_0 ) ) ;
    public final void rule__Content__TypeAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5719:1: ( ( ( rule__Content__TypeAlternatives_1_0_0_0 ) ) )
            // InternalBPMN_translator.g:5720:2: ( ( rule__Content__TypeAlternatives_1_0_0_0 ) )
            {
            // InternalBPMN_translator.g:5720:2: ( ( rule__Content__TypeAlternatives_1_0_0_0 ) )
            // InternalBPMN_translator.g:5721:3: ( rule__Content__TypeAlternatives_1_0_0_0 )
            {
             before(grammarAccess.getContentAccess().getTypeAlternatives_1_0_0_0()); 
            // InternalBPMN_translator.g:5722:3: ( rule__Content__TypeAlternatives_1_0_0_0 )
            // InternalBPMN_translator.g:5722:4: rule__Content__TypeAlternatives_1_0_0_0
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
    // InternalBPMN_translator.g:5730:1: rule__Content__CodexAssignment_1_0_2 : ( rulecodex ) ;
    public final void rule__Content__CodexAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5734:1: ( ( rulecodex ) )
            // InternalBPMN_translator.g:5735:2: ( rulecodex )
            {
            // InternalBPMN_translator.g:5735:2: ( rulecodex )
            // InternalBPMN_translator.g:5736:3: rulecodex
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
    // InternalBPMN_translator.g:5745:1: rule__Content__ElementAssignment_1_1 : ( ruleelement ) ;
    public final void rule__Content__ElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5749:1: ( ( ruleelement ) )
            // InternalBPMN_translator.g:5750:2: ( ruleelement )
            {
            // InternalBPMN_translator.g:5750:2: ( ruleelement )
            // InternalBPMN_translator.g:5751:3: ruleelement
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
    // InternalBPMN_translator.g:5760:1: rule__Content__BodyAssignment_1_2_0 : ( rulepreconditions ) ;
    public final void rule__Content__BodyAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5764:1: ( ( rulepreconditions ) )
            // InternalBPMN_translator.g:5765:2: ( rulepreconditions )
            {
            // InternalBPMN_translator.g:5765:2: ( rulepreconditions )
            // InternalBPMN_translator.g:5766:3: rulepreconditions
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
    // InternalBPMN_translator.g:5775:1: rule__Content__BodyAssignment_1_2_1 : ( ( rule__Content__BodyAlternatives_1_2_1_0 ) ) ;
    public final void rule__Content__BodyAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5779:1: ( ( ( rule__Content__BodyAlternatives_1_2_1_0 ) ) )
            // InternalBPMN_translator.g:5780:2: ( ( rule__Content__BodyAlternatives_1_2_1_0 ) )
            {
            // InternalBPMN_translator.g:5780:2: ( ( rule__Content__BodyAlternatives_1_2_1_0 ) )
            // InternalBPMN_translator.g:5781:3: ( rule__Content__BodyAlternatives_1_2_1_0 )
            {
             before(grammarAccess.getContentAccess().getBodyAlternatives_1_2_1_0()); 
            // InternalBPMN_translator.g:5782:3: ( rule__Content__BodyAlternatives_1_2_1_0 )
            // InternalBPMN_translator.g:5782:4: rule__Content__BodyAlternatives_1_2_1_0
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
    // InternalBPMN_translator.g:5790:1: rule__Content__BodyAssignment_1_2_2 : ( ruleconditions ) ;
    public final void rule__Content__BodyAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5794:1: ( ( ruleconditions ) )
            // InternalBPMN_translator.g:5795:2: ( ruleconditions )
            {
            // InternalBPMN_translator.g:5795:2: ( ruleconditions )
            // InternalBPMN_translator.g:5796:3: ruleconditions
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
    // InternalBPMN_translator.g:5805:1: rule__Content__KeywordsAssignment_1_3 : ( RULE_KEYWORDS ) ;
    public final void rule__Content__KeywordsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5809:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:5810:2: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:5810:2: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:5811:3: RULE_KEYWORDS
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
    // InternalBPMN_translator.g:5820:1: rule__Content__DataAssignment_1_4 : ( RULE_STRING ) ;
    public final void rule__Content__DataAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5824:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:5825:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:5825:2: ( RULE_STRING )
            // InternalBPMN_translator.g:5826:3: RULE_STRING
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
    // InternalBPMN_translator.g:5835:1: rule__Open__HeadAssignment_1 : ( RULE_HEAD ) ;
    public final void rule__Open__HeadAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5839:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:5840:2: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:5840:2: ( RULE_HEAD )
            // InternalBPMN_translator.g:5841:3: RULE_HEAD
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
    // InternalBPMN_translator.g:5850:1: rule__Open__KeywordsAssignment_3 : ( RULE_KEYWORDS ) ;
    public final void rule__Open__KeywordsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5854:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:5855:2: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:5855:2: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:5856:3: RULE_KEYWORDS
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
    // InternalBPMN_translator.g:5865:1: rule__Open__Head1Assignment_4_0_0 : ( RULE_HEAD ) ;
    public final void rule__Open__Head1Assignment_4_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5869:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:5870:2: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:5870:2: ( RULE_HEAD )
            // InternalBPMN_translator.g:5871:3: RULE_HEAD
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
    // InternalBPMN_translator.g:5880:1: rule__Open__Head1Assignment_4_1_0_0 : ( RULE_HEAD ) ;
    public final void rule__Open__Head1Assignment_4_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5884:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:5885:2: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:5885:2: ( RULE_HEAD )
            // InternalBPMN_translator.g:5886:3: RULE_HEAD
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
    // InternalBPMN_translator.g:5895:1: rule__Open__Keywords1Assignment_4_1_0_1 : ( RULE_KEYWORDS ) ;
    public final void rule__Open__Keywords1Assignment_4_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5899:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:5900:2: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:5900:2: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:5901:3: RULE_KEYWORDS
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
    // InternalBPMN_translator.g:5910:1: rule__Open__ValueAssignment_4_1_2 : ( RULE_STRING ) ;
    public final void rule__Open__ValueAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5914:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:5915:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:5915:2: ( RULE_STRING )
            // InternalBPMN_translator.g:5916:3: RULE_STRING
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
    // InternalBPMN_translator.g:5925:1: rule__Singleton__KeywordsAssignment_1_3 : ( RULE_KEYWORDS ) ;
    public final void rule__Singleton__KeywordsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5929:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:5930:2: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:5930:2: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:5931:3: RULE_KEYWORDS
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
    // InternalBPMN_translator.g:5940:1: rule__Singleton__Keywords1Assignment_1_4_1_0 : ( RULE_KEYWORDS ) ;
    public final void rule__Singleton__Keywords1Assignment_1_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5944:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:5945:2: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:5945:2: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:5946:3: RULE_KEYWORDS
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
    // InternalBPMN_translator.g:5955:1: rule__Singleton__ValueAssignment_1_4_1_2 : ( RULE_STRING ) ;
    public final void rule__Singleton__ValueAssignment_1_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5959:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:5960:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:5960:2: ( RULE_STRING )
            // InternalBPMN_translator.g:5961:3: RULE_STRING
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
    // InternalBPMN_translator.g:5970:1: rule__Codex__Device_codeAssignment_0 : ( ruledevice ) ;
    public final void rule__Codex__Device_codeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5974:1: ( ( ruledevice ) )
            // InternalBPMN_translator.g:5975:2: ( ruledevice )
            {
            // InternalBPMN_translator.g:5975:2: ( ruledevice )
            // InternalBPMN_translator.g:5976:3: ruledevice
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
    // InternalBPMN_translator.g:5985:1: rule__Codex__ProtocolAssignment_1 : ( ruleprotocol ) ;
    public final void rule__Codex__ProtocolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5989:1: ( ( ruleprotocol ) )
            // InternalBPMN_translator.g:5990:2: ( ruleprotocol )
            {
            // InternalBPMN_translator.g:5990:2: ( ruleprotocol )
            // InternalBPMN_translator.g:5991:3: ruleprotocol
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
    // InternalBPMN_translator.g:6000:1: rule__Codex__Sensor_codeAssignment_2 : ( rulesensor ) ;
    public final void rule__Codex__Sensor_codeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6004:1: ( ( rulesensor ) )
            // InternalBPMN_translator.g:6005:2: ( rulesensor )
            {
            // InternalBPMN_translator.g:6005:2: ( rulesensor )
            // InternalBPMN_translator.g:6006:3: rulesensor
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
    // InternalBPMN_translator.g:6015:1: rule__Device__DeviceAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Device__DeviceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6019:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6020:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6020:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6021:3: RULE_STRING
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
    // InternalBPMN_translator.g:6030:1: rule__Device__IdAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Device__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6034:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6035:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6035:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6036:3: RULE_STRING
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
    // InternalBPMN_translator.g:6045:1: rule__Protocol__PnameAssignment_0_0 : ( ( 'MQTT' ) ) ;
    public final void rule__Protocol__PnameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6049:1: ( ( ( 'MQTT' ) ) )
            // InternalBPMN_translator.g:6050:2: ( ( 'MQTT' ) )
            {
            // InternalBPMN_translator.g:6050:2: ( ( 'MQTT' ) )
            // InternalBPMN_translator.g:6051:3: ( 'MQTT' )
            {
             before(grammarAccess.getProtocolAccess().getPnameMQTTKeyword_0_0_0()); 
            // InternalBPMN_translator.g:6052:3: ( 'MQTT' )
            // InternalBPMN_translator.g:6053:4: 'MQTT'
            {
             before(grammarAccess.getProtocolAccess().getPnameMQTTKeyword_0_0_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalBPMN_translator.g:6064:1: rule__Protocol__Mqtt_dataAssignment_0_2_0 : ( rulemqtt_data ) ;
    public final void rule__Protocol__Mqtt_dataAssignment_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6068:1: ( ( rulemqtt_data ) )
            // InternalBPMN_translator.g:6069:2: ( rulemqtt_data )
            {
            // InternalBPMN_translator.g:6069:2: ( rulemqtt_data )
            // InternalBPMN_translator.g:6070:3: rulemqtt_data
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
    // InternalBPMN_translator.g:6079:1: rule__Protocol__Mqtt_deviceAssignment_0_2_1 : ( rulemqtt_device ) ;
    public final void rule__Protocol__Mqtt_deviceAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6083:1: ( ( rulemqtt_device ) )
            // InternalBPMN_translator.g:6084:2: ( rulemqtt_device )
            {
            // InternalBPMN_translator.g:6084:2: ( rulemqtt_device )
            // InternalBPMN_translator.g:6085:3: rulemqtt_device
            {
             before(grammarAccess.getProtocolAccess().getMqtt_deviceMqtt_deviceParserRuleCall_0_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulemqtt_device();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getMqtt_deviceMqtt_deviceParserRuleCall_0_2_1_0()); 

            }


            }

        }
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
    // InternalBPMN_translator.g:6094:1: rule__Protocol__PnameAssignment_1_0 : ( ( 'HTTP' ) ) ;
    public final void rule__Protocol__PnameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6098:1: ( ( ( 'HTTP' ) ) )
            // InternalBPMN_translator.g:6099:2: ( ( 'HTTP' ) )
            {
            // InternalBPMN_translator.g:6099:2: ( ( 'HTTP' ) )
            // InternalBPMN_translator.g:6100:3: ( 'HTTP' )
            {
             before(grammarAccess.getProtocolAccess().getPnameHTTPKeyword_1_0_0()); 
            // InternalBPMN_translator.g:6101:3: ( 'HTTP' )
            // InternalBPMN_translator.g:6102:4: 'HTTP'
            {
             before(grammarAccess.getProtocolAccess().getPnameHTTPKeyword_1_0_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalBPMN_translator.g:6113:1: rule__Protocol__Http_dataAssignment_1_2_0 : ( rulehttp_data ) ;
    public final void rule__Protocol__Http_dataAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6117:1: ( ( rulehttp_data ) )
            // InternalBPMN_translator.g:6118:2: ( rulehttp_data )
            {
            // InternalBPMN_translator.g:6118:2: ( rulehttp_data )
            // InternalBPMN_translator.g:6119:3: rulehttp_data
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


    // $ANTLR start "rule__Protocol__Mqtt_deviceAssignment_1_2_1"
    // InternalBPMN_translator.g:6128:1: rule__Protocol__Mqtt_deviceAssignment_1_2_1 : ( rulemqtt_device ) ;
    public final void rule__Protocol__Mqtt_deviceAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6132:1: ( ( rulemqtt_device ) )
            // InternalBPMN_translator.g:6133:2: ( rulemqtt_device )
            {
            // InternalBPMN_translator.g:6133:2: ( rulemqtt_device )
            // InternalBPMN_translator.g:6134:3: rulemqtt_device
            {
             before(grammarAccess.getProtocolAccess().getMqtt_deviceMqtt_deviceParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulemqtt_device();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getMqtt_deviceMqtt_deviceParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Mqtt_deviceAssignment_1_2_1"


    // $ANTLR start "rule__Http_data__PnameAssignment_1_0_2"
    // InternalBPMN_translator.g:6143:1: rule__Http_data__PnameAssignment_1_0_2 : ( RULE_STRING ) ;
    public final void rule__Http_data__PnameAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6147:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6148:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6148:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6149:3: RULE_STRING
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
    // InternalBPMN_translator.g:6158:1: rule__Http_data__Server_ipAssignment_1_1_2 : ( RULE_STRING ) ;
    public final void rule__Http_data__Server_ipAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6162:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6163:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6163:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6164:3: RULE_STRING
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
    // InternalBPMN_translator.g:6173:1: rule__Http_data__Request_typeAssignment_1_2_2 : ( RULE_STRING ) ;
    public final void rule__Http_data__Request_typeAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6177:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6178:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6178:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6179:3: RULE_STRING
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


    // $ANTLR start "rule__Http_data__Content_typeAssignment_1_3_1"
    // InternalBPMN_translator.g:6188:1: rule__Http_data__Content_typeAssignment_1_3_1 : ( RULE_STRING ) ;
    public final void rule__Http_data__Content_typeAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6192:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6193:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6193:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6194:3: RULE_STRING
            {
             before(grammarAccess.getHttp_dataAccess().getContent_typeSTRINGTerminalRuleCall_1_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHttp_dataAccess().getContent_typeSTRINGTerminalRuleCall_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Http_data__Content_typeAssignment_1_3_1"


    // $ANTLR start "rule__Http_data__HeaderAssignment_1_4_1"
    // InternalBPMN_translator.g:6203:1: rule__Http_data__HeaderAssignment_1_4_1 : ( RULE_STRING ) ;
    public final void rule__Http_data__HeaderAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6207:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6208:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6208:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6209:3: RULE_STRING
            {
             before(grammarAccess.getHttp_dataAccess().getHeaderSTRINGTerminalRuleCall_1_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHttp_dataAccess().getHeaderSTRINGTerminalRuleCall_1_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Http_data__HeaderAssignment_1_4_1"


    // $ANTLR start "rule__Http_data__DataAssignment_1_5_1"
    // InternalBPMN_translator.g:6218:1: rule__Http_data__DataAssignment_1_5_1 : ( RULE_STRING ) ;
    public final void rule__Http_data__DataAssignment_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6222:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6223:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6223:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6224:3: RULE_STRING
            {
             before(grammarAccess.getHttp_dataAccess().getDataSTRINGTerminalRuleCall_1_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHttp_dataAccess().getDataSTRINGTerminalRuleCall_1_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Http_data__DataAssignment_1_5_1"


    // $ANTLR start "rule__Http_data__Mqtt_network_dataAssignment_1_6_2"
    // InternalBPMN_translator.g:6233:1: rule__Http_data__Mqtt_network_dataAssignment_1_6_2 : ( rulemqtt_network_data ) ;
    public final void rule__Http_data__Mqtt_network_dataAssignment_1_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6237:1: ( ( rulemqtt_network_data ) )
            // InternalBPMN_translator.g:6238:2: ( rulemqtt_network_data )
            {
            // InternalBPMN_translator.g:6238:2: ( rulemqtt_network_data )
            // InternalBPMN_translator.g:6239:3: rulemqtt_network_data
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
    // InternalBPMN_translator.g:6248:1: rule__Mqtt_data__PnameAssignment_1_0_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_data__PnameAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6252:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6253:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6253:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6254:3: RULE_STRING
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
    // InternalBPMN_translator.g:6263:1: rule__Mqtt_data__Broker_userAssignment_1_1_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_data__Broker_userAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6267:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6268:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6268:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6269:3: RULE_STRING
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
    // InternalBPMN_translator.g:6278:1: rule__Mqtt_data__Broker_passwordAssignment_1_2_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_data__Broker_passwordAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6282:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6283:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6283:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6284:3: RULE_STRING
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
    // InternalBPMN_translator.g:6293:1: rule__Mqtt_data__BrokerAssignment_1_3_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_data__BrokerAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6297:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6298:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6298:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6299:3: RULE_STRING
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
    // InternalBPMN_translator.g:6308:1: rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 : ( rulemqtt_network_data ) ;
    public final void rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6312:1: ( ( rulemqtt_network_data ) )
            // InternalBPMN_translator.g:6313:2: ( rulemqtt_network_data )
            {
            // InternalBPMN_translator.g:6313:2: ( rulemqtt_network_data )
            // InternalBPMN_translator.g:6314:3: rulemqtt_network_data
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
    // InternalBPMN_translator.g:6323:1: rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_data__SubtopicsAssignment_1_5_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6327:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6328:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6328:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6329:3: RULE_STRING
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
    // InternalBPMN_translator.g:6338:1: rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6342:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6343:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6343:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6344:3: RULE_STRING
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
    // InternalBPMN_translator.g:6353:1: rule__Mqtt_data__ValueAssignment_1_6_2_1_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_data__ValueAssignment_1_6_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6357:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6358:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6358:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6359:3: RULE_STRING
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
    // InternalBPMN_translator.g:6368:1: rule__Mqtt_network_data__SsidAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_network_data__SsidAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6372:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6373:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6373:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6374:3: RULE_STRING
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
    // InternalBPMN_translator.g:6383:1: rule__Mqtt_network_data__PasswordAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Mqtt_network_data__PasswordAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6387:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6388:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6388:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6389:3: RULE_STRING
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


    // $ANTLR start "rule__Mqtt_device__DnameAssignment_4"
    // InternalBPMN_translator.g:6398:1: rule__Mqtt_device__DnameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Mqtt_device__DnameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6402:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6403:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6403:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6404:3: RULE_STRING
            {
             before(grammarAccess.getMqtt_deviceAccess().getDnameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMqtt_deviceAccess().getDnameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mqtt_device__DnameAssignment_4"


    // $ANTLR start "rule__Sensor__SnameAssignment_0_0"
    // InternalBPMN_translator.g:6413:1: rule__Sensor__SnameAssignment_0_0 : ( ( 'TEMPERATURE' ) ) ;
    public final void rule__Sensor__SnameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6417:1: ( ( ( 'TEMPERATURE' ) ) )
            // InternalBPMN_translator.g:6418:2: ( ( 'TEMPERATURE' ) )
            {
            // InternalBPMN_translator.g:6418:2: ( ( 'TEMPERATURE' ) )
            // InternalBPMN_translator.g:6419:3: ( 'TEMPERATURE' )
            {
             before(grammarAccess.getSensorAccess().getSnameTEMPERATUREKeyword_0_0_0()); 
            // InternalBPMN_translator.g:6420:3: ( 'TEMPERATURE' )
            // InternalBPMN_translator.g:6421:4: 'TEMPERATURE'
            {
             before(grammarAccess.getSensorAccess().getSnameTEMPERATUREKeyword_0_0_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBPMN_translator.g:6432:1: rule__Sensor__SensorAssignment_0_2 : ( rulesensor_data ) ;
    public final void rule__Sensor__SensorAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6436:1: ( ( rulesensor_data ) )
            // InternalBPMN_translator.g:6437:2: ( rulesensor_data )
            {
            // InternalBPMN_translator.g:6437:2: ( rulesensor_data )
            // InternalBPMN_translator.g:6438:3: rulesensor_data
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
    // InternalBPMN_translator.g:6447:1: rule__Sensor__SnameAssignment_1_0 : ( ( 'DISTANCE' ) ) ;
    public final void rule__Sensor__SnameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6451:1: ( ( ( 'DISTANCE' ) ) )
            // InternalBPMN_translator.g:6452:2: ( ( 'DISTANCE' ) )
            {
            // InternalBPMN_translator.g:6452:2: ( ( 'DISTANCE' ) )
            // InternalBPMN_translator.g:6453:3: ( 'DISTANCE' )
            {
             before(grammarAccess.getSensorAccess().getSnameDISTANCEKeyword_1_0_0()); 
            // InternalBPMN_translator.g:6454:3: ( 'DISTANCE' )
            // InternalBPMN_translator.g:6455:4: 'DISTANCE'
            {
             before(grammarAccess.getSensorAccess().getSnameDISTANCEKeyword_1_0_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalBPMN_translator.g:6466:1: rule__Sensor__SensorAssignment_1_2 : ( rulesensor_data ) ;
    public final void rule__Sensor__SensorAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6470:1: ( ( rulesensor_data ) )
            // InternalBPMN_translator.g:6471:2: ( rulesensor_data )
            {
            // InternalBPMN_translator.g:6471:2: ( rulesensor_data )
            // InternalBPMN_translator.g:6472:3: rulesensor_data
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
    // InternalBPMN_translator.g:6481:1: rule__Sensor_data__PnameAssignment_1_0_2 : ( RULE_STRING ) ;
    public final void rule__Sensor_data__PnameAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6485:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6486:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6486:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6487:3: RULE_STRING
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
    // InternalBPMN_translator.g:6496:1: rule__Sensor_data__PinsAssignment_1_1_2 : ( RULE_STRING ) ;
    public final void rule__Sensor_data__PinsAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6500:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6501:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6501:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6502:3: RULE_STRING
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
    // InternalBPMN_translator.g:6511:1: rule__Sensor_data__Sensor_idAssignment_1_2_2 : ( RULE_STRING ) ;
    public final void rule__Sensor_data__Sensor_idAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6515:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6516:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6516:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6517:3: RULE_STRING
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
    static final String dfa_2s = "\1\40\1\5\1\41\1\7\1\5\2\24\2\uffff\1\5\1\6\1\5";
    static final String dfa_3s = "\1\40\1\5\1\41\1\7\1\43\1\41\1\24\2\uffff\1\43\1\6\1\43";
    static final String dfa_4s = "\7\uffff\1\2\1\1\3\uffff";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5\1\uffff\1\6\32\uffff\1\10\1\7",
            "\1\10\14\uffff\1\11",
            "\1\12",
            "",
            "",
            "\1\5\1\uffff\1\6\32\uffff\1\10\1\7",
            "\1\13",
            "\1\5\1\uffff\1\6\32\uffff\1\10\1\7"
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000210300C0D0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000210300C0D2L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002003000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000FF0000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000FF0002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000004000000A0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000000000A2L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0xE000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x8000002000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00BE080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0003F80000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0003F80000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0100000080000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00BE080000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0040000080000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0041000080000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0041000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x1800080000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x1800080000000002L});

}