/**
 * generated by Xtext 2.23.0
 */
package org.xtext.bPMN_translator.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.bPMN_translator.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMN_translatorFactoryImpl extends EFactoryImpl implements BPMN_translatorFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BPMN_translatorFactory init()
  {
    try
    {
      BPMN_translatorFactory theBPMN_translatorFactory = (BPMN_translatorFactory)EPackage.Registry.INSTANCE.getEFactory(BPMN_translatorPackage.eNS_URI);
      if (theBPMN_translatorFactory != null)
      {
        return theBPMN_translatorFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BPMN_translatorFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BPMN_translatorFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BPMN_translatorPackage.MODEL: return createModel();
      case BPMN_translatorPackage.XML: return createXml();
      case BPMN_translatorPackage.ELEMENT: return createelement();
      case BPMN_translatorPackage.CONTENT: return createcontent();
      case BPMN_translatorPackage.OPEN: return createOpen();
      case BPMN_translatorPackage.SINGLETON: return createSingleton();
      case BPMN_translatorPackage.CLOSE: return createClose();
      case BPMN_translatorPackage.ELEMENT_VALUE: return createelement_value();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Xml createXml()
  {
    XmlImpl xml = new XmlImpl();
    return xml;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public element createelement()
  {
    elementImpl element = new elementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public content createcontent()
  {
    contentImpl content = new contentImpl();
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Open createOpen()
  {
    OpenImpl open = new OpenImpl();
    return open;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Singleton createSingleton()
  {
    SingletonImpl singleton = new SingletonImpl();
    return singleton;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Close createClose()
  {
    CloseImpl close = new CloseImpl();
    return close;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public element_value createelement_value()
  {
    element_valueImpl element_value = new element_valueImpl();
    return element_value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BPMN_translatorPackage getBPMN_translatorPackage()
  {
    return (BPMN_translatorPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BPMN_translatorPackage getPackage()
  {
    return BPMN_translatorPackage.eINSTANCE;
  }

} //BPMN_translatorFactoryImpl
