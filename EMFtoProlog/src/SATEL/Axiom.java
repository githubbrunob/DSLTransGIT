/**
 * <copyright>
 * </copyright>
 *
 * $Id: Axiom.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.Axiom#getCondition <em>Condition</em>}</li>
 *   <li>{@link SATEL.Axiom#getInclusion <em>Inclusion</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.SATELPackage#getAxiom()
 * @model
 * @generated
 */
public interface Axiom extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see SATEL.SATELPackage#getAxiom_Condition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link SATEL.Axiom#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Inclusion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inclusion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inclusion</em>' containment reference.
	 * @see #setInclusion(Inclusion)
	 * @see SATEL.SATELPackage#getAxiom_Inclusion()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Inclusion getInclusion();

	/**
	 * Sets the value of the '{@link SATEL.Axiom#getInclusion <em>Inclusion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inclusion</em>' containment reference.
	 * @see #getInclusion()
	 * @generated
	 */
	void setInclusion(Inclusion value);

} // Axiom
