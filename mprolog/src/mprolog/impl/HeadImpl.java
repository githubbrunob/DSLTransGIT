/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mprolog.impl;

import mprolog.Functor;
import mprolog.Head;
import mprolog.MprologPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Head</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mprolog.impl.HeadImpl#getOwnedFunctor <em>Owned Functor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeadImpl extends EObjectImpl implements Head {
	/**
	 * The cached value of the '{@link #getOwnedFunctor() <em>Owned Functor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFunctor()
	 * @generated
	 * @ordered
	 */
	protected Functor ownedFunctor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MprologPackage.Literals.HEAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functor getOwnedFunctor() {
		return ownedFunctor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedFunctor(Functor newOwnedFunctor, NotificationChain msgs) {
		Functor oldOwnedFunctor = ownedFunctor;
		ownedFunctor = newOwnedFunctor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MprologPackage.HEAD__OWNED_FUNCTOR, oldOwnedFunctor, newOwnedFunctor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedFunctor(Functor newOwnedFunctor) {
		if (newOwnedFunctor != ownedFunctor) {
			NotificationChain msgs = null;
			if (ownedFunctor != null)
				msgs = ((InternalEObject)ownedFunctor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MprologPackage.HEAD__OWNED_FUNCTOR, null, msgs);
			if (newOwnedFunctor != null)
				msgs = ((InternalEObject)newOwnedFunctor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MprologPackage.HEAD__OWNED_FUNCTOR, null, msgs);
			msgs = basicSetOwnedFunctor(newOwnedFunctor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MprologPackage.HEAD__OWNED_FUNCTOR, newOwnedFunctor, newOwnedFunctor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MprologPackage.HEAD__OWNED_FUNCTOR:
				return basicSetOwnedFunctor(null, msgs);
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
			case MprologPackage.HEAD__OWNED_FUNCTOR:
				return getOwnedFunctor();
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
			case MprologPackage.HEAD__OWNED_FUNCTOR:
				setOwnedFunctor((Functor)newValue);
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
			case MprologPackage.HEAD__OWNED_FUNCTOR:
				setOwnedFunctor((Functor)null);
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
			case MprologPackage.HEAD__OWNED_FUNCTOR:
				return ownedFunctor != null;
		}
		return super.eIsSet(featureID);
	}

} //HeadImpl
