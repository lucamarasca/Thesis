/**
 * generated by Xtext 2.23.0
 */
package org.xtext.bPMN_translator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.bPMN_translator.Tag#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see org.xtext.bPMN_translator.BPMN_translatorPackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends EObject
{
  /**
   * Returns the value of the '<em><b>Result</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result</em>' attribute list.
   * @see org.xtext.bPMN_translator.BPMN_translatorPackage#getTag_Result()
   * @model unique="false"
   * @generated
   */
  EList<String> getResult();

} // Tag
