/**
 * generated by Xtext 2.26.0
 */
package org.xtext.pascal.program.demoFkd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>field list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.pascal.program.demoFkd.field_list#getFixed <em>Fixed</em>}</li>
 *   <li>{@link org.xtext.pascal.program.demoFkd.field_list#getVariants <em>Variants</em>}</li>
 * </ul>
 *
 * @see org.xtext.pascal.program.demoFkd.DemoFkdPackage#getfield_list()
 * @model
 * @generated
 */
public interface field_list extends EObject
{
  /**
   * Returns the value of the '<em><b>Fixed</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed</em>' containment reference.
   * @see #setFixed(fixed_part)
   * @see org.xtext.pascal.program.demoFkd.DemoFkdPackage#getfield_list_Fixed()
   * @model containment="true"
   * @generated
   */
  fixed_part getFixed();

  /**
   * Sets the value of the '{@link org.xtext.pascal.program.demoFkd.field_list#getFixed <em>Fixed</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed</em>' containment reference.
   * @see #getFixed()
   * @generated
   */
  void setFixed(fixed_part value);

  /**
   * Returns the value of the '<em><b>Variants</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.pascal.program.demoFkd.variant_part}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variants</em>' containment reference list.
   * @see org.xtext.pascal.program.demoFkd.DemoFkdPackage#getfield_list_Variants()
   * @model containment="true"
   * @generated
   */
  EList<variant_part> getVariants();

} // field_list
