/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.adtmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cond Equation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SOS.adtmm.CondEquation#getOwnedConditions <em>Owned Conditions</em>}</li>
 *   <li>{@link SOS.adtmm.CondEquation#getOwnedEquation <em>Owned Equation</em>}</li>
 * </ul>
 * </p>
 *
 * @see SOS.adtmm.AdtmmPackage#getCondEquation()
 * @model
 * @generated
 */
public interface CondEquation extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link SOS.adtmm.AbstractEquation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Conditions</em>' containment reference list.
	 * @see SOS.adtmm.AdtmmPackage#getCondEquation_OwnedConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractEquation> getOwnedConditions();

	/**
	 * Returns the value of the '<em><b>Owned Equation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Equation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Equation</em>' containment reference.
	 * @see #setOwnedEquation(Equation)
	 * @see SOS.adtmm.AdtmmPackage#getCondEquation_OwnedEquation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Equation getOwnedEquation();

	/**
	 * Sets the value of the '{@link SOS.adtmm.CondEquation#getOwnedEquation <em>Owned Equation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Equation</em>' containment reference.
	 * @see #getOwnedEquation()
	 * @generated
	 */
	void setOwnedEquation(Equation value);

} // CondEquation
