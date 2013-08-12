/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.impl;

import SOS.AlgebraicCondition;
import SOS.SOSPackage;

import SOS.adtmm.AbstractEquation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Algebraic Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SOS.impl.AlgebraicConditionImpl#getOwnedConditions <em>Owned Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlgebraicConditionImpl extends ConditionImpl implements AlgebraicCondition {
	/**
	 * The cached value of the '{@link #getOwnedConditions() <em>Owned Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractEquation> ownedConditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlgebraicConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SOSPackage.Literals.ALGEBRAIC_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractEquation> getOwnedConditions() {
		if (ownedConditions == null) {
			ownedConditions = new EObjectContainmentEList<AbstractEquation>(AbstractEquation.class, this, SOSPackage.ALGEBRAIC_CONDITION__OWNED_CONDITIONS);
		}
		return ownedConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SOSPackage.ALGEBRAIC_CONDITION__OWNED_CONDITIONS:
				return ((InternalEList<?>)getOwnedConditions()).basicRemove(otherEnd, msgs);
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
			case SOSPackage.ALGEBRAIC_CONDITION__OWNED_CONDITIONS:
				return getOwnedConditions();
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
			case SOSPackage.ALGEBRAIC_CONDITION__OWNED_CONDITIONS:
				getOwnedConditions().clear();
				getOwnedConditions().addAll((Collection<? extends AbstractEquation>)newValue);
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
			case SOSPackage.ALGEBRAIC_CONDITION__OWNED_CONDITIONS:
				getOwnedConditions().clear();
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
			case SOSPackage.ALGEBRAIC_CONDITION__OWNED_CONDITIONS:
				return ownedConditions != null && !ownedConditions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AlgebraicConditionImpl
