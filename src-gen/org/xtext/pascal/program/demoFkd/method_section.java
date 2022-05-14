/**
 * generated by Xtext 2.26.0
 */
package org.xtext.pascal.program.demoFkd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>method section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.pascal.program.demoFkd.method_section#getMethods <em>Methods</em>}</li>
 * </ul>
 *
 * @see org.xtext.pascal.program.demoFkd.DemoFkdPackage#getmethod_section()
 * @model
 * @generated
 */
public interface method_section extends EObject
{
  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.pascal.program.demoFkd.abstraction_heading}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see org.xtext.pascal.program.demoFkd.DemoFkdPackage#getmethod_section_Methods()
   * @model containment="true"
   * @generated
   */
  EList<abstraction_heading> getMethods();

} // method_section
