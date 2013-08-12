/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.VariableDeclarationFragment#getFieldDeclaration <em>Field Declaration</em>}</li>
 *   <li>{@link Java5.VariableDeclarationFragment#getVariableDeclarationStatement <em>Variable Declaration Statement</em>}</li>
 *   <li>{@link Java5.VariableDeclarationFragment#getVariableDeclarationExpression <em>Variable Declaration Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getVariableDeclarationFragment()
 * @model
 * @generated
 */
public interface VariableDeclarationFragment extends VariableDeclaration {
	/**
	 * Returns the value of the '<em><b>Field Declaration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Java5.FieldDeclaration#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Declaration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Declaration</em>' container reference.
	 * @see #setFieldDeclaration(FieldDeclaration)
	 * @see Java5.Java5Package#getVariableDeclarationFragment_FieldDeclaration()
	 * @see Java5.FieldDeclaration#getFragments
	 * @model opposite="fragments"
	 * @generated
	 */
	FieldDeclaration getFieldDeclaration();

	/**
	 * Sets the value of the '{@link Java5.VariableDeclarationFragment#getFieldDeclaration <em>Field Declaration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Declaration</em>' container reference.
	 * @see #getFieldDeclaration()
	 * @generated
	 */
	void setFieldDeclaration(FieldDeclaration value);

	/**
	 * Returns the value of the '<em><b>Variable Declaration Statement</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Java5.VariableDeclarationStatement#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Declaration Statement</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Declaration Statement</em>' container reference.
	 * @see #setVariableDeclarationStatement(VariableDeclarationStatement)
	 * @see Java5.Java5Package#getVariableDeclarationFragment_VariableDeclarationStatement()
	 * @see Java5.VariableDeclarationStatement#getFragments
	 * @model opposite="fragments" transient="false"
	 * @generated
	 */
	VariableDeclarationStatement getVariableDeclarationStatement();

	/**
	 * Sets the value of the '{@link Java5.VariableDeclarationFragment#getVariableDeclarationStatement <em>Variable Declaration Statement</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Declaration Statement</em>' container reference.
	 * @see #getVariableDeclarationStatement()
	 * @generated
	 */
	void setVariableDeclarationStatement(VariableDeclarationStatement value);

	/**
	 * Returns the value of the '<em><b>Variable Declaration Expression</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Java5.VariableDeclarationExpression#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Declaration Expression</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Declaration Expression</em>' container reference.
	 * @see #setVariableDeclarationExpression(VariableDeclarationExpression)
	 * @see Java5.Java5Package#getVariableDeclarationFragment_VariableDeclarationExpression()
	 * @see Java5.VariableDeclarationExpression#getFragments
	 * @model opposite="fragments" transient="false"
	 * @generated
	 */
	VariableDeclarationExpression getVariableDeclarationExpression();

	/**
	 * Sets the value of the '{@link Java5.VariableDeclarationFragment#getVariableDeclarationExpression <em>Variable Declaration Expression</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Declaration Expression</em>' container reference.
	 * @see #getVariableDeclarationExpression()
	 * @generated
	 */
	void setVariableDeclarationExpression(VariableDeclarationExpression value);

} // VariableDeclarationFragment
