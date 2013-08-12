/**
 * <copyright>
 * </copyright>
 *
 * $Id: PlaceImpl.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.APN.apnmm.impl;

import SATEL.APN.adtmm.Sort;

import SATEL.APN.apnmm.ApnmmPackage;
import SATEL.APN.apnmm.Place;

import SATEL.APN.multisetmm.Multiset;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.APN.apnmm.impl.PlaceImpl#getOwnedPlaceMultiset <em>Owned Place Multiset</em>}</li>
 *   <li>{@link SATEL.APN.apnmm.impl.PlaceImpl#getSort <em>Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaceImpl extends NodeImpl implements Place {
	/**
	 * The cached value of the '{@link #getOwnedPlaceMultiset() <em>Owned Place Multiset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPlaceMultiset()
	 * @generated
	 * @ordered
	 */
	protected Multiset ownedPlaceMultiset;

	/**
	 * The cached value of the '{@link #getSort() <em>Sort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSort()
	 * @generated
	 * @ordered
	 */
	protected Sort sort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApnmmPackage.Literals.PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiset getOwnedPlaceMultiset() {
		return ownedPlaceMultiset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedPlaceMultiset(Multiset newOwnedPlaceMultiset, NotificationChain msgs) {
		Multiset oldOwnedPlaceMultiset = ownedPlaceMultiset;
		ownedPlaceMultiset = newOwnedPlaceMultiset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApnmmPackage.PLACE__OWNED_PLACE_MULTISET, oldOwnedPlaceMultiset, newOwnedPlaceMultiset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedPlaceMultiset(Multiset newOwnedPlaceMultiset) {
		if (newOwnedPlaceMultiset != ownedPlaceMultiset) {
			NotificationChain msgs = null;
			if (ownedPlaceMultiset != null)
				msgs = ((InternalEObject)ownedPlaceMultiset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApnmmPackage.PLACE__OWNED_PLACE_MULTISET, null, msgs);
			if (newOwnedPlaceMultiset != null)
				msgs = ((InternalEObject)newOwnedPlaceMultiset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApnmmPackage.PLACE__OWNED_PLACE_MULTISET, null, msgs);
			msgs = basicSetOwnedPlaceMultiset(newOwnedPlaceMultiset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApnmmPackage.PLACE__OWNED_PLACE_MULTISET, newOwnedPlaceMultiset, newOwnedPlaceMultiset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sort getSort() {
		return sort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSort(Sort newSort, NotificationChain msgs) {
		Sort oldSort = sort;
		sort = newSort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApnmmPackage.PLACE__SORT, oldSort, newSort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSort(Sort newSort) {
		if (newSort != sort) {
			NotificationChain msgs = null;
			if (sort != null)
				msgs = ((InternalEObject)sort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApnmmPackage.PLACE__SORT, null, msgs);
			if (newSort != null)
				msgs = ((InternalEObject)newSort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApnmmPackage.PLACE__SORT, null, msgs);
			msgs = basicSetSort(newSort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApnmmPackage.PLACE__SORT, newSort, newSort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApnmmPackage.PLACE__OWNED_PLACE_MULTISET:
				return basicSetOwnedPlaceMultiset(null, msgs);
			case ApnmmPackage.PLACE__SORT:
				return basicSetSort(null, msgs);
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
			case ApnmmPackage.PLACE__OWNED_PLACE_MULTISET:
				return getOwnedPlaceMultiset();
			case ApnmmPackage.PLACE__SORT:
				return getSort();
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
			case ApnmmPackage.PLACE__OWNED_PLACE_MULTISET:
				setOwnedPlaceMultiset((Multiset)newValue);
				return;
			case ApnmmPackage.PLACE__SORT:
				setSort((Sort)newValue);
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
			case ApnmmPackage.PLACE__OWNED_PLACE_MULTISET:
				setOwnedPlaceMultiset((Multiset)null);
				return;
			case ApnmmPackage.PLACE__SORT:
				setSort((Sort)null);
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
			case ApnmmPackage.PLACE__OWNED_PLACE_MULTISET:
				return ownedPlaceMultiset != null;
			case ApnmmPackage.PLACE__SORT:
				return sort != null;
		}
		return super.eIsSet(featureID);
	}

} //PlaceImpl
