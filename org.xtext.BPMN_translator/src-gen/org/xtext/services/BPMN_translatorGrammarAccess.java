/*
 * generated by Xtext 2.23.0
 */
package org.xtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class BPMN_translatorGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.BPMN_translator.Model");
		private final Assignment cModelAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cModelXmlParserRuleCall_0 = (RuleCall)cModelAssignment.eContents().get(0);
		
		//Model:
		//	model+=Xml;
		@Override public ParserRule getRule() { return rule; }
		
		//model+=Xml
		public Assignment getModelAssignment() { return cModelAssignment; }
		
		//Xml
		public RuleCall getModelXmlParserRuleCall_0() { return cModelXmlParserRuleCall_0; }
	}
	public class XmlElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.BPMN_translator.Xml");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cXmlAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cOpening_tagAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOpening_tagOpeningParserRuleCall_1_0 = (RuleCall)cOpening_tagAssignment_1.eContents().get(0);
		
		//Xml:
		//	{Xml} opening_tag+=Opening;
		@Override public ParserRule getRule() { return rule; }
		
		//{Xml} opening_tag+=Opening
		public Group getGroup() { return cGroup; }
		
		//{Xml}
		public Action getXmlAction_0() { return cXmlAction_0; }
		
		//opening_tag+=Opening
		public Assignment getOpening_tagAssignment_1() { return cOpening_tagAssignment_1; }
		
		//Opening
		public RuleCall getOpening_tagOpeningParserRuleCall_1_0() { return cOpening_tagOpeningParserRuleCall_1_0; }
	}
	public class OpeningElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.BPMN_translator.Opening");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cOpeningAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Group cGroup_0_1 = (Group)cGroup_0.eContents().get(1);
		private final Group cGroup_0_1_0 = (Group)cGroup_0_1.eContents().get(0);
		private final Assignment cProvaAssignment_0_1_0_0 = (Assignment)cGroup_0_1_0.eContents().get(0);
		private final RuleCall cProvaOpenParserRuleCall_0_1_0_0_0 = (RuleCall)cProvaAssignment_0_1_0_0.eContents().get(0);
		private final Assignment cProva1Assignment_0_1_0_1 = (Assignment)cGroup_0_1_0.eContents().get(1);
		private final RuleCall cProva1CloseParserRuleCall_0_1_0_1_0 = (RuleCall)cProva1Assignment_0_1_0_1.eContents().get(0);
		private final Group cGroup_0_1_1 = (Group)cGroup_0_1.eContents().get(1);
		private final Assignment cProvaAssignment_0_1_1_0 = (Assignment)cGroup_0_1_1.eContents().get(0);
		private final RuleCall cProvaOpenParserRuleCall_0_1_1_0_0 = (RuleCall)cProvaAssignment_0_1_1_0.eContents().get(0);
		private final Assignment cProva1Assignment_0_1_1_1 = (Assignment)cGroup_0_1_1.eContents().get(1);
		private final RuleCall cProva1CloseParserRuleCall_0_1_1_1_0 = (RuleCall)cProva1Assignment_0_1_1_1.eContents().get(0);
		private final Group cGroup_0_1_2 = (Group)cGroup_0_1.eContents().get(2);
		private final Group cGroup_0_1_2_0 = (Group)cGroup_0_1_2.eContents().get(0);
		private final Keyword cLessThanSignKeyword_0_1_2_0_0 = (Keyword)cGroup_0_1_2_0.eContents().get(0);
		private final RuleCall cHEADTerminalRuleCall_0_1_2_0_1 = (RuleCall)cGroup_0_1_2_0.eContents().get(1);
		private final Keyword cColonKeyword_0_1_2_0_2 = (Keyword)cGroup_0_1_2_0.eContents().get(2);
		private final RuleCall cKEYWORDSTerminalRuleCall_0_1_2_0_3 = (RuleCall)cGroup_0_1_2_0.eContents().get(3);
		private final Alternatives cAlternatives_0_1_2_0_4 = (Alternatives)cGroup_0_1_2_0.eContents().get(4);
		private final Group cGroup_0_1_2_0_4_0 = (Group)cAlternatives_0_1_2_0_4.eContents().get(0);
		private final RuleCall cHEADTerminalRuleCall_0_1_2_0_4_0_0 = (RuleCall)cGroup_0_1_2_0_4_0.eContents().get(0);
		private final Keyword cColonKeyword_0_1_2_0_4_0_1 = (Keyword)cGroup_0_1_2_0_4_0.eContents().get(1);
		private final Group cGroup_0_1_2_0_4_1 = (Group)cAlternatives_0_1_2_0_4.eContents().get(1);
		private final RuleCall cKEYWORDSTerminalRuleCall_0_1_2_0_4_1_0 = (RuleCall)cGroup_0_1_2_0_4_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_0_1_2_0_4_1_1 = (Keyword)cGroup_0_1_2_0_4_1.eContents().get(1);
		private final Assignment cValueAssignment_0_1_2_0_4_1_2 = (Assignment)cGroup_0_1_2_0_4_1.eContents().get(2);
		private final RuleCall cValueSTRINGTerminalRuleCall_0_1_2_0_4_1_2_0 = (RuleCall)cValueAssignment_0_1_2_0_4_1_2.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_0_1_2_1 = (Keyword)cGroup_0_1_2.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cOpeningAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Group cGroup_1_1_0 = (Group)cGroup_1_1.eContents().get(0);
		private final Keyword cLessThanSignKeyword_1_1_0_0 = (Keyword)cGroup_1_1_0.eContents().get(0);
		private final RuleCall cHEADTerminalRuleCall_1_1_0_1 = (RuleCall)cGroup_1_1_0.eContents().get(1);
		private final Keyword cColonKeyword_1_1_0_2 = (Keyword)cGroup_1_1_0.eContents().get(2);
		private final RuleCall cKEYWORDSTerminalRuleCall_1_1_0_3 = (RuleCall)cGroup_1_1_0.eContents().get(3);
		private final Alternatives cAlternatives_1_1_0_4 = (Alternatives)cGroup_1_1_0.eContents().get(4);
		private final Group cGroup_1_1_0_4_0 = (Group)cAlternatives_1_1_0_4.eContents().get(0);
		private final RuleCall cHEADTerminalRuleCall_1_1_0_4_0_0 = (RuleCall)cGroup_1_1_0_4_0.eContents().get(0);
		private final Keyword cColonKeyword_1_1_0_4_0_1 = (Keyword)cGroup_1_1_0_4_0.eContents().get(1);
		private final Group cGroup_1_1_0_4_1 = (Group)cAlternatives_1_1_0_4.eContents().get(1);
		private final RuleCall cKEYWORDSTerminalRuleCall_1_1_0_4_1_0 = (RuleCall)cGroup_1_1_0_4_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1_1_0_4_1_1 = (Keyword)cGroup_1_1_0_4_1.eContents().get(1);
		private final Assignment cValueAssignment_1_1_0_4_1_2 = (Assignment)cGroup_1_1_0_4_1.eContents().get(2);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_1_0_4_1_2_0 = (RuleCall)cValueAssignment_1_1_0_4_1_2.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_1_1_1 = (Keyword)cGroup_1_1.eContents().get(1);
		
		//Opening:
		//	{Opening} ((Prova+=Open Prova1+=Close) (Prova+=Open Prova1+=Close)* (("<" HEAD ":" KEYWORDS (HEAD ":" | KEYWORDS "="
		//	value+=STRING)*) "/>")*) | {Opening} (("<" HEAD ":" KEYWORDS (HEAD ":" | KEYWORDS "=" value+=STRING)*) "/>")*;
		@Override public ParserRule getRule() { return rule; }
		
		//{Opening} ((Prova+=Open Prova1+=Close) (Prova+=Open Prova1+=Close)* (("<" HEAD ":" KEYWORDS (HEAD ":" | KEYWORDS "="
		//value+=STRING)*) "/>")*) | {Opening} (("<" HEAD ":" KEYWORDS (HEAD ":" | KEYWORDS "=" value+=STRING)*) "/>")*
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{Opening} ((Prova+=Open Prova1+=Close) (Prova+=Open Prova1+=Close)* (("<" HEAD ":" KEYWORDS (HEAD ":" | KEYWORDS "="
		//value+=STRING)*) "/>")*)
		public Group getGroup_0() { return cGroup_0; }
		
		//{Opening}
		public Action getOpeningAction_0_0() { return cOpeningAction_0_0; }
		
		//((Prova+=Open Prova1+=Close) (Prova+=Open Prova1+=Close)* (("<" HEAD ":" KEYWORDS (HEAD ":" | KEYWORDS "="
		//value+=STRING)*) "/>")*)
		public Group getGroup_0_1() { return cGroup_0_1; }
		
		//(Prova+=Open Prova1+=Close)
		public Group getGroup_0_1_0() { return cGroup_0_1_0; }
		
		//Prova+=Open
		public Assignment getProvaAssignment_0_1_0_0() { return cProvaAssignment_0_1_0_0; }
		
		//Open
		public RuleCall getProvaOpenParserRuleCall_0_1_0_0_0() { return cProvaOpenParserRuleCall_0_1_0_0_0; }
		
		//Prova1+=Close
		public Assignment getProva1Assignment_0_1_0_1() { return cProva1Assignment_0_1_0_1; }
		
		//Close
		public RuleCall getProva1CloseParserRuleCall_0_1_0_1_0() { return cProva1CloseParserRuleCall_0_1_0_1_0; }
		
		//(Prova+=Open Prova1+=Close)*
		public Group getGroup_0_1_1() { return cGroup_0_1_1; }
		
		//Prova+=Open
		public Assignment getProvaAssignment_0_1_1_0() { return cProvaAssignment_0_1_1_0; }
		
		//Open
		public RuleCall getProvaOpenParserRuleCall_0_1_1_0_0() { return cProvaOpenParserRuleCall_0_1_1_0_0; }
		
		//Prova1+=Close
		public Assignment getProva1Assignment_0_1_1_1() { return cProva1Assignment_0_1_1_1; }
		
		//Close
		public RuleCall getProva1CloseParserRuleCall_0_1_1_1_0() { return cProva1CloseParserRuleCall_0_1_1_1_0; }
		
		//(("<" HEAD ":" KEYWORDS (HEAD ":" | KEYWORDS "=" value+=STRING)*) "/>")*
		public Group getGroup_0_1_2() { return cGroup_0_1_2; }
		
		//("<" HEAD ":" KEYWORDS (HEAD ":" | KEYWORDS "=" value+=STRING)*)
		public Group getGroup_0_1_2_0() { return cGroup_0_1_2_0; }
		
		//"<"
		public Keyword getLessThanSignKeyword_0_1_2_0_0() { return cLessThanSignKeyword_0_1_2_0_0; }
		
		//HEAD
		public RuleCall getHEADTerminalRuleCall_0_1_2_0_1() { return cHEADTerminalRuleCall_0_1_2_0_1; }
		
		//":"
		public Keyword getColonKeyword_0_1_2_0_2() { return cColonKeyword_0_1_2_0_2; }
		
		//KEYWORDS
		public RuleCall getKEYWORDSTerminalRuleCall_0_1_2_0_3() { return cKEYWORDSTerminalRuleCall_0_1_2_0_3; }
		
		//(HEAD ":" | KEYWORDS "=" value+=STRING)*
		public Alternatives getAlternatives_0_1_2_0_4() { return cAlternatives_0_1_2_0_4; }
		
		//HEAD ":"
		public Group getGroup_0_1_2_0_4_0() { return cGroup_0_1_2_0_4_0; }
		
		//HEAD
		public RuleCall getHEADTerminalRuleCall_0_1_2_0_4_0_0() { return cHEADTerminalRuleCall_0_1_2_0_4_0_0; }
		
		//":"
		public Keyword getColonKeyword_0_1_2_0_4_0_1() { return cColonKeyword_0_1_2_0_4_0_1; }
		
		//KEYWORDS "=" value+=STRING
		public Group getGroup_0_1_2_0_4_1() { return cGroup_0_1_2_0_4_1; }
		
		//KEYWORDS
		public RuleCall getKEYWORDSTerminalRuleCall_0_1_2_0_4_1_0() { return cKEYWORDSTerminalRuleCall_0_1_2_0_4_1_0; }
		
		//"="
		public Keyword getEqualsSignKeyword_0_1_2_0_4_1_1() { return cEqualsSignKeyword_0_1_2_0_4_1_1; }
		
		//value+=STRING
		public Assignment getValueAssignment_0_1_2_0_4_1_2() { return cValueAssignment_0_1_2_0_4_1_2; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_0_1_2_0_4_1_2_0() { return cValueSTRINGTerminalRuleCall_0_1_2_0_4_1_2_0; }
		
		//"/>"
		public Keyword getSolidusGreaterThanSignKeyword_0_1_2_1() { return cSolidusGreaterThanSignKeyword_0_1_2_1; }
		
		//{Opening} (("<" HEAD ":" KEYWORDS (HEAD ":" | KEYWORDS "=" value+=STRING)*) "/>")*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Opening}
		public Action getOpeningAction_1_0() { return cOpeningAction_1_0; }
		
		//(("<" HEAD ":" KEYWORDS (HEAD ":" | KEYWORDS "=" value+=STRING)*) "/>")*
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//("<" HEAD ":" KEYWORDS (HEAD ":" | KEYWORDS "=" value+=STRING)*)
		public Group getGroup_1_1_0() { return cGroup_1_1_0; }
		
		//"<"
		public Keyword getLessThanSignKeyword_1_1_0_0() { return cLessThanSignKeyword_1_1_0_0; }
		
		//HEAD
		public RuleCall getHEADTerminalRuleCall_1_1_0_1() { return cHEADTerminalRuleCall_1_1_0_1; }
		
		//":"
		public Keyword getColonKeyword_1_1_0_2() { return cColonKeyword_1_1_0_2; }
		
		//KEYWORDS
		public RuleCall getKEYWORDSTerminalRuleCall_1_1_0_3() { return cKEYWORDSTerminalRuleCall_1_1_0_3; }
		
		//(HEAD ":" | KEYWORDS "=" value+=STRING)*
		public Alternatives getAlternatives_1_1_0_4() { return cAlternatives_1_1_0_4; }
		
		//HEAD ":"
		public Group getGroup_1_1_0_4_0() { return cGroup_1_1_0_4_0; }
		
		//HEAD
		public RuleCall getHEADTerminalRuleCall_1_1_0_4_0_0() { return cHEADTerminalRuleCall_1_1_0_4_0_0; }
		
		//":"
		public Keyword getColonKeyword_1_1_0_4_0_1() { return cColonKeyword_1_1_0_4_0_1; }
		
		//KEYWORDS "=" value+=STRING
		public Group getGroup_1_1_0_4_1() { return cGroup_1_1_0_4_1; }
		
		//KEYWORDS
		public RuleCall getKEYWORDSTerminalRuleCall_1_1_0_4_1_0() { return cKEYWORDSTerminalRuleCall_1_1_0_4_1_0; }
		
		//"="
		public Keyword getEqualsSignKeyword_1_1_0_4_1_1() { return cEqualsSignKeyword_1_1_0_4_1_1; }
		
		//value+=STRING
		public Assignment getValueAssignment_1_1_0_4_1_2() { return cValueAssignment_1_1_0_4_1_2; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_1_0_4_1_2_0() { return cValueSTRINGTerminalRuleCall_1_1_0_4_1_2_0; }
		
		//"/>"
		public Keyword getSolidusGreaterThanSignKeyword_1_1_1() { return cSolidusGreaterThanSignKeyword_1_1_1; }
	}
	public class DataElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.BPMN_translator.Data");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cBODYTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cKEYWORDSTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Data:
		//	BODY | KEYWORDS | STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//BODY | KEYWORDS | STRING
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//BODY
		public RuleCall getBODYTerminalRuleCall_0() { return cBODYTerminalRuleCall_0; }
		
		//KEYWORDS
		public RuleCall getKEYWORDSTerminalRuleCall_1() { return cKEYWORDSTerminalRuleCall_1; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_2() { return cSTRINGTerminalRuleCall_2; }
	}
	public class OpenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.BPMN_translator.Open");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cOpensAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLessThanSignKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cHEADTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Keyword cColonKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final RuleCall cKEYWORDSTerminalRuleCall_1_3 = (RuleCall)cGroup_1.eContents().get(3);
		private final Alternatives cAlternatives_1_4 = (Alternatives)cGroup_1.eContents().get(4);
		private final Group cGroup_1_4_0 = (Group)cAlternatives_1_4.eContents().get(0);
		private final RuleCall cHEADTerminalRuleCall_1_4_0_0 = (RuleCall)cGroup_1_4_0.eContents().get(0);
		private final Keyword cColonKeyword_1_4_0_1 = (Keyword)cGroup_1_4_0.eContents().get(1);
		private final Group cGroup_1_4_1 = (Group)cAlternatives_1_4.eContents().get(1);
		private final RuleCall cKEYWORDSTerminalRuleCall_1_4_1_0 = (RuleCall)cGroup_1_4_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1_4_1_1 = (Keyword)cGroup_1_4_1.eContents().get(1);
		private final Assignment cValueAssignment_1_4_1_2 = (Assignment)cGroup_1_4_1.eContents().get(2);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_4_1_2_0 = (RuleCall)cValueAssignment_1_4_1_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_1_5 = (Keyword)cGroup_1.eContents().get(5);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final RuleCall cDataParserRuleCall_2_0 = (RuleCall)cAlternatives_2.eContents().get(0);
		private final Assignment cProvaAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cProvaOpeningParserRuleCall_2_1_0 = (RuleCall)cProvaAssignment_2_1.eContents().get(0);
		
		//Open:
		//	{Opens} ("<" HEAD ":" KEYWORDS (HEAD ":" | KEYWORDS "=" value+=STRING)* ">") (Data | prova+=Opening);
		@Override public ParserRule getRule() { return rule; }
		
		//{Opens} ("<" HEAD ":" KEYWORDS (HEAD ":" | KEYWORDS "=" value+=STRING)* ">") (Data | prova+=Opening)
		public Group getGroup() { return cGroup; }
		
		//{Opens}
		public Action getOpensAction_0() { return cOpensAction_0; }
		
		//("<" HEAD ":" KEYWORDS (HEAD ":" | KEYWORDS "=" value+=STRING)* ">")
		public Group getGroup_1() { return cGroup_1; }
		
		//"<"
		public Keyword getLessThanSignKeyword_1_0() { return cLessThanSignKeyword_1_0; }
		
		//HEAD
		public RuleCall getHEADTerminalRuleCall_1_1() { return cHEADTerminalRuleCall_1_1; }
		
		//":"
		public Keyword getColonKeyword_1_2() { return cColonKeyword_1_2; }
		
		//KEYWORDS
		public RuleCall getKEYWORDSTerminalRuleCall_1_3() { return cKEYWORDSTerminalRuleCall_1_3; }
		
		//(HEAD ":" | KEYWORDS "=" value+=STRING)*
		public Alternatives getAlternatives_1_4() { return cAlternatives_1_4; }
		
		//HEAD ":"
		public Group getGroup_1_4_0() { return cGroup_1_4_0; }
		
		//HEAD
		public RuleCall getHEADTerminalRuleCall_1_4_0_0() { return cHEADTerminalRuleCall_1_4_0_0; }
		
		//":"
		public Keyword getColonKeyword_1_4_0_1() { return cColonKeyword_1_4_0_1; }
		
		//KEYWORDS "=" value+=STRING
		public Group getGroup_1_4_1() { return cGroup_1_4_1; }
		
		//KEYWORDS
		public RuleCall getKEYWORDSTerminalRuleCall_1_4_1_0() { return cKEYWORDSTerminalRuleCall_1_4_1_0; }
		
		//"="
		public Keyword getEqualsSignKeyword_1_4_1_1() { return cEqualsSignKeyword_1_4_1_1; }
		
		//value+=STRING
		public Assignment getValueAssignment_1_4_1_2() { return cValueAssignment_1_4_1_2; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_4_1_2_0() { return cValueSTRINGTerminalRuleCall_1_4_1_2_0; }
		
		//">"
		public Keyword getGreaterThanSignKeyword_1_5() { return cGreaterThanSignKeyword_1_5; }
		
		//(Data | prova+=Opening)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//Data
		public RuleCall getDataParserRuleCall_2_0() { return cDataParserRuleCall_2_0; }
		
		//prova+=Opening
		public Assignment getProvaAssignment_2_1() { return cProvaAssignment_2_1; }
		
		//Opening
		public RuleCall getProvaOpeningParserRuleCall_2_1_0() { return cProvaOpeningParserRuleCall_2_1_0; }
	}
	public class SingletonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.BPMN_translator.Singleton");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSingletonAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLessThanSignKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cHEADTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Keyword cColonKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final RuleCall cKEYWORDSTerminalRuleCall_1_3 = (RuleCall)cGroup_1.eContents().get(3);
		private final Alternatives cAlternatives_1_4 = (Alternatives)cGroup_1.eContents().get(4);
		private final Group cGroup_1_4_0 = (Group)cAlternatives_1_4.eContents().get(0);
		private final RuleCall cHEADTerminalRuleCall_1_4_0_0 = (RuleCall)cGroup_1_4_0.eContents().get(0);
		private final Keyword cColonKeyword_1_4_0_1 = (Keyword)cGroup_1_4_0.eContents().get(1);
		private final Group cGroup_1_4_1 = (Group)cAlternatives_1_4.eContents().get(1);
		private final RuleCall cKEYWORDSTerminalRuleCall_1_4_1_0 = (RuleCall)cGroup_1_4_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1_4_1_1 = (Keyword)cGroup_1_4_1.eContents().get(1);
		private final Assignment cValueAssignment_1_4_1_2 = (Assignment)cGroup_1_4_1.eContents().get(2);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_4_1_2_0 = (RuleCall)cValueAssignment_1_4_1_2.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Singleton:
		//	{Singleton} ("<" HEAD ":" KEYWORDS (HEAD ":" | KEYWORDS "=" value+=STRING)*)
		//	"/>";
		@Override public ParserRule getRule() { return rule; }
		
		//{Singleton} ("<" HEAD ":" KEYWORDS (HEAD ":" | KEYWORDS "=" value+=STRING)*) "/>"
		public Group getGroup() { return cGroup; }
		
		//{Singleton}
		public Action getSingletonAction_0() { return cSingletonAction_0; }
		
		//("<" HEAD ":" KEYWORDS (HEAD ":" | KEYWORDS "=" value+=STRING)*)
		public Group getGroup_1() { return cGroup_1; }
		
		//"<"
		public Keyword getLessThanSignKeyword_1_0() { return cLessThanSignKeyword_1_0; }
		
		//HEAD
		public RuleCall getHEADTerminalRuleCall_1_1() { return cHEADTerminalRuleCall_1_1; }
		
		//":"
		public Keyword getColonKeyword_1_2() { return cColonKeyword_1_2; }
		
		//KEYWORDS
		public RuleCall getKEYWORDSTerminalRuleCall_1_3() { return cKEYWORDSTerminalRuleCall_1_3; }
		
		//(HEAD ":" | KEYWORDS "=" value+=STRING)*
		public Alternatives getAlternatives_1_4() { return cAlternatives_1_4; }
		
		//HEAD ":"
		public Group getGroup_1_4_0() { return cGroup_1_4_0; }
		
		//HEAD
		public RuleCall getHEADTerminalRuleCall_1_4_0_0() { return cHEADTerminalRuleCall_1_4_0_0; }
		
		//":"
		public Keyword getColonKeyword_1_4_0_1() { return cColonKeyword_1_4_0_1; }
		
		//KEYWORDS "=" value+=STRING
		public Group getGroup_1_4_1() { return cGroup_1_4_1; }
		
		//KEYWORDS
		public RuleCall getKEYWORDSTerminalRuleCall_1_4_1_0() { return cKEYWORDSTerminalRuleCall_1_4_1_0; }
		
		//"="
		public Keyword getEqualsSignKeyword_1_4_1_1() { return cEqualsSignKeyword_1_4_1_1; }
		
		//value+=STRING
		public Assignment getValueAssignment_1_4_1_2() { return cValueAssignment_1_4_1_2; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_4_1_2_0() { return cValueSTRINGTerminalRuleCall_1_4_1_2_0; }
		
		//"/>"
		public Keyword getSolidusGreaterThanSignKeyword_2() { return cSolidusGreaterThanSignKeyword_2; }
	}
	public class CloseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.BPMN_translator.Close");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cCloseAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLessThanSignSolidusKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cHEADTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Keyword cColonKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final RuleCall cKEYWORDSTerminalRuleCall_1_3 = (RuleCall)cGroup_1.eContents().get(3);
		private final Keyword cGreaterThanSignKeyword_1_4 = (Keyword)cGroup_1.eContents().get(4);
		
		//Close:
		//	{Close} ("</" HEAD ":" KEYWORDS ">");
		@Override public ParserRule getRule() { return rule; }
		
		//{Close} ("</" HEAD ":" KEYWORDS ">")
		public Group getGroup() { return cGroup; }
		
		//{Close}
		public Action getCloseAction_0() { return cCloseAction_0; }
		
		//("</" HEAD ":" KEYWORDS ">")
		public Group getGroup_1() { return cGroup_1; }
		
		//"</"
		public Keyword getLessThanSignSolidusKeyword_1_0() { return cLessThanSignSolidusKeyword_1_0; }
		
		//HEAD
		public RuleCall getHEADTerminalRuleCall_1_1() { return cHEADTerminalRuleCall_1_1; }
		
		//":"
		public Keyword getColonKeyword_1_2() { return cColonKeyword_1_2; }
		
		//KEYWORDS
		public RuleCall getKEYWORDSTerminalRuleCall_1_3() { return cKEYWORDSTerminalRuleCall_1_3; }
		
		//">"
		public Keyword getGreaterThanSignKeyword_1_4() { return cGreaterThanSignKeyword_1_4; }
	}
	
	
	private final ModelElements pModel;
	private final XmlElements pXml;
	private final OpeningElements pOpening;
	private final DataElements pData;
	private final OpenElements pOpen;
	private final SingletonElements pSingleton;
	private final CloseElements pClose;
	private final TerminalRule tHEAD;
	private final TerminalRule tKEYWORDS;
	private final TerminalRule tBODY;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public BPMN_translatorGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pXml = new XmlElements();
		this.pOpening = new OpeningElements();
		this.pData = new DataElements();
		this.pOpen = new OpenElements();
		this.pSingleton = new SingletonElements();
		this.pClose = new CloseElements();
		this.tHEAD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.BPMN_translator.HEAD");
		this.tKEYWORDS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.BPMN_translator.KEYWORDS");
		this.tBODY = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.BPMN_translator.BODY");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.BPMN_translator".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	model+=Xml;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Xml:
	//	{Xml} opening_tag+=Opening;
	public XmlElements getXmlAccess() {
		return pXml;
	}
	
	public ParserRule getXmlRule() {
		return getXmlAccess().getRule();
	}
	
	//Opening:
	//	{Opening} ((Prova+=Open Prova1+=Close) (Prova+=Open Prova1+=Close)* (("<" HEAD ":" KEYWORDS (HEAD ":" | KEYWORDS "="
	//	value+=STRING)*) "/>")*) | {Opening} (("<" HEAD ":" KEYWORDS (HEAD ":" | KEYWORDS "=" value+=STRING)*) "/>")*;
	public OpeningElements getOpeningAccess() {
		return pOpening;
	}
	
	public ParserRule getOpeningRule() {
		return getOpeningAccess().getRule();
	}
	
	//Data:
	//	BODY | KEYWORDS | STRING;
	public DataElements getDataAccess() {
		return pData;
	}
	
	public ParserRule getDataRule() {
		return getDataAccess().getRule();
	}
	
	//Open:
	//	{Opens} ("<" HEAD ":" KEYWORDS (HEAD ":" | KEYWORDS "=" value+=STRING)* ">") (Data | prova+=Opening);
	public OpenElements getOpenAccess() {
		return pOpen;
	}
	
	public ParserRule getOpenRule() {
		return getOpenAccess().getRule();
	}
	
	//Singleton:
	//	{Singleton} ("<" HEAD ":" KEYWORDS (HEAD ":" | KEYWORDS "=" value+=STRING)*)
	//	"/>";
	public SingletonElements getSingletonAccess() {
		return pSingleton;
	}
	
	public ParserRule getSingletonRule() {
		return getSingletonAccess().getRule();
	}
	
	//Close:
	//	{Close} ("</" HEAD ":" KEYWORDS ">");
	public CloseElements getCloseAccess() {
		return pClose;
	}
	
	public ParserRule getCloseRule() {
		return getCloseAccess().getRule();
	}
	
	//terminal HEAD:
	//	"bpmn" | "bpmndi" | "camunda" | "xsi";
	public TerminalRule getHEADRule() {
		return tHEAD;
	}
	
	//terminal KEYWORDS:
	//	"id" | "name" | "isExecutable" | "sourceRef" | "processRef" | "targetRef"
	//	| "calledElement" | "type" | "expression" | "value" | "resultVariable" | "asyncBefore"
	//	| "class" | "event" | "startEvent" | "task" | "messageEventDefinition" | "sequenceFlow"
	//	| "condition" | "association" | "outgoing" | "serviceTask" | "process"
	//	| "incoming" | "intermediateCatchEvent" | "conditionalEventDefinition"
	//	| "endEvent" | "textAnnotation" | "text" | "dataStoreReference"
	//	| "callActivity" | "laneSet" | "lane" | "flowNodeRef"
	//	| "dataOutputAssociation" | "exclusiveGateway"
	//	| "extensionElements" | "inputOutput" | "list" | "inputParameter"
	//	| "outputParameter" | "properties" | "property"
	//	| "field" | "string" | "scriptTask" | "script"
	//	| "executionListener" | "timerEventDefinition" | "timeDuration"
	//	| "parallelGateway";
	public TerminalRule getKEYWORDSRule() {
		return tKEYWORDS;
	}
	
	//terminal BODY:
	//	'a'..'z' | 'A'..'Z' | INT | '_'*;
	public TerminalRule getBODYRule() {
		return tBODY;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
