/**
 * generated by Xtext 2.26.0
 */
package org.xtext.pascal.program.demoFkd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.pascal.program.demoFkd.type#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.xtext.pascal.program.demoFkd.type#getStructured <em>Structured</em>}</li>
 *   <li>{@link org.xtext.pascal.program.demoFkd.type#getPointer <em>Pointer</em>}</li>
 * </ul>
 *
 * @see org.xtext.pascal.program.demoFkd.DemoFkdPackage#gettype()
 * @model
 * @generated
 */
public interface type extends EObject
{
  /**
   * Returns the value of the '<em><b>Simple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple</em>' containment reference.
   * @see #setSimple(simple_type)
   * @see org.xtext.pascal.program.demoFkd.DemoFkdPackage#gettype_Simple()
   * @model containment="true"
   * @generated
   */
  simple_type getSimple();

  /**
   * Sets the value of the '{@link org.xtext.pascal.program.demoFkd.type#getSimple <em>Simple</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple</em>' containment reference.
   * @see #getSimple()
   * @generated
   */
  void setSimple(simple_type value);

  /**
   * Returns the value of the '<em><b>Structured</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Structured</em>' containment reference.
   * @see #setStructured(structured_type)
   * @see org.xtext.pascal.program.demoFkd.DemoFkdPackage#gettype_Structured()
   * @model containment="true"
   * @generated
   */
  structured_type getStructured();

  /**
   * Sets the value of the '{@link org.xtext.pascal.program.demoFkd.type#getStructured <em>Structured</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Structured</em>' containment reference.
   * @see #getStructured()
   * @generated
   */
  void setStructured(structured_type value);

  /**
   * Returns the value of the '<em><b>Pointer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pointer</em>' containment reference.
   * @see #setPointer(pointer_type)
   * @see org.xtext.pascal.program.demoFkd.DemoFkdPackage#gettype_Pointer()
   * @model containment="true"
   * @generated
   */
  pointer_type getPointer();

  /**
   * Sets the value of the '{@link org.xtext.pascal.program.demoFkd.type#getPointer <em>Pointer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pointer</em>' containment reference.
   * @see #getPointer()
   * @generated
   */
  void setPointer(pointer_type value);

} // type
