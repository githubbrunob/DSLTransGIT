/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5.impl;

import Java5.CompilationUnit;
import Java5.Java5Package;
import Java5.Model;
import Java5.OrphanType;
import Java5.PackageDeclaration;
import Java5.UnresolvedItem;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Java5.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link Java5.impl.ModelImpl#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link Java5.impl.ModelImpl#getOrphanTypes <em>Orphan Types</em>}</li>
 *   <li>{@link Java5.impl.ModelImpl#getUnresolvedItems <em>Unresolved Items</em>}</li>
 *   <li>{@link Java5.impl.ModelImpl#getCompilationUnits <em>Compilation Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends EObjectImpl implements Model {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The cached value of the '{@link #getOwnedElements() <em>Owned Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageDeclaration> ownedElements;

	/**
	 * The cached value of the '{@link #getOrphanTypes() <em>Orphan Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrphanTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<OrphanType> orphanTypes;

	/**
	 * The cached value of the '{@link #getUnresolvedItems() <em>Unresolved Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnresolvedItems()
	 * @generated
	 * @ordered
	 */
	protected EList<UnresolvedItem> unresolvedItems;

	/**
	 * The cached value of the '{@link #getCompilationUnits() <em>Compilation Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompilationUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<CompilationUnit> compilationUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java5Package.Literals.MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageDeclaration> getOwnedElements() {
		if (ownedElements == null) {
			ownedElements = new EObjectContainmentEList<PackageDeclaration>(PackageDeclaration.class, this, Java5Package.MODEL__OWNED_ELEMENTS);
		}
		return ownedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrphanType> getOrphanTypes() {
		if (orphanTypes == null) {
			orphanTypes = new EObjectContainmentEList<OrphanType>(OrphanType.class, this, Java5Package.MODEL__ORPHAN_TYPES);
		}
		return orphanTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnresolvedItem> getUnresolvedItems() {
		if (unresolvedItems == null) {
			unresolvedItems = new EObjectContainmentEList<UnresolvedItem>(UnresolvedItem.class, this, Java5Package.MODEL__UNRESOLVED_ITEMS);
		}
		return unresolvedItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompilationUnit> getCompilationUnits() {
		if (compilationUnits == null) {
			compilationUnits = new EObjectContainmentEList<CompilationUnit>(CompilationUnit.class, this, Java5Package.MODEL__COMPILATION_UNITS);
		}
		return compilationUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java5Package.MODEL__OWNED_ELEMENTS:
				return ((InternalEList<?>)getOwnedElements()).basicRemove(otherEnd, msgs);
			case Java5Package.MODEL__ORPHAN_TYPES:
				return ((InternalEList<?>)getOrphanTypes()).basicRemove(otherEnd, msgs);
			case Java5Package.MODEL__UNRESOLVED_ITEMS:
				return ((InternalEList<?>)getUnresolvedItems()).basicRemove(otherEnd, msgs);
			case Java5Package.MODEL__COMPILATION_UNITS:
				return ((InternalEList<?>)getCompilationUnits()).basicRemove(otherEnd, msgs);
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
			case Java5Package.MODEL__NAME:
				return getName();
			case Java5Package.MODEL__OWNED_ELEMENTS:
				return getOwnedElements();
			case Java5Package.MODEL__ORPHAN_TYPES:
				return getOrphanTypes();
			case Java5Package.MODEL__UNRESOLVED_ITEMS:
				return getUnresolvedItems();
			case Java5Package.MODEL__COMPILATION_UNITS:
				return getCompilationUnits();
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
			case Java5Package.MODEL__NAME:
				setName((String)newValue);
				return;
			case Java5Package.MODEL__OWNED_ELEMENTS:
				getOwnedElements().clear();
				getOwnedElements().addAll((Collection<? extends PackageDeclaration>)newValue);
				return;
			case Java5Package.MODEL__ORPHAN_TYPES:
				getOrphanTypes().clear();
				getOrphanTypes().addAll((Collection<? extends OrphanType>)newValue);
				return;
			case Java5Package.MODEL__UNRESOLVED_ITEMS:
				getUnresolvedItems().clear();
				getUnresolvedItems().addAll((Collection<? extends UnresolvedItem>)newValue);
				return;
			case Java5Package.MODEL__COMPILATION_UNITS:
				getCompilationUnits().clear();
				getCompilationUnits().addAll((Collection<? extends CompilationUnit>)newValue);
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
			case Java5Package.MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Java5Package.MODEL__OWNED_ELEMENTS:
				getOwnedElements().clear();
				return;
			case Java5Package.MODEL__ORPHAN_TYPES:
				getOrphanTypes().clear();
				return;
			case Java5Package.MODEL__UNRESOLVED_ITEMS:
				getUnresolvedItems().clear();
				return;
			case Java5Package.MODEL__COMPILATION_UNITS:
				getCompilationUnits().clear();
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
			case Java5Package.MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Java5Package.MODEL__OWNED_ELEMENTS:
				return ownedElements != null && !ownedElements.isEmpty();
			case Java5Package.MODEL__ORPHAN_TYPES:
				return orphanTypes != null && !orphanTypes.isEmpty();
			case Java5Package.MODEL__UNRESOLVED_ITEMS:
				return unresolvedItems != null && !unresolvedItems.isEmpty();
			case Java5Package.MODEL__COMPILATION_UNITS:
				return compilationUnits != null && !compilationUnits.isEmpty();
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

} //ModelImpl
