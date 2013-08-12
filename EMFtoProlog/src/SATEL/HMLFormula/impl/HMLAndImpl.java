/**
 * <copyright>
 * </copyright>
 *
 * $Id: HMLAndImpl.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.HMLFormula.impl;

import SATEL.HMLFormula.HMLAnd;
import SATEL.HMLFormula.HMLFormulaContent;
import SATEL.HMLFormula.HMLFormulaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HML And</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.HMLFormula.impl.HMLAndImpl#getHmlFormulaContentL <em>Hml Formula Content L</em>}</li>
 *   <li>{@link SATEL.HMLFormula.impl.HMLAndImpl#getHmlFormulaContentR <em>Hml Formula Content R</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HMLAndImpl extends HMLFormulaContentImpl implements HMLAnd {
	/**
	 * The cached value of the '{@link #getHmlFormulaContentL() <em>Hml Formula Content L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHmlFormulaContentL()
	 * @generated
	 * @ordered
	 */
	protected HMLFormulaContent hmlFormulaContentL;

	/**
	 * The cached value of the '{@link #getHmlFormulaContentR() <em>Hml Formula Content R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHmlFormulaContentR()
	 * @generated
	 * @ordered
	 */
	protected HMLFormulaContent hmlFormulaContentR;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HMLAndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HMLFormulaPackage.Literals.HML_AND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMLFormulaContent getHmlFormulaContentL() {
		return hmlFormulaContentL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHmlFormulaContentL(HMLFormulaContent newHmlFormulaContentL, NotificationChain msgs) {
		HMLFormulaContent oldHmlFormulaContentL = hmlFormulaContentL;
		hmlFormulaContentL = newHmlFormulaContentL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HMLFormulaPackage.HML_AND__HML_FORMULA_CONTENT_L, oldHmlFormulaContentL, newHmlFormulaContentL);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHmlFormulaContentL(HMLFormulaContent newHmlFormulaContentL) {
		if (newHmlFormulaContentL != hmlFormulaContentL) {
			NotificationChain msgs = null;
			if (hmlFormulaContentL != null)
				msgs = ((InternalEObject)hmlFormulaContentL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HMLFormulaPackage.HML_AND__HML_FORMULA_CONTENT_L, null, msgs);
			if (newHmlFormulaContentL != null)
				msgs = ((InternalEObject)newHmlFormulaContentL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HMLFormulaPackage.HML_AND__HML_FORMULA_CONTENT_L, null, msgs);
			msgs = basicSetHmlFormulaContentL(newHmlFormulaContentL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HMLFormulaPackage.HML_AND__HML_FORMULA_CONTENT_L, newHmlFormulaContentL, newHmlFormulaContentL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMLFormulaContent getHmlFormulaContentR() {
		return hmlFormulaContentR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHmlFormulaContentR(HMLFormulaContent newHmlFormulaContentR, NotificationChain msgs) {
		HMLFormulaContent oldHmlFormulaContentR = hmlFormulaContentR;
		hmlFormulaContentR = newHmlFormulaContentR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HMLFormulaPackage.HML_AND__HML_FORMULA_CONTENT_R, oldHmlFormulaContentR, newHmlFormulaContentR);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHmlFormulaContentR(HMLFormulaContent newHmlFormulaContentR) {
		if (newHmlFormulaContentR != hmlFormulaContentR) {
			NotificationChain msgs = null;
			if (hmlFormulaContentR != null)
				msgs = ((InternalEObject)hmlFormulaContentR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HMLFormulaPackage.HML_AND__HML_FORMULA_CONTENT_R, null, msgs);
			if (newHmlFormulaContentR != null)
				msgs = ((InternalEObject)newHmlFormulaContentR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HMLFormulaPackage.HML_AND__HML_FORMULA_CONTENT_R, null, msgs);
			msgs = basicSetHmlFormulaContentR(newHmlFormulaContentR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HMLFormulaPackage.HML_AND__HML_FORMULA_CONTENT_R, newHmlFormulaContentR, newHmlFormulaContentR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HMLFormulaPackage.HML_AND__HML_FORMULA_CONTENT_L:
				return basicSetHmlFormulaContentL(null, msgs);
			case HMLFormulaPackage.HML_AND__HML_FORMULA_CONTENT_R:
				return basicSetHmlFormulaContentR(null, msgs);
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
			case HMLFormulaPackage.HML_AND__HML_FORMULA_CONTENT_L:
				return getHmlFormulaContentL();
			case HMLFormulaPackage.HML_AND__HML_FORMULA_CONTENT_R:
				return getHmlFormulaContentR();
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
			case HMLFormulaPackage.HML_AND__HML_FORMULA_CONTENT_L:
				setHmlFormulaContentL((HMLFormulaContent)newValue);
				return;
			case HMLFormulaPackage.HML_AND__HML_FORMULA_CONTENT_R:
				setHmlFormulaContentR((HMLFormulaContent)newValue);
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
			case HMLFormulaPackage.HML_AND__HML_FORMULA_CONTENT_L:
				setHmlFormulaContentL((HMLFormulaContent)null);
				return;
			case HMLFormulaPackage.HML_AND__HML_FORMULA_CONTENT_R:
				setHmlFormulaContentR((HMLFormulaContent)null);
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
			case HMLFormulaPackage.HML_AND__HML_FORMULA_CONTENT_L:
				return hmlFormulaContentL != null;
			case HMLFormulaPackage.HML_AND__HML_FORMULA_CONTENT_R:
				return hmlFormulaContentR != null;
		}
		return super.eIsSet(featureID);
	}

} //HMLAndImpl
