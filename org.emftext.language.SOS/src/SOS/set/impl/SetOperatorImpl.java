/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.set.impl;

import SOS.adtmm.Term;

import SOS.set.SetOperator;
import SOS.set.SetPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SOS.set.impl.SetOperatorImpl#getLeftHandSide <em>Left Hand Side</em>}</li>
 *   <li>{@link SOS.set.impl.SetOperatorImpl#getRightHandSide <em>Right Hand Side</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SetOperatorImpl extends SetTermImpl implements SetOperator {
	/**
	 * The cached value of the '{@link #getLeftHandSide() <em>Left Hand Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftHandSide()
	 * @generated
	 * @ordered
	 */
	protected Term leftHandSide;

	/**
	 * The cached value of the '{@link #getRightHandSide() <em>Right Hand Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightHandSide()
	 * @generated
	 * @ordered
	 */
	protected Term rightHandSide;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SetPackage.Literals.SET_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getLeftHandSide() {
		return leftHandSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftHandSide(Term newLeftHandSide, NotificationChain msgs) {
		Term oldLeftHandSide = leftHandSide;
		leftHandSide = newLeftHandSide;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.SET_OPERATOR__LEFT_HAND_SIDE, oldLeftHandSide, newLeftHandSide);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftHandSide(Term newLeftHandSide) {
		if (newLeftHandSide != leftHandSide) {
			NotificationChain msgs = null;
			if (leftHandSide != null)
				msgs = ((InternalEObject)leftHandSide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.SET_OPERATOR__LEFT_HAND_SIDE, null, msgs);
			if (newLeftHandSide != null)
				msgs = ((InternalEObject)newLeftHandSide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.SET_OPERATOR__LEFT_HAND_SIDE, null, msgs);
			msgs = basicSetLeftHandSide(newLeftHandSide, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.SET_OPERATOR__LEFT_HAND_SIDE, newLeftHandSide, newLeftHandSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getRightHandSide() {
		return rightHandSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightHandSide(Term newRightHandSide, NotificationChain msgs) {
		Term oldRightHandSide = rightHandSide;
		rightHandSide = newRightHandSide;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.SET_OPERATOR__RIGHT_HAND_SIDE, oldRightHandSide, newRightHandSide);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightHandSide(Term newRightHandSide) {
		if (newRightHandSide != rightHandSide) {
			NotificationChain msgs = null;
			if (rightHandSide != null)
				msgs = ((InternalEObject)rightHandSide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.SET_OPERATOR__RIGHT_HAND_SIDE, null, msgs);
			if (newRightHandSide != null)
				msgs = ((InternalEObject)newRightHandSide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.SET_OPERATOR__RIGHT_HAND_SIDE, null, msgs);
			msgs = basicSetRightHandSide(newRightHandSide, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.SET_OPERATOR__RIGHT_HAND_SIDE, newRightHandSide, newRightHandSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SetPackage.SET_OPERATOR__LEFT_HAND_SIDE:
				return basicSetLeftHandSide(null, msgs);
			case SetPackage.SET_OPERATOR__RIGHT_HAND_SIDE:
				return basicSetRightHandSide(null, msgs);
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
			case SetPackage.SET_OPERATOR__LEFT_HAND_SIDE:
				return getLeftHandSide();
			case SetPackage.SET_OPERATOR__RIGHT_HAND_SIDE:
				return getRightHandSide();
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
			case SetPackage.SET_OPERATOR__LEFT_HAND_SIDE:
				setLeftHandSide((Term)newValue);
				return;
			case SetPackage.SET_OPERATOR__RIGHT_HAND_SIDE:
				setRightHandSide((Term)newValue);
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
			case SetPackage.SET_OPERATOR__LEFT_HAND_SIDE:
				setLeftHandSide((Term)null);
				return;
			case SetPackage.SET_OPERATOR__RIGHT_HAND_SIDE:
				setRightHandSide((Term)null);
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
			case SetPackage.SET_OPERATOR__LEFT_HAND_SIDE:
				return leftHandSide != null;
			case SetPackage.SET_OPERATOR__RIGHT_HAND_SIDE:
				return rightHandSide != null;
		}
		return super.eIsSet(featureID);
	}

} //SetOperatorImpl
