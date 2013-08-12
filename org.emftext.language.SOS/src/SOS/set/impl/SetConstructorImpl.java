/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.set.impl;

import SOS.AlgebraicConditionList;

import SOS.adtmm.Term;

import SOS.set.SetConstructor;
import SOS.set.SetPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SOS.set.impl.SetConstructorImpl#getSuchThat <em>Such That</em>}</li>
 *   <li>{@link SOS.set.impl.SetConstructorImpl#getMember <em>Member</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetConstructorImpl extends SetTermImpl implements SetConstructor {
	/**
	 * The cached value of the '{@link #getSuchThat() <em>Such That</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuchThat()
	 * @generated
	 * @ordered
	 */
	protected AlgebraicConditionList suchThat;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected Term member;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetConstructorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SetPackage.Literals.SET_CONSTRUCTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgebraicConditionList getSuchThat() {
		return suchThat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuchThat(AlgebraicConditionList newSuchThat, NotificationChain msgs) {
		AlgebraicConditionList oldSuchThat = suchThat;
		suchThat = newSuchThat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.SET_CONSTRUCTOR__SUCH_THAT, oldSuchThat, newSuchThat);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuchThat(AlgebraicConditionList newSuchThat) {
		if (newSuchThat != suchThat) {
			NotificationChain msgs = null;
			if (suchThat != null)
				msgs = ((InternalEObject)suchThat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.SET_CONSTRUCTOR__SUCH_THAT, null, msgs);
			if (newSuchThat != null)
				msgs = ((InternalEObject)newSuchThat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.SET_CONSTRUCTOR__SUCH_THAT, null, msgs);
			msgs = basicSetSuchThat(newSuchThat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.SET_CONSTRUCTOR__SUCH_THAT, newSuchThat, newSuchThat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getMember() {
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMember(Term newMember, NotificationChain msgs) {
		Term oldMember = member;
		member = newMember;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.SET_CONSTRUCTOR__MEMBER, oldMember, newMember);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMember(Term newMember) {
		if (newMember != member) {
			NotificationChain msgs = null;
			if (member != null)
				msgs = ((InternalEObject)member).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.SET_CONSTRUCTOR__MEMBER, null, msgs);
			if (newMember != null)
				msgs = ((InternalEObject)newMember).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.SET_CONSTRUCTOR__MEMBER, null, msgs);
			msgs = basicSetMember(newMember, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.SET_CONSTRUCTOR__MEMBER, newMember, newMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SetPackage.SET_CONSTRUCTOR__SUCH_THAT:
				return basicSetSuchThat(null, msgs);
			case SetPackage.SET_CONSTRUCTOR__MEMBER:
				return basicSetMember(null, msgs);
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
			case SetPackage.SET_CONSTRUCTOR__SUCH_THAT:
				return getSuchThat();
			case SetPackage.SET_CONSTRUCTOR__MEMBER:
				return getMember();
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
			case SetPackage.SET_CONSTRUCTOR__SUCH_THAT:
				setSuchThat((AlgebraicConditionList)newValue);
				return;
			case SetPackage.SET_CONSTRUCTOR__MEMBER:
				setMember((Term)newValue);
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
			case SetPackage.SET_CONSTRUCTOR__SUCH_THAT:
				setSuchThat((AlgebraicConditionList)null);
				return;
			case SetPackage.SET_CONSTRUCTOR__MEMBER:
				setMember((Term)null);
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
			case SetPackage.SET_CONSTRUCTOR__SUCH_THAT:
				return suchThat != null;
			case SetPackage.SET_CONSTRUCTOR__MEMBER:
				return member != null;
		}
		return super.eIsSet(featureID);
	}

} //SetConstructorImpl
