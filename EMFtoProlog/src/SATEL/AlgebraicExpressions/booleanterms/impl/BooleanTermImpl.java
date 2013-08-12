/**
 * <copyright>
 * </copyright>
 *
 * $Id: BooleanTermImpl.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions.booleanterms.impl;

import SATEL.AlgebraicExpressions.booleanterms.BooleanTerm;
import SATEL.AlgebraicExpressions.booleanterms.BooleantermsPackage;

import SATEL.impl.ConditionAtomImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class BooleanTermImpl extends ConditionAtomImpl implements BooleanTerm {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BooleantermsPackage.Literals.BOOLEAN_TERM;
	}

} //BooleanTermImpl
