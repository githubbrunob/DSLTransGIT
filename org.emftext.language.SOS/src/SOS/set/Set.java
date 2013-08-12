/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.set;

import SOS.adtmm.Sort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SOS.set.Set#getSort <em>Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @see SOS.set.SetPackage#getSet()
 * @model
 * @generated
 */
public interface Set extends Sort {
	/**
	 * Returns the value of the '<em><b>Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort</em>' containment reference.
	 * @see #setSort(Sort)
	 * @see SOS.set.SetPackage#getSet_Sort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Sort getSort();

	/**
	 * Sets the value of the '{@link SOS.set.Set#getSort <em>Sort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort</em>' containment reference.
	 * @see #getSort()
	 * @generated
	 */
	void setSort(Sort value);

} // Set
