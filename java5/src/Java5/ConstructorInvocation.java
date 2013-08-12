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
 * A representation of the model object '<em><b>Constructor Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.ConstructorInvocation#getArguments <em>Arguments</em>}</li>
 *   <li>{@link Java5.ConstructorInvocation#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getConstructorInvocation()
 * @model
 * @generated
 */
public interface ConstructorInvocation extends Statement {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link Java5.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see Java5.Java5Package#getConstructorInvocation_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getArguments();

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
	 * @see Java5.Java5Package#getConstructorInvocation_Method()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NamedElementRef getMethod();

	/**
	 * Sets the value of the '{@link Java5.ConstructorInvocation#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(NamedElementRef value);

} // ConstructorInvocation
