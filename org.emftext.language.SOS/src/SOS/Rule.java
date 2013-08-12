/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS;

import SOS.adtmm.Variable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SOS.Rule#getAssumes <em>Assumes</em>}</li>
 *   <li>{@link SOS.Rule#getConcludes <em>Concludes</em>}</li>
 *   <li>{@link SOS.Rule#getOwnedVariables <em>Owned Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see SOS.SOSPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Assumes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assumes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumes</em>' containment reference.
	 * @see #setAssumes(PremisseList)
	 * @see SOS.SOSPackage#getRule_Assumes()
	 * @model containment="true"
	 * @generated
	 */
	PremisseList getAssumes();

	/**
	 * Sets the value of the '{@link SOS.Rule#getAssumes <em>Assumes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assumes</em>' containment reference.
	 * @see #getAssumes()
	 * @generated
	 */
	void setAssumes(PremisseList value);

	/**
	 * Returns the value of the '<em><b>Concludes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concludes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concludes</em>' containment reference.
	 * @see #setConcludes(Conclusion)
	 * @see SOS.SOSPackage#getRule_Concludes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Conclusion getConcludes();

	/**
	 * Sets the value of the '{@link SOS.Rule#getConcludes <em>Concludes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concludes</em>' containment reference.
	 * @see #getConcludes()
	 * @generated
	 */
	void setConcludes(Conclusion value);

	/**
	 * Returns the value of the '<em><b>Owned Variables</b></em>' containment reference list.
	 * The list contents are of type {@link SOS.adtmm.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Variables</em>' containment reference list.
	 * @see SOS.SOSPackage#getRule_OwnedVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getOwnedVariables();

} // Rule
