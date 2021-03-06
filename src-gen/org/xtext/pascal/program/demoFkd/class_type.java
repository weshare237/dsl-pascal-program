/**
 * generated by Xtext 2.26.0
 */
package org.xtext.pascal.program.demoFkd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>class type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.pascal.program.demoFkd.class_type#getClassKeyword <em>Class Keyword</em>}</li>
 *   <li>{@link org.xtext.pascal.program.demoFkd.class_type#getMembers <em>Members</em>}</li>
 *   <li>{@link org.xtext.pascal.program.demoFkd.class_type#getEndKeyword <em>End Keyword</em>}</li>
 * </ul>
 *
 * @see org.xtext.pascal.program.demoFkd.DemoFkdPackage#getclass_type()
 * @model
 * @generated
 */
public interface class_type extends EObject
{
  /**
   * Returns the value of the '<em><b>Class Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Keyword</em>' attribute.
   * @see #setClassKeyword(String)
   * @see org.xtext.pascal.program.demoFkd.DemoFkdPackage#getclass_type_ClassKeyword()
   * @model
   * @generated
   */
  String getClassKeyword();

  /**
   * Sets the value of the '{@link org.xtext.pascal.program.demoFkd.class_type#getClassKeyword <em>Class Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Keyword</em>' attribute.
   * @see #getClassKeyword()
   * @generated
   */
  void setClassKeyword(String value);

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference.
   * @see #setMembers(member_list)
   * @see org.xtext.pascal.program.demoFkd.DemoFkdPackage#getclass_type_Members()
   * @model containment="true"
   * @generated
   */
  member_list getMembers();

  /**
   * Sets the value of the '{@link org.xtext.pascal.program.demoFkd.class_type#getMembers <em>Members</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Members</em>' containment reference.
   * @see #getMembers()
   * @generated
   */
  void setMembers(member_list value);

  /**
   * Returns the value of the '<em><b>End Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Keyword</em>' attribute.
   * @see #setEndKeyword(String)
   * @see org.xtext.pascal.program.demoFkd.DemoFkdPackage#getclass_type_EndKeyword()
   * @model
   * @generated
   */
  String getEndKeyword();

  /**
   * Sets the value of the '{@link org.xtext.pascal.program.demoFkd.class_type#getEndKeyword <em>End Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Keyword</em>' attribute.
   * @see #getEndKeyword()
   * @generated
   */
  void setEndKeyword(String value);

} // class_type
