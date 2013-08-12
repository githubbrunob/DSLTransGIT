/**
 * <copyright>
 * </copyright>
 *
 * $Id: UOPMinusImpl.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.AlgebraicExpressions.arithmeticterms.impl;

import SATEL.AlgebraicExpressions.arithmeticterms.ArithmeticTerm;
import SATEL.AlgebraicExpressions.arithmeticterms.ArithmetictermsPackage;
import SATEL.AlgebraicExpressions.arithmeticterms.UOPMinus;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UOP Minus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.AlgebraicExpressions.arithmeticterms.impl.UOPMinusImpl#getArithmeticTerm <em>Arithmetic Term</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UOPMinusImpl extends ArithmeticTermImpl implements UOPMinus {
	/**
	 * The cached value of the '{@link #getArithmeticTerm() <em>Arithmetic Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArithmeticTerm()
	 * @generated
	 * @ordered
	 */
	protected ArithmeticTerm arithmeticTerm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UOPMinusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArithmetictermsPackage.Literals.UOP_MINUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticTerm getArithmeticTerm() {
		return arithmeticTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArithmeticTerm(ArithmeticTerm newArithmeticTerm, NotificationChain msgs) {
		ArithmeticTerm oldArithmeticTerm = arithmeticTerm;
		arithmeticTerm = newArithmeticTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArithmetictermsPackage.UOP_MINUS__ARITHMETIC_TERM, oldArithmeticTerm, newArithmeticTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArithmeticTerm(ArithmeticTerm newArithmeticTerm) {
		if (newArithmeticTerm != arithmeticTerm) {
			NotificationChain msgs = null;
			if (arithmeticTerm != null)
				msgs = ((InternalEObject)arithmeticTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArithmetictermsPackage.UOP_MINUS__ARITHMETIC_TERM, null, msgs);
			if (newArithmeticTerm != null)
				msgs = ((InternalEObject)newArithmeticTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArithmetictermsPackage.UOP_MINUS__ARITHMETIC_TERM, null, msgs);
			msgs = basicSetArithmeticTerm(newArithmeticTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArithmetictermsPackage.UOP_MINUS__ARITHMETIC_TERM, newArithmeticTerm, newArithmeticTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArithmetictermsPackage.UOP_MINUS__ARITHMETIC_TERM:
				return basicSetArithmeticTerm(null, msgs);
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
			case ArithmetictermsPackage.UOP_MINUS__ARITHMETIC_TERM:
				return getArithmeticTerm();
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
			case ArithmetictermsPackage.UOP_MINUS__ARITHMETIC_TERM:
				setArithmeticTerm((ArithmeticTerm)newValue);
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
			case ArithmetictermsPackage.UOP_MINUS__ARITHMETIC_TERM:
				setArithmeticTerm((ArithmeticTerm)null);
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
			case ArithmetictermsPackage.UOP_MINUS__ARITHMETIC_TERM:
				return arithmeticTerm != null;
		}
		return super.eIsSet(featureID);
	}

} //UOPMinusImpl
