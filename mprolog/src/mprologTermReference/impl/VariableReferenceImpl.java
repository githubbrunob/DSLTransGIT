/**
 * <copyright>
 * </copyright>
 *
 * $Id: VariableReferenceImpl.java,v 1.1 2011/12/28 01:45:32 bfb Exp $
 */
package mprologTermReference.impl;

import mprologTermReference.MprologTermReferencePackage;
import mprologTermReference.Variable;
import mprologTermReference.VariableReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mprologTermReference.impl.VariableReferenceImpl#getIdReference <em>Id Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableReferenceImpl extends TermReferenceImpl implements VariableReference {
	/**
	 * The cached value of the '{@link #getIdReference() <em>Id Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdReference()
	 * @generated
	 * @ordered
	 */
	protected Variable idReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MprologTermReferencePackage.Literals.VARIABLE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getIdReference() {
		if (idReference != null && idReference.eIsProxy()) {
			InternalEObject oldIdReference = (InternalEObject)idReference;
			idReference = (Variable)eResolveProxy(oldIdReference);
			if (idReference != oldIdReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MprologTermReferencePackage.VARIABLE_REFERENCE__ID_REFERENCE, oldIdReference, idReference));
			}
		}
		return idReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetIdReference() {
		return idReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdReference(Variable newIdReference) {
		Variable oldIdReference = idReference;
		idReference = newIdReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MprologTermReferencePackage.VARIABLE_REFERENCE__ID_REFERENCE, oldIdReference, idReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MprologTermReferencePackage.VARIABLE_REFERENCE__ID_REFERENCE:
				if (resolve) return getIdReference();
				return basicGetIdReference();
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
			case MprologTermReferencePackage.VARIABLE_REFERENCE__ID_REFERENCE:
				setIdReference((Variable)newValue);
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
			case MprologTermReferencePackage.VARIABLE_REFERENCE__ID_REFERENCE:
				setIdReference((Variable)null);
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
			case MprologTermReferencePackage.VARIABLE_REFERENCE__ID_REFERENCE:
				return idReference != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableReferenceImpl
