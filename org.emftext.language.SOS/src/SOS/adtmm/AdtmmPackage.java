/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.adtmm;

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
 * @see SOS.adtmm.AdtmmFactory
 * @model kind="package"
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
	String eNS_URI = "SOS.adtmm";

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
	AdtmmPackage eINSTANCE = SOS.adtmm.impl.AdtmmPackageImpl.init();

	/**
	 * The meta object id for the '{@link SOS.adtmm.impl.ADTImpl <em>ADT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.adtmm.impl.ADTImpl
	 * @see SOS.adtmm.impl.AdtmmPackageImpl#getADT()
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
	int ADT__OWNED_SORTS = 0;

	/**
	 * The feature id for the '<em><b>Owned Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADT__OWNED_OPERATIONS = 1;

	/**
	 * The feature id for the '<em><b>Owned Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADT__OWNED_GENERATORS = 2;

	/**
	 * The feature id for the '<em><b>Owned Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADT__OWNED_VARIABLES = 3;

	/**
	 * The feature id for the '<em><b>Owned Axioms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADT__OWNED_AXIOMS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADT__NAME = 5;

	/**
	 * The number of structural features of the '<em>ADT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link SOS.adtmm.impl.SortImpl <em>Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.adtmm.impl.SortImpl
	 * @see SOS.adtmm.impl.AdtmmPackageImpl#getSort()
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
	int SORT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link SOS.adtmm.AbstractOperation <em>Abstract Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.adtmm.AbstractOperation
	 * @see SOS.adtmm.impl.AdtmmPackageImpl#getAbstractOperation()
	 * @generated
	 */
	int ABSTRACT_OPERATION = 14;

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
	 * The meta object id for the '{@link SOS.adtmm.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.adtmm.impl.OperationImpl
	 * @see SOS.adtmm.impl.AdtmmPackageImpl#getOperation()
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
	 * The meta object id for the '{@link SOS.adtmm.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.adtmm.impl.VariableImpl
	 * @see SOS.adtmm.impl.AdtmmPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Variable Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VARIABLE_SORT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link SOS.adtmm.impl.CondEquationImpl <em>Cond Equation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.adtmm.impl.CondEquationImpl
	 * @see SOS.adtmm.impl.AdtmmPackageImpl#getCondEquation()
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
	 * The meta object id for the '{@link SOS.adtmm.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.adtmm.impl.TermImpl
	 * @see SOS.adtmm.impl.AdtmmPackageImpl#getTerm()
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
	 * The meta object id for the '{@link SOS.adtmm.impl.VariableRefImpl <em>Variable Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.adtmm.impl.VariableRefImpl
	 * @see SOS.adtmm.impl.AdtmmPackageImpl#getVariableRef()
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
	 * The meta object id for the '{@link SOS.adtmm.impl.CTermImpl <em>CTerm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.adtmm.impl.CTermImpl
	 * @see SOS.adtmm.impl.AdtmmPackageImpl#getCTerm()
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
	 * The feature id for the '<em><b>Iter Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTERM__ITER_TERM = TERM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>CTerm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTERM_FEATURE_COUNT = TERM_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link SOS.adtmm.impl.AbstractEquationImpl <em>Abstract Equation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.adtmm.impl.AbstractEquationImpl
	 * @see SOS.adtmm.impl.AdtmmPackageImpl#getAbstractEquation()
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
	 * The meta object id for the '{@link SOS.adtmm.impl.EquationImpl <em>Equation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.adtmm.impl.EquationImpl
	 * @see SOS.adtmm.impl.AdtmmPackageImpl#getEquation()
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
	 * The meta object id for the '{@link SOS.adtmm.impl.InequationImpl <em>Inequation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.adtmm.impl.InequationImpl
	 * @see SOS.adtmm.impl.AdtmmPackageImpl#getInequation()
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
	 * The meta object id for the '{@link SOS.adtmm.AbstractSort <em>Abstract Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.adtmm.AbstractSort
	 * @see SOS.adtmm.impl.AdtmmPackageImpl#getAbstractSort()
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
	 * The meta object id for the '{@link SOS.adtmm.impl.AtomicSortImpl <em>Atomic Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.adtmm.impl.AtomicSortImpl
	 * @see SOS.adtmm.impl.AdtmmPackageImpl#getAtomicSort()
	 * @generated
	 */
	int ATOMIC_SORT = 12;

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
	 * The meta object id for the '{@link SOS.adtmm.impl.SortDeclarationImpl <em>Sort Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.adtmm.impl.SortDeclarationImpl
	 * @see SOS.adtmm.impl.AdtmmPackageImpl#getSortDeclaration()
	 * @generated
	 */
	int SORT_DECLARATION = 13;

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
	 * The meta object id for the '{@link SOS.adtmm.AbstractGenericOp <em>Abstract Generic Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.adtmm.AbstractGenericOp
	 * @see SOS.adtmm.impl.AdtmmPackageImpl#getAbstractGenericOp()
	 * @generated
	 */
	int ABSTRACT_GENERIC_OP = 15;

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
	 * Returns the meta object for class '{@link SOS.adtmm.ADT <em>ADT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ADT</em>'.
	 * @see SOS.adtmm.ADT
	 * @generated
	 */
	EClass getADT();

	/**
	 * Returns the meta object for the containment reference list '{@link SOS.adtmm.ADT#getOwnedSorts <em>Owned Sorts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Sorts</em>'.
	 * @see SOS.adtmm.ADT#getOwnedSorts()
	 * @see #getADT()
	 * @generated
	 */
	EReference getADT_OwnedSorts();

	/**
	 * Returns the meta object for the containment reference list '{@link SOS.adtmm.ADT#getOwnedOperations <em>Owned Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Operations</em>'.
	 * @see SOS.adtmm.ADT#getOwnedOperations()
	 * @see #getADT()
	 * @generated
	 */
	EReference getADT_OwnedOperations();

	/**
	 * Returns the meta object for the containment reference list '{@link SOS.adtmm.ADT#getOwnedGenerators <em>Owned Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Generators</em>'.
	 * @see SOS.adtmm.ADT#getOwnedGenerators()
	 * @see #getADT()
	 * @generated
	 */
	EReference getADT_OwnedGenerators();

	/**
	 * Returns the meta object for the containment reference list '{@link SOS.adtmm.ADT#getOwnedVariables <em>Owned Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Variables</em>'.
	 * @see SOS.adtmm.ADT#getOwnedVariables()
	 * @see #getADT()
	 * @generated
	 */
	EReference getADT_OwnedVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link SOS.adtmm.ADT#getOwnedAxioms <em>Owned Axioms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Axioms</em>'.
	 * @see SOS.adtmm.ADT#getOwnedAxioms()
	 * @see #getADT()
	 * @generated
	 */
	EReference getADT_OwnedAxioms();

	/**
	 * Returns the meta object for the attribute '{@link SOS.adtmm.ADT#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SOS.adtmm.ADT#getName()
	 * @see #getADT()
	 * @generated
	 */
	EAttribute getADT_Name();

	/**
	 * Returns the meta object for class '{@link SOS.adtmm.Sort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort</em>'.
	 * @see SOS.adtmm.Sort
	 * @generated
	 */
	EClass getSort();

	/**
	 * Returns the meta object for class '{@link SOS.adtmm.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see SOS.adtmm.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link SOS.adtmm.Operation#getOperationSorts <em>Operation Sorts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Sorts</em>'.
	 * @see SOS.adtmm.Operation#getOperationSorts()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_OperationSorts();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.adtmm.Operation#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see SOS.adtmm.Operation#getResult()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Result();

	/**
	 * Returns the meta object for class '{@link SOS.adtmm.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see SOS.adtmm.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.adtmm.Variable#getVariableSort <em>Variable Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable Sort</em>'.
	 * @see SOS.adtmm.Variable#getVariableSort()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_VariableSort();

	/**
	 * Returns the meta object for the attribute '{@link SOS.adtmm.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SOS.adtmm.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link SOS.adtmm.CondEquation <em>Cond Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cond Equation</em>'.
	 * @see SOS.adtmm.CondEquation
	 * @generated
	 */
	EClass getCondEquation();

	/**
	 * Returns the meta object for the containment reference list '{@link SOS.adtmm.CondEquation#getOwnedConditions <em>Owned Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Conditions</em>'.
	 * @see SOS.adtmm.CondEquation#getOwnedConditions()
	 * @see #getCondEquation()
	 * @generated
	 */
	EReference getCondEquation_OwnedConditions();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.adtmm.CondEquation#getOwnedEquation <em>Owned Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Equation</em>'.
	 * @see SOS.adtmm.CondEquation#getOwnedEquation()
	 * @see #getCondEquation()
	 * @generated
	 */
	EReference getCondEquation_OwnedEquation();

	/**
	 * Returns the meta object for class '{@link SOS.adtmm.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see SOS.adtmm.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for class '{@link SOS.adtmm.VariableRef <em>Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Ref</em>'.
	 * @see SOS.adtmm.VariableRef
	 * @generated
	 */
	EClass getVariableRef();

	/**
	 * Returns the meta object for the reference '{@link SOS.adtmm.VariableRef#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see SOS.adtmm.VariableRef#getVariable()
	 * @see #getVariableRef()
	 * @generated
	 */
	EReference getVariableRef_Variable();

	/**
	 * Returns the meta object for class '{@link SOS.adtmm.CTerm <em>CTerm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CTerm</em>'.
	 * @see SOS.adtmm.CTerm
	 * @generated
	 */
	EClass getCTerm();

	/**
	 * Returns the meta object for the attribute '{@link SOS.adtmm.CTerm#getIter <em>Iter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iter</em>'.
	 * @see SOS.adtmm.CTerm#getIter()
	 * @see #getCTerm()
	 * @generated
	 */
	EAttribute getCTerm_Iter();

	/**
	 * Returns the meta object for the containment reference list '{@link SOS.adtmm.CTerm#getOwnedTerms <em>Owned Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Terms</em>'.
	 * @see SOS.adtmm.CTerm#getOwnedTerms()
	 * @see #getCTerm()
	 * @generated
	 */
	EReference getCTerm_OwnedTerms();

	/**
	 * Returns the meta object for the reference '{@link SOS.adtmm.CTerm#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see SOS.adtmm.CTerm#getOp()
	 * @see #getCTerm()
	 * @generated
	 */
	EReference getCTerm_Op();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.adtmm.CTerm#getIterTerm <em>Iter Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iter Term</em>'.
	 * @see SOS.adtmm.CTerm#getIterTerm()
	 * @see #getCTerm()
	 * @generated
	 */
	EReference getCTerm_IterTerm();

	/**
	 * Returns the meta object for class '{@link SOS.adtmm.AbstractEquation <em>Abstract Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Equation</em>'.
	 * @see SOS.adtmm.AbstractEquation
	 * @generated
	 */
	EClass getAbstractEquation();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.adtmm.AbstractEquation#getOwnedRightTerm <em>Owned Right Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Right Term</em>'.
	 * @see SOS.adtmm.AbstractEquation#getOwnedRightTerm()
	 * @see #getAbstractEquation()
	 * @generated
	 */
	EReference getAbstractEquation_OwnedRightTerm();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.adtmm.AbstractEquation#getOwnedLeftTerm <em>Owned Left Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Left Term</em>'.
	 * @see SOS.adtmm.AbstractEquation#getOwnedLeftTerm()
	 * @see #getAbstractEquation()
	 * @generated
	 */
	EReference getAbstractEquation_OwnedLeftTerm();

	/**
	 * Returns the meta object for class '{@link SOS.adtmm.Equation <em>Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equation</em>'.
	 * @see SOS.adtmm.Equation
	 * @generated
	 */
	EClass getEquation();

	/**
	 * Returns the meta object for class '{@link SOS.adtmm.Inequation <em>Inequation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inequation</em>'.
	 * @see SOS.adtmm.Inequation
	 * @generated
	 */
	EClass getInequation();

	/**
	 * Returns the meta object for class '{@link SOS.adtmm.AbstractSort <em>Abstract Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Sort</em>'.
	 * @see SOS.adtmm.AbstractSort
	 * @generated
	 */
	EClass getAbstractSort();

	/**
	 * Returns the meta object for class '{@link SOS.adtmm.AtomicSort <em>Atomic Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Sort</em>'.
	 * @see SOS.adtmm.AtomicSort
	 * @generated
	 */
	EClass getAtomicSort();

	/**
	 * Returns the meta object for the reference '{@link SOS.adtmm.AtomicSort#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see SOS.adtmm.AtomicSort#getDeclaration()
	 * @see #getAtomicSort()
	 * @generated
	 */
	EReference getAtomicSort_Declaration();

	/**
	 * Returns the meta object for class '{@link SOS.adtmm.SortDeclaration <em>Sort Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort Declaration</em>'.
	 * @see SOS.adtmm.SortDeclaration
	 * @generated
	 */
	EClass getSortDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link SOS.adtmm.SortDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SOS.adtmm.SortDeclaration#getName()
	 * @see #getSortDeclaration()
	 * @generated
	 */
	EAttribute getSortDeclaration_Name();

	/**
	 * Returns the meta object for class '{@link SOS.adtmm.AbstractOperation <em>Abstract Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Operation</em>'.
	 * @see SOS.adtmm.AbstractOperation
	 * @generated
	 */
	EClass getAbstractOperation();

	/**
	 * Returns the meta object for the attribute '{@link SOS.adtmm.AbstractOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SOS.adtmm.AbstractOperation#getName()
	 * @see #getAbstractOperation()
	 * @generated
	 */
	EAttribute getAbstractOperation_Name();

	/**
	 * Returns the meta object for class '{@link SOS.adtmm.AbstractGenericOp <em>Abstract Generic Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Generic Op</em>'.
	 * @see SOS.adtmm.AbstractGenericOp
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
		 * The meta object literal for the '{@link SOS.adtmm.impl.ADTImpl <em>ADT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.adtmm.impl.ADTImpl
		 * @see SOS.adtmm.impl.AdtmmPackageImpl#getADT()
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
		 * The meta object literal for the '{@link SOS.adtmm.impl.SortImpl <em>Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.adtmm.impl.SortImpl
		 * @see SOS.adtmm.impl.AdtmmPackageImpl#getSort()
		 * @generated
		 */
		EClass SORT = eINSTANCE.getSort();

		/**
		 * The meta object literal for the '{@link SOS.adtmm.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.adtmm.impl.OperationImpl
		 * @see SOS.adtmm.impl.AdtmmPackageImpl#getOperation()
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
		 * The meta object literal for the '{@link SOS.adtmm.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.adtmm.impl.VariableImpl
		 * @see SOS.adtmm.impl.AdtmmPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Variable Sort</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__VARIABLE_SORT = eINSTANCE.getVariable_VariableSort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link SOS.adtmm.impl.CondEquationImpl <em>Cond Equation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.adtmm.impl.CondEquationImpl
		 * @see SOS.adtmm.impl.AdtmmPackageImpl#getCondEquation()
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
		 * The meta object literal for the '{@link SOS.adtmm.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.adtmm.impl.TermImpl
		 * @see SOS.adtmm.impl.AdtmmPackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '{@link SOS.adtmm.impl.VariableRefImpl <em>Variable Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.adtmm.impl.VariableRefImpl
		 * @see SOS.adtmm.impl.AdtmmPackageImpl#getVariableRef()
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
		 * The meta object literal for the '{@link SOS.adtmm.impl.CTermImpl <em>CTerm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.adtmm.impl.CTermImpl
		 * @see SOS.adtmm.impl.AdtmmPackageImpl#getCTerm()
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
		 * The meta object literal for the '<em><b>Iter Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTERM__ITER_TERM = eINSTANCE.getCTerm_IterTerm();

		/**
		 * The meta object literal for the '{@link SOS.adtmm.impl.AbstractEquationImpl <em>Abstract Equation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.adtmm.impl.AbstractEquationImpl
		 * @see SOS.adtmm.impl.AdtmmPackageImpl#getAbstractEquation()
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
		 * The meta object literal for the '{@link SOS.adtmm.impl.EquationImpl <em>Equation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.adtmm.impl.EquationImpl
		 * @see SOS.adtmm.impl.AdtmmPackageImpl#getEquation()
		 * @generated
		 */
		EClass EQUATION = eINSTANCE.getEquation();

		/**
		 * The meta object literal for the '{@link SOS.adtmm.impl.InequationImpl <em>Inequation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.adtmm.impl.InequationImpl
		 * @see SOS.adtmm.impl.AdtmmPackageImpl#getInequation()
		 * @generated
		 */
		EClass INEQUATION = eINSTANCE.getInequation();

		/**
		 * The meta object literal for the '{@link SOS.adtmm.AbstractSort <em>Abstract Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.adtmm.AbstractSort
		 * @see SOS.adtmm.impl.AdtmmPackageImpl#getAbstractSort()
		 * @generated
		 */
		EClass ABSTRACT_SORT = eINSTANCE.getAbstractSort();

		/**
		 * The meta object literal for the '{@link SOS.adtmm.impl.AtomicSortImpl <em>Atomic Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.adtmm.impl.AtomicSortImpl
		 * @see SOS.adtmm.impl.AdtmmPackageImpl#getAtomicSort()
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
		 * The meta object literal for the '{@link SOS.adtmm.impl.SortDeclarationImpl <em>Sort Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.adtmm.impl.SortDeclarationImpl
		 * @see SOS.adtmm.impl.AdtmmPackageImpl#getSortDeclaration()
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
		 * The meta object literal for the '{@link SOS.adtmm.AbstractOperation <em>Abstract Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.adtmm.AbstractOperation
		 * @see SOS.adtmm.impl.AdtmmPackageImpl#getAbstractOperation()
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
		 * The meta object literal for the '{@link SOS.adtmm.AbstractGenericOp <em>Abstract Generic Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.adtmm.AbstractGenericOp
		 * @see SOS.adtmm.impl.AdtmmPackageImpl#getAbstractGenericOp()
		 * @generated
		 */
		EClass ABSTRACT_GENERIC_OP = eINSTANCE.getAbstractGenericOp();

	}

} //AdtmmPackage
