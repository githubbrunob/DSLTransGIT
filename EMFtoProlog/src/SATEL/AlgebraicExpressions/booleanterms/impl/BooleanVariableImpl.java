/**
 * <copyright>
 * </copyright>
 *
 * $Id: BooleanVariableImpl.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions.booleanterms.impl;

import SATEL.AlgebraicExpressions.booleanterms.BooleanVariable;
import SATEL.AlgebraicExpressions.booleanterms.BooleantermsPackage;

import SATEL.VariableDeclarations.PrimitiveBooleanVarDec;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.AlgebraicExpressions.booleanterms.impl.BooleanVariableImpl#getBooleanVariable <em>Boolean Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanVariableImpl extends BooleanTermImpl implements BooleanVariable {
	/**
	 * The cached value of the '{@link #getBooleanVariable() <em>Boolean Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanVariable()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveBooleanVarDec booleanVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BooleantermsPackage.Literals.BOOLEAN_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveBooleanVarDec getBooleanVariable() {
		if (booleanVariable != null && booleanVariable.eIsProxy()) {
			InternalEObject oldBooleanVariable = (InternalEObject)booleanVariable;
			booleanVariable = (PrimitiveBooleanVarDec)eResolveProxy(oldBooleanVariable);
			if (booleanVariable != oldBooleanVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BooleantermsPackage.BOOLEAN_VARIABLE__BOOLEAN_VARIABLE, oldBooleanVariable, booleanVariable));
			}
		}
		return booleanVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveBooleanVarDec basicGetBooleanVariable() {
		return booleanVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanVariable(PrimitiveBooleanVarDec newBooleanVariable) {
		PrimitiveBooleanVarDec oldBooleanVariable = booleanVariable;
		booleanVariable = newBooleanVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BooleantermsPackage.BOOLEAN_VARIABLE__BOOLEAN_VARIABLE, oldBooleanVariable, booleanVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BooleantermsPackage.BOOLEAN_VARIABLE__BOOLEAN_VARIABLE:
				if (resolve) return getBooleanVariable();
				return basicGetBooleanVariable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BooleantermsPackage.BOOLEAN_VARIABLE__BOOLEAN_VARIABLE:
				setBooleanVariable((PrimitiveBooleanVarDec)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BooleantermsPackage.BOOLEAN_VARIABLE__BOOLEAN_VARIABLE:
				setBooleanVariable((PrimitiveBooleanVarDec)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BooleantermsPackage.BOOLEAN_VARIABLE__BOOLEAN_VARIABLE:
				return booleanVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //BooleanVariableImpl
