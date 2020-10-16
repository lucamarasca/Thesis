/**
 * generated by Xtext 2.23.0
 */
package org.xtext.bPMN_translator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.bPMN_translator.element#getSingleton_tag <em>Singleton tag</em>}</li>
 * </ul>
 *
 * @see org.xtext.bPMN_translator.BPMN_translatorPackage#getelement()
 * @model
 * @generated
 */
public interface element extends EObject
{
  /**
   * Returns the value of the '<em><b>Singleton tag</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.bPMN_translator.Singleton}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Singleton tag</em>' containment reference list.
   * @see org.xtext.bPMN_translator.BPMN_translatorPackage#getelement_Singleton_tag()
   * @model containment="true"
   * @generated
   */
  EList<Singleton> getSingleton_tag();

} // element