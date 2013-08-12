/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5.impl;

import Java5.Java5Package;
import Java5.NamedElementRef;
import Java5.WildCardType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wild Card Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Java5.impl.WildCardTypeImpl#getIsUpperBound <em>Is Upper Bound</em>}</li>
 *   <li>{@link Java5.impl.WildCardTypeImpl#getBound <em>Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WildCardTypeImpl extends OrphanTypeImpl implements WildCardType {
	/**
	 * The default value of the '{@link #getIsUpperBound() <em>Is Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_UPPER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsUpperBound() <em>Is Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUpperBound()
	 * @generated
	 * @ordered
	 */
	protected Boolean isUpperBound = IS_UPPER_BOUND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBound() <em>Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBound()
	 * @generated
	 * @ordered
	 */
	protected NamedElementRef bound;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WildCardTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java5Package.Literals.WILD_CARD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsUpperBound() {
		return isUpperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUpperBound(Boolean newIsUpperBound) {
		Boolean oldIsUpperBound = isUpperBound;
		isUpperBound = newIsUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.WILD_CARD_TYPE__IS_UPPER_BOUND, oldIsUpperBound, isUpperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElementRef getBound() {
		return bound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBound(NamedElementRef newBound, NotificationChain msgs) {
		NamedElementRef oldBound = bound;
		bound = newBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Java5Package.WILD_CARD_TYPE__BOUND, oldBound, newBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBound(NamedElementRef newBound) {
		if (newBound != bound) {
			NotificationChain msgs = null;
			if (bound != null)
				msgs = ((InternalEObject)bound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java5Package.WILD_CARD_TYPE__BOUND, null, msgs);
			if (newBound != null)
				msgs = ((InternalEObject)newBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java5Package.WILD_CARD_TYPE__BOUND, null, msgs);
			msgs = basicSetBound(newBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.WILD_CARD_TYPE__BOUND, newBound, newBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java5Package.WILD_CARD_TYPE__BOUND:
				return basicSetBound(null, msgs);
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
			case Java5Package.WILD_CARD_TYPE__IS_UPPER_BOUND:
				return getIsUpperBound();
			case Java5Package.WILD_CARD_TYPE__BOUND:
				return getBound();
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
			case Java5Package.WILD_CARD_TYPE__IS_UPPER_BOUND:
				setIsUpperBound((Boolean)newValue);
				return;
			case Java5Package.WILD_CARD_TYPE__BOUND:
				setBound((NamedElementRef)newValue);
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
			case Java5Package.WILD_CARD_TYPE__IS_UPPER_BOUND:
				setIsUpperBound(IS_UPPER_BOUND_EDEFAULT);
				return;
			case Java5Package.WILD_CARD_TYPE__BOUND:
				setBound((NamedElementRef)null);
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
			case Java5Package.WILD_CARD_TYPE__IS_UPPER_BOUND:
				return IS_UPPER_BOUND_EDEFAULT == null ? isUpperBound != null : !IS_UPPER_BOUND_EDEFAULT.equals(isUpperBound);
			case Java5Package.WILD_CARD_TYPE__BOUND:
				return bound != null;
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
		result.append(" (isUpperBound: ");
		result.append(isUpperBound);
		result.append(')');
		return result.toString();
	}

} //WildCardTypeImpl
