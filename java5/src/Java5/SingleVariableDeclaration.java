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
 * A representation of the model object '<em><b>Single Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.SingleVariableDeclaration#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link Java5.SingleVariableDeclaration#isVarargs <em>Varargs</em>}</li>
 *   <li>{@link Java5.SingleVariableDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link Java5.SingleVariableDeclaration#getMethodDeclaration <em>Method Declaration</em>}</li>
 *   <li>{@link Java5.SingleVariableDeclaration#getCatchClause <em>Catch Clause</em>}</li>
 *   <li>{@link Java5.SingleVariableDeclaration#getEnhancedForStatement <em>Enhanced For Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getSingleVariableDeclaration()
 * @model
 * @generated
 */
public interface SingleVariableDeclaration extends VariableDeclaration {
	/**
	 * Returns the value of the '<em><b>Modifiers</b></em>' containment reference list.
	 * The list contents are of type {@link Java5.Modifier}.
	 * It is bidirectional and its opposite is '{@link Java5.Modifier#getSingleVariableDeclaration <em>Single Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifiers</em>' containment reference list.
	 * @see Java5.Java5Package#getSingleVariableDeclaration_Modifiers()
	 * @see Java5.Modifier#getSingleVariableDeclaration
	 * @model opposite="SingleVariableDeclaration" containment="true"
	 * @generated
	 */
	EList<Modifier> getModifiers();

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
	 * @see Java5.Java5Package#getSingleVariableDeclaration_Varargs()
	 * @model
	 * @generated
	 */
	boolean isVarargs();

	/**
	 * Sets the value of the '{@link Java5.SingleVariableDeclaration#isVarargs <em>Varargs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Varargs</em>' attribute.
	 * @see #isVarargs()
	 * @generated
	 */
	void setVarargs(boolean value);

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
	 * @see Java5.Java5Package#getSingleVariableDeclaration_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NamedElementRef getType();

	/**
	 * Sets the value of the '{@link Java5.SingleVariableDeclaration#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(NamedElementRef value);

	/**
	 * Returns the value of the '<em><b>Method Declaration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Java5.MethodDeclaration#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Declaration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Declaration</em>' container reference.
	 * @see #setMethodDeclaration(MethodDeclaration)
	 * @see Java5.Java5Package#getSingleVariableDeclaration_MethodDeclaration()
	 * @see Java5.MethodDeclaration#getParameters
	 * @model opposite="parameters"
	 * @generated
	 */
	MethodDeclaration getMethodDeclaration();

	/**
	 * Sets the value of the '{@link Java5.SingleVariableDeclaration#getMethodDeclaration <em>Method Declaration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Declaration</em>' container reference.
	 * @see #getMethodDeclaration()
	 * @generated
	 */
	void setMethodDeclaration(MethodDeclaration value);

	/**
	 * Returns the value of the '<em><b>Catch Clause</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Java5.CatchClause#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catch Clause</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catch Clause</em>' container reference.
	 * @see #setCatchClause(CatchClause)
	 * @see Java5.Java5Package#getSingleVariableDeclaration_CatchClause()
	 * @see Java5.CatchClause#getException
	 * @model opposite="exception" transient="false"
	 * @generated
	 */
	CatchClause getCatchClause();

	/**
	 * Sets the value of the '{@link Java5.SingleVariableDeclaration#getCatchClause <em>Catch Clause</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catch Clause</em>' container reference.
	 * @see #getCatchClause()
	 * @generated
	 */
	void setCatchClause(CatchClause value);

	/**
	 * Returns the value of the '<em><b>Enhanced For Statement</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Java5.EnhancedForStatement#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enhanced For Statement</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enhanced For Statement</em>' container reference.
	 * @see #setEnhancedForStatement(EnhancedForStatement)
	 * @see Java5.Java5Package#getSingleVariableDeclaration_EnhancedForStatement()
	 * @see Java5.EnhancedForStatement#getParameter
	 * @model opposite="parameter" transient="false"
	 * @generated
	 */
	EnhancedForStatement getEnhancedForStatement();

	/**
	 * Sets the value of the '{@link Java5.SingleVariableDeclaration#getEnhancedForStatement <em>Enhanced For Statement</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enhanced For Statement</em>' container reference.
	 * @see #getEnhancedForStatement()
	 * @generated
	 */
	void setEnhancedForStatement(EnhancedForStatement value);

} // SingleVariableDeclaration
