/**
 * <copyright>
 * </copyright>
 *
 * $Id: ArcImpl.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.APN.apnmm.impl;

import SATEL.APN.apnmm.ApnmmPackage;
import SATEL.APN.apnmm.Arc;
import SATEL.APN.apnmm.Node;

import SATEL.APN.multisetmm.Multiset;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.APN.apnmm.impl.ArcImpl#getFrom <em>From</em>}</li>
 *   <li>{@link SATEL.APN.apnmm.impl.ArcImpl#getTo <em>To</em>}</li>
 *   <li>{@link SATEL.APN.apnmm.impl.ArcImpl#getOwnedArcMultiset <em>Owned Arc Multiset</em>}</li>
 *   <li>{@link SATEL.APN.apnmm.impl.ArcImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArcImpl extends EObjectImpl implements Arc {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Node from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Node to;

	/**
	 * The cached value of the '{@link #getOwnedArcMultiset() <em>Owned Arc Multiset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedArcMultiset()
	 * @generated
	 * @ordered
	 */
	protected Multiset ownedArcMultiset;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApnmmPackage.Literals.ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (Node)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApnmmPackage.ARC__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Node newFrom) {
		Node oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApnmmPackage.ARC__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (Node)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApnmmPackage.ARC__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Node newTo) {
		Node oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApnmmPackage.ARC__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiset getOwnedArcMultiset() {
		return ownedArcMultiset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedArcMultiset(Multiset newOwnedArcMultiset, NotificationChain msgs) {
		Multiset oldOwnedArcMultiset = ownedArcMultiset;
		ownedArcMultiset = newOwnedArcMultiset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApnmmPackage.ARC__OWNED_ARC_MULTISET, oldOwnedArcMultiset, newOwnedArcMultiset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedArcMultiset(Multiset newOwnedArcMultiset) {
		if (newOwnedArcMultiset != ownedArcMultiset) {
			NotificationChain msgs = null;
			if (ownedArcMultiset != null)
				msgs = ((InternalEObject)ownedArcMultiset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApnmmPackage.ARC__OWNED_ARC_MULTISET, null, msgs);
			if (newOwnedArcMultiset != null)
				msgs = ((InternalEObject)newOwnedArcMultiset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApnmmPackage.ARC__OWNED_ARC_MULTISET, null, msgs);
			msgs = basicSetOwnedArcMultiset(newOwnedArcMultiset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApnmmPackage.ARC__OWNED_ARC_MULTISET, newOwnedArcMultiset, newOwnedArcMultiset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApnmmPackage.ARC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApnmmPackage.ARC__OWNED_ARC_MULTISET:
				return basicSetOwnedArcMultiset(null, msgs);
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
			case ApnmmPackage.ARC__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case ApnmmPackage.ARC__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case ApnmmPackage.ARC__OWNED_ARC_MULTISET:
				return getOwnedArcMultiset();
			case ApnmmPackage.ARC__NAME:
				return getName();
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
			case ApnmmPackage.ARC__FROM:
				setFrom((Node)newValue);
				return;
			case ApnmmPackage.ARC__TO:
				setTo((Node)newValue);
				return;
			case ApnmmPackage.ARC__OWNED_ARC_MULTISET:
				setOwnedArcMultiset((Multiset)newValue);
				return;
			case ApnmmPackage.ARC__NAME:
				setName((String)newValue);
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
			case ApnmmPackage.ARC__FROM:
				setFrom((Node)null);
				return;
			case ApnmmPackage.ARC__TO:
				setTo((Node)null);
				return;
			case ApnmmPackage.ARC__OWNED_ARC_MULTISET:
				setOwnedArcMultiset((Multiset)null);
				return;
			case ApnmmPackage.ARC__NAME:
				setName(NAME_EDEFAULT);
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
			case ApnmmPackage.ARC__FROM:
				return from != null;
			case ApnmmPackage.ARC__TO:
				return to != null;
			case ApnmmPackage.ARC__OWNED_ARC_MULTISET:
				return ownedArcMultiset != null;
			case ApnmmPackage.ARC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ArcImpl
