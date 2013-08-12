/**
 * <copyright>
 * </copyright>
 *
 * $Id: Instantiation.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.APN.adtmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.APN.adtmm.Instantiation#getOwnedParameters <em>Owned Parameters</em>}</li>
 *   <li>{@link SATEL.APN.adtmm.Instantiation#getImported <em>Imported</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.APN.adtmm.AdtmmPackage#getInstantiation()
 * @model
 * @generated
 */
public interface Instantiation extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.APN.adtmm.Sort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameters</em>' containment reference list.
	 * @see SATEL.APN.adtmm.AdtmmPackage#getInstantiation_OwnedParameters()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Sort> getOwnedParameters();

	/**
	 * Returns the value of the '<em><b>Imported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported</em>' reference.
	 * @see #setImported(Instantiable)
	 * @see SATEL.APN.adtmm.AdtmmPackage#getInstantiation_Imported()
	 * @model required="true"
	 * @generated
	 */
	Instantiable getImported();

	/**
	 * Sets the value of the '{@link SATEL.APN.adtmm.Instantiation#getImported <em>Imported</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported</em>' reference.
	 * @see #getImported()
	 * @generated
	 */
	void setImported(Instantiable value);

} // Instantiation
