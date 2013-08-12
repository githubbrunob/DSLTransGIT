/**
 * <copyright>
 * </copyright>
 *
 * $Id: VariableReference.java,v 1.1 2011/12/28 01:45:32 bfb Exp $
 */
package mprologTermReference;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mprologTermReference.VariableReference#getIdReference <em>Id Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see mprologTermReference.MprologTermReferencePackage#getVariableReference()
 * @model
 * @generated
 */
public interface VariableReference extends TermReference {
	/**
	 * Returns the value of the '<em><b>Id Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Reference</em>' reference.
	 * @see #setIdReference(Variable)
	 * @see mprologTermReference.MprologTermReferencePackage#getVariableReference_IdReference()
	 * @model
	 * @generated
	 */
	Variable getIdReference();

	/**
	 * Sets the value of the '{@link mprologTermReference.VariableReference#getIdReference <em>Id Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Reference</em>' reference.
	 * @see #getIdReference()
	 * @generated
	 */
	void setIdReference(Variable value);

} // VariableReference
