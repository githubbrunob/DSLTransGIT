/**
 * <copyright>
 * </copyright>
 *
 * $Id: NumOfTermsImpl.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.APN.multisetmm.impl;

import SATEL.APN.multisetmm.MSElement;
import SATEL.APN.multisetmm.MultisetmmPackage;
import SATEL.APN.multisetmm.NumOfTerms;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Num Of Terms</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.APN.multisetmm.impl.NumOfTermsImpl#getCard <em>Card</em>}</li>
 *   <li>{@link SATEL.APN.multisetmm.impl.NumOfTermsImpl#getOwnedElement <em>Owned Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumOfTermsImpl extends EObjectImpl implements NumOfTerms {
	/**
	 * The default value of the '{@link #getCard() <em>Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCard()
	 * @generated
	 * @ordered
	 */
	protected static final int CARD_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getCard() <em>Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCard()
	 * @generated
	 * @ordered
	 */
	protected int card = CARD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedElement() <em>Owned Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElement()
	 * @generated
	 * @ordered
	 */
	protected MSElement ownedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumOfTermsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultisetmmPackage.Literals.NUM_OF_TERMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCard() {
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCard(int newCard) {
		int oldCard = card;
		card = newCard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultisetmmPackage.NUM_OF_TERMS__CARD, oldCard, card));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSElement getOwnedElement() {
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedElement(MSElement newOwnedElement, NotificationChain msgs) {
		MSElement oldOwnedElement = ownedElement;
		ownedElement = newOwnedElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MultisetmmPackage.NUM_OF_TERMS__OWNED_ELEMENT, oldOwnedElement, newOwnedElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedElement(MSElement newOwnedElement) {
		if (newOwnedElement != ownedElement) {
			NotificationChain msgs = null;
			if (ownedElement != null)
				msgs = ((InternalEObject)ownedElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MultisetmmPackage.NUM_OF_TERMS__OWNED_ELEMENT, null, msgs);
			if (newOwnedElement != null)
				msgs = ((InternalEObject)newOwnedElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MultisetmmPackage.NUM_OF_TERMS__OWNED_ELEMENT, null, msgs);
			msgs = basicSetOwnedElement(newOwnedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultisetmmPackage.NUM_OF_TERMS__OWNED_ELEMENT, newOwnedElement, newOwnedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MultisetmmPackage.NUM_OF_TERMS__OWNED_ELEMENT:
				return basicSetOwnedElement(null, msgs);
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
			case MultisetmmPackage.NUM_OF_TERMS__CARD:
				return getCard();
			case MultisetmmPackage.NUM_OF_TERMS__OWNED_ELEMENT:
				return getOwnedElement();
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
			case MultisetmmPackage.NUM_OF_TERMS__CARD:
				setCard((Integer)newValue);
				return;
			case MultisetmmPackage.NUM_OF_TERMS__OWNED_ELEMENT:
				setOwnedElement((MSElement)newValue);
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
			case MultisetmmPackage.NUM_OF_TERMS__CARD:
				setCard(CARD_EDEFAULT);
				return;
			case MultisetmmPackage.NUM_OF_TERMS__OWNED_ELEMENT:
				setOwnedElement((MSElement)null);
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
			case MultisetmmPackage.NUM_OF_TERMS__CARD:
				return card != CARD_EDEFAULT;
			case MultisetmmPackage.NUM_OF_TERMS__OWNED_ELEMENT:
				return ownedElement != null;
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
		result.append(" (card: ");
		result.append(card);
		result.append(')');
		return result.toString();
	}

} //NumOfTermsImpl
