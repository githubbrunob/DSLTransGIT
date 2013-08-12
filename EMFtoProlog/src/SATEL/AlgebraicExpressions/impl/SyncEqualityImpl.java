/**
 * <copyright>
 * </copyright>
 *
 * $Id: SyncEqualityImpl.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.AlgebraicExpressions.impl;

import SATEL.AlgebraicExpressions.AlgebraicExpressionsPackage;
import SATEL.AlgebraicExpressions.SyncEquality;

import SATEL.HMLFormula.SynchronizationTerm;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sync Equality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.AlgebraicExpressions.impl.SyncEqualityImpl#getSynchronizationTermL <em>Synchronization Term L</em>}</li>
 *   <li>{@link SATEL.AlgebraicExpressions.impl.SyncEqualityImpl#getSynchronizationTermR <em>Synchronization Term R</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SyncEqualityImpl extends AlgebraicEqualityImpl implements SyncEquality {
	/**
	 * The cached value of the '{@link #getSynchronizationTermL() <em>Synchronization Term L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronizationTermL()
	 * @generated
	 * @ordered
	 */
	protected SynchronizationTerm synchronizationTermL;

	/**
	 * The cached value of the '{@link #getSynchronizationTermR() <em>Synchronization Term R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronizationTermR()
	 * @generated
	 * @ordered
	 */
	protected SynchronizationTerm synchronizationTermR;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SyncEqualityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgebraicExpressionsPackage.Literals.SYNC_EQUALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationTerm getSynchronizationTermL() {
		return synchronizationTermL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSynchronizationTermL(SynchronizationTerm newSynchronizationTermL, NotificationChain msgs) {
		SynchronizationTerm oldSynchronizationTermL = synchronizationTermL;
		synchronizationTermL = newSynchronizationTermL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlgebraicExpressionsPackage.SYNC_EQUALITY__SYNCHRONIZATION_TERM_L, oldSynchronizationTermL, newSynchronizationTermL);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronizationTermL(SynchronizationTerm newSynchronizationTermL) {
		if (newSynchronizationTermL != synchronizationTermL) {
			NotificationChain msgs = null;
			if (synchronizationTermL != null)
				msgs = ((InternalEObject)synchronizationTermL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlgebraicExpressionsPackage.SYNC_EQUALITY__SYNCHRONIZATION_TERM_L, null, msgs);
			if (newSynchronizationTermL != null)
				msgs = ((InternalEObject)newSynchronizationTermL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlgebraicExpressionsPackage.SYNC_EQUALITY__SYNCHRONIZATION_TERM_L, null, msgs);
			msgs = basicSetSynchronizationTermL(newSynchronizationTermL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgebraicExpressionsPackage.SYNC_EQUALITY__SYNCHRONIZATION_TERM_L, newSynchronizationTermL, newSynchronizationTermL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationTerm getSynchronizationTermR() {
		return synchronizationTermR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSynchronizationTermR(SynchronizationTerm newSynchronizationTermR, NotificationChain msgs) {
		SynchronizationTerm oldSynchronizationTermR = synchronizationTermR;
		synchronizationTermR = newSynchronizationTermR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlgebraicExpressionsPackage.SYNC_EQUALITY__SYNCHRONIZATION_TERM_R, oldSynchronizationTermR, newSynchronizationTermR);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronizationTermR(SynchronizationTerm newSynchronizationTermR) {
		if (newSynchronizationTermR != synchronizationTermR) {
			NotificationChain msgs = null;
			if (synchronizationTermR != null)
				msgs = ((InternalEObject)synchronizationTermR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlgebraicExpressionsPackage.SYNC_EQUALITY__SYNCHRONIZATION_TERM_R, null, msgs);
			if (newSynchronizationTermR != null)
				msgs = ((InternalEObject)newSynchronizationTermR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlgebraicExpressionsPackage.SYNC_EQUALITY__SYNCHRONIZATION_TERM_R, null, msgs);
			msgs = basicSetSynchronizationTermR(newSynchronizationTermR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgebraicExpressionsPackage.SYNC_EQUALITY__SYNCHRONIZATION_TERM_R, newSynchronizationTermR, newSynchronizationTermR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlgebraicExpressionsPackage.SYNC_EQUALITY__SYNCHRONIZATION_TERM_L:
				return basicSetSynchronizationTermL(null, msgs);
			case AlgebraicExpressionsPackage.SYNC_EQUALITY__SYNCHRONIZATION_TERM_R:
				return basicSetSynchronizationTermR(null, msgs);
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
			case AlgebraicExpressionsPackage.SYNC_EQUALITY__SYNCHRONIZATION_TERM_L:
				return getSynchronizationTermL();
			case AlgebraicExpressionsPackage.SYNC_EQUALITY__SYNCHRONIZATION_TERM_R:
				return getSynchronizationTermR();
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
			case AlgebraicExpressionsPackage.SYNC_EQUALITY__SYNCHRONIZATION_TERM_L:
				setSynchronizationTermL((SynchronizationTerm)newValue);
				return;
			case AlgebraicExpressionsPackage.SYNC_EQUALITY__SYNCHRONIZATION_TERM_R:
				setSynchronizationTermR((SynchronizationTerm)newValue);
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
			case AlgebraicExpressionsPackage.SYNC_EQUALITY__SYNCHRONIZATION_TERM_L:
				setSynchronizationTermL((SynchronizationTerm)null);
				return;
			case AlgebraicExpressionsPackage.SYNC_EQUALITY__SYNCHRONIZATION_TERM_R:
				setSynchronizationTermR((SynchronizationTerm)null);
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
			case AlgebraicExpressionsPackage.SYNC_EQUALITY__SYNCHRONIZATION_TERM_L:
				return synchronizationTermL != null;
			case AlgebraicExpressionsPackage.SYNC_EQUALITY__SYNCHRONIZATION_TERM_R:
				return synchronizationTermR != null;
		}
		return super.eIsSet(featureID);
	}

} //SyncEqualityImpl
