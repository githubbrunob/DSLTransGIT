/**
 */
package dsltrans;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>is Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsltrans.isNull#isValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsltrans.DsltransPackage#getisNull()
 * @model annotation="gmf.node label='value' label.icon='false'"
 * @generated
 */
public interface isNull extends MatchAttributeValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see dsltrans.DsltransPackage#getisNull_Value()
	 * @model default="true"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link dsltrans.isNull#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // isNull
