/**
 * <copyright>
 * </copyright>
 *
 * $Id: TransitionImpl.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.APN.apnmm.impl;

import SATEL.APN.apnmm.ApnmmPackage;
import SATEL.APN.apnmm.GateCall;
import SATEL.APN.apnmm.MethodCall;
import SATEL.APN.apnmm.Transition;

import SATEL.APN.guardmm.Guard;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.APN.apnmm.impl.TransitionImpl#getOwnedGuard <em>Owned Guard</em>}</li>
 *   <li>{@link SATEL.APN.apnmm.impl.TransitionImpl#getGateCalls <em>Gate Calls</em>}</li>
 *   <li>{@link SATEL.APN.apnmm.impl.TransitionImpl#getMethodCall <em>Method Call</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends NodeImpl implements Transition {
	/**
	 * The cached value of the '{@link #getOwnedGuard() <em>Owned Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedGuard()
	 * @generated
	 * @ordered
	 */
	protected Guard ownedGuard;

	/**
	 * The cached value of the '{@link #getGateCalls() <em>Gate Calls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateCalls()
	 * @generated
	 * @ordered
	 */
	protected EList<GateCall> gateCalls;

	/**
	 * The cached value of the '{@link #getMethodCall() <em>Method Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodCall()
	 * @generated
	 * @ordered
	 */
	protected MethodCall methodCall;

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
		return ApnmmPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guard getOwnedGuard() {
		return ownedGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedGuard(Guard newOwnedGuard, NotificationChain msgs) {
		Guard oldOwnedGuard = ownedGuard;
		ownedGuard = newOwnedGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApnmmPackage.TRANSITION__OWNED_GUARD, oldOwnedGuard, newOwnedGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedGuard(Guard newOwnedGuard) {
		if (newOwnedGuard != ownedGuard) {
			NotificationChain msgs = null;
			if (ownedGuard != null)
				msgs = ((InternalEObject)ownedGuard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApnmmPackage.TRANSITION__OWNED_GUARD, null, msgs);
			if (newOwnedGuard != null)
				msgs = ((InternalEObject)newOwnedGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApnmmPackage.TRANSITION__OWNED_GUARD, null, msgs);
			msgs = basicSetOwnedGuard(newOwnedGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApnmmPackage.TRANSITION__OWNED_GUARD, newOwnedGuard, newOwnedGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GateCall> getGateCalls() {
		if (gateCalls == null) {
			gateCalls = new EObjectContainmentEList<GateCall>(GateCall.class, this, ApnmmPackage.TRANSITION__GATE_CALLS);
		}
		return gateCalls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCall getMethodCall() {
		return methodCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodCall(MethodCall newMethodCall, NotificationChain msgs) {
		MethodCall oldMethodCall = methodCall;
		methodCall = newMethodCall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApnmmPackage.TRANSITION__METHOD_CALL, oldMethodCall, newMethodCall);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodCall(MethodCall newMethodCall) {
		if (newMethodCall != methodCall) {
			NotificationChain msgs = null;
			if (methodCall != null)
				msgs = ((InternalEObject)methodCall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApnmmPackage.TRANSITION__METHOD_CALL, null, msgs);
			if (newMethodCall != null)
				msgs = ((InternalEObject)newMethodCall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApnmmPackage.TRANSITION__METHOD_CALL, null, msgs);
			msgs = basicSetMethodCall(newMethodCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApnmmPackage.TRANSITION__METHOD_CALL, newMethodCall, newMethodCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApnmmPackage.TRANSITION__OWNED_GUARD:
				return basicSetOwnedGuard(null, msgs);
			case ApnmmPackage.TRANSITION__GATE_CALLS:
				return ((InternalEList<?>)getGateCalls()).basicRemove(otherEnd, msgs);
			case ApnmmPackage.TRANSITION__METHOD_CALL:
				return basicSetMethodCall(null, msgs);
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
			case ApnmmPackage.TRANSITION__OWNED_GUARD:
				return getOwnedGuard();
			case ApnmmPackage.TRANSITION__GATE_CALLS:
				return getGateCalls();
			case ApnmmPackage.TRANSITION__METHOD_CALL:
				return getMethodCall();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApnmmPackage.TRANSITION__OWNED_GUARD:
				setOwnedGuard((Guard)newValue);
				return;
			case ApnmmPackage.TRANSITION__GATE_CALLS:
				getGateCalls().clear();
				getGateCalls().addAll((Collection<? extends GateCall>)newValue);
				return;
			case ApnmmPackage.TRANSITION__METHOD_CALL:
				setMethodCall((MethodCall)newValue);
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
			case ApnmmPackage.TRANSITION__OWNED_GUARD:
				setOwnedGuard((Guard)null);
				return;
			case ApnmmPackage.TRANSITION__GATE_CALLS:
				getGateCalls().clear();
				return;
			case ApnmmPackage.TRANSITION__METHOD_CALL:
				setMethodCall((MethodCall)null);
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
			case ApnmmPackage.TRANSITION__OWNED_GUARD:
				return ownedGuard != null;
			case ApnmmPackage.TRANSITION__GATE_CALLS:
				return gateCalls != null && !gateCalls.isEmpty();
			case ApnmmPackage.TRANSITION__METHOD_CALL:
				return methodCall != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
