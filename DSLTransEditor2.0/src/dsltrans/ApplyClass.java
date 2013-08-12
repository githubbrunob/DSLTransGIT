/**
 * <copyright>
 * </copyright>
 *
 * $Id: ApplyClass.java,v 1.2 2012/01/18 23:38:18 claudiogomes Exp $
 */
package dsltrans;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsltrans.ApplyClass#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link dsltrans.ApplyClass#getGroupName <em>Group Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsltrans.DsltransPackage#getApplyClass()
 * @model annotation="gmf.node foo='bar' tool.description='Generates a class in the apply pattern.'"
 * @generated
 */
public interface ApplyClass extends AbstractClass
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
   * The list contents are of type {@link dsltrans.ApplyAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference list.
   * @see dsltrans.DsltransPackage#getApplyClass_Attribute()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<ApplyAttribute> getAttribute();

  /**
   * Returns the value of the '<em><b>Group Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group Name</em>' attribute.
   * @see #setGroupName(String)
   * @see dsltrans.DsltransPackage#getApplyClass_GroupName()
   * @model
   * @generated
   */
  String getGroupName();

  /**
   * Sets the value of the '{@link dsltrans.ApplyClass#getGroupName <em>Group Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group Name</em>' attribute.
   * @see #getGroupName()
   * @generated
   */
  void setGroupName(String value);

} // ApplyClass
