/**
 * <copyright>
 * </copyright>
 *
 * $Id: APNImpl.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.APN.apnmm.impl;

import SATEL.APN.adtmm.Variable;

import SATEL.APN.apnmm.APN;
import SATEL.APN.apnmm.ApnmmPackage;
import SATEL.APN.apnmm.Arc;
import SATEL.APN.apnmm.Gate;
import SATEL.APN.apnmm.Method;
import SATEL.APN.apnmm.Place;
import SATEL.APN.apnmm.Transition;

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
 * An implementation of the model object '<em><b>APN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.APN.apnmm.impl.APNImpl#getOwnedPlaces <em>Owned Places</em>}</li>
 *   <li>{@link SATEL.APN.apnmm.impl.APNImpl#getOwnedArcs <em>Owned Arcs</em>}</li>
 *   <li>{@link SATEL.APN.apnmm.impl.APNImpl#getOwnedVariables <em>Owned Variables</em>}</li>
 *   <li>{@link SATEL.APN.apnmm.impl.APNImpl#getName <em>Name</em>}</li>
 *   <li>{@link SATEL.APN.apnmm.impl.APNImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link SATEL.APN.apnmm.impl.APNImpl#getGates <em>Gates</em>}</li>
 *   <li>{@link SATEL.APN.apnmm.impl.APNImpl#getOwnedTransitions <em>Owned Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class APNImpl extends EnvironmentImpl implements APN {
	/**
	 * The cached value of the '{@link #getOwnedPlaces() <em>Owned Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> ownedPlaces;

	/**
	 * The cached value of the '{@link #getOwnedArcs() <em>Owned Arcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> ownedArcs;

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
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> methods;

	/**
	 * The cached value of the '{@link #getGates() <em>Gates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGates()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> gates;

	/**
	 * The cached value of the '{@link #getOwnedTransitions() <em>Owned Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> ownedTransitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApnmmPackage.Literals.APN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Place> getOwnedPlaces() {
		if (ownedPlaces == null) {
			ownedPlaces = new EObjectContainmentEList<Place>(Place.class, this, ApnmmPackage.APN__OWNED_PLACES);
		}
		return ownedPlaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getOwnedArcs() {
		if (ownedArcs == null) {
			ownedArcs = new EObjectContainmentEList<Arc>(Arc.class, this, ApnmmPackage.APN__OWNED_ARCS);
		}
		return ownedArcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getOwnedVariables() {
		if (ownedVariables == null) {
			ownedVariables = new EObjectContainmentEList<Variable>(Variable.class, this, ApnmmPackage.APN__OWNED_VARIABLES);
		}
		return ownedVariables;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApnmmPackage.APN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<Method>(Method.class, this, ApnmmPackage.APN__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gate> getGates() {
		if (gates == null) {
			gates = new EObjectContainmentEList<Gate>(Gate.class, this, ApnmmPackage.APN__GATES);
		}
		return gates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOwnedTransitions() {
		if (ownedTransitions == null) {
			ownedTransitions = new EObjectContainmentEList<Transition>(Transition.class, this, ApnmmPackage.APN__OWNED_TRANSITIONS);
		}
		return ownedTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApnmmPackage.APN__OWNED_PLACES:
				return ((InternalEList<?>)getOwnedPlaces()).basicRemove(otherEnd, msgs);
			case ApnmmPackage.APN__OWNED_ARCS:
				return ((InternalEList<?>)getOwnedArcs()).basicRemove(otherEnd, msgs);
			case ApnmmPackage.APN__OWNED_VARIABLES:
				return ((InternalEList<?>)getOwnedVariables()).basicRemove(otherEnd, msgs);
			case ApnmmPackage.APN__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case ApnmmPackage.APN__GATES:
				return ((InternalEList<?>)getGates()).basicRemove(otherEnd, msgs);
			case ApnmmPackage.APN__OWNED_TRANSITIONS:
				return ((InternalEList<?>)getOwnedTransitions()).basicRemove(otherEnd, msgs);
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
			case ApnmmPackage.APN__OWNED_PLACES:
				return getOwnedPlaces();
			case ApnmmPackage.APN__OWNED_ARCS:
				return getOwnedArcs();
			case ApnmmPackage.APN__OWNED_VARIABLES:
				return getOwnedVariables();
			case ApnmmPackage.APN__NAME:
				return getName();
			case ApnmmPackage.APN__METHODS:
				return getMethods();
			case ApnmmPackage.APN__GATES:
				return getGates();
			case ApnmmPackage.APN__OWNED_TRANSITIONS:
				return getOwnedTransitions();
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
			case ApnmmPackage.APN__OWNED_PLACES:
				getOwnedPlaces().clear();
				getOwnedPlaces().addAll((Collection<? extends Place>)newValue);
				return;
			case ApnmmPackage.APN__OWNED_ARCS:
				getOwnedArcs().clear();
				getOwnedArcs().addAll((Collection<? extends Arc>)newValue);
				return;
			case ApnmmPackage.APN__OWNED_VARIABLES:
				getOwnedVariables().clear();
				getOwnedVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case ApnmmPackage.APN__NAME:
				setName((String)newValue);
				return;
			case ApnmmPackage.APN__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends Method>)newValue);
				return;
			case ApnmmPackage.APN__GATES:
				getGates().clear();
				getGates().addAll((Collection<? extends Gate>)newValue);
				return;
			case ApnmmPackage.APN__OWNED_TRANSITIONS:
				getOwnedTransitions().clear();
				getOwnedTransitions().addAll((Collection<? extends Transition>)newValue);
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
			case ApnmmPackage.APN__OWNED_PLACES:
				getOwnedPlaces().clear();
				return;
			case ApnmmPackage.APN__OWNED_ARCS:
				getOwnedArcs().clear();
				return;
			case ApnmmPackage.APN__OWNED_VARIABLES:
				getOwnedVariables().clear();
				return;
			case ApnmmPackage.APN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApnmmPackage.APN__METHODS:
				getMethods().clear();
				return;
			case ApnmmPackage.APN__GATES:
				getGates().clear();
				return;
			case ApnmmPackage.APN__OWNED_TRANSITIONS:
				getOwnedTransitions().clear();
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
			case ApnmmPackage.APN__OWNED_PLACES:
				return ownedPlaces != null && !ownedPlaces.isEmpty();
			case ApnmmPackage.APN__OWNED_ARCS:
				return ownedArcs != null && !ownedArcs.isEmpty();
			case ApnmmPackage.APN__OWNED_VARIABLES:
				return ownedVariables != null && !ownedVariables.isEmpty();
			case ApnmmPackage.APN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApnmmPackage.APN__METHODS:
				return methods != null && !methods.isEmpty();
			case ApnmmPackage.APN__GATES:
				return gates != null && !gates.isEmpty();
			case ApnmmPackage.APN__OWNED_TRANSITIONS:
				return ownedTransitions != null && !ownedTransitions.isEmpty();
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

} //APNImpl
