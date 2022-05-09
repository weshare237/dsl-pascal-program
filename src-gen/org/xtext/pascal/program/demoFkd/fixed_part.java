/**
 * generated by Xtext 2.26.0
 */
package org.xtext.pascal.program.demoFkd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>fixed part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.pascal.program.demoFkd.fixed_part#getSections <em>Sections</em>}</li>
 * </ul>
 *
 * @see org.xtext.pascal.program.demoFkd.DemoFkdPackage#getfixed_part()
 * @model
 * @generated
 */
public interface fixed_part extends EObject
{
  /**
   * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.pascal.program.demoFkd.record_section}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sections</em>' containment reference list.
   * @see org.xtext.pascal.program.demoFkd.DemoFkdPackage#getfixed_part_Sections()
   * @model containment="true"
   * @generated
   */
  EList<record_section> getSections();

} // fixed_part
