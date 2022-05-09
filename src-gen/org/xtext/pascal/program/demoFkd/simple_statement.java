/**
 * generated by Xtext 2.26.0
 */
package org.xtext.pascal.program.demoFkd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>simple statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.pascal.program.demoFkd.simple_statement#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link org.xtext.pascal.program.demoFkd.simple_statement#getFunction <em>Function</em>}</li>
 *   <li>{@link org.xtext.pascal.program.demoFkd.simple_statement#getGoto <em>Goto</em>}</li>
 *   <li>{@link org.xtext.pascal.program.demoFkd.simple_statement#getFunction_noargs <em>Function noargs</em>}</li>
 * </ul>
 *
 * @see org.xtext.pascal.program.demoFkd.DemoFkdPackage#getsimple_statement()
 * @model
 * @generated
 */
public interface simple_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Assignment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignment</em>' containment reference.
   * @see #setAssignment(assignment_statement)
   * @see org.xtext.pascal.program.demoFkd.DemoFkdPackage#getsimple_statement_Assignment()
   * @model containment="true"
   * @generated
   */
  assignment_statement getAssignment();

  /**
   * Sets the value of the '{@link org.xtext.pascal.program.demoFkd.simple_statement#getAssignment <em>Assignment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignment</em>' containment reference.
   * @see #getAssignment()
   * @generated
   */
  void setAssignment(assignment_statement value);

  /**
   * Returns the value of the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' containment reference.
   * @see #setFunction(function_designator)
   * @see org.xtext.pascal.program.demoFkd.DemoFkdPackage#getsimple_statement_Function()
   * @model containment="true"
   * @generated
   */
  function_designator getFunction();

  /**
   * Sets the value of the '{@link org.xtext.pascal.program.demoFkd.simple_statement#getFunction <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' containment reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(function_designator value);

  /**
   * Returns the value of the '<em><b>Goto</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goto</em>' containment reference.
   * @see #setGoto(goto_statement)
   * @see org.xtext.pascal.program.demoFkd.DemoFkdPackage#getsimple_statement_Goto()
   * @model containment="true"
   * @generated
   */
  goto_statement getGoto();

  /**
   * Sets the value of the '{@link org.xtext.pascal.program.demoFkd.simple_statement#getGoto <em>Goto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Goto</em>' containment reference.
   * @see #getGoto()
   * @generated
   */
  void setGoto(goto_statement value);

  /**
   * Returns the value of the '<em><b>Function noargs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function noargs</em>' attribute.
   * @see #setFunction_noargs(String)
   * @see org.xtext.pascal.program.demoFkd.DemoFkdPackage#getsimple_statement_Function_noargs()
   * @model
   * @generated
   */
  String getFunction_noargs();

  /**
   * Sets the value of the '{@link org.xtext.pascal.program.demoFkd.simple_statement#getFunction_noargs <em>Function noargs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function noargs</em>' attribute.
   * @see #getFunction_noargs()
   * @generated
   */
  void setFunction_noargs(String value);

} // simple_statement
