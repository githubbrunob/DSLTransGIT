/**
 * <copyright>
 * </copyright>
 *
 * $Id: HMLFormulaPrimitiveHMLVarDecImpl.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.HMLFormula.impl;

import SATEL.HMLFormula.HMLFormulaPackage;
import SATEL.HMLFormula.HMLFormulaPrimitiveHMLVarDec;

import SATEL.VariableDeclarations.PrimitiveHMLVarDec;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive HML Var Dec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.HMLFormula.impl.HMLFormulaPrimitiveHMLVarDecImpl#getPrimitiveHMLVarDec <em>Primitive HML Var Dec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HMLFormulaPrimitiveHMLVarDecImpl extends HMLFormulaImpl implements HMLFormulaPrimitiveHMLVarDec {
	/**
	 * The cached value of the '{@link #getPrimitiveHMLVarDec() <em>Primitive HML Var Dec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveHMLVarDec()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveHMLVarDec primitiveHMLVarDec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HMLFormulaPrimitiveHMLVarDecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HMLFormulaPackage.Literals.HML_FORMULA_PRIMITIVE_HML_VAR_DEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveHMLVarDec getPrimitiveHMLVarDec() {
		if (primitiveHMLVarDec != null && primitiveHMLVarDec.eIsProxy()) {
			InternalEObject oldPrimitiveHMLVarDec = (InternalEObject)primitiveHMLVarDec;
			primitiveHMLVarDec = (PrimitiveHMLVarDec)eResolveProxy(oldPrimitiveHMLVarDec);
			if (primitiveHMLVarDec != oldPrimitiveHMLVarDec) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HMLFormulaPackage.HML_FORMULA_PRIMITIVE_HML_VAR_DEC__PRIMITIVE_HML_VAR_DEC, oldPrimitiveHMLVarDec, primitiveHMLVarDec));
			}
		}
		return primitiveHMLVarDec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveHMLVarDec basicGetPrimitiveHMLVarDec() {
		return primitiveHMLVarDec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitiveHMLVarDec(PrimitiveHMLVarDec newPrimitiveHMLVarDec) {
		PrimitiveHMLVarDec oldPrimitiveHMLVarDec = primitiveHMLVarDec;
		primitiveHMLVarDec = newPrimitiveHMLVarDec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HMLFormulaPackage.HML_FORMULA_PRIMITIVE_HML_VAR_DEC__PRIMITIVE_HML_VAR_DEC, oldPrimitiveHMLVarDec, primitiveHMLVarDec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HMLFormulaPackage.HML_FORMULA_PRIMITIVE_HML_VAR_DEC__PRIMITIVE_HML_VAR_DEC:
				if (resolve) return getPrimitiveHMLVarDec();
				return basicGetPrimitiveHMLVarDec();
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
			case HMLFormulaPackage.HML_FORMULA_PRIMITIVE_HML_VAR_DEC__PRIMITIVE_HML_VAR_DEC:
				setPrimitiveHMLVarDec((PrimitiveHMLVarDec)newValue);
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
			case HMLFormulaPackage.HML_FORMULA_PRIMITIVE_HML_VAR_DEC__PRIMITIVE_HML_VAR_DEC:
				setPrimitiveHMLVarDec((PrimitiveHMLVarDec)null);
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
			case HMLFormulaPackage.HML_FORMULA_PRIMITIVE_HML_VAR_DEC__PRIMITIVE_HML_VAR_DEC:
				return primitiveHMLVarDec != null;
		}
		return super.eIsSet(featureID);
	}

} //HMLFormulaPrimitiveHMLVarDecImpl
