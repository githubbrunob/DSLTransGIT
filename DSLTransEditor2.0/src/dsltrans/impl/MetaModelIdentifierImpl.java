/**
 */
package dsltrans.impl;

import dsltrans.DsltransPackage;
import dsltrans.MetaModelIdentifier;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Model Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsltrans.impl.MetaModelIdentifierImpl#getMetaModelURI <em>Meta Model URI</em>}</li>
 *   <li>{@link dsltrans.impl.MetaModelIdentifierImpl#getMetaModelName <em>Meta Model Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaModelIdentifierImpl extends EObjectImpl implements MetaModelIdentifier {
	/**
	 * The default value of the '{@link #getMetaModelURI() <em>Meta Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModelURI()
	 * @generated
	 * @ordered
	 */
	protected static final String META_MODEL_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaModelURI() <em>Meta Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModelURI()
	 * @generated
	 * @ordered
	 */
	protected String metaModelURI = META_MODEL_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetaModelName() <em>Meta Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String META_MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaModelName() <em>Meta Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModelName()
	 * @generated
	 * @ordered
	 */
	protected String metaModelName = META_MODEL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaModelIdentifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsltransPackage.Literals.META_MODEL_IDENTIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetaModelURI() {
		return metaModelURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaModelURI(String newMetaModelURI) {
		String oldMetaModelURI = metaModelURI;
		metaModelURI = newMetaModelURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsltransPackage.META_MODEL_IDENTIFIER__META_MODEL_URI, oldMetaModelURI, metaModelURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetaModelName() {
		return metaModelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaModelName(String newMetaModelName) {
		String oldMetaModelName = metaModelName;
		metaModelName = newMetaModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsltransPackage.META_MODEL_IDENTIFIER__META_MODEL_NAME, oldMetaModelName, metaModelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsltransPackage.META_MODEL_IDENTIFIER__META_MODEL_URI:
				return getMetaModelURI();
			case DsltransPackage.META_MODEL_IDENTIFIER__META_MODEL_NAME:
				return getMetaModelName();
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
			case DsltransPackage.META_MODEL_IDENTIFIER__META_MODEL_URI:
				setMetaModelURI((String)newValue);
				return;
			case DsltransPackage.META_MODEL_IDENTIFIER__META_MODEL_NAME:
				setMetaModelName((String)newValue);
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
			case DsltransPackage.META_MODEL_IDENTIFIER__META_MODEL_URI:
				setMetaModelURI(META_MODEL_URI_EDEFAULT);
				return;
			case DsltransPackage.META_MODEL_IDENTIFIER__META_MODEL_NAME:
				setMetaModelName(META_MODEL_NAME_EDEFAULT);
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
			case DsltransPackage.META_MODEL_IDENTIFIER__META_MODEL_URI:
				return META_MODEL_URI_EDEFAULT == null ? metaModelURI != null : !META_MODEL_URI_EDEFAULT.equals(metaModelURI);
			case DsltransPackage.META_MODEL_IDENTIFIER__META_MODEL_NAME:
				return META_MODEL_NAME_EDEFAULT == null ? metaModelName != null : !META_MODEL_NAME_EDEFAULT.equals(metaModelName);
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
		result.append(" (metaModelURI: ");
		result.append(metaModelURI);
		result.append(", metaModelName: ");
		result.append(metaModelName);
		result.append(')');
		return result.toString();
	}

} //MetaModelIdentifierImpl
