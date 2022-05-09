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
import org.xtext.pascal.program.demoFkd.case_statement;
import org.xtext.pascal.program.demoFkd.conditional_statement;
import org.xtext.pascal.program.demoFkd.if_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>conditional statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.pascal.program.demoFkd.impl.conditional_statementImpl#getIfStmt <em>If Stmt</em>}</li>
 *   <li>{@link org.xtext.pascal.program.demoFkd.impl.conditional_statementImpl#getCaseStmt <em>Case Stmt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class conditional_statementImpl extends MinimalEObjectImpl.Container implements conditional_statement
{
  /**
   * The cached value of the '{@link #getIfStmt() <em>If Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfStmt()
   * @generated
   * @ordered
   */
  protected if_statement ifStmt;

  /**
   * The cached value of the '{@link #getCaseStmt() <em>Case Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaseStmt()
   * @generated
   * @ordered
   */
  protected case_statement caseStmt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected conditional_statementImpl()
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
    return DemoFkdPackage.Literals.CONDITIONAL_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public if_statement getIfStmt()
  {
    return ifStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfStmt(if_statement newIfStmt, NotificationChain msgs)
  {
    if_statement oldIfStmt = ifStmt;
    ifStmt = newIfStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoFkdPackage.CONDITIONAL_STATEMENT__IF_STMT, oldIfStmt, newIfStmt);
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
  public void setIfStmt(if_statement newIfStmt)
  {
    if (newIfStmt != ifStmt)
    {
      NotificationChain msgs = null;
      if (ifStmt != null)
        msgs = ((InternalEObject)ifStmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DemoFkdPackage.CONDITIONAL_STATEMENT__IF_STMT, null, msgs);
      if (newIfStmt != null)
        msgs = ((InternalEObject)newIfStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DemoFkdPackage.CONDITIONAL_STATEMENT__IF_STMT, null, msgs);
      msgs = basicSetIfStmt(newIfStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoFkdPackage.CONDITIONAL_STATEMENT__IF_STMT, newIfStmt, newIfStmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public case_statement getCaseStmt()
  {
    return caseStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCaseStmt(case_statement newCaseStmt, NotificationChain msgs)
  {
    case_statement oldCaseStmt = caseStmt;
    caseStmt = newCaseStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoFkdPackage.CONDITIONAL_STATEMENT__CASE_STMT, oldCaseStmt, newCaseStmt);
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
  public void setCaseStmt(case_statement newCaseStmt)
  {
    if (newCaseStmt != caseStmt)
    {
      NotificationChain msgs = null;
      if (caseStmt != null)
        msgs = ((InternalEObject)caseStmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DemoFkdPackage.CONDITIONAL_STATEMENT__CASE_STMT, null, msgs);
      if (newCaseStmt != null)
        msgs = ((InternalEObject)newCaseStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DemoFkdPackage.CONDITIONAL_STATEMENT__CASE_STMT, null, msgs);
      msgs = basicSetCaseStmt(newCaseStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DemoFkdPackage.CONDITIONAL_STATEMENT__CASE_STMT, newCaseStmt, newCaseStmt));
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
      case DemoFkdPackage.CONDITIONAL_STATEMENT__IF_STMT:
        return basicSetIfStmt(null, msgs);
      case DemoFkdPackage.CONDITIONAL_STATEMENT__CASE_STMT:
        return basicSetCaseStmt(null, msgs);
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
      case DemoFkdPackage.CONDITIONAL_STATEMENT__IF_STMT:
        return getIfStmt();
      case DemoFkdPackage.CONDITIONAL_STATEMENT__CASE_STMT:
        return getCaseStmt();
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
      case DemoFkdPackage.CONDITIONAL_STATEMENT__IF_STMT:
        setIfStmt((if_statement)newValue);
        return;
      case DemoFkdPackage.CONDITIONAL_STATEMENT__CASE_STMT:
        setCaseStmt((case_statement)newValue);
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
      case DemoFkdPackage.CONDITIONAL_STATEMENT__IF_STMT:
        setIfStmt((if_statement)null);
        return;
      case DemoFkdPackage.CONDITIONAL_STATEMENT__CASE_STMT:
        setCaseStmt((case_statement)null);
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
      case DemoFkdPackage.CONDITIONAL_STATEMENT__IF_STMT:
        return ifStmt != null;
      case DemoFkdPackage.CONDITIONAL_STATEMENT__CASE_STMT:
        return caseStmt != null;
    }
    return super.eIsSet(featureID);
  }

} //conditional_statementImpl
