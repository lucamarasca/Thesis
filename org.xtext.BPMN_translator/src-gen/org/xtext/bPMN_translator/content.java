/**
 * generated by Xtext 2.23.0
 */
package org.xtext.bPMN_translator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.bPMN_translator.content#getElement <em>Element</em>}</li>
 *   <li>{@link org.xtext.bPMN_translator.content#getBody <em>Body</em>}</li>
 *   <li>{@link org.xtext.bPMN_translator.content#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link org.xtext.bPMN_translator.content#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see org.xtext.bPMN_translator.BPMN_translatorPackage#getcontent()
 * @model
 * @generated
 */
public interface content extends EObject
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.bPMN_translator.element}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference list.
   * @see org.xtext.bPMN_translator.BPMN_translatorPackage#getcontent_Element()
   * @model containment="true"
   * @generated
   */
  EList<element> getElement();

  /**
   * Returns the value of the '<em><b>Body</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' attribute list.
   * @see org.xtext.bPMN_translator.BPMN_translatorPackage#getcontent_Body()
   * @model unique="false"
   * @generated
   */
  EList<String> getBody();

  /**
   * Returns the value of the '<em><b>Keywords</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keywords</em>' attribute list.
   * @see org.xtext.bPMN_translator.BPMN_translatorPackage#getcontent_Keywords()
   * @model unique="false"
   * @generated
   */
  EList<String> getKeywords();

  /**
   * Returns the value of the '<em><b>Data</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' attribute list.
   * @see org.xtext.bPMN_translator.BPMN_translatorPackage#getcontent_Data()
   * @model unique="false"
   * @generated
   */
  EList<String> getData();

} // content
