/**
 * <copyright>
 * </copyright>
 *
 * $Id: VariableImpl.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.APN.adtmm.impl;

import SATEL.APN.adtmm.AdtmmPackage;
import SATEL.APN.adtmm.Sort;
import SATEL.APN.adtmm.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.APN.adtmm.impl.VariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link SATEL.APN.adtmm.impl.VariableImpl#getVariableSort <em>Variable Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends EObjectImpl implements Variable {
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
	 * The cached value of the '{@link #getVariableSort() <em>Variable Sort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableSort()
	 * @generated
	 * @ordered
	 */
	protected Sort variableSort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdtmmPackage.Literals.VARIABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdtmmPackage.VARIABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sort getVariableSort() {
		return variableSort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableSort(Sort newVariableSort, NotificationChain msgs) {
		Sort oldVariableSort = variableSort;
		variableSort = newVariableSort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdtmmPackage.VARIABLE__VARIABLE_SORT, oldVariableSort, newVariableSort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableSort(Sort newVariableSort) {
		if (newVariableSort != variableSort) {
			NotificationChain msgs = null;
			if (variableSort != null)
				msgs = ((InternalEObject)variableSort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdtmmPackage.VARIABLE__VARIABLE_SORT, null, msgs);
			if (newVariableSort != null)
				msgs = ((InternalEObject)newVariableSort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdtmmPackage.VARIABLE__VARIABLE_SORT, null, msgs);
			msgs = basicSetVariableSort(newVariableSort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdtmmPackage.VARIABLE__VARIABLE_SORT, newVariableSort, newVariableSort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdtmmPackage.VARIABLE__VARIABLE_SORT:
				return basicSetVariableSort(null, msgs);
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
			case AdtmmPackage.VARIABLE__NAME:
				return getName();
			case AdtmmPackage.VARIABLE__VARIABLE_SORT:
				return getVariableSort();
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
			case AdtmmPackage.VARIABLE__NAME:
				setName((String)newValue);
				return;
			case AdtmmPackage.VARIABLE__VARIABLE_SORT:
				setVariableSort((Sort)newValue);
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
			case AdtmmPackage.VARIABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AdtmmPackage.VARIABLE__VARIABLE_SORT:
				setVariableSort((Sort)null);
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
			case AdtmmPackage.VARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AdtmmPackage.VARIABLE__VARIABLE_SORT:
				return variableSort != null;
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

} //VariableImpl
