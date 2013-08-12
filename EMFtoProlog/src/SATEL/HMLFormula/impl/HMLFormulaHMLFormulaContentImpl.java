/**
 * <copyright>
 * </copyright>
 *
 * $Id: HMLFormulaHMLFormulaContentImpl.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.HMLFormula.impl;

import SATEL.HMLFormula.HMLFormulaContent;
import SATEL.HMLFormula.HMLFormulaHMLFormulaContent;
import SATEL.HMLFormula.HMLFormulaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HML Formula Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.HMLFormula.impl.HMLFormulaHMLFormulaContentImpl#getHmlFormulaContent <em>Hml Formula Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HMLFormulaHMLFormulaContentImpl extends HMLFormulaImpl implements HMLFormulaHMLFormulaContent {
	/**
	 * The cached value of the '{@link #getHmlFormulaContent() <em>Hml Formula Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHmlFormulaContent()
	 * @generated
	 * @ordered
	 */
	protected HMLFormulaContent hmlFormulaContent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HMLFormulaHMLFormulaContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HMLFormulaPackage.Literals.HML_FORMULA_HML_FORMULA_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMLFormulaContent getHmlFormulaContent() {
		return hmlFormulaContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHmlFormulaContent(HMLFormulaContent newHmlFormulaContent, NotificationChain msgs) {
		HMLFormulaContent oldHmlFormulaContent = hmlFormulaContent;
		hmlFormulaContent = newHmlFormulaContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HMLFormulaPackage.HML_FORMULA_HML_FORMULA_CONTENT__HML_FORMULA_CONTENT, oldHmlFormulaContent, newHmlFormulaContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHmlFormulaContent(HMLFormulaContent newHmlFormulaContent) {
		if (newHmlFormulaContent != hmlFormulaContent) {
			NotificationChain msgs = null;
			if (hmlFormulaContent != null)
				msgs = ((InternalEObject)hmlFormulaContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HMLFormulaPackage.HML_FORMULA_HML_FORMULA_CONTENT__HML_FORMULA_CONTENT, null, msgs);
			if (newHmlFormulaContent != null)
				msgs = ((InternalEObject)newHmlFormulaContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HMLFormulaPackage.HML_FORMULA_HML_FORMULA_CONTENT__HML_FORMULA_CONTENT, null, msgs);
			msgs = basicSetHmlFormulaContent(newHmlFormulaContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HMLFormulaPackage.HML_FORMULA_HML_FORMULA_CONTENT__HML_FORMULA_CONTENT, newHmlFormulaContent, newHmlFormulaContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HMLFormulaPackage.HML_FORMULA_HML_FORMULA_CONTENT__HML_FORMULA_CONTENT:
				return basicSetHmlFormulaContent(null, msgs);
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
			case HMLFormulaPackage.HML_FORMULA_HML_FORMULA_CONTENT__HML_FORMULA_CONTENT:
				return getHmlFormulaContent();
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
			case HMLFormulaPackage.HML_FORMULA_HML_FORMULA_CONTENT__HML_FORMULA_CONTENT:
				setHmlFormulaContent((HMLFormulaContent)newValue);
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
			case HMLFormulaPackage.HML_FORMULA_HML_FORMULA_CONTENT__HML_FORMULA_CONTENT:
				setHmlFormulaContent((HMLFormulaContent)null);
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
			case HMLFormulaPackage.HML_FORMULA_HML_FORMULA_CONTENT__HML_FORMULA_CONTENT:
				return hmlFormulaContent != null;
		}
		return super.eIsSet(featureID);
	}

} //HMLFormulaHMLFormulaContentImpl
