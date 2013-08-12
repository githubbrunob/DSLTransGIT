/**
 * <copyright>
 * </copyright>
 *
 * $Id: GateCallImpl.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.APN.apnmm.impl;

import SATEL.APN.adtmm.Term;

import SATEL.APN.apnmm.ApnmmPackage;
import SATEL.APN.apnmm.Gate;
import SATEL.APN.apnmm.GateCall;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gate Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.APN.apnmm.impl.GateCallImpl#getGate <em>Gate</em>}</li>
 *   <li>{@link SATEL.APN.apnmm.impl.GateCallImpl#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GateCallImpl extends EObjectImpl implements GateCall {
	/**
	 * The cached value of the '{@link #getGate() <em>Gate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGate()
	 * @generated
	 * @ordered
	 */
	protected Gate gate;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EList<Term> params;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GateCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApnmmPackage.Literals.GATE_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate getGate() {
		if (gate != null && gate.eIsProxy()) {
			InternalEObject oldGate = (InternalEObject)gate;
			gate = (Gate)eResolveProxy(oldGate);
			if (gate != oldGate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApnmmPackage.GATE_CALL__GATE, oldGate, gate));
			}
		}
		return gate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate basicGetGate() {
		return gate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGate(Gate newGate) {
		Gate oldGate = gate;
		gate = newGate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApnmmPackage.GATE_CALL__GATE, oldGate, gate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Term> getParams() {
		if (params == null) {
			params = new EObjectContainmentEList<Term>(Term.class, this, ApnmmPackage.GATE_CALL__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApnmmPackage.GATE_CALL__PARAMS:
				return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
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
			case ApnmmPackage.GATE_CALL__GATE:
				if (resolve) return getGate();
				return basicGetGate();
			case ApnmmPackage.GATE_CALL__PARAMS:
				return getParams();
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
			case ApnmmPackage.GATE_CALL__GATE:
				setGate((Gate)newValue);
				return;
			case ApnmmPackage.GATE_CALL__PARAMS:
				getParams().clear();
				getParams().addAll((Collection<? extends Term>)newValue);
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
			case ApnmmPackage.GATE_CALL__GATE:
				setGate((Gate)null);
				return;
			case ApnmmPackage.GATE_CALL__PARAMS:
				getParams().clear();
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
			case ApnmmPackage.GATE_CALL__GATE:
				return gate != null;
			case ApnmmPackage.GATE_CALL__PARAMS:
				return params != null && !params.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GateCallImpl
