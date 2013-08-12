/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5.impl;

import Java5.BodyDeclaration;
import Java5.Java5Package;
import Java5.Modifier;
import Java5.SingleVariableDeclaration;
import Java5.VariableDeclarationExpression;
import Java5.VariableDeclarationStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Java5.impl.ModifierImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link Java5.impl.ModifierImpl#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link Java5.impl.ModifierImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link Java5.impl.ModifierImpl#isTransient <em>Transient</em>}</li>
 *   <li>{@link Java5.impl.ModifierImpl#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link Java5.impl.ModifierImpl#isNative <em>Native</em>}</li>
 *   <li>{@link Java5.impl.ModifierImpl#isStrictfp <em>Strictfp</em>}</li>
 *   <li>{@link Java5.impl.ModifierImpl#isSynchronized <em>Synchronized</em>}</li>
 *   <li>{@link Java5.impl.ModifierImpl#getBodyDeclaration <em>Body Declaration</em>}</li>
 *   <li>{@link Java5.impl.ModifierImpl#getSingleVariableDeclaration <em>Single Variable Declaration</em>}</li>
 *   <li>{@link Java5.impl.ModifierImpl#getVariableDeclarationStatement <em>Variable Declaration Statement</em>}</li>
 *   <li>{@link Java5.impl.ModifierImpl#getVariableDeclarationExpression <em>Variable Declaration Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModifierImpl extends ASTNodeImpl implements Modifier {
	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIBILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected String visibility = VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInheritance() <em>Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritance()
	 * @generated
	 * @ordered
	 */
	protected static final String INHERITANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInheritance() <em>Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritance()
	 * @generated
	 * @ordered
	 */
	protected String inheritance = INHERITANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean static_ = STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSIENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected boolean transient_ = TRANSIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VOLATILE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVolatile()
	 * @generated
	 * @ordered
	 */
	protected boolean volatile_ = VOLATILE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNative() <em>Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNative() <em>Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNative()
	 * @generated
	 * @ordered
	 */
	protected boolean native_ = NATIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isStrictfp() <em>Strictfp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrictfp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRICTFP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStrictfp() <em>Strictfp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrictfp()
	 * @generated
	 * @ordered
	 */
	protected boolean strictfp_ = STRICTFP_EDEFAULT;

	/**
	 * The default value of the '{@link #isSynchronized() <em>Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchronized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNCHRONIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSynchronized() <em>Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchronized()
	 * @generated
	 * @ordered
	 */
	protected boolean synchronized_ = SYNCHRONIZED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java5Package.Literals.MODIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(String newVisibility) {
		String oldVisibility = visibility;
		visibility = newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.MODIFIER__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInheritance() {
		return inheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritance(String newInheritance) {
		String oldInheritance = inheritance;
		inheritance = newInheritance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.MODIFIER__INHERITANCE, oldInheritance, inheritance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic() {
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(boolean newStatic) {
		boolean oldStatic = static_;
		static_ = newStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.MODIFIER__STATIC, oldStatic, static_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransient() {
		return transient_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransient(boolean newTransient) {
		boolean oldTransient = transient_;
		transient_ = newTransient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.MODIFIER__TRANSIENT, oldTransient, transient_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVolatile() {
		return volatile_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolatile(boolean newVolatile) {
		boolean oldVolatile = volatile_;
		volatile_ = newVolatile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.MODIFIER__VOLATILE, oldVolatile, volatile_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNative() {
		return native_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNative(boolean newNative) {
		boolean oldNative = native_;
		native_ = newNative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.MODIFIER__NATIVE, oldNative, native_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStrictfp() {
		return strictfp_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrictfp(boolean newStrictfp) {
		boolean oldStrictfp = strictfp_;
		strictfp_ = newStrictfp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.MODIFIER__STRICTFP, oldStrictfp, strictfp_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSynchronized() {
		return synchronized_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronized(boolean newSynchronized) {
		boolean oldSynchronized = synchronized_;
		synchronized_ = newSynchronized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.MODIFIER__SYNCHRONIZED, oldSynchronized, synchronized_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyDeclaration getBodyDeclaration() {
		if (eContainerFeatureID() != Java5Package.MODIFIER__BODY_DECLARATION) return null;
		return (BodyDeclaration)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodyDeclaration(BodyDeclaration newBodyDeclaration, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBodyDeclaration, Java5Package.MODIFIER__BODY_DECLARATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodyDeclaration(BodyDeclaration newBodyDeclaration) {
		if (newBodyDeclaration != eInternalContainer() || (eContainerFeatureID() != Java5Package.MODIFIER__BODY_DECLARATION && newBodyDeclaration != null)) {
			if (EcoreUtil.isAncestor(this, newBodyDeclaration))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBodyDeclaration != null)
				msgs = ((InternalEObject)newBodyDeclaration).eInverseAdd(this, Java5Package.BODY_DECLARATION__MODIFIERS, BodyDeclaration.class, msgs);
			msgs = basicSetBodyDeclaration(newBodyDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.MODIFIER__BODY_DECLARATION, newBodyDeclaration, newBodyDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleVariableDeclaration getSingleVariableDeclaration() {
		if (eContainerFeatureID() != Java5Package.MODIFIER__SINGLE_VARIABLE_DECLARATION) return null;
		return (SingleVariableDeclaration)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingleVariableDeclaration(SingleVariableDeclaration newSingleVariableDeclaration, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSingleVariableDeclaration, Java5Package.MODIFIER__SINGLE_VARIABLE_DECLARATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleVariableDeclaration(SingleVariableDeclaration newSingleVariableDeclaration) {
		if (newSingleVariableDeclaration != eInternalContainer() || (eContainerFeatureID() != Java5Package.MODIFIER__SINGLE_VARIABLE_DECLARATION && newSingleVariableDeclaration != null)) {
			if (EcoreUtil.isAncestor(this, newSingleVariableDeclaration))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSingleVariableDeclaration != null)
				msgs = ((InternalEObject)newSingleVariableDeclaration).eInverseAdd(this, Java5Package.SINGLE_VARIABLE_DECLARATION__MODIFIERS, SingleVariableDeclaration.class, msgs);
			msgs = basicSetSingleVariableDeclaration(newSingleVariableDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.MODIFIER__SINGLE_VARIABLE_DECLARATION, newSingleVariableDeclaration, newSingleVariableDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationStatement getVariableDeclarationStatement() {
		if (eContainerFeatureID() != Java5Package.MODIFIER__VARIABLE_DECLARATION_STATEMENT) return null;
		return (VariableDeclarationStatement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableDeclarationStatement(VariableDeclarationStatement newVariableDeclarationStatement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVariableDeclarationStatement, Java5Package.MODIFIER__VARIABLE_DECLARATION_STATEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableDeclarationStatement(VariableDeclarationStatement newVariableDeclarationStatement) {
		if (newVariableDeclarationStatement != eInternalContainer() || (eContainerFeatureID() != Java5Package.MODIFIER__VARIABLE_DECLARATION_STATEMENT && newVariableDeclarationStatement != null)) {
			if (EcoreUtil.isAncestor(this, newVariableDeclarationStatement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVariableDeclarationStatement != null)
				msgs = ((InternalEObject)newVariableDeclarationStatement).eInverseAdd(this, Java5Package.VARIABLE_DECLARATION_STATEMENT__MODIFIERS, VariableDeclarationStatement.class, msgs);
			msgs = basicSetVariableDeclarationStatement(newVariableDeclarationStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.MODIFIER__VARIABLE_DECLARATION_STATEMENT, newVariableDeclarationStatement, newVariableDeclarationStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationExpression getVariableDeclarationExpression() {
		if (eContainerFeatureID() != Java5Package.MODIFIER__VARIABLE_DECLARATION_EXPRESSION) return null;
		return (VariableDeclarationExpression)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableDeclarationExpression(VariableDeclarationExpression newVariableDeclarationExpression, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVariableDeclarationExpression, Java5Package.MODIFIER__VARIABLE_DECLARATION_EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableDeclarationExpression(VariableDeclarationExpression newVariableDeclarationExpression) {
		if (newVariableDeclarationExpression != eInternalContainer() || (eContainerFeatureID() != Java5Package.MODIFIER__VARIABLE_DECLARATION_EXPRESSION && newVariableDeclarationExpression != null)) {
			if (EcoreUtil.isAncestor(this, newVariableDeclarationExpression))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVariableDeclarationExpression != null)
				msgs = ((InternalEObject)newVariableDeclarationExpression).eInverseAdd(this, Java5Package.VARIABLE_DECLARATION_EXPRESSION__MODIFIERS, VariableDeclarationExpression.class, msgs);
			msgs = basicSetVariableDeclarationExpression(newVariableDeclarationExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.MODIFIER__VARIABLE_DECLARATION_EXPRESSION, newVariableDeclarationExpression, newVariableDeclarationExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java5Package.MODIFIER__BODY_DECLARATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBodyDeclaration((BodyDeclaration)otherEnd, msgs);
			case Java5Package.MODIFIER__SINGLE_VARIABLE_DECLARATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSingleVariableDeclaration((SingleVariableDeclaration)otherEnd, msgs);
			case Java5Package.MODIFIER__VARIABLE_DECLARATION_STATEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVariableDeclarationStatement((VariableDeclarationStatement)otherEnd, msgs);
			case Java5Package.MODIFIER__VARIABLE_DECLARATION_EXPRESSION:
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
			case Java5Package.MODIFIER__BODY_DECLARATION:
				return basicSetBodyDeclaration(null, msgs);
			case Java5Package.MODIFIER__SINGLE_VARIABLE_DECLARATION:
				return basicSetSingleVariableDeclaration(null, msgs);
			case Java5Package.MODIFIER__VARIABLE_DECLARATION_STATEMENT:
				return basicSetVariableDeclarationStatement(null, msgs);
			case Java5Package.MODIFIER__VARIABLE_DECLARATION_EXPRESSION:
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
			case Java5Package.MODIFIER__BODY_DECLARATION:
				return eInternalContainer().eInverseRemove(this, Java5Package.BODY_DECLARATION__MODIFIERS, BodyDeclaration.class, msgs);
			case Java5Package.MODIFIER__SINGLE_VARIABLE_DECLARATION:
				return eInternalContainer().eInverseRemove(this, Java5Package.SINGLE_VARIABLE_DECLARATION__MODIFIERS, SingleVariableDeclaration.class, msgs);
			case Java5Package.MODIFIER__VARIABLE_DECLARATION_STATEMENT:
				return eInternalContainer().eInverseRemove(this, Java5Package.VARIABLE_DECLARATION_STATEMENT__MODIFIERS, VariableDeclarationStatement.class, msgs);
			case Java5Package.MODIFIER__VARIABLE_DECLARATION_EXPRESSION:
				return eInternalContainer().eInverseRemove(this, Java5Package.VARIABLE_DECLARATION_EXPRESSION__MODIFIERS, VariableDeclarationExpression.class, msgs);
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
			case Java5Package.MODIFIER__VISIBILITY:
				return getVisibility();
			case Java5Package.MODIFIER__INHERITANCE:
				return getInheritance();
			case Java5Package.MODIFIER__STATIC:
				return isStatic();
			case Java5Package.MODIFIER__TRANSIENT:
				return isTransient();
			case Java5Package.MODIFIER__VOLATILE:
				return isVolatile();
			case Java5Package.MODIFIER__NATIVE:
				return isNative();
			case Java5Package.MODIFIER__STRICTFP:
				return isStrictfp();
			case Java5Package.MODIFIER__SYNCHRONIZED:
				return isSynchronized();
			case Java5Package.MODIFIER__BODY_DECLARATION:
				return getBodyDeclaration();
			case Java5Package.MODIFIER__SINGLE_VARIABLE_DECLARATION:
				return getSingleVariableDeclaration();
			case Java5Package.MODIFIER__VARIABLE_DECLARATION_STATEMENT:
				return getVariableDeclarationStatement();
			case Java5Package.MODIFIER__VARIABLE_DECLARATION_EXPRESSION:
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
			case Java5Package.MODIFIER__VISIBILITY:
				setVisibility((String)newValue);
				return;
			case Java5Package.MODIFIER__INHERITANCE:
				setInheritance((String)newValue);
				return;
			case Java5Package.MODIFIER__STATIC:
				setStatic((Boolean)newValue);
				return;
			case Java5Package.MODIFIER__TRANSIENT:
				setTransient((Boolean)newValue);
				return;
			case Java5Package.MODIFIER__VOLATILE:
				setVolatile((Boolean)newValue);
				return;
			case Java5Package.MODIFIER__NATIVE:
				setNative((Boolean)newValue);
				return;
			case Java5Package.MODIFIER__STRICTFP:
				setStrictfp((Boolean)newValue);
				return;
			case Java5Package.MODIFIER__SYNCHRONIZED:
				setSynchronized((Boolean)newValue);
				return;
			case Java5Package.MODIFIER__BODY_DECLARATION:
				setBodyDeclaration((BodyDeclaration)newValue);
				return;
			case Java5Package.MODIFIER__SINGLE_VARIABLE_DECLARATION:
				setSingleVariableDeclaration((SingleVariableDeclaration)newValue);
				return;
			case Java5Package.MODIFIER__VARIABLE_DECLARATION_STATEMENT:
				setVariableDeclarationStatement((VariableDeclarationStatement)newValue);
				return;
			case Java5Package.MODIFIER__VARIABLE_DECLARATION_EXPRESSION:
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
			case Java5Package.MODIFIER__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case Java5Package.MODIFIER__INHERITANCE:
				setInheritance(INHERITANCE_EDEFAULT);
				return;
			case Java5Package.MODIFIER__STATIC:
				setStatic(STATIC_EDEFAULT);
				return;
			case Java5Package.MODIFIER__TRANSIENT:
				setTransient(TRANSIENT_EDEFAULT);
				return;
			case Java5Package.MODIFIER__VOLATILE:
				setVolatile(VOLATILE_EDEFAULT);
				return;
			case Java5Package.MODIFIER__NATIVE:
				setNative(NATIVE_EDEFAULT);
				return;
			case Java5Package.MODIFIER__STRICTFP:
				setStrictfp(STRICTFP_EDEFAULT);
				return;
			case Java5Package.MODIFIER__SYNCHRONIZED:
				setSynchronized(SYNCHRONIZED_EDEFAULT);
				return;
			case Java5Package.MODIFIER__BODY_DECLARATION:
				setBodyDeclaration((BodyDeclaration)null);
				return;
			case Java5Package.MODIFIER__SINGLE_VARIABLE_DECLARATION:
				setSingleVariableDeclaration((SingleVariableDeclaration)null);
				return;
			case Java5Package.MODIFIER__VARIABLE_DECLARATION_STATEMENT:
				setVariableDeclarationStatement((VariableDeclarationStatement)null);
				return;
			case Java5Package.MODIFIER__VARIABLE_DECLARATION_EXPRESSION:
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
			case Java5Package.MODIFIER__VISIBILITY:
				return VISIBILITY_EDEFAULT == null ? visibility != null : !VISIBILITY_EDEFAULT.equals(visibility);
			case Java5Package.MODIFIER__INHERITANCE:
				return INHERITANCE_EDEFAULT == null ? inheritance != null : !INHERITANCE_EDEFAULT.equals(inheritance);
			case Java5Package.MODIFIER__STATIC:
				return static_ != STATIC_EDEFAULT;
			case Java5Package.MODIFIER__TRANSIENT:
				return transient_ != TRANSIENT_EDEFAULT;
			case Java5Package.MODIFIER__VOLATILE:
				return volatile_ != VOLATILE_EDEFAULT;
			case Java5Package.MODIFIER__NATIVE:
				return native_ != NATIVE_EDEFAULT;
			case Java5Package.MODIFIER__STRICTFP:
				return strictfp_ != STRICTFP_EDEFAULT;
			case Java5Package.MODIFIER__SYNCHRONIZED:
				return synchronized_ != SYNCHRONIZED_EDEFAULT;
			case Java5Package.MODIFIER__BODY_DECLARATION:
				return getBodyDeclaration() != null;
			case Java5Package.MODIFIER__SINGLE_VARIABLE_DECLARATION:
				return getSingleVariableDeclaration() != null;
			case Java5Package.MODIFIER__VARIABLE_DECLARATION_STATEMENT:
				return getVariableDeclarationStatement() != null;
			case Java5Package.MODIFIER__VARIABLE_DECLARATION_EXPRESSION:
				return getVariableDeclarationExpression() != null;
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
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(", inheritance: ");
		result.append(inheritance);
		result.append(", static: ");
		result.append(static_);
		result.append(", transient: ");
		result.append(transient_);
		result.append(", volatile: ");
		result.append(volatile_);
		result.append(", native: ");
		result.append(native_);
		result.append(", strictfp: ");
		result.append(strictfp_);
		result.append(", synchronized: ");
		result.append(synchronized_);
		result.append(')');
		return result.toString();
	}

} //ModifierImpl
