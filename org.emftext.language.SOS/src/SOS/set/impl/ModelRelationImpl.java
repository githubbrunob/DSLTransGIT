/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.set.impl;

import SOS.adtmm.VariableRef;

import SOS.adtmm.impl.TermImpl;

import SOS.set.ModelRelation;
import SOS.set.SetPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SOS.set.impl.ModelRelationImpl#getReferenceName <em>Reference Name</em>}</li>
 *   <li>{@link SOS.set.impl.ModelRelationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link SOS.set.impl.ModelRelationImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelRelationImpl extends TermImpl implements ModelRelation {
	/**
	 * The default value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceName()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceName()
	 * @generated
	 * @ordered
	 */
	protected String referenceName = REFERENCE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected VariableRef source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected VariableRef target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SetPackage.Literals.MODEL_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceName() {
		return referenceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceName(String newReferenceName) {
		String oldReferenceName = referenceName;
		referenceName = newReferenceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.MODEL_RELATION__REFERENCE_NAME, oldReferenceName, referenceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableRef getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(VariableRef newSource, NotificationChain msgs) {
		VariableRef oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.MODEL_RELATION__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(VariableRef newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.MODEL_RELATION__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.MODEL_RELATION__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.MODEL_RELATION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableRef getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(VariableRef newTarget, NotificationChain msgs) {
		VariableRef oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SetPackage.MODEL_RELATION__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(VariableRef newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SetPackage.MODEL_RELATION__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SetPackage.MODEL_RELATION__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.MODEL_RELATION__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SetPackage.MODEL_RELATION__SOURCE:
				return basicSetSource(null, msgs);
			case SetPackage.MODEL_RELATION__TARGET:
				return basicSetTarget(null, msgs);
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
			case SetPackage.MODEL_RELATION__REFERENCE_NAME:
				return getReferenceName();
			case SetPackage.MODEL_RELATION__SOURCE:
				return getSource();
			case SetPackage.MODEL_RELATION__TARGET:
				return getTarget();
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
			case SetPackage.MODEL_RELATION__REFERENCE_NAME:
				setReferenceName((String)newValue);
				return;
			case SetPackage.MODEL_RELATION__SOURCE:
				setSource((VariableRef)newValue);
				return;
			case SetPackage.MODEL_RELATION__TARGET:
				setTarget((VariableRef)newValue);
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
			case SetPackage.MODEL_RELATION__REFERENCE_NAME:
				setReferenceName(REFERENCE_NAME_EDEFAULT);
				return;
			case SetPackage.MODEL_RELATION__SOURCE:
				setSource((VariableRef)null);
				return;
			case SetPackage.MODEL_RELATION__TARGET:
				setTarget((VariableRef)null);
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
			case SetPackage.MODEL_RELATION__REFERENCE_NAME:
				return REFERENCE_NAME_EDEFAULT == null ? referenceName != null : !REFERENCE_NAME_EDEFAULT.equals(referenceName);
			case SetPackage.MODEL_RELATION__SOURCE:
				return source != null;
			case SetPackage.MODEL_RELATION__TARGET:
				return target != null;
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
		result.append(" (referenceName: ");
		result.append(referenceName);
		result.append(')');
		return result.toString();
	}

} //ModelRelationImpl
