// $ANTLR 3.5.1 C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g 2020-12-14 16:43:47

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
		"RULE_SL_COMMENT", "RULE_STRING", "RULE_WS", "'/>'", "':'", "'<'", "'</'", 
		"'<?'", "'='", "'>'", "'?>'", "'CLIENT_IP'", "'CLIENT_MAC'", "'DEVICE'", 
		"'NAME'", "'NETWORK_PROTOCOL'", "'PINS'", "'PROTOCOL_DEVICE'", "'SENSOR'", 
		"'SERVER_IP'", "'TRANSLATE'", "'TYPE'", "'encoding='", "'version='", "'{'", 
		"'}'"
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
		"invalidRule", "rulecontent", "ruleprotocol_data", "ruleelement", "rulecodex", 
		"ruleprotocol_device", "ruleprotocol", "rulesensor_data", "ruleprolog", 
		"ruleOpen", "ruleSingleton", "rulesensor", "ruleModel", "ruledevice", 
		"ruleXml", "ruleClose"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false
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
			if ( (LA1_0==18) ) {
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
				if ( (LA2_0==16) ) {
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
			match(input,18,FOLLOW_18_in_ruleprolog40); dbg.location(21,2);
			match(input,RULE_HEAD,FOLLOW_RULE_HEAD_in_ruleprolog43); dbg.location(22,2);
			match(input,34,FOLLOW_34_in_ruleprolog46); dbg.location(23,2);
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleprolog49); dbg.location(24,2);
			match(input,33,FOLLOW_33_in_ruleprolog52); dbg.location(25,2);
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleprolog55); dbg.location(26,2);
			match(input,21,FOLLOW_21_in_ruleprolog58); 
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
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:41:1: rulecontent : ( 'TRANSLATE' '{' rulecodex '}' | ruleelement | RULE_BODY | RULE_KEYWORDS | RULE_STRING )* ;
	public final void rulecontent() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulecontent");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(41, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:41:12: ( ( 'TRANSLATE' '{' rulecodex '}' | ruleelement | RULE_BODY | RULE_KEYWORDS | RULE_STRING )* )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:42:2: ( 'TRANSLATE' '{' rulecodex '}' | ruleelement | RULE_BODY | RULE_KEYWORDS | RULE_STRING )*
			{
			dbg.location(42,2);
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:42:2: ( 'TRANSLATE' '{' rulecodex '}' | ruleelement | RULE_BODY | RULE_KEYWORDS | RULE_STRING )*
			try { dbg.enterSubRule(4);

			loop4:
			while (true) {
				int alt4=6;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				switch ( input.LA(1) ) {
				case 31:
					{
					alt4=1;
					}
					break;
				case 16:
					{
					alt4=2;
					}
					break;
				case RULE_BODY:
					{
					alt4=3;
					}
					break;
				case RULE_KEYWORDS:
					{
					alt4=4;
					}
					break;
				case RULE_STRING:
					{
					alt4=5;
					}
					break;
				}
				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:43:3: 'TRANSLATE' '{' rulecodex '}'
					{
					dbg.location(43,3);
					match(input,31,FOLLOW_31_in_rulecontent109); dbg.location(44,3);
					match(input,35,FOLLOW_35_in_rulecontent113); dbg.location(45,3);
					pushFollow(FOLLOW_rulecodex_in_rulecontent117);
					rulecodex();
					state._fsp--;
					dbg.location(46,3);
					match(input,36,FOLLOW_36_in_rulecontent121); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:48:3: ruleelement
					{
					dbg.location(48,3);
					pushFollow(FOLLOW_ruleelement_in_rulecontent133);
					ruleelement();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:50:3: RULE_BODY
					{
					dbg.location(50,3);
					match(input,RULE_BODY,FOLLOW_RULE_BODY_in_rulecontent145); 
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:52:3: RULE_KEYWORDS
					{
					dbg.location(52,3);
					match(input,RULE_KEYWORDS,FOLLOW_RULE_KEYWORDS_in_rulecontent157); 
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:54:3: RULE_STRING
					{
					dbg.location(54,3);
					match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulecontent169); 
					}
					break;

				default :
					break loop4;
				}
			}
			} finally {dbg.exitSubRule(4);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(56, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulecontent");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulecontent"



	// $ANTLR start "ruleOpen"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:59:1: ruleOpen : '<' RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | ( RULE_HEAD | RULE_KEYWORDS ) '=' RULE_STRING )* '>' ;
	public final void ruleOpen() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleOpen");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(59, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:59:9: ( '<' RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | ( RULE_HEAD | RULE_KEYWORDS ) '=' RULE_STRING )* '>' )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:2: '<' RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | ( RULE_HEAD | RULE_KEYWORDS ) '=' RULE_STRING )* '>'
			{
			dbg.location(60,2);
			match(input,16,FOLLOW_16_in_ruleOpen183); dbg.location(61,2);
			match(input,RULE_HEAD,FOLLOW_RULE_HEAD_in_ruleOpen186); dbg.location(62,2);
			match(input,15,FOLLOW_15_in_ruleOpen189); dbg.location(63,2);
			match(input,RULE_KEYWORDS,FOLLOW_RULE_KEYWORDS_in_ruleOpen192); dbg.location(64,2);
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:64:2: ( RULE_HEAD ':' | ( RULE_HEAD | RULE_KEYWORDS ) '=' RULE_STRING )*
			try { dbg.enterSubRule(5);

			loop5:
			while (true) {
				int alt5=3;
				try { dbg.enterDecision(5, decisionCanBacktrack[5]);

				int LA5_0 = input.LA(1);
				if ( (LA5_0==RULE_HEAD) ) {
					int LA5_2 = input.LA(2);
					if ( (LA5_2==15) ) {
						alt5=1;
					}
					else if ( (LA5_2==19) ) {
						alt5=2;
					}

				}
				else if ( (LA5_0==RULE_KEYWORDS) ) {
					alt5=2;
				}

				} finally {dbg.exitDecision(5);}

				switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:65:3: RULE_HEAD ':'
					{
					dbg.location(65,3);
					match(input,RULE_HEAD,FOLLOW_RULE_HEAD_in_ruleOpen199); dbg.location(66,3);
					match(input,15,FOLLOW_15_in_ruleOpen203); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:68:3: ( RULE_HEAD | RULE_KEYWORDS ) '=' RULE_STRING
					{
					dbg.location(68,3);
					if ( input.LA(1)==RULE_HEAD||input.LA(1)==RULE_KEYWORDS ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(73,3);
					match(input,19,FOLLOW_19_in_ruleOpen242); dbg.location(74,3);
					match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOpen246); 
					}
					break;

				default :
					break loop5;
				}
			}
			} finally {dbg.exitSubRule(5);}
			dbg.location(76,2);
			match(input,20,FOLLOW_20_in_ruleOpen253); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(77, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleOpen");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleOpen"



	// $ANTLR start "ruleSingleton"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:80:1: ruleSingleton : '<' RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )* '/>' ;
	public final void ruleSingleton() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSingleton");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(80, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:80:14: ( '<' RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )* '/>' )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:81:2: '<' RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )* '/>'
			{
			dbg.location(81,2);
			match(input,16,FOLLOW_16_in_ruleSingleton263); dbg.location(82,2);
			match(input,RULE_HEAD,FOLLOW_RULE_HEAD_in_ruleSingleton266); dbg.location(83,2);
			match(input,15,FOLLOW_15_in_ruleSingleton269); dbg.location(84,2);
			match(input,RULE_KEYWORDS,FOLLOW_RULE_KEYWORDS_in_ruleSingleton272); dbg.location(85,2);
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:85:2: ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )*
			try { dbg.enterSubRule(6);

			loop6:
			while (true) {
				int alt6=3;
				try { dbg.enterDecision(6, decisionCanBacktrack[6]);

				int LA6_0 = input.LA(1);
				if ( (LA6_0==RULE_HEAD) ) {
					alt6=1;
				}
				else if ( (LA6_0==RULE_KEYWORDS) ) {
					alt6=2;
				}

				} finally {dbg.exitDecision(6);}

				switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:86:3: RULE_HEAD ':'
					{
					dbg.location(86,3);
					match(input,RULE_HEAD,FOLLOW_RULE_HEAD_in_ruleSingleton279); dbg.location(87,3);
					match(input,15,FOLLOW_15_in_ruleSingleton283); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:89:3: RULE_KEYWORDS '=' RULE_STRING
					{
					dbg.location(89,3);
					match(input,RULE_KEYWORDS,FOLLOW_RULE_KEYWORDS_in_ruleSingleton295); dbg.location(90,3);
					match(input,19,FOLLOW_19_in_ruleSingleton299); dbg.location(91,3);
					match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSingleton303); 
					}
					break;

				default :
					break loop6;
				}
			}
			} finally {dbg.exitSubRule(6);}
			dbg.location(93,2);
			match(input,14,FOLLOW_14_in_ruleSingleton310); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(94, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleSingleton");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSingleton"



	// $ANTLR start "ruleClose"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:97:1: ruleClose : '</' RULE_HEAD ':' RULE_KEYWORDS '>' ;
	public final void ruleClose() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleClose");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(97, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:97:10: ( '</' RULE_HEAD ':' RULE_KEYWORDS '>' )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:98:2: '</' RULE_HEAD ':' RULE_KEYWORDS '>'
			{
			dbg.location(98,2);
			match(input,17,FOLLOW_17_in_ruleClose320); dbg.location(99,2);
			match(input,RULE_HEAD,FOLLOW_RULE_HEAD_in_ruleClose323); dbg.location(100,2);
			match(input,15,FOLLOW_15_in_ruleClose326); dbg.location(101,2);
			match(input,RULE_KEYWORDS,FOLLOW_RULE_KEYWORDS_in_ruleClose329); dbg.location(102,2);
			match(input,20,FOLLOW_20_in_ruleClose332); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(103, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleClose");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleClose"



	// $ANTLR start "rulecodex"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:106:1: rulecodex : ruledevice ruleprotocol rulesensor ;
	public final void rulecodex() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulecodex");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(106, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:106:10: ( ruledevice ruleprotocol rulesensor )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:107:2: ruledevice ruleprotocol rulesensor
			{
			dbg.location(107,2);
			pushFollow(FOLLOW_ruledevice_in_rulecodex342);
			ruledevice();
			state._fsp--;
			dbg.location(108,2);
			pushFollow(FOLLOW_ruleprotocol_in_rulecodex345);
			ruleprotocol();
			state._fsp--;
			dbg.location(109,2);
			pushFollow(FOLLOW_rulesensor_in_rulecodex348);
			rulesensor();
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
		dbg.location(110, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulecodex");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulecodex"



	// $ANTLR start "ruledevice"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:113:1: ruledevice : 'DEVICE' ':' RULE_STRING ;
	public final void ruledevice() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruledevice");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(113, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:113:11: ( 'DEVICE' ':' RULE_STRING )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:114:2: 'DEVICE' ':' RULE_STRING
			{
			dbg.location(114,2);
			match(input,24,FOLLOW_24_in_ruledevice358); dbg.location(115,2);
			match(input,15,FOLLOW_15_in_ruledevice361); dbg.location(116,2);
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruledevice364); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(117, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruledevice");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruledevice"



	// $ANTLR start "ruleprotocol"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:120:1: ruleprotocol : 'NETWORK_PROTOCOL' '{' ruleprotocol_data ruleprotocol_device '}' ;
	public final void ruleprotocol() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleprotocol");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(120, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:120:13: ( 'NETWORK_PROTOCOL' '{' ruleprotocol_data ruleprotocol_device '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:121:2: 'NETWORK_PROTOCOL' '{' ruleprotocol_data ruleprotocol_device '}'
			{
			dbg.location(121,2);
			match(input,26,FOLLOW_26_in_ruleprotocol374); dbg.location(122,2);
			match(input,35,FOLLOW_35_in_ruleprotocol377); dbg.location(123,2);
			pushFollow(FOLLOW_ruleprotocol_data_in_ruleprotocol380);
			ruleprotocol_data();
			state._fsp--;
			dbg.location(124,2);
			pushFollow(FOLLOW_ruleprotocol_device_in_ruleprotocol383);
			ruleprotocol_device();
			state._fsp--;
			dbg.location(125,2);
			match(input,36,FOLLOW_36_in_ruleprotocol386); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(126, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleprotocol");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleprotocol"



	// $ANTLR start "ruleprotocol_data"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:129:1: ruleprotocol_data : ( 'NAME' '=' RULE_STRING | 'CLIENT_MAC' '=' RULE_STRING | 'CLIENT_IP' '=' RULE_STRING | 'SERVER_IP' '=' RULE_STRING )* ;
	public final void ruleprotocol_data() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleprotocol_data");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(129, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:129:18: ( ( 'NAME' '=' RULE_STRING | 'CLIENT_MAC' '=' RULE_STRING | 'CLIENT_IP' '=' RULE_STRING | 'SERVER_IP' '=' RULE_STRING )* )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:130:2: ( 'NAME' '=' RULE_STRING | 'CLIENT_MAC' '=' RULE_STRING | 'CLIENT_IP' '=' RULE_STRING | 'SERVER_IP' '=' RULE_STRING )*
			{
			dbg.location(130,2);
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:130:2: ( 'NAME' '=' RULE_STRING | 'CLIENT_MAC' '=' RULE_STRING | 'CLIENT_IP' '=' RULE_STRING | 'SERVER_IP' '=' RULE_STRING )*
			try { dbg.enterSubRule(7);

			loop7:
			while (true) {
				int alt7=5;
				try { dbg.enterDecision(7, decisionCanBacktrack[7]);

				switch ( input.LA(1) ) {
				case 25:
					{
					alt7=1;
					}
					break;
				case 23:
					{
					alt7=2;
					}
					break;
				case 22:
					{
					alt7=3;
					}
					break;
				case 30:
					{
					alt7=4;
					}
					break;
				}
				} finally {dbg.exitDecision(7);}

				switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:131:3: 'NAME' '=' RULE_STRING
					{
					dbg.location(131,3);
					match(input,25,FOLLOW_25_in_ruleprotocol_data400); dbg.location(132,3);
					match(input,19,FOLLOW_19_in_ruleprotocol_data404); dbg.location(133,3);
					match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleprotocol_data408); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:135:3: 'CLIENT_MAC' '=' RULE_STRING
					{
					dbg.location(135,3);
					match(input,23,FOLLOW_23_in_ruleprotocol_data420); dbg.location(136,3);
					match(input,19,FOLLOW_19_in_ruleprotocol_data424); dbg.location(137,3);
					match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleprotocol_data428); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:139:3: 'CLIENT_IP' '=' RULE_STRING
					{
					dbg.location(139,3);
					match(input,22,FOLLOW_22_in_ruleprotocol_data440); dbg.location(140,3);
					match(input,19,FOLLOW_19_in_ruleprotocol_data444); dbg.location(141,3);
					match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleprotocol_data448); 
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:143:3: 'SERVER_IP' '=' RULE_STRING
					{
					dbg.location(143,3);
					match(input,30,FOLLOW_30_in_ruleprotocol_data460); dbg.location(144,3);
					match(input,19,FOLLOW_19_in_ruleprotocol_data464); dbg.location(145,3);
					match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleprotocol_data468); 
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
		dbg.location(147, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleprotocol_data");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleprotocol_data"



	// $ANTLR start "ruleprotocol_device"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:150:1: ruleprotocol_device : 'PROTOCOL_DEVICE' '{' rulesensor_data '}' ;
	public final void ruleprotocol_device() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleprotocol_device");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(150, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:150:20: ( 'PROTOCOL_DEVICE' '{' rulesensor_data '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:151:2: 'PROTOCOL_DEVICE' '{' rulesensor_data '}'
			{
			dbg.location(151,2);
			match(input,28,FOLLOW_28_in_ruleprotocol_device482); dbg.location(152,2);
			match(input,35,FOLLOW_35_in_ruleprotocol_device485); dbg.location(153,2);
			pushFollow(FOLLOW_rulesensor_data_in_ruleprotocol_device488);
			rulesensor_data();
			state._fsp--;
			dbg.location(154,2);
			match(input,36,FOLLOW_36_in_ruleprotocol_device491); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(155, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleprotocol_device");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleprotocol_device"



	// $ANTLR start "rulesensor"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:158:1: rulesensor : 'SENSOR' '{' rulesensor_data '}' ;
	public final void rulesensor() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulesensor");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(158, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:158:11: ( 'SENSOR' '{' rulesensor_data '}' )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:159:2: 'SENSOR' '{' rulesensor_data '}'
			{
			dbg.location(159,2);
			match(input,29,FOLLOW_29_in_rulesensor501); dbg.location(160,2);
			match(input,35,FOLLOW_35_in_rulesensor504); dbg.location(161,2);
			pushFollow(FOLLOW_rulesensor_data_in_rulesensor507);
			rulesensor_data();
			state._fsp--;
			dbg.location(162,2);
			match(input,36,FOLLOW_36_in_rulesensor510); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(163, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulesensor");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulesensor"



	// $ANTLR start "rulesensor_data"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:166:1: rulesensor_data : ( ( 'NAME' | 'PINS' | 'TYPE' ) '=' )* RULE_STRING ;
	public final void rulesensor_data() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulesensor_data");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(166, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:166:16: ( ( ( 'NAME' | 'PINS' | 'TYPE' ) '=' )* RULE_STRING )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:167:2: ( ( 'NAME' | 'PINS' | 'TYPE' ) '=' )* RULE_STRING
			{
			dbg.location(167,2);
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:167:2: ( ( 'NAME' | 'PINS' | 'TYPE' ) '=' )*
			try { dbg.enterSubRule(8);

			loop8:
			while (true) {
				int alt8=2;
				try { dbg.enterDecision(8, decisionCanBacktrack[8]);

				int LA8_0 = input.LA(1);
				if ( (LA8_0==25||LA8_0==27||LA8_0==32) ) {
					alt8=1;
				}

				} finally {dbg.exitDecision(8);}

				switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:168:3: ( 'NAME' | 'PINS' | 'TYPE' ) '='
					{
					dbg.location(168,3);
					if ( input.LA(1)==25||input.LA(1)==27||input.LA(1)==32 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(175,3);
					match(input,19,FOLLOW_19_in_rulesensor_data565); 
					}
					break;

				default :
					break loop8;
				}
			}
			} finally {dbg.exitSubRule(8);}
			dbg.location(177,2);
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulesensor_data572); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(178, 0);

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
		"\1\20\1\6\1\17\1\11\1\6\1\17\1\23\2\uffff\1\6\1\14\1\6";
	static final String DFA3_maxS =
		"\1\20\1\6\1\17\1\11\1\24\2\23\2\uffff\1\24\1\14\1\24";
	static final String DFA3_acceptS =
		"\7\uffff\1\1\1\2\3\uffff";
	static final String DFA3_specialS =
		"\14\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3",
			"\1\4",
			"\1\5\2\uffff\1\6\4\uffff\1\10\5\uffff\1\7",
			"\1\11\3\uffff\1\7",
			"\1\12",
			"",
			"",
			"\1\5\2\uffff\1\6\4\uffff\1\10\5\uffff\1\7",
			"\1\13",
			"\1\5\2\uffff\1\6\4\uffff\1\10\5\uffff\1\7"
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
	public static final BitSet FOLLOW_ruleprolog_in_ruleXml23 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_ruleelement_in_ruleXml27 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_18_in_ruleprolog40 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RULE_HEAD_in_ruleprolog43 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_ruleprolog46 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleprolog49 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_ruleprolog52 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleprolog55 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_ruleprolog58 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleOpen_in_ruleelement72 = new BitSet(new long[]{0x0000000080031220L});
	public static final BitSet FOLLOW_rulecontent_in_ruleelement76 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ruleClose_in_ruleelement80 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleSingleton_in_ruleelement92 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_rulecontent109 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_rulecontent113 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_rulecodex_in_rulecontent117 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_rulecontent121 = new BitSet(new long[]{0x0000000080011222L});
	public static final BitSet FOLLOW_ruleelement_in_rulecontent133 = new BitSet(new long[]{0x0000000080011222L});
	public static final BitSet FOLLOW_RULE_BODY_in_rulecontent145 = new BitSet(new long[]{0x0000000080011222L});
	public static final BitSet FOLLOW_RULE_KEYWORDS_in_rulecontent157 = new BitSet(new long[]{0x0000000080011222L});
	public static final BitSet FOLLOW_RULE_STRING_in_rulecontent169 = new BitSet(new long[]{0x0000000080011222L});
	public static final BitSet FOLLOW_16_in_ruleOpen183 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RULE_HEAD_in_ruleOpen186 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleOpen189 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_RULE_KEYWORDS_in_ruleOpen192 = new BitSet(new long[]{0x0000000000100240L});
	public static final BitSet FOLLOW_RULE_HEAD_in_ruleOpen199 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleOpen203 = new BitSet(new long[]{0x0000000000100240L});
	public static final BitSet FOLLOW_set_in_ruleOpen215 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_ruleOpen242 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleOpen246 = new BitSet(new long[]{0x0000000000100240L});
	public static final BitSet FOLLOW_20_in_ruleOpen253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_ruleSingleton263 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RULE_HEAD_in_ruleSingleton266 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleSingleton269 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_RULE_KEYWORDS_in_ruleSingleton272 = new BitSet(new long[]{0x0000000000004240L});
	public static final BitSet FOLLOW_RULE_HEAD_in_ruleSingleton279 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleSingleton283 = new BitSet(new long[]{0x0000000000004240L});
	public static final BitSet FOLLOW_RULE_KEYWORDS_in_ruleSingleton295 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_ruleSingleton299 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleSingleton303 = new BitSet(new long[]{0x0000000000004240L});
	public static final BitSet FOLLOW_14_in_ruleSingleton310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_ruleClose320 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RULE_HEAD_in_ruleClose323 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleClose326 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_RULE_KEYWORDS_in_ruleClose329 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_ruleClose332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruledevice_in_rulecodex342 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ruleprotocol_in_rulecodex345 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_rulesensor_in_rulecodex348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_ruledevice358 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruledevice361 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruledevice364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_ruleprotocol374 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_ruleprotocol377 = new BitSet(new long[]{0x0000000052C00000L});
	public static final BitSet FOLLOW_ruleprotocol_data_in_ruleprotocol380 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ruleprotocol_device_in_ruleprotocol383 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_ruleprotocol386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_ruleprotocol_data400 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_ruleprotocol_data404 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleprotocol_data408 = new BitSet(new long[]{0x0000000042C00002L});
	public static final BitSet FOLLOW_23_in_ruleprotocol_data420 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_ruleprotocol_data424 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleprotocol_data428 = new BitSet(new long[]{0x0000000042C00002L});
	public static final BitSet FOLLOW_22_in_ruleprotocol_data440 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_ruleprotocol_data444 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleprotocol_data448 = new BitSet(new long[]{0x0000000042C00002L});
	public static final BitSet FOLLOW_30_in_ruleprotocol_data460 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_ruleprotocol_data464 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleprotocol_data468 = new BitSet(new long[]{0x0000000042C00002L});
	public static final BitSet FOLLOW_28_in_ruleprotocol_device482 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_ruleprotocol_device485 = new BitSet(new long[]{0x000000010A001000L});
	public static final BitSet FOLLOW_rulesensor_data_in_ruleprotocol_device488 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_ruleprotocol_device491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_rulesensor501 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_rulesensor504 = new BitSet(new long[]{0x000000010A001000L});
	public static final BitSet FOLLOW_rulesensor_data_in_rulesensor507 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_rulesensor510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_rulesensor_data524 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_rulesensor_data565 = new BitSet(new long[]{0x000000010A001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_rulesensor_data572 = new BitSet(new long[]{0x0000000000000002L});
}
