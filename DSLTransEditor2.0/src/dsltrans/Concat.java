/**
 */
package dsltrans;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsltrans.Concat#getLeftTerm <em>Left Term</em>}</li>
 *   <li>{@link dsltrans.Concat#getRightTerm <em>Right Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsltrans.DsltransPackage#getConcat()
 * @model annotation="gmf.node tool.description='Concatenate expressions.' label.placement='none'"
 * @generated
 */
public interface Concat extends Operator {
	/**
	 * Returns the value of the '<em><b>Left Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Term</em>' containment reference.
	 * @see #setLeftTerm(Term)
	 * @see dsltrans.DsltransPackage#getConcat_LeftTerm()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
	Term getLeftTerm();

	/**
	 * Sets the value of the '{@link dsltrans.Concat#getLeftTerm <em>Left Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Term</em>' containment reference.
	 * @see #getLeftTerm()
	 * @generated
	 */
	void setLeftTerm(Term value);

	/**
	 * Returns the value of the '<em><b>Right Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Term</em>' containment reference.
	 * @see #setRightTerm(Term)
	 * @see dsltrans.DsltransPackage#getConcat_RightTerm()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
	Term getRightTerm();

	/**
	 * Sets the value of the '{@link dsltrans.Concat#getRightTerm <em>Right Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Term</em>' containment reference.
	 * @see #getRightTerm()
	 * @generated
	 */
	void setRightTerm(Term value);

} // Concat
