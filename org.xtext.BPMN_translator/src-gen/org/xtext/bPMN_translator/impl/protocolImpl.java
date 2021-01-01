/**
 * generated by Xtext 2.23.0
 */
package org.xtext.bPMN_translator.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.bPMN_translator.BPMN_translatorPackage;
import org.xtext.bPMN_translator.http_data;
import org.xtext.bPMN_translator.mqtt_data;
import org.xtext.bPMN_translator.mqtt_device;
import org.xtext.bPMN_translator.protocol;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.bPMN_translator.impl.protocolImpl#getPname <em>Pname</em>}</li>
 *   <li>{@link org.xtext.bPMN_translator.impl.protocolImpl#getMqtt_data <em>Mqtt data</em>}</li>
 *   <li>{@link org.xtext.bPMN_translator.impl.protocolImpl#getMqtt_device <em>Mqtt device</em>}</li>
 *   <li>{@link org.xtext.bPMN_translator.impl.protocolImpl#getHttp_data <em>Http data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class protocolImpl extends MinimalEObjectImpl.Container implements protocol
{
  /**
   * The cached value of the '{@link #getPname() <em>Pname</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPname()
   * @generated
   * @ordered
   */
  protected EList<String> pname;

  /**
   * The cached value of the '{@link #getMqtt_data() <em>Mqtt data</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMqtt_data()
   * @generated
   * @ordered
   */
  protected EList<mqtt_data> mqtt_data;

  /**
   * The cached value of the '{@link #getMqtt_device() <em>Mqtt device</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMqtt_device()
   * @generated
   * @ordered
   */
  protected EList<mqtt_device> mqtt_device;

  /**
   * The cached value of the '{@link #getHttp_data() <em>Http data</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHttp_data()
   * @generated
   * @ordered
   */
  protected EList<http_data> http_data;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected protocolImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BPMN_translatorPackage.Literals.PROTOCOL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getPname()
  {
    if (pname == null)
    {
      pname = new EDataTypeEList<String>(String.class, this, BPMN_translatorPackage.PROTOCOL__PNAME);
    }
    return pname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<mqtt_data> getMqtt_data()
  {
    if (mqtt_data == null)
    {
      mqtt_data = new EObjectContainmentEList<mqtt_data>(mqtt_data.class, this, BPMN_translatorPackage.PROTOCOL__MQTT_DATA);
    }
    return mqtt_data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<mqtt_device> getMqtt_device()
  {
    if (mqtt_device == null)
    {
      mqtt_device = new EObjectContainmentEList<mqtt_device>(mqtt_device.class, this, BPMN_translatorPackage.PROTOCOL__MQTT_DEVICE);
    }
    return mqtt_device;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<http_data> getHttp_data()
  {
    if (http_data == null)
    {
      http_data = new EObjectContainmentEList<http_data>(http_data.class, this, BPMN_translatorPackage.PROTOCOL__HTTP_DATA);
    }
    return http_data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BPMN_translatorPackage.PROTOCOL__MQTT_DATA:
        return ((InternalEList<?>)getMqtt_data()).basicRemove(otherEnd, msgs);
      case BPMN_translatorPackage.PROTOCOL__MQTT_DEVICE:
        return ((InternalEList<?>)getMqtt_device()).basicRemove(otherEnd, msgs);
      case BPMN_translatorPackage.PROTOCOL__HTTP_DATA:
        return ((InternalEList<?>)getHttp_data()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BPMN_translatorPackage.PROTOCOL__PNAME:
        return getPname();
      case BPMN_translatorPackage.PROTOCOL__MQTT_DATA:
        return getMqtt_data();
      case BPMN_translatorPackage.PROTOCOL__MQTT_DEVICE:
        return getMqtt_device();
      case BPMN_translatorPackage.PROTOCOL__HTTP_DATA:
        return getHttp_data();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BPMN_translatorPackage.PROTOCOL__PNAME:
        getPname().clear();
        getPname().addAll((Collection<? extends String>)newValue);
        return;
      case BPMN_translatorPackage.PROTOCOL__MQTT_DATA:
        getMqtt_data().clear();
        getMqtt_data().addAll((Collection<? extends mqtt_data>)newValue);
        return;
      case BPMN_translatorPackage.PROTOCOL__MQTT_DEVICE:
        getMqtt_device().clear();
        getMqtt_device().addAll((Collection<? extends mqtt_device>)newValue);
        return;
      case BPMN_translatorPackage.PROTOCOL__HTTP_DATA:
        getHttp_data().clear();
        getHttp_data().addAll((Collection<? extends http_data>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BPMN_translatorPackage.PROTOCOL__PNAME:
        getPname().clear();
        return;
      case BPMN_translatorPackage.PROTOCOL__MQTT_DATA:
        getMqtt_data().clear();
        return;
      case BPMN_translatorPackage.PROTOCOL__MQTT_DEVICE:
        getMqtt_device().clear();
        return;
      case BPMN_translatorPackage.PROTOCOL__HTTP_DATA:
        getHttp_data().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BPMN_translatorPackage.PROTOCOL__PNAME:
        return pname != null && !pname.isEmpty();
      case BPMN_translatorPackage.PROTOCOL__MQTT_DATA:
        return mqtt_data != null && !mqtt_data.isEmpty();
      case BPMN_translatorPackage.PROTOCOL__MQTT_DEVICE:
        return mqtt_device != null && !mqtt_device.isEmpty();
      case BPMN_translatorPackage.PROTOCOL__HTTP_DATA:
        return http_data != null && !http_data.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (pname: ");
    result.append(pname);
    result.append(')');
    return result.toString();
  }

} //protocolImpl
