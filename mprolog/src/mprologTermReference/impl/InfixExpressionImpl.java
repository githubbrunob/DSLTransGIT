/**
 * <copyright>
 * </copyright>
 *
 * $Id: InfixExpressionImpl.java,v 1.1 2011/12/28 01:45:32 bfb Exp $
 */
package mprologTermReference.impl;

import mprologTermReference.InfixExpression;
import mprologTermReference.MprologTermReferencePackage;
import mprologTermReference.Operator;
import mprologTermReference.Term;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infix Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mprologTermReference.impl.InfixExpressionImpl#getLeftTerm <em>Left Term</em>}</li>
 *   <li>{@link mprologTermReference.impl.InfixExpressionImpl#getRightTerm <em>Right Term</em>}</li>
 *   <li>{@link mprologTermReference.impl.InfixExpressionImpl#getOwnedOperator <em>Owned Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfixExpressionImpl extends TermImpl implements InfixExpression {
	/**
	 * The cached value of the '{@link #getLeftTerm() <em>Left Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftTerm()
	 * @generated
	 * @ordered
	 */
	protected Term leftTerm;

	/**
	 * The cached value of the '{@link #getRightTerm() <em>Right Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightTerm()
	 * @generated
	 * @ordered
	 */
	protected Term rightTerm;

	/**
	 * The cached value of the '{@link #getOwnedOperator() <em>Owned Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperator()
	 * @generated
	 * @ordered
	 */
	protected Operator ownedOperator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfixExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MprologTermReferencePackage.Literals.INFIX_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getLeftTerm() {
		return leftTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftTerm(Term newLeftTerm, NotificationChain msgs) {
		Term oldLeftTerm = leftTerm;
		leftTerm = newLeftTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MprologTermReferencePackage.INFIX_EXPRESSION__LEFT_TERM, oldLeftTerm, newLeftTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftTerm(Term newLeftTerm) {
		if (newLeftTerm != leftTerm) {
			NotificationChain msgs = null;
			if (leftTerm != null)
				msgs = ((InternalEObject)leftTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MprologTermReferencePackage.INFIX_EXPRESSION__LEFT_TERM, null, msgs);
			if (newLeftTerm != null)
				msgs = ((InternalEObject)newLeftTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MprologTermReferencePackage.INFIX_EXPRESSION__LEFT_TERM, null, msgs);
			msgs = basicSetLeftTerm(newLeftTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MprologTermReferencePackage.INFIX_EXPRESSION__LEFT_TERM, newLeftTerm, newLeftTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getRightTerm() {
		return rightTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightTerm(Term newRightTerm, NotificationChain msgs) {
		Term oldRightTerm = rightTerm;
		rightTerm = newRightTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MprologTermReferencePackage.INFIX_EXPRESSION__RIGHT_TERM, oldRightTerm, newRightTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightTerm(Term newRightTerm) {
		if (newRightTerm != rightTerm) {
			NotificationChain msgs = null;
			if (rightTerm != null)
				msgs = ((InternalEObject)rightTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MprologTermReferencePackage.INFIX_EXPRESSION__RIGHT_TERM, null, msgs);
			if (newRightTerm != null)
				msgs = ((InternalEObject)newRightTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MprologTermReferencePackage.INFIX_EXPRESSION__RIGHT_TERM, null, msgs);
			msgs = basicSetRightTerm(newRightTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MprologTermReferencePackage.INFIX_EXPRESSION__RIGHT_TERM, newRightTerm, newRightTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator getOwnedOperator() {
		return ownedOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedOperator(Operator newOwnedOperator, NotificationChain msgs) {
		Operator oldOwnedOperator = ownedOperator;
		ownedOperator = newOwnedOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MprologTermReferencePackage.INFIX_EXPRESSION__OWNED_OPERATOR, oldOwnedOperator, newOwnedOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedOperator(Operator newOwnedOperator) {
		if (newOwnedOperator != ownedOperator) {
			NotificationChain msgs = null;
			if (ownedOperator != null)
				msgs = ((InternalEObject)ownedOperator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MprologTermReferencePackage.INFIX_EXPRESSION__OWNED_OPERATOR, null, msgs);
			if (newOwnedOperator != null)
				msgs = ((InternalEObject)newOwnedOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MprologTermReferencePackage.INFIX_EXPRESSION__OWNED_OPERATOR, null, msgs);
			msgs = basicSetOwnedOperator(newOwnedOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MprologTermReferencePackage.INFIX_EXPRESSION__OWNED_OPERATOR, newOwnedOperator, newOwnedOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MprologTermReferencePackage.INFIX_EXPRESSION__LEFT_TERM:
				return basicSetLeftTerm(null, msgs);
			case MprologTermReferencePackage.INFIX_EXPRESSION__RIGHT_TERM:
				return basicSetRightTerm(null, msgs);
			case MprologTermReferencePackage.INFIX_EXPRESSION__OWNED_OPERATOR:
				return basicSetOwnedOperator(null, msgs);
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
			case MprologTermReferencePackage.INFIX_EXPRESSION__LEFT_TERM:
				return getLeftTerm();
			case MprologTermReferencePackage.INFIX_EXPRESSION__RIGHT_TERM:
				return getRightTerm();
			case MprologTermReferencePackage.INFIX_EXPRESSION__OWNED_OPERATOR:
				return getOwnedOperator();
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
			case MprologTermReferencePackage.INFIX_EXPRESSION__LEFT_TERM:
				setLeftTerm((Term)newValue);
				return;
			case MprologTermReferencePackage.INFIX_EXPRESSION__RIGHT_TERM:
				setRightTerm((Term)newValue);
				return;
			case MprologTermReferencePackage.INFIX_EXPRESSION__OWNED_OPERATOR:
				setOwnedOperator((Operator)newValue);
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
			case MprologTermReferencePackage.INFIX_EXPRESSION__LEFT_TERM:
				setLeftTerm((Term)null);
				return;
			case MprologTermReferencePackage.INFIX_EXPRESSION__RIGHT_TERM:
				setRightTerm((Term)null);
				return;
			case MprologTermReferencePackage.INFIX_EXPRESSION__OWNED_OPERATOR:
				setOwnedOperator((Operator)null);
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
			case MprologTermReferencePackage.INFIX_EXPRESSION__LEFT_TERM:
				return leftTerm != null;
			case MprologTermReferencePackage.INFIX_EXPRESSION__RIGHT_TERM:
				return rightTerm != null;
			case MprologTermReferencePackage.INFIX_EXPRESSION__OWNED_OPERATOR:
				return ownedOperator != null;
		}
		return super.eIsSet(featureID);
	}

} //InfixExpressionImpl
