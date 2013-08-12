/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algebraic Condition List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SOS.AlgebraicConditionList#getHas <em>Has</em>}</li>
 *   <li>{@link SOS.AlgebraicConditionList#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see SOS.SOSPackage#getAlgebraicConditionList()
 * @model
 * @generated
 */
public interface AlgebraicConditionList extends EObject {
	/**
	 * Returns the value of the '<em><b>Has</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' containment reference.
	 * @see #setHas(AlgebraicCondition)
	 * @see SOS.SOSPackage#getAlgebraicConditionList_Has()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AlgebraicCondition getHas();

	/**
	 * Sets the value of the '{@link SOS.AlgebraicConditionList#getHas <em>Has</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has</em>' containment reference.
	 * @see #getHas()
	 * @generated
	 */
	void setHas(AlgebraicCondition value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(AlgebraicConditionList)
	 * @see SOS.SOSPackage#getAlgebraicConditionList_Next()
	 * @model containment="true"
	 * @generated
	 */
	AlgebraicConditionList getNext();

	/**
	 * Sets the value of the '{@link SOS.AlgebraicConditionList#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(AlgebraicConditionList value);

} // AlgebraicConditionList
