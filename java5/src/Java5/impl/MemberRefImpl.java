/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5.impl;

import Java5.Java5Package;
import Java5.MemberRef;
import Java5.NamedElementRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Java5.impl.MemberRefImpl#getMember <em>Member</em>}</li>
 *   <li>{@link Java5.impl.MemberRefImpl#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemberRefImpl extends ASTNodeImpl implements MemberRef {
	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected NamedElementRef member;

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
	protected MemberRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java5Package.Literals.MEMBER_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElementRef getMember() {
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMember(NamedElementRef newMember, NotificationChain msgs) {
		NamedElementRef oldMember = member;
		member = newMember;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Java5Package.MEMBER_REF__MEMBER, oldMember, newMember);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMember(NamedElementRef newMember) {
		if (newMember != member) {
			NotificationChain msgs = null;
			if (member != null)
				msgs = ((InternalEObject)member).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java5Package.MEMBER_REF__MEMBER, null, msgs);
			if (newMember != null)
				msgs = ((InternalEObject)newMember).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java5Package.MEMBER_REF__MEMBER, null, msgs);
			msgs = basicSetMember(newMember, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.MEMBER_REF__MEMBER, newMember, newMember));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Java5Package.MEMBER_REF__QUALIFIER, oldQualifier, newQualifier);
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
				msgs = ((InternalEObject)qualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java5Package.MEMBER_REF__QUALIFIER, null, msgs);
			if (newQualifier != null)
				msgs = ((InternalEObject)newQualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java5Package.MEMBER_REF__QUALIFIER, null, msgs);
			msgs = basicSetQualifier(newQualifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java5Package.MEMBER_REF__QUALIFIER, newQualifier, newQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java5Package.MEMBER_REF__MEMBER:
				return basicSetMember(null, msgs);
			case Java5Package.MEMBER_REF__QUALIFIER:
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
			case Java5Package.MEMBER_REF__MEMBER:
				return getMember();
			case Java5Package.MEMBER_REF__QUALIFIER:
				return getQualifier();
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
			case Java5Package.MEMBER_REF__MEMBER:
				setMember((NamedElementRef)newValue);
				return;
			case Java5Package.MEMBER_REF__QUALIFIER:
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
			case Java5Package.MEMBER_REF__MEMBER:
				setMember((NamedElementRef)null);
				return;
			case Java5Package.MEMBER_REF__QUALIFIER:
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
			case Java5Package.MEMBER_REF__MEMBER:
				return member != null;
			case Java5Package.MEMBER_REF__QUALIFIER:
				return qualifier != null;
		}
		return super.eIsSet(featureID);
	}

} //MemberRefImpl
