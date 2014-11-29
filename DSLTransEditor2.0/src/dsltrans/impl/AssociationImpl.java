/**
 */
package dsltrans.impl;

import dsltrans.Association;
import dsltrans.DsltransPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsltrans.impl.AssociationImpl#getAssociationName <em>Association Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AssociationImpl extends EObjectImpl implements Association {
	/**
	 * The default value of the '{@link #getAssociationName() <em>Association Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationName()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociationName() <em>Association Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationName()
	 * @generated
	 * @ordered
	 */
	protected String associationName = ASSOCIATION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsltransPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssociationName() {
		return associationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationName(String newAssociationName) {
		String oldAssociationName = associationName;
		associationName = newAssociationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsltransPackage.ASSOCIATION__ASSOCIATION_NAME, oldAssociationName, associationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsltransPackage.ASSOCIATION__ASSOCIATION_NAME:
				return getAssociationName();
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
			case DsltransPackage.ASSOCIATION__ASSOCIATION_NAME:
				setAssociationName((String)newValue);
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
			case DsltransPackage.ASSOCIATION__ASSOCIATION_NAME:
				setAssociationName(ASSOCIATION_NAME_EDEFAULT);
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
			case DsltransPackage.ASSOCIATION__ASSOCIATION_NAME:
				return ASSOCIATION_NAME_EDEFAULT == null ? associationName != null : !ASSOCIATION_NAME_EDEFAULT.equals(associationName);
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
		result.append(" (associationName: ");
		result.append(associationName);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl
