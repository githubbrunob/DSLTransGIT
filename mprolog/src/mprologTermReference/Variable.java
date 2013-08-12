/**
 * <copyright>
 * </copyright>
 *
 * $Id: Variable.java,v 1.1 2011/12/28 01:45:32 bfb Exp $
 */
package mprologTermReference;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mprologTermReference.Variable#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see mprologTermReference.MprologTermReferencePackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Term {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mprologTermReference.MprologTermReferencePackage#getVariable_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mprologTermReference.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Variable
