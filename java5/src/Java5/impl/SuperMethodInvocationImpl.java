/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5.impl;

import Java5.Expression;
import Java5.Java5Package;
import Java5.NamedElementRef;
import Java5.SuperMethodInvocation;

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
 * An implementation of the model object '<em><b>Super Method Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Java5.impl.SuperMethodInvocationImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link Java5.impl.SuperMethodInvocationImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link Java5.impl.SuperMethodInvocationImpl#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SuperMethodInvocationImpl extends ExpressionImpl implements SuperMethodInvocation {
	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> arguments;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected NamedElementRef method;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected NamedElementRef qualifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperMethodInvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java5Package.Literals.SUPER_METHOD_INVOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<Expression>(Expression.class, this, Java5Package.SUPER_METHOD_INVOCATION__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElementRef getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(NamedElementRef newMethod, NotificationChain msgs) {
		NamedElementRef oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Java5Package.SUPER_METHOD_INVOCATION__METHOD, oldMethod, newMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(NamedElementRef newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java5Package.SUPER_METHOD_INVOCATION__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java5Package.SUPER_METHOD_INVOCATION__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.SUPER_METHOD_INVOCATION__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElementRef getQualifier() {
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualifier(NamedElementRef newQualifier, NotificationChain msgs) {
		NamedElementRef oldQualifier = qualifier;
		qualifier = newQualifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Java5Package.SUPER_METHOD_INVOCATION__QUALIFIER, oldQualifier, newQualifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifier(NamedElementRef newQualifier) {
		if (newQualifier != qualifier) {
			NotificationChain msgs = null;
			if (qualifier != null)
				msgs = ((InternalEObject)qualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java5Package.SUPER_METHOD_INVOCATION__QUALIFIER, null, msgs);
			if (newQualifier != null)
				msgs = ((InternalEObject)newQualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java5Package.SUPER_METHOD_INVOCATION__QUALIFIER, null, msgs);
			msgs = basicSetQualifier(newQualifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.SUPER_METHOD_INVOCATION__QUALIFIER, newQualifier, newQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java5Package.SUPER_METHOD_INVOCATION__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case Java5Package.SUPER_METHOD_INVOCATION__METHOD:
				return basicSetMethod(null, msgs);
			case Java5Package.SUPER_METHOD_INVOCATION__QUALIFIER:
				return basicSetQualifier(null, msgs);
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
			case Java5Package.SUPER_METHOD_INVOCATION__ARGUMENTS:
				return getArguments();
			case Java5Package.SUPER_METHOD_INVOCATION__METHOD:
				return getMethod();
			case Java5Package.SUPER_METHOD_INVOCATION__QUALIFIER:
				return getQualifier();
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
			case Java5Package.SUPER_METHOD_INVOCATION__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Expression>)newValue);
				return;
			case Java5Package.SUPER_METHOD_INVOCATION__METHOD:
				setMethod((NamedElementRef)newValue);
				return;
			case Java5Package.SUPER_METHOD_INVOCATION__QUALIFIER:
				setQualifier((NamedElementRef)newValue);
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
			case Java5Package.SUPER_METHOD_INVOCATION__ARGUMENTS:
				getArguments().clear();
				return;
			case Java5Package.SUPER_METHOD_INVOCATION__METHOD:
				setMethod((NamedElementRef)null);
				return;
			case Java5Package.SUPER_METHOD_INVOCATION__QUALIFIER:
				setQualifier((NamedElementRef)null);
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
			case Java5Package.SUPER_METHOD_INVOCATION__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case Java5Package.SUPER_METHOD_INVOCATION__METHOD:
				return method != null;
			case Java5Package.SUPER_METHOD_INVOCATION__QUALIFIER:
				return qualifier != null;
		}
		return super.eIsSet(featureID);
	}

} //SuperMethodInvocationImpl
