/**
 * <copyright>
 * </copyright>
 *
 * $Id: ContentImpl.java,v 1.1 2011/08/26 23:25:13 bfb Exp $
 */
package Text.impl;

import Text.Block;
import Text.Content;
import Text.TextPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Text.impl.ContentImpl#getText <em>Text</em>}</li>
 *   <li>{@link Text.impl.ContentImpl#getNext <em>Next</em>}</li>
 *   <li>{@link Text.impl.ContentImpl#getInnerBlock <em>Inner Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContentImpl extends LineImpl implements Content {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected Content next;

	/**
	 * The cached value of the '{@link #getInnerBlock() <em>Inner Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerBlock()
	 * @generated
	 * @ordered
	 */
	protected Block innerBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.Literals.CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.CONTENT__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Content getNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(Content newNext, NotificationChain msgs) {
		Content oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.CONTENT__NEXT, oldNext, newNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(Content newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.CONTENT__NEXT, null, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.CONTENT__NEXT, null, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.CONTENT__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getInnerBlock() {
		return innerBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerBlock(Block newInnerBlock, NotificationChain msgs) {
		Block oldInnerBlock = innerBlock;
		innerBlock = newInnerBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.CONTENT__INNER_BLOCK, oldInnerBlock, newInnerBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerBlock(Block newInnerBlock) {
		if (newInnerBlock != innerBlock) {
			NotificationChain msgs = null;
			if (innerBlock != null)
				msgs = ((InternalEObject)innerBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.CONTENT__INNER_BLOCK, null, msgs);
			if (newInnerBlock != null)
				msgs = ((InternalEObject)newInnerBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.CONTENT__INNER_BLOCK, null, msgs);
			msgs = basicSetInnerBlock(newInnerBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.CONTENT__INNER_BLOCK, newInnerBlock, newInnerBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.CONTENT__NEXT:
				return basicSetNext(null, msgs);
			case TextPackage.CONTENT__INNER_BLOCK:
				return basicSetInnerBlock(null, msgs);
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
			case TextPackage.CONTENT__TEXT:
				return getText();
			case TextPackage.CONTENT__NEXT:
				return getNext();
			case TextPackage.CONTENT__INNER_BLOCK:
				return getInnerBlock();
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
			case TextPackage.CONTENT__TEXT:
				setText((String)newValue);
				return;
			case TextPackage.CONTENT__NEXT:
				setNext((Content)newValue);
				return;
			case TextPackage.CONTENT__INNER_BLOCK:
				setInnerBlock((Block)newValue);
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
			case TextPackage.CONTENT__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case TextPackage.CONTENT__NEXT:
				setNext((Content)null);
				return;
			case TextPackage.CONTENT__INNER_BLOCK:
				setInnerBlock((Block)null);
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
			case TextPackage.CONTENT__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case TextPackage.CONTENT__NEXT:
				return next != null;
			case TextPackage.CONTENT__INNER_BLOCK:
				return innerBlock != null;
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
		result.append(" (text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //ContentImpl
