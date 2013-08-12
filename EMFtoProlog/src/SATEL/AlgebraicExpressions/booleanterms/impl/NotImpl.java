/**
 * <copyright>
 * </copyright>
 *
 * $Id: NotImpl.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions.booleanterms.impl;

import SATEL.AlgebraicExpressions.booleanterms.BooleanTerm;
import SATEL.AlgebraicExpressions.booleanterms.BooleantermsPackage;
import SATEL.AlgebraicExpressions.booleanterms.Not;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.AlgebraicExpressions.booleanterms.impl.NotImpl#getBooleanTerm <em>Boolean Term</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotImpl extends BooleanTermImpl implements Not {
	/**
	 * The cached value of the '{@link #getBooleanTerm() <em>Boolean Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanTerm()
	 * @generated
	 * @ordered
	 */
	protected BooleanTerm booleanTerm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BooleantermsPackage.Literals.NOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanTerm getBooleanTerm() {
		return booleanTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooleanTerm(BooleanTerm newBooleanTerm, NotificationChain msgs) {
		BooleanTerm oldBooleanTerm = booleanTerm;
		booleanTerm = newBooleanTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BooleantermsPackage.NOT__BOOLEAN_TERM, oldBooleanTerm, newBooleanTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanTerm(BooleanTerm newBooleanTerm) {
		if (newBooleanTerm != booleanTerm) {
			NotificationChain msgs = null;
			if (booleanTerm != null)
				msgs = ((InternalEObject)booleanTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BooleantermsPackage.NOT__BOOLEAN_TERM, null, msgs);
			if (newBooleanTerm != null)
				msgs = ((InternalEObject)newBooleanTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BooleantermsPackage.NOT__BOOLEAN_TERM, null, msgs);
			msgs = basicSetBooleanTerm(newBooleanTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BooleantermsPackage.NOT__BOOLEAN_TERM, newBooleanTerm, newBooleanTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BooleantermsPackage.NOT__BOOLEAN_TERM:
				return basicSetBooleanTerm(null, msgs);
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
			case BooleantermsPackage.NOT__BOOLEAN_TERM:
				return getBooleanTerm();
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
			case BooleantermsPackage.NOT__BOOLEAN_TERM:
				setBooleanTerm((BooleanTerm)newValue);
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
			case BooleantermsPackage.NOT__BOOLEAN_TERM:
				setBooleanTerm((BooleanTerm)null);
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
			case BooleantermsPackage.NOT__BOOLEAN_TERM:
				return booleanTerm != null;
		}
		return super.eIsSet(featureID);
	}

} //NotImpl
