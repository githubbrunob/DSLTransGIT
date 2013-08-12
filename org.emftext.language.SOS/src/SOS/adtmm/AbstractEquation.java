/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.adtmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Equation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SOS.adtmm.AbstractEquation#getOwnedRightTerm <em>Owned Right Term</em>}</li>
 *   <li>{@link SOS.adtmm.AbstractEquation#getOwnedLeftTerm <em>Owned Left Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see SOS.adtmm.AdtmmPackage#getAbstractEquation()
 * @model abstract="true"
 * @generated
 */
public interface AbstractEquation extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Right Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Right Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Right Term</em>' containment reference.
	 * @see #setOwnedRightTerm(Term)
	 * @see SOS.adtmm.AdtmmPackage#getAbstractEquation_OwnedRightTerm()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Term getOwnedRightTerm();

	/**
	 * Sets the value of the '{@link SOS.adtmm.AbstractEquation#getOwnedRightTerm <em>Owned Right Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Right Term</em>' containment reference.
	 * @see #getOwnedRightTerm()
	 * @generated
	 */
	void setOwnedRightTerm(Term value);

	/**
	 * Returns the value of the '<em><b>Owned Left Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Left Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Left Term</em>' containment reference.
	 * @see #setOwnedLeftTerm(Term)
	 * @see SOS.adtmm.AdtmmPackage#getAbstractEquation_OwnedLeftTerm()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Term getOwnedLeftTerm();

	/**
	 * Sets the value of the '{@link SOS.adtmm.AbstractEquation#getOwnedLeftTerm <em>Owned Left Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Left Term</em>' containment reference.
	 * @see #getOwnedLeftTerm()
	 * @generated
	 */
	void setOwnedLeftTerm(Term value);

} // AbstractEquation
