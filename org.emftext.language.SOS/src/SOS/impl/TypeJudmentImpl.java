/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.impl;

import SOS.SOSPackage;
import SOS.TypeJudment;

import SOS.adtmm.Term;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Judment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SOS.impl.TypeJudmentImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link SOS.impl.TypeJudmentImpl#getLeftHandSide <em>Left Hand Side</em>}</li>
 *   <li>{@link SOS.impl.TypeJudmentImpl#getRightHandSide <em>Right Hand Side</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeJudmentImpl extends ConditionImpl implements TypeJudment {
	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected Term environment;

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
	protected TypeJudmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SOSPackage.Literals.TYPE_JUDMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironment(Term newEnvironment, NotificationChain msgs) {
		Term oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SOSPackage.TYPE_JUDMENT__ENVIRONMENT, oldEnvironment, newEnvironment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(Term newEnvironment) {
		if (newEnvironment != environment) {
			NotificationChain msgs = null;
			if (environment != null)
				msgs = ((InternalEObject)environment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SOSPackage.TYPE_JUDMENT__ENVIRONMENT, null, msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject)newEnvironment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SOSPackage.TYPE_JUDMENT__ENVIRONMENT, null, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SOSPackage.TYPE_JUDMENT__ENVIRONMENT, newEnvironment, newEnvironment));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SOSPackage.TYPE_JUDMENT__LEFT_HAND_SIDE, oldLeftHandSide, newLeftHandSide);
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
				msgs = ((InternalEObject)leftHandSide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SOSPackage.TYPE_JUDMENT__LEFT_HAND_SIDE, null, msgs);
			if (newLeftHandSide != null)
				msgs = ((InternalEObject)newLeftHandSide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SOSPackage.TYPE_JUDMENT__LEFT_HAND_SIDE, null, msgs);
			msgs = basicSetLeftHandSide(newLeftHandSide, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SOSPackage.TYPE_JUDMENT__LEFT_HAND_SIDE, newLeftHandSide, newLeftHandSide));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SOSPackage.TYPE_JUDMENT__RIGHT_HAND_SIDE, oldRightHandSide, newRightHandSide);
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
				msgs = ((InternalEObject)rightHandSide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SOSPackage.TYPE_JUDMENT__RIGHT_HAND_SIDE, null, msgs);
			if (newRightHandSide != null)
				msgs = ((InternalEObject)newRightHandSide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SOSPackage.TYPE_JUDMENT__RIGHT_HAND_SIDE, null, msgs);
			msgs = basicSetRightHandSide(newRightHandSide, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SOSPackage.TYPE_JUDMENT__RIGHT_HAND_SIDE, newRightHandSide, newRightHandSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SOSPackage.TYPE_JUDMENT__ENVIRONMENT:
				return basicSetEnvironment(null, msgs);
			case SOSPackage.TYPE_JUDMENT__LEFT_HAND_SIDE:
				return basicSetLeftHandSide(null, msgs);
			case SOSPackage.TYPE_JUDMENT__RIGHT_HAND_SIDE:
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
			case SOSPackage.TYPE_JUDMENT__ENVIRONMENT:
				return getEnvironment();
			case SOSPackage.TYPE_JUDMENT__LEFT_HAND_SIDE:
				return getLeftHandSide();
			case SOSPackage.TYPE_JUDMENT__RIGHT_HAND_SIDE:
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
			case SOSPackage.TYPE_JUDMENT__ENVIRONMENT:
				setEnvironment((Term)newValue);
				return;
			case SOSPackage.TYPE_JUDMENT__LEFT_HAND_SIDE:
				setLeftHandSide((Term)newValue);
				return;
			case SOSPackage.TYPE_JUDMENT__RIGHT_HAND_SIDE:
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
			case SOSPackage.TYPE_JUDMENT__ENVIRONMENT:
				setEnvironment((Term)null);
				return;
			case SOSPackage.TYPE_JUDMENT__LEFT_HAND_SIDE:
				setLeftHandSide((Term)null);
				return;
			case SOSPackage.TYPE_JUDMENT__RIGHT_HAND_SIDE:
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
			case SOSPackage.TYPE_JUDMENT__ENVIRONMENT:
				return environment != null;
			case SOSPackage.TYPE_JUDMENT__LEFT_HAND_SIDE:
				return leftHandSide != null;
			case SOSPackage.TYPE_JUDMENT__RIGHT_HAND_SIDE:
				return rightHandSide != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeJudmentImpl
