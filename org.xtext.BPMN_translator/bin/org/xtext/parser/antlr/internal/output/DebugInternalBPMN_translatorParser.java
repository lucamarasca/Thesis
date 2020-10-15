// $ANTLR 3.5.1 C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g 2020-10-15 16:58:42

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
		"invalidRule", "rulecontent", "ruleXml", "ruleelement", "ruleModel"
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
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:12:1: ruleXml : ruleelement ;
	public final void ruleXml() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleXml");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(12, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:12:8: ( ruleelement )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:13:2: ruleelement
			{
			dbg.location(13,2);
			pushFollow(FOLLOW_ruleelement_in_ruleXml23);
			ruleelement();
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
		dbg.location(14, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleXml");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleXml"



	// $ANTLR start "ruleelement"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:17:1: ruleelement : ( '<' RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )* '>' rulecontent '</' RULE_HEAD ':' RULE_KEYWORDS '>' | '<' RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )* '/>' ) ;
	public final void ruleelement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ruleelement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(17, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:17:12: ( ( '<' RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )* '>' rulecontent '</' RULE_HEAD ':' RULE_KEYWORDS '>' | '<' RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )* '/>' ) )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:18:2: ( '<' RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )* '>' rulecontent '</' RULE_HEAD ':' RULE_KEYWORDS '>' | '<' RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )* '/>' )
			{
			dbg.location(18,2);
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:18:2: ( '<' RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )* '>' rulecontent '</' RULE_HEAD ':' RULE_KEYWORDS '>' | '<' RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )* '/>' )
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

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:19:3: '<' RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )* '>' rulecontent '</' RULE_HEAD ':' RULE_KEYWORDS '>'
					{
					dbg.location(19,3);
					match(input,16,FOLLOW_16_in_ruleelement37); dbg.location(20,3);
					match(input,RULE_HEAD,FOLLOW_RULE_HEAD_in_ruleelement41); dbg.location(21,3);
					match(input,15,FOLLOW_15_in_ruleelement45); dbg.location(22,3);
					match(input,RULE_KEYWORDS,FOLLOW_RULE_KEYWORDS_in_ruleelement49); dbg.location(23,3);
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:23:3: ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )*
					try { dbg.enterSubRule(1);

					loop1:
					while (true) {
						int alt1=3;
						try { dbg.enterDecision(1, decisionCanBacktrack[1]);

						int LA1_0 = input.LA(1);
						if ( (LA1_0==RULE_HEAD) ) {
							alt1=1;
						}
						else if ( (LA1_0==RULE_KEYWORDS) ) {
							alt1=2;
						}

						} finally {dbg.exitDecision(1);}

						switch (alt1) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:24:4: RULE_HEAD ':'
							{
							dbg.location(24,4);
							match(input,RULE_HEAD,FOLLOW_RULE_HEAD_in_ruleelement58); dbg.location(25,4);
							match(input,15,FOLLOW_15_in_ruleelement63); 
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:27:4: RULE_KEYWORDS '=' RULE_STRING
							{
							dbg.location(27,4);
							match(input,RULE_KEYWORDS,FOLLOW_RULE_KEYWORDS_in_ruleelement77); dbg.location(28,4);
							match(input,18,FOLLOW_18_in_ruleelement82); dbg.location(29,4);
							match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleelement87); 
							}
							break;

						default :
							break loop1;
						}
					}
					} finally {dbg.exitSubRule(1);}
					dbg.location(31,3);
					match(input,19,FOLLOW_19_in_ruleelement96); dbg.location(32,3);
					pushFollow(FOLLOW_rulecontent_in_ruleelement100);
					rulecontent();
					state._fsp--;
					dbg.location(33,3);
					match(input,17,FOLLOW_17_in_ruleelement104); dbg.location(34,3);
					match(input,RULE_HEAD,FOLLOW_RULE_HEAD_in_ruleelement108); dbg.location(35,3);
					match(input,15,FOLLOW_15_in_ruleelement112); dbg.location(36,3);
					match(input,RULE_KEYWORDS,FOLLOW_RULE_KEYWORDS_in_ruleelement116); dbg.location(37,3);
					match(input,19,FOLLOW_19_in_ruleelement120); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:39:3: '<' RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )* '/>'
					{
					dbg.location(39,3);
					match(input,16,FOLLOW_16_in_ruleelement132); dbg.location(40,3);
					match(input,RULE_HEAD,FOLLOW_RULE_HEAD_in_ruleelement136); dbg.location(41,3);
					match(input,15,FOLLOW_15_in_ruleelement140); dbg.location(42,3);
					match(input,RULE_KEYWORDS,FOLLOW_RULE_KEYWORDS_in_ruleelement144); dbg.location(43,3);
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:43:3: ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )*
					try { dbg.enterSubRule(2);

					loop2:
					while (true) {
						int alt2=3;
						try { dbg.enterDecision(2, decisionCanBacktrack[2]);

						int LA2_0 = input.LA(1);
						if ( (LA2_0==RULE_HEAD) ) {
							alt2=1;
						}
						else if ( (LA2_0==RULE_KEYWORDS) ) {
							alt2=2;
						}

						} finally {dbg.exitDecision(2);}

						switch (alt2) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:44:4: RULE_HEAD ':'
							{
							dbg.location(44,4);
							match(input,RULE_HEAD,FOLLOW_RULE_HEAD_in_ruleelement153); dbg.location(45,4);
							match(input,15,FOLLOW_15_in_ruleelement158); 
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:47:4: RULE_KEYWORDS '=' RULE_STRING
							{
							dbg.location(47,4);
							match(input,RULE_KEYWORDS,FOLLOW_RULE_KEYWORDS_in_ruleelement172); dbg.location(48,4);
							match(input,18,FOLLOW_18_in_ruleelement177); dbg.location(49,4);
							match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleelement182); 
							}
							break;

						default :
							break loop2;
						}
					}
					} finally {dbg.exitSubRule(2);}
					dbg.location(51,3);
					match(input,14,FOLLOW_14_in_ruleelement191); 
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
		dbg.location(53, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ruleelement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ruleelement"



	// $ANTLR start "rulecontent"
	// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:56:1: rulecontent : ( ruleelement | RULE_BODY | RULE_KEYWORDS | RULE_STRING )* ;
	public final void rulecontent() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rulecontent");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(56, 0);

		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:56:12: ( ( ruleelement | RULE_BODY | RULE_KEYWORDS | RULE_STRING )* )
			dbg.enterAlt(1);

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:57:2: ( ruleelement | RULE_BODY | RULE_KEYWORDS | RULE_STRING )*
			{
			dbg.location(57,2);
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:57:2: ( ruleelement | RULE_BODY | RULE_KEYWORDS | RULE_STRING )*
			try { dbg.enterSubRule(4);

			loop4:
			while (true) {
				int alt4=5;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				switch ( input.LA(1) ) {
				case 16:
					{
					alt4=1;
					}
					break;
				case RULE_BODY:
					{
					alt4=2;
					}
					break;
				case RULE_KEYWORDS:
					{
					alt4=3;
					}
					break;
				case RULE_STRING:
					{
					alt4=4;
					}
					break;
				}
				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:58:3: ruleelement
					{
					dbg.location(58,3);
					pushFollow(FOLLOW_ruleelement_in_rulecontent208);
					ruleelement();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:3: RULE_BODY
					{
					dbg.location(60,3);
					match(input,RULE_BODY,FOLLOW_RULE_BODY_in_rulecontent220); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:62:3: RULE_KEYWORDS
					{
					dbg.location(62,3);
					match(input,RULE_KEYWORDS,FOLLOW_RULE_KEYWORDS_in_rulecontent232); 
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:64:3: RULE_STRING
					{
					dbg.location(64,3);
					match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulecontent244); 
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
		dbg.location(66, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rulecontent");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rulecontent"

	// Delegated rules


	protected DFA3 dfa3 = new DFA3(this);
	static final String DFA3_eotS =
		"\14\uffff";
	static final String DFA3_eofS =
		"\14\uffff";
	static final String DFA3_minS =
		"\1\20\1\6\1\17\1\11\1\6\1\17\1\22\2\uffff\1\6\1\14\1\6";
	static final String DFA3_maxS =
		"\1\20\1\6\1\17\1\11\1\23\1\17\1\22\2\uffff\1\23\1\14\1\23";
	static final String DFA3_acceptS =
		"\7\uffff\1\1\1\2\3\uffff";
	static final String DFA3_specialS =
		"\14\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3",
			"\1\4",
			"\1\5\2\uffff\1\6\4\uffff\1\10\4\uffff\1\7",
			"\1\11",
			"\1\12",
			"",
			"",
			"\1\5\2\uffff\1\6\4\uffff\1\10\4\uffff\1\7",
			"\1\13",
			"\1\5\2\uffff\1\6\4\uffff\1\10\4\uffff\1\7"
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
			return "18:2: ( '<' RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )* '>' rulecontent '</' RULE_HEAD ':' RULE_KEYWORDS '>' | '<' RULE_HEAD ':' RULE_KEYWORDS ( RULE_HEAD ':' | RULE_KEYWORDS '=' RULE_STRING )* '/>' )";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	public static final BitSet FOLLOW_ruleXml_in_ruleModel13 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleelement_in_ruleXml23 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_ruleelement37 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RULE_HEAD_in_ruleelement41 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleelement45 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_RULE_KEYWORDS_in_ruleelement49 = new BitSet(new long[]{0x0000000000080240L});
	public static final BitSet FOLLOW_RULE_HEAD_in_ruleelement58 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleelement63 = new BitSet(new long[]{0x0000000000080240L});
	public static final BitSet FOLLOW_RULE_KEYWORDS_in_ruleelement77 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_ruleelement82 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleelement87 = new BitSet(new long[]{0x0000000000080240L});
	public static final BitSet FOLLOW_19_in_ruleelement96 = new BitSet(new long[]{0x0000000000031220L});
	public static final BitSet FOLLOW_rulecontent_in_ruleelement100 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_ruleelement104 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RULE_HEAD_in_ruleelement108 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleelement112 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_RULE_KEYWORDS_in_ruleelement116 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_ruleelement120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_ruleelement132 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RULE_HEAD_in_ruleelement136 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleelement140 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_RULE_KEYWORDS_in_ruleelement144 = new BitSet(new long[]{0x0000000000004240L});
	public static final BitSet FOLLOW_RULE_HEAD_in_ruleelement153 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleelement158 = new BitSet(new long[]{0x0000000000004240L});
	public static final BitSet FOLLOW_RULE_KEYWORDS_in_ruleelement172 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_ruleelement177 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleelement182 = new BitSet(new long[]{0x0000000000004240L});
	public static final BitSet FOLLOW_14_in_ruleelement191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleelement_in_rulecontent208 = new BitSet(new long[]{0x0000000000011222L});
	public static final BitSet FOLLOW_RULE_BODY_in_rulecontent220 = new BitSet(new long[]{0x0000000000011222L});
	public static final BitSet FOLLOW_RULE_KEYWORDS_in_rulecontent232 = new BitSet(new long[]{0x0000000000011222L});
	public static final BitSet FOLLOW_RULE_STRING_in_rulecontent244 = new BitSet(new long[]{0x0000000000011222L});
}
