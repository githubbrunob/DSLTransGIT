/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS;

import SOS.adtmm.AbstractEquation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algebraic Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SOS.AlgebraicCondition#getOwnedConditions <em>Owned Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see SOS.SOSPackage#getAlgebraicCondition()
 * @model
 * @generated
 */
public interface AlgebraicCondition extends Condition {
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
	 * @see SOS.SOSPackage#getAlgebraicCondition_OwnedConditions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AbstractEquation> getOwnedConditions();

} // AlgebraicCondition
