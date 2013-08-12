/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.impl;

import SOS.AlgebraicCondition;
import SOS.AlgebraicConditionList;
import SOS.SOSPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Algebraic Condition List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SOS.impl.AlgebraicConditionListImpl#getHas <em>Has</em>}</li>
 *   <li>{@link SOS.impl.AlgebraicConditionListImpl#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlgebraicConditionListImpl extends EObjectImpl implements AlgebraicConditionList {
	/**
	 * The cached value of the '{@link #getHas() <em>Has</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas()
	 * @generated
	 * @ordered
	 */
	protected AlgebraicCondition has;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected AlgebraicConditionList next;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlgebraicConditionListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SOSPackage.Literals.ALGEBRAIC_CONDITION_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgebraicCondition getHas() {
		return has;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHas(AlgebraicCondition newHas, NotificationChain msgs) {
		AlgebraicCondition oldHas = has;
		has = newHas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SOSPackage.ALGEBRAIC_CONDITION_LIST__HAS, oldHas, newHas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHas(AlgebraicCondition newHas) {
		if (newHas != has) {
			NotificationChain msgs = null;
			if (has != null)
				msgs = ((InternalEObject)has).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SOSPackage.ALGEBRAIC_CONDITION_LIST__HAS, null, msgs);
			if (newHas != null)
				msgs = ((InternalEObject)newHas).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SOSPackage.ALGEBRAIC_CONDITION_LIST__HAS, null, msgs);
			msgs = basicSetHas(newHas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SOSPackage.ALGEBRAIC_CONDITION_LIST__HAS, newHas, newHas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgebraicConditionList getNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(AlgebraicConditionList newNext, NotificationChain msgs) {
		AlgebraicConditionList oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SOSPackage.ALGEBRAIC_CONDITION_LIST__NEXT, oldNext, newNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(AlgebraicConditionList newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SOSPackage.ALGEBRAIC_CONDITION_LIST__NEXT, null, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SOSPackage.ALGEBRAIC_CONDITION_LIST__NEXT, null, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SOSPackage.ALGEBRAIC_CONDITION_LIST__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SOSPackage.ALGEBRAIC_CONDITION_LIST__HAS:
				return basicSetHas(null, msgs);
			case SOSPackage.ALGEBRAIC_CONDITION_LIST__NEXT:
				return basicSetNext(null, msgs);
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
			case SOSPackage.ALGEBRAIC_CONDITION_LIST__HAS:
				return getHas();
			case SOSPackage.ALGEBRAIC_CONDITION_LIST__NEXT:
				return getNext();
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
			case SOSPackage.ALGEBRAIC_CONDITION_LIST__HAS:
				setHas((AlgebraicCondition)newValue);
				return;
			case SOSPackage.ALGEBRAIC_CONDITION_LIST__NEXT:
				setNext((AlgebraicConditionList)newValue);
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
			case SOSPackage.ALGEBRAIC_CONDITION_LIST__HAS:
				setHas((AlgebraicCondition)null);
				return;
			case SOSPackage.ALGEBRAIC_CONDITION_LIST__NEXT:
				setNext((AlgebraicConditionList)null);
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
			case SOSPackage.ALGEBRAIC_CONDITION_LIST__HAS:
				return has != null;
			case SOSPackage.ALGEBRAIC_CONDITION_LIST__NEXT:
				return next != null;
		}
		return super.eIsSet(featureID);
	}

} //AlgebraicConditionListImpl
