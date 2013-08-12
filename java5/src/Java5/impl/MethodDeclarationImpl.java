/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5.impl;

import Java5.Block;
import Java5.Java5Package;
import Java5.MethodDeclaration;
import Java5.NamedElementRef;
import Java5.SingleVariableDeclaration;
import Java5.TypeParameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Java5.impl.MethodDeclarationImpl#getExtraArrayDimensions <em>Extra Array Dimensions</em>}</li>
 *   <li>{@link Java5.impl.MethodDeclarationImpl#isConstructor <em>Constructor</em>}</li>
 *   <li>{@link Java5.impl.MethodDeclarationImpl#isVarargs <em>Varargs</em>}</li>
 *   <li>{@link Java5.impl.MethodDeclarationImpl#getBody <em>Body</em>}</li>
 *   <li>{@link Java5.impl.MethodDeclarationImpl#getThrownExceptions <em>Thrown Exceptions</em>}</li>
 *   <li>{@link Java5.impl.MethodDeclarationImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link Java5.impl.MethodDeclarationImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link Java5.impl.MethodDeclarationImpl#getRedefinedMethodDeclaration <em>Redefined Method Declaration</em>}</li>
 *   <li>{@link Java5.impl.MethodDeclarationImpl#getRedefinitions <em>Redefinitions</em>}</li>
 *   <li>{@link Java5.impl.MethodDeclarationImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodDeclarationImpl extends BodyDeclarationImpl implements MethodDeclaration {
	/**
	 * The default value of the '{@link #getExtraArrayDimensions() <em>Extra Array Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraArrayDimensions()
	 * @generated
	 * @ordered
	 */
	protected static final int EXTRA_ARRAY_DIMENSIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExtraArrayDimensions() <em>Extra Array Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraArrayDimensions()
	 * @generated
	 * @ordered
	 */
	protected int extraArrayDimensions = EXTRA_ARRAY_DIMENSIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #isConstructor() <em>Constructor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstructor()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTRUCTOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstructor() <em>Constructor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstructor()
	 * @generated
	 * @ordered
	 */
	protected boolean constructor = CONSTRUCTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isVarargs() <em>Varargs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVarargs()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VARARGS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVarargs() <em>Varargs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVarargs()
	 * @generated
	 * @ordered
	 */
	protected boolean varargs = VARARGS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Block body;

	/**
	 * The cached value of the '{@link #getThrownExceptions() <em>Thrown Exceptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrownExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElementRef> thrownExceptions;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected NamedElementRef returnType;

	/**
	 * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeParameter> typeParameters;

	/**
	 * The cached value of the '{@link #getRedefinedMethodDeclaration() <em>Redefined Method Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedMethodDeclaration()
	 * @generated
	 * @ordered
	 */
	protected MethodDeclaration redefinedMethodDeclaration;

	/**
	 * The cached value of the '{@link #getRedefinitions() <em>Redefinitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodDeclaration> redefinitions;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleVariableDeclaration> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java5Package.Literals.METHOD_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExtraArrayDimensions() {
		return extraArrayDimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraArrayDimensions(int newExtraArrayDimensions) {
		int oldExtraArrayDimensions = extraArrayDimensions;
		extraArrayDimensions = newExtraArrayDimensions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.METHOD_DECLARATION__EXTRA_ARRAY_DIMENSIONS, oldExtraArrayDimensions, extraArrayDimensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConstructor() {
		return constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstructor(boolean newConstructor) {
		boolean oldConstructor = constructor;
		constructor = newConstructor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.METHOD_DECLARATION__CONSTRUCTOR, oldConstructor, constructor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVarargs() {
		return varargs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarargs(boolean newVarargs) {
		boolean oldVarargs = varargs;
		varargs = newVarargs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.METHOD_DECLARATION__VARARGS, oldVarargs, varargs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Block newBody, NotificationChain msgs) {
		Block oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Java5Package.METHOD_DECLARATION__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Block newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java5Package.METHOD_DECLARATION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java5Package.METHOD_DECLARATION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.METHOD_DECLARATION__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElementRef> getThrownExceptions() {
		if (thrownExceptions == null) {
			thrownExceptions = new EObjectContainmentEList<NamedElementRef>(NamedElementRef.class, this, Java5Package.METHOD_DECLARATION__THROWN_EXCEPTIONS);
		}
		return thrownExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElementRef getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(NamedElementRef newReturnType, NotificationChain msgs) {
		NamedElementRef oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Java5Package.METHOD_DECLARATION__RETURN_TYPE, oldReturnType, newReturnType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(NamedElementRef newReturnType) {
		if (newReturnType != returnType) {
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java5Package.METHOD_DECLARATION__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java5Package.METHOD_DECLARATION__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.METHOD_DECLARATION__RETURN_TYPE, newReturnType, newReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeParameter> getTypeParameters() {
		if (typeParameters == null) {
			typeParameters = new EObjectContainmentEList<TypeParameter>(TypeParameter.class, this, Java5Package.METHOD_DECLARATION__TYPE_PARAMETERS);
		}
		return typeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodDeclaration getRedefinedMethodDeclaration() {
		if (redefinedMethodDeclaration != null && redefinedMethodDeclaration.eIsProxy()) {
			InternalEObject oldRedefinedMethodDeclaration = (InternalEObject)redefinedMethodDeclaration;
			redefinedMethodDeclaration = (MethodDeclaration)eResolveProxy(oldRedefinedMethodDeclaration);
			if (redefinedMethodDeclaration != oldRedefinedMethodDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java5Package.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION, oldRedefinedMethodDeclaration, redefinedMethodDeclaration));
			}
		}
		return redefinedMethodDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodDeclaration basicGetRedefinedMethodDeclaration() {
		return redefinedMethodDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRedefinedMethodDeclaration(MethodDeclaration newRedefinedMethodDeclaration, NotificationChain msgs) {
		MethodDeclaration oldRedefinedMethodDeclaration = redefinedMethodDeclaration;
		redefinedMethodDeclaration = newRedefinedMethodDeclaration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Java5Package.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION, oldRedefinedMethodDeclaration, newRedefinedMethodDeclaration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedMethodDeclaration(MethodDeclaration newRedefinedMethodDeclaration) {
		if (newRedefinedMethodDeclaration != redefinedMethodDeclaration) {
			NotificationChain msgs = null;
			if (redefinedMethodDeclaration != null)
				msgs = ((InternalEObject)redefinedMethodDeclaration).eInverseRemove(this, Java5Package.METHOD_DECLARATION__REDEFINITIONS, MethodDeclaration.class, msgs);
			if (newRedefinedMethodDeclaration != null)
				msgs = ((InternalEObject)newRedefinedMethodDeclaration).eInverseAdd(this, Java5Package.METHOD_DECLARATION__REDEFINITIONS, MethodDeclaration.class, msgs);
			msgs = basicSetRedefinedMethodDeclaration(newRedefinedMethodDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION, newRedefinedMethodDeclaration, newRedefinedMethodDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodDeclaration> getRedefinitions() {
		if (redefinitions == null) {
			redefinitions = new EObjectWithInverseResolvingEList<MethodDeclaration>(MethodDeclaration.class, this, Java5Package.METHOD_DECLARATION__REDEFINITIONS, Java5Package.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION);
		}
		return redefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SingleVariableDeclaration> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<SingleVariableDeclaration>(SingleVariableDeclaration.class, this, Java5Package.METHOD_DECLARATION__PARAMETERS, Java5Package.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION);
		}
		return parameters;
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
			case Java5Package.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION:
				if (redefinedMethodDeclaration != null)
					msgs = ((InternalEObject)redefinedMethodDeclaration).eInverseRemove(this, Java5Package.METHOD_DECLARATION__REDEFINITIONS, MethodDeclaration.class, msgs);
				return basicSetRedefinedMethodDeclaration((MethodDeclaration)otherEnd, msgs);
			case Java5Package.METHOD_DECLARATION__REDEFINITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRedefinitions()).basicAdd(otherEnd, msgs);
			case Java5Package.METHOD_DECLARATION__PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters()).basicAdd(otherEnd, msgs);
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
			case Java5Package.METHOD_DECLARATION__BODY:
				return basicSetBody(null, msgs);
			case Java5Package.METHOD_DECLARATION__THROWN_EXCEPTIONS:
				return ((InternalEList<?>)getThrownExceptions()).basicRemove(otherEnd, msgs);
			case Java5Package.METHOD_DECLARATION__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case Java5Package.METHOD_DECLARATION__TYPE_PARAMETERS:
				return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
			case Java5Package.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION:
				return basicSetRedefinedMethodDeclaration(null, msgs);
			case Java5Package.METHOD_DECLARATION__REDEFINITIONS:
				return ((InternalEList<?>)getRedefinitions()).basicRemove(otherEnd, msgs);
			case Java5Package.METHOD_DECLARATION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case Java5Package.METHOD_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
				return getExtraArrayDimensions();
			case Java5Package.METHOD_DECLARATION__CONSTRUCTOR:
				return isConstructor();
			case Java5Package.METHOD_DECLARATION__VARARGS:
				return isVarargs();
			case Java5Package.METHOD_DECLARATION__BODY:
				return getBody();
			case Java5Package.METHOD_DECLARATION__THROWN_EXCEPTIONS:
				return getThrownExceptions();
			case Java5Package.METHOD_DECLARATION__RETURN_TYPE:
				return getReturnType();
			case Java5Package.METHOD_DECLARATION__TYPE_PARAMETERS:
				return getTypeParameters();
			case Java5Package.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION:
				if (resolve) return getRedefinedMethodDeclaration();
				return basicGetRedefinedMethodDeclaration();
			case Java5Package.METHOD_DECLARATION__REDEFINITIONS:
				return getRedefinitions();
			case Java5Package.METHOD_DECLARATION__PARAMETERS:
				return getParameters();
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
			case Java5Package.METHOD_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
				setExtraArrayDimensions((Integer)newValue);
				return;
			case Java5Package.METHOD_DECLARATION__CONSTRUCTOR:
				setConstructor((Boolean)newValue);
				return;
			case Java5Package.METHOD_DECLARATION__VARARGS:
				setVarargs((Boolean)newValue);
				return;
			case Java5Package.METHOD_DECLARATION__BODY:
				setBody((Block)newValue);
				return;
			case Java5Package.METHOD_DECLARATION__THROWN_EXCEPTIONS:
				getThrownExceptions().clear();
				getThrownExceptions().addAll((Collection<? extends NamedElementRef>)newValue);
				return;
			case Java5Package.METHOD_DECLARATION__RETURN_TYPE:
				setReturnType((NamedElementRef)newValue);
				return;
			case Java5Package.METHOD_DECLARATION__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends TypeParameter>)newValue);
				return;
			case Java5Package.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION:
				setRedefinedMethodDeclaration((MethodDeclaration)newValue);
				return;
			case Java5Package.METHOD_DECLARATION__REDEFINITIONS:
				getRedefinitions().clear();
				getRedefinitions().addAll((Collection<? extends MethodDeclaration>)newValue);
				return;
			case Java5Package.METHOD_DECLARATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends SingleVariableDeclaration>)newValue);
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
			case Java5Package.METHOD_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
				setExtraArrayDimensions(EXTRA_ARRAY_DIMENSIONS_EDEFAULT);
				return;
			case Java5Package.METHOD_DECLARATION__CONSTRUCTOR:
				setConstructor(CONSTRUCTOR_EDEFAULT);
				return;
			case Java5Package.METHOD_DECLARATION__VARARGS:
				setVarargs(VARARGS_EDEFAULT);
				return;
			case Java5Package.METHOD_DECLARATION__BODY:
				setBody((Block)null);
				return;
			case Java5Package.METHOD_DECLARATION__THROWN_EXCEPTIONS:
				getThrownExceptions().clear();
				return;
			case Java5Package.METHOD_DECLARATION__RETURN_TYPE:
				setReturnType((NamedElementRef)null);
				return;
			case Java5Package.METHOD_DECLARATION__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
			case Java5Package.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION:
				setRedefinedMethodDeclaration((MethodDeclaration)null);
				return;
			case Java5Package.METHOD_DECLARATION__REDEFINITIONS:
				getRedefinitions().clear();
				return;
			case Java5Package.METHOD_DECLARATION__PARAMETERS:
				getParameters().clear();
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
			case Java5Package.METHOD_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
				return extraArrayDimensions != EXTRA_ARRAY_DIMENSIONS_EDEFAULT;
			case Java5Package.METHOD_DECLARATION__CONSTRUCTOR:
				return constructor != CONSTRUCTOR_EDEFAULT;
			case Java5Package.METHOD_DECLARATION__VARARGS:
				return varargs != VARARGS_EDEFAULT;
			case Java5Package.METHOD_DECLARATION__BODY:
				return body != null;
			case Java5Package.METHOD_DECLARATION__THROWN_EXCEPTIONS:
				return thrownExceptions != null && !thrownExceptions.isEmpty();
			case Java5Package.METHOD_DECLARATION__RETURN_TYPE:
				return returnType != null;
			case Java5Package.METHOD_DECLARATION__TYPE_PARAMETERS:
				return typeParameters != null && !typeParameters.isEmpty();
			case Java5Package.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION:
				return redefinedMethodDeclaration != null;
			case Java5Package.METHOD_DECLARATION__REDEFINITIONS:
				return redefinitions != null && !redefinitions.isEmpty();
			case Java5Package.METHOD_DECLARATION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
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
		result.append(" (extraArrayDimensions: ");
		result.append(extraArrayDimensions);
		result.append(", constructor: ");
		result.append(constructor);
		result.append(", varargs: ");
		result.append(varargs);
		result.append(')');
		return result.toString();
	}

} //MethodDeclarationImpl
