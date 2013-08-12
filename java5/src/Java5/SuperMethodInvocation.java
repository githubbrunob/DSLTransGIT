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
 * A representation of the model object '<em><b>Super Method Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.SuperMethodInvocation#getArguments <em>Arguments</em>}</li>
 *   <li>{@link Java5.SuperMethodInvocation#getMethod <em>Method</em>}</li>
 *   <li>{@link Java5.SuperMethodInvocation#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getSuperMethodInvocation()
 * @model
 * @generated
 */
public interface SuperMethodInvocation extends Expression {
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
	 * @see Java5.Java5Package#getSuperMethodInvocation_Arguments()
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
	 * @see Java5.Java5Package#getSuperMethodInvocation_Method()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NamedElementRef getMethod();

	/**
	 * Sets the value of the '{@link Java5.SuperMethodInvocation#getMethod <em>Method</em>}' containment reference.
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
	 * @see Java5.Java5Package#getSuperMethodInvocation_Qualifier()
	 * @model containment="true"
	 * @generated
	 */
	NamedElementRef getQualifier();

	/**
	 * Sets the value of the '{@link Java5.SuperMethodInvocation#getQualifier <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' containment reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(NamedElementRef value);

} // SuperMethodInvocation
