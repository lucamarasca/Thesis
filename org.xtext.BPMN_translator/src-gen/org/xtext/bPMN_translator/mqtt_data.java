/**
 * generated by Xtext 2.23.0
 */
package org.xtext.bPMN_translator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>mqtt data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.bPMN_translator.mqtt_data#getPname <em>Pname</em>}</li>
 *   <li>{@link org.xtext.bPMN_translator.mqtt_data#getBroker_user <em>Broker user</em>}</li>
 *   <li>{@link org.xtext.bPMN_translator.mqtt_data#getBroker_password <em>Broker password</em>}</li>
 *   <li>{@link org.xtext.bPMN_translator.mqtt_data#getBroker <em>Broker</em>}</li>
 *   <li>{@link org.xtext.bPMN_translator.mqtt_data#getMqtt_network_data <em>Mqtt network data</em>}</li>
 *   <li>{@link org.xtext.bPMN_translator.mqtt_data#getSubtopics <em>Subtopics</em>}</li>
 *   <li>{@link org.xtext.bPMN_translator.mqtt_data#getPubtopics <em>Pubtopics</em>}</li>
 *   <li>{@link org.xtext.bPMN_translator.mqtt_data#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.bPMN_translator.BPMN_translatorPackage#getmqtt_data()
 * @model
 * @generated
 */
public interface mqtt_data extends EObject
{
  /**
   * Returns the value of the '<em><b>Pname</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pname</em>' attribute list.
   * @see org.xtext.bPMN_translator.BPMN_translatorPackage#getmqtt_data_Pname()
   * @model unique="false"
   * @generated
   */
  EList<String> getPname();

  /**
   * Returns the value of the '<em><b>Broker user</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Broker user</em>' attribute list.
   * @see org.xtext.bPMN_translator.BPMN_translatorPackage#getmqtt_data_Broker_user()
   * @model unique="false"
   * @generated
   */
  EList<String> getBroker_user();

  /**
   * Returns the value of the '<em><b>Broker password</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Broker password</em>' attribute list.
   * @see org.xtext.bPMN_translator.BPMN_translatorPackage#getmqtt_data_Broker_password()
   * @model unique="false"
   * @generated
   */
  EList<String> getBroker_password();

  /**
   * Returns the value of the '<em><b>Broker</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Broker</em>' attribute list.
   * @see org.xtext.bPMN_translator.BPMN_translatorPackage#getmqtt_data_Broker()
   * @model unique="false"
   * @generated
   */
  EList<String> getBroker();

  /**
   * Returns the value of the '<em><b>Mqtt network data</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.bPMN_translator.mqtt_network_data}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mqtt network data</em>' containment reference list.
   * @see org.xtext.bPMN_translator.BPMN_translatorPackage#getmqtt_data_Mqtt_network_data()
   * @model containment="true"
   * @generated
   */
  EList<mqtt_network_data> getMqtt_network_data();

  /**
   * Returns the value of the '<em><b>Subtopics</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subtopics</em>' attribute list.
   * @see org.xtext.bPMN_translator.BPMN_translatorPackage#getmqtt_data_Subtopics()
   * @model unique="false"
   * @generated
   */
  EList<String> getSubtopics();

  /**
   * Returns the value of the '<em><b>Pubtopics</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pubtopics</em>' attribute list.
   * @see org.xtext.bPMN_translator.BPMN_translatorPackage#getmqtt_data_Pubtopics()
   * @model unique="false"
   * @generated
   */
  EList<String> getPubtopics();

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute list.
   * @see org.xtext.bPMN_translator.BPMN_translatorPackage#getmqtt_data_Value()
   * @model unique="false"
   * @generated
   */
  EList<String> getValue();

} // mqtt_data
