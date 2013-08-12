/**
 * <copyright>
 * </copyright>
 *
 * $Id: InstantiationImpl.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.APN.adtmm.impl;

import SATEL.APN.adtmm.AdtmmPackage;
import SATEL.APN.adtmm.Instantiable;
import SATEL.APN.adtmm.Instantiation;
import SATEL.APN.adtmm.Sort;

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
 * An implementation of the model object '<em><b>Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.APN.adtmm.impl.InstantiationImpl#getOwnedParameters <em>Owned Parameters</em>}</li>
 *   <li>{@link SATEL.APN.adtmm.impl.InstantiationImpl#getImported <em>Imported</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstantiationImpl extends EObjectImpl implements Instantiation {
	/**
	 * The cached value of the '{@link #getOwnedParameters() <em>Owned Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Sort> ownedParameters;

	/**
	 * The cached value of the '{@link #getImported() <em>Imported</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImported()
	 * @generated
	 * @ordered
	 */
	protected Instantiable imported;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstantiationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdtmmPackage.Literals.INSTANTIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sort> getOwnedParameters() {
		if (ownedParameters == null) {
			ownedParameters = new EObjectContainmentEList<Sort>(Sort.class, this, AdtmmPackage.INSTANTIATION__OWNED_PARAMETERS);
		}
		return ownedParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instantiable getImported() {
		if (imported != null && imported.eIsProxy()) {
			InternalEObject oldImported = (InternalEObject)imported;
			imported = (Instantiable)eResolveProxy(oldImported);
			if (imported != oldImported) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdtmmPackage.INSTANTIATION__IMPORTED, oldImported, imported));
			}
		}
		return imported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instantiable basicGetImported() {
		return imported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImported(Instantiable newImported) {
		Instantiable oldImported = imported;
		imported = newImported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdtmmPackage.INSTANTIATION__IMPORTED, oldImported, imported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdtmmPackage.INSTANTIATION__OWNED_PARAMETERS:
				return ((InternalEList<?>)getOwnedParameters()).basicRemove(otherEnd, msgs);
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
			case AdtmmPackage.INSTANTIATION__OWNED_PARAMETERS:
				return getOwnedParameters();
			case AdtmmPackage.INSTANTIATION__IMPORTED:
				if (resolve) return getImported();
				return basicGetImported();
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
			case AdtmmPackage.INSTANTIATION__OWNED_PARAMETERS:
				getOwnedParameters().clear();
				getOwnedParameters().addAll((Collection<? extends Sort>)newValue);
				return;
			case AdtmmPackage.INSTANTIATION__IMPORTED:
				setImported((Instantiable)newValue);
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
			case AdtmmPackage.INSTANTIATION__OWNED_PARAMETERS:
				getOwnedParameters().clear();
				return;
			case AdtmmPackage.INSTANTIATION__IMPORTED:
				setImported((Instantiable)null);
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
			case AdtmmPackage.INSTANTIATION__OWNED_PARAMETERS:
				return ownedParameters != null && !ownedParameters.isEmpty();
			case AdtmmPackage.INSTANTIATION__IMPORTED:
				return imported != null;
		}
		return super.eIsSet(featureID);
	}

} //InstantiationImpl
