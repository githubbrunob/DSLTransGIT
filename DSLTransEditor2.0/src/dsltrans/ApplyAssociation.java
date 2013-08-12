/**
 * <copyright>
 * </copyright>
 *
 * $Id: ApplyAssociation.java,v 1.2 2012/01/18 23:38:18 claudiogomes Exp $
 */
package dsltrans;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsltrans.ApplyAssociation#getSource <em>Source</em>}</li>
 *   <li>{@link dsltrans.ApplyAssociation#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsltrans.DsltransPackage#getApplyAssociation()
 * @model annotation="gmf.link label='associationName' source='source' target='target' target.decoration='arrow' tool.description='Create direct association in the apply pattern.'"
 * @generated
 */
public interface ApplyAssociation extends Association
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(ApplyClass)
   * @see dsltrans.DsltransPackage#getApplyAssociation_Source()
   * @model required="true"
   * @generated
   */
  ApplyClass getSource();

  /**
   * Sets the value of the '{@link dsltrans.ApplyAssociation#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(ApplyClass value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(ApplyClass)
   * @see dsltrans.DsltransPackage#getApplyAssociation_Target()
   * @model required="true"
   * @generated
   */
  ApplyClass getTarget();

  /**
   * Sets the value of the '{@link dsltrans.ApplyAssociation#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(ApplyClass value);

} // ApplyAssociation
