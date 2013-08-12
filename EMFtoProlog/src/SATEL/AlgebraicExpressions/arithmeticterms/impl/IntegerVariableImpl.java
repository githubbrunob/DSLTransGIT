/**
 * <copyright>
 * </copyright>
 *
 * $Id: IntegerVariableImpl.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.AlgebraicExpressions.arithmeticterms.impl;

import SATEL.AlgebraicExpressions.arithmeticterms.ArithmetictermsPackage;
import SATEL.AlgebraicExpressions.arithmeticterms.IntegerVariable;

import SATEL.VariableDeclarations.PrimitiveIntegerVarDec;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.AlgebraicExpressions.arithmeticterms.impl.IntegerVariableImpl#getIntegerVariable <em>Integer Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegerVariableImpl extends ArithmeticTermImpl implements IntegerVariable {
	/**
	 * The cached value of the '{@link #getIntegerVariable() <em>Integer Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerVariable()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveIntegerVarDec integerVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArithmetictermsPackage.Literals.INTEGER_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveIntegerVarDec getIntegerVariable() {
		if (integerVariable != null && integerVariable.eIsProxy()) {
			InternalEObject oldIntegerVariable = (InternalEObject)integerVariable;
			integerVariable = (PrimitiveIntegerVarDec)eResolveProxy(oldIntegerVariable);
			if (integerVariable != oldIntegerVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArithmetictermsPackage.INTEGER_VARIABLE__INTEGER_VARIABLE, oldIntegerVariable, integerVariable));
			}
		}
		return integerVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveIntegerVarDec basicGetIntegerVariable() {
		return integerVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegerVariable(PrimitiveIntegerVarDec newIntegerVariable) {
		PrimitiveIntegerVarDec oldIntegerVariable = integerVariable;
		integerVariable = newIntegerVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArithmetictermsPackage.INTEGER_VARIABLE__INTEGER_VARIABLE, oldIntegerVariable, integerVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArithmetictermsPackage.INTEGER_VARIABLE__INTEGER_VARIABLE:
				if (resolve) return getIntegerVariable();
				return basicGetIntegerVariable();
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
			case ArithmetictermsPackage.INTEGER_VARIABLE__INTEGER_VARIABLE:
				setIntegerVariable((PrimitiveIntegerVarDec)newValue);
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
			case ArithmetictermsPackage.INTEGER_VARIABLE__INTEGER_VARIABLE:
				setIntegerVariable((PrimitiveIntegerVarDec)null);
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
			case ArithmetictermsPackage.INTEGER_VARIABLE__INTEGER_VARIABLE:
				return integerVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //IntegerVariableImpl
