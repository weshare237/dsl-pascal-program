/**
 * generated by Xtext 2.26.0
 */
package org.xtext.pascal.program.demoFkd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>procedure and function declaration part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.pascal.program.demoFkd.procedure_and_function_declaration_part#getProcedures <em>Procedures</em>}</li>
 *   <li>{@link org.xtext.pascal.program.demoFkd.procedure_and_function_declaration_part#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @see org.xtext.pascal.program.demoFkd.DemoFkdPackage#getprocedure_and_function_declaration_part()
 * @model
 * @generated
 */
public interface procedure_and_function_declaration_part extends EObject
{
  /**
   * Returns the value of the '<em><b>Procedures</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.pascal.program.demoFkd.abstraction_heading}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procedures</em>' containment reference list.
   * @see org.xtext.pascal.program.demoFkd.DemoFkdPackage#getprocedure_and_function_declaration_part_Procedures()
   * @model containment="true"
   * @generated
   */
  EList<abstraction_heading> getProcedures();

  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.pascal.program.demoFkd.abstraction_declaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see org.xtext.pascal.program.demoFkd.DemoFkdPackage#getprocedure_and_function_declaration_part_Functions()
   * @model containment="true"
   * @generated
   */
  EList<abstraction_declaration> getFunctions();

} // procedure_and_function_declaration_part
