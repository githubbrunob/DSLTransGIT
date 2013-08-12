/**
 * <copyright>
 * </copyright>
 *
 * $Id: Multiset.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.APN.multisetmm;

import SATEL.APN.adtmm.Sort;
import SATEL.APN.adtmm.Variable;

import SATEL.APN.environmentmm.Environment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.APN.multisetmm.Multiset#getMsSort <em>Ms Sort</em>}</li>
 *   <li>{@link SATEL.APN.multisetmm.Multiset#getOwnedNumOfTerms <em>Owned Num Of Terms</em>}</li>
 *   <li>{@link SATEL.APN.multisetmm.Multiset#getOwnedVariables <em>Owned Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.APN.multisetmm.MultisetmmPackage#getMultiset()
 * @model
 * @generated
 */
public interface Multiset extends Environment {
	/**
	 * Returns the value of the '<em><b>Ms Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ms Sort</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ms Sort</em>' containment reference.
	 * @see #setMsSort(Sort)
	 * @see SATEL.APN.multisetmm.MultisetmmPackage#getMultiset_MsSort()
	 * @model containment="true"
	 * @generated
	 */
	Sort getMsSort();

	/**
	 * Sets the value of the '{@link SATEL.APN.multisetmm.Multiset#getMsSort <em>Ms Sort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ms Sort</em>' containment reference.
	 * @see #getMsSort()
	 * @generated
	 */
	void setMsSort(Sort value);

	/**
	 * Returns the value of the '<em><b>Owned Num Of Terms</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.APN.multisetmm.NumOfTerms}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Num Of Terms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Num Of Terms</em>' containment reference list.
	 * @see SATEL.APN.multisetmm.MultisetmmPackage#getMultiset_OwnedNumOfTerms()
	 * @model containment="true"
	 * @generated
	 */
	EList<NumOfTerms> getOwnedNumOfTerms();

	/**
	 * Returns the value of the '<em><b>Owned Variables</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.APN.adtmm.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Variables</em>' containment reference list.
	 * @see SATEL.APN.multisetmm.MultisetmmPackage#getMultiset_OwnedVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getOwnedVariables();

} // Multiset
