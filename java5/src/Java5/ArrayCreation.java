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
 * A representation of the model object '<em><b>Array Creation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.ArrayCreation#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link Java5.ArrayCreation#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link Java5.ArrayCreation#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getArrayCreation()
 * @model
 * @generated
 */
public interface ArrayCreation extends Expression {
	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' containment reference list.
	 * The list contents are of type {@link Java5.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' containment reference list.
	 * @see Java5.Java5Package#getArrayCreation_Dimensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getDimensions();

	/**
	 * Returns the value of the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initializer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializer</em>' containment reference.
	 * @see #setInitializer(ArrayInitializer)
	 * @see Java5.Java5Package#getArrayCreation_Initializer()
	 * @model containment="true"
	 * @generated
	 */
	ArrayInitializer getInitializer();

	/**
	 * Sets the value of the '{@link Java5.ArrayCreation#getInitializer <em>Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializer</em>' containment reference.
	 * @see #getInitializer()
	 * @generated
	 */
	void setInitializer(ArrayInitializer value);

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
	 * @see Java5.Java5Package#getArrayCreation_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NamedElementRef getType();

	/**
	 * Sets the value of the '{@link Java5.ArrayCreation#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(NamedElementRef value);

} // ArrayCreation
