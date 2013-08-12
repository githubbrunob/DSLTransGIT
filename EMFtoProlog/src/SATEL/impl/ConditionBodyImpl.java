/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConditionBodyImpl.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.impl;

import SATEL.ConditionAtom;
import SATEL.ConditionBody;
import SATEL.SATELPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.impl.ConditionBodyImpl#getConditionAtom <em>Condition Atom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionBodyImpl extends EObjectImpl implements ConditionBody {
	/**
	 * The cached value of the '{@link #getConditionAtom() <em>Condition Atom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionAtom()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionAtom> conditionAtom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SATELPackage.Literals.CONDITION_BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionAtom> getConditionAtom() {
		if (conditionAtom == null) {
			conditionAtom = new EObjectContainmentEList<ConditionAtom>(ConditionAtom.class, this, SATELPackage.CONDITION_BODY__CONDITION_ATOM);
		}
		return conditionAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SATELPackage.CONDITION_BODY__CONDITION_ATOM:
				return ((InternalEList<?>)getConditionAtom()).basicRemove(otherEnd, msgs);
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
			case SATELPackage.CONDITION_BODY__CONDITION_ATOM:
				return getConditionAtom();
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
			case SATELPackage.CONDITION_BODY__CONDITION_ATOM:
				getConditionAtom().clear();
				getConditionAtom().addAll((Collection<? extends ConditionAtom>)newValue);
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
			case SATELPackage.CONDITION_BODY__CONDITION_ATOM:
				getConditionAtom().clear();
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
			case SATELPackage.CONDITION_BODY__CONDITION_ATOM:
				return conditionAtom != null && !conditionAtom.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConditionBodyImpl
