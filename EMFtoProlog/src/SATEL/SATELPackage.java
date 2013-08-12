/**
 * <copyright>
 * </copyright>
 *
 * $Id: SATELPackage.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL;

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
 * @see SATEL.SATELFactory
 * @model kind="package"
 * @generated
 */
public interface SATELPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SATEL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "SATEL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SATEL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SATELPackage eINSTANCE = SATEL.impl.SATELPackageImpl.init();

	/**
	 * The meta object id for the '{@link SATEL.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.impl.ModelImpl
	 * @see SATEL.impl.SATELPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Test Intention Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TEST_INTENTION_MODULE = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link SATEL.impl.TestIntentionModuleImpl <em>Test Intention Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.impl.TestIntentionModuleImpl
	 * @see SATEL.impl.SATELPackageImpl#getTestIntentionModule()
	 * @generated
	 */
	int TEST_INTENTION_MODULE = 1;

	/**
	 * The feature id for the '<em><b>Test Intention Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INTENTION_MODULE__TEST_INTENTION_BODY = 0;

	/**
	 * The feature id for the '<em><b>Test Intention Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INTENTION_MODULE__TEST_INTENTION_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INTENTION_MODULE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INTENTION_MODULE__FOCUS = 3;

	/**
	 * The feature id for the '<em><b>Algebra</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INTENTION_MODULE__ALGEBRA = 4;

	/**
	 * The number of structural features of the '<em>Test Intention Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INTENTION_MODULE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link SATEL.impl.TestIntentionInterfaceImpl <em>Test Intention Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.impl.TestIntentionInterfaceImpl
	 * @see SATEL.impl.SATELPackageImpl#getTestIntentionInterface()
	 * @generated
	 */
	int TEST_INTENTION_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Intention</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INTENTION_INTERFACE__INTENTION = 0;

	/**
	 * The number of structural features of the '<em>Test Intention Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INTENTION_INTERFACE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link SATEL.impl.IntentionDecImpl <em>Intention Dec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.impl.IntentionDecImpl
	 * @see SATEL.impl.SATELPackageImpl#getIntentionDec()
	 * @generated
	 */
	int INTENTION_DEC = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION_DEC__NAME = 0;

	/**
	 * The number of structural features of the '<em>Intention Dec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTION_DEC_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link SATEL.impl.TestIntentionBodyImpl <em>Test Intention Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.impl.TestIntentionBodyImpl
	 * @see SATEL.impl.SATELPackageImpl#getTestIntentionBody()
	 * @generated
	 */
	int TEST_INTENTION_BODY = 4;

	/**
	 * The feature id for the '<em><b>Axiom Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INTENTION_BODY__AXIOM_DECLARATION = 0;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INTENTION_BODY__VARIABLE_DECLARATION = 1;

	/**
	 * The number of structural features of the '<em>Test Intention Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INTENTION_BODY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link SATEL.impl.AxiomDeclarationImpl <em>Axiom Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.impl.AxiomDeclarationImpl
	 * @see SATEL.impl.SATELPackageImpl#getAxiomDeclaration()
	 * @generated
	 */
	int AXIOM_DECLARATION = 5;

	/**
	 * The feature id for the '<em><b>Axiom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM_DECLARATION__AXIOM = 0;

	/**
	 * The number of structural features of the '<em>Axiom Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM_DECLARATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link SATEL.impl.AxiomImpl <em>Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.impl.AxiomImpl
	 * @see SATEL.impl.SATELPackageImpl#getAxiom()
	 * @generated
	 */
	int AXIOM = 6;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Inclusion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM__INCLUSION = 1;

	/**
	 * The number of structural features of the '<em>Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link SATEL.impl.ConditionAtomImpl <em>Condition Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.impl.ConditionAtomImpl
	 * @see SATEL.impl.SATELPackageImpl#getConditionAtom()
	 * @generated
	 */
	int CONDITION_ATOM = 13;

	/**
	 * The number of structural features of the '<em>Condition Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ATOM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link SATEL.impl.InclusionImpl <em>Inclusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.impl.InclusionImpl
	 * @see SATEL.impl.SATELPackageImpl#getInclusion()
	 * @generated
	 */
	int INCLUSION = 7;

	/**
	 * The feature id for the '<em><b>Hml Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION__HML_TERM = CONDITION_ATOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION__IN = CONDITION_ATOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_FEATURE_COUNT = CONDITION_ATOM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SATEL.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.impl.ConditionImpl
	 * @see SATEL.impl.SATELPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 8;

	/**
	 * The feature id for the '<em><b>Domain Quantifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__DOMAIN_QUANTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Condition Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION_BODY = 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link SATEL.impl.DomainQuantifierImpl <em>Domain Quantifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.impl.DomainQuantifierImpl
	 * @see SATEL.impl.SATELPackageImpl#getDomainQuantifier()
	 * @generated
	 */
	int DOMAIN_QUANTIFIER = 9;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_QUANTIFIER__LIST = 0;

	/**
	 * The number of structural features of the '<em>Domain Quantifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_QUANTIFIER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link SATEL.impl.UniformityListImpl <em>Uniformity List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.impl.UniformityListImpl
	 * @see SATEL.impl.SATELPackageImpl#getUniformityList()
	 * @generated
	 */
	int UNIFORMITY_LIST = 10;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORMITY_LIST__LIST = DOMAIN_QUANTIFIER__LIST;

	/**
	 * The number of structural features of the '<em>Uniformity List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORMITY_LIST_FEATURE_COUNT = DOMAIN_QUANTIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SATEL.impl.SubuniformityListImpl <em>Subuniformity List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.impl.SubuniformityListImpl
	 * @see SATEL.impl.SATELPackageImpl#getSubuniformityList()
	 * @generated
	 */
	int SUBUNIFORMITY_LIST = 11;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBUNIFORMITY_LIST__LIST = DOMAIN_QUANTIFIER__LIST;

	/**
	 * The number of structural features of the '<em>Subuniformity List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBUNIFORMITY_LIST_FEATURE_COUNT = DOMAIN_QUANTIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SATEL.impl.ConditionBodyImpl <em>Condition Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.impl.ConditionBodyImpl
	 * @see SATEL.impl.SATELPackageImpl#getConditionBody()
	 * @generated
	 */
	int CONDITION_BODY = 12;

	/**
	 * The feature id for the '<em><b>Condition Atom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BODY__CONDITION_ATOM = 0;

	/**
	 * The number of structural features of the '<em>Condition Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BODY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link SATEL.impl.NameListImpl <em>Name List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.impl.NameListImpl
	 * @see SATEL.impl.SATELPackageImpl#getNameList()
	 * @generated
	 */
	int NAME_LIST = 14;

	/**
	 * The feature id for the '<em><b>Name Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_LIST__NAME_REF = 0;

	/**
	 * The number of structural features of the '<em>Name List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_LIST_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link SATEL.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see SATEL.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.Model#getTestIntentionModule <em>Test Intention Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Intention Module</em>'.
	 * @see SATEL.Model#getTestIntentionModule()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_TestIntentionModule();

	/**
	 * Returns the meta object for class '{@link SATEL.TestIntentionModule <em>Test Intention Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Intention Module</em>'.
	 * @see SATEL.TestIntentionModule
	 * @generated
	 */
	EClass getTestIntentionModule();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.TestIntentionModule#getTestIntentionBody <em>Test Intention Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test Intention Body</em>'.
	 * @see SATEL.TestIntentionModule#getTestIntentionBody()
	 * @see #getTestIntentionModule()
	 * @generated
	 */
	EReference getTestIntentionModule_TestIntentionBody();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.TestIntentionModule#getTestIntentionInterface <em>Test Intention Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test Intention Interface</em>'.
	 * @see SATEL.TestIntentionModule#getTestIntentionInterface()
	 * @see #getTestIntentionModule()
	 * @generated
	 */
	EReference getTestIntentionModule_TestIntentionInterface();

	/**
	 * Returns the meta object for the attribute '{@link SATEL.TestIntentionModule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SATEL.TestIntentionModule#getName()
	 * @see #getTestIntentionModule()
	 * @generated
	 */
	EAttribute getTestIntentionModule_Name();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.TestIntentionModule#getFocus <em>Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Focus</em>'.
	 * @see SATEL.TestIntentionModule#getFocus()
	 * @see #getTestIntentionModule()
	 * @generated
	 */
	EReference getTestIntentionModule_Focus();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.TestIntentionModule#getAlgebra <em>Algebra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Algebra</em>'.
	 * @see SATEL.TestIntentionModule#getAlgebra()
	 * @see #getTestIntentionModule()
	 * @generated
	 */
	EReference getTestIntentionModule_Algebra();

	/**
	 * Returns the meta object for class '{@link SATEL.TestIntentionInterface <em>Test Intention Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Intention Interface</em>'.
	 * @see SATEL.TestIntentionInterface
	 * @generated
	 */
	EClass getTestIntentionInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.TestIntentionInterface#getIntention <em>Intention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intention</em>'.
	 * @see SATEL.TestIntentionInterface#getIntention()
	 * @see #getTestIntentionInterface()
	 * @generated
	 */
	EReference getTestIntentionInterface_Intention();

	/**
	 * Returns the meta object for class '{@link SATEL.IntentionDec <em>Intention Dec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intention Dec</em>'.
	 * @see SATEL.IntentionDec
	 * @generated
	 */
	EClass getIntentionDec();

	/**
	 * Returns the meta object for the attribute '{@link SATEL.IntentionDec#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SATEL.IntentionDec#getName()
	 * @see #getIntentionDec()
	 * @generated
	 */
	EAttribute getIntentionDec_Name();

	/**
	 * Returns the meta object for class '{@link SATEL.TestIntentionBody <em>Test Intention Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Intention Body</em>'.
	 * @see SATEL.TestIntentionBody
	 * @generated
	 */
	EClass getTestIntentionBody();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.TestIntentionBody#getAxiomDeclaration <em>Axiom Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Axiom Declaration</em>'.
	 * @see SATEL.TestIntentionBody#getAxiomDeclaration()
	 * @see #getTestIntentionBody()
	 * @generated
	 */
	EReference getTestIntentionBody_AxiomDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.TestIntentionBody#getVariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable Declaration</em>'.
	 * @see SATEL.TestIntentionBody#getVariableDeclaration()
	 * @see #getTestIntentionBody()
	 * @generated
	 */
	EReference getTestIntentionBody_VariableDeclaration();

	/**
	 * Returns the meta object for class '{@link SATEL.AxiomDeclaration <em>Axiom Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axiom Declaration</em>'.
	 * @see SATEL.AxiomDeclaration
	 * @generated
	 */
	EClass getAxiomDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.AxiomDeclaration#getAxiom <em>Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Axiom</em>'.
	 * @see SATEL.AxiomDeclaration#getAxiom()
	 * @see #getAxiomDeclaration()
	 * @generated
	 */
	EReference getAxiomDeclaration_Axiom();

	/**
	 * Returns the meta object for class '{@link SATEL.Axiom <em>Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axiom</em>'.
	 * @see SATEL.Axiom
	 * @generated
	 */
	EClass getAxiom();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.Axiom#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see SATEL.Axiom#getCondition()
	 * @see #getAxiom()
	 * @generated
	 */
	EReference getAxiom_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.Axiom#getInclusion <em>Inclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inclusion</em>'.
	 * @see SATEL.Axiom#getInclusion()
	 * @see #getAxiom()
	 * @generated
	 */
	EReference getAxiom_Inclusion();

	/**
	 * Returns the meta object for class '{@link SATEL.Inclusion <em>Inclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inclusion</em>'.
	 * @see SATEL.Inclusion
	 * @generated
	 */
	EClass getInclusion();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.Inclusion#getHmlTerm <em>Hml Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hml Term</em>'.
	 * @see SATEL.Inclusion#getHmlTerm()
	 * @see #getInclusion()
	 * @generated
	 */
	EReference getInclusion_HmlTerm();

	/**
	 * Returns the meta object for the reference '{@link SATEL.Inclusion#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In</em>'.
	 * @see SATEL.Inclusion#getIn()
	 * @see #getInclusion()
	 * @generated
	 */
	EReference getInclusion_In();

	/**
	 * Returns the meta object for class '{@link SATEL.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see SATEL.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.Condition#getDomainQuantifier <em>Domain Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Quantifier</em>'.
	 * @see SATEL.Condition#getDomainQuantifier()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_DomainQuantifier();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.Condition#getConditionBody <em>Condition Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition Body</em>'.
	 * @see SATEL.Condition#getConditionBody()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_ConditionBody();

	/**
	 * Returns the meta object for class '{@link SATEL.DomainQuantifier <em>Domain Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Quantifier</em>'.
	 * @see SATEL.DomainQuantifier
	 * @generated
	 */
	EClass getDomainQuantifier();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.DomainQuantifier#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see SATEL.DomainQuantifier#getList()
	 * @see #getDomainQuantifier()
	 * @generated
	 */
	EReference getDomainQuantifier_List();

	/**
	 * Returns the meta object for class '{@link SATEL.UniformityList <em>Uniformity List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uniformity List</em>'.
	 * @see SATEL.UniformityList
	 * @generated
	 */
	EClass getUniformityList();

	/**
	 * Returns the meta object for class '{@link SATEL.SubuniformityList <em>Subuniformity List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subuniformity List</em>'.
	 * @see SATEL.SubuniformityList
	 * @generated
	 */
	EClass getSubuniformityList();

	/**
	 * Returns the meta object for class '{@link SATEL.ConditionBody <em>Condition Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Body</em>'.
	 * @see SATEL.ConditionBody
	 * @generated
	 */
	EClass getConditionBody();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.ConditionBody#getConditionAtom <em>Condition Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition Atom</em>'.
	 * @see SATEL.ConditionBody#getConditionAtom()
	 * @see #getConditionBody()
	 * @generated
	 */
	EReference getConditionBody_ConditionAtom();

	/**
	 * Returns the meta object for class '{@link SATEL.ConditionAtom <em>Condition Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Atom</em>'.
	 * @see SATEL.ConditionAtom
	 * @generated
	 */
	EClass getConditionAtom();

	/**
	 * Returns the meta object for class '{@link SATEL.NameList <em>Name List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name List</em>'.
	 * @see SATEL.NameList
	 * @generated
	 */
	EClass getNameList();

	/**
	 * Returns the meta object for the reference list '{@link SATEL.NameList#getNameRef <em>Name Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Name Ref</em>'.
	 * @see SATEL.NameList#getNameRef()
	 * @see #getNameList()
	 * @generated
	 */
	EReference getNameList_NameRef();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SATELFactory getSATELFactory();

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
		 * The meta object literal for the '{@link SATEL.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.impl.ModelImpl
		 * @see SATEL.impl.SATELPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Test Intention Module</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__TEST_INTENTION_MODULE = eINSTANCE.getModel_TestIntentionModule();

		/**
		 * The meta object literal for the '{@link SATEL.impl.TestIntentionModuleImpl <em>Test Intention Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.impl.TestIntentionModuleImpl
		 * @see SATEL.impl.SATELPackageImpl#getTestIntentionModule()
		 * @generated
		 */
		EClass TEST_INTENTION_MODULE = eINSTANCE.getTestIntentionModule();

		/**
		 * The meta object literal for the '<em><b>Test Intention Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_INTENTION_MODULE__TEST_INTENTION_BODY = eINSTANCE.getTestIntentionModule_TestIntentionBody();

		/**
		 * The meta object literal for the '<em><b>Test Intention Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_INTENTION_MODULE__TEST_INTENTION_INTERFACE = eINSTANCE.getTestIntentionModule_TestIntentionInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_INTENTION_MODULE__NAME = eINSTANCE.getTestIntentionModule_Name();

		/**
		 * The meta object literal for the '<em><b>Focus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_INTENTION_MODULE__FOCUS = eINSTANCE.getTestIntentionModule_Focus();

		/**
		 * The meta object literal for the '<em><b>Algebra</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_INTENTION_MODULE__ALGEBRA = eINSTANCE.getTestIntentionModule_Algebra();

		/**
		 * The meta object literal for the '{@link SATEL.impl.TestIntentionInterfaceImpl <em>Test Intention Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.impl.TestIntentionInterfaceImpl
		 * @see SATEL.impl.SATELPackageImpl#getTestIntentionInterface()
		 * @generated
		 */
		EClass TEST_INTENTION_INTERFACE = eINSTANCE.getTestIntentionInterface();

		/**
		 * The meta object literal for the '<em><b>Intention</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_INTENTION_INTERFACE__INTENTION = eINSTANCE.getTestIntentionInterface_Intention();

		/**
		 * The meta object literal for the '{@link SATEL.impl.IntentionDecImpl <em>Intention Dec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.impl.IntentionDecImpl
		 * @see SATEL.impl.SATELPackageImpl#getIntentionDec()
		 * @generated
		 */
		EClass INTENTION_DEC = eINSTANCE.getIntentionDec();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENTION_DEC__NAME = eINSTANCE.getIntentionDec_Name();

		/**
		 * The meta object literal for the '{@link SATEL.impl.TestIntentionBodyImpl <em>Test Intention Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.impl.TestIntentionBodyImpl
		 * @see SATEL.impl.SATELPackageImpl#getTestIntentionBody()
		 * @generated
		 */
		EClass TEST_INTENTION_BODY = eINSTANCE.getTestIntentionBody();

		/**
		 * The meta object literal for the '<em><b>Axiom Declaration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_INTENTION_BODY__AXIOM_DECLARATION = eINSTANCE.getTestIntentionBody_AxiomDeclaration();

		/**
		 * The meta object literal for the '<em><b>Variable Declaration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_INTENTION_BODY__VARIABLE_DECLARATION = eINSTANCE.getTestIntentionBody_VariableDeclaration();

		/**
		 * The meta object literal for the '{@link SATEL.impl.AxiomDeclarationImpl <em>Axiom Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.impl.AxiomDeclarationImpl
		 * @see SATEL.impl.SATELPackageImpl#getAxiomDeclaration()
		 * @generated
		 */
		EClass AXIOM_DECLARATION = eINSTANCE.getAxiomDeclaration();

		/**
		 * The meta object literal for the '<em><b>Axiom</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIOM_DECLARATION__AXIOM = eINSTANCE.getAxiomDeclaration_Axiom();

		/**
		 * The meta object literal for the '{@link SATEL.impl.AxiomImpl <em>Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.impl.AxiomImpl
		 * @see SATEL.impl.SATELPackageImpl#getAxiom()
		 * @generated
		 */
		EClass AXIOM = eINSTANCE.getAxiom();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIOM__CONDITION = eINSTANCE.getAxiom_Condition();

		/**
		 * The meta object literal for the '<em><b>Inclusion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIOM__INCLUSION = eINSTANCE.getAxiom_Inclusion();

		/**
		 * The meta object literal for the '{@link SATEL.impl.InclusionImpl <em>Inclusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.impl.InclusionImpl
		 * @see SATEL.impl.SATELPackageImpl#getInclusion()
		 * @generated
		 */
		EClass INCLUSION = eINSTANCE.getInclusion();

		/**
		 * The meta object literal for the '<em><b>Hml Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUSION__HML_TERM = eINSTANCE.getInclusion_HmlTerm();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUSION__IN = eINSTANCE.getInclusion_In();

		/**
		 * The meta object literal for the '{@link SATEL.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.impl.ConditionImpl
		 * @see SATEL.impl.SATELPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Domain Quantifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__DOMAIN_QUANTIFIER = eINSTANCE.getCondition_DomainQuantifier();

		/**
		 * The meta object literal for the '<em><b>Condition Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__CONDITION_BODY = eINSTANCE.getCondition_ConditionBody();

		/**
		 * The meta object literal for the '{@link SATEL.impl.DomainQuantifierImpl <em>Domain Quantifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.impl.DomainQuantifierImpl
		 * @see SATEL.impl.SATELPackageImpl#getDomainQuantifier()
		 * @generated
		 */
		EClass DOMAIN_QUANTIFIER = eINSTANCE.getDomainQuantifier();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_QUANTIFIER__LIST = eINSTANCE.getDomainQuantifier_List();

		/**
		 * The meta object literal for the '{@link SATEL.impl.UniformityListImpl <em>Uniformity List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.impl.UniformityListImpl
		 * @see SATEL.impl.SATELPackageImpl#getUniformityList()
		 * @generated
		 */
		EClass UNIFORMITY_LIST = eINSTANCE.getUniformityList();

		/**
		 * The meta object literal for the '{@link SATEL.impl.SubuniformityListImpl <em>Subuniformity List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.impl.SubuniformityListImpl
		 * @see SATEL.impl.SATELPackageImpl#getSubuniformityList()
		 * @generated
		 */
		EClass SUBUNIFORMITY_LIST = eINSTANCE.getSubuniformityList();

		/**
		 * The meta object literal for the '{@link SATEL.impl.ConditionBodyImpl <em>Condition Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.impl.ConditionBodyImpl
		 * @see SATEL.impl.SATELPackageImpl#getConditionBody()
		 * @generated
		 */
		EClass CONDITION_BODY = eINSTANCE.getConditionBody();

		/**
		 * The meta object literal for the '<em><b>Condition Atom</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_BODY__CONDITION_ATOM = eINSTANCE.getConditionBody_ConditionAtom();

		/**
		 * The meta object literal for the '{@link SATEL.impl.ConditionAtomImpl <em>Condition Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.impl.ConditionAtomImpl
		 * @see SATEL.impl.SATELPackageImpl#getConditionAtom()
		 * @generated
		 */
		EClass CONDITION_ATOM = eINSTANCE.getConditionAtom();

		/**
		 * The meta object literal for the '{@link SATEL.impl.NameListImpl <em>Name List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.impl.NameListImpl
		 * @see SATEL.impl.SATELPackageImpl#getNameList()
		 * @generated
		 */
		EClass NAME_LIST = eINSTANCE.getNameList();

		/**
		 * The meta object literal for the '<em><b>Name Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_LIST__NAME_REF = eINSTANCE.getNameList_NameRef();

	}

} //SATELPackage
