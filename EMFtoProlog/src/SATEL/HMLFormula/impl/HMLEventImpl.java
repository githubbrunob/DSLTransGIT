/**
 * <copyright>
 * </copyright>
 *
 * $Id: HMLEventImpl.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.HMLFormula.impl;

import SATEL.HMLFormula.HMLEvent;
import SATEL.HMLFormula.HMLFormulaPackage;
import SATEL.HMLFormula.SynchronizationInputTerm;
import SATEL.HMLFormula.SynchronizationOutputTerm;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HML Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.HMLFormula.impl.HMLEventImpl#getInputTerm <em>Input Term</em>}</li>
 *   <li>{@link SATEL.HMLFormula.impl.HMLEventImpl#getOutputTerm <em>Output Term</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HMLEventImpl extends EObjectImpl implements HMLEvent {
	/**
	 * The cached value of the '{@link #getInputTerm() <em>Input Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputTerm()
	 * @generated
	 * @ordered
	 */
	protected SynchronizationInputTerm inputTerm;

	/**
	 * The cached value of the '{@link #getOutputTerm() <em>Output Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputTerm()
	 * @generated
	 * @ordered
	 */
	protected SynchronizationOutputTerm outputTerm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HMLEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HMLFormulaPackage.Literals.HML_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationInputTerm getInputTerm() {
		return inputTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputTerm(SynchronizationInputTerm newInputTerm, NotificationChain msgs) {
		SynchronizationInputTerm oldInputTerm = inputTerm;
		inputTerm = newInputTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HMLFormulaPackage.HML_EVENT__INPUT_TERM, oldInputTerm, newInputTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputTerm(SynchronizationInputTerm newInputTerm) {
		if (newInputTerm != inputTerm) {
			NotificationChain msgs = null;
			if (inputTerm != null)
				msgs = ((InternalEObject)inputTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HMLFormulaPackage.HML_EVENT__INPUT_TERM, null, msgs);
			if (newInputTerm != null)
				msgs = ((InternalEObject)newInputTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HMLFormulaPackage.HML_EVENT__INPUT_TERM, null, msgs);
			msgs = basicSetInputTerm(newInputTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HMLFormulaPackage.HML_EVENT__INPUT_TERM, newInputTerm, newInputTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationOutputTerm getOutputTerm() {
		return outputTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputTerm(SynchronizationOutputTerm newOutputTerm, NotificationChain msgs) {
		SynchronizationOutputTerm oldOutputTerm = outputTerm;
		outputTerm = newOutputTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HMLFormulaPackage.HML_EVENT__OUTPUT_TERM, oldOutputTerm, newOutputTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputTerm(SynchronizationOutputTerm newOutputTerm) {
		if (newOutputTerm != outputTerm) {
			NotificationChain msgs = null;
			if (outputTerm != null)
				msgs = ((InternalEObject)outputTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HMLFormulaPackage.HML_EVENT__OUTPUT_TERM, null, msgs);
			if (newOutputTerm != null)
				msgs = ((InternalEObject)newOutputTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HMLFormulaPackage.HML_EVENT__OUTPUT_TERM, null, msgs);
			msgs = basicSetOutputTerm(newOutputTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HMLFormulaPackage.HML_EVENT__OUTPUT_TERM, newOutputTerm, newOutputTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HMLFormulaPackage.HML_EVENT__INPUT_TERM:
				return basicSetInputTerm(null, msgs);
			case HMLFormulaPackage.HML_EVENT__OUTPUT_TERM:
				return basicSetOutputTerm(null, msgs);
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
			case HMLFormulaPackage.HML_EVENT__INPUT_TERM:
				return getInputTerm();
			case HMLFormulaPackage.HML_EVENT__OUTPUT_TERM:
				return getOutputTerm();
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
			case HMLFormulaPackage.HML_EVENT__INPUT_TERM:
				setInputTerm((SynchronizationInputTerm)newValue);
				return;
			case HMLFormulaPackage.HML_EVENT__OUTPUT_TERM:
				setOutputTerm((SynchronizationOutputTerm)newValue);
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
			case HMLFormulaPackage.HML_EVENT__INPUT_TERM:
				setInputTerm((SynchronizationInputTerm)null);
				return;
			case HMLFormulaPackage.HML_EVENT__OUTPUT_TERM:
				setOutputTerm((SynchronizationOutputTerm)null);
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
			case HMLFormulaPackage.HML_EVENT__INPUT_TERM:
				return inputTerm != null;
			case HMLFormulaPackage.HML_EVENT__OUTPUT_TERM:
				return outputTerm != null;
		}
		return super.eIsSet(featureID);
	}

} //HMLEventImpl
