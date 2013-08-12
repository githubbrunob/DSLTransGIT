/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5.impl;

import Java5.Java5Package;
import Java5.Modifier;
import Java5.NamedElementRef;
import Java5.VariableDeclarationExpression;
import Java5.VariableDeclarationFragment;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Java5.impl.VariableDeclarationExpressionImpl#getType <em>Type</em>}</li>
 *   <li>{@link Java5.impl.VariableDeclarationExpressionImpl#getFragments <em>Fragments</em>}</li>
 *   <li>{@link Java5.impl.VariableDeclarationExpressionImpl#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDeclarationExpressionImpl extends ExpressionImpl implements VariableDeclarationExpression {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NamedElementRef type;

	/**
	 * The cached value of the '{@link #getFragments() <em>Fragments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclarationFragment> fragments;

	/**
	 * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Modifier> modifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java5Package.Literals.VARIABLE_DECLARATION_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElementRef getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(NamedElementRef newType, NotificationChain msgs) {
		NamedElementRef oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Java5Package.VARIABLE_DECLARATION_EXPRESSION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(NamedElementRef newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java5Package.VARIABLE_DECLARATION_EXPRESSION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java5Package.VARIABLE_DECLARATION_EXPRESSION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.VARIABLE_DECLARATION_EXPRESSION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDeclarationFragment> getFragments() {
		if (fragments == null) {
			fragments = new EObjectContainmentWithInverseEList<VariableDeclarationFragment>(VariableDeclarationFragment.class, this, Java5Package.VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS, Java5Package.VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_EXPRESSION);
		}
		return fragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Modifier> getModifiers() {
		if (modifiers == null) {
			modifiers = new EObjectContainmentWithInverseEList<Modifier>(Modifier.class, this, Java5Package.VARIABLE_DECLARATION_EXPRESSION__MODIFIERS, Java5Package.MODIFIER__VARIABLE_DECLARATION_EXPRESSION);
		}
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java5Package.VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFragments()).basicAdd(otherEnd, msgs);
			case Java5Package.VARIABLE_DECLARATION_EXPRESSION__MODIFIERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModifiers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java5Package.VARIABLE_DECLARATION_EXPRESSION__TYPE:
				return basicSetType(null, msgs);
			case Java5Package.VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS:
				return ((InternalEList<?>)getFragments()).basicRemove(otherEnd, msgs);
			case Java5Package.VARIABLE_DECLARATION_EXPRESSION__MODIFIERS:
				return ((InternalEList<?>)getModifiers()).basicRemove(otherEnd, msgs);
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
			case Java5Package.VARIABLE_DECLARATION_EXPRESSION__TYPE:
				return getType();
			case Java5Package.VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS:
				return getFragments();
			case Java5Package.VARIABLE_DECLARATION_EXPRESSION__MODIFIERS:
				return getModifiers();
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
			case Java5Package.VARIABLE_DECLARATION_EXPRESSION__TYPE:
				setType((NamedElementRef)newValue);
				return;
			case Java5Package.VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS:
				getFragments().clear();
				getFragments().addAll((Collection<? extends VariableDeclarationFragment>)newValue);
				return;
			case Java5Package.VARIABLE_DECLARATION_EXPRESSION__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends Modifier>)newValue);
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
			case Java5Package.VARIABLE_DECLARATION_EXPRESSION__TYPE:
				setType((NamedElementRef)null);
				return;
			case Java5Package.VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS:
				getFragments().clear();
				return;
			case Java5Package.VARIABLE_DECLARATION_EXPRESSION__MODIFIERS:
				getModifiers().clear();
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
			case Java5Package.VARIABLE_DECLARATION_EXPRESSION__TYPE:
				return type != null;
			case Java5Package.VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS:
				return fragments != null && !fragments.isEmpty();
			case Java5Package.VARIABLE_DECLARATION_EXPRESSION__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VariableDeclarationExpressionImpl
