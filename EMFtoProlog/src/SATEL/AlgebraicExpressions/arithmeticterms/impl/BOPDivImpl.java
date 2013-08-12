/**
 * <copyright>
 * </copyright>
 *
 * $Id: BOPDivImpl.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.AlgebraicExpressions.arithmeticterms.impl;

import SATEL.AlgebraicExpressions.arithmeticterms.ArithmeticTerm;
import SATEL.AlgebraicExpressions.arithmeticterms.ArithmetictermsPackage;
import SATEL.AlgebraicExpressions.arithmeticterms.BOPDiv;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BOP Div</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.AlgebraicExpressions.arithmeticterms.impl.BOPDivImpl#getArithmeticTermL <em>Arithmetic Term L</em>}</li>
 *   <li>{@link SATEL.AlgebraicExpressions.arithmeticterms.impl.BOPDivImpl#getArithmeticTermR <em>Arithmetic Term R</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BOPDivImpl extends ArithmeticTermImpl implements BOPDiv {
	/**
	 * The cached value of the '{@link #getArithmeticTermL() <em>Arithmetic Term L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArithmeticTermL()
	 * @generated
	 * @ordered
	 */
	protected ArithmeticTerm arithmeticTermL;

	/**
	 * The cached value of the '{@link #getArithmeticTermR() <em>Arithmetic Term R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArithmeticTermR()
	 * @generated
	 * @ordered
	 */
	protected ArithmeticTerm arithmeticTermR;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BOPDivImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArithmetictermsPackage.Literals.BOP_DIV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticTerm getArithmeticTermL() {
		return arithmeticTermL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArithmeticTermL(ArithmeticTerm newArithmeticTermL, NotificationChain msgs) {
		ArithmeticTerm oldArithmeticTermL = arithmeticTermL;
		arithmeticTermL = newArithmeticTermL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArithmetictermsPackage.BOP_DIV__ARITHMETIC_TERM_L, oldArithmeticTermL, newArithmeticTermL);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArithmeticTermL(ArithmeticTerm newArithmeticTermL) {
		if (newArithmeticTermL != arithmeticTermL) {
			NotificationChain msgs = null;
			if (arithmeticTermL != null)
				msgs = ((InternalEObject)arithmeticTermL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArithmetictermsPackage.BOP_DIV__ARITHMETIC_TERM_L, null, msgs);
			if (newArithmeticTermL != null)
				msgs = ((InternalEObject)newArithmeticTermL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArithmetictermsPackage.BOP_DIV__ARITHMETIC_TERM_L, null, msgs);
			msgs = basicSetArithmeticTermL(newArithmeticTermL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArithmetictermsPackage.BOP_DIV__ARITHMETIC_TERM_L, newArithmeticTermL, newArithmeticTermL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticTerm getArithmeticTermR() {
		return arithmeticTermR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArithmeticTermR(ArithmeticTerm newArithmeticTermR, NotificationChain msgs) {
		ArithmeticTerm oldArithmeticTermR = arithmeticTermR;
		arithmeticTermR = newArithmeticTermR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArithmetictermsPackage.BOP_DIV__ARITHMETIC_TERM_R, oldArithmeticTermR, newArithmeticTermR);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArithmeticTermR(ArithmeticTerm newArithmeticTermR) {
		if (newArithmeticTermR != arithmeticTermR) {
			NotificationChain msgs = null;
			if (arithmeticTermR != null)
				msgs = ((InternalEObject)arithmeticTermR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArithmetictermsPackage.BOP_DIV__ARITHMETIC_TERM_R, null, msgs);
			if (newArithmeticTermR != null)
				msgs = ((InternalEObject)newArithmeticTermR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArithmetictermsPackage.BOP_DIV__ARITHMETIC_TERM_R, null, msgs);
			msgs = basicSetArithmeticTermR(newArithmeticTermR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArithmetictermsPackage.BOP_DIV__ARITHMETIC_TERM_R, newArithmeticTermR, newArithmeticTermR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArithmetictermsPackage.BOP_DIV__ARITHMETIC_TERM_L:
				return basicSetArithmeticTermL(null, msgs);
			case ArithmetictermsPackage.BOP_DIV__ARITHMETIC_TERM_R:
				return basicSetArithmeticTermR(null, msgs);
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
			case ArithmetictermsPackage.BOP_DIV__ARITHMETIC_TERM_L:
				return getArithmeticTermL();
			case ArithmetictermsPackage.BOP_DIV__ARITHMETIC_TERM_R:
				return getArithmeticTermR();
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
			case ArithmetictermsPackage.BOP_DIV__ARITHMETIC_TERM_L:
				setArithmeticTermL((ArithmeticTerm)newValue);
				return;
			case ArithmetictermsPackage.BOP_DIV__ARITHMETIC_TERM_R:
				setArithmeticTermR((ArithmeticTerm)newValue);
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
			case ArithmetictermsPackage.BOP_DIV__ARITHMETIC_TERM_L:
				setArithmeticTermL((ArithmeticTerm)null);
				return;
			case ArithmetictermsPackage.BOP_DIV__ARITHMETIC_TERM_R:
				setArithmeticTermR((ArithmeticTerm)null);
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
			case ArithmetictermsPackage.BOP_DIV__ARITHMETIC_TERM_L:
				return arithmeticTermL != null;
			case ArithmetictermsPackage.BOP_DIV__ARITHMETIC_TERM_R:
				return arithmeticTermR != null;
		}
		return super.eIsSet(featureID);
	}

} //BOPDivImpl
