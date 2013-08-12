/**
 * <copyright>
 * </copyright>
 *
 * $Id: InclusionImpl.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.impl;

import SATEL.HMLFormula.HMLTerm;

import SATEL.Inclusion;
import SATEL.IntentionDec;
import SATEL.SATELPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inclusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.impl.InclusionImpl#getHmlTerm <em>Hml Term</em>}</li>
 *   <li>{@link SATEL.impl.InclusionImpl#getIn <em>In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InclusionImpl extends ConditionAtomImpl implements Inclusion {
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
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected IntentionDec in;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InclusionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SATELPackage.Literals.INCLUSION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SATELPackage.INCLUSION__HML_TERM, oldHmlTerm, newHmlTerm);
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
				msgs = ((InternalEObject)hmlTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SATELPackage.INCLUSION__HML_TERM, null, msgs);
			if (newHmlTerm != null)
				msgs = ((InternalEObject)newHmlTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SATELPackage.INCLUSION__HML_TERM, null, msgs);
			msgs = basicSetHmlTerm(newHmlTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SATELPackage.INCLUSION__HML_TERM, newHmlTerm, newHmlTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentionDec getIn() {
		if (in != null && in.eIsProxy()) {
			InternalEObject oldIn = (InternalEObject)in;
			in = (IntentionDec)eResolveProxy(oldIn);
			if (in != oldIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SATELPackage.INCLUSION__IN, oldIn, in));
			}
		}
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentionDec basicGetIn() {
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIn(IntentionDec newIn) {
		IntentionDec oldIn = in;
		in = newIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SATELPackage.INCLUSION__IN, oldIn, in));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SATELPackage.INCLUSION__HML_TERM:
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
			case SATELPackage.INCLUSION__HML_TERM:
				return getHmlTerm();
			case SATELPackage.INCLUSION__IN:
				if (resolve) return getIn();
				return basicGetIn();
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
			case SATELPackage.INCLUSION__HML_TERM:
				setHmlTerm((HMLTerm)newValue);
				return;
			case SATELPackage.INCLUSION__IN:
				setIn((IntentionDec)newValue);
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
			case SATELPackage.INCLUSION__HML_TERM:
				setHmlTerm((HMLTerm)null);
				return;
			case SATELPackage.INCLUSION__IN:
				setIn((IntentionDec)null);
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
			case SATELPackage.INCLUSION__HML_TERM:
				return hmlTerm != null;
			case SATELPackage.INCLUSION__IN:
				return in != null;
		}
		return super.eIsSet(featureID);
	}

} //InclusionImpl
