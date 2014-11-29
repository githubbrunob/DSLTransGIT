/**
 */
package dsltrans;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsltrans.ApplyAttribute#getAttributeValue <em>Attribute Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsltrans.DsltransPackage#getApplyAttribute()
 * @model annotation="gmf.node label='attributeName' tool.description='Create attribute in the apply pattern.'"
 * @generated
 */
public interface ApplyAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Attribute Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Value</em>' containment reference.
	 * @see #setAttributeValue(Term)
	 * @see dsltrans.DsltransPackage#getApplyAttribute_AttributeValue()
	 * @model containment="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
	Term getAttributeValue();

	/**
	 * Sets the value of the '{@link dsltrans.ApplyAttribute#getAttributeValue <em>Attribute Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Value</em>' containment reference.
	 * @see #getAttributeValue()
	 * @generated
	 */
	void setAttributeValue(Term value);

} // ApplyAttribute
