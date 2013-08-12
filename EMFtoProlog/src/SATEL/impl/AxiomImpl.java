/**
 * <copyright>
 * </copyright>
 *
 * $Id: AxiomImpl.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.impl;

import SATEL.Axiom;
import SATEL.Condition;
import SATEL.Inclusion;
import SATEL.SATELPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axiom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.impl.AxiomImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link SATEL.impl.AxiomImpl#getInclusion <em>Inclusion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AxiomImpl extends EObjectImpl implements Axiom {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * The cached value of the '{@link #getInclusion() <em>Inclusion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclusion()
	 * @generated
	 * @ordered
	 */
	protected Inclusion inclusion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxiomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SATELPackage.Literals.AXIOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SATELPackage.AXIOM__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SATELPackage.AXIOM__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SATELPackage.AXIOM__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SATELPackage.AXIOM__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inclusion getInclusion() {
		return inclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInclusion(Inclusion newInclusion, NotificationChain msgs) {
		Inclusion oldInclusion = inclusion;
		inclusion = newInclusion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SATELPackage.AXIOM__INCLUSION, oldInclusion, newInclusion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInclusion(Inclusion newInclusion) {
		if (newInclusion != inclusion) {
			NotificationChain msgs = null;
			if (inclusion != null)
				msgs = ((InternalEObject)inclusion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SATELPackage.AXIOM__INCLUSION, null, msgs);
			if (newInclusion != null)
				msgs = ((InternalEObject)newInclusion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SATELPackage.AXIOM__INCLUSION, null, msgs);
			msgs = basicSetInclusion(newInclusion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SATELPackage.AXIOM__INCLUSION, newInclusion, newInclusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SATELPackage.AXIOM__CONDITION:
				return basicSetCondition(null, msgs);
			case SATELPackage.AXIOM__INCLUSION:
				return basicSetInclusion(null, msgs);
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
			case SATELPackage.AXIOM__CONDITION:
				return getCondition();
			case SATELPackage.AXIOM__INCLUSION:
				return getInclusion();
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
			case SATELPackage.AXIOM__CONDITION:
				setCondition((Condition)newValue);
				return;
			case SATELPackage.AXIOM__INCLUSION:
				setInclusion((Inclusion)newValue);
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
			case SATELPackage.AXIOM__CONDITION:
				setCondition((Condition)null);
				return;
			case SATELPackage.AXIOM__INCLUSION:
				setInclusion((Inclusion)null);
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
			case SATELPackage.AXIOM__CONDITION:
				return condition != null;
			case SATELPackage.AXIOM__INCLUSION:
				return inclusion != null;
		}
		return super.eIsSet(featureID);
	}

} //AxiomImpl
