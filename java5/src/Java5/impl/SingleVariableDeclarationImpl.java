/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5.impl;

import Java5.CatchClause;
import Java5.EnhancedForStatement;
import Java5.Java5Package;
import Java5.MethodDeclaration;
import Java5.Modifier;
import Java5.NamedElementRef;
import Java5.SingleVariableDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Java5.impl.SingleVariableDeclarationImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link Java5.impl.SingleVariableDeclarationImpl#isVarargs <em>Varargs</em>}</li>
 *   <li>{@link Java5.impl.SingleVariableDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link Java5.impl.SingleVariableDeclarationImpl#getMethodDeclaration <em>Method Declaration</em>}</li>
 *   <li>{@link Java5.impl.SingleVariableDeclarationImpl#getCatchClause <em>Catch Clause</em>}</li>
 *   <li>{@link Java5.impl.SingleVariableDeclarationImpl#getEnhancedForStatement <em>Enhanced For Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingleVariableDeclarationImpl extends VariableDeclarationImpl implements SingleVariableDeclaration {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NamedElementRef type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleVariableDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java5Package.Literals.SINGLE_VARIABLE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Modifier> getModifiers() {
		if (modifiers == null) {
			modifiers = new EObjectContainmentWithInverseEList<Modifier>(Modifier.class, this, Java5Package.SINGLE_VARIABLE_DECLARATION__MODIFIERS, Java5Package.MODIFIER__SINGLE_VARIABLE_DECLARATION);
		}
		return modifiers;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.SINGLE_VARIABLE_DECLARATION__VARARGS, oldVarargs, varargs));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Java5Package.SINGLE_VARIABLE_DECLARATION__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java5Package.SINGLE_VARIABLE_DECLARATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java5Package.SINGLE_VARIABLE_DECLARATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.SINGLE_VARIABLE_DECLARATION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodDeclaration getMethodDeclaration() {
		if (eContainerFeatureID() != Java5Package.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION) return null;
		return (MethodDeclaration)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodDeclaration(MethodDeclaration newMethodDeclaration, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMethodDeclaration, Java5Package.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodDeclaration(MethodDeclaration newMethodDeclaration) {
		if (newMethodDeclaration != eInternalContainer() || (eContainerFeatureID() != Java5Package.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION && newMethodDeclaration != null)) {
			if (EcoreUtil.isAncestor(this, newMethodDeclaration))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMethodDeclaration != null)
				msgs = ((InternalEObject)newMethodDeclaration).eInverseAdd(this, Java5Package.METHOD_DECLARATION__PARAMETERS, MethodDeclaration.class, msgs);
			msgs = basicSetMethodDeclaration(newMethodDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION, newMethodDeclaration, newMethodDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatchClause getCatchClause() {
		if (eContainerFeatureID() != Java5Package.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE) return null;
		return (CatchClause)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatchClause(CatchClause newCatchClause, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCatchClause, Java5Package.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatchClause(CatchClause newCatchClause) {
		if (newCatchClause != eInternalContainer() || (eContainerFeatureID() != Java5Package.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE && newCatchClause != null)) {
			if (EcoreUtil.isAncestor(this, newCatchClause))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCatchClause != null)
				msgs = ((InternalEObject)newCatchClause).eInverseAdd(this, Java5Package.CATCH_CLAUSE__EXCEPTION, CatchClause.class, msgs);
			msgs = basicSetCatchClause(newCatchClause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE, newCatchClause, newCatchClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnhancedForStatement getEnhancedForStatement() {
		if (eContainerFeatureID() != Java5Package.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT) return null;
		return (EnhancedForStatement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnhancedForStatement(EnhancedForStatement newEnhancedForStatement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEnhancedForStatement, Java5Package.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnhancedForStatement(EnhancedForStatement newEnhancedForStatement) {
		if (newEnhancedForStatement != eInternalContainer() || (eContainerFeatureID() != Java5Package.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT && newEnhancedForStatement != null)) {
			if (EcoreUtil.isAncestor(this, newEnhancedForStatement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnhancedForStatement != null)
				msgs = ((InternalEObject)newEnhancedForStatement).eInverseAdd(this, Java5Package.ENHANCED_FOR_STATEMENT__PARAMETER, EnhancedForStatement.class, msgs);
			msgs = basicSetEnhancedForStatement(newEnhancedForStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT, newEnhancedForStatement, newEnhancedForStatement));
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
			case Java5Package.SINGLE_VARIABLE_DECLARATION__MODIFIERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModifiers()).basicAdd(otherEnd, msgs);
			case Java5Package.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMethodDeclaration((MethodDeclaration)otherEnd, msgs);
			case Java5Package.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCatchClause((CatchClause)otherEnd, msgs);
			case Java5Package.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnhancedForStatement((EnhancedForStatement)otherEnd, msgs);
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
			case Java5Package.SINGLE_VARIABLE_DECLARATION__MODIFIERS:
				return ((InternalEList<?>)getModifiers()).basicRemove(otherEnd, msgs);
			case Java5Package.SINGLE_VARIABLE_DECLARATION__TYPE:
				return basicSetType(null, msgs);
			case Java5Package.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION:
				return basicSetMethodDeclaration(null, msgs);
			case Java5Package.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE:
				return basicSetCatchClause(null, msgs);
			case Java5Package.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT:
				return basicSetEnhancedForStatement(null, msgs);
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
			case Java5Package.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION:
				return eInternalContainer().eInverseRemove(this, Java5Package.METHOD_DECLARATION__PARAMETERS, MethodDeclaration.class, msgs);
			case Java5Package.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE:
				return eInternalContainer().eInverseRemove(this, Java5Package.CATCH_CLAUSE__EXCEPTION, CatchClause.class, msgs);
			case Java5Package.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT:
				return eInternalContainer().eInverseRemove(this, Java5Package.ENHANCED_FOR_STATEMENT__PARAMETER, EnhancedForStatement.class, msgs);
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
			case Java5Package.SINGLE_VARIABLE_DECLARATION__MODIFIERS:
				return getModifiers();
			case Java5Package.SINGLE_VARIABLE_DECLARATION__VARARGS:
				return isVarargs();
			case Java5Package.SINGLE_VARIABLE_DECLARATION__TYPE:
				return getType();
			case Java5Package.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION:
				return getMethodDeclaration();
			case Java5Package.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE:
				return getCatchClause();
			case Java5Package.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT:
				return getEnhancedForStatement();
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
			case Java5Package.SINGLE_VARIABLE_DECLARATION__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends Modifier>)newValue);
				return;
			case Java5Package.SINGLE_VARIABLE_DECLARATION__VARARGS:
				setVarargs((Boolean)newValue);
				return;
			case Java5Package.SINGLE_VARIABLE_DECLARATION__TYPE:
				setType((NamedElementRef)newValue);
				return;
			case Java5Package.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION:
				setMethodDeclaration((MethodDeclaration)newValue);
				return;
			case Java5Package.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE:
				setCatchClause((CatchClause)newValue);
				return;
			case Java5Package.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT:
				setEnhancedForStatement((EnhancedForStatement)newValue);
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
			case Java5Package.SINGLE_VARIABLE_DECLARATION__MODIFIERS:
				getModifiers().clear();
				return;
			case Java5Package.SINGLE_VARIABLE_DECLARATION__VARARGS:
				setVarargs(VARARGS_EDEFAULT);
				return;
			case Java5Package.SINGLE_VARIABLE_DECLARATION__TYPE:
				setType((NamedElementRef)null);
				return;
			case Java5Package.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION:
				setMethodDeclaration((MethodDeclaration)null);
				return;
			case Java5Package.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE:
				setCatchClause((CatchClause)null);
				return;
			case Java5Package.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT:
				setEnhancedForStatement((EnhancedForStatement)null);
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
			case Java5Package.SINGLE_VARIABLE_DECLARATION__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
			case Java5Package.SINGLE_VARIABLE_DECLARATION__VARARGS:
				return varargs != VARARGS_EDEFAULT;
			case Java5Package.SINGLE_VARIABLE_DECLARATION__TYPE:
				return type != null;
			case Java5Package.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION:
				return getMethodDeclaration() != null;
			case Java5Package.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE:
				return getCatchClause() != null;
			case Java5Package.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT:
				return getEnhancedForStatement() != null;
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
		result.append(" (varargs: ");
		result.append(varargs);
		result.append(')');
		return result.toString();
	}

} //SingleVariableDeclarationImpl
