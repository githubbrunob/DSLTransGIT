/**
 * <copyright>
 * </copyright>
 *
 * $Id: TermReferenceImpl.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.APN.multisetmm.impl;

import SATEL.APN.adtmm.Term;

import SATEL.APN.multisetmm.MultisetmmPackage;
import SATEL.APN.multisetmm.TermReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.APN.multisetmm.impl.TermReferenceImpl#getTermReferenced <em>Term Referenced</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TermReferenceImpl extends MSElementImpl implements TermReference {
	/**
	 * The cached value of the '{@link #getTermReferenced() <em>Term Referenced</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermReferenced()
	 * @generated
	 * @ordered
	 */
	protected Term termReferenced;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultisetmmPackage.Literals.TERM_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getTermReferenced() {
		return termReferenced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTermReferenced(Term newTermReferenced, NotificationChain msgs) {
		Term oldTermReferenced = termReferenced;
		termReferenced = newTermReferenced;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MultisetmmPackage.TERM_REFERENCE__TERM_REFERENCED, oldTermReferenced, newTermReferenced);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTermReferenced(Term newTermReferenced) {
		if (newTermReferenced != termReferenced) {
			NotificationChain msgs = null;
			if (termReferenced != null)
				msgs = ((InternalEObject)termReferenced).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MultisetmmPackage.TERM_REFERENCE__TERM_REFERENCED, null, msgs);
			if (newTermReferenced != null)
				msgs = ((InternalEObject)newTermReferenced).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MultisetmmPackage.TERM_REFERENCE__TERM_REFERENCED, null, msgs);
			msgs = basicSetTermReferenced(newTermReferenced, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultisetmmPackage.TERM_REFERENCE__TERM_REFERENCED, newTermReferenced, newTermReferenced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MultisetmmPackage.TERM_REFERENCE__TERM_REFERENCED:
				return basicSetTermReferenced(null, msgs);
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
			case MultisetmmPackage.TERM_REFERENCE__TERM_REFERENCED:
				return getTermReferenced();
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
			case MultisetmmPackage.TERM_REFERENCE__TERM_REFERENCED:
				setTermReferenced((Term)newValue);
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
			case MultisetmmPackage.TERM_REFERENCE__TERM_REFERENCED:
				setTermReferenced((Term)null);
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
			case MultisetmmPackage.TERM_REFERENCE__TERM_REFERENCED:
				return termReferenced != null;
		}
		return super.eIsSet(featureID);
	}

} //TermReferenceImpl
