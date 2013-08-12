/**
 * <copyright>
 * </copyright>
 *
 * $Id: WPrimitiveObservationVarDecImpl.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.HMLFormula.impl;

import SATEL.HMLFormula.HMLFormulaPackage;
import SATEL.HMLFormula.WPrimitiveObservationVarDec;

import SATEL.VariableDeclarations.PrimitiveObservationVarDec;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WPrimitive Observation Var Dec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.HMLFormula.impl.WPrimitiveObservationVarDecImpl#getPrimitiveObservation <em>Primitive Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WPrimitiveObservationVarDecImpl extends SynchronizationOutputTermImpl implements WPrimitiveObservationVarDec {
	/**
	 * The cached value of the '{@link #getPrimitiveObservation() <em>Primitive Observation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveObservation()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveObservationVarDec primitiveObservation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WPrimitiveObservationVarDecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HMLFormulaPackage.Literals.WPRIMITIVE_OBSERVATION_VAR_DEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveObservationVarDec getPrimitiveObservation() {
		if (primitiveObservation != null && primitiveObservation.eIsProxy()) {
			InternalEObject oldPrimitiveObservation = (InternalEObject)primitiveObservation;
			primitiveObservation = (PrimitiveObservationVarDec)eResolveProxy(oldPrimitiveObservation);
			if (primitiveObservation != oldPrimitiveObservation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HMLFormulaPackage.WPRIMITIVE_OBSERVATION_VAR_DEC__PRIMITIVE_OBSERVATION, oldPrimitiveObservation, primitiveObservation));
			}
		}
		return primitiveObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveObservationVarDec basicGetPrimitiveObservation() {
		return primitiveObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitiveObservation(PrimitiveObservationVarDec newPrimitiveObservation) {
		PrimitiveObservationVarDec oldPrimitiveObservation = primitiveObservation;
		primitiveObservation = newPrimitiveObservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HMLFormulaPackage.WPRIMITIVE_OBSERVATION_VAR_DEC__PRIMITIVE_OBSERVATION, oldPrimitiveObservation, primitiveObservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HMLFormulaPackage.WPRIMITIVE_OBSERVATION_VAR_DEC__PRIMITIVE_OBSERVATION:
				if (resolve) return getPrimitiveObservation();
				return basicGetPrimitiveObservation();
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
			case HMLFormulaPackage.WPRIMITIVE_OBSERVATION_VAR_DEC__PRIMITIVE_OBSERVATION:
				setPrimitiveObservation((PrimitiveObservationVarDec)newValue);
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
			case HMLFormulaPackage.WPRIMITIVE_OBSERVATION_VAR_DEC__PRIMITIVE_OBSERVATION:
				setPrimitiveObservation((PrimitiveObservationVarDec)null);
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
			case HMLFormulaPackage.WPRIMITIVE_OBSERVATION_VAR_DEC__PRIMITIVE_OBSERVATION:
				return primitiveObservation != null;
		}
		return super.eIsSet(featureID);
	}

} //WPrimitiveObservationVarDecImpl
