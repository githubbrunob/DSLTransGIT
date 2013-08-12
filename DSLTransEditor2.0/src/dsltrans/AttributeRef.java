/**
 * <copyright>
 * </copyright>
 *
 * $Id: AttributeRef.java,v 1.2 2012/01/18 23:38:18 claudiogomes Exp $
 */
package dsltrans;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsltrans.AttributeRef#getAttributeRef <em>Attribute Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsltrans.DsltransPackage#getAttributeRef()
 * @model annotation="gmf.node tool.description='Copy attribute value.'"
 * @generated
 */
public interface AttributeRef extends Ref
{
  /**
   * Returns the value of the '<em><b>Attribute Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Ref</em>' reference.
   * @see #setAttributeRef(Attribute)
   * @see dsltrans.DsltransPackage#getAttributeRef_AttributeRef()
   * @model required="true"
   *        annotation="gmf.link target.decoration='arrow' width='2' tool.description='Specify source attribute.'"
   * @generated
   */
  Attribute getAttributeRef();

  /**
   * Sets the value of the '{@link dsltrans.AttributeRef#getAttributeRef <em>Attribute Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Ref</em>' reference.
   * @see #getAttributeRef()
   * @generated
   */
  void setAttributeRef(Attribute value);

} // AttributeRef
