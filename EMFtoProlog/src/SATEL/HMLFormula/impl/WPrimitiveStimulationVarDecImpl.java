/**
 * <copyright>
 * </copyright>
 *
 * $Id: WPrimitiveStimulationVarDecImpl.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.HMLFormula.impl;

import SATEL.HMLFormula.HMLFormulaPackage;
import SATEL.HMLFormula.WPrimitiveStimulationVarDec;

import SATEL.VariableDeclarations.PrimitiveStimulationVarDec;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WPrimitive Stimulation Var Dec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.HMLFormula.impl.WPrimitiveStimulationVarDecImpl#getPrimitiveStimulation <em>Primitive Stimulation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WPrimitiveStimulationVarDecImpl extends SynchronizationInputTermImpl implements WPrimitiveStimulationVarDec {
	/**
	 * The cached value of the '{@link #getPrimitiveStimulation() <em>Primitive Stimulation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveStimulation()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveStimulationVarDec primitiveStimulation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WPrimitiveStimulationVarDecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HMLFormulaPackage.Literals.WPRIMITIVE_STIMULATION_VAR_DEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveStimulationVarDec getPrimitiveStimulation() {
		if (primitiveStimulation != null && primitiveStimulation.eIsProxy()) {
			InternalEObject oldPrimitiveStimulation = (InternalEObject)primitiveStimulation;
			primitiveStimulation = (PrimitiveStimulationVarDec)eResolveProxy(oldPrimitiveStimulation);
			if (primitiveStimulation != oldPrimitiveStimulation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HMLFormulaPackage.WPRIMITIVE_STIMULATION_VAR_DEC__PRIMITIVE_STIMULATION, oldPrimitiveStimulation, primitiveStimulation));
			}
		}
		return primitiveStimulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveStimulationVarDec basicGetPrimitiveStimulation() {
		return primitiveStimulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitiveStimulation(PrimitiveStimulationVarDec newPrimitiveStimulation) {
		PrimitiveStimulationVarDec oldPrimitiveStimulation = primitiveStimulation;
		primitiveStimulation = newPrimitiveStimulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HMLFormulaPackage.WPRIMITIVE_STIMULATION_VAR_DEC__PRIMITIVE_STIMULATION, oldPrimitiveStimulation, primitiveStimulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HMLFormulaPackage.WPRIMITIVE_STIMULATION_VAR_DEC__PRIMITIVE_STIMULATION:
				if (resolve) return getPrimitiveStimulation();
				return basicGetPrimitiveStimulation();
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
			case HMLFormulaPackage.WPRIMITIVE_STIMULATION_VAR_DEC__PRIMITIVE_STIMULATION:
				setPrimitiveStimulation((PrimitiveStimulationVarDec)newValue);
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
			case HMLFormulaPackage.WPRIMITIVE_STIMULATION_VAR_DEC__PRIMITIVE_STIMULATION:
				setPrimitiveStimulation((PrimitiveStimulationVarDec)null);
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
			case HMLFormulaPackage.WPRIMITIVE_STIMULATION_VAR_DEC__PRIMITIVE_STIMULATION:
				return primitiveStimulation != null;
		}
		return super.eIsSet(featureID);
	}

} //WPrimitiveStimulationVarDecImpl
