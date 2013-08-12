/**
 * <copyright>
 * </copyright>
 *
 * $Id: AlgEqualityImpl.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.AlgebraicExpressions.impl;

import SATEL.AlgebraicExpressions.AlgEquality;
import SATEL.AlgebraicExpressions.AlgebraicExpressionsPackage;

import SATEL.AlgebraicExpressions.algterms.AlgebraicTerm;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alg Equality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.AlgebraicExpressions.impl.AlgEqualityImpl#getAlgebraicTermL <em>Algebraic Term L</em>}</li>
 *   <li>{@link SATEL.AlgebraicExpressions.impl.AlgEqualityImpl#getAlgebraicTermR <em>Algebraic Term R</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlgEqualityImpl extends AlgebraicEqualityImpl implements AlgEquality {
	/**
	 * The cached value of the '{@link #getAlgebraicTermL() <em>Algebraic Term L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgebraicTermL()
	 * @generated
	 * @ordered
	 */
	protected AlgebraicTerm algebraicTermL;

	/**
	 * The cached value of the '{@link #getAlgebraicTermR() <em>Algebraic Term R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgebraicTermR()
	 * @generated
	 * @ordered
	 */
	protected AlgebraicTerm algebraicTermR;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlgEqualityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgebraicExpressionsPackage.Literals.ALG_EQUALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgebraicTerm getAlgebraicTermL() {
		return algebraicTermL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlgebraicTermL(AlgebraicTerm newAlgebraicTermL, NotificationChain msgs) {
		AlgebraicTerm oldAlgebraicTermL = algebraicTermL;
		algebraicTermL = newAlgebraicTermL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlgebraicExpressionsPackage.ALG_EQUALITY__ALGEBRAIC_TERM_L, oldAlgebraicTermL, newAlgebraicTermL);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgebraicTermL(AlgebraicTerm newAlgebraicTermL) {
		if (newAlgebraicTermL != algebraicTermL) {
			NotificationChain msgs = null;
			if (algebraicTermL != null)
				msgs = ((InternalEObject)algebraicTermL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlgebraicExpressionsPackage.ALG_EQUALITY__ALGEBRAIC_TERM_L, null, msgs);
			if (newAlgebraicTermL != null)
				msgs = ((InternalEObject)newAlgebraicTermL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlgebraicExpressionsPackage.ALG_EQUALITY__ALGEBRAIC_TERM_L, null, msgs);
			msgs = basicSetAlgebraicTermL(newAlgebraicTermL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgebraicExpressionsPackage.ALG_EQUALITY__ALGEBRAIC_TERM_L, newAlgebraicTermL, newAlgebraicTermL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgebraicTerm getAlgebraicTermR() {
		return algebraicTermR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlgebraicTermR(AlgebraicTerm newAlgebraicTermR, NotificationChain msgs) {
		AlgebraicTerm oldAlgebraicTermR = algebraicTermR;
		algebraicTermR = newAlgebraicTermR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlgebraicExpressionsPackage.ALG_EQUALITY__ALGEBRAIC_TERM_R, oldAlgebraicTermR, newAlgebraicTermR);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgebraicTermR(AlgebraicTerm newAlgebraicTermR) {
		if (newAlgebraicTermR != algebraicTermR) {
			NotificationChain msgs = null;
			if (algebraicTermR != null)
				msgs = ((InternalEObject)algebraicTermR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlgebraicExpressionsPackage.ALG_EQUALITY__ALGEBRAIC_TERM_R, null, msgs);
			if (newAlgebraicTermR != null)
				msgs = ((InternalEObject)newAlgebraicTermR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlgebraicExpressionsPackage.ALG_EQUALITY__ALGEBRAIC_TERM_R, null, msgs);
			msgs = basicSetAlgebraicTermR(newAlgebraicTermR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgebraicExpressionsPackage.ALG_EQUALITY__ALGEBRAIC_TERM_R, newAlgebraicTermR, newAlgebraicTermR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlgebraicExpressionsPackage.ALG_EQUALITY__ALGEBRAIC_TERM_L:
				return basicSetAlgebraicTermL(null, msgs);
			case AlgebraicExpressionsPackage.ALG_EQUALITY__ALGEBRAIC_TERM_R:
				return basicSetAlgebraicTermR(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgebraicExpressionsPackage.ALG_EQUALITY__ALGEBRAIC_TERM_L:
				return getAlgebraicTermL();
			case AlgebraicExpressionsPackage.ALG_EQUALITY__ALGEBRAIC_TERM_R:
				return getAlgebraicTermR();
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
			case AlgebraicExpressionsPackage.ALG_EQUALITY__ALGEBRAIC_TERM_L:
				setAlgebraicTermL((AlgebraicTerm)newValue);
				return;
			case AlgebraicExpressionsPackage.ALG_EQUALITY__ALGEBRAIC_TERM_R:
				setAlgebraicTermR((AlgebraicTerm)newValue);
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
			case AlgebraicExpressionsPackage.ALG_EQUALITY__ALGEBRAIC_TERM_L:
				setAlgebraicTermL((AlgebraicTerm)null);
				return;
			case AlgebraicExpressionsPackage.ALG_EQUALITY__ALGEBRAIC_TERM_R:
				setAlgebraicTermR((AlgebraicTerm)null);
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
			case AlgebraicExpressionsPackage.ALG_EQUALITY__ALGEBRAIC_TERM_L:
				return algebraicTermL != null;
			case AlgebraicExpressionsPackage.ALG_EQUALITY__ALGEBRAIC_TERM_R:
				return algebraicTermR != null;
		}
		return super.eIsSet(featureID);
	}

} //AlgEqualityImpl
