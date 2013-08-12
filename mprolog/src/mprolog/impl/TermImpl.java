/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mprolog.impl;

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
 * An implementation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mprolog.impl.TermImpl#getNextTerm <em>Next Term</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TermImpl extends EObjectImpl implements Term {
	/**
	 * The cached value of the '{@link #getNextTerm() <em>Next Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextTerm()
	 * @generated
	 * @ordered
	 */
	protected Term nextTerm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MprologPackage.Literals.TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getNextTerm() {
		return nextTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextTerm(Term newNextTerm, NotificationChain msgs) {
		Term oldNextTerm = nextTerm;
		nextTerm = newNextTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MprologPackage.TERM__NEXT_TERM, oldNextTerm, newNextTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextTerm(Term newNextTerm) {
		if (newNextTerm != nextTerm) {
			NotificationChain msgs = null;
			if (nextTerm != null)
				msgs = ((InternalEObject)nextTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MprologPackage.TERM__NEXT_TERM, null, msgs);
			if (newNextTerm != null)
				msgs = ((InternalEObject)newNextTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MprologPackage.TERM__NEXT_TERM, null, msgs);
			msgs = basicSetNextTerm(newNextTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MprologPackage.TERM__NEXT_TERM, newNextTerm, newNextTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MprologPackage.TERM__NEXT_TERM:
				return basicSetNextTerm(null, msgs);
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
			case MprologPackage.TERM__NEXT_TERM:
				return getNextTerm();
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
			case MprologPackage.TERM__NEXT_TERM:
				setNextTerm((Term)newValue);
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
			case MprologPackage.TERM__NEXT_TERM:
				setNextTerm((Term)null);
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
			case MprologPackage.TERM__NEXT_TERM:
				return nextTerm != null;
		}
		return super.eIsSet(featureID);
	}

} //TermImpl
