/*
 * generated by Xtext 2.23.0
 */
package org.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.xtext.bPMN_translator.BPMN_translatorPackage;
import org.xtext.bPMN_translator.Model;
import org.xtext.bPMN_translator.Tag;
import org.xtext.bPMN_translator.Xml;
import org.xtext.services.BPMN_translatorGrammarAccess;

@SuppressWarnings("all")
public class BPMN_translatorSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BPMN_translatorGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BPMN_translatorPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BPMN_translatorPackage.ACTION:
				sequence_Singleton(context, (org.xtext.bPMN_translator.Action) semanticObject); 
				return; 
			case BPMN_translatorPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case BPMN_translatorPackage.TAG:
				sequence_Tag(context, (Tag) semanticObject); 
				return; 
			case BPMN_translatorPackage.XML:
				sequence_Xml(context, (Xml) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     model+=Xml
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tag returns Action
	 *     Singleton returns Action
	 *
	 * Constraint:
	 *     value+=STRING*
	 */
	protected void sequence_Singleton(ISerializationContext context, org.xtext.bPMN_translator.Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tag returns Tag
	 *
	 * Constraint:
	 *     (result+=BODY | result+=KEYWORDS | result+=STRING)
	 */
	protected void sequence_Tag(ISerializationContext context, Tag semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Xml returns Xml
	 *
	 * Constraint:
	 *     tag+=Tag*
	 */
	protected void sequence_Xml(ISerializationContext context, Xml semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
