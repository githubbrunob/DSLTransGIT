/**
 * <copyright>
 * </copyright>
 *
 * $Id: AxiomDeclarationImpl.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.impl;

import SATEL.Axiom;
import SATEL.AxiomDeclaration;
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
 * An implementation of the model object '<em><b>Axiom Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.impl.AxiomDeclarationImpl#getAxiom <em>Axiom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AxiomDeclarationImpl extends EObjectImpl implements AxiomDeclaration {
	/**
	 * The cached value of the '{@link #getAxiom() <em>Axiom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxiom()
	 * @generated
	 * @ordered
	 */
	protected EList<Axiom> axiom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxiomDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SATELPackage.Literals.AXIOM_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Axiom> getAxiom() {
		if (axiom == null) {
			axiom = new EObjectContainmentEList<Axiom>(Axiom.class, this, SATELPackage.AXIOM_DECLARATION__AXIOM);
		}
		return axiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SATELPackage.AXIOM_DECLARATION__AXIOM:
				return ((InternalEList<?>)getAxiom()).basicRemove(otherEnd, msgs);
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
			case SATELPackage.AXIOM_DECLARATION__AXIOM:
				return getAxiom();
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
			case SATELPackage.AXIOM_DECLARATION__AXIOM:
				getAxiom().clear();
				getAxiom().addAll((Collection<? extends Axiom>)newValue);
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
			case SATELPackage.AXIOM_DECLARATION__AXIOM:
				getAxiom().clear();
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
			case SATELPackage.AXIOM_DECLARATION__AXIOM:
				return axiom != null && !axiom.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AxiomDeclarationImpl
