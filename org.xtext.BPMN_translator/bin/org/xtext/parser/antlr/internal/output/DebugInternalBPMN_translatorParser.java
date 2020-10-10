// $ANTLR 3.5.1 C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g 2020-10-10 17:00:46

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
		"'='", "'>'"
	};
	public static final int EOF=-1;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
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
		"invalidRule", "ruleModel", "ruleXml", "ruleTag", "ruleSingleton"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false
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
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:12:1: ruleXml : ( ruleTag )* ;
	public final void ruleXml() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleXml");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(12, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:12:8: ( ( ruleTag )* )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:13:2: ( ruleTag )*
			{
			dbg.location(13,2);
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:13:2: ( ruleTag )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==RULE_BODY||LA1_0==RULE_KEYWORDS||LA1_0==RULE_STRING||LA1_0==14||(LA1_0 >= 16 && LA1_0 <= 17)||LA1_0==19) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:13:2: ruleTag
					{
					dbg.location(13,2);
					pushFollow(FOLLOW_ruleTag_in_ruleXml23);
					ruleTag();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(15, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleXml");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleXml"



	// $ANTLR start "ruleTag"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:18:1: ruleTag : ( ruleSingleton | ( RULE_BODY | RULE_KEYWORDS ) | RULE_STRING ) ;
	public final void ruleTag() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleTag");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(18, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:18:8: ( ( ruleSingleton | ( RULE_BODY | RULE_KEYWORDS ) | RULE_STRING ) )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:19:2: ( ruleSingleton | ( RULE_BODY | RULE_KEYWORDS ) | RULE_STRING )
			{
			dbg.location(19,2);
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:19:2: ( ruleSingleton | ( RULE_BODY | RULE_KEYWORDS ) | RULE_STRING )
			int alt2=3;
			try { dbg.enterSubRule(2);
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			switch ( input.LA(1) ) {
			case 14:
			case 16:
			case 17:
			case 19:
				{
				alt2=1;
				}
				break;
			case RULE_BODY:
			case RULE_KEYWORDS:
				{
				alt2=2;
				}
				break;
			case RULE_STRING:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:20:3: ruleSingleton
					{
					dbg.location(20,3);
					pushFollow(FOLLOW_ruleSingleton_in_ruleTag40);
					ruleSingleton();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:22:3: ( RULE_BODY | RULE_KEYWORDS )
					{
					dbg.location(22,3);
					if ( input.LA(1)==RULE_BODY||input.LA(1)==RULE_KEYWORDS ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:28:3: RULE_STRING
					{
					dbg.location(28,3);
					match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTag87); 
					}
					break;

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
		dbg.location(30, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleTag");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleTag"



	// $ANTLR start "ruleSingleton"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:33:1: ruleSingleton : ( ( '<' | '</' ) RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )* | '/>' | '>' ) ;
	public final void ruleSingleton() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleSingleton");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(33, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:33:14: ( ( ( '<' | '</' ) RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )* | '/>' | '>' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:34:2: ( ( '<' | '</' ) RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )* | '/>' | '>' )
			{
			dbg.location(34,2);
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:34:2: ( ( '<' | '</' ) RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )* | '/>' | '>' )
			int alt4=3;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			switch ( input.LA(1) ) {
			case 16:
			case 17:
				{
				alt4=1;
				}
				break;
			case 14:
				{
				alt4=2;
				}
				break;
			case 19:
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:35:3: ( '<' | '</' ) RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )*
					{
					dbg.location(35,3);
					if ( (input.LA(1) >= 16 && input.LA(1) <= 17) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(40,3);
					match(input,RULE_HEAD,FOLLOW_RULE_HEAD_in_ruleSingleton131); dbg.location(41,3);
					match(input,15,FOLLOW_15_in_ruleSingleton135); dbg.location(42,3);
					match(input,RULE_KEYWORDS,FOLLOW_RULE_KEYWORDS_in_ruleSingleton139); dbg.location(43,3);
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:43:3: ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )*
					try { dbg.enterSubRule(3);

					loop3:
					while (true) {
						int alt3=3;
						try { dbg.enterDecision(3, decisionCanBacktrack[3]);

						int LA3_0 = input.LA(1);
						if ( (LA3_0==RULE_KEYWORDS) ) {
							int LA3_2 = input.LA(2);
							if ( (LA3_2==18) ) {
								alt3=2;
							}

						}
						else if ( (LA3_0==RULE_HEAD) ) {
							alt3=1;
						}

						} finally {dbg.exitDecision(3);}

						switch (alt3) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:44:4: RULE_HEAD ':'
							{
							dbg.location(44,4);
							match(input,RULE_HEAD,FOLLOW_RULE_HEAD_in_ruleSingleton148); dbg.location(45,4);
							match(input,15,FOLLOW_15_in_ruleSingleton153); 
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:47:4: RULE_KEYWORDS '=' RULE_STRING
							{
							dbg.location(47,4);
							match(input,RULE_KEYWORDS,FOLLOW_RULE_KEYWORDS_in_ruleSingleton167); dbg.location(48,4);
							match(input,18,FOLLOW_18_in_ruleSingleton172); dbg.location(49,4);
							match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSingleton177); 
							}
							break;

						default :
							break loop3;
						}
					}
					} finally {dbg.exitSubRule(3);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:52:3: '/>'
					{
					dbg.location(52,3);
					match(input,14,FOLLOW_14_in_ruleSingleton194); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:54:3: '>'
					{
					dbg.location(54,3);
					match(input,19,FOLLOW_19_in_ruleSingleton206); 
					}
					break;

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
			dbg.exitRule(getGrammarFileName(), "ruleSingleton");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleSingleton"

	// Delegated rules



	public static final BitSet FOLLOW_ruleXml_in_ruleModel13 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleTag_in_ruleXml23 = new BitSet(new long[]{0x00000000000B5222L});
	public static final BitSet FOLLOW_ruleSingleton_in_ruleTag40 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_ruleTag52 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleTag87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_ruleSingleton104 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RULE_HEAD_in_ruleSingleton131 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleSingleton135 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_RULE_KEYWORDS_in_ruleSingleton139 = new BitSet(new long[]{0x0000000000000242L});
	public static final BitSet FOLLOW_RULE_HEAD_in_ruleSingleton148 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleSingleton153 = new BitSet(new long[]{0x0000000000000242L});
	public static final BitSet FOLLOW_RULE_KEYWORDS_in_ruleSingleton167 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_ruleSingleton172 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleSingleton177 = new BitSet(new long[]{0x0000000000000242L});
	public static final BitSet FOLLOW_14_in_ruleSingleton194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_ruleSingleton206 = new BitSet(new long[]{0x0000000000000002L});
}
