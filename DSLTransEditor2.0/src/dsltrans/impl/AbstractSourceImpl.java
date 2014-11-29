/**
 */
package dsltrans.impl;

import dsltrans.AbstractSource;
import dsltrans.DsltransPackage;
import dsltrans.MetaModelIdentifier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsltrans.impl.AbstractSourceImpl#getMetaModelId <em>Meta Model Id</em>}</li>
 *   <li>{@link dsltrans.impl.AbstractSourceImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractSourceImpl extends EObjectImpl implements AbstractSource {
	/**
	 * The cached value of the '{@link #getMetaModelId() <em>Meta Model Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModelId()
	 * @generated
	 * @ordered
	 */
	protected MetaModelIdentifier metaModelId;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsltransPackage.Literals.ABSTRACT_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelIdentifier getMetaModelId() {
		return metaModelId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaModelId(MetaModelIdentifier newMetaModelId, NotificationChain msgs) {
		MetaModelIdentifier oldMetaModelId = metaModelId;
		metaModelId = newMetaModelId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsltransPackage.ABSTRACT_SOURCE__META_MODEL_ID, oldMetaModelId, newMetaModelId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaModelId(MetaModelIdentifier newMetaModelId) {
		if (newMetaModelId != metaModelId) {
			NotificationChain msgs = null;
			if (metaModelId != null)
				msgs = ((InternalEObject)metaModelId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsltransPackage.ABSTRACT_SOURCE__META_MODEL_ID, null, msgs);
			if (newMetaModelId != null)
				msgs = ((InternalEObject)newMetaModelId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsltransPackage.ABSTRACT_SOURCE__META_MODEL_ID, null, msgs);
			msgs = basicSetMetaModelId(newMetaModelId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsltransPackage.ABSTRACT_SOURCE__META_MODEL_ID, newMetaModelId, newMetaModelId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsltransPackage.ABSTRACT_SOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsltransPackage.ABSTRACT_SOURCE__META_MODEL_ID:
				return basicSetMetaModelId(null, msgs);
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
			case DsltransPackage.ABSTRACT_SOURCE__META_MODEL_ID:
				return getMetaModelId();
			case DsltransPackage.ABSTRACT_SOURCE__NAME:
				return getName();
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
			case DsltransPackage.ABSTRACT_SOURCE__META_MODEL_ID:
				setMetaModelId((MetaModelIdentifier)newValue);
				return;
			case DsltransPackage.ABSTRACT_SOURCE__NAME:
				setName((String)newValue);
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
			case DsltransPackage.ABSTRACT_SOURCE__META_MODEL_ID:
				setMetaModelId((MetaModelIdentifier)null);
				return;
			case DsltransPackage.ABSTRACT_SOURCE__NAME:
				setName(NAME_EDEFAULT);
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
			case DsltransPackage.ABSTRACT_SOURCE__META_MODEL_ID:
				return metaModelId != null;
			case DsltransPackage.ABSTRACT_SOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AbstractSourceImpl
