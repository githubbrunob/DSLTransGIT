/**
 * <copyright>
 * </copyright>
 *
 * $Id: NameListImpl.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.impl;

import SATEL.NameList;
import SATEL.SATELPackage;

import SATEL.VariableDeclarations.VariableDec;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.impl.NameListImpl#getNameRef <em>Name Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NameListImpl extends EObjectImpl implements NameList {
	/**
	 * The cached value of the '{@link #getNameRef() <em>Name Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameRef()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDec> nameRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SATELPackage.Literals.NAME_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDec> getNameRef() {
		if (nameRef == null) {
			nameRef = new EObjectResolvingEList<VariableDec>(VariableDec.class, this, SATELPackage.NAME_LIST__NAME_REF);
		}
		return nameRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SATELPackage.NAME_LIST__NAME_REF:
				return getNameRef();
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
			case SATELPackage.NAME_LIST__NAME_REF:
				getNameRef().clear();
				getNameRef().addAll((Collection<? extends VariableDec>)newValue);
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
			case SATELPackage.NAME_LIST__NAME_REF:
				getNameRef().clear();
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
			case SATELPackage.NAME_LIST__NAME_REF:
				return nameRef != null && !nameRef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NameListImpl
