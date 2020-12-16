/**
 * generated by Xtext 2.23.0
 */
package org.xtext.bPMN_translator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>mqtt device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.bPMN_translator.mqtt_device#getProtocol_device <em>Protocol device</em>}</li>
 * </ul>
 *
 * @see org.xtext.bPMN_translator.BPMN_translatorPackage#getmqtt_device()
 * @model
 * @generated
 */
public interface mqtt_device extends EObject
{
  /**
   * Returns the value of the '<em><b>Protocol device</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Protocol device</em>' attribute list.
   * @see org.xtext.bPMN_translator.BPMN_translatorPackage#getmqtt_device_Protocol_device()
   * @model unique="false"
   * @generated
   */
  EList<String> getProtocol_device();

} // mqtt_device
