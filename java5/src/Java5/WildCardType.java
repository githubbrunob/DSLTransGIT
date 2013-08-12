/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wild Card Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.WildCardType#getIsUpperBound <em>Is Upper Bound</em>}</li>
 *   <li>{@link Java5.WildCardType#getBound <em>Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getWildCardType()
 * @model
 * @generated
 */
public interface WildCardType extends OrphanType {
	/**
	 * Returns the value of the '<em><b>Is Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Upper Bound</em>' attribute.
	 * @see #setIsUpperBound(Boolean)
	 * @see Java5.Java5Package#getWildCardType_IsUpperBound()
	 * @model
	 * @generated
	 */
	Boolean getIsUpperBound();

	/**
	 * Sets the value of the '{@link Java5.WildCardType#getIsUpperBound <em>Is Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Upper Bound</em>' attribute.
	 * @see #getIsUpperBound()
	 * @generated
	 */
	void setIsUpperBound(Boolean value);

	/**
	 * Returns the value of the '<em><b>Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound</em>' containment reference.
	 * @see #setBound(NamedElementRef)
	 * @see Java5.Java5Package#getWildCardType_Bound()
	 * @model containment="true"
	 * @generated
	 */
	NamedElementRef getBound();

	/**
	 * Sets the value of the '{@link Java5.WildCardType#getBound <em>Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound</em>' containment reference.
	 * @see #getBound()
	 * @generated
	 */
	void setBound(NamedElementRef value);

} // WildCardType
