/*
 * generated by Xtext 2.23.0
 */
grammar InternalBPMN_translator;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.BPMN_translatorGrammarAccess;

}

@parser::members {

 	private BPMN_translatorGrammarAccess grammarAccess;

    public InternalBPMN_translatorParser(TokenStream input, BPMN_translatorGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected BPMN_translatorGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getModelXmlParserRuleCall_0());
			}
			lv_model_0_0=ruleXml
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"model",
					lv_model_0_0,
					"org.xtext.BPMN_translator.Xml");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleXml
entryRuleXml returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getXmlRule()); }
	iv_ruleXml=ruleXml
	{ $current=$iv_ruleXml.current; }
	EOF;

// Rule Xml
ruleXml returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getXmlAccess().getXmlAction_0(),
					$current);
			}
		)
		(
			{
				newCompositeNode(grammarAccess.getXmlAccess().getPrologParserRuleCall_1());
			}
			ruleprolog
			{
				afterParserOrEnumRuleCall();
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getXmlAccess().getProvaElementParserRuleCall_2_0());
				}
				lv_prova_2_0=ruleelement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getXmlRule());
					}
					add(
						$current,
						"prova",
						lv_prova_2_0,
						"org.xtext.BPMN_translator.element");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleprolog
entryRuleprolog returns [String current=null]:
	{ newCompositeNode(grammarAccess.getPrologRule()); }
	iv_ruleprolog=ruleprolog
	{ $current=$iv_ruleprolog.current.getText(); }
	EOF;

// Rule prolog
ruleprolog returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='<?'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getPrologAccess().getLessThanSignQuestionMarkKeyword_0());
		}
		this_HEAD_1=RULE_HEAD
		{
			$current.merge(this_HEAD_1);
		}
		{
			newLeafNode(this_HEAD_1, grammarAccess.getPrologAccess().getHEADTerminalRuleCall_1());
		}
		kw='version='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getPrologAccess().getVersionKeyword_2());
		}
		this_STRING_3=RULE_STRING
		{
			$current.merge(this_STRING_3);
		}
		{
			newLeafNode(this_STRING_3, grammarAccess.getPrologAccess().getSTRINGTerminalRuleCall_3());
		}
		kw='encoding='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getPrologAccess().getEncodingKeyword_4());
		}
		this_STRING_5=RULE_STRING
		{
			$current.merge(this_STRING_5);
		}
		{
			newLeafNode(this_STRING_5, grammarAccess.getPrologAccess().getSTRINGTerminalRuleCall_5());
		}
		kw='?>'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getPrologAccess().getQuestionMarkGreaterThanSignKeyword_6());
		}
	)
;

// Entry rule entryRuleelement
entryRuleelement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElementRule()); }
	iv_ruleelement=ruleelement
	{ $current=$iv_ruleelement.current; }
	EOF;

// Rule element
ruleelement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getElementAccess().getOpenParserRuleCall_0_0());
			}
			this_Open_0=ruleOpen
			{
				$current = $this_Open_0.current;
				afterParserOrEnumRuleCall();
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getElementAccess().getContentsContentParserRuleCall_0_1_0());
					}
					lv_contents_1_0=rulecontent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getElementRule());
						}
						add(
							$current,
							"contents",
							lv_contents_1_0,
							"org.xtext.BPMN_translator.content");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getElementAccess().getClose_tagCloseParserRuleCall_0_2_0());
					}
					lv_close_tag_2_0=ruleClose
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getElementRule());
						}
						add(
							$current,
							"close_tag",
							lv_close_tag_2_0,
							"org.xtext.BPMN_translator.Close");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getElementAccess().getElementAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getElementAccess().getSingleton_tagSingletonParserRuleCall_1_1_0());
					}
					lv_singleton_tag_4_0=ruleSingleton
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getElementRule());
						}
						add(
							$current,
							"singleton_tag",
							lv_singleton_tag_4_0,
							"org.xtext.BPMN_translator.Singleton");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRulecontent
entryRulecontent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContentRule()); }
	iv_rulecontent=rulecontent
	{ $current=$iv_rulecontent.current; }
	EOF;

// Rule content
rulecontent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getContentAccess().getContentAction_0(),
					$current);
			}
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getContentAccess().getProvaElementParserRuleCall_1_0_0());
					}
					lv_prova_1_0=ruleelement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getContentRule());
						}
						add(
							$current,
							"prova",
							lv_prova_1_0,
							"org.xtext.BPMN_translator.element");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			this_BODY_2=RULE_BODY
			{
				newLeafNode(this_BODY_2, grammarAccess.getContentAccess().getBODYTerminalRuleCall_1_1());
			}
			    |
			this_KEYWORDS_3=RULE_KEYWORDS
			{
				newLeafNode(this_KEYWORDS_3, grammarAccess.getContentAccess().getKEYWORDSTerminalRuleCall_1_2());
			}
			    |
			this_STRING_4=RULE_STRING
			{
				newLeafNode(this_STRING_4, grammarAccess.getContentAccess().getSTRINGTerminalRuleCall_1_3());
			}
		)*
	)
;

// Entry rule entryRuleOpen
entryRuleOpen returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOpenRule()); }
	iv_ruleOpen=ruleOpen
	{ $current=$iv_ruleOpen.current; }
	EOF;

// Rule Open
ruleOpen returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getOpenAccess().getOpensAction_0(),
					$current);
			}
		)
		(
			otherlv_1='<'
			{
				newLeafNode(otherlv_1, grammarAccess.getOpenAccess().getLessThanSignKeyword_1_0());
			}
			this_HEAD_2=RULE_HEAD
			{
				newLeafNode(this_HEAD_2, grammarAccess.getOpenAccess().getHEADTerminalRuleCall_1_1());
			}
			otherlv_3=':'
			{
				newLeafNode(otherlv_3, grammarAccess.getOpenAccess().getColonKeyword_1_2());
			}
			this_KEYWORDS_4=RULE_KEYWORDS
			{
				newLeafNode(this_KEYWORDS_4, grammarAccess.getOpenAccess().getKEYWORDSTerminalRuleCall_1_3());
			}
			(
				(
					this_HEAD_5=RULE_HEAD
					{
						newLeafNode(this_HEAD_5, grammarAccess.getOpenAccess().getHEADTerminalRuleCall_1_4_0_0());
					}
					otherlv_6=':'
					{
						newLeafNode(otherlv_6, grammarAccess.getOpenAccess().getColonKeyword_1_4_0_1());
					}
				)
				    |
				(
					(
						this_HEAD_7=RULE_HEAD
						{
							newLeafNode(this_HEAD_7, grammarAccess.getOpenAccess().getHEADTerminalRuleCall_1_4_1_0_0());
						}
						    |
						this_KEYWORDS_8=RULE_KEYWORDS
						{
							newLeafNode(this_KEYWORDS_8, grammarAccess.getOpenAccess().getKEYWORDSTerminalRuleCall_1_4_1_0_1());
						}
					)
					otherlv_9='='
					{
						newLeafNode(otherlv_9, grammarAccess.getOpenAccess().getEqualsSignKeyword_1_4_1_1());
					}
					(
						(
							lv_value_10_0=RULE_STRING
							{
								newLeafNode(lv_value_10_0, grammarAccess.getOpenAccess().getValueSTRINGTerminalRuleCall_1_4_1_2_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getOpenRule());
								}
								addWithLastConsumed(
									$current,
									"value",
									lv_value_10_0,
									"org.eclipse.xtext.common.Terminals.STRING");
							}
						)
					)
				)
			)*
			otherlv_11='>'
			{
				newLeafNode(otherlv_11, grammarAccess.getOpenAccess().getGreaterThanSignKeyword_1_5());
			}
		)
	)
;

// Entry rule entryRuleSingleton
entryRuleSingleton returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSingletonRule()); }
	iv_ruleSingleton=ruleSingleton
	{ $current=$iv_ruleSingleton.current; }
	EOF;

// Rule Singleton
ruleSingleton returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSingletonAccess().getSingletonAction_0(),
					$current);
			}
		)
		(
			otherlv_1='<'
			{
				newLeafNode(otherlv_1, grammarAccess.getSingletonAccess().getLessThanSignKeyword_1_0());
			}
			this_HEAD_2=RULE_HEAD
			{
				newLeafNode(this_HEAD_2, grammarAccess.getSingletonAccess().getHEADTerminalRuleCall_1_1());
			}
			otherlv_3=':'
			{
				newLeafNode(otherlv_3, grammarAccess.getSingletonAccess().getColonKeyword_1_2());
			}
			this_KEYWORDS_4=RULE_KEYWORDS
			{
				newLeafNode(this_KEYWORDS_4, grammarAccess.getSingletonAccess().getKEYWORDSTerminalRuleCall_1_3());
			}
			(
				(
					this_HEAD_5=RULE_HEAD
					{
						newLeafNode(this_HEAD_5, grammarAccess.getSingletonAccess().getHEADTerminalRuleCall_1_4_0_0());
					}
					otherlv_6=':'
					{
						newLeafNode(otherlv_6, grammarAccess.getSingletonAccess().getColonKeyword_1_4_0_1());
					}
				)
				    |
				(
					this_KEYWORDS_7=RULE_KEYWORDS
					{
						newLeafNode(this_KEYWORDS_7, grammarAccess.getSingletonAccess().getKEYWORDSTerminalRuleCall_1_4_1_0());
					}
					otherlv_8='='
					{
						newLeafNode(otherlv_8, grammarAccess.getSingletonAccess().getEqualsSignKeyword_1_4_1_1());
					}
					(
						(
							lv_value_9_0=RULE_STRING
							{
								newLeafNode(lv_value_9_0, grammarAccess.getSingletonAccess().getValueSTRINGTerminalRuleCall_1_4_1_2_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getSingletonRule());
								}
								addWithLastConsumed(
									$current,
									"value",
									lv_value_9_0,
									"org.eclipse.xtext.common.Terminals.STRING");
							}
						)
					)
				)
			)*
		)
		otherlv_10='/>'
		{
			newLeafNode(otherlv_10, grammarAccess.getSingletonAccess().getSolidusGreaterThanSignKeyword_2());
		}
	)
;

// Entry rule entryRuleClose
entryRuleClose returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCloseRule()); }
	iv_ruleClose=ruleClose
	{ $current=$iv_ruleClose.current; }
	EOF;

// Rule Close
ruleClose returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getCloseAccess().getCloseAction_0(),
					$current);
			}
		)
		(
			otherlv_1='</'
			{
				newLeafNode(otherlv_1, grammarAccess.getCloseAccess().getLessThanSignSolidusKeyword_1_0());
			}
			this_HEAD_2=RULE_HEAD
			{
				newLeafNode(this_HEAD_2, grammarAccess.getCloseAccess().getHEADTerminalRuleCall_1_1());
			}
			otherlv_3=':'
			{
				newLeafNode(otherlv_3, grammarAccess.getCloseAccess().getColonKeyword_1_2());
			}
			this_KEYWORDS_4=RULE_KEYWORDS
			{
				newLeafNode(this_KEYWORDS_4, grammarAccess.getCloseAccess().getKEYWORDSTerminalRuleCall_1_3());
			}
			otherlv_5='>'
			{
				newLeafNode(otherlv_5, grammarAccess.getCloseAccess().getGreaterThanSignKeyword_1_4());
			}
		)
	)
;

RULE_HEAD : ('bpmn'|'bpmndi'|'camunda'|'xsi'|'xml'|'xmlns'|'dc'|'di');

RULE_KEYWORDS : ('id'|'name'|'isExecutable'|'sourceRef'|'processRef'|'targetRef'|'calledElement'|'type'|'expression'|'value'|'resultVariable'|'asyncBefore'|'class'|'event'|'startEvent'|'task'|'messageEventDefinition'|'sequenceFlow'|'condition'|'association'|'outgoing'|'serviceTask'|'process'|'incoming'|'intermediateCatchEvent'|'conditionalEventDefinition'|'isMarkerVisible'|'endEvent'|'textAnnotation'|'text'|'dataStoreReference'|'bpmnElement'|'callActivity'|'laneSet'|'lane'|'flowNodeRef'|'definitions'|'dataOutputAssociation'|'exclusiveGateway'|'waypoint'|'BPMNLabel'|'extensionElements'|'inputOutput'|'list'|'inputParameter'|'height'|'outputParameter'|'properties'|'property'|'BPMNShape'|'Bounds'|'field'|'string'|'scriptTask'|'script'|'BPMNPlane'|'BPMNEdge'|'executionListener'|'timerEventDefinition'|'timeDuration'|'width'|'parallelGateway'|'collaboration'|'participant'|'targetNamespace'|'BPMNDiagram'|'exporter'|'exporterVersion'|'x'|'y'|'isHorizontal');

RULE_BODY : ('a'..'z'|'A'..'Z'|RULE_INT|'_')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

fragment RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
