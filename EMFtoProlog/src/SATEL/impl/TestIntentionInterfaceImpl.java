/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestIntentionInterfaceImpl.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.impl;

import SATEL.IntentionDec;
import SATEL.SATELPackage;
import SATEL.TestIntentionInterface;

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
 * An implementation of the model object '<em><b>Test Intention Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.impl.TestIntentionInterfaceImpl#getIntention <em>Intention</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestIntentionInterfaceImpl extends EObjectImpl implements TestIntentionInterface {
	/**
	 * The cached value of the '{@link #getIntention() <em>Intention</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntention()
	 * @generated
	 * @ordered
	 */
	protected EList<IntentionDec> intention;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestIntentionInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SATELPackage.Literals.TEST_INTENTION_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntentionDec> getIntention() {
		if (intention == null) {
			intention = new EObjectContainmentEList<IntentionDec>(IntentionDec.class, this, SATELPackage.TEST_INTENTION_INTERFACE__INTENTION);
		}
		return intention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SATELPackage.TEST_INTENTION_INTERFACE__INTENTION:
				return ((InternalEList<?>)getIntention()).basicRemove(otherEnd, msgs);
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
			case SATELPackage.TEST_INTENTION_INTERFACE__INTENTION:
				return getIntention();
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
			case SATELPackage.TEST_INTENTION_INTERFACE__INTENTION:
				getIntention().clear();
				getIntention().addAll((Collection<? extends IntentionDec>)newValue);
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
			case SATELPackage.TEST_INTENTION_INTERFACE__INTENTION:
				getIntention().clear();
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
			case SATELPackage.TEST_INTENTION_INTERFACE__INTENTION:
				return intention != null && !intention.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TestIntentionInterfaceImpl
