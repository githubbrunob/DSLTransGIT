/**
 */
package dsltrans;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsltrans.MatchAttribute#getAttributeValue <em>Attribute Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsltrans.DsltransPackage#getMatchAttribute()
 * @model annotation="gmf.node label='attributeName' tool.description='Match an attribute.'"
 * @generated
 */
public interface MatchAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Attribute Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Value</em>' containment reference.
	 * @see #setAttributeValue(MatchAttributeValue)
	 * @see dsltrans.DsltransPackage#getMatchAttribute_AttributeValue()
	 * @model containment="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
	MatchAttributeValue getAttributeValue();

	/**
	 * Sets the value of the '{@link dsltrans.MatchAttribute#getAttributeValue <em>Attribute Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Value</em>' containment reference.
	 * @see #getAttributeValue()
	 * @generated
	 */
	void setAttributeValue(MatchAttributeValue value);

} // MatchAttribute
