/**
 * <copyright>
 * </copyright>
 *
 * $Id: DirectoryImpl.java,v 1.1 2011/08/26 23:25:13 bfb Exp $
 */
package Text.impl;

import Text.Directory;
import Text.File;
import Text.TextPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Text.impl.DirectoryImpl#getDirectory <em>Directory</em>}</li>
 *   <li>{@link Text.impl.DirectoryImpl#getFile <em>File</em>}</li>
 *   <li>{@link Text.impl.DirectoryImpl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DirectoryImpl extends NamedElementImpl implements Directory {
	/**
	 * The cached value of the '{@link #getDirectory() <em>Directory</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectory()
	 * @generated
	 * @ordered
	 */
	protected EList<Directory> directory;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected EList<File> file;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.Literals.DIRECTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Directory> getDirectory() {
		if (directory == null) {
			directory = new EObjectContainmentEList<Directory>(Directory.class, this, TextPackage.DIRECTORY__DIRECTORY);
		}
		return directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getFile() {
		if (file == null) {
			file = new EObjectContainmentEList<File>(File.class, this, TextPackage.DIRECTORY__FILE);
		}
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.DIRECTORY__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.DIRECTORY__DIRECTORY:
				return ((InternalEList<?>)getDirectory()).basicRemove(otherEnd, msgs);
			case TextPackage.DIRECTORY__FILE:
				return ((InternalEList<?>)getFile()).basicRemove(otherEnd, msgs);
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
			case TextPackage.DIRECTORY__DIRECTORY:
				return getDirectory();
			case TextPackage.DIRECTORY__FILE:
				return getFile();
			case TextPackage.DIRECTORY__PATH:
				return getPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TextPackage.DIRECTORY__DIRECTORY:
				getDirectory().clear();
				getDirectory().addAll((Collection<? extends Directory>)newValue);
				return;
			case TextPackage.DIRECTORY__FILE:
				getFile().clear();
				getFile().addAll((Collection<? extends File>)newValue);
				return;
			case TextPackage.DIRECTORY__PATH:
				setPath((String)newValue);
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
			case TextPackage.DIRECTORY__DIRECTORY:
				getDirectory().clear();
				return;
			case TextPackage.DIRECTORY__FILE:
				getFile().clear();
				return;
			case TextPackage.DIRECTORY__PATH:
				setPath(PATH_EDEFAULT);
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
			case TextPackage.DIRECTORY__DIRECTORY:
				return directory != null && !directory.isEmpty();
			case TextPackage.DIRECTORY__FILE:
				return file != null && !file.isEmpty();
			case TextPackage.DIRECTORY__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
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
		result.append(" (path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //DirectoryImpl
