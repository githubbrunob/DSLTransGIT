/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConditionImpl.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.impl;

import SATEL.Condition;
import SATEL.ConditionBody;
import SATEL.DomainQuantifier;
import SATEL.SATELPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.impl.ConditionImpl#getDomainQuantifier <em>Domain Quantifier</em>}</li>
 *   <li>{@link SATEL.impl.ConditionImpl#getConditionBody <em>Condition Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends EObjectImpl implements Condition {
	/**
	 * The cached value of the '{@link #getDomainQuantifier() <em>Domain Quantifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainQuantifier()
	 * @generated
	 * @ordered
	 */
	protected DomainQuantifier domainQuantifier;

	/**
	 * The cached value of the '{@link #getConditionBody() <em>Condition Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionBody()
	 * @generated
	 * @ordered
	 */
	protected ConditionBody conditionBody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SATELPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainQuantifier getDomainQuantifier() {
		return domainQuantifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainQuantifier(DomainQuantifier newDomainQuantifier, NotificationChain msgs) {
		DomainQuantifier oldDomainQuantifier = domainQuantifier;
		domainQuantifier = newDomainQuantifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SATELPackage.CONDITION__DOMAIN_QUANTIFIER, oldDomainQuantifier, newDomainQuantifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainQuantifier(DomainQuantifier newDomainQuantifier) {
		if (newDomainQuantifier != domainQuantifier) {
			NotificationChain msgs = null;
			if (domainQuantifier != null)
				msgs = ((InternalEObject)domainQuantifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SATELPackage.CONDITION__DOMAIN_QUANTIFIER, null, msgs);
			if (newDomainQuantifier != null)
				msgs = ((InternalEObject)newDomainQuantifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SATELPackage.CONDITION__DOMAIN_QUANTIFIER, null, msgs);
			msgs = basicSetDomainQuantifier(newDomainQuantifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SATELPackage.CONDITION__DOMAIN_QUANTIFIER, newDomainQuantifier, newDomainQuantifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionBody getConditionBody() {
		return conditionBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionBody(ConditionBody newConditionBody, NotificationChain msgs) {
		ConditionBody oldConditionBody = conditionBody;
		conditionBody = newConditionBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SATELPackage.CONDITION__CONDITION_BODY, oldConditionBody, newConditionBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionBody(ConditionBody newConditionBody) {
		if (newConditionBody != conditionBody) {
			NotificationChain msgs = null;
			if (conditionBody != null)
				msgs = ((InternalEObject)conditionBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SATELPackage.CONDITION__CONDITION_BODY, null, msgs);
			if (newConditionBody != null)
				msgs = ((InternalEObject)newConditionBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SATELPackage.CONDITION__CONDITION_BODY, null, msgs);
			msgs = basicSetConditionBody(newConditionBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SATELPackage.CONDITION__CONDITION_BODY, newConditionBody, newConditionBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SATELPackage.CONDITION__DOMAIN_QUANTIFIER:
				return basicSetDomainQuantifier(null, msgs);
			case SATELPackage.CONDITION__CONDITION_BODY:
				return basicSetConditionBody(null, msgs);
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
			case SATELPackage.CONDITION__DOMAIN_QUANTIFIER:
				return getDomainQuantifier();
			case SATELPackage.CONDITION__CONDITION_BODY:
				return getConditionBody();
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
			case SATELPackage.CONDITION__DOMAIN_QUANTIFIER:
				setDomainQuantifier((DomainQuantifier)newValue);
				return;
			case SATELPackage.CONDITION__CONDITION_BODY:
				setConditionBody((ConditionBody)newValue);
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
			case SATELPackage.CONDITION__DOMAIN_QUANTIFIER:
				setDomainQuantifier((DomainQuantifier)null);
				return;
			case SATELPackage.CONDITION__CONDITION_BODY:
				setConditionBody((ConditionBody)null);
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
			case SATELPackage.CONDITION__DOMAIN_QUANTIFIER:
				return domainQuantifier != null;
			case SATELPackage.CONDITION__CONDITION_BODY:
				return conditionBody != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionImpl
