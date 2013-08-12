/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.impl;

import SOS.Conclusion;
import SOS.PremisseList;
import SOS.Rule;
import SOS.SOSPackage;

import SOS.adtmm.Variable;

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
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SOS.impl.RuleImpl#getAssumes <em>Assumes</em>}</li>
 *   <li>{@link SOS.impl.RuleImpl#getConcludes <em>Concludes</em>}</li>
 *   <li>{@link SOS.impl.RuleImpl#getOwnedVariables <em>Owned Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends EObjectImpl implements Rule {
	/**
	 * The cached value of the '{@link #getAssumes() <em>Assumes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumes()
	 * @generated
	 * @ordered
	 */
	protected PremisseList assumes;

	/**
	 * The cached value of the '{@link #getConcludes() <em>Concludes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcludes()
	 * @generated
	 * @ordered
	 */
	protected Conclusion concludes;

	/**
	 * The cached value of the '{@link #getOwnedVariables() <em>Owned Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> ownedVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SOSPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PremisseList getAssumes() {
		return assumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssumes(PremisseList newAssumes, NotificationChain msgs) {
		PremisseList oldAssumes = assumes;
		assumes = newAssumes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SOSPackage.RULE__ASSUMES, oldAssumes, newAssumes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssumes(PremisseList newAssumes) {
		if (newAssumes != assumes) {
			NotificationChain msgs = null;
			if (assumes != null)
				msgs = ((InternalEObject)assumes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SOSPackage.RULE__ASSUMES, null, msgs);
			if (newAssumes != null)
				msgs = ((InternalEObject)newAssumes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SOSPackage.RULE__ASSUMES, null, msgs);
			msgs = basicSetAssumes(newAssumes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SOSPackage.RULE__ASSUMES, newAssumes, newAssumes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conclusion getConcludes() {
		return concludes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcludes(Conclusion newConcludes, NotificationChain msgs) {
		Conclusion oldConcludes = concludes;
		concludes = newConcludes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SOSPackage.RULE__CONCLUDES, oldConcludes, newConcludes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcludes(Conclusion newConcludes) {
		if (newConcludes != concludes) {
			NotificationChain msgs = null;
			if (concludes != null)
				msgs = ((InternalEObject)concludes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SOSPackage.RULE__CONCLUDES, null, msgs);
			if (newConcludes != null)
				msgs = ((InternalEObject)newConcludes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SOSPackage.RULE__CONCLUDES, null, msgs);
			msgs = basicSetConcludes(newConcludes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SOSPackage.RULE__CONCLUDES, newConcludes, newConcludes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getOwnedVariables() {
		if (ownedVariables == null) {
			ownedVariables = new EObjectContainmentEList<Variable>(Variable.class, this, SOSPackage.RULE__OWNED_VARIABLES);
		}
		return ownedVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SOSPackage.RULE__ASSUMES:
				return basicSetAssumes(null, msgs);
			case SOSPackage.RULE__CONCLUDES:
				return basicSetConcludes(null, msgs);
			case SOSPackage.RULE__OWNED_VARIABLES:
				return ((InternalEList<?>)getOwnedVariables()).basicRemove(otherEnd, msgs);
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
			case SOSPackage.RULE__ASSUMES:
				return getAssumes();
			case SOSPackage.RULE__CONCLUDES:
				return getConcludes();
			case SOSPackage.RULE__OWNED_VARIABLES:
				return getOwnedVariables();
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
			case SOSPackage.RULE__ASSUMES:
				setAssumes((PremisseList)newValue);
				return;
			case SOSPackage.RULE__CONCLUDES:
				setConcludes((Conclusion)newValue);
				return;
			case SOSPackage.RULE__OWNED_VARIABLES:
				getOwnedVariables().clear();
				getOwnedVariables().addAll((Collection<? extends Variable>)newValue);
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
			case SOSPackage.RULE__ASSUMES:
				setAssumes((PremisseList)null);
				return;
			case SOSPackage.RULE__CONCLUDES:
				setConcludes((Conclusion)null);
				return;
			case SOSPackage.RULE__OWNED_VARIABLES:
				getOwnedVariables().clear();
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
			case SOSPackage.RULE__ASSUMES:
				return assumes != null;
			case SOSPackage.RULE__CONCLUDES:
				return concludes != null;
			case SOSPackage.RULE__OWNED_VARIABLES:
				return ownedVariables != null && !ownedVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RuleImpl
