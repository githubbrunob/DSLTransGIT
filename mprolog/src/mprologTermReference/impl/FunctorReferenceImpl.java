/**
 * <copyright>
 * </copyright>
 *
 * $Id: FunctorReferenceImpl.java,v 1.2 2012/02/04 22:47:13 bfb Exp $
 */
package mprologTermReference.impl;

import mprologTermReference.Functor;
import mprologTermReference.FunctorReference;
import mprologTermReference.MprologTermReferencePackage;

import mprologTermReference.Term;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functor Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mprologTermReference.impl.FunctorReferenceImpl#getIdReference <em>Id Reference</em>}</li>
 *   <li>{@link mprologTermReference.impl.FunctorReferenceImpl#getOwnedTerm <em>Owned Term</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctorReferenceImpl extends TermReferenceImpl implements FunctorReference {
	/**
	 * The cached value of the '{@link #getIdReference() <em>Id Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdReference()
	 * @generated
	 * @ordered
	 */
	protected Functor idReference;

	/**
	 * The cached value of the '{@link #getOwnedTerm() <em>Owned Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTerm()
	 * @generated
	 * @ordered
	 */
	protected Term ownedTerm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctorReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MprologTermReferencePackage.Literals.FUNCTOR_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functor getIdReference() {
		if (idReference != null && idReference.eIsProxy()) {
			InternalEObject oldIdReference = (InternalEObject)idReference;
			idReference = (Functor)eResolveProxy(oldIdReference);
			if (idReference != oldIdReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MprologTermReferencePackage.FUNCTOR_REFERENCE__ID_REFERENCE, oldIdReference, idReference));
			}
		}
		return idReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functor basicGetIdReference() {
		return idReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdReference(Functor newIdReference) {
		Functor oldIdReference = idReference;
		idReference = newIdReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MprologTermReferencePackage.FUNCTOR_REFERENCE__ID_REFERENCE, oldIdReference, idReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getOwnedTerm() {
		return ownedTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTerm(Term newOwnedTerm, NotificationChain msgs) {
		Term oldOwnedTerm = ownedTerm;
		ownedTerm = newOwnedTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MprologTermReferencePackage.FUNCTOR_REFERENCE__OWNED_TERM, oldOwnedTerm, newOwnedTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedTerm(Term newOwnedTerm) {
		if (newOwnedTerm != ownedTerm) {
			NotificationChain msgs = null;
			if (ownedTerm != null)
				msgs = ((InternalEObject)ownedTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MprologTermReferencePackage.FUNCTOR_REFERENCE__OWNED_TERM, null, msgs);
			if (newOwnedTerm != null)
				msgs = ((InternalEObject)newOwnedTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MprologTermReferencePackage.FUNCTOR_REFERENCE__OWNED_TERM, null, msgs);
			msgs = basicSetOwnedTerm(newOwnedTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MprologTermReferencePackage.FUNCTOR_REFERENCE__OWNED_TERM, newOwnedTerm, newOwnedTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MprologTermReferencePackage.FUNCTOR_REFERENCE__OWNED_TERM:
				return basicSetOwnedTerm(null, msgs);
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
			case MprologTermReferencePackage.FUNCTOR_REFERENCE__ID_REFERENCE:
				if (resolve) return getIdReference();
				return basicGetIdReference();
			case MprologTermReferencePackage.FUNCTOR_REFERENCE__OWNED_TERM:
				return getOwnedTerm();
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
			case MprologTermReferencePackage.FUNCTOR_REFERENCE__ID_REFERENCE:
				setIdReference((Functor)newValue);
				return;
			case MprologTermReferencePackage.FUNCTOR_REFERENCE__OWNED_TERM:
				setOwnedTerm((Term)newValue);
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
			case MprologTermReferencePackage.FUNCTOR_REFERENCE__ID_REFERENCE:
				setIdReference((Functor)null);
				return;
			case MprologTermReferencePackage.FUNCTOR_REFERENCE__OWNED_TERM:
				setOwnedTerm((Term)null);
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
			case MprologTermReferencePackage.FUNCTOR_REFERENCE__ID_REFERENCE:
				return idReference != null;
			case MprologTermReferencePackage.FUNCTOR_REFERENCE__OWNED_TERM:
				return ownedTerm != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctorReferenceImpl
