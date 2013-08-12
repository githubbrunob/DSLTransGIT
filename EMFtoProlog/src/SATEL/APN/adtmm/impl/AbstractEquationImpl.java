/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractEquationImpl.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.APN.adtmm.impl;

import SATEL.APN.adtmm.AbstractEquation;
import SATEL.APN.adtmm.AdtmmPackage;
import SATEL.APN.adtmm.Term;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Equation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.APN.adtmm.impl.AbstractEquationImpl#getOwnedRightTerm <em>Owned Right Term</em>}</li>
 *   <li>{@link SATEL.APN.adtmm.impl.AbstractEquationImpl#getOwnedLeftTerm <em>Owned Left Term</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractEquationImpl extends EObjectImpl implements AbstractEquation {
	/**
	 * The cached value of the '{@link #getOwnedRightTerm() <em>Owned Right Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRightTerm()
	 * @generated
	 * @ordered
	 */
	protected Term ownedRightTerm;

	/**
	 * The cached value of the '{@link #getOwnedLeftTerm() <em>Owned Left Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLeftTerm()
	 * @generated
	 * @ordered
	 */
	protected Term ownedLeftTerm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractEquationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdtmmPackage.Literals.ABSTRACT_EQUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getOwnedRightTerm() {
		return ownedRightTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedRightTerm(Term newOwnedRightTerm, NotificationChain msgs) {
		Term oldOwnedRightTerm = ownedRightTerm;
		ownedRightTerm = newOwnedRightTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdtmmPackage.ABSTRACT_EQUATION__OWNED_RIGHT_TERM, oldOwnedRightTerm, newOwnedRightTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedRightTerm(Term newOwnedRightTerm) {
		if (newOwnedRightTerm != ownedRightTerm) {
			NotificationChain msgs = null;
			if (ownedRightTerm != null)
				msgs = ((InternalEObject)ownedRightTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdtmmPackage.ABSTRACT_EQUATION__OWNED_RIGHT_TERM, null, msgs);
			if (newOwnedRightTerm != null)
				msgs = ((InternalEObject)newOwnedRightTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdtmmPackage.ABSTRACT_EQUATION__OWNED_RIGHT_TERM, null, msgs);
			msgs = basicSetOwnedRightTerm(newOwnedRightTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdtmmPackage.ABSTRACT_EQUATION__OWNED_RIGHT_TERM, newOwnedRightTerm, newOwnedRightTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getOwnedLeftTerm() {
		return ownedLeftTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedLeftTerm(Term newOwnedLeftTerm, NotificationChain msgs) {
		Term oldOwnedLeftTerm = ownedLeftTerm;
		ownedLeftTerm = newOwnedLeftTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdtmmPackage.ABSTRACT_EQUATION__OWNED_LEFT_TERM, oldOwnedLeftTerm, newOwnedLeftTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedLeftTerm(Term newOwnedLeftTerm) {
		if (newOwnedLeftTerm != ownedLeftTerm) {
			NotificationChain msgs = null;
			if (ownedLeftTerm != null)
				msgs = ((InternalEObject)ownedLeftTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdtmmPackage.ABSTRACT_EQUATION__OWNED_LEFT_TERM, null, msgs);
			if (newOwnedLeftTerm != null)
				msgs = ((InternalEObject)newOwnedLeftTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdtmmPackage.ABSTRACT_EQUATION__OWNED_LEFT_TERM, null, msgs);
			msgs = basicSetOwnedLeftTerm(newOwnedLeftTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdtmmPackage.ABSTRACT_EQUATION__OWNED_LEFT_TERM, newOwnedLeftTerm, newOwnedLeftTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdtmmPackage.ABSTRACT_EQUATION__OWNED_RIGHT_TERM:
				return basicSetOwnedRightTerm(null, msgs);
			case AdtmmPackage.ABSTRACT_EQUATION__OWNED_LEFT_TERM:
				return basicSetOwnedLeftTerm(null, msgs);
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
			case AdtmmPackage.ABSTRACT_EQUATION__OWNED_RIGHT_TERM:
				return getOwnedRightTerm();
			case AdtmmPackage.ABSTRACT_EQUATION__OWNED_LEFT_TERM:
				return getOwnedLeftTerm();
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
			case AdtmmPackage.ABSTRACT_EQUATION__OWNED_RIGHT_TERM:
				setOwnedRightTerm((Term)newValue);
				return;
			case AdtmmPackage.ABSTRACT_EQUATION__OWNED_LEFT_TERM:
				setOwnedLeftTerm((Term)newValue);
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
			case AdtmmPackage.ABSTRACT_EQUATION__OWNED_RIGHT_TERM:
				setOwnedRightTerm((Term)null);
				return;
			case AdtmmPackage.ABSTRACT_EQUATION__OWNED_LEFT_TERM:
				setOwnedLeftTerm((Term)null);
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
			case AdtmmPackage.ABSTRACT_EQUATION__OWNED_RIGHT_TERM:
				return ownedRightTerm != null;
			case AdtmmPackage.ABSTRACT_EQUATION__OWNED_LEFT_TERM:
				return ownedLeftTerm != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractEquationImpl
