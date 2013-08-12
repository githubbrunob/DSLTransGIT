/**
 * <copyright>
 * </copyright>
 *
 * $Id: AlgebraicEqualityImpl.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.AlgebraicExpressions.impl;

import SATEL.AlgebraicExpressions.AlgebraicEquality;
import SATEL.AlgebraicExpressions.AlgebraicExpressionsPackage;

import SATEL.impl.ConditionAtomImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Algebraic Equality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class AlgebraicEqualityImpl extends ConditionAtomImpl implements AlgebraicEquality {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlgebraicEqualityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgebraicExpressionsPackage.Literals.ALGEBRAIC_EQUALITY;
	}

} //AlgebraicEqualityImpl
