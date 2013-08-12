/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5.impl;

import Java5.ImportDeclaration;
import Java5.Java5Package;
import Java5.NamedElementRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Java5.impl.ImportDeclarationImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link Java5.impl.ImportDeclarationImpl#getImportedElement <em>Imported Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportDeclarationImpl extends ASTNodeImpl implements ImportDeclaration {
	/**
	 * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean static_ = STATIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImportedElement() <em>Imported Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedElement()
	 * @generated
	 * @ordered
	 */
	protected NamedElementRef importedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java5Package.Literals.IMPORT_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic() {
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(boolean newStatic) {
		boolean oldStatic = static_;
		static_ = newStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.IMPORT_DECLARATION__STATIC, oldStatic, static_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElementRef getImportedElement() {
		return importedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedElement(NamedElementRef newImportedElement, NotificationChain msgs) {
		NamedElementRef oldImportedElement = importedElement;
		importedElement = newImportedElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Java5Package.IMPORT_DECLARATION__IMPORTED_ELEMENT, oldImportedElement, newImportedElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedElement(NamedElementRef newImportedElement) {
		if (newImportedElement != importedElement) {
			NotificationChain msgs = null;
			if (importedElement != null)
				msgs = ((InternalEObject)importedElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java5Package.IMPORT_DECLARATION__IMPORTED_ELEMENT, null, msgs);
			if (newImportedElement != null)
				msgs = ((InternalEObject)newImportedElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java5Package.IMPORT_DECLARATION__IMPORTED_ELEMENT, null, msgs);
			msgs = basicSetImportedElement(newImportedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.IMPORT_DECLARATION__IMPORTED_ELEMENT, newImportedElement, newImportedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java5Package.IMPORT_DECLARATION__IMPORTED_ELEMENT:
				return basicSetImportedElement(null, msgs);
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
			case Java5Package.IMPORT_DECLARATION__STATIC:
				return isStatic();
			case Java5Package.IMPORT_DECLARATION__IMPORTED_ELEMENT:
				return getImportedElement();
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
			case Java5Package.IMPORT_DECLARATION__STATIC:
				setStatic((Boolean)newValue);
				return;
			case Java5Package.IMPORT_DECLARATION__IMPORTED_ELEMENT:
				setImportedElement((NamedElementRef)newValue);
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
			case Java5Package.IMPORT_DECLARATION__STATIC:
				setStatic(STATIC_EDEFAULT);
				return;
			case Java5Package.IMPORT_DECLARATION__IMPORTED_ELEMENT:
				setImportedElement((NamedElementRef)null);
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
			case Java5Package.IMPORT_DECLARATION__STATIC:
				return static_ != STATIC_EDEFAULT;
			case Java5Package.IMPORT_DECLARATION__IMPORTED_ELEMENT:
				return importedElement != null;
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
		result.append(" (static: ");
		result.append(static_);
		result.append(')');
		return result.toString();
	}

} //ImportDeclarationImpl
