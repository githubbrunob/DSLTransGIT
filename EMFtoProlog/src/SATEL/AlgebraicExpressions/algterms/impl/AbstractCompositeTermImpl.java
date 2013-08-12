/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractCompositeTermImpl.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.AlgebraicExpressions.algterms.impl;

import SATEL.APN.adtmm.Operation;

import SATEL.AlgebraicExpressions.algterms.AbstractCompositeTerm;
import SATEL.AlgebraicExpressions.algterms.AlgebraicTerm;
import SATEL.AlgebraicExpressions.algterms.AlgtermsPackage;

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
 * An implementation of the model object '<em><b>Abstract Composite Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.AlgebraicExpressions.algterms.impl.AbstractCompositeTermImpl#getTerms <em>Terms</em>}</li>
 *   <li>{@link SATEL.AlgebraicExpressions.algterms.impl.AbstractCompositeTermImpl#getOp <em>Op</em>}</li>
 *   <li>{@link SATEL.AlgebraicExpressions.algterms.impl.AbstractCompositeTermImpl#getIter <em>Iter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractCompositeTermImpl extends AlgebraicTermImpl implements AbstractCompositeTerm {
	/**
	 * The cached value of the '{@link #getTerms() <em>Terms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerms()
	 * @generated
	 * @ordered
	 */
	protected EList<AlgebraicTerm> terms;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractCompositeTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgtermsPackage.Literals.ABSTRACT_COMPOSITE_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlgebraicTerm> getTerms() {
		if (terms == null) {
			terms = new EObjectContainmentEList<AlgebraicTerm>(AlgebraicTerm.class, this, AlgtermsPackage.ABSTRACT_COMPOSITE_TERM__TERMS);
		}
		return terms;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgtermsPackage.ABSTRACT_COMPOSITE_TERM__OP, oldOp, op));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlgtermsPackage.ABSTRACT_COMPOSITE_TERM__OP, oldOp, op));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlgtermsPackage.ABSTRACT_COMPOSITE_TERM__ITER, oldIter, iter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlgtermsPackage.ABSTRACT_COMPOSITE_TERM__TERMS:
				return ((InternalEList<?>)getTerms()).basicRemove(otherEnd, msgs);
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
			case AlgtermsPackage.ABSTRACT_COMPOSITE_TERM__TERMS:
				return getTerms();
			case AlgtermsPackage.ABSTRACT_COMPOSITE_TERM__OP:
				if (resolve) return getOp();
				return basicGetOp();
			case AlgtermsPackage.ABSTRACT_COMPOSITE_TERM__ITER:
				return getIter();
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
			case AlgtermsPackage.ABSTRACT_COMPOSITE_TERM__TERMS:
				getTerms().clear();
				getTerms().addAll((Collection<? extends AlgebraicTerm>)newValue);
				return;
			case AlgtermsPackage.ABSTRACT_COMPOSITE_TERM__OP:
				setOp((Operation)newValue);
				return;
			case AlgtermsPackage.ABSTRACT_COMPOSITE_TERM__ITER:
				setIter((Integer)newValue);
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
			case AlgtermsPackage.ABSTRACT_COMPOSITE_TERM__TERMS:
				getTerms().clear();
				return;
			case AlgtermsPackage.ABSTRACT_COMPOSITE_TERM__OP:
				setOp((Operation)null);
				return;
			case AlgtermsPackage.ABSTRACT_COMPOSITE_TERM__ITER:
				setIter(ITER_EDEFAULT);
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
			case AlgtermsPackage.ABSTRACT_COMPOSITE_TERM__TERMS:
				return terms != null && !terms.isEmpty();
			case AlgtermsPackage.ABSTRACT_COMPOSITE_TERM__OP:
				return op != null;
			case AlgtermsPackage.ABSTRACT_COMPOSITE_TERM__ITER:
				return iter != ITER_EDEFAULT;
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

} //AbstractCompositeTermImpl
