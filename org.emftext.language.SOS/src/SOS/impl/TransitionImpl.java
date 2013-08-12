/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.impl;

import SOS.SOSPackage;
import SOS.Transition;

import SOS.adtmm.Term;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SOS.impl.TransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link SOS.impl.TransitionImpl#getPreState <em>Pre State</em>}</li>
 *   <li>{@link SOS.impl.TransitionImpl#getPosState <em>Pos State</em>}</li>
 *   <li>{@link SOS.impl.TransitionImpl#getEnvironment <em>Environment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends ConditionImpl implements Transition {
	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected Term label;

	/**
	 * The cached value of the '{@link #getPreState() <em>Pre State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreState()
	 * @generated
	 * @ordered
	 */
	protected Term preState;

	/**
	 * The cached value of the '{@link #getPosState() <em>Pos State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosState()
	 * @generated
	 * @ordered
	 */
	protected Term posState;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SOSPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(Term newLabel, NotificationChain msgs) {
		Term oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SOSPackage.TRANSITION__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(Term newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SOSPackage.TRANSITION__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SOSPackage.TRANSITION__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SOSPackage.TRANSITION__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getPreState() {
		return preState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreState(Term newPreState, NotificationChain msgs) {
		Term oldPreState = preState;
		preState = newPreState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SOSPackage.TRANSITION__PRE_STATE, oldPreState, newPreState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreState(Term newPreState) {
		if (newPreState != preState) {
			NotificationChain msgs = null;
			if (preState != null)
				msgs = ((InternalEObject)preState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SOSPackage.TRANSITION__PRE_STATE, null, msgs);
			if (newPreState != null)
				msgs = ((InternalEObject)newPreState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SOSPackage.TRANSITION__PRE_STATE, null, msgs);
			msgs = basicSetPreState(newPreState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SOSPackage.TRANSITION__PRE_STATE, newPreState, newPreState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getPosState() {
		return posState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosState(Term newPosState, NotificationChain msgs) {
		Term oldPosState = posState;
		posState = newPosState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SOSPackage.TRANSITION__POS_STATE, oldPosState, newPosState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosState(Term newPosState) {
		if (newPosState != posState) {
			NotificationChain msgs = null;
			if (posState != null)
				msgs = ((InternalEObject)posState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SOSPackage.TRANSITION__POS_STATE, null, msgs);
			if (newPosState != null)
				msgs = ((InternalEObject)newPosState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SOSPackage.TRANSITION__POS_STATE, null, msgs);
			msgs = basicSetPosState(newPosState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SOSPackage.TRANSITION__POS_STATE, newPosState, newPosState));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SOSPackage.TRANSITION__ENVIRONMENT, oldEnvironment, newEnvironment);
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
				msgs = ((InternalEObject)environment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SOSPackage.TRANSITION__ENVIRONMENT, null, msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject)newEnvironment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SOSPackage.TRANSITION__ENVIRONMENT, null, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SOSPackage.TRANSITION__ENVIRONMENT, newEnvironment, newEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SOSPackage.TRANSITION__LABEL:
				return basicSetLabel(null, msgs);
			case SOSPackage.TRANSITION__PRE_STATE:
				return basicSetPreState(null, msgs);
			case SOSPackage.TRANSITION__POS_STATE:
				return basicSetPosState(null, msgs);
			case SOSPackage.TRANSITION__ENVIRONMENT:
				return basicSetEnvironment(null, msgs);
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
			case SOSPackage.TRANSITION__LABEL:
				return getLabel();
			case SOSPackage.TRANSITION__PRE_STATE:
				return getPreState();
			case SOSPackage.TRANSITION__POS_STATE:
				return getPosState();
			case SOSPackage.TRANSITION__ENVIRONMENT:
				return getEnvironment();
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
			case SOSPackage.TRANSITION__LABEL:
				setLabel((Term)newValue);
				return;
			case SOSPackage.TRANSITION__PRE_STATE:
				setPreState((Term)newValue);
				return;
			case SOSPackage.TRANSITION__POS_STATE:
				setPosState((Term)newValue);
				return;
			case SOSPackage.TRANSITION__ENVIRONMENT:
				setEnvironment((Term)newValue);
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
			case SOSPackage.TRANSITION__LABEL:
				setLabel((Term)null);
				return;
			case SOSPackage.TRANSITION__PRE_STATE:
				setPreState((Term)null);
				return;
			case SOSPackage.TRANSITION__POS_STATE:
				setPosState((Term)null);
				return;
			case SOSPackage.TRANSITION__ENVIRONMENT:
				setEnvironment((Term)null);
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
			case SOSPackage.TRANSITION__LABEL:
				return label != null;
			case SOSPackage.TRANSITION__PRE_STATE:
				return preState != null;
			case SOSPackage.TRANSITION__POS_STATE:
				return posState != null;
			case SOSPackage.TRANSITION__ENVIRONMENT:
				return environment != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
