/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestIntentionBodyImpl.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.impl;

import SATEL.AxiomDeclaration;
import SATEL.SATELPackage;
import SATEL.TestIntentionBody;

import SATEL.VariableDeclarations.VariableDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Intention Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.impl.TestIntentionBodyImpl#getAxiomDeclaration <em>Axiom Declaration</em>}</li>
 *   <li>{@link SATEL.impl.TestIntentionBodyImpl#getVariableDeclaration <em>Variable Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestIntentionBodyImpl extends EObjectImpl implements TestIntentionBody {
	/**
	 * The cached value of the '{@link #getAxiomDeclaration() <em>Axiom Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxiomDeclaration()
	 * @generated
	 * @ordered
	 */
	protected AxiomDeclaration axiomDeclaration;

	/**
	 * The cached value of the '{@link #getVariableDeclaration() <em>Variable Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDeclaration()
	 * @generated
	 * @ordered
	 */
	protected VariableDeclaration variableDeclaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestIntentionBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SATELPackage.Literals.TEST_INTENTION_BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxiomDeclaration getAxiomDeclaration() {
		return axiomDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxiomDeclaration(AxiomDeclaration newAxiomDeclaration, NotificationChain msgs) {
		AxiomDeclaration oldAxiomDeclaration = axiomDeclaration;
		axiomDeclaration = newAxiomDeclaration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SATELPackage.TEST_INTENTION_BODY__AXIOM_DECLARATION, oldAxiomDeclaration, newAxiomDeclaration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxiomDeclaration(AxiomDeclaration newAxiomDeclaration) {
		if (newAxiomDeclaration != axiomDeclaration) {
			NotificationChain msgs = null;
			if (axiomDeclaration != null)
				msgs = ((InternalEObject)axiomDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SATELPackage.TEST_INTENTION_BODY__AXIOM_DECLARATION, null, msgs);
			if (newAxiomDeclaration != null)
				msgs = ((InternalEObject)newAxiomDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SATELPackage.TEST_INTENTION_BODY__AXIOM_DECLARATION, null, msgs);
			msgs = basicSetAxiomDeclaration(newAxiomDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SATELPackage.TEST_INTENTION_BODY__AXIOM_DECLARATION, newAxiomDeclaration, newAxiomDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration getVariableDeclaration() {
		return variableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableDeclaration(VariableDeclaration newVariableDeclaration, NotificationChain msgs) {
		VariableDeclaration oldVariableDeclaration = variableDeclaration;
		variableDeclaration = newVariableDeclaration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SATELPackage.TEST_INTENTION_BODY__VARIABLE_DECLARATION, oldVariableDeclaration, newVariableDeclaration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableDeclaration(VariableDeclaration newVariableDeclaration) {
		if (newVariableDeclaration != variableDeclaration) {
			NotificationChain msgs = null;
			if (variableDeclaration != null)
				msgs = ((InternalEObject)variableDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SATELPackage.TEST_INTENTION_BODY__VARIABLE_DECLARATION, null, msgs);
			if (newVariableDeclaration != null)
				msgs = ((InternalEObject)newVariableDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SATELPackage.TEST_INTENTION_BODY__VARIABLE_DECLARATION, null, msgs);
			msgs = basicSetVariableDeclaration(newVariableDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SATELPackage.TEST_INTENTION_BODY__VARIABLE_DECLARATION, newVariableDeclaration, newVariableDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SATELPackage.TEST_INTENTION_BODY__AXIOM_DECLARATION:
				return basicSetAxiomDeclaration(null, msgs);
			case SATELPackage.TEST_INTENTION_BODY__VARIABLE_DECLARATION:
				return basicSetVariableDeclaration(null, msgs);
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
			case SATELPackage.TEST_INTENTION_BODY__AXIOM_DECLARATION:
				return getAxiomDeclaration();
			case SATELPackage.TEST_INTENTION_BODY__VARIABLE_DECLARATION:
				return getVariableDeclaration();
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
			case SATELPackage.TEST_INTENTION_BODY__AXIOM_DECLARATION:
				setAxiomDeclaration((AxiomDeclaration)newValue);
				return;
			case SATELPackage.TEST_INTENTION_BODY__VARIABLE_DECLARATION:
				setVariableDeclaration((VariableDeclaration)newValue);
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
			case SATELPackage.TEST_INTENTION_BODY__AXIOM_DECLARATION:
				setAxiomDeclaration((AxiomDeclaration)null);
				return;
			case SATELPackage.TEST_INTENTION_BODY__VARIABLE_DECLARATION:
				setVariableDeclaration((VariableDeclaration)null);
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
			case SATELPackage.TEST_INTENTION_BODY__AXIOM_DECLARATION:
				return axiomDeclaration != null;
			case SATELPackage.TEST_INTENTION_BODY__VARIABLE_DECLARATION:
				return variableDeclaration != null;
		}
		return super.eIsSet(featureID);
	}

} //TestIntentionBodyImpl
