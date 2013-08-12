/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrimitiveStimulationVarDecImpl.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.VariableDeclarations.impl;

import SATEL.VariableDeclarations.PrimitiveStimulationVarDec;

import SATEL.VariableDeclarations.Types.PrimitiveStimulation;

import SATEL.VariableDeclarations.VariableDeclarationsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Stimulation Var Dec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.VariableDeclarations.impl.PrimitiveStimulationVarDecImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimitiveStimulationVarDecImpl extends VariableDecImpl implements PrimitiveStimulationVarDec {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveStimulation type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveStimulationVarDecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariableDeclarationsPackage.Literals.PRIMITIVE_STIMULATION_VAR_DEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveStimulation getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(PrimitiveStimulation newType, NotificationChain msgs) {
		PrimitiveStimulation oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariableDeclarationsPackage.PRIMITIVE_STIMULATION_VAR_DEC__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PrimitiveStimulation newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariableDeclarationsPackage.PRIMITIVE_STIMULATION_VAR_DEC__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariableDeclarationsPackage.PRIMITIVE_STIMULATION_VAR_DEC__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariableDeclarationsPackage.PRIMITIVE_STIMULATION_VAR_DEC__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariableDeclarationsPackage.PRIMITIVE_STIMULATION_VAR_DEC__TYPE:
				return basicSetType(null, msgs);
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
			case VariableDeclarationsPackage.PRIMITIVE_STIMULATION_VAR_DEC__TYPE:
				return getType();
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
			case VariableDeclarationsPackage.PRIMITIVE_STIMULATION_VAR_DEC__TYPE:
				setType((PrimitiveStimulation)newValue);
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
			case VariableDeclarationsPackage.PRIMITIVE_STIMULATION_VAR_DEC__TYPE:
				setType((PrimitiveStimulation)null);
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
			case VariableDeclarationsPackage.PRIMITIVE_STIMULATION_VAR_DEC__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

} //PrimitiveStimulationVarDecImpl
