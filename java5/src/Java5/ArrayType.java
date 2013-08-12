/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.ArrayType#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link Java5.ArrayType#getOriginalName <em>Original Name</em>}</li>
 *   <li>{@link Java5.ArrayType#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getArrayType()
 * @model
 * @generated
 */
public interface ArrayType extends OrphanType {
	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' attribute.
	 * @see #setDimensions(int)
	 * @see Java5.Java5Package#getArrayType_Dimensions()
	 * @model
	 * @generated
	 */
	int getDimensions();

	/**
	 * Sets the value of the '{@link Java5.ArrayType#getDimensions <em>Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions</em>' attribute.
	 * @see #getDimensions()
	 * @generated
	 */
	void setDimensions(int value);

	/**
	 * Returns the value of the '<em><b>Original Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Name</em>' attribute.
	 * @see #setOriginalName(String)
	 * @see Java5.Java5Package#getArrayType_OriginalName()
	 * @model derived="true"
	 * @generated
	 */
	String getOriginalName();

	/**
	 * Sets the value of the '{@link Java5.ArrayType#getOriginalName <em>Original Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Name</em>' attribute.
	 * @see #getOriginalName()
	 * @generated
	 */
	void setOriginalName(String value);

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' containment reference.
	 * @see #setElementType(NamedElementRef)
	 * @see Java5.Java5Package#getArrayType_ElementType()
	 * @model containment="true"
	 * @generated
	 */
	NamedElementRef getElementType();

	/**
	 * Sets the value of the '{@link Java5.ArrayType#getElementType <em>Element Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' containment reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(NamedElementRef value);

} // ArrayType
