/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.Modifier#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link Java5.Modifier#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link Java5.Modifier#isStatic <em>Static</em>}</li>
 *   <li>{@link Java5.Modifier#isTransient <em>Transient</em>}</li>
 *   <li>{@link Java5.Modifier#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link Java5.Modifier#isNative <em>Native</em>}</li>
 *   <li>{@link Java5.Modifier#isStrictfp <em>Strictfp</em>}</li>
 *   <li>{@link Java5.Modifier#isSynchronized <em>Synchronized</em>}</li>
 *   <li>{@link Java5.Modifier#getBodyDeclaration <em>Body Declaration</em>}</li>
 *   <li>{@link Java5.Modifier#getSingleVariableDeclaration <em>Single Variable Declaration</em>}</li>
 *   <li>{@link Java5.Modifier#getVariableDeclarationStatement <em>Variable Declaration Statement</em>}</li>
 *   <li>{@link Java5.Modifier#getVariableDeclarationExpression <em>Variable Declaration Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getModifier()
 * @model
 * @generated
 */
public interface Modifier extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see #setVisibility(String)
	 * @see Java5.Java5Package#getModifier_Visibility()
	 * @model
	 * @generated
	 */
	String getVisibility();

	/**
	 * Sets the value of the '{@link Java5.Modifier#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(String value);

	/**
	 * Returns the value of the '<em><b>Inheritance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inheritance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inheritance</em>' attribute.
	 * @see #setInheritance(String)
	 * @see Java5.Java5Package#getModifier_Inheritance()
	 * @model
	 * @generated
	 */
	String getInheritance();

	/**
	 * Sets the value of the '{@link Java5.Modifier#getInheritance <em>Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inheritance</em>' attribute.
	 * @see #getInheritance()
	 * @generated
	 */
	void setInheritance(String value);

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see Java5.Java5Package#getModifier_Static()
	 * @model
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link Java5.Modifier#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' attribute.
	 * @see #setTransient(boolean)
	 * @see Java5.Java5Package#getModifier_Transient()
	 * @model
	 * @generated
	 */
	boolean isTransient();

	/**
	 * Sets the value of the '{@link Java5.Modifier#isTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #isTransient()
	 * @generated
	 */
	void setTransient(boolean value);

	/**
	 * Returns the value of the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volatile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatile</em>' attribute.
	 * @see #setVolatile(boolean)
	 * @see Java5.Java5Package#getModifier_Volatile()
	 * @model
	 * @generated
	 */
	boolean isVolatile();

	/**
	 * Sets the value of the '{@link Java5.Modifier#isVolatile <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile</em>' attribute.
	 * @see #isVolatile()
	 * @generated
	 */
	void setVolatile(boolean value);

	/**
	 * Returns the value of the '<em><b>Native</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Native</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Native</em>' attribute.
	 * @see #setNative(boolean)
	 * @see Java5.Java5Package#getModifier_Native()
	 * @model
	 * @generated
	 */
	boolean isNative();

	/**
	 * Sets the value of the '{@link Java5.Modifier#isNative <em>Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Native</em>' attribute.
	 * @see #isNative()
	 * @generated
	 */
	void setNative(boolean value);

	/**
	 * Returns the value of the '<em><b>Strictfp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strictfp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strictfp</em>' attribute.
	 * @see #setStrictfp(boolean)
	 * @see Java5.Java5Package#getModifier_Strictfp()
	 * @model
	 * @generated
	 */
	boolean isStrictfp();

	/**
	 * Sets the value of the '{@link Java5.Modifier#isStrictfp <em>Strictfp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strictfp</em>' attribute.
	 * @see #isStrictfp()
	 * @generated
	 */
	void setStrictfp(boolean value);

	/**
	 * Returns the value of the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronized</em>' attribute.
	 * @see #setSynchronized(boolean)
	 * @see Java5.Java5Package#getModifier_Synchronized()
	 * @model
	 * @generated
	 */
	boolean isSynchronized();

	/**
	 * Sets the value of the '{@link Java5.Modifier#isSynchronized <em>Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronized</em>' attribute.
	 * @see #isSynchronized()
	 * @generated
	 */
	void setSynchronized(boolean value);

	/**
	 * Returns the value of the '<em><b>Body Declaration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Java5.BodyDeclaration#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Declaration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Declaration</em>' container reference.
	 * @see #setBodyDeclaration(BodyDeclaration)
	 * @see Java5.Java5Package#getModifier_BodyDeclaration()
	 * @see Java5.BodyDeclaration#getModifiers
	 * @model opposite="modifiers"
	 * @generated
	 */
	BodyDeclaration getBodyDeclaration();

	/**
	 * Sets the value of the '{@link Java5.Modifier#getBodyDeclaration <em>Body Declaration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Declaration</em>' container reference.
	 * @see #getBodyDeclaration()
	 * @generated
	 */
	void setBodyDeclaration(BodyDeclaration value);

	/**
	 * Returns the value of the '<em><b>Single Variable Declaration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Java5.SingleVariableDeclaration#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Variable Declaration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Variable Declaration</em>' container reference.
	 * @see #setSingleVariableDeclaration(SingleVariableDeclaration)
	 * @see Java5.Java5Package#getModifier_SingleVariableDeclaration()
	 * @see Java5.SingleVariableDeclaration#getModifiers
	 * @model opposite="modifiers"
	 * @generated
	 */
	SingleVariableDeclaration getSingleVariableDeclaration();

	/**
	 * Sets the value of the '{@link Java5.Modifier#getSingleVariableDeclaration <em>Single Variable Declaration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Variable Declaration</em>' container reference.
	 * @see #getSingleVariableDeclaration()
	 * @generated
	 */
	void setSingleVariableDeclaration(SingleVariableDeclaration value);

	/**
	 * Returns the value of the '<em><b>Variable Declaration Statement</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Java5.VariableDeclarationStatement#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Declaration Statement</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Declaration Statement</em>' container reference.
	 * @see #setVariableDeclarationStatement(VariableDeclarationStatement)
	 * @see Java5.Java5Package#getModifier_VariableDeclarationStatement()
	 * @see Java5.VariableDeclarationStatement#getModifiers
	 * @model opposite="modifiers"
	 * @generated
	 */
	VariableDeclarationStatement getVariableDeclarationStatement();

	/**
	 * Sets the value of the '{@link Java5.Modifier#getVariableDeclarationStatement <em>Variable Declaration Statement</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Declaration Statement</em>' container reference.
	 * @see #getVariableDeclarationStatement()
	 * @generated
	 */
	void setVariableDeclarationStatement(VariableDeclarationStatement value);

	/**
	 * Returns the value of the '<em><b>Variable Declaration Expression</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Java5.VariableDeclarationExpression#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Declaration Expression</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Declaration Expression</em>' container reference.
	 * @see #setVariableDeclarationExpression(VariableDeclarationExpression)
	 * @see Java5.Java5Package#getModifier_VariableDeclarationExpression()
	 * @see Java5.VariableDeclarationExpression#getModifiers
	 * @model opposite="modifiers"
	 * @generated
	 */
	VariableDeclarationExpression getVariableDeclarationExpression();

	/**
	 * Sets the value of the '{@link Java5.Modifier#getVariableDeclarationExpression <em>Variable Declaration Expression</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Declaration Expression</em>' container reference.
	 * @see #getVariableDeclarationExpression()
	 * @generated
	 */
	void setVariableDeclarationExpression(VariableDeclarationExpression value);

} // Modifier
