/**
 * generated by Xtext 2.23.0
 */
package org.xtext.bPMN_translator.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.bPMN_translator.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.bPMN_translator.BPMN_translatorPackage
 * @generated
 */
public class BPMN_translatorSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BPMN_translatorPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BPMN_translatorSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = BPMN_translatorPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case BPMN_translatorPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BPMN_translatorPackage.XML:
      {
        Xml xml = (Xml)theEObject;
        T result = caseXml(xml);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BPMN_translatorPackage.ELEMENT:
      {
        element element = (element)theEObject;
        T result = caseelement(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BPMN_translatorPackage.CONTENT:
      {
        content content = (content)theEObject;
        T result = casecontent(content);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BPMN_translatorPackage.OPEN:
      {
        Open open = (Open)theEObject;
        T result = caseOpen(open);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BPMN_translatorPackage.SINGLETON:
      {
        Singleton singleton = (Singleton)theEObject;
        T result = caseSingleton(singleton);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BPMN_translatorPackage.CLOSE:
      {
        Close close = (Close)theEObject;
        T result = caseClose(close);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BPMN_translatorPackage.CODEX:
      {
        codex codex = (codex)theEObject;
        T result = casecodex(codex);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BPMN_translatorPackage.DEVICE:
      {
        device device = (device)theEObject;
        T result = casedevice(device);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BPMN_translatorPackage.PROTOCOL:
      {
        protocol protocol = (protocol)theEObject;
        T result = caseprotocol(protocol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BPMN_translatorPackage.MQTT_DATA:
      {
        mqtt_data mqtt_data = (mqtt_data)theEObject;
        T result = casemqtt_data(mqtt_data);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BPMN_translatorPackage.MQTT_NETWORK_DATA:
      {
        mqtt_network_data mqtt_network_data = (mqtt_network_data)theEObject;
        T result = casemqtt_network_data(mqtt_network_data);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BPMN_translatorPackage.MQTT_DEVICE:
      {
        mqtt_device mqtt_device = (mqtt_device)theEObject;
        T result = casemqtt_device(mqtt_device);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BPMN_translatorPackage.SENSOR:
      {
        sensor sensor = (sensor)theEObject;
        T result = casesensor(sensor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BPMN_translatorPackage.SENSOR_DATA:
      {
        sensor_data sensor_data = (sensor_data)theEObject;
        T result = casesensor_data(sensor_data);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BPMN_translatorPackage.ELEMENT_VALUE:
      {
        element_value element_value = (element_value)theEObject;
        T result = caseelement_value(element_value);
        if (result == null) result = caseelement(element_value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Xml</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Xml</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXml(Xml object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseelement(element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>content</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>content</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecontent(content object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Open</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Open</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOpen(Open object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Singleton</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Singleton</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleton(Singleton object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Close</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Close</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClose(Close object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>codex</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>codex</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecodex(codex object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>device</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedevice(device object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>protocol</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>protocol</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseprotocol(protocol object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>mqtt data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>mqtt data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemqtt_data(mqtt_data object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>mqtt network data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>mqtt network data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemqtt_network_data(mqtt_network_data object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>mqtt device</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>mqtt device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemqtt_device(mqtt_device object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>sensor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sensor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesensor(sensor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>sensor data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>sensor data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesensor_data(sensor_data object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>element value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>element value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseelement_value(element_value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //BPMN_translatorSwitch
