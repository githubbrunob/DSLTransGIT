/**
 * <copyright>
 * </copyright>
 *
 * $Id: ADTImpl.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.APN.adtmm.impl;

import SATEL.APN.adtmm.ADT;
import SATEL.APN.adtmm.AdtmmPackage;
import SATEL.APN.adtmm.CondEquation;
import SATEL.APN.adtmm.Operation;
import SATEL.APN.adtmm.SortDeclaration;
import SATEL.APN.adtmm.Variable;

import SATEL.APN.environmentmm.impl.EnvironmentImpl;

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
 * An implementation of the model object '<em><b>ADT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.APN.adtmm.impl.ADTImpl#getOwnedSorts <em>Owned Sorts</em>}</li>
 *   <li>{@link SATEL.APN.adtmm.impl.ADTImpl#getOwnedOperations <em>Owned Operations</em>}</li>
 *   <li>{@link SATEL.APN.adtmm.impl.ADTImpl#getOwnedGenerators <em>Owned Generators</em>}</li>
 *   <li>{@link SATEL.APN.adtmm.impl.ADTImpl#getOwnedVariables <em>Owned Variables</em>}</li>
 *   <li>{@link SATEL.APN.adtmm.impl.ADTImpl#getOwnedAxioms <em>Owned Axioms</em>}</li>
 *   <li>{@link SATEL.APN.adtmm.impl.ADTImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ADTImpl extends EnvironmentImpl implements ADT {
	/**
	 * The cached value of the '{@link #getOwnedSorts() <em>Owned Sorts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSorts()
	 * @generated
	 * @ordered
	 */
	protected EList<SortDeclaration> ownedSorts;

	/**
	 * The cached value of the '{@link #getOwnedOperations() <em>Owned Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> ownedOperations;

	/**
	 * The cached value of the '{@link #getOwnedGenerators() <em>Owned Generators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedGenerators()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> ownedGenerators;

	/**
	 * The cached value of the '{@link #getOwnedVariables() <em>Owned Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> ownedVariables;

	/**
	 * The cached value of the '{@link #getOwnedAxioms() <em>Owned Axioms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAxioms()
	 * @generated
	 * @ordered
	 */
	protected EList<CondEquation> ownedAxioms;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ADTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdtmmPackage.Literals.ADT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SortDeclaration> getOwnedSorts() {
		if (ownedSorts == null) {
			ownedSorts = new EObjectContainmentEList<SortDeclaration>(SortDeclaration.class, this, AdtmmPackage.ADT__OWNED_SORTS);
		}
		return ownedSorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOwnedOperations() {
		if (ownedOperations == null) {
			ownedOperations = new EObjectContainmentEList<Operation>(Operation.class, this, AdtmmPackage.ADT__OWNED_OPERATIONS);
		}
		return ownedOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOwnedGenerators() {
		if (ownedGenerators == null) {
			ownedGenerators = new EObjectContainmentEList<Operation>(Operation.class, this, AdtmmPackage.ADT__OWNED_GENERATORS);
		}
		return ownedGenerators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getOwnedVariables() {
		if (ownedVariables == null) {
			ownedVariables = new EObjectContainmentEList<Variable>(Variable.class, this, AdtmmPackage.ADT__OWNED_VARIABLES);
		}
		return ownedVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CondEquation> getOwnedAxioms() {
		if (ownedAxioms == null) {
			ownedAxioms = new EObjectContainmentEList<CondEquation>(CondEquation.class, this, AdtmmPackage.ADT__OWNED_AXIOMS);
		}
		return ownedAxioms;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdtmmPackage.ADT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdtmmPackage.ADT__OWNED_SORTS:
				return ((InternalEList<?>)getOwnedSorts()).basicRemove(otherEnd, msgs);
			case AdtmmPackage.ADT__OWNED_OPERATIONS:
				return ((InternalEList<?>)getOwnedOperations()).basicRemove(otherEnd, msgs);
			case AdtmmPackage.ADT__OWNED_GENERATORS:
				return ((InternalEList<?>)getOwnedGenerators()).basicRemove(otherEnd, msgs);
			case AdtmmPackage.ADT__OWNED_VARIABLES:
				return ((InternalEList<?>)getOwnedVariables()).basicRemove(otherEnd, msgs);
			case AdtmmPackage.ADT__OWNED_AXIOMS:
				return ((InternalEList<?>)getOwnedAxioms()).basicRemove(otherEnd, msgs);
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
			case AdtmmPackage.ADT__OWNED_SORTS:
				return getOwnedSorts();
			case AdtmmPackage.ADT__OWNED_OPERATIONS:
				return getOwnedOperations();
			case AdtmmPackage.ADT__OWNED_GENERATORS:
				return getOwnedGenerators();
			case AdtmmPackage.ADT__OWNED_VARIABLES:
				return getOwnedVariables();
			case AdtmmPackage.ADT__OWNED_AXIOMS:
				return getOwnedAxioms();
			case AdtmmPackage.ADT__NAME:
				return getName();
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
			case AdtmmPackage.ADT__OWNED_SORTS:
				getOwnedSorts().clear();
				getOwnedSorts().addAll((Collection<? extends SortDeclaration>)newValue);
				return;
			case AdtmmPackage.ADT__OWNED_OPERATIONS:
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case AdtmmPackage.ADT__OWNED_GENERATORS:
				getOwnedGenerators().clear();
				getOwnedGenerators().addAll((Collection<? extends Operation>)newValue);
				return;
			case AdtmmPackage.ADT__OWNED_VARIABLES:
				getOwnedVariables().clear();
				getOwnedVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case AdtmmPackage.ADT__OWNED_AXIOMS:
				getOwnedAxioms().clear();
				getOwnedAxioms().addAll((Collection<? extends CondEquation>)newValue);
				return;
			case AdtmmPackage.ADT__NAME:
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
			case AdtmmPackage.ADT__OWNED_SORTS:
				getOwnedSorts().clear();
				return;
			case AdtmmPackage.ADT__OWNED_OPERATIONS:
				getOwnedOperations().clear();
				return;
			case AdtmmPackage.ADT__OWNED_GENERATORS:
				getOwnedGenerators().clear();
				return;
			case AdtmmPackage.ADT__OWNED_VARIABLES:
				getOwnedVariables().clear();
				return;
			case AdtmmPackage.ADT__OWNED_AXIOMS:
				getOwnedAxioms().clear();
				return;
			case AdtmmPackage.ADT__NAME:
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
			case AdtmmPackage.ADT__OWNED_SORTS:
				return ownedSorts != null && !ownedSorts.isEmpty();
			case AdtmmPackage.ADT__OWNED_OPERATIONS:
				return ownedOperations != null && !ownedOperations.isEmpty();
			case AdtmmPackage.ADT__OWNED_GENERATORS:
				return ownedGenerators != null && !ownedGenerators.isEmpty();
			case AdtmmPackage.ADT__OWNED_VARIABLES:
				return ownedVariables != null && !ownedVariables.isEmpty();
			case AdtmmPackage.ADT__OWNED_AXIOMS:
				return ownedAxioms != null && !ownedAxioms.isEmpty();
			case AdtmmPackage.ADT__NAME:
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

} //ADTImpl
