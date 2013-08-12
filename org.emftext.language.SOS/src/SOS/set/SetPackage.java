/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.set;

import SOS.adtmm.AdtmmPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see SOS.set.SetFactory
 * @model kind="package"
 * @generated
 */
public interface SetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "set";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "SOS.set";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "set";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SetPackage eINSTANCE = SOS.set.impl.SetPackageImpl.init();

	/**
	 * The meta object id for the '{@link SOS.set.impl.ModelSortImpl <em>Model Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.set.impl.ModelSortImpl
	 * @see SOS.set.impl.SetPackageImpl#getModelSort()
	 * @generated
	 */
	int MODEL_SORT = 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SORT__CLASS_NAME = AdtmmPackage.SORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SORT__PACKAGE_NAME = AdtmmPackage.SORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SORT_FEATURE_COUNT = AdtmmPackage.SORT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SOS.set.impl.SetTermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.set.impl.SetTermImpl
	 * @see SOS.set.impl.SetPackageImpl#getSetTerm()
	 * @generated
	 */
	int SET_TERM = 2;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TERM_FEATURE_COUNT = AdtmmPackage.TERM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SOS.set.impl.SetMembershipImpl <em>Membership</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.set.impl.SetMembershipImpl
	 * @see SOS.set.impl.SetPackageImpl#getSetMembership()
	 * @generated
	 */
	int SET_MEMBERSHIP = 1;

	/**
	 * The feature id for the '<em><b>Left Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_MEMBERSHIP__LEFT_HAND_SIDE = SET_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_MEMBERSHIP__RIGHT_HAND_SIDE = SET_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_MEMBERSHIP_FEATURE_COUNT = SET_TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SOS.set.impl.ModelSetImpl <em>Model Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.set.impl.ModelSetImpl
	 * @see SOS.set.impl.SetPackageImpl#getModelSet()
	 * @generated
	 */
	int MODEL_SET = 3;

	/**
	 * The number of structural features of the '<em>Model Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SET_FEATURE_COUNT = SET_TERM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SOS.set.impl.SetOperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.set.impl.SetOperatorImpl
	 * @see SOS.set.impl.SetPackageImpl#getSetOperator()
	 * @generated
	 */
	int SET_OPERATOR = 4;

	/**
	 * The feature id for the '<em><b>Left Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATOR__LEFT_HAND_SIDE = SET_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATOR__RIGHT_HAND_SIDE = SET_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATOR_FEATURE_COUNT = SET_TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SOS.set.impl.SetConstructorImpl <em>Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.set.impl.SetConstructorImpl
	 * @see SOS.set.impl.SetPackageImpl#getSetConstructor()
	 * @generated
	 */
	int SET_CONSTRUCTOR = 5;

	/**
	 * The feature id for the '<em><b>Such That</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONSTRUCTOR__SUCH_THAT = SET_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONSTRUCTOR__MEMBER = SET_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONSTRUCTOR_FEATURE_COUNT = SET_TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SOS.set.impl.UnionImpl <em>Union</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.set.impl.UnionImpl
	 * @see SOS.set.impl.SetPackageImpl#getUnion()
	 * @generated
	 */
	int UNION = 6;

	/**
	 * The feature id for the '<em><b>Left Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__LEFT_HAND_SIDE = SET_OPERATOR__LEFT_HAND_SIDE;

	/**
	 * The feature id for the '<em><b>Right Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__RIGHT_HAND_SIDE = SET_OPERATOR__RIGHT_HAND_SIDE;

	/**
	 * The number of structural features of the '<em>Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FEATURE_COUNT = SET_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SOS.set.impl.ExcludingImpl <em>Excluding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.set.impl.ExcludingImpl
	 * @see SOS.set.impl.SetPackageImpl#getExcluding()
	 * @generated
	 */
	int EXCLUDING = 7;

	/**
	 * The feature id for the '<em><b>Left Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDING__LEFT_HAND_SIDE = SET_OPERATOR__LEFT_HAND_SIDE;

	/**
	 * The feature id for the '<em><b>Right Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDING__RIGHT_HAND_SIDE = SET_OPERATOR__RIGHT_HAND_SIDE;

	/**
	 * The number of structural features of the '<em>Excluding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDING_FEATURE_COUNT = SET_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SOS.set.impl.IntersectionImpl <em>Intersection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.set.impl.IntersectionImpl
	 * @see SOS.set.impl.SetPackageImpl#getIntersection()
	 * @generated
	 */
	int INTERSECTION = 8;

	/**
	 * The feature id for the '<em><b>Left Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__LEFT_HAND_SIDE = SET_OPERATOR__LEFT_HAND_SIDE;

	/**
	 * The feature id for the '<em><b>Right Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__RIGHT_HAND_SIDE = SET_OPERATOR__RIGHT_HAND_SIDE;

	/**
	 * The number of structural features of the '<em>Intersection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_FEATURE_COUNT = SET_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SOS.set.impl.ModelRelationImpl <em>Model Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.set.impl.ModelRelationImpl
	 * @see SOS.set.impl.SetPackageImpl#getModelRelation()
	 * @generated
	 */
	int MODEL_RELATION = 9;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_RELATION__REFERENCE_NAME = AdtmmPackage.TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_RELATION__SOURCE = AdtmmPackage.TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_RELATION__TARGET = AdtmmPackage.TERM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_RELATION_FEATURE_COUNT = AdtmmPackage.TERM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link SOS.set.impl.ModelClassAttributeImpl <em>Model Class Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.set.impl.ModelClassAttributeImpl
	 * @see SOS.set.impl.SetPackageImpl#getModelClassAttribute()
	 * @generated
	 */
	int MODEL_CLASS_ATTRIBUTE = 10;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CLASS_ATTRIBUTE__SELECTOR = AdtmmPackage.TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CLASS_ATTRIBUTE__ATTRIBUTE_NAME = AdtmmPackage.TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Class Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CLASS_ATTRIBUTE_FEATURE_COUNT = AdtmmPackage.TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SOS.set.impl.SetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.set.impl.SetImpl
	 * @see SOS.set.impl.SetPackageImpl#getSet()
	 * @generated
	 */
	int SET = 11;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__SORT = AdtmmPackage.SORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_COUNT = AdtmmPackage.SORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SOS.set.impl.ExistsInImpl <em>Exists In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.set.impl.ExistsInImpl
	 * @see SOS.set.impl.SetPackageImpl#getExistsIn()
	 * @generated
	 */
	int EXISTS_IN = 12;

	/**
	 * The feature id for the '<em><b>Left Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_IN__LEFT_HAND_SIDE = SET_MEMBERSHIP__LEFT_HAND_SIDE;

	/**
	 * The feature id for the '<em><b>Right Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_IN__RIGHT_HAND_SIDE = SET_MEMBERSHIP__RIGHT_HAND_SIDE;

	/**
	 * The number of structural features of the '<em>Exists In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_IN_FEATURE_COUNT = SET_MEMBERSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SOS.set.impl.ForAllInImpl <em>For All In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.set.impl.ForAllInImpl
	 * @see SOS.set.impl.SetPackageImpl#getForAllIn()
	 * @generated
	 */
	int FOR_ALL_IN = 13;

	/**
	 * The feature id for the '<em><b>Left Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_IN__LEFT_HAND_SIDE = SET_MEMBERSHIP__LEFT_HAND_SIDE;

	/**
	 * The feature id for the '<em><b>Right Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_IN__RIGHT_HAND_SIDE = SET_MEMBERSHIP__RIGHT_HAND_SIDE;

	/**
	 * The number of structural features of the '<em>For All In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_IN_FEATURE_COUNT = SET_MEMBERSHIP_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link SOS.set.ModelSort <em>Model Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Sort</em>'.
	 * @see SOS.set.ModelSort
	 * @generated
	 */
	EClass getModelSort();

	/**
	 * Returns the meta object for the attribute '{@link SOS.set.ModelSort#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see SOS.set.ModelSort#getClassName()
	 * @see #getModelSort()
	 * @generated
	 */
	EAttribute getModelSort_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link SOS.set.ModelSort#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see SOS.set.ModelSort#getPackageName()
	 * @see #getModelSort()
	 * @generated
	 */
	EAttribute getModelSort_PackageName();

	/**
	 * Returns the meta object for class '{@link SOS.set.SetMembership <em>Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Membership</em>'.
	 * @see SOS.set.SetMembership
	 * @generated
	 */
	EClass getSetMembership();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.set.SetMembership#getLeftHandSide <em>Left Hand Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Hand Side</em>'.
	 * @see SOS.set.SetMembership#getLeftHandSide()
	 * @see #getSetMembership()
	 * @generated
	 */
	EReference getSetMembership_LeftHandSide();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.set.SetMembership#getRightHandSide <em>Right Hand Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Hand Side</em>'.
	 * @see SOS.set.SetMembership#getRightHandSide()
	 * @see #getSetMembership()
	 * @generated
	 */
	EReference getSetMembership_RightHandSide();

	/**
	 * Returns the meta object for class '{@link SOS.set.SetTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see SOS.set.SetTerm
	 * @generated
	 */
	EClass getSetTerm();

	/**
	 * Returns the meta object for class '{@link SOS.set.ModelSet <em>Model Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Set</em>'.
	 * @see SOS.set.ModelSet
	 * @generated
	 */
	EClass getModelSet();

	/**
	 * Returns the meta object for class '{@link SOS.set.SetOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see SOS.set.SetOperator
	 * @generated
	 */
	EClass getSetOperator();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.set.SetOperator#getLeftHandSide <em>Left Hand Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Hand Side</em>'.
	 * @see SOS.set.SetOperator#getLeftHandSide()
	 * @see #getSetOperator()
	 * @generated
	 */
	EReference getSetOperator_LeftHandSide();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.set.SetOperator#getRightHandSide <em>Right Hand Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Hand Side</em>'.
	 * @see SOS.set.SetOperator#getRightHandSide()
	 * @see #getSetOperator()
	 * @generated
	 */
	EReference getSetOperator_RightHandSide();

	/**
	 * Returns the meta object for class '{@link SOS.set.SetConstructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor</em>'.
	 * @see SOS.set.SetConstructor
	 * @generated
	 */
	EClass getSetConstructor();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.set.SetConstructor#getSuchThat <em>Such That</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Such That</em>'.
	 * @see SOS.set.SetConstructor#getSuchThat()
	 * @see #getSetConstructor()
	 * @generated
	 */
	EReference getSetConstructor_SuchThat();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.set.SetConstructor#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Member</em>'.
	 * @see SOS.set.SetConstructor#getMember()
	 * @see #getSetConstructor()
	 * @generated
	 */
	EReference getSetConstructor_Member();

	/**
	 * Returns the meta object for class '{@link SOS.set.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union</em>'.
	 * @see SOS.set.Union
	 * @generated
	 */
	EClass getUnion();

	/**
	 * Returns the meta object for class '{@link SOS.set.Excluding <em>Excluding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Excluding</em>'.
	 * @see SOS.set.Excluding
	 * @generated
	 */
	EClass getExcluding();

	/**
	 * Returns the meta object for class '{@link SOS.set.Intersection <em>Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intersection</em>'.
	 * @see SOS.set.Intersection
	 * @generated
	 */
	EClass getIntersection();

	/**
	 * Returns the meta object for class '{@link SOS.set.ModelRelation <em>Model Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Relation</em>'.
	 * @see SOS.set.ModelRelation
	 * @generated
	 */
	EClass getModelRelation();

	/**
	 * Returns the meta object for the attribute '{@link SOS.set.ModelRelation#getReferenceName <em>Reference Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Name</em>'.
	 * @see SOS.set.ModelRelation#getReferenceName()
	 * @see #getModelRelation()
	 * @generated
	 */
	EAttribute getModelRelation_ReferenceName();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.set.ModelRelation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see SOS.set.ModelRelation#getSource()
	 * @see #getModelRelation()
	 * @generated
	 */
	EReference getModelRelation_Source();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.set.ModelRelation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see SOS.set.ModelRelation#getTarget()
	 * @see #getModelRelation()
	 * @generated
	 */
	EReference getModelRelation_Target();

	/**
	 * Returns the meta object for class '{@link SOS.set.ModelClassAttribute <em>Model Class Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Class Attribute</em>'.
	 * @see SOS.set.ModelClassAttribute
	 * @generated
	 */
	EClass getModelClassAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.set.ModelClassAttribute#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see SOS.set.ModelClassAttribute#getSelector()
	 * @see #getModelClassAttribute()
	 * @generated
	 */
	EReference getModelClassAttribute_Selector();

	/**
	 * Returns the meta object for the attribute '{@link SOS.set.ModelClassAttribute#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see SOS.set.ModelClassAttribute#getAttributeName()
	 * @see #getModelClassAttribute()
	 * @generated
	 */
	EAttribute getModelClassAttribute_AttributeName();

	/**
	 * Returns the meta object for class '{@link SOS.set.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see SOS.set.Set
	 * @generated
	 */
	EClass getSet();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.set.Set#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sort</em>'.
	 * @see SOS.set.Set#getSort()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_Sort();

	/**
	 * Returns the meta object for class '{@link SOS.set.ExistsIn <em>Exists In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exists In</em>'.
	 * @see SOS.set.ExistsIn
	 * @generated
	 */
	EClass getExistsIn();

	/**
	 * Returns the meta object for class '{@link SOS.set.ForAllIn <em>For All In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For All In</em>'.
	 * @see SOS.set.ForAllIn
	 * @generated
	 */
	EClass getForAllIn();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SetFactory getSetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link SOS.set.impl.ModelSortImpl <em>Model Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.set.impl.ModelSortImpl
		 * @see SOS.set.impl.SetPackageImpl#getModelSort()
		 * @generated
		 */
		EClass MODEL_SORT = eINSTANCE.getModelSort();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_SORT__CLASS_NAME = eINSTANCE.getModelSort_ClassName();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_SORT__PACKAGE_NAME = eINSTANCE.getModelSort_PackageName();

		/**
		 * The meta object literal for the '{@link SOS.set.impl.SetMembershipImpl <em>Membership</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.set.impl.SetMembershipImpl
		 * @see SOS.set.impl.SetPackageImpl#getSetMembership()
		 * @generated
		 */
		EClass SET_MEMBERSHIP = eINSTANCE.getSetMembership();

		/**
		 * The meta object literal for the '<em><b>Left Hand Side</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_MEMBERSHIP__LEFT_HAND_SIDE = eINSTANCE.getSetMembership_LeftHandSide();

		/**
		 * The meta object literal for the '<em><b>Right Hand Side</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_MEMBERSHIP__RIGHT_HAND_SIDE = eINSTANCE.getSetMembership_RightHandSide();

		/**
		 * The meta object literal for the '{@link SOS.set.impl.SetTermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.set.impl.SetTermImpl
		 * @see SOS.set.impl.SetPackageImpl#getSetTerm()
		 * @generated
		 */
		EClass SET_TERM = eINSTANCE.getSetTerm();

		/**
		 * The meta object literal for the '{@link SOS.set.impl.ModelSetImpl <em>Model Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.set.impl.ModelSetImpl
		 * @see SOS.set.impl.SetPackageImpl#getModelSet()
		 * @generated
		 */
		EClass MODEL_SET = eINSTANCE.getModelSet();

		/**
		 * The meta object literal for the '{@link SOS.set.impl.SetOperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.set.impl.SetOperatorImpl
		 * @see SOS.set.impl.SetPackageImpl#getSetOperator()
		 * @generated
		 */
		EClass SET_OPERATOR = eINSTANCE.getSetOperator();

		/**
		 * The meta object literal for the '<em><b>Left Hand Side</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_OPERATOR__LEFT_HAND_SIDE = eINSTANCE.getSetOperator_LeftHandSide();

		/**
		 * The meta object literal for the '<em><b>Right Hand Side</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_OPERATOR__RIGHT_HAND_SIDE = eINSTANCE.getSetOperator_RightHandSide();

		/**
		 * The meta object literal for the '{@link SOS.set.impl.SetConstructorImpl <em>Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.set.impl.SetConstructorImpl
		 * @see SOS.set.impl.SetPackageImpl#getSetConstructor()
		 * @generated
		 */
		EClass SET_CONSTRUCTOR = eINSTANCE.getSetConstructor();

		/**
		 * The meta object literal for the '<em><b>Such That</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_CONSTRUCTOR__SUCH_THAT = eINSTANCE.getSetConstructor_SuchThat();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_CONSTRUCTOR__MEMBER = eINSTANCE.getSetConstructor_Member();

		/**
		 * The meta object literal for the '{@link SOS.set.impl.UnionImpl <em>Union</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.set.impl.UnionImpl
		 * @see SOS.set.impl.SetPackageImpl#getUnion()
		 * @generated
		 */
		EClass UNION = eINSTANCE.getUnion();

		/**
		 * The meta object literal for the '{@link SOS.set.impl.ExcludingImpl <em>Excluding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.set.impl.ExcludingImpl
		 * @see SOS.set.impl.SetPackageImpl#getExcluding()
		 * @generated
		 */
		EClass EXCLUDING = eINSTANCE.getExcluding();

		/**
		 * The meta object literal for the '{@link SOS.set.impl.IntersectionImpl <em>Intersection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.set.impl.IntersectionImpl
		 * @see SOS.set.impl.SetPackageImpl#getIntersection()
		 * @generated
		 */
		EClass INTERSECTION = eINSTANCE.getIntersection();

		/**
		 * The meta object literal for the '{@link SOS.set.impl.ModelRelationImpl <em>Model Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.set.impl.ModelRelationImpl
		 * @see SOS.set.impl.SetPackageImpl#getModelRelation()
		 * @generated
		 */
		EClass MODEL_RELATION = eINSTANCE.getModelRelation();

		/**
		 * The meta object literal for the '<em><b>Reference Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_RELATION__REFERENCE_NAME = eINSTANCE.getModelRelation_ReferenceName();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_RELATION__SOURCE = eINSTANCE.getModelRelation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_RELATION__TARGET = eINSTANCE.getModelRelation_Target();

		/**
		 * The meta object literal for the '{@link SOS.set.impl.ModelClassAttributeImpl <em>Model Class Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.set.impl.ModelClassAttributeImpl
		 * @see SOS.set.impl.SetPackageImpl#getModelClassAttribute()
		 * @generated
		 */
		EClass MODEL_CLASS_ATTRIBUTE = eINSTANCE.getModelClassAttribute();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_CLASS_ATTRIBUTE__SELECTOR = eINSTANCE.getModelClassAttribute_Selector();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_CLASS_ATTRIBUTE__ATTRIBUTE_NAME = eINSTANCE.getModelClassAttribute_AttributeName();

		/**
		 * The meta object literal for the '{@link SOS.set.impl.SetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.set.impl.SetImpl
		 * @see SOS.set.impl.SetPackageImpl#getSet()
		 * @generated
		 */
		EClass SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '<em><b>Sort</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET__SORT = eINSTANCE.getSet_Sort();

		/**
		 * The meta object literal for the '{@link SOS.set.impl.ExistsInImpl <em>Exists In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.set.impl.ExistsInImpl
		 * @see SOS.set.impl.SetPackageImpl#getExistsIn()
		 * @generated
		 */
		EClass EXISTS_IN = eINSTANCE.getExistsIn();

		/**
		 * The meta object literal for the '{@link SOS.set.impl.ForAllInImpl <em>For All In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.set.impl.ForAllInImpl
		 * @see SOS.set.impl.SetPackageImpl#getForAllIn()
		 * @generated
		 */
		EClass FOR_ALL_IN = eINSTANCE.getForAllIn();

	}

} //SetPackage
