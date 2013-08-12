/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.MethodRef#getMethod <em>Method</em>}</li>
 *   <li>{@link Java5.MethodRef#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link Java5.MethodRef#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getMethodRef()
 * @model
 * @generated
 */
public interface MethodRef extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(NamedElementRef)
	 * @see Java5.Java5Package#getMethodRef_Method()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NamedElementRef getMethod();

	/**
	 * Sets the value of the '{@link Java5.MethodRef#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(NamedElementRef value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference.
	 * @see #setQualifier(NamedElementRef)
	 * @see Java5.Java5Package#getMethodRef_Qualifier()
	 * @model containment="true"
	 * @generated
	 */
	NamedElementRef getQualifier();

	/**
	 * Sets the value of the '{@link Java5.MethodRef#getQualifier <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' containment reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(NamedElementRef value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link Java5.MethodRefParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see Java5.Java5Package#getMethodRef_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MethodRefParameter> getParameters();

} // MethodRef
