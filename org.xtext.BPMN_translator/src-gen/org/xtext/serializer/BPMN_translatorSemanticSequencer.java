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
import org.xtext.bPMN_translator.Open;
import org.xtext.bPMN_translator.Singleton;
import org.xtext.bPMN_translator.Xml;
import org.xtext.bPMN_translator.codex;
import org.xtext.bPMN_translator.content;
import org.xtext.bPMN_translator.device;
import org.xtext.bPMN_translator.element;
import org.xtext.bPMN_translator.http_data;
import org.xtext.bPMN_translator.mqtt_data;
import org.xtext.bPMN_translator.mqtt_network_data;
import org.xtext.bPMN_translator.protocol;
import org.xtext.bPMN_translator.protocol_device;
import org.xtext.bPMN_translator.sensor;
import org.xtext.bPMN_translator.sensor_data;
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
			case BPMN_translatorPackage.OPEN:
				sequence_Open(context, (Open) semanticObject); 
				return; 
			case BPMN_translatorPackage.SINGLETON:
				sequence_Singleton(context, (Singleton) semanticObject); 
				return; 
			case BPMN_translatorPackage.XML:
				sequence_Xml(context, (Xml) semanticObject); 
				return; 
			case BPMN_translatorPackage.CODEX:
				sequence_codex(context, (codex) semanticObject); 
				return; 
			case BPMN_translatorPackage.CONTENT:
				sequence_content(context, (content) semanticObject); 
				return; 
			case BPMN_translatorPackage.DEVICE:
				sequence_device(context, (device) semanticObject); 
				return; 
			case BPMN_translatorPackage.ELEMENT:
				sequence_element(context, (element) semanticObject); 
				return; 
			case BPMN_translatorPackage.HTTP_DATA:
				sequence_http_data(context, (http_data) semanticObject); 
				return; 
			case BPMN_translatorPackage.MQTT_DATA:
				sequence_mqtt_data(context, (mqtt_data) semanticObject); 
				return; 
			case BPMN_translatorPackage.MQTT_NETWORK_DATA:
				sequence_mqtt_network_data(context, (mqtt_network_data) semanticObject); 
				return; 
			case BPMN_translatorPackage.PROTOCOL:
				sequence_protocol(context, (protocol) semanticObject); 
				return; 
			case BPMN_translatorPackage.PROTOCOL_DEVICE:
				sequence_protocol_device(context, (protocol_device) semanticObject); 
				return; 
			case BPMN_translatorPackage.SENSOR:
				sequence_sensor(context, (sensor) semanticObject); 
				return; 
			case BPMN_translatorPackage.SENSOR_DATA:
				sequence_sensor_data(context, (sensor_data) semanticObject); 
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
	 *     Open returns Open
	 *
	 * Constraint:
	 *     (head+=HEAD keywords+=KEYWORDS (head1+=HEAD? ((head1+=HEAD | keywords1+=KEYWORDS) value+=STRING)?)+)
	 */
	protected void sequence_Open(ISerializationContext context, Open semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Singleton returns Singleton
	 *
	 * Constraint:
	 *     (keywords+=KEYWORDS (keywords1+=KEYWORDS value+=STRING)*)
	 */
	protected void sequence_Singleton(ISerializationContext context, Singleton semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Xml returns Xml
	 *
	 * Constraint:
	 *     prova+=element*
	 */
	protected void sequence_Xml(ISerializationContext context, Xml semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     codex returns codex
	 *
	 * Constraint:
	 *     (device_code+=device protocol+=protocol* sensor_code+=sensor*)
	 */
	protected void sequence_codex(ISerializationContext context, codex semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     content returns content
	 *
	 * Constraint:
	 *     (
	 *         (element+=element | keywords+=KEYWORDS | data+=STRING)? 
	 *         ((type+='_TASK' | type+='_GATEWAY') codex+=codex)? 
	 *         (body+=preconditions* (body+=BODY | body+=variables) body+=conditions*)?
	 *     )+
	 */
	protected void sequence_content(ISerializationContext context, content semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     device returns device
	 *
	 * Constraint:
	 *     (device+=STRING id+=STRING)
	 */
	protected void sequence_device(ISerializationContext context, device semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     element returns element
	 *
	 * Constraint:
	 *     ((open+=Open contents+=content close_tag+=Close) | singleton_tag+=Singleton)
	 */
	protected void sequence_element(ISerializationContext context, element semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     http_data returns http_data
	 *
	 * Constraint:
	 *     (
	 *         pname+=STRING | 
	 *         server_ip+=STRING | 
	 *         request_type+=STRING | 
	 *         content_type+=STRING | 
	 *         header+=STRING | 
	 *         data+=STRING | 
	 *         mqtt_network_data+=mqtt_network_data
	 *     )*
	 */
	protected void sequence_http_data(ISerializationContext context, http_data semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     mqtt_data returns mqtt_data
	 *
	 * Constraint:
	 *     (
	 *         pname+=STRING | 
	 *         broker_user+=STRING | 
	 *         broker_password+=STRING | 
	 *         broker+=STRING | 
	 *         mqtt_network_data+=mqtt_network_data | 
	 *         subtopics+=STRING | 
	 *         pubtopics+=STRING | 
	 *         value+=STRING
	 *     )*
	 */
	protected void sequence_mqtt_data(ISerializationContext context, mqtt_data semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     mqtt_network_data returns mqtt_network_data
	 *
	 * Constraint:
	 *     (ssid+=STRING password+=STRING)
	 */
	protected void sequence_mqtt_network_data(ISerializationContext context, mqtt_network_data semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     protocol_device returns protocol_device
	 *
	 * Constraint:
	 *     dname+=STRING
	 */
	protected void sequence_protocol_device(ISerializationContext context, protocol_device semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     protocol returns protocol
	 *
	 * Constraint:
	 *     ((pname+='MQTT' mqtt_data+=mqtt_data mqtt_device+=protocol_device) | (pname+='HTTP' http_data+=http_data http_device+=protocol_device))
	 */
	protected void sequence_protocol(ISerializationContext context, protocol semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     sensor_data returns sensor_data
	 *
	 * Constraint:
	 *     (pname+=STRING | pins+=STRING | sensor_id+=STRING)*
	 */
	protected void sequence_sensor_data(ISerializationContext context, sensor_data semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     sensor returns sensor
	 *
	 * Constraint:
	 *     ((sname+='TEMPERATURE' sensor+=sensor_data) | (sname+='DISTANCE' sensor+=sensor_data))
	 */
	protected void sequence_sensor(ISerializationContext context, sensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
