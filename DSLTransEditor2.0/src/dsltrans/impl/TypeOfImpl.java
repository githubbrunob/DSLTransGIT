/**
 */
package dsltrans.impl;

import dsltrans.Attribute;
import dsltrans.AttributeRef;
import dsltrans.DsltransPackage;
import dsltrans.Ref;
import dsltrans.TypeOf;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsltrans.impl.TypeOfImpl#getAttributeRef <em>Attribute Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeOfImpl extends OperatorImpl implements TypeOf {
	/**
	 * The cached value of the '{@link #getAttributeRef() <em>Attribute Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeRef()
	 * @generated
	 * @ordered
	 */
	protected Attribute attributeRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsltransPackage.Literals.TYPE_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttributeRef() {
		if (attributeRef != null && attributeRef.eIsProxy()) {
			InternalEObject oldAttributeRef = (InternalEObject)attributeRef;
			attributeRef = (Attribute)eResolveProxy(oldAttributeRef);
			if (attributeRef != oldAttributeRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DsltransPackage.TYPE_OF__ATTRIBUTE_REF, oldAttributeRef, attributeRef));
			}
		}
		return attributeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttributeRef() {
		return attributeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeRef(Attribute newAttributeRef) {
		Attribute oldAttributeRef = attributeRef;
		attributeRef = newAttributeRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsltransPackage.TYPE_OF__ATTRIBUTE_REF, oldAttributeRef, attributeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsltransPackage.TYPE_OF__ATTRIBUTE_REF:
				if (resolve) return getAttributeRef();
				return basicGetAttributeRef();
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
			case DsltransPackage.TYPE_OF__ATTRIBUTE_REF:
				setAttributeRef((Attribute)newValue);
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
			case DsltransPackage.TYPE_OF__ATTRIBUTE_REF:
				setAttributeRef((Attribute)null);
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
			case DsltransPackage.TYPE_OF__ATTRIBUTE_REF:
				return attributeRef != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Ref.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AttributeRef.class) {
			switch (derivedFeatureID) {
				case DsltransPackage.TYPE_OF__ATTRIBUTE_REF: return DsltransPackage.ATTRIBUTE_REF__ATTRIBUTE_REF;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Ref.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AttributeRef.class) {
			switch (baseFeatureID) {
				case DsltransPackage.ATTRIBUTE_REF__ATTRIBUTE_REF: return DsltransPackage.TYPE_OF__ATTRIBUTE_REF;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TypeOfImpl
