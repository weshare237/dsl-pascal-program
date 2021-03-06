/**
 * generated by Xtext 2.26.0
 */
package org.xtext.pascal.program.demoFkd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.pascal.program.demoFkd.DemoFkdPackage;
import org.xtext.pascal.program.demoFkd.identifier_list;
import org.xtext.pascal.program.demoFkd.parameter_type;
import org.xtext.pascal.program.demoFkd.value_parameter_section;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>value parameter section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.pascal.program.demoFkd.impl.value_parameter_sectionImpl#getIdentifiers <em>Identifiers</em>}</li>
 *   <li>{@link org.xtext.pascal.program.demoFkd.impl.value_parameter_sectionImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class value_parameter_sectionImpl extends MinimalEObjectImpl.Container implements value_parameter_section
{
  /**
   * The cached value of the '{@link #getIdentifiers() <em>Identifiers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifiers()
   * @generated
   * @ordered
   */
  protected identifier_list identifiers;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected parameter_type type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected value_parameter_sectionImpl()
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
    return DemoFkdPackage.Literals.VALUE_PARAMETER_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public identifier_list getIdentifiers()
  {
    return identifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentifiers(identifier_list newIdentifiers, NotificationChain msgs)
  {
    identifier_list oldIdentifiers = identifiers;
    identifiers = newIdentifiers;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoFkdPackage.VALUE_PARAMETER_SECTION__IDENTIFIERS, oldIdentifiers, newIdentifiers);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIdentifiers(identifier_list newIdentifiers)
  {
    if (newIdentifiers != identifiers)
    {
      NotificationChain msgs = null;
      if (identifiers != null)
        msgs = ((InternalEObject)identifiers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DemoFkdPackage.VALUE_PARAMETER_SECTION__IDENTIFIERS, null, msgs);
      if (newIdentifiers != null)
        msgs = ((InternalEObject)newIdentifiers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DemoFkdPackage.VALUE_PARAMETER_SECTION__IDENTIFIERS, null, msgs);
      msgs = basicSetIdentifiers(newIdentifiers, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoFkdPackage.VALUE_PARAMETER_SECTION__IDENTIFIERS, newIdentifiers, newIdentifiers));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public parameter_type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(parameter_type newType, NotificationChain msgs)
  {
    parameter_type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoFkdPackage.VALUE_PARAMETER_SECTION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(parameter_type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DemoFkdPackage.VALUE_PARAMETER_SECTION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DemoFkdPackage.VALUE_PARAMETER_SECTION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoFkdPackage.VALUE_PARAMETER_SECTION__TYPE, newType, newType));
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
      case DemoFkdPackage.VALUE_PARAMETER_SECTION__IDENTIFIERS:
        return basicSetIdentifiers(null, msgs);
      case DemoFkdPackage.VALUE_PARAMETER_SECTION__TYPE:
        return basicSetType(null, msgs);
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
      case DemoFkdPackage.VALUE_PARAMETER_SECTION__IDENTIFIERS:
        return getIdentifiers();
      case DemoFkdPackage.VALUE_PARAMETER_SECTION__TYPE:
        return getType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DemoFkdPackage.VALUE_PARAMETER_SECTION__IDENTIFIERS:
        setIdentifiers((identifier_list)newValue);
        return;
      case DemoFkdPackage.VALUE_PARAMETER_SECTION__TYPE:
        setType((parameter_type)newValue);
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
      case DemoFkdPackage.VALUE_PARAMETER_SECTION__IDENTIFIERS:
        setIdentifiers((identifier_list)null);
        return;
      case DemoFkdPackage.VALUE_PARAMETER_SECTION__TYPE:
        setType((parameter_type)null);
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
      case DemoFkdPackage.VALUE_PARAMETER_SECTION__IDENTIFIERS:
        return identifiers != null;
      case DemoFkdPackage.VALUE_PARAMETER_SECTION__TYPE:
        return type != null;
    }
    return super.eIsSet(featureID);
  }

} //value_parameter_sectionImpl
