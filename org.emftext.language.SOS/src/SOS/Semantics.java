/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS;

import SOS.adtmm.ADT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SOS.Semantics#getRules <em>Rules</em>}</li>
 *   <li>{@link SOS.Semantics#getSignature <em>Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @see SOS.SOSPackage#getSemantics()
 * @model
 * @generated
 */
public interface Semantics extends EObject {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link SOS.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see SOS.SOSPackage#getSemantics_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference list.
	 * The list contents are of type {@link SOS.adtmm.ADT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference list.
	 * @see SOS.SOSPackage#getSemantics_Signature()
	 * @model containment="true"
	 * @generated
	 */
	EList<ADT> getSignature();

} // Semantics
