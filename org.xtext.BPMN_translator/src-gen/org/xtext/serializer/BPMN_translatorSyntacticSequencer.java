/*
 * generated by Xtext 2.23.0
 */
package org.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.services.BPMN_translatorGrammarAccess;

@SuppressWarnings("all")
public class BPMN_translatorSyntacticSequencer extends AbstractSyntacticSequencer {

	protected BPMN_translatorGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Singleton___HEADTerminalRuleCall_1_4_0_0_ColonKeyword_1_4_0_1__a;
	protected AbstractElementAlias match_Xml_PrologParserRuleCall_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BPMN_translatorGrammarAccess) access;
		match_Singleton___HEADTerminalRuleCall_1_4_0_0_ColonKeyword_1_4_0_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getSingletonAccess().getHEADTerminalRuleCall_1_4_0_0()), new TokenAlias(false, false, grammarAccess.getSingletonAccess().getColonKeyword_1_4_0_1()));
		match_Xml_PrologParserRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getXmlAccess().getPrologParserRuleCall_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getHEADRule())
			return getHEADToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getKEYWORDSRule())
			return getKEYWORDSToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPrologRule())
			return getprologToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal HEAD:
	 * 	("bpmn"|"bpmndi"|"camunda"|"xsi"|"xml"|"xmlns"|"dc"|"di")
	 * ;
	 */
	protected String getHEADToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "bpmn";
	}
	
	/**
	 * terminal KEYWORDS: "id" | "name" |  "isExecutable" | "sourceRef" | "processRef" | "targetRef" 
	 * 	| "calledElement" | "type" | "expression" | "value" | "resultVariable" | "asyncBefore" | "intermediateThrowEvent"
	 * 	| "class" | "event" | "startEvent"| "task" | "messageEventDefinition" | "sequenceFlow" | "isExpanded"
	 * 	| "condition" | "association" | "outgoing" | "serviceTask" | "process" | "standardLoopCharacteristics"
	 * 	| "incoming" | "intermediateCatchEvent" | "conditionalEventDefinition"|"isMarkerVisible" | "terminateEventDefinition"
	 * 	| "endEvent" | "textAnnotation" | "text" | "dataStoreReference" | "bpmnElement" | "dataObjectReference"
	 * 	| "callActivity" | "laneSet" | "lane" | "flowNodeRef" |"definitions" | "userTask" | "documentation"
	 * 	| "dataOutputAssociation" | "exclusiveGateway" | "waypoint" | "BPMNLabel" | "diagramRelationId"
	 * 	| "extensionElements" | "inputOutput" | "list" | "inputParameter" | "height" | "messageFlow" | "dataObjectRef"
	 * 	| "outputParameter" |  "properties" | "property" | "BPMNShape" | "Bounds" | "subProcess" | "cancelActivity"
	 * 	| "field" | "string" | "scriptTask" | "script" |"BPMNPlane" | "BPMNEdge" | "sendTask" | "boundaryEvent"
	 * 	| "executionListener" | "timerEventDefinition" | "timeDuration" | "width" | "dataInputAssociation"
	 * 	| "parallelGateway" | "collaboration" | "participant" | "targetNamespace" | "dataObject" | "signalEventDefinition"
	 * 	| "BPMNDiagram"		| "exporter" | "exporterVersion" | "x" | "y"| "isHorizontal" | "attachedToRef"
	 * 	| "conditionExpression" | "receiveTask" | "messageRef" | "initiator" | "message";
	 */
	protected String getKEYWORDSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "id";
	}
	
	/**
	 * prolog:
	 * 	"<?" HEAD "version=" STRING "encoding="STRING "?>"
	 * ;
	 */
	protected String getprologToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<? bpmn version= \"\" encoding= ?>";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Singleton___HEADTerminalRuleCall_1_4_0_0_ColonKeyword_1_4_0_1__a.equals(syntax))
				emit_Singleton___HEADTerminalRuleCall_1_4_0_0_ColonKeyword_1_4_0_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Xml_PrologParserRuleCall_1_q.equals(syntax))
				emit_Xml_PrologParserRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     (HEAD ':')*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '<' HEAD ':' KEYWORDS (ambiguity) '/>' (rule start)
	 *     (rule start) '<' HEAD ':' KEYWORDS (ambiguity) KEYWORDS '=' value+=STRING
	 *     value+=STRING (ambiguity) '/>' (rule end)
	 *     value+=STRING (ambiguity) KEYWORDS '=' value+=STRING
	 */
	protected void emit_Singleton___HEADTerminalRuleCall_1_4_0_0_ColonKeyword_1_4_0_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     prolog?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 *     (rule start) (ambiguity) prova+=element
	 */
	protected void emit_Xml_PrologParserRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
