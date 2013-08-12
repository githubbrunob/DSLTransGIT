/**
 * <copyright>
 * </copyright>
 *
 * $Id: BOPAndImpl.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions.booleanterms.impl;

import SATEL.AlgebraicExpressions.booleanterms.BOPAnd;
import SATEL.AlgebraicExpressions.booleanterms.BooleanTerm;
import SATEL.AlgebraicExpressions.booleanterms.BooleantermsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BOP And</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.AlgebraicExpressions.booleanterms.impl.BOPAndImpl#getBooleanTermL <em>Boolean Term L</em>}</li>
 *   <li>{@link SATEL.AlgebraicExpressions.booleanterms.impl.BOPAndImpl#getBooleanTermR <em>Boolean Term R</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BOPAndImpl extends BooleanTermImpl implements BOPAnd {
	/**
	 * The cached value of the '{@link #getBooleanTermL() <em>Boolean Term L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanTermL()
	 * @generated
	 * @ordered
	 */
	protected BooleanTerm booleanTermL;

	/**
	 * The cached value of the '{@link #getBooleanTermR() <em>Boolean Term R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanTermR()
	 * @generated
	 * @ordered
	 */
	protected BooleanTerm booleanTermR;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BOPAndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BooleantermsPackage.Literals.BOP_AND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanTerm getBooleanTermL() {
		return booleanTermL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooleanTermL(BooleanTerm newBooleanTermL, NotificationChain msgs) {
		BooleanTerm oldBooleanTermL = booleanTermL;
		booleanTermL = newBooleanTermL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BooleantermsPackage.BOP_AND__BOOLEAN_TERM_L, oldBooleanTermL, newBooleanTermL);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanTermL(BooleanTerm newBooleanTermL) {
		if (newBooleanTermL != booleanTermL) {
			NotificationChain msgs = null;
			if (booleanTermL != null)
				msgs = ((InternalEObject)booleanTermL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BooleantermsPackage.BOP_AND__BOOLEAN_TERM_L, null, msgs);
			if (newBooleanTermL != null)
				msgs = ((InternalEObject)newBooleanTermL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BooleantermsPackage.BOP_AND__BOOLEAN_TERM_L, null, msgs);
			msgs = basicSetBooleanTermL(newBooleanTermL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BooleantermsPackage.BOP_AND__BOOLEAN_TERM_L, newBooleanTermL, newBooleanTermL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanTerm getBooleanTermR() {
		return booleanTermR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooleanTermR(BooleanTerm newBooleanTermR, NotificationChain msgs) {
		BooleanTerm oldBooleanTermR = booleanTermR;
		booleanTermR = newBooleanTermR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BooleantermsPackage.BOP_AND__BOOLEAN_TERM_R, oldBooleanTermR, newBooleanTermR);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanTermR(BooleanTerm newBooleanTermR) {
		if (newBooleanTermR != booleanTermR) {
			NotificationChain msgs = null;
			if (booleanTermR != null)
				msgs = ((InternalEObject)booleanTermR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BooleantermsPackage.BOP_AND__BOOLEAN_TERM_R, null, msgs);
			if (newBooleanTermR != null)
				msgs = ((InternalEObject)newBooleanTermR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BooleantermsPackage.BOP_AND__BOOLEAN_TERM_R, null, msgs);
			msgs = basicSetBooleanTermR(newBooleanTermR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BooleantermsPackage.BOP_AND__BOOLEAN_TERM_R, newBooleanTermR, newBooleanTermR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BooleantermsPackage.BOP_AND__BOOLEAN_TERM_L:
				return basicSetBooleanTermL(null, msgs);
			case BooleantermsPackage.BOP_AND__BOOLEAN_TERM_R:
				return basicSetBooleanTermR(null, msgs);
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
			case BooleantermsPackage.BOP_AND__BOOLEAN_TERM_L:
				return getBooleanTermL();
			case BooleantermsPackage.BOP_AND__BOOLEAN_TERM_R:
				return getBooleanTermR();
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
			case BooleantermsPackage.BOP_AND__BOOLEAN_TERM_L:
				setBooleanTermL((BooleanTerm)newValue);
				return;
			case BooleantermsPackage.BOP_AND__BOOLEAN_TERM_R:
				setBooleanTermR((BooleanTerm)newValue);
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
			case BooleantermsPackage.BOP_AND__BOOLEAN_TERM_L:
				setBooleanTermL((BooleanTerm)null);
				return;
			case BooleantermsPackage.BOP_AND__BOOLEAN_TERM_R:
				setBooleanTermR((BooleanTerm)null);
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
			case BooleantermsPackage.BOP_AND__BOOLEAN_TERM_L:
				return booleanTermL != null;
			case BooleantermsPackage.BOP_AND__BOOLEAN_TERM_R:
				return booleanTermR != null;
		}
		return super.eIsSet(featureID);
	}

} //BOPAndImpl
