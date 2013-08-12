/**
 * <copyright>
 * </copyright>
 *
 * $Id: Guard.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.APN.guardmm;

import SATEL.APN.adtmm.AbstractEquation;
import SATEL.APN.adtmm.Variable;

import SATEL.APN.environmentmm.Environment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.APN.guardmm.Guard#getOwnedEquations <em>Owned Equations</em>}</li>
 *   <li>{@link SATEL.APN.guardmm.Guard#getOwnedVariables <em>Owned Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.APN.guardmm.GuardmmPackage#getGuard()
 * @model
 * @generated
 */
public interface Guard extends Environment {
	/**
	 * Returns the value of the '<em><b>Owned Equations</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.APN.adtmm.AbstractEquation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Equations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Equations</em>' containment reference list.
	 * @see SATEL.APN.guardmm.GuardmmPackage#getGuard_OwnedEquations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AbstractEquation> getOwnedEquations();

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
	 * @see SATEL.APN.guardmm.GuardmmPackage#getGuard_OwnedVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getOwnedVariables();

} // Guard
