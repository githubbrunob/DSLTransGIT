/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.adtmm.impl;

import SOS.adtmm.AdtmmPackage;
import SOS.adtmm.CTerm;
import SOS.adtmm.Operation;
import SOS.adtmm.Term;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CTerm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SOS.adtmm.impl.CTermImpl#getIter <em>Iter</em>}</li>
 *   <li>{@link SOS.adtmm.impl.CTermImpl#getOwnedTerms <em>Owned Terms</em>}</li>
 *   <li>{@link SOS.adtmm.impl.CTermImpl#getOp <em>Op</em>}</li>
 *   <li>{@link SOS.adtmm.impl.CTermImpl#getIterTerm <em>Iter Term</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CTermImpl extends TermImpl implements CTerm {
	/**
	 * The default value of the '{@link #getIter() <em>Iter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIter()
	 * @generated
	 * @ordered
	 */
	protected static final int ITER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIter() <em>Iter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIter()
	 * @generated
	 * @ordered
	 */
	protected int iter = ITER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedTerms() <em>Owned Terms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTerms()
	 * @generated
	 * @ordered
	 */
	protected EList<Term> ownedTerms;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected Operation op;

	/**
	 * The cached value of the '{@link #getIterTerm() <em>Iter Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterTerm()
	 * @generated
	 * @ordered
	 */
	protected Term iterTerm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdtmmPackage.Literals.CTERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIter() {
		return iter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIter(int newIter) {
		int oldIter = iter;
		iter = newIter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdtmmPackage.CTERM__ITER, oldIter, iter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Term> getOwnedTerms() {
		if (ownedTerms == null) {
			ownedTerms = new EObjectContainmentEList<Term>(Term.class, this, AdtmmPackage.CTERM__OWNED_TERMS);
		}
		return ownedTerms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOp() {
		if (op != null && op.eIsProxy()) {
			InternalEObject oldOp = (InternalEObject)op;
			op = (Operation)eResolveProxy(oldOp);
			if (op != oldOp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdtmmPackage.CTERM__OP, oldOp, op));
			}
		}
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp(Operation newOp) {
		Operation oldOp = op;
		op = newOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdtmmPackage.CTERM__OP, oldOp, op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getIterTerm() {
		return iterTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIterTerm(Term newIterTerm, NotificationChain msgs) {
		Term oldIterTerm = iterTerm;
		iterTerm = newIterTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdtmmPackage.CTERM__ITER_TERM, oldIterTerm, newIterTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterTerm(Term newIterTerm) {
		if (newIterTerm != iterTerm) {
			NotificationChain msgs = null;
			if (iterTerm != null)
				msgs = ((InternalEObject)iterTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdtmmPackage.CTERM__ITER_TERM, null, msgs);
			if (newIterTerm != null)
				msgs = ((InternalEObject)newIterTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdtmmPackage.CTERM__ITER_TERM, null, msgs);
			msgs = basicSetIterTerm(newIterTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdtmmPackage.CTERM__ITER_TERM, newIterTerm, newIterTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdtmmPackage.CTERM__OWNED_TERMS:
				return ((InternalEList<?>)getOwnedTerms()).basicRemove(otherEnd, msgs);
			case AdtmmPackage.CTERM__ITER_TERM:
				return basicSetIterTerm(null, msgs);
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
			case AdtmmPackage.CTERM__ITER:
				return getIter();
			case AdtmmPackage.CTERM__OWNED_TERMS:
				return getOwnedTerms();
			case AdtmmPackage.CTERM__OP:
				if (resolve) return getOp();
				return basicGetOp();
			case AdtmmPackage.CTERM__ITER_TERM:
				return getIterTerm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdtmmPackage.CTERM__ITER:
				setIter((Integer)newValue);
				return;
			case AdtmmPackage.CTERM__OWNED_TERMS:
				getOwnedTerms().clear();
				getOwnedTerms().addAll((Collection<? extends Term>)newValue);
				return;
			case AdtmmPackage.CTERM__OP:
				setOp((Operation)newValue);
				return;
			case AdtmmPackage.CTERM__ITER_TERM:
				setIterTerm((Term)newValue);
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
			case AdtmmPackage.CTERM__ITER:
				setIter(ITER_EDEFAULT);
				return;
			case AdtmmPackage.CTERM__OWNED_TERMS:
				getOwnedTerms().clear();
				return;
			case AdtmmPackage.CTERM__OP:
				setOp((Operation)null);
				return;
			case AdtmmPackage.CTERM__ITER_TERM:
				setIterTerm((Term)null);
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
			case AdtmmPackage.CTERM__ITER:
				return iter != ITER_EDEFAULT;
			case AdtmmPackage.CTERM__OWNED_TERMS:
				return ownedTerms != null && !ownedTerms.isEmpty();
			case AdtmmPackage.CTERM__OP:
				return op != null;
			case AdtmmPackage.CTERM__ITER_TERM:
				return iterTerm != null;
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
		result.append(" (iter: ");
		result.append(iter);
		result.append(')');
		return result.toString();
	}

} //CTermImpl
