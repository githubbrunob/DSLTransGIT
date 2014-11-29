/**
 */
package dsltrans.impl;

import dsltrans.DsltransPackage;
import dsltrans.MatchAttribute;
import dsltrans.MatchAttributeValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsltrans.impl.MatchAttributeImpl#getAttributeValue <em>Attribute Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatchAttributeImpl extends AttributeImpl implements MatchAttribute {
	/**
	 * The cached value of the '{@link #getAttributeValue() <em>Attribute Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeValue()
	 * @generated
	 * @ordered
	 */
	protected MatchAttributeValue attributeValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsltransPackage.Literals.MATCH_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchAttributeValue getAttributeValue() {
		return attributeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeValue(MatchAttributeValue newAttributeValue, NotificationChain msgs) {
		MatchAttributeValue oldAttributeValue = attributeValue;
		attributeValue = newAttributeValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsltransPackage.MATCH_ATTRIBUTE__ATTRIBUTE_VALUE, oldAttributeValue, newAttributeValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeValue(MatchAttributeValue newAttributeValue) {
		if (newAttributeValue != attributeValue) {
			NotificationChain msgs = null;
			if (attributeValue != null)
				msgs = ((InternalEObject)attributeValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsltransPackage.MATCH_ATTRIBUTE__ATTRIBUTE_VALUE, null, msgs);
			if (newAttributeValue != null)
				msgs = ((InternalEObject)newAttributeValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsltransPackage.MATCH_ATTRIBUTE__ATTRIBUTE_VALUE, null, msgs);
			msgs = basicSetAttributeValue(newAttributeValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsltransPackage.MATCH_ATTRIBUTE__ATTRIBUTE_VALUE, newAttributeValue, newAttributeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsltransPackage.MATCH_ATTRIBUTE__ATTRIBUTE_VALUE:
				return basicSetAttributeValue(null, msgs);
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
			case DsltransPackage.MATCH_ATTRIBUTE__ATTRIBUTE_VALUE:
				return getAttributeValue();
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
			case DsltransPackage.MATCH_ATTRIBUTE__ATTRIBUTE_VALUE:
				setAttributeValue((MatchAttributeValue)newValue);
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
			case DsltransPackage.MATCH_ATTRIBUTE__ATTRIBUTE_VALUE:
				setAttributeValue((MatchAttributeValue)null);
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
			case DsltransPackage.MATCH_ATTRIBUTE__ATTRIBUTE_VALUE:
				return attributeValue != null;
		}
		return super.eIsSet(featureID);
	}

} //MatchAttributeImpl
