// $ANTLR 3.5.1 C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g 2020-10-10 17:00:46

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class DebugInternalBPMN_translatorLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public DebugInternalBPMN_translatorLexer() {} 
	public DebugInternalBPMN_translatorLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public DebugInternalBPMN_translatorLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g"; }

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:2:7: ( '/>' )
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:2:9: '/>'
			{
			match("/>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:3:7: ( ':' )
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:3:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:4:7: ( '<' )
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:4:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:5:7: ( '</' )
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:5:9: '</'
			{
			match("</"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:6:7: ( '=' )
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:6:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:7:7: ( '>' )
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:7:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "RULE_HEAD"
	public final void mRULE_HEAD() throws RecognitionException {
		try {
			int _type = RULE_HEAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:58:11: ( ( 'bpmn' | 'bpmndi' | 'camunda' | 'xsi' ) )
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:58:13: ( 'bpmn' | 'bpmndi' | 'camunda' | 'xsi' )
			{
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:58:13: ( 'bpmn' | 'bpmndi' | 'camunda' | 'xsi' )
			int alt1=4;
			switch ( input.LA(1) ) {
			case 'b':
				{
				int LA1_1 = input.LA(2);
				if ( (LA1_1=='p') ) {
					int LA1_4 = input.LA(3);
					if ( (LA1_4=='m') ) {
						int LA1_5 = input.LA(4);
						if ( (LA1_5=='n') ) {
							int LA1_6 = input.LA(5);
							if ( (LA1_6=='d') ) {
								alt1=2;
							}

							else {
								alt1=1;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'c':
				{
				alt1=3;
				}
				break;
			case 'x':
				{
				alt1=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:58:14: 'bpmn'
					{
					match("bpmn"); 

					}
					break;
				case 2 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:58:21: 'bpmndi'
					{
					match("bpmndi"); 

					}
					break;
				case 3 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:58:30: 'camunda'
					{
					match("camunda"); 

					}
					break;
				case 4 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:58:40: 'xsi'
					{
					match("xsi"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RULE_HEAD"

	// $ANTLR start "RULE_KEYWORDS"
	public final void mRULE_KEYWORDS() throws RecognitionException {
		try {
			int _type = RULE_KEYWORDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:15: ( ( 'id' | 'name' | 'isExecutable' | 'sourceRef' | 'processRef' | 'targetRef' | 'calledElement' | 'type' | 'expression' | 'value' | 'resultVariable' | 'asyncBefore' | 'class' | 'event' | 'startEvent' | 'task' | 'messageEventDefinition' | 'sequenceFlow' | 'condition' | 'association' | 'outgoing' | 'serviceTask' | 'process' | 'incoming' | 'intermediateCatchEvent' | 'conditionalEventDefinition' | 'endEvent' | 'textAnnotation' | 'text' | 'dataStoreReference' | 'callActivity' | 'laneSet' | 'lane' | 'flowNodeRef' | 'dataOutputAssociation' | 'exclusiveGateway' | 'extensionElements' | 'inputOutput' | 'list' | 'inputParameter' | 'outputParameter' | 'properties' | 'property' | 'field' | 'string' | 'scriptTask' | 'script' | 'executionListener' | 'timerEventDefinition' | 'timeDuration' | 'parallelGateway' ) )
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:17: ( 'id' | 'name' | 'isExecutable' | 'sourceRef' | 'processRef' | 'targetRef' | 'calledElement' | 'type' | 'expression' | 'value' | 'resultVariable' | 'asyncBefore' | 'class' | 'event' | 'startEvent' | 'task' | 'messageEventDefinition' | 'sequenceFlow' | 'condition' | 'association' | 'outgoing' | 'serviceTask' | 'process' | 'incoming' | 'intermediateCatchEvent' | 'conditionalEventDefinition' | 'endEvent' | 'textAnnotation' | 'text' | 'dataStoreReference' | 'callActivity' | 'laneSet' | 'lane' | 'flowNodeRef' | 'dataOutputAssociation' | 'exclusiveGateway' | 'extensionElements' | 'inputOutput' | 'list' | 'inputParameter' | 'outputParameter' | 'properties' | 'property' | 'field' | 'string' | 'scriptTask' | 'script' | 'executionListener' | 'timerEventDefinition' | 'timeDuration' | 'parallelGateway' )
			{
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:17: ( 'id' | 'name' | 'isExecutable' | 'sourceRef' | 'processRef' | 'targetRef' | 'calledElement' | 'type' | 'expression' | 'value' | 'resultVariable' | 'asyncBefore' | 'class' | 'event' | 'startEvent' | 'task' | 'messageEventDefinition' | 'sequenceFlow' | 'condition' | 'association' | 'outgoing' | 'serviceTask' | 'process' | 'incoming' | 'intermediateCatchEvent' | 'conditionalEventDefinition' | 'endEvent' | 'textAnnotation' | 'text' | 'dataStoreReference' | 'callActivity' | 'laneSet' | 'lane' | 'flowNodeRef' | 'dataOutputAssociation' | 'exclusiveGateway' | 'extensionElements' | 'inputOutput' | 'list' | 'inputParameter' | 'outputParameter' | 'properties' | 'property' | 'field' | 'string' | 'scriptTask' | 'script' | 'executionListener' | 'timerEventDefinition' | 'timeDuration' | 'parallelGateway' )
			int alt2=51;
			alt2 = dfa2.predict(input);
			switch (alt2) {
				case 1 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:18: 'id'
					{
					match("id"); 

					}
					break;
				case 2 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:23: 'name'
					{
					match("name"); 

					}
					break;
				case 3 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:30: 'isExecutable'
					{
					match("isExecutable"); 

					}
					break;
				case 4 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:45: 'sourceRef'
					{
					match("sourceRef"); 

					}
					break;
				case 5 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:57: 'processRef'
					{
					match("processRef"); 

					}
					break;
				case 6 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:70: 'targetRef'
					{
					match("targetRef"); 

					}
					break;
				case 7 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:82: 'calledElement'
					{
					match("calledElement"); 

					}
					break;
				case 8 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:98: 'type'
					{
					match("type"); 

					}
					break;
				case 9 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:105: 'expression'
					{
					match("expression"); 

					}
					break;
				case 10 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:118: 'value'
					{
					match("value"); 

					}
					break;
				case 11 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:126: 'resultVariable'
					{
					match("resultVariable"); 

					}
					break;
				case 12 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:143: 'asyncBefore'
					{
					match("asyncBefore"); 

					}
					break;
				case 13 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:157: 'class'
					{
					match("class"); 

					}
					break;
				case 14 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:165: 'event'
					{
					match("event"); 

					}
					break;
				case 15 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:173: 'startEvent'
					{
					match("startEvent"); 

					}
					break;
				case 16 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:186: 'task'
					{
					match("task"); 

					}
					break;
				case 17 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:193: 'messageEventDefinition'
					{
					match("messageEventDefinition"); 

					}
					break;
				case 18 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:218: 'sequenceFlow'
					{
					match("sequenceFlow"); 

					}
					break;
				case 19 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:233: 'condition'
					{
					match("condition"); 

					}
					break;
				case 20 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:245: 'association'
					{
					match("association"); 

					}
					break;
				case 21 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:259: 'outgoing'
					{
					match("outgoing"); 

					}
					break;
				case 22 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:270: 'serviceTask'
					{
					match("serviceTask"); 

					}
					break;
				case 23 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:284: 'process'
					{
					match("process"); 

					}
					break;
				case 24 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:294: 'incoming'
					{
					match("incoming"); 

					}
					break;
				case 25 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:305: 'intermediateCatchEvent'
					{
					match("intermediateCatchEvent"); 

					}
					break;
				case 26 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:330: 'conditionalEventDefinition'
					{
					match("conditionalEventDefinition"); 

					}
					break;
				case 27 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:359: 'endEvent'
					{
					match("endEvent"); 

					}
					break;
				case 28 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:370: 'textAnnotation'
					{
					match("textAnnotation"); 

					}
					break;
				case 29 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:387: 'text'
					{
					match("text"); 

					}
					break;
				case 30 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:394: 'dataStoreReference'
					{
					match("dataStoreReference"); 

					}
					break;
				case 31 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:415: 'callActivity'
					{
					match("callActivity"); 

					}
					break;
				case 32 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:430: 'laneSet'
					{
					match("laneSet"); 

					}
					break;
				case 33 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:440: 'lane'
					{
					match("lane"); 

					}
					break;
				case 34 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:447: 'flowNodeRef'
					{
					match("flowNodeRef"); 

					}
					break;
				case 35 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:461: 'dataOutputAssociation'
					{
					match("dataOutputAssociation"); 

					}
					break;
				case 36 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:485: 'exclusiveGateway'
					{
					match("exclusiveGateway"); 

					}
					break;
				case 37 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:504: 'extensionElements'
					{
					match("extensionElements"); 

					}
					break;
				case 38 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:524: 'inputOutput'
					{
					match("inputOutput"); 

					}
					break;
				case 39 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:538: 'list'
					{
					match("list"); 

					}
					break;
				case 40 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:545: 'inputParameter'
					{
					match("inputParameter"); 

					}
					break;
				case 41 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:562: 'outputParameter'
					{
					match("outputParameter"); 

					}
					break;
				case 42 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:580: 'properties'
					{
					match("properties"); 

					}
					break;
				case 43 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:593: 'property'
					{
					match("property"); 

					}
					break;
				case 44 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:604: 'field'
					{
					match("field"); 

					}
					break;
				case 45 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:612: 'string'
					{
					match("string"); 

					}
					break;
				case 46 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:621: 'scriptTask'
					{
					match("scriptTask"); 

					}
					break;
				case 47 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:634: 'script'
					{
					match("script"); 

					}
					break;
				case 48 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:643: 'executionListener'
					{
					match("executionListener"); 

					}
					break;
				case 49 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:663: 'timerEventDefinition'
					{
					match("timerEventDefinition"); 

					}
					break;
				case 50 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:686: 'timeDuration'
					{
					match("timeDuration"); 

					}
					break;
				case 51 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:60:701: 'parallelGateway'
					{
					match("parallelGateway"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RULE_KEYWORDS"

	// $ANTLR start "RULE_BODY"
	public final void mRULE_BODY() throws RecognitionException {
		try {
			int _type = RULE_BODY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:62:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | '_' )* )
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:62:13: ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | '_' )*
			{
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:62:13: ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | '_' )*
			loop3:
			while (true) {
				int alt3=5;
				switch ( input.LA(1) ) {
				case 'a':
				case 'b':
				case 'c':
				case 'd':
				case 'e':
				case 'f':
				case 'g':
				case 'h':
				case 'i':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
				case 'n':
				case 'o':
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'u':
				case 'v':
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					{
					alt3=1;
					}
					break;
				case 'A':
				case 'B':
				case 'C':
				case 'D':
				case 'E':
				case 'F':
				case 'G':
				case 'H':
				case 'I':
				case 'J':
				case 'K':
				case 'L':
				case 'M':
				case 'N':
				case 'O':
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
				case 'T':
				case 'U':
				case 'V':
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
					{
					alt3=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
					{
					alt3=3;
					}
					break;
				case '_':
					{
					alt3=4;
					}
					break;
				}
				switch (alt3) {
				case 1 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:62:14: 'a' .. 'z'
					{
					matchRange('a','z'); 
					}
					break;
				case 2 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:62:23: 'A' .. 'Z'
					{
					matchRange('A','Z'); 
					}
					break;
				case 3 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:62:32: RULE_INT
					{
					mRULE_INT(); 

					}
					break;
				case 4 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:62:41: '_'
					{
					match('_'); 
					}
					break;

				default :
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RULE_BODY"

	// $ANTLR start "RULE_ID"
	public final void mRULE_ID() throws RecognitionException {
		try {
			int _type = RULE_ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:64:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:64:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			{
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:64:11: ( '^' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='^') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:64:11: '^'
					{
					match('^'); 
					}
					break;

			}

			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:64:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RULE_ID"

	// $ANTLR start "RULE_INT"
	public final void mRULE_INT() throws RecognitionException {
		try {
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:66:19: ( ( '0' .. '9' )+ )
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:66:21: ( '0' .. '9' )+
			{
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:66:21: ( '0' .. '9' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RULE_INT"

	// $ANTLR start "RULE_STRING"
	public final void mRULE_STRING() throws RecognitionException {
		try {
			int _type = RULE_STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:68:13: ( ( '\"' ( '\\\\' . |~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . |~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:68:15: ( '\"' ( '\\\\' . |~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . |~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
			{
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:68:15: ( '\"' ( '\\\\' . |~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . |~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='\"') ) {
				alt9=1;
			}
			else if ( (LA9_0=='\'') ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:68:16: '\"' ( '\\\\' . |~ ( ( '\\\\' | '\"' ) ) )* '\"'
					{
					match('\"'); 
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:68:20: ( '\\\\' . |~ ( ( '\\\\' | '\"' ) ) )*
					loop7:
					while (true) {
						int alt7=3;
						int LA7_0 = input.LA(1);
						if ( (LA7_0=='\\') ) {
							alt7=1;
						}
						else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
							alt7=2;
						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:68:21: '\\\\' .
							{
							match('\\'); 
							matchAny(); 
							}
							break;
						case 2 :
							// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:68:28: ~ ( ( '\\\\' | '\"' ) )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop7;
						}
					}

					match('\"'); 
					}
					break;
				case 2 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:68:48: '\\'' ( '\\\\' . |~ ( ( '\\\\' | '\\'' ) ) )* '\\''
					{
					match('\''); 
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:68:53: ( '\\\\' . |~ ( ( '\\\\' | '\\'' ) ) )*
					loop8:
					while (true) {
						int alt8=3;
						int LA8_0 = input.LA(1);
						if ( (LA8_0=='\\') ) {
							alt8=1;
						}
						else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '&')||(LA8_0 >= '(' && LA8_0 <= '[')||(LA8_0 >= ']' && LA8_0 <= '\uFFFF')) ) {
							alt8=2;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:68:54: '\\\\' .
							{
							match('\\'); 
							matchAny(); 
							}
							break;
						case 2 :
							// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:68:61: ~ ( ( '\\\\' | '\\'' ) )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop8;
						}
					}

					match('\''); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RULE_STRING"

	// $ANTLR start "RULE_ML_COMMENT"
	public final void mRULE_ML_COMMENT() throws RecognitionException {
		try {
			int _type = RULE_ML_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:70:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:70:19: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:70:24: ( options {greedy=false; } : . )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0=='*') ) {
					int LA10_1 = input.LA(2);
					if ( (LA10_1=='/') ) {
						alt10=2;
					}
					else if ( ((LA10_1 >= '\u0000' && LA10_1 <= '.')||(LA10_1 >= '0' && LA10_1 <= '\uFFFF')) ) {
						alt10=1;
					}

				}
				else if ( ((LA10_0 >= '\u0000' && LA10_0 <= ')')||(LA10_0 >= '+' && LA10_0 <= '\uFFFF')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:70:52: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop10;
				}
			}

			match("*/"); 

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RULE_ML_COMMENT"

	// $ANTLR start "RULE_SL_COMMENT"
	public final void mRULE_SL_COMMENT() throws RecognitionException {
		try {
			int _type = RULE_SL_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:72:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:72:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
			{
			match("//"); 

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:72:24: (~ ( ( '\\n' | '\\r' ) ) )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '\u0000' && LA11_0 <= '\t')||(LA11_0 >= '\u000B' && LA11_0 <= '\f')||(LA11_0 >= '\u000E' && LA11_0 <= '\uFFFF')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop11;
				}
			}

			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:72:40: ( ( '\\r' )? '\\n' )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='\n'||LA13_0=='\r') ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:72:41: ( '\\r' )? '\\n'
					{
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:72:41: ( '\\r' )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0=='\r') ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:72:41: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					}
					break;

			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RULE_SL_COMMENT"

	// $ANTLR start "RULE_WS"
	public final void mRULE_WS() throws RecognitionException {
		try {
			int _type = RULE_WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:74:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:74:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:74:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '\t' && LA14_0 <= '\n')||LA14_0=='\r'||LA14_0==' ') ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RULE_WS"

	// $ANTLR start "RULE_ANY_OTHER"
	public final void mRULE_ANY_OTHER() throws RecognitionException {
		try {
			int _type = RULE_ANY_OTHER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:76:16: ( . )
			// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:76:18: .
			{
			matchAny(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RULE_ANY_OTHER"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | RULE_HEAD | RULE_KEYWORDS | RULE_BODY | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
		int alt15=15;
		alt15 = dfa15.predict(input);
		switch (alt15) {
			case 1 :
				// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:1:10: T__14
				{
				mT__14(); 

				}
				break;
			case 2 :
				// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:1:16: T__15
				{
				mT__15(); 

				}
				break;
			case 3 :
				// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:1:22: T__16
				{
				mT__16(); 

				}
				break;
			case 4 :
				// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:1:28: T__17
				{
				mT__17(); 

				}
				break;
			case 5 :
				// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:1:34: T__18
				{
				mT__18(); 

				}
				break;
			case 6 :
				// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:1:40: T__19
				{
				mT__19(); 

				}
				break;
			case 7 :
				// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:1:46: RULE_HEAD
				{
				mRULE_HEAD(); 

				}
				break;
			case 8 :
				// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:1:56: RULE_KEYWORDS
				{
				mRULE_KEYWORDS(); 

				}
				break;
			case 9 :
				// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:1:70: RULE_BODY
				{
				mRULE_BODY(); 

				}
				break;
			case 10 :
				// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:1:80: RULE_ID
				{
				mRULE_ID(); 

				}
				break;
			case 11 :
				// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:1:88: RULE_STRING
				{
				mRULE_STRING(); 

				}
				break;
			case 12 :
				// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:1:100: RULE_ML_COMMENT
				{
				mRULE_ML_COMMENT(); 

				}
				break;
			case 13 :
				// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:1:116: RULE_SL_COMMENT
				{
				mRULE_SL_COMMENT(); 

				}
				break;
			case 14 :
				// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:1:132: RULE_WS
				{
				mRULE_WS(); 

				}
				break;
			case 15 :
				// C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\DebugInternalBPMN_translator.g:1:140: RULE_ANY_OTHER
				{
				mRULE_ANY_OTHER(); 

				}
				break;

		}
	}


	protected DFA2 dfa2 = new DFA2(this);
	protected DFA15 dfa15 = new DFA15(this);
	static final String DFA2_eotS =
		"\106\uffff\1\123\6\uffff\1\134\21\uffff\1\144\5\uffff\1\151\7\uffff\1"+
		"\157\2\uffff";
	static final String DFA2_eofS =
		"\160\uffff";
	static final String DFA2_minS =
		"\1\141\1\144\1\uffff\1\143\3\141\1\156\2\uffff\1\163\1\uffff\1\165\2\141"+
		"\1\151\2\uffff\1\143\1\uffff\1\141\1\161\1\162\1\157\1\uffff\1\162\1\uffff"+
		"\1\170\1\155\1\154\1\uffff\1\156\1\143\2\uffff\1\163\2\164\1\156\5\uffff"+
		"\1\165\4\uffff\1\151\1\143\2\uffff\1\164\1\145\1\154\1\144\6\uffff\1\147"+
		"\1\141\1\145\1\164\1\160\2\145\1\101\1\104\1\101\1\151\2\uffff\1\117\1"+
		"\123\1\117\1\164\1\163\1\162\6\uffff\1\164\6\uffff\1\124\1\163\1\164\1"+
		"\151\2\uffff\1\122\1\151\1\157\4\uffff\1\156\1\141\2\uffff";
	static final String DFA2_maxS =
		"\1\166\1\163\1\uffff\1\164\1\162\1\171\1\157\1\170\2\uffff\1\163\1\uffff"+
		"\1\165\1\141\1\151\1\154\2\uffff\1\164\1\uffff\3\162\1\157\1\uffff\1\163"+
		"\1\uffff\1\170\1\155\1\154\1\uffff\1\156\1\164\2\uffff\1\171\2\164\1\156"+
		"\5\uffff\1\165\4\uffff\1\151\1\160\2\uffff\1\164\1\145\1\154\1\144\6\uffff"+
		"\1\160\1\141\1\145\1\164\1\160\2\145\1\101\1\162\1\145\1\151\2\uffff\2"+
		"\123\1\120\1\164\1\163\1\162\6\uffff\1\164\6\uffff\1\124\1\163\1\164\1"+
		"\151\2\uffff\1\122\1\171\1\157\4\uffff\1\156\1\141\2\uffff";
	static final String DFA2_acceptS =
		"\2\uffff\1\2\5\uffff\1\12\1\13\1\uffff\1\21\4\uffff\1\1\1\3\1\uffff\1"+
		"\4\4\uffff\1\63\1\uffff\1\10\3\uffff\1\15\2\uffff\1\16\1\33\4\uffff\1"+
		"\47\1\42\1\54\1\30\1\31\1\uffff\1\17\1\55\1\22\1\26\2\uffff\1\6\1\20\4"+
		"\uffff\1\11\1\44\1\45\1\60\1\14\1\24\13\uffff\1\25\1\51\6\uffff\1\34\1"+
		"\35\1\61\1\62\1\7\1\37\1\uffff\1\36\1\43\1\40\1\41\1\46\1\50\4\uffff\1"+
		"\56\1\57\3\uffff\1\5\1\27\1\52\1\53\2\uffff\1\32\1\23";
	static final String DFA2_specialS =
		"\160\uffff}>";
	static final String[] DFA2_transitionS = {
			"\1\12\1\uffff\1\6\1\15\1\7\1\17\2\uffff\1\1\2\uffff\1\16\1\13\1\2\1\14"+
			"\1\4\1\uffff\1\11\1\3\1\5\1\uffff\1\10",
			"\1\20\11\uffff\1\22\4\uffff\1\21",
			"",
			"\1\26\1\uffff\1\25\11\uffff\1\23\4\uffff\1\24",
			"\1\30\20\uffff\1\27",
			"\1\31\3\uffff\1\33\3\uffff\1\34\17\uffff\1\32",
			"\1\35\12\uffff\1\36\2\uffff\1\37",
			"\1\42\7\uffff\1\41\1\uffff\1\40",
			"",
			"",
			"\1\43",
			"",
			"\1\44",
			"\1\45",
			"\1\46\7\uffff\1\47",
			"\1\51\2\uffff\1\50",
			"",
			"",
			"\1\52\14\uffff\1\54\3\uffff\1\53",
			"",
			"\1\55\20\uffff\1\56",
			"\1\57\1\60",
			"\1\61",
			"\1\62",
			"",
			"\1\63\1\64",
			"",
			"\1\65",
			"\1\66",
			"\1\67",
			"",
			"\1\70",
			"\1\72\1\uffff\1\74\12\uffff\1\71\3\uffff\1\73",
			"",
			"",
			"\1\76\5\uffff\1\75",
			"\1\77",
			"\1\100",
			"\1\101",
			"",
			"",
			"",
			"",
			"",
			"\1\102",
			"",
			"",
			"",
			"",
			"\1\103",
			"\1\104\14\uffff\1\105",
			"",
			"",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\112\10\uffff\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\125\55\uffff\1\124",
			"\1\127\43\uffff\1\126",
			"\1\130",
			"",
			"",
			"\1\132\3\uffff\1\131",
			"\1\133",
			"\1\135\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\142",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\143",
			"\1\145",
			"\1\146",
			"\1\147",
			"",
			"",
			"\1\150",
			"\1\152\17\uffff\1\153",
			"\1\154",
			"",
			"",
			"",
			"",
			"\1\155",
			"\1\156",
			"",
			""
	};

	static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
	static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
	static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
	static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
	static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
	static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
	static final short[][] DFA2_transition;

	static {
		int numStates = DFA2_transitionS.length;
		DFA2_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
		}
	}

	protected class DFA2 extends DFA {

		public DFA2(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 2;
			this.eot = DFA2_eot;
			this.eof = DFA2_eof;
			this.min = DFA2_min;
			this.max = DFA2_max;
			this.accept = DFA2_accept;
			this.special = DFA2_special;
			this.transition = DFA2_transition;
		}
		@Override
		public String getDescription() {
			return "60:17: ( 'id' | 'name' | 'isExecutable' | 'sourceRef' | 'processRef' | 'targetRef' | 'calledElement' | 'type' | 'expression' | 'value' | 'resultVariable' | 'asyncBefore' | 'class' | 'event' | 'startEvent' | 'task' | 'messageEventDefinition' | 'sequenceFlow' | 'condition' | 'association' | 'outgoing' | 'serviceTask' | 'process' | 'incoming' | 'intermediateCatchEvent' | 'conditionalEventDefinition' | 'endEvent' | 'textAnnotation' | 'text' | 'dataStoreReference' | 'callActivity' | 'laneSet' | 'lane' | 'flowNodeRef' | 'dataOutputAssociation' | 'exclusiveGateway' | 'extensionElements' | 'inputOutput' | 'list' | 'inputParameter' | 'outputParameter' | 'properties' | 'property' | 'field' | 'string' | 'scriptTask' | 'script' | 'executionListener' | 'timerEventDefinition' | 'timeDuration' | 'parallelGateway' )";
		}
	}

	static final String DFA15_eotS =
		"\1\33\1\40\1\uffff\1\46\2\uffff\23\33\1\uffff\1\33\1\uffff\3\40\12\uffff"+
		"\11\33\1\126\32\33\3\uffff\5\33\1\177\1\uffff\43\33\1\177\4\33\1\uffff"+
		"\4\33\1\126\12\33\3\126\17\33\2\126\6\33\1\126\26\33\1\126\1\33\1\126"+
		"\12\33\1\126\1\177\13\33\1\126\2\33\1\126\26\33\1\177\15\33\1\126\23\33"+
		"\1\126\5\33\1\126\12\33\1\126\11\33\1\126\4\33\1\126\6\33\1\126\4\33\1"+
		"\126\7\33\1\126\26\33\1\126\2\33\3\126\4\33\1\126\20\33\1\126\2\33\1\126"+
		"\10\33\2\126\4\33\1\126\1\33\1\126\1\33\1\126\2\33\1\126\3\33\1\126\10"+
		"\33\1\126\20\33\1\126\1\33\1\126\4\33\1\126\6\33\1\126\5\33\1\126\5\33"+
		"\1\126\10\33\2\126\7\33\1\126\10\33\1\126\5\33\1\126\1\33\2\126\3\33\1"+
		"\126";
	static final String DFA15_eofS =
		"\u01f6\uffff";
	static final String DFA15_minS =
		"\1\0\1\52\1\uffff\1\57\2\uffff\23\60\1\uffff\1\60\1\uffff\1\101\2\0\12"+
		"\uffff\44\60\3\uffff\6\60\1\uffff\50\60\1\uffff\u0176\60";
	static final String DFA15_maxS =
		"\1\uffff\1\76\1\uffff\1\57\2\uffff\23\172\1\uffff\1\172\1\uffff\1\172"+
		"\2\uffff\12\uffff\44\172\3\uffff\6\172\1\uffff\50\172\1\uffff\u0176\172";
	static final String DFA15_acceptS =
		"\2\uffff\1\2\1\uffff\1\5\1\6\23\uffff\1\11\1\uffff\1\11\3\uffff\1\16\1"+
		"\17\1\1\1\14\1\15\1\2\1\4\1\3\1\5\1\6\44\uffff\1\12\1\13\1\16\6\uffff"+
		"\1\10\50\uffff\1\7\u0176\uffff";
	static final String DFA15_specialS =
		"\1\1\34\uffff\1\2\1\0\u01d7\uffff}>";
	static final String[] DFA15_transitionS = {
			"\11\40\2\37\2\40\1\37\22\40\1\37\1\40\1\35\4\40\1\36\7\40\1\1\12\31\1"+
			"\2\1\40\1\3\1\4\1\5\2\40\32\30\3\40\1\34\1\32\1\40\1\21\1\6\1\7\1\24"+
			"\1\16\1\26\2\27\1\11\2\27\1\25\1\22\1\12\1\23\1\14\1\27\1\20\1\13\1\15"+
			"\1\27\1\17\1\27\1\10\2\27\uff85\40",
			"\1\42\4\uffff\1\43\16\uffff\1\41",
			"",
			"\1\45",
			"",
			"",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\17\52\1\51\12\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\56\12\52\1\57\2\52\1\60"+
			"\13\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\22\52\1\61\7\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\3\52\1\62\11\52\1\64\4\52"+
			"\1\63\7\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\65\31\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\2\52\1\71\1\52\1\70\11\52"+
			"\1\66\4\52\1\67\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\73\20\52\1\72\10\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\74\3\52\1\76\3\52\1\77\17"+
			"\52\1\75\1\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\102\7\52\1\101\1\52"+
			"\1\100\2\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\103\31\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\104\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\22\52\1\105\7\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\106\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\24\52\1\107\5\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\110\31\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\111\7\52\1\112\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\114\2\52\1\113\16"+
			"\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"",
			"\32\115\4\uffff\1\115\1\uffff\32\115",
			"\0\116",
			"\0\116",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\14\52\1\120\15\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\13\52\1\122\1\121\15\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\123\31\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\124\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\125\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\4\53\1\127\25\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\2\52\1\130\14\52\1\132\3\52"+
			"\1\131\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\14\52\1\133\15\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\24\52\1\134\5\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\135\20\52\1\136\10\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\20\52\1\137\1\140\10\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\21\52\1\141\10\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\16\52\1\142\13\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\21\52\1\143\10\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\21\52\1\144\1\145\7\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\17\52\1\146\12\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\27\52\1\147\2\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\14\52\1\150\15\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\2\52\1\152\1\52\1\154\12\52"+
			"\1\151\3\52\1\153\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\155\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\3\52\1\156\26\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\13\52\1\157\16\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\22\52\1\160\7\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\22\52\1\162\5\52\1\161\1\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\22\52\1\163\7\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\164\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\165\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\166\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\22\52\1\167\7\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\16\52\1\170\13\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\171\25\52",
			"",
			"",
			"",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\172\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\24\52\1\173\5\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\13\52\1\174\16\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\22\52\1\175\7\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\3\52\1\176\26\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\27\52\1\u0080\2\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\16\52\1\u0081\13\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u0082\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\24\52\1\u0083\5\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u0084\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\21\52\1\u0085\10\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\21\52\1\u0086\10\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u0087\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\24\52\1\u0088\5\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\25\52\1\u0089\4\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u008a\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\2\52\1\u008b\14\52\1\u008c"+
			"\12\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\u008d\31\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\6\52\1\u008e\23\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\12\52\1\u008f\17\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u0090\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u0091\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u0092\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\21\52\1\u0093\10\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\13\52\1\u0094\16\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u0095\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\2\52\1\u0096\27\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u0097\14\52",
			"\12\54\7\uffff\4\53\1\u0098\25\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\24\52\1\u0099\5\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\24\52\1\u009a\5\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u009b\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\16\52\1\u009c\13\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\22\52\1\u009d\7\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\6\52\1\u009e\10\52\1\u009f"+
			"\12\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\u00a0\31\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u00a1\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u00a2\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\26\52\1\u00a3\3\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\13\52\1\u00a4\16\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\3\52\1\u00a5\26\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u00a6\14\52",
			"\12\54\7\uffff\1\u00a8\31\53\4\uffff\1\55\1\uffff\4\52\1\u00a7\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\22\52\1\u00a9\7\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u00aa\21\52",
			"",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u00ab\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\14\52\1\u00ac\15\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\21\52\1\u00ad\10\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u00ae\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\2\52\1\u00af\27\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u00b0\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u00b1\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u00b2\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u00b3\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\17\52\1\u00b4\12\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u00b5\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u00b6\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\13\52\1\u00b7\16\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u00b8\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\1\u00b9\31\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\3\53\1\u00bb\26\53\4\uffff\1\55\1\uffff\21\52\1\u00ba"+
			"\10\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u00bc\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\24\52\1\u00bd\5\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u00be\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\24\52\1\u00bf\5\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u00c0\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\25\52\1\u00c1\4\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u00c2\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\13\52\1\u00c3\16\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\2\52\1\u00c4\27\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\2\52\1\u00c5\27\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\u00c6\31\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\16\52\1\u00c7\13\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\24\52\1\u00c8\5\52",
			"\12\54\7\uffff\16\53\1\u00ca\3\53\1\u00c9\7\53\4\uffff\1\55\1\uffff"+
			"\32\52",
			"\12\54\7\uffff\22\53\1\u00cb\7\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\15\53\1\u00cc\14\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\3\52\1\u00cd\26\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u00ce\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\3\52\1\u00cf\26\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\3\52\1\u00d0\26\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\2\52\1\u00d1\27\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u00d2\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\2\52\1\u00d3\27\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u00d4\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\14\52\1\u00d5\15\52",
			"\12\54\7\uffff\16\53\1\u00d6\1\u00d7\12\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u00d8\25\52",
			"\12\54\7\uffff\4\53\1\u00d9\25\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\6\52\1\u00da\23\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u00db\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\2\52\1\u00dc\27\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u00dd\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\22\52\1\u00de\7\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\21\52\1\u00df\10\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\13\52\1\u00e0\16\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u00e1\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u00e2\14\52",
			"\12\54\7\uffff\4\53\1\u00e3\25\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\24\52\1\u00e4\5\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\22\52\1\u00e5\7\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\22\52\1\u00e6\7\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\22\52\1\u00e7\7\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u00e8\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u00e9\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u00ea\6\52",
			"\12\54\7\uffff\1\53\1\u00eb\30\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u00ec\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\6\52\1\u00ed\23\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u00ee\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u00ef\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u00f0\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\24\52\1\u00f1\5\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u00f2\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\16\52\1\u00f3\13\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\u00f4\31\52",
			"\12\54\7\uffff\4\53\1\u00f5\25\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u00f6\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u00f7\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\24\52\1\u00f8\5\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u00f9\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u00fa\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\24\52\1\u00fb\5\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\u00fc\31\52",
			"\12\54\7\uffff\21\53\1\u00fd\10\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\25\52\1\u00fe\4\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\2\52\1\u00ff\27\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u0100\25\52",
			"\12\54\7\uffff\23\53\1\u0101\6\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\22\52\1\u0102\7\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u0103\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u0104\25\52",
			"\12\54\7\uffff\21\53\1\u0105\10\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u0106\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\25\52\1\u0107\4\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\21\52\1\u0108\10\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\22\52\1\u0109\7\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u010a\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u010b\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u010c\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u010d\14\52",
			"\12\54\7\uffff\25\53\1\u010e\4\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u010f\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\u0110\31\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u0111\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u0112\14\52",
			"\12\54\7\uffff\17\53\1\u0113\12\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\16\52\1\u0114\13\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u0115\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u0116\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\3\52\1\u0117\26\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\13\52\1\u0118\16\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u0119\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\16\52\1\u011a\13\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u011b\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\6\52\1\u011c\23\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\3\52\1\u011d\26\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u011e\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\21\52\1\u011f\10\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u0120\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u0121\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u0122\25\52",
			"\12\54\7\uffff\23\53\1\u0123\6\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\u0124\31\52",
			"\12\54\7\uffff\21\53\1\u0125\10\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u0126\17\52\1\u0127"+
			"\1\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\13\52\1\u0128\16\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u0129\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\16\52\1\u012a\13\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u012b\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\u012c\31\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u012d\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\25\52\1\u012e\4\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\16\52\1\u012f\13\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\16\52\1\u0130\13\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u0131\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\u0132\31\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\5\52\1\u0133\24\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u0134\6\52",
			"\12\54\7\uffff\4\53\1\u0135\25\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\6\52\1\u0136\23\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\u0137\31\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\21\52\1\u0138\10\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\17\52\1\u0139\12\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u013a\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u013b\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\25\52\1\u013c\4\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u013d\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\u013e\31\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u013f\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\17\52\1\u0140\12\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\u0141\31\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\5\52\1\u0142\24\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u0143\14\52",
			"\12\54\7\uffff\5\53\1\u0144\24\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\u0145\31\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\22\52\1\u0146\7\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u0147\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u0148\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\6\53\1\u0149\23\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\5\52\1\u014a\24\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u014b\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u014c\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u014d\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\16\52\1\u014e\13\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u014f\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u0150\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u0151\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\21\52\1\u0152\10\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\16\52\1\u0153\13\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u0154\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\25\52\1\u0155\4\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\21\52\1\u0156\10\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u0157\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\24\52\1\u0158\5\52",
			"\12\54\7\uffff\21\53\1\u0159\10\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\14\52\1\u015a\15\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u015b\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\u015c\31\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\52\1\u015d\30\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\u015e\31\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\24\52\1\u015f\5\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\14\52\1\u0160\15\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u0161\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\13\52\1\u0162\16\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\22\52\1\u0163\7\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\12\52\1\u0164\17\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\5\52\1\u0165\24\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\22\52\1\u0166\7\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\u0167\31\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\u0168\31\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u0169\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u016a\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u016b\14\52",
			"\12\54\7\uffff\6\53\1\u016c\23\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\4\53\1\u016d\25\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\13\53\1\u016e\16\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u016f\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\21\52\1\u0170\10\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\16\52\1\u0171\13\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u0172\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\u0173\31\52",
			"\12\54\7\uffff\21\53\1\u0174\10\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u0175\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u0176\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u0177\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u0178\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\13\52\1\u0179\16\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\13\52\1\u017a\16\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u017b\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u017c\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u017d\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\16\52\1\u017e\13\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\12\52\1\u017f\17\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u0180\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u0181\6\52",
			"\12\54\7\uffff\3\53\1\u0182\26\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\16\52\1\u0183\13\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\u0184\31\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\13\52\1\u0185\16\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u0186\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\u0187\31\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u0188\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u0189\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u018a\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\14\52\1\u018b\15\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u018c\25\52",
			"\12\54\7\uffff\1\u018d\31\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\5\52\1\u018e\24\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u018f\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\30\52\1\u0190\1\52",
			"\12\54\7\uffff\4\53\1\u0191\25\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u0192\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u0193\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u0194\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\26\52\1\u0195\3\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u0196\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u0197\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u0198\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u0199\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u019a\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u019b\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\22\52\1\u019c\7\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\52\1\u019d\30\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u019e\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u019f\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\5\52\1\u01a0\24\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\22\52\1\u01a1\7\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u01a2\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\25\52\1\u01a3\4\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\2\53\1\u01a4\27\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u01a5\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\26\52\1\u01a6\3\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\16\52\1\u01a7\13\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\5\52\1\u01a8\24\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u01a9\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\14\52\1\u01aa\15\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u01ab\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\13\52\1\u01ac\16\52",
			"\12\54\7\uffff\3\53\1\u01ad\26\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u01ae\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u01af\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\22\52\1\u01b0\7\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u01b1\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\u01b2\31\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\21\52\1\u01b3\10\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\u01b4\31\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u01b5\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u01b6\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\26\52\1\u01b7\3\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u01b8\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u01b9\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u01ba\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u01bb\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u01bc\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\21\52\1\u01bd\10\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\16\52\1\u01be\13\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u01bf\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u01c0\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\30\52\1\u01c1\1\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u01c2\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\u01c3\31\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u01c4\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u01c5\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\5\52\1\u01c6\24\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\21\52\1\u01c7\10\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u01c8\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\2\52\1\u01c9\27\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u01ca\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\2\52\1\u01cb\27\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u01cc\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\30\52\1\u01cd\1\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u01ce\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u01cf\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u01d0\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u01d1\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u01d2\21\52",
			"\12\54\7\uffff\3\53\1\u01d3\26\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\7\52\1\u01d4\22\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u01d5\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\22\52\1\u01d6\7\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\21\52\1\u01d7\10\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u01d8\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\2\52\1\u01d9\27\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\1\u01da\31\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u01db\25\52",
			"\12\54\7\uffff\4\53\1\u01dc\25\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u01dd\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u01de\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u01df\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u01e0\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\5\52\1\u01e1\24\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\25\52\1\u01e2\4\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\16\52\1\u01e3\13\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u01e4\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u01e5\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u01e6\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\4\52\1\u01e7\25\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u01e8\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u01e9\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\16\52\1\u01ea\13\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u01eb\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u01ec\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\16\52\1\u01ed\13\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u01ee\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u01ef\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u01f0\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u01f1\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\23\52\1\u01f2\6\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\10\52\1\u01f3\21\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\16\52\1\u01f4\13\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\15\52\1\u01f5\14\52",
			"\12\54\7\uffff\32\53\4\uffff\1\55\1\uffff\32\52"
	};

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	protected class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | RULE_HEAD | RULE_KEYWORDS | RULE_BODY | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA15_30 = input.LA(1);
						s = -1;
						if ( ((LA15_30 >= '\u0000' && LA15_30 <= '\uFFFF')) ) {s = 78;}
						else s = 32;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA15_0 = input.LA(1);
						s = -1;
						if ( (LA15_0=='/') ) {s = 1;}
						else if ( (LA15_0==':') ) {s = 2;}
						else if ( (LA15_0=='<') ) {s = 3;}
						else if ( (LA15_0=='=') ) {s = 4;}
						else if ( (LA15_0=='>') ) {s = 5;}
						else if ( (LA15_0=='b') ) {s = 6;}
						else if ( (LA15_0=='c') ) {s = 7;}
						else if ( (LA15_0=='x') ) {s = 8;}
						else if ( (LA15_0=='i') ) {s = 9;}
						else if ( (LA15_0=='n') ) {s = 10;}
						else if ( (LA15_0=='s') ) {s = 11;}
						else if ( (LA15_0=='p') ) {s = 12;}
						else if ( (LA15_0=='t') ) {s = 13;}
						else if ( (LA15_0=='e') ) {s = 14;}
						else if ( (LA15_0=='v') ) {s = 15;}
						else if ( (LA15_0=='r') ) {s = 16;}
						else if ( (LA15_0=='a') ) {s = 17;}
						else if ( (LA15_0=='m') ) {s = 18;}
						else if ( (LA15_0=='o') ) {s = 19;}
						else if ( (LA15_0=='d') ) {s = 20;}
						else if ( (LA15_0=='l') ) {s = 21;}
						else if ( (LA15_0=='f') ) {s = 22;}
						else if ( ((LA15_0 >= 'g' && LA15_0 <= 'h')||(LA15_0 >= 'j' && LA15_0 <= 'k')||LA15_0=='q'||LA15_0=='u'||LA15_0=='w'||(LA15_0 >= 'y' && LA15_0 <= 'z')) ) {s = 23;}
						else if ( ((LA15_0 >= 'A' && LA15_0 <= 'Z')) ) {s = 24;}
						else if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {s = 25;}
						else if ( (LA15_0=='_') ) {s = 26;}
						else if ( (LA15_0=='^') ) {s = 28;}
						else if ( (LA15_0=='\"') ) {s = 29;}
						else if ( (LA15_0=='\'') ) {s = 30;}
						else if ( ((LA15_0 >= '\t' && LA15_0 <= '\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 31;}
						else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '\b')||(LA15_0 >= '\u000B' && LA15_0 <= '\f')||(LA15_0 >= '\u000E' && LA15_0 <= '\u001F')||LA15_0=='!'||(LA15_0 >= '#' && LA15_0 <= '&')||(LA15_0 >= '(' && LA15_0 <= '.')||LA15_0==';'||(LA15_0 >= '?' && LA15_0 <= '@')||(LA15_0 >= '[' && LA15_0 <= ']')||LA15_0=='`'||(LA15_0 >= '{' && LA15_0 <= '\uFFFF')) ) {s = 32;}
						else s = 27;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA15_29 = input.LA(1);
						s = -1;
						if ( ((LA15_29 >= '\u0000' && LA15_29 <= '\uFFFF')) ) {s = 78;}
						else s = 32;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 15, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
