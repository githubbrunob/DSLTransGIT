/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5.impl;

import Java5.AnnotationTypeMemberDeclaration;
import Java5.Expression;
import Java5.Java5Package;
import Java5.NamedElementRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Type Member Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Java5.impl.AnnotationTypeMemberDeclarationImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link Java5.impl.AnnotationTypeMemberDeclarationImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationTypeMemberDeclarationImpl extends BodyDeclarationImpl implements AnnotationTypeMemberDeclaration {
	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected Expression default_;

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
	protected AnnotationTypeMemberDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java5Package.Literals.ANNOTATION_TYPE_MEMBER_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefault(Expression newDefault, NotificationChain msgs) {
		Expression oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Java5Package.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT, oldDefault, newDefault);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(Expression newDefault) {
		if (newDefault != default_) {
			NotificationChain msgs = null;
			if (default_ != null)
				msgs = ((InternalEObject)default_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java5Package.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT, null, msgs);
			if (newDefault != null)
				msgs = ((InternalEObject)newDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java5Package.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT, null, msgs);
			msgs = basicSetDefault(newDefault, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT, newDefault, newDefault));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Java5Package.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java5Package.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java5Package.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java5Package.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT:
				return basicSetDefault(null, msgs);
			case Java5Package.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE:
				return basicSetType(null, msgs);
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
			case Java5Package.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT:
				return getDefault();
			case Java5Package.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE:
				return getType();
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
			case Java5Package.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT:
				setDefault((Expression)newValue);
				return;
			case Java5Package.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE:
				setType((NamedElementRef)newValue);
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
			case Java5Package.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT:
				setDefault((Expression)null);
				return;
			case Java5Package.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE:
				setType((NamedElementRef)null);
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
			case Java5Package.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT:
				return default_ != null;
			case Java5Package.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnotationTypeMemberDeclarationImpl
