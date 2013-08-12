/**
 * <copyright>
 * </copyright>
 *
 * $Id: NBEventsImpl.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.AlgebraicExpressions.arithmeticterms.impl;

import SATEL.AlgebraicExpressions.arithmeticterms.ArithmetictermsPackage;
import SATEL.AlgebraicExpressions.arithmeticterms.NBEvents;

import SATEL.HMLFormula.HMLTerm;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NB Events</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.AlgebraicExpressions.arithmeticterms.impl.NBEventsImpl#getHmlTerm <em>Hml Term</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NBEventsImpl extends ArithmeticTermImpl implements NBEvents {
	/**
	 * The cached value of the '{@link #getHmlTerm() <em>Hml Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHmlTerm()
	 * @generated
	 * @ordered
	 */
	protected HMLTerm hmlTerm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NBEventsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArithmetictermsPackage.Literals.NB_EVENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMLTerm getHmlTerm() {
		return hmlTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHmlTerm(HMLTerm newHmlTerm, NotificationChain msgs) {
		HMLTerm oldHmlTerm = hmlTerm;
		hmlTerm = newHmlTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArithmetictermsPackage.NB_EVENTS__HML_TERM, oldHmlTerm, newHmlTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHmlTerm(HMLTerm newHmlTerm) {
		if (newHmlTerm != hmlTerm) {
			NotificationChain msgs = null;
			if (hmlTerm != null)
				msgs = ((InternalEObject)hmlTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArithmetictermsPackage.NB_EVENTS__HML_TERM, null, msgs);
			if (newHmlTerm != null)
				msgs = ((InternalEObject)newHmlTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArithmetictermsPackage.NB_EVENTS__HML_TERM, null, msgs);
			msgs = basicSetHmlTerm(newHmlTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArithmetictermsPackage.NB_EVENTS__HML_TERM, newHmlTerm, newHmlTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArithmetictermsPackage.NB_EVENTS__HML_TERM:
				return basicSetHmlTerm(null, msgs);
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
			case ArithmetictermsPackage.NB_EVENTS__HML_TERM:
				return getHmlTerm();
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
			case ArithmetictermsPackage.NB_EVENTS__HML_TERM:
				setHmlTerm((HMLTerm)newValue);
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
			case ArithmetictermsPackage.NB_EVENTS__HML_TERM:
				setHmlTerm((HMLTerm)null);
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
			case ArithmetictermsPackage.NB_EVENTS__HML_TERM:
				return hmlTerm != null;
		}
		return super.eIsSet(featureID);
	}

} //NBEventsImpl
