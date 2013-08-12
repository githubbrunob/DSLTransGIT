/**
 * <copyright>
 * </copyright>
 *
 * $Id: GuardImpl.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.APN.guardmm.impl;

import SATEL.APN.adtmm.AbstractEquation;
import SATEL.APN.adtmm.Variable;

import SATEL.APN.environmentmm.impl.EnvironmentImpl;

import SATEL.APN.guardmm.Guard;
import SATEL.APN.guardmm.GuardmmPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.APN.guardmm.impl.GuardImpl#getOwnedEquations <em>Owned Equations</em>}</li>
 *   <li>{@link SATEL.APN.guardmm.impl.GuardImpl#getOwnedVariables <em>Owned Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuardImpl extends EnvironmentImpl implements Guard {
	/**
	 * The cached value of the '{@link #getOwnedEquations() <em>Owned Equations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEquations()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractEquation> ownedEquations;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuardmmPackage.Literals.GUARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractEquation> getOwnedEquations() {
		if (ownedEquations == null) {
			ownedEquations = new EObjectContainmentEList<AbstractEquation>(AbstractEquation.class, this, GuardmmPackage.GUARD__OWNED_EQUATIONS);
		}
		return ownedEquations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getOwnedVariables() {
		if (ownedVariables == null) {
			ownedVariables = new EObjectContainmentEList<Variable>(Variable.class, this, GuardmmPackage.GUARD__OWNED_VARIABLES);
		}
		return ownedVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuardmmPackage.GUARD__OWNED_EQUATIONS:
				return ((InternalEList<?>)getOwnedEquations()).basicRemove(otherEnd, msgs);
			case GuardmmPackage.GUARD__OWNED_VARIABLES:
				return ((InternalEList<?>)getOwnedVariables()).basicRemove(otherEnd, msgs);
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
			case GuardmmPackage.GUARD__OWNED_EQUATIONS:
				return getOwnedEquations();
			case GuardmmPackage.GUARD__OWNED_VARIABLES:
				return getOwnedVariables();
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
			case GuardmmPackage.GUARD__OWNED_EQUATIONS:
				getOwnedEquations().clear();
				getOwnedEquations().addAll((Collection<? extends AbstractEquation>)newValue);
				return;
			case GuardmmPackage.GUARD__OWNED_VARIABLES:
				getOwnedVariables().clear();
				getOwnedVariables().addAll((Collection<? extends Variable>)newValue);
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
			case GuardmmPackage.GUARD__OWNED_EQUATIONS:
				getOwnedEquations().clear();
				return;
			case GuardmmPackage.GUARD__OWNED_VARIABLES:
				getOwnedVariables().clear();
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
			case GuardmmPackage.GUARD__OWNED_EQUATIONS:
				return ownedEquations != null && !ownedEquations.isEmpty();
			case GuardmmPackage.GUARD__OWNED_VARIABLES:
				return ownedVariables != null && !ownedVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GuardImpl
