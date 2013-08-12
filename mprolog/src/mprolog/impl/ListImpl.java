/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mprolog.impl;

import mprolog.List;
import mprolog.MprologPackage;
import mprolog.Term;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mprolog.impl.ListImpl#getOwnedHeadTerms <em>Owned Head Terms</em>}</li>
 *   <li>{@link mprolog.impl.ListImpl#getOwnedTailTerms <em>Owned Tail Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListImpl extends TermImpl implements List {
	/**
	 * The cached value of the '{@link #getOwnedHeadTerms() <em>Owned Head Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedHeadTerms()
	 * @generated
	 * @ordered
	 */
	protected Term ownedHeadTerms;

	/**
	 * The cached value of the '{@link #getOwnedTailTerms() <em>Owned Tail Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTailTerms()
	 * @generated
	 * @ordered
	 */
	protected Term ownedTailTerms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MprologPackage.Literals.LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getOwnedHeadTerms() {
		return ownedHeadTerms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedHeadTerms(Term newOwnedHeadTerms, NotificationChain msgs) {
		Term oldOwnedHeadTerms = ownedHeadTerms;
		ownedHeadTerms = newOwnedHeadTerms;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MprologPackage.LIST__OWNED_HEAD_TERMS, oldOwnedHeadTerms, newOwnedHeadTerms);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedHeadTerms(Term newOwnedHeadTerms) {
		if (newOwnedHeadTerms != ownedHeadTerms) {
			NotificationChain msgs = null;
			if (ownedHeadTerms != null)
				msgs = ((InternalEObject)ownedHeadTerms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MprologPackage.LIST__OWNED_HEAD_TERMS, null, msgs);
			if (newOwnedHeadTerms != null)
				msgs = ((InternalEObject)newOwnedHeadTerms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MprologPackage.LIST__OWNED_HEAD_TERMS, null, msgs);
			msgs = basicSetOwnedHeadTerms(newOwnedHeadTerms, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MprologPackage.LIST__OWNED_HEAD_TERMS, newOwnedHeadTerms, newOwnedHeadTerms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getOwnedTailTerms() {
		return ownedTailTerms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTailTerms(Term newOwnedTailTerms, NotificationChain msgs) {
		Term oldOwnedTailTerms = ownedTailTerms;
		ownedTailTerms = newOwnedTailTerms;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MprologPackage.LIST__OWNED_TAIL_TERMS, oldOwnedTailTerms, newOwnedTailTerms);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedTailTerms(Term newOwnedTailTerms) {
		if (newOwnedTailTerms != ownedTailTerms) {
			NotificationChain msgs = null;
			if (ownedTailTerms != null)
				msgs = ((InternalEObject)ownedTailTerms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MprologPackage.LIST__OWNED_TAIL_TERMS, null, msgs);
			if (newOwnedTailTerms != null)
				msgs = ((InternalEObject)newOwnedTailTerms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MprologPackage.LIST__OWNED_TAIL_TERMS, null, msgs);
			msgs = basicSetOwnedTailTerms(newOwnedTailTerms, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MprologPackage.LIST__OWNED_TAIL_TERMS, newOwnedTailTerms, newOwnedTailTerms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MprologPackage.LIST__OWNED_HEAD_TERMS:
				return basicSetOwnedHeadTerms(null, msgs);
			case MprologPackage.LIST__OWNED_TAIL_TERMS:
				return basicSetOwnedTailTerms(null, msgs);
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
			case MprologPackage.LIST__OWNED_HEAD_TERMS:
				return getOwnedHeadTerms();
			case MprologPackage.LIST__OWNED_TAIL_TERMS:
				return getOwnedTailTerms();
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
			case MprologPackage.LIST__OWNED_HEAD_TERMS:
				setOwnedHeadTerms((Term)newValue);
				return;
			case MprologPackage.LIST__OWNED_TAIL_TERMS:
				setOwnedTailTerms((Term)newValue);
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
			case MprologPackage.LIST__OWNED_HEAD_TERMS:
				setOwnedHeadTerms((Term)null);
				return;
			case MprologPackage.LIST__OWNED_TAIL_TERMS:
				setOwnedTailTerms((Term)null);
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
			case MprologPackage.LIST__OWNED_HEAD_TERMS:
				return ownedHeadTerms != null;
			case MprologPackage.LIST__OWNED_TAIL_TERMS:
				return ownedTailTerms != null;
		}
		return super.eIsSet(featureID);
	}

} //ListImpl
