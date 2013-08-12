/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5.impl;

import Java5.AbstractTypeDeclaration;
import Java5.BodyDeclaration;
import Java5.ImportDeclaration;
import Java5.Java5Package;
import Java5.NamedElementRef;
import Java5.PackageDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Java5.impl.AbstractTypeDeclarationImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link Java5.impl.AbstractTypeDeclarationImpl#getBodyDeclarations <em>Body Declarations</em>}</li>
 *   <li>{@link Java5.impl.AbstractTypeDeclarationImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link Java5.impl.AbstractTypeDeclarationImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link Java5.impl.AbstractTypeDeclarationImpl#getSuperInterfaces <em>Super Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractTypeDeclarationImpl extends BodyDeclarationImpl implements AbstractTypeDeclaration {
	/**
	 * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected String qualifiedName = QUALIFIED_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBodyDeclarations() <em>Body Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<BodyDeclaration> bodyDeclarations;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportDeclaration> imports;

	/**
	 * The cached value of the '{@link #getSuperInterfaces() <em>Super Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElementRef> superInterfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTypeDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java5Package.Literals.ABSTRACT_TYPE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedName() {
		return qualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedName(String newQualifiedName) {
		String oldQualifiedName = qualifiedName;
		qualifiedName = newQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.ABSTRACT_TYPE_DECLARATION__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BodyDeclaration> getBodyDeclarations() {
		if (bodyDeclarations == null) {
			bodyDeclarations = new EObjectContainmentWithInverseEList<BodyDeclaration>(BodyDeclaration.class, this, Java5Package.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS, Java5Package.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION);
		}
		return bodyDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportDeclaration> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<ImportDeclaration>(ImportDeclaration.class, this, Java5Package.ABSTRACT_TYPE_DECLARATION__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageDeclaration getPackage() {
		if (eContainerFeatureID() != Java5Package.ABSTRACT_TYPE_DECLARATION__PACKAGE) return null;
		return (PackageDeclaration)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(PackageDeclaration newPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackage, Java5Package.ABSTRACT_TYPE_DECLARATION__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(PackageDeclaration newPackage) {
		if (newPackage != eInternalContainer() || (eContainerFeatureID() != Java5Package.ABSTRACT_TYPE_DECLARATION__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, Java5Package.PACKAGE_DECLARATION__OWNED_ELEMENTS, PackageDeclaration.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.ABSTRACT_TYPE_DECLARATION__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElementRef> getSuperInterfaces() {
		if (superInterfaces == null) {
			superInterfaces = new EObjectContainmentEList<NamedElementRef>(NamedElementRef.class, this, Java5Package.ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES);
		}
		return superInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java5Package.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBodyDeclarations()).basicAdd(otherEnd, msgs);
			case Java5Package.ABSTRACT_TYPE_DECLARATION__PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackage((PackageDeclaration)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java5Package.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS:
				return ((InternalEList<?>)getBodyDeclarations()).basicRemove(otherEnd, msgs);
			case Java5Package.ABSTRACT_TYPE_DECLARATION__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case Java5Package.ABSTRACT_TYPE_DECLARATION__PACKAGE:
				return basicSetPackage(null, msgs);
			case Java5Package.ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES:
				return ((InternalEList<?>)getSuperInterfaces()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Java5Package.ABSTRACT_TYPE_DECLARATION__PACKAGE:
				return eInternalContainer().eInverseRemove(this, Java5Package.PACKAGE_DECLARATION__OWNED_ELEMENTS, PackageDeclaration.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java5Package.ABSTRACT_TYPE_DECLARATION__QUALIFIED_NAME:
				return getQualifiedName();
			case Java5Package.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS:
				return getBodyDeclarations();
			case Java5Package.ABSTRACT_TYPE_DECLARATION__IMPORTS:
				return getImports();
			case Java5Package.ABSTRACT_TYPE_DECLARATION__PACKAGE:
				return getPackage();
			case Java5Package.ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES:
				return getSuperInterfaces();
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
			case Java5Package.ABSTRACT_TYPE_DECLARATION__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case Java5Package.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS:
				getBodyDeclarations().clear();
				getBodyDeclarations().addAll((Collection<? extends BodyDeclaration>)newValue);
				return;
			case Java5Package.ABSTRACT_TYPE_DECLARATION__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends ImportDeclaration>)newValue);
				return;
			case Java5Package.ABSTRACT_TYPE_DECLARATION__PACKAGE:
				setPackage((PackageDeclaration)newValue);
				return;
			case Java5Package.ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES:
				getSuperInterfaces().clear();
				getSuperInterfaces().addAll((Collection<? extends NamedElementRef>)newValue);
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
			case Java5Package.ABSTRACT_TYPE_DECLARATION__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
				return;
			case Java5Package.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS:
				getBodyDeclarations().clear();
				return;
			case Java5Package.ABSTRACT_TYPE_DECLARATION__IMPORTS:
				getImports().clear();
				return;
			case Java5Package.ABSTRACT_TYPE_DECLARATION__PACKAGE:
				setPackage((PackageDeclaration)null);
				return;
			case Java5Package.ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES:
				getSuperInterfaces().clear();
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
			case Java5Package.ABSTRACT_TYPE_DECLARATION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
			case Java5Package.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS:
				return bodyDeclarations != null && !bodyDeclarations.isEmpty();
			case Java5Package.ABSTRACT_TYPE_DECLARATION__IMPORTS:
				return imports != null && !imports.isEmpty();
			case Java5Package.ABSTRACT_TYPE_DECLARATION__PACKAGE:
				return getPackage() != null;
			case Java5Package.ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES:
				return superInterfaces != null && !superInterfaces.isEmpty();
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
		result.append(" (qualifiedName: ");
		result.append(qualifiedName);
		result.append(')');
		return result.toString();
	}

} //AbstractTypeDeclarationImpl
