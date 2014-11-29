/**
 */
package dsltrans.impl;

import dsltrans.DsltransPackage;
import dsltrans.FilePort;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsltrans.impl.FilePortImpl#getFilePathURI <em>File Path URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilePortImpl extends AbstractSourceImpl implements FilePort {
	/**
	 * The default value of the '{@link #getFilePathURI() <em>File Path URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePathURI()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_PATH_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilePathURI() <em>File Path URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePathURI()
	 * @generated
	 * @ordered
	 */
	protected String filePathURI = FILE_PATH_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilePortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsltransPackage.Literals.FILE_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilePathURI() {
		return filePathURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilePathURI(String newFilePathURI) {
		String oldFilePathURI = filePathURI;
		filePathURI = newFilePathURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsltransPackage.FILE_PORT__FILE_PATH_URI, oldFilePathURI, filePathURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsltransPackage.FILE_PORT__FILE_PATH_URI:
				return getFilePathURI();
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
			case DsltransPackage.FILE_PORT__FILE_PATH_URI:
				setFilePathURI((String)newValue);
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
			case DsltransPackage.FILE_PORT__FILE_PATH_URI:
				setFilePathURI(FILE_PATH_URI_EDEFAULT);
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
			case DsltransPackage.FILE_PORT__FILE_PATH_URI:
				return FILE_PATH_URI_EDEFAULT == null ? filePathURI != null : !FILE_PATH_URI_EDEFAULT.equals(filePathURI);
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
		result.append(" (filePathURI: ");
		result.append(filePathURI);
		result.append(')');
		return result.toString();
	}

} //FilePortImpl
