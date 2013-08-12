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
 * A representation of the model object '<em><b>Variable Declaration Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.VariableDeclarationStatement#getExtraArrayDimensions <em>Extra Array Dimensions</em>}</li>
 *   <li>{@link Java5.VariableDeclarationStatement#getType <em>Type</em>}</li>
 *   <li>{@link Java5.VariableDeclarationStatement#getFragments <em>Fragments</em>}</li>
 *   <li>{@link Java5.VariableDeclarationStatement#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getVariableDeclarationStatement()
 * @model
 * @generated
 */
public interface VariableDeclarationStatement extends Statement {
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
	 * @see Java5.Java5Package#getVariableDeclarationStatement_ExtraArrayDimensions()
	 * @model
	 * @generated
	 */
	int getExtraArrayDimensions();

	/**
	 * Sets the value of the '{@link Java5.VariableDeclarationStatement#getExtraArrayDimensions <em>Extra Array Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Array Dimensions</em>' attribute.
	 * @see #getExtraArrayDimensions()
	 * @generated
	 */
	void setExtraArrayDimensions(int value);

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
	 * @see Java5.Java5Package#getVariableDeclarationStatement_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NamedElementRef getType();

	/**
	 * Sets the value of the '{@link Java5.VariableDeclarationStatement#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(NamedElementRef value);

	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link Java5.VariableDeclarationFragment}.
	 * It is bidirectional and its opposite is '{@link Java5.VariableDeclarationFragment#getVariableDeclarationStatement <em>Variable Declaration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments</em>' containment reference list.
	 * @see Java5.Java5Package#getVariableDeclarationStatement_Fragments()
	 * @see Java5.VariableDeclarationFragment#getVariableDeclarationStatement
	 * @model opposite="variableDeclarationStatement" containment="true"
	 * @generated
	 */
	EList<VariableDeclarationFragment> getFragments();

	/**
	 * Returns the value of the '<em><b>Modifiers</b></em>' containment reference list.
	 * The list contents are of type {@link Java5.Modifier}.
	 * It is bidirectional and its opposite is '{@link Java5.Modifier#getVariableDeclarationStatement <em>Variable Declaration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifiers</em>' containment reference list.
	 * @see Java5.Java5Package#getVariableDeclarationStatement_Modifiers()
	 * @see Java5.Modifier#getVariableDeclarationStatement
	 * @model opposite="VariableDeclarationStatement" containment="true"
	 * @generated
	 */
	EList<Modifier> getModifiers();

} // VariableDeclarationStatement
