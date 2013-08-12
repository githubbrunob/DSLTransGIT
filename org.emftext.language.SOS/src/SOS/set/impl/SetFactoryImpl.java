/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.set.impl;

import SOS.set.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SetFactoryImpl extends EFactoryImpl implements SetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SetFactory init() {
		try {
			SetFactory theSetFactory = (SetFactory)EPackage.Registry.INSTANCE.getEFactory("SOS.set"); 
			if (theSetFactory != null) {
				return theSetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SetPackage.MODEL_SORT: return createModelSort();
			case SetPackage.MODEL_SET: return createModelSet();
			case SetPackage.SET_CONSTRUCTOR: return createSetConstructor();
			case SetPackage.UNION: return createUnion();
			case SetPackage.EXCLUDING: return createExcluding();
			case SetPackage.INTERSECTION: return createIntersection();
			case SetPackage.MODEL_RELATION: return createModelRelation();
			case SetPackage.MODEL_CLASS_ATTRIBUTE: return createModelClassAttribute();
			case SetPackage.SET: return createSet();
			case SetPackage.EXISTS_IN: return createExistsIn();
			case SetPackage.FOR_ALL_IN: return createForAllIn();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSort createModelSort() {
		ModelSortImpl modelSort = new ModelSortImpl();
		return modelSort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSet createModelSet() {
		ModelSetImpl modelSet = new ModelSetImpl();
		return modelSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetConstructor createSetConstructor() {
		SetConstructorImpl setConstructor = new SetConstructorImpl();
		return setConstructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Union createUnion() {
		UnionImpl union = new UnionImpl();
		return union;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Excluding createExcluding() {
		ExcludingImpl excluding = new ExcludingImpl();
		return excluding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intersection createIntersection() {
		IntersectionImpl intersection = new IntersectionImpl();
		return intersection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelRelation createModelRelation() {
		ModelRelationImpl modelRelation = new ModelRelationImpl();
		return modelRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelClassAttribute createModelClassAttribute() {
		ModelClassAttributeImpl modelClassAttribute = new ModelClassAttributeImpl();
		return modelClassAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set createSet() {
		SetImpl set = new SetImpl();
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistsIn createExistsIn() {
		ExistsInImpl existsIn = new ExistsInImpl();
		return existsIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForAllIn createForAllIn() {
		ForAllInImpl forAllIn = new ForAllInImpl();
		return forAllIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetPackage getSetPackage() {
		return (SetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SetPackage getPackage() {
		return SetPackage.eINSTANCE;
	}

} //SetFactoryImpl
