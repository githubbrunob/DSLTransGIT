/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestIntentionModuleImpl.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.impl;

import SATEL.APN.adtmm.ADT;

import SATEL.APN.apnmm.APN;

import SATEL.SATELPackage;
import SATEL.TestIntentionBody;
import SATEL.TestIntentionInterface;
import SATEL.TestIntentionModule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Intention Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SATEL.impl.TestIntentionModuleImpl#getTestIntentionBody <em>Test Intention Body</em>}</li>
 *   <li>{@link SATEL.impl.TestIntentionModuleImpl#getTestIntentionInterface <em>Test Intention Interface</em>}</li>
 *   <li>{@link SATEL.impl.TestIntentionModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link SATEL.impl.TestIntentionModuleImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link SATEL.impl.TestIntentionModuleImpl#getAlgebra <em>Algebra</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestIntentionModuleImpl extends EObjectImpl implements TestIntentionModule {
	/**
	 * The cached value of the '{@link #getTestIntentionBody() <em>Test Intention Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntentionBody()
	 * @generated
	 * @ordered
	 */
	protected TestIntentionBody testIntentionBody;

	/**
	 * The cached value of the '{@link #getTestIntentionInterface() <em>Test Intention Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestIntentionInterface()
	 * @generated
	 * @ordered
	 */
	protected TestIntentionInterface testIntentionInterface;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFocus() <em>Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocus()
	 * @generated
	 * @ordered
	 */
	protected APN focus;

	/**
	 * The cached value of the '{@link #getAlgebra() <em>Algebra</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgebra()
	 * @generated
	 * @ordered
	 */
	protected EList<ADT> algebra;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestIntentionModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SATELPackage.Literals.TEST_INTENTION_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestIntentionBody getTestIntentionBody() {
		return testIntentionBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestIntentionBody(TestIntentionBody newTestIntentionBody, NotificationChain msgs) {
		TestIntentionBody oldTestIntentionBody = testIntentionBody;
		testIntentionBody = newTestIntentionBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SATELPackage.TEST_INTENTION_MODULE__TEST_INTENTION_BODY, oldTestIntentionBody, newTestIntentionBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestIntentionBody(TestIntentionBody newTestIntentionBody) {
		if (newTestIntentionBody != testIntentionBody) {
			NotificationChain msgs = null;
			if (testIntentionBody != null)
				msgs = ((InternalEObject)testIntentionBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SATELPackage.TEST_INTENTION_MODULE__TEST_INTENTION_BODY, null, msgs);
			if (newTestIntentionBody != null)
				msgs = ((InternalEObject)newTestIntentionBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SATELPackage.TEST_INTENTION_MODULE__TEST_INTENTION_BODY, null, msgs);
			msgs = basicSetTestIntentionBody(newTestIntentionBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SATELPackage.TEST_INTENTION_MODULE__TEST_INTENTION_BODY, newTestIntentionBody, newTestIntentionBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestIntentionInterface getTestIntentionInterface() {
		return testIntentionInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestIntentionInterface(TestIntentionInterface newTestIntentionInterface, NotificationChain msgs) {
		TestIntentionInterface oldTestIntentionInterface = testIntentionInterface;
		testIntentionInterface = newTestIntentionInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SATELPackage.TEST_INTENTION_MODULE__TEST_INTENTION_INTERFACE, oldTestIntentionInterface, newTestIntentionInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestIntentionInterface(TestIntentionInterface newTestIntentionInterface) {
		if (newTestIntentionInterface != testIntentionInterface) {
			NotificationChain msgs = null;
			if (testIntentionInterface != null)
				msgs = ((InternalEObject)testIntentionInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SATELPackage.TEST_INTENTION_MODULE__TEST_INTENTION_INTERFACE, null, msgs);
			if (newTestIntentionInterface != null)
				msgs = ((InternalEObject)newTestIntentionInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SATELPackage.TEST_INTENTION_MODULE__TEST_INTENTION_INTERFACE, null, msgs);
			msgs = basicSetTestIntentionInterface(newTestIntentionInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SATELPackage.TEST_INTENTION_MODULE__TEST_INTENTION_INTERFACE, newTestIntentionInterface, newTestIntentionInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SATELPackage.TEST_INTENTION_MODULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APN getFocus() {
		return focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFocus(APN newFocus, NotificationChain msgs) {
		APN oldFocus = focus;
		focus = newFocus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SATELPackage.TEST_INTENTION_MODULE__FOCUS, oldFocus, newFocus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocus(APN newFocus) {
		if (newFocus != focus) {
			NotificationChain msgs = null;
			if (focus != null)
				msgs = ((InternalEObject)focus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SATELPackage.TEST_INTENTION_MODULE__FOCUS, null, msgs);
			if (newFocus != null)
				msgs = ((InternalEObject)newFocus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SATELPackage.TEST_INTENTION_MODULE__FOCUS, null, msgs);
			msgs = basicSetFocus(newFocus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SATELPackage.TEST_INTENTION_MODULE__FOCUS, newFocus, newFocus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADT> getAlgebra() {
		if (algebra == null) {
			algebra = new EObjectContainmentEList<ADT>(ADT.class, this, SATELPackage.TEST_INTENTION_MODULE__ALGEBRA);
		}
		return algebra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SATELPackage.TEST_INTENTION_MODULE__TEST_INTENTION_BODY:
				return basicSetTestIntentionBody(null, msgs);
			case SATELPackage.TEST_INTENTION_MODULE__TEST_INTENTION_INTERFACE:
				return basicSetTestIntentionInterface(null, msgs);
			case SATELPackage.TEST_INTENTION_MODULE__FOCUS:
				return basicSetFocus(null, msgs);
			case SATELPackage.TEST_INTENTION_MODULE__ALGEBRA:
				return ((InternalEList<?>)getAlgebra()).basicRemove(otherEnd, msgs);
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
			case SATELPackage.TEST_INTENTION_MODULE__TEST_INTENTION_BODY:
				return getTestIntentionBody();
			case SATELPackage.TEST_INTENTION_MODULE__TEST_INTENTION_INTERFACE:
				return getTestIntentionInterface();
			case SATELPackage.TEST_INTENTION_MODULE__NAME:
				return getName();
			case SATELPackage.TEST_INTENTION_MODULE__FOCUS:
				return getFocus();
			case SATELPackage.TEST_INTENTION_MODULE__ALGEBRA:
				return getAlgebra();
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
			case SATELPackage.TEST_INTENTION_MODULE__TEST_INTENTION_BODY:
				setTestIntentionBody((TestIntentionBody)newValue);
				return;
			case SATELPackage.TEST_INTENTION_MODULE__TEST_INTENTION_INTERFACE:
				setTestIntentionInterface((TestIntentionInterface)newValue);
				return;
			case SATELPackage.TEST_INTENTION_MODULE__NAME:
				setName((String)newValue);
				return;
			case SATELPackage.TEST_INTENTION_MODULE__FOCUS:
				setFocus((APN)newValue);
				return;
			case SATELPackage.TEST_INTENTION_MODULE__ALGEBRA:
				getAlgebra().clear();
				getAlgebra().addAll((Collection<? extends ADT>)newValue);
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
			case SATELPackage.TEST_INTENTION_MODULE__TEST_INTENTION_BODY:
				setTestIntentionBody((TestIntentionBody)null);
				return;
			case SATELPackage.TEST_INTENTION_MODULE__TEST_INTENTION_INTERFACE:
				setTestIntentionInterface((TestIntentionInterface)null);
				return;
			case SATELPackage.TEST_INTENTION_MODULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SATELPackage.TEST_INTENTION_MODULE__FOCUS:
				setFocus((APN)null);
				return;
			case SATELPackage.TEST_INTENTION_MODULE__ALGEBRA:
				getAlgebra().clear();
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
			case SATELPackage.TEST_INTENTION_MODULE__TEST_INTENTION_BODY:
				return testIntentionBody != null;
			case SATELPackage.TEST_INTENTION_MODULE__TEST_INTENTION_INTERFACE:
				return testIntentionInterface != null;
			case SATELPackage.TEST_INTENTION_MODULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SATELPackage.TEST_INTENTION_MODULE__FOCUS:
				return focus != null;
			case SATELPackage.TEST_INTENTION_MODULE__ALGEBRA:
				return algebra != null && !algebra.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TestIntentionModuleImpl
