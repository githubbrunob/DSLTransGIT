/**
 * <copyright>
 * </copyright>
 *
 * $Id: BlockImpl.java,v 1.1 2011/08/26 23:25:13 bfb Exp $
 */
package Text.impl;

import Text.Block;
import Text.Content;
import Text.Line;
import Text.TextPackage;

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
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Text.impl.BlockImpl#getInnerBlock <em>Inner Block</em>}</li>
 *   <li>{@link Text.impl.BlockImpl#getInnerLine <em>Inner Line</em>}</li>
 *   <li>{@link Text.impl.BlockImpl#getPreLine <em>Pre Line</em>}</li>
 *   <li>{@link Text.impl.BlockImpl#getPostLine <em>Post Line</em>}</li>
 *   <li>{@link Text.impl.BlockImpl#isTabbed <em>Tabbed</em>}</li>
 *   <li>{@link Text.impl.BlockImpl#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockImpl extends NamedElementImpl implements Block {
	/**
	 * The cached value of the '{@link #getInnerBlock() <em>Inner Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<Block> innerBlock;

	/**
	 * The cached value of the '{@link #getInnerLine() <em>Inner Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerLine()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> innerLine;

	/**
	 * The cached value of the '{@link #getPreLine() <em>Pre Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreLine()
	 * @generated
	 * @ordered
	 */
	protected Line preLine;

	/**
	 * The cached value of the '{@link #getPostLine() <em>Post Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostLine()
	 * @generated
	 * @ordered
	 */
	protected Line postLine;

	/**
	 * The default value of the '{@link #isTabbed() <em>Tabbed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTabbed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TABBED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTabbed() <em>Tabbed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTabbed()
	 * @generated
	 * @ordered
	 */
	protected boolean tabbed = TABBED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<Content> content;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.Literals.BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Block> getInnerBlock() {
		if (innerBlock == null) {
			innerBlock = new EObjectContainmentEList<Block>(Block.class, this, TextPackage.BLOCK__INNER_BLOCK);
		}
		return innerBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line> getInnerLine() {
		if (innerLine == null) {
			innerLine = new EObjectContainmentEList<Line>(Line.class, this, TextPackage.BLOCK__INNER_LINE);
		}
		return innerLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line getPreLine() {
		return preLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreLine(Line newPreLine, NotificationChain msgs) {
		Line oldPreLine = preLine;
		preLine = newPreLine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.BLOCK__PRE_LINE, oldPreLine, newPreLine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreLine(Line newPreLine) {
		if (newPreLine != preLine) {
			NotificationChain msgs = null;
			if (preLine != null)
				msgs = ((InternalEObject)preLine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.BLOCK__PRE_LINE, null, msgs);
			if (newPreLine != null)
				msgs = ((InternalEObject)newPreLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.BLOCK__PRE_LINE, null, msgs);
			msgs = basicSetPreLine(newPreLine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BLOCK__PRE_LINE, newPreLine, newPreLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line getPostLine() {
		return postLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostLine(Line newPostLine, NotificationChain msgs) {
		Line oldPostLine = postLine;
		postLine = newPostLine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.BLOCK__POST_LINE, oldPostLine, newPostLine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostLine(Line newPostLine) {
		if (newPostLine != postLine) {
			NotificationChain msgs = null;
			if (postLine != null)
				msgs = ((InternalEObject)postLine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.BLOCK__POST_LINE, null, msgs);
			if (newPostLine != null)
				msgs = ((InternalEObject)newPostLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.BLOCK__POST_LINE, null, msgs);
			msgs = basicSetPostLine(newPostLine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BLOCK__POST_LINE, newPostLine, newPostLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTabbed() {
		return tabbed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTabbed(boolean newTabbed) {
		boolean oldTabbed = tabbed;
		tabbed = newTabbed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BLOCK__TABBED, oldTabbed, tabbed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Content> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<Content>(Content.class, this, TextPackage.BLOCK__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.BLOCK__INNER_BLOCK:
				return ((InternalEList<?>)getInnerBlock()).basicRemove(otherEnd, msgs);
			case TextPackage.BLOCK__INNER_LINE:
				return ((InternalEList<?>)getInnerLine()).basicRemove(otherEnd, msgs);
			case TextPackage.BLOCK__PRE_LINE:
				return basicSetPreLine(null, msgs);
			case TextPackage.BLOCK__POST_LINE:
				return basicSetPostLine(null, msgs);
			case TextPackage.BLOCK__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
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
			case TextPackage.BLOCK__INNER_BLOCK:
				return getInnerBlock();
			case TextPackage.BLOCK__INNER_LINE:
				return getInnerLine();
			case TextPackage.BLOCK__PRE_LINE:
				return getPreLine();
			case TextPackage.BLOCK__POST_LINE:
				return getPostLine();
			case TextPackage.BLOCK__TABBED:
				return isTabbed();
			case TextPackage.BLOCK__CONTENT:
				return getContent();
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
			case TextPackage.BLOCK__INNER_BLOCK:
				getInnerBlock().clear();
				getInnerBlock().addAll((Collection<? extends Block>)newValue);
				return;
			case TextPackage.BLOCK__INNER_LINE:
				getInnerLine().clear();
				getInnerLine().addAll((Collection<? extends Line>)newValue);
				return;
			case TextPackage.BLOCK__PRE_LINE:
				setPreLine((Line)newValue);
				return;
			case TextPackage.BLOCK__POST_LINE:
				setPostLine((Line)newValue);
				return;
			case TextPackage.BLOCK__TABBED:
				setTabbed((Boolean)newValue);
				return;
			case TextPackage.BLOCK__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends Content>)newValue);
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
			case TextPackage.BLOCK__INNER_BLOCK:
				getInnerBlock().clear();
				return;
			case TextPackage.BLOCK__INNER_LINE:
				getInnerLine().clear();
				return;
			case TextPackage.BLOCK__PRE_LINE:
				setPreLine((Line)null);
				return;
			case TextPackage.BLOCK__POST_LINE:
				setPostLine((Line)null);
				return;
			case TextPackage.BLOCK__TABBED:
				setTabbed(TABBED_EDEFAULT);
				return;
			case TextPackage.BLOCK__CONTENT:
				getContent().clear();
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
			case TextPackage.BLOCK__INNER_BLOCK:
				return innerBlock != null && !innerBlock.isEmpty();
			case TextPackage.BLOCK__INNER_LINE:
				return innerLine != null && !innerLine.isEmpty();
			case TextPackage.BLOCK__PRE_LINE:
				return preLine != null;
			case TextPackage.BLOCK__POST_LINE:
				return postLine != null;
			case TextPackage.BLOCK__TABBED:
				return tabbed != TABBED_EDEFAULT;
			case TextPackage.BLOCK__CONTENT:
				return content != null && !content.isEmpty();
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
		result.append(" (tabbed: ");
		result.append(tabbed);
		result.append(')');
		return result.toString();
	}

} //BlockImpl
