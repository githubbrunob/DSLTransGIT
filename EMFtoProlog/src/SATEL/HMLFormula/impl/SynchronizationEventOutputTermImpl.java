/**
 * <copyright>
 * </copyright>
 *
 * $Id: SynchronizationEventOutputTermImpl.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.HMLFormula.impl;

import SATEL.HMLFormula.HMLFormulaPackage;
import SATEL.HMLFormula.OutputEvent;
import SATEL.HMLFormula.Parameter;
import SATEL.HMLFormula.SynchronizationEventOutputTerm;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronization Event Output Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.HMLFormula.impl.SynchronizationEventOutputTermImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link SATEL.HMLFormula.impl.SynchronizationEventOutputTermImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SynchronizationEventOutputTermImpl extends SynchronizationOutputTermImpl implements SynchronizationEventOutputTerm {
	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected OutputEvent event;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronizationEventOutputTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HMLFormulaPackage.Literals.SYNCHRONIZATION_EVENT_OUTPUT_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputEvent getEvent() {
		if (event != null && event.eIsProxy()) {
			InternalEObject oldEvent = (InternalEObject)event;
			event = (OutputEvent)eResolveProxy(oldEvent);
			if (event != oldEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HMLFormulaPackage.SYNCHRONIZATION_EVENT_OUTPUT_TERM__EVENT, oldEvent, event));
			}
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputEvent basicGetEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(OutputEvent newEvent) {
		OutputEvent oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HMLFormulaPackage.SYNCHRONIZATION_EVENT_OUTPUT_TERM__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameters(Parameter newParameters, NotificationChain msgs) {
		Parameter oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HMLFormulaPackage.SYNCHRONIZATION_EVENT_OUTPUT_TERM__PARAMETERS, oldParameters, newParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(Parameter newParameters) {
		if (newParameters != parameters) {
			NotificationChain msgs = null;
			if (parameters != null)
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HMLFormulaPackage.SYNCHRONIZATION_EVENT_OUTPUT_TERM__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HMLFormulaPackage.SYNCHRONIZATION_EVENT_OUTPUT_TERM__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HMLFormulaPackage.SYNCHRONIZATION_EVENT_OUTPUT_TERM__PARAMETERS, newParameters, newParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HMLFormulaPackage.SYNCHRONIZATION_EVENT_OUTPUT_TERM__PARAMETERS:
				return basicSetParameters(null, msgs);
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
			case HMLFormulaPackage.SYNCHRONIZATION_EVENT_OUTPUT_TERM__EVENT:
				if (resolve) return getEvent();
				return basicGetEvent();
			case HMLFormulaPackage.SYNCHRONIZATION_EVENT_OUTPUT_TERM__PARAMETERS:
				return getParameters();
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
			case HMLFormulaPackage.SYNCHRONIZATION_EVENT_OUTPUT_TERM__EVENT:
				setEvent((OutputEvent)newValue);
				return;
			case HMLFormulaPackage.SYNCHRONIZATION_EVENT_OUTPUT_TERM__PARAMETERS:
				setParameters((Parameter)newValue);
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
			case HMLFormulaPackage.SYNCHRONIZATION_EVENT_OUTPUT_TERM__EVENT:
				setEvent((OutputEvent)null);
				return;
			case HMLFormulaPackage.SYNCHRONIZATION_EVENT_OUTPUT_TERM__PARAMETERS:
				setParameters((Parameter)null);
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
			case HMLFormulaPackage.SYNCHRONIZATION_EVENT_OUTPUT_TERM__EVENT:
				return event != null;
			case HMLFormulaPackage.SYNCHRONIZATION_EVENT_OUTPUT_TERM__PARAMETERS:
				return parameters != null;
		}
		return super.eIsSet(featureID);
	}

} //SynchronizationEventOutputTermImpl
