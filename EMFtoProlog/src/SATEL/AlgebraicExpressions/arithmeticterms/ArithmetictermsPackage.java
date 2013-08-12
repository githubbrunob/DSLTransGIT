/**
 * <copyright>
 * </copyright>
 *
 * $Id: ArithmetictermsPackage.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions.arithmeticterms;

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
 * @see SATEL.AlgebraicExpressions.arithmeticterms.ArithmetictermsFactory
 * @model kind="package"
 * @generated
 */
public interface ArithmetictermsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arithmeticterms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "SATEL.AlgebraicExpressions.arithmeticterms";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "arithmeticterms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArithmetictermsPackage eINSTANCE = SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmetictermsPackageImpl.init();

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmeticTermImpl <em>Arithmetic Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmeticTermImpl
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmetictermsPackageImpl#getArithmeticTerm()
	 * @generated
	 */
	int ARITHMETIC_TERM = 0;

	/**
	 * The number of structural features of the '<em>Arithmetic Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_TERM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.arithmeticterms.impl.IntegerVariableImpl <em>Integer Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.IntegerVariableImpl
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmetictermsPackageImpl#getIntegerVariable()
	 * @generated
	 */
	int INTEGER_VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Integer Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE__INTEGER_VARIABLE = ARITHMETIC_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_FEATURE_COUNT = ARITHMETIC_TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.arithmeticterms.impl.IntegerValueImpl <em>Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.IntegerValueImpl
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmetictermsPackageImpl#getIntegerValue()
	 * @generated
	 */
	int INTEGER_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__VALUE = ARITHMETIC_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_FEATURE_COUNT = ARITHMETIC_TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.arithmeticterms.impl.BOPPlusImpl <em>BOP Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.BOPPlusImpl
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmetictermsPackageImpl#getBOPPlus()
	 * @generated
	 */
	int BOP_PLUS = 3;

	/**
	 * The feature id for the '<em><b>Arithmetic Term L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP_PLUS__ARITHMETIC_TERM_L = ARITHMETIC_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arithmetic Term R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP_PLUS__ARITHMETIC_TERM_R = ARITHMETIC_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BOP Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP_PLUS_FEATURE_COUNT = ARITHMETIC_TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.arithmeticterms.impl.BOPMinusImpl <em>BOP Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.BOPMinusImpl
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmetictermsPackageImpl#getBOPMinus()
	 * @generated
	 */
	int BOP_MINUS = 4;

	/**
	 * The feature id for the '<em><b>Arithmetic Term L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP_MINUS__ARITHMETIC_TERM_L = ARITHMETIC_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arithmetic Term R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP_MINUS__ARITHMETIC_TERM_R = ARITHMETIC_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BOP Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP_MINUS_FEATURE_COUNT = ARITHMETIC_TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.arithmeticterms.impl.BOPTimesImpl <em>BOP Times</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.BOPTimesImpl
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmetictermsPackageImpl#getBOPTimes()
	 * @generated
	 */
	int BOP_TIMES = 5;

	/**
	 * The feature id for the '<em><b>Arithmetic Term R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP_TIMES__ARITHMETIC_TERM_R = ARITHMETIC_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arithmetic Term L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP_TIMES__ARITHMETIC_TERM_L = ARITHMETIC_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BOP Times</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP_TIMES_FEATURE_COUNT = ARITHMETIC_TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.arithmeticterms.impl.BOPDivImpl <em>BOP Div</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.BOPDivImpl
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmetictermsPackageImpl#getBOPDiv()
	 * @generated
	 */
	int BOP_DIV = 6;

	/**
	 * The feature id for the '<em><b>Arithmetic Term L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP_DIV__ARITHMETIC_TERM_L = ARITHMETIC_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arithmetic Term R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP_DIV__ARITHMETIC_TERM_R = ARITHMETIC_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BOP Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOP_DIV_FEATURE_COUNT = ARITHMETIC_TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.arithmeticterms.impl.NBEventsImpl <em>NB Events</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.NBEventsImpl
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmetictermsPackageImpl#getNBEvents()
	 * @generated
	 */
	int NB_EVENTS = 7;

	/**
	 * The feature id for the '<em><b>Hml Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_EVENTS__HML_TERM = ARITHMETIC_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NB Events</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_EVENTS_FEATURE_COUNT = ARITHMETIC_TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.arithmeticterms.impl.DepthImpl <em>Depth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.DepthImpl
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmetictermsPackageImpl#getDepth()
	 * @generated
	 */
	int DEPTH = 8;

	/**
	 * The feature id for the '<em><b>Hml Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPTH__HML_TERM = ARITHMETIC_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Depth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPTH_FEATURE_COUNT = ARITHMETIC_TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.arithmeticterms.impl.UOPMinusImpl <em>UOP Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.UOPMinusImpl
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmetictermsPackageImpl#getUOPMinus()
	 * @generated
	 */
	int UOP_MINUS = 9;

	/**
	 * The feature id for the '<em><b>Arithmetic Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_MINUS__ARITHMETIC_TERM = ARITHMETIC_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UOP Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOP_MINUS_FEATURE_COUNT = ARITHMETIC_TERM_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.arithmeticterms.ArithmeticTerm <em>Arithmetic Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Term</em>'.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.ArithmeticTerm
	 * @generated
	 */
	EClass getArithmeticTerm();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.arithmeticterms.IntegerVariable <em>Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable</em>'.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.IntegerVariable
	 * @generated
	 */
	EClass getIntegerVariable();

	/**
	 * Returns the meta object for the reference '{@link SATEL.AlgebraicExpressions.arithmeticterms.IntegerVariable#getIntegerVariable <em>Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Integer Variable</em>'.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.IntegerVariable#getIntegerVariable()
	 * @see #getIntegerVariable()
	 * @generated
	 */
	EReference getIntegerVariable_IntegerVariable();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.arithmeticterms.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value</em>'.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.IntegerValue
	 * @generated
	 */
	EClass getIntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link SATEL.AlgebraicExpressions.arithmeticterms.IntegerValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.IntegerValue#getValue()
	 * @see #getIntegerValue()
	 * @generated
	 */
	EAttribute getIntegerValue_Value();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.arithmeticterms.BOPPlus <em>BOP Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BOP Plus</em>'.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.BOPPlus
	 * @generated
	 */
	EClass getBOPPlus();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.arithmeticterms.BOPPlus#getArithmeticTermL <em>Arithmetic Term L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arithmetic Term L</em>'.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.BOPPlus#getArithmeticTermL()
	 * @see #getBOPPlus()
	 * @generated
	 */
	EReference getBOPPlus_ArithmeticTermL();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.arithmeticterms.BOPPlus#getArithmeticTermR <em>Arithmetic Term R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arithmetic Term R</em>'.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.BOPPlus#getArithmeticTermR()
	 * @see #getBOPPlus()
	 * @generated
	 */
	EReference getBOPPlus_ArithmeticTermR();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.arithmeticterms.BOPMinus <em>BOP Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BOP Minus</em>'.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.BOPMinus
	 * @generated
	 */
	EClass getBOPMinus();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.arithmeticterms.BOPMinus#getArithmeticTermL <em>Arithmetic Term L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arithmetic Term L</em>'.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.BOPMinus#getArithmeticTermL()
	 * @see #getBOPMinus()
	 * @generated
	 */
	EReference getBOPMinus_ArithmeticTermL();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.arithmeticterms.BOPMinus#getArithmeticTermR <em>Arithmetic Term R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arithmetic Term R</em>'.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.BOPMinus#getArithmeticTermR()
	 * @see #getBOPMinus()
	 * @generated
	 */
	EReference getBOPMinus_ArithmeticTermR();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.arithmeticterms.BOPTimes <em>BOP Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BOP Times</em>'.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.BOPTimes
	 * @generated
	 */
	EClass getBOPTimes();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.arithmeticterms.BOPTimes#getArithmeticTermR <em>Arithmetic Term R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arithmetic Term R</em>'.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.BOPTimes#getArithmeticTermR()
	 * @see #getBOPTimes()
	 * @generated
	 */
	EReference getBOPTimes_ArithmeticTermR();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.arithmeticterms.BOPTimes#getArithmeticTermL <em>Arithmetic Term L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arithmetic Term L</em>'.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.BOPTimes#getArithmeticTermL()
	 * @see #getBOPTimes()
	 * @generated
	 */
	EReference getBOPTimes_ArithmeticTermL();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.arithmeticterms.BOPDiv <em>BOP Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BOP Div</em>'.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.BOPDiv
	 * @generated
	 */
	EClass getBOPDiv();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.arithmeticterms.BOPDiv#getArithmeticTermL <em>Arithmetic Term L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arithmetic Term L</em>'.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.BOPDiv#getArithmeticTermL()
	 * @see #getBOPDiv()
	 * @generated
	 */
	EReference getBOPDiv_ArithmeticTermL();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.arithmeticterms.BOPDiv#getArithmeticTermR <em>Arithmetic Term R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arithmetic Term R</em>'.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.BOPDiv#getArithmeticTermR()
	 * @see #getBOPDiv()
	 * @generated
	 */
	EReference getBOPDiv_ArithmeticTermR();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.arithmeticterms.NBEvents <em>NB Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NB Events</em>'.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.NBEvents
	 * @generated
	 */
	EClass getNBEvents();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.arithmeticterms.NBEvents#getHmlTerm <em>Hml Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hml Term</em>'.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.NBEvents#getHmlTerm()
	 * @see #getNBEvents()
	 * @generated
	 */
	EReference getNBEvents_HmlTerm();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.arithmeticterms.Depth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Depth</em>'.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.Depth
	 * @generated
	 */
	EClass getDepth();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.arithmeticterms.Depth#getHmlTerm <em>Hml Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hml Term</em>'.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.Depth#getHmlTerm()
	 * @see #getDepth()
	 * @generated
	 */
	EReference getDepth_HmlTerm();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.arithmeticterms.UOPMinus <em>UOP Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UOP Minus</em>'.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.UOPMinus
	 * @generated
	 */
	EClass getUOPMinus();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.arithmeticterms.UOPMinus#getArithmeticTerm <em>Arithmetic Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arithmetic Term</em>'.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.UOPMinus#getArithmeticTerm()
	 * @see #getUOPMinus()
	 * @generated
	 */
	EReference getUOPMinus_ArithmeticTerm();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArithmetictermsFactory getArithmetictermsFactory();

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
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmeticTermImpl <em>Arithmetic Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmeticTermImpl
		 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmetictermsPackageImpl#getArithmeticTerm()
		 * @generated
		 */
		EClass ARITHMETIC_TERM = eINSTANCE.getArithmeticTerm();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.arithmeticterms.impl.IntegerVariableImpl <em>Integer Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.IntegerVariableImpl
		 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmetictermsPackageImpl#getIntegerVariable()
		 * @generated
		 */
		EClass INTEGER_VARIABLE = eINSTANCE.getIntegerVariable();

		/**
		 * The meta object literal for the '<em><b>Integer Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_VARIABLE__INTEGER_VARIABLE = eINSTANCE.getIntegerVariable_IntegerVariable();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.arithmeticterms.impl.IntegerValueImpl <em>Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.IntegerValueImpl
		 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmetictermsPackageImpl#getIntegerValue()
		 * @generated
		 */
		EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE__VALUE = eINSTANCE.getIntegerValue_Value();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.arithmeticterms.impl.BOPPlusImpl <em>BOP Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.BOPPlusImpl
		 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmetictermsPackageImpl#getBOPPlus()
		 * @generated
		 */
		EClass BOP_PLUS = eINSTANCE.getBOPPlus();

		/**
		 * The meta object literal for the '<em><b>Arithmetic Term L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOP_PLUS__ARITHMETIC_TERM_L = eINSTANCE.getBOPPlus_ArithmeticTermL();

		/**
		 * The meta object literal for the '<em><b>Arithmetic Term R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOP_PLUS__ARITHMETIC_TERM_R = eINSTANCE.getBOPPlus_ArithmeticTermR();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.arithmeticterms.impl.BOPMinusImpl <em>BOP Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.BOPMinusImpl
		 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmetictermsPackageImpl#getBOPMinus()
		 * @generated
		 */
		EClass BOP_MINUS = eINSTANCE.getBOPMinus();

		/**
		 * The meta object literal for the '<em><b>Arithmetic Term L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOP_MINUS__ARITHMETIC_TERM_L = eINSTANCE.getBOPMinus_ArithmeticTermL();

		/**
		 * The meta object literal for the '<em><b>Arithmetic Term R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOP_MINUS__ARITHMETIC_TERM_R = eINSTANCE.getBOPMinus_ArithmeticTermR();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.arithmeticterms.impl.BOPTimesImpl <em>BOP Times</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.BOPTimesImpl
		 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmetictermsPackageImpl#getBOPTimes()
		 * @generated
		 */
		EClass BOP_TIMES = eINSTANCE.getBOPTimes();

		/**
		 * The meta object literal for the '<em><b>Arithmetic Term R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOP_TIMES__ARITHMETIC_TERM_R = eINSTANCE.getBOPTimes_ArithmeticTermR();

		/**
		 * The meta object literal for the '<em><b>Arithmetic Term L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOP_TIMES__ARITHMETIC_TERM_L = eINSTANCE.getBOPTimes_ArithmeticTermL();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.arithmeticterms.impl.BOPDivImpl <em>BOP Div</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.BOPDivImpl
		 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmetictermsPackageImpl#getBOPDiv()
		 * @generated
		 */
		EClass BOP_DIV = eINSTANCE.getBOPDiv();

		/**
		 * The meta object literal for the '<em><b>Arithmetic Term L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOP_DIV__ARITHMETIC_TERM_L = eINSTANCE.getBOPDiv_ArithmeticTermL();

		/**
		 * The meta object literal for the '<em><b>Arithmetic Term R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOP_DIV__ARITHMETIC_TERM_R = eINSTANCE.getBOPDiv_ArithmeticTermR();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.arithmeticterms.impl.NBEventsImpl <em>NB Events</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.NBEventsImpl
		 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmetictermsPackageImpl#getNBEvents()
		 * @generated
		 */
		EClass NB_EVENTS = eINSTANCE.getNBEvents();

		/**
		 * The meta object literal for the '<em><b>Hml Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB_EVENTS__HML_TERM = eINSTANCE.getNBEvents_HmlTerm();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.arithmeticterms.impl.DepthImpl <em>Depth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.DepthImpl
		 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmetictermsPackageImpl#getDepth()
		 * @generated
		 */
		EClass DEPTH = eINSTANCE.getDepth();

		/**
		 * The meta object literal for the '<em><b>Hml Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPTH__HML_TERM = eINSTANCE.getDepth_HmlTerm();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.arithmeticterms.impl.UOPMinusImpl <em>UOP Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.UOPMinusImpl
		 * @see SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmetictermsPackageImpl#getUOPMinus()
		 * @generated
		 */
		EClass UOP_MINUS = eINSTANCE.getUOPMinus();

		/**
		 * The meta object literal for the '<em><b>Arithmetic Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOP_MINUS__ARITHMETIC_TERM = eINSTANCE.getUOPMinus_ArithmeticTerm();

	}

} //ArithmetictermsPackage
