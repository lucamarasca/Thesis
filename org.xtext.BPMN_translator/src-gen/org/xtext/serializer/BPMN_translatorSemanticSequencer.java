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
import org.xtext.bPMN_translator.Close;
import org.xtext.bPMN_translator.Model;
import org.xtext.bPMN_translator.Opening;
import org.xtext.bPMN_translator.Opens;
import org.xtext.bPMN_translator.Singleton;
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
			case BPMN_translatorPackage.CLOSE:
				sequence_Close(context, (Close) semanticObject); 
				return; 
			case BPMN_translatorPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case BPMN_translatorPackage.OPENING:
				sequence_Opening(context, (Opening) semanticObject); 
				return; 
			case BPMN_translatorPackage.OPENS:
				sequence_Open(context, (Opens) semanticObject); 
				return; 
			case BPMN_translatorPackage.SINGLETON:
				sequence_Singleton(context, (Singleton) semanticObject); 
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
	 *     Close returns Close
	 *
	 * Constraint:
	 *     {Close}
	 */
	protected void sequence_Close(ISerializationContext context, Close semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     Open returns Opens
	 *
	 * Constraint:
	 *     (value+=STRING* prova+=Opening?)
	 */
	protected void sequence_Open(ISerializationContext context, Opens semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Opening returns Opening
	 *
	 * Constraint:
	 *     ((Prova+=Open Prova1+=Close (Prova+=Open Prova1+=Close)* value+=STRING*) | value+=STRING+)?
	 */
	protected void sequence_Opening(ISerializationContext context, Opening semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Singleton returns Singleton
	 *
	 * Constraint:
	 *     value+=STRING*
	 */
	protected void sequence_Singleton(ISerializationContext context, Singleton semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Xml returns Xml
	 *
	 * Constraint:
	 *     opening_tag+=Opening
	 */
	protected void sequence_Xml(ISerializationContext context, Xml semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
