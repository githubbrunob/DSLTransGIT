/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.impl;

import SOS.Rule;
import SOS.SOSPackage;
import SOS.Semantics;

import SOS.adtmm.ADT;

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
 * An implementation of the model object '<em><b>Semantics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SOS.impl.SemanticsImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link SOS.impl.SemanticsImpl#getSignature <em>Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SemanticsImpl extends EObjectImpl implements Semantics {
	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rules;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected EList<ADT> signature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SOSPackage.Literals.SEMANTICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<Rule>(Rule.class, this, SOSPackage.SEMANTICS__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADT> getSignature() {
		if (signature == null) {
			signature = new EObjectContainmentEList<ADT>(ADT.class, this, SOSPackage.SEMANTICS__SIGNATURE);
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SOSPackage.SEMANTICS__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
			case SOSPackage.SEMANTICS__SIGNATURE:
				return ((InternalEList<?>)getSignature()).basicRemove(otherEnd, msgs);
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
			case SOSPackage.SEMANTICS__RULES:
				return getRules();
			case SOSPackage.SEMANTICS__SIGNATURE:
				return getSignature();
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
			case SOSPackage.SEMANTICS__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends Rule>)newValue);
				return;
			case SOSPackage.SEMANTICS__SIGNATURE:
				getSignature().clear();
				getSignature().addAll((Collection<? extends ADT>)newValue);
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
			case SOSPackage.SEMANTICS__RULES:
				getRules().clear();
				return;
			case SOSPackage.SEMANTICS__SIGNATURE:
				getSignature().clear();
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
			case SOSPackage.SEMANTICS__RULES:
				return rules != null && !rules.isEmpty();
			case SOSPackage.SEMANTICS__SIGNATURE:
				return signature != null && !signature.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SemanticsImpl
