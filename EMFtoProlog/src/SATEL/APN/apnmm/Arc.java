/**
 * <copyright>
 * </copyright>
 *
 * $Id: Arc.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.APN.apnmm;

import SATEL.APN.multisetmm.Multiset;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.APN.apnmm.Arc#getFrom <em>From</em>}</li>
 *   <li>{@link SATEL.APN.apnmm.Arc#getTo <em>To</em>}</li>
 *   <li>{@link SATEL.APN.apnmm.Arc#getOwnedArcMultiset <em>Owned Arc Multiset</em>}</li>
 *   <li>{@link SATEL.APN.apnmm.Arc#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.APN.apnmm.ApnmmPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Node)
	 * @see SATEL.APN.apnmm.ApnmmPackage#getArc_From()
	 * @model required="true"
	 * @generated
	 */
	Node getFrom();

	/**
	 * Sets the value of the '{@link SATEL.APN.apnmm.Arc#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Node value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Node)
	 * @see SATEL.APN.apnmm.ApnmmPackage#getArc_To()
	 * @model required="true"
	 * @generated
	 */
	Node getTo();

	/**
	 * Sets the value of the '{@link SATEL.APN.apnmm.Arc#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Node value);

	/**
	 * Returns the value of the '<em><b>Owned Arc Multiset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Arc Multiset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Arc Multiset</em>' containment reference.
	 * @see #setOwnedArcMultiset(Multiset)
	 * @see SATEL.APN.apnmm.ApnmmPackage#getArc_OwnedArcMultiset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Multiset getOwnedArcMultiset();

	/**
	 * Sets the value of the '{@link SATEL.APN.apnmm.Arc#getOwnedArcMultiset <em>Owned Arc Multiset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Arc Multiset</em>' containment reference.
	 * @see #getOwnedArcMultiset()
	 * @generated
	 */
	void setOwnedArcMultiset(Multiset value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see SATEL.APN.apnmm.ApnmmPackage#getArc_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SATEL.APN.apnmm.Arc#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Arc
