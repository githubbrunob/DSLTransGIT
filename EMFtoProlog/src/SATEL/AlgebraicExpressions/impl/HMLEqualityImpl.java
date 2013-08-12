/**
 * <copyright>
 * </copyright>
 *
 * $Id: HMLEqualityImpl.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.AlgebraicExpressions.impl;

import SATEL.AlgebraicExpressions.AlgebraicExpressionsPackage;
import SATEL.AlgebraicExpressions.HMLEquality;

import SATEL.HMLFormula.HMLTerm;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HML Equality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.AlgebraicExpressions.impl.HMLEqualityImpl#getHmlTermL <em>Hml Term L</em>}</li>
 *   <li>{@link SATEL.AlgebraicExpressions.impl.HMLEqualityImpl#getHmlTermR <em>Hml Term R</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HMLEqualityImpl extends AlgebraicEqualityImpl implements HMLEquality {
	/**
	 * The cached value of the '{@link #getHmlTermL() <em>Hml Term L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHmlTermL()
	 * @generated
	 * @ordered
	 */
	protected HMLTerm hmlTermL;

	/**
	 * The cached value of the '{@link #getHmlTermR() <em>Hml Term R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHmlTermR()
	 * @generated
	 * @ordered
	 */
	protected HMLTerm hmlTermR;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HMLEqualityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgebraicExpressionsPackage.Literals.HML_EQUALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMLTerm getHmlTermL() {
		return hmlTermL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHmlTermL(HMLTerm newHmlTermL, NotificationChain msgs) {
		HMLTerm oldHmlTermL = hmlTermL;
		hmlTermL = newHmlTermL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlgebraicExpressionsPackage.HML_EQUALITY__HML_TERM_L, oldHmlTermL, newHmlTermL);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHmlTermL(HMLTerm newHmlTermL) {
		if (newHmlTermL != hmlTermL) {
			NotificationChain msgs = null;
			if (hmlTermL != null)
				msgs = ((InternalEObject)hmlTermL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlgebraicExpressionsPackage.HML_EQUALITY__HML_TERM_L, null, msgs);
			if (newHmlTermL != null)
				msgs = ((InternalEObject)newHmlTermL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlgebraicExpressionsPackage.HML_EQUALITY__HML_TERM_L, null, msgs);
			msgs = basicSetHmlTermL(newHmlTermL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgebraicExpressionsPackage.HML_EQUALITY__HML_TERM_L, newHmlTermL, newHmlTermL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMLTerm getHmlTermR() {
		return hmlTermR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHmlTermR(HMLTerm newHmlTermR, NotificationChain msgs) {
		HMLTerm oldHmlTermR = hmlTermR;
		hmlTermR = newHmlTermR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlgebraicExpressionsPackage.HML_EQUALITY__HML_TERM_R, oldHmlTermR, newHmlTermR);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHmlTermR(HMLTerm newHmlTermR) {
		if (newHmlTermR != hmlTermR) {
			NotificationChain msgs = null;
			if (hmlTermR != null)
				msgs = ((InternalEObject)hmlTermR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlgebraicExpressionsPackage.HML_EQUALITY__HML_TERM_R, null, msgs);
			if (newHmlTermR != null)
				msgs = ((InternalEObject)newHmlTermR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlgebraicExpressionsPackage.HML_EQUALITY__HML_TERM_R, null, msgs);
			msgs = basicSetHmlTermR(newHmlTermR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgebraicExpressionsPackage.HML_EQUALITY__HML_TERM_R, newHmlTermR, newHmlTermR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlgebraicExpressionsPackage.HML_EQUALITY__HML_TERM_L:
				return basicSetHmlTermL(null, msgs);
			case AlgebraicExpressionsPackage.HML_EQUALITY__HML_TERM_R:
				return basicSetHmlTermR(null, msgs);
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
			case AlgebraicExpressionsPackage.HML_EQUALITY__HML_TERM_L:
				return getHmlTermL();
			case AlgebraicExpressionsPackage.HML_EQUALITY__HML_TERM_R:
				return getHmlTermR();
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
			case AlgebraicExpressionsPackage.HML_EQUALITY__HML_TERM_L:
				setHmlTermL((HMLTerm)newValue);
				return;
			case AlgebraicExpressionsPackage.HML_EQUALITY__HML_TERM_R:
				setHmlTermR((HMLTerm)newValue);
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
			case AlgebraicExpressionsPackage.HML_EQUALITY__HML_TERM_L:
				setHmlTermL((HMLTerm)null);
				return;
			case AlgebraicExpressionsPackage.HML_EQUALITY__HML_TERM_R:
				setHmlTermR((HMLTerm)null);
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
			case AlgebraicExpressionsPackage.HML_EQUALITY__HML_TERM_L:
				return hmlTermL != null;
			case AlgebraicExpressionsPackage.HML_EQUALITY__HML_TERM_R:
				return hmlTermR != null;
		}
		return super.eIsSet(featureID);
	}

} //HMLEqualityImpl
