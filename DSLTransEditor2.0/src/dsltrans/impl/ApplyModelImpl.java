/**
 */
package dsltrans.impl;

import dsltrans.ApplyAssociation;
import dsltrans.ApplyClass;
import dsltrans.ApplyModel;
import dsltrans.DsltransPackage;

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
 * An implementation of the model object '<em><b>Apply Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsltrans.impl.ApplyModelImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link dsltrans.impl.ApplyModelImpl#getAssociation <em>Association</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplyModelImpl extends EObjectImpl implements ApplyModel {
	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplyClass> class_;

	/**
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplyAssociation> association;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplyModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsltransPackage.Literals.APPLY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplyClass> getClass_() {
		if (class_ == null) {
			class_ = new EObjectContainmentEList<ApplyClass>(ApplyClass.class, this, DsltransPackage.APPLY_MODEL__CLASS);
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplyAssociation> getAssociation() {
		if (association == null) {
			association = new EObjectContainmentEList<ApplyAssociation>(ApplyAssociation.class, this, DsltransPackage.APPLY_MODEL__ASSOCIATION);
		}
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsltransPackage.APPLY_MODEL__CLASS:
				return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
			case DsltransPackage.APPLY_MODEL__ASSOCIATION:
				return ((InternalEList<?>)getAssociation()).basicRemove(otherEnd, msgs);
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
			case DsltransPackage.APPLY_MODEL__CLASS:
				return getClass_();
			case DsltransPackage.APPLY_MODEL__ASSOCIATION:
				return getAssociation();
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
			case DsltransPackage.APPLY_MODEL__CLASS:
				getClass_().clear();
				getClass_().addAll((Collection<? extends ApplyClass>)newValue);
				return;
			case DsltransPackage.APPLY_MODEL__ASSOCIATION:
				getAssociation().clear();
				getAssociation().addAll((Collection<? extends ApplyAssociation>)newValue);
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
			case DsltransPackage.APPLY_MODEL__CLASS:
				getClass_().clear();
				return;
			case DsltransPackage.APPLY_MODEL__ASSOCIATION:
				getAssociation().clear();
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
			case DsltransPackage.APPLY_MODEL__CLASS:
				return class_ != null && !class_.isEmpty();
			case DsltransPackage.APPLY_MODEL__ASSOCIATION:
				return association != null && !association.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ApplyModelImpl
