/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5.impl;

import Java5.AbstractTypeDeclaration;
import Java5.Annotation;
import Java5.AnonymousClassDeclaration;
import Java5.BodyDeclaration;
import Java5.Java5Package;
import Java5.Modifier;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Java5.impl.BodyDeclarationImpl#getAbstractTypeDeclaration <em>Abstract Type Declaration</em>}</li>
 *   <li>{@link Java5.impl.BodyDeclarationImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link Java5.impl.BodyDeclarationImpl#getAnonymousClassDeclarationOwner <em>Anonymous Class Declaration Owner</em>}</li>
 *   <li>{@link Java5.impl.BodyDeclarationImpl#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BodyDeclarationImpl extends NamedElementImpl implements BodyDeclaration {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

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
	protected BodyDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java5Package.Literals.BODY_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTypeDeclaration getAbstractTypeDeclaration() {
		if (eContainerFeatureID() != Java5Package.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION) return null;
		return (AbstractTypeDeclaration)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractTypeDeclaration(AbstractTypeDeclaration newAbstractTypeDeclaration, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAbstractTypeDeclaration, Java5Package.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractTypeDeclaration(AbstractTypeDeclaration newAbstractTypeDeclaration) {
		if (newAbstractTypeDeclaration != eInternalContainer() || (eContainerFeatureID() != Java5Package.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION && newAbstractTypeDeclaration != null)) {
			if (EcoreUtil.isAncestor(this, newAbstractTypeDeclaration))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAbstractTypeDeclaration != null)
				msgs = ((InternalEObject)newAbstractTypeDeclaration).eInverseAdd(this, Java5Package.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS, AbstractTypeDeclaration.class, msgs);
			msgs = basicSetAbstractTypeDeclaration(newAbstractTypeDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION, newAbstractTypeDeclaration, newAbstractTypeDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, Java5Package.BODY_DECLARATION__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousClassDeclaration getAnonymousClassDeclarationOwner() {
		if (eContainerFeatureID() != Java5Package.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER) return null;
		return (AnonymousClassDeclaration)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnonymousClassDeclarationOwner(AnonymousClassDeclaration newAnonymousClassDeclarationOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAnonymousClassDeclarationOwner, Java5Package.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnonymousClassDeclarationOwner(AnonymousClassDeclaration newAnonymousClassDeclarationOwner) {
		if (newAnonymousClassDeclarationOwner != eInternalContainer() || (eContainerFeatureID() != Java5Package.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER && newAnonymousClassDeclarationOwner != null)) {
			if (EcoreUtil.isAncestor(this, newAnonymousClassDeclarationOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAnonymousClassDeclarationOwner != null)
				msgs = ((InternalEObject)newAnonymousClassDeclarationOwner).eInverseAdd(this, Java5Package.ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS, AnonymousClassDeclaration.class, msgs);
			msgs = basicSetAnonymousClassDeclarationOwner(newAnonymousClassDeclarationOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER, newAnonymousClassDeclarationOwner, newAnonymousClassDeclarationOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Modifier> getModifiers() {
		if (modifiers == null) {
			modifiers = new EObjectContainmentWithInverseEList<Modifier>(Modifier.class, this, Java5Package.BODY_DECLARATION__MODIFIERS, Java5Package.MODIFIER__BODY_DECLARATION);
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
			case Java5Package.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAbstractTypeDeclaration((AbstractTypeDeclaration)otherEnd, msgs);
			case Java5Package.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAnonymousClassDeclarationOwner((AnonymousClassDeclaration)otherEnd, msgs);
			case Java5Package.BODY_DECLARATION__MODIFIERS:
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
			case Java5Package.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION:
				return basicSetAbstractTypeDeclaration(null, msgs);
			case Java5Package.BODY_DECLARATION__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case Java5Package.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER:
				return basicSetAnonymousClassDeclarationOwner(null, msgs);
			case Java5Package.BODY_DECLARATION__MODIFIERS:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Java5Package.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION:
				return eInternalContainer().eInverseRemove(this, Java5Package.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS, AbstractTypeDeclaration.class, msgs);
			case Java5Package.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER:
				return eInternalContainer().eInverseRemove(this, Java5Package.ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS, AnonymousClassDeclaration.class, msgs);
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
			case Java5Package.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION:
				return getAbstractTypeDeclaration();
			case Java5Package.BODY_DECLARATION__ANNOTATIONS:
				return getAnnotations();
			case Java5Package.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER:
				return getAnonymousClassDeclarationOwner();
			case Java5Package.BODY_DECLARATION__MODIFIERS:
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
			case Java5Package.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION:
				setAbstractTypeDeclaration((AbstractTypeDeclaration)newValue);
				return;
			case Java5Package.BODY_DECLARATION__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case Java5Package.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER:
				setAnonymousClassDeclarationOwner((AnonymousClassDeclaration)newValue);
				return;
			case Java5Package.BODY_DECLARATION__MODIFIERS:
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
			case Java5Package.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION:
				setAbstractTypeDeclaration((AbstractTypeDeclaration)null);
				return;
			case Java5Package.BODY_DECLARATION__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case Java5Package.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER:
				setAnonymousClassDeclarationOwner((AnonymousClassDeclaration)null);
				return;
			case Java5Package.BODY_DECLARATION__MODIFIERS:
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
			case Java5Package.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION:
				return getAbstractTypeDeclaration() != null;
			case Java5Package.BODY_DECLARATION__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case Java5Package.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER:
				return getAnonymousClassDeclarationOwner() != null;
			case Java5Package.BODY_DECLARATION__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BodyDeclarationImpl
