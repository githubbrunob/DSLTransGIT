/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mprolog.impl;

import mprolog.Body;
import mprolog.Clause;
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
 * An implementation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mprolog.impl.ClauseImpl#getOwnedHead <em>Owned Head</em>}</li>
 *   <li>{@link mprolog.impl.ClauseImpl#getOwnedBody <em>Owned Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClauseImpl extends EObjectImpl implements Clause {
	/**
	 * The cached value of the '{@link #getOwnedHead() <em>Owned Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedHead()
	 * @generated
	 * @ordered
	 */
	protected Head ownedHead;

	/**
	 * The cached value of the '{@link #getOwnedBody() <em>Owned Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBody()
	 * @generated
	 * @ordered
	 */
	protected Body ownedBody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MprologPackage.Literals.CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Head getOwnedHead() {
		return ownedHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedHead(Head newOwnedHead, NotificationChain msgs) {
		Head oldOwnedHead = ownedHead;
		ownedHead = newOwnedHead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MprologPackage.CLAUSE__OWNED_HEAD, oldOwnedHead, newOwnedHead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedHead(Head newOwnedHead) {
		if (newOwnedHead != ownedHead) {
			NotificationChain msgs = null;
			if (ownedHead != null)
				msgs = ((InternalEObject)ownedHead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MprologPackage.CLAUSE__OWNED_HEAD, null, msgs);
			if (newOwnedHead != null)
				msgs = ((InternalEObject)newOwnedHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MprologPackage.CLAUSE__OWNED_HEAD, null, msgs);
			msgs = basicSetOwnedHead(newOwnedHead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MprologPackage.CLAUSE__OWNED_HEAD, newOwnedHead, newOwnedHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Body getOwnedBody() {
		return ownedBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedBody(Body newOwnedBody, NotificationChain msgs) {
		Body oldOwnedBody = ownedBody;
		ownedBody = newOwnedBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MprologPackage.CLAUSE__OWNED_BODY, oldOwnedBody, newOwnedBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedBody(Body newOwnedBody) {
		if (newOwnedBody != ownedBody) {
			NotificationChain msgs = null;
			if (ownedBody != null)
				msgs = ((InternalEObject)ownedBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MprologPackage.CLAUSE__OWNED_BODY, null, msgs);
			if (newOwnedBody != null)
				msgs = ((InternalEObject)newOwnedBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MprologPackage.CLAUSE__OWNED_BODY, null, msgs);
			msgs = basicSetOwnedBody(newOwnedBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MprologPackage.CLAUSE__OWNED_BODY, newOwnedBody, newOwnedBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MprologPackage.CLAUSE__OWNED_HEAD:
				return basicSetOwnedHead(null, msgs);
			case MprologPackage.CLAUSE__OWNED_BODY:
				return basicSetOwnedBody(null, msgs);
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
			case MprologPackage.CLAUSE__OWNED_HEAD:
				return getOwnedHead();
			case MprologPackage.CLAUSE__OWNED_BODY:
				return getOwnedBody();
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
			case MprologPackage.CLAUSE__OWNED_HEAD:
				setOwnedHead((Head)newValue);
				return;
			case MprologPackage.CLAUSE__OWNED_BODY:
				setOwnedBody((Body)newValue);
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
			case MprologPackage.CLAUSE__OWNED_HEAD:
				setOwnedHead((Head)null);
				return;
			case MprologPackage.CLAUSE__OWNED_BODY:
				setOwnedBody((Body)null);
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
			case MprologPackage.CLAUSE__OWNED_HEAD:
				return ownedHead != null;
			case MprologPackage.CLAUSE__OWNED_BODY:
				return ownedBody != null;
		}
		return super.eIsSet(featureID);
	}

} //ClauseImpl
