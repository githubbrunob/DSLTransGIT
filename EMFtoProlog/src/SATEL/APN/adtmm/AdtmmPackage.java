/**
 * <copyright>
 * </copyright>
 *
 * $Id: AdtmmPackage.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.APN.adtmm;

import SATEL.APN.environmentmm.EnvironmentmmPackage;

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
 * @see SATEL.APN.adtmm.AdtmmFactory
 * @model kind="package"
 *        annotation="StaticChecks 1='Check that a composite term has as many subterms as its Operation has sorts.' 2='Check that the iter theory is only applied if there is only one subterm.' 3='Check that thare are not any free variables in the CondEquation conditions.' 4='Check that there are only renames if there is an instantiation, and which are the correct renames.'"
 *        annotation="Notes_about_visitors ='AbstractSort, AbstractGenericSort, AbstractOperation, AbstracGenericOperation and Instantiable do not implement any visitor\n'"
 * @generated
 */
public interface AdtmmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "adtmm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "SATEL.APN.adtmm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "adtmm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdtmmPackage eINSTANCE = SATEL.APN.adtmm.impl.AdtmmPackageImpl.init();

	/**
	 * The meta object id for the '{@link SATEL.APN.adtmm.impl.ADTImpl <em>ADT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.adtmm.impl.ADTImpl
	 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getADT()
	 * @generated
	 */
	int ADT = 0;

	/**
	 * The feature id for the '<em><b>Owned Sorts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADT__OWNED_SORTS = EnvironmentmmPackage.ENVIRONMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADT__OWNED_OPERATIONS = EnvironmentmmPackage.ENVIRONMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADT__OWNED_GENERATORS = EnvironmentmmPackage.ENVIRONMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADT__OWNED_VARIABLES = EnvironmentmmPackage.ENVIRONMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Axioms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADT__OWNED_AXIOMS = EnvironmentmmPackage.ENVIRONMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADT__NAME = EnvironmentmmPackage.ENVIRONMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>ADT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADT_FEATURE_COUNT = EnvironmentmmPackage.ENVIRONMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link SATEL.APN.adtmm.AbstractSort <em>Abstract Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.adtmm.AbstractSort
	 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getAbstractSort()
	 * @generated
	 */
	int ABSTRACT_SORT = 11;

	/**
	 * The number of structural features of the '<em>Abstract Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SORT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link SATEL.APN.adtmm.impl.SortImpl <em>Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.adtmm.impl.SortImpl
	 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getSort()
	 * @generated
	 */
	int SORT = 1;

	/**
	 * The number of structural features of the '<em>Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_FEATURE_COUNT = ABSTRACT_SORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SATEL.APN.adtmm.AbstractOperation <em>Abstract Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.adtmm.AbstractOperation
	 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getAbstractOperation()
	 * @generated
	 */
	int ABSTRACT_OPERATION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPERATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Abstract Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPERATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link SATEL.APN.adtmm.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.adtmm.impl.OperationImpl
	 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = ABSTRACT_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Operation Sorts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERATION_SORTS = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RESULT = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SATEL.APN.adtmm.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.adtmm.impl.VariableImpl
	 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Variable Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VARIABLE_SORT = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link SATEL.APN.adtmm.impl.CondEquationImpl <em>Cond Equation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.adtmm.impl.CondEquationImpl
	 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getCondEquation()
	 * @generated
	 */
	int COND_EQUATION = 4;

	/**
	 * The feature id for the '<em><b>Owned Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND_EQUATION__OWNED_CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Owned Equation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND_EQUATION__OWNED_EQUATION = 1;

	/**
	 * The number of structural features of the '<em>Cond Equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COND_EQUATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link SATEL.APN.adtmm.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.adtmm.impl.TermImpl
	 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 5;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link SATEL.APN.adtmm.impl.VariableRefImpl <em>Variable Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.adtmm.impl.VariableRefImpl
	 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getVariableRef()
	 * @generated
	 */
	int VARIABLE_REF = 6;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF__VARIABLE = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SATEL.APN.adtmm.impl.CTermImpl <em>CTerm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.adtmm.impl.CTermImpl
	 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getCTerm()
	 * @generated
	 */
	int CTERM = 7;

	/**
	 * The feature id for the '<em><b>Iter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTERM__ITER = TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTERM__OWNED_TERMS = TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTERM__OP = TERM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CTerm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTERM_FEATURE_COUNT = TERM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link SATEL.APN.adtmm.impl.AbstractEquationImpl <em>Abstract Equation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.adtmm.impl.AbstractEquationImpl
	 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getAbstractEquation()
	 * @generated
	 */
	int ABSTRACT_EQUATION = 8;

	/**
	 * The feature id for the '<em><b>Owned Right Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EQUATION__OWNED_RIGHT_TERM = 0;

	/**
	 * The feature id for the '<em><b>Owned Left Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EQUATION__OWNED_LEFT_TERM = 1;

	/**
	 * The number of structural features of the '<em>Abstract Equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EQUATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link SATEL.APN.adtmm.impl.EquationImpl <em>Equation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.adtmm.impl.EquationImpl
	 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getEquation()
	 * @generated
	 */
	int EQUATION = 9;

	/**
	 * The feature id for the '<em><b>Owned Right Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__OWNED_RIGHT_TERM = ABSTRACT_EQUATION__OWNED_RIGHT_TERM;

	/**
	 * The feature id for the '<em><b>Owned Left Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__OWNED_LEFT_TERM = ABSTRACT_EQUATION__OWNED_LEFT_TERM;

	/**
	 * The number of structural features of the '<em>Equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_FEATURE_COUNT = ABSTRACT_EQUATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SATEL.APN.adtmm.impl.InequationImpl <em>Inequation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.adtmm.impl.InequationImpl
	 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getInequation()
	 * @generated
	 */
	int INEQUATION = 10;

	/**
	 * The feature id for the '<em><b>Owned Right Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUATION__OWNED_RIGHT_TERM = ABSTRACT_EQUATION__OWNED_RIGHT_TERM;

	/**
	 * The feature id for the '<em><b>Owned Left Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUATION__OWNED_LEFT_TERM = ABSTRACT_EQUATION__OWNED_LEFT_TERM;

	/**
	 * The number of structural features of the '<em>Inequation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUATION_FEATURE_COUNT = ABSTRACT_EQUATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SATEL.APN.adtmm.impl.InstantiationImpl <em>Instantiation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.adtmm.impl.InstantiationImpl
	 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getInstantiation()
	 * @generated
	 */
	int INSTANTIATION = 12;

	/**
	 * The feature id for the '<em><b>Owned Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION__OWNED_PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Imported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION__IMPORTED = 1;

	/**
	 * The number of structural features of the '<em>Instantiation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link SATEL.APN.adtmm.Instantiable <em>Instantiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.adtmm.Instantiable
	 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getInstantiable()
	 * @generated
	 */
	int INSTANTIABLE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Instantiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link SATEL.APN.adtmm.impl.AtomicSortImpl <em>Atomic Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.adtmm.impl.AtomicSortImpl
	 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getAtomicSort()
	 * @generated
	 */
	int ATOMIC_SORT = 14;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SORT__DECLARATION = SORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SORT_FEATURE_COUNT = SORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SATEL.APN.adtmm.impl.SortDeclarationImpl <em>Sort Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.adtmm.impl.SortDeclarationImpl
	 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getSortDeclaration()
	 * @generated
	 */
	int SORT_DECLARATION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_DECLARATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Sort Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_DECLARATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link SATEL.APN.adtmm.AbstractGenericOp <em>Abstract Generic Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.adtmm.AbstractGenericOp
	 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getAbstractGenericOp()
	 * @generated
	 */
	int ABSTRACT_GENERIC_OP = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GENERIC_OP__NAME = ABSTRACT_OPERATION__NAME;

	/**
	 * The number of structural features of the '<em>Abstract Generic Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GENERIC_OP_FEATURE_COUNT = ABSTRACT_OPERATION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link SATEL.APN.adtmm.ADT <em>ADT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ADT</em>'.
	 * @see SATEL.APN.adtmm.ADT
	 * @generated
	 */
	EClass getADT();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.APN.adtmm.ADT#getOwnedSorts <em>Owned Sorts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Sorts</em>'.
	 * @see SATEL.APN.adtmm.ADT#getOwnedSorts()
	 * @see #getADT()
	 * @generated
	 */
	EReference getADT_OwnedSorts();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.APN.adtmm.ADT#getOwnedOperations <em>Owned Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Operations</em>'.
	 * @see SATEL.APN.adtmm.ADT#getOwnedOperations()
	 * @see #getADT()
	 * @generated
	 */
	EReference getADT_OwnedOperations();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.APN.adtmm.ADT#getOwnedGenerators <em>Owned Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Generators</em>'.
	 * @see SATEL.APN.adtmm.ADT#getOwnedGenerators()
	 * @see #getADT()
	 * @generated
	 */
	EReference getADT_OwnedGenerators();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.APN.adtmm.ADT#getOwnedVariables <em>Owned Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Variables</em>'.
	 * @see SATEL.APN.adtmm.ADT#getOwnedVariables()
	 * @see #getADT()
	 * @generated
	 */
	EReference getADT_OwnedVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.APN.adtmm.ADT#getOwnedAxioms <em>Owned Axioms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Axioms</em>'.
	 * @see SATEL.APN.adtmm.ADT#getOwnedAxioms()
	 * @see #getADT()
	 * @generated
	 */
	EReference getADT_OwnedAxioms();

	/**
	 * Returns the meta object for the attribute '{@link SATEL.APN.adtmm.ADT#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SATEL.APN.adtmm.ADT#getName()
	 * @see #getADT()
	 * @generated
	 */
	EAttribute getADT_Name();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.adtmm.Sort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort</em>'.
	 * @see SATEL.APN.adtmm.Sort
	 * @generated
	 */
	EClass getSort();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.adtmm.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see SATEL.APN.adtmm.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.APN.adtmm.Operation#getOperationSorts <em>Operation Sorts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Sorts</em>'.
	 * @see SATEL.APN.adtmm.Operation#getOperationSorts()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_OperationSorts();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.APN.adtmm.Operation#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see SATEL.APN.adtmm.Operation#getResult()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Result();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.adtmm.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see SATEL.APN.adtmm.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link SATEL.APN.adtmm.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SATEL.APN.adtmm.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.APN.adtmm.Variable#getVariableSort <em>Variable Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable Sort</em>'.
	 * @see SATEL.APN.adtmm.Variable#getVariableSort()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_VariableSort();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.adtmm.CondEquation <em>Cond Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cond Equation</em>'.
	 * @see SATEL.APN.adtmm.CondEquation
	 * @generated
	 */
	EClass getCondEquation();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.APN.adtmm.CondEquation#getOwnedConditions <em>Owned Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Conditions</em>'.
	 * @see SATEL.APN.adtmm.CondEquation#getOwnedConditions()
	 * @see #getCondEquation()
	 * @generated
	 */
	EReference getCondEquation_OwnedConditions();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.APN.adtmm.CondEquation#getOwnedEquation <em>Owned Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Equation</em>'.
	 * @see SATEL.APN.adtmm.CondEquation#getOwnedEquation()
	 * @see #getCondEquation()
	 * @generated
	 */
	EReference getCondEquation_OwnedEquation();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.adtmm.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see SATEL.APN.adtmm.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.adtmm.VariableRef <em>Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Ref</em>'.
	 * @see SATEL.APN.adtmm.VariableRef
	 * @generated
	 */
	EClass getVariableRef();

	/**
	 * Returns the meta object for the reference '{@link SATEL.APN.adtmm.VariableRef#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see SATEL.APN.adtmm.VariableRef#getVariable()
	 * @see #getVariableRef()
	 * @generated
	 */
	EReference getVariableRef_Variable();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.adtmm.CTerm <em>CTerm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CTerm</em>'.
	 * @see SATEL.APN.adtmm.CTerm
	 * @generated
	 */
	EClass getCTerm();

	/**
	 * Returns the meta object for the attribute '{@link SATEL.APN.adtmm.CTerm#getIter <em>Iter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iter</em>'.
	 * @see SATEL.APN.adtmm.CTerm#getIter()
	 * @see #getCTerm()
	 * @generated
	 */
	EAttribute getCTerm_Iter();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.APN.adtmm.CTerm#getOwnedTerms <em>Owned Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Terms</em>'.
	 * @see SATEL.APN.adtmm.CTerm#getOwnedTerms()
	 * @see #getCTerm()
	 * @generated
	 */
	EReference getCTerm_OwnedTerms();

	/**
	 * Returns the meta object for the reference '{@link SATEL.APN.adtmm.CTerm#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see SATEL.APN.adtmm.CTerm#getOp()
	 * @see #getCTerm()
	 * @generated
	 */
	EReference getCTerm_Op();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.adtmm.AbstractEquation <em>Abstract Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Equation</em>'.
	 * @see SATEL.APN.adtmm.AbstractEquation
	 * @generated
	 */
	EClass getAbstractEquation();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.APN.adtmm.AbstractEquation#getOwnedRightTerm <em>Owned Right Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Right Term</em>'.
	 * @see SATEL.APN.adtmm.AbstractEquation#getOwnedRightTerm()
	 * @see #getAbstractEquation()
	 * @generated
	 */
	EReference getAbstractEquation_OwnedRightTerm();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.APN.adtmm.AbstractEquation#getOwnedLeftTerm <em>Owned Left Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Left Term</em>'.
	 * @see SATEL.APN.adtmm.AbstractEquation#getOwnedLeftTerm()
	 * @see #getAbstractEquation()
	 * @generated
	 */
	EReference getAbstractEquation_OwnedLeftTerm();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.adtmm.Equation <em>Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equation</em>'.
	 * @see SATEL.APN.adtmm.Equation
	 * @generated
	 */
	EClass getEquation();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.adtmm.Inequation <em>Inequation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inequation</em>'.
	 * @see SATEL.APN.adtmm.Inequation
	 * @generated
	 */
	EClass getInequation();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.adtmm.AbstractSort <em>Abstract Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Sort</em>'.
	 * @see SATEL.APN.adtmm.AbstractSort
	 * @generated
	 */
	EClass getAbstractSort();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.adtmm.Instantiation <em>Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instantiation</em>'.
	 * @see SATEL.APN.adtmm.Instantiation
	 * @generated
	 */
	EClass getInstantiation();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.APN.adtmm.Instantiation#getOwnedParameters <em>Owned Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Parameters</em>'.
	 * @see SATEL.APN.adtmm.Instantiation#getOwnedParameters()
	 * @see #getInstantiation()
	 * @generated
	 */
	EReference getInstantiation_OwnedParameters();

	/**
	 * Returns the meta object for the reference '{@link SATEL.APN.adtmm.Instantiation#getImported <em>Imported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported</em>'.
	 * @see SATEL.APN.adtmm.Instantiation#getImported()
	 * @see #getInstantiation()
	 * @generated
	 */
	EReference getInstantiation_Imported();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.adtmm.Instantiable <em>Instantiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instantiable</em>'.
	 * @see SATEL.APN.adtmm.Instantiable
	 * @generated
	 */
	EClass getInstantiable();

	/**
	 * Returns the meta object for the attribute '{@link SATEL.APN.adtmm.Instantiable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SATEL.APN.adtmm.Instantiable#getName()
	 * @see #getInstantiable()
	 * @generated
	 */
	EAttribute getInstantiable_Name();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.adtmm.AtomicSort <em>Atomic Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Sort</em>'.
	 * @see SATEL.APN.adtmm.AtomicSort
	 * @generated
	 */
	EClass getAtomicSort();

	/**
	 * Returns the meta object for the reference '{@link SATEL.APN.adtmm.AtomicSort#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see SATEL.APN.adtmm.AtomicSort#getDeclaration()
	 * @see #getAtomicSort()
	 * @generated
	 */
	EReference getAtomicSort_Declaration();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.adtmm.SortDeclaration <em>Sort Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort Declaration</em>'.
	 * @see SATEL.APN.adtmm.SortDeclaration
	 * @generated
	 */
	EClass getSortDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link SATEL.APN.adtmm.SortDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SATEL.APN.adtmm.SortDeclaration#getName()
	 * @see #getSortDeclaration()
	 * @generated
	 */
	EAttribute getSortDeclaration_Name();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.adtmm.AbstractOperation <em>Abstract Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Operation</em>'.
	 * @see SATEL.APN.adtmm.AbstractOperation
	 * @generated
	 */
	EClass getAbstractOperation();

	/**
	 * Returns the meta object for the attribute '{@link SATEL.APN.adtmm.AbstractOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SATEL.APN.adtmm.AbstractOperation#getName()
	 * @see #getAbstractOperation()
	 * @generated
	 */
	EAttribute getAbstractOperation_Name();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.adtmm.AbstractGenericOp <em>Abstract Generic Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Generic Op</em>'.
	 * @see SATEL.APN.adtmm.AbstractGenericOp
	 * @generated
	 */
	EClass getAbstractGenericOp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AdtmmFactory getAdtmmFactory();

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
		 * The meta object literal for the '{@link SATEL.APN.adtmm.impl.ADTImpl <em>ADT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.adtmm.impl.ADTImpl
		 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getADT()
		 * @generated
		 */
		EClass ADT = eINSTANCE.getADT();

		/**
		 * The meta object literal for the '<em><b>Owned Sorts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADT__OWNED_SORTS = eINSTANCE.getADT_OwnedSorts();

		/**
		 * The meta object literal for the '<em><b>Owned Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADT__OWNED_OPERATIONS = eINSTANCE.getADT_OwnedOperations();

		/**
		 * The meta object literal for the '<em><b>Owned Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADT__OWNED_GENERATORS = eINSTANCE.getADT_OwnedGenerators();

		/**
		 * The meta object literal for the '<em><b>Owned Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADT__OWNED_VARIABLES = eINSTANCE.getADT_OwnedVariables();

		/**
		 * The meta object literal for the '<em><b>Owned Axioms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADT__OWNED_AXIOMS = eINSTANCE.getADT_OwnedAxioms();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADT__NAME = eINSTANCE.getADT_Name();

		/**
		 * The meta object literal for the '{@link SATEL.APN.adtmm.impl.SortImpl <em>Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.adtmm.impl.SortImpl
		 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getSort()
		 * @generated
		 */
		EClass SORT = eINSTANCE.getSort();

		/**
		 * The meta object literal for the '{@link SATEL.APN.adtmm.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.adtmm.impl.OperationImpl
		 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Operation Sorts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OPERATION_SORTS = eINSTANCE.getOperation_OperationSorts();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RESULT = eINSTANCE.getOperation_Result();

		/**
		 * The meta object literal for the '{@link SATEL.APN.adtmm.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.adtmm.impl.VariableImpl
		 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Variable Sort</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__VARIABLE_SORT = eINSTANCE.getVariable_VariableSort();

		/**
		 * The meta object literal for the '{@link SATEL.APN.adtmm.impl.CondEquationImpl <em>Cond Equation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.adtmm.impl.CondEquationImpl
		 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getCondEquation()
		 * @generated
		 */
		EClass COND_EQUATION = eINSTANCE.getCondEquation();

		/**
		 * The meta object literal for the '<em><b>Owned Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COND_EQUATION__OWNED_CONDITIONS = eINSTANCE.getCondEquation_OwnedConditions();

		/**
		 * The meta object literal for the '<em><b>Owned Equation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COND_EQUATION__OWNED_EQUATION = eINSTANCE.getCondEquation_OwnedEquation();

		/**
		 * The meta object literal for the '{@link SATEL.APN.adtmm.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.adtmm.impl.TermImpl
		 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '{@link SATEL.APN.adtmm.impl.VariableRefImpl <em>Variable Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.adtmm.impl.VariableRefImpl
		 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getVariableRef()
		 * @generated
		 */
		EClass VARIABLE_REF = eINSTANCE.getVariableRef();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_REF__VARIABLE = eINSTANCE.getVariableRef_Variable();

		/**
		 * The meta object literal for the '{@link SATEL.APN.adtmm.impl.CTermImpl <em>CTerm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.adtmm.impl.CTermImpl
		 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getCTerm()
		 * @generated
		 */
		EClass CTERM = eINSTANCE.getCTerm();

		/**
		 * The meta object literal for the '<em><b>Iter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTERM__ITER = eINSTANCE.getCTerm_Iter();

		/**
		 * The meta object literal for the '<em><b>Owned Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTERM__OWNED_TERMS = eINSTANCE.getCTerm_OwnedTerms();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTERM__OP = eINSTANCE.getCTerm_Op();

		/**
		 * The meta object literal for the '{@link SATEL.APN.adtmm.impl.AbstractEquationImpl <em>Abstract Equation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.adtmm.impl.AbstractEquationImpl
		 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getAbstractEquation()
		 * @generated
		 */
		EClass ABSTRACT_EQUATION = eINSTANCE.getAbstractEquation();

		/**
		 * The meta object literal for the '<em><b>Owned Right Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_EQUATION__OWNED_RIGHT_TERM = eINSTANCE.getAbstractEquation_OwnedRightTerm();

		/**
		 * The meta object literal for the '<em><b>Owned Left Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_EQUATION__OWNED_LEFT_TERM = eINSTANCE.getAbstractEquation_OwnedLeftTerm();

		/**
		 * The meta object literal for the '{@link SATEL.APN.adtmm.impl.EquationImpl <em>Equation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.adtmm.impl.EquationImpl
		 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getEquation()
		 * @generated
		 */
		EClass EQUATION = eINSTANCE.getEquation();

		/**
		 * The meta object literal for the '{@link SATEL.APN.adtmm.impl.InequationImpl <em>Inequation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.adtmm.impl.InequationImpl
		 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getInequation()
		 * @generated
		 */
		EClass INEQUATION = eINSTANCE.getInequation();

		/**
		 * The meta object literal for the '{@link SATEL.APN.adtmm.AbstractSort <em>Abstract Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.adtmm.AbstractSort
		 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getAbstractSort()
		 * @generated
		 */
		EClass ABSTRACT_SORT = eINSTANCE.getAbstractSort();

		/**
		 * The meta object literal for the '{@link SATEL.APN.adtmm.impl.InstantiationImpl <em>Instantiation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.adtmm.impl.InstantiationImpl
		 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getInstantiation()
		 * @generated
		 */
		EClass INSTANTIATION = eINSTANCE.getInstantiation();

		/**
		 * The meta object literal for the '<em><b>Owned Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIATION__OWNED_PARAMETERS = eINSTANCE.getInstantiation_OwnedParameters();

		/**
		 * The meta object literal for the '<em><b>Imported</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIATION__IMPORTED = eINSTANCE.getInstantiation_Imported();

		/**
		 * The meta object literal for the '{@link SATEL.APN.adtmm.Instantiable <em>Instantiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.adtmm.Instantiable
		 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getInstantiable()
		 * @generated
		 */
		EClass INSTANTIABLE = eINSTANCE.getInstantiable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANTIABLE__NAME = eINSTANCE.getInstantiable_Name();

		/**
		 * The meta object literal for the '{@link SATEL.APN.adtmm.impl.AtomicSortImpl <em>Atomic Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.adtmm.impl.AtomicSortImpl
		 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getAtomicSort()
		 * @generated
		 */
		EClass ATOMIC_SORT = eINSTANCE.getAtomicSort();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_SORT__DECLARATION = eINSTANCE.getAtomicSort_Declaration();

		/**
		 * The meta object literal for the '{@link SATEL.APN.adtmm.impl.SortDeclarationImpl <em>Sort Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.adtmm.impl.SortDeclarationImpl
		 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getSortDeclaration()
		 * @generated
		 */
		EClass SORT_DECLARATION = eINSTANCE.getSortDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORT_DECLARATION__NAME = eINSTANCE.getSortDeclaration_Name();

		/**
		 * The meta object literal for the '{@link SATEL.APN.adtmm.AbstractOperation <em>Abstract Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.adtmm.AbstractOperation
		 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getAbstractOperation()
		 * @generated
		 */
		EClass ABSTRACT_OPERATION = eINSTANCE.getAbstractOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_OPERATION__NAME = eINSTANCE.getAbstractOperation_Name();

		/**
		 * The meta object literal for the '{@link SATEL.APN.adtmm.AbstractGenericOp <em>Abstract Generic Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.adtmm.AbstractGenericOp
		 * @see SATEL.APN.adtmm.impl.AdtmmPackageImpl#getAbstractGenericOp()
		 * @generated
		 */
		EClass ABSTRACT_GENERIC_OP = eINSTANCE.getAbstractGenericOp();

	}

} //AdtmmPackage
