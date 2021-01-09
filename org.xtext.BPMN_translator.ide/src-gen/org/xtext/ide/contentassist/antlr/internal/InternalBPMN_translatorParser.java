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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BODY", "RULE_STRING", "RULE_HEAD", "RULE_KEYWORDS", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'_TASK'", "'_GATEWAY'", "'&lt;'", "'&le;'", "'&ge;'", "'&gt;'", "'='", "'&amp;'", "'||'", "')'", "'!='", "'!'", "'('", "'<?'", "'version='", "'encoding='", "'?>'", "'{'", "'}'", "'<'", "':'", "'>'", "'/>'", "'</'", "'TEMPERATURE'", "'['", "','", "']'", "'DISTANCE'", "'DEVICE'", "'NAMEID'", "'NAME'", "'SERVER_IP'", "'REQUEST_TYPE'", "'CONTENT_TYPE'", "'HEADER'", "'DATA'", "'NETWORK'", "'BROKER_USER'", "'BROKER_PASSWORD'", "'BROKER'", "'SUBTOPICS'", "'TOPIC_NAME'", "'PUBTOPICS'", "'SSID'", "'PASSWORD'", "'PROTOCOL_DEVICE'", "'PINS'", "'SENSOR_ID'", "'MQTT'", "'HTTP'", "'GAS'", "'LIGHT'"
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
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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
    public static final int RULE_HEAD=6;
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


    // $ANTLR start "entryRuleprotocol_network_data"
    // InternalBPMN_translator.g:453:1: entryRuleprotocol_network_data : ruleprotocol_network_data EOF ;
    public final void entryRuleprotocol_network_data() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:454:1: ( ruleprotocol_network_data EOF )
            // InternalBPMN_translator.g:455:1: ruleprotocol_network_data EOF
            {
             before(grammarAccess.getProtocol_network_dataRule()); 
            pushFollow(FOLLOW_1);
            ruleprotocol_network_data();

            state._fsp--;

             after(grammarAccess.getProtocol_network_dataRule()); 
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
    // $ANTLR end "entryRuleprotocol_network_data"


    // $ANTLR start "ruleprotocol_network_data"
    // InternalBPMN_translator.g:462:1: ruleprotocol_network_data : ( ( rule__Protocol_network_data__Group__0 ) ) ;
    public final void ruleprotocol_network_data() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:466:2: ( ( ( rule__Protocol_network_data__Group__0 ) ) )
            // InternalBPMN_translator.g:467:2: ( ( rule__Protocol_network_data__Group__0 ) )
            {
            // InternalBPMN_translator.g:467:2: ( ( rule__Protocol_network_data__Group__0 ) )
            // InternalBPMN_translator.g:468:3: ( rule__Protocol_network_data__Group__0 )
            {
             before(grammarAccess.getProtocol_network_dataAccess().getGroup()); 
            // InternalBPMN_translator.g:469:3: ( rule__Protocol_network_data__Group__0 )
            // InternalBPMN_translator.g:469:4: rule__Protocol_network_data__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Protocol_network_data__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtocol_network_dataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleprotocol_network_data"


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
            case 42:
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
                else if ( (LA4_1==EOF||(LA4_1>=RULE_BODY && LA4_1<=RULE_STRING)||LA4_1==RULE_KEYWORDS||(LA4_1>=14 && LA4_1<=26)||LA4_1==33||(LA4_1>=37 && LA4_1<=38)||LA4_1==42) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==38||LA4_0==42) ) {
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
    // InternalBPMN_translator.g:717:1: rule__Variables__Alternatives : ( ( ( rule__Variables__Group_0__0 ) ) | ( ( rule__Variables__Group_1__0 ) ) | ( ( rule__Variables__Group_2__0 ) ) );
    public final void rule__Variables__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:721:1: ( ( ( rule__Variables__Group_0__0 ) ) | ( ( rule__Variables__Group_1__0 ) ) | ( ( rule__Variables__Group_2__0 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt8=1;
                }
                break;
            case 42:
                {
                alt8=2;
                }
                break;
            case RULE_BODY:
                {
                alt8=3;
                }
                break;
            default:
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
                case 3 :
                    // InternalBPMN_translator.g:734:2: ( ( rule__Variables__Group_2__0 ) )
                    {
                    // InternalBPMN_translator.g:734:2: ( ( rule__Variables__Group_2__0 ) )
                    // InternalBPMN_translator.g:735:3: ( rule__Variables__Group_2__0 )
                    {
                     before(grammarAccess.getVariablesAccess().getGroup_2()); 
                    // InternalBPMN_translator.g:736:3: ( rule__Variables__Group_2__0 )
                    // InternalBPMN_translator.g:736:4: rule__Variables__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variables__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariablesAccess().getGroup_2()); 

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
    // InternalBPMN_translator.g:744:1: rule__Conditions__Alternatives : ( ( '&lt;' ) | ( '&le;' ) | ( '&ge;' ) | ( '&gt;' ) | ( '=' ) | ( '&amp;' ) | ( '||' ) | ( ')' ) | ( '!=' ) );
    public final void rule__Conditions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:748:1: ( ( '&lt;' ) | ( '&le;' ) | ( '&ge;' ) | ( '&gt;' ) | ( '=' ) | ( '&amp;' ) | ( '||' ) | ( ')' ) | ( '!=' ) )
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
                    // InternalBPMN_translator.g:749:2: ( '&lt;' )
                    {
                    // InternalBPMN_translator.g:749:2: ( '&lt;' )
                    // InternalBPMN_translator.g:750:3: '&lt;'
                    {
                     before(grammarAccess.getConditionsAccess().getLtKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getConditionsAccess().getLtKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:755:2: ( '&le;' )
                    {
                    // InternalBPMN_translator.g:755:2: ( '&le;' )
                    // InternalBPMN_translator.g:756:3: '&le;'
                    {
                     before(grammarAccess.getConditionsAccess().getLeKeyword_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getConditionsAccess().getLeKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBPMN_translator.g:761:2: ( '&ge;' )
                    {
                    // InternalBPMN_translator.g:761:2: ( '&ge;' )
                    // InternalBPMN_translator.g:762:3: '&ge;'
                    {
                     before(grammarAccess.getConditionsAccess().getGeKeyword_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getConditionsAccess().getGeKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBPMN_translator.g:767:2: ( '&gt;' )
                    {
                    // InternalBPMN_translator.g:767:2: ( '&gt;' )
                    // InternalBPMN_translator.g:768:3: '&gt;'
                    {
                     before(grammarAccess.getConditionsAccess().getGtKeyword_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getConditionsAccess().getGtKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBPMN_translator.g:773:2: ( '=' )
                    {
                    // InternalBPMN_translator.g:773:2: ( '=' )
                    // InternalBPMN_translator.g:774:3: '='
                    {
                     before(grammarAccess.getConditionsAccess().getEqualsSignKeyword_4()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getConditionsAccess().getEqualsSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBPMN_translator.g:779:2: ( '&amp;' )
                    {
                    // InternalBPMN_translator.g:779:2: ( '&amp;' )
                    // InternalBPMN_translator.g:780:3: '&amp;'
                    {
                     before(grammarAccess.getConditionsAccess().getAmpKeyword_5()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getConditionsAccess().getAmpKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBPMN_translator.g:785:2: ( '||' )
                    {
                    // InternalBPMN_translator.g:785:2: ( '||' )
                    // InternalBPMN_translator.g:786:3: '||'
                    {
                     before(grammarAccess.getConditionsAccess().getVerticalLineVerticalLineKeyword_6()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getConditionsAccess().getVerticalLineVerticalLineKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBPMN_translator.g:791:2: ( ')' )
                    {
                    // InternalBPMN_translator.g:791:2: ( ')' )
                    // InternalBPMN_translator.g:792:3: ')'
                    {
                     before(grammarAccess.getConditionsAccess().getRightParenthesisKeyword_7()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getConditionsAccess().getRightParenthesisKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalBPMN_translator.g:797:2: ( '!=' )
                    {
                    // InternalBPMN_translator.g:797:2: ( '!=' )
                    // InternalBPMN_translator.g:798:3: '!='
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
    // InternalBPMN_translator.g:807:1: rule__Preconditions__Alternatives : ( ( '!' ) | ( '(' ) );
    public final void rule__Preconditions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:811:1: ( ( '!' ) | ( '(' ) )
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
                    // InternalBPMN_translator.g:812:2: ( '!' )
                    {
                    // InternalBPMN_translator.g:812:2: ( '!' )
                    // InternalBPMN_translator.g:813:3: '!'
                    {
                     before(grammarAccess.getPreconditionsAccess().getExclamationMarkKeyword_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getPreconditionsAccess().getExclamationMarkKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:818:2: ( '(' )
                    {
                    // InternalBPMN_translator.g:818:2: ( '(' )
                    // InternalBPMN_translator.g:819:3: '('
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
    // InternalBPMN_translator.g:828:1: rule__Protocol__Alternatives : ( ( ( rule__Protocol__Group_0__0 ) ) | ( ( rule__Protocol__Group_1__0 ) ) );
    public final void rule__Protocol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:832:1: ( ( ( rule__Protocol__Group_0__0 ) ) | ( ( rule__Protocol__Group_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==63) ) {
                alt11=1;
            }
            else if ( (LA11_0==64) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalBPMN_translator.g:833:2: ( ( rule__Protocol__Group_0__0 ) )
                    {
                    // InternalBPMN_translator.g:833:2: ( ( rule__Protocol__Group_0__0 ) )
                    // InternalBPMN_translator.g:834:3: ( rule__Protocol__Group_0__0 )
                    {
                     before(grammarAccess.getProtocolAccess().getGroup_0()); 
                    // InternalBPMN_translator.g:835:3: ( rule__Protocol__Group_0__0 )
                    // InternalBPMN_translator.g:835:4: rule__Protocol__Group_0__0
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
                    // InternalBPMN_translator.g:839:2: ( ( rule__Protocol__Group_1__0 ) )
                    {
                    // InternalBPMN_translator.g:839:2: ( ( rule__Protocol__Group_1__0 ) )
                    // InternalBPMN_translator.g:840:3: ( rule__Protocol__Group_1__0 )
                    {
                     before(grammarAccess.getProtocolAccess().getGroup_1()); 
                    // InternalBPMN_translator.g:841:3: ( rule__Protocol__Group_1__0 )
                    // InternalBPMN_translator.g:841:4: rule__Protocol__Group_1__0
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
    // InternalBPMN_translator.g:849:1: rule__Http_data__Alternatives_1 : ( ( ( rule__Http_data__Group_1_0__0 ) ) | ( ( rule__Http_data__Group_1_1__0 ) ) | ( ( rule__Http_data__Group_1_2__0 ) ) | ( ( rule__Http_data__Group_1_3__0 ) ) | ( ( rule__Http_data__Group_1_4__0 ) ) | ( ( rule__Http_data__Group_1_5__0 ) ) | ( ( rule__Http_data__Group_1_6__0 ) ) );
    public final void rule__Http_data__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:853:1: ( ( ( rule__Http_data__Group_1_0__0 ) ) | ( ( rule__Http_data__Group_1_1__0 ) ) | ( ( rule__Http_data__Group_1_2__0 ) ) | ( ( rule__Http_data__Group_1_3__0 ) ) | ( ( rule__Http_data__Group_1_4__0 ) ) | ( ( rule__Http_data__Group_1_5__0 ) ) | ( ( rule__Http_data__Group_1_6__0 ) ) )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt12=1;
                }
                break;
            case 46:
                {
                alt12=2;
                }
                break;
            case 47:
                {
                alt12=3;
                }
                break;
            case 48:
                {
                alt12=4;
                }
                break;
            case 49:
                {
                alt12=5;
                }
                break;
            case 50:
                {
                alt12=6;
                }
                break;
            case 51:
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
                    // InternalBPMN_translator.g:854:2: ( ( rule__Http_data__Group_1_0__0 ) )
                    {
                    // InternalBPMN_translator.g:854:2: ( ( rule__Http_data__Group_1_0__0 ) )
                    // InternalBPMN_translator.g:855:3: ( rule__Http_data__Group_1_0__0 )
                    {
                     before(grammarAccess.getHttp_dataAccess().getGroup_1_0()); 
                    // InternalBPMN_translator.g:856:3: ( rule__Http_data__Group_1_0__0 )
                    // InternalBPMN_translator.g:856:4: rule__Http_data__Group_1_0__0
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
                    // InternalBPMN_translator.g:860:2: ( ( rule__Http_data__Group_1_1__0 ) )
                    {
                    // InternalBPMN_translator.g:860:2: ( ( rule__Http_data__Group_1_1__0 ) )
                    // InternalBPMN_translator.g:861:3: ( rule__Http_data__Group_1_1__0 )
                    {
                     before(grammarAccess.getHttp_dataAccess().getGroup_1_1()); 
                    // InternalBPMN_translator.g:862:3: ( rule__Http_data__Group_1_1__0 )
                    // InternalBPMN_translator.g:862:4: rule__Http_data__Group_1_1__0
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
                    // InternalBPMN_translator.g:866:2: ( ( rule__Http_data__Group_1_2__0 ) )
                    {
                    // InternalBPMN_translator.g:866:2: ( ( rule__Http_data__Group_1_2__0 ) )
                    // InternalBPMN_translator.g:867:3: ( rule__Http_data__Group_1_2__0 )
                    {
                     before(grammarAccess.getHttp_dataAccess().getGroup_1_2()); 
                    // InternalBPMN_translator.g:868:3: ( rule__Http_data__Group_1_2__0 )
                    // InternalBPMN_translator.g:868:4: rule__Http_data__Group_1_2__0
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
                    // InternalBPMN_translator.g:872:2: ( ( rule__Http_data__Group_1_3__0 ) )
                    {
                    // InternalBPMN_translator.g:872:2: ( ( rule__Http_data__Group_1_3__0 ) )
                    // InternalBPMN_translator.g:873:3: ( rule__Http_data__Group_1_3__0 )
                    {
                     before(grammarAccess.getHttp_dataAccess().getGroup_1_3()); 
                    // InternalBPMN_translator.g:874:3: ( rule__Http_data__Group_1_3__0 )
                    // InternalBPMN_translator.g:874:4: rule__Http_data__Group_1_3__0
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
                    // InternalBPMN_translator.g:878:2: ( ( rule__Http_data__Group_1_4__0 ) )
                    {
                    // InternalBPMN_translator.g:878:2: ( ( rule__Http_data__Group_1_4__0 ) )
                    // InternalBPMN_translator.g:879:3: ( rule__Http_data__Group_1_4__0 )
                    {
                     before(grammarAccess.getHttp_dataAccess().getGroup_1_4()); 
                    // InternalBPMN_translator.g:880:3: ( rule__Http_data__Group_1_4__0 )
                    // InternalBPMN_translator.g:880:4: rule__Http_data__Group_1_4__0
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
                    // InternalBPMN_translator.g:884:2: ( ( rule__Http_data__Group_1_5__0 ) )
                    {
                    // InternalBPMN_translator.g:884:2: ( ( rule__Http_data__Group_1_5__0 ) )
                    // InternalBPMN_translator.g:885:3: ( rule__Http_data__Group_1_5__0 )
                    {
                     before(grammarAccess.getHttp_dataAccess().getGroup_1_5()); 
                    // InternalBPMN_translator.g:886:3: ( rule__Http_data__Group_1_5__0 )
                    // InternalBPMN_translator.g:886:4: rule__Http_data__Group_1_5__0
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
                    // InternalBPMN_translator.g:890:2: ( ( rule__Http_data__Group_1_6__0 ) )
                    {
                    // InternalBPMN_translator.g:890:2: ( ( rule__Http_data__Group_1_6__0 ) )
                    // InternalBPMN_translator.g:891:3: ( rule__Http_data__Group_1_6__0 )
                    {
                     before(grammarAccess.getHttp_dataAccess().getGroup_1_6()); 
                    // InternalBPMN_translator.g:892:3: ( rule__Http_data__Group_1_6__0 )
                    // InternalBPMN_translator.g:892:4: rule__Http_data__Group_1_6__0
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
    // InternalBPMN_translator.g:900:1: rule__Mqtt_data__Alternatives_1 : ( ( ( rule__Mqtt_data__Group_1_0__0 ) ) | ( ( rule__Mqtt_data__Group_1_1__0 ) ) | ( ( rule__Mqtt_data__Group_1_2__0 ) ) | ( ( rule__Mqtt_data__Group_1_3__0 ) ) | ( ( rule__Mqtt_data__Group_1_4__0 ) ) | ( ( rule__Mqtt_data__Group_1_5__0 ) ) | ( ( rule__Mqtt_data__Group_1_6__0 ) ) );
    public final void rule__Mqtt_data__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:904:1: ( ( ( rule__Mqtt_data__Group_1_0__0 ) ) | ( ( rule__Mqtt_data__Group_1_1__0 ) ) | ( ( rule__Mqtt_data__Group_1_2__0 ) ) | ( ( rule__Mqtt_data__Group_1_3__0 ) ) | ( ( rule__Mqtt_data__Group_1_4__0 ) ) | ( ( rule__Mqtt_data__Group_1_5__0 ) ) | ( ( rule__Mqtt_data__Group_1_6__0 ) ) )
            int alt13=7;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt13=1;
                }
                break;
            case 52:
                {
                alt13=2;
                }
                break;
            case 53:
                {
                alt13=3;
                }
                break;
            case 54:
                {
                alt13=4;
                }
                break;
            case 51:
                {
                alt13=5;
                }
                break;
            case 55:
                {
                alt13=6;
                }
                break;
            case 57:
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
                    // InternalBPMN_translator.g:905:2: ( ( rule__Mqtt_data__Group_1_0__0 ) )
                    {
                    // InternalBPMN_translator.g:905:2: ( ( rule__Mqtt_data__Group_1_0__0 ) )
                    // InternalBPMN_translator.g:906:3: ( rule__Mqtt_data__Group_1_0__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_0()); 
                    // InternalBPMN_translator.g:907:3: ( rule__Mqtt_data__Group_1_0__0 )
                    // InternalBPMN_translator.g:907:4: rule__Mqtt_data__Group_1_0__0
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
                    // InternalBPMN_translator.g:911:2: ( ( rule__Mqtt_data__Group_1_1__0 ) )
                    {
                    // InternalBPMN_translator.g:911:2: ( ( rule__Mqtt_data__Group_1_1__0 ) )
                    // InternalBPMN_translator.g:912:3: ( rule__Mqtt_data__Group_1_1__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_1()); 
                    // InternalBPMN_translator.g:913:3: ( rule__Mqtt_data__Group_1_1__0 )
                    // InternalBPMN_translator.g:913:4: rule__Mqtt_data__Group_1_1__0
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
                    // InternalBPMN_translator.g:917:2: ( ( rule__Mqtt_data__Group_1_2__0 ) )
                    {
                    // InternalBPMN_translator.g:917:2: ( ( rule__Mqtt_data__Group_1_2__0 ) )
                    // InternalBPMN_translator.g:918:3: ( rule__Mqtt_data__Group_1_2__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_2()); 
                    // InternalBPMN_translator.g:919:3: ( rule__Mqtt_data__Group_1_2__0 )
                    // InternalBPMN_translator.g:919:4: rule__Mqtt_data__Group_1_2__0
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
                    // InternalBPMN_translator.g:923:2: ( ( rule__Mqtt_data__Group_1_3__0 ) )
                    {
                    // InternalBPMN_translator.g:923:2: ( ( rule__Mqtt_data__Group_1_3__0 ) )
                    // InternalBPMN_translator.g:924:3: ( rule__Mqtt_data__Group_1_3__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_3()); 
                    // InternalBPMN_translator.g:925:3: ( rule__Mqtt_data__Group_1_3__0 )
                    // InternalBPMN_translator.g:925:4: rule__Mqtt_data__Group_1_3__0
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
                    // InternalBPMN_translator.g:929:2: ( ( rule__Mqtt_data__Group_1_4__0 ) )
                    {
                    // InternalBPMN_translator.g:929:2: ( ( rule__Mqtt_data__Group_1_4__0 ) )
                    // InternalBPMN_translator.g:930:3: ( rule__Mqtt_data__Group_1_4__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_4()); 
                    // InternalBPMN_translator.g:931:3: ( rule__Mqtt_data__Group_1_4__0 )
                    // InternalBPMN_translator.g:931:4: rule__Mqtt_data__Group_1_4__0
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
                    // InternalBPMN_translator.g:935:2: ( ( rule__Mqtt_data__Group_1_5__0 ) )
                    {
                    // InternalBPMN_translator.g:935:2: ( ( rule__Mqtt_data__Group_1_5__0 ) )
                    // InternalBPMN_translator.g:936:3: ( rule__Mqtt_data__Group_1_5__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_5()); 
                    // InternalBPMN_translator.g:937:3: ( rule__Mqtt_data__Group_1_5__0 )
                    // InternalBPMN_translator.g:937:4: rule__Mqtt_data__Group_1_5__0
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
                    // InternalBPMN_translator.g:941:2: ( ( rule__Mqtt_data__Group_1_6__0 ) )
                    {
                    // InternalBPMN_translator.g:941:2: ( ( rule__Mqtt_data__Group_1_6__0 ) )
                    // InternalBPMN_translator.g:942:3: ( rule__Mqtt_data__Group_1_6__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_6()); 
                    // InternalBPMN_translator.g:943:3: ( rule__Mqtt_data__Group_1_6__0 )
                    // InternalBPMN_translator.g:943:4: rule__Mqtt_data__Group_1_6__0
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
    // InternalBPMN_translator.g:951:1: rule__Mqtt_data__Alternatives_1_6_2 : ( ( ( rule__Mqtt_data__Group_1_6_2_0__0 ) ) | ( ( rule__Mqtt_data__Group_1_6_2_1__0 ) ) );
    public final void rule__Mqtt_data__Alternatives_1_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:955:1: ( ( ( rule__Mqtt_data__Group_1_6_2_0__0 ) ) | ( ( rule__Mqtt_data__Group_1_6_2_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==56) ) {
                alt14=1;
            }
            else if ( (LA14_0==50) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalBPMN_translator.g:956:2: ( ( rule__Mqtt_data__Group_1_6_2_0__0 ) )
                    {
                    // InternalBPMN_translator.g:956:2: ( ( rule__Mqtt_data__Group_1_6_2_0__0 ) )
                    // InternalBPMN_translator.g:957:3: ( rule__Mqtt_data__Group_1_6_2_0__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_6_2_0()); 
                    // InternalBPMN_translator.g:958:3: ( rule__Mqtt_data__Group_1_6_2_0__0 )
                    // InternalBPMN_translator.g:958:4: rule__Mqtt_data__Group_1_6_2_0__0
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
                    // InternalBPMN_translator.g:962:2: ( ( rule__Mqtt_data__Group_1_6_2_1__0 ) )
                    {
                    // InternalBPMN_translator.g:962:2: ( ( rule__Mqtt_data__Group_1_6_2_1__0 ) )
                    // InternalBPMN_translator.g:963:3: ( rule__Mqtt_data__Group_1_6_2_1__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_6_2_1()); 
                    // InternalBPMN_translator.g:964:3: ( rule__Mqtt_data__Group_1_6_2_1__0 )
                    // InternalBPMN_translator.g:964:4: rule__Mqtt_data__Group_1_6_2_1__0
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


    // $ANTLR start "rule__Mqtt_data__ValueAlternatives_1_6_2_1_2_0"
    // InternalBPMN_translator.g:972:1: rule__Mqtt_data__ValueAlternatives_1_6_2_1_2_0 : ( ( RULE_STRING ) | ( rulevariables ) );
    public final void rule__Mqtt_data__ValueAlternatives_1_6_2_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:976:1: ( ( RULE_STRING ) | ( rulevariables ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_BODY||LA15_0==38||LA15_0==42) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalBPMN_translator.g:977:2: ( RULE_STRING )
                    {
                    // InternalBPMN_translator.g:977:2: ( RULE_STRING )
                    // InternalBPMN_translator.g:978:3: RULE_STRING
                    {
                     before(grammarAccess.getMqtt_dataAccess().getValueSTRINGTerminalRuleCall_1_6_2_1_2_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getMqtt_dataAccess().getValueSTRINGTerminalRuleCall_1_6_2_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:983:2: ( rulevariables )
                    {
                    // InternalBPMN_translator.g:983:2: ( rulevariables )
                    // InternalBPMN_translator.g:984:3: rulevariables
                    {
                     before(grammarAccess.getMqtt_dataAccess().getValueVariablesParserRuleCall_1_6_2_1_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulevariables();

                    state._fsp--;

                     after(grammarAccess.getMqtt_dataAccess().getValueVariablesParserRuleCall_1_6_2_1_2_0_1()); 

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
    // $ANTLR end "rule__Mqtt_data__ValueAlternatives_1_6_2_1_2_0"


    // $ANTLR start "rule__Sensor__Alternatives"
    // InternalBPMN_translator.g:993:1: rule__Sensor__Alternatives : ( ( ( rule__Sensor__Group_0__0 ) ) | ( ( rule__Sensor__Group_1__0 ) ) | ( ( rule__Sensor__Group_2__0 ) ) | ( ( rule__Sensor__Group_3__0 ) ) );
    public final void rule__Sensor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:997:1: ( ( ( rule__Sensor__Group_0__0 ) ) | ( ( rule__Sensor__Group_1__0 ) ) | ( ( rule__Sensor__Group_2__0 ) ) | ( ( rule__Sensor__Group_3__0 ) ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt16=1;
                }
                break;
            case 42:
                {
                alt16=2;
                }
                break;
            case 65:
                {
                alt16=3;
                }
                break;
            case 66:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalBPMN_translator.g:998:2: ( ( rule__Sensor__Group_0__0 ) )
                    {
                    // InternalBPMN_translator.g:998:2: ( ( rule__Sensor__Group_0__0 ) )
                    // InternalBPMN_translator.g:999:3: ( rule__Sensor__Group_0__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_0()); 
                    // InternalBPMN_translator.g:1000:3: ( rule__Sensor__Group_0__0 )
                    // InternalBPMN_translator.g:1000:4: rule__Sensor__Group_0__0
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
                    // InternalBPMN_translator.g:1004:2: ( ( rule__Sensor__Group_1__0 ) )
                    {
                    // InternalBPMN_translator.g:1004:2: ( ( rule__Sensor__Group_1__0 ) )
                    // InternalBPMN_translator.g:1005:3: ( rule__Sensor__Group_1__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_1()); 
                    // InternalBPMN_translator.g:1006:3: ( rule__Sensor__Group_1__0 )
                    // InternalBPMN_translator.g:1006:4: rule__Sensor__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSensorAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBPMN_translator.g:1010:2: ( ( rule__Sensor__Group_2__0 ) )
                    {
                    // InternalBPMN_translator.g:1010:2: ( ( rule__Sensor__Group_2__0 ) )
                    // InternalBPMN_translator.g:1011:3: ( rule__Sensor__Group_2__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_2()); 
                    // InternalBPMN_translator.g:1012:3: ( rule__Sensor__Group_2__0 )
                    // InternalBPMN_translator.g:1012:4: rule__Sensor__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSensorAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBPMN_translator.g:1016:2: ( ( rule__Sensor__Group_3__0 ) )
                    {
                    // InternalBPMN_translator.g:1016:2: ( ( rule__Sensor__Group_3__0 ) )
                    // InternalBPMN_translator.g:1017:3: ( rule__Sensor__Group_3__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_3()); 
                    // InternalBPMN_translator.g:1018:3: ( rule__Sensor__Group_3__0 )
                    // InternalBPMN_translator.g:1018:4: rule__Sensor__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSensorAccess().getGroup_3()); 

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
    // InternalBPMN_translator.g:1026:1: rule__Sensor_data__Alternatives_1 : ( ( ( rule__Sensor_data__Group_1_0__0 ) ) | ( ( rule__Sensor_data__Group_1_1__0 ) ) | ( ( rule__Sensor_data__Group_1_2__0 ) ) );
    public final void rule__Sensor_data__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1030:1: ( ( ( rule__Sensor_data__Group_1_0__0 ) ) | ( ( rule__Sensor_data__Group_1_1__0 ) ) | ( ( rule__Sensor_data__Group_1_2__0 ) ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt17=1;
                }
                break;
            case 61:
                {
                alt17=2;
                }
                break;
            case 62:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalBPMN_translator.g:1031:2: ( ( rule__Sensor_data__Group_1_0__0 ) )
                    {
                    // InternalBPMN_translator.g:1031:2: ( ( rule__Sensor_data__Group_1_0__0 ) )
                    // InternalBPMN_translator.g:1032:3: ( rule__Sensor_data__Group_1_0__0 )
                    {
                     before(grammarAccess.getSensor_dataAccess().getGroup_1_0()); 
                    // InternalBPMN_translator.g:1033:3: ( rule__Sensor_data__Group_1_0__0 )
                    // InternalBPMN_translator.g:1033:4: rule__Sensor_data__Group_1_0__0
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
                    // InternalBPMN_translator.g:1037:2: ( ( rule__Sensor_data__Group_1_1__0 ) )
                    {
                    // InternalBPMN_translator.g:1037:2: ( ( rule__Sensor_data__Group_1_1__0 ) )
                    // InternalBPMN_translator.g:1038:3: ( rule__Sensor_data__Group_1_1__0 )
                    {
                     before(grammarAccess.getSensor_dataAccess().getGroup_1_1()); 
                    // InternalBPMN_translator.g:1039:3: ( rule__Sensor_data__Group_1_1__0 )
                    // InternalBPMN_translator.g:1039:4: rule__Sensor_data__Group_1_1__0
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
                    // InternalBPMN_translator.g:1043:2: ( ( rule__Sensor_data__Group_1_2__0 ) )
                    {
                    // InternalBPMN_translator.g:1043:2: ( ( rule__Sensor_data__Group_1_2__0 ) )
                    // InternalBPMN_translator.g:1044:3: ( rule__Sensor_data__Group_1_2__0 )
                    {
                     before(grammarAccess.getSensor_dataAccess().getGroup_1_2()); 
                    // InternalBPMN_translator.g:1045:3: ( rule__Sensor_data__Group_1_2__0 )
                    // InternalBPMN_translator.g:1045:4: rule__Sensor_data__Group_1_2__0
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
    // InternalBPMN_translator.g:1053:1: rule__Xml__Group__0 : rule__Xml__Group__0__Impl rule__Xml__Group__1 ;
    public final void rule__Xml__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1057:1: ( rule__Xml__Group__0__Impl rule__Xml__Group__1 )
            // InternalBPMN_translator.g:1058:2: rule__Xml__Group__0__Impl rule__Xml__Group__1
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
    // InternalBPMN_translator.g:1065:1: rule__Xml__Group__0__Impl : ( () ) ;
    public final void rule__Xml__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1069:1: ( ( () ) )
            // InternalBPMN_translator.g:1070:1: ( () )
            {
            // InternalBPMN_translator.g:1070:1: ( () )
            // InternalBPMN_translator.g:1071:2: ()
            {
             before(grammarAccess.getXmlAccess().getXmlAction_0()); 
            // InternalBPMN_translator.g:1072:2: ()
            // InternalBPMN_translator.g:1072:3: 
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
    // InternalBPMN_translator.g:1080:1: rule__Xml__Group__1 : rule__Xml__Group__1__Impl rule__Xml__Group__2 ;
    public final void rule__Xml__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1084:1: ( rule__Xml__Group__1__Impl rule__Xml__Group__2 )
            // InternalBPMN_translator.g:1085:2: rule__Xml__Group__1__Impl rule__Xml__Group__2
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
    // InternalBPMN_translator.g:1092:1: rule__Xml__Group__1__Impl : ( ( ruleprolog )? ) ;
    public final void rule__Xml__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1096:1: ( ( ( ruleprolog )? ) )
            // InternalBPMN_translator.g:1097:1: ( ( ruleprolog )? )
            {
            // InternalBPMN_translator.g:1097:1: ( ( ruleprolog )? )
            // InternalBPMN_translator.g:1098:2: ( ruleprolog )?
            {
             before(grammarAccess.getXmlAccess().getPrologParserRuleCall_1()); 
            // InternalBPMN_translator.g:1099:2: ( ruleprolog )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBPMN_translator.g:1099:3: ruleprolog
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
    // InternalBPMN_translator.g:1107:1: rule__Xml__Group__2 : rule__Xml__Group__2__Impl ;
    public final void rule__Xml__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1111:1: ( rule__Xml__Group__2__Impl )
            // InternalBPMN_translator.g:1112:2: rule__Xml__Group__2__Impl
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
    // InternalBPMN_translator.g:1118:1: rule__Xml__Group__2__Impl : ( ( rule__Xml__ElementsAssignment_2 )* ) ;
    public final void rule__Xml__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1122:1: ( ( ( rule__Xml__ElementsAssignment_2 )* ) )
            // InternalBPMN_translator.g:1123:1: ( ( rule__Xml__ElementsAssignment_2 )* )
            {
            // InternalBPMN_translator.g:1123:1: ( ( rule__Xml__ElementsAssignment_2 )* )
            // InternalBPMN_translator.g:1124:2: ( rule__Xml__ElementsAssignment_2 )*
            {
             before(grammarAccess.getXmlAccess().getElementsAssignment_2()); 
            // InternalBPMN_translator.g:1125:2: ( rule__Xml__ElementsAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==33) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBPMN_translator.g:1125:3: rule__Xml__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Xml__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getXmlAccess().getElementsAssignment_2()); 

            }


            }

        }
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
    // InternalBPMN_translator.g:1134:1: rule__Prolog__Group__0 : rule__Prolog__Group__0__Impl rule__Prolog__Group__1 ;
    public final void rule__Prolog__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1138:1: ( rule__Prolog__Group__0__Impl rule__Prolog__Group__1 )
            // InternalBPMN_translator.g:1139:2: rule__Prolog__Group__0__Impl rule__Prolog__Group__1
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
    // InternalBPMN_translator.g:1146:1: rule__Prolog__Group__0__Impl : ( '<?' ) ;
    public final void rule__Prolog__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1150:1: ( ( '<?' ) )
            // InternalBPMN_translator.g:1151:1: ( '<?' )
            {
            // InternalBPMN_translator.g:1151:1: ( '<?' )
            // InternalBPMN_translator.g:1152:2: '<?'
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
    // InternalBPMN_translator.g:1161:1: rule__Prolog__Group__1 : rule__Prolog__Group__1__Impl rule__Prolog__Group__2 ;
    public final void rule__Prolog__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1165:1: ( rule__Prolog__Group__1__Impl rule__Prolog__Group__2 )
            // InternalBPMN_translator.g:1166:2: rule__Prolog__Group__1__Impl rule__Prolog__Group__2
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
    // InternalBPMN_translator.g:1173:1: rule__Prolog__Group__1__Impl : ( RULE_HEAD ) ;
    public final void rule__Prolog__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1177:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:1178:1: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:1178:1: ( RULE_HEAD )
            // InternalBPMN_translator.g:1179:2: RULE_HEAD
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
    // InternalBPMN_translator.g:1188:1: rule__Prolog__Group__2 : rule__Prolog__Group__2__Impl rule__Prolog__Group__3 ;
    public final void rule__Prolog__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1192:1: ( rule__Prolog__Group__2__Impl rule__Prolog__Group__3 )
            // InternalBPMN_translator.g:1193:2: rule__Prolog__Group__2__Impl rule__Prolog__Group__3
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
    // InternalBPMN_translator.g:1200:1: rule__Prolog__Group__2__Impl : ( 'version=' ) ;
    public final void rule__Prolog__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1204:1: ( ( 'version=' ) )
            // InternalBPMN_translator.g:1205:1: ( 'version=' )
            {
            // InternalBPMN_translator.g:1205:1: ( 'version=' )
            // InternalBPMN_translator.g:1206:2: 'version='
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
    // InternalBPMN_translator.g:1215:1: rule__Prolog__Group__3 : rule__Prolog__Group__3__Impl rule__Prolog__Group__4 ;
    public final void rule__Prolog__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1219:1: ( rule__Prolog__Group__3__Impl rule__Prolog__Group__4 )
            // InternalBPMN_translator.g:1220:2: rule__Prolog__Group__3__Impl rule__Prolog__Group__4
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
    // InternalBPMN_translator.g:1227:1: rule__Prolog__Group__3__Impl : ( RULE_STRING ) ;
    public final void rule__Prolog__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1231:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:1232:1: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:1232:1: ( RULE_STRING )
            // InternalBPMN_translator.g:1233:2: RULE_STRING
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
    // InternalBPMN_translator.g:1242:1: rule__Prolog__Group__4 : rule__Prolog__Group__4__Impl rule__Prolog__Group__5 ;
    public final void rule__Prolog__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1246:1: ( rule__Prolog__Group__4__Impl rule__Prolog__Group__5 )
            // InternalBPMN_translator.g:1247:2: rule__Prolog__Group__4__Impl rule__Prolog__Group__5
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
    // InternalBPMN_translator.g:1254:1: rule__Prolog__Group__4__Impl : ( 'encoding=' ) ;
    public final void rule__Prolog__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1258:1: ( ( 'encoding=' ) )
            // InternalBPMN_translator.g:1259:1: ( 'encoding=' )
            {
            // InternalBPMN_translator.g:1259:1: ( 'encoding=' )
            // InternalBPMN_translator.g:1260:2: 'encoding='
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
    // InternalBPMN_translator.g:1269:1: rule__Prolog__Group__5 : rule__Prolog__Group__5__Impl rule__Prolog__Group__6 ;
    public final void rule__Prolog__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1273:1: ( rule__Prolog__Group__5__Impl rule__Prolog__Group__6 )
            // InternalBPMN_translator.g:1274:2: rule__Prolog__Group__5__Impl rule__Prolog__Group__6
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
    // InternalBPMN_translator.g:1281:1: rule__Prolog__Group__5__Impl : ( RULE_STRING ) ;
    public final void rule__Prolog__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1285:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:1286:1: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:1286:1: ( RULE_STRING )
            // InternalBPMN_translator.g:1287:2: RULE_STRING
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
    // InternalBPMN_translator.g:1296:1: rule__Prolog__Group__6 : rule__Prolog__Group__6__Impl ;
    public final void rule__Prolog__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1300:1: ( rule__Prolog__Group__6__Impl )
            // InternalBPMN_translator.g:1301:2: rule__Prolog__Group__6__Impl
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
    // InternalBPMN_translator.g:1307:1: rule__Prolog__Group__6__Impl : ( '?>' ) ;
    public final void rule__Prolog__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1311:1: ( ( '?>' ) )
            // InternalBPMN_translator.g:1312:1: ( '?>' )
            {
            // InternalBPMN_translator.g:1312:1: ( '?>' )
            // InternalBPMN_translator.g:1313:2: '?>'
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
    // InternalBPMN_translator.g:1323:1: rule__Element__Group_0__0 : rule__Element__Group_0__0__Impl rule__Element__Group_0__1 ;
    public final void rule__Element__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1327:1: ( rule__Element__Group_0__0__Impl rule__Element__Group_0__1 )
            // InternalBPMN_translator.g:1328:2: rule__Element__Group_0__0__Impl rule__Element__Group_0__1
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
    // InternalBPMN_translator.g:1335:1: rule__Element__Group_0__0__Impl : ( ( rule__Element__OpenAssignment_0_0 ) ) ;
    public final void rule__Element__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1339:1: ( ( ( rule__Element__OpenAssignment_0_0 ) ) )
            // InternalBPMN_translator.g:1340:1: ( ( rule__Element__OpenAssignment_0_0 ) )
            {
            // InternalBPMN_translator.g:1340:1: ( ( rule__Element__OpenAssignment_0_0 ) )
            // InternalBPMN_translator.g:1341:2: ( rule__Element__OpenAssignment_0_0 )
            {
             before(grammarAccess.getElementAccess().getOpenAssignment_0_0()); 
            // InternalBPMN_translator.g:1342:2: ( rule__Element__OpenAssignment_0_0 )
            // InternalBPMN_translator.g:1342:3: rule__Element__OpenAssignment_0_0
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
    // InternalBPMN_translator.g:1350:1: rule__Element__Group_0__1 : rule__Element__Group_0__1__Impl rule__Element__Group_0__2 ;
    public final void rule__Element__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1354:1: ( rule__Element__Group_0__1__Impl rule__Element__Group_0__2 )
            // InternalBPMN_translator.g:1355:2: rule__Element__Group_0__1__Impl rule__Element__Group_0__2
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
    // InternalBPMN_translator.g:1362:1: rule__Element__Group_0__1__Impl : ( ( rule__Element__ContentsAssignment_0_1 ) ) ;
    public final void rule__Element__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1366:1: ( ( ( rule__Element__ContentsAssignment_0_1 ) ) )
            // InternalBPMN_translator.g:1367:1: ( ( rule__Element__ContentsAssignment_0_1 ) )
            {
            // InternalBPMN_translator.g:1367:1: ( ( rule__Element__ContentsAssignment_0_1 ) )
            // InternalBPMN_translator.g:1368:2: ( rule__Element__ContentsAssignment_0_1 )
            {
             before(grammarAccess.getElementAccess().getContentsAssignment_0_1()); 
            // InternalBPMN_translator.g:1369:2: ( rule__Element__ContentsAssignment_0_1 )
            // InternalBPMN_translator.g:1369:3: rule__Element__ContentsAssignment_0_1
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
    // InternalBPMN_translator.g:1377:1: rule__Element__Group_0__2 : rule__Element__Group_0__2__Impl ;
    public final void rule__Element__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1381:1: ( rule__Element__Group_0__2__Impl )
            // InternalBPMN_translator.g:1382:2: rule__Element__Group_0__2__Impl
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
    // InternalBPMN_translator.g:1388:1: rule__Element__Group_0__2__Impl : ( ( rule__Element__Close_tagAssignment_0_2 ) ) ;
    public final void rule__Element__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1392:1: ( ( ( rule__Element__Close_tagAssignment_0_2 ) ) )
            // InternalBPMN_translator.g:1393:1: ( ( rule__Element__Close_tagAssignment_0_2 ) )
            {
            // InternalBPMN_translator.g:1393:1: ( ( rule__Element__Close_tagAssignment_0_2 ) )
            // InternalBPMN_translator.g:1394:2: ( rule__Element__Close_tagAssignment_0_2 )
            {
             before(grammarAccess.getElementAccess().getClose_tagAssignment_0_2()); 
            // InternalBPMN_translator.g:1395:2: ( rule__Element__Close_tagAssignment_0_2 )
            // InternalBPMN_translator.g:1395:3: rule__Element__Close_tagAssignment_0_2
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
    // InternalBPMN_translator.g:1404:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1408:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // InternalBPMN_translator.g:1409:2: rule__Content__Group__0__Impl rule__Content__Group__1
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
    // InternalBPMN_translator.g:1416:1: rule__Content__Group__0__Impl : ( () ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1420:1: ( ( () ) )
            // InternalBPMN_translator.g:1421:1: ( () )
            {
            // InternalBPMN_translator.g:1421:1: ( () )
            // InternalBPMN_translator.g:1422:2: ()
            {
             before(grammarAccess.getContentAccess().getContentAction_0()); 
            // InternalBPMN_translator.g:1423:2: ()
            // InternalBPMN_translator.g:1423:3: 
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
    // InternalBPMN_translator.g:1431:1: rule__Content__Group__1 : rule__Content__Group__1__Impl ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1435:1: ( rule__Content__Group__1__Impl )
            // InternalBPMN_translator.g:1436:2: rule__Content__Group__1__Impl
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
    // InternalBPMN_translator.g:1442:1: rule__Content__Group__1__Impl : ( ( rule__Content__Alternatives_1 )* ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1446:1: ( ( ( rule__Content__Alternatives_1 )* ) )
            // InternalBPMN_translator.g:1447:1: ( ( rule__Content__Alternatives_1 )* )
            {
            // InternalBPMN_translator.g:1447:1: ( ( rule__Content__Alternatives_1 )* )
            // InternalBPMN_translator.g:1448:2: ( rule__Content__Alternatives_1 )*
            {
             before(grammarAccess.getContentAccess().getAlternatives_1()); 
            // InternalBPMN_translator.g:1449:2: ( rule__Content__Alternatives_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_BODY && LA20_0<=RULE_STRING)||LA20_0==RULE_KEYWORDS||(LA20_0>=14 && LA20_0<=15)||(LA20_0>=25 && LA20_0<=26)||LA20_0==33||LA20_0==38||LA20_0==42) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBPMN_translator.g:1449:3: rule__Content__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Content__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalBPMN_translator.g:1458:1: rule__Content__Group_1_0__0 : rule__Content__Group_1_0__0__Impl rule__Content__Group_1_0__1 ;
    public final void rule__Content__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1462:1: ( rule__Content__Group_1_0__0__Impl rule__Content__Group_1_0__1 )
            // InternalBPMN_translator.g:1463:2: rule__Content__Group_1_0__0__Impl rule__Content__Group_1_0__1
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
    // InternalBPMN_translator.g:1470:1: rule__Content__Group_1_0__0__Impl : ( ( rule__Content__TypeAssignment_1_0_0 ) ) ;
    public final void rule__Content__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1474:1: ( ( ( rule__Content__TypeAssignment_1_0_0 ) ) )
            // InternalBPMN_translator.g:1475:1: ( ( rule__Content__TypeAssignment_1_0_0 ) )
            {
            // InternalBPMN_translator.g:1475:1: ( ( rule__Content__TypeAssignment_1_0_0 ) )
            // InternalBPMN_translator.g:1476:2: ( rule__Content__TypeAssignment_1_0_0 )
            {
             before(grammarAccess.getContentAccess().getTypeAssignment_1_0_0()); 
            // InternalBPMN_translator.g:1477:2: ( rule__Content__TypeAssignment_1_0_0 )
            // InternalBPMN_translator.g:1477:3: rule__Content__TypeAssignment_1_0_0
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
    // InternalBPMN_translator.g:1485:1: rule__Content__Group_1_0__1 : rule__Content__Group_1_0__1__Impl rule__Content__Group_1_0__2 ;
    public final void rule__Content__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1489:1: ( rule__Content__Group_1_0__1__Impl rule__Content__Group_1_0__2 )
            // InternalBPMN_translator.g:1490:2: rule__Content__Group_1_0__1__Impl rule__Content__Group_1_0__2
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
    // InternalBPMN_translator.g:1497:1: rule__Content__Group_1_0__1__Impl : ( '{' ) ;
    public final void rule__Content__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1501:1: ( ( '{' ) )
            // InternalBPMN_translator.g:1502:1: ( '{' )
            {
            // InternalBPMN_translator.g:1502:1: ( '{' )
            // InternalBPMN_translator.g:1503:2: '{'
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
    // InternalBPMN_translator.g:1512:1: rule__Content__Group_1_0__2 : rule__Content__Group_1_0__2__Impl rule__Content__Group_1_0__3 ;
    public final void rule__Content__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1516:1: ( rule__Content__Group_1_0__2__Impl rule__Content__Group_1_0__3 )
            // InternalBPMN_translator.g:1517:2: rule__Content__Group_1_0__2__Impl rule__Content__Group_1_0__3
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
    // InternalBPMN_translator.g:1524:1: rule__Content__Group_1_0__2__Impl : ( ( rule__Content__CodexAssignment_1_0_2 ) ) ;
    public final void rule__Content__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1528:1: ( ( ( rule__Content__CodexAssignment_1_0_2 ) ) )
            // InternalBPMN_translator.g:1529:1: ( ( rule__Content__CodexAssignment_1_0_2 ) )
            {
            // InternalBPMN_translator.g:1529:1: ( ( rule__Content__CodexAssignment_1_0_2 ) )
            // InternalBPMN_translator.g:1530:2: ( rule__Content__CodexAssignment_1_0_2 )
            {
             before(grammarAccess.getContentAccess().getCodexAssignment_1_0_2()); 
            // InternalBPMN_translator.g:1531:2: ( rule__Content__CodexAssignment_1_0_2 )
            // InternalBPMN_translator.g:1531:3: rule__Content__CodexAssignment_1_0_2
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
    // InternalBPMN_translator.g:1539:1: rule__Content__Group_1_0__3 : rule__Content__Group_1_0__3__Impl ;
    public final void rule__Content__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1543:1: ( rule__Content__Group_1_0__3__Impl )
            // InternalBPMN_translator.g:1544:2: rule__Content__Group_1_0__3__Impl
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
    // InternalBPMN_translator.g:1550:1: rule__Content__Group_1_0__3__Impl : ( '}' ) ;
    public final void rule__Content__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1554:1: ( ( '}' ) )
            // InternalBPMN_translator.g:1555:1: ( '}' )
            {
            // InternalBPMN_translator.g:1555:1: ( '}' )
            // InternalBPMN_translator.g:1556:2: '}'
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
    // InternalBPMN_translator.g:1566:1: rule__Content__Group_1_2__0 : rule__Content__Group_1_2__0__Impl rule__Content__Group_1_2__1 ;
    public final void rule__Content__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1570:1: ( rule__Content__Group_1_2__0__Impl rule__Content__Group_1_2__1 )
            // InternalBPMN_translator.g:1571:2: rule__Content__Group_1_2__0__Impl rule__Content__Group_1_2__1
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
    // InternalBPMN_translator.g:1578:1: rule__Content__Group_1_2__0__Impl : ( ( rule__Content__BodyAssignment_1_2_0 )* ) ;
    public final void rule__Content__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1582:1: ( ( ( rule__Content__BodyAssignment_1_2_0 )* ) )
            // InternalBPMN_translator.g:1583:1: ( ( rule__Content__BodyAssignment_1_2_0 )* )
            {
            // InternalBPMN_translator.g:1583:1: ( ( rule__Content__BodyAssignment_1_2_0 )* )
            // InternalBPMN_translator.g:1584:2: ( rule__Content__BodyAssignment_1_2_0 )*
            {
             before(grammarAccess.getContentAccess().getBodyAssignment_1_2_0()); 
            // InternalBPMN_translator.g:1585:2: ( rule__Content__BodyAssignment_1_2_0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=25 && LA21_0<=26)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBPMN_translator.g:1585:3: rule__Content__BodyAssignment_1_2_0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Content__BodyAssignment_1_2_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalBPMN_translator.g:1593:1: rule__Content__Group_1_2__1 : rule__Content__Group_1_2__1__Impl rule__Content__Group_1_2__2 ;
    public final void rule__Content__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1597:1: ( rule__Content__Group_1_2__1__Impl rule__Content__Group_1_2__2 )
            // InternalBPMN_translator.g:1598:2: rule__Content__Group_1_2__1__Impl rule__Content__Group_1_2__2
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
    // InternalBPMN_translator.g:1605:1: rule__Content__Group_1_2__1__Impl : ( ( rule__Content__BodyAssignment_1_2_1 ) ) ;
    public final void rule__Content__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1609:1: ( ( ( rule__Content__BodyAssignment_1_2_1 ) ) )
            // InternalBPMN_translator.g:1610:1: ( ( rule__Content__BodyAssignment_1_2_1 ) )
            {
            // InternalBPMN_translator.g:1610:1: ( ( rule__Content__BodyAssignment_1_2_1 ) )
            // InternalBPMN_translator.g:1611:2: ( rule__Content__BodyAssignment_1_2_1 )
            {
             before(grammarAccess.getContentAccess().getBodyAssignment_1_2_1()); 
            // InternalBPMN_translator.g:1612:2: ( rule__Content__BodyAssignment_1_2_1 )
            // InternalBPMN_translator.g:1612:3: rule__Content__BodyAssignment_1_2_1
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
    // InternalBPMN_translator.g:1620:1: rule__Content__Group_1_2__2 : rule__Content__Group_1_2__2__Impl ;
    public final void rule__Content__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1624:1: ( rule__Content__Group_1_2__2__Impl )
            // InternalBPMN_translator.g:1625:2: rule__Content__Group_1_2__2__Impl
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
    // InternalBPMN_translator.g:1631:1: rule__Content__Group_1_2__2__Impl : ( ( rule__Content__BodyAssignment_1_2_2 )* ) ;
    public final void rule__Content__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1635:1: ( ( ( rule__Content__BodyAssignment_1_2_2 )* ) )
            // InternalBPMN_translator.g:1636:1: ( ( rule__Content__BodyAssignment_1_2_2 )* )
            {
            // InternalBPMN_translator.g:1636:1: ( ( rule__Content__BodyAssignment_1_2_2 )* )
            // InternalBPMN_translator.g:1637:2: ( rule__Content__BodyAssignment_1_2_2 )*
            {
             before(grammarAccess.getContentAccess().getBodyAssignment_1_2_2()); 
            // InternalBPMN_translator.g:1638:2: ( rule__Content__BodyAssignment_1_2_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=16 && LA22_0<=24)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBPMN_translator.g:1638:3: rule__Content__BodyAssignment_1_2_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Content__BodyAssignment_1_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalBPMN_translator.g:1647:1: rule__Open__Group__0 : rule__Open__Group__0__Impl rule__Open__Group__1 ;
    public final void rule__Open__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1651:1: ( rule__Open__Group__0__Impl rule__Open__Group__1 )
            // InternalBPMN_translator.g:1652:2: rule__Open__Group__0__Impl rule__Open__Group__1
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
    // InternalBPMN_translator.g:1659:1: rule__Open__Group__0__Impl : ( '<' ) ;
    public final void rule__Open__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1663:1: ( ( '<' ) )
            // InternalBPMN_translator.g:1664:1: ( '<' )
            {
            // InternalBPMN_translator.g:1664:1: ( '<' )
            // InternalBPMN_translator.g:1665:2: '<'
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
    // InternalBPMN_translator.g:1674:1: rule__Open__Group__1 : rule__Open__Group__1__Impl rule__Open__Group__2 ;
    public final void rule__Open__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1678:1: ( rule__Open__Group__1__Impl rule__Open__Group__2 )
            // InternalBPMN_translator.g:1679:2: rule__Open__Group__1__Impl rule__Open__Group__2
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
    // InternalBPMN_translator.g:1686:1: rule__Open__Group__1__Impl : ( ( rule__Open__HeadAssignment_1 ) ) ;
    public final void rule__Open__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1690:1: ( ( ( rule__Open__HeadAssignment_1 ) ) )
            // InternalBPMN_translator.g:1691:1: ( ( rule__Open__HeadAssignment_1 ) )
            {
            // InternalBPMN_translator.g:1691:1: ( ( rule__Open__HeadAssignment_1 ) )
            // InternalBPMN_translator.g:1692:2: ( rule__Open__HeadAssignment_1 )
            {
             before(grammarAccess.getOpenAccess().getHeadAssignment_1()); 
            // InternalBPMN_translator.g:1693:2: ( rule__Open__HeadAssignment_1 )
            // InternalBPMN_translator.g:1693:3: rule__Open__HeadAssignment_1
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
    // InternalBPMN_translator.g:1701:1: rule__Open__Group__2 : rule__Open__Group__2__Impl rule__Open__Group__3 ;
    public final void rule__Open__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1705:1: ( rule__Open__Group__2__Impl rule__Open__Group__3 )
            // InternalBPMN_translator.g:1706:2: rule__Open__Group__2__Impl rule__Open__Group__3
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
    // InternalBPMN_translator.g:1713:1: rule__Open__Group__2__Impl : ( ':' ) ;
    public final void rule__Open__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1717:1: ( ( ':' ) )
            // InternalBPMN_translator.g:1718:1: ( ':' )
            {
            // InternalBPMN_translator.g:1718:1: ( ':' )
            // InternalBPMN_translator.g:1719:2: ':'
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
    // InternalBPMN_translator.g:1728:1: rule__Open__Group__3 : rule__Open__Group__3__Impl rule__Open__Group__4 ;
    public final void rule__Open__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1732:1: ( rule__Open__Group__3__Impl rule__Open__Group__4 )
            // InternalBPMN_translator.g:1733:2: rule__Open__Group__3__Impl rule__Open__Group__4
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
    // InternalBPMN_translator.g:1740:1: rule__Open__Group__3__Impl : ( ( rule__Open__KeywordsAssignment_3 ) ) ;
    public final void rule__Open__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1744:1: ( ( ( rule__Open__KeywordsAssignment_3 ) ) )
            // InternalBPMN_translator.g:1745:1: ( ( rule__Open__KeywordsAssignment_3 ) )
            {
            // InternalBPMN_translator.g:1745:1: ( ( rule__Open__KeywordsAssignment_3 ) )
            // InternalBPMN_translator.g:1746:2: ( rule__Open__KeywordsAssignment_3 )
            {
             before(grammarAccess.getOpenAccess().getKeywordsAssignment_3()); 
            // InternalBPMN_translator.g:1747:2: ( rule__Open__KeywordsAssignment_3 )
            // InternalBPMN_translator.g:1747:3: rule__Open__KeywordsAssignment_3
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
    // InternalBPMN_translator.g:1755:1: rule__Open__Group__4 : rule__Open__Group__4__Impl rule__Open__Group__5 ;
    public final void rule__Open__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1759:1: ( rule__Open__Group__4__Impl rule__Open__Group__5 )
            // InternalBPMN_translator.g:1760:2: rule__Open__Group__4__Impl rule__Open__Group__5
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
    // InternalBPMN_translator.g:1767:1: rule__Open__Group__4__Impl : ( ( rule__Open__Alternatives_4 )* ) ;
    public final void rule__Open__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1771:1: ( ( ( rule__Open__Alternatives_4 )* ) )
            // InternalBPMN_translator.g:1772:1: ( ( rule__Open__Alternatives_4 )* )
            {
            // InternalBPMN_translator.g:1772:1: ( ( rule__Open__Alternatives_4 )* )
            // InternalBPMN_translator.g:1773:2: ( rule__Open__Alternatives_4 )*
            {
             before(grammarAccess.getOpenAccess().getAlternatives_4()); 
            // InternalBPMN_translator.g:1774:2: ( rule__Open__Alternatives_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_HEAD && LA23_0<=RULE_KEYWORDS)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBPMN_translator.g:1774:3: rule__Open__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Open__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalBPMN_translator.g:1782:1: rule__Open__Group__5 : rule__Open__Group__5__Impl ;
    public final void rule__Open__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1786:1: ( rule__Open__Group__5__Impl )
            // InternalBPMN_translator.g:1787:2: rule__Open__Group__5__Impl
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
    // InternalBPMN_translator.g:1793:1: rule__Open__Group__5__Impl : ( '>' ) ;
    public final void rule__Open__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1797:1: ( ( '>' ) )
            // InternalBPMN_translator.g:1798:1: ( '>' )
            {
            // InternalBPMN_translator.g:1798:1: ( '>' )
            // InternalBPMN_translator.g:1799:2: '>'
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
    // InternalBPMN_translator.g:1809:1: rule__Open__Group_4_0__0 : rule__Open__Group_4_0__0__Impl rule__Open__Group_4_0__1 ;
    public final void rule__Open__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1813:1: ( rule__Open__Group_4_0__0__Impl rule__Open__Group_4_0__1 )
            // InternalBPMN_translator.g:1814:2: rule__Open__Group_4_0__0__Impl rule__Open__Group_4_0__1
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
    // InternalBPMN_translator.g:1821:1: rule__Open__Group_4_0__0__Impl : ( ( rule__Open__Head1Assignment_4_0_0 ) ) ;
    public final void rule__Open__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1825:1: ( ( ( rule__Open__Head1Assignment_4_0_0 ) ) )
            // InternalBPMN_translator.g:1826:1: ( ( rule__Open__Head1Assignment_4_0_0 ) )
            {
            // InternalBPMN_translator.g:1826:1: ( ( rule__Open__Head1Assignment_4_0_0 ) )
            // InternalBPMN_translator.g:1827:2: ( rule__Open__Head1Assignment_4_0_0 )
            {
             before(grammarAccess.getOpenAccess().getHead1Assignment_4_0_0()); 
            // InternalBPMN_translator.g:1828:2: ( rule__Open__Head1Assignment_4_0_0 )
            // InternalBPMN_translator.g:1828:3: rule__Open__Head1Assignment_4_0_0
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
    // InternalBPMN_translator.g:1836:1: rule__Open__Group_4_0__1 : rule__Open__Group_4_0__1__Impl ;
    public final void rule__Open__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1840:1: ( rule__Open__Group_4_0__1__Impl )
            // InternalBPMN_translator.g:1841:2: rule__Open__Group_4_0__1__Impl
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
    // InternalBPMN_translator.g:1847:1: rule__Open__Group_4_0__1__Impl : ( ':' ) ;
    public final void rule__Open__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1851:1: ( ( ':' ) )
            // InternalBPMN_translator.g:1852:1: ( ':' )
            {
            // InternalBPMN_translator.g:1852:1: ( ':' )
            // InternalBPMN_translator.g:1853:2: ':'
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
    // InternalBPMN_translator.g:1863:1: rule__Open__Group_4_1__0 : rule__Open__Group_4_1__0__Impl rule__Open__Group_4_1__1 ;
    public final void rule__Open__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1867:1: ( rule__Open__Group_4_1__0__Impl rule__Open__Group_4_1__1 )
            // InternalBPMN_translator.g:1868:2: rule__Open__Group_4_1__0__Impl rule__Open__Group_4_1__1
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
    // InternalBPMN_translator.g:1875:1: rule__Open__Group_4_1__0__Impl : ( ( rule__Open__Alternatives_4_1_0 ) ) ;
    public final void rule__Open__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1879:1: ( ( ( rule__Open__Alternatives_4_1_0 ) ) )
            // InternalBPMN_translator.g:1880:1: ( ( rule__Open__Alternatives_4_1_0 ) )
            {
            // InternalBPMN_translator.g:1880:1: ( ( rule__Open__Alternatives_4_1_0 ) )
            // InternalBPMN_translator.g:1881:2: ( rule__Open__Alternatives_4_1_0 )
            {
             before(grammarAccess.getOpenAccess().getAlternatives_4_1_0()); 
            // InternalBPMN_translator.g:1882:2: ( rule__Open__Alternatives_4_1_0 )
            // InternalBPMN_translator.g:1882:3: rule__Open__Alternatives_4_1_0
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
    // InternalBPMN_translator.g:1890:1: rule__Open__Group_4_1__1 : rule__Open__Group_4_1__1__Impl rule__Open__Group_4_1__2 ;
    public final void rule__Open__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1894:1: ( rule__Open__Group_4_1__1__Impl rule__Open__Group_4_1__2 )
            // InternalBPMN_translator.g:1895:2: rule__Open__Group_4_1__1__Impl rule__Open__Group_4_1__2
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
    // InternalBPMN_translator.g:1902:1: rule__Open__Group_4_1__1__Impl : ( '=' ) ;
    public final void rule__Open__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1906:1: ( ( '=' ) )
            // InternalBPMN_translator.g:1907:1: ( '=' )
            {
            // InternalBPMN_translator.g:1907:1: ( '=' )
            // InternalBPMN_translator.g:1908:2: '='
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
    // InternalBPMN_translator.g:1917:1: rule__Open__Group_4_1__2 : rule__Open__Group_4_1__2__Impl ;
    public final void rule__Open__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1921:1: ( rule__Open__Group_4_1__2__Impl )
            // InternalBPMN_translator.g:1922:2: rule__Open__Group_4_1__2__Impl
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
    // InternalBPMN_translator.g:1928:1: rule__Open__Group_4_1__2__Impl : ( ( rule__Open__ValueAssignment_4_1_2 ) ) ;
    public final void rule__Open__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1932:1: ( ( ( rule__Open__ValueAssignment_4_1_2 ) ) )
            // InternalBPMN_translator.g:1933:1: ( ( rule__Open__ValueAssignment_4_1_2 ) )
            {
            // InternalBPMN_translator.g:1933:1: ( ( rule__Open__ValueAssignment_4_1_2 ) )
            // InternalBPMN_translator.g:1934:2: ( rule__Open__ValueAssignment_4_1_2 )
            {
             before(grammarAccess.getOpenAccess().getValueAssignment_4_1_2()); 
            // InternalBPMN_translator.g:1935:2: ( rule__Open__ValueAssignment_4_1_2 )
            // InternalBPMN_translator.g:1935:3: rule__Open__ValueAssignment_4_1_2
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
    // InternalBPMN_translator.g:1944:1: rule__Singleton__Group__0 : rule__Singleton__Group__0__Impl rule__Singleton__Group__1 ;
    public final void rule__Singleton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1948:1: ( rule__Singleton__Group__0__Impl rule__Singleton__Group__1 )
            // InternalBPMN_translator.g:1949:2: rule__Singleton__Group__0__Impl rule__Singleton__Group__1
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
    // InternalBPMN_translator.g:1956:1: rule__Singleton__Group__0__Impl : ( () ) ;
    public final void rule__Singleton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1960:1: ( ( () ) )
            // InternalBPMN_translator.g:1961:1: ( () )
            {
            // InternalBPMN_translator.g:1961:1: ( () )
            // InternalBPMN_translator.g:1962:2: ()
            {
             before(grammarAccess.getSingletonAccess().getSingletonAction_0()); 
            // InternalBPMN_translator.g:1963:2: ()
            // InternalBPMN_translator.g:1963:3: 
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
    // InternalBPMN_translator.g:1971:1: rule__Singleton__Group__1 : rule__Singleton__Group__1__Impl rule__Singleton__Group__2 ;
    public final void rule__Singleton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1975:1: ( rule__Singleton__Group__1__Impl rule__Singleton__Group__2 )
            // InternalBPMN_translator.g:1976:2: rule__Singleton__Group__1__Impl rule__Singleton__Group__2
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
    // InternalBPMN_translator.g:1983:1: rule__Singleton__Group__1__Impl : ( ( rule__Singleton__Group_1__0 ) ) ;
    public final void rule__Singleton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1987:1: ( ( ( rule__Singleton__Group_1__0 ) ) )
            // InternalBPMN_translator.g:1988:1: ( ( rule__Singleton__Group_1__0 ) )
            {
            // InternalBPMN_translator.g:1988:1: ( ( rule__Singleton__Group_1__0 ) )
            // InternalBPMN_translator.g:1989:2: ( rule__Singleton__Group_1__0 )
            {
             before(grammarAccess.getSingletonAccess().getGroup_1()); 
            // InternalBPMN_translator.g:1990:2: ( rule__Singleton__Group_1__0 )
            // InternalBPMN_translator.g:1990:3: rule__Singleton__Group_1__0
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
    // InternalBPMN_translator.g:1998:1: rule__Singleton__Group__2 : rule__Singleton__Group__2__Impl ;
    public final void rule__Singleton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2002:1: ( rule__Singleton__Group__2__Impl )
            // InternalBPMN_translator.g:2003:2: rule__Singleton__Group__2__Impl
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
    // InternalBPMN_translator.g:2009:1: rule__Singleton__Group__2__Impl : ( '/>' ) ;
    public final void rule__Singleton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2013:1: ( ( '/>' ) )
            // InternalBPMN_translator.g:2014:1: ( '/>' )
            {
            // InternalBPMN_translator.g:2014:1: ( '/>' )
            // InternalBPMN_translator.g:2015:2: '/>'
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
    // InternalBPMN_translator.g:2025:1: rule__Singleton__Group_1__0 : rule__Singleton__Group_1__0__Impl rule__Singleton__Group_1__1 ;
    public final void rule__Singleton__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2029:1: ( rule__Singleton__Group_1__0__Impl rule__Singleton__Group_1__1 )
            // InternalBPMN_translator.g:2030:2: rule__Singleton__Group_1__0__Impl rule__Singleton__Group_1__1
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
    // InternalBPMN_translator.g:2037:1: rule__Singleton__Group_1__0__Impl : ( '<' ) ;
    public final void rule__Singleton__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2041:1: ( ( '<' ) )
            // InternalBPMN_translator.g:2042:1: ( '<' )
            {
            // InternalBPMN_translator.g:2042:1: ( '<' )
            // InternalBPMN_translator.g:2043:2: '<'
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
    // InternalBPMN_translator.g:2052:1: rule__Singleton__Group_1__1 : rule__Singleton__Group_1__1__Impl rule__Singleton__Group_1__2 ;
    public final void rule__Singleton__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2056:1: ( rule__Singleton__Group_1__1__Impl rule__Singleton__Group_1__2 )
            // InternalBPMN_translator.g:2057:2: rule__Singleton__Group_1__1__Impl rule__Singleton__Group_1__2
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
    // InternalBPMN_translator.g:2064:1: rule__Singleton__Group_1__1__Impl : ( RULE_HEAD ) ;
    public final void rule__Singleton__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2068:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:2069:1: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:2069:1: ( RULE_HEAD )
            // InternalBPMN_translator.g:2070:2: RULE_HEAD
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
    // InternalBPMN_translator.g:2079:1: rule__Singleton__Group_1__2 : rule__Singleton__Group_1__2__Impl rule__Singleton__Group_1__3 ;
    public final void rule__Singleton__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2083:1: ( rule__Singleton__Group_1__2__Impl rule__Singleton__Group_1__3 )
            // InternalBPMN_translator.g:2084:2: rule__Singleton__Group_1__2__Impl rule__Singleton__Group_1__3
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
    // InternalBPMN_translator.g:2091:1: rule__Singleton__Group_1__2__Impl : ( ':' ) ;
    public final void rule__Singleton__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2095:1: ( ( ':' ) )
            // InternalBPMN_translator.g:2096:1: ( ':' )
            {
            // InternalBPMN_translator.g:2096:1: ( ':' )
            // InternalBPMN_translator.g:2097:2: ':'
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
    // InternalBPMN_translator.g:2106:1: rule__Singleton__Group_1__3 : rule__Singleton__Group_1__3__Impl rule__Singleton__Group_1__4 ;
    public final void rule__Singleton__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2110:1: ( rule__Singleton__Group_1__3__Impl rule__Singleton__Group_1__4 )
            // InternalBPMN_translator.g:2111:2: rule__Singleton__Group_1__3__Impl rule__Singleton__Group_1__4
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
    // InternalBPMN_translator.g:2118:1: rule__Singleton__Group_1__3__Impl : ( ( rule__Singleton__KeywordsAssignment_1_3 ) ) ;
    public final void rule__Singleton__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2122:1: ( ( ( rule__Singleton__KeywordsAssignment_1_3 ) ) )
            // InternalBPMN_translator.g:2123:1: ( ( rule__Singleton__KeywordsAssignment_1_3 ) )
            {
            // InternalBPMN_translator.g:2123:1: ( ( rule__Singleton__KeywordsAssignment_1_3 ) )
            // InternalBPMN_translator.g:2124:2: ( rule__Singleton__KeywordsAssignment_1_3 )
            {
             before(grammarAccess.getSingletonAccess().getKeywordsAssignment_1_3()); 
            // InternalBPMN_translator.g:2125:2: ( rule__Singleton__KeywordsAssignment_1_3 )
            // InternalBPMN_translator.g:2125:3: rule__Singleton__KeywordsAssignment_1_3
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
    // InternalBPMN_translator.g:2133:1: rule__Singleton__Group_1__4 : rule__Singleton__Group_1__4__Impl ;
    public final void rule__Singleton__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2137:1: ( rule__Singleton__Group_1__4__Impl )
            // InternalBPMN_translator.g:2138:2: rule__Singleton__Group_1__4__Impl
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
    // InternalBPMN_translator.g:2144:1: rule__Singleton__Group_1__4__Impl : ( ( rule__Singleton__Alternatives_1_4 )* ) ;
    public final void rule__Singleton__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2148:1: ( ( ( rule__Singleton__Alternatives_1_4 )* ) )
            // InternalBPMN_translator.g:2149:1: ( ( rule__Singleton__Alternatives_1_4 )* )
            {
            // InternalBPMN_translator.g:2149:1: ( ( rule__Singleton__Alternatives_1_4 )* )
            // InternalBPMN_translator.g:2150:2: ( rule__Singleton__Alternatives_1_4 )*
            {
             before(grammarAccess.getSingletonAccess().getAlternatives_1_4()); 
            // InternalBPMN_translator.g:2151:2: ( rule__Singleton__Alternatives_1_4 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_HEAD && LA24_0<=RULE_KEYWORDS)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBPMN_translator.g:2151:3: rule__Singleton__Alternatives_1_4
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Singleton__Alternatives_1_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalBPMN_translator.g:2160:1: rule__Singleton__Group_1_4_0__0 : rule__Singleton__Group_1_4_0__0__Impl rule__Singleton__Group_1_4_0__1 ;
    public final void rule__Singleton__Group_1_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2164:1: ( rule__Singleton__Group_1_4_0__0__Impl rule__Singleton__Group_1_4_0__1 )
            // InternalBPMN_translator.g:2165:2: rule__Singleton__Group_1_4_0__0__Impl rule__Singleton__Group_1_4_0__1
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
    // InternalBPMN_translator.g:2172:1: rule__Singleton__Group_1_4_0__0__Impl : ( RULE_HEAD ) ;
    public final void rule__Singleton__Group_1_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2176:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:2177:1: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:2177:1: ( RULE_HEAD )
            // InternalBPMN_translator.g:2178:2: RULE_HEAD
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
    // InternalBPMN_translator.g:2187:1: rule__Singleton__Group_1_4_0__1 : rule__Singleton__Group_1_4_0__1__Impl ;
    public final void rule__Singleton__Group_1_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2191:1: ( rule__Singleton__Group_1_4_0__1__Impl )
            // InternalBPMN_translator.g:2192:2: rule__Singleton__Group_1_4_0__1__Impl
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
    // InternalBPMN_translator.g:2198:1: rule__Singleton__Group_1_4_0__1__Impl : ( ':' ) ;
    public final void rule__Singleton__Group_1_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2202:1: ( ( ':' ) )
            // InternalBPMN_translator.g:2203:1: ( ':' )
            {
            // InternalBPMN_translator.g:2203:1: ( ':' )
            // InternalBPMN_translator.g:2204:2: ':'
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
    // InternalBPMN_translator.g:2214:1: rule__Singleton__Group_1_4_1__0 : rule__Singleton__Group_1_4_1__0__Impl rule__Singleton__Group_1_4_1__1 ;
    public final void rule__Singleton__Group_1_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2218:1: ( rule__Singleton__Group_1_4_1__0__Impl rule__Singleton__Group_1_4_1__1 )
            // InternalBPMN_translator.g:2219:2: rule__Singleton__Group_1_4_1__0__Impl rule__Singleton__Group_1_4_1__1
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
    // InternalBPMN_translator.g:2226:1: rule__Singleton__Group_1_4_1__0__Impl : ( ( rule__Singleton__Keywords1Assignment_1_4_1_0 ) ) ;
    public final void rule__Singleton__Group_1_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2230:1: ( ( ( rule__Singleton__Keywords1Assignment_1_4_1_0 ) ) )
            // InternalBPMN_translator.g:2231:1: ( ( rule__Singleton__Keywords1Assignment_1_4_1_0 ) )
            {
            // InternalBPMN_translator.g:2231:1: ( ( rule__Singleton__Keywords1Assignment_1_4_1_0 ) )
            // InternalBPMN_translator.g:2232:2: ( rule__Singleton__Keywords1Assignment_1_4_1_0 )
            {
             before(grammarAccess.getSingletonAccess().getKeywords1Assignment_1_4_1_0()); 
            // InternalBPMN_translator.g:2233:2: ( rule__Singleton__Keywords1Assignment_1_4_1_0 )
            // InternalBPMN_translator.g:2233:3: rule__Singleton__Keywords1Assignment_1_4_1_0
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
    // InternalBPMN_translator.g:2241:1: rule__Singleton__Group_1_4_1__1 : rule__Singleton__Group_1_4_1__1__Impl rule__Singleton__Group_1_4_1__2 ;
    public final void rule__Singleton__Group_1_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2245:1: ( rule__Singleton__Group_1_4_1__1__Impl rule__Singleton__Group_1_4_1__2 )
            // InternalBPMN_translator.g:2246:2: rule__Singleton__Group_1_4_1__1__Impl rule__Singleton__Group_1_4_1__2
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
    // InternalBPMN_translator.g:2253:1: rule__Singleton__Group_1_4_1__1__Impl : ( '=' ) ;
    public final void rule__Singleton__Group_1_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2257:1: ( ( '=' ) )
            // InternalBPMN_translator.g:2258:1: ( '=' )
            {
            // InternalBPMN_translator.g:2258:1: ( '=' )
            // InternalBPMN_translator.g:2259:2: '='
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
    // InternalBPMN_translator.g:2268:1: rule__Singleton__Group_1_4_1__2 : rule__Singleton__Group_1_4_1__2__Impl ;
    public final void rule__Singleton__Group_1_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2272:1: ( rule__Singleton__Group_1_4_1__2__Impl )
            // InternalBPMN_translator.g:2273:2: rule__Singleton__Group_1_4_1__2__Impl
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
    // InternalBPMN_translator.g:2279:1: rule__Singleton__Group_1_4_1__2__Impl : ( ( rule__Singleton__ValueAssignment_1_4_1_2 ) ) ;
    public final void rule__Singleton__Group_1_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2283:1: ( ( ( rule__Singleton__ValueAssignment_1_4_1_2 ) ) )
            // InternalBPMN_translator.g:2284:1: ( ( rule__Singleton__ValueAssignment_1_4_1_2 ) )
            {
            // InternalBPMN_translator.g:2284:1: ( ( rule__Singleton__ValueAssignment_1_4_1_2 ) )
            // InternalBPMN_translator.g:2285:2: ( rule__Singleton__ValueAssignment_1_4_1_2 )
            {
             before(grammarAccess.getSingletonAccess().getValueAssignment_1_4_1_2()); 
            // InternalBPMN_translator.g:2286:2: ( rule__Singleton__ValueAssignment_1_4_1_2 )
            // InternalBPMN_translator.g:2286:3: rule__Singleton__ValueAssignment_1_4_1_2
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
    // InternalBPMN_translator.g:2295:1: rule__Close__Group__0 : rule__Close__Group__0__Impl rule__Close__Group__1 ;
    public final void rule__Close__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2299:1: ( rule__Close__Group__0__Impl rule__Close__Group__1 )
            // InternalBPMN_translator.g:2300:2: rule__Close__Group__0__Impl rule__Close__Group__1
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
    // InternalBPMN_translator.g:2307:1: rule__Close__Group__0__Impl : ( () ) ;
    public final void rule__Close__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2311:1: ( ( () ) )
            // InternalBPMN_translator.g:2312:1: ( () )
            {
            // InternalBPMN_translator.g:2312:1: ( () )
            // InternalBPMN_translator.g:2313:2: ()
            {
             before(grammarAccess.getCloseAccess().getCloseAction_0()); 
            // InternalBPMN_translator.g:2314:2: ()
            // InternalBPMN_translator.g:2314:3: 
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
    // InternalBPMN_translator.g:2322:1: rule__Close__Group__1 : rule__Close__Group__1__Impl ;
    public final void rule__Close__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2326:1: ( rule__Close__Group__1__Impl )
            // InternalBPMN_translator.g:2327:2: rule__Close__Group__1__Impl
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
    // InternalBPMN_translator.g:2333:1: rule__Close__Group__1__Impl : ( ( rule__Close__Group_1__0 ) ) ;
    public final void rule__Close__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2337:1: ( ( ( rule__Close__Group_1__0 ) ) )
            // InternalBPMN_translator.g:2338:1: ( ( rule__Close__Group_1__0 ) )
            {
            // InternalBPMN_translator.g:2338:1: ( ( rule__Close__Group_1__0 ) )
            // InternalBPMN_translator.g:2339:2: ( rule__Close__Group_1__0 )
            {
             before(grammarAccess.getCloseAccess().getGroup_1()); 
            // InternalBPMN_translator.g:2340:2: ( rule__Close__Group_1__0 )
            // InternalBPMN_translator.g:2340:3: rule__Close__Group_1__0
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
    // InternalBPMN_translator.g:2349:1: rule__Close__Group_1__0 : rule__Close__Group_1__0__Impl rule__Close__Group_1__1 ;
    public final void rule__Close__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2353:1: ( rule__Close__Group_1__0__Impl rule__Close__Group_1__1 )
            // InternalBPMN_translator.g:2354:2: rule__Close__Group_1__0__Impl rule__Close__Group_1__1
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
    // InternalBPMN_translator.g:2361:1: rule__Close__Group_1__0__Impl : ( '</' ) ;
    public final void rule__Close__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2365:1: ( ( '</' ) )
            // InternalBPMN_translator.g:2366:1: ( '</' )
            {
            // InternalBPMN_translator.g:2366:1: ( '</' )
            // InternalBPMN_translator.g:2367:2: '</'
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
    // InternalBPMN_translator.g:2376:1: rule__Close__Group_1__1 : rule__Close__Group_1__1__Impl rule__Close__Group_1__2 ;
    public final void rule__Close__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2380:1: ( rule__Close__Group_1__1__Impl rule__Close__Group_1__2 )
            // InternalBPMN_translator.g:2381:2: rule__Close__Group_1__1__Impl rule__Close__Group_1__2
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
    // InternalBPMN_translator.g:2388:1: rule__Close__Group_1__1__Impl : ( RULE_HEAD ) ;
    public final void rule__Close__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2392:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:2393:1: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:2393:1: ( RULE_HEAD )
            // InternalBPMN_translator.g:2394:2: RULE_HEAD
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
    // InternalBPMN_translator.g:2403:1: rule__Close__Group_1__2 : rule__Close__Group_1__2__Impl rule__Close__Group_1__3 ;
    public final void rule__Close__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2407:1: ( rule__Close__Group_1__2__Impl rule__Close__Group_1__3 )
            // InternalBPMN_translator.g:2408:2: rule__Close__Group_1__2__Impl rule__Close__Group_1__3
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
    // InternalBPMN_translator.g:2415:1: rule__Close__Group_1__2__Impl : ( ':' ) ;
    public final void rule__Close__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2419:1: ( ( ':' ) )
            // InternalBPMN_translator.g:2420:1: ( ':' )
            {
            // InternalBPMN_translator.g:2420:1: ( ':' )
            // InternalBPMN_translator.g:2421:2: ':'
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
    // InternalBPMN_translator.g:2430:1: rule__Close__Group_1__3 : rule__Close__Group_1__3__Impl rule__Close__Group_1__4 ;
    public final void rule__Close__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2434:1: ( rule__Close__Group_1__3__Impl rule__Close__Group_1__4 )
            // InternalBPMN_translator.g:2435:2: rule__Close__Group_1__3__Impl rule__Close__Group_1__4
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
    // InternalBPMN_translator.g:2442:1: rule__Close__Group_1__3__Impl : ( RULE_KEYWORDS ) ;
    public final void rule__Close__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2446:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:2447:1: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:2447:1: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:2448:2: RULE_KEYWORDS
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
    // InternalBPMN_translator.g:2457:1: rule__Close__Group_1__4 : rule__Close__Group_1__4__Impl ;
    public final void rule__Close__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2461:1: ( rule__Close__Group_1__4__Impl )
            // InternalBPMN_translator.g:2462:2: rule__Close__Group_1__4__Impl
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
    // InternalBPMN_translator.g:2468:1: rule__Close__Group_1__4__Impl : ( '>' ) ;
    public final void rule__Close__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2472:1: ( ( '>' ) )
            // InternalBPMN_translator.g:2473:1: ( '>' )
            {
            // InternalBPMN_translator.g:2473:1: ( '>' )
            // InternalBPMN_translator.g:2474:2: '>'
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
    // InternalBPMN_translator.g:2484:1: rule__Variables__Group_0__0 : rule__Variables__Group_0__0__Impl rule__Variables__Group_0__1 ;
    public final void rule__Variables__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2488:1: ( rule__Variables__Group_0__0__Impl rule__Variables__Group_0__1 )
            // InternalBPMN_translator.g:2489:2: rule__Variables__Group_0__0__Impl rule__Variables__Group_0__1
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
    // InternalBPMN_translator.g:2496:1: rule__Variables__Group_0__0__Impl : ( 'TEMPERATURE' ) ;
    public final void rule__Variables__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2500:1: ( ( 'TEMPERATURE' ) )
            // InternalBPMN_translator.g:2501:1: ( 'TEMPERATURE' )
            {
            // InternalBPMN_translator.g:2501:1: ( 'TEMPERATURE' )
            // InternalBPMN_translator.g:2502:2: 'TEMPERATURE'
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
    // InternalBPMN_translator.g:2511:1: rule__Variables__Group_0__1 : rule__Variables__Group_0__1__Impl rule__Variables__Group_0__2 ;
    public final void rule__Variables__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2515:1: ( rule__Variables__Group_0__1__Impl rule__Variables__Group_0__2 )
            // InternalBPMN_translator.g:2516:2: rule__Variables__Group_0__1__Impl rule__Variables__Group_0__2
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
    // InternalBPMN_translator.g:2523:1: rule__Variables__Group_0__1__Impl : ( '[' ) ;
    public final void rule__Variables__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2527:1: ( ( '[' ) )
            // InternalBPMN_translator.g:2528:1: ( '[' )
            {
            // InternalBPMN_translator.g:2528:1: ( '[' )
            // InternalBPMN_translator.g:2529:2: '['
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
    // InternalBPMN_translator.g:2538:1: rule__Variables__Group_0__2 : rule__Variables__Group_0__2__Impl rule__Variables__Group_0__3 ;
    public final void rule__Variables__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2542:1: ( rule__Variables__Group_0__2__Impl rule__Variables__Group_0__3 )
            // InternalBPMN_translator.g:2543:2: rule__Variables__Group_0__2__Impl rule__Variables__Group_0__3
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
    // InternalBPMN_translator.g:2550:1: rule__Variables__Group_0__2__Impl : ( RULE_BODY ) ;
    public final void rule__Variables__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2554:1: ( ( RULE_BODY ) )
            // InternalBPMN_translator.g:2555:1: ( RULE_BODY )
            {
            // InternalBPMN_translator.g:2555:1: ( RULE_BODY )
            // InternalBPMN_translator.g:2556:2: RULE_BODY
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
    // InternalBPMN_translator.g:2565:1: rule__Variables__Group_0__3 : rule__Variables__Group_0__3__Impl rule__Variables__Group_0__4 ;
    public final void rule__Variables__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2569:1: ( rule__Variables__Group_0__3__Impl rule__Variables__Group_0__4 )
            // InternalBPMN_translator.g:2570:2: rule__Variables__Group_0__3__Impl rule__Variables__Group_0__4
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
    // InternalBPMN_translator.g:2577:1: rule__Variables__Group_0__3__Impl : ( ',' ) ;
    public final void rule__Variables__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2581:1: ( ( ',' ) )
            // InternalBPMN_translator.g:2582:1: ( ',' )
            {
            // InternalBPMN_translator.g:2582:1: ( ',' )
            // InternalBPMN_translator.g:2583:2: ','
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
    // InternalBPMN_translator.g:2592:1: rule__Variables__Group_0__4 : rule__Variables__Group_0__4__Impl rule__Variables__Group_0__5 ;
    public final void rule__Variables__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2596:1: ( rule__Variables__Group_0__4__Impl rule__Variables__Group_0__5 )
            // InternalBPMN_translator.g:2597:2: rule__Variables__Group_0__4__Impl rule__Variables__Group_0__5
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
    // InternalBPMN_translator.g:2604:1: rule__Variables__Group_0__4__Impl : ( RULE_BODY ) ;
    public final void rule__Variables__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2608:1: ( ( RULE_BODY ) )
            // InternalBPMN_translator.g:2609:1: ( RULE_BODY )
            {
            // InternalBPMN_translator.g:2609:1: ( RULE_BODY )
            // InternalBPMN_translator.g:2610:2: RULE_BODY
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
    // InternalBPMN_translator.g:2619:1: rule__Variables__Group_0__5 : rule__Variables__Group_0__5__Impl ;
    public final void rule__Variables__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2623:1: ( rule__Variables__Group_0__5__Impl )
            // InternalBPMN_translator.g:2624:2: rule__Variables__Group_0__5__Impl
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
    // InternalBPMN_translator.g:2630:1: rule__Variables__Group_0__5__Impl : ( ']' ) ;
    public final void rule__Variables__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2634:1: ( ( ']' ) )
            // InternalBPMN_translator.g:2635:1: ( ']' )
            {
            // InternalBPMN_translator.g:2635:1: ( ']' )
            // InternalBPMN_translator.g:2636:2: ']'
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
    // InternalBPMN_translator.g:2646:1: rule__Variables__Group_1__0 : rule__Variables__Group_1__0__Impl rule__Variables__Group_1__1 ;
    public final void rule__Variables__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2650:1: ( rule__Variables__Group_1__0__Impl rule__Variables__Group_1__1 )
            // InternalBPMN_translator.g:2651:2: rule__Variables__Group_1__0__Impl rule__Variables__Group_1__1
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
    // InternalBPMN_translator.g:2658:1: rule__Variables__Group_1__0__Impl : ( 'DISTANCE' ) ;
    public final void rule__Variables__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2662:1: ( ( 'DISTANCE' ) )
            // InternalBPMN_translator.g:2663:1: ( 'DISTANCE' )
            {
            // InternalBPMN_translator.g:2663:1: ( 'DISTANCE' )
            // InternalBPMN_translator.g:2664:2: 'DISTANCE'
            {
             before(grammarAccess.getVariablesAccess().getDISTANCEKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getVariablesAccess().getDISTANCEKeyword_1_0()); 

            }


            }

        }
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
    // InternalBPMN_translator.g:2673:1: rule__Variables__Group_1__1 : rule__Variables__Group_1__1__Impl rule__Variables__Group_1__2 ;
    public final void rule__Variables__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2677:1: ( rule__Variables__Group_1__1__Impl rule__Variables__Group_1__2 )
            // InternalBPMN_translator.g:2678:2: rule__Variables__Group_1__1__Impl rule__Variables__Group_1__2
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
    // InternalBPMN_translator.g:2685:1: rule__Variables__Group_1__1__Impl : ( '[' ) ;
    public final void rule__Variables__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2689:1: ( ( '[' ) )
            // InternalBPMN_translator.g:2690:1: ( '[' )
            {
            // InternalBPMN_translator.g:2690:1: ( '[' )
            // InternalBPMN_translator.g:2691:2: '['
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
    // InternalBPMN_translator.g:2700:1: rule__Variables__Group_1__2 : rule__Variables__Group_1__2__Impl rule__Variables__Group_1__3 ;
    public final void rule__Variables__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2704:1: ( rule__Variables__Group_1__2__Impl rule__Variables__Group_1__3 )
            // InternalBPMN_translator.g:2705:2: rule__Variables__Group_1__2__Impl rule__Variables__Group_1__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalBPMN_translator.g:2712:1: rule__Variables__Group_1__2__Impl : ( RULE_BODY ) ;
    public final void rule__Variables__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2716:1: ( ( RULE_BODY ) )
            // InternalBPMN_translator.g:2717:1: ( RULE_BODY )
            {
            // InternalBPMN_translator.g:2717:1: ( RULE_BODY )
            // InternalBPMN_translator.g:2718:2: RULE_BODY
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
    // InternalBPMN_translator.g:2727:1: rule__Variables__Group_1__3 : rule__Variables__Group_1__3__Impl rule__Variables__Group_1__4 ;
    public final void rule__Variables__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2731:1: ( rule__Variables__Group_1__3__Impl rule__Variables__Group_1__4 )
            // InternalBPMN_translator.g:2732:2: rule__Variables__Group_1__3__Impl rule__Variables__Group_1__4
            {
            pushFollow(FOLLOW_30);
            rule__Variables__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variables__Group_1__4();

            state._fsp--;


            }

        }
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
    // InternalBPMN_translator.g:2739:1: rule__Variables__Group_1__3__Impl : ( ',' ) ;
    public final void rule__Variables__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2743:1: ( ( ',' ) )
            // InternalBPMN_translator.g:2744:1: ( ',' )
            {
            // InternalBPMN_translator.g:2744:1: ( ',' )
            // InternalBPMN_translator.g:2745:2: ','
            {
             before(grammarAccess.getVariablesAccess().getCommaKeyword_1_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getVariablesAccess().getCommaKeyword_1_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Variables__Group_1__4"
    // InternalBPMN_translator.g:2754:1: rule__Variables__Group_1__4 : rule__Variables__Group_1__4__Impl rule__Variables__Group_1__5 ;
    public final void rule__Variables__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2758:1: ( rule__Variables__Group_1__4__Impl rule__Variables__Group_1__5 )
            // InternalBPMN_translator.g:2759:2: rule__Variables__Group_1__4__Impl rule__Variables__Group_1__5
            {
            pushFollow(FOLLOW_32);
            rule__Variables__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variables__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_1__4"


    // $ANTLR start "rule__Variables__Group_1__4__Impl"
    // InternalBPMN_translator.g:2766:1: rule__Variables__Group_1__4__Impl : ( RULE_BODY ) ;
    public final void rule__Variables__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2770:1: ( ( RULE_BODY ) )
            // InternalBPMN_translator.g:2771:1: ( RULE_BODY )
            {
            // InternalBPMN_translator.g:2771:1: ( RULE_BODY )
            // InternalBPMN_translator.g:2772:2: RULE_BODY
            {
             before(grammarAccess.getVariablesAccess().getBODYTerminalRuleCall_1_4()); 
            match(input,RULE_BODY,FOLLOW_2); 
             after(grammarAccess.getVariablesAccess().getBODYTerminalRuleCall_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_1__4__Impl"


    // $ANTLR start "rule__Variables__Group_1__5"
    // InternalBPMN_translator.g:2781:1: rule__Variables__Group_1__5 : rule__Variables__Group_1__5__Impl ;
    public final void rule__Variables__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2785:1: ( rule__Variables__Group_1__5__Impl )
            // InternalBPMN_translator.g:2786:2: rule__Variables__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variables__Group_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_1__5"


    // $ANTLR start "rule__Variables__Group_1__5__Impl"
    // InternalBPMN_translator.g:2792:1: rule__Variables__Group_1__5__Impl : ( ']' ) ;
    public final void rule__Variables__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2796:1: ( ( ']' ) )
            // InternalBPMN_translator.g:2797:1: ( ']' )
            {
            // InternalBPMN_translator.g:2797:1: ( ']' )
            // InternalBPMN_translator.g:2798:2: ']'
            {
             before(grammarAccess.getVariablesAccess().getRightSquareBracketKeyword_1_5()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getVariablesAccess().getRightSquareBracketKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_1__5__Impl"


    // $ANTLR start "rule__Variables__Group_2__0"
    // InternalBPMN_translator.g:2808:1: rule__Variables__Group_2__0 : rule__Variables__Group_2__0__Impl rule__Variables__Group_2__1 ;
    public final void rule__Variables__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2812:1: ( rule__Variables__Group_2__0__Impl rule__Variables__Group_2__1 )
            // InternalBPMN_translator.g:2813:2: rule__Variables__Group_2__0__Impl rule__Variables__Group_2__1
            {
            pushFollow(FOLLOW_29);
            rule__Variables__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variables__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_2__0"


    // $ANTLR start "rule__Variables__Group_2__0__Impl"
    // InternalBPMN_translator.g:2820:1: rule__Variables__Group_2__0__Impl : ( RULE_BODY ) ;
    public final void rule__Variables__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2824:1: ( ( RULE_BODY ) )
            // InternalBPMN_translator.g:2825:1: ( RULE_BODY )
            {
            // InternalBPMN_translator.g:2825:1: ( RULE_BODY )
            // InternalBPMN_translator.g:2826:2: RULE_BODY
            {
             before(grammarAccess.getVariablesAccess().getBODYTerminalRuleCall_2_0()); 
            match(input,RULE_BODY,FOLLOW_2); 
             after(grammarAccess.getVariablesAccess().getBODYTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_2__0__Impl"


    // $ANTLR start "rule__Variables__Group_2__1"
    // InternalBPMN_translator.g:2835:1: rule__Variables__Group_2__1 : rule__Variables__Group_2__1__Impl rule__Variables__Group_2__2 ;
    public final void rule__Variables__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2839:1: ( rule__Variables__Group_2__1__Impl rule__Variables__Group_2__2 )
            // InternalBPMN_translator.g:2840:2: rule__Variables__Group_2__1__Impl rule__Variables__Group_2__2
            {
            pushFollow(FOLLOW_30);
            rule__Variables__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variables__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_2__1"


    // $ANTLR start "rule__Variables__Group_2__1__Impl"
    // InternalBPMN_translator.g:2847:1: rule__Variables__Group_2__1__Impl : ( '[' ) ;
    public final void rule__Variables__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2851:1: ( ( '[' ) )
            // InternalBPMN_translator.g:2852:1: ( '[' )
            {
            // InternalBPMN_translator.g:2852:1: ( '[' )
            // InternalBPMN_translator.g:2853:2: '['
            {
             before(grammarAccess.getVariablesAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVariablesAccess().getLeftSquareBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_2__1__Impl"


    // $ANTLR start "rule__Variables__Group_2__2"
    // InternalBPMN_translator.g:2862:1: rule__Variables__Group_2__2 : rule__Variables__Group_2__2__Impl rule__Variables__Group_2__3 ;
    public final void rule__Variables__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2866:1: ( rule__Variables__Group_2__2__Impl rule__Variables__Group_2__3 )
            // InternalBPMN_translator.g:2867:2: rule__Variables__Group_2__2__Impl rule__Variables__Group_2__3
            {
            pushFollow(FOLLOW_32);
            rule__Variables__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variables__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_2__2"


    // $ANTLR start "rule__Variables__Group_2__2__Impl"
    // InternalBPMN_translator.g:2874:1: rule__Variables__Group_2__2__Impl : ( RULE_BODY ) ;
    public final void rule__Variables__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2878:1: ( ( RULE_BODY ) )
            // InternalBPMN_translator.g:2879:1: ( RULE_BODY )
            {
            // InternalBPMN_translator.g:2879:1: ( RULE_BODY )
            // InternalBPMN_translator.g:2880:2: RULE_BODY
            {
             before(grammarAccess.getVariablesAccess().getBODYTerminalRuleCall_2_2()); 
            match(input,RULE_BODY,FOLLOW_2); 
             after(grammarAccess.getVariablesAccess().getBODYTerminalRuleCall_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_2__2__Impl"


    // $ANTLR start "rule__Variables__Group_2__3"
    // InternalBPMN_translator.g:2889:1: rule__Variables__Group_2__3 : rule__Variables__Group_2__3__Impl ;
    public final void rule__Variables__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2893:1: ( rule__Variables__Group_2__3__Impl )
            // InternalBPMN_translator.g:2894:2: rule__Variables__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variables__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_2__3"


    // $ANTLR start "rule__Variables__Group_2__3__Impl"
    // InternalBPMN_translator.g:2900:1: rule__Variables__Group_2__3__Impl : ( ']' ) ;
    public final void rule__Variables__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2904:1: ( ( ']' ) )
            // InternalBPMN_translator.g:2905:1: ( ']' )
            {
            // InternalBPMN_translator.g:2905:1: ( ']' )
            // InternalBPMN_translator.g:2906:2: ']'
            {
             before(grammarAccess.getVariablesAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getVariablesAccess().getRightSquareBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__Group_2__3__Impl"


    // $ANTLR start "rule__Codex__Group__0"
    // InternalBPMN_translator.g:2916:1: rule__Codex__Group__0 : rule__Codex__Group__0__Impl rule__Codex__Group__1 ;
    public final void rule__Codex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2920:1: ( rule__Codex__Group__0__Impl rule__Codex__Group__1 )
            // InternalBPMN_translator.g:2921:2: rule__Codex__Group__0__Impl rule__Codex__Group__1
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
    // InternalBPMN_translator.g:2928:1: rule__Codex__Group__0__Impl : ( ( rule__Codex__Device_codeAssignment_0 ) ) ;
    public final void rule__Codex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2932:1: ( ( ( rule__Codex__Device_codeAssignment_0 ) ) )
            // InternalBPMN_translator.g:2933:1: ( ( rule__Codex__Device_codeAssignment_0 ) )
            {
            // InternalBPMN_translator.g:2933:1: ( ( rule__Codex__Device_codeAssignment_0 ) )
            // InternalBPMN_translator.g:2934:2: ( rule__Codex__Device_codeAssignment_0 )
            {
             before(grammarAccess.getCodexAccess().getDevice_codeAssignment_0()); 
            // InternalBPMN_translator.g:2935:2: ( rule__Codex__Device_codeAssignment_0 )
            // InternalBPMN_translator.g:2935:3: rule__Codex__Device_codeAssignment_0
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
    // InternalBPMN_translator.g:2943:1: rule__Codex__Group__1 : rule__Codex__Group__1__Impl rule__Codex__Group__2 ;
    public final void rule__Codex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2947:1: ( rule__Codex__Group__1__Impl rule__Codex__Group__2 )
            // InternalBPMN_translator.g:2948:2: rule__Codex__Group__1__Impl rule__Codex__Group__2
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
    // InternalBPMN_translator.g:2955:1: rule__Codex__Group__1__Impl : ( ( rule__Codex__ProtocolAssignment_1 )* ) ;
    public final void rule__Codex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2959:1: ( ( ( rule__Codex__ProtocolAssignment_1 )* ) )
            // InternalBPMN_translator.g:2960:1: ( ( rule__Codex__ProtocolAssignment_1 )* )
            {
            // InternalBPMN_translator.g:2960:1: ( ( rule__Codex__ProtocolAssignment_1 )* )
            // InternalBPMN_translator.g:2961:2: ( rule__Codex__ProtocolAssignment_1 )*
            {
             before(grammarAccess.getCodexAccess().getProtocolAssignment_1()); 
            // InternalBPMN_translator.g:2962:2: ( rule__Codex__ProtocolAssignment_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=63 && LA25_0<=64)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBPMN_translator.g:2962:3: rule__Codex__ProtocolAssignment_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Codex__ProtocolAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalBPMN_translator.g:2970:1: rule__Codex__Group__2 : rule__Codex__Group__2__Impl ;
    public final void rule__Codex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2974:1: ( rule__Codex__Group__2__Impl )
            // InternalBPMN_translator.g:2975:2: rule__Codex__Group__2__Impl
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
    // InternalBPMN_translator.g:2981:1: rule__Codex__Group__2__Impl : ( ( rule__Codex__Sensor_codeAssignment_2 )* ) ;
    public final void rule__Codex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2985:1: ( ( ( rule__Codex__Sensor_codeAssignment_2 )* ) )
            // InternalBPMN_translator.g:2986:1: ( ( rule__Codex__Sensor_codeAssignment_2 )* )
            {
            // InternalBPMN_translator.g:2986:1: ( ( rule__Codex__Sensor_codeAssignment_2 )* )
            // InternalBPMN_translator.g:2987:2: ( rule__Codex__Sensor_codeAssignment_2 )*
            {
             before(grammarAccess.getCodexAccess().getSensor_codeAssignment_2()); 
            // InternalBPMN_translator.g:2988:2: ( rule__Codex__Sensor_codeAssignment_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==38||LA26_0==42||(LA26_0>=65 && LA26_0<=66)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBPMN_translator.g:2988:3: rule__Codex__Sensor_codeAssignment_2
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Codex__Sensor_codeAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalBPMN_translator.g:2997:1: rule__Device__Group__0 : rule__Device__Group__0__Impl rule__Device__Group__1 ;
    public final void rule__Device__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3001:1: ( rule__Device__Group__0__Impl rule__Device__Group__1 )
            // InternalBPMN_translator.g:3002:2: rule__Device__Group__0__Impl rule__Device__Group__1
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
    // InternalBPMN_translator.g:3009:1: rule__Device__Group__0__Impl : ( 'DEVICE' ) ;
    public final void rule__Device__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3013:1: ( ( 'DEVICE' ) )
            // InternalBPMN_translator.g:3014:1: ( 'DEVICE' )
            {
            // InternalBPMN_translator.g:3014:1: ( 'DEVICE' )
            // InternalBPMN_translator.g:3015:2: 'DEVICE'
            {
             before(grammarAccess.getDeviceAccess().getDEVICEKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3024:1: rule__Device__Group__1 : rule__Device__Group__1__Impl rule__Device__Group__2 ;
    public final void rule__Device__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3028:1: ( rule__Device__Group__1__Impl rule__Device__Group__2 )
            // InternalBPMN_translator.g:3029:2: rule__Device__Group__1__Impl rule__Device__Group__2
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
    // InternalBPMN_translator.g:3036:1: rule__Device__Group__1__Impl : ( ':' ) ;
    public final void rule__Device__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3040:1: ( ( ':' ) )
            // InternalBPMN_translator.g:3041:1: ( ':' )
            {
            // InternalBPMN_translator.g:3041:1: ( ':' )
            // InternalBPMN_translator.g:3042:2: ':'
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
    // InternalBPMN_translator.g:3051:1: rule__Device__Group__2 : rule__Device__Group__2__Impl rule__Device__Group__3 ;
    public final void rule__Device__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3055:1: ( rule__Device__Group__2__Impl rule__Device__Group__3 )
            // InternalBPMN_translator.g:3056:2: rule__Device__Group__2__Impl rule__Device__Group__3
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
    // InternalBPMN_translator.g:3063:1: rule__Device__Group__2__Impl : ( ( rule__Device__DeviceAssignment_2 ) ) ;
    public final void rule__Device__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3067:1: ( ( ( rule__Device__DeviceAssignment_2 ) ) )
            // InternalBPMN_translator.g:3068:1: ( ( rule__Device__DeviceAssignment_2 ) )
            {
            // InternalBPMN_translator.g:3068:1: ( ( rule__Device__DeviceAssignment_2 ) )
            // InternalBPMN_translator.g:3069:2: ( rule__Device__DeviceAssignment_2 )
            {
             before(grammarAccess.getDeviceAccess().getDeviceAssignment_2()); 
            // InternalBPMN_translator.g:3070:2: ( rule__Device__DeviceAssignment_2 )
            // InternalBPMN_translator.g:3070:3: rule__Device__DeviceAssignment_2
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
    // InternalBPMN_translator.g:3078:1: rule__Device__Group__3 : rule__Device__Group__3__Impl rule__Device__Group__4 ;
    public final void rule__Device__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3082:1: ( rule__Device__Group__3__Impl rule__Device__Group__4 )
            // InternalBPMN_translator.g:3083:2: rule__Device__Group__3__Impl rule__Device__Group__4
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
    // InternalBPMN_translator.g:3090:1: rule__Device__Group__3__Impl : ( 'NAMEID' ) ;
    public final void rule__Device__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3094:1: ( ( 'NAMEID' ) )
            // InternalBPMN_translator.g:3095:1: ( 'NAMEID' )
            {
            // InternalBPMN_translator.g:3095:1: ( 'NAMEID' )
            // InternalBPMN_translator.g:3096:2: 'NAMEID'
            {
             before(grammarAccess.getDeviceAccess().getNAMEIDKeyword_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3105:1: rule__Device__Group__4 : rule__Device__Group__4__Impl rule__Device__Group__5 ;
    public final void rule__Device__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3109:1: ( rule__Device__Group__4__Impl rule__Device__Group__5 )
            // InternalBPMN_translator.g:3110:2: rule__Device__Group__4__Impl rule__Device__Group__5
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
    // InternalBPMN_translator.g:3117:1: rule__Device__Group__4__Impl : ( ':' ) ;
    public final void rule__Device__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3121:1: ( ( ':' ) )
            // InternalBPMN_translator.g:3122:1: ( ':' )
            {
            // InternalBPMN_translator.g:3122:1: ( ':' )
            // InternalBPMN_translator.g:3123:2: ':'
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
    // InternalBPMN_translator.g:3132:1: rule__Device__Group__5 : rule__Device__Group__5__Impl ;
    public final void rule__Device__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3136:1: ( rule__Device__Group__5__Impl )
            // InternalBPMN_translator.g:3137:2: rule__Device__Group__5__Impl
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
    // InternalBPMN_translator.g:3143:1: rule__Device__Group__5__Impl : ( ( rule__Device__IdAssignment_5 ) ) ;
    public final void rule__Device__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3147:1: ( ( ( rule__Device__IdAssignment_5 ) ) )
            // InternalBPMN_translator.g:3148:1: ( ( rule__Device__IdAssignment_5 ) )
            {
            // InternalBPMN_translator.g:3148:1: ( ( rule__Device__IdAssignment_5 ) )
            // InternalBPMN_translator.g:3149:2: ( rule__Device__IdAssignment_5 )
            {
             before(grammarAccess.getDeviceAccess().getIdAssignment_5()); 
            // InternalBPMN_translator.g:3150:2: ( rule__Device__IdAssignment_5 )
            // InternalBPMN_translator.g:3150:3: rule__Device__IdAssignment_5
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
    // InternalBPMN_translator.g:3159:1: rule__Protocol__Group_0__0 : rule__Protocol__Group_0__0__Impl rule__Protocol__Group_0__1 ;
    public final void rule__Protocol__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3163:1: ( rule__Protocol__Group_0__0__Impl rule__Protocol__Group_0__1 )
            // InternalBPMN_translator.g:3164:2: rule__Protocol__Group_0__0__Impl rule__Protocol__Group_0__1
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
    // InternalBPMN_translator.g:3171:1: rule__Protocol__Group_0__0__Impl : ( ( rule__Protocol__PnameAssignment_0_0 ) ) ;
    public final void rule__Protocol__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3175:1: ( ( ( rule__Protocol__PnameAssignment_0_0 ) ) )
            // InternalBPMN_translator.g:3176:1: ( ( rule__Protocol__PnameAssignment_0_0 ) )
            {
            // InternalBPMN_translator.g:3176:1: ( ( rule__Protocol__PnameAssignment_0_0 ) )
            // InternalBPMN_translator.g:3177:2: ( rule__Protocol__PnameAssignment_0_0 )
            {
             before(grammarAccess.getProtocolAccess().getPnameAssignment_0_0()); 
            // InternalBPMN_translator.g:3178:2: ( rule__Protocol__PnameAssignment_0_0 )
            // InternalBPMN_translator.g:3178:3: rule__Protocol__PnameAssignment_0_0
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
    // InternalBPMN_translator.g:3186:1: rule__Protocol__Group_0__1 : rule__Protocol__Group_0__1__Impl rule__Protocol__Group_0__2 ;
    public final void rule__Protocol__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3190:1: ( rule__Protocol__Group_0__1__Impl rule__Protocol__Group_0__2 )
            // InternalBPMN_translator.g:3191:2: rule__Protocol__Group_0__1__Impl rule__Protocol__Group_0__2
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
    // InternalBPMN_translator.g:3198:1: rule__Protocol__Group_0__1__Impl : ( '{' ) ;
    public final void rule__Protocol__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3202:1: ( ( '{' ) )
            // InternalBPMN_translator.g:3203:1: ( '{' )
            {
            // InternalBPMN_translator.g:3203:1: ( '{' )
            // InternalBPMN_translator.g:3204:2: '{'
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
    // InternalBPMN_translator.g:3213:1: rule__Protocol__Group_0__2 : rule__Protocol__Group_0__2__Impl rule__Protocol__Group_0__3 ;
    public final void rule__Protocol__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3217:1: ( rule__Protocol__Group_0__2__Impl rule__Protocol__Group_0__3 )
            // InternalBPMN_translator.g:3218:2: rule__Protocol__Group_0__2__Impl rule__Protocol__Group_0__3
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
    // InternalBPMN_translator.g:3225:1: rule__Protocol__Group_0__2__Impl : ( ( rule__Protocol__Group_0_2__0 ) ) ;
    public final void rule__Protocol__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3229:1: ( ( ( rule__Protocol__Group_0_2__0 ) ) )
            // InternalBPMN_translator.g:3230:1: ( ( rule__Protocol__Group_0_2__0 ) )
            {
            // InternalBPMN_translator.g:3230:1: ( ( rule__Protocol__Group_0_2__0 ) )
            // InternalBPMN_translator.g:3231:2: ( rule__Protocol__Group_0_2__0 )
            {
             before(grammarAccess.getProtocolAccess().getGroup_0_2()); 
            // InternalBPMN_translator.g:3232:2: ( rule__Protocol__Group_0_2__0 )
            // InternalBPMN_translator.g:3232:3: rule__Protocol__Group_0_2__0
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
    // InternalBPMN_translator.g:3240:1: rule__Protocol__Group_0__3 : rule__Protocol__Group_0__3__Impl ;
    public final void rule__Protocol__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3244:1: ( rule__Protocol__Group_0__3__Impl )
            // InternalBPMN_translator.g:3245:2: rule__Protocol__Group_0__3__Impl
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
    // InternalBPMN_translator.g:3251:1: rule__Protocol__Group_0__3__Impl : ( '}' ) ;
    public final void rule__Protocol__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3255:1: ( ( '}' ) )
            // InternalBPMN_translator.g:3256:1: ( '}' )
            {
            // InternalBPMN_translator.g:3256:1: ( '}' )
            // InternalBPMN_translator.g:3257:2: '}'
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
    // InternalBPMN_translator.g:3267:1: rule__Protocol__Group_0_2__0 : rule__Protocol__Group_0_2__0__Impl rule__Protocol__Group_0_2__1 ;
    public final void rule__Protocol__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3271:1: ( rule__Protocol__Group_0_2__0__Impl rule__Protocol__Group_0_2__1 )
            // InternalBPMN_translator.g:3272:2: rule__Protocol__Group_0_2__0__Impl rule__Protocol__Group_0_2__1
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
    // InternalBPMN_translator.g:3279:1: rule__Protocol__Group_0_2__0__Impl : ( ( rule__Protocol__Mqtt_dataAssignment_0_2_0 ) ) ;
    public final void rule__Protocol__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3283:1: ( ( ( rule__Protocol__Mqtt_dataAssignment_0_2_0 ) ) )
            // InternalBPMN_translator.g:3284:1: ( ( rule__Protocol__Mqtt_dataAssignment_0_2_0 ) )
            {
            // InternalBPMN_translator.g:3284:1: ( ( rule__Protocol__Mqtt_dataAssignment_0_2_0 ) )
            // InternalBPMN_translator.g:3285:2: ( rule__Protocol__Mqtt_dataAssignment_0_2_0 )
            {
             before(grammarAccess.getProtocolAccess().getMqtt_dataAssignment_0_2_0()); 
            // InternalBPMN_translator.g:3286:2: ( rule__Protocol__Mqtt_dataAssignment_0_2_0 )
            // InternalBPMN_translator.g:3286:3: rule__Protocol__Mqtt_dataAssignment_0_2_0
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
    // InternalBPMN_translator.g:3294:1: rule__Protocol__Group_0_2__1 : rule__Protocol__Group_0_2__1__Impl ;
    public final void rule__Protocol__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3298:1: ( rule__Protocol__Group_0_2__1__Impl )
            // InternalBPMN_translator.g:3299:2: rule__Protocol__Group_0_2__1__Impl
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
    // InternalBPMN_translator.g:3305:1: rule__Protocol__Group_0_2__1__Impl : ( ( rule__Protocol__Mqtt_deviceAssignment_0_2_1 ) ) ;
    public final void rule__Protocol__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3309:1: ( ( ( rule__Protocol__Mqtt_deviceAssignment_0_2_1 ) ) )
            // InternalBPMN_translator.g:3310:1: ( ( rule__Protocol__Mqtt_deviceAssignment_0_2_1 ) )
            {
            // InternalBPMN_translator.g:3310:1: ( ( rule__Protocol__Mqtt_deviceAssignment_0_2_1 ) )
            // InternalBPMN_translator.g:3311:2: ( rule__Protocol__Mqtt_deviceAssignment_0_2_1 )
            {
             before(grammarAccess.getProtocolAccess().getMqtt_deviceAssignment_0_2_1()); 
            // InternalBPMN_translator.g:3312:2: ( rule__Protocol__Mqtt_deviceAssignment_0_2_1 )
            // InternalBPMN_translator.g:3312:3: rule__Protocol__Mqtt_deviceAssignment_0_2_1
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
    // InternalBPMN_translator.g:3321:1: rule__Protocol__Group_1__0 : rule__Protocol__Group_1__0__Impl rule__Protocol__Group_1__1 ;
    public final void rule__Protocol__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3325:1: ( rule__Protocol__Group_1__0__Impl rule__Protocol__Group_1__1 )
            // InternalBPMN_translator.g:3326:2: rule__Protocol__Group_1__0__Impl rule__Protocol__Group_1__1
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
    // InternalBPMN_translator.g:3333:1: rule__Protocol__Group_1__0__Impl : ( ( rule__Protocol__PnameAssignment_1_0 ) ) ;
    public final void rule__Protocol__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3337:1: ( ( ( rule__Protocol__PnameAssignment_1_0 ) ) )
            // InternalBPMN_translator.g:3338:1: ( ( rule__Protocol__PnameAssignment_1_0 ) )
            {
            // InternalBPMN_translator.g:3338:1: ( ( rule__Protocol__PnameAssignment_1_0 ) )
            // InternalBPMN_translator.g:3339:2: ( rule__Protocol__PnameAssignment_1_0 )
            {
             before(grammarAccess.getProtocolAccess().getPnameAssignment_1_0()); 
            // InternalBPMN_translator.g:3340:2: ( rule__Protocol__PnameAssignment_1_0 )
            // InternalBPMN_translator.g:3340:3: rule__Protocol__PnameAssignment_1_0
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
    // InternalBPMN_translator.g:3348:1: rule__Protocol__Group_1__1 : rule__Protocol__Group_1__1__Impl rule__Protocol__Group_1__2 ;
    public final void rule__Protocol__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3352:1: ( rule__Protocol__Group_1__1__Impl rule__Protocol__Group_1__2 )
            // InternalBPMN_translator.g:3353:2: rule__Protocol__Group_1__1__Impl rule__Protocol__Group_1__2
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
    // InternalBPMN_translator.g:3360:1: rule__Protocol__Group_1__1__Impl : ( '{' ) ;
    public final void rule__Protocol__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3364:1: ( ( '{' ) )
            // InternalBPMN_translator.g:3365:1: ( '{' )
            {
            // InternalBPMN_translator.g:3365:1: ( '{' )
            // InternalBPMN_translator.g:3366:2: '{'
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
    // InternalBPMN_translator.g:3375:1: rule__Protocol__Group_1__2 : rule__Protocol__Group_1__2__Impl rule__Protocol__Group_1__3 ;
    public final void rule__Protocol__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3379:1: ( rule__Protocol__Group_1__2__Impl rule__Protocol__Group_1__3 )
            // InternalBPMN_translator.g:3380:2: rule__Protocol__Group_1__2__Impl rule__Protocol__Group_1__3
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
    // InternalBPMN_translator.g:3387:1: rule__Protocol__Group_1__2__Impl : ( ( rule__Protocol__Group_1_2__0 ) ) ;
    public final void rule__Protocol__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3391:1: ( ( ( rule__Protocol__Group_1_2__0 ) ) )
            // InternalBPMN_translator.g:3392:1: ( ( rule__Protocol__Group_1_2__0 ) )
            {
            // InternalBPMN_translator.g:3392:1: ( ( rule__Protocol__Group_1_2__0 ) )
            // InternalBPMN_translator.g:3393:2: ( rule__Protocol__Group_1_2__0 )
            {
             before(grammarAccess.getProtocolAccess().getGroup_1_2()); 
            // InternalBPMN_translator.g:3394:2: ( rule__Protocol__Group_1_2__0 )
            // InternalBPMN_translator.g:3394:3: rule__Protocol__Group_1_2__0
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
    // InternalBPMN_translator.g:3402:1: rule__Protocol__Group_1__3 : rule__Protocol__Group_1__3__Impl ;
    public final void rule__Protocol__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3406:1: ( rule__Protocol__Group_1__3__Impl )
            // InternalBPMN_translator.g:3407:2: rule__Protocol__Group_1__3__Impl
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
    // InternalBPMN_translator.g:3413:1: rule__Protocol__Group_1__3__Impl : ( '}' ) ;
    public final void rule__Protocol__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3417:1: ( ( '}' ) )
            // InternalBPMN_translator.g:3418:1: ( '}' )
            {
            // InternalBPMN_translator.g:3418:1: ( '}' )
            // InternalBPMN_translator.g:3419:2: '}'
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
    // InternalBPMN_translator.g:3429:1: rule__Protocol__Group_1_2__0 : rule__Protocol__Group_1_2__0__Impl rule__Protocol__Group_1_2__1 ;
    public final void rule__Protocol__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3433:1: ( rule__Protocol__Group_1_2__0__Impl rule__Protocol__Group_1_2__1 )
            // InternalBPMN_translator.g:3434:2: rule__Protocol__Group_1_2__0__Impl rule__Protocol__Group_1_2__1
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
    // InternalBPMN_translator.g:3441:1: rule__Protocol__Group_1_2__0__Impl : ( ( rule__Protocol__Http_dataAssignment_1_2_0 ) ) ;
    public final void rule__Protocol__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3445:1: ( ( ( rule__Protocol__Http_dataAssignment_1_2_0 ) ) )
            // InternalBPMN_translator.g:3446:1: ( ( rule__Protocol__Http_dataAssignment_1_2_0 ) )
            {
            // InternalBPMN_translator.g:3446:1: ( ( rule__Protocol__Http_dataAssignment_1_2_0 ) )
            // InternalBPMN_translator.g:3447:2: ( rule__Protocol__Http_dataAssignment_1_2_0 )
            {
             before(grammarAccess.getProtocolAccess().getHttp_dataAssignment_1_2_0()); 
            // InternalBPMN_translator.g:3448:2: ( rule__Protocol__Http_dataAssignment_1_2_0 )
            // InternalBPMN_translator.g:3448:3: rule__Protocol__Http_dataAssignment_1_2_0
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
    // InternalBPMN_translator.g:3456:1: rule__Protocol__Group_1_2__1 : rule__Protocol__Group_1_2__1__Impl ;
    public final void rule__Protocol__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3460:1: ( rule__Protocol__Group_1_2__1__Impl )
            // InternalBPMN_translator.g:3461:2: rule__Protocol__Group_1_2__1__Impl
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
    // InternalBPMN_translator.g:3467:1: rule__Protocol__Group_1_2__1__Impl : ( ( rule__Protocol__Http_deviceAssignment_1_2_1 ) ) ;
    public final void rule__Protocol__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3471:1: ( ( ( rule__Protocol__Http_deviceAssignment_1_2_1 ) ) )
            // InternalBPMN_translator.g:3472:1: ( ( rule__Protocol__Http_deviceAssignment_1_2_1 ) )
            {
            // InternalBPMN_translator.g:3472:1: ( ( rule__Protocol__Http_deviceAssignment_1_2_1 ) )
            // InternalBPMN_translator.g:3473:2: ( rule__Protocol__Http_deviceAssignment_1_2_1 )
            {
             before(grammarAccess.getProtocolAccess().getHttp_deviceAssignment_1_2_1()); 
            // InternalBPMN_translator.g:3474:2: ( rule__Protocol__Http_deviceAssignment_1_2_1 )
            // InternalBPMN_translator.g:3474:3: rule__Protocol__Http_deviceAssignment_1_2_1
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
    // InternalBPMN_translator.g:3483:1: rule__Http_data__Group__0 : rule__Http_data__Group__0__Impl rule__Http_data__Group__1 ;
    public final void rule__Http_data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3487:1: ( rule__Http_data__Group__0__Impl rule__Http_data__Group__1 )
            // InternalBPMN_translator.g:3488:2: rule__Http_data__Group__0__Impl rule__Http_data__Group__1
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
    // InternalBPMN_translator.g:3495:1: rule__Http_data__Group__0__Impl : ( () ) ;
    public final void rule__Http_data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3499:1: ( ( () ) )
            // InternalBPMN_translator.g:3500:1: ( () )
            {
            // InternalBPMN_translator.g:3500:1: ( () )
            // InternalBPMN_translator.g:3501:2: ()
            {
             before(grammarAccess.getHttp_dataAccess().getHttp_dataAction_0()); 
            // InternalBPMN_translator.g:3502:2: ()
            // InternalBPMN_translator.g:3502:3: 
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
    // InternalBPMN_translator.g:3510:1: rule__Http_data__Group__1 : rule__Http_data__Group__1__Impl ;
    public final void rule__Http_data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3514:1: ( rule__Http_data__Group__1__Impl )
            // InternalBPMN_translator.g:3515:2: rule__Http_data__Group__1__Impl
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
    // InternalBPMN_translator.g:3521:1: rule__Http_data__Group__1__Impl : ( ( rule__Http_data__Alternatives_1 )* ) ;
    public final void rule__Http_data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3525:1: ( ( ( rule__Http_data__Alternatives_1 )* ) )
            // InternalBPMN_translator.g:3526:1: ( ( rule__Http_data__Alternatives_1 )* )
            {
            // InternalBPMN_translator.g:3526:1: ( ( rule__Http_data__Alternatives_1 )* )
            // InternalBPMN_translator.g:3527:2: ( rule__Http_data__Alternatives_1 )*
            {
             before(grammarAccess.getHttp_dataAccess().getAlternatives_1()); 
            // InternalBPMN_translator.g:3528:2: ( rule__Http_data__Alternatives_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=45 && LA27_0<=51)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalBPMN_translator.g:3528:3: rule__Http_data__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__Http_data__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalBPMN_translator.g:3537:1: rule__Http_data__Group_1_0__0 : rule__Http_data__Group_1_0__0__Impl rule__Http_data__Group_1_0__1 ;
    public final void rule__Http_data__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3541:1: ( rule__Http_data__Group_1_0__0__Impl rule__Http_data__Group_1_0__1 )
            // InternalBPMN_translator.g:3542:2: rule__Http_data__Group_1_0__0__Impl rule__Http_data__Group_1_0__1
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
    // InternalBPMN_translator.g:3549:1: rule__Http_data__Group_1_0__0__Impl : ( 'NAME' ) ;
    public final void rule__Http_data__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3553:1: ( ( 'NAME' ) )
            // InternalBPMN_translator.g:3554:1: ( 'NAME' )
            {
            // InternalBPMN_translator.g:3554:1: ( 'NAME' )
            // InternalBPMN_translator.g:3555:2: 'NAME'
            {
             before(grammarAccess.getHttp_dataAccess().getNAMEKeyword_1_0_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3564:1: rule__Http_data__Group_1_0__1 : rule__Http_data__Group_1_0__1__Impl rule__Http_data__Group_1_0__2 ;
    public final void rule__Http_data__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3568:1: ( rule__Http_data__Group_1_0__1__Impl rule__Http_data__Group_1_0__2 )
            // InternalBPMN_translator.g:3569:2: rule__Http_data__Group_1_0__1__Impl rule__Http_data__Group_1_0__2
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
    // InternalBPMN_translator.g:3576:1: rule__Http_data__Group_1_0__1__Impl : ( '=' ) ;
    public final void rule__Http_data__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3580:1: ( ( '=' ) )
            // InternalBPMN_translator.g:3581:1: ( '=' )
            {
            // InternalBPMN_translator.g:3581:1: ( '=' )
            // InternalBPMN_translator.g:3582:2: '='
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
    // InternalBPMN_translator.g:3591:1: rule__Http_data__Group_1_0__2 : rule__Http_data__Group_1_0__2__Impl ;
    public final void rule__Http_data__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3595:1: ( rule__Http_data__Group_1_0__2__Impl )
            // InternalBPMN_translator.g:3596:2: rule__Http_data__Group_1_0__2__Impl
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
    // InternalBPMN_translator.g:3602:1: rule__Http_data__Group_1_0__2__Impl : ( ( rule__Http_data__PnameAssignment_1_0_2 ) ) ;
    public final void rule__Http_data__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3606:1: ( ( ( rule__Http_data__PnameAssignment_1_0_2 ) ) )
            // InternalBPMN_translator.g:3607:1: ( ( rule__Http_data__PnameAssignment_1_0_2 ) )
            {
            // InternalBPMN_translator.g:3607:1: ( ( rule__Http_data__PnameAssignment_1_0_2 ) )
            // InternalBPMN_translator.g:3608:2: ( rule__Http_data__PnameAssignment_1_0_2 )
            {
             before(grammarAccess.getHttp_dataAccess().getPnameAssignment_1_0_2()); 
            // InternalBPMN_translator.g:3609:2: ( rule__Http_data__PnameAssignment_1_0_2 )
            // InternalBPMN_translator.g:3609:3: rule__Http_data__PnameAssignment_1_0_2
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
    // InternalBPMN_translator.g:3618:1: rule__Http_data__Group_1_1__0 : rule__Http_data__Group_1_1__0__Impl rule__Http_data__Group_1_1__1 ;
    public final void rule__Http_data__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3622:1: ( rule__Http_data__Group_1_1__0__Impl rule__Http_data__Group_1_1__1 )
            // InternalBPMN_translator.g:3623:2: rule__Http_data__Group_1_1__0__Impl rule__Http_data__Group_1_1__1
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
    // InternalBPMN_translator.g:3630:1: rule__Http_data__Group_1_1__0__Impl : ( 'SERVER_IP' ) ;
    public final void rule__Http_data__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3634:1: ( ( 'SERVER_IP' ) )
            // InternalBPMN_translator.g:3635:1: ( 'SERVER_IP' )
            {
            // InternalBPMN_translator.g:3635:1: ( 'SERVER_IP' )
            // InternalBPMN_translator.g:3636:2: 'SERVER_IP'
            {
             before(grammarAccess.getHttp_dataAccess().getSERVER_IPKeyword_1_1_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3645:1: rule__Http_data__Group_1_1__1 : rule__Http_data__Group_1_1__1__Impl rule__Http_data__Group_1_1__2 ;
    public final void rule__Http_data__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3649:1: ( rule__Http_data__Group_1_1__1__Impl rule__Http_data__Group_1_1__2 )
            // InternalBPMN_translator.g:3650:2: rule__Http_data__Group_1_1__1__Impl rule__Http_data__Group_1_1__2
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
    // InternalBPMN_translator.g:3657:1: rule__Http_data__Group_1_1__1__Impl : ( '=' ) ;
    public final void rule__Http_data__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3661:1: ( ( '=' ) )
            // InternalBPMN_translator.g:3662:1: ( '=' )
            {
            // InternalBPMN_translator.g:3662:1: ( '=' )
            // InternalBPMN_translator.g:3663:2: '='
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
    // InternalBPMN_translator.g:3672:1: rule__Http_data__Group_1_1__2 : rule__Http_data__Group_1_1__2__Impl ;
    public final void rule__Http_data__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3676:1: ( rule__Http_data__Group_1_1__2__Impl )
            // InternalBPMN_translator.g:3677:2: rule__Http_data__Group_1_1__2__Impl
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
    // InternalBPMN_translator.g:3683:1: rule__Http_data__Group_1_1__2__Impl : ( ( rule__Http_data__Server_ipAssignment_1_1_2 ) ) ;
    public final void rule__Http_data__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3687:1: ( ( ( rule__Http_data__Server_ipAssignment_1_1_2 ) ) )
            // InternalBPMN_translator.g:3688:1: ( ( rule__Http_data__Server_ipAssignment_1_1_2 ) )
            {
            // InternalBPMN_translator.g:3688:1: ( ( rule__Http_data__Server_ipAssignment_1_1_2 ) )
            // InternalBPMN_translator.g:3689:2: ( rule__Http_data__Server_ipAssignment_1_1_2 )
            {
             before(grammarAccess.getHttp_dataAccess().getServer_ipAssignment_1_1_2()); 
            // InternalBPMN_translator.g:3690:2: ( rule__Http_data__Server_ipAssignment_1_1_2 )
            // InternalBPMN_translator.g:3690:3: rule__Http_data__Server_ipAssignment_1_1_2
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
    // InternalBPMN_translator.g:3699:1: rule__Http_data__Group_1_2__0 : rule__Http_data__Group_1_2__0__Impl rule__Http_data__Group_1_2__1 ;
    public final void rule__Http_data__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3703:1: ( rule__Http_data__Group_1_2__0__Impl rule__Http_data__Group_1_2__1 )
            // InternalBPMN_translator.g:3704:2: rule__Http_data__Group_1_2__0__Impl rule__Http_data__Group_1_2__1
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
    // InternalBPMN_translator.g:3711:1: rule__Http_data__Group_1_2__0__Impl : ( 'REQUEST_TYPE' ) ;
    public final void rule__Http_data__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3715:1: ( ( 'REQUEST_TYPE' ) )
            // InternalBPMN_translator.g:3716:1: ( 'REQUEST_TYPE' )
            {
            // InternalBPMN_translator.g:3716:1: ( 'REQUEST_TYPE' )
            // InternalBPMN_translator.g:3717:2: 'REQUEST_TYPE'
            {
             before(grammarAccess.getHttp_dataAccess().getREQUEST_TYPEKeyword_1_2_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3726:1: rule__Http_data__Group_1_2__1 : rule__Http_data__Group_1_2__1__Impl rule__Http_data__Group_1_2__2 ;
    public final void rule__Http_data__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3730:1: ( rule__Http_data__Group_1_2__1__Impl rule__Http_data__Group_1_2__2 )
            // InternalBPMN_translator.g:3731:2: rule__Http_data__Group_1_2__1__Impl rule__Http_data__Group_1_2__2
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
    // InternalBPMN_translator.g:3738:1: rule__Http_data__Group_1_2__1__Impl : ( '=' ) ;
    public final void rule__Http_data__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3742:1: ( ( '=' ) )
            // InternalBPMN_translator.g:3743:1: ( '=' )
            {
            // InternalBPMN_translator.g:3743:1: ( '=' )
            // InternalBPMN_translator.g:3744:2: '='
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
    // InternalBPMN_translator.g:3753:1: rule__Http_data__Group_1_2__2 : rule__Http_data__Group_1_2__2__Impl ;
    public final void rule__Http_data__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3757:1: ( rule__Http_data__Group_1_2__2__Impl )
            // InternalBPMN_translator.g:3758:2: rule__Http_data__Group_1_2__2__Impl
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
    // InternalBPMN_translator.g:3764:1: rule__Http_data__Group_1_2__2__Impl : ( ( rule__Http_data__Request_typeAssignment_1_2_2 ) ) ;
    public final void rule__Http_data__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3768:1: ( ( ( rule__Http_data__Request_typeAssignment_1_2_2 ) ) )
            // InternalBPMN_translator.g:3769:1: ( ( rule__Http_data__Request_typeAssignment_1_2_2 ) )
            {
            // InternalBPMN_translator.g:3769:1: ( ( rule__Http_data__Request_typeAssignment_1_2_2 ) )
            // InternalBPMN_translator.g:3770:2: ( rule__Http_data__Request_typeAssignment_1_2_2 )
            {
             before(grammarAccess.getHttp_dataAccess().getRequest_typeAssignment_1_2_2()); 
            // InternalBPMN_translator.g:3771:2: ( rule__Http_data__Request_typeAssignment_1_2_2 )
            // InternalBPMN_translator.g:3771:3: rule__Http_data__Request_typeAssignment_1_2_2
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
    // InternalBPMN_translator.g:3780:1: rule__Http_data__Group_1_3__0 : rule__Http_data__Group_1_3__0__Impl rule__Http_data__Group_1_3__1 ;
    public final void rule__Http_data__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3784:1: ( rule__Http_data__Group_1_3__0__Impl rule__Http_data__Group_1_3__1 )
            // InternalBPMN_translator.g:3785:2: rule__Http_data__Group_1_3__0__Impl rule__Http_data__Group_1_3__1
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
    // InternalBPMN_translator.g:3792:1: rule__Http_data__Group_1_3__0__Impl : ( 'CONTENT_TYPE' ) ;
    public final void rule__Http_data__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3796:1: ( ( 'CONTENT_TYPE' ) )
            // InternalBPMN_translator.g:3797:1: ( 'CONTENT_TYPE' )
            {
            // InternalBPMN_translator.g:3797:1: ( 'CONTENT_TYPE' )
            // InternalBPMN_translator.g:3798:2: 'CONTENT_TYPE'
            {
             before(grammarAccess.getHttp_dataAccess().getCONTENT_TYPEKeyword_1_3_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3807:1: rule__Http_data__Group_1_3__1 : rule__Http_data__Group_1_3__1__Impl rule__Http_data__Group_1_3__2 ;
    public final void rule__Http_data__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3811:1: ( rule__Http_data__Group_1_3__1__Impl rule__Http_data__Group_1_3__2 )
            // InternalBPMN_translator.g:3812:2: rule__Http_data__Group_1_3__1__Impl rule__Http_data__Group_1_3__2
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
    // InternalBPMN_translator.g:3819:1: rule__Http_data__Group_1_3__1__Impl : ( '=' ) ;
    public final void rule__Http_data__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3823:1: ( ( '=' ) )
            // InternalBPMN_translator.g:3824:1: ( '=' )
            {
            // InternalBPMN_translator.g:3824:1: ( '=' )
            // InternalBPMN_translator.g:3825:2: '='
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
    // InternalBPMN_translator.g:3834:1: rule__Http_data__Group_1_3__2 : rule__Http_data__Group_1_3__2__Impl ;
    public final void rule__Http_data__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3838:1: ( rule__Http_data__Group_1_3__2__Impl )
            // InternalBPMN_translator.g:3839:2: rule__Http_data__Group_1_3__2__Impl
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
    // InternalBPMN_translator.g:3845:1: rule__Http_data__Group_1_3__2__Impl : ( ( rule__Http_data__Content_typeAssignment_1_3_2 ) ) ;
    public final void rule__Http_data__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3849:1: ( ( ( rule__Http_data__Content_typeAssignment_1_3_2 ) ) )
            // InternalBPMN_translator.g:3850:1: ( ( rule__Http_data__Content_typeAssignment_1_3_2 ) )
            {
            // InternalBPMN_translator.g:3850:1: ( ( rule__Http_data__Content_typeAssignment_1_3_2 ) )
            // InternalBPMN_translator.g:3851:2: ( rule__Http_data__Content_typeAssignment_1_3_2 )
            {
             before(grammarAccess.getHttp_dataAccess().getContent_typeAssignment_1_3_2()); 
            // InternalBPMN_translator.g:3852:2: ( rule__Http_data__Content_typeAssignment_1_3_2 )
            // InternalBPMN_translator.g:3852:3: rule__Http_data__Content_typeAssignment_1_3_2
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
    // InternalBPMN_translator.g:3861:1: rule__Http_data__Group_1_4__0 : rule__Http_data__Group_1_4__0__Impl rule__Http_data__Group_1_4__1 ;
    public final void rule__Http_data__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3865:1: ( rule__Http_data__Group_1_4__0__Impl rule__Http_data__Group_1_4__1 )
            // InternalBPMN_translator.g:3866:2: rule__Http_data__Group_1_4__0__Impl rule__Http_data__Group_1_4__1
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
    // InternalBPMN_translator.g:3873:1: rule__Http_data__Group_1_4__0__Impl : ( 'HEADER' ) ;
    public final void rule__Http_data__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3877:1: ( ( 'HEADER' ) )
            // InternalBPMN_translator.g:3878:1: ( 'HEADER' )
            {
            // InternalBPMN_translator.g:3878:1: ( 'HEADER' )
            // InternalBPMN_translator.g:3879:2: 'HEADER'
            {
             before(grammarAccess.getHttp_dataAccess().getHEADERKeyword_1_4_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3888:1: rule__Http_data__Group_1_4__1 : rule__Http_data__Group_1_4__1__Impl rule__Http_data__Group_1_4__2 ;
    public final void rule__Http_data__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3892:1: ( rule__Http_data__Group_1_4__1__Impl rule__Http_data__Group_1_4__2 )
            // InternalBPMN_translator.g:3893:2: rule__Http_data__Group_1_4__1__Impl rule__Http_data__Group_1_4__2
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
    // InternalBPMN_translator.g:3900:1: rule__Http_data__Group_1_4__1__Impl : ( '=' ) ;
    public final void rule__Http_data__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3904:1: ( ( '=' ) )
            // InternalBPMN_translator.g:3905:1: ( '=' )
            {
            // InternalBPMN_translator.g:3905:1: ( '=' )
            // InternalBPMN_translator.g:3906:2: '='
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
    // InternalBPMN_translator.g:3915:1: rule__Http_data__Group_1_4__2 : rule__Http_data__Group_1_4__2__Impl ;
    public final void rule__Http_data__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3919:1: ( rule__Http_data__Group_1_4__2__Impl )
            // InternalBPMN_translator.g:3920:2: rule__Http_data__Group_1_4__2__Impl
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
    // InternalBPMN_translator.g:3926:1: rule__Http_data__Group_1_4__2__Impl : ( ( rule__Http_data__HeaderAssignment_1_4_2 ) ) ;
    public final void rule__Http_data__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3930:1: ( ( ( rule__Http_data__HeaderAssignment_1_4_2 ) ) )
            // InternalBPMN_translator.g:3931:1: ( ( rule__Http_data__HeaderAssignment_1_4_2 ) )
            {
            // InternalBPMN_translator.g:3931:1: ( ( rule__Http_data__HeaderAssignment_1_4_2 ) )
            // InternalBPMN_translator.g:3932:2: ( rule__Http_data__HeaderAssignment_1_4_2 )
            {
             before(grammarAccess.getHttp_dataAccess().getHeaderAssignment_1_4_2()); 
            // InternalBPMN_translator.g:3933:2: ( rule__Http_data__HeaderAssignment_1_4_2 )
            // InternalBPMN_translator.g:3933:3: rule__Http_data__HeaderAssignment_1_4_2
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
    // InternalBPMN_translator.g:3942:1: rule__Http_data__Group_1_5__0 : rule__Http_data__Group_1_5__0__Impl rule__Http_data__Group_1_5__1 ;
    public final void rule__Http_data__Group_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3946:1: ( rule__Http_data__Group_1_5__0__Impl rule__Http_data__Group_1_5__1 )
            // InternalBPMN_translator.g:3947:2: rule__Http_data__Group_1_5__0__Impl rule__Http_data__Group_1_5__1
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
    // InternalBPMN_translator.g:3954:1: rule__Http_data__Group_1_5__0__Impl : ( 'DATA' ) ;
    public final void rule__Http_data__Group_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3958:1: ( ( 'DATA' ) )
            // InternalBPMN_translator.g:3959:1: ( 'DATA' )
            {
            // InternalBPMN_translator.g:3959:1: ( 'DATA' )
            // InternalBPMN_translator.g:3960:2: 'DATA'
            {
             before(grammarAccess.getHttp_dataAccess().getDATAKeyword_1_5_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3969:1: rule__Http_data__Group_1_5__1 : rule__Http_data__Group_1_5__1__Impl rule__Http_data__Group_1_5__2 ;
    public final void rule__Http_data__Group_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3973:1: ( rule__Http_data__Group_1_5__1__Impl rule__Http_data__Group_1_5__2 )
            // InternalBPMN_translator.g:3974:2: rule__Http_data__Group_1_5__1__Impl rule__Http_data__Group_1_5__2
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
    // InternalBPMN_translator.g:3981:1: rule__Http_data__Group_1_5__1__Impl : ( '=' ) ;
    public final void rule__Http_data__Group_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3985:1: ( ( '=' ) )
            // InternalBPMN_translator.g:3986:1: ( '=' )
            {
            // InternalBPMN_translator.g:3986:1: ( '=' )
            // InternalBPMN_translator.g:3987:2: '='
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
    // InternalBPMN_translator.g:3996:1: rule__Http_data__Group_1_5__2 : rule__Http_data__Group_1_5__2__Impl ;
    public final void rule__Http_data__Group_1_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4000:1: ( rule__Http_data__Group_1_5__2__Impl )
            // InternalBPMN_translator.g:4001:2: rule__Http_data__Group_1_5__2__Impl
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
    // InternalBPMN_translator.g:4007:1: rule__Http_data__Group_1_5__2__Impl : ( ( rule__Http_data__DataAssignment_1_5_2 ) ) ;
    public final void rule__Http_data__Group_1_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4011:1: ( ( ( rule__Http_data__DataAssignment_1_5_2 ) ) )
            // InternalBPMN_translator.g:4012:1: ( ( rule__Http_data__DataAssignment_1_5_2 ) )
            {
            // InternalBPMN_translator.g:4012:1: ( ( rule__Http_data__DataAssignment_1_5_2 ) )
            // InternalBPMN_translator.g:4013:2: ( rule__Http_data__DataAssignment_1_5_2 )
            {
             before(grammarAccess.getHttp_dataAccess().getDataAssignment_1_5_2()); 
            // InternalBPMN_translator.g:4014:2: ( rule__Http_data__DataAssignment_1_5_2 )
            // InternalBPMN_translator.g:4014:3: rule__Http_data__DataAssignment_1_5_2
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
    // InternalBPMN_translator.g:4023:1: rule__Http_data__Group_1_6__0 : rule__Http_data__Group_1_6__0__Impl rule__Http_data__Group_1_6__1 ;
    public final void rule__Http_data__Group_1_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4027:1: ( rule__Http_data__Group_1_6__0__Impl rule__Http_data__Group_1_6__1 )
            // InternalBPMN_translator.g:4028:2: rule__Http_data__Group_1_6__0__Impl rule__Http_data__Group_1_6__1
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
    // InternalBPMN_translator.g:4035:1: rule__Http_data__Group_1_6__0__Impl : ( 'NETWORK' ) ;
    public final void rule__Http_data__Group_1_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4039:1: ( ( 'NETWORK' ) )
            // InternalBPMN_translator.g:4040:1: ( 'NETWORK' )
            {
            // InternalBPMN_translator.g:4040:1: ( 'NETWORK' )
            // InternalBPMN_translator.g:4041:2: 'NETWORK'
            {
             before(grammarAccess.getHttp_dataAccess().getNETWORKKeyword_1_6_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4050:1: rule__Http_data__Group_1_6__1 : rule__Http_data__Group_1_6__1__Impl rule__Http_data__Group_1_6__2 ;
    public final void rule__Http_data__Group_1_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4054:1: ( rule__Http_data__Group_1_6__1__Impl rule__Http_data__Group_1_6__2 )
            // InternalBPMN_translator.g:4055:2: rule__Http_data__Group_1_6__1__Impl rule__Http_data__Group_1_6__2
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
    // InternalBPMN_translator.g:4062:1: rule__Http_data__Group_1_6__1__Impl : ( '{' ) ;
    public final void rule__Http_data__Group_1_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4066:1: ( ( '{' ) )
            // InternalBPMN_translator.g:4067:1: ( '{' )
            {
            // InternalBPMN_translator.g:4067:1: ( '{' )
            // InternalBPMN_translator.g:4068:2: '{'
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
    // InternalBPMN_translator.g:4077:1: rule__Http_data__Group_1_6__2 : rule__Http_data__Group_1_6__2__Impl rule__Http_data__Group_1_6__3 ;
    public final void rule__Http_data__Group_1_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4081:1: ( rule__Http_data__Group_1_6__2__Impl rule__Http_data__Group_1_6__3 )
            // InternalBPMN_translator.g:4082:2: rule__Http_data__Group_1_6__2__Impl rule__Http_data__Group_1_6__3
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
    // InternalBPMN_translator.g:4089:1: rule__Http_data__Group_1_6__2__Impl : ( ( rule__Http_data__Mqtt_network_dataAssignment_1_6_2 )* ) ;
    public final void rule__Http_data__Group_1_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4093:1: ( ( ( rule__Http_data__Mqtt_network_dataAssignment_1_6_2 )* ) )
            // InternalBPMN_translator.g:4094:1: ( ( rule__Http_data__Mqtt_network_dataAssignment_1_6_2 )* )
            {
            // InternalBPMN_translator.g:4094:1: ( ( rule__Http_data__Mqtt_network_dataAssignment_1_6_2 )* )
            // InternalBPMN_translator.g:4095:2: ( rule__Http_data__Mqtt_network_dataAssignment_1_6_2 )*
            {
             before(grammarAccess.getHttp_dataAccess().getMqtt_network_dataAssignment_1_6_2()); 
            // InternalBPMN_translator.g:4096:2: ( rule__Http_data__Mqtt_network_dataAssignment_1_6_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==58) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalBPMN_translator.g:4096:3: rule__Http_data__Mqtt_network_dataAssignment_1_6_2
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__Http_data__Mqtt_network_dataAssignment_1_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalBPMN_translator.g:4104:1: rule__Http_data__Group_1_6__3 : rule__Http_data__Group_1_6__3__Impl ;
    public final void rule__Http_data__Group_1_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4108:1: ( rule__Http_data__Group_1_6__3__Impl )
            // InternalBPMN_translator.g:4109:2: rule__Http_data__Group_1_6__3__Impl
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
    // InternalBPMN_translator.g:4115:1: rule__Http_data__Group_1_6__3__Impl : ( '}' ) ;
    public final void rule__Http_data__Group_1_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4119:1: ( ( '}' ) )
            // InternalBPMN_translator.g:4120:1: ( '}' )
            {
            // InternalBPMN_translator.g:4120:1: ( '}' )
            // InternalBPMN_translator.g:4121:2: '}'
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
    // InternalBPMN_translator.g:4131:1: rule__Mqtt_data__Group__0 : rule__Mqtt_data__Group__0__Impl rule__Mqtt_data__Group__1 ;
    public final void rule__Mqtt_data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4135:1: ( rule__Mqtt_data__Group__0__Impl rule__Mqtt_data__Group__1 )
            // InternalBPMN_translator.g:4136:2: rule__Mqtt_data__Group__0__Impl rule__Mqtt_data__Group__1
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
    // InternalBPMN_translator.g:4143:1: rule__Mqtt_data__Group__0__Impl : ( () ) ;
    public final void rule__Mqtt_data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4147:1: ( ( () ) )
            // InternalBPMN_translator.g:4148:1: ( () )
            {
            // InternalBPMN_translator.g:4148:1: ( () )
            // InternalBPMN_translator.g:4149:2: ()
            {
             before(grammarAccess.getMqtt_dataAccess().getMqtt_dataAction_0()); 
            // InternalBPMN_translator.g:4150:2: ()
            // InternalBPMN_translator.g:4150:3: 
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
    // InternalBPMN_translator.g:4158:1: rule__Mqtt_data__Group__1 : rule__Mqtt_data__Group__1__Impl ;
    public final void rule__Mqtt_data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4162:1: ( rule__Mqtt_data__Group__1__Impl )
            // InternalBPMN_translator.g:4163:2: rule__Mqtt_data__Group__1__Impl
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
    // InternalBPMN_translator.g:4169:1: rule__Mqtt_data__Group__1__Impl : ( ( rule__Mqtt_data__Alternatives_1 )* ) ;
    public final void rule__Mqtt_data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4173:1: ( ( ( rule__Mqtt_data__Alternatives_1 )* ) )
            // InternalBPMN_translator.g:4174:1: ( ( rule__Mqtt_data__Alternatives_1 )* )
            {
            // InternalBPMN_translator.g:4174:1: ( ( rule__Mqtt_data__Alternatives_1 )* )
            // InternalBPMN_translator.g:4175:2: ( rule__Mqtt_data__Alternatives_1 )*
            {
             before(grammarAccess.getMqtt_dataAccess().getAlternatives_1()); 
            // InternalBPMN_translator.g:4176:2: ( rule__Mqtt_data__Alternatives_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==45||(LA29_0>=51 && LA29_0<=55)||LA29_0==57) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalBPMN_translator.g:4176:3: rule__Mqtt_data__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__Mqtt_data__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalBPMN_translator.g:4185:1: rule__Mqtt_data__Group_1_0__0 : rule__Mqtt_data__Group_1_0__0__Impl rule__Mqtt_data__Group_1_0__1 ;
    public final void rule__Mqtt_data__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4189:1: ( rule__Mqtt_data__Group_1_0__0__Impl rule__Mqtt_data__Group_1_0__1 )
            // InternalBPMN_translator.g:4190:2: rule__Mqtt_data__Group_1_0__0__Impl rule__Mqtt_data__Group_1_0__1
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
    // InternalBPMN_translator.g:4197:1: rule__Mqtt_data__Group_1_0__0__Impl : ( 'NAME' ) ;
    public final void rule__Mqtt_data__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4201:1: ( ( 'NAME' ) )
            // InternalBPMN_translator.g:4202:1: ( 'NAME' )
            {
            // InternalBPMN_translator.g:4202:1: ( 'NAME' )
            // InternalBPMN_translator.g:4203:2: 'NAME'
            {
             before(grammarAccess.getMqtt_dataAccess().getNAMEKeyword_1_0_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4212:1: rule__Mqtt_data__Group_1_0__1 : rule__Mqtt_data__Group_1_0__1__Impl rule__Mqtt_data__Group_1_0__2 ;
    public final void rule__Mqtt_data__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4216:1: ( rule__Mqtt_data__Group_1_0__1__Impl rule__Mqtt_data__Group_1_0__2 )
            // InternalBPMN_translator.g:4217:2: rule__Mqtt_data__Group_1_0__1__Impl rule__Mqtt_data__Group_1_0__2
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
    // InternalBPMN_translator.g:4224:1: rule__Mqtt_data__Group_1_0__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4228:1: ( ( '=' ) )
            // InternalBPMN_translator.g:4229:1: ( '=' )
            {
            // InternalBPMN_translator.g:4229:1: ( '=' )
            // InternalBPMN_translator.g:4230:2: '='
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
    // InternalBPMN_translator.g:4239:1: rule__Mqtt_data__Group_1_0__2 : rule__Mqtt_data__Group_1_0__2__Impl ;
    public final void rule__Mqtt_data__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4243:1: ( rule__Mqtt_data__Group_1_0__2__Impl )
            // InternalBPMN_translator.g:4244:2: rule__Mqtt_data__Group_1_0__2__Impl
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
    // InternalBPMN_translator.g:4250:1: rule__Mqtt_data__Group_1_0__2__Impl : ( ( rule__Mqtt_data__PnameAssignment_1_0_2 ) ) ;
    public final void rule__Mqtt_data__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4254:1: ( ( ( rule__Mqtt_data__PnameAssignment_1_0_2 ) ) )
            // InternalBPMN_translator.g:4255:1: ( ( rule__Mqtt_data__PnameAssignment_1_0_2 ) )
            {
            // InternalBPMN_translator.g:4255:1: ( ( rule__Mqtt_data__PnameAssignment_1_0_2 ) )
            // InternalBPMN_translator.g:4256:2: ( rule__Mqtt_data__PnameAssignment_1_0_2 )
            {
             before(grammarAccess.getMqtt_dataAccess().getPnameAssignment_1_0_2()); 
            // InternalBPMN_translator.g:4257:2: ( rule__Mqtt_data__PnameAssignment_1_0_2 )
            // InternalBPMN_translator.g:4257:3: rule__Mqtt_data__PnameAssignment_1_0_2
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
    // InternalBPMN_translator.g:4266:1: rule__Mqtt_data__Group_1_1__0 : rule__Mqtt_data__Group_1_1__0__Impl rule__Mqtt_data__Group_1_1__1 ;
    public final void rule__Mqtt_data__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4270:1: ( rule__Mqtt_data__Group_1_1__0__Impl rule__Mqtt_data__Group_1_1__1 )
            // InternalBPMN_translator.g:4271:2: rule__Mqtt_data__Group_1_1__0__Impl rule__Mqtt_data__Group_1_1__1
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
    // InternalBPMN_translator.g:4278:1: rule__Mqtt_data__Group_1_1__0__Impl : ( 'BROKER_USER' ) ;
    public final void rule__Mqtt_data__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4282:1: ( ( 'BROKER_USER' ) )
            // InternalBPMN_translator.g:4283:1: ( 'BROKER_USER' )
            {
            // InternalBPMN_translator.g:4283:1: ( 'BROKER_USER' )
            // InternalBPMN_translator.g:4284:2: 'BROKER_USER'
            {
             before(grammarAccess.getMqtt_dataAccess().getBROKER_USERKeyword_1_1_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4293:1: rule__Mqtt_data__Group_1_1__1 : rule__Mqtt_data__Group_1_1__1__Impl rule__Mqtt_data__Group_1_1__2 ;
    public final void rule__Mqtt_data__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4297:1: ( rule__Mqtt_data__Group_1_1__1__Impl rule__Mqtt_data__Group_1_1__2 )
            // InternalBPMN_translator.g:4298:2: rule__Mqtt_data__Group_1_1__1__Impl rule__Mqtt_data__Group_1_1__2
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
    // InternalBPMN_translator.g:4305:1: rule__Mqtt_data__Group_1_1__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4309:1: ( ( '=' ) )
            // InternalBPMN_translator.g:4310:1: ( '=' )
            {
            // InternalBPMN_translator.g:4310:1: ( '=' )
            // InternalBPMN_translator.g:4311:2: '='
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
    // InternalBPMN_translator.g:4320:1: rule__Mqtt_data__Group_1_1__2 : rule__Mqtt_data__Group_1_1__2__Impl ;
    public final void rule__Mqtt_data__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4324:1: ( rule__Mqtt_data__Group_1_1__2__Impl )
            // InternalBPMN_translator.g:4325:2: rule__Mqtt_data__Group_1_1__2__Impl
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
    // InternalBPMN_translator.g:4331:1: rule__Mqtt_data__Group_1_1__2__Impl : ( ( rule__Mqtt_data__Broker_userAssignment_1_1_2 ) ) ;
    public final void rule__Mqtt_data__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4335:1: ( ( ( rule__Mqtt_data__Broker_userAssignment_1_1_2 ) ) )
            // InternalBPMN_translator.g:4336:1: ( ( rule__Mqtt_data__Broker_userAssignment_1_1_2 ) )
            {
            // InternalBPMN_translator.g:4336:1: ( ( rule__Mqtt_data__Broker_userAssignment_1_1_2 ) )
            // InternalBPMN_translator.g:4337:2: ( rule__Mqtt_data__Broker_userAssignment_1_1_2 )
            {
             before(grammarAccess.getMqtt_dataAccess().getBroker_userAssignment_1_1_2()); 
            // InternalBPMN_translator.g:4338:2: ( rule__Mqtt_data__Broker_userAssignment_1_1_2 )
            // InternalBPMN_translator.g:4338:3: rule__Mqtt_data__Broker_userAssignment_1_1_2
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
    // InternalBPMN_translator.g:4347:1: rule__Mqtt_data__Group_1_2__0 : rule__Mqtt_data__Group_1_2__0__Impl rule__Mqtt_data__Group_1_2__1 ;
    public final void rule__Mqtt_data__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4351:1: ( rule__Mqtt_data__Group_1_2__0__Impl rule__Mqtt_data__Group_1_2__1 )
            // InternalBPMN_translator.g:4352:2: rule__Mqtt_data__Group_1_2__0__Impl rule__Mqtt_data__Group_1_2__1
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
    // InternalBPMN_translator.g:4359:1: rule__Mqtt_data__Group_1_2__0__Impl : ( 'BROKER_PASSWORD' ) ;
    public final void rule__Mqtt_data__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4363:1: ( ( 'BROKER_PASSWORD' ) )
            // InternalBPMN_translator.g:4364:1: ( 'BROKER_PASSWORD' )
            {
            // InternalBPMN_translator.g:4364:1: ( 'BROKER_PASSWORD' )
            // InternalBPMN_translator.g:4365:2: 'BROKER_PASSWORD'
            {
             before(grammarAccess.getMqtt_dataAccess().getBROKER_PASSWORDKeyword_1_2_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4374:1: rule__Mqtt_data__Group_1_2__1 : rule__Mqtt_data__Group_1_2__1__Impl rule__Mqtt_data__Group_1_2__2 ;
    public final void rule__Mqtt_data__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4378:1: ( rule__Mqtt_data__Group_1_2__1__Impl rule__Mqtt_data__Group_1_2__2 )
            // InternalBPMN_translator.g:4379:2: rule__Mqtt_data__Group_1_2__1__Impl rule__Mqtt_data__Group_1_2__2
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
    // InternalBPMN_translator.g:4386:1: rule__Mqtt_data__Group_1_2__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4390:1: ( ( '=' ) )
            // InternalBPMN_translator.g:4391:1: ( '=' )
            {
            // InternalBPMN_translator.g:4391:1: ( '=' )
            // InternalBPMN_translator.g:4392:2: '='
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
    // InternalBPMN_translator.g:4401:1: rule__Mqtt_data__Group_1_2__2 : rule__Mqtt_data__Group_1_2__2__Impl ;
    public final void rule__Mqtt_data__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4405:1: ( rule__Mqtt_data__Group_1_2__2__Impl )
            // InternalBPMN_translator.g:4406:2: rule__Mqtt_data__Group_1_2__2__Impl
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
    // InternalBPMN_translator.g:4412:1: rule__Mqtt_data__Group_1_2__2__Impl : ( ( rule__Mqtt_data__Broker_passwordAssignment_1_2_2 ) ) ;
    public final void rule__Mqtt_data__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4416:1: ( ( ( rule__Mqtt_data__Broker_passwordAssignment_1_2_2 ) ) )
            // InternalBPMN_translator.g:4417:1: ( ( rule__Mqtt_data__Broker_passwordAssignment_1_2_2 ) )
            {
            // InternalBPMN_translator.g:4417:1: ( ( rule__Mqtt_data__Broker_passwordAssignment_1_2_2 ) )
            // InternalBPMN_translator.g:4418:2: ( rule__Mqtt_data__Broker_passwordAssignment_1_2_2 )
            {
             before(grammarAccess.getMqtt_dataAccess().getBroker_passwordAssignment_1_2_2()); 
            // InternalBPMN_translator.g:4419:2: ( rule__Mqtt_data__Broker_passwordAssignment_1_2_2 )
            // InternalBPMN_translator.g:4419:3: rule__Mqtt_data__Broker_passwordAssignment_1_2_2
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
    // InternalBPMN_translator.g:4428:1: rule__Mqtt_data__Group_1_3__0 : rule__Mqtt_data__Group_1_3__0__Impl rule__Mqtt_data__Group_1_3__1 ;
    public final void rule__Mqtt_data__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4432:1: ( rule__Mqtt_data__Group_1_3__0__Impl rule__Mqtt_data__Group_1_3__1 )
            // InternalBPMN_translator.g:4433:2: rule__Mqtt_data__Group_1_3__0__Impl rule__Mqtt_data__Group_1_3__1
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
    // InternalBPMN_translator.g:4440:1: rule__Mqtt_data__Group_1_3__0__Impl : ( 'BROKER' ) ;
    public final void rule__Mqtt_data__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4444:1: ( ( 'BROKER' ) )
            // InternalBPMN_translator.g:4445:1: ( 'BROKER' )
            {
            // InternalBPMN_translator.g:4445:1: ( 'BROKER' )
            // InternalBPMN_translator.g:4446:2: 'BROKER'
            {
             before(grammarAccess.getMqtt_dataAccess().getBROKERKeyword_1_3_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4455:1: rule__Mqtt_data__Group_1_3__1 : rule__Mqtt_data__Group_1_3__1__Impl rule__Mqtt_data__Group_1_3__2 ;
    public final void rule__Mqtt_data__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4459:1: ( rule__Mqtt_data__Group_1_3__1__Impl rule__Mqtt_data__Group_1_3__2 )
            // InternalBPMN_translator.g:4460:2: rule__Mqtt_data__Group_1_3__1__Impl rule__Mqtt_data__Group_1_3__2
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
    // InternalBPMN_translator.g:4467:1: rule__Mqtt_data__Group_1_3__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4471:1: ( ( '=' ) )
            // InternalBPMN_translator.g:4472:1: ( '=' )
            {
            // InternalBPMN_translator.g:4472:1: ( '=' )
            // InternalBPMN_translator.g:4473:2: '='
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
    // InternalBPMN_translator.g:4482:1: rule__Mqtt_data__Group_1_3__2 : rule__Mqtt_data__Group_1_3__2__Impl ;
    public final void rule__Mqtt_data__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4486:1: ( rule__Mqtt_data__Group_1_3__2__Impl )
            // InternalBPMN_translator.g:4487:2: rule__Mqtt_data__Group_1_3__2__Impl
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
    // InternalBPMN_translator.g:4493:1: rule__Mqtt_data__Group_1_3__2__Impl : ( ( rule__Mqtt_data__BrokerAssignment_1_3_2 ) ) ;
    public final void rule__Mqtt_data__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4497:1: ( ( ( rule__Mqtt_data__BrokerAssignment_1_3_2 ) ) )
            // InternalBPMN_translator.g:4498:1: ( ( rule__Mqtt_data__BrokerAssignment_1_3_2 ) )
            {
            // InternalBPMN_translator.g:4498:1: ( ( rule__Mqtt_data__BrokerAssignment_1_3_2 ) )
            // InternalBPMN_translator.g:4499:2: ( rule__Mqtt_data__BrokerAssignment_1_3_2 )
            {
             before(grammarAccess.getMqtt_dataAccess().getBrokerAssignment_1_3_2()); 
            // InternalBPMN_translator.g:4500:2: ( rule__Mqtt_data__BrokerAssignment_1_3_2 )
            // InternalBPMN_translator.g:4500:3: rule__Mqtt_data__BrokerAssignment_1_3_2
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
    // InternalBPMN_translator.g:4509:1: rule__Mqtt_data__Group_1_4__0 : rule__Mqtt_data__Group_1_4__0__Impl rule__Mqtt_data__Group_1_4__1 ;
    public final void rule__Mqtt_data__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4513:1: ( rule__Mqtt_data__Group_1_4__0__Impl rule__Mqtt_data__Group_1_4__1 )
            // InternalBPMN_translator.g:4514:2: rule__Mqtt_data__Group_1_4__0__Impl rule__Mqtt_data__Group_1_4__1
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
    // InternalBPMN_translator.g:4521:1: rule__Mqtt_data__Group_1_4__0__Impl : ( 'NETWORK' ) ;
    public final void rule__Mqtt_data__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4525:1: ( ( 'NETWORK' ) )
            // InternalBPMN_translator.g:4526:1: ( 'NETWORK' )
            {
            // InternalBPMN_translator.g:4526:1: ( 'NETWORK' )
            // InternalBPMN_translator.g:4527:2: 'NETWORK'
            {
             before(grammarAccess.getMqtt_dataAccess().getNETWORKKeyword_1_4_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4536:1: rule__Mqtt_data__Group_1_4__1 : rule__Mqtt_data__Group_1_4__1__Impl rule__Mqtt_data__Group_1_4__2 ;
    public final void rule__Mqtt_data__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4540:1: ( rule__Mqtt_data__Group_1_4__1__Impl rule__Mqtt_data__Group_1_4__2 )
            // InternalBPMN_translator.g:4541:2: rule__Mqtt_data__Group_1_4__1__Impl rule__Mqtt_data__Group_1_4__2
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
    // InternalBPMN_translator.g:4548:1: rule__Mqtt_data__Group_1_4__1__Impl : ( '{' ) ;
    public final void rule__Mqtt_data__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4552:1: ( ( '{' ) )
            // InternalBPMN_translator.g:4553:1: ( '{' )
            {
            // InternalBPMN_translator.g:4553:1: ( '{' )
            // InternalBPMN_translator.g:4554:2: '{'
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
    // InternalBPMN_translator.g:4563:1: rule__Mqtt_data__Group_1_4__2 : rule__Mqtt_data__Group_1_4__2__Impl rule__Mqtt_data__Group_1_4__3 ;
    public final void rule__Mqtt_data__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4567:1: ( rule__Mqtt_data__Group_1_4__2__Impl rule__Mqtt_data__Group_1_4__3 )
            // InternalBPMN_translator.g:4568:2: rule__Mqtt_data__Group_1_4__2__Impl rule__Mqtt_data__Group_1_4__3
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
    // InternalBPMN_translator.g:4575:1: rule__Mqtt_data__Group_1_4__2__Impl : ( ( rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 )* ) ;
    public final void rule__Mqtt_data__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4579:1: ( ( ( rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 )* ) )
            // InternalBPMN_translator.g:4580:1: ( ( rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 )* )
            {
            // InternalBPMN_translator.g:4580:1: ( ( rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 )* )
            // InternalBPMN_translator.g:4581:2: ( rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 )*
            {
             before(grammarAccess.getMqtt_dataAccess().getMqtt_network_dataAssignment_1_4_2()); 
            // InternalBPMN_translator.g:4582:2: ( rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==58) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalBPMN_translator.g:4582:3: rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalBPMN_translator.g:4590:1: rule__Mqtt_data__Group_1_4__3 : rule__Mqtt_data__Group_1_4__3__Impl ;
    public final void rule__Mqtt_data__Group_1_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4594:1: ( rule__Mqtt_data__Group_1_4__3__Impl )
            // InternalBPMN_translator.g:4595:2: rule__Mqtt_data__Group_1_4__3__Impl
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
    // InternalBPMN_translator.g:4601:1: rule__Mqtt_data__Group_1_4__3__Impl : ( '}' ) ;
    public final void rule__Mqtt_data__Group_1_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4605:1: ( ( '}' ) )
            // InternalBPMN_translator.g:4606:1: ( '}' )
            {
            // InternalBPMN_translator.g:4606:1: ( '}' )
            // InternalBPMN_translator.g:4607:2: '}'
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
    // InternalBPMN_translator.g:4617:1: rule__Mqtt_data__Group_1_5__0 : rule__Mqtt_data__Group_1_5__0__Impl rule__Mqtt_data__Group_1_5__1 ;
    public final void rule__Mqtt_data__Group_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4621:1: ( rule__Mqtt_data__Group_1_5__0__Impl rule__Mqtt_data__Group_1_5__1 )
            // InternalBPMN_translator.g:4622:2: rule__Mqtt_data__Group_1_5__0__Impl rule__Mqtt_data__Group_1_5__1
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
    // InternalBPMN_translator.g:4629:1: rule__Mqtt_data__Group_1_5__0__Impl : ( 'SUBTOPICS' ) ;
    public final void rule__Mqtt_data__Group_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4633:1: ( ( 'SUBTOPICS' ) )
            // InternalBPMN_translator.g:4634:1: ( 'SUBTOPICS' )
            {
            // InternalBPMN_translator.g:4634:1: ( 'SUBTOPICS' )
            // InternalBPMN_translator.g:4635:2: 'SUBTOPICS'
            {
             before(grammarAccess.getMqtt_dataAccess().getSUBTOPICSKeyword_1_5_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4644:1: rule__Mqtt_data__Group_1_5__1 : rule__Mqtt_data__Group_1_5__1__Impl rule__Mqtt_data__Group_1_5__2 ;
    public final void rule__Mqtt_data__Group_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4648:1: ( rule__Mqtt_data__Group_1_5__1__Impl rule__Mqtt_data__Group_1_5__2 )
            // InternalBPMN_translator.g:4649:2: rule__Mqtt_data__Group_1_5__1__Impl rule__Mqtt_data__Group_1_5__2
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
    // InternalBPMN_translator.g:4656:1: rule__Mqtt_data__Group_1_5__1__Impl : ( '{' ) ;
    public final void rule__Mqtt_data__Group_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4660:1: ( ( '{' ) )
            // InternalBPMN_translator.g:4661:1: ( '{' )
            {
            // InternalBPMN_translator.g:4661:1: ( '{' )
            // InternalBPMN_translator.g:4662:2: '{'
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
    // InternalBPMN_translator.g:4671:1: rule__Mqtt_data__Group_1_5__2 : rule__Mqtt_data__Group_1_5__2__Impl rule__Mqtt_data__Group_1_5__3 ;
    public final void rule__Mqtt_data__Group_1_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4675:1: ( rule__Mqtt_data__Group_1_5__2__Impl rule__Mqtt_data__Group_1_5__3 )
            // InternalBPMN_translator.g:4676:2: rule__Mqtt_data__Group_1_5__2__Impl rule__Mqtt_data__Group_1_5__3
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
    // InternalBPMN_translator.g:4683:1: rule__Mqtt_data__Group_1_5__2__Impl : ( ( rule__Mqtt_data__Group_1_5_2__0 )* ) ;
    public final void rule__Mqtt_data__Group_1_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4687:1: ( ( ( rule__Mqtt_data__Group_1_5_2__0 )* ) )
            // InternalBPMN_translator.g:4688:1: ( ( rule__Mqtt_data__Group_1_5_2__0 )* )
            {
            // InternalBPMN_translator.g:4688:1: ( ( rule__Mqtt_data__Group_1_5_2__0 )* )
            // InternalBPMN_translator.g:4689:2: ( rule__Mqtt_data__Group_1_5_2__0 )*
            {
             before(grammarAccess.getMqtt_dataAccess().getGroup_1_5_2()); 
            // InternalBPMN_translator.g:4690:2: ( rule__Mqtt_data__Group_1_5_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==56) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalBPMN_translator.g:4690:3: rule__Mqtt_data__Group_1_5_2__0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__Mqtt_data__Group_1_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalBPMN_translator.g:4698:1: rule__Mqtt_data__Group_1_5__3 : rule__Mqtt_data__Group_1_5__3__Impl ;
    public final void rule__Mqtt_data__Group_1_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4702:1: ( rule__Mqtt_data__Group_1_5__3__Impl )
            // InternalBPMN_translator.g:4703:2: rule__Mqtt_data__Group_1_5__3__Impl
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
    // InternalBPMN_translator.g:4709:1: rule__Mqtt_data__Group_1_5__3__Impl : ( '}' ) ;
    public final void rule__Mqtt_data__Group_1_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4713:1: ( ( '}' ) )
            // InternalBPMN_translator.g:4714:1: ( '}' )
            {
            // InternalBPMN_translator.g:4714:1: ( '}' )
            // InternalBPMN_translator.g:4715:2: '}'
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
    // InternalBPMN_translator.g:4725:1: rule__Mqtt_data__Group_1_5_2__0 : rule__Mqtt_data__Group_1_5_2__0__Impl rule__Mqtt_data__Group_1_5_2__1 ;
    public final void rule__Mqtt_data__Group_1_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4729:1: ( rule__Mqtt_data__Group_1_5_2__0__Impl rule__Mqtt_data__Group_1_5_2__1 )
            // InternalBPMN_translator.g:4730:2: rule__Mqtt_data__Group_1_5_2__0__Impl rule__Mqtt_data__Group_1_5_2__1
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
    // InternalBPMN_translator.g:4737:1: rule__Mqtt_data__Group_1_5_2__0__Impl : ( 'TOPIC_NAME' ) ;
    public final void rule__Mqtt_data__Group_1_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4741:1: ( ( 'TOPIC_NAME' ) )
            // InternalBPMN_translator.g:4742:1: ( 'TOPIC_NAME' )
            {
            // InternalBPMN_translator.g:4742:1: ( 'TOPIC_NAME' )
            // InternalBPMN_translator.g:4743:2: 'TOPIC_NAME'
            {
             before(grammarAccess.getMqtt_dataAccess().getTOPIC_NAMEKeyword_1_5_2_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4752:1: rule__Mqtt_data__Group_1_5_2__1 : rule__Mqtt_data__Group_1_5_2__1__Impl rule__Mqtt_data__Group_1_5_2__2 ;
    public final void rule__Mqtt_data__Group_1_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4756:1: ( rule__Mqtt_data__Group_1_5_2__1__Impl rule__Mqtt_data__Group_1_5_2__2 )
            // InternalBPMN_translator.g:4757:2: rule__Mqtt_data__Group_1_5_2__1__Impl rule__Mqtt_data__Group_1_5_2__2
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
    // InternalBPMN_translator.g:4764:1: rule__Mqtt_data__Group_1_5_2__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4768:1: ( ( '=' ) )
            // InternalBPMN_translator.g:4769:1: ( '=' )
            {
            // InternalBPMN_translator.g:4769:1: ( '=' )
            // InternalBPMN_translator.g:4770:2: '='
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
    // InternalBPMN_translator.g:4779:1: rule__Mqtt_data__Group_1_5_2__2 : rule__Mqtt_data__Group_1_5_2__2__Impl ;
    public final void rule__Mqtt_data__Group_1_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4783:1: ( rule__Mqtt_data__Group_1_5_2__2__Impl )
            // InternalBPMN_translator.g:4784:2: rule__Mqtt_data__Group_1_5_2__2__Impl
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
    // InternalBPMN_translator.g:4790:1: rule__Mqtt_data__Group_1_5_2__2__Impl : ( ( rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 ) ) ;
    public final void rule__Mqtt_data__Group_1_5_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4794:1: ( ( ( rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 ) ) )
            // InternalBPMN_translator.g:4795:1: ( ( rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 ) )
            {
            // InternalBPMN_translator.g:4795:1: ( ( rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 ) )
            // InternalBPMN_translator.g:4796:2: ( rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 )
            {
             before(grammarAccess.getMqtt_dataAccess().getSubtopicsAssignment_1_5_2_2()); 
            // InternalBPMN_translator.g:4797:2: ( rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 )
            // InternalBPMN_translator.g:4797:3: rule__Mqtt_data__SubtopicsAssignment_1_5_2_2
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
    // InternalBPMN_translator.g:4806:1: rule__Mqtt_data__Group_1_6__0 : rule__Mqtt_data__Group_1_6__0__Impl rule__Mqtt_data__Group_1_6__1 ;
    public final void rule__Mqtt_data__Group_1_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4810:1: ( rule__Mqtt_data__Group_1_6__0__Impl rule__Mqtt_data__Group_1_6__1 )
            // InternalBPMN_translator.g:4811:2: rule__Mqtt_data__Group_1_6__0__Impl rule__Mqtt_data__Group_1_6__1
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
    // InternalBPMN_translator.g:4818:1: rule__Mqtt_data__Group_1_6__0__Impl : ( 'PUBTOPICS' ) ;
    public final void rule__Mqtt_data__Group_1_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4822:1: ( ( 'PUBTOPICS' ) )
            // InternalBPMN_translator.g:4823:1: ( 'PUBTOPICS' )
            {
            // InternalBPMN_translator.g:4823:1: ( 'PUBTOPICS' )
            // InternalBPMN_translator.g:4824:2: 'PUBTOPICS'
            {
             before(grammarAccess.getMqtt_dataAccess().getPUBTOPICSKeyword_1_6_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4833:1: rule__Mqtt_data__Group_1_6__1 : rule__Mqtt_data__Group_1_6__1__Impl rule__Mqtt_data__Group_1_6__2 ;
    public final void rule__Mqtt_data__Group_1_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4837:1: ( rule__Mqtt_data__Group_1_6__1__Impl rule__Mqtt_data__Group_1_6__2 )
            // InternalBPMN_translator.g:4838:2: rule__Mqtt_data__Group_1_6__1__Impl rule__Mqtt_data__Group_1_6__2
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
    // InternalBPMN_translator.g:4845:1: rule__Mqtt_data__Group_1_6__1__Impl : ( '{' ) ;
    public final void rule__Mqtt_data__Group_1_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4849:1: ( ( '{' ) )
            // InternalBPMN_translator.g:4850:1: ( '{' )
            {
            // InternalBPMN_translator.g:4850:1: ( '{' )
            // InternalBPMN_translator.g:4851:2: '{'
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
    // InternalBPMN_translator.g:4860:1: rule__Mqtt_data__Group_1_6__2 : rule__Mqtt_data__Group_1_6__2__Impl rule__Mqtt_data__Group_1_6__3 ;
    public final void rule__Mqtt_data__Group_1_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4864:1: ( rule__Mqtt_data__Group_1_6__2__Impl rule__Mqtt_data__Group_1_6__3 )
            // InternalBPMN_translator.g:4865:2: rule__Mqtt_data__Group_1_6__2__Impl rule__Mqtt_data__Group_1_6__3
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
    // InternalBPMN_translator.g:4872:1: rule__Mqtt_data__Group_1_6__2__Impl : ( ( rule__Mqtt_data__Alternatives_1_6_2 )* ) ;
    public final void rule__Mqtt_data__Group_1_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4876:1: ( ( ( rule__Mqtt_data__Alternatives_1_6_2 )* ) )
            // InternalBPMN_translator.g:4877:1: ( ( rule__Mqtt_data__Alternatives_1_6_2 )* )
            {
            // InternalBPMN_translator.g:4877:1: ( ( rule__Mqtt_data__Alternatives_1_6_2 )* )
            // InternalBPMN_translator.g:4878:2: ( rule__Mqtt_data__Alternatives_1_6_2 )*
            {
             before(grammarAccess.getMqtt_dataAccess().getAlternatives_1_6_2()); 
            // InternalBPMN_translator.g:4879:2: ( rule__Mqtt_data__Alternatives_1_6_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==50||LA32_0==56) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalBPMN_translator.g:4879:3: rule__Mqtt_data__Alternatives_1_6_2
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__Mqtt_data__Alternatives_1_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalBPMN_translator.g:4887:1: rule__Mqtt_data__Group_1_6__3 : rule__Mqtt_data__Group_1_6__3__Impl ;
    public final void rule__Mqtt_data__Group_1_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4891:1: ( rule__Mqtt_data__Group_1_6__3__Impl )
            // InternalBPMN_translator.g:4892:2: rule__Mqtt_data__Group_1_6__3__Impl
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
    // InternalBPMN_translator.g:4898:1: rule__Mqtt_data__Group_1_6__3__Impl : ( '}' ) ;
    public final void rule__Mqtt_data__Group_1_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4902:1: ( ( '}' ) )
            // InternalBPMN_translator.g:4903:1: ( '}' )
            {
            // InternalBPMN_translator.g:4903:1: ( '}' )
            // InternalBPMN_translator.g:4904:2: '}'
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
    // InternalBPMN_translator.g:4914:1: rule__Mqtt_data__Group_1_6_2_0__0 : rule__Mqtt_data__Group_1_6_2_0__0__Impl rule__Mqtt_data__Group_1_6_2_0__1 ;
    public final void rule__Mqtt_data__Group_1_6_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4918:1: ( rule__Mqtt_data__Group_1_6_2_0__0__Impl rule__Mqtt_data__Group_1_6_2_0__1 )
            // InternalBPMN_translator.g:4919:2: rule__Mqtt_data__Group_1_6_2_0__0__Impl rule__Mqtt_data__Group_1_6_2_0__1
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
    // InternalBPMN_translator.g:4926:1: rule__Mqtt_data__Group_1_6_2_0__0__Impl : ( 'TOPIC_NAME' ) ;
    public final void rule__Mqtt_data__Group_1_6_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4930:1: ( ( 'TOPIC_NAME' ) )
            // InternalBPMN_translator.g:4931:1: ( 'TOPIC_NAME' )
            {
            // InternalBPMN_translator.g:4931:1: ( 'TOPIC_NAME' )
            // InternalBPMN_translator.g:4932:2: 'TOPIC_NAME'
            {
             before(grammarAccess.getMqtt_dataAccess().getTOPIC_NAMEKeyword_1_6_2_0_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4941:1: rule__Mqtt_data__Group_1_6_2_0__1 : rule__Mqtt_data__Group_1_6_2_0__1__Impl rule__Mqtt_data__Group_1_6_2_0__2 ;
    public final void rule__Mqtt_data__Group_1_6_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4945:1: ( rule__Mqtt_data__Group_1_6_2_0__1__Impl rule__Mqtt_data__Group_1_6_2_0__2 )
            // InternalBPMN_translator.g:4946:2: rule__Mqtt_data__Group_1_6_2_0__1__Impl rule__Mqtt_data__Group_1_6_2_0__2
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
    // InternalBPMN_translator.g:4953:1: rule__Mqtt_data__Group_1_6_2_0__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_6_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4957:1: ( ( '=' ) )
            // InternalBPMN_translator.g:4958:1: ( '=' )
            {
            // InternalBPMN_translator.g:4958:1: ( '=' )
            // InternalBPMN_translator.g:4959:2: '='
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
    // InternalBPMN_translator.g:4968:1: rule__Mqtt_data__Group_1_6_2_0__2 : rule__Mqtt_data__Group_1_6_2_0__2__Impl ;
    public final void rule__Mqtt_data__Group_1_6_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4972:1: ( rule__Mqtt_data__Group_1_6_2_0__2__Impl )
            // InternalBPMN_translator.g:4973:2: rule__Mqtt_data__Group_1_6_2_0__2__Impl
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
    // InternalBPMN_translator.g:4979:1: rule__Mqtt_data__Group_1_6_2_0__2__Impl : ( ( rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 )* ) ;
    public final void rule__Mqtt_data__Group_1_6_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4983:1: ( ( ( rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 )* ) )
            // InternalBPMN_translator.g:4984:1: ( ( rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 )* )
            {
            // InternalBPMN_translator.g:4984:1: ( ( rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 )* )
            // InternalBPMN_translator.g:4985:2: ( rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 )*
            {
             before(grammarAccess.getMqtt_dataAccess().getPubtopicsAssignment_1_6_2_0_2()); 
            // InternalBPMN_translator.g:4986:2: ( rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_STRING) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalBPMN_translator.g:4986:3: rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalBPMN_translator.g:4995:1: rule__Mqtt_data__Group_1_6_2_1__0 : rule__Mqtt_data__Group_1_6_2_1__0__Impl rule__Mqtt_data__Group_1_6_2_1__1 ;
    public final void rule__Mqtt_data__Group_1_6_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4999:1: ( rule__Mqtt_data__Group_1_6_2_1__0__Impl rule__Mqtt_data__Group_1_6_2_1__1 )
            // InternalBPMN_translator.g:5000:2: rule__Mqtt_data__Group_1_6_2_1__0__Impl rule__Mqtt_data__Group_1_6_2_1__1
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
    // InternalBPMN_translator.g:5007:1: rule__Mqtt_data__Group_1_6_2_1__0__Impl : ( 'DATA' ) ;
    public final void rule__Mqtt_data__Group_1_6_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5011:1: ( ( 'DATA' ) )
            // InternalBPMN_translator.g:5012:1: ( 'DATA' )
            {
            // InternalBPMN_translator.g:5012:1: ( 'DATA' )
            // InternalBPMN_translator.g:5013:2: 'DATA'
            {
             before(grammarAccess.getMqtt_dataAccess().getDATAKeyword_1_6_2_1_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalBPMN_translator.g:5022:1: rule__Mqtt_data__Group_1_6_2_1__1 : rule__Mqtt_data__Group_1_6_2_1__1__Impl rule__Mqtt_data__Group_1_6_2_1__2 ;
    public final void rule__Mqtt_data__Group_1_6_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5026:1: ( rule__Mqtt_data__Group_1_6_2_1__1__Impl rule__Mqtt_data__Group_1_6_2_1__2 )
            // InternalBPMN_translator.g:5027:2: rule__Mqtt_data__Group_1_6_2_1__1__Impl rule__Mqtt_data__Group_1_6_2_1__2
            {
            pushFollow(FOLLOW_49);
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
    // InternalBPMN_translator.g:5034:1: rule__Mqtt_data__Group_1_6_2_1__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_6_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5038:1: ( ( '=' ) )
            // InternalBPMN_translator.g:5039:1: ( '=' )
            {
            // InternalBPMN_translator.g:5039:1: ( '=' )
            // InternalBPMN_translator.g:5040:2: '='
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
    // InternalBPMN_translator.g:5049:1: rule__Mqtt_data__Group_1_6_2_1__2 : rule__Mqtt_data__Group_1_6_2_1__2__Impl ;
    public final void rule__Mqtt_data__Group_1_6_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5053:1: ( rule__Mqtt_data__Group_1_6_2_1__2__Impl )
            // InternalBPMN_translator.g:5054:2: rule__Mqtt_data__Group_1_6_2_1__2__Impl
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
    // InternalBPMN_translator.g:5060:1: rule__Mqtt_data__Group_1_6_2_1__2__Impl : ( ( rule__Mqtt_data__ValueAssignment_1_6_2_1_2 ) ) ;
    public final void rule__Mqtt_data__Group_1_6_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5064:1: ( ( ( rule__Mqtt_data__ValueAssignment_1_6_2_1_2 ) ) )
            // InternalBPMN_translator.g:5065:1: ( ( rule__Mqtt_data__ValueAssignment_1_6_2_1_2 ) )
            {
            // InternalBPMN_translator.g:5065:1: ( ( rule__Mqtt_data__ValueAssignment_1_6_2_1_2 ) )
            // InternalBPMN_translator.g:5066:2: ( rule__Mqtt_data__ValueAssignment_1_6_2_1_2 )
            {
             before(grammarAccess.getMqtt_dataAccess().getValueAssignment_1_6_2_1_2()); 
            // InternalBPMN_translator.g:5067:2: ( rule__Mqtt_data__ValueAssignment_1_6_2_1_2 )
            // InternalBPMN_translator.g:5067:3: rule__Mqtt_data__ValueAssignment_1_6_2_1_2
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


    // $ANTLR start "rule__Protocol_network_data__Group__0"
    // InternalBPMN_translator.g:5076:1: rule__Protocol_network_data__Group__0 : rule__Protocol_network_data__Group__0__Impl rule__Protocol_network_data__Group__1 ;
    public final void rule__Protocol_network_data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5080:1: ( rule__Protocol_network_data__Group__0__Impl rule__Protocol_network_data__Group__1 )
            // InternalBPMN_translator.g:5081:2: rule__Protocol_network_data__Group__0__Impl rule__Protocol_network_data__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Protocol_network_data__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol_network_data__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol_network_data__Group__0"


    // $ANTLR start "rule__Protocol_network_data__Group__0__Impl"
    // InternalBPMN_translator.g:5088:1: rule__Protocol_network_data__Group__0__Impl : ( 'SSID' ) ;
    public final void rule__Protocol_network_data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5092:1: ( ( 'SSID' ) )
            // InternalBPMN_translator.g:5093:1: ( 'SSID' )
            {
            // InternalBPMN_translator.g:5093:1: ( 'SSID' )
            // InternalBPMN_translator.g:5094:2: 'SSID'
            {
             before(grammarAccess.getProtocol_network_dataAccess().getSSIDKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getProtocol_network_dataAccess().getSSIDKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol_network_data__Group__0__Impl"


    // $ANTLR start "rule__Protocol_network_data__Group__1"
    // InternalBPMN_translator.g:5103:1: rule__Protocol_network_data__Group__1 : rule__Protocol_network_data__Group__1__Impl rule__Protocol_network_data__Group__2 ;
    public final void rule__Protocol_network_data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5107:1: ( rule__Protocol_network_data__Group__1__Impl rule__Protocol_network_data__Group__2 )
            // InternalBPMN_translator.g:5108:2: rule__Protocol_network_data__Group__1__Impl rule__Protocol_network_data__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Protocol_network_data__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol_network_data__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol_network_data__Group__1"


    // $ANTLR start "rule__Protocol_network_data__Group__1__Impl"
    // InternalBPMN_translator.g:5115:1: rule__Protocol_network_data__Group__1__Impl : ( '=' ) ;
    public final void rule__Protocol_network_data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5119:1: ( ( '=' ) )
            // InternalBPMN_translator.g:5120:1: ( '=' )
            {
            // InternalBPMN_translator.g:5120:1: ( '=' )
            // InternalBPMN_translator.g:5121:2: '='
            {
             before(grammarAccess.getProtocol_network_dataAccess().getEqualsSignKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProtocol_network_dataAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol_network_data__Group__1__Impl"


    // $ANTLR start "rule__Protocol_network_data__Group__2"
    // InternalBPMN_translator.g:5130:1: rule__Protocol_network_data__Group__2 : rule__Protocol_network_data__Group__2__Impl rule__Protocol_network_data__Group__3 ;
    public final void rule__Protocol_network_data__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5134:1: ( rule__Protocol_network_data__Group__2__Impl rule__Protocol_network_data__Group__3 )
            // InternalBPMN_translator.g:5135:2: rule__Protocol_network_data__Group__2__Impl rule__Protocol_network_data__Group__3
            {
            pushFollow(FOLLOW_50);
            rule__Protocol_network_data__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol_network_data__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol_network_data__Group__2"


    // $ANTLR start "rule__Protocol_network_data__Group__2__Impl"
    // InternalBPMN_translator.g:5142:1: rule__Protocol_network_data__Group__2__Impl : ( ( rule__Protocol_network_data__SsidAssignment_2 ) ) ;
    public final void rule__Protocol_network_data__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5146:1: ( ( ( rule__Protocol_network_data__SsidAssignment_2 ) ) )
            // InternalBPMN_translator.g:5147:1: ( ( rule__Protocol_network_data__SsidAssignment_2 ) )
            {
            // InternalBPMN_translator.g:5147:1: ( ( rule__Protocol_network_data__SsidAssignment_2 ) )
            // InternalBPMN_translator.g:5148:2: ( rule__Protocol_network_data__SsidAssignment_2 )
            {
             before(grammarAccess.getProtocol_network_dataAccess().getSsidAssignment_2()); 
            // InternalBPMN_translator.g:5149:2: ( rule__Protocol_network_data__SsidAssignment_2 )
            // InternalBPMN_translator.g:5149:3: rule__Protocol_network_data__SsidAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Protocol_network_data__SsidAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProtocol_network_dataAccess().getSsidAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol_network_data__Group__2__Impl"


    // $ANTLR start "rule__Protocol_network_data__Group__3"
    // InternalBPMN_translator.g:5157:1: rule__Protocol_network_data__Group__3 : rule__Protocol_network_data__Group__3__Impl rule__Protocol_network_data__Group__4 ;
    public final void rule__Protocol_network_data__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5161:1: ( rule__Protocol_network_data__Group__3__Impl rule__Protocol_network_data__Group__4 )
            // InternalBPMN_translator.g:5162:2: rule__Protocol_network_data__Group__3__Impl rule__Protocol_network_data__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Protocol_network_data__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol_network_data__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol_network_data__Group__3"


    // $ANTLR start "rule__Protocol_network_data__Group__3__Impl"
    // InternalBPMN_translator.g:5169:1: rule__Protocol_network_data__Group__3__Impl : ( 'PASSWORD' ) ;
    public final void rule__Protocol_network_data__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5173:1: ( ( 'PASSWORD' ) )
            // InternalBPMN_translator.g:5174:1: ( 'PASSWORD' )
            {
            // InternalBPMN_translator.g:5174:1: ( 'PASSWORD' )
            // InternalBPMN_translator.g:5175:2: 'PASSWORD'
            {
             before(grammarAccess.getProtocol_network_dataAccess().getPASSWORDKeyword_3()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getProtocol_network_dataAccess().getPASSWORDKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol_network_data__Group__3__Impl"


    // $ANTLR start "rule__Protocol_network_data__Group__4"
    // InternalBPMN_translator.g:5184:1: rule__Protocol_network_data__Group__4 : rule__Protocol_network_data__Group__4__Impl rule__Protocol_network_data__Group__5 ;
    public final void rule__Protocol_network_data__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5188:1: ( rule__Protocol_network_data__Group__4__Impl rule__Protocol_network_data__Group__5 )
            // InternalBPMN_translator.g:5189:2: rule__Protocol_network_data__Group__4__Impl rule__Protocol_network_data__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Protocol_network_data__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol_network_data__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol_network_data__Group__4"


    // $ANTLR start "rule__Protocol_network_data__Group__4__Impl"
    // InternalBPMN_translator.g:5196:1: rule__Protocol_network_data__Group__4__Impl : ( '=' ) ;
    public final void rule__Protocol_network_data__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5200:1: ( ( '=' ) )
            // InternalBPMN_translator.g:5201:1: ( '=' )
            {
            // InternalBPMN_translator.g:5201:1: ( '=' )
            // InternalBPMN_translator.g:5202:2: '='
            {
             before(grammarAccess.getProtocol_network_dataAccess().getEqualsSignKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProtocol_network_dataAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol_network_data__Group__4__Impl"


    // $ANTLR start "rule__Protocol_network_data__Group__5"
    // InternalBPMN_translator.g:5211:1: rule__Protocol_network_data__Group__5 : rule__Protocol_network_data__Group__5__Impl ;
    public final void rule__Protocol_network_data__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5215:1: ( rule__Protocol_network_data__Group__5__Impl )
            // InternalBPMN_translator.g:5216:2: rule__Protocol_network_data__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Protocol_network_data__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol_network_data__Group__5"


    // $ANTLR start "rule__Protocol_network_data__Group__5__Impl"
    // InternalBPMN_translator.g:5222:1: rule__Protocol_network_data__Group__5__Impl : ( ( rule__Protocol_network_data__PasswordAssignment_5 ) ) ;
    public final void rule__Protocol_network_data__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5226:1: ( ( ( rule__Protocol_network_data__PasswordAssignment_5 ) ) )
            // InternalBPMN_translator.g:5227:1: ( ( rule__Protocol_network_data__PasswordAssignment_5 ) )
            {
            // InternalBPMN_translator.g:5227:1: ( ( rule__Protocol_network_data__PasswordAssignment_5 ) )
            // InternalBPMN_translator.g:5228:2: ( rule__Protocol_network_data__PasswordAssignment_5 )
            {
             before(grammarAccess.getProtocol_network_dataAccess().getPasswordAssignment_5()); 
            // InternalBPMN_translator.g:5229:2: ( rule__Protocol_network_data__PasswordAssignment_5 )
            // InternalBPMN_translator.g:5229:3: rule__Protocol_network_data__PasswordAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Protocol_network_data__PasswordAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProtocol_network_dataAccess().getPasswordAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol_network_data__Group__5__Impl"


    // $ANTLR start "rule__Protocol_device__Group__0"
    // InternalBPMN_translator.g:5238:1: rule__Protocol_device__Group__0 : rule__Protocol_device__Group__0__Impl rule__Protocol_device__Group__1 ;
    public final void rule__Protocol_device__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5242:1: ( rule__Protocol_device__Group__0__Impl rule__Protocol_device__Group__1 )
            // InternalBPMN_translator.g:5243:2: rule__Protocol_device__Group__0__Impl rule__Protocol_device__Group__1
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
    // InternalBPMN_translator.g:5250:1: rule__Protocol_device__Group__0__Impl : ( 'PROTOCOL_DEVICE' ) ;
    public final void rule__Protocol_device__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5254:1: ( ( 'PROTOCOL_DEVICE' ) )
            // InternalBPMN_translator.g:5255:1: ( 'PROTOCOL_DEVICE' )
            {
            // InternalBPMN_translator.g:5255:1: ( 'PROTOCOL_DEVICE' )
            // InternalBPMN_translator.g:5256:2: 'PROTOCOL_DEVICE'
            {
             before(grammarAccess.getProtocol_deviceAccess().getPROTOCOL_DEVICEKeyword_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalBPMN_translator.g:5265:1: rule__Protocol_device__Group__1 : rule__Protocol_device__Group__1__Impl rule__Protocol_device__Group__2 ;
    public final void rule__Protocol_device__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5269:1: ( rule__Protocol_device__Group__1__Impl rule__Protocol_device__Group__2 )
            // InternalBPMN_translator.g:5270:2: rule__Protocol_device__Group__1__Impl rule__Protocol_device__Group__2
            {
            pushFollow(FOLLOW_51);
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
    // InternalBPMN_translator.g:5277:1: rule__Protocol_device__Group__1__Impl : ( '{' ) ;
    public final void rule__Protocol_device__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5281:1: ( ( '{' ) )
            // InternalBPMN_translator.g:5282:1: ( '{' )
            {
            // InternalBPMN_translator.g:5282:1: ( '{' )
            // InternalBPMN_translator.g:5283:2: '{'
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
    // InternalBPMN_translator.g:5292:1: rule__Protocol_device__Group__2 : rule__Protocol_device__Group__2__Impl rule__Protocol_device__Group__3 ;
    public final void rule__Protocol_device__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5296:1: ( rule__Protocol_device__Group__2__Impl rule__Protocol_device__Group__3 )
            // InternalBPMN_translator.g:5297:2: rule__Protocol_device__Group__2__Impl rule__Protocol_device__Group__3
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
    // InternalBPMN_translator.g:5304:1: rule__Protocol_device__Group__2__Impl : ( 'NAME' ) ;
    public final void rule__Protocol_device__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5308:1: ( ( 'NAME' ) )
            // InternalBPMN_translator.g:5309:1: ( 'NAME' )
            {
            // InternalBPMN_translator.g:5309:1: ( 'NAME' )
            // InternalBPMN_translator.g:5310:2: 'NAME'
            {
             before(grammarAccess.getProtocol_deviceAccess().getNAMEKeyword_2()); 
            match(input,45,FOLLOW_2); 
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
    // InternalBPMN_translator.g:5319:1: rule__Protocol_device__Group__3 : rule__Protocol_device__Group__3__Impl rule__Protocol_device__Group__4 ;
    public final void rule__Protocol_device__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5323:1: ( rule__Protocol_device__Group__3__Impl rule__Protocol_device__Group__4 )
            // InternalBPMN_translator.g:5324:2: rule__Protocol_device__Group__3__Impl rule__Protocol_device__Group__4
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
    // InternalBPMN_translator.g:5331:1: rule__Protocol_device__Group__3__Impl : ( '=' ) ;
    public final void rule__Protocol_device__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5335:1: ( ( '=' ) )
            // InternalBPMN_translator.g:5336:1: ( '=' )
            {
            // InternalBPMN_translator.g:5336:1: ( '=' )
            // InternalBPMN_translator.g:5337:2: '='
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
    // InternalBPMN_translator.g:5346:1: rule__Protocol_device__Group__4 : rule__Protocol_device__Group__4__Impl rule__Protocol_device__Group__5 ;
    public final void rule__Protocol_device__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5350:1: ( rule__Protocol_device__Group__4__Impl rule__Protocol_device__Group__5 )
            // InternalBPMN_translator.g:5351:2: rule__Protocol_device__Group__4__Impl rule__Protocol_device__Group__5
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
    // InternalBPMN_translator.g:5358:1: rule__Protocol_device__Group__4__Impl : ( ( rule__Protocol_device__DnameAssignment_4 ) ) ;
    public final void rule__Protocol_device__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5362:1: ( ( ( rule__Protocol_device__DnameAssignment_4 ) ) )
            // InternalBPMN_translator.g:5363:1: ( ( rule__Protocol_device__DnameAssignment_4 ) )
            {
            // InternalBPMN_translator.g:5363:1: ( ( rule__Protocol_device__DnameAssignment_4 ) )
            // InternalBPMN_translator.g:5364:2: ( rule__Protocol_device__DnameAssignment_4 )
            {
             before(grammarAccess.getProtocol_deviceAccess().getDnameAssignment_4()); 
            // InternalBPMN_translator.g:5365:2: ( rule__Protocol_device__DnameAssignment_4 )
            // InternalBPMN_translator.g:5365:3: rule__Protocol_device__DnameAssignment_4
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
    // InternalBPMN_translator.g:5373:1: rule__Protocol_device__Group__5 : rule__Protocol_device__Group__5__Impl ;
    public final void rule__Protocol_device__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5377:1: ( rule__Protocol_device__Group__5__Impl )
            // InternalBPMN_translator.g:5378:2: rule__Protocol_device__Group__5__Impl
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
    // InternalBPMN_translator.g:5384:1: rule__Protocol_device__Group__5__Impl : ( '}' ) ;
    public final void rule__Protocol_device__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5388:1: ( ( '}' ) )
            // InternalBPMN_translator.g:5389:1: ( '}' )
            {
            // InternalBPMN_translator.g:5389:1: ( '}' )
            // InternalBPMN_translator.g:5390:2: '}'
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
    // InternalBPMN_translator.g:5400:1: rule__Sensor__Group_0__0 : rule__Sensor__Group_0__0__Impl rule__Sensor__Group_0__1 ;
    public final void rule__Sensor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5404:1: ( rule__Sensor__Group_0__0__Impl rule__Sensor__Group_0__1 )
            // InternalBPMN_translator.g:5405:2: rule__Sensor__Group_0__0__Impl rule__Sensor__Group_0__1
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
    // InternalBPMN_translator.g:5412:1: rule__Sensor__Group_0__0__Impl : ( ( rule__Sensor__SnameAssignment_0_0 ) ) ;
    public final void rule__Sensor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5416:1: ( ( ( rule__Sensor__SnameAssignment_0_0 ) ) )
            // InternalBPMN_translator.g:5417:1: ( ( rule__Sensor__SnameAssignment_0_0 ) )
            {
            // InternalBPMN_translator.g:5417:1: ( ( rule__Sensor__SnameAssignment_0_0 ) )
            // InternalBPMN_translator.g:5418:2: ( rule__Sensor__SnameAssignment_0_0 )
            {
             before(grammarAccess.getSensorAccess().getSnameAssignment_0_0()); 
            // InternalBPMN_translator.g:5419:2: ( rule__Sensor__SnameAssignment_0_0 )
            // InternalBPMN_translator.g:5419:3: rule__Sensor__SnameAssignment_0_0
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
    // InternalBPMN_translator.g:5427:1: rule__Sensor__Group_0__1 : rule__Sensor__Group_0__1__Impl rule__Sensor__Group_0__2 ;
    public final void rule__Sensor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5431:1: ( rule__Sensor__Group_0__1__Impl rule__Sensor__Group_0__2 )
            // InternalBPMN_translator.g:5432:2: rule__Sensor__Group_0__1__Impl rule__Sensor__Group_0__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalBPMN_translator.g:5439:1: rule__Sensor__Group_0__1__Impl : ( '{' ) ;
    public final void rule__Sensor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5443:1: ( ( '{' ) )
            // InternalBPMN_translator.g:5444:1: ( '{' )
            {
            // InternalBPMN_translator.g:5444:1: ( '{' )
            // InternalBPMN_translator.g:5445:2: '{'
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
    // InternalBPMN_translator.g:5454:1: rule__Sensor__Group_0__2 : rule__Sensor__Group_0__2__Impl rule__Sensor__Group_0__3 ;
    public final void rule__Sensor__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5458:1: ( rule__Sensor__Group_0__2__Impl rule__Sensor__Group_0__3 )
            // InternalBPMN_translator.g:5459:2: rule__Sensor__Group_0__2__Impl rule__Sensor__Group_0__3
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
    // InternalBPMN_translator.g:5466:1: rule__Sensor__Group_0__2__Impl : ( ( rule__Sensor__SensorAssignment_0_2 ) ) ;
    public final void rule__Sensor__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5470:1: ( ( ( rule__Sensor__SensorAssignment_0_2 ) ) )
            // InternalBPMN_translator.g:5471:1: ( ( rule__Sensor__SensorAssignment_0_2 ) )
            {
            // InternalBPMN_translator.g:5471:1: ( ( rule__Sensor__SensorAssignment_0_2 ) )
            // InternalBPMN_translator.g:5472:2: ( rule__Sensor__SensorAssignment_0_2 )
            {
             before(grammarAccess.getSensorAccess().getSensorAssignment_0_2()); 
            // InternalBPMN_translator.g:5473:2: ( rule__Sensor__SensorAssignment_0_2 )
            // InternalBPMN_translator.g:5473:3: rule__Sensor__SensorAssignment_0_2
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
    // InternalBPMN_translator.g:5481:1: rule__Sensor__Group_0__3 : rule__Sensor__Group_0__3__Impl ;
    public final void rule__Sensor__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5485:1: ( rule__Sensor__Group_0__3__Impl )
            // InternalBPMN_translator.g:5486:2: rule__Sensor__Group_0__3__Impl
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
    // InternalBPMN_translator.g:5492:1: rule__Sensor__Group_0__3__Impl : ( '}' ) ;
    public final void rule__Sensor__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5496:1: ( ( '}' ) )
            // InternalBPMN_translator.g:5497:1: ( '}' )
            {
            // InternalBPMN_translator.g:5497:1: ( '}' )
            // InternalBPMN_translator.g:5498:2: '}'
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
    // InternalBPMN_translator.g:5508:1: rule__Sensor__Group_1__0 : rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1 ;
    public final void rule__Sensor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5512:1: ( rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1 )
            // InternalBPMN_translator.g:5513:2: rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1
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
    // InternalBPMN_translator.g:5520:1: rule__Sensor__Group_1__0__Impl : ( ( rule__Sensor__SnameAssignment_1_0 ) ) ;
    public final void rule__Sensor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5524:1: ( ( ( rule__Sensor__SnameAssignment_1_0 ) ) )
            // InternalBPMN_translator.g:5525:1: ( ( rule__Sensor__SnameAssignment_1_0 ) )
            {
            // InternalBPMN_translator.g:5525:1: ( ( rule__Sensor__SnameAssignment_1_0 ) )
            // InternalBPMN_translator.g:5526:2: ( rule__Sensor__SnameAssignment_1_0 )
            {
             before(grammarAccess.getSensorAccess().getSnameAssignment_1_0()); 
            // InternalBPMN_translator.g:5527:2: ( rule__Sensor__SnameAssignment_1_0 )
            // InternalBPMN_translator.g:5527:3: rule__Sensor__SnameAssignment_1_0
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
    // InternalBPMN_translator.g:5535:1: rule__Sensor__Group_1__1 : rule__Sensor__Group_1__1__Impl rule__Sensor__Group_1__2 ;
    public final void rule__Sensor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5539:1: ( rule__Sensor__Group_1__1__Impl rule__Sensor__Group_1__2 )
            // InternalBPMN_translator.g:5540:2: rule__Sensor__Group_1__1__Impl rule__Sensor__Group_1__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalBPMN_translator.g:5547:1: rule__Sensor__Group_1__1__Impl : ( '{' ) ;
    public final void rule__Sensor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5551:1: ( ( '{' ) )
            // InternalBPMN_translator.g:5552:1: ( '{' )
            {
            // InternalBPMN_translator.g:5552:1: ( '{' )
            // InternalBPMN_translator.g:5553:2: '{'
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
    // InternalBPMN_translator.g:5562:1: rule__Sensor__Group_1__2 : rule__Sensor__Group_1__2__Impl rule__Sensor__Group_1__3 ;
    public final void rule__Sensor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5566:1: ( rule__Sensor__Group_1__2__Impl rule__Sensor__Group_1__3 )
            // InternalBPMN_translator.g:5567:2: rule__Sensor__Group_1__2__Impl rule__Sensor__Group_1__3
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
    // InternalBPMN_translator.g:5574:1: rule__Sensor__Group_1__2__Impl : ( ( rule__Sensor__SensorAssignment_1_2 ) ) ;
    public final void rule__Sensor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5578:1: ( ( ( rule__Sensor__SensorAssignment_1_2 ) ) )
            // InternalBPMN_translator.g:5579:1: ( ( rule__Sensor__SensorAssignment_1_2 ) )
            {
            // InternalBPMN_translator.g:5579:1: ( ( rule__Sensor__SensorAssignment_1_2 ) )
            // InternalBPMN_translator.g:5580:2: ( rule__Sensor__SensorAssignment_1_2 )
            {
             before(grammarAccess.getSensorAccess().getSensorAssignment_1_2()); 
            // InternalBPMN_translator.g:5581:2: ( rule__Sensor__SensorAssignment_1_2 )
            // InternalBPMN_translator.g:5581:3: rule__Sensor__SensorAssignment_1_2
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
    // InternalBPMN_translator.g:5589:1: rule__Sensor__Group_1__3 : rule__Sensor__Group_1__3__Impl ;
    public final void rule__Sensor__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5593:1: ( rule__Sensor__Group_1__3__Impl )
            // InternalBPMN_translator.g:5594:2: rule__Sensor__Group_1__3__Impl
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
    // InternalBPMN_translator.g:5600:1: rule__Sensor__Group_1__3__Impl : ( '}' ) ;
    public final void rule__Sensor__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5604:1: ( ( '}' ) )
            // InternalBPMN_translator.g:5605:1: ( '}' )
            {
            // InternalBPMN_translator.g:5605:1: ( '}' )
            // InternalBPMN_translator.g:5606:2: '}'
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


    // $ANTLR start "rule__Sensor__Group_2__0"
    // InternalBPMN_translator.g:5616:1: rule__Sensor__Group_2__0 : rule__Sensor__Group_2__0__Impl rule__Sensor__Group_2__1 ;
    public final void rule__Sensor__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5620:1: ( rule__Sensor__Group_2__0__Impl rule__Sensor__Group_2__1 )
            // InternalBPMN_translator.g:5621:2: rule__Sensor__Group_2__0__Impl rule__Sensor__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Sensor__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_2__0"


    // $ANTLR start "rule__Sensor__Group_2__0__Impl"
    // InternalBPMN_translator.g:5628:1: rule__Sensor__Group_2__0__Impl : ( ( rule__Sensor__SnameAssignment_2_0 ) ) ;
    public final void rule__Sensor__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5632:1: ( ( ( rule__Sensor__SnameAssignment_2_0 ) ) )
            // InternalBPMN_translator.g:5633:1: ( ( rule__Sensor__SnameAssignment_2_0 ) )
            {
            // InternalBPMN_translator.g:5633:1: ( ( rule__Sensor__SnameAssignment_2_0 ) )
            // InternalBPMN_translator.g:5634:2: ( rule__Sensor__SnameAssignment_2_0 )
            {
             before(grammarAccess.getSensorAccess().getSnameAssignment_2_0()); 
            // InternalBPMN_translator.g:5635:2: ( rule__Sensor__SnameAssignment_2_0 )
            // InternalBPMN_translator.g:5635:3: rule__Sensor__SnameAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__SnameAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getSnameAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_2__0__Impl"


    // $ANTLR start "rule__Sensor__Group_2__1"
    // InternalBPMN_translator.g:5643:1: rule__Sensor__Group_2__1 : rule__Sensor__Group_2__1__Impl rule__Sensor__Group_2__2 ;
    public final void rule__Sensor__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5647:1: ( rule__Sensor__Group_2__1__Impl rule__Sensor__Group_2__2 )
            // InternalBPMN_translator.g:5648:2: rule__Sensor__Group_2__1__Impl rule__Sensor__Group_2__2
            {
            pushFollow(FOLLOW_52);
            rule__Sensor__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_2__1"


    // $ANTLR start "rule__Sensor__Group_2__1__Impl"
    // InternalBPMN_translator.g:5655:1: rule__Sensor__Group_2__1__Impl : ( '{' ) ;
    public final void rule__Sensor__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5659:1: ( ( '{' ) )
            // InternalBPMN_translator.g:5660:1: ( '{' )
            {
            // InternalBPMN_translator.g:5660:1: ( '{' )
            // InternalBPMN_translator.g:5661:2: '{'
            {
             before(grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_2__1__Impl"


    // $ANTLR start "rule__Sensor__Group_2__2"
    // InternalBPMN_translator.g:5670:1: rule__Sensor__Group_2__2 : rule__Sensor__Group_2__2__Impl rule__Sensor__Group_2__3 ;
    public final void rule__Sensor__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5674:1: ( rule__Sensor__Group_2__2__Impl rule__Sensor__Group_2__3 )
            // InternalBPMN_translator.g:5675:2: rule__Sensor__Group_2__2__Impl rule__Sensor__Group_2__3
            {
            pushFollow(FOLLOW_15);
            rule__Sensor__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_2__2"


    // $ANTLR start "rule__Sensor__Group_2__2__Impl"
    // InternalBPMN_translator.g:5682:1: rule__Sensor__Group_2__2__Impl : ( ( rule__Sensor__SensorAssignment_2_2 ) ) ;
    public final void rule__Sensor__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5686:1: ( ( ( rule__Sensor__SensorAssignment_2_2 ) ) )
            // InternalBPMN_translator.g:5687:1: ( ( rule__Sensor__SensorAssignment_2_2 ) )
            {
            // InternalBPMN_translator.g:5687:1: ( ( rule__Sensor__SensorAssignment_2_2 ) )
            // InternalBPMN_translator.g:5688:2: ( rule__Sensor__SensorAssignment_2_2 )
            {
             before(grammarAccess.getSensorAccess().getSensorAssignment_2_2()); 
            // InternalBPMN_translator.g:5689:2: ( rule__Sensor__SensorAssignment_2_2 )
            // InternalBPMN_translator.g:5689:3: rule__Sensor__SensorAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__SensorAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getSensorAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_2__2__Impl"


    // $ANTLR start "rule__Sensor__Group_2__3"
    // InternalBPMN_translator.g:5697:1: rule__Sensor__Group_2__3 : rule__Sensor__Group_2__3__Impl ;
    public final void rule__Sensor__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5701:1: ( rule__Sensor__Group_2__3__Impl )
            // InternalBPMN_translator.g:5702:2: rule__Sensor__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_2__3"


    // $ANTLR start "rule__Sensor__Group_2__3__Impl"
    // InternalBPMN_translator.g:5708:1: rule__Sensor__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Sensor__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5712:1: ( ( '}' ) )
            // InternalBPMN_translator.g:5713:1: ( '}' )
            {
            // InternalBPMN_translator.g:5713:1: ( '}' )
            // InternalBPMN_translator.g:5714:2: '}'
            {
             before(grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_2__3__Impl"


    // $ANTLR start "rule__Sensor__Group_3__0"
    // InternalBPMN_translator.g:5724:1: rule__Sensor__Group_3__0 : rule__Sensor__Group_3__0__Impl rule__Sensor__Group_3__1 ;
    public final void rule__Sensor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5728:1: ( rule__Sensor__Group_3__0__Impl rule__Sensor__Group_3__1 )
            // InternalBPMN_translator.g:5729:2: rule__Sensor__Group_3__0__Impl rule__Sensor__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Sensor__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_3__0"


    // $ANTLR start "rule__Sensor__Group_3__0__Impl"
    // InternalBPMN_translator.g:5736:1: rule__Sensor__Group_3__0__Impl : ( ( rule__Sensor__SnameAssignment_3_0 ) ) ;
    public final void rule__Sensor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5740:1: ( ( ( rule__Sensor__SnameAssignment_3_0 ) ) )
            // InternalBPMN_translator.g:5741:1: ( ( rule__Sensor__SnameAssignment_3_0 ) )
            {
            // InternalBPMN_translator.g:5741:1: ( ( rule__Sensor__SnameAssignment_3_0 ) )
            // InternalBPMN_translator.g:5742:2: ( rule__Sensor__SnameAssignment_3_0 )
            {
             before(grammarAccess.getSensorAccess().getSnameAssignment_3_0()); 
            // InternalBPMN_translator.g:5743:2: ( rule__Sensor__SnameAssignment_3_0 )
            // InternalBPMN_translator.g:5743:3: rule__Sensor__SnameAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__SnameAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getSnameAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_3__0__Impl"


    // $ANTLR start "rule__Sensor__Group_3__1"
    // InternalBPMN_translator.g:5751:1: rule__Sensor__Group_3__1 : rule__Sensor__Group_3__1__Impl rule__Sensor__Group_3__2 ;
    public final void rule__Sensor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5755:1: ( rule__Sensor__Group_3__1__Impl rule__Sensor__Group_3__2 )
            // InternalBPMN_translator.g:5756:2: rule__Sensor__Group_3__1__Impl rule__Sensor__Group_3__2
            {
            pushFollow(FOLLOW_52);
            rule__Sensor__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_3__1"


    // $ANTLR start "rule__Sensor__Group_3__1__Impl"
    // InternalBPMN_translator.g:5763:1: rule__Sensor__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Sensor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5767:1: ( ( '{' ) )
            // InternalBPMN_translator.g:5768:1: ( '{' )
            {
            // InternalBPMN_translator.g:5768:1: ( '{' )
            // InternalBPMN_translator.g:5769:2: '{'
            {
             before(grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_3__1__Impl"


    // $ANTLR start "rule__Sensor__Group_3__2"
    // InternalBPMN_translator.g:5778:1: rule__Sensor__Group_3__2 : rule__Sensor__Group_3__2__Impl rule__Sensor__Group_3__3 ;
    public final void rule__Sensor__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5782:1: ( rule__Sensor__Group_3__2__Impl rule__Sensor__Group_3__3 )
            // InternalBPMN_translator.g:5783:2: rule__Sensor__Group_3__2__Impl rule__Sensor__Group_3__3
            {
            pushFollow(FOLLOW_15);
            rule__Sensor__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_3__2"


    // $ANTLR start "rule__Sensor__Group_3__2__Impl"
    // InternalBPMN_translator.g:5790:1: rule__Sensor__Group_3__2__Impl : ( ( rule__Sensor__SensorAssignment_3_2 ) ) ;
    public final void rule__Sensor__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5794:1: ( ( ( rule__Sensor__SensorAssignment_3_2 ) ) )
            // InternalBPMN_translator.g:5795:1: ( ( rule__Sensor__SensorAssignment_3_2 ) )
            {
            // InternalBPMN_translator.g:5795:1: ( ( rule__Sensor__SensorAssignment_3_2 ) )
            // InternalBPMN_translator.g:5796:2: ( rule__Sensor__SensorAssignment_3_2 )
            {
             before(grammarAccess.getSensorAccess().getSensorAssignment_3_2()); 
            // InternalBPMN_translator.g:5797:2: ( rule__Sensor__SensorAssignment_3_2 )
            // InternalBPMN_translator.g:5797:3: rule__Sensor__SensorAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__SensorAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getSensorAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_3__2__Impl"


    // $ANTLR start "rule__Sensor__Group_3__3"
    // InternalBPMN_translator.g:5805:1: rule__Sensor__Group_3__3 : rule__Sensor__Group_3__3__Impl ;
    public final void rule__Sensor__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5809:1: ( rule__Sensor__Group_3__3__Impl )
            // InternalBPMN_translator.g:5810:2: rule__Sensor__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_3__3"


    // $ANTLR start "rule__Sensor__Group_3__3__Impl"
    // InternalBPMN_translator.g:5816:1: rule__Sensor__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Sensor__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5820:1: ( ( '}' ) )
            // InternalBPMN_translator.g:5821:1: ( '}' )
            {
            // InternalBPMN_translator.g:5821:1: ( '}' )
            // InternalBPMN_translator.g:5822:2: '}'
            {
             before(grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_3__3__Impl"


    // $ANTLR start "rule__Sensor_data__Group__0"
    // InternalBPMN_translator.g:5832:1: rule__Sensor_data__Group__0 : rule__Sensor_data__Group__0__Impl rule__Sensor_data__Group__1 ;
    public final void rule__Sensor_data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5836:1: ( rule__Sensor_data__Group__0__Impl rule__Sensor_data__Group__1 )
            // InternalBPMN_translator.g:5837:2: rule__Sensor_data__Group__0__Impl rule__Sensor_data__Group__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalBPMN_translator.g:5844:1: rule__Sensor_data__Group__0__Impl : ( () ) ;
    public final void rule__Sensor_data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5848:1: ( ( () ) )
            // InternalBPMN_translator.g:5849:1: ( () )
            {
            // InternalBPMN_translator.g:5849:1: ( () )
            // InternalBPMN_translator.g:5850:2: ()
            {
             before(grammarAccess.getSensor_dataAccess().getSensor_dataAction_0()); 
            // InternalBPMN_translator.g:5851:2: ()
            // InternalBPMN_translator.g:5851:3: 
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
    // InternalBPMN_translator.g:5859:1: rule__Sensor_data__Group__1 : rule__Sensor_data__Group__1__Impl ;
    public final void rule__Sensor_data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5863:1: ( rule__Sensor_data__Group__1__Impl )
            // InternalBPMN_translator.g:5864:2: rule__Sensor_data__Group__1__Impl
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
    // InternalBPMN_translator.g:5870:1: rule__Sensor_data__Group__1__Impl : ( ( rule__Sensor_data__Alternatives_1 )* ) ;
    public final void rule__Sensor_data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5874:1: ( ( ( rule__Sensor_data__Alternatives_1 )* ) )
            // InternalBPMN_translator.g:5875:1: ( ( rule__Sensor_data__Alternatives_1 )* )
            {
            // InternalBPMN_translator.g:5875:1: ( ( rule__Sensor_data__Alternatives_1 )* )
            // InternalBPMN_translator.g:5876:2: ( rule__Sensor_data__Alternatives_1 )*
            {
             before(grammarAccess.getSensor_dataAccess().getAlternatives_1()); 
            // InternalBPMN_translator.g:5877:2: ( rule__Sensor_data__Alternatives_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==45||(LA34_0>=61 && LA34_0<=62)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalBPMN_translator.g:5877:3: rule__Sensor_data__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__Sensor_data__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalBPMN_translator.g:5886:1: rule__Sensor_data__Group_1_0__0 : rule__Sensor_data__Group_1_0__0__Impl rule__Sensor_data__Group_1_0__1 ;
    public final void rule__Sensor_data__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5890:1: ( rule__Sensor_data__Group_1_0__0__Impl rule__Sensor_data__Group_1_0__1 )
            // InternalBPMN_translator.g:5891:2: rule__Sensor_data__Group_1_0__0__Impl rule__Sensor_data__Group_1_0__1
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
    // InternalBPMN_translator.g:5898:1: rule__Sensor_data__Group_1_0__0__Impl : ( 'NAME' ) ;
    public final void rule__Sensor_data__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5902:1: ( ( 'NAME' ) )
            // InternalBPMN_translator.g:5903:1: ( 'NAME' )
            {
            // InternalBPMN_translator.g:5903:1: ( 'NAME' )
            // InternalBPMN_translator.g:5904:2: 'NAME'
            {
             before(grammarAccess.getSensor_dataAccess().getNAMEKeyword_1_0_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalBPMN_translator.g:5913:1: rule__Sensor_data__Group_1_0__1 : rule__Sensor_data__Group_1_0__1__Impl rule__Sensor_data__Group_1_0__2 ;
    public final void rule__Sensor_data__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5917:1: ( rule__Sensor_data__Group_1_0__1__Impl rule__Sensor_data__Group_1_0__2 )
            // InternalBPMN_translator.g:5918:2: rule__Sensor_data__Group_1_0__1__Impl rule__Sensor_data__Group_1_0__2
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
    // InternalBPMN_translator.g:5925:1: rule__Sensor_data__Group_1_0__1__Impl : ( '=' ) ;
    public final void rule__Sensor_data__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5929:1: ( ( '=' ) )
            // InternalBPMN_translator.g:5930:1: ( '=' )
            {
            // InternalBPMN_translator.g:5930:1: ( '=' )
            // InternalBPMN_translator.g:5931:2: '='
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
    // InternalBPMN_translator.g:5940:1: rule__Sensor_data__Group_1_0__2 : rule__Sensor_data__Group_1_0__2__Impl ;
    public final void rule__Sensor_data__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5944:1: ( rule__Sensor_data__Group_1_0__2__Impl )
            // InternalBPMN_translator.g:5945:2: rule__Sensor_data__Group_1_0__2__Impl
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
    // InternalBPMN_translator.g:5951:1: rule__Sensor_data__Group_1_0__2__Impl : ( ( rule__Sensor_data__PnameAssignment_1_0_2 ) ) ;
    public final void rule__Sensor_data__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5955:1: ( ( ( rule__Sensor_data__PnameAssignment_1_0_2 ) ) )
            // InternalBPMN_translator.g:5956:1: ( ( rule__Sensor_data__PnameAssignment_1_0_2 ) )
            {
            // InternalBPMN_translator.g:5956:1: ( ( rule__Sensor_data__PnameAssignment_1_0_2 ) )
            // InternalBPMN_translator.g:5957:2: ( rule__Sensor_data__PnameAssignment_1_0_2 )
            {
             before(grammarAccess.getSensor_dataAccess().getPnameAssignment_1_0_2()); 
            // InternalBPMN_translator.g:5958:2: ( rule__Sensor_data__PnameAssignment_1_0_2 )
            // InternalBPMN_translator.g:5958:3: rule__Sensor_data__PnameAssignment_1_0_2
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
    // InternalBPMN_translator.g:5967:1: rule__Sensor_data__Group_1_1__0 : rule__Sensor_data__Group_1_1__0__Impl rule__Sensor_data__Group_1_1__1 ;
    public final void rule__Sensor_data__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5971:1: ( rule__Sensor_data__Group_1_1__0__Impl rule__Sensor_data__Group_1_1__1 )
            // InternalBPMN_translator.g:5972:2: rule__Sensor_data__Group_1_1__0__Impl rule__Sensor_data__Group_1_1__1
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
    // InternalBPMN_translator.g:5979:1: rule__Sensor_data__Group_1_1__0__Impl : ( 'PINS' ) ;
    public final void rule__Sensor_data__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5983:1: ( ( 'PINS' ) )
            // InternalBPMN_translator.g:5984:1: ( 'PINS' )
            {
            // InternalBPMN_translator.g:5984:1: ( 'PINS' )
            // InternalBPMN_translator.g:5985:2: 'PINS'
            {
             before(grammarAccess.getSensor_dataAccess().getPINSKeyword_1_1_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalBPMN_translator.g:5994:1: rule__Sensor_data__Group_1_1__1 : rule__Sensor_data__Group_1_1__1__Impl rule__Sensor_data__Group_1_1__2 ;
    public final void rule__Sensor_data__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5998:1: ( rule__Sensor_data__Group_1_1__1__Impl rule__Sensor_data__Group_1_1__2 )
            // InternalBPMN_translator.g:5999:2: rule__Sensor_data__Group_1_1__1__Impl rule__Sensor_data__Group_1_1__2
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
    // InternalBPMN_translator.g:6006:1: rule__Sensor_data__Group_1_1__1__Impl : ( '=' ) ;
    public final void rule__Sensor_data__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6010:1: ( ( '=' ) )
            // InternalBPMN_translator.g:6011:1: ( '=' )
            {
            // InternalBPMN_translator.g:6011:1: ( '=' )
            // InternalBPMN_translator.g:6012:2: '='
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
    // InternalBPMN_translator.g:6021:1: rule__Sensor_data__Group_1_1__2 : rule__Sensor_data__Group_1_1__2__Impl ;
    public final void rule__Sensor_data__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6025:1: ( rule__Sensor_data__Group_1_1__2__Impl )
            // InternalBPMN_translator.g:6026:2: rule__Sensor_data__Group_1_1__2__Impl
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
    // InternalBPMN_translator.g:6032:1: rule__Sensor_data__Group_1_1__2__Impl : ( ( rule__Sensor_data__PinsAssignment_1_1_2 ) ) ;
    public final void rule__Sensor_data__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6036:1: ( ( ( rule__Sensor_data__PinsAssignment_1_1_2 ) ) )
            // InternalBPMN_translator.g:6037:1: ( ( rule__Sensor_data__PinsAssignment_1_1_2 ) )
            {
            // InternalBPMN_translator.g:6037:1: ( ( rule__Sensor_data__PinsAssignment_1_1_2 ) )
            // InternalBPMN_translator.g:6038:2: ( rule__Sensor_data__PinsAssignment_1_1_2 )
            {
             before(grammarAccess.getSensor_dataAccess().getPinsAssignment_1_1_2()); 
            // InternalBPMN_translator.g:6039:2: ( rule__Sensor_data__PinsAssignment_1_1_2 )
            // InternalBPMN_translator.g:6039:3: rule__Sensor_data__PinsAssignment_1_1_2
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
    // InternalBPMN_translator.g:6048:1: rule__Sensor_data__Group_1_2__0 : rule__Sensor_data__Group_1_2__0__Impl rule__Sensor_data__Group_1_2__1 ;
    public final void rule__Sensor_data__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6052:1: ( rule__Sensor_data__Group_1_2__0__Impl rule__Sensor_data__Group_1_2__1 )
            // InternalBPMN_translator.g:6053:2: rule__Sensor_data__Group_1_2__0__Impl rule__Sensor_data__Group_1_2__1
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
    // InternalBPMN_translator.g:6060:1: rule__Sensor_data__Group_1_2__0__Impl : ( 'SENSOR_ID' ) ;
    public final void rule__Sensor_data__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6064:1: ( ( 'SENSOR_ID' ) )
            // InternalBPMN_translator.g:6065:1: ( 'SENSOR_ID' )
            {
            // InternalBPMN_translator.g:6065:1: ( 'SENSOR_ID' )
            // InternalBPMN_translator.g:6066:2: 'SENSOR_ID'
            {
             before(grammarAccess.getSensor_dataAccess().getSENSOR_IDKeyword_1_2_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalBPMN_translator.g:6075:1: rule__Sensor_data__Group_1_2__1 : rule__Sensor_data__Group_1_2__1__Impl rule__Sensor_data__Group_1_2__2 ;
    public final void rule__Sensor_data__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6079:1: ( rule__Sensor_data__Group_1_2__1__Impl rule__Sensor_data__Group_1_2__2 )
            // InternalBPMN_translator.g:6080:2: rule__Sensor_data__Group_1_2__1__Impl rule__Sensor_data__Group_1_2__2
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
    // InternalBPMN_translator.g:6087:1: rule__Sensor_data__Group_1_2__1__Impl : ( '=' ) ;
    public final void rule__Sensor_data__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6091:1: ( ( '=' ) )
            // InternalBPMN_translator.g:6092:1: ( '=' )
            {
            // InternalBPMN_translator.g:6092:1: ( '=' )
            // InternalBPMN_translator.g:6093:2: '='
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
    // InternalBPMN_translator.g:6102:1: rule__Sensor_data__Group_1_2__2 : rule__Sensor_data__Group_1_2__2__Impl ;
    public final void rule__Sensor_data__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6106:1: ( rule__Sensor_data__Group_1_2__2__Impl )
            // InternalBPMN_translator.g:6107:2: rule__Sensor_data__Group_1_2__2__Impl
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
    // InternalBPMN_translator.g:6113:1: rule__Sensor_data__Group_1_2__2__Impl : ( ( rule__Sensor_data__Sensor_idAssignment_1_2_2 ) ) ;
    public final void rule__Sensor_data__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6117:1: ( ( ( rule__Sensor_data__Sensor_idAssignment_1_2_2 ) ) )
            // InternalBPMN_translator.g:6118:1: ( ( rule__Sensor_data__Sensor_idAssignment_1_2_2 ) )
            {
            // InternalBPMN_translator.g:6118:1: ( ( rule__Sensor_data__Sensor_idAssignment_1_2_2 ) )
            // InternalBPMN_translator.g:6119:2: ( rule__Sensor_data__Sensor_idAssignment_1_2_2 )
            {
             before(grammarAccess.getSensor_dataAccess().getSensor_idAssignment_1_2_2()); 
            // InternalBPMN_translator.g:6120:2: ( rule__Sensor_data__Sensor_idAssignment_1_2_2 )
            // InternalBPMN_translator.g:6120:3: rule__Sensor_data__Sensor_idAssignment_1_2_2
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
    // InternalBPMN_translator.g:6129:1: rule__Model__ModelAssignment : ( ruleXml ) ;
    public final void rule__Model__ModelAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6133:1: ( ( ruleXml ) )
            // InternalBPMN_translator.g:6134:2: ( ruleXml )
            {
            // InternalBPMN_translator.g:6134:2: ( ruleXml )
            // InternalBPMN_translator.g:6135:3: ruleXml
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


    // $ANTLR start "rule__Xml__ElementsAssignment_2"
    // InternalBPMN_translator.g:6144:1: rule__Xml__ElementsAssignment_2 : ( ruleelement ) ;
    public final void rule__Xml__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6148:1: ( ( ruleelement ) )
            // InternalBPMN_translator.g:6149:2: ( ruleelement )
            {
            // InternalBPMN_translator.g:6149:2: ( ruleelement )
            // InternalBPMN_translator.g:6150:3: ruleelement
            {
             before(grammarAccess.getXmlAccess().getElementsElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleelement();

            state._fsp--;

             after(grammarAccess.getXmlAccess().getElementsElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xml__ElementsAssignment_2"


    // $ANTLR start "rule__Element__OpenAssignment_0_0"
    // InternalBPMN_translator.g:6159:1: rule__Element__OpenAssignment_0_0 : ( ruleOpen ) ;
    public final void rule__Element__OpenAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6163:1: ( ( ruleOpen ) )
            // InternalBPMN_translator.g:6164:2: ( ruleOpen )
            {
            // InternalBPMN_translator.g:6164:2: ( ruleOpen )
            // InternalBPMN_translator.g:6165:3: ruleOpen
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
    // InternalBPMN_translator.g:6174:1: rule__Element__ContentsAssignment_0_1 : ( rulecontent ) ;
    public final void rule__Element__ContentsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6178:1: ( ( rulecontent ) )
            // InternalBPMN_translator.g:6179:2: ( rulecontent )
            {
            // InternalBPMN_translator.g:6179:2: ( rulecontent )
            // InternalBPMN_translator.g:6180:3: rulecontent
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
    // InternalBPMN_translator.g:6189:1: rule__Element__Close_tagAssignment_0_2 : ( ruleClose ) ;
    public final void rule__Element__Close_tagAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6193:1: ( ( ruleClose ) )
            // InternalBPMN_translator.g:6194:2: ( ruleClose )
            {
            // InternalBPMN_translator.g:6194:2: ( ruleClose )
            // InternalBPMN_translator.g:6195:3: ruleClose
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
    // InternalBPMN_translator.g:6204:1: rule__Element__Singleton_tagAssignment_1 : ( ruleSingleton ) ;
    public final void rule__Element__Singleton_tagAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6208:1: ( ( ruleSingleton ) )
            // InternalBPMN_translator.g:6209:2: ( ruleSingleton )
            {
            // InternalBPMN_translator.g:6209:2: ( ruleSingleton )
            // InternalBPMN_translator.g:6210:3: ruleSingleton
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
    // InternalBPMN_translator.g:6219:1: rule__Content__TypeAssignment_1_0_0 : ( ( rule__Content__TypeAlternatives_1_0_0_0 ) ) ;
    public final void rule__Content__TypeAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6223:1: ( ( ( rule__Content__TypeAlternatives_1_0_0_0 ) ) )
            // InternalBPMN_translator.g:6224:2: ( ( rule__Content__TypeAlternatives_1_0_0_0 ) )
            {
            // InternalBPMN_translator.g:6224:2: ( ( rule__Content__TypeAlternatives_1_0_0_0 ) )
            // InternalBPMN_translator.g:6225:3: ( rule__Content__TypeAlternatives_1_0_0_0 )
            {
             before(grammarAccess.getContentAccess().getTypeAlternatives_1_0_0_0()); 
            // InternalBPMN_translator.g:6226:3: ( rule__Content__TypeAlternatives_1_0_0_0 )
            // InternalBPMN_translator.g:6226:4: rule__Content__TypeAlternatives_1_0_0_0
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
    // InternalBPMN_translator.g:6234:1: rule__Content__CodexAssignment_1_0_2 : ( rulecodex ) ;
    public final void rule__Content__CodexAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6238:1: ( ( rulecodex ) )
            // InternalBPMN_translator.g:6239:2: ( rulecodex )
            {
            // InternalBPMN_translator.g:6239:2: ( rulecodex )
            // InternalBPMN_translator.g:6240:3: rulecodex
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
    // InternalBPMN_translator.g:6249:1: rule__Content__ElementAssignment_1_1 : ( ruleelement ) ;
    public final void rule__Content__ElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6253:1: ( ( ruleelement ) )
            // InternalBPMN_translator.g:6254:2: ( ruleelement )
            {
            // InternalBPMN_translator.g:6254:2: ( ruleelement )
            // InternalBPMN_translator.g:6255:3: ruleelement
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
    // InternalBPMN_translator.g:6264:1: rule__Content__BodyAssignment_1_2_0 : ( rulepreconditions ) ;
    public final void rule__Content__BodyAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6268:1: ( ( rulepreconditions ) )
            // InternalBPMN_translator.g:6269:2: ( rulepreconditions )
            {
            // InternalBPMN_translator.g:6269:2: ( rulepreconditions )
            // InternalBPMN_translator.g:6270:3: rulepreconditions
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
    // InternalBPMN_translator.g:6279:1: rule__Content__BodyAssignment_1_2_1 : ( ( rule__Content__BodyAlternatives_1_2_1_0 ) ) ;
    public final void rule__Content__BodyAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6283:1: ( ( ( rule__Content__BodyAlternatives_1_2_1_0 ) ) )
            // InternalBPMN_translator.g:6284:2: ( ( rule__Content__BodyAlternatives_1_2_1_0 ) )
            {
            // InternalBPMN_translator.g:6284:2: ( ( rule__Content__BodyAlternatives_1_2_1_0 ) )
            // InternalBPMN_translator.g:6285:3: ( rule__Content__BodyAlternatives_1_2_1_0 )
            {
             before(grammarAccess.getContentAccess().getBodyAlternatives_1_2_1_0()); 
            // InternalBPMN_translator.g:6286:3: ( rule__Content__BodyAlternatives_1_2_1_0 )
            // InternalBPMN_translator.g:6286:4: rule__Content__BodyAlternatives_1_2_1_0
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
    // InternalBPMN_translator.g:6294:1: rule__Content__BodyAssignment_1_2_2 : ( ruleconditions ) ;
    public final void rule__Content__BodyAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6298:1: ( ( ruleconditions ) )
            // InternalBPMN_translator.g:6299:2: ( ruleconditions )
            {
            // InternalBPMN_translator.g:6299:2: ( ruleconditions )
            // InternalBPMN_translator.g:6300:3: ruleconditions
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
    // InternalBPMN_translator.g:6309:1: rule__Content__KeywordsAssignment_1_3 : ( RULE_KEYWORDS ) ;
    public final void rule__Content__KeywordsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6313:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:6314:2: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:6314:2: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:6315:3: RULE_KEYWORDS
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
    // InternalBPMN_translator.g:6324:1: rule__Content__DataAssignment_1_4 : ( RULE_STRING ) ;
    public final void rule__Content__DataAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6328:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6329:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6329:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6330:3: RULE_STRING
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
    // InternalBPMN_translator.g:6339:1: rule__Open__HeadAssignment_1 : ( RULE_HEAD ) ;
    public final void rule__Open__HeadAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6343:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:6344:2: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:6344:2: ( RULE_HEAD )
            // InternalBPMN_translator.g:6345:3: RULE_HEAD
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
    // InternalBPMN_translator.g:6354:1: rule__Open__KeywordsAssignment_3 : ( RULE_KEYWORDS ) ;
    public final void rule__Open__KeywordsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6358:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:6359:2: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:6359:2: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:6360:3: RULE_KEYWORDS
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
    // InternalBPMN_translator.g:6369:1: rule__Open__Head1Assignment_4_0_0 : ( RULE_HEAD ) ;
    public final void rule__Open__Head1Assignment_4_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6373:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:6374:2: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:6374:2: ( RULE_HEAD )
            // InternalBPMN_translator.g:6375:3: RULE_HEAD
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
    // InternalBPMN_translator.g:6384:1: rule__Open__Head1Assignment_4_1_0_0 : ( RULE_HEAD ) ;
    public final void rule__Open__Head1Assignment_4_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6388:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:6389:2: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:6389:2: ( RULE_HEAD )
            // InternalBPMN_translator.g:6390:3: RULE_HEAD
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
    // InternalBPMN_translator.g:6399:1: rule__Open__Keywords1Assignment_4_1_0_1 : ( RULE_KEYWORDS ) ;
    public final void rule__Open__Keywords1Assignment_4_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6403:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:6404:2: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:6404:2: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:6405:3: RULE_KEYWORDS
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
    // InternalBPMN_translator.g:6414:1: rule__Open__ValueAssignment_4_1_2 : ( RULE_STRING ) ;
    public final void rule__Open__ValueAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6418:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6419:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6419:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6420:3: RULE_STRING
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
    // InternalBPMN_translator.g:6429:1: rule__Singleton__KeywordsAssignment_1_3 : ( RULE_KEYWORDS ) ;
    public final void rule__Singleton__KeywordsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6433:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:6434:2: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:6434:2: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:6435:3: RULE_KEYWORDS
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
    // InternalBPMN_translator.g:6444:1: rule__Singleton__Keywords1Assignment_1_4_1_0 : ( RULE_KEYWORDS ) ;
    public final void rule__Singleton__Keywords1Assignment_1_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6448:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:6449:2: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:6449:2: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:6450:3: RULE_KEYWORDS
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
    // InternalBPMN_translator.g:6459:1: rule__Singleton__ValueAssignment_1_4_1_2 : ( RULE_STRING ) ;
    public final void rule__Singleton__ValueAssignment_1_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6463:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6464:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6464:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6465:3: RULE_STRING
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
    // InternalBPMN_translator.g:6474:1: rule__Codex__Device_codeAssignment_0 : ( ruledevice ) ;
    public final void rule__Codex__Device_codeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6478:1: ( ( ruledevice ) )
            // InternalBPMN_translator.g:6479:2: ( ruledevice )
            {
            // InternalBPMN_translator.g:6479:2: ( ruledevice )
            // InternalBPMN_translator.g:6480:3: ruledevice
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
    // InternalBPMN_translator.g:6489:1: rule__Codex__ProtocolAssignment_1 : ( ruleprotocol ) ;
    public final void rule__Codex__ProtocolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6493:1: ( ( ruleprotocol ) )
            // InternalBPMN_translator.g:6494:2: ( ruleprotocol )
            {
            // InternalBPMN_translator.g:6494:2: ( ruleprotocol )
            // InternalBPMN_translator.g:6495:3: ruleprotocol
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
    // InternalBPMN_translator.g:6504:1: rule__Codex__Sensor_codeAssignment_2 : ( rulesensor ) ;
    public final void rule__Codex__Sensor_codeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6508:1: ( ( rulesensor ) )
            // InternalBPMN_translator.g:6509:2: ( rulesensor )
            {
            // InternalBPMN_translator.g:6509:2: ( rulesensor )
            // InternalBPMN_translator.g:6510:3: rulesensor
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
    // InternalBPMN_translator.g:6519:1: rule__Device__DeviceAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Device__DeviceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6523:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6524:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6524:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6525:3: RULE_STRING
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
    // InternalBPMN_translator.g:6534:1: rule__Device__IdAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Device__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6538:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6539:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6539:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6540:3: RULE_STRING
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
    // InternalBPMN_translator.g:6549:1: rule__Protocol__PnameAssignment_0_0 : ( ( 'MQTT' ) ) ;
    public final void rule__Protocol__PnameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6553:1: ( ( ( 'MQTT' ) ) )
            // InternalBPMN_translator.g:6554:2: ( ( 'MQTT' ) )
            {
            // InternalBPMN_translator.g:6554:2: ( ( 'MQTT' ) )
            // InternalBPMN_translator.g:6555:3: ( 'MQTT' )
            {
             before(grammarAccess.getProtocolAccess().getPnameMQTTKeyword_0_0_0()); 
            // InternalBPMN_translator.g:6556:3: ( 'MQTT' )
            // InternalBPMN_translator.g:6557:4: 'MQTT'
            {
             before(grammarAccess.getProtocolAccess().getPnameMQTTKeyword_0_0_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalBPMN_translator.g:6568:1: rule__Protocol__Mqtt_dataAssignment_0_2_0 : ( rulemqtt_data ) ;
    public final void rule__Protocol__Mqtt_dataAssignment_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6572:1: ( ( rulemqtt_data ) )
            // InternalBPMN_translator.g:6573:2: ( rulemqtt_data )
            {
            // InternalBPMN_translator.g:6573:2: ( rulemqtt_data )
            // InternalBPMN_translator.g:6574:3: rulemqtt_data
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
    // InternalBPMN_translator.g:6583:1: rule__Protocol__Mqtt_deviceAssignment_0_2_1 : ( ruleprotocol_device ) ;
    public final void rule__Protocol__Mqtt_deviceAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6587:1: ( ( ruleprotocol_device ) )
            // InternalBPMN_translator.g:6588:2: ( ruleprotocol_device )
            {
            // InternalBPMN_translator.g:6588:2: ( ruleprotocol_device )
            // InternalBPMN_translator.g:6589:3: ruleprotocol_device
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
    // InternalBPMN_translator.g:6598:1: rule__Protocol__PnameAssignment_1_0 : ( ( 'HTTP' ) ) ;
    public final void rule__Protocol__PnameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6602:1: ( ( ( 'HTTP' ) ) )
            // InternalBPMN_translator.g:6603:2: ( ( 'HTTP' ) )
            {
            // InternalBPMN_translator.g:6603:2: ( ( 'HTTP' ) )
            // InternalBPMN_translator.g:6604:3: ( 'HTTP' )
            {
             before(grammarAccess.getProtocolAccess().getPnameHTTPKeyword_1_0_0()); 
            // InternalBPMN_translator.g:6605:3: ( 'HTTP' )
            // InternalBPMN_translator.g:6606:4: 'HTTP'
            {
             before(grammarAccess.getProtocolAccess().getPnameHTTPKeyword_1_0_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalBPMN_translator.g:6617:1: rule__Protocol__Http_dataAssignment_1_2_0 : ( rulehttp_data ) ;
    public final void rule__Protocol__Http_dataAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6621:1: ( ( rulehttp_data ) )
            // InternalBPMN_translator.g:6622:2: ( rulehttp_data )
            {
            // InternalBPMN_translator.g:6622:2: ( rulehttp_data )
            // InternalBPMN_translator.g:6623:3: rulehttp_data
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
    // InternalBPMN_translator.g:6632:1: rule__Protocol__Http_deviceAssignment_1_2_1 : ( ruleprotocol_device ) ;
    public final void rule__Protocol__Http_deviceAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6636:1: ( ( ruleprotocol_device ) )
            // InternalBPMN_translator.g:6637:2: ( ruleprotocol_device )
            {
            // InternalBPMN_translator.g:6637:2: ( ruleprotocol_device )
            // InternalBPMN_translator.g:6638:3: ruleprotocol_device
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
    // InternalBPMN_translator.g:6647:1: rule__Http_data__PnameAssignment_1_0_2 : ( RULE_STRING ) ;
    public final void rule__Http_data__PnameAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6651:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6652:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6652:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6653:3: RULE_STRING
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
    // InternalBPMN_translator.g:6662:1: rule__Http_data__Server_ipAssignment_1_1_2 : ( RULE_STRING ) ;
    public final void rule__Http_data__Server_ipAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6666:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6667:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6667:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6668:3: RULE_STRING
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
    // InternalBPMN_translator.g:6677:1: rule__Http_data__Request_typeAssignment_1_2_2 : ( RULE_STRING ) ;
    public final void rule__Http_data__Request_typeAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6681:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6682:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6682:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6683:3: RULE_STRING
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
    // InternalBPMN_translator.g:6692:1: rule__Http_data__Content_typeAssignment_1_3_2 : ( RULE_STRING ) ;
    public final void rule__Http_data__Content_typeAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6696:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6697:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6697:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6698:3: RULE_STRING
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
    // InternalBPMN_translator.g:6707:1: rule__Http_data__HeaderAssignment_1_4_2 : ( RULE_STRING ) ;
    public final void rule__Http_data__HeaderAssignment_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6711:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6712:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6712:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6713:3: RULE_STRING
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
    // InternalBPMN_translator.g:6722:1: rule__Http_data__DataAssignment_1_5_2 : ( RULE_STRING ) ;
    public final void rule__Http_data__DataAssignment_1_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6726:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6727:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6727:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6728:3: RULE_STRING
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
    // InternalBPMN_translator.g:6737:1: rule__Http_data__Mqtt_network_dataAssignment_1_6_2 : ( ruleprotocol_network_data ) ;
    public final void rule__Http_data__Mqtt_network_dataAssignment_1_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6741:1: ( ( ruleprotocol_network_data ) )
            // InternalBPMN_translator.g:6742:2: ( ruleprotocol_network_data )
            {
            // InternalBPMN_translator.g:6742:2: ( ruleprotocol_network_data )
            // InternalBPMN_translator.g:6743:3: ruleprotocol_network_data
            {
             before(grammarAccess.getHttp_dataAccess().getMqtt_network_dataProtocol_network_dataParserRuleCall_1_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleprotocol_network_data();

            state._fsp--;

             after(grammarAccess.getHttp_dataAccess().getMqtt_network_dataProtocol_network_dataParserRuleCall_1_6_2_0()); 

            }


            }

        }
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
    // InternalBPMN_translator.g:6752:1: rule__Mqtt_data__PnameAssignment_1_0_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_data__PnameAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6756:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6757:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6757:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6758:3: RULE_STRING
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
    // InternalBPMN_translator.g:6767:1: rule__Mqtt_data__Broker_userAssignment_1_1_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_data__Broker_userAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6771:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6772:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6772:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6773:3: RULE_STRING
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
    // InternalBPMN_translator.g:6782:1: rule__Mqtt_data__Broker_passwordAssignment_1_2_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_data__Broker_passwordAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6786:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6787:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6787:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6788:3: RULE_STRING
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
    // InternalBPMN_translator.g:6797:1: rule__Mqtt_data__BrokerAssignment_1_3_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_data__BrokerAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6801:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6802:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6802:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6803:3: RULE_STRING
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
    // InternalBPMN_translator.g:6812:1: rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 : ( ruleprotocol_network_data ) ;
    public final void rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6816:1: ( ( ruleprotocol_network_data ) )
            // InternalBPMN_translator.g:6817:2: ( ruleprotocol_network_data )
            {
            // InternalBPMN_translator.g:6817:2: ( ruleprotocol_network_data )
            // InternalBPMN_translator.g:6818:3: ruleprotocol_network_data
            {
             before(grammarAccess.getMqtt_dataAccess().getMqtt_network_dataProtocol_network_dataParserRuleCall_1_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleprotocol_network_data();

            state._fsp--;

             after(grammarAccess.getMqtt_dataAccess().getMqtt_network_dataProtocol_network_dataParserRuleCall_1_4_2_0()); 

            }


            }

        }
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
    // InternalBPMN_translator.g:6827:1: rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_data__SubtopicsAssignment_1_5_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6831:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6832:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6832:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6833:3: RULE_STRING
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
    // InternalBPMN_translator.g:6842:1: rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6846:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6847:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6847:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6848:3: RULE_STRING
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
    // InternalBPMN_translator.g:6857:1: rule__Mqtt_data__ValueAssignment_1_6_2_1_2 : ( ( rule__Mqtt_data__ValueAlternatives_1_6_2_1_2_0 ) ) ;
    public final void rule__Mqtt_data__ValueAssignment_1_6_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6861:1: ( ( ( rule__Mqtt_data__ValueAlternatives_1_6_2_1_2_0 ) ) )
            // InternalBPMN_translator.g:6862:2: ( ( rule__Mqtt_data__ValueAlternatives_1_6_2_1_2_0 ) )
            {
            // InternalBPMN_translator.g:6862:2: ( ( rule__Mqtt_data__ValueAlternatives_1_6_2_1_2_0 ) )
            // InternalBPMN_translator.g:6863:3: ( rule__Mqtt_data__ValueAlternatives_1_6_2_1_2_0 )
            {
             before(grammarAccess.getMqtt_dataAccess().getValueAlternatives_1_6_2_1_2_0()); 
            // InternalBPMN_translator.g:6864:3: ( rule__Mqtt_data__ValueAlternatives_1_6_2_1_2_0 )
            // InternalBPMN_translator.g:6864:4: rule__Mqtt_data__ValueAlternatives_1_6_2_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Mqtt_data__ValueAlternatives_1_6_2_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMqtt_dataAccess().getValueAlternatives_1_6_2_1_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Protocol_network_data__SsidAssignment_2"
    // InternalBPMN_translator.g:6872:1: rule__Protocol_network_data__SsidAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Protocol_network_data__SsidAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6876:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6877:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6877:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6878:3: RULE_STRING
            {
             before(grammarAccess.getProtocol_network_dataAccess().getSsidSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProtocol_network_dataAccess().getSsidSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol_network_data__SsidAssignment_2"


    // $ANTLR start "rule__Protocol_network_data__PasswordAssignment_5"
    // InternalBPMN_translator.g:6887:1: rule__Protocol_network_data__PasswordAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Protocol_network_data__PasswordAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6891:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6892:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6892:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6893:3: RULE_STRING
            {
             before(grammarAccess.getProtocol_network_dataAccess().getPasswordSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProtocol_network_dataAccess().getPasswordSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol_network_data__PasswordAssignment_5"


    // $ANTLR start "rule__Protocol_device__DnameAssignment_4"
    // InternalBPMN_translator.g:6902:1: rule__Protocol_device__DnameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Protocol_device__DnameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6906:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:6907:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:6907:2: ( RULE_STRING )
            // InternalBPMN_translator.g:6908:3: RULE_STRING
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
    // InternalBPMN_translator.g:6917:1: rule__Sensor__SnameAssignment_0_0 : ( ( 'TEMPERATURE' ) ) ;
    public final void rule__Sensor__SnameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6921:1: ( ( ( 'TEMPERATURE' ) ) )
            // InternalBPMN_translator.g:6922:2: ( ( 'TEMPERATURE' ) )
            {
            // InternalBPMN_translator.g:6922:2: ( ( 'TEMPERATURE' ) )
            // InternalBPMN_translator.g:6923:3: ( 'TEMPERATURE' )
            {
             before(grammarAccess.getSensorAccess().getSnameTEMPERATUREKeyword_0_0_0()); 
            // InternalBPMN_translator.g:6924:3: ( 'TEMPERATURE' )
            // InternalBPMN_translator.g:6925:4: 'TEMPERATURE'
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
    // InternalBPMN_translator.g:6936:1: rule__Sensor__SensorAssignment_0_2 : ( rulesensor_data ) ;
    public final void rule__Sensor__SensorAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6940:1: ( ( rulesensor_data ) )
            // InternalBPMN_translator.g:6941:2: ( rulesensor_data )
            {
            // InternalBPMN_translator.g:6941:2: ( rulesensor_data )
            // InternalBPMN_translator.g:6942:3: rulesensor_data
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
    // InternalBPMN_translator.g:6951:1: rule__Sensor__SnameAssignment_1_0 : ( ( 'DISTANCE' ) ) ;
    public final void rule__Sensor__SnameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6955:1: ( ( ( 'DISTANCE' ) ) )
            // InternalBPMN_translator.g:6956:2: ( ( 'DISTANCE' ) )
            {
            // InternalBPMN_translator.g:6956:2: ( ( 'DISTANCE' ) )
            // InternalBPMN_translator.g:6957:3: ( 'DISTANCE' )
            {
             before(grammarAccess.getSensorAccess().getSnameDISTANCEKeyword_1_0_0()); 
            // InternalBPMN_translator.g:6958:3: ( 'DISTANCE' )
            // InternalBPMN_translator.g:6959:4: 'DISTANCE'
            {
             before(grammarAccess.getSensorAccess().getSnameDISTANCEKeyword_1_0_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalBPMN_translator.g:6970:1: rule__Sensor__SensorAssignment_1_2 : ( rulesensor_data ) ;
    public final void rule__Sensor__SensorAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6974:1: ( ( rulesensor_data ) )
            // InternalBPMN_translator.g:6975:2: ( rulesensor_data )
            {
            // InternalBPMN_translator.g:6975:2: ( rulesensor_data )
            // InternalBPMN_translator.g:6976:3: rulesensor_data
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


    // $ANTLR start "rule__Sensor__SnameAssignment_2_0"
    // InternalBPMN_translator.g:6985:1: rule__Sensor__SnameAssignment_2_0 : ( ( 'GAS' ) ) ;
    public final void rule__Sensor__SnameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:6989:1: ( ( ( 'GAS' ) ) )
            // InternalBPMN_translator.g:6990:2: ( ( 'GAS' ) )
            {
            // InternalBPMN_translator.g:6990:2: ( ( 'GAS' ) )
            // InternalBPMN_translator.g:6991:3: ( 'GAS' )
            {
             before(grammarAccess.getSensorAccess().getSnameGASKeyword_2_0_0()); 
            // InternalBPMN_translator.g:6992:3: ( 'GAS' )
            // InternalBPMN_translator.g:6993:4: 'GAS'
            {
             before(grammarAccess.getSensorAccess().getSnameGASKeyword_2_0_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSnameGASKeyword_2_0_0()); 

            }

             after(grammarAccess.getSensorAccess().getSnameGASKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__SnameAssignment_2_0"


    // $ANTLR start "rule__Sensor__SensorAssignment_2_2"
    // InternalBPMN_translator.g:7004:1: rule__Sensor__SensorAssignment_2_2 : ( rulesensor_data ) ;
    public final void rule__Sensor__SensorAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:7008:1: ( ( rulesensor_data ) )
            // InternalBPMN_translator.g:7009:2: ( rulesensor_data )
            {
            // InternalBPMN_translator.g:7009:2: ( rulesensor_data )
            // InternalBPMN_translator.g:7010:3: rulesensor_data
            {
             before(grammarAccess.getSensorAccess().getSensorSensor_dataParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            rulesensor_data();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getSensorSensor_dataParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__SensorAssignment_2_2"


    // $ANTLR start "rule__Sensor__SnameAssignment_3_0"
    // InternalBPMN_translator.g:7019:1: rule__Sensor__SnameAssignment_3_0 : ( ( 'LIGHT' ) ) ;
    public final void rule__Sensor__SnameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:7023:1: ( ( ( 'LIGHT' ) ) )
            // InternalBPMN_translator.g:7024:2: ( ( 'LIGHT' ) )
            {
            // InternalBPMN_translator.g:7024:2: ( ( 'LIGHT' ) )
            // InternalBPMN_translator.g:7025:3: ( 'LIGHT' )
            {
             before(grammarAccess.getSensorAccess().getSnameLIGHTKeyword_3_0_0()); 
            // InternalBPMN_translator.g:7026:3: ( 'LIGHT' )
            // InternalBPMN_translator.g:7027:4: 'LIGHT'
            {
             before(grammarAccess.getSensorAccess().getSnameLIGHTKeyword_3_0_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSnameLIGHTKeyword_3_0_0()); 

            }

             after(grammarAccess.getSensorAccess().getSnameLIGHTKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__SnameAssignment_3_0"


    // $ANTLR start "rule__Sensor__SensorAssignment_3_2"
    // InternalBPMN_translator.g:7038:1: rule__Sensor__SensorAssignment_3_2 : ( rulesensor_data ) ;
    public final void rule__Sensor__SensorAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:7042:1: ( ( rulesensor_data ) )
            // InternalBPMN_translator.g:7043:2: ( rulesensor_data )
            {
            // InternalBPMN_translator.g:7043:2: ( rulesensor_data )
            // InternalBPMN_translator.g:7044:3: rulesensor_data
            {
             before(grammarAccess.getSensorAccess().getSensorSensor_dataParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            rulesensor_data();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getSensorSensor_dataParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__SensorAssignment_3_2"


    // $ANTLR start "rule__Sensor_data__PnameAssignment_1_0_2"
    // InternalBPMN_translator.g:7053:1: rule__Sensor_data__PnameAssignment_1_0_2 : ( RULE_STRING ) ;
    public final void rule__Sensor_data__PnameAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:7057:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:7058:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:7058:2: ( RULE_STRING )
            // InternalBPMN_translator.g:7059:3: RULE_STRING
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
    // InternalBPMN_translator.g:7068:1: rule__Sensor_data__PinsAssignment_1_1_2 : ( RULE_STRING ) ;
    public final void rule__Sensor_data__PinsAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:7072:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:7073:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:7073:2: ( RULE_STRING )
            // InternalBPMN_translator.g:7074:3: RULE_STRING
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
    // InternalBPMN_translator.g:7083:1: rule__Sensor_data__Sensor_idAssignment_1_2_2 : ( RULE_STRING ) ;
    public final void rule__Sensor_data__Sensor_idAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:7087:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:7088:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:7088:2: ( RULE_STRING )
            // InternalBPMN_translator.g:7089:3: RULE_STRING
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
    static final String dfa_2s = "\1\41\1\6\1\42\1\7\1\6\2\24\2\uffff\1\6\1\5\1\6";
    static final String dfa_3s = "\1\41\1\6\1\42\1\7\1\44\1\42\1\24\2\uffff\1\44\1\5\1\44";
    static final String dfa_4s = "\7\uffff\1\2\1\1\3\uffff";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5\1\6\33\uffff\1\10\1\7",
            "\1\10\15\uffff\1\11",
            "\1\12",
            "",
            "",
            "\1\5\1\6\33\uffff\1\10\1\7",
            "\1\13",
            "\1\5\1\6\33\uffff\1\10\1\7"
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000004420600C0B0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000004420600C0B2L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000044006000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001FF0000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001FF0002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000008000000C0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x8000044000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000044000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x02F8200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000FE00000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000FE00000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0400000100000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x02F8200000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0100000100000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0104000100000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0104000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000044006000030L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x6000200000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x6000200000000002L});

}