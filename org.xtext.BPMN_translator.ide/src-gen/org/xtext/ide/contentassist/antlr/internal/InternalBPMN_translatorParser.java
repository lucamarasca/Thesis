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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_HEAD", "RULE_KEYWORDS", "RULE_BODY", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'_TASK'", "'_GATEWAY'", "'TEMPERATURE'", "'DISTANCE'", "'<?'", "'version='", "'encoding='", "'?>'", "'{'", "'}'", "'<'", "':'", "'>'", "'='", "'/>'", "'</'", "'DEVICE'", "'NAMEID'", "'NAME'", "'BROKER_USER'", "'BROKER_PASSWORD'", "'BROKER'", "'NETWORK'", "'SUBTOPICS'", "'TOPIC_NAME'", "'PUBTOPICS'", "'DATA'", "'SSID'", "'PASSWORD'", "'PROTOCOL_DEVICE'", "'PINS'", "'SENSOR_ID'", "'MQTT'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_BODY=7;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_KEYWORDS=6;
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
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
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


    // $ANTLR start "entryRulecodex"
    // InternalBPMN_translator.g:253:1: entryRulecodex : rulecodex EOF ;
    public final void entryRulecodex() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:254:1: ( rulecodex EOF )
            // InternalBPMN_translator.g:255:1: rulecodex EOF
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
    // InternalBPMN_translator.g:262:1: rulecodex : ( ( rule__Codex__Group__0 ) ) ;
    public final void rulecodex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:266:2: ( ( ( rule__Codex__Group__0 ) ) )
            // InternalBPMN_translator.g:267:2: ( ( rule__Codex__Group__0 ) )
            {
            // InternalBPMN_translator.g:267:2: ( ( rule__Codex__Group__0 ) )
            // InternalBPMN_translator.g:268:3: ( rule__Codex__Group__0 )
            {
             before(grammarAccess.getCodexAccess().getGroup()); 
            // InternalBPMN_translator.g:269:3: ( rule__Codex__Group__0 )
            // InternalBPMN_translator.g:269:4: rule__Codex__Group__0
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
    // InternalBPMN_translator.g:278:1: entryRuledevice : ruledevice EOF ;
    public final void entryRuledevice() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:279:1: ( ruledevice EOF )
            // InternalBPMN_translator.g:280:1: ruledevice EOF
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
    // InternalBPMN_translator.g:287:1: ruledevice : ( ( rule__Device__Group__0 ) ) ;
    public final void ruledevice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:291:2: ( ( ( rule__Device__Group__0 ) ) )
            // InternalBPMN_translator.g:292:2: ( ( rule__Device__Group__0 ) )
            {
            // InternalBPMN_translator.g:292:2: ( ( rule__Device__Group__0 ) )
            // InternalBPMN_translator.g:293:3: ( rule__Device__Group__0 )
            {
             before(grammarAccess.getDeviceAccess().getGroup()); 
            // InternalBPMN_translator.g:294:3: ( rule__Device__Group__0 )
            // InternalBPMN_translator.g:294:4: rule__Device__Group__0
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
    // InternalBPMN_translator.g:303:1: entryRuleprotocol : ruleprotocol EOF ;
    public final void entryRuleprotocol() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:304:1: ( ruleprotocol EOF )
            // InternalBPMN_translator.g:305:1: ruleprotocol EOF
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
    // InternalBPMN_translator.g:312:1: ruleprotocol : ( ( rule__Protocol__Group__0 ) ) ;
    public final void ruleprotocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:316:2: ( ( ( rule__Protocol__Group__0 ) ) )
            // InternalBPMN_translator.g:317:2: ( ( rule__Protocol__Group__0 ) )
            {
            // InternalBPMN_translator.g:317:2: ( ( rule__Protocol__Group__0 ) )
            // InternalBPMN_translator.g:318:3: ( rule__Protocol__Group__0 )
            {
             before(grammarAccess.getProtocolAccess().getGroup()); 
            // InternalBPMN_translator.g:319:3: ( rule__Protocol__Group__0 )
            // InternalBPMN_translator.g:319:4: rule__Protocol__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRulemqtt_data"
    // InternalBPMN_translator.g:328:1: entryRulemqtt_data : rulemqtt_data EOF ;
    public final void entryRulemqtt_data() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:329:1: ( rulemqtt_data EOF )
            // InternalBPMN_translator.g:330:1: rulemqtt_data EOF
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
    // InternalBPMN_translator.g:337:1: rulemqtt_data : ( ( rule__Mqtt_data__Group__0 ) ) ;
    public final void rulemqtt_data() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:341:2: ( ( ( rule__Mqtt_data__Group__0 ) ) )
            // InternalBPMN_translator.g:342:2: ( ( rule__Mqtt_data__Group__0 ) )
            {
            // InternalBPMN_translator.g:342:2: ( ( rule__Mqtt_data__Group__0 ) )
            // InternalBPMN_translator.g:343:3: ( rule__Mqtt_data__Group__0 )
            {
             before(grammarAccess.getMqtt_dataAccess().getGroup()); 
            // InternalBPMN_translator.g:344:3: ( rule__Mqtt_data__Group__0 )
            // InternalBPMN_translator.g:344:4: rule__Mqtt_data__Group__0
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
    // InternalBPMN_translator.g:353:1: entryRulemqtt_network_data : rulemqtt_network_data EOF ;
    public final void entryRulemqtt_network_data() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:354:1: ( rulemqtt_network_data EOF )
            // InternalBPMN_translator.g:355:1: rulemqtt_network_data EOF
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
    // InternalBPMN_translator.g:362:1: rulemqtt_network_data : ( ( rule__Mqtt_network_data__Group__0 ) ) ;
    public final void rulemqtt_network_data() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:366:2: ( ( ( rule__Mqtt_network_data__Group__0 ) ) )
            // InternalBPMN_translator.g:367:2: ( ( rule__Mqtt_network_data__Group__0 ) )
            {
            // InternalBPMN_translator.g:367:2: ( ( rule__Mqtt_network_data__Group__0 ) )
            // InternalBPMN_translator.g:368:3: ( rule__Mqtt_network_data__Group__0 )
            {
             before(grammarAccess.getMqtt_network_dataAccess().getGroup()); 
            // InternalBPMN_translator.g:369:3: ( rule__Mqtt_network_data__Group__0 )
            // InternalBPMN_translator.g:369:4: rule__Mqtt_network_data__Group__0
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
    // InternalBPMN_translator.g:378:1: entryRulemqtt_device : rulemqtt_device EOF ;
    public final void entryRulemqtt_device() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:379:1: ( rulemqtt_device EOF )
            // InternalBPMN_translator.g:380:1: rulemqtt_device EOF
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
    // InternalBPMN_translator.g:387:1: rulemqtt_device : ( ( rule__Mqtt_device__Group__0 ) ) ;
    public final void rulemqtt_device() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:391:2: ( ( ( rule__Mqtt_device__Group__0 ) ) )
            // InternalBPMN_translator.g:392:2: ( ( rule__Mqtt_device__Group__0 ) )
            {
            // InternalBPMN_translator.g:392:2: ( ( rule__Mqtt_device__Group__0 ) )
            // InternalBPMN_translator.g:393:3: ( rule__Mqtt_device__Group__0 )
            {
             before(grammarAccess.getMqtt_deviceAccess().getGroup()); 
            // InternalBPMN_translator.g:394:3: ( rule__Mqtt_device__Group__0 )
            // InternalBPMN_translator.g:394:4: rule__Mqtt_device__Group__0
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
    // InternalBPMN_translator.g:403:1: entryRulesensor : rulesensor EOF ;
    public final void entryRulesensor() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:404:1: ( rulesensor EOF )
            // InternalBPMN_translator.g:405:1: rulesensor EOF
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
    // InternalBPMN_translator.g:412:1: rulesensor : ( ( rule__Sensor__Alternatives ) ) ;
    public final void rulesensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:416:2: ( ( ( rule__Sensor__Alternatives ) ) )
            // InternalBPMN_translator.g:417:2: ( ( rule__Sensor__Alternatives ) )
            {
            // InternalBPMN_translator.g:417:2: ( ( rule__Sensor__Alternatives ) )
            // InternalBPMN_translator.g:418:3: ( rule__Sensor__Alternatives )
            {
             before(grammarAccess.getSensorAccess().getAlternatives()); 
            // InternalBPMN_translator.g:419:3: ( rule__Sensor__Alternatives )
            // InternalBPMN_translator.g:419:4: rule__Sensor__Alternatives
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
    // InternalBPMN_translator.g:428:1: entryRulesensor_data : rulesensor_data EOF ;
    public final void entryRulesensor_data() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:429:1: ( rulesensor_data EOF )
            // InternalBPMN_translator.g:430:1: rulesensor_data EOF
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
    // InternalBPMN_translator.g:437:1: rulesensor_data : ( ( rule__Sensor_data__Group__0 ) ) ;
    public final void rulesensor_data() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:441:2: ( ( ( rule__Sensor_data__Group__0 ) ) )
            // InternalBPMN_translator.g:442:2: ( ( rule__Sensor_data__Group__0 ) )
            {
            // InternalBPMN_translator.g:442:2: ( ( rule__Sensor_data__Group__0 ) )
            // InternalBPMN_translator.g:443:3: ( rule__Sensor_data__Group__0 )
            {
             before(grammarAccess.getSensor_dataAccess().getGroup()); 
            // InternalBPMN_translator.g:444:3: ( rule__Sensor_data__Group__0 )
            // InternalBPMN_translator.g:444:4: rule__Sensor_data__Group__0
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


    // $ANTLR start "entryRulevariable"
    // InternalBPMN_translator.g:453:1: entryRulevariable : rulevariable EOF ;
    public final void entryRulevariable() throws RecognitionException {
        try {
            // InternalBPMN_translator.g:454:1: ( rulevariable EOF )
            // InternalBPMN_translator.g:455:1: rulevariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            rulevariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
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
    // $ANTLR end "entryRulevariable"


    // $ANTLR start "rulevariable"
    // InternalBPMN_translator.g:462:1: rulevariable : ( ( rule__Variable__Alternatives ) ) ;
    public final void rulevariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:466:2: ( ( ( rule__Variable__Alternatives ) ) )
            // InternalBPMN_translator.g:467:2: ( ( rule__Variable__Alternatives ) )
            {
            // InternalBPMN_translator.g:467:2: ( ( rule__Variable__Alternatives ) )
            // InternalBPMN_translator.g:468:3: ( rule__Variable__Alternatives )
            {
             before(grammarAccess.getVariableAccess().getAlternatives()); 
            // InternalBPMN_translator.g:469:3: ( rule__Variable__Alternatives )
            // InternalBPMN_translator.g:469:4: rule__Variable__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevariable"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalBPMN_translator.g:477:1: rule__Element__Alternatives : ( ( ( rule__Element__Group_0__0 ) ) | ( ( rule__Element__Singleton_tagAssignment_1 ) ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:481:1: ( ( ( rule__Element__Group_0__0 ) ) | ( ( rule__Element__Singleton_tagAssignment_1 ) ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalBPMN_translator.g:482:2: ( ( rule__Element__Group_0__0 ) )
                    {
                    // InternalBPMN_translator.g:482:2: ( ( rule__Element__Group_0__0 ) )
                    // InternalBPMN_translator.g:483:3: ( rule__Element__Group_0__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_0()); 
                    // InternalBPMN_translator.g:484:3: ( rule__Element__Group_0__0 )
                    // InternalBPMN_translator.g:484:4: rule__Element__Group_0__0
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
                    // InternalBPMN_translator.g:488:2: ( ( rule__Element__Singleton_tagAssignment_1 ) )
                    {
                    // InternalBPMN_translator.g:488:2: ( ( rule__Element__Singleton_tagAssignment_1 ) )
                    // InternalBPMN_translator.g:489:3: ( rule__Element__Singleton_tagAssignment_1 )
                    {
                     before(grammarAccess.getElementAccess().getSingleton_tagAssignment_1()); 
                    // InternalBPMN_translator.g:490:3: ( rule__Element__Singleton_tagAssignment_1 )
                    // InternalBPMN_translator.g:490:4: rule__Element__Singleton_tagAssignment_1
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
    // InternalBPMN_translator.g:498:1: rule__Content__Alternatives_1 : ( ( ( rule__Content__Group_1_0__0 ) ) | ( ( rule__Content__ElementAssignment_1_1 ) ) | ( ( rule__Content__BodyAssignment_1_2 ) ) | ( ( rule__Content__KeywordsAssignment_1_3 ) ) | ( ( rule__Content__DataAssignment_1_4 ) ) );
    public final void rule__Content__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:502:1: ( ( ( rule__Content__Group_1_0__0 ) ) | ( ( rule__Content__ElementAssignment_1_1 ) ) | ( ( rule__Content__BodyAssignment_1_2 ) ) | ( ( rule__Content__KeywordsAssignment_1_3 ) ) | ( ( rule__Content__DataAssignment_1_4 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 14:
            case 15:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case RULE_BODY:
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
                    // InternalBPMN_translator.g:503:2: ( ( rule__Content__Group_1_0__0 ) )
                    {
                    // InternalBPMN_translator.g:503:2: ( ( rule__Content__Group_1_0__0 ) )
                    // InternalBPMN_translator.g:504:3: ( rule__Content__Group_1_0__0 )
                    {
                     before(grammarAccess.getContentAccess().getGroup_1_0()); 
                    // InternalBPMN_translator.g:505:3: ( rule__Content__Group_1_0__0 )
                    // InternalBPMN_translator.g:505:4: rule__Content__Group_1_0__0
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
                    // InternalBPMN_translator.g:509:2: ( ( rule__Content__ElementAssignment_1_1 ) )
                    {
                    // InternalBPMN_translator.g:509:2: ( ( rule__Content__ElementAssignment_1_1 ) )
                    // InternalBPMN_translator.g:510:3: ( rule__Content__ElementAssignment_1_1 )
                    {
                     before(grammarAccess.getContentAccess().getElementAssignment_1_1()); 
                    // InternalBPMN_translator.g:511:3: ( rule__Content__ElementAssignment_1_1 )
                    // InternalBPMN_translator.g:511:4: rule__Content__ElementAssignment_1_1
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
                    // InternalBPMN_translator.g:515:2: ( ( rule__Content__BodyAssignment_1_2 ) )
                    {
                    // InternalBPMN_translator.g:515:2: ( ( rule__Content__BodyAssignment_1_2 ) )
                    // InternalBPMN_translator.g:516:3: ( rule__Content__BodyAssignment_1_2 )
                    {
                     before(grammarAccess.getContentAccess().getBodyAssignment_1_2()); 
                    // InternalBPMN_translator.g:517:3: ( rule__Content__BodyAssignment_1_2 )
                    // InternalBPMN_translator.g:517:4: rule__Content__BodyAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Content__BodyAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getContentAccess().getBodyAssignment_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBPMN_translator.g:521:2: ( ( rule__Content__KeywordsAssignment_1_3 ) )
                    {
                    // InternalBPMN_translator.g:521:2: ( ( rule__Content__KeywordsAssignment_1_3 ) )
                    // InternalBPMN_translator.g:522:3: ( rule__Content__KeywordsAssignment_1_3 )
                    {
                     before(grammarAccess.getContentAccess().getKeywordsAssignment_1_3()); 
                    // InternalBPMN_translator.g:523:3: ( rule__Content__KeywordsAssignment_1_3 )
                    // InternalBPMN_translator.g:523:4: rule__Content__KeywordsAssignment_1_3
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
                    // InternalBPMN_translator.g:527:2: ( ( rule__Content__DataAssignment_1_4 ) )
                    {
                    // InternalBPMN_translator.g:527:2: ( ( rule__Content__DataAssignment_1_4 ) )
                    // InternalBPMN_translator.g:528:3: ( rule__Content__DataAssignment_1_4 )
                    {
                     before(grammarAccess.getContentAccess().getDataAssignment_1_4()); 
                    // InternalBPMN_translator.g:529:3: ( rule__Content__DataAssignment_1_4 )
                    // InternalBPMN_translator.g:529:4: rule__Content__DataAssignment_1_4
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
    // InternalBPMN_translator.g:537:1: rule__Content__TypeAlternatives_1_0_0_0 : ( ( '_TASK' ) | ( '_GATEWAY' ) );
    public final void rule__Content__TypeAlternatives_1_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:541:1: ( ( '_TASK' ) | ( '_GATEWAY' ) )
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
                    // InternalBPMN_translator.g:542:2: ( '_TASK' )
                    {
                    // InternalBPMN_translator.g:542:2: ( '_TASK' )
                    // InternalBPMN_translator.g:543:3: '_TASK'
                    {
                     before(grammarAccess.getContentAccess().getType_TASKKeyword_1_0_0_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getContentAccess().getType_TASKKeyword_1_0_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:548:2: ( '_GATEWAY' )
                    {
                    // InternalBPMN_translator.g:548:2: ( '_GATEWAY' )
                    // InternalBPMN_translator.g:549:3: '_GATEWAY'
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


    // $ANTLR start "rule__Open__Alternatives_4"
    // InternalBPMN_translator.g:558:1: rule__Open__Alternatives_4 : ( ( ( rule__Open__Group_4_0__0 ) ) | ( ( rule__Open__Group_4_1__0 ) ) );
    public final void rule__Open__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:562:1: ( ( ( rule__Open__Group_4_0__0 ) ) | ( ( rule__Open__Group_4_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_HEAD) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==25) ) {
                    alt4=1;
                }
                else if ( (LA4_1==27) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_KEYWORDS) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBPMN_translator.g:563:2: ( ( rule__Open__Group_4_0__0 ) )
                    {
                    // InternalBPMN_translator.g:563:2: ( ( rule__Open__Group_4_0__0 ) )
                    // InternalBPMN_translator.g:564:3: ( rule__Open__Group_4_0__0 )
                    {
                     before(grammarAccess.getOpenAccess().getGroup_4_0()); 
                    // InternalBPMN_translator.g:565:3: ( rule__Open__Group_4_0__0 )
                    // InternalBPMN_translator.g:565:4: rule__Open__Group_4_0__0
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
                    // InternalBPMN_translator.g:569:2: ( ( rule__Open__Group_4_1__0 ) )
                    {
                    // InternalBPMN_translator.g:569:2: ( ( rule__Open__Group_4_1__0 ) )
                    // InternalBPMN_translator.g:570:3: ( rule__Open__Group_4_1__0 )
                    {
                     before(grammarAccess.getOpenAccess().getGroup_4_1()); 
                    // InternalBPMN_translator.g:571:3: ( rule__Open__Group_4_1__0 )
                    // InternalBPMN_translator.g:571:4: rule__Open__Group_4_1__0
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
    // InternalBPMN_translator.g:579:1: rule__Open__Alternatives_4_1_0 : ( ( ( rule__Open__Head1Assignment_4_1_0_0 ) ) | ( ( rule__Open__Keywords1Assignment_4_1_0_1 ) ) );
    public final void rule__Open__Alternatives_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:583:1: ( ( ( rule__Open__Head1Assignment_4_1_0_0 ) ) | ( ( rule__Open__Keywords1Assignment_4_1_0_1 ) ) )
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
                    // InternalBPMN_translator.g:584:2: ( ( rule__Open__Head1Assignment_4_1_0_0 ) )
                    {
                    // InternalBPMN_translator.g:584:2: ( ( rule__Open__Head1Assignment_4_1_0_0 ) )
                    // InternalBPMN_translator.g:585:3: ( rule__Open__Head1Assignment_4_1_0_0 )
                    {
                     before(grammarAccess.getOpenAccess().getHead1Assignment_4_1_0_0()); 
                    // InternalBPMN_translator.g:586:3: ( rule__Open__Head1Assignment_4_1_0_0 )
                    // InternalBPMN_translator.g:586:4: rule__Open__Head1Assignment_4_1_0_0
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
                    // InternalBPMN_translator.g:590:2: ( ( rule__Open__Keywords1Assignment_4_1_0_1 ) )
                    {
                    // InternalBPMN_translator.g:590:2: ( ( rule__Open__Keywords1Assignment_4_1_0_1 ) )
                    // InternalBPMN_translator.g:591:3: ( rule__Open__Keywords1Assignment_4_1_0_1 )
                    {
                     before(grammarAccess.getOpenAccess().getKeywords1Assignment_4_1_0_1()); 
                    // InternalBPMN_translator.g:592:3: ( rule__Open__Keywords1Assignment_4_1_0_1 )
                    // InternalBPMN_translator.g:592:4: rule__Open__Keywords1Assignment_4_1_0_1
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
    // InternalBPMN_translator.g:600:1: rule__Singleton__Alternatives_1_4 : ( ( ( rule__Singleton__Group_1_4_0__0 ) ) | ( ( rule__Singleton__Group_1_4_1__0 ) ) );
    public final void rule__Singleton__Alternatives_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:604:1: ( ( ( rule__Singleton__Group_1_4_0__0 ) ) | ( ( rule__Singleton__Group_1_4_1__0 ) ) )
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
                    // InternalBPMN_translator.g:605:2: ( ( rule__Singleton__Group_1_4_0__0 ) )
                    {
                    // InternalBPMN_translator.g:605:2: ( ( rule__Singleton__Group_1_4_0__0 ) )
                    // InternalBPMN_translator.g:606:3: ( rule__Singleton__Group_1_4_0__0 )
                    {
                     before(grammarAccess.getSingletonAccess().getGroup_1_4_0()); 
                    // InternalBPMN_translator.g:607:3: ( rule__Singleton__Group_1_4_0__0 )
                    // InternalBPMN_translator.g:607:4: rule__Singleton__Group_1_4_0__0
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
                    // InternalBPMN_translator.g:611:2: ( ( rule__Singleton__Group_1_4_1__0 ) )
                    {
                    // InternalBPMN_translator.g:611:2: ( ( rule__Singleton__Group_1_4_1__0 ) )
                    // InternalBPMN_translator.g:612:3: ( rule__Singleton__Group_1_4_1__0 )
                    {
                     before(grammarAccess.getSingletonAccess().getGroup_1_4_1()); 
                    // InternalBPMN_translator.g:613:3: ( rule__Singleton__Group_1_4_1__0 )
                    // InternalBPMN_translator.g:613:4: rule__Singleton__Group_1_4_1__0
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


    // $ANTLR start "rule__Mqtt_data__Alternatives_1"
    // InternalBPMN_translator.g:621:1: rule__Mqtt_data__Alternatives_1 : ( ( ( rule__Mqtt_data__Group_1_0__0 ) ) | ( ( rule__Mqtt_data__Group_1_1__0 ) ) | ( ( rule__Mqtt_data__Group_1_2__0 ) ) | ( ( rule__Mqtt_data__Group_1_3__0 ) ) | ( ( rule__Mqtt_data__Group_1_4__0 ) ) | ( ( rule__Mqtt_data__Group_1_5__0 ) ) | ( ( rule__Mqtt_data__Group_1_6__0 ) ) );
    public final void rule__Mqtt_data__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:625:1: ( ( ( rule__Mqtt_data__Group_1_0__0 ) ) | ( ( rule__Mqtt_data__Group_1_1__0 ) ) | ( ( rule__Mqtt_data__Group_1_2__0 ) ) | ( ( rule__Mqtt_data__Group_1_3__0 ) ) | ( ( rule__Mqtt_data__Group_1_4__0 ) ) | ( ( rule__Mqtt_data__Group_1_5__0 ) ) | ( ( rule__Mqtt_data__Group_1_6__0 ) ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt7=1;
                }
                break;
            case 33:
                {
                alt7=2;
                }
                break;
            case 34:
                {
                alt7=3;
                }
                break;
            case 35:
                {
                alt7=4;
                }
                break;
            case 36:
                {
                alt7=5;
                }
                break;
            case 37:
                {
                alt7=6;
                }
                break;
            case 39:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBPMN_translator.g:626:2: ( ( rule__Mqtt_data__Group_1_0__0 ) )
                    {
                    // InternalBPMN_translator.g:626:2: ( ( rule__Mqtt_data__Group_1_0__0 ) )
                    // InternalBPMN_translator.g:627:3: ( rule__Mqtt_data__Group_1_0__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_0()); 
                    // InternalBPMN_translator.g:628:3: ( rule__Mqtt_data__Group_1_0__0 )
                    // InternalBPMN_translator.g:628:4: rule__Mqtt_data__Group_1_0__0
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
                    // InternalBPMN_translator.g:632:2: ( ( rule__Mqtt_data__Group_1_1__0 ) )
                    {
                    // InternalBPMN_translator.g:632:2: ( ( rule__Mqtt_data__Group_1_1__0 ) )
                    // InternalBPMN_translator.g:633:3: ( rule__Mqtt_data__Group_1_1__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_1()); 
                    // InternalBPMN_translator.g:634:3: ( rule__Mqtt_data__Group_1_1__0 )
                    // InternalBPMN_translator.g:634:4: rule__Mqtt_data__Group_1_1__0
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
                    // InternalBPMN_translator.g:638:2: ( ( rule__Mqtt_data__Group_1_2__0 ) )
                    {
                    // InternalBPMN_translator.g:638:2: ( ( rule__Mqtt_data__Group_1_2__0 ) )
                    // InternalBPMN_translator.g:639:3: ( rule__Mqtt_data__Group_1_2__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_2()); 
                    // InternalBPMN_translator.g:640:3: ( rule__Mqtt_data__Group_1_2__0 )
                    // InternalBPMN_translator.g:640:4: rule__Mqtt_data__Group_1_2__0
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
                    // InternalBPMN_translator.g:644:2: ( ( rule__Mqtt_data__Group_1_3__0 ) )
                    {
                    // InternalBPMN_translator.g:644:2: ( ( rule__Mqtt_data__Group_1_3__0 ) )
                    // InternalBPMN_translator.g:645:3: ( rule__Mqtt_data__Group_1_3__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_3()); 
                    // InternalBPMN_translator.g:646:3: ( rule__Mqtt_data__Group_1_3__0 )
                    // InternalBPMN_translator.g:646:4: rule__Mqtt_data__Group_1_3__0
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
                    // InternalBPMN_translator.g:650:2: ( ( rule__Mqtt_data__Group_1_4__0 ) )
                    {
                    // InternalBPMN_translator.g:650:2: ( ( rule__Mqtt_data__Group_1_4__0 ) )
                    // InternalBPMN_translator.g:651:3: ( rule__Mqtt_data__Group_1_4__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_4()); 
                    // InternalBPMN_translator.g:652:3: ( rule__Mqtt_data__Group_1_4__0 )
                    // InternalBPMN_translator.g:652:4: rule__Mqtt_data__Group_1_4__0
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
                    // InternalBPMN_translator.g:656:2: ( ( rule__Mqtt_data__Group_1_5__0 ) )
                    {
                    // InternalBPMN_translator.g:656:2: ( ( rule__Mqtt_data__Group_1_5__0 ) )
                    // InternalBPMN_translator.g:657:3: ( rule__Mqtt_data__Group_1_5__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_5()); 
                    // InternalBPMN_translator.g:658:3: ( rule__Mqtt_data__Group_1_5__0 )
                    // InternalBPMN_translator.g:658:4: rule__Mqtt_data__Group_1_5__0
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
                    // InternalBPMN_translator.g:662:2: ( ( rule__Mqtt_data__Group_1_6__0 ) )
                    {
                    // InternalBPMN_translator.g:662:2: ( ( rule__Mqtt_data__Group_1_6__0 ) )
                    // InternalBPMN_translator.g:663:3: ( rule__Mqtt_data__Group_1_6__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_6()); 
                    // InternalBPMN_translator.g:664:3: ( rule__Mqtt_data__Group_1_6__0 )
                    // InternalBPMN_translator.g:664:4: rule__Mqtt_data__Group_1_6__0
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
    // InternalBPMN_translator.g:672:1: rule__Mqtt_data__Alternatives_1_6_2 : ( ( ( rule__Mqtt_data__Group_1_6_2_0__0 ) ) | ( ( rule__Mqtt_data__Group_1_6_2_1__0 ) ) );
    public final void rule__Mqtt_data__Alternatives_1_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:676:1: ( ( ( rule__Mqtt_data__Group_1_6_2_0__0 ) ) | ( ( rule__Mqtt_data__Group_1_6_2_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==38) ) {
                alt8=1;
            }
            else if ( (LA8_0==40) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBPMN_translator.g:677:2: ( ( rule__Mqtt_data__Group_1_6_2_0__0 ) )
                    {
                    // InternalBPMN_translator.g:677:2: ( ( rule__Mqtt_data__Group_1_6_2_0__0 ) )
                    // InternalBPMN_translator.g:678:3: ( rule__Mqtt_data__Group_1_6_2_0__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_6_2_0()); 
                    // InternalBPMN_translator.g:679:3: ( rule__Mqtt_data__Group_1_6_2_0__0 )
                    // InternalBPMN_translator.g:679:4: rule__Mqtt_data__Group_1_6_2_0__0
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
                    // InternalBPMN_translator.g:683:2: ( ( rule__Mqtt_data__Group_1_6_2_1__0 ) )
                    {
                    // InternalBPMN_translator.g:683:2: ( ( rule__Mqtt_data__Group_1_6_2_1__0 ) )
                    // InternalBPMN_translator.g:684:3: ( rule__Mqtt_data__Group_1_6_2_1__0 )
                    {
                     before(grammarAccess.getMqtt_dataAccess().getGroup_1_6_2_1()); 
                    // InternalBPMN_translator.g:685:3: ( rule__Mqtt_data__Group_1_6_2_1__0 )
                    // InternalBPMN_translator.g:685:4: rule__Mqtt_data__Group_1_6_2_1__0
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
    // InternalBPMN_translator.g:693:1: rule__Mqtt_data__ValueAlternatives_1_6_2_1_2_0 : ( ( RULE_STRING ) | ( rulevariable ) );
    public final void rule__Mqtt_data__ValueAlternatives_1_6_2_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:697:1: ( ( RULE_STRING ) | ( rulevariable ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=16 && LA9_0<=17)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalBPMN_translator.g:698:2: ( RULE_STRING )
                    {
                    // InternalBPMN_translator.g:698:2: ( RULE_STRING )
                    // InternalBPMN_translator.g:699:3: RULE_STRING
                    {
                     before(grammarAccess.getMqtt_dataAccess().getValueSTRINGTerminalRuleCall_1_6_2_1_2_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getMqtt_dataAccess().getValueSTRINGTerminalRuleCall_1_6_2_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:704:2: ( rulevariable )
                    {
                    // InternalBPMN_translator.g:704:2: ( rulevariable )
                    // InternalBPMN_translator.g:705:3: rulevariable
                    {
                     before(grammarAccess.getMqtt_dataAccess().getValueVariableParserRuleCall_1_6_2_1_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulevariable();

                    state._fsp--;

                     after(grammarAccess.getMqtt_dataAccess().getValueVariableParserRuleCall_1_6_2_1_2_0_1()); 

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
    // InternalBPMN_translator.g:714:1: rule__Sensor__Alternatives : ( ( ( rule__Sensor__Group_0__0 ) ) | ( ( rule__Sensor__Group_1__0 ) ) );
    public final void rule__Sensor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:718:1: ( ( ( rule__Sensor__Group_0__0 ) ) | ( ( rule__Sensor__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            else if ( (LA10_0==17) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalBPMN_translator.g:719:2: ( ( rule__Sensor__Group_0__0 ) )
                    {
                    // InternalBPMN_translator.g:719:2: ( ( rule__Sensor__Group_0__0 ) )
                    // InternalBPMN_translator.g:720:3: ( rule__Sensor__Group_0__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_0()); 
                    // InternalBPMN_translator.g:721:3: ( rule__Sensor__Group_0__0 )
                    // InternalBPMN_translator.g:721:4: rule__Sensor__Group_0__0
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
                    // InternalBPMN_translator.g:725:2: ( ( rule__Sensor__Group_1__0 ) )
                    {
                    // InternalBPMN_translator.g:725:2: ( ( rule__Sensor__Group_1__0 ) )
                    // InternalBPMN_translator.g:726:3: ( rule__Sensor__Group_1__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_1()); 
                    // InternalBPMN_translator.g:727:3: ( rule__Sensor__Group_1__0 )
                    // InternalBPMN_translator.g:727:4: rule__Sensor__Group_1__0
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
    // InternalBPMN_translator.g:735:1: rule__Sensor_data__Alternatives_1 : ( ( ( rule__Sensor_data__Group_1_0__0 ) ) | ( ( rule__Sensor_data__Group_1_1__0 ) ) | ( ( rule__Sensor_data__Group_1_2__0 ) ) );
    public final void rule__Sensor_data__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:739:1: ( ( ( rule__Sensor_data__Group_1_0__0 ) ) | ( ( rule__Sensor_data__Group_1_1__0 ) ) | ( ( rule__Sensor_data__Group_1_2__0 ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt11=1;
                }
                break;
            case 44:
                {
                alt11=2;
                }
                break;
            case 45:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalBPMN_translator.g:740:2: ( ( rule__Sensor_data__Group_1_0__0 ) )
                    {
                    // InternalBPMN_translator.g:740:2: ( ( rule__Sensor_data__Group_1_0__0 ) )
                    // InternalBPMN_translator.g:741:3: ( rule__Sensor_data__Group_1_0__0 )
                    {
                     before(grammarAccess.getSensor_dataAccess().getGroup_1_0()); 
                    // InternalBPMN_translator.g:742:3: ( rule__Sensor_data__Group_1_0__0 )
                    // InternalBPMN_translator.g:742:4: rule__Sensor_data__Group_1_0__0
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
                    // InternalBPMN_translator.g:746:2: ( ( rule__Sensor_data__Group_1_1__0 ) )
                    {
                    // InternalBPMN_translator.g:746:2: ( ( rule__Sensor_data__Group_1_1__0 ) )
                    // InternalBPMN_translator.g:747:3: ( rule__Sensor_data__Group_1_1__0 )
                    {
                     before(grammarAccess.getSensor_dataAccess().getGroup_1_1()); 
                    // InternalBPMN_translator.g:748:3: ( rule__Sensor_data__Group_1_1__0 )
                    // InternalBPMN_translator.g:748:4: rule__Sensor_data__Group_1_1__0
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
                    // InternalBPMN_translator.g:752:2: ( ( rule__Sensor_data__Group_1_2__0 ) )
                    {
                    // InternalBPMN_translator.g:752:2: ( ( rule__Sensor_data__Group_1_2__0 ) )
                    // InternalBPMN_translator.g:753:3: ( rule__Sensor_data__Group_1_2__0 )
                    {
                     before(grammarAccess.getSensor_dataAccess().getGroup_1_2()); 
                    // InternalBPMN_translator.g:754:3: ( rule__Sensor_data__Group_1_2__0 )
                    // InternalBPMN_translator.g:754:4: rule__Sensor_data__Group_1_2__0
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


    // $ANTLR start "rule__Variable__Alternatives"
    // InternalBPMN_translator.g:762:1: rule__Variable__Alternatives : ( ( 'TEMPERATURE' ) | ( 'DISTANCE' ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:766:1: ( ( 'TEMPERATURE' ) | ( 'DISTANCE' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            else if ( (LA12_0==17) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalBPMN_translator.g:767:2: ( 'TEMPERATURE' )
                    {
                    // InternalBPMN_translator.g:767:2: ( 'TEMPERATURE' )
                    // InternalBPMN_translator.g:768:3: 'TEMPERATURE'
                    {
                     before(grammarAccess.getVariableAccess().getTEMPERATUREKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getVariableAccess().getTEMPERATUREKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBPMN_translator.g:773:2: ( 'DISTANCE' )
                    {
                    // InternalBPMN_translator.g:773:2: ( 'DISTANCE' )
                    // InternalBPMN_translator.g:774:3: 'DISTANCE'
                    {
                     before(grammarAccess.getVariableAccess().getDISTANCEKeyword_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getVariableAccess().getDISTANCEKeyword_1()); 

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
    // $ANTLR end "rule__Variable__Alternatives"


    // $ANTLR start "rule__Xml__Group__0"
    // InternalBPMN_translator.g:783:1: rule__Xml__Group__0 : rule__Xml__Group__0__Impl rule__Xml__Group__1 ;
    public final void rule__Xml__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:787:1: ( rule__Xml__Group__0__Impl rule__Xml__Group__1 )
            // InternalBPMN_translator.g:788:2: rule__Xml__Group__0__Impl rule__Xml__Group__1
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
    // InternalBPMN_translator.g:795:1: rule__Xml__Group__0__Impl : ( () ) ;
    public final void rule__Xml__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:799:1: ( ( () ) )
            // InternalBPMN_translator.g:800:1: ( () )
            {
            // InternalBPMN_translator.g:800:1: ( () )
            // InternalBPMN_translator.g:801:2: ()
            {
             before(grammarAccess.getXmlAccess().getXmlAction_0()); 
            // InternalBPMN_translator.g:802:2: ()
            // InternalBPMN_translator.g:802:3: 
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
    // InternalBPMN_translator.g:810:1: rule__Xml__Group__1 : rule__Xml__Group__1__Impl rule__Xml__Group__2 ;
    public final void rule__Xml__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:814:1: ( rule__Xml__Group__1__Impl rule__Xml__Group__2 )
            // InternalBPMN_translator.g:815:2: rule__Xml__Group__1__Impl rule__Xml__Group__2
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
    // InternalBPMN_translator.g:822:1: rule__Xml__Group__1__Impl : ( ( ruleprolog )? ) ;
    public final void rule__Xml__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:826:1: ( ( ( ruleprolog )? ) )
            // InternalBPMN_translator.g:827:1: ( ( ruleprolog )? )
            {
            // InternalBPMN_translator.g:827:1: ( ( ruleprolog )? )
            // InternalBPMN_translator.g:828:2: ( ruleprolog )?
            {
             before(grammarAccess.getXmlAccess().getPrologParserRuleCall_1()); 
            // InternalBPMN_translator.g:829:2: ( ruleprolog )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBPMN_translator.g:829:3: ruleprolog
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
    // InternalBPMN_translator.g:837:1: rule__Xml__Group__2 : rule__Xml__Group__2__Impl ;
    public final void rule__Xml__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:841:1: ( rule__Xml__Group__2__Impl )
            // InternalBPMN_translator.g:842:2: rule__Xml__Group__2__Impl
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
    // InternalBPMN_translator.g:848:1: rule__Xml__Group__2__Impl : ( ( rule__Xml__ProvaAssignment_2 )* ) ;
    public final void rule__Xml__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:852:1: ( ( ( rule__Xml__ProvaAssignment_2 )* ) )
            // InternalBPMN_translator.g:853:1: ( ( rule__Xml__ProvaAssignment_2 )* )
            {
            // InternalBPMN_translator.g:853:1: ( ( rule__Xml__ProvaAssignment_2 )* )
            // InternalBPMN_translator.g:854:2: ( rule__Xml__ProvaAssignment_2 )*
            {
             before(grammarAccess.getXmlAccess().getProvaAssignment_2()); 
            // InternalBPMN_translator.g:855:2: ( rule__Xml__ProvaAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBPMN_translator.g:855:3: rule__Xml__ProvaAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Xml__ProvaAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalBPMN_translator.g:864:1: rule__Prolog__Group__0 : rule__Prolog__Group__0__Impl rule__Prolog__Group__1 ;
    public final void rule__Prolog__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:868:1: ( rule__Prolog__Group__0__Impl rule__Prolog__Group__1 )
            // InternalBPMN_translator.g:869:2: rule__Prolog__Group__0__Impl rule__Prolog__Group__1
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
    // InternalBPMN_translator.g:876:1: rule__Prolog__Group__0__Impl : ( '<?' ) ;
    public final void rule__Prolog__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:880:1: ( ( '<?' ) )
            // InternalBPMN_translator.g:881:1: ( '<?' )
            {
            // InternalBPMN_translator.g:881:1: ( '<?' )
            // InternalBPMN_translator.g:882:2: '<?'
            {
             before(grammarAccess.getPrologAccess().getLessThanSignQuestionMarkKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalBPMN_translator.g:891:1: rule__Prolog__Group__1 : rule__Prolog__Group__1__Impl rule__Prolog__Group__2 ;
    public final void rule__Prolog__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:895:1: ( rule__Prolog__Group__1__Impl rule__Prolog__Group__2 )
            // InternalBPMN_translator.g:896:2: rule__Prolog__Group__1__Impl rule__Prolog__Group__2
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
    // InternalBPMN_translator.g:903:1: rule__Prolog__Group__1__Impl : ( RULE_HEAD ) ;
    public final void rule__Prolog__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:907:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:908:1: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:908:1: ( RULE_HEAD )
            // InternalBPMN_translator.g:909:2: RULE_HEAD
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
    // InternalBPMN_translator.g:918:1: rule__Prolog__Group__2 : rule__Prolog__Group__2__Impl rule__Prolog__Group__3 ;
    public final void rule__Prolog__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:922:1: ( rule__Prolog__Group__2__Impl rule__Prolog__Group__3 )
            // InternalBPMN_translator.g:923:2: rule__Prolog__Group__2__Impl rule__Prolog__Group__3
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
    // InternalBPMN_translator.g:930:1: rule__Prolog__Group__2__Impl : ( 'version=' ) ;
    public final void rule__Prolog__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:934:1: ( ( 'version=' ) )
            // InternalBPMN_translator.g:935:1: ( 'version=' )
            {
            // InternalBPMN_translator.g:935:1: ( 'version=' )
            // InternalBPMN_translator.g:936:2: 'version='
            {
             before(grammarAccess.getPrologAccess().getVersionKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalBPMN_translator.g:945:1: rule__Prolog__Group__3 : rule__Prolog__Group__3__Impl rule__Prolog__Group__4 ;
    public final void rule__Prolog__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:949:1: ( rule__Prolog__Group__3__Impl rule__Prolog__Group__4 )
            // InternalBPMN_translator.g:950:2: rule__Prolog__Group__3__Impl rule__Prolog__Group__4
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
    // InternalBPMN_translator.g:957:1: rule__Prolog__Group__3__Impl : ( RULE_STRING ) ;
    public final void rule__Prolog__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:961:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:962:1: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:962:1: ( RULE_STRING )
            // InternalBPMN_translator.g:963:2: RULE_STRING
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
    // InternalBPMN_translator.g:972:1: rule__Prolog__Group__4 : rule__Prolog__Group__4__Impl rule__Prolog__Group__5 ;
    public final void rule__Prolog__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:976:1: ( rule__Prolog__Group__4__Impl rule__Prolog__Group__5 )
            // InternalBPMN_translator.g:977:2: rule__Prolog__Group__4__Impl rule__Prolog__Group__5
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
    // InternalBPMN_translator.g:984:1: rule__Prolog__Group__4__Impl : ( 'encoding=' ) ;
    public final void rule__Prolog__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:988:1: ( ( 'encoding=' ) )
            // InternalBPMN_translator.g:989:1: ( 'encoding=' )
            {
            // InternalBPMN_translator.g:989:1: ( 'encoding=' )
            // InternalBPMN_translator.g:990:2: 'encoding='
            {
             before(grammarAccess.getPrologAccess().getEncodingKeyword_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBPMN_translator.g:999:1: rule__Prolog__Group__5 : rule__Prolog__Group__5__Impl rule__Prolog__Group__6 ;
    public final void rule__Prolog__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1003:1: ( rule__Prolog__Group__5__Impl rule__Prolog__Group__6 )
            // InternalBPMN_translator.g:1004:2: rule__Prolog__Group__5__Impl rule__Prolog__Group__6
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
    // InternalBPMN_translator.g:1011:1: rule__Prolog__Group__5__Impl : ( RULE_STRING ) ;
    public final void rule__Prolog__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1015:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:1016:1: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:1016:1: ( RULE_STRING )
            // InternalBPMN_translator.g:1017:2: RULE_STRING
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
    // InternalBPMN_translator.g:1026:1: rule__Prolog__Group__6 : rule__Prolog__Group__6__Impl ;
    public final void rule__Prolog__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1030:1: ( rule__Prolog__Group__6__Impl )
            // InternalBPMN_translator.g:1031:2: rule__Prolog__Group__6__Impl
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
    // InternalBPMN_translator.g:1037:1: rule__Prolog__Group__6__Impl : ( '?>' ) ;
    public final void rule__Prolog__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1041:1: ( ( '?>' ) )
            // InternalBPMN_translator.g:1042:1: ( '?>' )
            {
            // InternalBPMN_translator.g:1042:1: ( '?>' )
            // InternalBPMN_translator.g:1043:2: '?>'
            {
             before(grammarAccess.getPrologAccess().getQuestionMarkGreaterThanSignKeyword_6()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBPMN_translator.g:1053:1: rule__Element__Group_0__0 : rule__Element__Group_0__0__Impl rule__Element__Group_0__1 ;
    public final void rule__Element__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1057:1: ( rule__Element__Group_0__0__Impl rule__Element__Group_0__1 )
            // InternalBPMN_translator.g:1058:2: rule__Element__Group_0__0__Impl rule__Element__Group_0__1
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
    // InternalBPMN_translator.g:1065:1: rule__Element__Group_0__0__Impl : ( ( rule__Element__OpenAssignment_0_0 ) ) ;
    public final void rule__Element__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1069:1: ( ( ( rule__Element__OpenAssignment_0_0 ) ) )
            // InternalBPMN_translator.g:1070:1: ( ( rule__Element__OpenAssignment_0_0 ) )
            {
            // InternalBPMN_translator.g:1070:1: ( ( rule__Element__OpenAssignment_0_0 ) )
            // InternalBPMN_translator.g:1071:2: ( rule__Element__OpenAssignment_0_0 )
            {
             before(grammarAccess.getElementAccess().getOpenAssignment_0_0()); 
            // InternalBPMN_translator.g:1072:2: ( rule__Element__OpenAssignment_0_0 )
            // InternalBPMN_translator.g:1072:3: rule__Element__OpenAssignment_0_0
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
    // InternalBPMN_translator.g:1080:1: rule__Element__Group_0__1 : rule__Element__Group_0__1__Impl rule__Element__Group_0__2 ;
    public final void rule__Element__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1084:1: ( rule__Element__Group_0__1__Impl rule__Element__Group_0__2 )
            // InternalBPMN_translator.g:1085:2: rule__Element__Group_0__1__Impl rule__Element__Group_0__2
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
    // InternalBPMN_translator.g:1092:1: rule__Element__Group_0__1__Impl : ( ( rule__Element__ContentsAssignment_0_1 ) ) ;
    public final void rule__Element__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1096:1: ( ( ( rule__Element__ContentsAssignment_0_1 ) ) )
            // InternalBPMN_translator.g:1097:1: ( ( rule__Element__ContentsAssignment_0_1 ) )
            {
            // InternalBPMN_translator.g:1097:1: ( ( rule__Element__ContentsAssignment_0_1 ) )
            // InternalBPMN_translator.g:1098:2: ( rule__Element__ContentsAssignment_0_1 )
            {
             before(grammarAccess.getElementAccess().getContentsAssignment_0_1()); 
            // InternalBPMN_translator.g:1099:2: ( rule__Element__ContentsAssignment_0_1 )
            // InternalBPMN_translator.g:1099:3: rule__Element__ContentsAssignment_0_1
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
    // InternalBPMN_translator.g:1107:1: rule__Element__Group_0__2 : rule__Element__Group_0__2__Impl ;
    public final void rule__Element__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1111:1: ( rule__Element__Group_0__2__Impl )
            // InternalBPMN_translator.g:1112:2: rule__Element__Group_0__2__Impl
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
    // InternalBPMN_translator.g:1118:1: rule__Element__Group_0__2__Impl : ( ( rule__Element__Close_tagAssignment_0_2 ) ) ;
    public final void rule__Element__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1122:1: ( ( ( rule__Element__Close_tagAssignment_0_2 ) ) )
            // InternalBPMN_translator.g:1123:1: ( ( rule__Element__Close_tagAssignment_0_2 ) )
            {
            // InternalBPMN_translator.g:1123:1: ( ( rule__Element__Close_tagAssignment_0_2 ) )
            // InternalBPMN_translator.g:1124:2: ( rule__Element__Close_tagAssignment_0_2 )
            {
             before(grammarAccess.getElementAccess().getClose_tagAssignment_0_2()); 
            // InternalBPMN_translator.g:1125:2: ( rule__Element__Close_tagAssignment_0_2 )
            // InternalBPMN_translator.g:1125:3: rule__Element__Close_tagAssignment_0_2
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
    // InternalBPMN_translator.g:1134:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1138:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // InternalBPMN_translator.g:1139:2: rule__Content__Group__0__Impl rule__Content__Group__1
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
    // InternalBPMN_translator.g:1146:1: rule__Content__Group__0__Impl : ( () ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1150:1: ( ( () ) )
            // InternalBPMN_translator.g:1151:1: ( () )
            {
            // InternalBPMN_translator.g:1151:1: ( () )
            // InternalBPMN_translator.g:1152:2: ()
            {
             before(grammarAccess.getContentAccess().getContentAction_0()); 
            // InternalBPMN_translator.g:1153:2: ()
            // InternalBPMN_translator.g:1153:3: 
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
    // InternalBPMN_translator.g:1161:1: rule__Content__Group__1 : rule__Content__Group__1__Impl ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1165:1: ( rule__Content__Group__1__Impl )
            // InternalBPMN_translator.g:1166:2: rule__Content__Group__1__Impl
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
    // InternalBPMN_translator.g:1172:1: rule__Content__Group__1__Impl : ( ( rule__Content__Alternatives_1 )* ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1176:1: ( ( ( rule__Content__Alternatives_1 )* ) )
            // InternalBPMN_translator.g:1177:1: ( ( rule__Content__Alternatives_1 )* )
            {
            // InternalBPMN_translator.g:1177:1: ( ( rule__Content__Alternatives_1 )* )
            // InternalBPMN_translator.g:1178:2: ( rule__Content__Alternatives_1 )*
            {
             before(grammarAccess.getContentAccess().getAlternatives_1()); 
            // InternalBPMN_translator.g:1179:2: ( rule__Content__Alternatives_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_STRING||(LA15_0>=RULE_KEYWORDS && LA15_0<=RULE_BODY)||(LA15_0>=14 && LA15_0<=15)||LA15_0==24) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBPMN_translator.g:1179:3: rule__Content__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Content__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalBPMN_translator.g:1188:1: rule__Content__Group_1_0__0 : rule__Content__Group_1_0__0__Impl rule__Content__Group_1_0__1 ;
    public final void rule__Content__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1192:1: ( rule__Content__Group_1_0__0__Impl rule__Content__Group_1_0__1 )
            // InternalBPMN_translator.g:1193:2: rule__Content__Group_1_0__0__Impl rule__Content__Group_1_0__1
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
    // InternalBPMN_translator.g:1200:1: rule__Content__Group_1_0__0__Impl : ( ( rule__Content__TypeAssignment_1_0_0 ) ) ;
    public final void rule__Content__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1204:1: ( ( ( rule__Content__TypeAssignment_1_0_0 ) ) )
            // InternalBPMN_translator.g:1205:1: ( ( rule__Content__TypeAssignment_1_0_0 ) )
            {
            // InternalBPMN_translator.g:1205:1: ( ( rule__Content__TypeAssignment_1_0_0 ) )
            // InternalBPMN_translator.g:1206:2: ( rule__Content__TypeAssignment_1_0_0 )
            {
             before(grammarAccess.getContentAccess().getTypeAssignment_1_0_0()); 
            // InternalBPMN_translator.g:1207:2: ( rule__Content__TypeAssignment_1_0_0 )
            // InternalBPMN_translator.g:1207:3: rule__Content__TypeAssignment_1_0_0
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
    // InternalBPMN_translator.g:1215:1: rule__Content__Group_1_0__1 : rule__Content__Group_1_0__1__Impl rule__Content__Group_1_0__2 ;
    public final void rule__Content__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1219:1: ( rule__Content__Group_1_0__1__Impl rule__Content__Group_1_0__2 )
            // InternalBPMN_translator.g:1220:2: rule__Content__Group_1_0__1__Impl rule__Content__Group_1_0__2
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
    // InternalBPMN_translator.g:1227:1: rule__Content__Group_1_0__1__Impl : ( '{' ) ;
    public final void rule__Content__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1231:1: ( ( '{' ) )
            // InternalBPMN_translator.g:1232:1: ( '{' )
            {
            // InternalBPMN_translator.g:1232:1: ( '{' )
            // InternalBPMN_translator.g:1233:2: '{'
            {
             before(grammarAccess.getContentAccess().getLeftCurlyBracketKeyword_1_0_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBPMN_translator.g:1242:1: rule__Content__Group_1_0__2 : rule__Content__Group_1_0__2__Impl rule__Content__Group_1_0__3 ;
    public final void rule__Content__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1246:1: ( rule__Content__Group_1_0__2__Impl rule__Content__Group_1_0__3 )
            // InternalBPMN_translator.g:1247:2: rule__Content__Group_1_0__2__Impl rule__Content__Group_1_0__3
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
    // InternalBPMN_translator.g:1254:1: rule__Content__Group_1_0__2__Impl : ( ( rule__Content__CodexAssignment_1_0_2 ) ) ;
    public final void rule__Content__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1258:1: ( ( ( rule__Content__CodexAssignment_1_0_2 ) ) )
            // InternalBPMN_translator.g:1259:1: ( ( rule__Content__CodexAssignment_1_0_2 ) )
            {
            // InternalBPMN_translator.g:1259:1: ( ( rule__Content__CodexAssignment_1_0_2 ) )
            // InternalBPMN_translator.g:1260:2: ( rule__Content__CodexAssignment_1_0_2 )
            {
             before(grammarAccess.getContentAccess().getCodexAssignment_1_0_2()); 
            // InternalBPMN_translator.g:1261:2: ( rule__Content__CodexAssignment_1_0_2 )
            // InternalBPMN_translator.g:1261:3: rule__Content__CodexAssignment_1_0_2
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
    // InternalBPMN_translator.g:1269:1: rule__Content__Group_1_0__3 : rule__Content__Group_1_0__3__Impl ;
    public final void rule__Content__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1273:1: ( rule__Content__Group_1_0__3__Impl )
            // InternalBPMN_translator.g:1274:2: rule__Content__Group_1_0__3__Impl
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
    // InternalBPMN_translator.g:1280:1: rule__Content__Group_1_0__3__Impl : ( '}' ) ;
    public final void rule__Content__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1284:1: ( ( '}' ) )
            // InternalBPMN_translator.g:1285:1: ( '}' )
            {
            // InternalBPMN_translator.g:1285:1: ( '}' )
            // InternalBPMN_translator.g:1286:2: '}'
            {
             before(grammarAccess.getContentAccess().getRightCurlyBracketKeyword_1_0_3()); 
            match(input,23,FOLLOW_2); 
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


    // $ANTLR start "rule__Open__Group__0"
    // InternalBPMN_translator.g:1296:1: rule__Open__Group__0 : rule__Open__Group__0__Impl rule__Open__Group__1 ;
    public final void rule__Open__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1300:1: ( rule__Open__Group__0__Impl rule__Open__Group__1 )
            // InternalBPMN_translator.g:1301:2: rule__Open__Group__0__Impl rule__Open__Group__1
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
    // InternalBPMN_translator.g:1308:1: rule__Open__Group__0__Impl : ( '<' ) ;
    public final void rule__Open__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1312:1: ( ( '<' ) )
            // InternalBPMN_translator.g:1313:1: ( '<' )
            {
            // InternalBPMN_translator.g:1313:1: ( '<' )
            // InternalBPMN_translator.g:1314:2: '<'
            {
             before(grammarAccess.getOpenAccess().getLessThanSignKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalBPMN_translator.g:1323:1: rule__Open__Group__1 : rule__Open__Group__1__Impl rule__Open__Group__2 ;
    public final void rule__Open__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1327:1: ( rule__Open__Group__1__Impl rule__Open__Group__2 )
            // InternalBPMN_translator.g:1328:2: rule__Open__Group__1__Impl rule__Open__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalBPMN_translator.g:1335:1: rule__Open__Group__1__Impl : ( ( rule__Open__HeadAssignment_1 ) ) ;
    public final void rule__Open__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1339:1: ( ( ( rule__Open__HeadAssignment_1 ) ) )
            // InternalBPMN_translator.g:1340:1: ( ( rule__Open__HeadAssignment_1 ) )
            {
            // InternalBPMN_translator.g:1340:1: ( ( rule__Open__HeadAssignment_1 ) )
            // InternalBPMN_translator.g:1341:2: ( rule__Open__HeadAssignment_1 )
            {
             before(grammarAccess.getOpenAccess().getHeadAssignment_1()); 
            // InternalBPMN_translator.g:1342:2: ( rule__Open__HeadAssignment_1 )
            // InternalBPMN_translator.g:1342:3: rule__Open__HeadAssignment_1
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
    // InternalBPMN_translator.g:1350:1: rule__Open__Group__2 : rule__Open__Group__2__Impl rule__Open__Group__3 ;
    public final void rule__Open__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1354:1: ( rule__Open__Group__2__Impl rule__Open__Group__3 )
            // InternalBPMN_translator.g:1355:2: rule__Open__Group__2__Impl rule__Open__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalBPMN_translator.g:1362:1: rule__Open__Group__2__Impl : ( ':' ) ;
    public final void rule__Open__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1366:1: ( ( ':' ) )
            // InternalBPMN_translator.g:1367:1: ( ':' )
            {
            // InternalBPMN_translator.g:1367:1: ( ':' )
            // InternalBPMN_translator.g:1368:2: ':'
            {
             before(grammarAccess.getOpenAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalBPMN_translator.g:1377:1: rule__Open__Group__3 : rule__Open__Group__3__Impl rule__Open__Group__4 ;
    public final void rule__Open__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1381:1: ( rule__Open__Group__3__Impl rule__Open__Group__4 )
            // InternalBPMN_translator.g:1382:2: rule__Open__Group__3__Impl rule__Open__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalBPMN_translator.g:1389:1: rule__Open__Group__3__Impl : ( ( rule__Open__KeywordsAssignment_3 ) ) ;
    public final void rule__Open__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1393:1: ( ( ( rule__Open__KeywordsAssignment_3 ) ) )
            // InternalBPMN_translator.g:1394:1: ( ( rule__Open__KeywordsAssignment_3 ) )
            {
            // InternalBPMN_translator.g:1394:1: ( ( rule__Open__KeywordsAssignment_3 ) )
            // InternalBPMN_translator.g:1395:2: ( rule__Open__KeywordsAssignment_3 )
            {
             before(grammarAccess.getOpenAccess().getKeywordsAssignment_3()); 
            // InternalBPMN_translator.g:1396:2: ( rule__Open__KeywordsAssignment_3 )
            // InternalBPMN_translator.g:1396:3: rule__Open__KeywordsAssignment_3
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
    // InternalBPMN_translator.g:1404:1: rule__Open__Group__4 : rule__Open__Group__4__Impl rule__Open__Group__5 ;
    public final void rule__Open__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1408:1: ( rule__Open__Group__4__Impl rule__Open__Group__5 )
            // InternalBPMN_translator.g:1409:2: rule__Open__Group__4__Impl rule__Open__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalBPMN_translator.g:1416:1: rule__Open__Group__4__Impl : ( ( rule__Open__Alternatives_4 )* ) ;
    public final void rule__Open__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1420:1: ( ( ( rule__Open__Alternatives_4 )* ) )
            // InternalBPMN_translator.g:1421:1: ( ( rule__Open__Alternatives_4 )* )
            {
            // InternalBPMN_translator.g:1421:1: ( ( rule__Open__Alternatives_4 )* )
            // InternalBPMN_translator.g:1422:2: ( rule__Open__Alternatives_4 )*
            {
             before(grammarAccess.getOpenAccess().getAlternatives_4()); 
            // InternalBPMN_translator.g:1423:2: ( rule__Open__Alternatives_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_HEAD && LA16_0<=RULE_KEYWORDS)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBPMN_translator.g:1423:3: rule__Open__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Open__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalBPMN_translator.g:1431:1: rule__Open__Group__5 : rule__Open__Group__5__Impl ;
    public final void rule__Open__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1435:1: ( rule__Open__Group__5__Impl )
            // InternalBPMN_translator.g:1436:2: rule__Open__Group__5__Impl
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
    // InternalBPMN_translator.g:1442:1: rule__Open__Group__5__Impl : ( '>' ) ;
    public final void rule__Open__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1446:1: ( ( '>' ) )
            // InternalBPMN_translator.g:1447:1: ( '>' )
            {
            // InternalBPMN_translator.g:1447:1: ( '>' )
            // InternalBPMN_translator.g:1448:2: '>'
            {
             before(grammarAccess.getOpenAccess().getGreaterThanSignKeyword_5()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBPMN_translator.g:1458:1: rule__Open__Group_4_0__0 : rule__Open__Group_4_0__0__Impl rule__Open__Group_4_0__1 ;
    public final void rule__Open__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1462:1: ( rule__Open__Group_4_0__0__Impl rule__Open__Group_4_0__1 )
            // InternalBPMN_translator.g:1463:2: rule__Open__Group_4_0__0__Impl rule__Open__Group_4_0__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalBPMN_translator.g:1470:1: rule__Open__Group_4_0__0__Impl : ( ( rule__Open__Head1Assignment_4_0_0 ) ) ;
    public final void rule__Open__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1474:1: ( ( ( rule__Open__Head1Assignment_4_0_0 ) ) )
            // InternalBPMN_translator.g:1475:1: ( ( rule__Open__Head1Assignment_4_0_0 ) )
            {
            // InternalBPMN_translator.g:1475:1: ( ( rule__Open__Head1Assignment_4_0_0 ) )
            // InternalBPMN_translator.g:1476:2: ( rule__Open__Head1Assignment_4_0_0 )
            {
             before(grammarAccess.getOpenAccess().getHead1Assignment_4_0_0()); 
            // InternalBPMN_translator.g:1477:2: ( rule__Open__Head1Assignment_4_0_0 )
            // InternalBPMN_translator.g:1477:3: rule__Open__Head1Assignment_4_0_0
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
    // InternalBPMN_translator.g:1485:1: rule__Open__Group_4_0__1 : rule__Open__Group_4_0__1__Impl ;
    public final void rule__Open__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1489:1: ( rule__Open__Group_4_0__1__Impl )
            // InternalBPMN_translator.g:1490:2: rule__Open__Group_4_0__1__Impl
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
    // InternalBPMN_translator.g:1496:1: rule__Open__Group_4_0__1__Impl : ( ':' ) ;
    public final void rule__Open__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1500:1: ( ( ':' ) )
            // InternalBPMN_translator.g:1501:1: ( ':' )
            {
            // InternalBPMN_translator.g:1501:1: ( ':' )
            // InternalBPMN_translator.g:1502:2: ':'
            {
             before(grammarAccess.getOpenAccess().getColonKeyword_4_0_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalBPMN_translator.g:1512:1: rule__Open__Group_4_1__0 : rule__Open__Group_4_1__0__Impl rule__Open__Group_4_1__1 ;
    public final void rule__Open__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1516:1: ( rule__Open__Group_4_1__0__Impl rule__Open__Group_4_1__1 )
            // InternalBPMN_translator.g:1517:2: rule__Open__Group_4_1__0__Impl rule__Open__Group_4_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBPMN_translator.g:1524:1: rule__Open__Group_4_1__0__Impl : ( ( rule__Open__Alternatives_4_1_0 ) ) ;
    public final void rule__Open__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1528:1: ( ( ( rule__Open__Alternatives_4_1_0 ) ) )
            // InternalBPMN_translator.g:1529:1: ( ( rule__Open__Alternatives_4_1_0 ) )
            {
            // InternalBPMN_translator.g:1529:1: ( ( rule__Open__Alternatives_4_1_0 ) )
            // InternalBPMN_translator.g:1530:2: ( rule__Open__Alternatives_4_1_0 )
            {
             before(grammarAccess.getOpenAccess().getAlternatives_4_1_0()); 
            // InternalBPMN_translator.g:1531:2: ( rule__Open__Alternatives_4_1_0 )
            // InternalBPMN_translator.g:1531:3: rule__Open__Alternatives_4_1_0
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
    // InternalBPMN_translator.g:1539:1: rule__Open__Group_4_1__1 : rule__Open__Group_4_1__1__Impl rule__Open__Group_4_1__2 ;
    public final void rule__Open__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1543:1: ( rule__Open__Group_4_1__1__Impl rule__Open__Group_4_1__2 )
            // InternalBPMN_translator.g:1544:2: rule__Open__Group_4_1__1__Impl rule__Open__Group_4_1__2
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
    // InternalBPMN_translator.g:1551:1: rule__Open__Group_4_1__1__Impl : ( '=' ) ;
    public final void rule__Open__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1555:1: ( ( '=' ) )
            // InternalBPMN_translator.g:1556:1: ( '=' )
            {
            // InternalBPMN_translator.g:1556:1: ( '=' )
            // InternalBPMN_translator.g:1557:2: '='
            {
             before(grammarAccess.getOpenAccess().getEqualsSignKeyword_4_1_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBPMN_translator.g:1566:1: rule__Open__Group_4_1__2 : rule__Open__Group_4_1__2__Impl ;
    public final void rule__Open__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1570:1: ( rule__Open__Group_4_1__2__Impl )
            // InternalBPMN_translator.g:1571:2: rule__Open__Group_4_1__2__Impl
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
    // InternalBPMN_translator.g:1577:1: rule__Open__Group_4_1__2__Impl : ( ( rule__Open__ValueAssignment_4_1_2 ) ) ;
    public final void rule__Open__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1581:1: ( ( ( rule__Open__ValueAssignment_4_1_2 ) ) )
            // InternalBPMN_translator.g:1582:1: ( ( rule__Open__ValueAssignment_4_1_2 ) )
            {
            // InternalBPMN_translator.g:1582:1: ( ( rule__Open__ValueAssignment_4_1_2 ) )
            // InternalBPMN_translator.g:1583:2: ( rule__Open__ValueAssignment_4_1_2 )
            {
             before(grammarAccess.getOpenAccess().getValueAssignment_4_1_2()); 
            // InternalBPMN_translator.g:1584:2: ( rule__Open__ValueAssignment_4_1_2 )
            // InternalBPMN_translator.g:1584:3: rule__Open__ValueAssignment_4_1_2
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
    // InternalBPMN_translator.g:1593:1: rule__Singleton__Group__0 : rule__Singleton__Group__0__Impl rule__Singleton__Group__1 ;
    public final void rule__Singleton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1597:1: ( rule__Singleton__Group__0__Impl rule__Singleton__Group__1 )
            // InternalBPMN_translator.g:1598:2: rule__Singleton__Group__0__Impl rule__Singleton__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalBPMN_translator.g:1605:1: rule__Singleton__Group__0__Impl : ( () ) ;
    public final void rule__Singleton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1609:1: ( ( () ) )
            // InternalBPMN_translator.g:1610:1: ( () )
            {
            // InternalBPMN_translator.g:1610:1: ( () )
            // InternalBPMN_translator.g:1611:2: ()
            {
             before(grammarAccess.getSingletonAccess().getSingletonAction_0()); 
            // InternalBPMN_translator.g:1612:2: ()
            // InternalBPMN_translator.g:1612:3: 
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
    // InternalBPMN_translator.g:1620:1: rule__Singleton__Group__1 : rule__Singleton__Group__1__Impl rule__Singleton__Group__2 ;
    public final void rule__Singleton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1624:1: ( rule__Singleton__Group__1__Impl rule__Singleton__Group__2 )
            // InternalBPMN_translator.g:1625:2: rule__Singleton__Group__1__Impl rule__Singleton__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalBPMN_translator.g:1632:1: rule__Singleton__Group__1__Impl : ( ( rule__Singleton__Group_1__0 ) ) ;
    public final void rule__Singleton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1636:1: ( ( ( rule__Singleton__Group_1__0 ) ) )
            // InternalBPMN_translator.g:1637:1: ( ( rule__Singleton__Group_1__0 ) )
            {
            // InternalBPMN_translator.g:1637:1: ( ( rule__Singleton__Group_1__0 ) )
            // InternalBPMN_translator.g:1638:2: ( rule__Singleton__Group_1__0 )
            {
             before(grammarAccess.getSingletonAccess().getGroup_1()); 
            // InternalBPMN_translator.g:1639:2: ( rule__Singleton__Group_1__0 )
            // InternalBPMN_translator.g:1639:3: rule__Singleton__Group_1__0
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
    // InternalBPMN_translator.g:1647:1: rule__Singleton__Group__2 : rule__Singleton__Group__2__Impl ;
    public final void rule__Singleton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1651:1: ( rule__Singleton__Group__2__Impl )
            // InternalBPMN_translator.g:1652:2: rule__Singleton__Group__2__Impl
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
    // InternalBPMN_translator.g:1658:1: rule__Singleton__Group__2__Impl : ( '/>' ) ;
    public final void rule__Singleton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1662:1: ( ( '/>' ) )
            // InternalBPMN_translator.g:1663:1: ( '/>' )
            {
            // InternalBPMN_translator.g:1663:1: ( '/>' )
            // InternalBPMN_translator.g:1664:2: '/>'
            {
             before(grammarAccess.getSingletonAccess().getSolidusGreaterThanSignKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBPMN_translator.g:1674:1: rule__Singleton__Group_1__0 : rule__Singleton__Group_1__0__Impl rule__Singleton__Group_1__1 ;
    public final void rule__Singleton__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1678:1: ( rule__Singleton__Group_1__0__Impl rule__Singleton__Group_1__1 )
            // InternalBPMN_translator.g:1679:2: rule__Singleton__Group_1__0__Impl rule__Singleton__Group_1__1
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
    // InternalBPMN_translator.g:1686:1: rule__Singleton__Group_1__0__Impl : ( '<' ) ;
    public final void rule__Singleton__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1690:1: ( ( '<' ) )
            // InternalBPMN_translator.g:1691:1: ( '<' )
            {
            // InternalBPMN_translator.g:1691:1: ( '<' )
            // InternalBPMN_translator.g:1692:2: '<'
            {
             before(grammarAccess.getSingletonAccess().getLessThanSignKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalBPMN_translator.g:1701:1: rule__Singleton__Group_1__1 : rule__Singleton__Group_1__1__Impl rule__Singleton__Group_1__2 ;
    public final void rule__Singleton__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1705:1: ( rule__Singleton__Group_1__1__Impl rule__Singleton__Group_1__2 )
            // InternalBPMN_translator.g:1706:2: rule__Singleton__Group_1__1__Impl rule__Singleton__Group_1__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalBPMN_translator.g:1713:1: rule__Singleton__Group_1__1__Impl : ( RULE_HEAD ) ;
    public final void rule__Singleton__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1717:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:1718:1: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:1718:1: ( RULE_HEAD )
            // InternalBPMN_translator.g:1719:2: RULE_HEAD
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
    // InternalBPMN_translator.g:1728:1: rule__Singleton__Group_1__2 : rule__Singleton__Group_1__2__Impl rule__Singleton__Group_1__3 ;
    public final void rule__Singleton__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1732:1: ( rule__Singleton__Group_1__2__Impl rule__Singleton__Group_1__3 )
            // InternalBPMN_translator.g:1733:2: rule__Singleton__Group_1__2__Impl rule__Singleton__Group_1__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalBPMN_translator.g:1740:1: rule__Singleton__Group_1__2__Impl : ( ':' ) ;
    public final void rule__Singleton__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1744:1: ( ( ':' ) )
            // InternalBPMN_translator.g:1745:1: ( ':' )
            {
            // InternalBPMN_translator.g:1745:1: ( ':' )
            // InternalBPMN_translator.g:1746:2: ':'
            {
             before(grammarAccess.getSingletonAccess().getColonKeyword_1_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalBPMN_translator.g:1755:1: rule__Singleton__Group_1__3 : rule__Singleton__Group_1__3__Impl rule__Singleton__Group_1__4 ;
    public final void rule__Singleton__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1759:1: ( rule__Singleton__Group_1__3__Impl rule__Singleton__Group_1__4 )
            // InternalBPMN_translator.g:1760:2: rule__Singleton__Group_1__3__Impl rule__Singleton__Group_1__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalBPMN_translator.g:1767:1: rule__Singleton__Group_1__3__Impl : ( ( rule__Singleton__KeywordsAssignment_1_3 ) ) ;
    public final void rule__Singleton__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1771:1: ( ( ( rule__Singleton__KeywordsAssignment_1_3 ) ) )
            // InternalBPMN_translator.g:1772:1: ( ( rule__Singleton__KeywordsAssignment_1_3 ) )
            {
            // InternalBPMN_translator.g:1772:1: ( ( rule__Singleton__KeywordsAssignment_1_3 ) )
            // InternalBPMN_translator.g:1773:2: ( rule__Singleton__KeywordsAssignment_1_3 )
            {
             before(grammarAccess.getSingletonAccess().getKeywordsAssignment_1_3()); 
            // InternalBPMN_translator.g:1774:2: ( rule__Singleton__KeywordsAssignment_1_3 )
            // InternalBPMN_translator.g:1774:3: rule__Singleton__KeywordsAssignment_1_3
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
    // InternalBPMN_translator.g:1782:1: rule__Singleton__Group_1__4 : rule__Singleton__Group_1__4__Impl ;
    public final void rule__Singleton__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1786:1: ( rule__Singleton__Group_1__4__Impl )
            // InternalBPMN_translator.g:1787:2: rule__Singleton__Group_1__4__Impl
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
    // InternalBPMN_translator.g:1793:1: rule__Singleton__Group_1__4__Impl : ( ( rule__Singleton__Alternatives_1_4 )* ) ;
    public final void rule__Singleton__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1797:1: ( ( ( rule__Singleton__Alternatives_1_4 )* ) )
            // InternalBPMN_translator.g:1798:1: ( ( rule__Singleton__Alternatives_1_4 )* )
            {
            // InternalBPMN_translator.g:1798:1: ( ( rule__Singleton__Alternatives_1_4 )* )
            // InternalBPMN_translator.g:1799:2: ( rule__Singleton__Alternatives_1_4 )*
            {
             before(grammarAccess.getSingletonAccess().getAlternatives_1_4()); 
            // InternalBPMN_translator.g:1800:2: ( rule__Singleton__Alternatives_1_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_HEAD && LA17_0<=RULE_KEYWORDS)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBPMN_translator.g:1800:3: rule__Singleton__Alternatives_1_4
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Singleton__Alternatives_1_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalBPMN_translator.g:1809:1: rule__Singleton__Group_1_4_0__0 : rule__Singleton__Group_1_4_0__0__Impl rule__Singleton__Group_1_4_0__1 ;
    public final void rule__Singleton__Group_1_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1813:1: ( rule__Singleton__Group_1_4_0__0__Impl rule__Singleton__Group_1_4_0__1 )
            // InternalBPMN_translator.g:1814:2: rule__Singleton__Group_1_4_0__0__Impl rule__Singleton__Group_1_4_0__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalBPMN_translator.g:1821:1: rule__Singleton__Group_1_4_0__0__Impl : ( RULE_HEAD ) ;
    public final void rule__Singleton__Group_1_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1825:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:1826:1: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:1826:1: ( RULE_HEAD )
            // InternalBPMN_translator.g:1827:2: RULE_HEAD
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
    // InternalBPMN_translator.g:1836:1: rule__Singleton__Group_1_4_0__1 : rule__Singleton__Group_1_4_0__1__Impl ;
    public final void rule__Singleton__Group_1_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1840:1: ( rule__Singleton__Group_1_4_0__1__Impl )
            // InternalBPMN_translator.g:1841:2: rule__Singleton__Group_1_4_0__1__Impl
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
    // InternalBPMN_translator.g:1847:1: rule__Singleton__Group_1_4_0__1__Impl : ( ':' ) ;
    public final void rule__Singleton__Group_1_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1851:1: ( ( ':' ) )
            // InternalBPMN_translator.g:1852:1: ( ':' )
            {
            // InternalBPMN_translator.g:1852:1: ( ':' )
            // InternalBPMN_translator.g:1853:2: ':'
            {
             before(grammarAccess.getSingletonAccess().getColonKeyword_1_4_0_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalBPMN_translator.g:1863:1: rule__Singleton__Group_1_4_1__0 : rule__Singleton__Group_1_4_1__0__Impl rule__Singleton__Group_1_4_1__1 ;
    public final void rule__Singleton__Group_1_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1867:1: ( rule__Singleton__Group_1_4_1__0__Impl rule__Singleton__Group_1_4_1__1 )
            // InternalBPMN_translator.g:1868:2: rule__Singleton__Group_1_4_1__0__Impl rule__Singleton__Group_1_4_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBPMN_translator.g:1875:1: rule__Singleton__Group_1_4_1__0__Impl : ( ( rule__Singleton__Keywords1Assignment_1_4_1_0 ) ) ;
    public final void rule__Singleton__Group_1_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1879:1: ( ( ( rule__Singleton__Keywords1Assignment_1_4_1_0 ) ) )
            // InternalBPMN_translator.g:1880:1: ( ( rule__Singleton__Keywords1Assignment_1_4_1_0 ) )
            {
            // InternalBPMN_translator.g:1880:1: ( ( rule__Singleton__Keywords1Assignment_1_4_1_0 ) )
            // InternalBPMN_translator.g:1881:2: ( rule__Singleton__Keywords1Assignment_1_4_1_0 )
            {
             before(grammarAccess.getSingletonAccess().getKeywords1Assignment_1_4_1_0()); 
            // InternalBPMN_translator.g:1882:2: ( rule__Singleton__Keywords1Assignment_1_4_1_0 )
            // InternalBPMN_translator.g:1882:3: rule__Singleton__Keywords1Assignment_1_4_1_0
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
    // InternalBPMN_translator.g:1890:1: rule__Singleton__Group_1_4_1__1 : rule__Singleton__Group_1_4_1__1__Impl rule__Singleton__Group_1_4_1__2 ;
    public final void rule__Singleton__Group_1_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1894:1: ( rule__Singleton__Group_1_4_1__1__Impl rule__Singleton__Group_1_4_1__2 )
            // InternalBPMN_translator.g:1895:2: rule__Singleton__Group_1_4_1__1__Impl rule__Singleton__Group_1_4_1__2
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
    // InternalBPMN_translator.g:1902:1: rule__Singleton__Group_1_4_1__1__Impl : ( '=' ) ;
    public final void rule__Singleton__Group_1_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1906:1: ( ( '=' ) )
            // InternalBPMN_translator.g:1907:1: ( '=' )
            {
            // InternalBPMN_translator.g:1907:1: ( '=' )
            // InternalBPMN_translator.g:1908:2: '='
            {
             before(grammarAccess.getSingletonAccess().getEqualsSignKeyword_1_4_1_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBPMN_translator.g:1917:1: rule__Singleton__Group_1_4_1__2 : rule__Singleton__Group_1_4_1__2__Impl ;
    public final void rule__Singleton__Group_1_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1921:1: ( rule__Singleton__Group_1_4_1__2__Impl )
            // InternalBPMN_translator.g:1922:2: rule__Singleton__Group_1_4_1__2__Impl
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
    // InternalBPMN_translator.g:1928:1: rule__Singleton__Group_1_4_1__2__Impl : ( ( rule__Singleton__ValueAssignment_1_4_1_2 ) ) ;
    public final void rule__Singleton__Group_1_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1932:1: ( ( ( rule__Singleton__ValueAssignment_1_4_1_2 ) ) )
            // InternalBPMN_translator.g:1933:1: ( ( rule__Singleton__ValueAssignment_1_4_1_2 ) )
            {
            // InternalBPMN_translator.g:1933:1: ( ( rule__Singleton__ValueAssignment_1_4_1_2 ) )
            // InternalBPMN_translator.g:1934:2: ( rule__Singleton__ValueAssignment_1_4_1_2 )
            {
             before(grammarAccess.getSingletonAccess().getValueAssignment_1_4_1_2()); 
            // InternalBPMN_translator.g:1935:2: ( rule__Singleton__ValueAssignment_1_4_1_2 )
            // InternalBPMN_translator.g:1935:3: rule__Singleton__ValueAssignment_1_4_1_2
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
    // InternalBPMN_translator.g:1944:1: rule__Close__Group__0 : rule__Close__Group__0__Impl rule__Close__Group__1 ;
    public final void rule__Close__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1948:1: ( rule__Close__Group__0__Impl rule__Close__Group__1 )
            // InternalBPMN_translator.g:1949:2: rule__Close__Group__0__Impl rule__Close__Group__1
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
    // InternalBPMN_translator.g:1956:1: rule__Close__Group__0__Impl : ( () ) ;
    public final void rule__Close__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1960:1: ( ( () ) )
            // InternalBPMN_translator.g:1961:1: ( () )
            {
            // InternalBPMN_translator.g:1961:1: ( () )
            // InternalBPMN_translator.g:1962:2: ()
            {
             before(grammarAccess.getCloseAccess().getCloseAction_0()); 
            // InternalBPMN_translator.g:1963:2: ()
            // InternalBPMN_translator.g:1963:3: 
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
    // InternalBPMN_translator.g:1971:1: rule__Close__Group__1 : rule__Close__Group__1__Impl ;
    public final void rule__Close__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1975:1: ( rule__Close__Group__1__Impl )
            // InternalBPMN_translator.g:1976:2: rule__Close__Group__1__Impl
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
    // InternalBPMN_translator.g:1982:1: rule__Close__Group__1__Impl : ( ( rule__Close__Group_1__0 ) ) ;
    public final void rule__Close__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:1986:1: ( ( ( rule__Close__Group_1__0 ) ) )
            // InternalBPMN_translator.g:1987:1: ( ( rule__Close__Group_1__0 ) )
            {
            // InternalBPMN_translator.g:1987:1: ( ( rule__Close__Group_1__0 ) )
            // InternalBPMN_translator.g:1988:2: ( rule__Close__Group_1__0 )
            {
             before(grammarAccess.getCloseAccess().getGroup_1()); 
            // InternalBPMN_translator.g:1989:2: ( rule__Close__Group_1__0 )
            // InternalBPMN_translator.g:1989:3: rule__Close__Group_1__0
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
    // InternalBPMN_translator.g:1998:1: rule__Close__Group_1__0 : rule__Close__Group_1__0__Impl rule__Close__Group_1__1 ;
    public final void rule__Close__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2002:1: ( rule__Close__Group_1__0__Impl rule__Close__Group_1__1 )
            // InternalBPMN_translator.g:2003:2: rule__Close__Group_1__0__Impl rule__Close__Group_1__1
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
    // InternalBPMN_translator.g:2010:1: rule__Close__Group_1__0__Impl : ( '</' ) ;
    public final void rule__Close__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2014:1: ( ( '</' ) )
            // InternalBPMN_translator.g:2015:1: ( '</' )
            {
            // InternalBPMN_translator.g:2015:1: ( '</' )
            // InternalBPMN_translator.g:2016:2: '</'
            {
             before(grammarAccess.getCloseAccess().getLessThanSignSolidusKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2025:1: rule__Close__Group_1__1 : rule__Close__Group_1__1__Impl rule__Close__Group_1__2 ;
    public final void rule__Close__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2029:1: ( rule__Close__Group_1__1__Impl rule__Close__Group_1__2 )
            // InternalBPMN_translator.g:2030:2: rule__Close__Group_1__1__Impl rule__Close__Group_1__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalBPMN_translator.g:2037:1: rule__Close__Group_1__1__Impl : ( RULE_HEAD ) ;
    public final void rule__Close__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2041:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:2042:1: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:2042:1: ( RULE_HEAD )
            // InternalBPMN_translator.g:2043:2: RULE_HEAD
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
    // InternalBPMN_translator.g:2052:1: rule__Close__Group_1__2 : rule__Close__Group_1__2__Impl rule__Close__Group_1__3 ;
    public final void rule__Close__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2056:1: ( rule__Close__Group_1__2__Impl rule__Close__Group_1__3 )
            // InternalBPMN_translator.g:2057:2: rule__Close__Group_1__2__Impl rule__Close__Group_1__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalBPMN_translator.g:2064:1: rule__Close__Group_1__2__Impl : ( ':' ) ;
    public final void rule__Close__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2068:1: ( ( ':' ) )
            // InternalBPMN_translator.g:2069:1: ( ':' )
            {
            // InternalBPMN_translator.g:2069:1: ( ':' )
            // InternalBPMN_translator.g:2070:2: ':'
            {
             before(grammarAccess.getCloseAccess().getColonKeyword_1_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2079:1: rule__Close__Group_1__3 : rule__Close__Group_1__3__Impl rule__Close__Group_1__4 ;
    public final void rule__Close__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2083:1: ( rule__Close__Group_1__3__Impl rule__Close__Group_1__4 )
            // InternalBPMN_translator.g:2084:2: rule__Close__Group_1__3__Impl rule__Close__Group_1__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalBPMN_translator.g:2091:1: rule__Close__Group_1__3__Impl : ( RULE_KEYWORDS ) ;
    public final void rule__Close__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2095:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:2096:1: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:2096:1: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:2097:2: RULE_KEYWORDS
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
    // InternalBPMN_translator.g:2106:1: rule__Close__Group_1__4 : rule__Close__Group_1__4__Impl ;
    public final void rule__Close__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2110:1: ( rule__Close__Group_1__4__Impl )
            // InternalBPMN_translator.g:2111:2: rule__Close__Group_1__4__Impl
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
    // InternalBPMN_translator.g:2117:1: rule__Close__Group_1__4__Impl : ( '>' ) ;
    public final void rule__Close__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2121:1: ( ( '>' ) )
            // InternalBPMN_translator.g:2122:1: ( '>' )
            {
            // InternalBPMN_translator.g:2122:1: ( '>' )
            // InternalBPMN_translator.g:2123:2: '>'
            {
             before(grammarAccess.getCloseAccess().getGreaterThanSignKeyword_1_4()); 
            match(input,26,FOLLOW_2); 
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


    // $ANTLR start "rule__Codex__Group__0"
    // InternalBPMN_translator.g:2133:1: rule__Codex__Group__0 : rule__Codex__Group__0__Impl rule__Codex__Group__1 ;
    public final void rule__Codex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2137:1: ( rule__Codex__Group__0__Impl rule__Codex__Group__1 )
            // InternalBPMN_translator.g:2138:2: rule__Codex__Group__0__Impl rule__Codex__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalBPMN_translator.g:2145:1: rule__Codex__Group__0__Impl : ( ( rule__Codex__Device_codeAssignment_0 ) ) ;
    public final void rule__Codex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2149:1: ( ( ( rule__Codex__Device_codeAssignment_0 ) ) )
            // InternalBPMN_translator.g:2150:1: ( ( rule__Codex__Device_codeAssignment_0 ) )
            {
            // InternalBPMN_translator.g:2150:1: ( ( rule__Codex__Device_codeAssignment_0 ) )
            // InternalBPMN_translator.g:2151:2: ( rule__Codex__Device_codeAssignment_0 )
            {
             before(grammarAccess.getCodexAccess().getDevice_codeAssignment_0()); 
            // InternalBPMN_translator.g:2152:2: ( rule__Codex__Device_codeAssignment_0 )
            // InternalBPMN_translator.g:2152:3: rule__Codex__Device_codeAssignment_0
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
    // InternalBPMN_translator.g:2160:1: rule__Codex__Group__1 : rule__Codex__Group__1__Impl rule__Codex__Group__2 ;
    public final void rule__Codex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2164:1: ( rule__Codex__Group__1__Impl rule__Codex__Group__2 )
            // InternalBPMN_translator.g:2165:2: rule__Codex__Group__1__Impl rule__Codex__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalBPMN_translator.g:2172:1: rule__Codex__Group__1__Impl : ( ( rule__Codex__ProtocolAssignment_1 )* ) ;
    public final void rule__Codex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2176:1: ( ( ( rule__Codex__ProtocolAssignment_1 )* ) )
            // InternalBPMN_translator.g:2177:1: ( ( rule__Codex__ProtocolAssignment_1 )* )
            {
            // InternalBPMN_translator.g:2177:1: ( ( rule__Codex__ProtocolAssignment_1 )* )
            // InternalBPMN_translator.g:2178:2: ( rule__Codex__ProtocolAssignment_1 )*
            {
             before(grammarAccess.getCodexAccess().getProtocolAssignment_1()); 
            // InternalBPMN_translator.g:2179:2: ( rule__Codex__ProtocolAssignment_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==46) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBPMN_translator.g:2179:3: rule__Codex__ProtocolAssignment_1
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Codex__ProtocolAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalBPMN_translator.g:2187:1: rule__Codex__Group__2 : rule__Codex__Group__2__Impl ;
    public final void rule__Codex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2191:1: ( rule__Codex__Group__2__Impl )
            // InternalBPMN_translator.g:2192:2: rule__Codex__Group__2__Impl
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
    // InternalBPMN_translator.g:2198:1: rule__Codex__Group__2__Impl : ( ( rule__Codex__Sensor_codeAssignment_2 )* ) ;
    public final void rule__Codex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2202:1: ( ( ( rule__Codex__Sensor_codeAssignment_2 )* ) )
            // InternalBPMN_translator.g:2203:1: ( ( rule__Codex__Sensor_codeAssignment_2 )* )
            {
            // InternalBPMN_translator.g:2203:1: ( ( rule__Codex__Sensor_codeAssignment_2 )* )
            // InternalBPMN_translator.g:2204:2: ( rule__Codex__Sensor_codeAssignment_2 )*
            {
             before(grammarAccess.getCodexAccess().getSensor_codeAssignment_2()); 
            // InternalBPMN_translator.g:2205:2: ( rule__Codex__Sensor_codeAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=16 && LA19_0<=17)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBPMN_translator.g:2205:3: rule__Codex__Sensor_codeAssignment_2
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Codex__Sensor_codeAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalBPMN_translator.g:2214:1: rule__Device__Group__0 : rule__Device__Group__0__Impl rule__Device__Group__1 ;
    public final void rule__Device__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2218:1: ( rule__Device__Group__0__Impl rule__Device__Group__1 )
            // InternalBPMN_translator.g:2219:2: rule__Device__Group__0__Impl rule__Device__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalBPMN_translator.g:2226:1: rule__Device__Group__0__Impl : ( 'DEVICE' ) ;
    public final void rule__Device__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2230:1: ( ( 'DEVICE' ) )
            // InternalBPMN_translator.g:2231:1: ( 'DEVICE' )
            {
            // InternalBPMN_translator.g:2231:1: ( 'DEVICE' )
            // InternalBPMN_translator.g:2232:2: 'DEVICE'
            {
             before(grammarAccess.getDeviceAccess().getDEVICEKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2241:1: rule__Device__Group__1 : rule__Device__Group__1__Impl rule__Device__Group__2 ;
    public final void rule__Device__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2245:1: ( rule__Device__Group__1__Impl rule__Device__Group__2 )
            // InternalBPMN_translator.g:2246:2: rule__Device__Group__1__Impl rule__Device__Group__2
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
    // InternalBPMN_translator.g:2253:1: rule__Device__Group__1__Impl : ( ':' ) ;
    public final void rule__Device__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2257:1: ( ( ':' ) )
            // InternalBPMN_translator.g:2258:1: ( ':' )
            {
            // InternalBPMN_translator.g:2258:1: ( ':' )
            // InternalBPMN_translator.g:2259:2: ':'
            {
             before(grammarAccess.getDeviceAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2268:1: rule__Device__Group__2 : rule__Device__Group__2__Impl rule__Device__Group__3 ;
    public final void rule__Device__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2272:1: ( rule__Device__Group__2__Impl rule__Device__Group__3 )
            // InternalBPMN_translator.g:2273:2: rule__Device__Group__2__Impl rule__Device__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalBPMN_translator.g:2280:1: rule__Device__Group__2__Impl : ( ( rule__Device__DeviceAssignment_2 ) ) ;
    public final void rule__Device__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2284:1: ( ( ( rule__Device__DeviceAssignment_2 ) ) )
            // InternalBPMN_translator.g:2285:1: ( ( rule__Device__DeviceAssignment_2 ) )
            {
            // InternalBPMN_translator.g:2285:1: ( ( rule__Device__DeviceAssignment_2 ) )
            // InternalBPMN_translator.g:2286:2: ( rule__Device__DeviceAssignment_2 )
            {
             before(grammarAccess.getDeviceAccess().getDeviceAssignment_2()); 
            // InternalBPMN_translator.g:2287:2: ( rule__Device__DeviceAssignment_2 )
            // InternalBPMN_translator.g:2287:3: rule__Device__DeviceAssignment_2
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
    // InternalBPMN_translator.g:2295:1: rule__Device__Group__3 : rule__Device__Group__3__Impl rule__Device__Group__4 ;
    public final void rule__Device__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2299:1: ( rule__Device__Group__3__Impl rule__Device__Group__4 )
            // InternalBPMN_translator.g:2300:2: rule__Device__Group__3__Impl rule__Device__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalBPMN_translator.g:2307:1: rule__Device__Group__3__Impl : ( 'NAMEID' ) ;
    public final void rule__Device__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2311:1: ( ( 'NAMEID' ) )
            // InternalBPMN_translator.g:2312:1: ( 'NAMEID' )
            {
            // InternalBPMN_translator.g:2312:1: ( 'NAMEID' )
            // InternalBPMN_translator.g:2313:2: 'NAMEID'
            {
             before(grammarAccess.getDeviceAccess().getNAMEIDKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2322:1: rule__Device__Group__4 : rule__Device__Group__4__Impl rule__Device__Group__5 ;
    public final void rule__Device__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2326:1: ( rule__Device__Group__4__Impl rule__Device__Group__5 )
            // InternalBPMN_translator.g:2327:2: rule__Device__Group__4__Impl rule__Device__Group__5
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
    // InternalBPMN_translator.g:2334:1: rule__Device__Group__4__Impl : ( ':' ) ;
    public final void rule__Device__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2338:1: ( ( ':' ) )
            // InternalBPMN_translator.g:2339:1: ( ':' )
            {
            // InternalBPMN_translator.g:2339:1: ( ':' )
            // InternalBPMN_translator.g:2340:2: ':'
            {
             before(grammarAccess.getDeviceAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2349:1: rule__Device__Group__5 : rule__Device__Group__5__Impl ;
    public final void rule__Device__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2353:1: ( rule__Device__Group__5__Impl )
            // InternalBPMN_translator.g:2354:2: rule__Device__Group__5__Impl
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
    // InternalBPMN_translator.g:2360:1: rule__Device__Group__5__Impl : ( ( rule__Device__IdAssignment_5 ) ) ;
    public final void rule__Device__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2364:1: ( ( ( rule__Device__IdAssignment_5 ) ) )
            // InternalBPMN_translator.g:2365:1: ( ( rule__Device__IdAssignment_5 ) )
            {
            // InternalBPMN_translator.g:2365:1: ( ( rule__Device__IdAssignment_5 ) )
            // InternalBPMN_translator.g:2366:2: ( rule__Device__IdAssignment_5 )
            {
             before(grammarAccess.getDeviceAccess().getIdAssignment_5()); 
            // InternalBPMN_translator.g:2367:2: ( rule__Device__IdAssignment_5 )
            // InternalBPMN_translator.g:2367:3: rule__Device__IdAssignment_5
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


    // $ANTLR start "rule__Protocol__Group__0"
    // InternalBPMN_translator.g:2376:1: rule__Protocol__Group__0 : rule__Protocol__Group__0__Impl rule__Protocol__Group__1 ;
    public final void rule__Protocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2380:1: ( rule__Protocol__Group__0__Impl rule__Protocol__Group__1 )
            // InternalBPMN_translator.g:2381:2: rule__Protocol__Group__0__Impl rule__Protocol__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Protocol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__0"


    // $ANTLR start "rule__Protocol__Group__0__Impl"
    // InternalBPMN_translator.g:2388:1: rule__Protocol__Group__0__Impl : ( ( rule__Protocol__PnameAssignment_0 ) ) ;
    public final void rule__Protocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2392:1: ( ( ( rule__Protocol__PnameAssignment_0 ) ) )
            // InternalBPMN_translator.g:2393:1: ( ( rule__Protocol__PnameAssignment_0 ) )
            {
            // InternalBPMN_translator.g:2393:1: ( ( rule__Protocol__PnameAssignment_0 ) )
            // InternalBPMN_translator.g:2394:2: ( rule__Protocol__PnameAssignment_0 )
            {
             before(grammarAccess.getProtocolAccess().getPnameAssignment_0()); 
            // InternalBPMN_translator.g:2395:2: ( rule__Protocol__PnameAssignment_0 )
            // InternalBPMN_translator.g:2395:3: rule__Protocol__PnameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__PnameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getPnameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__0__Impl"


    // $ANTLR start "rule__Protocol__Group__1"
    // InternalBPMN_translator.g:2403:1: rule__Protocol__Group__1 : rule__Protocol__Group__1__Impl rule__Protocol__Group__2 ;
    public final void rule__Protocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2407:1: ( rule__Protocol__Group__1__Impl rule__Protocol__Group__2 )
            // InternalBPMN_translator.g:2408:2: rule__Protocol__Group__1__Impl rule__Protocol__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Protocol__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__1"


    // $ANTLR start "rule__Protocol__Group__1__Impl"
    // InternalBPMN_translator.g:2415:1: rule__Protocol__Group__1__Impl : ( '{' ) ;
    public final void rule__Protocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2419:1: ( ( '{' ) )
            // InternalBPMN_translator.g:2420:1: ( '{' )
            {
            // InternalBPMN_translator.g:2420:1: ( '{' )
            // InternalBPMN_translator.g:2421:2: '{'
            {
             before(grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__1__Impl"


    // $ANTLR start "rule__Protocol__Group__2"
    // InternalBPMN_translator.g:2430:1: rule__Protocol__Group__2 : rule__Protocol__Group__2__Impl rule__Protocol__Group__3 ;
    public final void rule__Protocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2434:1: ( rule__Protocol__Group__2__Impl rule__Protocol__Group__3 )
            // InternalBPMN_translator.g:2435:2: rule__Protocol__Group__2__Impl rule__Protocol__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Protocol__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__2"


    // $ANTLR start "rule__Protocol__Group__2__Impl"
    // InternalBPMN_translator.g:2442:1: rule__Protocol__Group__2__Impl : ( ( rule__Protocol__Group_2__0 ) ) ;
    public final void rule__Protocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2446:1: ( ( ( rule__Protocol__Group_2__0 ) ) )
            // InternalBPMN_translator.g:2447:1: ( ( rule__Protocol__Group_2__0 ) )
            {
            // InternalBPMN_translator.g:2447:1: ( ( rule__Protocol__Group_2__0 ) )
            // InternalBPMN_translator.g:2448:2: ( rule__Protocol__Group_2__0 )
            {
             before(grammarAccess.getProtocolAccess().getGroup_2()); 
            // InternalBPMN_translator.g:2449:2: ( rule__Protocol__Group_2__0 )
            // InternalBPMN_translator.g:2449:3: rule__Protocol__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__2__Impl"


    // $ANTLR start "rule__Protocol__Group__3"
    // InternalBPMN_translator.g:2457:1: rule__Protocol__Group__3 : rule__Protocol__Group__3__Impl ;
    public final void rule__Protocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2461:1: ( rule__Protocol__Group__3__Impl )
            // InternalBPMN_translator.g:2462:2: rule__Protocol__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__3"


    // $ANTLR start "rule__Protocol__Group__3__Impl"
    // InternalBPMN_translator.g:2468:1: rule__Protocol__Group__3__Impl : ( '}' ) ;
    public final void rule__Protocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2472:1: ( ( '}' ) )
            // InternalBPMN_translator.g:2473:1: ( '}' )
            {
            // InternalBPMN_translator.g:2473:1: ( '}' )
            // InternalBPMN_translator.g:2474:2: '}'
            {
             before(grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__3__Impl"


    // $ANTLR start "rule__Protocol__Group_2__0"
    // InternalBPMN_translator.g:2484:1: rule__Protocol__Group_2__0 : rule__Protocol__Group_2__0__Impl rule__Protocol__Group_2__1 ;
    public final void rule__Protocol__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2488:1: ( rule__Protocol__Group_2__0__Impl rule__Protocol__Group_2__1 )
            // InternalBPMN_translator.g:2489:2: rule__Protocol__Group_2__0__Impl rule__Protocol__Group_2__1
            {
            pushFollow(FOLLOW_30);
            rule__Protocol__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_2__0"


    // $ANTLR start "rule__Protocol__Group_2__0__Impl"
    // InternalBPMN_translator.g:2496:1: rule__Protocol__Group_2__0__Impl : ( ( rule__Protocol__Mqtt_dataAssignment_2_0 ) ) ;
    public final void rule__Protocol__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2500:1: ( ( ( rule__Protocol__Mqtt_dataAssignment_2_0 ) ) )
            // InternalBPMN_translator.g:2501:1: ( ( rule__Protocol__Mqtt_dataAssignment_2_0 ) )
            {
            // InternalBPMN_translator.g:2501:1: ( ( rule__Protocol__Mqtt_dataAssignment_2_0 ) )
            // InternalBPMN_translator.g:2502:2: ( rule__Protocol__Mqtt_dataAssignment_2_0 )
            {
             before(grammarAccess.getProtocolAccess().getMqtt_dataAssignment_2_0()); 
            // InternalBPMN_translator.g:2503:2: ( rule__Protocol__Mqtt_dataAssignment_2_0 )
            // InternalBPMN_translator.g:2503:3: rule__Protocol__Mqtt_dataAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Mqtt_dataAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getMqtt_dataAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_2__0__Impl"


    // $ANTLR start "rule__Protocol__Group_2__1"
    // InternalBPMN_translator.g:2511:1: rule__Protocol__Group_2__1 : rule__Protocol__Group_2__1__Impl ;
    public final void rule__Protocol__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2515:1: ( rule__Protocol__Group_2__1__Impl )
            // InternalBPMN_translator.g:2516:2: rule__Protocol__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_2__1"


    // $ANTLR start "rule__Protocol__Group_2__1__Impl"
    // InternalBPMN_translator.g:2522:1: rule__Protocol__Group_2__1__Impl : ( ( rule__Protocol__Mqtt_deviceAssignment_2_1 ) ) ;
    public final void rule__Protocol__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2526:1: ( ( ( rule__Protocol__Mqtt_deviceAssignment_2_1 ) ) )
            // InternalBPMN_translator.g:2527:1: ( ( rule__Protocol__Mqtt_deviceAssignment_2_1 ) )
            {
            // InternalBPMN_translator.g:2527:1: ( ( rule__Protocol__Mqtt_deviceAssignment_2_1 ) )
            // InternalBPMN_translator.g:2528:2: ( rule__Protocol__Mqtt_deviceAssignment_2_1 )
            {
             before(grammarAccess.getProtocolAccess().getMqtt_deviceAssignment_2_1()); 
            // InternalBPMN_translator.g:2529:2: ( rule__Protocol__Mqtt_deviceAssignment_2_1 )
            // InternalBPMN_translator.g:2529:3: rule__Protocol__Mqtt_deviceAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Mqtt_deviceAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getMqtt_deviceAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group_2__1__Impl"


    // $ANTLR start "rule__Mqtt_data__Group__0"
    // InternalBPMN_translator.g:2538:1: rule__Mqtt_data__Group__0 : rule__Mqtt_data__Group__0__Impl rule__Mqtt_data__Group__1 ;
    public final void rule__Mqtt_data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2542:1: ( rule__Mqtt_data__Group__0__Impl rule__Mqtt_data__Group__1 )
            // InternalBPMN_translator.g:2543:2: rule__Mqtt_data__Group__0__Impl rule__Mqtt_data__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalBPMN_translator.g:2550:1: rule__Mqtt_data__Group__0__Impl : ( () ) ;
    public final void rule__Mqtt_data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2554:1: ( ( () ) )
            // InternalBPMN_translator.g:2555:1: ( () )
            {
            // InternalBPMN_translator.g:2555:1: ( () )
            // InternalBPMN_translator.g:2556:2: ()
            {
             before(grammarAccess.getMqtt_dataAccess().getMqtt_dataAction_0()); 
            // InternalBPMN_translator.g:2557:2: ()
            // InternalBPMN_translator.g:2557:3: 
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
    // InternalBPMN_translator.g:2565:1: rule__Mqtt_data__Group__1 : rule__Mqtt_data__Group__1__Impl ;
    public final void rule__Mqtt_data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2569:1: ( rule__Mqtt_data__Group__1__Impl )
            // InternalBPMN_translator.g:2570:2: rule__Mqtt_data__Group__1__Impl
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
    // InternalBPMN_translator.g:2576:1: rule__Mqtt_data__Group__1__Impl : ( ( rule__Mqtt_data__Alternatives_1 )* ) ;
    public final void rule__Mqtt_data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2580:1: ( ( ( rule__Mqtt_data__Alternatives_1 )* ) )
            // InternalBPMN_translator.g:2581:1: ( ( rule__Mqtt_data__Alternatives_1 )* )
            {
            // InternalBPMN_translator.g:2581:1: ( ( rule__Mqtt_data__Alternatives_1 )* )
            // InternalBPMN_translator.g:2582:2: ( rule__Mqtt_data__Alternatives_1 )*
            {
             before(grammarAccess.getMqtt_dataAccess().getAlternatives_1()); 
            // InternalBPMN_translator.g:2583:2: ( rule__Mqtt_data__Alternatives_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=32 && LA20_0<=37)||LA20_0==39) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBPMN_translator.g:2583:3: rule__Mqtt_data__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Mqtt_data__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalBPMN_translator.g:2592:1: rule__Mqtt_data__Group_1_0__0 : rule__Mqtt_data__Group_1_0__0__Impl rule__Mqtt_data__Group_1_0__1 ;
    public final void rule__Mqtt_data__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2596:1: ( rule__Mqtt_data__Group_1_0__0__Impl rule__Mqtt_data__Group_1_0__1 )
            // InternalBPMN_translator.g:2597:2: rule__Mqtt_data__Group_1_0__0__Impl rule__Mqtt_data__Group_1_0__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBPMN_translator.g:2604:1: rule__Mqtt_data__Group_1_0__0__Impl : ( 'NAME' ) ;
    public final void rule__Mqtt_data__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2608:1: ( ( 'NAME' ) )
            // InternalBPMN_translator.g:2609:1: ( 'NAME' )
            {
            // InternalBPMN_translator.g:2609:1: ( 'NAME' )
            // InternalBPMN_translator.g:2610:2: 'NAME'
            {
             before(grammarAccess.getMqtt_dataAccess().getNAMEKeyword_1_0_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2619:1: rule__Mqtt_data__Group_1_0__1 : rule__Mqtt_data__Group_1_0__1__Impl rule__Mqtt_data__Group_1_0__2 ;
    public final void rule__Mqtt_data__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2623:1: ( rule__Mqtt_data__Group_1_0__1__Impl rule__Mqtt_data__Group_1_0__2 )
            // InternalBPMN_translator.g:2624:2: rule__Mqtt_data__Group_1_0__1__Impl rule__Mqtt_data__Group_1_0__2
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
    // InternalBPMN_translator.g:2631:1: rule__Mqtt_data__Group_1_0__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2635:1: ( ( '=' ) )
            // InternalBPMN_translator.g:2636:1: ( '=' )
            {
            // InternalBPMN_translator.g:2636:1: ( '=' )
            // InternalBPMN_translator.g:2637:2: '='
            {
             before(grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_0_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2646:1: rule__Mqtt_data__Group_1_0__2 : rule__Mqtt_data__Group_1_0__2__Impl ;
    public final void rule__Mqtt_data__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2650:1: ( rule__Mqtt_data__Group_1_0__2__Impl )
            // InternalBPMN_translator.g:2651:2: rule__Mqtt_data__Group_1_0__2__Impl
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
    // InternalBPMN_translator.g:2657:1: rule__Mqtt_data__Group_1_0__2__Impl : ( ( rule__Mqtt_data__PnameAssignment_1_0_2 ) ) ;
    public final void rule__Mqtt_data__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2661:1: ( ( ( rule__Mqtt_data__PnameAssignment_1_0_2 ) ) )
            // InternalBPMN_translator.g:2662:1: ( ( rule__Mqtt_data__PnameAssignment_1_0_2 ) )
            {
            // InternalBPMN_translator.g:2662:1: ( ( rule__Mqtt_data__PnameAssignment_1_0_2 ) )
            // InternalBPMN_translator.g:2663:2: ( rule__Mqtt_data__PnameAssignment_1_0_2 )
            {
             before(grammarAccess.getMqtt_dataAccess().getPnameAssignment_1_0_2()); 
            // InternalBPMN_translator.g:2664:2: ( rule__Mqtt_data__PnameAssignment_1_0_2 )
            // InternalBPMN_translator.g:2664:3: rule__Mqtt_data__PnameAssignment_1_0_2
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
    // InternalBPMN_translator.g:2673:1: rule__Mqtt_data__Group_1_1__0 : rule__Mqtt_data__Group_1_1__0__Impl rule__Mqtt_data__Group_1_1__1 ;
    public final void rule__Mqtt_data__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2677:1: ( rule__Mqtt_data__Group_1_1__0__Impl rule__Mqtt_data__Group_1_1__1 )
            // InternalBPMN_translator.g:2678:2: rule__Mqtt_data__Group_1_1__0__Impl rule__Mqtt_data__Group_1_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBPMN_translator.g:2685:1: rule__Mqtt_data__Group_1_1__0__Impl : ( 'BROKER_USER' ) ;
    public final void rule__Mqtt_data__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2689:1: ( ( 'BROKER_USER' ) )
            // InternalBPMN_translator.g:2690:1: ( 'BROKER_USER' )
            {
            // InternalBPMN_translator.g:2690:1: ( 'BROKER_USER' )
            // InternalBPMN_translator.g:2691:2: 'BROKER_USER'
            {
             before(grammarAccess.getMqtt_dataAccess().getBROKER_USERKeyword_1_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2700:1: rule__Mqtt_data__Group_1_1__1 : rule__Mqtt_data__Group_1_1__1__Impl rule__Mqtt_data__Group_1_1__2 ;
    public final void rule__Mqtt_data__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2704:1: ( rule__Mqtt_data__Group_1_1__1__Impl rule__Mqtt_data__Group_1_1__2 )
            // InternalBPMN_translator.g:2705:2: rule__Mqtt_data__Group_1_1__1__Impl rule__Mqtt_data__Group_1_1__2
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
    // InternalBPMN_translator.g:2712:1: rule__Mqtt_data__Group_1_1__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2716:1: ( ( '=' ) )
            // InternalBPMN_translator.g:2717:1: ( '=' )
            {
            // InternalBPMN_translator.g:2717:1: ( '=' )
            // InternalBPMN_translator.g:2718:2: '='
            {
             before(grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_1_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2727:1: rule__Mqtt_data__Group_1_1__2 : rule__Mqtt_data__Group_1_1__2__Impl ;
    public final void rule__Mqtt_data__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2731:1: ( rule__Mqtt_data__Group_1_1__2__Impl )
            // InternalBPMN_translator.g:2732:2: rule__Mqtt_data__Group_1_1__2__Impl
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
    // InternalBPMN_translator.g:2738:1: rule__Mqtt_data__Group_1_1__2__Impl : ( ( rule__Mqtt_data__Broker_userAssignment_1_1_2 ) ) ;
    public final void rule__Mqtt_data__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2742:1: ( ( ( rule__Mqtt_data__Broker_userAssignment_1_1_2 ) ) )
            // InternalBPMN_translator.g:2743:1: ( ( rule__Mqtt_data__Broker_userAssignment_1_1_2 ) )
            {
            // InternalBPMN_translator.g:2743:1: ( ( rule__Mqtt_data__Broker_userAssignment_1_1_2 ) )
            // InternalBPMN_translator.g:2744:2: ( rule__Mqtt_data__Broker_userAssignment_1_1_2 )
            {
             before(grammarAccess.getMqtt_dataAccess().getBroker_userAssignment_1_1_2()); 
            // InternalBPMN_translator.g:2745:2: ( rule__Mqtt_data__Broker_userAssignment_1_1_2 )
            // InternalBPMN_translator.g:2745:3: rule__Mqtt_data__Broker_userAssignment_1_1_2
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
    // InternalBPMN_translator.g:2754:1: rule__Mqtt_data__Group_1_2__0 : rule__Mqtt_data__Group_1_2__0__Impl rule__Mqtt_data__Group_1_2__1 ;
    public final void rule__Mqtt_data__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2758:1: ( rule__Mqtt_data__Group_1_2__0__Impl rule__Mqtt_data__Group_1_2__1 )
            // InternalBPMN_translator.g:2759:2: rule__Mqtt_data__Group_1_2__0__Impl rule__Mqtt_data__Group_1_2__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBPMN_translator.g:2766:1: rule__Mqtt_data__Group_1_2__0__Impl : ( 'BROKER_PASSWORD' ) ;
    public final void rule__Mqtt_data__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2770:1: ( ( 'BROKER_PASSWORD' ) )
            // InternalBPMN_translator.g:2771:1: ( 'BROKER_PASSWORD' )
            {
            // InternalBPMN_translator.g:2771:1: ( 'BROKER_PASSWORD' )
            // InternalBPMN_translator.g:2772:2: 'BROKER_PASSWORD'
            {
             before(grammarAccess.getMqtt_dataAccess().getBROKER_PASSWORDKeyword_1_2_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2781:1: rule__Mqtt_data__Group_1_2__1 : rule__Mqtt_data__Group_1_2__1__Impl rule__Mqtt_data__Group_1_2__2 ;
    public final void rule__Mqtt_data__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2785:1: ( rule__Mqtt_data__Group_1_2__1__Impl rule__Mqtt_data__Group_1_2__2 )
            // InternalBPMN_translator.g:2786:2: rule__Mqtt_data__Group_1_2__1__Impl rule__Mqtt_data__Group_1_2__2
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
    // InternalBPMN_translator.g:2793:1: rule__Mqtt_data__Group_1_2__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2797:1: ( ( '=' ) )
            // InternalBPMN_translator.g:2798:1: ( '=' )
            {
            // InternalBPMN_translator.g:2798:1: ( '=' )
            // InternalBPMN_translator.g:2799:2: '='
            {
             before(grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_2_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2808:1: rule__Mqtt_data__Group_1_2__2 : rule__Mqtt_data__Group_1_2__2__Impl ;
    public final void rule__Mqtt_data__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2812:1: ( rule__Mqtt_data__Group_1_2__2__Impl )
            // InternalBPMN_translator.g:2813:2: rule__Mqtt_data__Group_1_2__2__Impl
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
    // InternalBPMN_translator.g:2819:1: rule__Mqtt_data__Group_1_2__2__Impl : ( ( rule__Mqtt_data__Broker_passwordAssignment_1_2_2 ) ) ;
    public final void rule__Mqtt_data__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2823:1: ( ( ( rule__Mqtt_data__Broker_passwordAssignment_1_2_2 ) ) )
            // InternalBPMN_translator.g:2824:1: ( ( rule__Mqtt_data__Broker_passwordAssignment_1_2_2 ) )
            {
            // InternalBPMN_translator.g:2824:1: ( ( rule__Mqtt_data__Broker_passwordAssignment_1_2_2 ) )
            // InternalBPMN_translator.g:2825:2: ( rule__Mqtt_data__Broker_passwordAssignment_1_2_2 )
            {
             before(grammarAccess.getMqtt_dataAccess().getBroker_passwordAssignment_1_2_2()); 
            // InternalBPMN_translator.g:2826:2: ( rule__Mqtt_data__Broker_passwordAssignment_1_2_2 )
            // InternalBPMN_translator.g:2826:3: rule__Mqtt_data__Broker_passwordAssignment_1_2_2
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
    // InternalBPMN_translator.g:2835:1: rule__Mqtt_data__Group_1_3__0 : rule__Mqtt_data__Group_1_3__0__Impl rule__Mqtt_data__Group_1_3__1 ;
    public final void rule__Mqtt_data__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2839:1: ( rule__Mqtt_data__Group_1_3__0__Impl rule__Mqtt_data__Group_1_3__1 )
            // InternalBPMN_translator.g:2840:2: rule__Mqtt_data__Group_1_3__0__Impl rule__Mqtt_data__Group_1_3__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBPMN_translator.g:2847:1: rule__Mqtt_data__Group_1_3__0__Impl : ( 'BROKER' ) ;
    public final void rule__Mqtt_data__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2851:1: ( ( 'BROKER' ) )
            // InternalBPMN_translator.g:2852:1: ( 'BROKER' )
            {
            // InternalBPMN_translator.g:2852:1: ( 'BROKER' )
            // InternalBPMN_translator.g:2853:2: 'BROKER'
            {
             before(grammarAccess.getMqtt_dataAccess().getBROKERKeyword_1_3_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2862:1: rule__Mqtt_data__Group_1_3__1 : rule__Mqtt_data__Group_1_3__1__Impl rule__Mqtt_data__Group_1_3__2 ;
    public final void rule__Mqtt_data__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2866:1: ( rule__Mqtt_data__Group_1_3__1__Impl rule__Mqtt_data__Group_1_3__2 )
            // InternalBPMN_translator.g:2867:2: rule__Mqtt_data__Group_1_3__1__Impl rule__Mqtt_data__Group_1_3__2
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
    // InternalBPMN_translator.g:2874:1: rule__Mqtt_data__Group_1_3__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2878:1: ( ( '=' ) )
            // InternalBPMN_translator.g:2879:1: ( '=' )
            {
            // InternalBPMN_translator.g:2879:1: ( '=' )
            // InternalBPMN_translator.g:2880:2: '='
            {
             before(grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_3_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2889:1: rule__Mqtt_data__Group_1_3__2 : rule__Mqtt_data__Group_1_3__2__Impl ;
    public final void rule__Mqtt_data__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2893:1: ( rule__Mqtt_data__Group_1_3__2__Impl )
            // InternalBPMN_translator.g:2894:2: rule__Mqtt_data__Group_1_3__2__Impl
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
    // InternalBPMN_translator.g:2900:1: rule__Mqtt_data__Group_1_3__2__Impl : ( ( rule__Mqtt_data__BrokerAssignment_1_3_2 ) ) ;
    public final void rule__Mqtt_data__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2904:1: ( ( ( rule__Mqtt_data__BrokerAssignment_1_3_2 ) ) )
            // InternalBPMN_translator.g:2905:1: ( ( rule__Mqtt_data__BrokerAssignment_1_3_2 ) )
            {
            // InternalBPMN_translator.g:2905:1: ( ( rule__Mqtt_data__BrokerAssignment_1_3_2 ) )
            // InternalBPMN_translator.g:2906:2: ( rule__Mqtt_data__BrokerAssignment_1_3_2 )
            {
             before(grammarAccess.getMqtt_dataAccess().getBrokerAssignment_1_3_2()); 
            // InternalBPMN_translator.g:2907:2: ( rule__Mqtt_data__BrokerAssignment_1_3_2 )
            // InternalBPMN_translator.g:2907:3: rule__Mqtt_data__BrokerAssignment_1_3_2
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
    // InternalBPMN_translator.g:2916:1: rule__Mqtt_data__Group_1_4__0 : rule__Mqtt_data__Group_1_4__0__Impl rule__Mqtt_data__Group_1_4__1 ;
    public final void rule__Mqtt_data__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2920:1: ( rule__Mqtt_data__Group_1_4__0__Impl rule__Mqtt_data__Group_1_4__1 )
            // InternalBPMN_translator.g:2921:2: rule__Mqtt_data__Group_1_4__0__Impl rule__Mqtt_data__Group_1_4__1
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
    // InternalBPMN_translator.g:2928:1: rule__Mqtt_data__Group_1_4__0__Impl : ( 'NETWORK' ) ;
    public final void rule__Mqtt_data__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2932:1: ( ( 'NETWORK' ) )
            // InternalBPMN_translator.g:2933:1: ( 'NETWORK' )
            {
            // InternalBPMN_translator.g:2933:1: ( 'NETWORK' )
            // InternalBPMN_translator.g:2934:2: 'NETWORK'
            {
             before(grammarAccess.getMqtt_dataAccess().getNETWORKKeyword_1_4_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2943:1: rule__Mqtt_data__Group_1_4__1 : rule__Mqtt_data__Group_1_4__1__Impl rule__Mqtt_data__Group_1_4__2 ;
    public final void rule__Mqtt_data__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2947:1: ( rule__Mqtt_data__Group_1_4__1__Impl rule__Mqtt_data__Group_1_4__2 )
            // InternalBPMN_translator.g:2948:2: rule__Mqtt_data__Group_1_4__1__Impl rule__Mqtt_data__Group_1_4__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalBPMN_translator.g:2955:1: rule__Mqtt_data__Group_1_4__1__Impl : ( '{' ) ;
    public final void rule__Mqtt_data__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2959:1: ( ( '{' ) )
            // InternalBPMN_translator.g:2960:1: ( '{' )
            {
            // InternalBPMN_translator.g:2960:1: ( '{' )
            // InternalBPMN_translator.g:2961:2: '{'
            {
             before(grammarAccess.getMqtt_dataAccess().getLeftCurlyBracketKeyword_1_4_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBPMN_translator.g:2970:1: rule__Mqtt_data__Group_1_4__2 : rule__Mqtt_data__Group_1_4__2__Impl rule__Mqtt_data__Group_1_4__3 ;
    public final void rule__Mqtt_data__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2974:1: ( rule__Mqtt_data__Group_1_4__2__Impl rule__Mqtt_data__Group_1_4__3 )
            // InternalBPMN_translator.g:2975:2: rule__Mqtt_data__Group_1_4__2__Impl rule__Mqtt_data__Group_1_4__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalBPMN_translator.g:2982:1: rule__Mqtt_data__Group_1_4__2__Impl : ( ( rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 )* ) ;
    public final void rule__Mqtt_data__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:2986:1: ( ( ( rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 )* ) )
            // InternalBPMN_translator.g:2987:1: ( ( rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 )* )
            {
            // InternalBPMN_translator.g:2987:1: ( ( rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 )* )
            // InternalBPMN_translator.g:2988:2: ( rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 )*
            {
             before(grammarAccess.getMqtt_dataAccess().getMqtt_network_dataAssignment_1_4_2()); 
            // InternalBPMN_translator.g:2989:2: ( rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==41) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBPMN_translator.g:2989:3: rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalBPMN_translator.g:2997:1: rule__Mqtt_data__Group_1_4__3 : rule__Mqtt_data__Group_1_4__3__Impl ;
    public final void rule__Mqtt_data__Group_1_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3001:1: ( rule__Mqtt_data__Group_1_4__3__Impl )
            // InternalBPMN_translator.g:3002:2: rule__Mqtt_data__Group_1_4__3__Impl
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
    // InternalBPMN_translator.g:3008:1: rule__Mqtt_data__Group_1_4__3__Impl : ( '}' ) ;
    public final void rule__Mqtt_data__Group_1_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3012:1: ( ( '}' ) )
            // InternalBPMN_translator.g:3013:1: ( '}' )
            {
            // InternalBPMN_translator.g:3013:1: ( '}' )
            // InternalBPMN_translator.g:3014:2: '}'
            {
             before(grammarAccess.getMqtt_dataAccess().getRightCurlyBracketKeyword_1_4_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3024:1: rule__Mqtt_data__Group_1_5__0 : rule__Mqtt_data__Group_1_5__0__Impl rule__Mqtt_data__Group_1_5__1 ;
    public final void rule__Mqtt_data__Group_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3028:1: ( rule__Mqtt_data__Group_1_5__0__Impl rule__Mqtt_data__Group_1_5__1 )
            // InternalBPMN_translator.g:3029:2: rule__Mqtt_data__Group_1_5__0__Impl rule__Mqtt_data__Group_1_5__1
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
    // InternalBPMN_translator.g:3036:1: rule__Mqtt_data__Group_1_5__0__Impl : ( 'SUBTOPICS' ) ;
    public final void rule__Mqtt_data__Group_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3040:1: ( ( 'SUBTOPICS' ) )
            // InternalBPMN_translator.g:3041:1: ( 'SUBTOPICS' )
            {
            // InternalBPMN_translator.g:3041:1: ( 'SUBTOPICS' )
            // InternalBPMN_translator.g:3042:2: 'SUBTOPICS'
            {
             before(grammarAccess.getMqtt_dataAccess().getSUBTOPICSKeyword_1_5_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3051:1: rule__Mqtt_data__Group_1_5__1 : rule__Mqtt_data__Group_1_5__1__Impl rule__Mqtt_data__Group_1_5__2 ;
    public final void rule__Mqtt_data__Group_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3055:1: ( rule__Mqtt_data__Group_1_5__1__Impl rule__Mqtt_data__Group_1_5__2 )
            // InternalBPMN_translator.g:3056:2: rule__Mqtt_data__Group_1_5__1__Impl rule__Mqtt_data__Group_1_5__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalBPMN_translator.g:3063:1: rule__Mqtt_data__Group_1_5__1__Impl : ( '{' ) ;
    public final void rule__Mqtt_data__Group_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3067:1: ( ( '{' ) )
            // InternalBPMN_translator.g:3068:1: ( '{' )
            {
            // InternalBPMN_translator.g:3068:1: ( '{' )
            // InternalBPMN_translator.g:3069:2: '{'
            {
             before(grammarAccess.getMqtt_dataAccess().getLeftCurlyBracketKeyword_1_5_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3078:1: rule__Mqtt_data__Group_1_5__2 : rule__Mqtt_data__Group_1_5__2__Impl rule__Mqtt_data__Group_1_5__3 ;
    public final void rule__Mqtt_data__Group_1_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3082:1: ( rule__Mqtt_data__Group_1_5__2__Impl rule__Mqtt_data__Group_1_5__3 )
            // InternalBPMN_translator.g:3083:2: rule__Mqtt_data__Group_1_5__2__Impl rule__Mqtt_data__Group_1_5__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalBPMN_translator.g:3090:1: rule__Mqtt_data__Group_1_5__2__Impl : ( ( rule__Mqtt_data__Group_1_5_2__0 )* ) ;
    public final void rule__Mqtt_data__Group_1_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3094:1: ( ( ( rule__Mqtt_data__Group_1_5_2__0 )* ) )
            // InternalBPMN_translator.g:3095:1: ( ( rule__Mqtt_data__Group_1_5_2__0 )* )
            {
            // InternalBPMN_translator.g:3095:1: ( ( rule__Mqtt_data__Group_1_5_2__0 )* )
            // InternalBPMN_translator.g:3096:2: ( rule__Mqtt_data__Group_1_5_2__0 )*
            {
             before(grammarAccess.getMqtt_dataAccess().getGroup_1_5_2()); 
            // InternalBPMN_translator.g:3097:2: ( rule__Mqtt_data__Group_1_5_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==38) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBPMN_translator.g:3097:3: rule__Mqtt_data__Group_1_5_2__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Mqtt_data__Group_1_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalBPMN_translator.g:3105:1: rule__Mqtt_data__Group_1_5__3 : rule__Mqtt_data__Group_1_5__3__Impl ;
    public final void rule__Mqtt_data__Group_1_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3109:1: ( rule__Mqtt_data__Group_1_5__3__Impl )
            // InternalBPMN_translator.g:3110:2: rule__Mqtt_data__Group_1_5__3__Impl
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
    // InternalBPMN_translator.g:3116:1: rule__Mqtt_data__Group_1_5__3__Impl : ( '}' ) ;
    public final void rule__Mqtt_data__Group_1_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3120:1: ( ( '}' ) )
            // InternalBPMN_translator.g:3121:1: ( '}' )
            {
            // InternalBPMN_translator.g:3121:1: ( '}' )
            // InternalBPMN_translator.g:3122:2: '}'
            {
             before(grammarAccess.getMqtt_dataAccess().getRightCurlyBracketKeyword_1_5_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3132:1: rule__Mqtt_data__Group_1_5_2__0 : rule__Mqtt_data__Group_1_5_2__0__Impl rule__Mqtt_data__Group_1_5_2__1 ;
    public final void rule__Mqtt_data__Group_1_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3136:1: ( rule__Mqtt_data__Group_1_5_2__0__Impl rule__Mqtt_data__Group_1_5_2__1 )
            // InternalBPMN_translator.g:3137:2: rule__Mqtt_data__Group_1_5_2__0__Impl rule__Mqtt_data__Group_1_5_2__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBPMN_translator.g:3144:1: rule__Mqtt_data__Group_1_5_2__0__Impl : ( 'TOPIC_NAME' ) ;
    public final void rule__Mqtt_data__Group_1_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3148:1: ( ( 'TOPIC_NAME' ) )
            // InternalBPMN_translator.g:3149:1: ( 'TOPIC_NAME' )
            {
            // InternalBPMN_translator.g:3149:1: ( 'TOPIC_NAME' )
            // InternalBPMN_translator.g:3150:2: 'TOPIC_NAME'
            {
             before(grammarAccess.getMqtt_dataAccess().getTOPIC_NAMEKeyword_1_5_2_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3159:1: rule__Mqtt_data__Group_1_5_2__1 : rule__Mqtt_data__Group_1_5_2__1__Impl rule__Mqtt_data__Group_1_5_2__2 ;
    public final void rule__Mqtt_data__Group_1_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3163:1: ( rule__Mqtt_data__Group_1_5_2__1__Impl rule__Mqtt_data__Group_1_5_2__2 )
            // InternalBPMN_translator.g:3164:2: rule__Mqtt_data__Group_1_5_2__1__Impl rule__Mqtt_data__Group_1_5_2__2
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
    // InternalBPMN_translator.g:3171:1: rule__Mqtt_data__Group_1_5_2__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3175:1: ( ( '=' ) )
            // InternalBPMN_translator.g:3176:1: ( '=' )
            {
            // InternalBPMN_translator.g:3176:1: ( '=' )
            // InternalBPMN_translator.g:3177:2: '='
            {
             before(grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_5_2_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3186:1: rule__Mqtt_data__Group_1_5_2__2 : rule__Mqtt_data__Group_1_5_2__2__Impl ;
    public final void rule__Mqtt_data__Group_1_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3190:1: ( rule__Mqtt_data__Group_1_5_2__2__Impl )
            // InternalBPMN_translator.g:3191:2: rule__Mqtt_data__Group_1_5_2__2__Impl
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
    // InternalBPMN_translator.g:3197:1: rule__Mqtt_data__Group_1_5_2__2__Impl : ( ( rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 ) ) ;
    public final void rule__Mqtt_data__Group_1_5_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3201:1: ( ( ( rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 ) ) )
            // InternalBPMN_translator.g:3202:1: ( ( rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 ) )
            {
            // InternalBPMN_translator.g:3202:1: ( ( rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 ) )
            // InternalBPMN_translator.g:3203:2: ( rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 )
            {
             before(grammarAccess.getMqtt_dataAccess().getSubtopicsAssignment_1_5_2_2()); 
            // InternalBPMN_translator.g:3204:2: ( rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 )
            // InternalBPMN_translator.g:3204:3: rule__Mqtt_data__SubtopicsAssignment_1_5_2_2
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
    // InternalBPMN_translator.g:3213:1: rule__Mqtt_data__Group_1_6__0 : rule__Mqtt_data__Group_1_6__0__Impl rule__Mqtt_data__Group_1_6__1 ;
    public final void rule__Mqtt_data__Group_1_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3217:1: ( rule__Mqtt_data__Group_1_6__0__Impl rule__Mqtt_data__Group_1_6__1 )
            // InternalBPMN_translator.g:3218:2: rule__Mqtt_data__Group_1_6__0__Impl rule__Mqtt_data__Group_1_6__1
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
    // InternalBPMN_translator.g:3225:1: rule__Mqtt_data__Group_1_6__0__Impl : ( 'PUBTOPICS' ) ;
    public final void rule__Mqtt_data__Group_1_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3229:1: ( ( 'PUBTOPICS' ) )
            // InternalBPMN_translator.g:3230:1: ( 'PUBTOPICS' )
            {
            // InternalBPMN_translator.g:3230:1: ( 'PUBTOPICS' )
            // InternalBPMN_translator.g:3231:2: 'PUBTOPICS'
            {
             before(grammarAccess.getMqtt_dataAccess().getPUBTOPICSKeyword_1_6_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3240:1: rule__Mqtt_data__Group_1_6__1 : rule__Mqtt_data__Group_1_6__1__Impl rule__Mqtt_data__Group_1_6__2 ;
    public final void rule__Mqtt_data__Group_1_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3244:1: ( rule__Mqtt_data__Group_1_6__1__Impl rule__Mqtt_data__Group_1_6__2 )
            // InternalBPMN_translator.g:3245:2: rule__Mqtt_data__Group_1_6__1__Impl rule__Mqtt_data__Group_1_6__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalBPMN_translator.g:3252:1: rule__Mqtt_data__Group_1_6__1__Impl : ( '{' ) ;
    public final void rule__Mqtt_data__Group_1_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3256:1: ( ( '{' ) )
            // InternalBPMN_translator.g:3257:1: ( '{' )
            {
            // InternalBPMN_translator.g:3257:1: ( '{' )
            // InternalBPMN_translator.g:3258:2: '{'
            {
             before(grammarAccess.getMqtt_dataAccess().getLeftCurlyBracketKeyword_1_6_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3267:1: rule__Mqtt_data__Group_1_6__2 : rule__Mqtt_data__Group_1_6__2__Impl rule__Mqtt_data__Group_1_6__3 ;
    public final void rule__Mqtt_data__Group_1_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3271:1: ( rule__Mqtt_data__Group_1_6__2__Impl rule__Mqtt_data__Group_1_6__3 )
            // InternalBPMN_translator.g:3272:2: rule__Mqtt_data__Group_1_6__2__Impl rule__Mqtt_data__Group_1_6__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalBPMN_translator.g:3279:1: rule__Mqtt_data__Group_1_6__2__Impl : ( ( rule__Mqtt_data__Alternatives_1_6_2 )* ) ;
    public final void rule__Mqtt_data__Group_1_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3283:1: ( ( ( rule__Mqtt_data__Alternatives_1_6_2 )* ) )
            // InternalBPMN_translator.g:3284:1: ( ( rule__Mqtt_data__Alternatives_1_6_2 )* )
            {
            // InternalBPMN_translator.g:3284:1: ( ( rule__Mqtt_data__Alternatives_1_6_2 )* )
            // InternalBPMN_translator.g:3285:2: ( rule__Mqtt_data__Alternatives_1_6_2 )*
            {
             before(grammarAccess.getMqtt_dataAccess().getAlternatives_1_6_2()); 
            // InternalBPMN_translator.g:3286:2: ( rule__Mqtt_data__Alternatives_1_6_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==38||LA23_0==40) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBPMN_translator.g:3286:3: rule__Mqtt_data__Alternatives_1_6_2
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Mqtt_data__Alternatives_1_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalBPMN_translator.g:3294:1: rule__Mqtt_data__Group_1_6__3 : rule__Mqtt_data__Group_1_6__3__Impl ;
    public final void rule__Mqtt_data__Group_1_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3298:1: ( rule__Mqtt_data__Group_1_6__3__Impl )
            // InternalBPMN_translator.g:3299:2: rule__Mqtt_data__Group_1_6__3__Impl
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
    // InternalBPMN_translator.g:3305:1: rule__Mqtt_data__Group_1_6__3__Impl : ( '}' ) ;
    public final void rule__Mqtt_data__Group_1_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3309:1: ( ( '}' ) )
            // InternalBPMN_translator.g:3310:1: ( '}' )
            {
            // InternalBPMN_translator.g:3310:1: ( '}' )
            // InternalBPMN_translator.g:3311:2: '}'
            {
             before(grammarAccess.getMqtt_dataAccess().getRightCurlyBracketKeyword_1_6_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3321:1: rule__Mqtt_data__Group_1_6_2_0__0 : rule__Mqtt_data__Group_1_6_2_0__0__Impl rule__Mqtt_data__Group_1_6_2_0__1 ;
    public final void rule__Mqtt_data__Group_1_6_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3325:1: ( rule__Mqtt_data__Group_1_6_2_0__0__Impl rule__Mqtt_data__Group_1_6_2_0__1 )
            // InternalBPMN_translator.g:3326:2: rule__Mqtt_data__Group_1_6_2_0__0__Impl rule__Mqtt_data__Group_1_6_2_0__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBPMN_translator.g:3333:1: rule__Mqtt_data__Group_1_6_2_0__0__Impl : ( 'TOPIC_NAME' ) ;
    public final void rule__Mqtt_data__Group_1_6_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3337:1: ( ( 'TOPIC_NAME' ) )
            // InternalBPMN_translator.g:3338:1: ( 'TOPIC_NAME' )
            {
            // InternalBPMN_translator.g:3338:1: ( 'TOPIC_NAME' )
            // InternalBPMN_translator.g:3339:2: 'TOPIC_NAME'
            {
             before(grammarAccess.getMqtt_dataAccess().getTOPIC_NAMEKeyword_1_6_2_0_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3348:1: rule__Mqtt_data__Group_1_6_2_0__1 : rule__Mqtt_data__Group_1_6_2_0__1__Impl rule__Mqtt_data__Group_1_6_2_0__2 ;
    public final void rule__Mqtt_data__Group_1_6_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3352:1: ( rule__Mqtt_data__Group_1_6_2_0__1__Impl rule__Mqtt_data__Group_1_6_2_0__2 )
            // InternalBPMN_translator.g:3353:2: rule__Mqtt_data__Group_1_6_2_0__1__Impl rule__Mqtt_data__Group_1_6_2_0__2
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
    // InternalBPMN_translator.g:3360:1: rule__Mqtt_data__Group_1_6_2_0__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_6_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3364:1: ( ( '=' ) )
            // InternalBPMN_translator.g:3365:1: ( '=' )
            {
            // InternalBPMN_translator.g:3365:1: ( '=' )
            // InternalBPMN_translator.g:3366:2: '='
            {
             before(grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_6_2_0_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3375:1: rule__Mqtt_data__Group_1_6_2_0__2 : rule__Mqtt_data__Group_1_6_2_0__2__Impl ;
    public final void rule__Mqtt_data__Group_1_6_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3379:1: ( rule__Mqtt_data__Group_1_6_2_0__2__Impl )
            // InternalBPMN_translator.g:3380:2: rule__Mqtt_data__Group_1_6_2_0__2__Impl
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
    // InternalBPMN_translator.g:3386:1: rule__Mqtt_data__Group_1_6_2_0__2__Impl : ( ( rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 )* ) ;
    public final void rule__Mqtt_data__Group_1_6_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3390:1: ( ( ( rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 )* ) )
            // InternalBPMN_translator.g:3391:1: ( ( rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 )* )
            {
            // InternalBPMN_translator.g:3391:1: ( ( rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 )* )
            // InternalBPMN_translator.g:3392:2: ( rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 )*
            {
             before(grammarAccess.getMqtt_dataAccess().getPubtopicsAssignment_1_6_2_0_2()); 
            // InternalBPMN_translator.g:3393:2: ( rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_STRING) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBPMN_translator.g:3393:3: rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalBPMN_translator.g:3402:1: rule__Mqtt_data__Group_1_6_2_1__0 : rule__Mqtt_data__Group_1_6_2_1__0__Impl rule__Mqtt_data__Group_1_6_2_1__1 ;
    public final void rule__Mqtt_data__Group_1_6_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3406:1: ( rule__Mqtt_data__Group_1_6_2_1__0__Impl rule__Mqtt_data__Group_1_6_2_1__1 )
            // InternalBPMN_translator.g:3407:2: rule__Mqtt_data__Group_1_6_2_1__0__Impl rule__Mqtt_data__Group_1_6_2_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBPMN_translator.g:3414:1: rule__Mqtt_data__Group_1_6_2_1__0__Impl : ( 'DATA' ) ;
    public final void rule__Mqtt_data__Group_1_6_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3418:1: ( ( 'DATA' ) )
            // InternalBPMN_translator.g:3419:1: ( 'DATA' )
            {
            // InternalBPMN_translator.g:3419:1: ( 'DATA' )
            // InternalBPMN_translator.g:3420:2: 'DATA'
            {
             before(grammarAccess.getMqtt_dataAccess().getDATAKeyword_1_6_2_1_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3429:1: rule__Mqtt_data__Group_1_6_2_1__1 : rule__Mqtt_data__Group_1_6_2_1__1__Impl rule__Mqtt_data__Group_1_6_2_1__2 ;
    public final void rule__Mqtt_data__Group_1_6_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3433:1: ( rule__Mqtt_data__Group_1_6_2_1__1__Impl rule__Mqtt_data__Group_1_6_2_1__2 )
            // InternalBPMN_translator.g:3434:2: rule__Mqtt_data__Group_1_6_2_1__1__Impl rule__Mqtt_data__Group_1_6_2_1__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalBPMN_translator.g:3441:1: rule__Mqtt_data__Group_1_6_2_1__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_data__Group_1_6_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3445:1: ( ( '=' ) )
            // InternalBPMN_translator.g:3446:1: ( '=' )
            {
            // InternalBPMN_translator.g:3446:1: ( '=' )
            // InternalBPMN_translator.g:3447:2: '='
            {
             before(grammarAccess.getMqtt_dataAccess().getEqualsSignKeyword_1_6_2_1_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3456:1: rule__Mqtt_data__Group_1_6_2_1__2 : rule__Mqtt_data__Group_1_6_2_1__2__Impl ;
    public final void rule__Mqtt_data__Group_1_6_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3460:1: ( rule__Mqtt_data__Group_1_6_2_1__2__Impl )
            // InternalBPMN_translator.g:3461:2: rule__Mqtt_data__Group_1_6_2_1__2__Impl
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
    // InternalBPMN_translator.g:3467:1: rule__Mqtt_data__Group_1_6_2_1__2__Impl : ( ( rule__Mqtt_data__ValueAssignment_1_6_2_1_2 ) ) ;
    public final void rule__Mqtt_data__Group_1_6_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3471:1: ( ( ( rule__Mqtt_data__ValueAssignment_1_6_2_1_2 ) ) )
            // InternalBPMN_translator.g:3472:1: ( ( rule__Mqtt_data__ValueAssignment_1_6_2_1_2 ) )
            {
            // InternalBPMN_translator.g:3472:1: ( ( rule__Mqtt_data__ValueAssignment_1_6_2_1_2 ) )
            // InternalBPMN_translator.g:3473:2: ( rule__Mqtt_data__ValueAssignment_1_6_2_1_2 )
            {
             before(grammarAccess.getMqtt_dataAccess().getValueAssignment_1_6_2_1_2()); 
            // InternalBPMN_translator.g:3474:2: ( rule__Mqtt_data__ValueAssignment_1_6_2_1_2 )
            // InternalBPMN_translator.g:3474:3: rule__Mqtt_data__ValueAssignment_1_6_2_1_2
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
    // InternalBPMN_translator.g:3483:1: rule__Mqtt_network_data__Group__0 : rule__Mqtt_network_data__Group__0__Impl rule__Mqtt_network_data__Group__1 ;
    public final void rule__Mqtt_network_data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3487:1: ( rule__Mqtt_network_data__Group__0__Impl rule__Mqtt_network_data__Group__1 )
            // InternalBPMN_translator.g:3488:2: rule__Mqtt_network_data__Group__0__Impl rule__Mqtt_network_data__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBPMN_translator.g:3495:1: rule__Mqtt_network_data__Group__0__Impl : ( 'SSID' ) ;
    public final void rule__Mqtt_network_data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3499:1: ( ( 'SSID' ) )
            // InternalBPMN_translator.g:3500:1: ( 'SSID' )
            {
            // InternalBPMN_translator.g:3500:1: ( 'SSID' )
            // InternalBPMN_translator.g:3501:2: 'SSID'
            {
             before(grammarAccess.getMqtt_network_dataAccess().getSSIDKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3510:1: rule__Mqtt_network_data__Group__1 : rule__Mqtt_network_data__Group__1__Impl rule__Mqtt_network_data__Group__2 ;
    public final void rule__Mqtt_network_data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3514:1: ( rule__Mqtt_network_data__Group__1__Impl rule__Mqtt_network_data__Group__2 )
            // InternalBPMN_translator.g:3515:2: rule__Mqtt_network_data__Group__1__Impl rule__Mqtt_network_data__Group__2
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
    // InternalBPMN_translator.g:3522:1: rule__Mqtt_network_data__Group__1__Impl : ( '=' ) ;
    public final void rule__Mqtt_network_data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3526:1: ( ( '=' ) )
            // InternalBPMN_translator.g:3527:1: ( '=' )
            {
            // InternalBPMN_translator.g:3527:1: ( '=' )
            // InternalBPMN_translator.g:3528:2: '='
            {
             before(grammarAccess.getMqtt_network_dataAccess().getEqualsSignKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3537:1: rule__Mqtt_network_data__Group__2 : rule__Mqtt_network_data__Group__2__Impl rule__Mqtt_network_data__Group__3 ;
    public final void rule__Mqtt_network_data__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3541:1: ( rule__Mqtt_network_data__Group__2__Impl rule__Mqtt_network_data__Group__3 )
            // InternalBPMN_translator.g:3542:2: rule__Mqtt_network_data__Group__2__Impl rule__Mqtt_network_data__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalBPMN_translator.g:3549:1: rule__Mqtt_network_data__Group__2__Impl : ( ( rule__Mqtt_network_data__SsidAssignment_2 ) ) ;
    public final void rule__Mqtt_network_data__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3553:1: ( ( ( rule__Mqtt_network_data__SsidAssignment_2 ) ) )
            // InternalBPMN_translator.g:3554:1: ( ( rule__Mqtt_network_data__SsidAssignment_2 ) )
            {
            // InternalBPMN_translator.g:3554:1: ( ( rule__Mqtt_network_data__SsidAssignment_2 ) )
            // InternalBPMN_translator.g:3555:2: ( rule__Mqtt_network_data__SsidAssignment_2 )
            {
             before(grammarAccess.getMqtt_network_dataAccess().getSsidAssignment_2()); 
            // InternalBPMN_translator.g:3556:2: ( rule__Mqtt_network_data__SsidAssignment_2 )
            // InternalBPMN_translator.g:3556:3: rule__Mqtt_network_data__SsidAssignment_2
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
    // InternalBPMN_translator.g:3564:1: rule__Mqtt_network_data__Group__3 : rule__Mqtt_network_data__Group__3__Impl rule__Mqtt_network_data__Group__4 ;
    public final void rule__Mqtt_network_data__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3568:1: ( rule__Mqtt_network_data__Group__3__Impl rule__Mqtt_network_data__Group__4 )
            // InternalBPMN_translator.g:3569:2: rule__Mqtt_network_data__Group__3__Impl rule__Mqtt_network_data__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalBPMN_translator.g:3576:1: rule__Mqtt_network_data__Group__3__Impl : ( 'PASSWORD' ) ;
    public final void rule__Mqtt_network_data__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3580:1: ( ( 'PASSWORD' ) )
            // InternalBPMN_translator.g:3581:1: ( 'PASSWORD' )
            {
            // InternalBPMN_translator.g:3581:1: ( 'PASSWORD' )
            // InternalBPMN_translator.g:3582:2: 'PASSWORD'
            {
             before(grammarAccess.getMqtt_network_dataAccess().getPASSWORDKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3591:1: rule__Mqtt_network_data__Group__4 : rule__Mqtt_network_data__Group__4__Impl rule__Mqtt_network_data__Group__5 ;
    public final void rule__Mqtt_network_data__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3595:1: ( rule__Mqtt_network_data__Group__4__Impl rule__Mqtt_network_data__Group__5 )
            // InternalBPMN_translator.g:3596:2: rule__Mqtt_network_data__Group__4__Impl rule__Mqtt_network_data__Group__5
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
    // InternalBPMN_translator.g:3603:1: rule__Mqtt_network_data__Group__4__Impl : ( '=' ) ;
    public final void rule__Mqtt_network_data__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3607:1: ( ( '=' ) )
            // InternalBPMN_translator.g:3608:1: ( '=' )
            {
            // InternalBPMN_translator.g:3608:1: ( '=' )
            // InternalBPMN_translator.g:3609:2: '='
            {
             before(grammarAccess.getMqtt_network_dataAccess().getEqualsSignKeyword_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3618:1: rule__Mqtt_network_data__Group__5 : rule__Mqtt_network_data__Group__5__Impl ;
    public final void rule__Mqtt_network_data__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3622:1: ( rule__Mqtt_network_data__Group__5__Impl )
            // InternalBPMN_translator.g:3623:2: rule__Mqtt_network_data__Group__5__Impl
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
    // InternalBPMN_translator.g:3629:1: rule__Mqtt_network_data__Group__5__Impl : ( ( rule__Mqtt_network_data__PasswordAssignment_5 ) ) ;
    public final void rule__Mqtt_network_data__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3633:1: ( ( ( rule__Mqtt_network_data__PasswordAssignment_5 ) ) )
            // InternalBPMN_translator.g:3634:1: ( ( rule__Mqtt_network_data__PasswordAssignment_5 ) )
            {
            // InternalBPMN_translator.g:3634:1: ( ( rule__Mqtt_network_data__PasswordAssignment_5 ) )
            // InternalBPMN_translator.g:3635:2: ( rule__Mqtt_network_data__PasswordAssignment_5 )
            {
             before(grammarAccess.getMqtt_network_dataAccess().getPasswordAssignment_5()); 
            // InternalBPMN_translator.g:3636:2: ( rule__Mqtt_network_data__PasswordAssignment_5 )
            // InternalBPMN_translator.g:3636:3: rule__Mqtt_network_data__PasswordAssignment_5
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
    // InternalBPMN_translator.g:3645:1: rule__Mqtt_device__Group__0 : rule__Mqtt_device__Group__0__Impl rule__Mqtt_device__Group__1 ;
    public final void rule__Mqtt_device__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3649:1: ( rule__Mqtt_device__Group__0__Impl rule__Mqtt_device__Group__1 )
            // InternalBPMN_translator.g:3650:2: rule__Mqtt_device__Group__0__Impl rule__Mqtt_device__Group__1
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
    // InternalBPMN_translator.g:3657:1: rule__Mqtt_device__Group__0__Impl : ( 'PROTOCOL_DEVICE' ) ;
    public final void rule__Mqtt_device__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3661:1: ( ( 'PROTOCOL_DEVICE' ) )
            // InternalBPMN_translator.g:3662:1: ( 'PROTOCOL_DEVICE' )
            {
            // InternalBPMN_translator.g:3662:1: ( 'PROTOCOL_DEVICE' )
            // InternalBPMN_translator.g:3663:2: 'PROTOCOL_DEVICE'
            {
             before(grammarAccess.getMqtt_deviceAccess().getPROTOCOL_DEVICEKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3672:1: rule__Mqtt_device__Group__1 : rule__Mqtt_device__Group__1__Impl rule__Mqtt_device__Group__2 ;
    public final void rule__Mqtt_device__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3676:1: ( rule__Mqtt_device__Group__1__Impl rule__Mqtt_device__Group__2 )
            // InternalBPMN_translator.g:3677:2: rule__Mqtt_device__Group__1__Impl rule__Mqtt_device__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalBPMN_translator.g:3684:1: rule__Mqtt_device__Group__1__Impl : ( '{' ) ;
    public final void rule__Mqtt_device__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3688:1: ( ( '{' ) )
            // InternalBPMN_translator.g:3689:1: ( '{' )
            {
            // InternalBPMN_translator.g:3689:1: ( '{' )
            // InternalBPMN_translator.g:3690:2: '{'
            {
             before(grammarAccess.getMqtt_deviceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3699:1: rule__Mqtt_device__Group__2 : rule__Mqtt_device__Group__2__Impl rule__Mqtt_device__Group__3 ;
    public final void rule__Mqtt_device__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3703:1: ( rule__Mqtt_device__Group__2__Impl rule__Mqtt_device__Group__3 )
            // InternalBPMN_translator.g:3704:2: rule__Mqtt_device__Group__2__Impl rule__Mqtt_device__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalBPMN_translator.g:3711:1: rule__Mqtt_device__Group__2__Impl : ( 'NAME' ) ;
    public final void rule__Mqtt_device__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3715:1: ( ( 'NAME' ) )
            // InternalBPMN_translator.g:3716:1: ( 'NAME' )
            {
            // InternalBPMN_translator.g:3716:1: ( 'NAME' )
            // InternalBPMN_translator.g:3717:2: 'NAME'
            {
             before(grammarAccess.getMqtt_deviceAccess().getNAMEKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3726:1: rule__Mqtt_device__Group__3 : rule__Mqtt_device__Group__3__Impl rule__Mqtt_device__Group__4 ;
    public final void rule__Mqtt_device__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3730:1: ( rule__Mqtt_device__Group__3__Impl rule__Mqtt_device__Group__4 )
            // InternalBPMN_translator.g:3731:2: rule__Mqtt_device__Group__3__Impl rule__Mqtt_device__Group__4
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
    // InternalBPMN_translator.g:3738:1: rule__Mqtt_device__Group__3__Impl : ( '=' ) ;
    public final void rule__Mqtt_device__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3742:1: ( ( '=' ) )
            // InternalBPMN_translator.g:3743:1: ( '=' )
            {
            // InternalBPMN_translator.g:3743:1: ( '=' )
            // InternalBPMN_translator.g:3744:2: '='
            {
             before(grammarAccess.getMqtt_deviceAccess().getEqualsSignKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3753:1: rule__Mqtt_device__Group__4 : rule__Mqtt_device__Group__4__Impl rule__Mqtt_device__Group__5 ;
    public final void rule__Mqtt_device__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3757:1: ( rule__Mqtt_device__Group__4__Impl rule__Mqtt_device__Group__5 )
            // InternalBPMN_translator.g:3758:2: rule__Mqtt_device__Group__4__Impl rule__Mqtt_device__Group__5
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
    // InternalBPMN_translator.g:3765:1: rule__Mqtt_device__Group__4__Impl : ( ( rule__Mqtt_device__DnameAssignment_4 ) ) ;
    public final void rule__Mqtt_device__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3769:1: ( ( ( rule__Mqtt_device__DnameAssignment_4 ) ) )
            // InternalBPMN_translator.g:3770:1: ( ( rule__Mqtt_device__DnameAssignment_4 ) )
            {
            // InternalBPMN_translator.g:3770:1: ( ( rule__Mqtt_device__DnameAssignment_4 ) )
            // InternalBPMN_translator.g:3771:2: ( rule__Mqtt_device__DnameAssignment_4 )
            {
             before(grammarAccess.getMqtt_deviceAccess().getDnameAssignment_4()); 
            // InternalBPMN_translator.g:3772:2: ( rule__Mqtt_device__DnameAssignment_4 )
            // InternalBPMN_translator.g:3772:3: rule__Mqtt_device__DnameAssignment_4
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
    // InternalBPMN_translator.g:3780:1: rule__Mqtt_device__Group__5 : rule__Mqtt_device__Group__5__Impl ;
    public final void rule__Mqtt_device__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3784:1: ( rule__Mqtt_device__Group__5__Impl )
            // InternalBPMN_translator.g:3785:2: rule__Mqtt_device__Group__5__Impl
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
    // InternalBPMN_translator.g:3791:1: rule__Mqtt_device__Group__5__Impl : ( '}' ) ;
    public final void rule__Mqtt_device__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3795:1: ( ( '}' ) )
            // InternalBPMN_translator.g:3796:1: ( '}' )
            {
            // InternalBPMN_translator.g:3796:1: ( '}' )
            // InternalBPMN_translator.g:3797:2: '}'
            {
             before(grammarAccess.getMqtt_deviceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3807:1: rule__Sensor__Group_0__0 : rule__Sensor__Group_0__0__Impl rule__Sensor__Group_0__1 ;
    public final void rule__Sensor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3811:1: ( rule__Sensor__Group_0__0__Impl rule__Sensor__Group_0__1 )
            // InternalBPMN_translator.g:3812:2: rule__Sensor__Group_0__0__Impl rule__Sensor__Group_0__1
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
    // InternalBPMN_translator.g:3819:1: rule__Sensor__Group_0__0__Impl : ( ( rule__Sensor__SnameAssignment_0_0 ) ) ;
    public final void rule__Sensor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3823:1: ( ( ( rule__Sensor__SnameAssignment_0_0 ) ) )
            // InternalBPMN_translator.g:3824:1: ( ( rule__Sensor__SnameAssignment_0_0 ) )
            {
            // InternalBPMN_translator.g:3824:1: ( ( rule__Sensor__SnameAssignment_0_0 ) )
            // InternalBPMN_translator.g:3825:2: ( rule__Sensor__SnameAssignment_0_0 )
            {
             before(grammarAccess.getSensorAccess().getSnameAssignment_0_0()); 
            // InternalBPMN_translator.g:3826:2: ( rule__Sensor__SnameAssignment_0_0 )
            // InternalBPMN_translator.g:3826:3: rule__Sensor__SnameAssignment_0_0
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
    // InternalBPMN_translator.g:3834:1: rule__Sensor__Group_0__1 : rule__Sensor__Group_0__1__Impl rule__Sensor__Group_0__2 ;
    public final void rule__Sensor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3838:1: ( rule__Sensor__Group_0__1__Impl rule__Sensor__Group_0__2 )
            // InternalBPMN_translator.g:3839:2: rule__Sensor__Group_0__1__Impl rule__Sensor__Group_0__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalBPMN_translator.g:3846:1: rule__Sensor__Group_0__1__Impl : ( '{' ) ;
    public final void rule__Sensor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3850:1: ( ( '{' ) )
            // InternalBPMN_translator.g:3851:1: ( '{' )
            {
            // InternalBPMN_translator.g:3851:1: ( '{' )
            // InternalBPMN_translator.g:3852:2: '{'
            {
             before(grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_0_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3861:1: rule__Sensor__Group_0__2 : rule__Sensor__Group_0__2__Impl rule__Sensor__Group_0__3 ;
    public final void rule__Sensor__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3865:1: ( rule__Sensor__Group_0__2__Impl rule__Sensor__Group_0__3 )
            // InternalBPMN_translator.g:3866:2: rule__Sensor__Group_0__2__Impl rule__Sensor__Group_0__3
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
    // InternalBPMN_translator.g:3873:1: rule__Sensor__Group_0__2__Impl : ( ( rule__Sensor__SensorAssignment_0_2 ) ) ;
    public final void rule__Sensor__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3877:1: ( ( ( rule__Sensor__SensorAssignment_0_2 ) ) )
            // InternalBPMN_translator.g:3878:1: ( ( rule__Sensor__SensorAssignment_0_2 ) )
            {
            // InternalBPMN_translator.g:3878:1: ( ( rule__Sensor__SensorAssignment_0_2 ) )
            // InternalBPMN_translator.g:3879:2: ( rule__Sensor__SensorAssignment_0_2 )
            {
             before(grammarAccess.getSensorAccess().getSensorAssignment_0_2()); 
            // InternalBPMN_translator.g:3880:2: ( rule__Sensor__SensorAssignment_0_2 )
            // InternalBPMN_translator.g:3880:3: rule__Sensor__SensorAssignment_0_2
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
    // InternalBPMN_translator.g:3888:1: rule__Sensor__Group_0__3 : rule__Sensor__Group_0__3__Impl ;
    public final void rule__Sensor__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3892:1: ( rule__Sensor__Group_0__3__Impl )
            // InternalBPMN_translator.g:3893:2: rule__Sensor__Group_0__3__Impl
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
    // InternalBPMN_translator.g:3899:1: rule__Sensor__Group_0__3__Impl : ( '}' ) ;
    public final void rule__Sensor__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3903:1: ( ( '}' ) )
            // InternalBPMN_translator.g:3904:1: ( '}' )
            {
            // InternalBPMN_translator.g:3904:1: ( '}' )
            // InternalBPMN_translator.g:3905:2: '}'
            {
             before(grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_0_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3915:1: rule__Sensor__Group_1__0 : rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1 ;
    public final void rule__Sensor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3919:1: ( rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1 )
            // InternalBPMN_translator.g:3920:2: rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1
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
    // InternalBPMN_translator.g:3927:1: rule__Sensor__Group_1__0__Impl : ( ( rule__Sensor__SnameAssignment_1_0 ) ) ;
    public final void rule__Sensor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3931:1: ( ( ( rule__Sensor__SnameAssignment_1_0 ) ) )
            // InternalBPMN_translator.g:3932:1: ( ( rule__Sensor__SnameAssignment_1_0 ) )
            {
            // InternalBPMN_translator.g:3932:1: ( ( rule__Sensor__SnameAssignment_1_0 ) )
            // InternalBPMN_translator.g:3933:2: ( rule__Sensor__SnameAssignment_1_0 )
            {
             before(grammarAccess.getSensorAccess().getSnameAssignment_1_0()); 
            // InternalBPMN_translator.g:3934:2: ( rule__Sensor__SnameAssignment_1_0 )
            // InternalBPMN_translator.g:3934:3: rule__Sensor__SnameAssignment_1_0
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
    // InternalBPMN_translator.g:3942:1: rule__Sensor__Group_1__1 : rule__Sensor__Group_1__1__Impl rule__Sensor__Group_1__2 ;
    public final void rule__Sensor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3946:1: ( rule__Sensor__Group_1__1__Impl rule__Sensor__Group_1__2 )
            // InternalBPMN_translator.g:3947:2: rule__Sensor__Group_1__1__Impl rule__Sensor__Group_1__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalBPMN_translator.g:3954:1: rule__Sensor__Group_1__1__Impl : ( '{' ) ;
    public final void rule__Sensor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3958:1: ( ( '{' ) )
            // InternalBPMN_translator.g:3959:1: ( '{' )
            {
            // InternalBPMN_translator.g:3959:1: ( '{' )
            // InternalBPMN_translator.g:3960:2: '{'
            {
             before(grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_1_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBPMN_translator.g:3969:1: rule__Sensor__Group_1__2 : rule__Sensor__Group_1__2__Impl rule__Sensor__Group_1__3 ;
    public final void rule__Sensor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3973:1: ( rule__Sensor__Group_1__2__Impl rule__Sensor__Group_1__3 )
            // InternalBPMN_translator.g:3974:2: rule__Sensor__Group_1__2__Impl rule__Sensor__Group_1__3
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
    // InternalBPMN_translator.g:3981:1: rule__Sensor__Group_1__2__Impl : ( ( rule__Sensor__SensorAssignment_1_2 ) ) ;
    public final void rule__Sensor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:3985:1: ( ( ( rule__Sensor__SensorAssignment_1_2 ) ) )
            // InternalBPMN_translator.g:3986:1: ( ( rule__Sensor__SensorAssignment_1_2 ) )
            {
            // InternalBPMN_translator.g:3986:1: ( ( rule__Sensor__SensorAssignment_1_2 ) )
            // InternalBPMN_translator.g:3987:2: ( rule__Sensor__SensorAssignment_1_2 )
            {
             before(grammarAccess.getSensorAccess().getSensorAssignment_1_2()); 
            // InternalBPMN_translator.g:3988:2: ( rule__Sensor__SensorAssignment_1_2 )
            // InternalBPMN_translator.g:3988:3: rule__Sensor__SensorAssignment_1_2
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
    // InternalBPMN_translator.g:3996:1: rule__Sensor__Group_1__3 : rule__Sensor__Group_1__3__Impl ;
    public final void rule__Sensor__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4000:1: ( rule__Sensor__Group_1__3__Impl )
            // InternalBPMN_translator.g:4001:2: rule__Sensor__Group_1__3__Impl
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
    // InternalBPMN_translator.g:4007:1: rule__Sensor__Group_1__3__Impl : ( '}' ) ;
    public final void rule__Sensor__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4011:1: ( ( '}' ) )
            // InternalBPMN_translator.g:4012:1: ( '}' )
            {
            // InternalBPMN_translator.g:4012:1: ( '}' )
            // InternalBPMN_translator.g:4013:2: '}'
            {
             before(grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4023:1: rule__Sensor_data__Group__0 : rule__Sensor_data__Group__0__Impl rule__Sensor_data__Group__1 ;
    public final void rule__Sensor_data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4027:1: ( rule__Sensor_data__Group__0__Impl rule__Sensor_data__Group__1 )
            // InternalBPMN_translator.g:4028:2: rule__Sensor_data__Group__0__Impl rule__Sensor_data__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalBPMN_translator.g:4035:1: rule__Sensor_data__Group__0__Impl : ( () ) ;
    public final void rule__Sensor_data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4039:1: ( ( () ) )
            // InternalBPMN_translator.g:4040:1: ( () )
            {
            // InternalBPMN_translator.g:4040:1: ( () )
            // InternalBPMN_translator.g:4041:2: ()
            {
             before(grammarAccess.getSensor_dataAccess().getSensor_dataAction_0()); 
            // InternalBPMN_translator.g:4042:2: ()
            // InternalBPMN_translator.g:4042:3: 
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
    // InternalBPMN_translator.g:4050:1: rule__Sensor_data__Group__1 : rule__Sensor_data__Group__1__Impl ;
    public final void rule__Sensor_data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4054:1: ( rule__Sensor_data__Group__1__Impl )
            // InternalBPMN_translator.g:4055:2: rule__Sensor_data__Group__1__Impl
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
    // InternalBPMN_translator.g:4061:1: rule__Sensor_data__Group__1__Impl : ( ( rule__Sensor_data__Alternatives_1 )* ) ;
    public final void rule__Sensor_data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4065:1: ( ( ( rule__Sensor_data__Alternatives_1 )* ) )
            // InternalBPMN_translator.g:4066:1: ( ( rule__Sensor_data__Alternatives_1 )* )
            {
            // InternalBPMN_translator.g:4066:1: ( ( rule__Sensor_data__Alternatives_1 )* )
            // InternalBPMN_translator.g:4067:2: ( rule__Sensor_data__Alternatives_1 )*
            {
             before(grammarAccess.getSensor_dataAccess().getAlternatives_1()); 
            // InternalBPMN_translator.g:4068:2: ( rule__Sensor_data__Alternatives_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==32||(LA25_0>=44 && LA25_0<=45)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBPMN_translator.g:4068:3: rule__Sensor_data__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__Sensor_data__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalBPMN_translator.g:4077:1: rule__Sensor_data__Group_1_0__0 : rule__Sensor_data__Group_1_0__0__Impl rule__Sensor_data__Group_1_0__1 ;
    public final void rule__Sensor_data__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4081:1: ( rule__Sensor_data__Group_1_0__0__Impl rule__Sensor_data__Group_1_0__1 )
            // InternalBPMN_translator.g:4082:2: rule__Sensor_data__Group_1_0__0__Impl rule__Sensor_data__Group_1_0__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBPMN_translator.g:4089:1: rule__Sensor_data__Group_1_0__0__Impl : ( 'NAME' ) ;
    public final void rule__Sensor_data__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4093:1: ( ( 'NAME' ) )
            // InternalBPMN_translator.g:4094:1: ( 'NAME' )
            {
            // InternalBPMN_translator.g:4094:1: ( 'NAME' )
            // InternalBPMN_translator.g:4095:2: 'NAME'
            {
             before(grammarAccess.getSensor_dataAccess().getNAMEKeyword_1_0_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4104:1: rule__Sensor_data__Group_1_0__1 : rule__Sensor_data__Group_1_0__1__Impl rule__Sensor_data__Group_1_0__2 ;
    public final void rule__Sensor_data__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4108:1: ( rule__Sensor_data__Group_1_0__1__Impl rule__Sensor_data__Group_1_0__2 )
            // InternalBPMN_translator.g:4109:2: rule__Sensor_data__Group_1_0__1__Impl rule__Sensor_data__Group_1_0__2
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
    // InternalBPMN_translator.g:4116:1: rule__Sensor_data__Group_1_0__1__Impl : ( '=' ) ;
    public final void rule__Sensor_data__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4120:1: ( ( '=' ) )
            // InternalBPMN_translator.g:4121:1: ( '=' )
            {
            // InternalBPMN_translator.g:4121:1: ( '=' )
            // InternalBPMN_translator.g:4122:2: '='
            {
             before(grammarAccess.getSensor_dataAccess().getEqualsSignKeyword_1_0_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4131:1: rule__Sensor_data__Group_1_0__2 : rule__Sensor_data__Group_1_0__2__Impl ;
    public final void rule__Sensor_data__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4135:1: ( rule__Sensor_data__Group_1_0__2__Impl )
            // InternalBPMN_translator.g:4136:2: rule__Sensor_data__Group_1_0__2__Impl
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
    // InternalBPMN_translator.g:4142:1: rule__Sensor_data__Group_1_0__2__Impl : ( ( rule__Sensor_data__PnameAssignment_1_0_2 ) ) ;
    public final void rule__Sensor_data__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4146:1: ( ( ( rule__Sensor_data__PnameAssignment_1_0_2 ) ) )
            // InternalBPMN_translator.g:4147:1: ( ( rule__Sensor_data__PnameAssignment_1_0_2 ) )
            {
            // InternalBPMN_translator.g:4147:1: ( ( rule__Sensor_data__PnameAssignment_1_0_2 ) )
            // InternalBPMN_translator.g:4148:2: ( rule__Sensor_data__PnameAssignment_1_0_2 )
            {
             before(grammarAccess.getSensor_dataAccess().getPnameAssignment_1_0_2()); 
            // InternalBPMN_translator.g:4149:2: ( rule__Sensor_data__PnameAssignment_1_0_2 )
            // InternalBPMN_translator.g:4149:3: rule__Sensor_data__PnameAssignment_1_0_2
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
    // InternalBPMN_translator.g:4158:1: rule__Sensor_data__Group_1_1__0 : rule__Sensor_data__Group_1_1__0__Impl rule__Sensor_data__Group_1_1__1 ;
    public final void rule__Sensor_data__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4162:1: ( rule__Sensor_data__Group_1_1__0__Impl rule__Sensor_data__Group_1_1__1 )
            // InternalBPMN_translator.g:4163:2: rule__Sensor_data__Group_1_1__0__Impl rule__Sensor_data__Group_1_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBPMN_translator.g:4170:1: rule__Sensor_data__Group_1_1__0__Impl : ( 'PINS' ) ;
    public final void rule__Sensor_data__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4174:1: ( ( 'PINS' ) )
            // InternalBPMN_translator.g:4175:1: ( 'PINS' )
            {
            // InternalBPMN_translator.g:4175:1: ( 'PINS' )
            // InternalBPMN_translator.g:4176:2: 'PINS'
            {
             before(grammarAccess.getSensor_dataAccess().getPINSKeyword_1_1_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4185:1: rule__Sensor_data__Group_1_1__1 : rule__Sensor_data__Group_1_1__1__Impl rule__Sensor_data__Group_1_1__2 ;
    public final void rule__Sensor_data__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4189:1: ( rule__Sensor_data__Group_1_1__1__Impl rule__Sensor_data__Group_1_1__2 )
            // InternalBPMN_translator.g:4190:2: rule__Sensor_data__Group_1_1__1__Impl rule__Sensor_data__Group_1_1__2
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
    // InternalBPMN_translator.g:4197:1: rule__Sensor_data__Group_1_1__1__Impl : ( '=' ) ;
    public final void rule__Sensor_data__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4201:1: ( ( '=' ) )
            // InternalBPMN_translator.g:4202:1: ( '=' )
            {
            // InternalBPMN_translator.g:4202:1: ( '=' )
            // InternalBPMN_translator.g:4203:2: '='
            {
             before(grammarAccess.getSensor_dataAccess().getEqualsSignKeyword_1_1_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4212:1: rule__Sensor_data__Group_1_1__2 : rule__Sensor_data__Group_1_1__2__Impl ;
    public final void rule__Sensor_data__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4216:1: ( rule__Sensor_data__Group_1_1__2__Impl )
            // InternalBPMN_translator.g:4217:2: rule__Sensor_data__Group_1_1__2__Impl
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
    // InternalBPMN_translator.g:4223:1: rule__Sensor_data__Group_1_1__2__Impl : ( ( rule__Sensor_data__PinsAssignment_1_1_2 ) ) ;
    public final void rule__Sensor_data__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4227:1: ( ( ( rule__Sensor_data__PinsAssignment_1_1_2 ) ) )
            // InternalBPMN_translator.g:4228:1: ( ( rule__Sensor_data__PinsAssignment_1_1_2 ) )
            {
            // InternalBPMN_translator.g:4228:1: ( ( rule__Sensor_data__PinsAssignment_1_1_2 ) )
            // InternalBPMN_translator.g:4229:2: ( rule__Sensor_data__PinsAssignment_1_1_2 )
            {
             before(grammarAccess.getSensor_dataAccess().getPinsAssignment_1_1_2()); 
            // InternalBPMN_translator.g:4230:2: ( rule__Sensor_data__PinsAssignment_1_1_2 )
            // InternalBPMN_translator.g:4230:3: rule__Sensor_data__PinsAssignment_1_1_2
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
    // InternalBPMN_translator.g:4239:1: rule__Sensor_data__Group_1_2__0 : rule__Sensor_data__Group_1_2__0__Impl rule__Sensor_data__Group_1_2__1 ;
    public final void rule__Sensor_data__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4243:1: ( rule__Sensor_data__Group_1_2__0__Impl rule__Sensor_data__Group_1_2__1 )
            // InternalBPMN_translator.g:4244:2: rule__Sensor_data__Group_1_2__0__Impl rule__Sensor_data__Group_1_2__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBPMN_translator.g:4251:1: rule__Sensor_data__Group_1_2__0__Impl : ( 'SENSOR_ID' ) ;
    public final void rule__Sensor_data__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4255:1: ( ( 'SENSOR_ID' ) )
            // InternalBPMN_translator.g:4256:1: ( 'SENSOR_ID' )
            {
            // InternalBPMN_translator.g:4256:1: ( 'SENSOR_ID' )
            // InternalBPMN_translator.g:4257:2: 'SENSOR_ID'
            {
             before(grammarAccess.getSensor_dataAccess().getSENSOR_IDKeyword_1_2_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4266:1: rule__Sensor_data__Group_1_2__1 : rule__Sensor_data__Group_1_2__1__Impl rule__Sensor_data__Group_1_2__2 ;
    public final void rule__Sensor_data__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4270:1: ( rule__Sensor_data__Group_1_2__1__Impl rule__Sensor_data__Group_1_2__2 )
            // InternalBPMN_translator.g:4271:2: rule__Sensor_data__Group_1_2__1__Impl rule__Sensor_data__Group_1_2__2
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
    // InternalBPMN_translator.g:4278:1: rule__Sensor_data__Group_1_2__1__Impl : ( '=' ) ;
    public final void rule__Sensor_data__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4282:1: ( ( '=' ) )
            // InternalBPMN_translator.g:4283:1: ( '=' )
            {
            // InternalBPMN_translator.g:4283:1: ( '=' )
            // InternalBPMN_translator.g:4284:2: '='
            {
             before(grammarAccess.getSensor_dataAccess().getEqualsSignKeyword_1_2_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4293:1: rule__Sensor_data__Group_1_2__2 : rule__Sensor_data__Group_1_2__2__Impl ;
    public final void rule__Sensor_data__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4297:1: ( rule__Sensor_data__Group_1_2__2__Impl )
            // InternalBPMN_translator.g:4298:2: rule__Sensor_data__Group_1_2__2__Impl
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
    // InternalBPMN_translator.g:4304:1: rule__Sensor_data__Group_1_2__2__Impl : ( ( rule__Sensor_data__Sensor_idAssignment_1_2_2 ) ) ;
    public final void rule__Sensor_data__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4308:1: ( ( ( rule__Sensor_data__Sensor_idAssignment_1_2_2 ) ) )
            // InternalBPMN_translator.g:4309:1: ( ( rule__Sensor_data__Sensor_idAssignment_1_2_2 ) )
            {
            // InternalBPMN_translator.g:4309:1: ( ( rule__Sensor_data__Sensor_idAssignment_1_2_2 ) )
            // InternalBPMN_translator.g:4310:2: ( rule__Sensor_data__Sensor_idAssignment_1_2_2 )
            {
             before(grammarAccess.getSensor_dataAccess().getSensor_idAssignment_1_2_2()); 
            // InternalBPMN_translator.g:4311:2: ( rule__Sensor_data__Sensor_idAssignment_1_2_2 )
            // InternalBPMN_translator.g:4311:3: rule__Sensor_data__Sensor_idAssignment_1_2_2
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
    // InternalBPMN_translator.g:4320:1: rule__Model__ModelAssignment : ( ruleXml ) ;
    public final void rule__Model__ModelAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4324:1: ( ( ruleXml ) )
            // InternalBPMN_translator.g:4325:2: ( ruleXml )
            {
            // InternalBPMN_translator.g:4325:2: ( ruleXml )
            // InternalBPMN_translator.g:4326:3: ruleXml
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
    // InternalBPMN_translator.g:4335:1: rule__Xml__ProvaAssignment_2 : ( ruleelement ) ;
    public final void rule__Xml__ProvaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4339:1: ( ( ruleelement ) )
            // InternalBPMN_translator.g:4340:2: ( ruleelement )
            {
            // InternalBPMN_translator.g:4340:2: ( ruleelement )
            // InternalBPMN_translator.g:4341:3: ruleelement
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
    // InternalBPMN_translator.g:4350:1: rule__Element__OpenAssignment_0_0 : ( ruleOpen ) ;
    public final void rule__Element__OpenAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4354:1: ( ( ruleOpen ) )
            // InternalBPMN_translator.g:4355:2: ( ruleOpen )
            {
            // InternalBPMN_translator.g:4355:2: ( ruleOpen )
            // InternalBPMN_translator.g:4356:3: ruleOpen
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
    // InternalBPMN_translator.g:4365:1: rule__Element__ContentsAssignment_0_1 : ( rulecontent ) ;
    public final void rule__Element__ContentsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4369:1: ( ( rulecontent ) )
            // InternalBPMN_translator.g:4370:2: ( rulecontent )
            {
            // InternalBPMN_translator.g:4370:2: ( rulecontent )
            // InternalBPMN_translator.g:4371:3: rulecontent
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
    // InternalBPMN_translator.g:4380:1: rule__Element__Close_tagAssignment_0_2 : ( ruleClose ) ;
    public final void rule__Element__Close_tagAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4384:1: ( ( ruleClose ) )
            // InternalBPMN_translator.g:4385:2: ( ruleClose )
            {
            // InternalBPMN_translator.g:4385:2: ( ruleClose )
            // InternalBPMN_translator.g:4386:3: ruleClose
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
    // InternalBPMN_translator.g:4395:1: rule__Element__Singleton_tagAssignment_1 : ( ruleSingleton ) ;
    public final void rule__Element__Singleton_tagAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4399:1: ( ( ruleSingleton ) )
            // InternalBPMN_translator.g:4400:2: ( ruleSingleton )
            {
            // InternalBPMN_translator.g:4400:2: ( ruleSingleton )
            // InternalBPMN_translator.g:4401:3: ruleSingleton
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
    // InternalBPMN_translator.g:4410:1: rule__Content__TypeAssignment_1_0_0 : ( ( rule__Content__TypeAlternatives_1_0_0_0 ) ) ;
    public final void rule__Content__TypeAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4414:1: ( ( ( rule__Content__TypeAlternatives_1_0_0_0 ) ) )
            // InternalBPMN_translator.g:4415:2: ( ( rule__Content__TypeAlternatives_1_0_0_0 ) )
            {
            // InternalBPMN_translator.g:4415:2: ( ( rule__Content__TypeAlternatives_1_0_0_0 ) )
            // InternalBPMN_translator.g:4416:3: ( rule__Content__TypeAlternatives_1_0_0_0 )
            {
             before(grammarAccess.getContentAccess().getTypeAlternatives_1_0_0_0()); 
            // InternalBPMN_translator.g:4417:3: ( rule__Content__TypeAlternatives_1_0_0_0 )
            // InternalBPMN_translator.g:4417:4: rule__Content__TypeAlternatives_1_0_0_0
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
    // InternalBPMN_translator.g:4425:1: rule__Content__CodexAssignment_1_0_2 : ( rulecodex ) ;
    public final void rule__Content__CodexAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4429:1: ( ( rulecodex ) )
            // InternalBPMN_translator.g:4430:2: ( rulecodex )
            {
            // InternalBPMN_translator.g:4430:2: ( rulecodex )
            // InternalBPMN_translator.g:4431:3: rulecodex
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
    // InternalBPMN_translator.g:4440:1: rule__Content__ElementAssignment_1_1 : ( ruleelement ) ;
    public final void rule__Content__ElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4444:1: ( ( ruleelement ) )
            // InternalBPMN_translator.g:4445:2: ( ruleelement )
            {
            // InternalBPMN_translator.g:4445:2: ( ruleelement )
            // InternalBPMN_translator.g:4446:3: ruleelement
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


    // $ANTLR start "rule__Content__BodyAssignment_1_2"
    // InternalBPMN_translator.g:4455:1: rule__Content__BodyAssignment_1_2 : ( RULE_BODY ) ;
    public final void rule__Content__BodyAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4459:1: ( ( RULE_BODY ) )
            // InternalBPMN_translator.g:4460:2: ( RULE_BODY )
            {
            // InternalBPMN_translator.g:4460:2: ( RULE_BODY )
            // InternalBPMN_translator.g:4461:3: RULE_BODY
            {
             before(grammarAccess.getContentAccess().getBodyBODYTerminalRuleCall_1_2_0()); 
            match(input,RULE_BODY,FOLLOW_2); 
             after(grammarAccess.getContentAccess().getBodyBODYTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__BodyAssignment_1_2"


    // $ANTLR start "rule__Content__KeywordsAssignment_1_3"
    // InternalBPMN_translator.g:4470:1: rule__Content__KeywordsAssignment_1_3 : ( RULE_KEYWORDS ) ;
    public final void rule__Content__KeywordsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4474:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:4475:2: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:4475:2: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:4476:3: RULE_KEYWORDS
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
    // InternalBPMN_translator.g:4485:1: rule__Content__DataAssignment_1_4 : ( RULE_STRING ) ;
    public final void rule__Content__DataAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4489:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:4490:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:4490:2: ( RULE_STRING )
            // InternalBPMN_translator.g:4491:3: RULE_STRING
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
    // InternalBPMN_translator.g:4500:1: rule__Open__HeadAssignment_1 : ( RULE_HEAD ) ;
    public final void rule__Open__HeadAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4504:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:4505:2: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:4505:2: ( RULE_HEAD )
            // InternalBPMN_translator.g:4506:3: RULE_HEAD
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
    // InternalBPMN_translator.g:4515:1: rule__Open__KeywordsAssignment_3 : ( RULE_KEYWORDS ) ;
    public final void rule__Open__KeywordsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4519:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:4520:2: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:4520:2: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:4521:3: RULE_KEYWORDS
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
    // InternalBPMN_translator.g:4530:1: rule__Open__Head1Assignment_4_0_0 : ( RULE_HEAD ) ;
    public final void rule__Open__Head1Assignment_4_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4534:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:4535:2: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:4535:2: ( RULE_HEAD )
            // InternalBPMN_translator.g:4536:3: RULE_HEAD
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
    // InternalBPMN_translator.g:4545:1: rule__Open__Head1Assignment_4_1_0_0 : ( RULE_HEAD ) ;
    public final void rule__Open__Head1Assignment_4_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4549:1: ( ( RULE_HEAD ) )
            // InternalBPMN_translator.g:4550:2: ( RULE_HEAD )
            {
            // InternalBPMN_translator.g:4550:2: ( RULE_HEAD )
            // InternalBPMN_translator.g:4551:3: RULE_HEAD
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
    // InternalBPMN_translator.g:4560:1: rule__Open__Keywords1Assignment_4_1_0_1 : ( RULE_KEYWORDS ) ;
    public final void rule__Open__Keywords1Assignment_4_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4564:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:4565:2: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:4565:2: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:4566:3: RULE_KEYWORDS
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
    // InternalBPMN_translator.g:4575:1: rule__Open__ValueAssignment_4_1_2 : ( RULE_STRING ) ;
    public final void rule__Open__ValueAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4579:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:4580:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:4580:2: ( RULE_STRING )
            // InternalBPMN_translator.g:4581:3: RULE_STRING
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
    // InternalBPMN_translator.g:4590:1: rule__Singleton__KeywordsAssignment_1_3 : ( RULE_KEYWORDS ) ;
    public final void rule__Singleton__KeywordsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4594:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:4595:2: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:4595:2: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:4596:3: RULE_KEYWORDS
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
    // InternalBPMN_translator.g:4605:1: rule__Singleton__Keywords1Assignment_1_4_1_0 : ( RULE_KEYWORDS ) ;
    public final void rule__Singleton__Keywords1Assignment_1_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4609:1: ( ( RULE_KEYWORDS ) )
            // InternalBPMN_translator.g:4610:2: ( RULE_KEYWORDS )
            {
            // InternalBPMN_translator.g:4610:2: ( RULE_KEYWORDS )
            // InternalBPMN_translator.g:4611:3: RULE_KEYWORDS
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
    // InternalBPMN_translator.g:4620:1: rule__Singleton__ValueAssignment_1_4_1_2 : ( RULE_STRING ) ;
    public final void rule__Singleton__ValueAssignment_1_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4624:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:4625:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:4625:2: ( RULE_STRING )
            // InternalBPMN_translator.g:4626:3: RULE_STRING
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
    // InternalBPMN_translator.g:4635:1: rule__Codex__Device_codeAssignment_0 : ( ruledevice ) ;
    public final void rule__Codex__Device_codeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4639:1: ( ( ruledevice ) )
            // InternalBPMN_translator.g:4640:2: ( ruledevice )
            {
            // InternalBPMN_translator.g:4640:2: ( ruledevice )
            // InternalBPMN_translator.g:4641:3: ruledevice
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
    // InternalBPMN_translator.g:4650:1: rule__Codex__ProtocolAssignment_1 : ( ruleprotocol ) ;
    public final void rule__Codex__ProtocolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4654:1: ( ( ruleprotocol ) )
            // InternalBPMN_translator.g:4655:2: ( ruleprotocol )
            {
            // InternalBPMN_translator.g:4655:2: ( ruleprotocol )
            // InternalBPMN_translator.g:4656:3: ruleprotocol
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
    // InternalBPMN_translator.g:4665:1: rule__Codex__Sensor_codeAssignment_2 : ( rulesensor ) ;
    public final void rule__Codex__Sensor_codeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4669:1: ( ( rulesensor ) )
            // InternalBPMN_translator.g:4670:2: ( rulesensor )
            {
            // InternalBPMN_translator.g:4670:2: ( rulesensor )
            // InternalBPMN_translator.g:4671:3: rulesensor
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
    // InternalBPMN_translator.g:4680:1: rule__Device__DeviceAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Device__DeviceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4684:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:4685:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:4685:2: ( RULE_STRING )
            // InternalBPMN_translator.g:4686:3: RULE_STRING
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
    // InternalBPMN_translator.g:4695:1: rule__Device__IdAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Device__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4699:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:4700:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:4700:2: ( RULE_STRING )
            // InternalBPMN_translator.g:4701:3: RULE_STRING
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


    // $ANTLR start "rule__Protocol__PnameAssignment_0"
    // InternalBPMN_translator.g:4710:1: rule__Protocol__PnameAssignment_0 : ( ( 'MQTT' ) ) ;
    public final void rule__Protocol__PnameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4714:1: ( ( ( 'MQTT' ) ) )
            // InternalBPMN_translator.g:4715:2: ( ( 'MQTT' ) )
            {
            // InternalBPMN_translator.g:4715:2: ( ( 'MQTT' ) )
            // InternalBPMN_translator.g:4716:3: ( 'MQTT' )
            {
             before(grammarAccess.getProtocolAccess().getPnameMQTTKeyword_0_0()); 
            // InternalBPMN_translator.g:4717:3: ( 'MQTT' )
            // InternalBPMN_translator.g:4718:4: 'MQTT'
            {
             before(grammarAccess.getProtocolAccess().getPnameMQTTKeyword_0_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getProtocolAccess().getPnameMQTTKeyword_0_0()); 

            }

             after(grammarAccess.getProtocolAccess().getPnameMQTTKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__PnameAssignment_0"


    // $ANTLR start "rule__Protocol__Mqtt_dataAssignment_2_0"
    // InternalBPMN_translator.g:4729:1: rule__Protocol__Mqtt_dataAssignment_2_0 : ( rulemqtt_data ) ;
    public final void rule__Protocol__Mqtt_dataAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4733:1: ( ( rulemqtt_data ) )
            // InternalBPMN_translator.g:4734:2: ( rulemqtt_data )
            {
            // InternalBPMN_translator.g:4734:2: ( rulemqtt_data )
            // InternalBPMN_translator.g:4735:3: rulemqtt_data
            {
             before(grammarAccess.getProtocolAccess().getMqtt_dataMqtt_dataParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            rulemqtt_data();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getMqtt_dataMqtt_dataParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Mqtt_dataAssignment_2_0"


    // $ANTLR start "rule__Protocol__Mqtt_deviceAssignment_2_1"
    // InternalBPMN_translator.g:4744:1: rule__Protocol__Mqtt_deviceAssignment_2_1 : ( rulemqtt_device ) ;
    public final void rule__Protocol__Mqtt_deviceAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4748:1: ( ( rulemqtt_device ) )
            // InternalBPMN_translator.g:4749:2: ( rulemqtt_device )
            {
            // InternalBPMN_translator.g:4749:2: ( rulemqtt_device )
            // InternalBPMN_translator.g:4750:3: rulemqtt_device
            {
             before(grammarAccess.getProtocolAccess().getMqtt_deviceMqtt_deviceParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulemqtt_device();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getMqtt_deviceMqtt_deviceParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Mqtt_deviceAssignment_2_1"


    // $ANTLR start "rule__Mqtt_data__PnameAssignment_1_0_2"
    // InternalBPMN_translator.g:4759:1: rule__Mqtt_data__PnameAssignment_1_0_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_data__PnameAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4763:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:4764:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:4764:2: ( RULE_STRING )
            // InternalBPMN_translator.g:4765:3: RULE_STRING
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
    // InternalBPMN_translator.g:4774:1: rule__Mqtt_data__Broker_userAssignment_1_1_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_data__Broker_userAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4778:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:4779:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:4779:2: ( RULE_STRING )
            // InternalBPMN_translator.g:4780:3: RULE_STRING
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
    // InternalBPMN_translator.g:4789:1: rule__Mqtt_data__Broker_passwordAssignment_1_2_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_data__Broker_passwordAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4793:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:4794:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:4794:2: ( RULE_STRING )
            // InternalBPMN_translator.g:4795:3: RULE_STRING
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
    // InternalBPMN_translator.g:4804:1: rule__Mqtt_data__BrokerAssignment_1_3_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_data__BrokerAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4808:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:4809:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:4809:2: ( RULE_STRING )
            // InternalBPMN_translator.g:4810:3: RULE_STRING
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
    // InternalBPMN_translator.g:4819:1: rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2 : ( rulemqtt_network_data ) ;
    public final void rule__Mqtt_data__Mqtt_network_dataAssignment_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4823:1: ( ( rulemqtt_network_data ) )
            // InternalBPMN_translator.g:4824:2: ( rulemqtt_network_data )
            {
            // InternalBPMN_translator.g:4824:2: ( rulemqtt_network_data )
            // InternalBPMN_translator.g:4825:3: rulemqtt_network_data
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
    // InternalBPMN_translator.g:4834:1: rule__Mqtt_data__SubtopicsAssignment_1_5_2_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_data__SubtopicsAssignment_1_5_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4838:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:4839:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:4839:2: ( RULE_STRING )
            // InternalBPMN_translator.g:4840:3: RULE_STRING
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
    // InternalBPMN_translator.g:4849:1: rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_data__PubtopicsAssignment_1_6_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4853:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:4854:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:4854:2: ( RULE_STRING )
            // InternalBPMN_translator.g:4855:3: RULE_STRING
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
    // InternalBPMN_translator.g:4864:1: rule__Mqtt_data__ValueAssignment_1_6_2_1_2 : ( ( rule__Mqtt_data__ValueAlternatives_1_6_2_1_2_0 ) ) ;
    public final void rule__Mqtt_data__ValueAssignment_1_6_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4868:1: ( ( ( rule__Mqtt_data__ValueAlternatives_1_6_2_1_2_0 ) ) )
            // InternalBPMN_translator.g:4869:2: ( ( rule__Mqtt_data__ValueAlternatives_1_6_2_1_2_0 ) )
            {
            // InternalBPMN_translator.g:4869:2: ( ( rule__Mqtt_data__ValueAlternatives_1_6_2_1_2_0 ) )
            // InternalBPMN_translator.g:4870:3: ( rule__Mqtt_data__ValueAlternatives_1_6_2_1_2_0 )
            {
             before(grammarAccess.getMqtt_dataAccess().getValueAlternatives_1_6_2_1_2_0()); 
            // InternalBPMN_translator.g:4871:3: ( rule__Mqtt_data__ValueAlternatives_1_6_2_1_2_0 )
            // InternalBPMN_translator.g:4871:4: rule__Mqtt_data__ValueAlternatives_1_6_2_1_2_0
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


    // $ANTLR start "rule__Mqtt_network_data__SsidAssignment_2"
    // InternalBPMN_translator.g:4879:1: rule__Mqtt_network_data__SsidAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Mqtt_network_data__SsidAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4883:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:4884:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:4884:2: ( RULE_STRING )
            // InternalBPMN_translator.g:4885:3: RULE_STRING
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
    // InternalBPMN_translator.g:4894:1: rule__Mqtt_network_data__PasswordAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Mqtt_network_data__PasswordAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4898:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:4899:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:4899:2: ( RULE_STRING )
            // InternalBPMN_translator.g:4900:3: RULE_STRING
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
    // InternalBPMN_translator.g:4909:1: rule__Mqtt_device__DnameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Mqtt_device__DnameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4913:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:4914:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:4914:2: ( RULE_STRING )
            // InternalBPMN_translator.g:4915:3: RULE_STRING
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
    // InternalBPMN_translator.g:4924:1: rule__Sensor__SnameAssignment_0_0 : ( ( 'TEMPERATURE' ) ) ;
    public final void rule__Sensor__SnameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4928:1: ( ( ( 'TEMPERATURE' ) ) )
            // InternalBPMN_translator.g:4929:2: ( ( 'TEMPERATURE' ) )
            {
            // InternalBPMN_translator.g:4929:2: ( ( 'TEMPERATURE' ) )
            // InternalBPMN_translator.g:4930:3: ( 'TEMPERATURE' )
            {
             before(grammarAccess.getSensorAccess().getSnameTEMPERATUREKeyword_0_0_0()); 
            // InternalBPMN_translator.g:4931:3: ( 'TEMPERATURE' )
            // InternalBPMN_translator.g:4932:4: 'TEMPERATURE'
            {
             before(grammarAccess.getSensorAccess().getSnameTEMPERATUREKeyword_0_0_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4943:1: rule__Sensor__SensorAssignment_0_2 : ( rulesensor_data ) ;
    public final void rule__Sensor__SensorAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4947:1: ( ( rulesensor_data ) )
            // InternalBPMN_translator.g:4948:2: ( rulesensor_data )
            {
            // InternalBPMN_translator.g:4948:2: ( rulesensor_data )
            // InternalBPMN_translator.g:4949:3: rulesensor_data
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
    // InternalBPMN_translator.g:4958:1: rule__Sensor__SnameAssignment_1_0 : ( ( 'DISTANCE' ) ) ;
    public final void rule__Sensor__SnameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4962:1: ( ( ( 'DISTANCE' ) ) )
            // InternalBPMN_translator.g:4963:2: ( ( 'DISTANCE' ) )
            {
            // InternalBPMN_translator.g:4963:2: ( ( 'DISTANCE' ) )
            // InternalBPMN_translator.g:4964:3: ( 'DISTANCE' )
            {
             before(grammarAccess.getSensorAccess().getSnameDISTANCEKeyword_1_0_0()); 
            // InternalBPMN_translator.g:4965:3: ( 'DISTANCE' )
            // InternalBPMN_translator.g:4966:4: 'DISTANCE'
            {
             before(grammarAccess.getSensorAccess().getSnameDISTANCEKeyword_1_0_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBPMN_translator.g:4977:1: rule__Sensor__SensorAssignment_1_2 : ( rulesensor_data ) ;
    public final void rule__Sensor__SensorAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4981:1: ( ( rulesensor_data ) )
            // InternalBPMN_translator.g:4982:2: ( rulesensor_data )
            {
            // InternalBPMN_translator.g:4982:2: ( rulesensor_data )
            // InternalBPMN_translator.g:4983:3: rulesensor_data
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
    // InternalBPMN_translator.g:4992:1: rule__Sensor_data__PnameAssignment_1_0_2 : ( RULE_STRING ) ;
    public final void rule__Sensor_data__PnameAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:4996:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:4997:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:4997:2: ( RULE_STRING )
            // InternalBPMN_translator.g:4998:3: RULE_STRING
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
    // InternalBPMN_translator.g:5007:1: rule__Sensor_data__PinsAssignment_1_1_2 : ( RULE_STRING ) ;
    public final void rule__Sensor_data__PinsAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5011:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:5012:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:5012:2: ( RULE_STRING )
            // InternalBPMN_translator.g:5013:3: RULE_STRING
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
    // InternalBPMN_translator.g:5022:1: rule__Sensor_data__Sensor_idAssignment_1_2_2 : ( RULE_STRING ) ;
    public final void rule__Sensor_data__Sensor_idAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPMN_translator.g:5026:1: ( ( RULE_STRING ) )
            // InternalBPMN_translator.g:5027:2: ( RULE_STRING )
            {
            // InternalBPMN_translator.g:5027:2: ( RULE_STRING )
            // InternalBPMN_translator.g:5028:3: RULE_STRING
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
    static final String dfa_2s = "\1\30\1\5\1\31\1\6\1\5\1\31\1\33\2\uffff\1\5\1\4\1\5";
    static final String dfa_3s = "\1\30\1\5\1\31\1\6\1\34\2\33\2\uffff\1\34\1\4\1\34";
    static final String dfa_4s = "\7\uffff\1\1\1\2\3\uffff";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5\1\6\23\uffff\1\7\1\uffff\1\10",
            "\1\11\1\uffff\1\7",
            "\1\12",
            "",
            "",
            "\1\5\1\6\23\uffff\1\7\1\uffff\1\10",
            "\1\13",
            "\1\5\1\6\23\uffff\1\7\1\uffff\1\10"
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
            return "477:1: rule__Element__Alternatives : ( ( ( rule__Element__Group_0__0 ) ) | ( ( rule__Element__Singleton_tagAssignment_1 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000100C0D0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000100C0D2L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000060L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000400000030000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000BF00000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000BF00000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000800000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000800000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000014000800000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000014000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000300100000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000300100000002L});

}