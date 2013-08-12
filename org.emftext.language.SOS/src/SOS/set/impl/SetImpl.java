/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.set.impl;

import SOS.adtmm.Sort;

import SOS.adtmm.impl.SortImpl;

import SOS.set.Set;
import SOS.set.SetPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SOS.set.impl.SetImpl#getSort <em>Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetImpl extends SortImpl implements Set {
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
	protected SetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SetPackage.Literals.SET;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.SET__SORT, oldSort, newSort);
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
				msgs = ((InternalEObject)sort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.SET__SORT, null, msgs);
			if (newSort != null)
				msgs = ((InternalEObject)newSort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.SET__SORT, null, msgs);
			msgs = basicSetSort(newSort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.SET__SORT, newSort, newSort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SetPackage.SET__SORT:
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
			case SetPackage.SET__SORT:
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
			case SetPackage.SET__SORT:
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
			case SetPackage.SET__SORT:
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
			case SetPackage.SET__SORT:
				return sort != null;
		}
		return super.eIsSet(featureID);
	}

} //SetImpl
