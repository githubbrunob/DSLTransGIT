/**
 * <copyright>
 * </copyright>
 *
 * $Id: BodyImpl.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package mprolog.impl;

import mprolog.Body;
import mprolog.MprologPackage;
import mprolog.Term;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mprolog.impl.BodyImpl#getOwnedTerm <em>Owned Term</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BodyImpl extends EObjectImpl implements Body {
	/**
	 * The cached value of the '{@link #getOwnedTerm() <em>Owned Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTerm()
	 * @generated
	 * @ordered
	 */
	protected Term ownedTerm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MprologPackage.Literals.BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getOwnedTerm() {
		return ownedTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTerm(Term newOwnedTerm, NotificationChain msgs) {
		Term oldOwnedTerm = ownedTerm;
		ownedTerm = newOwnedTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MprologPackage.BODY__OWNED_TERM, oldOwnedTerm, newOwnedTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedTerm(Term newOwnedTerm) {
		if (newOwnedTerm != ownedTerm) {
			NotificationChain msgs = null;
			if (ownedTerm != null)
				msgs = ((InternalEObject)ownedTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MprologPackage.BODY__OWNED_TERM, null, msgs);
			if (newOwnedTerm != null)
				msgs = ((InternalEObject)newOwnedTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MprologPackage.BODY__OWNED_TERM, null, msgs);
			msgs = basicSetOwnedTerm(newOwnedTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MprologPackage.BODY__OWNED_TERM, newOwnedTerm, newOwnedTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MprologPackage.BODY__OWNED_TERM:
				return basicSetOwnedTerm(null, msgs);
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
			case MprologPackage.BODY__OWNED_TERM:
				return getOwnedTerm();
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
			case MprologPackage.BODY__OWNED_TERM:
				setOwnedTerm((Term)newValue);
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
			case MprologPackage.BODY__OWNED_TERM:
				setOwnedTerm((Term)null);
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
			case MprologPackage.BODY__OWNED_TERM:
				return ownedTerm != null;
		}
		return super.eIsSet(featureID);
	}

} //BodyImpl
