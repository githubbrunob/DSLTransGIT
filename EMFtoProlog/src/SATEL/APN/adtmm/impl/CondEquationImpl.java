/**
 * <copyright>
 * </copyright>
 *
 * $Id: CondEquationImpl.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.APN.adtmm.impl;

import SATEL.APN.adtmm.AbstractEquation;
import SATEL.APN.adtmm.AdtmmPackage;
import SATEL.APN.adtmm.CondEquation;
import SATEL.APN.adtmm.Equation;

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
 * An implementation of the model object '<em><b>Cond Equation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.APN.adtmm.impl.CondEquationImpl#getOwnedConditions <em>Owned Conditions</em>}</li>
 *   <li>{@link SATEL.APN.adtmm.impl.CondEquationImpl#getOwnedEquation <em>Owned Equation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CondEquationImpl extends EObjectImpl implements CondEquation {
	/**
	 * The cached value of the '{@link #getOwnedConditions() <em>Owned Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractEquation> ownedConditions;

	/**
	 * The cached value of the '{@link #getOwnedEquation() <em>Owned Equation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEquation()
	 * @generated
	 * @ordered
	 */
	protected Equation ownedEquation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CondEquationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdtmmPackage.Literals.COND_EQUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractEquation> getOwnedConditions() {
		if (ownedConditions == null) {
			ownedConditions = new EObjectContainmentEList<AbstractEquation>(AbstractEquation.class, this, AdtmmPackage.COND_EQUATION__OWNED_CONDITIONS);
		}
		return ownedConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equation getOwnedEquation() {
		return ownedEquation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedEquation(Equation newOwnedEquation, NotificationChain msgs) {
		Equation oldOwnedEquation = ownedEquation;
		ownedEquation = newOwnedEquation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdtmmPackage.COND_EQUATION__OWNED_EQUATION, oldOwnedEquation, newOwnedEquation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedEquation(Equation newOwnedEquation) {
		if (newOwnedEquation != ownedEquation) {
			NotificationChain msgs = null;
			if (ownedEquation != null)
				msgs = ((InternalEObject)ownedEquation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdtmmPackage.COND_EQUATION__OWNED_EQUATION, null, msgs);
			if (newOwnedEquation != null)
				msgs = ((InternalEObject)newOwnedEquation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdtmmPackage.COND_EQUATION__OWNED_EQUATION, null, msgs);
			msgs = basicSetOwnedEquation(newOwnedEquation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdtmmPackage.COND_EQUATION__OWNED_EQUATION, newOwnedEquation, newOwnedEquation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdtmmPackage.COND_EQUATION__OWNED_CONDITIONS:
				return ((InternalEList<?>)getOwnedConditions()).basicRemove(otherEnd, msgs);
			case AdtmmPackage.COND_EQUATION__OWNED_EQUATION:
				return basicSetOwnedEquation(null, msgs);
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
			case AdtmmPackage.COND_EQUATION__OWNED_CONDITIONS:
				return getOwnedConditions();
			case AdtmmPackage.COND_EQUATION__OWNED_EQUATION:
				return getOwnedEquation();
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
			case AdtmmPackage.COND_EQUATION__OWNED_CONDITIONS:
				getOwnedConditions().clear();
				getOwnedConditions().addAll((Collection<? extends AbstractEquation>)newValue);
				return;
			case AdtmmPackage.COND_EQUATION__OWNED_EQUATION:
				setOwnedEquation((Equation)newValue);
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
			case AdtmmPackage.COND_EQUATION__OWNED_CONDITIONS:
				getOwnedConditions().clear();
				return;
			case AdtmmPackage.COND_EQUATION__OWNED_EQUATION:
				setOwnedEquation((Equation)null);
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
			case AdtmmPackage.COND_EQUATION__OWNED_CONDITIONS:
				return ownedConditions != null && !ownedConditions.isEmpty();
			case AdtmmPackage.COND_EQUATION__OWNED_EQUATION:
				return ownedEquation != null;
		}
		return super.eIsSet(featureID);
	}

} //CondEquationImpl
