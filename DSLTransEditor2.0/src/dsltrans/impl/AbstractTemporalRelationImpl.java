/**
 */
package dsltrans.impl;

import dsltrans.AbstractTemporalRelation;
import dsltrans.ApplyClass;
import dsltrans.DsltransPackage;
import dsltrans.PositiveMatchClass;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Temporal Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsltrans.impl.AbstractTemporalRelationImpl#getTargetClass <em>Target Class</em>}</li>
 *   <li>{@link dsltrans.impl.AbstractTemporalRelationImpl#getSourceClass <em>Source Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractTemporalRelationImpl extends EObjectImpl implements AbstractTemporalRelation {
	/**
	 * The cached value of the '{@link #getTargetClass() <em>Target Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetClass()
	 * @generated
	 * @ordered
	 */
	protected ApplyClass targetClass;

	/**
	 * The cached value of the '{@link #getSourceClass() <em>Source Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceClass()
	 * @generated
	 * @ordered
	 */
	protected PositiveMatchClass sourceClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTemporalRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsltransPackage.Literals.ABSTRACT_TEMPORAL_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplyClass getTargetClass() {
		if (targetClass != null && targetClass.eIsProxy()) {
			InternalEObject oldTargetClass = (InternalEObject)targetClass;
			targetClass = (ApplyClass)eResolveProxy(oldTargetClass);
			if (targetClass != oldTargetClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DsltransPackage.ABSTRACT_TEMPORAL_RELATION__TARGET_CLASS, oldTargetClass, targetClass));
			}
		}
		return targetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplyClass basicGetTargetClass() {
		return targetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetClass(ApplyClass newTargetClass) {
		ApplyClass oldTargetClass = targetClass;
		targetClass = newTargetClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsltransPackage.ABSTRACT_TEMPORAL_RELATION__TARGET_CLASS, oldTargetClass, targetClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveMatchClass getSourceClass() {
		if (sourceClass != null && sourceClass.eIsProxy()) {
			InternalEObject oldSourceClass = (InternalEObject)sourceClass;
			sourceClass = (PositiveMatchClass)eResolveProxy(oldSourceClass);
			if (sourceClass != oldSourceClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DsltransPackage.ABSTRACT_TEMPORAL_RELATION__SOURCE_CLASS, oldSourceClass, sourceClass));
			}
		}
		return sourceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveMatchClass basicGetSourceClass() {
		return sourceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceClass(PositiveMatchClass newSourceClass) {
		PositiveMatchClass oldSourceClass = sourceClass;
		sourceClass = newSourceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsltransPackage.ABSTRACT_TEMPORAL_RELATION__SOURCE_CLASS, oldSourceClass, sourceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsltransPackage.ABSTRACT_TEMPORAL_RELATION__TARGET_CLASS:
				if (resolve) return getTargetClass();
				return basicGetTargetClass();
			case DsltransPackage.ABSTRACT_TEMPORAL_RELATION__SOURCE_CLASS:
				if (resolve) return getSourceClass();
				return basicGetSourceClass();
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
			case DsltransPackage.ABSTRACT_TEMPORAL_RELATION__TARGET_CLASS:
				setTargetClass((ApplyClass)newValue);
				return;
			case DsltransPackage.ABSTRACT_TEMPORAL_RELATION__SOURCE_CLASS:
				setSourceClass((PositiveMatchClass)newValue);
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
			case DsltransPackage.ABSTRACT_TEMPORAL_RELATION__TARGET_CLASS:
				setTargetClass((ApplyClass)null);
				return;
			case DsltransPackage.ABSTRACT_TEMPORAL_RELATION__SOURCE_CLASS:
				setSourceClass((PositiveMatchClass)null);
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
			case DsltransPackage.ABSTRACT_TEMPORAL_RELATION__TARGET_CLASS:
				return targetClass != null;
			case DsltransPackage.ABSTRACT_TEMPORAL_RELATION__SOURCE_CLASS:
				return sourceClass != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractTemporalRelationImpl
