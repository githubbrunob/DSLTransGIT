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
 * A representation of the model object '<em><b>Method Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.MethodDeclaration#getExtraArrayDimensions <em>Extra Array Dimensions</em>}</li>
 *   <li>{@link Java5.MethodDeclaration#isConstructor <em>Constructor</em>}</li>
 *   <li>{@link Java5.MethodDeclaration#isVarargs <em>Varargs</em>}</li>
 *   <li>{@link Java5.MethodDeclaration#getBody <em>Body</em>}</li>
 *   <li>{@link Java5.MethodDeclaration#getThrownExceptions <em>Thrown Exceptions</em>}</li>
 *   <li>{@link Java5.MethodDeclaration#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link Java5.MethodDeclaration#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link Java5.MethodDeclaration#getRedefinedMethodDeclaration <em>Redefined Method Declaration</em>}</li>
 *   <li>{@link Java5.MethodDeclaration#getRedefinitions <em>Redefinitions</em>}</li>
 *   <li>{@link Java5.MethodDeclaration#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getMethodDeclaration()
 * @model
 * @generated
 */
public interface MethodDeclaration extends BodyDeclaration {
	/**
	 * Returns the value of the '<em><b>Extra Array Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra Array Dimensions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Array Dimensions</em>' attribute.
	 * @see #setExtraArrayDimensions(int)
	 * @see Java5.Java5Package#getMethodDeclaration_ExtraArrayDimensions()
	 * @model
	 * @generated
	 */
	int getExtraArrayDimensions();

	/**
	 * Sets the value of the '{@link Java5.MethodDeclaration#getExtraArrayDimensions <em>Extra Array Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Array Dimensions</em>' attribute.
	 * @see #getExtraArrayDimensions()
	 * @generated
	 */
	void setExtraArrayDimensions(int value);

	/**
	 * Returns the value of the '<em><b>Constructor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constructor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructor</em>' attribute.
	 * @see #setConstructor(boolean)
	 * @see Java5.Java5Package#getMethodDeclaration_Constructor()
	 * @model
	 * @generated
	 */
	boolean isConstructor();

	/**
	 * Sets the value of the '{@link Java5.MethodDeclaration#isConstructor <em>Constructor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constructor</em>' attribute.
	 * @see #isConstructor()
	 * @generated
	 */
	void setConstructor(boolean value);

	/**
	 * Returns the value of the '<em><b>Varargs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Varargs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varargs</em>' attribute.
	 * @see #setVarargs(boolean)
	 * @see Java5.Java5Package#getMethodDeclaration_Varargs()
	 * @model
	 * @generated
	 */
	boolean isVarargs();

	/**
	 * Sets the value of the '{@link Java5.MethodDeclaration#isVarargs <em>Varargs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Varargs</em>' attribute.
	 * @see #isVarargs()
	 * @generated
	 */
	void setVarargs(boolean value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Block)
	 * @see Java5.Java5Package#getMethodDeclaration_Body()
	 * @model containment="true"
	 * @generated
	 */
	Block getBody();

	/**
	 * Sets the value of the '{@link Java5.MethodDeclaration#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Block value);

	/**
	 * Returns the value of the '<em><b>Thrown Exceptions</b></em>' containment reference list.
	 * The list contents are of type {@link Java5.NamedElementRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thrown Exceptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thrown Exceptions</em>' containment reference list.
	 * @see Java5.Java5Package#getMethodDeclaration_ThrownExceptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedElementRef> getThrownExceptions();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(NamedElementRef)
	 * @see Java5.Java5Package#getMethodDeclaration_ReturnType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NamedElementRef getReturnType();

	/**
	 * Sets the value of the '{@link Java5.MethodDeclaration#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(NamedElementRef value);

	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link Java5.TypeParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameters</em>' containment reference list.
	 * @see Java5.Java5Package#getMethodDeclaration_TypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeParameter> getTypeParameters();

	/**
	 * Returns the value of the '<em><b>Redefined Method Declaration</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Java5.MethodDeclaration#getRedefinitions <em>Redefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Method Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Method Declaration</em>' reference.
	 * @see #setRedefinedMethodDeclaration(MethodDeclaration)
	 * @see Java5.Java5Package#getMethodDeclaration_RedefinedMethodDeclaration()
	 * @see Java5.MethodDeclaration#getRedefinitions
	 * @model opposite="redefinitions"
	 * @generated
	 */
	MethodDeclaration getRedefinedMethodDeclaration();

	/**
	 * Sets the value of the '{@link Java5.MethodDeclaration#getRedefinedMethodDeclaration <em>Redefined Method Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined Method Declaration</em>' reference.
	 * @see #getRedefinedMethodDeclaration()
	 * @generated
	 */
	void setRedefinedMethodDeclaration(MethodDeclaration value);

	/**
	 * Returns the value of the '<em><b>Redefinitions</b></em>' reference list.
	 * The list contents are of type {@link Java5.MethodDeclaration}.
	 * It is bidirectional and its opposite is '{@link Java5.MethodDeclaration#getRedefinedMethodDeclaration <em>Redefined Method Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefinitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefinitions</em>' reference list.
	 * @see Java5.Java5Package#getMethodDeclaration_Redefinitions()
	 * @see Java5.MethodDeclaration#getRedefinedMethodDeclaration
	 * @model opposite="redefinedMethodDeclaration"
	 * @generated
	 */
	EList<MethodDeclaration> getRedefinitions();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link Java5.SingleVariableDeclaration}.
	 * It is bidirectional and its opposite is '{@link Java5.SingleVariableDeclaration#getMethodDeclaration <em>Method Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see Java5.Java5Package#getMethodDeclaration_Parameters()
	 * @see Java5.SingleVariableDeclaration#getMethodDeclaration
	 * @model opposite="methodDeclaration" containment="true"
	 * @generated
	 */
	EList<SingleVariableDeclaration> getParameters();

} // MethodDeclaration
