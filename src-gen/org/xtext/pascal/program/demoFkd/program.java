/**
 * generated by Xtext 2.26.0
 */
package org.xtext.pascal.program.demoFkd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.pascal.program.demoFkd.program#getHeading <em>Heading</em>}</li>
 *   <li>{@link org.xtext.pascal.program.demoFkd.program#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see org.xtext.pascal.program.demoFkd.DemoFkdPackage#getprogram()
 * @model
 * @generated
 */
public interface program extends EObject
{
  /**
   * Returns the value of the '<em><b>Heading</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Heading</em>' containment reference.
   * @see #setHeading(program_heading_block)
   * @see org.xtext.pascal.program.demoFkd.DemoFkdPackage#getprogram_Heading()
   * @model containment="true"
   * @generated
   */
  program_heading_block getHeading();

  /**
   * Sets the value of the '{@link org.xtext.pascal.program.demoFkd.program#getHeading <em>Heading</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Heading</em>' containment reference.
   * @see #getHeading()
   * @generated
   */
  void setHeading(program_heading_block value);

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(block)
   * @see org.xtext.pascal.program.demoFkd.DemoFkdPackage#getprogram_Block()
   * @model containment="true"
   * @generated
   */
  block getBlock();

  /**
   * Sets the value of the '{@link org.xtext.pascal.program.demoFkd.program#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(block value);

} // program
