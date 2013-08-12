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
 * A representation of the model object '<em><b>Class Instance Creation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.ClassInstanceCreation#getAnonymousClassDeclaration <em>Anonymous Class Declaration</em>}</li>
 *   <li>{@link Java5.ClassInstanceCreation#getArguments <em>Arguments</em>}</li>
 *   <li>{@link Java5.ClassInstanceCreation#getExpression <em>Expression</em>}</li>
 *   <li>{@link Java5.ClassInstanceCreation#getMethod <em>Method</em>}</li>
 *   <li>{@link Java5.ClassInstanceCreation#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getClassInstanceCreation()
 * @model
 * @generated
 */
public interface ClassInstanceCreation extends Expression {
	/**
	 * Returns the value of the '<em><b>Anonymous Class Declaration</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link Java5.AnonymousClassDeclaration#getClassInstanceCreation <em>Class Instance Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anonymous Class Declaration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous Class Declaration</em>' containment reference.
	 * @see #setAnonymousClassDeclaration(AnonymousClassDeclaration)
	 * @see Java5.Java5Package#getClassInstanceCreation_AnonymousClassDeclaration()
	 * @see Java5.AnonymousClassDeclaration#getClassInstanceCreation
	 * @model opposite="classInstanceCreation" containment="true"
	 * @generated
	 */
	AnonymousClassDeclaration getAnonymousClassDeclaration();

	/**
	 * Sets the value of the '{@link Java5.ClassInstanceCreation#getAnonymousClassDeclaration <em>Anonymous Class Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anonymous Class Declaration</em>' containment reference.
	 * @see #getAnonymousClassDeclaration()
	 * @generated
	 */
	void setAnonymousClassDeclaration(AnonymousClassDeclaration value);

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
	 * @see Java5.Java5Package#getClassInstanceCreation_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getArguments();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see Java5.Java5Package#getClassInstanceCreation_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link Java5.ClassInstanceCreation#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

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
	 * @see Java5.Java5Package#getClassInstanceCreation_Method()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NamedElementRef getMethod();

	/**
	 * Sets the value of the '{@link Java5.ClassInstanceCreation#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(NamedElementRef value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(NamedElementRef)
	 * @see Java5.Java5Package#getClassInstanceCreation_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NamedElementRef getType();

	/**
	 * Sets the value of the '{@link Java5.ClassInstanceCreation#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(NamedElementRef value);

} // ClassInstanceCreation
