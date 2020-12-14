/**
 * generated by Xtext 2.23.0
 */
package org.xtext.bPMN_translator.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.bPMN_translator.BPMN_translatorPackage;
import org.xtext.bPMN_translator.protocol_data;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>protocol data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.bPMN_translator.impl.protocol_dataImpl#getPname <em>Pname</em>}</li>
 *   <li>{@link org.xtext.bPMN_translator.impl.protocol_dataImpl#getMac <em>Mac</em>}</li>
 *   <li>{@link org.xtext.bPMN_translator.impl.protocol_dataImpl#getIp_address <em>Ip address</em>}</li>
 *   <li>{@link org.xtext.bPMN_translator.impl.protocol_dataImpl#getServer_address <em>Server address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class protocol_dataImpl extends MinimalEObjectImpl.Container implements protocol_data
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
   * The cached value of the '{@link #getMac() <em>Mac</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMac()
   * @generated
   * @ordered
   */
  protected EList<String> mac;

  /**
   * The cached value of the '{@link #getIp_address() <em>Ip address</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIp_address()
   * @generated
   * @ordered
   */
  protected EList<String> ip_address;

  /**
   * The cached value of the '{@link #getServer_address() <em>Server address</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServer_address()
   * @generated
   * @ordered
   */
  protected EList<String> server_address;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected protocol_dataImpl()
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
    return BPMN_translatorPackage.Literals.PROTOCOL_DATA;
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
      pname = new EDataTypeEList<String>(String.class, this, BPMN_translatorPackage.PROTOCOL_DATA__PNAME);
    }
    return pname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getMac()
  {
    if (mac == null)
    {
      mac = new EDataTypeEList<String>(String.class, this, BPMN_translatorPackage.PROTOCOL_DATA__MAC);
    }
    return mac;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getIp_address()
  {
    if (ip_address == null)
    {
      ip_address = new EDataTypeEList<String>(String.class, this, BPMN_translatorPackage.PROTOCOL_DATA__IP_ADDRESS);
    }
    return ip_address;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getServer_address()
  {
    if (server_address == null)
    {
      server_address = new EDataTypeEList<String>(String.class, this, BPMN_translatorPackage.PROTOCOL_DATA__SERVER_ADDRESS);
    }
    return server_address;
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
      case BPMN_translatorPackage.PROTOCOL_DATA__PNAME:
        return getPname();
      case BPMN_translatorPackage.PROTOCOL_DATA__MAC:
        return getMac();
      case BPMN_translatorPackage.PROTOCOL_DATA__IP_ADDRESS:
        return getIp_address();
      case BPMN_translatorPackage.PROTOCOL_DATA__SERVER_ADDRESS:
        return getServer_address();
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
      case BPMN_translatorPackage.PROTOCOL_DATA__PNAME:
        getPname().clear();
        getPname().addAll((Collection<? extends String>)newValue);
        return;
      case BPMN_translatorPackage.PROTOCOL_DATA__MAC:
        getMac().clear();
        getMac().addAll((Collection<? extends String>)newValue);
        return;
      case BPMN_translatorPackage.PROTOCOL_DATA__IP_ADDRESS:
        getIp_address().clear();
        getIp_address().addAll((Collection<? extends String>)newValue);
        return;
      case BPMN_translatorPackage.PROTOCOL_DATA__SERVER_ADDRESS:
        getServer_address().clear();
        getServer_address().addAll((Collection<? extends String>)newValue);
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
      case BPMN_translatorPackage.PROTOCOL_DATA__PNAME:
        getPname().clear();
        return;
      case BPMN_translatorPackage.PROTOCOL_DATA__MAC:
        getMac().clear();
        return;
      case BPMN_translatorPackage.PROTOCOL_DATA__IP_ADDRESS:
        getIp_address().clear();
        return;
      case BPMN_translatorPackage.PROTOCOL_DATA__SERVER_ADDRESS:
        getServer_address().clear();
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
      case BPMN_translatorPackage.PROTOCOL_DATA__PNAME:
        return pname != null && !pname.isEmpty();
      case BPMN_translatorPackage.PROTOCOL_DATA__MAC:
        return mac != null && !mac.isEmpty();
      case BPMN_translatorPackage.PROTOCOL_DATA__IP_ADDRESS:
        return ip_address != null && !ip_address.isEmpty();
      case BPMN_translatorPackage.PROTOCOL_DATA__SERVER_ADDRESS:
        return server_address != null && !server_address.isEmpty();
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
    result.append(", mac: ");
    result.append(mac);
    result.append(", ip_address: ");
    result.append(ip_address);
    result.append(", server_address: ");
    result.append(server_address);
    result.append(')');
    return result.toString();
  }

} //protocol_dataImpl
