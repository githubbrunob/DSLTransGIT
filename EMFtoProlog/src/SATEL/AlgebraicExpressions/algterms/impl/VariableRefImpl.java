/**
 * <copyright>
 * </copyright>
 *
 * $Id: VariableRefImpl.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.AlgebraicExpressions.algterms.impl;

import SATEL.AlgebraicExpressions.algterms.AlgtermsPackage;
import SATEL.AlgebraicExpressions.algterms.VariableRef;

import SATEL.VariableDeclarations.AlgebraicSortVarDec;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.AlgebraicExpressions.algterms.impl.VariableRefImpl#getVar <em>Var</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableRefImpl extends AlgebraicTermImpl implements VariableRef {
	/**
	 * The cached value of the '{@link #getVar() <em>Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVar()
	 * @generated
	 * @ordered
	 */
	protected AlgebraicSortVarDec var;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgtermsPackage.Literals.VARIABLE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgebraicSortVarDec getVar() {
		if (var != null && var.eIsProxy()) {
			InternalEObject oldVar = (InternalEObject)var;
			var = (AlgebraicSortVarDec)eResolveProxy(oldVar);
			if (var != oldVar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgtermsPackage.VARIABLE_REF__VAR, oldVar, var));
			}
		}
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgebraicSortVarDec basicGetVar() {
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVar(AlgebraicSortVarDec newVar) {
		AlgebraicSortVarDec oldVar = var;
		var = newVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgtermsPackage.VARIABLE_REF__VAR, oldVar, var));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgtermsPackage.VARIABLE_REF__VAR:
				if (resolve) return getVar();
				return basicGetVar();
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
			case AlgtermsPackage.VARIABLE_REF__VAR:
				setVar((AlgebraicSortVarDec)newValue);
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
			case AlgtermsPackage.VARIABLE_REF__VAR:
				setVar((AlgebraicSortVarDec)null);
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
			case AlgtermsPackage.VARIABLE_REF__VAR:
				return var != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableRefImpl
