/**
 * <copyright>
 * </copyright>
 *
 * $Id: BooleantermsPackage.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions.booleanterms;

import SATEL.SATELPackage;

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
 * @see SATEL.AlgebraicExpressions.booleanterms.BooleantermsFactory
 * @model kind="package"
 * @generated
 */
public interface BooleantermsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "booleanterms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "SATEL.AlgebraicExpressions.booleanterms";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "booleanterms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BooleantermsPackage eINSTANCE = SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl.init();

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.BooleanTermImpl <em>Boolean Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleanTermImpl
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getBooleanTerm()
	 * @generated
	 */
	int BOOLEAN_TERM = 0;

	/**
	 * The number of structural features of the '<em>Boolean Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TERM_FEATURE_COUNT = SATELPackage.CONDITION_ATOM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.NotImpl
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 1;

	/**
	 * The feature id for the '<em><b>Boolean Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__BOOLEAN_TERM = BOOLEAN_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = BOOLEAN_TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.SequenceImpl
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 2;

	/**
	 * The feature id for the '<em><b>Hml Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__HML_TERM = BOOLEAN_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = BOOLEAN_TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.PositiveImpl <em>Positive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.PositiveImpl
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getPositive()
	 * @generated
	 */
	int POSITIVE = 3;

	/**
	 * The feature id for the '<em><b>Hml Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE__HML_TERM = BOOLEAN_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Positive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_FEATURE_COUNT = BOOLEAN_TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.TraceImpl
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 4;

	/**
	 * The feature id for the '<em><b>Hml Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__HML_TERM = BOOLEAN_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = BOOLEAN_TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.BooleanVariableImpl <em>Boolean Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleanVariableImpl
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getBooleanVariable()
	 * @generated
	 */
	int BOOLEAN_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Boolean Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__BOOLEAN_VARIABLE = BOOLEAN_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_FEATURE_COUNT = BOOLEAN_TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleanValueImpl
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__VALUE = BOOLEAN_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = BOOLEAN_TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.BOPAndImpl <em>BOP And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BOPAndImpl
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getBOPAnd()
	 * @generated
	 */
	int BOP_AND = 7;

	/**
	 * The feature id for the '<em><b>Boolean Term L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP_AND__BOOLEAN_TERM_L = BOOLEAN_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Boolean Term R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP_AND__BOOLEAN_TERM_R = BOOLEAN_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BOP And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP_AND_FEATURE_COUNT = BOOLEAN_TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.BOPOrImpl <em>BOP Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BOPOrImpl
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getBOPOr()
	 * @generated
	 */
	int BOP_OR = 8;

	/**
	 * The feature id for the '<em><b>Boolean Term L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP_OR__BOOLEAN_TERM_L = BOOLEAN_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Boolean Term R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP_OR__BOOLEAN_TERM_R = BOOLEAN_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BOP Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP_OR_FEATURE_COUNT = BOOLEAN_TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.EqualsImpl <em>Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.EqualsImpl
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getEquals()
	 * @generated
	 */
	int EQUALS = 9;

	/**
	 * The feature id for the '<em><b>Arithmetic Term R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__ARITHMETIC_TERM_R = BOOLEAN_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arithmetic Term L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__ARITHMETIC_TERM_L = BOOLEAN_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_FEATURE_COUNT = BOOLEAN_TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.NotEqualsImpl <em>Not Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.NotEqualsImpl
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getNotEquals()
	 * @generated
	 */
	int NOT_EQUALS = 10;

	/**
	 * The feature id for the '<em><b>Arithmetic Term R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUALS__ARITHMETIC_TERM_R = BOOLEAN_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arithmetic Term L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUALS__ARITHMETIC_TERM_L = BOOLEAN_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Not Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUALS_FEATURE_COUNT = BOOLEAN_TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.GTImpl <em>GT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.GTImpl
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getGT()
	 * @generated
	 */
	int GT = 11;

	/**
	 * The feature id for the '<em><b>Arithmetic Term R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT__ARITHMETIC_TERM_R = BOOLEAN_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arithmetic Term L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT__ARITHMETIC_TERM_L = BOOLEAN_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_FEATURE_COUNT = BOOLEAN_TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.LTImpl <em>LT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.LTImpl
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getLT()
	 * @generated
	 */
	int LT = 12;

	/**
	 * The feature id for the '<em><b>Arithmetic Term R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT__ARITHMETIC_TERM_R = BOOLEAN_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arithmetic Term L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT__ARITHMETIC_TERM_L = BOOLEAN_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>LT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_FEATURE_COUNT = BOOLEAN_TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.GTEImpl <em>GTE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.GTEImpl
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getGTE()
	 * @generated
	 */
	int GTE = 13;

	/**
	 * The feature id for the '<em><b>Arithmetic Term R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTE__ARITHMETIC_TERM_R = BOOLEAN_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arithmetic Term L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTE__ARITHMETIC_TERM_L = BOOLEAN_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GTE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTE_FEATURE_COUNT = BOOLEAN_TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.LTEImpl <em>LTE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.LTEImpl
	 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getLTE()
	 * @generated
	 */
	int LTE = 14;

	/**
	 * The feature id for the '<em><b>Arithmetic Term R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTE__ARITHMETIC_TERM_R = BOOLEAN_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arithmetic Term L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTE__ARITHMETIC_TERM_L = BOOLEAN_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>LTE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTE_FEATURE_COUNT = BOOLEAN_TERM_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.booleanterms.BooleanTerm <em>Boolean Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Term</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.BooleanTerm
	 * @generated
	 */
	EClass getBooleanTerm();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.booleanterms.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.booleanterms.Not#getBooleanTerm <em>Boolean Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean Term</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.Not#getBooleanTerm()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_BooleanTerm();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.booleanterms.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.booleanterms.Sequence#getHmlTerm <em>Hml Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hml Term</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.Sequence#getHmlTerm()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_HmlTerm();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.booleanterms.Positive <em>Positive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.Positive
	 * @generated
	 */
	EClass getPositive();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.booleanterms.Positive#getHmlTerm <em>Hml Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hml Term</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.Positive#getHmlTerm()
	 * @see #getPositive()
	 * @generated
	 */
	EReference getPositive_HmlTerm();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.booleanterms.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.booleanterms.Trace#getHmlTerm <em>Hml Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hml Term</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.Trace#getHmlTerm()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_HmlTerm();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.booleanterms.BooleanVariable <em>Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.BooleanVariable
	 * @generated
	 */
	EClass getBooleanVariable();

	/**
	 * Returns the meta object for the reference '{@link SATEL.AlgebraicExpressions.booleanterms.BooleanVariable#getBooleanVariable <em>Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Boolean Variable</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.BooleanVariable#getBooleanVariable()
	 * @see #getBooleanVariable()
	 * @generated
	 */
	EReference getBooleanVariable_BooleanVariable();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.booleanterms.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link SATEL.AlgebraicExpressions.booleanterms.BooleanValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.BooleanValue#isValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_Value();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.booleanterms.BOPAnd <em>BOP And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BOP And</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.BOPAnd
	 * @generated
	 */
	EClass getBOPAnd();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.booleanterms.BOPAnd#getBooleanTermL <em>Boolean Term L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean Term L</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.BOPAnd#getBooleanTermL()
	 * @see #getBOPAnd()
	 * @generated
	 */
	EReference getBOPAnd_BooleanTermL();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.booleanterms.BOPAnd#getBooleanTermR <em>Boolean Term R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean Term R</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.BOPAnd#getBooleanTermR()
	 * @see #getBOPAnd()
	 * @generated
	 */
	EReference getBOPAnd_BooleanTermR();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.booleanterms.BOPOr <em>BOP Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BOP Or</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.BOPOr
	 * @generated
	 */
	EClass getBOPOr();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.booleanterms.BOPOr#getBooleanTermL <em>Boolean Term L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean Term L</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.BOPOr#getBooleanTermL()
	 * @see #getBOPOr()
	 * @generated
	 */
	EReference getBOPOr_BooleanTermL();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.booleanterms.BOPOr#getBooleanTermR <em>Boolean Term R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean Term R</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.BOPOr#getBooleanTermR()
	 * @see #getBOPOr()
	 * @generated
	 */
	EReference getBOPOr_BooleanTermR();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.booleanterms.Equals <em>Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equals</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.Equals
	 * @generated
	 */
	EClass getEquals();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.booleanterms.Equals#getArithmeticTermR <em>Arithmetic Term R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arithmetic Term R</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.Equals#getArithmeticTermR()
	 * @see #getEquals()
	 * @generated
	 */
	EReference getEquals_ArithmeticTermR();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.booleanterms.Equals#getArithmeticTermL <em>Arithmetic Term L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arithmetic Term L</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.Equals#getArithmeticTermL()
	 * @see #getEquals()
	 * @generated
	 */
	EReference getEquals_ArithmeticTermL();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.booleanterms.NotEquals <em>Not Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Equals</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.NotEquals
	 * @generated
	 */
	EClass getNotEquals();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.booleanterms.NotEquals#getArithmeticTermR <em>Arithmetic Term R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arithmetic Term R</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.NotEquals#getArithmeticTermR()
	 * @see #getNotEquals()
	 * @generated
	 */
	EReference getNotEquals_ArithmeticTermR();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.booleanterms.NotEquals#getArithmeticTermL <em>Arithmetic Term L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arithmetic Term L</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.NotEquals#getArithmeticTermL()
	 * @see #getNotEquals()
	 * @generated
	 */
	EReference getNotEquals_ArithmeticTermL();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.booleanterms.GT <em>GT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GT</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.GT
	 * @generated
	 */
	EClass getGT();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.booleanterms.GT#getArithmeticTermR <em>Arithmetic Term R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arithmetic Term R</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.GT#getArithmeticTermR()
	 * @see #getGT()
	 * @generated
	 */
	EReference getGT_ArithmeticTermR();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.booleanterms.GT#getArithmeticTermL <em>Arithmetic Term L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arithmetic Term L</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.GT#getArithmeticTermL()
	 * @see #getGT()
	 * @generated
	 */
	EReference getGT_ArithmeticTermL();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.booleanterms.LT <em>LT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LT</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.LT
	 * @generated
	 */
	EClass getLT();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.booleanterms.LT#getArithmeticTermR <em>Arithmetic Term R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arithmetic Term R</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.LT#getArithmeticTermR()
	 * @see #getLT()
	 * @generated
	 */
	EReference getLT_ArithmeticTermR();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.booleanterms.LT#getArithmeticTermL <em>Arithmetic Term L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arithmetic Term L</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.LT#getArithmeticTermL()
	 * @see #getLT()
	 * @generated
	 */
	EReference getLT_ArithmeticTermL();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.booleanterms.GTE <em>GTE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GTE</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.GTE
	 * @generated
	 */
	EClass getGTE();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.booleanterms.GTE#getArithmeticTermR <em>Arithmetic Term R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arithmetic Term R</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.GTE#getArithmeticTermR()
	 * @see #getGTE()
	 * @generated
	 */
	EReference getGTE_ArithmeticTermR();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.booleanterms.GTE#getArithmeticTermL <em>Arithmetic Term L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arithmetic Term L</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.GTE#getArithmeticTermL()
	 * @see #getGTE()
	 * @generated
	 */
	EReference getGTE_ArithmeticTermL();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.booleanterms.LTE <em>LTE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LTE</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.LTE
	 * @generated
	 */
	EClass getLTE();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.booleanterms.LTE#getArithmeticTermR <em>Arithmetic Term R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arithmetic Term R</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.LTE#getArithmeticTermR()
	 * @see #getLTE()
	 * @generated
	 */
	EReference getLTE_ArithmeticTermR();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.booleanterms.LTE#getArithmeticTermL <em>Arithmetic Term L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arithmetic Term L</em>'.
	 * @see SATEL.AlgebraicExpressions.booleanterms.LTE#getArithmeticTermL()
	 * @see #getLTE()
	 * @generated
	 */
	EReference getLTE_ArithmeticTermL();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BooleantermsFactory getBooleantermsFactory();

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
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.BooleanTermImpl <em>Boolean Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleanTermImpl
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getBooleanTerm()
		 * @generated
		 */
		EClass BOOLEAN_TERM = eINSTANCE.getBooleanTerm();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.NotImpl
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>Boolean Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__BOOLEAN_TERM = eINSTANCE.getNot_BooleanTerm();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.SequenceImpl
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Hml Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__HML_TERM = eINSTANCE.getSequence_HmlTerm();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.PositiveImpl <em>Positive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.PositiveImpl
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getPositive()
		 * @generated
		 */
		EClass POSITIVE = eINSTANCE.getPositive();

		/**
		 * The meta object literal for the '<em><b>Hml Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITIVE__HML_TERM = eINSTANCE.getPositive_HmlTerm();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.TraceImpl
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Hml Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__HML_TERM = eINSTANCE.getTrace_HmlTerm();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.BooleanVariableImpl <em>Boolean Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleanVariableImpl
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getBooleanVariable()
		 * @generated
		 */
		EClass BOOLEAN_VARIABLE = eINSTANCE.getBooleanVariable();

		/**
		 * The meta object literal for the '<em><b>Boolean Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_VARIABLE__BOOLEAN_VARIABLE = eINSTANCE.getBooleanVariable_BooleanVariable();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleanValueImpl
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.BOPAndImpl <em>BOP And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BOPAndImpl
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getBOPAnd()
		 * @generated
		 */
		EClass BOP_AND = eINSTANCE.getBOPAnd();

		/**
		 * The meta object literal for the '<em><b>Boolean Term L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOP_AND__BOOLEAN_TERM_L = eINSTANCE.getBOPAnd_BooleanTermL();

		/**
		 * The meta object literal for the '<em><b>Boolean Term R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOP_AND__BOOLEAN_TERM_R = eINSTANCE.getBOPAnd_BooleanTermR();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.BOPOrImpl <em>BOP Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BOPOrImpl
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getBOPOr()
		 * @generated
		 */
		EClass BOP_OR = eINSTANCE.getBOPOr();

		/**
		 * The meta object literal for the '<em><b>Boolean Term L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOP_OR__BOOLEAN_TERM_L = eINSTANCE.getBOPOr_BooleanTermL();

		/**
		 * The meta object literal for the '<em><b>Boolean Term R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOP_OR__BOOLEAN_TERM_R = eINSTANCE.getBOPOr_BooleanTermR();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.EqualsImpl <em>Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.EqualsImpl
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getEquals()
		 * @generated
		 */
		EClass EQUALS = eINSTANCE.getEquals();

		/**
		 * The meta object literal for the '<em><b>Arithmetic Term R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUALS__ARITHMETIC_TERM_R = eINSTANCE.getEquals_ArithmeticTermR();

		/**
		 * The meta object literal for the '<em><b>Arithmetic Term L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUALS__ARITHMETIC_TERM_L = eINSTANCE.getEquals_ArithmeticTermL();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.NotEqualsImpl <em>Not Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.NotEqualsImpl
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getNotEquals()
		 * @generated
		 */
		EClass NOT_EQUALS = eINSTANCE.getNotEquals();

		/**
		 * The meta object literal for the '<em><b>Arithmetic Term R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_EQUALS__ARITHMETIC_TERM_R = eINSTANCE.getNotEquals_ArithmeticTermR();

		/**
		 * The meta object literal for the '<em><b>Arithmetic Term L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_EQUALS__ARITHMETIC_TERM_L = eINSTANCE.getNotEquals_ArithmeticTermL();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.GTImpl <em>GT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.GTImpl
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getGT()
		 * @generated
		 */
		EClass GT = eINSTANCE.getGT();

		/**
		 * The meta object literal for the '<em><b>Arithmetic Term R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GT__ARITHMETIC_TERM_R = eINSTANCE.getGT_ArithmeticTermR();

		/**
		 * The meta object literal for the '<em><b>Arithmetic Term L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GT__ARITHMETIC_TERM_L = eINSTANCE.getGT_ArithmeticTermL();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.LTImpl <em>LT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.LTImpl
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getLT()
		 * @generated
		 */
		EClass LT = eINSTANCE.getLT();

		/**
		 * The meta object literal for the '<em><b>Arithmetic Term R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LT__ARITHMETIC_TERM_R = eINSTANCE.getLT_ArithmeticTermR();

		/**
		 * The meta object literal for the '<em><b>Arithmetic Term L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LT__ARITHMETIC_TERM_L = eINSTANCE.getLT_ArithmeticTermL();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.GTEImpl <em>GTE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.GTEImpl
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getGTE()
		 * @generated
		 */
		EClass GTE = eINSTANCE.getGTE();

		/**
		 * The meta object literal for the '<em><b>Arithmetic Term R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GTE__ARITHMETIC_TERM_R = eINSTANCE.getGTE_ArithmeticTermR();

		/**
		 * The meta object literal for the '<em><b>Arithmetic Term L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GTE__ARITHMETIC_TERM_L = eINSTANCE.getGTE_ArithmeticTermL();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.booleanterms.impl.LTEImpl <em>LTE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.LTEImpl
		 * @see SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl#getLTE()
		 * @generated
		 */
		EClass LTE = eINSTANCE.getLTE();

		/**
		 * The meta object literal for the '<em><b>Arithmetic Term R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LTE__ARITHMETIC_TERM_R = eINSTANCE.getLTE_ArithmeticTermR();

		/**
		 * The meta object literal for the '<em><b>Arithmetic Term L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LTE__ARITHMETIC_TERM_L = eINSTANCE.getLTE_ArithmeticTermL();

	}

} //BooleantermsPackage
