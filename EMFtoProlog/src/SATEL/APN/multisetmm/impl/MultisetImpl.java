/**
 * <copyright>
 * </copyright>
 *
 * $Id: MultisetImpl.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.APN.multisetmm.impl;

import SATEL.APN.adtmm.Sort;
import SATEL.APN.adtmm.Variable;

import SATEL.APN.environmentmm.impl.EnvironmentImpl;

import SATEL.APN.multisetmm.Multiset;
import SATEL.APN.multisetmm.MultisetmmPackage;
import SATEL.APN.multisetmm.NumOfTerms;

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
 * An implementation of the model object '<em><b>Multiset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.APN.multisetmm.impl.MultisetImpl#getMsSort <em>Ms Sort</em>}</li>
 *   <li>{@link SATEL.APN.multisetmm.impl.MultisetImpl#getOwnedNumOfTerms <em>Owned Num Of Terms</em>}</li>
 *   <li>{@link SATEL.APN.multisetmm.impl.MultisetImpl#getOwnedVariables <em>Owned Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultisetImpl extends EnvironmentImpl implements Multiset {
	/**
	 * The cached value of the '{@link #getMsSort() <em>Ms Sort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsSort()
	 * @generated
	 * @ordered
	 */
	protected Sort msSort;

	/**
	 * The cached value of the '{@link #getOwnedNumOfTerms() <em>Owned Num Of Terms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedNumOfTerms()
	 * @generated
	 * @ordered
	 */
	protected EList<NumOfTerms> ownedNumOfTerms;

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
	protected MultisetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultisetmmPackage.Literals.MULTISET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sort getMsSort() {
		return msSort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsSort(Sort newMsSort, NotificationChain msgs) {
		Sort oldMsSort = msSort;
		msSort = newMsSort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MultisetmmPackage.MULTISET__MS_SORT, oldMsSort, newMsSort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMsSort(Sort newMsSort) {
		if (newMsSort != msSort) {
			NotificationChain msgs = null;
			if (msSort != null)
				msgs = ((InternalEObject)msSort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MultisetmmPackage.MULTISET__MS_SORT, null, msgs);
			if (newMsSort != null)
				msgs = ((InternalEObject)newMsSort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MultisetmmPackage.MULTISET__MS_SORT, null, msgs);
			msgs = basicSetMsSort(newMsSort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultisetmmPackage.MULTISET__MS_SORT, newMsSort, newMsSort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NumOfTerms> getOwnedNumOfTerms() {
		if (ownedNumOfTerms == null) {
			ownedNumOfTerms = new EObjectContainmentEList<NumOfTerms>(NumOfTerms.class, this, MultisetmmPackage.MULTISET__OWNED_NUM_OF_TERMS);
		}
		return ownedNumOfTerms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getOwnedVariables() {
		if (ownedVariables == null) {
			ownedVariables = new EObjectContainmentEList<Variable>(Variable.class, this, MultisetmmPackage.MULTISET__OWNED_VARIABLES);
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
			case MultisetmmPackage.MULTISET__MS_SORT:
				return basicSetMsSort(null, msgs);
			case MultisetmmPackage.MULTISET__OWNED_NUM_OF_TERMS:
				return ((InternalEList<?>)getOwnedNumOfTerms()).basicRemove(otherEnd, msgs);
			case MultisetmmPackage.MULTISET__OWNED_VARIABLES:
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
			case MultisetmmPackage.MULTISET__MS_SORT:
				return getMsSort();
			case MultisetmmPackage.MULTISET__OWNED_NUM_OF_TERMS:
				return getOwnedNumOfTerms();
			case MultisetmmPackage.MULTISET__OWNED_VARIABLES:
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
			case MultisetmmPackage.MULTISET__MS_SORT:
				setMsSort((Sort)newValue);
				return;
			case MultisetmmPackage.MULTISET__OWNED_NUM_OF_TERMS:
				getOwnedNumOfTerms().clear();
				getOwnedNumOfTerms().addAll((Collection<? extends NumOfTerms>)newValue);
				return;
			case MultisetmmPackage.MULTISET__OWNED_VARIABLES:
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
			case MultisetmmPackage.MULTISET__MS_SORT:
				setMsSort((Sort)null);
				return;
			case MultisetmmPackage.MULTISET__OWNED_NUM_OF_TERMS:
				getOwnedNumOfTerms().clear();
				return;
			case MultisetmmPackage.MULTISET__OWNED_VARIABLES:
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
			case MultisetmmPackage.MULTISET__MS_SORT:
				return msSort != null;
			case MultisetmmPackage.MULTISET__OWNED_NUM_OF_TERMS:
				return ownedNumOfTerms != null && !ownedNumOfTerms.isEmpty();
			case MultisetmmPackage.MULTISET__OWNED_VARIABLES:
				return ownedVariables != null && !ownedVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MultisetImpl
