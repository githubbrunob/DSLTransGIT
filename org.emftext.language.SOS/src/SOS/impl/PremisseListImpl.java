/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.impl;

import SOS.Condition;
import SOS.PremisseList;
import SOS.SOSPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Premisse List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SOS.impl.PremisseListImpl#getHas <em>Has</em>}</li>
 *   <li>{@link SOS.impl.PremisseListImpl#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PremisseListImpl extends EObjectImpl implements PremisseList {
	/**
	 * The cached value of the '{@link #getHas() <em>Has</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas()
	 * @generated
	 * @ordered
	 */
	protected Condition has;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected PremisseList next;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PremisseListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SOSPackage.Literals.PREMISSE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getHas() {
		return has;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHas(Condition newHas, NotificationChain msgs) {
		Condition oldHas = has;
		has = newHas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SOSPackage.PREMISSE_LIST__HAS, oldHas, newHas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHas(Condition newHas) {
		if (newHas != has) {
			NotificationChain msgs = null;
			if (has != null)
				msgs = ((InternalEObject)has).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SOSPackage.PREMISSE_LIST__HAS, null, msgs);
			if (newHas != null)
				msgs = ((InternalEObject)newHas).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SOSPackage.PREMISSE_LIST__HAS, null, msgs);
			msgs = basicSetHas(newHas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SOSPackage.PREMISSE_LIST__HAS, newHas, newHas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PremisseList getNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(PremisseList newNext, NotificationChain msgs) {
		PremisseList oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SOSPackage.PREMISSE_LIST__NEXT, oldNext, newNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(PremisseList newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SOSPackage.PREMISSE_LIST__NEXT, null, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SOSPackage.PREMISSE_LIST__NEXT, null, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SOSPackage.PREMISSE_LIST__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SOSPackage.PREMISSE_LIST__HAS:
				return basicSetHas(null, msgs);
			case SOSPackage.PREMISSE_LIST__NEXT:
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
			case SOSPackage.PREMISSE_LIST__HAS:
				return getHas();
			case SOSPackage.PREMISSE_LIST__NEXT:
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
			case SOSPackage.PREMISSE_LIST__HAS:
				setHas((Condition)newValue);
				return;
			case SOSPackage.PREMISSE_LIST__NEXT:
				setNext((PremisseList)newValue);
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
			case SOSPackage.PREMISSE_LIST__HAS:
				setHas((Condition)null);
				return;
			case SOSPackage.PREMISSE_LIST__NEXT:
				setNext((PremisseList)null);
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
			case SOSPackage.PREMISSE_LIST__HAS:
				return has != null;
			case SOSPackage.PREMISSE_LIST__NEXT:
				return next != null;
		}
		return super.eIsSet(featureID);
	}

} //PremisseListImpl
