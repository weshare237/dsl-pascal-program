/**
 * generated by Xtext 2.26.0
 */
package org.xtext.pascal.program.demoFkd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.pascal.program.demoFkd.AbstractElement;
import org.xtext.pascal.program.demoFkd.DemoFkdPackage;
import org.xtext.pascal.program.demoFkd.pascal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>pascal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.pascal.program.demoFkd.impl.pascalImpl#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @generated
 */
public class pascalImpl extends MinimalEObjectImpl.Container implements pascal
{
  /**
   * The cached value of the '{@link #getProgram() <em>Program</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProgram()
   * @generated
   * @ordered
   */
  protected EList<AbstractElement> program;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected pascalImpl()
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
    return DemoFkdPackage.Literals.PASCAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AbstractElement> getProgram()
  {
    if (program == null)
    {
      program = new EObjectContainmentEList<AbstractElement>(AbstractElement.class, this, DemoFkdPackage.PASCAL__PROGRAM);
    }
    return program;
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
      case DemoFkdPackage.PASCAL__PROGRAM:
        return ((InternalEList<?>)getProgram()).basicRemove(otherEnd, msgs);
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
      case DemoFkdPackage.PASCAL__PROGRAM:
        return getProgram();
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
      case DemoFkdPackage.PASCAL__PROGRAM:
        getProgram().clear();
        getProgram().addAll((Collection<? extends AbstractElement>)newValue);
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
      case DemoFkdPackage.PASCAL__PROGRAM:
        getProgram().clear();
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
      case DemoFkdPackage.PASCAL__PROGRAM:
        return program != null && !program.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //pascalImpl
