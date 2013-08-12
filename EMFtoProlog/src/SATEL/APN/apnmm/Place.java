/**
 * <copyright>
 * </copyright>
 *
 * $Id: Place.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.APN.apnmm;

import SATEL.APN.adtmm.Sort;

import SATEL.APN.multisetmm.Multiset;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.APN.apnmm.Place#getOwnedPlaceMultiset <em>Owned Place Multiset</em>}</li>
 *   <li>{@link SATEL.APN.apnmm.Place#getSort <em>Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.APN.apnmm.ApnmmPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends Node {
	/**
	 * Returns the value of the '<em><b>Owned Place Multiset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Place Multiset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Place Multiset</em>' containment reference.
	 * @see #setOwnedPlaceMultiset(Multiset)
	 * @see SATEL.APN.apnmm.ApnmmPackage#getPlace_OwnedPlaceMultiset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Multiset getOwnedPlaceMultiset();

	/**
	 * Sets the value of the '{@link SATEL.APN.apnmm.Place#getOwnedPlaceMultiset <em>Owned Place Multiset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Place Multiset</em>' containment reference.
	 * @see #getOwnedPlaceMultiset()
	 * @generated
	 */
	void setOwnedPlaceMultiset(Multiset value);

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
	 * @see SATEL.APN.apnmm.ApnmmPackage#getPlace_Sort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Sort getSort();

	/**
	 * Sets the value of the '{@link SATEL.APN.apnmm.Place#getSort <em>Sort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort</em>' containment reference.
	 * @see #getSort()
	 * @generated
	 */
	void setSort(Sort value);

} // Place
