/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5.impl;

import Java5.FieldDeclaration;
import Java5.Java5Package;
import Java5.VariableDeclarationExpression;
import Java5.VariableDeclarationFragment;
import Java5.VariableDeclarationStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Java5.impl.VariableDeclarationFragmentImpl#getFieldDeclaration <em>Field Declaration</em>}</li>
 *   <li>{@link Java5.impl.VariableDeclarationFragmentImpl#getVariableDeclarationStatement <em>Variable Declaration Statement</em>}</li>
 *   <li>{@link Java5.impl.VariableDeclarationFragmentImpl#getVariableDeclarationExpression <em>Variable Declaration Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDeclarationFragmentImpl extends VariableDeclarationImpl implements VariableDeclarationFragment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java5Package.Literals.VARIABLE_DECLARATION_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldDeclaration getFieldDeclaration() {
		if (eContainerFeatureID() != Java5Package.VARIABLE_DECLARATION_FRAGMENT__FIELD_DECLARATION) return null;
		return (FieldDeclaration)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFieldDeclaration(FieldDeclaration newFieldDeclaration, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFieldDeclaration, Java5Package.VARIABLE_DECLARATION_FRAGMENT__FIELD_DECLARATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldDeclaration(FieldDeclaration newFieldDeclaration) {
		if (newFieldDeclaration != eInternalContainer() || (eContainerFeatureID() != Java5Package.VARIABLE_DECLARATION_FRAGMENT__FIELD_DECLARATION && newFieldDeclaration != null)) {
			if (EcoreUtil.isAncestor(this, newFieldDeclaration))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFieldDeclaration != null)
				msgs = ((InternalEObject)newFieldDeclaration).eInverseAdd(this, Java5Package.FIELD_DECLARATION__FRAGMENTS, FieldDeclaration.class, msgs);
			msgs = basicSetFieldDeclaration(newFieldDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.VARIABLE_DECLARATION_FRAGMENT__FIELD_DECLARATION, newFieldDeclaration, newFieldDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationStatement getVariableDeclarationStatement() {
		if (eContainerFeatureID() != Java5Package.VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_STATEMENT) return null;
		return (VariableDeclarationStatement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableDeclarationStatement(VariableDeclarationStatement newVariableDeclarationStatement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVariableDeclarationStatement, Java5Package.VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_STATEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableDeclarationStatement(VariableDeclarationStatement newVariableDeclarationStatement) {
		if (newVariableDeclarationStatement != eInternalContainer() || (eContainerFeatureID() != Java5Package.VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_STATEMENT && newVariableDeclarationStatement != null)) {
			if (EcoreUtil.isAncestor(this, newVariableDeclarationStatement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVariableDeclarationStatement != null)
				msgs = ((InternalEObject)newVariableDeclarationStatement).eInverseAdd(this, Java5Package.VARIABLE_DECLARATION_STATEMENT__FRAGMENTS, VariableDeclarationStatement.class, msgs);
			msgs = basicSetVariableDeclarationStatement(newVariableDeclarationStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_STATEMENT, newVariableDeclarationStatement, newVariableDeclarationStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationExpression getVariableDeclarationExpression() {
		if (eContainerFeatureID() != Java5Package.VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_EXPRESSION) return null;
		return (VariableDeclarationExpression)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableDeclarationExpression(VariableDeclarationExpression newVariableDeclarationExpression, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVariableDeclarationExpression, Java5Package.VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableDeclarationExpression(VariableDeclarationExpression newVariableDeclarationExpression) {
		if (newVariableDeclarationExpression != eInternalContainer() || (eContainerFeatureID() != Java5Package.VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_EXPRESSION && newVariableDeclarationExpression != null)) {
			if (EcoreUtil.isAncestor(this, newVariableDeclarationExpression))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVariableDeclarationExpression != null)
				msgs = ((InternalEObject)newVariableDeclarationExpression).eInverseAdd(this, Java5Package.VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS, VariableDeclarationExpression.class, msgs);
			msgs = basicSetVariableDeclarationExpression(newVariableDeclarationExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_EXPRESSION, newVariableDeclarationExpression, newVariableDeclarationExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java5Package.VARIABLE_DECLARATION_FRAGMENT__FIELD_DECLARATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFieldDeclaration((FieldDeclaration)otherEnd, msgs);
			case Java5Package.VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_STATEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVariableDeclarationStatement((VariableDeclarationStatement)otherEnd, msgs);
			case Java5Package.VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_EXPRESSION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVariableDeclarationExpression((VariableDeclarationExpression)otherEnd, msgs);
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
			case Java5Package.VARIABLE_DECLARATION_FRAGMENT__FIELD_DECLARATION:
				return basicSetFieldDeclaration(null, msgs);
			case Java5Package.VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_STATEMENT:
				return basicSetVariableDeclarationStatement(null, msgs);
			case Java5Package.VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_EXPRESSION:
				return basicSetVariableDeclarationExpression(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Java5Package.VARIABLE_DECLARATION_FRAGMENT__FIELD_DECLARATION:
				return eInternalContainer().eInverseRemove(this, Java5Package.FIELD_DECLARATION__FRAGMENTS, FieldDeclaration.class, msgs);
			case Java5Package.VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_STATEMENT:
				return eInternalContainer().eInverseRemove(this, Java5Package.VARIABLE_DECLARATION_STATEMENT__FRAGMENTS, VariableDeclarationStatement.class, msgs);
			case Java5Package.VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_EXPRESSION:
				return eInternalContainer().eInverseRemove(this, Java5Package.VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS, VariableDeclarationExpression.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java5Package.VARIABLE_DECLARATION_FRAGMENT__FIELD_DECLARATION:
				return getFieldDeclaration();
			case Java5Package.VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_STATEMENT:
				return getVariableDeclarationStatement();
			case Java5Package.VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_EXPRESSION:
				return getVariableDeclarationExpression();
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
			case Java5Package.VARIABLE_DECLARATION_FRAGMENT__FIELD_DECLARATION:
				setFieldDeclaration((FieldDeclaration)newValue);
				return;
			case Java5Package.VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_STATEMENT:
				setVariableDeclarationStatement((VariableDeclarationStatement)newValue);
				return;
			case Java5Package.VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_EXPRESSION:
				setVariableDeclarationExpression((VariableDeclarationExpression)newValue);
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
			case Java5Package.VARIABLE_DECLARATION_FRAGMENT__FIELD_DECLARATION:
				setFieldDeclaration((FieldDeclaration)null);
				return;
			case Java5Package.VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_STATEMENT:
				setVariableDeclarationStatement((VariableDeclarationStatement)null);
				return;
			case Java5Package.VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_EXPRESSION:
				setVariableDeclarationExpression((VariableDeclarationExpression)null);
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
			case Java5Package.VARIABLE_DECLARATION_FRAGMENT__FIELD_DECLARATION:
				return getFieldDeclaration() != null;
			case Java5Package.VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_STATEMENT:
				return getVariableDeclarationStatement() != null;
			case Java5Package.VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_EXPRESSION:
				return getVariableDeclarationExpression() != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableDeclarationFragmentImpl
