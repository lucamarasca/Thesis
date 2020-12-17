/**
 * generated by Xtext 2.23.0
 */
package org.xtext.bPMN_translator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sensor data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.bPMN_translator.sensor_data#getPname <em>Pname</em>}</li>
 *   <li>{@link org.xtext.bPMN_translator.sensor_data#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.bPMN_translator.sensor_data#getPins <em>Pins</em>}</li>
 * </ul>
 *
 * @see org.xtext.bPMN_translator.BPMN_translatorPackage#getsensor_data()
 * @model
 * @generated
 */
public interface sensor_data extends EObject
{
  /**
   * Returns the value of the '<em><b>Pname</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pname</em>' attribute list.
   * @see org.xtext.bPMN_translator.BPMN_translatorPackage#getsensor_data_Pname()
   * @model unique="false"
   * @generated
   */
  EList<String> getPname();

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute list.
   * @see org.xtext.bPMN_translator.BPMN_translatorPackage#getsensor_data_Type()
   * @model unique="false"
   * @generated
   */
  EList<String> getType();

  /**
   * Returns the value of the '<em><b>Pins</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pins</em>' attribute list.
   * @see org.xtext.bPMN_translator.BPMN_translatorPackage#getsensor_data_Pins()
   * @model unique="false"
   * @generated
   */
  EList<String> getPins();

} // sensor_data