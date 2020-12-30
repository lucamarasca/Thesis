// $ANTLR 3.5.1 C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g 2020-12-30 15:46:06

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class DebugInternalBPMN_translatorParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANY_OTHER", "RULE_BODY", 
		"RULE_HEAD", "RULE_ID", "RULE_INT", "RULE_KEYWORDS", "RULE_ML_COMMENT", 
		"RULE_SL_COMMENT", "RULE_STRING", "RULE_WS", "'!'", "'&&'", "'&ge;'", 
		"'&gt;'", "'&le;'", "'&lt;'", "'('", "')'", "','", "'/>'", "':'", "'<'", 
		"'</'", "'<?'", "'='", "'>'", "'?>'", "'BROKER'", "'BROKER_PASSWORD'", 
		"'BROKER_USER'", "'DATA'", "'DEVICE'", "'DISTANCE'", "'MQTT'", "'NAME'", 
		"'NAMEID'", "'NETWORK'", "'PASSWORD'", "'PINS'", "'PROTOCOL_DEVICE'", 
		"'PUBTOPICS'", "'SENSOR_ID'", "'SSID'", "'SUBTOPICS'", "'TEMPERATURE'", 
		"'TOPIC_NAME'", "'['", "']'", "'_GATEWAY'", "'_TASK'", "'encoding='", 
		"'version='", "'{'", "'||'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int RULE_ANY_OTHER=4;
	public static final int RULE_BODY=5;
	public static final int RULE_HEAD=6;
	public static final int RULE_ID=7;
	public static final int RULE_INT=8;
	public static final int RULE_KEYWORDS=9;
	public static final int RULE_ML_COMMENT=10;
	public static final int RULE_SL_COMMENT=11;
	public static final int RULE_STRING=12;
	public static final int RULE_WS=13;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "ruleconditions", "ruleprotocol", "ruleXml", "ruleSingleton", 
		"ruleModel", "rulemqtt_data", "rulesensor", "ruleelement", "rulesensor_data", 
		"ruleprolog", "rulecontent", "rulemqtt_device", "ruleClose", "rulevariables", 
		"rulepreconditions", "ruleOpen", "ruledevice", "rulemqtt_network_data", 
		"rulecodex"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public DebugInternalBPMN_translatorParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public DebugInternalBPMN_translatorParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public DebugInternalBPMN_translatorParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return DebugInternalBPMN_translatorParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g"; }



	// $ANTLR start "ruleModel"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:7:1: ruleModel : ruleXml ;
	public final void ruleModel() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleModel");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(7, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:7:10: ( ruleXml )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:8:2: ruleXml
			{
			dbg.location(8,2);
			pushFollow(FOLLOW_ruleXml_in_ruleModel13);
			ruleXml();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(9, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleModel");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleModel"



	// $ANTLR start "ruleXml"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:12:1: ruleXml : ( ruleprolog )? ( ruleelement )* ;
	public final void ruleXml() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleXml");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(12, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:12:8: ( ( ruleprolog )? ( ruleelement )* )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:13:2: ( ruleprolog )? ( ruleelement )*
			{
			dbg.location(13,2);
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:13:2: ( ruleprolog )?
			int alt1=2;
			try { dbg.enterSubRule(1);
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			int LA1_0 = input.LA(1);
			if ( (LA1_0==27) ) {
				alt1=1;
			}
			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:13:2: ruleprolog
					{
					dbg.location(13,2);
					pushFollow(FOLLOW_ruleprolog_in_ruleXml23);
					ruleprolog();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(14,2);
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:14:2: ( ruleelement )*
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==25) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:14:2: ruleelement
					{
					dbg.location(14,2);
					pushFollow(FOLLOW_ruleelement_in_ruleXml27);
					ruleelement();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}
			} finally {dbg.exitSubRule(2);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(16, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleXml");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleXml"



	// $ANTLR start "ruleprolog"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:19:1: ruleprolog : '<?' RULE_HEAD 'version=' RULE_STRING 'encoding=' RULE_STRING '?>' ;
	public final void ruleprolog() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleprolog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(19, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:19:11: ( '<?' RULE_HEAD 'version=' RULE_STRING 'encoding=' RULE_STRING '?>' )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:20:2: '<?' RULE_HEAD 'version=' RULE_STRING 'encoding=' RULE_STRING '?>'
			{
			dbg.location(20,2);
			match(input,27,FOLLOW_27_in_ruleprolog40); dbg.location(21,2);
			match(input,RULE_HEAD,FOLLOW_RULE_HEAD_in_ruleprolog43); dbg.location(22,2);
			match(input,55,FOLLOW_55_in_ruleprolog46); dbg.location(23,2);
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleprolog49); dbg.location(24,2);
			match(input,54,FOLLOW_54_in_ruleprolog52); dbg.location(25,2);
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleprolog55); dbg.location(26,2);
			match(input,30,FOLLOW_30_in_ruleprolog58); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(27, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleprolog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleprolog"



	// $ANTLR start "ruleelement"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:30:1: ruleelement : ( ruleOpen rulecontent ruleClose | ruleSingleton ) ;
	public final void ruleelement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleelement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(30, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:30:12: ( ( ruleOpen rulecontent ruleClose | ruleSingleton ) )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:31:2: ( ruleOpen rulecontent ruleClose | ruleSingleton )
			{
			dbg.location(31,2);
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:31:2: ( ruleOpen rulecontent ruleClose | ruleSingleton )
			int alt3=2;
			try { dbg.enterSubRule(3);
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			try {
				isCyclicDecision = true;
				alt3 = dfa3.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:32:3: ruleOpen rulecontent ruleClose
					{
					dbg.location(32,3);
					pushFollow(FOLLOW_ruleOpen_in_ruleelement72);
					ruleOpen();
					state._fsp--;
					dbg.location(33,3);
					pushFollow(FOLLOW_rulecontent_in_ruleelement76);
					rulecontent();
					state._fsp--;
					dbg.location(34,3);
					pushFollow(FOLLOW_ruleClose_in_ruleelement80);
					ruleClose();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:36:3: ruleSingleton
					{
					dbg.location(36,3);
					pushFollow(FOLLOW_ruleSingleton_in_ruleelement92);
					ruleSingleton();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(3);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(38, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleelement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleelement"



	// $ANTLR start "rulecontent"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:41:1: rulecontent : ( ( '_TASK' | '_GATEWAY' ) '{' rulecodex '}' | ruleelement | ( rulepreconditions )* ( RULE_BODY | rulevariables ) ( ruleconditions )* | RULE_KEYWORDS | RULE_STRING )* ;
	public final void rulecontent() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulecontent");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(41, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:41:12: ( ( ( '_TASK' | '_GATEWAY' ) '{' rulecodex '}' | ruleelement | ( rulepreconditions )* ( RULE_BODY | rulevariables ) ( ruleconditions )* | RULE_KEYWORDS | RULE_STRING )* )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:42:2: ( ( '_TASK' | '_GATEWAY' ) '{' rulecodex '}' | ruleelement | ( rulepreconditions )* ( RULE_BODY | rulevariables ) ( ruleconditions )* | RULE_KEYWORDS | RULE_STRING )*
			{
			dbg.location(42,2);
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:42:2: ( ( '_TASK' | '_GATEWAY' ) '{' rulecodex '}' | ruleelement | ( rulepreconditions )* ( RULE_BODY | rulevariables ) ( ruleconditions )* | RULE_KEYWORDS | RULE_STRING )*
			try { dbg.enterSubRule(7);

			loop7:
			while (true) {
				int alt7=6;
				try { dbg.enterDecision(7, decisionCanBacktrack[7]);

				switch ( input.LA(1) ) {
				case 52:
				case 53:
					{
					alt7=1;
					}
					break;
				case 25:
					{
					alt7=2;
					}
					break;
				case RULE_BODY:
				case 14:
				case 20:
				case 48:
					{
					alt7=3;
					}
					break;
				case RULE_KEYWORDS:
					{
					alt7=4;
					}
					break;
				case RULE_STRING:
					{
					alt7=5;
					}
					break;
				}
				} finally {dbg.exitDecision(7);}

				switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:43:3: ( '_TASK' | '_GATEWAY' ) '{' rulecodex '}'
					{
					dbg.location(43,3);
					if ( (input.LA(1) >= 52 && input.LA(1) <= 53) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(48,3);
					match(input,56,FOLLOW_56_in_rulecontent136); dbg.location(49,3);
					pushFollow(FOLLOW_rulecodex_in_rulecontent140);
					rulecodex();
					state._fsp--;
					dbg.location(50,3);
					match(input,58,FOLLOW_58_in_rulecontent144); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:52:3: ruleelement
					{
					dbg.location(52,3);
					pushFollow(FOLLOW_ruleelement_in_rulecontent156);
					ruleelement();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:54:3: ( rulepreconditions )* ( RULE_BODY | rulevariables ) ( ruleconditions )*
					{
					dbg.location(54,3);
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:54:3: ( rulepreconditions )*
					try { dbg.enterSubRule(4);

					loop4:
					while (true) {
						int alt4=2;
						try { dbg.enterDecision(4, decisionCanBacktrack[4]);

						int LA4_0 = input.LA(1);
						if ( (LA4_0==14||LA4_0==20) ) {
							alt4=1;
						}

						} finally {dbg.exitDecision(4);}

						switch (alt4) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:54:3: rulepreconditions
							{
							dbg.location(54,3);
							pushFollow(FOLLOW_rulepreconditions_in_rulecontent168);
							rulepreconditions();
							state._fsp--;

							}
							break;

						default :
							break loop4;
						}
					}
					} finally {dbg.exitSubRule(4);}
					dbg.location(56,3);
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:56:3: ( RULE_BODY | rulevariables )
					int alt5=2;
					try { dbg.enterSubRule(5);
					try { dbg.enterDecision(5, decisionCanBacktrack[5]);

					int LA5_0 = input.LA(1);
					if ( (LA5_0==RULE_BODY) ) {
						int LA5_1 = input.LA(2);
						if ( (LA5_1==50) ) {
							alt5=2;
						}
						else if ( (LA5_1==RULE_BODY||LA5_1==RULE_KEYWORDS||LA5_1==RULE_STRING||(LA5_1 >= 14 && LA5_1 <= 21)||(LA5_1 >= 25 && LA5_1 <= 26)||LA5_1==28||LA5_1==48||(LA5_1 >= 52 && LA5_1 <= 53)||LA5_1==57) ) {
							alt5=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 5, 1, input);
								dbg.recognitionException(nvae);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA5_0==48) ) {
						alt5=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(5);}

					switch (alt5) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:57:4: RULE_BODY
							{
							dbg.location(57,4);
							match(input,RULE_BODY,FOLLOW_RULE_BODY_in_rulecontent181); 
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:58:9: rulevariables
							{
							dbg.location(58,9);
							pushFollow(FOLLOW_rulevariables_in_rulecontent191);
							rulevariables();
							state._fsp--;

							}
							break;

					}
					} finally {dbg.exitSubRule(5);}
					dbg.location(60,3);
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:3: ( ruleconditions )*
					try { dbg.enterSubRule(6);

					loop6:
					while (true) {
						int alt6=2;
						try { dbg.enterDecision(6, decisionCanBacktrack[6]);

						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= 15 && LA6_0 <= 19)||LA6_0==21||LA6_0==28||LA6_0==57) ) {
							alt6=1;
						}

						} finally {dbg.exitDecision(6);}

						switch (alt6) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:3: ruleconditions
							{
							dbg.location(60,3);
							pushFollow(FOLLOW_ruleconditions_in_rulecontent199);
							ruleconditions();
							state._fsp--;

							}
							break;

						default :
							break loop6;
						}
					}
					} finally {dbg.exitSubRule(6);}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:63:3: RULE_KEYWORDS
					{
					dbg.location(63,3);
					match(input,RULE_KEYWORDS,FOLLOW_RULE_KEYWORDS_in_rulecontent215); 
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:65:3: RULE_STRING
					{
					dbg.location(65,3);
					match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulecontent227); 
					}
					break;

				default :
					break loop7;
				}
			}
			} finally {dbg.exitSubRule(7);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(67, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulecontent");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulecontent"



	// $ANTLR start "ruleOpen"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:70:1: ruleOpen : '<' RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | ( RULE_HEAD | RULE_KEYWORDS ) '=' RULE_STRING )* '>' ;
	public final void ruleOpen() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleOpen");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(70, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:70:9: ( '<' RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | ( RULE_HEAD | RULE_KEYWORDS ) '=' RULE_STRING )* '>' )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:71:2: '<' RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | ( RULE_HEAD | RULE_KEYWORDS ) '=' RULE_STRING )* '>'
			{
			dbg.location(71,2);
			match(input,25,FOLLOW_25_in_ruleOpen241); dbg.location(72,2);
			match(input,RULE_HEAD,FOLLOW_RULE_HEAD_in_ruleOpen244); dbg.location(73,2);
			match(input,24,FOLLOW_24_in_ruleOpen247); dbg.location(74,2);
			match(input,RULE_KEYWORDS,FOLLOW_RULE_KEYWORDS_in_ruleOpen250); dbg.location(75,2);
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:75:2: ( RULE_HEAD ':' | ( RULE_HEAD | RULE_KEYWORDS ) '=' RULE_STRING )*
			try { dbg.enterSubRule(8);

			loop8:
			while (true) {
				int alt8=3;
				try { dbg.enterDecision(8, decisionCanBacktrack[8]);

				int LA8_0 = input.LA(1);
				if ( (LA8_0==RULE_HEAD) ) {
					int LA8_2 = input.LA(2);
					if ( (LA8_2==24) ) {
						alt8=1;
					}
					else if ( (LA8_2==28) ) {
						alt8=2;
					}

				}
				else if ( (LA8_0==RULE_KEYWORDS) ) {
					alt8=2;
				}

				} finally {dbg.exitDecision(8);}

				switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:76:3: RULE_HEAD ':'
					{
					dbg.location(76,3);
					match(input,RULE_HEAD,FOLLOW_RULE_HEAD_in_ruleOpen257); dbg.location(77,3);
					match(input,24,FOLLOW_24_in_ruleOpen261); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:79:3: ( RULE_HEAD | RULE_KEYWORDS ) '=' RULE_STRING
					{
					dbg.location(79,3);
					if ( input.LA(1)==RULE_HEAD||input.LA(1)==RULE_KEYWORDS ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(84,3);
					match(input,28,FOLLOW_28_in_ruleOpen300); dbg.location(85,3);
					match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOpen304); 
					}
					break;

				default :
					break loop8;
				}
			}
			} finally {dbg.exitSubRule(8);}
			dbg.location(87,2);
			match(input,29,FOLLOW_29_in_ruleOpen311); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(88, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleOpen");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleOpen"



	// $ANTLR start "ruleSingleton"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:91:1: ruleSingleton : '<' RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )* '/>' ;
	public final void ruleSingleton() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSingleton");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(91, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:91:14: ( '<' RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )* '/>' )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:92:2: '<' RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )* '/>'
			{
			dbg.location(92,2);
			match(input,25,FOLLOW_25_in_ruleSingleton321); dbg.location(93,2);
			match(input,RULE_HEAD,FOLLOW_RULE_HEAD_in_ruleSingleton324); dbg.location(94,2);
			match(input,24,FOLLOW_24_in_ruleSingleton327); dbg.location(95,2);
			match(input,RULE_KEYWORDS,FOLLOW_RULE_KEYWORDS_in_ruleSingleton330); dbg.location(96,2);
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:96:2: ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )*
			try { dbg.enterSubRule(9);

			loop9:
			while (true) {
				int alt9=3;
				try { dbg.enterDecision(9, decisionCanBacktrack[9]);

				int LA9_0 = input.LA(1);
				if ( (LA9_0==RULE_HEAD) ) {
					alt9=1;
				}
				else if ( (LA9_0==RULE_KEYWORDS) ) {
					alt9=2;
				}

				} finally {dbg.exitDecision(9);}

				switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:97:3: RULE_HEAD ':'
					{
					dbg.location(97,3);
					match(input,RULE_HEAD,FOLLOW_RULE_HEAD_in_ruleSingleton337); dbg.location(98,3);
					match(input,24,FOLLOW_24_in_ruleSingleton341); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:100:3: RULE_KEYWORDS '=' RULE_STRING
					{
					dbg.location(100,3);
					match(input,RULE_KEYWORDS,FOLLOW_RULE_KEYWORDS_in_ruleSingleton353); dbg.location(101,3);
					match(input,28,FOLLOW_28_in_ruleSingleton357); dbg.location(102,3);
					match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSingleton361); 
					}
					break;

				default :
					break loop9;
				}
			}
			} finally {dbg.exitSubRule(9);}
			dbg.location(104,2);
			match(input,23,FOLLOW_23_in_ruleSingleton368); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(105, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSingleton");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSingleton"



	// $ANTLR start "ruleClose"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:108:1: ruleClose : '</' RULE_HEAD ':' RULE_KEYWORDS '>' ;
	public final void ruleClose() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleClose");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(108, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:108:10: ( '</' RULE_HEAD ':' RULE_KEYWORDS '>' )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:109:2: '</' RULE_HEAD ':' RULE_KEYWORDS '>'
			{
			dbg.location(109,2);
			match(input,26,FOLLOW_26_in_ruleClose378); dbg.location(110,2);
			match(input,RULE_HEAD,FOLLOW_RULE_HEAD_in_ruleClose381); dbg.location(111,2);
			match(input,24,FOLLOW_24_in_ruleClose384); dbg.location(112,2);
			match(input,RULE_KEYWORDS,FOLLOW_RULE_KEYWORDS_in_ruleClose387); dbg.location(113,2);
			match(input,29,FOLLOW_29_in_ruleClose390); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(114, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleClose");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleClose"



	// $ANTLR start "rulevariables"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:117:1: rulevariables : ( 'TEMPERATURE' '[' RULE_BODY ',' RULE_BODY ']' | RULE_BODY '[' RULE_BODY ']' ) ;
	public final void rulevariables() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulevariables");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(117, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:117:14: ( ( 'TEMPERATURE' '[' RULE_BODY ',' RULE_BODY ']' | RULE_BODY '[' RULE_BODY ']' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:118:2: ( 'TEMPERATURE' '[' RULE_BODY ',' RULE_BODY ']' | RULE_BODY '[' RULE_BODY ']' )
			{
			dbg.location(118,2);
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:118:2: ( 'TEMPERATURE' '[' RULE_BODY ',' RULE_BODY ']' | RULE_BODY '[' RULE_BODY ']' )
			int alt10=2;
			try { dbg.enterSubRule(10);
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			int LA10_0 = input.LA(1);
			if ( (LA10_0==48) ) {
				alt10=1;
			}
			else if ( (LA10_0==RULE_BODY) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:119:3: 'TEMPERATURE' '[' RULE_BODY ',' RULE_BODY ']'
					{
					dbg.location(119,3);
					match(input,48,FOLLOW_48_in_rulevariables404); dbg.location(120,3);
					match(input,50,FOLLOW_50_in_rulevariables408); dbg.location(121,3);
					match(input,RULE_BODY,FOLLOW_RULE_BODY_in_rulevariables412); dbg.location(122,3);
					match(input,22,FOLLOW_22_in_rulevariables416); dbg.location(123,3);
					match(input,RULE_BODY,FOLLOW_RULE_BODY_in_rulevariables420); dbg.location(124,3);
					match(input,51,FOLLOW_51_in_rulevariables424); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:126:3: RULE_BODY '[' RULE_BODY ']'
					{
					dbg.location(126,3);
					match(input,RULE_BODY,FOLLOW_RULE_BODY_in_rulevariables436); dbg.location(127,3);
					match(input,50,FOLLOW_50_in_rulevariables440); dbg.location(128,3);
					match(input,RULE_BODY,FOLLOW_RULE_BODY_in_rulevariables444); dbg.location(129,3);
					match(input,51,FOLLOW_51_in_rulevariables448); 
					}
					break;

			}
			} finally {dbg.exitSubRule(10);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(131, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulevariables");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulevariables"



	// $ANTLR start "ruleconditions"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:134:1: ruleconditions : ( '&lt;' | '&le;' | '&ge;' | '&gt;' | '=' | '&&' | '||' | ')' ) ;
	public final void ruleconditions() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleconditions");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(134, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:134:15: ( ( '&lt;' | '&le;' | '&ge;' | '&gt;' | '=' | '&&' | '||' | ')' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:
			{
			dbg.location(134,15);
			if ( (input.LA(1) >= 15 && input.LA(1) <= 19)||input.LA(1)==21||input.LA(1)==28||input.LA(1)==57 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(152, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleconditions");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleconditions"



	// $ANTLR start "rulepreconditions"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:155:1: rulepreconditions : ( '!' | '(' ) ;
	public final void rulepreconditions() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulepreconditions");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(155, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:155:18: ( ( '!' | '(' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:
			{
			dbg.location(155,18);
			if ( input.LA(1)==14||input.LA(1)==20 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(161, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulepreconditions");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulepreconditions"



	// $ANTLR start "rulecodex"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:164:1: rulecodex : ruledevice ( ruleprotocol )* ( rulesensor )* ;
	public final void rulecodex() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulecodex");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(164, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:164:10: ( ruledevice ( ruleprotocol )* ( rulesensor )* )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:165:2: ruledevice ( ruleprotocol )* ( rulesensor )*
			{
			dbg.location(165,2);
			pushFollow(FOLLOW_ruledevice_in_rulecodex591);
			ruledevice();
			state._fsp--;
			dbg.location(166,2);
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:166:2: ( ruleprotocol )*
			try { dbg.enterSubRule(11);

			loop11:
			while (true) {
				int alt11=2;
				try { dbg.enterDecision(11, decisionCanBacktrack[11]);

				int LA11_0 = input.LA(1);
				if ( (LA11_0==37) ) {
					alt11=1;
				}

				} finally {dbg.exitDecision(11);}

				switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:166:2: ruleprotocol
					{
					dbg.location(166,2);
					pushFollow(FOLLOW_ruleprotocol_in_rulecodex594);
					ruleprotocol();
					state._fsp--;

					}
					break;

				default :
					break loop11;
				}
			}
			} finally {dbg.exitSubRule(11);}
			dbg.location(168,2);
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:168:2: ( rulesensor )*
			try { dbg.enterSubRule(12);

			loop12:
			while (true) {
				int alt12=2;
				try { dbg.enterDecision(12, decisionCanBacktrack[12]);

				int LA12_0 = input.LA(1);
				if ( (LA12_0==36||LA12_0==48) ) {
					alt12=1;
				}

				} finally {dbg.exitDecision(12);}

				switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:168:2: rulesensor
					{
					dbg.location(168,2);
					pushFollow(FOLLOW_rulesensor_in_rulecodex600);
					rulesensor();
					state._fsp--;

					}
					break;

				default :
					break loop12;
				}
			}
			} finally {dbg.exitSubRule(12);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(170, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulecodex");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulecodex"



	// $ANTLR start "ruledevice"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:173:1: ruledevice : 'DEVICE' ':' RULE_STRING 'NAMEID' ':' RULE_STRING ;
	public final void ruledevice() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruledevice");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(173, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:173:11: ( 'DEVICE' ':' RULE_STRING 'NAMEID' ':' RULE_STRING )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:174:2: 'DEVICE' ':' RULE_STRING 'NAMEID' ':' RULE_STRING
			{
			dbg.location(174,2);
			match(input,35,FOLLOW_35_in_ruledevice613); dbg.location(175,2);
			match(input,24,FOLLOW_24_in_ruledevice616); dbg.location(176,2);
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruledevice619); dbg.location(177,2);
			match(input,39,FOLLOW_39_in_ruledevice622); dbg.location(178,2);
			match(input,24,FOLLOW_24_in_ruledevice625); dbg.location(179,2);
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruledevice628); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(180, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruledevice");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruledevice"



	// $ANTLR start "ruleprotocol"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:183:1: ruleprotocol : 'MQTT' '{' rulemqtt_data rulemqtt_device '}' ;
	public final void ruleprotocol() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleprotocol");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(183, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:183:13: ( 'MQTT' '{' rulemqtt_data rulemqtt_device '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:184:2: 'MQTT' '{' rulemqtt_data rulemqtt_device '}'
			{
			dbg.location(184,2);
			match(input,37,FOLLOW_37_in_ruleprotocol638); dbg.location(185,2);
			match(input,56,FOLLOW_56_in_ruleprotocol641); dbg.location(186,2);
			pushFollow(FOLLOW_rulemqtt_data_in_ruleprotocol644);
			rulemqtt_data();
			state._fsp--;
			dbg.location(187,2);
			pushFollow(FOLLOW_rulemqtt_device_in_ruleprotocol647);
			rulemqtt_device();
			state._fsp--;
			dbg.location(188,2);
			match(input,58,FOLLOW_58_in_ruleprotocol650); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(189, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleprotocol");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleprotocol"



	// $ANTLR start "rulemqtt_data"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:192:1: rulemqtt_data : ( 'NAME' '=' RULE_STRING | 'BROKER_USER' '=' RULE_STRING | 'BROKER_PASSWORD' '=' RULE_STRING | 'BROKER' '=' RULE_STRING | 'NETWORK' '{' ( rulemqtt_network_data )* '}' | 'SUBTOPICS' '{' ( 'TOPIC_NAME' '=' RULE_STRING )* '}' | 'PUBTOPICS' '{' ( 'TOPIC_NAME' '=' ( RULE_STRING )* | 'DATA' '=' RULE_STRING )* '}' )* ;
	public final void rulemqtt_data() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulemqtt_data");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(192, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:192:14: ( ( 'NAME' '=' RULE_STRING | 'BROKER_USER' '=' RULE_STRING | 'BROKER_PASSWORD' '=' RULE_STRING | 'BROKER' '=' RULE_STRING | 'NETWORK' '{' ( rulemqtt_network_data )* '}' | 'SUBTOPICS' '{' ( 'TOPIC_NAME' '=' RULE_STRING )* '}' | 'PUBTOPICS' '{' ( 'TOPIC_NAME' '=' ( RULE_STRING )* | 'DATA' '=' RULE_STRING )* '}' )* )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:193:2: ( 'NAME' '=' RULE_STRING | 'BROKER_USER' '=' RULE_STRING | 'BROKER_PASSWORD' '=' RULE_STRING | 'BROKER' '=' RULE_STRING | 'NETWORK' '{' ( rulemqtt_network_data )* '}' | 'SUBTOPICS' '{' ( 'TOPIC_NAME' '=' RULE_STRING )* '}' | 'PUBTOPICS' '{' ( 'TOPIC_NAME' '=' ( RULE_STRING )* | 'DATA' '=' RULE_STRING )* '}' )*
			{
			dbg.location(193,2);
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:193:2: ( 'NAME' '=' RULE_STRING | 'BROKER_USER' '=' RULE_STRING | 'BROKER_PASSWORD' '=' RULE_STRING | 'BROKER' '=' RULE_STRING | 'NETWORK' '{' ( rulemqtt_network_data )* '}' | 'SUBTOPICS' '{' ( 'TOPIC_NAME' '=' RULE_STRING )* '}' | 'PUBTOPICS' '{' ( 'TOPIC_NAME' '=' ( RULE_STRING )* | 'DATA' '=' RULE_STRING )* '}' )*
			try { dbg.enterSubRule(17);

			loop17:
			while (true) {
				int alt17=8;
				try { dbg.enterDecision(17, decisionCanBacktrack[17]);

				switch ( input.LA(1) ) {
				case 38:
					{
					alt17=1;
					}
					break;
				case 33:
					{
					alt17=2;
					}
					break;
				case 32:
					{
					alt17=3;
					}
					break;
				case 31:
					{
					alt17=4;
					}
					break;
				case 40:
					{
					alt17=5;
					}
					break;
				case 47:
					{
					alt17=6;
					}
					break;
				case 44:
					{
					alt17=7;
					}
					break;
				}
				} finally {dbg.exitDecision(17);}

				switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:194:3: 'NAME' '=' RULE_STRING
					{
					dbg.location(194,3);
					match(input,38,FOLLOW_38_in_rulemqtt_data664); dbg.location(195,3);
					match(input,28,FOLLOW_28_in_rulemqtt_data668); dbg.location(196,3);
					match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulemqtt_data672); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:198:3: 'BROKER_USER' '=' RULE_STRING
					{
					dbg.location(198,3);
					match(input,33,FOLLOW_33_in_rulemqtt_data684); dbg.location(199,3);
					match(input,28,FOLLOW_28_in_rulemqtt_data688); dbg.location(200,3);
					match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulemqtt_data692); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:202:3: 'BROKER_PASSWORD' '=' RULE_STRING
					{
					dbg.location(202,3);
					match(input,32,FOLLOW_32_in_rulemqtt_data704); dbg.location(203,3);
					match(input,28,FOLLOW_28_in_rulemqtt_data708); dbg.location(204,3);
					match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulemqtt_data712); 
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:206:3: 'BROKER' '=' RULE_STRING
					{
					dbg.location(206,3);
					match(input,31,FOLLOW_31_in_rulemqtt_data724); dbg.location(207,3);
					match(input,28,FOLLOW_28_in_rulemqtt_data728); dbg.location(208,3);
					match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulemqtt_data732); 
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:210:3: 'NETWORK' '{' ( rulemqtt_network_data )* '}'
					{
					dbg.location(210,3);
					match(input,40,FOLLOW_40_in_rulemqtt_data744); dbg.location(211,3);
					match(input,56,FOLLOW_56_in_rulemqtt_data748); dbg.location(212,3);
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:212:3: ( rulemqtt_network_data )*
					try { dbg.enterSubRule(13);

					loop13:
					while (true) {
						int alt13=2;
						try { dbg.enterDecision(13, decisionCanBacktrack[13]);

						int LA13_0 = input.LA(1);
						if ( (LA13_0==46) ) {
							alt13=1;
						}

						} finally {dbg.exitDecision(13);}

						switch (alt13) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:212:3: rulemqtt_network_data
							{
							dbg.location(212,3);
							pushFollow(FOLLOW_rulemqtt_network_data_in_rulemqtt_data752);
							rulemqtt_network_data();
							state._fsp--;

							}
							break;

						default :
							break loop13;
						}
					}
					} finally {dbg.exitSubRule(13);}
					dbg.location(214,3);
					match(input,58,FOLLOW_58_in_rulemqtt_data760); 
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:216:3: 'SUBTOPICS' '{' ( 'TOPIC_NAME' '=' RULE_STRING )* '}'
					{
					dbg.location(216,3);
					match(input,47,FOLLOW_47_in_rulemqtt_data772); dbg.location(217,3);
					match(input,56,FOLLOW_56_in_rulemqtt_data776); dbg.location(218,3);
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:218:3: ( 'TOPIC_NAME' '=' RULE_STRING )*
					try { dbg.enterSubRule(14);

					loop14:
					while (true) {
						int alt14=2;
						try { dbg.enterDecision(14, decisionCanBacktrack[14]);

						int LA14_0 = input.LA(1);
						if ( (LA14_0==49) ) {
							alt14=1;
						}

						} finally {dbg.exitDecision(14);}

						switch (alt14) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:219:4: 'TOPIC_NAME' '=' RULE_STRING
							{
							dbg.location(219,4);
							match(input,49,FOLLOW_49_in_rulemqtt_data785); dbg.location(220,4);
							match(input,28,FOLLOW_28_in_rulemqtt_data790); dbg.location(221,4);
							match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulemqtt_data795); 
							}
							break;

						default :
							break loop14;
						}
					}
					} finally {dbg.exitSubRule(14);}
					dbg.location(223,3);
					match(input,58,FOLLOW_58_in_rulemqtt_data804); 
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:225:3: 'PUBTOPICS' '{' ( 'TOPIC_NAME' '=' ( RULE_STRING )* | 'DATA' '=' RULE_STRING )* '}'
					{
					dbg.location(225,3);
					match(input,44,FOLLOW_44_in_rulemqtt_data816); dbg.location(226,3);
					match(input,56,FOLLOW_56_in_rulemqtt_data820); dbg.location(227,3);
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:227:3: ( 'TOPIC_NAME' '=' ( RULE_STRING )* | 'DATA' '=' RULE_STRING )*
					try { dbg.enterSubRule(16);

					loop16:
					while (true) {
						int alt16=3;
						try { dbg.enterDecision(16, decisionCanBacktrack[16]);

						int LA16_0 = input.LA(1);
						if ( (LA16_0==49) ) {
							alt16=1;
						}
						else if ( (LA16_0==34) ) {
							alt16=2;
						}

						} finally {dbg.exitDecision(16);}

						switch (alt16) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:228:4: 'TOPIC_NAME' '=' ( RULE_STRING )*
							{
							dbg.location(228,4);
							match(input,49,FOLLOW_49_in_rulemqtt_data829); dbg.location(229,4);
							match(input,28,FOLLOW_28_in_rulemqtt_data834); dbg.location(230,4);
							// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:230:4: ( RULE_STRING )*
							try { dbg.enterSubRule(15);

							loop15:
							while (true) {
								int alt15=2;
								try { dbg.enterDecision(15, decisionCanBacktrack[15]);

								int LA15_0 = input.LA(1);
								if ( (LA15_0==RULE_STRING) ) {
									alt15=1;
								}

								} finally {dbg.exitDecision(15);}

								switch (alt15) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:230:4: RULE_STRING
									{
									dbg.location(230,4);
									match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulemqtt_data839); 
									}
									break;

								default :
									break loop15;
								}
							}
							} finally {dbg.exitSubRule(15);}

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:233:4: 'DATA' '=' RULE_STRING
							{
							dbg.location(233,4);
							match(input,34,FOLLOW_34_in_rulemqtt_data858); dbg.location(234,4);
							match(input,28,FOLLOW_28_in_rulemqtt_data863); dbg.location(235,4);
							match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulemqtt_data868); 
							}
							break;

						default :
							break loop16;
						}
					}
					} finally {dbg.exitSubRule(16);}
					dbg.location(237,3);
					match(input,58,FOLLOW_58_in_rulemqtt_data877); 
					}
					break;

				default :
					break loop17;
				}
			}
			} finally {dbg.exitSubRule(17);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(239, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulemqtt_data");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulemqtt_data"



	// $ANTLR start "rulemqtt_network_data"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:242:1: rulemqtt_network_data : 'SSID' '=' RULE_STRING 'PASSWORD' '=' RULE_STRING ;
	public final void rulemqtt_network_data() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulemqtt_network_data");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(242, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:242:22: ( 'SSID' '=' RULE_STRING 'PASSWORD' '=' RULE_STRING )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:243:2: 'SSID' '=' RULE_STRING 'PASSWORD' '=' RULE_STRING
			{
			dbg.location(243,2);
			match(input,46,FOLLOW_46_in_rulemqtt_network_data891); dbg.location(244,2);
			match(input,28,FOLLOW_28_in_rulemqtt_network_data894); dbg.location(245,2);
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulemqtt_network_data897); dbg.location(246,2);
			match(input,41,FOLLOW_41_in_rulemqtt_network_data900); dbg.location(247,2);
			match(input,28,FOLLOW_28_in_rulemqtt_network_data903); dbg.location(248,2);
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulemqtt_network_data906); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(249, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulemqtt_network_data");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulemqtt_network_data"



	// $ANTLR start "rulemqtt_device"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:252:1: rulemqtt_device : 'PROTOCOL_DEVICE' '{' 'NAME' '=' RULE_STRING '}' ;
	public final void rulemqtt_device() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulemqtt_device");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(252, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:252:16: ( 'PROTOCOL_DEVICE' '{' 'NAME' '=' RULE_STRING '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:253:2: 'PROTOCOL_DEVICE' '{' 'NAME' '=' RULE_STRING '}'
			{
			dbg.location(253,2);
			match(input,43,FOLLOW_43_in_rulemqtt_device916); dbg.location(254,2);
			match(input,56,FOLLOW_56_in_rulemqtt_device919); dbg.location(255,2);
			match(input,38,FOLLOW_38_in_rulemqtt_device922); dbg.location(256,2);
			match(input,28,FOLLOW_28_in_rulemqtt_device925); dbg.location(257,2);
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulemqtt_device928); dbg.location(258,2);
			match(input,58,FOLLOW_58_in_rulemqtt_device931); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(259, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulemqtt_device");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulemqtt_device"



	// $ANTLR start "rulesensor"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:262:1: rulesensor : ( 'TEMPERATURE' '{' rulesensor_data '}' | 'DISTANCE' '{' rulesensor_data '}' ) ;
	public final void rulesensor() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulesensor");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(262, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:262:11: ( ( 'TEMPERATURE' '{' rulesensor_data '}' | 'DISTANCE' '{' rulesensor_data '}' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:263:2: ( 'TEMPERATURE' '{' rulesensor_data '}' | 'DISTANCE' '{' rulesensor_data '}' )
			{
			dbg.location(263,2);
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:263:2: ( 'TEMPERATURE' '{' rulesensor_data '}' | 'DISTANCE' '{' rulesensor_data '}' )
			int alt18=2;
			try { dbg.enterSubRule(18);
			try { dbg.enterDecision(18, decisionCanBacktrack[18]);

			int LA18_0 = input.LA(1);
			if ( (LA18_0==48) ) {
				alt18=1;
			}
			else if ( (LA18_0==36) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(18);}

			switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:264:3: 'TEMPERATURE' '{' rulesensor_data '}'
					{
					dbg.location(264,3);
					match(input,48,FOLLOW_48_in_rulesensor945); dbg.location(265,3);
					match(input,56,FOLLOW_56_in_rulesensor949); dbg.location(266,3);
					pushFollow(FOLLOW_rulesensor_data_in_rulesensor953);
					rulesensor_data();
					state._fsp--;
					dbg.location(267,3);
					match(input,58,FOLLOW_58_in_rulesensor957); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:269:3: 'DISTANCE' '{' rulesensor_data '}'
					{
					dbg.location(269,3);
					match(input,36,FOLLOW_36_in_rulesensor969); dbg.location(270,3);
					match(input,56,FOLLOW_56_in_rulesensor973); dbg.location(271,3);
					pushFollow(FOLLOW_rulesensor_data_in_rulesensor977);
					rulesensor_data();
					state._fsp--;
					dbg.location(272,3);
					match(input,58,FOLLOW_58_in_rulesensor981); 
					}
					break;

			}
			} finally {dbg.exitSubRule(18);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(274, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulesensor");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulesensor"



	// $ANTLR start "rulesensor_data"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:277:1: rulesensor_data : ( 'NAME' '=' RULE_STRING | 'PINS' '=' RULE_STRING | 'SENSOR_ID' '=' RULE_STRING )* ;
	public final void rulesensor_data() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulesensor_data");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(277, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:277:16: ( ( 'NAME' '=' RULE_STRING | 'PINS' '=' RULE_STRING | 'SENSOR_ID' '=' RULE_STRING )* )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:278:2: ( 'NAME' '=' RULE_STRING | 'PINS' '=' RULE_STRING | 'SENSOR_ID' '=' RULE_STRING )*
			{
			dbg.location(278,2);
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:278:2: ( 'NAME' '=' RULE_STRING | 'PINS' '=' RULE_STRING | 'SENSOR_ID' '=' RULE_STRING )*
			try { dbg.enterSubRule(19);

			loop19:
			while (true) {
				int alt19=4;
				try { dbg.enterDecision(19, decisionCanBacktrack[19]);

				switch ( input.LA(1) ) {
				case 38:
					{
					alt19=1;
					}
					break;
				case 42:
					{
					alt19=2;
					}
					break;
				case 45:
					{
					alt19=3;
					}
					break;
				}
				} finally {dbg.exitDecision(19);}

				switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:279:3: 'NAME' '=' RULE_STRING
					{
					dbg.location(279,3);
					match(input,38,FOLLOW_38_in_rulesensor_data998); dbg.location(280,3);
					match(input,28,FOLLOW_28_in_rulesensor_data1002); dbg.location(281,3);
					match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulesensor_data1006); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:283:3: 'PINS' '=' RULE_STRING
					{
					dbg.location(283,3);
					match(input,42,FOLLOW_42_in_rulesensor_data1018); dbg.location(284,3);
					match(input,28,FOLLOW_28_in_rulesensor_data1022); dbg.location(285,3);
					match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulesensor_data1026); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:287:3: 'SENSOR_ID' '=' RULE_STRING
					{
					dbg.location(287,3);
					match(input,45,FOLLOW_45_in_rulesensor_data1038); dbg.location(288,3);
					match(input,28,FOLLOW_28_in_rulesensor_data1042); dbg.location(289,3);
					match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulesensor_data1046); 
					}
					break;

				default :
					break loop19;
				}
			}
			} finally {dbg.exitSubRule(19);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(291, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulesensor_data");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulesensor_data"

	// Delegated rules


	protected DFA3 dfa3 = new DFA3(this);
	static final String DFA3_eotS =
		"\14\uffff";
	static final String DFA3_eofS =
		"\14\uffff";
	static final String DFA3_minS =
		"\1\31\1\6\1\30\1\11\1\6\1\30\1\34\2\uffff\1\6\1\14\1\6";
	static final String DFA3_maxS =
		"\1\31\1\6\1\30\1\11\1\35\2\34\2\uffff\1\35\1\14\1\35";
	static final String DFA3_acceptS =
		"\7\uffff\1\1\1\2\3\uffff";
	static final String DFA3_specialS =
		"\14\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3",
			"\1\4",
			"\1\5\2\uffff\1\6\15\uffff\1\10\5\uffff\1\7",
			"\1\11\3\uffff\1\7",
			"\1\12",
			"",
			"",
			"\1\5\2\uffff\1\6\15\uffff\1\10\5\uffff\1\7",
			"\1\13",
			"\1\5\2\uffff\1\6\15\uffff\1\10\5\uffff\1\7"
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	protected class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "31:2: ( ruleOpen rulecontent ruleClose | ruleSingleton )";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	public static final BitSet FOLLOW_ruleXml_in_ruleModel13 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleprolog_in_ruleXml23 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_ruleelement_in_ruleXml27 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_27_in_ruleprolog40 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RULE_HEAD_in_ruleprolog43 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_ruleprolog46 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleprolog49 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_ruleprolog52 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleprolog55 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_ruleprolog58 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleOpen_in_ruleelement72 = new BitSet(new long[]{0x0031000006105220L});
	public static final BitSet FOLLOW_rulecontent_in_ruleelement76 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ruleClose_in_ruleelement80 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSingleton_in_ruleelement92 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_rulecontent109 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_rulecontent136 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_rulecodex_in_rulecontent140 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_rulecontent144 = new BitSet(new long[]{0x0031000002105222L});
	public static final BitSet FOLLOW_ruleelement_in_rulecontent156 = new BitSet(new long[]{0x0031000002105222L});
	public static final BitSet FOLLOW_rulepreconditions_in_rulecontent168 = new BitSet(new long[]{0x0001000000104020L});
	public static final BitSet FOLLOW_RULE_BODY_in_rulecontent181 = new BitSet(new long[]{0x02310000123FD222L});
	public static final BitSet FOLLOW_rulevariables_in_rulecontent191 = new BitSet(new long[]{0x02310000123FD222L});
	public static final BitSet FOLLOW_ruleconditions_in_rulecontent199 = new BitSet(new long[]{0x02310000123FD222L});
	public static final BitSet FOLLOW_RULE_KEYWORDS_in_rulecontent215 = new BitSet(new long[]{0x0031000002105222L});
	public static final BitSet FOLLOW_RULE_STRING_in_rulecontent227 = new BitSet(new long[]{0x0031000002105222L});
	public static final BitSet FOLLOW_25_in_ruleOpen241 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RULE_HEAD_in_ruleOpen244 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_ruleOpen247 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_RULE_KEYWORDS_in_ruleOpen250 = new BitSet(new long[]{0x0000000020000240L});
	public static final BitSet FOLLOW_RULE_HEAD_in_ruleOpen257 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_ruleOpen261 = new BitSet(new long[]{0x0000000020000240L});
	public static final BitSet FOLLOW_set_in_ruleOpen273 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_ruleOpen300 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleOpen304 = new BitSet(new long[]{0x0000000020000240L});
	public static final BitSet FOLLOW_29_in_ruleOpen311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_ruleSingleton321 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RULE_HEAD_in_ruleSingleton324 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_ruleSingleton327 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_RULE_KEYWORDS_in_ruleSingleton330 = new BitSet(new long[]{0x0000000000800240L});
	public static final BitSet FOLLOW_RULE_HEAD_in_ruleSingleton337 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_ruleSingleton341 = new BitSet(new long[]{0x0000000000800240L});
	public static final BitSet FOLLOW_RULE_KEYWORDS_in_ruleSingleton353 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_ruleSingleton357 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleSingleton361 = new BitSet(new long[]{0x0000000000800240L});
	public static final BitSet FOLLOW_23_in_ruleSingleton368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_ruleClose378 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RULE_HEAD_in_ruleClose381 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_ruleClose384 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_RULE_KEYWORDS_in_ruleClose387 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_ruleClose390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_rulevariables404 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_rulevariables408 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_BODY_in_rulevariables412 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_rulevariables416 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_BODY_in_rulevariables420 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_rulevariables424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_BODY_in_rulevariables436 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_rulevariables440 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_BODY_in_rulevariables444 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_rulevariables448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruledevice_in_rulecodex591 = new BitSet(new long[]{0x0001003000000002L});
	public static final BitSet FOLLOW_ruleprotocol_in_rulecodex594 = new BitSet(new long[]{0x0001003000000002L});
	public static final BitSet FOLLOW_rulesensor_in_rulecodex600 = new BitSet(new long[]{0x0001001000000002L});
	public static final BitSet FOLLOW_35_in_ruledevice613 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_ruledevice616 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruledevice619 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_ruledevice622 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_ruledevice625 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruledevice628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_ruleprotocol638 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_ruleprotocol641 = new BitSet(new long[]{0x0000994380000000L});
	public static final BitSet FOLLOW_rulemqtt_data_in_ruleprotocol644 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_rulemqtt_device_in_ruleprotocol647 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_ruleprotocol650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_rulemqtt_data664 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_rulemqtt_data668 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_rulemqtt_data672 = new BitSet(new long[]{0x0000914380000002L});
	public static final BitSet FOLLOW_33_in_rulemqtt_data684 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_rulemqtt_data688 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_rulemqtt_data692 = new BitSet(new long[]{0x0000914380000002L});
	public static final BitSet FOLLOW_32_in_rulemqtt_data704 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_rulemqtt_data708 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_rulemqtt_data712 = new BitSet(new long[]{0x0000914380000002L});
	public static final BitSet FOLLOW_31_in_rulemqtt_data724 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_rulemqtt_data728 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_rulemqtt_data732 = new BitSet(new long[]{0x0000914380000002L});
	public static final BitSet FOLLOW_40_in_rulemqtt_data744 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_rulemqtt_data748 = new BitSet(new long[]{0x0400400000000000L});
	public static final BitSet FOLLOW_rulemqtt_network_data_in_rulemqtt_data752 = new BitSet(new long[]{0x0400400000000000L});
	public static final BitSet FOLLOW_58_in_rulemqtt_data760 = new BitSet(new long[]{0x0000914380000002L});
	public static final BitSet FOLLOW_47_in_rulemqtt_data772 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_rulemqtt_data776 = new BitSet(new long[]{0x0402000000000000L});
	public static final BitSet FOLLOW_49_in_rulemqtt_data785 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_rulemqtt_data790 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_rulemqtt_data795 = new BitSet(new long[]{0x0402000000000000L});
	public static final BitSet FOLLOW_58_in_rulemqtt_data804 = new BitSet(new long[]{0x0000914380000002L});
	public static final BitSet FOLLOW_44_in_rulemqtt_data816 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_rulemqtt_data820 = new BitSet(new long[]{0x0402000400000000L});
	public static final BitSet FOLLOW_49_in_rulemqtt_data829 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_rulemqtt_data834 = new BitSet(new long[]{0x0402000400001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_rulemqtt_data839 = new BitSet(new long[]{0x0402000400001000L});
	public static final BitSet FOLLOW_34_in_rulemqtt_data858 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_rulemqtt_data863 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_rulemqtt_data868 = new BitSet(new long[]{0x0402000400000000L});
	public static final BitSet FOLLOW_58_in_rulemqtt_data877 = new BitSet(new long[]{0x0000914380000002L});
	public static final BitSet FOLLOW_46_in_rulemqtt_network_data891 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_rulemqtt_network_data894 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_rulemqtt_network_data897 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_rulemqtt_network_data900 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_rulemqtt_network_data903 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_rulemqtt_network_data906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_rulemqtt_device916 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_rulemqtt_device919 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_rulemqtt_device922 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_rulemqtt_device925 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_rulemqtt_device928 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_rulemqtt_device931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_rulesensor945 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_rulesensor949 = new BitSet(new long[]{0x0400244000000000L});
	public static final BitSet FOLLOW_rulesensor_data_in_rulesensor953 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_rulesensor957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_rulesensor969 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_rulesensor973 = new BitSet(new long[]{0x0400244000000000L});
	public static final BitSet FOLLOW_rulesensor_data_in_rulesensor977 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_rulesensor981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_rulesensor_data998 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_rulesensor_data1002 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_rulesensor_data1006 = new BitSet(new long[]{0x0000244000000002L});
	public static final BitSet FOLLOW_42_in_rulesensor_data1018 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_rulesensor_data1022 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_rulesensor_data1026 = new BitSet(new long[]{0x0000244000000002L});
	public static final BitSet FOLLOW_45_in_rulesensor_data1038 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_rulesensor_data1042 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_rulesensor_data1046 = new BitSet(new long[]{0x0000244000000002L});
}
