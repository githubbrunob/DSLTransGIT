/**
 * <copyright>
 * </copyright>
 *
 * $Id: HMLTermImpl.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.HMLFormula.impl;

import SATEL.HMLFormula.HMLFormula;
import SATEL.HMLFormula.HMLFormulaPackage;
import SATEL.HMLFormula.HMLTerm;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HML Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.HMLFormula.impl.HMLTermImpl#getHmlFormula <em>Hml Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HMLTermImpl extends EObjectImpl implements HMLTerm {
	/**
	 * The cached value of the '{@link #getHmlFormula() <em>Hml Formula</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHmlFormula()
	 * @generated
	 * @ordered
	 */
	protected EList<HMLFormula> hmlFormula;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HMLTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HMLFormulaPackage.Literals.HML_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HMLFormula> getHmlFormula() {
		if (hmlFormula == null) {
			hmlFormula = new EObjectContainmentEList<HMLFormula>(HMLFormula.class, this, HMLFormulaPackage.HML_TERM__HML_FORMULA);
		}
		return hmlFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HMLFormulaPackage.HML_TERM__HML_FORMULA:
				return ((InternalEList<?>)getHmlFormula()).basicRemove(otherEnd, msgs);
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
			case HMLFormulaPackage.HML_TERM__HML_FORMULA:
				return getHmlFormula();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HMLFormulaPackage.HML_TERM__HML_FORMULA:
				getHmlFormula().clear();
				getHmlFormula().addAll((Collection<? extends HMLFormula>)newValue);
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
			case HMLFormulaPackage.HML_TERM__HML_FORMULA:
				getHmlFormula().clear();
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
			case HMLFormulaPackage.HML_TERM__HML_FORMULA:
				return hmlFormula != null && !hmlFormula.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HMLTermImpl
